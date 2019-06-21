package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class HomeUI$6
  implements Runnable
{
  HomeUI$6(HomeUI paramHomeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29346);
    HomeUI.b(this.yjm).supportInvalidateOptionsMenu();
    AppMethodBeat.o(29346);
  }

  public final String toString()
  {
    AppMethodBeat.i(29347);
    String str = super.toString() + "|supportInvalidateOptionsMenu";
    AppMethodBeat.o(29347);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.6
 * JD-Core Version:    0.6.2
 */