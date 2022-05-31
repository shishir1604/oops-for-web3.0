sha-256
it contains several packages.
To calculate cryptographic hashing value in Java, MessageDigest Class is used, under the package java.security.
MessagDigest Class provides following cryptographic hash function to find hash value of a text, they are: 
MD5
SHA-1
SHA-256
This Algorithms are initialized in static method called getInstance().
After selecting the algorithm it calculate the digest value and return the results in byte array.
BigInteger class is used, which converts the resultant byte array into its sign-magnitude representation. This representation is converted into hex format to get the MessageDigest

byte[] callsha()- accepts a string parameter and return its byte array of the hash. it contains an object of messagedigest to implement the sha-256 algo through getinstance().

tohex()-accepts byte array parameter, converts this byte array into signum format through biginteger and then into hexadecimal string using tostring(); hence returns the required hash.

main()- reads a string. stores the target in another string. a loop is run till the nonce value is found. the hexadecimal are converted into integers and then compared. it also stores the start time and the end time  and prints the total time elapsed.
various unique functions used-
nanoTime()= retuns the current time in nanoseconds.
toString()- to convert any type of value into string.
BigInteger class= to handle Bigintegers that are out of the scope of normal intgers and operators.
