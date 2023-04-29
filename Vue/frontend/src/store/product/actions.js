import {
    REQUEST_PRODUCT_LIST_TO_SPRING,
    REQUEST_PRODUCT_TO_SPRING
} from './mutation-types'

import axiosInst from '@/utility/axiosInst'

export default {
    requestProductCategoryToSpring({commit}, categoryId){
        return axiosInst.get(`/jpa-product/${categoryId}`)
            .then((res)=>{
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data)
                console.log(res.data)
            })
    },
    
    requestCreateProductToSpring({}, payload){
        const { Name, Manufacturer, ManufacturedDate,
             ExpirationDate1, ExpirationDate2, CategoryName ,
             Price } = payload

             return axiosInst.post('/product-register-page',{ Name, Manufacturer,
                 ManufacturedDate,ExpirationDate1, ExpirationDate2, CategoryName ,
                Price })
                .then((res)=> {alert('게시물 등록 성공!')
                    return res
                })
                .catch(() => {
                    alert('문제 발생!')
                })
      },
}