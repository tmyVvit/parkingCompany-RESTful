### 1.创建ParkingBoy


```java
//path: /ParkingBoys
//Request:{ pbID : int,
//          name : String }
//Response: { pbID : int,
//            name : String}
         @PostMapping(path="")
         @ResponseBody
         public ParkingBoy addParkingBoy(@RequestBody ParkingBoy parkingBoy){
             return parkingBoyService.addParkingBoys(parkingBoy);
         }

```






### 2.创建ParkingLot



### 3.绑定ParkingBoy与ParkingLot
