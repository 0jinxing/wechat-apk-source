package com.tencent.mm.plugin.voip.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;

public final class VoipBaseFragment$b
  implements Runnable
{
  public VoipBaseFragment$b(VoipBaseFragment paramVoipBaseFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4847);
    ab.i("MicroMsg.VoipBaseFragment", "try create blur bitmap,timestamp: " + System.currentTimeMillis());
    Bitmap localBitmap = d.LV(2130840641);
    ab.i("MicroMsg.VoipBaseFragment", "blur transparent ok, timestamp: " + System.currentTimeMillis());
    this.sWy.iGP.post(new VoipBaseFragment.b.1(this, localBitmap));
    AppMethodBeat.o(4847);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBaseFragment.b
 * JD-Core Version:    0.6.2
 */