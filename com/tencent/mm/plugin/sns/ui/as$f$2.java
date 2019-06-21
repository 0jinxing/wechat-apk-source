package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class as$f$2
  implements View.OnClickListener
{
  as$f$2(as.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39212);
    if (paramView.getTag() == null)
      AppMethodBeat.o(39212);
    while (true)
    {
      return;
      this.rwn.rwm = ((as.f.a)paramView.getTag());
      int i = this.rwn.rwm.cNE;
      int j = this.rwn.rwm.position;
      this.rwn.fw(i, j + 1);
      AppMethodBeat.o(39212);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.f.2
 * JD-Core Version:    0.6.2
 */