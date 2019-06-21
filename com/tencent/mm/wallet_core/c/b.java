package com.tencent.mm.wallet_core.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tenpay.ndk.CertUtil;
import com.tenpay.ndk.MessageDigestUtil;

public final class b
{
  private static b Afj = null;
  static boolean bZi = false;
  private boolean Afk = false;

  public static boolean F(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(49029);
    Object localObject1 = "";
    if (paramBoolean)
    {
      Object localObject2 = new MessageDigestUtil();
      g.RQ();
      g.RN();
      localObject1 = p.getString(a.QF());
      String str = (String)localObject1 + "_pUI6cNqzLt2Z3mQSrYuF09XSGsBtTIcUgp9jcWZ7F7BBs8/DFVFMKiwbtaRPOiLE";
      localObject1 = new byte[16];
      localObject2 = ((MessageDigestUtil)localObject2).getSHA256Hex(str.getBytes()).getBytes();
      for (int i = 0; (i < 16) && (i < localObject2.length); i++)
        localObject1[i] = ((byte)localObject2[i]);
      localObject1 = new String((byte[])localObject1);
    }
    ab.d("MicroMsg.CertUtilWx", "setTokens stack v2 useSm4 %s sm4Key %s %s", new Object[] { Boolean.valueOf(paramBoolean), localObject1, bo.dpG().toString() });
    paramBoolean = CertUtil.getInstance().setTokens(paramString1, paramString2, paramBoolean, (String)localObject1);
    ab.d("MicroMsg.CertUtilWx", "setTokens result ret:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(49029);
    return paramBoolean;
  }

  public static int atn(String paramString)
  {
    AppMethodBeat.i(49032);
    int i = CertUtil.getInstance().getTokenCount(paramString);
    ab.d("MicroMsg.CertUtilWx", "getTokenCount ret: %d stack %s", new Object[] { Integer.valueOf(i), bo.dpG().toString() });
    AppMethodBeat.o(49032);
    return i;
  }

  public static void clean()
  {
    AppMethodBeat.i(49035);
    ab.d("MicroMsg.CertUtilWx", "clean allcrt stack %s", new Object[] { bo.dpG().toString() });
    CertUtil.getInstance().clearAllCert();
    AppMethodBeat.o(49035);
  }

  public static void clearCert(String paramString)
  {
    AppMethodBeat.i(49034);
    ab.d("MicroMsg.CertUtilWx", "clearCert stack %s", new Object[] { bo.dpG().toString() });
    CertUtil.getInstance().clearCert(paramString);
    AppMethodBeat.o(49034);
  }

  public static void clearToken(String paramString)
  {
    AppMethodBeat.i(49031);
    ab.d("MicroMsg.CertUtilWx", "clearToken stack %s", new Object[] { bo.dpG().toString() });
    CertUtil.getInstance().clearToken(paramString);
    AppMethodBeat.o(49031);
  }

  public static b dNJ()
  {
    AppMethodBeat.i(49022);
    if (Afj == null)
      Afj = new b();
    b localb = Afj;
    AppMethodBeat.o(49022);
    return localb;
  }

  public static String genUserSig(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49028);
    ab.d("MicroMsg.CertUtilWx", "genUserSig stack %s", new Object[] { bo.dpG().toString() });
    paramString1 = CertUtil.getInstance().genUserSig(paramString1, paramString2);
    AppMethodBeat.o(49028);
    return paramString1;
  }

  public static int getLastError()
  {
    AppMethodBeat.i(49033);
    ab.d("MicroMsg.CertUtilWx", "getLastError stack %s", new Object[] { bo.dpG().toString() });
    int i = CertUtil.getInstance().getLastError();
    AppMethodBeat.o(49033);
    return i;
  }

  public static String getToken(String paramString)
  {
    AppMethodBeat.i(49030);
    ab.d("MicroMsg.CertUtilWx", "getToken stack %s", new Object[] { bo.dpG().toString() });
    paramString = CertUtil.getInstance().getToken(paramString);
    AppMethodBeat.o(49030);
    return paramString;
  }

  public static void init(Context paramContext)
  {
    AppMethodBeat.i(49023);
    if (bZi)
      AppMethodBeat.o(49023);
    while (true)
    {
      return;
      ab.d("MicroMsg.CertUtilWx", "init  %s", new Object[] { bo.dpG().toString() });
      CertUtil.getInstance().init(paramContext);
      bZi = true;
      AppMethodBeat.o(49023);
    }
  }

  public static boolean isCertExist(String paramString)
  {
    AppMethodBeat.i(49027);
    ab.d("MicroMsg.CertUtilWx", "isCertExist stack %s", new Object[] { bo.dpG().toString() });
    h.pYm.a(414L, 5L, 1L, true);
    boolean bool = CertUtil.getInstance().isCertExist(paramString);
    h.pYm.a(414L, 6L, 1L, true);
    AppMethodBeat.o(49027);
    return bool;
  }

  public final boolean dNK()
  {
    AppMethodBeat.i(49026);
    ab.d("MicroMsg.CertUtilWx", "importCertNone");
    try
    {
      this.Afk = false;
      return false;
    }
    finally
    {
      AppMethodBeat.o(49026);
    }
  }

  public final String eJ(String paramString, int paramInt)
  {
    AppMethodBeat.i(49024);
    ab.i("MicroMsg.CertUtilWx", "getCertApplyCSR lock %s %s", new Object[] { bo.dpG().toString(), Integer.valueOf(paramInt) });
    try
    {
      if (this.Afk)
      {
        ab.i("MicroMsg.CertUtilWx", "isCert_Wating");
        paramString = "";
      }
      while (true)
      {
        return paramString;
        this.Afk = true;
        paramString = CertUtil.getInstance().getCertApplyCSR(paramString, paramInt);
        AppMethodBeat.o(49024);
      }
    }
    finally
    {
      AppMethodBeat.o(49024);
    }
    throw paramString;
  }

  public final boolean importCert(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49025);
    ab.i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s stack %s", new Object[] { paramString1, paramString2, bo.dpG().toString() });
    try
    {
      this.Afk = false;
      boolean bool = CertUtil.getInstance().importCert(paramString1, paramString2);
      ab.i("MicroMsg.CertUtilWx", "importCert %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(49025);
      return bool;
    }
    finally
    {
      AppMethodBeat.o(49025);
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.b
 * JD-Core Version:    0.6.2
 */