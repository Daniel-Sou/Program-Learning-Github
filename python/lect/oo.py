class Snake:
  name = 'python' # set an attribute `name` of the class
  
  def change_name(self,new_name): # note that the first argument is self
    self.name = new_name # access the class attribute with the self keyword

# instantiate the class Snake and assign it to variable snake
snake = Snake()

# access the class attribute name inside the class Snake.
print(snake.name)