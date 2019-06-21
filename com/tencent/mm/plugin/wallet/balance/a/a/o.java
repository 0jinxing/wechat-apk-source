package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bla;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.wallet_core.c.y;
import com.tencent.mm.wallet_core.c.y.a;
import java.io.IOException;
import junit.framework.Assert;

public final class o extends com.tencent.mm.wallet_core.c.a<bla, h>
{
  private bla cME()
  {
    AppMethodBeat.i(45244);
    Object localObject1;
    if (((h)this.fsz).scene == 2)
    {
      AppMethodBeat.o(45244);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      Object localObject3 = ((com.tencent.mm.plugin.wxpay.a.a)g.M(com.tencent.mm.plugin.wxpay.a.a.class)).getWalletCacheStg();
      localObject1 = ac.a.xUB;
      if (localObject1 == null)
        localObject1 = "";
      Object localObject4;
      while (true)
      {
        localObject1 = (String)localObject1;
        if (!bo.isNullOrNil((String)localObject1))
          break label203;
        AppMethodBeat.o(45244);
        localObject1 = null;
        break;
        String str = ((ac.a)localObject1).name();
        if (bo.isNullOrNil(str))
        {
          localObject1 = "";
        }
        else
        {
          String[] arrayOfString = str.split("_");
          localObject1 = arrayOfString[(arrayOfString.length - 1)];
          localObject4 = localObject1;
          if (((String)localObject1).equals("SYNC"))
            localObject4 = arrayOfString[(arrayOfString.length - 2)];
          localObject1 = str.substring(0, str.lastIndexOf((String)localObject4) + ((String)localObject4).length());
          Assert.assertNotNull("db is null", ((y)localObject3).fni);
          localObject3 = ((y)localObject3).AfU.get(localObject1);
          if (localObject3 != null)
          {
            localObject1 = localObject3;
            if (localObject3 != y.xIt);
          }
          else
          {
            localObject1 = "";
          }
          if (!y.a((String)localObject4, localObject1, false))
            localObject1 = "";
        }
      }
      label203: localObject1 = ((String)localObject1).getBytes(org.apache.commons.a.a.ISO_8859_1);
      try
      {
        localObject4 = new com/tencent/mm/protocal/protobuf/bla;
        ((bla)localObject4).<init>();
        localObject1 = (bla)((bla)localObject4).parseFrom((byte[])localObject1);
        AppMethodBeat.o(45244);
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", localIOException, "", new Object[0]);
        AppMethodBeat.o(45244);
        Object localObject2 = null;
      }
    }
  }

  public final void e(a.a<bla> parama)
  {
    AppMethodBeat.i(45243);
    ab.i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errCode), Integer.valueOf(parama.errType) });
    if (((h)this.fsz).scene == 2)
      AppMethodBeat.o(45243);
    while (true)
    {
      return;
      if ((parama.errType == 0) && (parama.errCode == 0) && (((bla)parama.fsy).kdT == 0))
        try
        {
          parama = ((bla)parama.fsy).toByteArray();
          String str = new java/lang/String;
          str.<init>(parama, org.apache.commons.a.a.ISO_8859_1);
          ((com.tencent.mm.plugin.wxpay.a.a)g.M(com.tencent.mm.plugin.wxpay.a.a.class)).getWalletCacheStg().set(ac.a.xUB, str);
          AppMethodBeat.o(45243);
        }
        catch (IOException parama)
        {
          ab.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", parama, "", new Object[0]);
        }
      else
        AppMethodBeat.o(45243);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.o
 * JD-Core Version:    0.6.2
 */