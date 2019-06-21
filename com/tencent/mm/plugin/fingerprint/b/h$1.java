package com.tencent.mm.plugin.fingerprint.b;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fingerprint.c.e;
import com.tencent.mm.pluginsdk.wallet.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class h$1
  implements ak.a
{
  h$1(h paramh)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    boolean bool = true;
    AppMethodBeat.i(41481);
    if (1 == paramMessage.what)
    {
      String str = paramMessage.getData().getString("rsaKey");
      if (TextUtils.isEmpty(str))
      {
        ab.e("MicroMsg.HwFingerprintOpenDelegate", "handleMessage msg.what=" + paramMessage.what + " rsaKey is null");
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(41480);
            h.1.this.mrL.mrH.aC(-1, h.1.this.mrL.mrJ.getString(2131299873));
            AppMethodBeat.o(41480);
          }
        });
      }
      paramMessage = new e(str);
      this.mrL.mrJ.a(paramMessage, false, false);
      AppMethodBeat.o(41481);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(41481);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.h.1
 * JD-Core Version:    0.6.2
 */