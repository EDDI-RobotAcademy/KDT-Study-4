<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td class="productForm">상품 번호</td>
                    <td>
                        <input type="text" class="inputValueProductId":value="product.productId" disabled/>
                    </td>
                </tr>
                <tr>
                    <td class="productForm">상품명
                        <span>*</span>
                    </td>
                    <td>
                        <input type="text" class="inputValue" v-model="productName"/>
                    </td>
                </tr>
                <tr>
                    <td class="productForm">상품 가격
                        <span>*</span>
                    </td>
                    <td>
                        <input type="number" class="inputValue" v-model="productPrice"/>
                    </td>
                </tr>
                <tr>
                    <td class="productForm">제조일자
                        <span>*</span>
                    </td>
                    <td>
                        <input type="date" class="inputValue" v-model="mfgDate"/>
                    </td>
                </tr>
                <tr>
                    <td class="productForm">유통기한
                        <span>*</span>
                    </td>
                    <td>
                        <input type="date" class="inputValue" v-model="expDate"/>
                    </td>
                </tr>
                <tr>
                    <td class="productForm">상품 정보
                        <span>*</span>
                    </td>
                    <td>
                        <textarea cols="70" rows="18" v-model="productDetails"/>
                    </td>
                </tr>
            </table>

            <div class="modifySubmit">
                <v-btn type="submit" color="blue" style="margin: 0px 10px 0px 0px; color: white;">수정</v-btn>
                <router-link :to="{ 
                    name: 'ProductReadPage', 
                    params: { productId: product.productId.toString() }
                }"><v-btn>취소</v-btn>
                </router-link>
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

<style scoped>
td.productForm {
    width: 150px;
    font-weight: 400;
}
input.inputValue, input.inputValueProductId {
    font-size: 14px;
    color: gray;
    width: 100%;
    font-weight: 300;
    border: 1px solid #bbb;
    border-radius: 8px;
    padding: 8px 10px;
}
input.inputValueProductId {
    background-color: rgb(240, 240, 240);
    width: 100%;
}
table {
    margin-left: 30px;
}
tr {
    height: 50px;
}
div.modifySubmit {
    margin-left: 280px;
    padding: 30px;
}
textarea {
    margin-top: 10px;
    color: gray;
    border-style: solid;
    border-color: #bbb;
    padding-left: 10px;
    padding-top: 3px;
    padding-bottom: 3px;
    resize: none;
    border-radius: 8px;
}
span {
    color: rgb(170, 0, 0);
    font-size: 14px;
    margin-left: 3px;
}
</style>