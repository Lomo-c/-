import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import { createDynamicRouter } from './router'

async function bootstrap() {
    const router = await createDynamicRouter();
    const app = createApp(App);
    app.use(router);
    app.mount('#app');
}

bootstrap();
