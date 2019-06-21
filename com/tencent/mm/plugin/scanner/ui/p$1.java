package com.tencent.mm.plugin.scanner.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.platformtools.ab;

final class p$1
  implements e.a
{
  p$1(p paramp)
  {
  }

  public final void o(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(81200);
    ab.i("MicroMsg.scanner.ScanModeQRCode", "notify Event: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(81200);
      while (true)
      {
        return;
        this.qfp.qff = false;
        AppMethodBeat.o(81200);
        continue;
        this.qfp.jZ(true);
        AppMethodBeat.o(81200);
        continue;
        this.qfp.jZ(true);
        AppMethodBeat.o(81200);
        continue;
        this.qfp.qet.chi();
        AppMethodBeat.o(81200);
      }
      if (paramBundle != null)
      {
        paramBundle = paramBundle.getString("geta8key_fullurl");
        if ((paramBundle != null) && ((paramBundle.startsWith("http://login.weixin.qq.com")) || (paramBundle.startsWith("https://login.weixin.qq.com"))))
          this.qfp.cvH = 2;
      }
      this.qfp.qet.kj(true);
      this.qfp.qff = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.1
 * JD-Core Version:    0.6.2
 */