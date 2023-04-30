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
    
    requestProductListToSpring ({ commit }) {
        return axiosInst.get('/jpa-product/list')
            .then((res) => {
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data)
            })
    },

    requestProductCategoryToSpring({commit}, categoryId){
        return axiosInst.get(`/jpa-product/${categoryId}`)
            .then((res)=>{
                commit(REQUEST_PRODUCT_LIST_TO_SPRING, res.data)
                console.log(res.data)
            })
    },
    
    requestCreateProductToSpring({}, payload){
        const { productName, manufacturer, mfgDate,
            expDate, categoryId ,
            productPrice, productDetails } = payload

             return axiosInst.post('/jpa-product/register',{ productName, manufacturer,
                mfgDate ,expDate, categoryId ,
                productPrice, productDetails })
                .then((res)=> {alert('게시물 등록 성공!')
                    return res
                })
                .catch(() => {
                    alert('문제 발생!')
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

    requestProductModifyToSpring ({}, payload) {
        const { productId, productName, productPrice, mfgDate, expDate, productDetails } = payload

        return axiosInst.put(`/jpa-product/${productId}`, 
        { productName, productPrice, mfgDate, expDate, productDetails })
            .then((res) => {
                alert("수정 성공!")
            })
            .catch(() => {
                alert('문제 발생!')
            })
    },
}