## Petri Net

#### 组件
+ Place 被动的系统组件，用圆或椭圆表示，离散状态，可以存储
+ Transition 活跃的系统组件，正方形/长方形，**每个过度会消耗，生产，转移事物**
+ Arc 不是系统组件，只是用来表示系统组件之间的逻辑关系

#### 网络结构
petri net是一个有向二边图
![网络结构](./src/1.png)

#### 标识
+ Tokens 代表可以被消费、生产或转移的事物，通过过度实现；可以表示一个过度所发生的必要条件。初级网络系统中只是用黑点token

### Transition条件

#### 前序节点集和后续节点集
所以在Transition前/后的Place的集合

#### Enables的条件
该Transition的所有前序节点集中每个Place所持有的token数量>=1

#### 执行流程
![step rule](./src/2.png)


## A* algorithm
[RedBlobGames](https://www.redblobgames.com/pathfinding/a-star/introduction.html)