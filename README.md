# binarysearchapi
This api provides index of the key element for a sorted rotated array.

Here is the CURL for this:

curl --location --request POST 'http://localhost:8080/search/key' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data-raw '{
    "sortedArray": [5,6,7,8,9,10,1,2,3], //Sorted Rotated Array
    "key": 3  //Key to whose index we need to find
}'
