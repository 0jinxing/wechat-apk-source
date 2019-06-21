package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HomeUI$2
  implements View.OnClickListener
{
  HomeUI$2(HomeUI paramHomeUI, boolean paramBoolean)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29342);
    HomeUI.j(this.yjm).gP();
    if (this.yjn)
    {
      paramView = this.yjm;
      Boolean localBoolean = Boolean.TRUE;
      HomeUI.a(paramView, localBoolean, localBoolean);
      AppMethodBeat.o(29342);
    }
    while (true)
    {
      return;
      HomeUI.a(this.yjm, Boolean.TRUE, Boolean.FALSE);
      AppMethodBeat.o(29342);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.2
 * JD-Core Version:    0.6.2
 */