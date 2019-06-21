package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$4
  implements View.OnClickListener
{
  r$4(r paramr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38238);
    if (r.c(this.riS) != null)
      r.c(this.riS).cry();
    AppMethodBeat.o(38238);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.r.4
 * JD-Core Version:    0.6.2
 */