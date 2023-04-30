<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td class="productForm">상품명</td>
                    <td>
                        <input type="text" v-model="productName"/>
                    </td>
                </tr>            
                <tr>
                    <td class="productForm">상품 가격</td>
                    <td>
                        <input type="number" v-model="productPrice">
                    </td>
                </tr>
                <tr>
                    <td class="productForm">제조사</td>
                    <td>
                        <input type="text" v-model="manufacturer">
                    </td>
                </tr>
                <tr>
                    <td class="productForm">제조일자</td>
                    <td>
                        <input type="date" v-model="mfgDate">
                    </td>
                </tr>
                <tr>
                    <td class="productForm">유통기한</td>
                    <td>
                        <input type="date" v-model="expDate">
                    </td>                 
                </tr>
                <tr>
                    <td class="productForm">카테고리</td>
                    <td>
                        <input type="text" v-model="categoryId">
                    </td>
                </tr>
                <tr>
                    <td class="productForm">상품 정보</td>
                    <td>
                        <textarea cols="70" rows="18" v-model="productDetails"/>
                    </td>
                </tr>
            </table>

            <div class="submitRegister">
                <v-btn type="submit" color="blue" style="margin: 0px 10px 0px 0px; color: white">등록</v-btn>
                <router-link :to="{ name: 'ProductListPage' }">
                    <v-btn>취소</v-btn>
                </router-link>
            </div>
        </form>
    </div>
</template>

<script>
export default {
    name: "ProductRegisterForm",
    data () {
        return {
            productName:'',
            manufacturer:'',
            mfgDate:'',
            expDate:'',
            categoryId:'',
            productPrice: 0,
            productDetails:'',
        }
    },
    methods: {
        onSubmit () {
            const { productName, manufacturer, mfgDate, 
                expDate, categoryId,
                productPrice, productDetails } = this            
            this.$emit('submit', { productName, manufacturer, mfgDate,
                expDate, categoryId ,productPrice, productDetails })
        }
    }
}
</script>

<style scoped>
input {
    color: gray;
    width: 100%;
    border: 1px solid #bbb;
    border-radius: 8px;
    padding: 8px 10px;
    font-size: 14px;
    font-weight: 300;
}
table {
    margin-left: 30px;
}
tr {
    height: 50px;
}
td.productForm {
    width: 150px;
    font-weight: 400;
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
div.submitRegister {
    margin-left: 280px;
    padding: 30px;
}

/*
사용되지 않는 코드
img {
  position : absolute;
  width: 17px;
  top: 10px;
  right: 12px;
  margin: 0;
}
.search {
  position: relative;
  width: 300px;
}
*/
</style>