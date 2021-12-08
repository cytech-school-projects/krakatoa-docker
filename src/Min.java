//@+ CheckArithOverflow = no 

class Min { 

   /*@ requires t != null && t.length > 0; 

     @ ensures \forall integer i; 0 <= i < t.length ==> \result <= t[i]; 

   @*/ 

 int getMin(int t[]) { 

   int res = t[0]; 

   /*@ loop_invariant @ 1 <= i <= t.length && @ \forall integer j; 0 <= j < i ==> res <= t[j]; 

     @ loop_variant @ t.length - i; 

   @*/ 

   for (int i = 1; i < t.length; i++) 

      if (t[i] < res) res = t[i]; 

   return res; } 

}

