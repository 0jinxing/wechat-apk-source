package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dv
{
  public String a;
  public int b;
  public String c;
  public String d;
  public int e;

  public dv()
  {
    AppMethodBeat.i(98748);
    this.a = "";
    this.b = 0;
    this.c = "";
    this.d = "";
    try
    {
      this.a = bt.a().getPackageName();
      PackageInfo localPackageInfo = bt.a().getPackageManager().getPackageInfo(this.a, 0);
      this.b = localPackageInfo.versionCode;
      this.c = localPackageInfo.versionName;
      this.e = bt.c();
      this.d = "";
      AppMethodBeat.o(98748);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98748);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dv
 * JD-Core Version:    0.6.2
 */