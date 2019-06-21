package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.x.a.a;

final class MoreTabUI$1
  implements a.a
{
  MoreTabUI$1(MoreTabUI paramMoreTabUI)
  {
  }

  public final void b(ac.a parama)
  {
    AppMethodBeat.i(29689);
    if (parama == ac.a.xKd)
      MoreTabUI.e(this.yoD);
    while (true)
    {
      MoreTabUI.f(this.yoD).notifyDataSetChanged();
      AppMethodBeat.o(29689);
      return;
      if (parama == ac.a.xKe)
        MoreTabUI.e(this.yoD);
      else if ((parama == ac.a.xSJ) || (parama == ac.a.xUi))
        MoreTabUI.d(this.yoD);
      else if (parama == ac.a.xUP)
        MoreTabUI.a(this.yoD);
    }
  }

  public final void p(int paramInt, String paramString)
  {
    AppMethodBeat.i(29688);
    if ((paramInt == 262145) || (paramInt == 266260) || (paramInt == 262157) || (paramInt == 266267) || (paramInt == 262158))
    {
      MoreTabUI.a(this.yoD);
      MoreTabUI.b(this.yoD);
    }
    while (true)
    {
      MoreTabUI.f(this.yoD).notifyDataSetChanged();
      AppMethodBeat.o(29688);
      return;
      if (paramInt == 262147)
        MoreTabUI.c(this.yoD);
      else if (paramInt == 262156)
        MoreTabUI.d(this.yoD);
      else if (paramInt == 262152)
        MoreTabUI.e(this.yoD);
      else if (paramInt == 352279)
        MoreTabUI.a(this.yoD, paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.1
 * JD-Core Version:    0.6.2
 */