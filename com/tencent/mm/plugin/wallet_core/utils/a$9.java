package com.tencent.mm.plugin.wallet_core.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.f;
import java.util.LinkedList;
import java.util.List;

public final class a$9
  implements com.tencent.mm.vending.c.a<Object, List<Bankcard>>
{
  public a$9(a parama)
  {
  }

  private Object dW(List<Bankcard> paramList)
  {
    AppMethodBeat.i(47993);
    if ((paramList != null) && (paramList.size() > 0))
    {
      int i = paramList.size();
      this.tOT.tOS = new LinkedList();
      int j = 0;
      Object localObject;
      if (j < i)
      {
        localObject = (Bankcard)paramList.get(j);
        if (((Bankcard)localObject).cPc())
          ab.i("MicroMsg.BankcardLogoHelper", "ignore balance!!");
        while (true)
        {
          j++;
          break;
          this.tOT.tOS.add(((Bankcard)localObject).field_bankcardType);
        }
      }
      if (this.tOT.tOS.size() > 0)
      {
        ab.i("MicroMsg.BankcardLogoHelper", "need fetch bank logo, %s", new Object[] { Integer.valueOf(this.tOT.tOS.size()) });
        paramList = f.dMj();
        localObject = new c(this.tOT.tOS);
        g.RQ();
        g.RO().eJo.a(1650, new a.9.1(this, paramList));
        g.RQ();
        g.RO().eJo.a((m)localObject, 0);
        paramList.dMi();
      }
    }
    paramList = zXH;
    AppMethodBeat.o(47993);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.9
 * JD-Core Version:    0.6.2
 */