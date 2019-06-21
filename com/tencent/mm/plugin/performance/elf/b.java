package com.tencent.mm.plugin.performance.elf;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mmkv.MMKV;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public static boolean DEBUG;
  public static long pfL;
  public static final b pfQ;
  public static final b.b pfR;
  public static final Runnable pfS;
  public static final ak pfh;
  public boolean nDl = false;

  static
  {
    AppMethodBeat.i(111072);
    pfL = 1200000L;
    pfQ = new b();
    pfh = new ak(Looper.getMainLooper());
    pfR = new b.b((byte)0);
    pfS = new b.a((byte)0);
    DEBUG = false;
    AppMethodBeat.o(111072);
  }

  public static boolean aP(float paramFloat)
  {
    AppMethodBeat.i(111071);
    String str1 = ((a)g.K(a.class)).a(a.a.lHE, "");
    int i;
    if (!TextUtils.isEmpty(str1))
    {
      try
      {
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(str1);
        localObject1 = ((JSONObject)localObject1).getJSONArray("hard-open");
        for (i = 0; i < ((JSONArray)localObject1).length(); i++)
        {
          Object localObject2 = ((JSONArray)localObject1).getJSONObject(i);
          String str2 = ((JSONObject)localObject2).getString("device-brand");
          str1 = ((JSONObject)localObject2).getString("device-model");
          int j = ((JSONObject)localObject2).getInt("sdk-version");
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = Build.BRAND + " " + Build.MODEL;
          ab.i("MicroMsg.ProcessElf", "[checkHardOpen] name:%s model:%s version:%s | %s %s ", new Object[] { str2, str1, Integer.valueOf(j), localObject2, Integer.valueOf(Build.VERSION.SDK_INT) });
          if ((j <= Build.VERSION.SDK_INT) && (((String)localObject2).contains(str2)))
          {
            bool = ((String)localObject2).contains(str1);
            if (bool)
            {
              bool = true;
              AppMethodBeat.o(111071);
              return bool;
            }
          }
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.ProcessElf", localException, "", new Object[0]);
      }
      label227: i = new Random().nextInt(10000);
      if (10000.0F * paramFloat <= i)
        break label316;
    }
    label316: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.ProcessElf", "[checkHardOpen] rand:%s test:%s isEnable:%s", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(i), Boolean.valueOf(bool) });
      MMKV.defaultMMKV().putBoolean("MicroMsg.ProcessElf", bool);
      AppMethodBeat.o(111071);
      break;
      ab.i("MicroMsg.ProcessElf", "[checkHardOpen] json is Empty! just pass!");
      break label227;
    }
  }

  public static long bZm()
  {
    if (DEBUG);
    for (long l = 8000L; ; l = pfL)
      return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.b
 * JD-Core Version:    0.6.2
 */