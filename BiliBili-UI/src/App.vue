<template>
    <div class="w-screen h-screen bg-gray-200 flex">
        <Sidebar></Sidebar>
        <main class="flex-1 p-4">
            <router-view></router-view>
        </main>
    </div>
</template>

<script setup lang="ts">
import Sidebar from './components/sidebar.vue';
</script>