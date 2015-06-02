package hello;

import tubular.GridDataRequest;
import tubular.GridDataResponse;

public interface DataService {

    public GridDataResponse getResponse(GridDataRequest request, Class<?> setClass);
}