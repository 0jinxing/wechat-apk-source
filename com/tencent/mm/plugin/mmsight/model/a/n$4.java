package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;

final class n$4
  implements f.a
{
  n$4(n paramn)
  {
  }

  public final void bPP()
  {
    AppMethodBeat.i(76632);
    d.post(new n.6(this.owL), "MMSightMediaCodecMP4MuxRecorder_stop");
    AppMethodBeat.o(76632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.n.4
 * JD-Core Version:    0.6.2
 */