package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.g;
import com.tencent.mm.api.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$1
  implements g
{
  b$1(b paramb)
  {
  }

  public final void onExit()
  {
    AppMethodBeat.i(55135);
    ab.i("MicroMsg.MMSightVideoEditor", "photoEditor onExit");
    this.oBV.release();
    if (b.a(this.oBV) != null)
      al.d(new b.1.2(this));
    AppMethodBeat.o(55135);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(55134);
    ab.i("MicroMsg.MMSightVideoEditor", "photoEditor onFinish");
    b.h(this.oBV).a(new b.1.1(this));
    AppMethodBeat.o(55134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.1
 * JD-Core Version:    0.6.2
 */