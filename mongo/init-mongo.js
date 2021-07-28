db.createUser(
    {
        user: "appUser",
        pwd: "secret",
        roles: [
            {
                role: "readWrite",
                db: "reviewdb"
            }
        ]
    }
̰)