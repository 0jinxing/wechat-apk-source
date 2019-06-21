package com.tencent.mm.plugin.fingerprint.b;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.hd;
import com.tencent.mm.g.a.hd.a;
import com.tencent.mm.g.a.hd.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.wallet_core.c.w;

public final class f extends c<hd>
  implements com.tencent.mm.ai.f
{
  private String czZ;
  private hd mrB;
  private int mrC;
  ak mrD;
  private boolean mru;

  public f()
  {
    AppMethodBeat.i(41473);
    this.mrC = 0;
    this.czZ = "";
    this.mru = false;
    this.mrD = new ak(Looper.getMainLooper());
    this.xxI = hd.class.getName().hashCode();
    AppMethodBeat.o(41473);
  }

  private boolean a(hd paramhd)
  {
    boolean bool = false;
    AppMethodBeat.i(41474);
    if (!g.RK())
    {
      ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "GenFingerPrintRsaKeyEventListener account is not ready");
      AppMethodBeat.o(41474);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "GenFingerPrintRsaKeyEventListener callback");
      this.mru = false;
      if ((paramhd instanceof hd))
      {
        if (!e.bxs())
        {
          ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "device is not support FingerPrintAuth");
          paramhd = new hd.b();
          paramhd.cxT = false;
          this.mrB.cBQ = paramhd;
          this.mru = true;
          bah();
          AppMethodBeat.o(41474);
          bool = true;
        }
        else
        {
          this.mrB = paramhd;
          g.RQ();
          g.RO().eJo.a(385, this);
          bool = this.mrB.cBP.cBR;
          this.mrC = this.mrB.cBP.cBS;
          this.czZ = this.mrB.cBP.cBT;
          int i;
          if (!bool)
          {
            String str = e.getUserId();
            paramhd = com.tencent.mm.compatible.e.q.LM();
            paramhd = FingerPrintAuth.getRsaKey(e.dQ(ah.getContext()), str, paramhd);
            if (!TextUtils.isEmpty(paramhd))
            {
              ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.getRsaKey() success!");
              paramhd = new com.tencent.mm.plugin.fingerprint.c.e(paramhd);
              g.RQ();
              g.RO().eJo.a(paramhd, 0);
              i = 0;
            }
          }
          while (true)
          {
            if (i != 0)
            {
              ab.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth begin asyc gen rsa key!");
              new q(new f.a(this, (byte)0)).aBU();
            }
            AppMethodBeat.o(41474);
            bool = true;
            break;
            ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.getRsaKey() return null");
            i = 1;
            continue;
            ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth should gen rsa key!");
            i = 1;
          }
        }
      }
      else
        AppMethodBeat.o(41474);
    }
  }

  private void bah()
  {
    AppMethodBeat.i(41476);
    ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "doCallback()");
    if (this.mrB.callback != null)
      this.mrB.callback.run();
    if (this.mru)
      this.mrB = null;
    AppMethodBeat.o(41476);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41475);
    hd.b localb;
    if ((paramm instanceof com.tencent.mm.plugin.fingerprint.c.e))
    {
      localb = new hd.b();
      localb.cxT = false;
      ab.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label271;
      ab.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is success");
      paramm = (com.tencent.mm.plugin.fingerprint.c.e)paramm;
      paramString = paramm.mrK;
      String str1 = paramm.cBV;
      String str2 = e.getUserId();
      String str3 = com.tencent.mm.compatible.e.q.LM();
      paramm = w.dNR();
      if (TextUtils.isEmpty(FingerPrintAuth.genOpenFPEncrypt(e.dQ(ah.getContext()), str2, str3, String.valueOf(this.mrC), paramm, "", paramString, str1, Build.MODEL)))
        break label260;
      ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt success!");
      localb.cxT = true;
      paramString = FingerPrintAuth.genPayFPEncrypt(e.dQ(ah.getContext()), str2, str3, String.valueOf(this.mrC), paramm, this.czZ, Build.MODEL);
      paramm = FingerPrintAuth.genOpenFPSign(e.dQ(ah.getContext()), e.getUserId(), com.tencent.mm.compatible.e.q.LM(), paramString);
      localb.cBU = paramString;
      localb.cBV = paramm;
    }
    while (true)
    {
      g.RQ();
      g.RO().eJo.b(385, this);
      this.mrB.cBQ = localb;
      this.mru = true;
      bah();
      AppMethodBeat.o(41475);
      return;
      label260: ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt failed!");
      break;
      label271: ab.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is fail");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.f
 * JD-Core Version:    0.6.2
 */