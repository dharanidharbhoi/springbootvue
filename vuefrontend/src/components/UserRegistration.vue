<template>
  <div>
    <b-table striped hover :items="items" :fields="fields" ></b-table>
  </div>
</template>

<script>
import api from '../Api'

  export default {
    data() {
      return {
        fields: ['id', 'userName', 'firstName','lastName'],
        items11: []
      }
    },
    computed :{
      items (){
         return this.$store.state.item;
      }
    },
       mounted: function(){
      api.getUser().then(response => {
        this.$store.state.item= response.data;
      })
    }
  }
</script>