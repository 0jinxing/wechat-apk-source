package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41394);
    ab.d("MicroMsg.WalletFaceIdDialog", "click right btn");
    paramView = b.a(this.mrk);
    ab.i("MicroMsg.WalletFaceIdDialog", "click right btn");
    b localb = paramView.mrl;
    localb.mrf.setEnabled(false);
    localb.kGq.setText(2131299554);
    paramView.bxc();
    AppMethodBeat.o(41394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b.2
 * JD-Core Version:    0.6.2
 */