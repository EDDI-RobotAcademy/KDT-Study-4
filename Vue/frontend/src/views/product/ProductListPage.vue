<template>
    <div>
        <div style="text-align: left; margin: 20px;">
            <router-link :to="{ name: 'ProductRegisterPage'}">
                <v-btn color="primary" dark style="margin: 0px 5px 0px 0px;">상품 등록</v-btn>
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

<style>

</style>