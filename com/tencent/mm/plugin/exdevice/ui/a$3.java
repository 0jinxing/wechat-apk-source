package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3
  implements View.OnClickListener
{
  a$3(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20004);
    if (a.c(this.lBA) != null)
    {
      paramView = a.c(this.lBA);
      a.a(this.lBA);
      paramView.bpR();
    }
    AppMethodBeat.o(20004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.a.3
 * JD-Core Version:    0.6.2
 */