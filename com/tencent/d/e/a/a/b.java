package com.tencent.d.e.a.a;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.d.e.a.b.e;
import com.tencent.d.e.a.b.g;
import com.tencent.d.f.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private static final int[] AtE = { 1, 5, 4, 8, 9, 2 };
  private static int AtF = -1;

  public static com.tencent.d.e.a.b.a a(int paramInt1, int paramInt2, Context paramContext, int paramInt3, SparseArray<i> paramSparseArray, List<k> paramList)
  {
    AppMethodBeat.i(114552);
    com.tencent.d.e.a.b.a locala = new com.tencent.d.e.a.b.a();
    locala.Aua = 0L;
    locala.few = "";
    locala.uaV = com.tencent.d.f.i.cd(paramContext, paramContext.getPackageName()).versionCode;
    locala.ArS = "14D6ACDE3C2F2F48";
    locala.cIb = 500000;
    locala.requestType = paramInt3;
    locala.Auc = atO(paramContext.getPackageName());
    ArrayList localArrayList = new ArrayList();
    for (paramInt3 = 0; paramInt3 < paramSparseArray.size(); paramInt3++)
      localArrayList.addAll(((i)paramSparseArray.valueAt(paramInt3)).fB(paramList));
    if ((localArrayList.size() <= 0) || (localArrayList.get(0) == null))
    {
      paramContext = new IllegalArgumentException("invalid stateUnits");
      AppMethodBeat.o(114552);
      throw paramContext;
    }
    paramSparseArray = new e();
    paramSparseArray.Auk = ((g)localArrayList.get(0)).Aup;
    paramSparseArray.Aul = localArrayList;
    paramSparseArray.Atn = paramInt1;
    paramSparseArray.action = paramInt2;
    paramList = new ArrayList();
    paramList.add(paramSparseArray);
    locala.Aub = paramList;
    locala.imei = atO(d.getIMEI(paramContext));
    locala.imsi = atO(d.iK(paramContext));
    locala.fwM = atO(Build.BRAND);
    locala.model = atO(Build.MODEL);
    locala.Aud = atO(Build.FINGERPRINT);
    locala.Aue = iI(paramContext);
    locala.sdkVer = Build.VERSION.SDK_INT;
    locala.platform = 2;
    AppMethodBeat.o(114552);
    return locala;
  }

  private static String atO(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private static int iI(Context paramContext)
  {
    AppMethodBeat.i(114553);
    int i;
    if (AtF == -1)
    {
      paramContext = (SensorManager)paramContext.getSystemService("sensor");
      if (paramContext == null)
      {
        i = AtF;
        AppMethodBeat.o(114553);
      }
    }
    while (true)
    {
      return i;
      int j = 0;
      i = 1;
      if (j < AtE.length)
      {
        if (paramContext.getDefaultSensor(AtE[j]) == null);
        for (int k = 0; ; k = 1)
        {
          i |= k << j;
          j++;
          break;
        }
      }
      AtF = i;
      i = AtF;
      AppMethodBeat.o(114553);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.b
 * JD-Core Version:    0.6.2
 */