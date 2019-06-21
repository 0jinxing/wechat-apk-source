package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.a.d.a.a;
import com.tencent.mm.aj.a.d.a.b;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.d.a;

final class c$9
  implements d.a
{
  c$9(c paramc)
  {
  }

  public final void a(d.a.b paramb)
  {
    AppMethodBeat.i(31200);
    if ((this.yOi.mgP) && (paramb != null) && (paramb.fxq == this.yOi.dDz()))
      if (!this.yOi.cgL.caA)
      {
        ab.i("MicroMsg.ChattingUI.BizComponent", "onNotifyChange fragment not foreground, return");
        AppMethodBeat.o(31200);
      }
    while (true)
    {
      return;
      if (paramb.fxA != d.a.a.fxx)
      {
        ab.i("MicroMsg.ChattingUI.BizComponent", "bizChatExtension bizChat change");
        paramb = z.aeT().aK(this.yOi.dDz());
        this.yOi.yDI = paramb;
        if (!this.yOi.yNZ)
        {
          paramb = z.aeV().cH(this.yOi.yDI.field_bizChatServId);
          if (paramb != null)
            this.yOi.pmx = paramb;
        }
        while (true)
        {
          ((r)this.yOi.cgL.aF(r.class)).dEm();
          AppMethodBeat.o(31200);
          break;
          c.a(this.yOi, e.c(this.yOi.yDI));
          ((r)this.yOi.cgL.aF(r.class)).dEp();
        }
      }
      if (this.yOi.yNZ)
      {
        Toast.makeText(ah.getContext(), this.yOi.cgL.yTx.getMMResources().getString(2131302541), 1).show();
        this.yOi.cgL.yTx.dBP();
      }
      AppMethodBeat.o(31200);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.9
 * JD-Core Version:    0.6.2
 */