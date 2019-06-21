package com.tencent.mm.plugin.account.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;

final class MobileLoginOrForceReg$13
  implements Runnable
{
  MobileLoginOrForceReg$13(MobileLoginOrForceReg paramMobileLoginOrForceReg, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125213);
    Object localObject = null;
    try
    {
      Bitmap localBitmap = d.decodeStream(b.p(this.val$url, 10000, 20000));
      localObject = localBitmap;
      MobileLoginOrForceReg.b(this.gEv).sendMessage(MobileLoginOrForceReg.b(this.gEv).obtainMessage(0, localObject));
      AppMethodBeat.o(125213);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicorMsg.MobileLoginOrForceReg", "download avatar failed");
        ab.printErrStackTrace("MicorMsg.MobileLoginOrForceReg", localException, "", new Object[0]);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(125214);
    String str = super.toString() + "|loadBitmap";
    AppMethodBeat.o(125214);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.13
 * JD-Core Version:    0.6.2
 */