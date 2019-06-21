package com.tencent.mm.protocal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  private static byte[] vxA;
  private static byte[] vxB;
  public static int vxC;
  private static long vxD;
  public static boolean vxx;
  public static boolean vxy;
  private static int vxz;

  static
  {
    AppMethodBeat.i(58794);
    vxx = false;
    vxy = false;
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("auth_info_key_prefs", h.Mu());
    vxx = localSharedPreferences.getBoolean("auth_info_prefs_use_new_ecdh", true);
    vxy = localSharedPreferences.getBoolean("auth_info_prefs_use_net_ml_cert", false);
    ab.i("MicroMsg.EcdhMgr", "summerauths USE_ECDH[%s] USE_ML[%s]", new Object[] { Boolean.valueOf(vxx), Boolean.valueOf(vxy) });
    if (vxy)
    {
      vxC = 10001;
      vxz = 415;
      vxA = Base64.decode("BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=", 0);
    }
    for (vxB = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0); ; vxB = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFUkl5eWlLM1M5UDdIVGFLTGVHUDFLemJDQ1E5SQpMU3hFR3hhRlZFNGpuWmU2RnF3dzBKaHc1bUFxYmZXTEs2Tmk4cHV2U1Y2Q3FDK0QyS2VTM3N2cFl3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0))
    {
      vxD = 0L;
      AppMethodBeat.o(58794);
      return;
      vxC = 10002;
      vxz = 415;
      vxA = Base64.decode("BJW8blwTMa0XLQ81sXksPOY/kVcqvS3W322sLXAZXD9mJ8ymAwcwXYSVqMOLRBbHUCHoI7bJff/nnBTLfDr4pYY=", 0);
    }
  }

  public static long bK(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58791);
    long l = UtilsJni.CreateHybridEcdhCryptoEngine(vxz, vxA, vxB, paramArrayOfByte);
    if (paramArrayOfByte == null);
    for (int i = -1; ; i = paramArrayOfByte.length)
    {
      ab.i("MicroMsg.EcdhMgr", "summerauths getHybridEcdhCryptoEngine engine[%s] autoauth_key[%s] nid[%s] stack[%s]", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(vxz), bo.dpG() });
      AppMethodBeat.o(58791);
      return l;
    }
  }

  public static boolean dmh()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(58793);
        ab.i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME[%s] old USE_ML[%s] stack[%s]", new Object[] { Long.valueOf(vxD), Boolean.valueOf(vxy), bo.dpG() });
        long l = SystemClock.elapsedRealtime();
        if ((600000L >= l - vxD) && (vxD > 0L))
        {
          ab.i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME freq limit [%s]ms ret false", new Object[] { Long.valueOf(l - vxD) });
          AppMethodBeat.o(58793);
          return bool2;
        }
        vxD = SystemClock.elapsedRealtime();
        bool2 = bool1;
        if (!vxy)
          bool2 = true;
        vxy = bool2;
        SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("auth_info_key_prefs", h.Mu());
        bool2 = localSharedPreferences.edit().putBoolean("auth_info_prefs_use_net_ml_cert", vxy).commit();
        localSharedPreferences.getBoolean("auth_info_prefs_use_net_ml_cert", false);
        ab.i("MicroMsg.EcdhMgr", "summerauths switchCert to [%s] save sp[%s]", new Object[] { Boolean.valueOf(vxy), Boolean.valueOf(bool2) });
        if (vxy)
        {
          vxC = 10001;
          vxz = 415;
          vxA = Base64.decode("BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=", 0);
          vxB = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
          AppMethodBeat.o(58793);
          continue;
        }
      }
      finally
      {
      }
      vxC = 10002;
      vxz = 415;
      vxA = Base64.decode("BJW8blwTMa0XLQ81sXksPOY/kVcqvS3W322sLXAZXD9mJ8ymAwcwXYSVqMOLRBbHUCHoI7bJff/nnBTLfDr4pYY=", 0);
      vxB = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFUkl5eWlLM1M5UDdIVGFLTGVHUDFLemJDQ1E5SQpMU3hFR3hhRlZFNGpuWmU2RnF3dzBKaHc1bUFxYmZXTEs2Tmk4cHV2U1Y2Q3FDK0QyS2VTM3N2cFl3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
    }
  }

  public static byte[] dmi()
  {
    return vxA;
  }

  public static void me(long paramLong)
  {
    AppMethodBeat.i(58792);
    UtilsJni.ReleaseHybridEcdhCryptoEngine(paramLong);
    ab.i("MicroMsg.EcdhMgr", "summerauths releaseHybridEcdhCryptoEngine engine[%s] stack[%s]", new Object[] { Long.valueOf(paramLong), bo.dpG() });
    AppMethodBeat.o(58792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.f
 * JD-Core Version:    0.6.2
 */