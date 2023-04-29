import {
    REQUEST_PRODUCT_LIST_TO_SPRING,
    REQUEST_PRODUCT_TO_SPRING
} from './mutation-types'

import axiosInst from '@/utility/axiosInst'

export default {
    requestProductCategoryToSpring({commit},categoryId){
        return axiosInst.get(`/jpa-product/${categoryId}`)
            .then((res)=>{
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data)
                console.log(res.data)
            })

    }
}