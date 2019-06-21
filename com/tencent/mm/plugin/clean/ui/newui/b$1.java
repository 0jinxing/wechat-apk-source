package com.tencent.mm.plugin.clean.ui.newui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18847);
    b.a(this.kyI, this.sN);
    this.kyI.notifyDataSetChanged();
    AppMethodBeat.o(18847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.b.1
 * JD-Core Version:    0.6.2
 */