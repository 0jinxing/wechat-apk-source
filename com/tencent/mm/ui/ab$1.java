package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ab$1
  implements View.OnClickListener
{
  ab$1(ab paramab)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112459);
    if (ab.a(this.ypW) != null)
      ab.a(this.ypW).onClickBackBtn(paramView);
    AppMethodBeat.o(112459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ab.1
 * JD-Core Version:    0.6.2
 */