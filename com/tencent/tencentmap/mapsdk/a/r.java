package com.tencent.tencentmap.mapsdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hm;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import java.io.File;

public class r
{
  private static r a = null;
  private Context b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;

  private r(Context paramContext)
  {
    AppMethodBeat.i(98262);
    if (paramContext == null)
    {
      paramContext = new Error("context can not be null");
      AppMethodBeat.o(98262);
      throw paramContext;
    }
    this.b = paramContext.getApplicationContext();
    String str1 = b(paramContext);
    String str2 = hm.a(this.b);
    if (StringUtil.isEmpty(str2));
    for (this.c = (str1 + "/tencentmapsdk/"); ; this.c = (str1 + "/tencentmapsdk/" + str2))
    {
      this.d = (this.c + "/data/v3/render/");
      this.e = (this.c + "/sat/");
      this.j = paramContext.getFilesDir().getAbsolutePath();
      this.g = (this.j + "/tencentMapSdk/config/");
      this.k = (this.g + "temp/");
      this.h = (this.j + "/tencentMapSdk/assets/");
      this.i = (this.j + "/tencentMapSdk/dynamicAssets/");
      this.f = (this.d + "closeRoadDatas/");
      a(paramContext, w.a(paramContext).a("sdkVersion"));
      AppMethodBeat.o(98262);
      return;
    }
  }

  @SuppressLint({"NewApi"})
  public static long a(String paramString)
  {
    AppMethodBeat.i(98266);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(paramString);
      long l1;
      if (Build.VERSION.SDK_INT < 18)
        l1 = localStatFs.getBlockSize();
      for (l2 = localStatFs.getAvailableBlocks(); ; l2 = localStatFs.getAvailableBlocksLong())
      {
        l2 = l2 * l1 / 1024L / 1024L;
        AppMethodBeat.o(98266);
        return l2;
        l1 = localStatFs.getBlockSizeLong();
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        long l2 = 0L;
        AppMethodBeat.o(98266);
      }
    }
  }

  public static r a(Context paramContext)
  {
    AppMethodBeat.i(98263);
    if (a == null)
      a = new r(paramContext);
    paramContext = a;
    AppMethodBeat.o(98263);
    return paramContext;
  }

  public static String b(Context paramContext)
  {
    int m = 0;
    AppMethodBeat.i(98265);
    boolean bool = Environment.getExternalStorageState().equals("mounted");
    int n;
    int i1;
    if (Build.VERSION.SDK_INT >= 23)
    {
      n = paramContext.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid());
      i1 = paramContext.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid());
    }
    while (true)
    {
      int i2 = m;
      if (n == 0)
      {
        i2 = m;
        if (i1 == 0)
          i2 = 1;
      }
      Object localObject;
      if ((!bool) || (i2 == 0))
        localObject = paramContext.getFilesDir().getPath();
      while (true)
      {
        AppMethodBeat.o(98265);
        return localObject;
        String str = Environment.getExternalStorageDirectory().getPath();
        localObject = str;
        if (a(str) < 5L)
        {
          paramContext = paramContext.getFilesDir().getPath();
          localObject = paramContext;
          if (a(paramContext) < 5L)
            localObject = Environment.getExternalStorageDirectory().getPath();
        }
      }
      i1 = 0;
      n = 0;
    }
  }

  public File a()
  {
    AppMethodBeat.i(98267);
    File localFile = new File(this.c + "/data/");
    AppMethodBeat.o(98267);
    return localFile;
  }

  public void a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(98264);
    if (StringUtil.isEmpty(w.a(paramContext).a("sdkVersion")))
      AppMethodBeat.o(98264);
    while (true)
    {
      return;
      if (ic.b("4.1.0", paramString) > 0)
      {
        u.a(paramContext);
        hm.a(new File(this.g));
        hm.a(new File(this.h));
        hm.a(new File(this.j + "/tencentMapSdk/subKey/"));
      }
      AppMethodBeat.o(98264);
    }
  }

  public String b()
  {
    return this.d;
  }

  public String b(String paramString)
  {
    AppMethodBeat.i(98268);
    if (StringUtil.isEmpty(paramString))
    {
      paramString = this.g;
      AppMethodBeat.o(98268);
    }
    while (true)
    {
      return paramString;
      paramString = this.j + "/tencentMapSdk/subKey/" + paramString + "/config/";
      AppMethodBeat.o(98268);
    }
  }

  public String c()
  {
    return this.e;
  }

  public String c(String paramString)
  {
    AppMethodBeat.i(98269);
    if (StringUtil.isEmpty(paramString))
    {
      paramString = this.h;
      AppMethodBeat.o(98269);
    }
    while (true)
    {
      return paramString;
      paramString = this.j + "/tencentMapSdk/subKey/" + paramString + "/assets/";
      AppMethodBeat.o(98269);
    }
  }

  public String d()
  {
    return this.f;
  }

  public String d(String paramString)
  {
    AppMethodBeat.i(98270);
    if (StringUtil.isEmpty(paramString))
    {
      paramString = this.k;
      AppMethodBeat.o(98270);
    }
    while (true)
    {
      return paramString;
      paramString = b(paramString) + "temp/";
      AppMethodBeat.o(98270);
    }
  }

  public String e()
  {
    return this.i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.r
 * JD-Core Version:    0.6.2
 */