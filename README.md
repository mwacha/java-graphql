# Projeto de exemplo utilizando GraphQL com SpringBoot

## Como rodar
docker-compose up -d

## Como Testar
- Abrir o navegador e digitar a url:  http://localhost:8091/graphiql

### Exemplos de testes: 
```graphql
### CATEGORY
### CATEGORY
query categoryById {
    categoryById(id: "97fc71fa-a829-49c2-8d26-2e65f0d25e81") {
        id
        name
    }
}

query categories {
    categories {
        id
        name
        description
    }
}

query categoriesWithCourses {
    categories {
        id
        name
        description
        courses {
            id
            name
        }
    }
}

mutation createCategory {
    createCategory(input: {name: "Tecnologia2", description: "Cursos de tecnologia3"}){
        id
        name
        description
    }
}

mutation updateCategory {
    updateCategory(input: {id:"7d139830-0045-4ef6-9b99-e6f46f22da49", name: "Tecnologia2", description: "Cursos de tecnologia2"}){
        id
        name
        description
    }
}

mutation removeCategory {
    removeCategory(id: "7d139830-0045-4ef6-9b99-e6f46f22da49"){
        id
    }
}


### COURSE

query courseById {
    courseById(id: "d6d8665e-3945-43e5-af68-be0cd5b55b0a") {
        id
        name
    }
}

query courses {
    courses {
        id
        name
        description
    }
}
query coursesWithCategory {
    courses {
        id
        name
        description
        category {
            id
            name
        }
    }
}

query courseByCategoryId {
    courseByCategoryId(id: "9f3ec68c-0b19-4471-8dc8-fc1751cf4962") {
        id
        name
    }
}

mutation createCourse {
    createCourse(input: {name: "Java", description: "Curso de Java", categoryId: "9f3ec68c-0b19-4471-8dc8-fc1751cf4962"}){
        id
        name
        description
    }
}

mutation updateCourse {
    updateCourse(input: {id:"d6d8665e-3945-43e5-af68-be0cd5b55b0a", name: "Java 2", description: "Cursos de Java2", categoryId: "9f3ec68c-0b19-4471-8dc8-fc1751cf4962"}){
        id
        name
        description
    }
}

mutation removeCourse {
    removeCourse(id: "7d139830-0045-4ef6-9b99-e6f46f22da49"){
        id
    }
}
```
