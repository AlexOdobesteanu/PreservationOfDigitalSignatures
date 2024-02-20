// SPDX-License-Identifier: MIT
pragma solidity ^0.8.24;

contract DocumentHash {
    mapping (uint256 => bytes32[]) private userToDocument;

    struct User {
        uint256 userId;
        bytes32[] documentHash;
    }
    User[] private users;

    function addUser(uint256 userId) public
    {
        users.push(User(userId, new bytes32[](0)));
    }

    function addUserSubmittedDoc (uint256 userId, bytes32 docHash) public
    {
        for (uint256 i=0; i<users.length; i++)
        {
            if(users[i].userId == userId)
            {
                users[i].documentHash.push(docHash);
            }
        }
        userToDocument[userId].push(docHash);
    }

    function getDocumentsIds(uint256 userId) public view returns (bytes32[] memory)
    {
        return userToDocument[userId];
    }
}