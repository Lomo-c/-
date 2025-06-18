<template>
    <aside class="w-50 h-screen bg-base-100 text-base-content flex flex-col">
        <div class="p-4 flex items-center gap-2">
            <img src="../assets/logo.png" alt="logo" class="w-8 h-8 ml-1.5" />
            <span class="text-lg font-bold">即时短视频</span>
        </div>
        <ul class="menu px-4 py-0 space-y-2 w-full">
            <li v-for="item in menuItems" :key="item.to">
                <router-link :to="item.to" class="rounded-lg" active-class="active" :exact="item.exact">
                    <span v-html="item.svg"></span>
                    {{ item.label }}
                </router-link>
            </li>
        </ul>
    </aside>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue';
import request from '../utils/request';

interface MenuItem {
    to: string;
    label: string;
    svg: string;
    exact: boolean;
}

const menuItems = ref<MenuItem[]>([]);

onMounted(async () => {
    try {
        const response: any = await request({
            url: '/routes/list',
            method: 'get'
        });
        menuItems.value = response.map((item: any) => ({
            to: item.path,
            label: item.name,
            svg: item.icon,
            exact: item.path === '/',
        }));
    } catch (error) {
        console.error('Failed to fetch sidebar data:', error);
    }
});
</script>

<style scoped>
.menu .active {
    background-color: #000;
    color: #fff;
}
</style>