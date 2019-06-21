package com.tencent.mm.pluginsdk;

import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class f$1
  implements Runnable
{
  f$1(MMActivity paramMMActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105824);
    this.icV.getWindow().getDecorView().setSystemUiVisibility(this.icV.getWindow().getDecorView().getSystemUiVisibility() | 0x100);
    int i = com.tencent.mm.compatible.util.a.bG(this.icV);
    ab.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to bodyView, height: %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.bz.a.fromDPToPix(this.icV, 2)) });
    this.icV.mController.ylv.setPadding(0, i - com.tencent.mm.bz.a.fromDPToPix(this.icV, 2), 0, 0);
    AppMethodBeat.o(105824);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.1
 * JD-Core Version:    0.6.2
 */