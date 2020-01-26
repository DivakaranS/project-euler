function largestPalindromeProduct(n) {
  // Good luck!
  var arr=[];
  var rem;
  if (n == 2){
      for (var i=10;i<=99;i++){
      for(var j=10;j<=99;j++){
         var sum =i*j;
         var temp=sum;
         var final=0;
         while(sum>0){
          rem = sum%10;
          sum=parseInt(sum/10);
          final = final*10+rem;
         }
    console.log(final)
         
         if(final==temp){
           arr.push(temp);
        }
      }
    }
  }
  return arr;
}

console.log(largestPalindromeProduct(2));
