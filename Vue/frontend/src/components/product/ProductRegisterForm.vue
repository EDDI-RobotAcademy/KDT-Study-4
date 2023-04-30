<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>상품명</td>
                    <td>
                        <input type="text" v-model="productName"/>
                    </td>
                </tr>            
                <tr>
                    <td>상품 가격</td>
                    <td>
                        <input type="text"v-model="productPrice">
                    </td>
                </tr>
                <tr>
                    <td>제조사</td>
                    <td>
                        <input type="text" v-model="manufacturer">
                    </td>
                </tr>
                <tr>
                    <td>제조일자</td>
                        <input type="text" v-model="mfgDate">
                    </td>
                </tr>
                <tr>
                    <td>유통기한</td>
                    <td>
                        <input style="width:150px; height:30px;" type="text" v-model = "expDate"> ~
                        <input style="width:150px; height:30px;" type="text" v-model = "expDate">
                    </td>                 
                </tr>
                <tr>
                    <td>카테고리</td>
                    <td>
                        <input type="text" v-model="categoryId">
                    </td>
                </tr>
                <tr>
                    <td>제품 세부 정보</td>
                    <td>
                        <input type="text" v-model="productDetails">
                    </td>
                </tr>
            </table>
            <div>
                <button type="submit">등록</button>
                <router-link :to="{ name: 'ProductListPage' }">
                    취소
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
            productPrice:1,
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
    .search {
  position: relative;
  width: 300px;
}

input {
  width: 100%;
  border: 1px solid #bbb;
  border-radius: 8px;
  padding: 8px 10px;
  font-size: 12px;
}

img {
  position : absolute;
  width: 17px;
  top: 10px;
  right: 12px;
  margin: 0;
}

</style>