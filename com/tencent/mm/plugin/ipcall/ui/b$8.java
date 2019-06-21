package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class b$8
  implements View.OnClickListener
{
  b$8(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21978);
    this.nAl.nzT.setCursorVisible(true);
    this.nAl.crP.aqX();
    this.nAl.nAi = true;
    AppMethodBeat.o(21978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.8
 * JD-Core Version:    0.6.2
 */