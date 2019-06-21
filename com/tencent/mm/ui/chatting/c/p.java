package com.tencent.mm.ui.chatting.c;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.ChatFooterCustom;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.c.b.l;
import com.tencent.mm.ui.chatting.c.b.n;
import com.tencent.mm.ui.chatting.c.b.z;

@com.tencent.mm.ui.chatting.c.a.a(dFp=n.class)
public class p extends a
  implements n
{
  private long[] yJa = null;
  private boolean yPE = false;
  private com.tencent.mm.ui.chatting.o yPF = null;

  public final boolean dDW()
  {
    return this.yPE;
  }

  public final void dxx()
  {
    AppMethodBeat.i(31404);
    this.yPE = this.cgL.yTx.getBooleanExtra("expose_edit_mode", false).booleanValue();
    this.yJa = this.cgL.yTx.getArguments().getLongArray("expose_selected_ids");
    AppMethodBeat.o(31404);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31405);
    if ((this.yPE) && (this.yPF == null))
      this.yPF = new com.tencent.mm.ui.chatting.o(this.cgL, this.yJa);
    AppMethodBeat.o(31405);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31406);
    super.dxz();
    if (this.yPF != null)
    {
      com.tencent.mm.ui.chatting.o localo = this.yPF;
      h localh = (h)localo.cgL.aF(h.class);
      ((z)localo.cgL.aF(z.class)).dEP();
      localh.dCW();
      localh.dCR();
      if (localo.yJa != null)
      {
        localObject = localo.yJa;
        int i = localObject.length;
        for (int j = 0; j < i; j++)
          localh.nf(localObject[j]);
      }
      Object localObject = ((com.tencent.mm.ui.chatting.c.b.o)localo.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dDX();
      if (localObject != null)
        ((ChatFooter)localObject).setVisibility(8);
      localObject = ((com.tencent.mm.ui.chatting.c.b.o)localo.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class)).dDY();
      if (localObject != null)
        ((ChatFooterCustom)localObject).setVisibility(8);
      ((l)localo.cgL.aF(l.class)).dDV();
      localo.cgL.aqX();
      ((aj)localo.cgL.aF(aj.class)).dFn();
      localo.cgL.qv(true);
    }
    AppMethodBeat.o(31406);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.p
 * JD-Core Version:    0.6.2
 */