<template lang="">
    <div>
        <!-- <v-select style="width:100px"
            @change="click()"
            label="category"
            :items="['cook', 'main', 'side']">
          </v-select> -->
      <select  name="카테고리" class="select" @change="selectCategory($event)">
      <option 
      v-for ="(item, index) in selectList" 
      :key="index"
      :value="item.value">
      {{ item.name }}
        </option>   
    </select> 
    </div>
</template>
<script>

import { mapActions, mapState } from 'vuex';
const productModule = 'productModule'

export default {
    data(){
    return{
      //category: "",
      selectList:[
        {name: "카테고리", value: "all"},
        {name: "cook1", value: "cook1"},
        {name: "cook2", value: "20"},
        {name: "cook3", value: "30"},
      ]
    }
  },
  methods:{
    async selectCategory(event){
      this.category = await event.target.value
      console.log(this.category)
      await this.requestProductCategoryToSpring(this.category)
    },
    ...mapActions(
        productModule, ['requestProductCategoryToSpring']
    )
  },
  mounted(){
    this.requestProductCategoryToSpring(this.category)
  }

  }

</script>
<style>
.select {
  width: 150px;
  height: 35px;
  background-size: 20px;
  padding: 5px 30px 5px 10px;
  border-radius: 4px;
  outline: 0 none;
}
/* .select option {
  background: black;
  color: #fff;
  padding: 3px 0;
}     */
</style>