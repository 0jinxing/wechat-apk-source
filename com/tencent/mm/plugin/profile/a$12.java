package com.tencent.mm.plugin.profile;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.f;

final class a$12
  implements a.a
{
  a$12(a parama, ad paramad, int paramInt)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(23217);
    ad localad;
    int i;
    if (paramBoolean1)
    {
      paramString1 = this.pkl;
      localad = this.emj;
      i = this.pkq;
      if ((int)localad.ewQ == 0)
      {
        com.tencent.mm.model.aw.ZK();
        c.XM().aa(localad);
        com.tencent.mm.model.aw.ZK();
        c.XM().aoO(localad.field_username);
      }
      if ((int)localad.ewQ <= 0)
      {
        ab.e("MicroMsg.NewContactWidgetNormal", "addContact : insert contact failed");
        AppMethodBeat.o(23217);
      }
    }
    while (true)
    {
      return;
      h localh;
      String str;
      if ((!com.tencent.mm.n.a.jh(localad.field_type)) && (i == 15))
      {
        paramString2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(localad.field_username);
        if ((paramString2 != null) && (!bo.isNullOrNil(localad.dur)))
        {
          localh = h.pYm;
          str = localad.field_username;
          if (!bo.isNullOrNil(paramString2.Aq()))
            break label249;
          i = 0;
          label165: if (localad.dur.toString().split(",").length < 5)
            break label255;
        }
      }
      label249: label255: for (int j = 5; ; j = localad.dur.toString().split(",").length)
      {
        localh.e(12040, new Object[] { str, Integer.valueOf(3), Integer.valueOf(i), Integer.valueOf(j) });
        t.q(localad);
        paramString1.iFE.notifyDataSetChanged();
        AppMethodBeat.o(23217);
        break;
        i = 1;
        break label165;
      }
      if (paramBoolean2)
      {
        d.akP().ep(paramString1, 2);
        AppMethodBeat.o(23217);
      }
      else
      {
        ab.e("MicroMsg.NewContactWidgetNormal", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = ".concat(String.valueOf(paramString1)));
        AppMethodBeat.o(23217);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.12
 * JD-Core Version:    0.6.2
 */