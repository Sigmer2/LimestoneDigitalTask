#Test Task for limestone Digital

Task to check algorithmic skills and data structure understanding. Given a number (Integer) where each digit is in range 1..7 according to the day of week (1 - Monday, 2 - Tuesday… 7 - Sunday). E.g. 126 - means Monday, Tuesday and Saturday. Convert this number to the string, separating each digit with ‘,’ for non consecutive sequence days, or ‘-’ for consecutive sequence days. You should sort and remove duplicates before, like 12365375 -> 12335567 -> 123567 -> ‘1-3,5-7’  
Examples:  
2 -> ‘2’  
56 -> ‘5-6’  
24 -> ‘2,4’  
123 -> ‘1-3’  
135 -> ‘1,3,5’  
125 -> ‘1-2,5’  
12367 -> ‘1-3,6-7’  
134567 -> ‘1,3-7’