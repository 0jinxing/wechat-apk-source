package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$5
  implements View.OnLongClickListener
{
  b$5(b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(21975);
    if (this.nAl.nAf)
    {
      this.nAl.nAa = "+";
      this.nAl.nzS.setText(this.nAl.nAa);
    }
    while (true)
    {
      AppMethodBeat.o(21975);
      return true;
      this.nAl.goa.setText("");
      this.nAl.nAb = "";
      this.nAl.cq("", -1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.5
 * JD-Core Version:    0.6.2
 */