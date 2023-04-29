<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>상품 번호</td>
                    <td>
                        <input type="text" :value="product.productId" disabled/>
                    </td>
                </tr>
                <tr>
                    <td>상품명</td>
                    <td>
                        <input type="text" v-model="productName"/>
                    </td>
                </tr>
                <tr>
                    <td>상품 가격</td>
                    <td>
                        <input type="number" v-model="productPrice"/>
                    </td>
                </tr>
                <tr>
                    <td>제조일자</td>
                    <td>
                        <input type="text" v-model="mfgDate"/>
                    </td>
                </tr>
                <tr>
                    <td>유통기한</td>
                    <td>
                        <input type="text" v-model="expDate"/>
                    </td>
                </tr>
                <tr>
                    <td>상품 정보</td>
                    <td>
                        <textarea cols="70" rows="25" v-model="productDetails"/>
                    </td>
                </tr>
            </table>

            <div>
                <button type="submit">수정 완료</button>
                <router-link :to="{ 
                    name: 'ProductReadPage', 
                    params: { productId: product.productId.toString() }
                }">수정 취소</router-link>
            </div>
        </form>
    </div>
</template>

<script>
export default {
    
    props: {
        product: {
            type: Object,
            required: true,
        }
    },
    data () {
        return {
            productName: '',
            productPrice: 0,
            mfgDate: '',
            expDate: '',
            productDetails: '',
        }
    },
    created () {
        this.productName = this.product.productName
        this.productPrice = this.product.productPrice
        this.mfgDate = this.product.mfgDate
        this.expDate = this.product.expDate
        this.productDetails = this.product.productDetails
    },
    methods: {
        onSubmit () {
            const { productName, productPrice, mfgDate, expDate, productDetails } = this
            this.$emit('submit', { productName, productPrice, mfgDate, expDate, productDetails })
        }
    }
}
</script>

<style lang="">
    
</style>