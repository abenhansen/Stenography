# UFO - Martin Høigaard Cupello & Kenneth Hansen
## Links and Searches
Each line has a timestamp and the google search. Beneath the google search is the link we clicked on after the search and is the one we used.

<br />

### Sunday 07.02.2020 


13:09 how to convert image to byte array

https://www.tutorialspoint.com/How-to-convert-Image-to-Byte-Array-in-java

13:13 how to find pixels in byte array image file

 https://stackoverflow.com/questions/17698348/reading-the-pixel-values-of-a-jpg-image-into-a-byte-array

13:21 convert byte to string

https://www.javatpoint.com/how-to-convert-byte-array-to-string-in-java

13:31 how to find blue values in bytearray

https://stackoverflow.com/questions/2342114/extracting-rgb-color-components-from-integer-value

13:42 least significant bit and most significant bit

https://www.morningstarfx.com/post/2016-12-25-midi-msb-and-lsb#:~:text=MSB%20stands%20for%20most%20significant,4%20bits%20would%20be%200101.

13:48 java convert int value to byte

https://www.geeksforgeeks.org/java-integer-bytevalue-method/#:~:text=The%20byteValue()%20method%20of,after%20conversion%20to%20byte%20type.

14:06 steganography java image

https://www.dreamincode.net/forums/topic/27950-steganography/

14:43 convert byte array to bits

https://stackoverflow.com/questions/2548018/convert-byte-array-to-bit-array

15:03 binary to string

https://www.rapidtables.com/convert/number/binary-to-string.html

15:29 convert binary to ascii java

https://stackoverflow.com/questions/5453017/convert-binary-string-to-ascii-text
https://www.rapidtables.com/code/text/ascii-table.html

15:54 convert int to bit java

https://stackoverflow.com/questions/2406432/converting-an-int-to-a-binary-string-representation-in-java

### Thursday 11.02.2020 

<br />

17:18 Get all colors of BufferedImage,

17:36 Java get last element of string

https://stackoverflow.com/questions/5163785/how-do-i-get-the-last-character-of-a-string

17:36 Java get last elemnt of string 

https://stackoverflow.com/questions/930397/getting-the-last-element-of-a-list

17:36  Python [-1]

https://stackoverflow.com/questions/52395099/meaning-of-list-1-in-python/52395172

17:54 Convert binary to character java 

https://stackoverflow.com/questions/8634527/converting-binary-data-to-characters-in-java/8635037

<br />

## Diary:
### Sunday 07.02.2020 

<br/>

13:38 Created a file reader, finds null bytes in array. Investigating how to find colors in array.

14:14 Still trying to find hidden message, looking for 0 values of in byte array.
14:30 looking for rgb colors in array, looking at & notation

14:57 playing with bits and finding blue ones in image

15:26 Still trying to wrap head around converting message. Have found the insignificant numbers and put them together in a string, but the end result is gibberish.

15:47: Getting a gibberish message still, split ones and zeros into bits, still gibberish. Reverting to old procedure with finding pixels.

16:16 Decided to stop for today. Still no luck. Tried reversing to bits to little endian, but is was still gibberish. Some bits were split wrong, so they contained too few digits.

---------------------------------------------------------------------------------------------------------------
### Thursday 11.02.2021

<br/>

17:00 Resuming our work, we now have a solution in python from another group that can point us in the right direction.

17:17 Looking at getting blue values only from image.

18:00 Yay we finally figured it out. we looked at substrings, how to get last index of string, how to convert string to binary and how we converted binary to char.


## Biggest Problems

<br/>

-	Figuring out how to investigate the image and what we were looking for specifically. 
    -   This was a problem because it was hard to understand the assignment description. It has small bits of information scattered across the entire description and was not concrete on what to do exactly.
-	Isolating blue values
    -	This was a problem because we didn’t have any previous experience with images in Java and how to manipulate them.
-	Converting to binary, splitting and reversing
    -	This was an obstacle because we both haven’t worked with binary numbers at all. So we both had to use the knowledge we had from class, and learn how to manipulate them in java while trying to understand how they worked.

