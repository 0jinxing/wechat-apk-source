package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.blink.FirstScreenFrameLayout.a;
import com.tencent.mm.blink.a;
import com.tencent.mm.blink.b;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;

final class HomeUI$12
  implements FirstScreenFrameLayout.a
{
  HomeUI$12(HomeUI paramHomeUI)
  {
  }

  public final void Ia()
  {
    AppMethodBeat.i(29355);
    if (a.HM())
    {
      a.ig(6);
      a.HN();
      a.jD("First Screen");
      f.dMn().ny(500L).d(new HomeUI.12.1(this));
    }
    b.HQ().HU();
    AppMethodBeat.o(29355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.12
 * JD-Core Version:    0.6.2
 */