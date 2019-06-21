package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.h;

final class HomeUI$4
  implements View.OnClickListener
{
  HomeUI$4(HomeUI paramHomeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29344);
    paramView = h.scu;
    h.cAJ().cZX = System.currentTimeMillis();
    HomeUI.l(this.yjm);
    AppMethodBeat.o(29344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.4
 * JD-Core Version:    0.6.2
 */