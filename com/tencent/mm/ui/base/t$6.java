package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$6
  implements View.OnClickListener
{
  t$6(o paramo, View.OnClickListener paramOnClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106876);
    this.yxX.dismiss();
    if (this.yya != null)
      this.yya.onClick(paramView);
    AppMethodBeat.o(106876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t.6
 * JD-Core Version:    0.6.2
 */