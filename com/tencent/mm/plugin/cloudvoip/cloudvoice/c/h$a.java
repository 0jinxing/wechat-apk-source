package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$a
  implements i<Bundle, Bundle>
{
  private static String kzL;
  private static final n kzM;

  static
  {
    AppMethodBeat.i(135502);
    kzM = new h.a.1();
    AppMethodBeat.o(135502);
  }

  private static Bundle s(Bundle paramBundle)
  {
    AppMethodBeat.i(135500);
    int i = paramBundle.getInt("opcode", -1);
    paramBundle = paramBundle.getString("from_process", "");
    kzL = paramBundle;
    if ((bo.isNullOrNil(paramBundle)) || (!kzL.startsWith("com.tencent.mm")))
    {
      ab.e("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: invalid package name %s", new Object[] { kzL });
      AppMethodBeat.o(135500);
      return null;
    }
    if (i == 0)
      g.RO().a(kzM);
    while (true)
    {
      AppMethodBeat.o(135500);
      break;
      if (i == 1)
        g.RO().b(kzM);
      else
        ab.w("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: not valid op code");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.h.a
 * JD-Core Version:    0.6.2
 */