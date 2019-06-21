package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CollectMainUI$20
  implements Runnable
{
  CollectMainUI$20(CollectMainUI paramCollectMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41279);
    int[] arrayOfInt = new int[2];
    CollectMainUI.j(this.kHl).getLocationInWindow(arrayOfInt);
    CollectMainUI.tJ(arrayOfInt[1]);
    AppMethodBeat.o(41279);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.20
 * JD-Core Version:    0.6.2
 */