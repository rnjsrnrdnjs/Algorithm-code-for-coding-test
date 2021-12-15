import sys
sys.setrecursionlimit(20000)
input = sys.stdin.readline

class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

class Tree:
    def __init__(self):
        self.root = None

    def add(self,data):
        if(self.root == None):
            self.root = Node(data)
        
        else:
            current = self.root
            while(True):
                if(current.data > data):
                    if(current.left == None):
                        current.left = Node(data)
                        break
                    current = current.left

                if(current.data < data):
                    if(current.right == None):
                        current.right = Node(data)
                        break
                    current = current.right
    
    def postOrder(self,node=None):
        global answer
        
        if node == None:
            node = self.root
        
        if node.left != None:
            self.postOrder(node.left)
        if node.right != None:
            self.postOrder(node.right)
        answer.append(node.data)


tree = Tree()
while True:
    try:
        tree.add(int(input()))
    except:
        break
answer = []
tree.postOrder()
print('\n'.join(map(str,answer)))