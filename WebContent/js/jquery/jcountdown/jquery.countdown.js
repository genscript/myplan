(function($) {
	$.fn.countdown = function(options) {
		// default options
		var defaults = {
			attrName : 'data-diff',
			tmpl : '<span class="hour">%{h}</span>小时<span class="minute">%{m}</span>分钟<span class="second">%{s}</span>秒',
			end : '已结束',
			afterEnd : null
		};
		options = $.extend(defaults, options);

		// trim zero
		function trimZero(str) {
			return parseInt(str.replace(/^0/g, ''));
		}
		// 预设时间与系统时间相减，返回秒
		function TimeDifference(str){
		//定义两个变量time1,time2分别保存开始和结束时间		
		var time2=str;
		if(time2)
		var time1= CurrentTime();
       
		//判断开始时间是否大于结束日期
		if(time1>time2){
		   return false;
		}

		//截取字符串，得到日期部分"2009-12-02",用split把字符串分隔成数组
		var begin1=time1.substr(0,10).split("-");
		var end1=time2.substr(0,10).split("-");

		//将拆分的数组重新组合，并实例成化新的日期对象
		var date1=new Date(begin1[1] + - + begin1[2] + - + begin1[0]);
		var date2=new Date(end1[1] + - + end1[2] + - + end1[0]);

		//得到两个日期之间的差值m，以分钟为单位
		//Math.abs(date2-date1)计算出以毫秒为单位的差值
		//Math.abs(date2-date1)/1000得到以秒为单位的差值
		//Math.abs(date2-date1)/1000/60得到以分钟为单位的差值
		var m=parseInt(Math.abs(date2-date1)/1000);

		//小时数和分钟数相加得到总的分钟数
		//time1.substr(11,2)截取字符串得到时间的小时数
		//parseInt(time1.substr(11,2))*60把小时数转化成为分钟
		var min1=parseInt(time1.substr(11,2))*60+parseInt(time1.substr(14,2));
		var min2=parseInt(time2.substr(11,2))*60+parseInt(time2.substr(14,2));

		//两个分钟数相减得到时间部分的差值，以分钟为单位
		var n=(min2-min1)*60;
		return m+n ;
		}
		function CurrentTime() { 
	        var now = new Date();	       
	        var year = now.getFullYear();       //年
	        var month = now.getMonth() + 1;     //月
	        var day = now.getDate();            //日
	       
	        var hh = now.getHours();            //时
	        var mm = now.getMinutes();          //分
	       
	        var clock = year + "-";
	       
	        if(month < 10)
	            clock += "0";
	       
	        clock += month + "-";
	       
	        if(day < 10)
	            clock += "0";
	           
	        clock += day + " ";
	       
	        if(hh < 10)
	            clock += "0";
	           
	        clock += hh + ":";
	        if (mm < 10) clock += '0'; 
	        clock += mm; 
	        return(clock); 
	    } 
		
		// format time
		function format(diff) {
			var tmpl = options.tmpl, day, hour, minute, second;
			day = /%\{d\}/.test(tmpl) ? Math.floor(diff / 86400) : 0;
			hour = Math.floor((diff - day * 86400) / 3600);
			minute = Math.floor((diff - day * 86400 - hour * 3600) / 60);
			second = diff - day * 86400 - hour * 3600 - minute * 60;
			tmpl = tmpl.replace(/%\{d\}/ig, day)
				.replace(/%\{h\}/ig, hour)
				.replace(/%\{m\}/ig, minute)
				.replace(/%\{s\}/ig, second);
			return tmpl;
		}
		// main
		return this.each(function() {
			var el = this,
			diff = TimeDifference($(el).attr(options.attrName));
			if(!diff){
				return ;
			}
			function update() {
				if (diff <= 0) {
					$(el).html(options.end);
					if (options.afterEnd) {
						options.afterEnd();
					}
					return;
				}
				$(el).html(format(diff));
				setTimeout(function() {
					diff--;
					update();
				}, 1000);
			}
			update();
		});
	};
})(jQuery);
