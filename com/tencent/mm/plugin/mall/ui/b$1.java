package com.tencent.mm.plugin.mall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43135);
    paramView = this.olG;
    if (!b.a(this.olG));
    for (boolean bool = true; ; bool = false)
    {
      b.a(paramView, bool);
      b.b(this.olG);
      this.olG.notifyDataSetChanged();
      AppMethodBeat.o(43135);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.b.1
 * JD-Core Version:    0.6.2
 */