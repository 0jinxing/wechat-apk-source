package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$1
  implements View.OnClickListener
{
  m$1(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54327);
    a locala = (a)paramView.getTag();
    if (locala == null)
      AppMethodBeat.o(54327);
    while (true)
    {
      return;
      locala.a(paramView, locala);
      AppMethodBeat.o(54327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.m.1
 * JD-Core Version:    0.6.2
 */