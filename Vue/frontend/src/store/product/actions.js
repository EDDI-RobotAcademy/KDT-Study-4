import {
    REQUEST_PRODUCT_LIST_TO_SPRING,
    REQUEST_PRODUCT_TO_SPRING
} from './mutation-types'

import axiosInst from '@/utility/axiosInst'

export default {
    requestProductCategoryToSpring({commit}, CategoryId){
        return axiosInst.get('/jpa-product/CategoryId', CategoryId)
            .then((res)=>{
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data)
            })

    }
}