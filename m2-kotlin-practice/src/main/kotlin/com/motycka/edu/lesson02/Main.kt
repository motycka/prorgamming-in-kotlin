//package com.motycka.edu.lesson02
//
//data class Task(
//    val id: Int,
//    val description: String,
//    val priority: TaskPriority,
//    val status: TaskStatus
//)
//
//object TaskService {
//
//    private val tasks = mutableListOf<Task>()
//
//    fun createTask(description: String, priority: TaskPriority) {
//        tasks.add(
//            Task(
//                id = tasks.size + 1,
//                description = description,
//                priority = priority,
//                status = TaskStatus.TODO
//            )
//        )
//    }
//
//    fun updateTask(description: String, priority: TaskPriority, status: TaskStatus) {
//        // Update a task
//    }
//
//    fun deleteTask(task: Task) {
//        // Delete a task
//    }
//
//    fun getTaskById(id: Int): Task {
//        // Get a task by id
//        return Task(1, "Task 1", TaskPriority.LOW, TaskStatus.TODO)
//    }
//
//    fun getTasks(): List<Task> {
//        // Get all tasks
//        return listOf(
//            Task(1, "Task 1", TaskPriority.LOW, TaskStatus.TODO),
//            Task(2, "Task 2", TaskPriority.MEDIUM, TaskStatus.IN_PROGRESS),
//            Task(3, "Task 3", TaskPriority.HIGH, TaskStatus.DONE)
//        )
//    }
//}
//
//enum class TaskPriority {
//    LOW,
//    MEDIUM,
//    HIGH
//}
//
//enum class TaskStatus {
//    TODO,
//    IN_PROGRESS,
//    DONE
//}
//
//fun main() {
//    val tasks = listOf(
//        Task(1, "Learn Kotlin language basics", TaskStatus.DONE),
//        Task(2, "Learn Kotlin functions and objects", TaskStatus.IN_PROGRESS),
//        Task(3, "Build a Kotlin app", TaskStatus.TODO)
//    )
//
//    println("Task: ${task.title} - ${task.description} - ${task.status}")
//}
//
