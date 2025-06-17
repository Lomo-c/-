<template>
    <div class="card card-compact bg-base-100 shadow-sm rounded-lg">
        <figure class="relative">
            <img :src="thumbnail" :alt="title" class="w-full h-40 object-cover" />
            <span class="absolute bottom-2 right-2 bg-black bg-opacity-75 text-white text-xs px-1.5 py-0.5 rounded">
                {{ duration }}
            </span>
        </figure>
        <div class="card-body p-3">
            <h2 class="card-title text-base font-bold leading-tight" style="display: -webkit-box; -webkit-line-clamp: 2; line-clamp: 2; -webkit-box-orient: vertical; overflow: hidden;">
                {{ title }}
            </h2>
            <div class="text-gray-500 text-sm mt-1">
                <span>{{ views }}</span>
                <span class="mx-1">·</span>
                <span>{{ uploadDate }}</span>
            </div>
        </div>
    </div>
</template>

<script setup lang="ts">
defineProps<{
    thumbnail: string;
    duration: string;
    title: string;
    views: string;
    uploadDate: string;
}>();
</script> 