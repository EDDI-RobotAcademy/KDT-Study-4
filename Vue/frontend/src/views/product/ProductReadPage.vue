<template>
    <div style="text-align: center;">
        <div :style="{ marginTop: '50px' , marginBottom: '50px'}">
            <h2>제품 상세페이지</h2>
        </div>
        <div style="text-align: center;">
            <product-read-form v-if="product" :product="product"/>
            <p v-else>기다려주세요.</p>
        </div>
        <p></p>
        <div style="text-align: right;">
            <router-link :to="{ name: 'ProductModiftyPage', params: { productId } }">
                <v-btn color="gray" dark style="margin: 0px 5px 0px 0px;">수정</v-btn>
            </router-link>
            <router-link :to="{ name: 'ProductListPage' }">
                <v-btn color="gray" dark style="margin: 0px 5px 0px 0px;">목록</v-btn>
            </router-link>
            <v-btn color="red" dark @click="onDelete">삭제</v-btn>
        </div>
    </div>
</template>

<script>
import ProductReadForm from '@/components/product/ProductReadForm.vue'
import { mapActions, mapState } from 'vuex'

const productModule = 'productModule'

export default {
    components: {
        ProductReadForm,
    },
    props: {
        productId: {
            type: String,
            required: true,
        },
    },
    computed: {
        ...mapState(productModule, ['product'])
    },
    methods: {
        ...mapActions(
            productModule, ['requestProductToSpring', 'requestDeleteProductToSpring']
        ),
        async onDelete () {
            await this.requestDeleteProductToSpring(this.productId)
            await this.$$router.push({ name: 'ProductListPage' })
        }
    },
    created () {
        this.requestProductToSpring(this.productId)
    }
}
</script>

<style>
  
</style>