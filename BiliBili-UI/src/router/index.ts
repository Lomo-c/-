import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  { path: '/history', name: 'History', component: () => import('../views/History.vue') },
  { path: '/movie', name: 'Movie', component: Home },
  { path: '/tv', name: 'TV', component: Home },
  { path: '/game', name: 'Game', component: Home },
  { path: '/tech', name: 'Tech', component: Home },
  { path: '/vlog', name: 'Vlog', component: Home },
  { path: '/food', name: 'Food', component: Home },
  { path: '/variety', name: 'Variety', component: Home },
  { path: '/kids', name: 'Kids', component: Home },
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router 