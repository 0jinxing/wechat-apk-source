package com.tencent.mm.plugin.topstory.ui.home;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$10
  implements View.OnClickListener
{
  b$10(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1588);
    this.sCf.onBackBtnClick();
    AppMethodBeat.o(1588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.10
 * JD-Core Version:    0.6.2
 */