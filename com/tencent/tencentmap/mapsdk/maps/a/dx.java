package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class dx
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;

  public dx()
  {
    AppMethodBeat.i(98750);
    try
    {
      this.a = Build.MODEL;
      this.b = Build.VERSION.RELEASE;
      this.c = eu.a();
      this.d = eu.b();
      eu.e();
      this.e = eu.f();
      AppMethodBeat.o(98750);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98750);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dx
 * JD-Core Version:    0.6.2
 */