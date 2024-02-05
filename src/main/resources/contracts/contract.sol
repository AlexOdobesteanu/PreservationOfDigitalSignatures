// SPDX-License-Identifier: MIT
pragma solidity ^0.8.24;

contract DataStorage {
    mapping (uint256 => uint256[]) private userToDocument;

    struct User {
        uint256 userId;
        uint256[] documentsIds;
    }
    User[] private users;

    function addUser(uint256 userId) public
    {
        users.push(User(userId, new uint256[](0)));
    }

    function addUserSubmittedDoc (uint256 userId, uint256 docId) public
    {
        for (uint256 i=0; i<users.length; i++)
        {
            if(users[i].userId == userId)
            {
                users[i].documentsIds.push(docId);
            }
        }
        userToDocument[userId].push(docId);
    }

    function getDocumentsIds(uint256 userId) public view returns (uint256[] memory)
    {
        return userToDocument[userId];
    }
}