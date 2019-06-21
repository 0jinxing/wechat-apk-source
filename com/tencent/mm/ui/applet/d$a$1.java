package com.tencent.mm.ui.applet;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.d.b;

final class d$a$1
  implements d.b
{
  d$a$1(d.a parama)
  {
  }

  public final void dvX()
  {
    AppMethodBeat.i(29980);
    this.yse.hJ(this.yse.context);
    Toast.makeText(this.yse.context, "trace file has saved ", 0).show();
    AppMethodBeat.o(29980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.d.a.1
 * JD-Core Version:    0.6.2
 */