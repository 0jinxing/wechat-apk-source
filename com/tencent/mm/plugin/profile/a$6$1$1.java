package com.tencent.mm.plugin.profile;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class a$6$1$1
  implements ao.b.a
{
  a$6$1$1(a.6.1 param1, String paramString)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23208);
    ab.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", new Object[] { paramString, this.pkp.pkn.pkl.ejD, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      aw.ZK();
      paramString = c.XM().aoO(paramString).Oi();
      a.a(this.pkp.pkn.pkl.iFE, this.pkp.pkn.pkl.jiE, this.pko, paramString);
    }
    AppMethodBeat.o(23208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.6.1.1
 * JD-Core Version:    0.6.2
 */