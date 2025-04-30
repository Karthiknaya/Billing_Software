package in.karthik.billingsoftware.service;

import in.karthik.billingsoftware.io.OrderRequest;
import in.karthik.billingsoftware.io.OrderResponse;
import in.karthik.billingsoftware.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
