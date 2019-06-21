package com.tencent.mm.plugin.facedetectlight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

final class b$8
  implements Runnable
{
  b$8(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(768);
    b localb = this.mdJ;
    ah.getContext();
    b.a(localb, p.n(b.x(this.mdJ), b.y(this.mdJ)));
    al.d(new b.8.1(this));
    AppMethodBeat.o(768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.8
 * JD-Core Version:    0.6.2
 */