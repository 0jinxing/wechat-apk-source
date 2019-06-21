package com.tencent.mm.plugin.recharge.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static MallRechargeProduct cL(List<MallRechargeProduct> paramList)
  {
    AppMethodBeat.i(44246);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)localIterator.next();
      if ((localMallRechargeProduct.isDefault) && (localMallRechargeProduct.isValid()))
      {
        ab.d("MicroMsg.MallRechargeLogic", "find the defaultProduct");
        AppMethodBeat.o(44246);
        paramList = localMallRechargeProduct;
      }
    }
    while (true)
    {
      return paramList;
      ab.d("MicroMsg.MallRechargeLogic", "products.get(0)");
      paramList = (MallRechargeProduct)paramList.get(0);
      AppMethodBeat.o(44246);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.a
 * JD-Core Version:    0.6.2
 */