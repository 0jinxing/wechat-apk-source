package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.aa;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.a;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.plugin.soter.e.b;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.pluginsdk.wallet.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.c.w;
import java.util.Map;

public final class d extends a
{
  private com.a.a.a mrv;
  private d.a mrw;
  private com.tencent.mm.pluginsdk.wallet.c mrx;

  public d()
  {
    AppMethodBeat.i(41442);
    this.mrv = null;
    this.mrw = new d.a(this, (byte)0);
    this.mrx = null;
    AppMethodBeat.o(41442);
  }

  public static void bxq()
  {
    AppMethodBeat.i(41448);
    ab.i("MicroMsg.FingerPrintMgrImpl", "initRsaKey");
    if (!e.bxs())
    {
      ab.e("MicroMsg.FingerPrintMgrImpl", "device is not support");
      AppMethodBeat.o(41448);
    }
    while (true)
    {
      return;
      if ((r.cPI().cQi()) || (r.cPI().cQh()))
      {
        ab.e("MicroMsg.FingerPrintMgrImpl", "user had not reg wxpay or is isSimpleReg");
        AppMethodBeat.o(41448);
      }
      else
      {
        try
        {
          String str1 = e.getUserId();
          ab.i("MicroMsg.FingerPrintMgrImpl", "initRsaKey userId:".concat(String.valueOf(str1)));
          String str2 = q.LM();
          str1 = FingerPrintAuth.getRsaKey(e.dQ(ah.getContext()), str1, str2);
          str2 = str1;
          if (TextUtils.isEmpty(str1))
          {
            ab.e("MicroMsg.FingerPrintMgrImpl", "FingerPrintAuth.getRsaKey() is null");
            str2 = FingerPrintAuth.genRsaKey(e.dQ(ah.getContext()), e.getUserId(), q.LM());
          }
          if (TextUtils.isEmpty(str2))
          {
            ab.e("MicroMsg.FingerPrintMgrImpl", "FingerPrintAuth.genRsaKey() return null");
            AppMethodBeat.o(41448);
          }
        }
        catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
        {
          ab.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localUnsatisfiedLinkError.getMessage());
          AppMethodBeat.o(41448);
          continue;
          ab.e("MicroMsg.FingerPrintMgrImpl", "initRsaKey success!");
          AppMethodBeat.o(41448);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
          ab.e("MicroMsg.FingerPrintMgrImpl", "can not LoadLibrary fingerprintauth.so e:=" + localException.getMessage());
          AppMethodBeat.o(41448);
        }
      }
    }
  }

  private int[] vO()
  {
    AppMethodBeat.i(41445);
    int[] arrayOfInt;
    if (this.mrv != null)
    {
      arrayOfInt = this.mrv.vO();
      AppMethodBeat.o(41445);
    }
    while (true)
    {
      return arrayOfInt;
      ab.i("MicroMsg.FingerPrintMgrImpl", "getIds auth == null");
      arrayOfInt = null;
      AppMethodBeat.o(41445);
    }
  }

  public final int a(com.tencent.mm.pluginsdk.wallet.c paramc)
  {
    return 0;
  }

  public final int a(com.tencent.mm.pluginsdk.wallet.c paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(41451);
    if (this.mrv == null)
      this.mrv = com.a.a.a.vN();
    int i;
    if (this.mrv != null)
    {
      this.mrx = paramc;
      this.mrv = com.a.a.a.vN();
      paramc = vO();
      i = this.mrv.a(this.mrw, paramc);
      AppMethodBeat.o(41451);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(41451);
    }
  }

  public final void a(lv paramlv, int paramInt)
  {
    AppMethodBeat.i(41454);
    Object localObject;
    String str1;
    String str2;
    if (paramlv != null)
    {
      localObject = paramlv.cHD.cBT;
      str1 = e.getUserId();
      str2 = q.LM();
      String str3 = w.dNR();
      str2 = FingerPrintAuth.genPayFPEncrypt(e.dQ(ah.getContext()), str1, str2, String.valueOf(paramInt), str3, (String)localObject, Build.MODEL);
      str1 = FingerPrintAuth.genOpenFPSign(e.dQ(ah.getContext()), e.getUserId(), q.LM(), str2);
      if (TextUtils.isEmpty(str2))
        break label191;
      ab.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_info!");
      label91: if (TextUtils.isEmpty(str1))
        break label201;
      ab.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_sign!");
    }
    while (true)
    {
      ab.i("MicroMsg.FingerPrintMgrImpl", "callback FingerPrintAuthEvent onSuccess()");
      if ((paramlv != null) && (paramlv.cHD.cHH != null))
      {
        localObject = new lv.b();
        ((lv.b)localObject).cHJ = 1;
        ((lv.b)localObject).errCode = 0;
        ((lv.b)localObject).cBU = str2;
        ((lv.b)localObject).cBV = str1;
        ((lv.b)localObject).cBS = paramInt;
        paramlv.cHE = ((lv.b)localObject);
        paramlv.cHD.cHH.run();
      }
      AppMethodBeat.o(41454);
      return;
      localObject = "";
      break;
      label191: ab.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_info!");
      break label91;
      label201: ab.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_sign!");
    }
  }

  public final boolean a(boolean paramBoolean1, boolean paramBoolean2, Bundle paramBundle)
  {
    return false;
  }

  public final boolean bxA()
  {
    return false;
  }

  public final boolean bxB()
  {
    return false;
  }

  public final void bxk()
  {
    AppMethodBeat.i(41457);
    bxu();
    bxt();
    AppMethodBeat.o(41457);
  }

  public final j bxm()
  {
    AppMethodBeat.i(41456);
    h localh = new h();
    AppMethodBeat.o(41456);
    return localh;
  }

  public final boolean bxn()
  {
    boolean bool1 = true;
    AppMethodBeat.i(41443);
    int[] arrayOfInt = com.a.a.a.vP();
    int i;
    label34: boolean bool3;
    if (arrayOfInt != null)
    {
      i = 0;
      if (i < arrayOfInt.length)
        if (1 == arrayOfInt[i])
        {
          bool2 = true;
          if (q.etg.etr != 1)
            break label130;
          bool3 = true;
          label47: if ((q.eti == null) || (!q.eti.euf))
            break label136;
          i = 1;
          label64: ab.i("MicroMsg.FingerPrintMgrImpl", "hy: is hardware support: %b, is config support : %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          if ((!bool2) || (!bool3) || (i != 0))
            break label141;
          AppMethodBeat.o(41443);
        }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      i++;
      break;
      bool2 = false;
      break label34;
      label130: bool3 = false;
      break label47;
      label136: i = 0;
      break label64;
      label141: AppMethodBeat.o(41443);
    }
  }

  public final boolean bxo()
  {
    AppMethodBeat.i(41444);
    this.mrv = com.a.a.a.vN();
    int[] arrayOfInt = vO();
    if ((arrayOfInt == null) || (arrayOfInt.length <= 0))
      ab.e("MicroMsg.FingerPrintMgrImpl", "ids is null");
    bxt();
    boolean bool;
    if ((arrayOfInt != null) && (arrayOfInt.length > 0))
    {
      bool = true;
      AppMethodBeat.o(41444);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(41444);
    }
  }

  public final void bxp()
  {
    AppMethodBeat.i(41447);
    ab.i("MicroMsg.FingerPrintMgrImpl", "initFP");
    if (q.eti.cOQ)
    {
      ab.i("MicroMsg.FingerPrintMgrImpl", "IFingerPrintMgr is not SoterAuthMgrImp but the device is in white list of SOTER, recheck it!");
      b.a(false, false, new d.1(this));
    }
    if (!bxn())
    {
      ab.e("MicroMsg.FingerPrintMgrImpl", "device is not support fingerprintAuth");
      AppMethodBeat.o(41447);
    }
    while (true)
    {
      return;
      Object localObject = r.cPI().cQo();
      if ((localObject != null) && (!((ai)localObject).cPY()))
      {
        ab.e("MicroMsg.FingerPrintMgrImpl", "isSupportTouchPay is false");
        AppMethodBeat.o(41447);
      }
      else
      {
        localObject = new com.tencent.mm.sdk.platformtools.ak(Looper.myLooper());
        ab.i("MicroMsg.FingerPrintMgrImpl", "device is support fingerprintAuth");
        com.tencent.mm.sdk.g.d.post(new d.2(this, (com.tencent.mm.sdk.platformtools.ak)localObject), getClass().getName());
        AppMethodBeat.o(41447);
      }
    }
  }

  public final boolean bxr()
  {
    return true;
  }

  public final boolean bxs()
  {
    AppMethodBeat.i(41450);
    boolean bool = e.bxs();
    AppMethodBeat.o(41450);
    return bool;
  }

  public final void bxt()
  {
    AppMethodBeat.i(41452);
    this.mrx = null;
    if (this.mrv != null);
    while (true)
    {
      try
      {
        this.mrv.release();
        this.mrv = null;
        AppMethodBeat.o(41452);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
        ab.i("MicroMsg.FingerPrintMgrImpl", "auth systemRelease occur exception e:" + localException.getMessage());
        continue;
      }
      ab.i("MicroMsg.FingerPrintMgrImpl", "systemRelease auth == null");
      AppMethodBeat.o(41452);
    }
  }

  public final void bxu()
  {
    AppMethodBeat.i(41453);
    if (this.mrv != null);
    while (true)
    {
      try
      {
        this.mrv.abort();
        AppMethodBeat.o(41453);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.FingerPrintMgrImpl", localException, "", new Object[0]);
        ab.i("MicroMsg.FingerPrintMgrImpl", "auth systemAbort occur exception e:" + localException.getMessage());
      }
      AppMethodBeat.o(41453);
    }
  }

  public final void bxv()
  {
    AppMethodBeat.i(41455);
    ab.e("MicroMsg.FingerPrintMgrImpl", "hy: param incorrect");
    AppMethodBeat.o(41455);
  }

  public final Map<String, String> bxw()
  {
    return null;
  }

  public final k bxx()
  {
    return null;
  }

  public final Map<String, String> bxy()
  {
    return null;
  }

  public final boolean bxz()
  {
    return true;
  }

  public final void dO(Context paramContext)
  {
    AppMethodBeat.i(41446);
    if (paramContext != null)
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.android.settings.fingerprint.FingerprintSettings");
      localIntent.addCategory("android.intent.category.DEFAULT");
      localIntent.setFlags(268435456);
      paramContext.startActivity(localIntent);
    }
    AppMethodBeat.o(41446);
  }

  public final void dP(Context paramContext)
  {
    AppMethodBeat.i(41449);
    ab.i("MicroMsg.FingerPrintMgrImpl", "initTASecureWorld");
    if (!c.bxj())
    {
      ab.e("MicroMsg.FingerPrintMgrImpl", "device is not support");
      AppMethodBeat.o(41449);
    }
    while (true)
    {
      return;
      if (e.dR(paramContext) != 0)
      {
        e.ht(false);
        ab.e("MicroMsg.FingerPrintMgrImpl", "copyTAFromAssets failed!");
        AppMethodBeat.o(41449);
      }
      else
      {
        e.ht(true);
        ab.e("MicroMsg.FingerPrintMgrImpl", "copyTAFromAssets success!");
        AppMethodBeat.o(41449);
      }
    }
  }

  public final int type()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.d
 * JD-Core Version:    0.6.2
 */