package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.b;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;

final class n$1
  implements f
{
  n$1(n paramn)
  {
  }

  public final boolean O(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(76629);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preview callback data is null");
      AppMethodBeat.o(76629);
    }
    while (true)
    {
      return bool;
      if ((this.owL.fcQ.oxa == d.c.ovB) || (this.owL.fcQ.oxa == d.c.ovC))
      {
        if (this.owL.fcQ.oxa == d.c.ovC)
        {
          this.owL.fcQ.oxa = d.c.ovD;
          ab.v("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "forward one more frame");
        }
        this.owL.fcX.jl(1L);
        if (this.owL.fcJ != null)
          this.owL.fcJ.bPM();
        this.owL.aZ(paramArrayOfByte);
        bool = true;
        AppMethodBeat.o(76629);
      }
      else
      {
        AppMethodBeat.o(76629);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.n.1
 * JD-Core Version:    0.6.2
 */