import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

  export  const store = new Vuex.Store({
  state: {
      content : 'This content is coming from the store and updated',
      topic : [],
      items: []
  },
  getters : {
      getContent: state => state.content
  },
  mutations: {},
  actions : {}  
})