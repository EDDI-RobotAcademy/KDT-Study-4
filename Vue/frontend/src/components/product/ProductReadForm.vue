<template>
  <div>
    <table>
        <table>
            <thead>
                <tr>
                    <td>상품번호:</td>
                    <td>
                        <input type="text" :value="product.productId" readonly/>
                    </td>
                    <td>상품이름:</td>
                    <td>
                        <input type="text" :value="product.productName" readonly/>
                    </td>
                    <td>가격:</td>
                    <td>
                        <input type="text" :value="product.productPrice" readonly/>
                    </td>
                </tr>
            </thead>
        </table>
        <table>   
            <tbody>
                <tr>
                    <td>상품정보</td>
                    <td>
                        <div style="margin-top: 10px;"></div>
                        <textarea cols="80" rows="10" :value="product.productDetails" readonly/>
                    </td>
                </tr>
            </tbody>
        </table> 
        <table>
            <tfoot>
                <tr>
                    <td>제조사:</td>
                    <td>
                        <input type="text" :value="product.manufacturer" readonly/>
                    </td>
                    <td>제조일자:</td>
                    <td>
                        <input type="text" :value="product.mfgDate" readonly/>
                    </td>
                    <td>유통기한:</td>
                    <td>
                        <input type="text" :value="product.expDate" readonly/>
                    </td>
                </tr>
                <tr>    
                    <td>카테고리:</td>
                    <td>
                        <input type="text" :value="product.categoryName" readonly/>
                    </td>
                    <td>등록일자:</td>
                    <td>
                        <input type="text" :value="product.createDate" readonly/>
                    </td>
                </tr>
            </tfoot>
        </table>
    </table>
  </div>
</template>

<script>
export default {
    name: "ProductReadForm",
    props: {
        product: {
            type: Object,
            required: true,
        }
    }

}
</script>
   
<style>
     /* input {
        border: 1px solid black;
    } */
    table {
        border-collapse: collapse;
    }
    /* tbody {
        display: block;
        overflow: auto;
        height: 100px;
    } */
    td, tr {
        padding: 5px;
    }
</style>