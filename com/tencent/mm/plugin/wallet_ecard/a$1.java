package com.tencent.mm.plugin.wallet_ecard;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cr;
import com.tencent.mm.g.a.cr.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$1 extends c<cr>
{
  a$1(a parama)
  {
    AppMethodBeat.i(48039);
    this.xxI = cr.class.getName().hashCode();
    AppMethodBeat.o(48039);
  }

  private boolean a(cr paramcr)
  {
    AppMethodBeat.i(48040);
    cr.a locala = paramcr.cvM;
    Object localObject1 = new HashMap();
    if (!bo.isNullOrNil(locala.packageExt))
    {
      localObject2 = locala.packageExt.split("&");
      if ((localObject2 != null) && (localObject2.length > 0))
        for (int i = 0; i < localObject2.length; i++)
          if (!bo.isNullOrNil(localObject2[i]))
          {
            String[] arrayOfString = localObject2[i].split("=");
            if ((arrayOfString.length == 2) && (!bo.isNullOrNil(arrayOfString[0])))
              ((HashMap)localObject1).put(arrayOfString[0], arrayOfString[1]);
          }
    }
    Object localObject2 = (String)((HashMap)localObject1).get("extradata");
    ab.i("MicroMsg.SubCoreECard", "start openECard, extraData: %s, packageExt: %s", new Object[] { localObject2, localObject1 });
    localObject1 = new com.tencent.mm.plugin.wallet_core.c.a(locala.appId, locala.cvO, locala.nonceStr, locala.packageExt, locala.signType, locala.signature, locala.cvP, 15, "openECard", locala.cvS);
    g.RQ();
    g.RO().eJo.a(580, new a.1.1(this, locala, paramcr, (String)localObject2));
    g.RQ();
    g.RO().eJo.a((m)localObject1, 0);
    AppMethodBeat.o(48040);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.1
 * JD-Core Version:    0.6.2
 */