import { createRouter, createWebHistory, type RouteRecordRaw } from 'vue-router'
import request from '../utils/request'
import Home from '../views/Home.vue'

const componentMap: Record<string, any> = {
  'Home': Home,
  'History': import('../views/History.vue'),
}

async function createDynamicRouter() {
  const staticRoutes: RouteRecordRaw[] = []

  let dynamicRoutes: RouteRecordRaw[] = []
  try {
    const response: any[] = await request({
      url: '/routes/list',
      method: 'get'
    })

    dynamicRoutes = response.map(item => ({
      path: item.path,
      name: item.name,
      component: componentMap[item.component] || Home
    }))

  } catch (error) {
    console.error('Failed to fetch routes:', error)
  }

  const router = createRouter({
    history: createWebHistory(),
    routes: [...staticRoutes, ...dynamicRoutes]
  })

  return router
}

export { createDynamicRouter } 