<template lang="">
    <div>
        <!-- <v-select style="width:100px"
            @change="click()"
            label="category"
            :items="['cook', 'main', 'side']">
          </v-select> -->
      <select  @change="selectCategory($event)">
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
      category: "0",
      selectList:[
        {name: "카테고리", value: "0"},
        {name: "cook1", value: "10"},
        {name: "cook2", value: "20"},
        {name: "cook3", value: "30"},
      ]
    }
  },
  methods:{
    selectCategory(event){
      this.category = event.target.value
      console.log(this.category)
      this.requestProductCategoryToSpring(this.category)
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
<style lang="">
    
</style>