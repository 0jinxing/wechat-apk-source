package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41393);
    ab.d("MicroMsg.WalletFaceIdDialog", "click dismiss btn");
    paramView = b.a(this.mrk);
    ab.i("MicroMsg.WalletFaceIdDialog", "click left btn");
    if (paramView.mrp)
      paramView.vJ(-1);
    while (true)
    {
      this.mrk.dismiss();
      AppMethodBeat.o(41393);
      return;
      paramView.bwO();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b.1
 * JD-Core Version:    0.6.2
 */