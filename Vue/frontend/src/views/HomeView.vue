<template>
  <v-container>
    <div>
      <nav>
        <router-link to="/">Home</router-link> |
        <router-link to="/about">About</router-link> |

        <!-- 이 밑으로 페이지 추가 해주시면 됩니다. -->
        <router-link to="/product-list-page">제품 목록</router-link> |
        <router-link to="/product-register-page">상품등록</router-link> |
      </nav>
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
