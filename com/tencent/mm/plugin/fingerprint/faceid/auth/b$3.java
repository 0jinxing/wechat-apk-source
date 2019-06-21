package com.tencent.mm.plugin.fingerprint.faceid.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements FrameAnimatorImageView.a
{
  b$3(b paramb)
  {
  }

  public final void onStop()
  {
    AppMethodBeat.i(41395);
    ab.d("MicroMsg.WalletFaceIdDialog", "trigger load finish");
    b.b(this.mrk).a(2130838734, null);
    AppMethodBeat.o(41395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b.3
 * JD-Core Version:    0.6.2
 */