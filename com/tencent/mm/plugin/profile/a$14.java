package com.tencent.mm.plugin.profile;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;

final class a$14
  implements ao.b.a
{
  a$14(a parama, ad paramad, com.tencent.mm.pluginsdk.ui.applet.a parama1, String paramString, LinkedList paramLinkedList)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23219);
    aw.ZK();
    paramString = c.XM().aoO(this.emj.field_username);
    if (paramString != null);
    for (paramString = bo.bc(paramString.dus, ""); ; paramString = "")
    {
      this.pkt.ajw(paramString);
      this.pkt.c(this.emj.field_username, this.pku, this.pkv);
      AppMethodBeat.o(23219);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.14
 * JD-Core Version:    0.6.2
 */