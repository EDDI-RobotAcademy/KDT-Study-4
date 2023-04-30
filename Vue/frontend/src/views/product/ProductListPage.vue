<template lang="">
    <div>
        <h2>제품 목록</h2>
        <div style="text-align: left; margin: 20px;">
            <router-link :to="{ name: 'ProductRegisterPage'}">
                제품 등록
            </router-link>
        </div>
        <category/>
        <product-list-form :products="products"/>
    </div>
</template>

<script>
import { mapActions, mapState } from 'vuex';
import ProductListForm from '@/components/product/ProductListForm.vue'
import Category from '@/components/Category.vue';
const productModule = 'productModule'

export default {
    components: { ProductListForm,
    Category },
    computed: {
        ...mapState(productModule, ['products']),
    },
    mounted () {
        this.requestProductListToSpring()
    },
    methods: {
        ...mapActions(
            productModule, ['requestProductListToSpring']
        )
    }
}
</script>

<style lang="">

</style>