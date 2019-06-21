package com.tencent.mm.ui.appbrand;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29958);
    if (this.yrv.yrt != null)
      this.yrv.yrt.dzn();
    this.yrv.vot.dismiss();
    AppMethodBeat.o(29958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.c.1
 * JD-Core Version:    0.6.2
 */