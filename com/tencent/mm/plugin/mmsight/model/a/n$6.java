package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class n$6
  implements Runnable
{
  n$6(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76635);
    boolean bool = this.owL.bPW();
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stopImpl result: %s", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      if (this.owL.fde == null)
        break label99;
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "call stopCallback");
      al.d(this.owL.fde);
      AppMethodBeat.o(76635);
    }
    while (true)
    {
      return;
      SightVideoJNI.releaseBigSightDataBufferLock(this.owL.eTa);
      if (this.owL.fdd != null)
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(76634);
            n.6.this.owL.fdd.asv();
            AppMethodBeat.o(76634);
          }
        });
      label99: AppMethodBeat.o(76635);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.n.6
 * JD-Core Version:    0.6.2
 */