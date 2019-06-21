package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class w$2
  implements View.OnClickListener
{
  w$2(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(123768);
    if (paramView.isSelected())
    {
      w.aRf().o(this.jfZ);
      paramView.setSelected(false);
      AppMethodBeat.o(123768);
    }
    while (true)
    {
      return;
      w.aRf().p(this.jfZ);
      paramView.setSelected(true);
      AppMethodBeat.o(123768);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.w.2
 * JD-Core Version:    0.6.2
 */