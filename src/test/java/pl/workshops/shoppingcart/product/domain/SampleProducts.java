package pl.workshops.shoppingcart.product.domain;

import pl.workshops.shoppingcart.product.dto.BrandTypeDto;
import pl.workshops.shoppingcart.product.dto.ProductDto;
import pl.workshops.shoppingcart.product.dto.SizeDto;

import java.math.BigDecimal;

public class SampleProducts {
    public static final ProductDto ADIDAS_SHOE_TO_ADD = ProductDto.shoe("ADIDAS GAZELLE", new BigDecimal(399), 10, BrandTypeDto.ADIDAS, SizeDto.A);
    public static final ProductDto NIKE_SHOE_TO_ADD = ProductDto.shoe("NIKE FLYKNIT RACER", new BigDecimal(300), 10, BrandTypeDto.NIKE, SizeDto.B);

    public static ProductDto productWithPrice(BigDecimal price) {
        return ProductDto.shoe("ADIDAS GAZELLE", price, 10, BrandTypeDto.ADIDAS, SizeDto.A);
    }

    public static ProductDto productWithQuantity(int quantity) {
        return ProductDto.shoe("ADIDAS GAZELLE", new BigDecimal(399), quantity, BrandTypeDto.ADIDAS, SizeDto.A);
    }
}
