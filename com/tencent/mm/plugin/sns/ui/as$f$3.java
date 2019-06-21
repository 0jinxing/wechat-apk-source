package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class as$f$3
  implements View.OnClickListener
{
  as$f$3(as.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39213);
    if (paramView.getTag() == null)
      AppMethodBeat.o(39213);
    while (true)
    {
      return;
      this.rwn.rwm = ((as.f.a)paramView.getTag());
      int i = this.rwn.rwm.cNE;
      int j = this.rwn.rwm.position;
      this.rwn.fw(i, j + 2);
      AppMethodBeat.o(39213);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.f.3
 * JD-Core Version:    0.6.2
 */