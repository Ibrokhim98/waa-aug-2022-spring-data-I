package edu.miu.lab3.joincolumn_bidir.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private int id;
    private int productId;
    private int userId;
}
