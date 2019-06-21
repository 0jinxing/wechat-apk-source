package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$b$2
  implements View.OnClickListener
{
  f$b$2(f.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38084);
    this.rgs.rgr = ((f.b.a)paramView.getTag());
    int i = this.rgs.rgr.position;
    this.rgs.DM(i);
    AppMethodBeat.o(38084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.f.b.2
 * JD-Core Version:    0.6.2
 */