package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VolumeMeter$2
  implements Runnable
{
  VolumeMeter$2(VolumeMeter paramVolumeMeter)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113578);
    VolumeMeter.a(this.nOx, new ak());
    this.nOx.bKh();
    AppMethodBeat.o(113578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.VolumeMeter.2
 * JD-Core Version:    0.6.2
 */