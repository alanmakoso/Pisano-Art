# Pisano-Art
Jacob Yatsko, a Youtuber created a video titled "A New Way to Look at Fibonacci Numbers." (link below)\
https://youtu.be/o1eLKODSCqw \
\
He took each Fibconacci number, divided it by an arbitary positive whole number, and made a list of the remainders (modulo). He then divided a circle into equal parts and created interesting shapes by connectioning points on a circle in a pattern determined by the remainders.\
\
I programmed this software to generate the shapes based on an input of a positive integer.\
\
****** This is programmed inn Java. **Requires a Java Runtime Environment (JRE) to run** ****** Install JRE here if needed: https://www.java.com/en/download/manual.jsp \
****** Graphics of this program uses javax.swing, **IT ONLY WORKS ON A DESKTOP COMPUTER** ****** (run the .jar file)

-------------------------------------------------

### DETAILS

**Fibonacci sequence:** A sequnce of numbers starting with 0, 1. Each successive number is the sum of the two previous numbers.\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 0 + 1 = 1; 1 + 1 = 2; 2 + 1 = 3; 3 + 2 = 5; 5 + 3 = 8; 8 + 5 = 13 ...\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The first 11 terms of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...\
 \
 **Modulo** (%): The remainder when a number (dividend) is divivded by another (divisor).\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 % 5 = 0 | becuase 10/5 = 2 with no remainder\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 13 % 5 = 3 | because 13/5 = 2 with remainder of 3\
\
**Pisano sequence:** Take each Fibonacci number and divide it by an arbitary positive whole number, record the new sequence of modulo.\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; E.g. number (divisor) = 5\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Fibonacci sequence = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Pisano Sequence:     0, 1, 1, 2, 3, 0, 3,  3,  1,  4,  0,  4,  4,   3,   2,   0,   2,    2,    4,    1,   0,     1,     1,     2\
\
**Pisano Period:** The amount of numbers it takes for the Pisano Sequence to start repeating itself.\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The Pisano Sequence starts to repeat at the 21st term. Therefore the Pisano period when the divisor = 5 is 21.\
\
**Art**
1. Let n = the divisor\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; E.g. n = 5
2. Divide the edge of the circle into n equal parts\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; E.g. Divide the edge of the circle into 5 equal parts
3. Label the splitting points from 0 to n-1 going clockwise
4. Each number in the Pisano Sequence (Fibconacci modulo n) corresponds to a splitting point.
5. Draw a line segment from the point that represents the first number in the sequence to the point that represents the second number in the sequence\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; E.g. Draw a segment from Point 0 to point 1, then from point 1 to itself (no drawing), then from point 1 to point 2...

![pisano ex](https://user-images.githubusercontent.com/75919546/138034738-a2657af7-9fee-4938-a0db-3a4fae57e067.png)
