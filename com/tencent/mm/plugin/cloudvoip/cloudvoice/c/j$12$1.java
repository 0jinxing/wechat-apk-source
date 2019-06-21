package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$12$1
  implements Runnable
{
  j$12$1(j.12 param12, int paramInt1, int paramInt2, k paramk, boolean paramBoolean, String paramString)
  {
  }

  @SuppressLint({"DefaultLocale"})
  public final void run()
  {
    AppMethodBeat.i(135529);
    if (!j.a(this.kAW.kAJ))
    {
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not joining room! abort");
      AppMethodBeat.o(135529);
    }
    while (true)
    {
      return;
      if ((this.crc == 0) && (this.crd == 0) && (this.kAU != null) && (this.kAU.isValid()))
      {
        if (!j.b(this.kAW.kAJ))
        {
          int i = j.a(this.kAW.kAJ, this.kAU.kBq);
          if (i != 0)
          {
            j.a(this.kAW.kAJ, this.kAW.kAR, -10086, -3, "init failed: ".concat(String.valueOf(i)));
            AppMethodBeat.o(135529);
          }
          else
          {
            h localh = h.kzJ;
            ab.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: start listen to network change");
            h.tD(0);
          }
        }
        else
        {
          while (true)
          {
            j.c(this.kAW.kAJ);
            j.a(this.kAW.kAJ, this.kAW.kAB, this.kAW.kAC, this.kAW.kAE, this.kAW.kAD, this.kAW.kAR);
            AppMethodBeat.o(135529);
            break;
            if (this.kAV)
            {
              ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: already initialized, but the former ");
              g.HX(this.kAU.kBq);
            }
          }
        }
      }
      else
      {
        j.a(this.kAW.kAJ, this.kAW.kAR, -10088, -8, String.format("get session key failed. errType: %d, errCode: %d errMsg: %s", new Object[] { Integer.valueOf(this.crc), Integer.valueOf(this.crd), this.ftO }));
        AppMethodBeat.o(135529);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.12.1
 * JD-Core Version:    0.6.2
 */