### 1.创建ParkingBoy

```java
//path: /ParkingBoys
//Request:{ pbID : int,
//          name : String }
//Response: { pbID : int,
//            name : String}

//  ParkingBoyController
     @PostMapping(path="")
     @ResponseBody
     public ParkingBoy addParkingBoy(@RequestBody ParkingBoy parkingBoy){
         return parkingBoyService.addParkingBoys(parkingBoy);
     }
```

### 2.创建ParkingLot

```java
// path: /ParkingLots
// Request: { plID : int,
//            size : int,
//            pbID : int }
// Response: { plID : int,
//            size : int,
//            pbID : int }

// ParkingLotController
    @PostMapping(path="")
    @ResponseBody
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkinglot){
        return parkingLotService.addParkingLot(parkingLot);
  }
```

### 3.绑定ParkingBoy与ParkingLot

```java
// path: /parkingBoys/{pbID}/parkingLots
// request : {pbID : int}
// response: {plID : int,
//            size : int, 
//            pbID : int}

// ParkingBoyController
    @PostMapping(path="/{pbID}/parkingLots")
    @ResponseBody
    public ParkingLot addParkingLotToParkingBoyById(@PathVariable int pbID, @RequestBody ParkingLot parkingLot){
          return parkingBoyService.addParkingLotToParkingBoyById(pbID, parkingLot.getplID());
    }
```
