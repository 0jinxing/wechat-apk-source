package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class v$a$1
  implements View.OnClickListener
{
  v$a$1(v.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38274);
    if (paramView.getTag() == null)
      AppMethodBeat.o(38274);
    while (true)
    {
      return;
      int i = ((Integer)paramView.getTag()).intValue();
      this.rjz.DO(i);
      AppMethodBeat.o(38274);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.v.a.1
 * JD-Core Version:    0.6.2
 */