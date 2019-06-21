package com.tencent.mm.plugin.profile;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.f;

final class a$5
  implements ao.b.a
{
  a$5(a parama, f paramf)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23207);
    ab.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", new Object[] { paramString, this.pkl.ejD, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      aw.ZK();
      paramString = c.XM().aoO(paramString).Oi();
      a.a(this.iFR, this.pkl.jiE, this.pkl.pkj, paramString);
    }
    AppMethodBeat.o(23207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.5
 * JD-Core Version:    0.6.2
 */