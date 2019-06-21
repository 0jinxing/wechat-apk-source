package com.tencent.mm.plugin.fcm;

import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
{
  private static final String[] mqC = { "A53", "A53m", "A53t", "A33m", "A33", "A33t", "R7Plust", "R7Plus", "A59t", "A59s", "A59m", "R9PlustA", "R9PlusmA", "R9PlustmA", "R9tm", "R9m", "R9km", "A37t", "A37m", "R7sPlus", "R7Plusm", "A53", "A51kc", "A51", "A30" };

  public static final boolean e(g paramg)
  {
    AppMethodBeat.i(56441);
    int i;
    if ((Build.VERSION.SDK_INT == 21) || (Build.VERSION.SDK_INT == 22))
      if (bo.bc(Build.MANUFACTURER, "").toLowerCase().indexOf("oppo".toLowerCase()) >= 0)
      {
        i = 1;
        if (i == 0)
          break label164;
        String[] arrayOfString = mqC;
        int j = arrayOfString.length;
        i = 0;
        label58: if (i >= j)
          break label164;
        String str = arrayOfString[i];
        if ((!str.equalsIgnoreCase(Build.DEVICE)) && (!str.equalsIgnoreCase(Build.PRODUCT)))
          break label158;
        ab.i("OPPOFirebaseProblem", "for oppo firebase problem, %s", new Object[] { Build.MODEL });
        i = 1;
        label109: if ((i == 0) || (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramg.cc) == 0))
          break label169;
      }
    label158: label164: label169: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.FCM.OPPOFirebaseProblem", "isNoSupportFCM() result:%s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(56441);
      return bool;
      i = 0;
      break;
      i++;
      break label58;
      i = 0;
      break label109;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fcm.d
 * JD-Core Version:    0.6.2
 */