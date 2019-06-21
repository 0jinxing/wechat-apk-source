package com.tencent.mm.plugin.appbrand.widget.i;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class a$12
  implements Runnable
{
  a$12(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87541);
    for (int i = 0; i < this.jpi.jpa.size(); i++)
      this.jpi.a(this.jpi.joV.getChildAt(i), (a.a)this.jpi.jpa.get(i));
    AppMethodBeat.o(87541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.a.12
 * JD-Core Version:    0.6.2
 */