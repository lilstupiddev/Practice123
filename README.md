git init
git add .
git commit -m "init: project"

git branch -M main
git remote add origin <URL>
git push -u origin main

git checkout -b feature/core
# код
git add .
git commit -m "feat: core logic"
git push origin feature/core
# → PR

git checkout main
git pull

git checkout -b feature/tests
# код
git add .
git commit -m "test: add tests"
git push origin feature/tests
# → PR
