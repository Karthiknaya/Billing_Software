package in.karthik.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.karthik.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
