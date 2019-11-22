# CISC3001 Computer Networks
Course Project – Chat room with file storage

## Overview
In this project, the student is required to write two programs, that can be used as a networked chat room. 

The first program is a server of chat room. When it starts, it will wait the clients to join in the chat room. All the message from the clients will echoed by the server to all the clients connected to the chat room. 

The second program is the client program that can join the chat room and can send message and accept all the other clients’ message echoed from the server. 

In addition, the clients can send and receive files from server. For example, you can let client A upload a file to the server, and then client B can download the file from the server.

The server only keeps 5 most recently received files, and the clients can check the list of available files from the server. 

## Project requirements
- Choose any language you like.
- The program must use the socket. 
- The server should be able to set the port it will listen
- The server should be able to handle multiple clients
- The clients should be able to specify the server it will contact
- The client should be able to send and receive files from server
- The server should keep 5 most recent files, and server should be able to offer the list of available files. 

## What to Submit at UMMoodle before the deadline:
1. Well-commented Source Code
2. The instructions on how to use your code, and how to run the programs
3. Project report must contain the detail explanation on the design of: 
    - server, 
    - client
    - The handling of multiple clients 
    - The handling of file transfer among clients
    - File storage and list handling in the server side
    - How to handle user interactions (User interface)
    - How to run clients in different operation systems like Windows and Linux?
    - The exception handling in communication, like too large file to store?
    - You should include a conclusion section in the report for your own additional comments and discussion.  
    - Please explain the limitations of your programs in the report
    - Please explain your selection of language and coding platform in the report.
    - Submit above all your files in a zip file. Provide detailed instructions to review and run your codes and program.

## IMPORTANT NOTE
Each student may be asked for the demonstration.

Plagiarism will not be tolerated. Two students can be a team, but they should submit their reports and codes separately. 

Each student’s contribution should be clarified.

Late submission will not be accepted. It is your responsibility to submit via UMMoodle Assignment Function before the deadline. 

Do not submit it at the last minutes. If the assignment icon is closed after the deadline and if you haven’t submitted for any reason, then I will not be able to help you. I will not accept any email submission.

## Reference
Let’s Write a Chat App in Python

https://medium.com/swlh/lets-write-a-chat-app-in-python-f6783a9ac170

