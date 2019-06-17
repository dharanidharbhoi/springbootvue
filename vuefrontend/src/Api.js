import axios from 'axios'  
  
const SERVER_URL = 'http://localhost:8080';  
  
const instance = axios.create({  
  baseURL: SERVER_URL,  
  timeout: 1000  
}); 

export default {
    getTopics : () => instance.get('topics',{
        transformResponse : [function(data){
            return data;
        }]
    }),
    getUser : () => instance.get('user',{
        transformResponse : [function(data){
            return data;
        }]
    }),
};