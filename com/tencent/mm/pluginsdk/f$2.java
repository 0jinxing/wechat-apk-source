package com.tencent.mm.pluginsdk;

import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragmentActivity;

final class f$2
  implements Runnable
{
  f$2(MMFragmentActivity paramMMFragmentActivity, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105825);
    this.vat.getWindow().getDecorView().setSystemUiVisibility(this.vat.getWindow().getDecorView().getSystemUiVisibility() | 0x100);
    int i = a.bG(this.vat);
    ab.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", new Object[] { Integer.valueOf(i) });
    if (this.vau != null)
      this.vau.setPadding(0, i, 0, 0);
    AppMethodBeat.o(105825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.2
 * JD-Core Version:    0.6.2
 */