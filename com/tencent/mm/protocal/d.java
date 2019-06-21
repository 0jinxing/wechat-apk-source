package com.tencent.mm.protocal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.f;
import junit.framework.Assert;

public final class d extends e
{
  public static final String DEVICE_NAME;
  public static String eSg;
  public static final String vxi;
  public static final String vxj;
  public static String vxk;
  public static final String vxl;
  public static String vxm;
  public static long vxn;
  public static int vxo;
  public static boolean vxp;
  public static boolean vxq;
  public static boolean vxr;
  public static boolean vxs;
  public static int vxt;
  public static final byte[] vxu;
  public static final byte[] vxv;
  public static final byte[] vxw;

  static
  {
    AppMethodBeat.i(58789);
    eSg = "android-" + Build.VERSION.SDK_INT;
    vxi = Build.BRAND;
    vxj = Build.MODEL + Build.CPU_ABI;
    vxk = "android-" + Build.VERSION.SDK_INT;
    vxl = "android-" + Build.MANUFACTURER;
    vxm = Build.VERSION.SDK_INT;
    DEVICE_NAME = Build.MANUFACTURER + "-" + Build.MODEL;
    vxn = 0L;
    vxo = Integer.decode(f.CLIENT_VERSION).intValue();
    Assert.assertNotNull(f.CLIENT_VERSION);
    try
    {
      int i = ah.getContext().getPackageManager().getApplicationInfo(ah.getPackageName(), 128).metaData.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
      if ((i > vxo) && (i - vxo < 255) && ((i & 0xFF) >= 48))
        vxo = i;
      vxp = dmg();
      vxq = dmf();
      vxr = dmd();
      vxs = dme();
      vxt = 5;
      vxu = null;
      vxv = null;
      vxw = null;
      AppMethodBeat.o(58789);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.b("MicroMsg.ConstantsProtocal", "", new Object[] { localException });
    }
  }

  public static void Lw(int paramInt)
  {
    AppMethodBeat.i(58788);
    vxo = paramInt;
    vxr = dmd();
    vxp = dmg();
    vxq = dmf();
    vxs = dme();
    AppMethodBeat.o(58788);
  }

  private static boolean dmd()
  {
    if (((vxo & 0xFF) >= 0) && ((vxo & 0xFF) <= 47));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean dme()
  {
    if (((vxo & 0xFF) >= 0) && ((vxo & 0xFF) <= 15));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean dmf()
  {
    if (((vxo & 0xFF) >= 96) && ((vxo & 0xFF) <= 255));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean dmg()
  {
    if (((vxo & 0xFF) >= 48) && ((vxo & 0xFF) <= 95));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.d
 * JD-Core Version:    0.6.2
 */