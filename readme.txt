Project
-Name
-Creat date
-Task States

Task States
-Name
-Creat date
-Ordinal
-Task List

Task
-Name
-Creat date
-Description (Full Text)



Project
-id(long)
-name(string)
-createdDate(time)
-taskStates(TaskState[] array)

TaskStates
-id(long)
-name(string)
-ordinal(long)
-createdDate(time)
-tasks (Task[] array)

Task
-id(long)
-name(string)
-description(string)
-createdDate(time)



-DB Entities
-DB Entity management
-REST API (business logic layer)


ProjectController
-создать проект
-редактировать проект
-удалять проект

Post - обычно отвечает за создание чего-либо/ запуск какой-то логики
Get - обычно отвечает за получение какой-то информации
Put - обычно отвечает за полную замену
Patch - обычно отвечает за обвновление объекта/запуск какой-то логики
Delete - обычно отвечает за удаление объекта

