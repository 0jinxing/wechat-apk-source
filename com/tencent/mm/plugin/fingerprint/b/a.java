package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.a;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public abstract class a
  implements l
{
  public final void a(lv paramlv, int paramInt, String paramString)
  {
    ab.i("MicroMsg.BaseFingerprintImp", "hy: onOpenFingerprintAuthFailed");
    if ((paramlv != null) && (paramlv.cHD.cHH != null))
    {
      paramlv.cHE = new lv.b();
      paramlv.cHE.errCode = paramInt;
      paramlv.cHE.cBU = "";
      paramlv.cHE.cBV = "";
      paramlv.cHE.aIm = paramString;
      paramlv.cHE.cHJ = type();
      paramlv.cHD.cHH.run();
    }
  }

  public final void bxd()
  {
    ab.i("MicroMsg.BaseFingerprintImp", "showFingerPrintEntrance");
    if ((e.bxG()) && (!bxo()))
      ab.e("MicroMsg.BaseFingerprintImp", "the fingerprint is open ready, but system has none Finger print ids!");
    while (true)
    {
      return;
      if ((bxh()) && (!bxB()))
        ab.e("MicroMsg.BaseFingerprintImp", "the faceid is open ready, but system has none face ids!");
      else if (q.etg.etr != 1)
        ab.e("MicroMsg.BaseFingerprintImp", "hy: device info not support");
    }
  }

  public final boolean bxe()
  {
    return e.bxG();
  }

  public boolean bxf()
  {
    return false;
  }

  public boolean bxg()
  {
    return false;
  }

  public final boolean bxh()
  {
    return ((Boolean)g.RP().Ry().get(ac.a.xVF, Boolean.FALSE)).booleanValue();
  }

  public String bxi()
  {
    return "";
  }

  public final void hq(boolean paramBoolean)
  {
    ab.i("MicroMsg.BaseFingerprintImp", "hy: set isOpenFp: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    e.hs(paramBoolean);
  }

  public final void hr(boolean paramBoolean)
  {
    ab.i("MicroMsg.BaseFingerprintImp", "set is open faceid: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    g.RP().Ry().set(ac.a.xVF, Boolean.valueOf(paramBoolean));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.a
 * JD-Core Version:    0.6.2
 */