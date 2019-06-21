package com.tencent.mm.plugin.ipcall.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.c;

final class b$1$1
  implements Runnable
{
  b$1$1(b.1 param1, c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21967);
    if ((this.nAm != null) && (this.nAm.xDa != -1L))
    {
      this.nAn.nAl.goa.setText(this.nAm.field_systemAddressBookUsername);
      AppMethodBeat.o(21967);
    }
    while (true)
    {
      return;
      this.nAn.nAl.goa.setText("");
      AppMethodBeat.o(21967);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.b.1.1
 * JD-Core Version:    0.6.2
 */