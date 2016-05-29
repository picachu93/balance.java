#!/bin/bash
echo "# balance.java" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/picachu93/balance.java.git
git push -u origin master
