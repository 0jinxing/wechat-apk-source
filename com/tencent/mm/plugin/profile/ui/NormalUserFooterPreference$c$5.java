package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.applet.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;

final class NormalUserFooterPreference$c$5
  implements ao.b.a
{
  NormalUserFooterPreference$c$5(NormalUserFooterPreference.c paramc, a parama, String paramString, LinkedList paramLinkedList)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23703);
    aw.ZK();
    paramString = c.XM().aoO(NormalUserFooterPreference.a(this.ppa.poR).field_username);
    if (paramString != null);
    for (paramString = bo.bc(paramString.dus, ""); ; paramString = "")
    {
      this.pkt.ajw(paramString);
      this.pkt.c(NormalUserFooterPreference.a(this.ppa.poR).field_username, this.pku, this.pkv);
      AppMethodBeat.o(23703);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.c.5
 * JD-Core Version:    0.6.2
 */