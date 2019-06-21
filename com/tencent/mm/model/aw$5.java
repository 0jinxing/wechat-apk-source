package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.a;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.p;

final class aw$5
  implements be.a
{
  aw$5(aw paramaw)
  {
  }

  public final void a(ak paramak, be parambe)
  {
    AppMethodBeat.i(16280);
    if (paramak == null)
      AppMethodBeat.o(16280);
    while (true)
    {
      return;
      if ((ad.aou(paramak.field_username)) || (ad.aow(paramak.field_username)) || (ad.mR(paramak.field_username)) || (t.mZ(paramak.field_username)) || (ad.aox(paramak.field_username)))
        break;
      AppMethodBeat.o(16280);
    }
    if (ad.mR(paramak.field_username))
    {
      paramak = parambe.aoZ("floatbottle");
      if (paramak != null)
        break label482;
      paramak = new ak("floatbottle");
    }
    label337: label482: for (int i = 1; ; i = 0)
    {
      paramak.hN(1);
      paramak.hM(l.Yv());
      aw.ZK();
      bi localbi = c.XO().Rd(" and not ( type = 10000 and isSend != 2 ) ");
      if ((localbi != null) && (localbi.field_msgId > 0L))
      {
        paramak.ap(localbi);
        paramak.setContent(ad.aoC(localbi.field_talker) + ":" + localbi.field_content);
        paramak.jg(Integer.toString(localbi.getType()));
        be.b localb = parambe.Cb();
        if (localb != null)
        {
          PString localPString1 = new PString();
          PString localPString2 = new PString();
          PInt localPInt = new PInt();
          localbi.ju("floatbottle");
          localbi.setContent(paramak.field_content);
          localb.a(localbi, localPString1, localPString2, localPInt, false);
          paramak.jh(localPString1.value);
          paramak.ji(localPString2.value);
          paramak.hP(localPInt.value);
        }
      }
      while (true)
      {
        if (i == 0)
          break label337;
        parambe.d(paramak);
        AppMethodBeat.o(16280);
        break;
        paramak.dsI();
      }
      parambe.a(paramak, paramak.field_username);
      AppMethodBeat.o(16280);
      break;
      if ((ad.aou(paramak.field_username)) || (ad.aow(paramak.field_username)))
      {
        AppMethodBeat.o(16280);
        break;
      }
      g.K(o.class);
      p.b(paramak, parambe);
      if ("@blacklist".equals(paramak.field_parentRef))
      {
        aw.ZK();
        parambe = c.XM().aoO(paramak.field_username);
        if ((parambe != null) && (!bo.isNullOrNil(parambe.field_username)) && (!parambe.Oa()))
        {
          aw.ZK();
          c.XR().c(new String[] { paramak.field_username }, "");
        }
      }
      AppMethodBeat.o(16280);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.aw.5
 * JD-Core Version:    0.6.2
 */