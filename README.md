# binarysearchapi
This api provides index of the key element for a sorted rotated array.

Here is the CURLs for this:

Access Token CURL:

curl --location --request POST 'http://localhost:8080/accesstoken' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": username,
    "password": password
}'
Response for this call will be like this://This is expired token
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqb2huZG9lIiwiZXhwIjoxNjYyMDg2MjczLCJpYXQiOjE2NjIwNjgyNzN9.H3LD8FlXqe1mTEQ3y4fKsc7LQUg1nzi4JTlOw0lZJQv87z8c7QX3M6tQRdcUQw0cWdsDjbN0vbno8T0M6LxWnQ"
}

Search Api CURL:

curl --location --request POST 'http://localhost:8080/search/key' \
--header 'Accept: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqb2huZG9lIiwiZXhwIjoxNjYyMDg2MjczLCJpYXQiOjE2NjIwNjgyNzN9.H3LD8FlXqe1mTEQ3y4fKsc7LQUg1nzi4JTlOw0lZJQv87z8c7QX3M6tQRdcUQw0cWdsDjbN0vbno8T0M6LxWnQ' \
--header 'Content-Type: application/json' \
--data-raw '{
    "sortedArray": [5,6,7,8,9,10,1,2,3],
    "key": 3
}'

Response for this call will be like this:
8
