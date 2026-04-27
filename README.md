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

import ua.university.Order;
import ua.university.OrderItem;
import org.junit.jupiter.api.Test;
import ua.university.OrderState;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;




    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>RELEASE</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
