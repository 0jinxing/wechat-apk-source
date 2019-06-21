package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.f;

final class HomeUI$3
  implements View.OnLongClickListener
{
  HomeUI$3(HomeUI paramHomeUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(29343);
    if ((b.dnO()) || (f.IS_FLAVOR_RED) || (f.IS_FLAVOR_PURPLE))
      HomeUI.k(this.yjm);
    AppMethodBeat.o(29343);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.3
 * JD-Core Version:    0.6.2
 */