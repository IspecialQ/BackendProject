package api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEmptyItemsResult {
    private ArrayList aisles;
    private Long cost;
    private Long startDate;
    private Long endDate;
}
