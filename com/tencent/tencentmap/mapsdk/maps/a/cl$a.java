package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class cl$a
{
  public String a;
  public boolean b;
  public boolean c;
  public boolean d;
  public boolean e;
  public boolean f;
  public boolean g;
  private String[] h;

  public cl$a(cl paramcl, String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(98642);
    this.b = true;
    this.c = false;
    this.d = false;
    this.e = false;
    this.f = false;
    this.g = false;
    this.a = paramString1;
    paramcl = paramString1.split("-");
    if (paramcl.length < 5)
    {
      this.h = new String[] { "all", "all", "all", "all", "all" };
      for (int i = 0; i < paramcl.length; i++)
        this.h[i] = paramcl[i];
    }
    this.h = paramcl;
    this.c = a(0, String.valueOf(paramInt));
    this.d = a(1, paramString2);
    this.e = a(2, paramString3);
    this.f = a(3, paramString4);
    this.g = a(4, paramString5);
    this.h = null;
    AppMethodBeat.o(98642);
  }

  private boolean a(int paramInt, String paramString)
  {
    AppMethodBeat.i(98643);
    boolean bool1;
    if (this.h.length >= paramInt + 1)
    {
      bool1 = this.h[paramInt].equals(paramString);
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!this.h[paramInt].equals("all"))
          this.b = false;
      }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      AppMethodBeat.o(98643);
      return bool2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cl.a
 * JD-Core Version:    0.6.2
 */