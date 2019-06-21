package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aj.l;

public class jd extends jb
{
  private hx a;
  private iz b;

  public jd(iz paramiz, hx paramhx)
  {
    this.b = paramiz;
    this.a = paramhx;
  }

  private Rect a(Rect paramRect)
  {
    AppMethodBeat.i(100024);
    if (paramRect == null)
    {
      paramRect = null;
      AppMethodBeat.o(100024);
    }
    while (true)
    {
      return paramRect;
      int i = paramRect.left;
      int j = paramRect.right;
      int k = paramRect.top;
      int m = paramRect.bottom;
      int n = (paramRect.right + paramRect.left) / 2;
      int i1 = (paramRect.top + paramRect.bottom) / 2;
      int i2 = paramRect.right;
      int i3 = paramRect.left;
      int i4 = paramRect.bottom;
      int i5 = paramRect.top;
      if (i2 - i3 < ic.s * 40.0F)
      {
        i = (int)(n - ic.s * 20.0F);
        j = (int)(n + ic.s * 20.0F);
      }
      if (i4 - i5 < ic.s * 40.0F)
      {
        k = (int)(i1 - ic.s * 20.0F);
        m = (int)(i1 + ic.s * 20.0F);
      }
      paramRect = new Rect(i, k, j, m);
      AppMethodBeat.o(100024);
    }
  }

  public Rect a()
  {
    AppMethodBeat.i(100023);
    Rect localRect;
    if (this.a == null)
    {
      localRect = null;
      AppMethodBeat.o(100023);
    }
    while (true)
    {
      return localRect;
      localRect = a(this.a.l());
      AppMethodBeat.o(100023);
    }
  }

  public String b()
  {
    AppMethodBeat.i(100025);
    String str;
    if (this.a == null)
    {
      str = null;
      AppMethodBeat.o(100025);
    }
    while (true)
    {
      return str;
      str = this.a.m();
      AppMethodBeat.o(100025);
    }
  }

  public void c()
  {
    AppMethodBeat.i(100026);
    if (this.b != null)
    {
      aj.l locall = this.b.s;
      if ((this.a != null) && (locall != null))
        locall.a(this.a.y);
    }
    AppMethodBeat.o(100026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jd
 * JD-Core Version:    0.6.2
 */