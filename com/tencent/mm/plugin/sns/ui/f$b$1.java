package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$b$1
  implements View.OnClickListener
{
  f$b$1(f.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38083);
    this.rgs.rgr = ((f.b.a)paramView.getTag());
    int i = this.rgs.rgr.position;
    this.rgs.DM(i);
    AppMethodBeat.o(38083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.f.b.1
 * JD-Core Version:    0.6.2
 */