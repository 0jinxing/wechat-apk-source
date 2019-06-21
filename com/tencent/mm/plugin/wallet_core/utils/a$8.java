package com.tencent.mm.plugin.wallet_core.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a$8
  implements com.tencent.mm.vending.c.a<Object, Object>
{
  public a$8(a parama, List paramList, Map paramMap, a.a parama1)
  {
  }

  public final Object call(Object paramObject)
  {
    AppMethodBeat.i(47991);
    Iterator localIterator = this.tpo.iterator();
    while (localIterator.hasNext())
    {
      paramObject = (Bankcard)localIterator.next();
      e locale = b.acM(paramObject.field_bankcardType);
      this.tOY.put(paramObject.field_bankcardType, locale);
    }
    if (this.tOZ != null)
      this.tOZ.am(this.tOY);
    paramObject = zXH;
    AppMethodBeat.o(47991);
    return paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.8
 * JD-Core Version:    0.6.2
 */