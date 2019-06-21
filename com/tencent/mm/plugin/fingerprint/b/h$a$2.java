package com.tencent.mm.plugin.fingerprint.b;

import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class h$a$2
  implements Runnable
{
  h$a$2(h.a parama, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41483);
    ab.i("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback running");
    Message localMessage = this.mrN.mrL.mrD.obtainMessage();
    localMessage.what = 1;
    Bundle localBundle = new Bundle();
    localBundle.putString("rsaKey", this.mrF);
    localMessage.setData(localBundle);
    localMessage.sendToTarget();
    AppMethodBeat.o(41483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.h.a.2
 * JD-Core Version:    0.6.2
 */