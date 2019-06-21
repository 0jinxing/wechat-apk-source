package com.tencent.mm.plugin.voip_cs.b.a;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class b$7$1
  implements Runnable
{
  b$7$1(b.7 param7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135324);
    String str = b.fQ(bo.fp(this.teu.tet.tee));
    b.l(this.teu.tet).setText(str);
    AppMethodBeat.o(135324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.a.b.7.1
 * JD-Core Version:    0.6.2
 */