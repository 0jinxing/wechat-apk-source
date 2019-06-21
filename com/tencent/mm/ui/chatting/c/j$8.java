package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.u;
import com.tencent.mm.ui.tools.o.b;

final class j$8
  implements o.b
{
  String mLR = null;

  j$8(j paramj)
  {
  }

  public final void apo()
  {
    AppMethodBeat.i(31333);
    ab.v("MicroMsg.ChattingMoreBtnBarHelper", "onQuitSearch");
    com.tencent.mm.ui.chatting.c.b.h localh = (com.tencent.mm.ui.chatting.c.b.h)this.yOP.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
    if (localh.isInEditMode())
    {
      ((z)this.yOP.cgL.aF(z.class)).dEP();
      j.b(this.yOP).setVisibility(0);
      j.b(this.yOP).On(localh.cdf());
    }
    AppMethodBeat.o(31333);
  }

  public final void app()
  {
    AppMethodBeat.i(31334);
    ab.v("MicroMsg.ChattingMoreBtnBarHelper", "onEnterSearch");
    com.tencent.mm.plugin.report.service.h.pYm.a(219L, 21L, 1L, true);
    if (((com.tencent.mm.ui.chatting.c.b.h)this.yOP.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).isInEditMode())
    {
      ((z)this.yOP.cgL.aF(z.class)).dEO();
      j.b(this.yOP).setVisibility(8);
    }
    AppMethodBeat.o(31334);
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(31332);
    ab.v("MicroMsg.ChattingMoreBtnBarHelper", "on edit change");
    Object localObject = (z)this.yOP.cgL.aF(z.class);
    if (bo.isNullOrNil(paramString))
      if (((z)localObject).dEW())
      {
        if (((z)localObject).dER() != null)
          ((z)localObject).dER().vM("");
        ((z)localObject).OD(-1);
      }
    while (true)
    {
      this.mLR = paramString;
      AppMethodBeat.o(31332);
      return;
      if (j.g(this.yOP))
      {
        if (this.mLR != null)
        {
          ((z)localObject).dEP();
          j.b(this.yOP).setVisibility(0);
          localObject = (com.tencent.mm.ui.chatting.c.b.h)this.yOP.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
          j.b(this.yOP).On(((com.tencent.mm.ui.chatting.c.b.h)localObject).cdf());
        }
      }
      else
      {
        ((z)localObject).dEP();
        j.b(this.yOP).setVisibility(8);
        continue;
        ab.v("MicroMsg.ChattingMoreBtnBarHelper", "enter search mode");
        j.b(this.yOP).setVisibility(8);
        ((z)localObject).dEO();
        if (((z)localObject).dER() != null)
          ((z)localObject).dER().vM(paramString);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.8
 * JD-Core Version:    0.6.2
 */