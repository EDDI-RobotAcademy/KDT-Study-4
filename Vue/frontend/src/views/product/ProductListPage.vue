<template lang="">
    <div>
        <h2>제품 목록</h2>
        <div style="text-align: left; margin: 20px;">
            <router-link :to="{ name: 'ProductRegisterPage'}">
                제품 등록
            </router-link>
        </div>
        <product-list-form :products="products"/>
    </div>
</template>

<script>
import { mapActions, mapState } from 'vuex';
import ProductListForm from '@/components/product/ProductListForm.vue'

const productModule = 'productModule'

export default {
    components: { ProductListForm },
    computed: {
        ...mapState(productModule, ['products']),
    },
    mounted () {
        this.requestProductListFrom()
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