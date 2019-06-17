import Vue from 'vue'
import VueRouter from 'vue-router'
import HelloWorld from '../components/HelloWorld'
import ToDo from '../components/ToDo'
import About from '../components/About'
import User from '../components/UserRegistration'


Vue.use(VueRouter)

export default new VueRouter({
    routes: [
        {
        path: '/hello',
        name:'Hello',
        component: HelloWorld
        },{
            path: '/todo',
            name:'ToDo',
            component: ToDo 
        },{
            path: '/about',
            name:'About',
            component: About 
        },{
            path: '/user',
            name:'About',
            component: User 
        }
    ]
})