Long Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }

        int m = in.nextInt();
//        int m = 0;
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        
		// your code goes here
		for( int i=0 ; i<=n-2 ; i++){
//			System.out.println( "ssssss" + i + " " + n);
			if(scores[i] == scores[i+1]){
				for(int j=i+1 ; j<=n-2 ; j++ ){
					scores[j] = scores[j+1];
				}
//				System.out.println( "i : " + i);
				i--;
				n--;
			}
		}

//		System.out.println( "****************************1");
		
//		System.out.println( "ssssss   aaaaaaaaaa n : " + n);
		for( int i=0 ; i<n ; i++){
//			System.out.println(scores[i]);
		}

//		System.out.println( "****************************2");
//		System.out.println( " n : " + n);
		for( int now : alice ){
			int rank = n + 1;
//			System.out.println( "now : " + now );
			for(int scores_i=n-1; scores_i >=0; scores_i--){
//				System.out.println("scores[scores_i] : " + scores[scores_i]);
				if(scores[scores_i] > now ){
					System.out.println(rank);
					break;
				}else{
					rank--;
					if(scores_i == 0){
						System.out.println(rank);
					}
				}
			}			
		}
	}
}



Short Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }

        int m = in.nextInt();
//        int m = 0;
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        
		// your code goes here
		for( int i=0 ; i<=n-2 ; i++){
//			System.out.println( "ssssss" + i + " " + n);
			if(scores[i] == scores[i+1]){
				for(int j=i+1 ; j<=n-2 ; j++ ){
					scores[j] = scores[j+1];
				}
//				System.out.println( "i : " + i);
				i--;
				n--;
			}
		}

//		System.out.println( "****************************1");
		
//		System.out.println( "ssssss   aaaaaaaaaa n : " + n);
//		for( int i=0 ; i<n ; i++){
//			System.out.println(scores[i]);
//		}

//		System.out.println( "****************************2");
//		System.out.println( " n : " + n);
		int rank = n +1;
		for( int now : alice ){
//			rank = n + 1;
//			System.out.println( "now : " + now );

			if(rank!=1){

				for(int scores_i=rank -2; scores_i >=0; scores_i--){
	//				System.out.println("scores[scores_i] : " + scores[scores_i]);
					if(scores[scores_i] > now ){
						System.out.println(rank);
						break;
					}else{
						rank--;
						if(rank == 1){
							System.out.println(rank);
						}
					}
				}
			}else{
				System.out.println(rank);
			}
		}
	}
}




/*
Input
100
295 294 291 287 287 285 285 284 283 279 277 274 274 271 270 268 268 268 264 260 259 258 257 255 252 250 244 241 240 237 236 236 231 227 227 227 226 225 224 223 216 212 200 197 196 194 193 189 188 187 183 182 178 177 173 171 169 165 143 140 137 135 133 130 130 130 128 127 122 120 116 114 113 109 106 103 99 92 85 81 69 68 63 63 63 61 57 51 47 46 38 30 28 25 22 15 14 12 6 4
200
5 5 6 14 19 20 23 25 29 29 30 30 32 37 38 38 38 41 41 44 45 45 47 59 59 62 63 65 67 69 70 72 72 76 79 82 83 90 91 92 93 98 98 100 100 102 103 105 106 107 109 112 115 118 118 121 122 122 123 125 125 125 127 128 131 131 133 134 139 140 141 143 144 144 144 144 147 150 152 155 156 160 164 164 165 165 166 168 169 170 171 172 173 174 174 180 184 187 187 188 194 197 197 197 198 201 202 202 207 208 211 212 212 214 217 219 219 220 220 223 225 227 228 229 229 233 235 235 236 242 242 245 246 252 253 253 257 257 260 261 266 266 268 269 271 271 275 276 281 282 283 284 285 287 289 289 295 296 298 300 300 301 304 306 308 309 310 316 318 318 324 326 329 329 329 330 330 332 337 337 341 341 349 351 351 354 356 357 366 369 377 379 380 382 391 391 394 396 396 400


Output

88
88
87
85
84
84
83
82
81
81
80
80
80
80
79
79
79
79
79
79
79
79
77
75
75
74
73
73
73
71
71
71
71
71
71
70
70
69
69
68
68
68
68
67
67
67
66
66
65
65
64
64
62
61
61
60
59
59
59
59
59
59
58
57
56
56
55
55
53
52
52
51
51
51
51
51
51
51
51
51
51
51
51
51
50
50
50
50
49
49
48
48
47
47
47
45
43
42
42
41
38
36
36
36
36
35
35
35
35
35
35
34
34
34
33
33
33
33
33
32
30
28
28
28
28
27
27
27
26
23
23
22
22
20
20
20
18
18
15
15
14
14
13
13
11
11
10
10
8
8
7
6
5
4
4
4
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1
1























Input
100
997 981 957 933 930 927 926 920 916 896 887 874 863 863 858 847 815 809 803 794 789 785 783 778 764 755 751 740 737 730 691 677 652 650 587 585 583 568 546 541 540 538 531 527 506 493 457 435 430 427 422 422 414 404 400 394 387 384 374 371 369 369 368 365 363 337 336 328 325 316 314 306 282 277 230 227 212 199 179 173 171 168 136 125 124 95 92 88 85 70 68 61 60 59 44 43 28 23 13 12
200
12 20 30 32 35 37 63 72 83 85 96 98 98 118 122 125 129 132 140 144 150 164 184 191 194 198 200 220 228 229 229 236 238 246 259 271 276 281 283 287 300 302 306 307 312 318 321 325 341 341 341 344 349 351 354 356 366 369 370 379 380 380 396 405 408 417 423 429 433 435 438 441 442 444 445 445 452 453 465 466 467 468 469 471 475 482 489 491 492 493 498 500 501 504 506 508 523 529 530 539 543 551 552 556 568 569 571 587 591 601 602 606 607 612 614 619 620 623 625 625 627 638 645 653 661 662 669 670 676 684 689 690 709 709 710 716 724 726 730 731 733 737 744 744 747 757 764 765 765 772 773 774 777 787 794 796 797 802 805 811 814 819 819 829 830 841 842 847 857 857 859 860 866 872 879 882 895 900 900 903 905 915 918 918 922 925 927 928 929 931 934 937 955 960 966 974 982 988 996 996



Output
97
96
94
94
94
94
89
87
87
86
83
83
83
83
83
81
81
81
80
80
80
80
76
76
76
76
75
74
73
73
73
72
72
72
72
72
72
71
70
70
70
70
69
69
69
67
67
66
63
63
63
63
63
63
63
63
61
59
59
57
57
57
54
52
52
51
50
49
48
47
47
47
47
47
47
47
47
47
46
46
46
46
46
46
46
46
46
46
46
45
45
45
45
45
44
44
44
43
43
41
39
38
38
38
37
37
37
34
34
34
34
34
34
34
34
34
34
34
34
34
34
34
34
32
32
32
32
32
32
31
31
31
30
30
30
30
30
30
29
29
29
28
27
27
27
25
24
24
24
24
24
24
24
21
19
19
19
19
18
17
17
16
16
16
16
16
16
15
15
15
14
14
13
13
12
12
11
10
10
10
10
10
9
9
8
8
6
6
6
5
4
4
4
3
3
3
2
2
2
2



*/