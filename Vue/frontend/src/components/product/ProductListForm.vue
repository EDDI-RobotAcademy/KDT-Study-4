<template lang="">
    <div>
        <h3>상품 목록</h3>
        <table style="margin: 15px;">
            <tr>
                <th align="center" width="10%">상품번호</th>
                <th align="center" width="60%">상품명</th>
                <th align="center" width="20%">가격</th>
                <th align="center" width="10%">제조사</th>
                <!--유통기한, 카테고리, 영양정보는 따로 나오게 만들 예정-->
            </tr>
            <tr v-if="!products || (Array.isArray(products) && products.length === 0)">
                <td colspan="4">
                    등록된 게시물 없음
                </td>
            </tr>
            <tr v-else v-for="product in products" :key="product.productId">
                <td align="center">
                    {{ product.productId }}
                </td>
                <td align="center">
                    <router-link :to="{
                        name: 'ProductReadPage',
                        params: { productId: product.productId.toString()}}">
                            {{ product.productName }}
                    </router-link>
                </td>
                <td align="center">
                    {{ product.productPrice }}
                </td>
                <td align="center">
                    {{ product.manufacturer }}
                </td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    props: {
        products: {
            type: Array
        }
    }
}
</script>

<style scoped>
    h3 {
        margin-left: 10px;
        padding: 10px;
    }
    th, td {
        padding: 10px;
    }
</style>
    