package com.tencent.mm.ui;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

final class HomeUI$17
  implements View.OnClickListener
{
  HomeUI$17(HomeUI paramHomeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29363);
    if (SystemClock.elapsedRealtime() - HomeUI.v(this.yjm) < 300L)
    {
      paramView = HomeUI.w(this.yjm).iterator();
      while (paramView.hasNext())
        ((Runnable)paramView.next()).run();
    }
    HomeUI.b(this.yjm, SystemClock.elapsedRealtime());
    AppMethodBeat.o(29363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.17
 * JD-Core Version:    0.6.2
 */