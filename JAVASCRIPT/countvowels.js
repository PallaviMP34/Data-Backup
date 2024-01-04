let str="psallavi";
		let str1=str.toLowerCase();
		let count=0;
		for(let i=0;i<str1.length;i++) {
			
			let ch=str1.charAt(i);
			if(ch=='a'|ch=='i'|ch=='e'|ch=='o'|ch=='u') {
				count++;
			}
        }
        console.log(count);