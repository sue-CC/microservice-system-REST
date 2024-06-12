package com.ewolff.microservice.order.grpc;


import catalog.CatalogServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CatalogService extends CatalogServiceGrpc.CatalogServiceImplBase {

}
