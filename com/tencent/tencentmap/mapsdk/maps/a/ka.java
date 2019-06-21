package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ka
{
  private final int a;
  private final int b;
  private final int c;
  private DoublePoint d;
  private DoublePoint e;
  private float f;
  private ie g;
  private if.b h;
  private volatile boolean i;
  private boolean j;
  private Bitmap k;

  public ka(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(100191);
    this.f = 0.0F;
    this.h = new ka.1(this);
    this.i = false;
    this.j = true;
    this.k = null;
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    AppMethodBeat.o(100191);
  }

  public void a()
  {
    AppMethodBeat.i(100192);
    if (this.k != null)
    {
      if (this.g != null)
      {
        this.g.b();
        this.g = null;
      }
      this.k.recycle();
      this.k = null;
    }
    AppMethodBeat.o(100192);
  }

  public void a(float paramFloat)
  {
    AppMethodBeat.i(100194);
    this.i = true;
    this.f = paramFloat;
    this.g = new ie(paramFloat, 1.0F);
    this.g.a(this.h);
    this.g.a(250L);
    this.g.a(null, null);
    AppMethodBeat.o(100194);
  }

  public void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(100195);
    if (paramBitmap == null)
      AppMethodBeat.o(100195);
    while (true)
    {
      return;
      this.k = paramBitmap;
      a(0.0F);
      AppMethodBeat.o(100195);
    }
  }

  public void a(DoublePoint paramDoublePoint)
  {
    this.d = paramDoublePoint;
  }

  public int b()
  {
    return this.c;
  }

  public void b(DoublePoint paramDoublePoint)
  {
    this.e = paramDoublePoint;
  }

  public DoublePoint c()
  {
    return this.d;
  }

  public DoublePoint d()
  {
    return this.e;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof ka))
      {
        bool = false;
      }
      else
      {
        paramObject = (ka)paramObject;
        if ((this.a != paramObject.a) || (this.b != paramObject.b) || (this.c != paramObject.c))
          bool = false;
      }
    }
  }

  public int hashCode()
  {
    return this.a * 7 + this.b * 11 + this.c * 13;
  }

  public String toString()
  {
    AppMethodBeat.i(100193);
    Object localObject = new StringBuilder(24);
    ((StringBuilder)localObject).append(this.a);
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(this.b);
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(this.c);
    ((StringBuilder)localObject).append("-");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(100193);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ka
 * JD-Core Version:    0.6.2
 */