package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ds
{
  private static ds c;
  private dr a;
  private boolean b;

  private ds()
  {
    AppMethodBeat.i(101105);
    this.a = new dv();
    this.b = false;
    AppMethodBeat.o(101105);
  }

  public static ds a()
  {
    try
    {
      AppMethodBeat.i(101104);
      if (c == null)
      {
        localds = new com/tencent/tencentmap/mapsdk/a/ds;
        localds.<init>();
        c = localds;
      }
      ds localds = c;
      AppMethodBeat.o(101104);
      return localds;
    }
    finally
    {
    }
  }

  public dt a(String paramString)
  {
    AppMethodBeat.i(101107);
    if (this.a == null)
    {
      paramString = null;
      AppMethodBeat.o(101107);
    }
    while (true)
    {
      return paramString;
      paramString = this.a.a(paramString);
      AppMethodBeat.o(101107);
    }
  }

  public dt a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(101108);
    if (this.a == null)
    {
      paramString1 = null;
      AppMethodBeat.o(101108);
    }
    while (true)
    {
      return paramString1;
      paramString1 = this.a.a(paramString1, paramString2);
      AppMethodBeat.o(101108);
    }
  }

  public dt a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(101109);
    if (this.a == null)
    {
      paramString1 = null;
      AppMethodBeat.o(101109);
    }
    while (true)
    {
      return paramString1;
      paramString1 = this.a.a(paramString1, paramString2, paramArrayOfByte);
      AppMethodBeat.o(101109);
    }
  }

  public void a(Context paramContext)
  {
    AppMethodBeat.i(101106);
    if (this.b)
      AppMethodBeat.o(101106);
    while (true)
    {
      return;
      if (this.a != null)
      {
        this.a.a(paramContext.getApplicationContext());
        this.b = true;
      }
      AppMethodBeat.o(101106);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ds
 * JD-Core Version:    0.6.2
 */