package ro.ase.pdm.ultratodo.ui.list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ro.ase.pdm.ultratodo.data.Todo
import ro.ase.pdm.ultratodo.data.TodoRepository

class TodoListViewModel(app: Application) : AndroidViewModel(app) {
    private lateinit var todoRepository: TodoRepository
    var todayTodos: LiveData<List<Todo>> = MutableLiveData()

    fun setTodoRepository(repository: TodoRepository) {
        todoRepository = repository
        todayTodos = todoRepository.todayTodos
    }
}