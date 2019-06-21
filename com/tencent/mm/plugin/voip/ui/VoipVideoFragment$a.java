package com.tencent.mm.plugin.voip.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class VoipVideoFragment$a
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(4898);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "try load blur bitmap");
    Bitmap localBitmap = VoipVideoFragment.I(this.sYn);
    this.sYn.iGP.post(new VoipVideoFragment.a.1(this, localBitmap));
    AppMethodBeat.o(4898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment.a
 * JD-Core Version:    0.6.2
 */