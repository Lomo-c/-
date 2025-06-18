<template>
    <div class="h-full flex flex-col">
        <!-- Header -->
        <Header />

        <!-- Content Grid -->
        <main class="flex-1 px-4 grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 xl:grid-cols-5 gap-4 content-start">
             <VideoCard v-for="video in videos" :key="video.id" :thumbnail="video.thumbnailUrl" :duration="video.duration"
                :title="video.title" :views="video.views" :uploadDate="video.uploadDate" :authorName="video.authorName" :authorAvatar="video.authorAvatar" />
        </main>
    </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue';
import VideoCard from '../components/VideoCard.vue';
import Header from '../components/Header.vue';
import request from '../utils/request';

interface Video {
    id: number;
    title: string;
    thumbnailUrl: string;
    duration: string;
    views: string;
    uploadDate: string;
    authorName: string;
    authorAvatar?: string;
}

const videos = ref<Video[]>([]);

onMounted(async () => {
    try {
        const response = await request({
            url: '/videos/list',
            method: 'get'
        }) as Video[];
        videos.value = response;
    } catch (error) {
        console.error('Failed to fetch videos:', error);
    }
});
</script>