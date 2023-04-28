import {
    REQUEST_PRODUCT_LIST_TO_SPRING,
    REQUEST_PRODUCT_TO_SPRING
} from './mutation-types'

import axiosInst from '@/utility/axiosInst'

export default {
    requestProductToSpring ({ commit }, productId) {
        console.log(", productId: " + productId)

        return axiosInst.get(`/jpa-product/${productId}`)
            .then((res) => {
                commit(REQUEST_PRODUCT_TO_SPRING, res.data)
            })
    },
    requestDeleteProductSpring ({}, productId) {
        return axiosInst.delete(`/jpa-product/${productId}`)
            .then((res) => {
                alert('삭제 완료')
            })
            .catch(() => {
                alert('문제 발생')
            })
    },
}