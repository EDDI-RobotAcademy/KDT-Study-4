<template>
  <v-container>
    <div style="text-align: center; margin: 20px;">
      <router-link to="/product-list-page">
          <v-btn color="primary" dark style="margin: 0px 5px 0px 0px;">상품 목록 페이지</v-btn>
      </router-link>
    </div>
  </v-container>
</template>

<script>
  import HelloWorld from '../components/HelloWorld'

  export default {
    name: 'Home',

    components: {
      HelloWorld,
    },
  }
</script>

<style>
nav {
  font-size: 20px;
}
</style>
