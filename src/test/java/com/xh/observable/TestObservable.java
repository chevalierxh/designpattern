package com.xh.observable;

import org.junit.Test;

public class TestObservable {

    @Test
    public void testObservable(){
        ProductList observable = ProductList.getInstance();
        JingDongObserver jingDongObserver = new JingDongObserver();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);
        observable.addProduct("新增产品1");
    }
}
