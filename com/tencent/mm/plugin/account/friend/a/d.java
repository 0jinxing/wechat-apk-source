package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.e;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;

public final class d extends e
{
  public final bi a(cm paramcm, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(108326);
    Object localObject = aa.a(paramcm.vED);
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      ab.e("MicroMsg.CardMsgExtension", "possible friend msg : content is null");
      paramcm = null;
      AppMethodBeat.o(108326);
    }
    while (true)
    {
      return paramcm;
      localObject = bi.a.apC((String)localObject);
      if (paramcm.nao == 66)
        ((b)g.K(b.class)).vh(((bi.a)localObject).xZo);
      if (bo.nullAsNil(((bi.a)localObject).svN).length() > 0)
      {
        h localh = new h();
        localh.username = ((bi.a)localObject).svN;
        localh.dtR = 3;
        localh.cB(true);
        localh.frW = ((bi.a)localObject).xZk;
        localh.frV = ((bi.a)localObject).xZl;
        localh.bJt = -1;
        ab.d("MicroMsg.CardMsgExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { ((bi.a)localObject).svN, localh.ack(), localh.acl() });
        o.act().b(localh);
      }
      paramcm = super.a(paramcm, paramString1, paramString2, paramString3);
      AppMethodBeat.o(108326);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.d
 * JD-Core Version:    0.6.2
 */