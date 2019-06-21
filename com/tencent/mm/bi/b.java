package com.tencent.mm.bi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.e;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;

public final class b extends e
{
  public final bi a(cm paramcm, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(16617);
    paramString2 = aa.a(paramcm.vED);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      ab.e("MicroMsg.FMessageExtension", "possible friend msg : content is null");
      AppMethodBeat.o(16617);
    }
    while (true)
    {
      return null;
      paramString2 = bi.a.apC(paramString2);
      if (((paramString2.xZi != null) || (paramString2.xZj != null)) && ((paramString2.scene == 10) || (paramString2.scene == 11)))
      {
        paramString3 = new fz();
        paramString3.cAe.cAg = paramString2.xZi;
        paramString3.cAe.cAh = paramString2.xZj;
        com.tencent.mm.sdk.b.a.xxA.m(paramString3);
        if (paramString3.cAf.cAi)
        {
          ab.v("MicroMsg.FMessageExtension", "possible mobile friend is not in local address book");
          AppMethodBeat.o(16617);
        }
      }
      else
      {
        if (paramString2.pnz > 0L)
          com.tencent.mm.ah.b.d(paramString2.pnz, paramString2.xZh);
        if (bo.nullAsNil(paramString2.svN).length() > 0)
        {
          paramString3 = new h();
          paramString3.username = paramString2.svN;
          paramString3.dtR = 3;
          paramString3.cB(true);
          paramString3.bJt = -1;
          paramString3.frW = paramString2.xZk;
          paramString3.frV = paramString2.xZl;
          paramString3.bJt = -1;
          ab.d("MicroMsg.FMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { paramString2.svN, paramString3.ack(), paramString3.acl() });
          o.act().b(paramString3);
        }
        paramString3 = new ax();
        paramString3.field_createTime = c.q(paramString1, paramcm.pcX);
        paramString3.field_isSend = 0;
        paramString3.field_msgContent = aa.a(paramcm.vED);
        paramString3.field_svrId = paramcm.ptF;
        paramString3.field_talker = paramString2.svN;
        paramString3.field_type = 0;
        paramcm = d.akP().apu(paramString3.field_talker);
        if (paramcm != null)
        {
          ab.d("MicroMsg.FMessageExtension", "getByEncryptTalker success. encryptTalker = " + paramString3.field_talker + " , real talker = " + paramcm.field_talker);
          paramString3.field_encryptTalker = paramString3.field_talker;
          paramString3.field_talker = paramcm.field_talker;
        }
        com.tencent.mm.model.aw.ZK();
        paramcm = com.tencent.mm.model.c.XM().aoO(paramString3.field_talker);
        if ((paramcm != null) && (com.tencent.mm.n.a.jh(paramcm.field_type)) && (paramcm.ewQ > 0L))
        {
          ab.d("MicroMsg.FMessageExtension", "The biz contact whose talker is " + paramString3.field_talker + " has already been in user's contact list");
          AppMethodBeat.o(16617);
        }
        else
        {
          d.akO().b(paramString3);
          AppMethodBeat.o(16617);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bi.b
 * JD-Core Version:    0.6.2
 */