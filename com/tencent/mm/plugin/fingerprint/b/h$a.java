package com.tencent.mm.plugin.fingerprint.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class h$a
  implements q.a
{
  private h$a(h paramh)
  {
  }

  public final void AR(String paramString)
  {
    AppMethodBeat.i(41484);
    if (TextUtils.isEmpty(paramString))
    {
      al.d(new h.a.1(this));
      ab.e("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback rsaKey is empty!");
      AppMethodBeat.o(41484);
    }
    while (true)
    {
      return;
      al.d(new h.a.2(this, paramString));
      AppMethodBeat.o(41484);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.h.a
 * JD-Core Version:    0.6.2
 */