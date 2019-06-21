package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class HomeUI$8
  implements Runnable
{
  HomeUI$8(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29349);
    HomeUI.b(this.yjm).supportInvalidateOptionsMenu();
    AppMethodBeat.o(29349);
  }

  public final String toString()
  {
    AppMethodBeat.i(29350);
    String str = super.toString() + "|supportInvalidateOptionsMenu";
    AppMethodBeat.o(29350);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.8
 * JD-Core Version:    0.6.2
 */