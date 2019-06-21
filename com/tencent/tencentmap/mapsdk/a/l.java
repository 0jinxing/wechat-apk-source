package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class l
{
  private static volatile l a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;

  private l(Context paramContext)
  {
    AppMethodBeat.i(101234);
    this.b = paramContext.getDir("tencentMapTemp", 0).getAbsolutePath();
    this.e = paramContext.getDir("tencentMapLib", 0).getAbsolutePath();
    this.c = (this.e + File.separator + "vector.jar");
    this.d = (this.e + File.separator + "libtxmapengine.so");
    this.f = (paramContext.getFilesDir().getAbsolutePath() + "/tencentMapSdk/dynamicAssets/");
    AppMethodBeat.o(101234);
  }

  public static l a(Context paramContext)
  {
    AppMethodBeat.i(101235);
    if (a == null);
    try
    {
      if (a == null)
      {
        l locall = new com/tencent/tencentmap/mapsdk/a/l;
        locall.<init>(paramContext);
        a = locall;
      }
      paramContext = a;
      AppMethodBeat.o(101235);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(101235);
    }
    throw paramContext;
  }

  public String a()
  {
    return this.b;
  }

  public String b()
  {
    return this.f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.l
 * JD-Core Version:    0.6.2
 */