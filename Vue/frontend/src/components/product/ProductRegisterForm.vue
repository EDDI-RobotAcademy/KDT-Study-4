<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>상품명</td>
                    <td>
                        <input type="text" v-model="Name"/>
                    </td>
                </tr>            
                <tr>
                    <td>제조사</td>
                    <td>
                        <input type="text" v-model="Manufacturer">
                    </td>
                </tr>
                <tr>
                    <td>제조일자</td>
                    <td>
                        <input type="text" v-model="ManufacturedDate">
                    </td>
                </tr>
                <tr>
                    <td>유통기한</td>
                    <td>
                        <input style="width:150px; height:30px;" type="text" ExpirationDate1> ~
                        <input style="width:150px; height:30px;" type="text" ExpirationDate2>
                    </td>                 
                </tr>
                <tr>
                    <td>카테고리</td>
                    <td>
                        <input type="text" v-model="CategoryName">
                    </td>
                </tr>
                <tr>
                    <td>상품 가격</td>
                    <td>
                        <input type="text"v-model="Price">
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
            Name:'',
            Manufacturer:'',
            ManufacturedDate:'',
            ExpirationDate1:'',
            ExpirationDate2:'',
            CategoryName:'',
            Price:'',
       
        }
    },
    methods: {
        onSubmit () {
            const { Name, Manufacturer, ManufacturedDate, 
                ExpirationDate1, ExpirationDate2, CategoryName ,
                Price } = this            
            this.$emit('submit', { Name, Manufacturer, ManufacturedDate,
                 ExpirationDate1, ExpirationDate2, CategoryName ,Price })
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