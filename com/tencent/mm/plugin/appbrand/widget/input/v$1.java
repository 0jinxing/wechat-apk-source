package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class v$1
  implements View.OnClickListener
{
  v$1(v paramv)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(123741);
    v.a(this.jfC);
    this.jfC.setVisibility(8);
    AppMethodBeat.o(123741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.v.1
 * JD-Core Version:    0.6.2
 */