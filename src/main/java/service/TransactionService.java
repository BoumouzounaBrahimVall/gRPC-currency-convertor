package service;

import gen.Transaction;
import gen.transactionserviceGrpc;
import io.grpc.stub.StreamObserver;

public class TransactionService extends transactionserviceGrpc.transactionserviceImplBase{
    @Override
    public void convert(Transaction.convertcurrencyrequest request, StreamObserver<Transaction.convertcurrencyresponse> responseObserver) {
        String currencyForm=request.getCurencyfrom();
        String currencyTo=request.getCurencyto();
        double amount = request.getAmount();
        System.out.println(currencyForm+" to: "+currencyTo+" amt:"+amount);
        Transaction.convertcurrencyresponse response=Transaction.convertcurrencyresponse.newBuilder()
                .setCurencyfrom(currencyForm)
                .setCurencyto(currencyTo)
                .setAmount(amount)
                .setResult(amount*11)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
