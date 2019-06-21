package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.element.l;
import com.tencent.map.lib.element.m;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cl;
import com.tencent.tencentmap.mapsdk.a.de;
import com.tencent.tencentmap.mapsdk.a.df;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.opengles.GL10;

public class hv extends hz
{
  private static AtomicInteger S;
  protected if A;
  protected boolean B;
  protected int C;
  protected int D;
  protected float E;
  protected float F;
  public int G;
  public int H;
  private boolean R;
  private Runnable T;
  private Runnable U;
  private if.a V;
  private if.b W;
  protected l a;
  protected Bitmap b;
  boolean c;
  protected byte[] d;
  protected float e;
  protected boolean f;
  protected float g;
  protected float h;
  protected float i;
  protected String j;
  String k;
  public int l;
  public int m;
  protected GeoPoint n;
  protected GeoPoint o;
  protected GeoPoint p;
  protected float q;
  protected float r;
  protected float s;
  public boolean t;
  public boolean u;
  public boolean v;
  protected iz w;
  public de x;
  public df y;
  protected cl z;

  static
  {
    AppMethodBeat.i(99620);
    S = new AtomicInteger(0);
    AppMethodBeat.o(99620);
  }

  public hv(iz paramiz)
  {
    AppMethodBeat.i(99605);
    this.b = null;
    this.c = false;
    this.d = new byte[0];
    this.e = 0.0F;
    this.f = false;
    this.g = 0.0F;
    this.h = 0.0F;
    this.i = -1.0F;
    this.j = null;
    this.k = null;
    this.l = 0;
    this.m = 0;
    this.R = false;
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = 1.0F;
    this.r = 1.0F;
    this.s = 1.0F;
    this.t = false;
    this.u = false;
    this.v = true;
    this.w = null;
    this.x = null;
    this.y = null;
    this.z = null;
    this.A = null;
    this.B = false;
    this.C = 0;
    this.D = 0;
    this.E = 0.5F;
    this.F = 0.5F;
    this.G = 0;
    this.H = 0;
    this.T = new hv.1(this);
    this.U = new hv.2(this);
    this.V = new hv.3(this);
    this.W = new hv.4(this);
    this.w = paramiz;
    i();
    AppMethodBeat.o(99605);
  }

  private void b(df paramdf)
  {
    AppMethodBeat.i(99617);
    if ((paramdf == null) || (this.a != null))
      AppMethodBeat.o(99617);
    while (true)
    {
      return;
      paramdf = d(paramdf);
      if (paramdf == null)
      {
        AppMethodBeat.o(99617);
      }
      else
      {
        this.a = new l(paramdf);
        AppMethodBeat.o(99617);
      }
    }
  }

  private void c(df paramdf)
  {
    AppMethodBeat.i(99618);
    if (paramdf == null)
      AppMethodBeat.o(99618);
    while (true)
    {
      return;
      paramdf = d(paramdf);
      if (paramdf == null)
      {
        AppMethodBeat.o(99618);
      }
      else if (this.a == null)
      {
        this.a = new l(paramdf);
        AppMethodBeat.o(99618);
      }
      else
      {
        this.a.a(paramdf);
        AppMethodBeat.o(99618);
      }
    }
  }

  private m d(df paramdf)
  {
    AppMethodBeat.i(99619);
    if (paramdf == null)
    {
      paramdf = null;
      AppMethodBeat.o(99619);
    }
    while (true)
    {
      return paramdf;
      int i1 = paramdf.s();
      int i2 = paramdf.t();
      float f1 = this.E;
      float f2 = i1 * 1.0F / this.l;
      float f3 = this.F;
      float f4 = i2 * 1.0F / this.m;
      paramdf = new m().a(paramdf.k()).a(f1 - f2, f3 - f4).a(paramdf.s(), paramdf.t()).b(false).b((int)paramdf.l()).c(paramdf.x()).d(this.B).a(true);
      AppMethodBeat.o(99619);
    }
  }

  private void i()
  {
    AppMethodBeat.i(99616);
    m localm = new m();
    if (this.a == null)
    {
      this.a = new l(localm);
      AppMethodBeat.o(99616);
    }
    while (true)
    {
      return;
      this.a.a(localm);
      AppMethodBeat.o(99616);
    }
  }

  public void a(float paramFloat)
  {
    this.e = paramFloat;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99607);
    this.C = paramInt1;
    this.D = paramInt2;
    if (this.a != null)
    {
      b(true);
      GeoPoint localGeoPoint = new GeoPoint(this.D, this.C);
      this.a.a(localGeoPoint);
    }
    AppMethodBeat.o(99607);
  }

  protected void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99608);
    synchronized (this.d)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      this.j = (paramBitmap.hashCode() + S.getAndIncrement());
      if (this.a != null)
        this.a.a(this.j, new Bitmap[] { paramBitmap });
      this.l = paramBitmap.getWidth();
      this.m = paramBitmap.getHeight();
      AppMethodBeat.o(99608);
      return;
    }
  }

  public void a(df paramdf)
  {
    AppMethodBeat.i(99606);
    if (paramdf == null)
      AppMethodBeat.o(99606);
    while (true)
    {
      return;
      this.y = paramdf;
      a(paramdf.i());
      a(paramdf.o());
      b(paramdf.k());
      a_(paramdf.x());
      c(paramdf);
      AppMethodBeat.o(99606);
    }
  }

  public void a(if paramif)
  {
    AppMethodBeat.i(99613);
    this.A = paramif;
    if (this.A != null)
    {
      this.A.a(this.V);
      this.A.a(this.W);
    }
    AppMethodBeat.o(99613);
  }

  public void a(GL10 paramGL10)
  {
    AppMethodBeat.i(99611);
    if (!a())
      AppMethodBeat.o(99611);
    while (true)
    {
      return;
      b(this.y);
      b(paramGL10);
      paramGL10 = this.w.b().z();
      if ((paramGL10 != null) && (this.a != null))
        this.a.b(paramGL10, this.w.b().t());
      AppMethodBeat.o(99611);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.O = paramBoolean;
  }

  public boolean a()
  {
    return this.O;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(99612);
    if ((!this.v) || (this.a == null))
    {
      AppMethodBeat.o(99612);
      return bool2;
    }
    bool2 = bool1;
    Rect localRect;
    if (this.a != null)
    {
      bool2 = this.a.a(this.w.b().t(), paramFloat1, paramFloat2);
      localRect = this.a.b(this.w.b().t());
      if ((bool2 != true) || (localRect == null))
        break label128;
      this.G = ((int)paramFloat1 - localRect.left);
    }
    for (this.H = ((int)paramFloat2 - localRect.top); ; this.H = -1)
    {
      AppMethodBeat.o(99612);
      break;
      label128: this.G = -1;
    }
  }

  public void b()
  {
  }

  public void b(float paramFloat)
  {
    this.q = paramFloat;
  }

  public void b(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99609);
    if (paramBitmap == null)
      AppMethodBeat.o(99609);
    while (true)
    {
      return;
      a(paramBitmap);
      e();
      AppMethodBeat.o(99609);
    }
  }

  public void b(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }

  protected boolean b(GL10 paramGL10)
  {
    boolean bool = true;
    AppMethodBeat.i(99615);
    if (this.A != null)
    {
      this.A.d();
      if (this.A.c() == true)
        this.w.b().a();
      AppMethodBeat.o(99615);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(99615);
    }
  }

  public void c()
  {
  }

  public void d()
  {
    this.w = null;
    this.n = null;
  }

  public void e()
  {
    AppMethodBeat.i(99610);
    synchronized (this.d)
    {
      if ((this.b != null) && (!this.b.isRecycled()))
        this.c = true;
      AppMethodBeat.o(99610);
      return;
    }
  }

  public void f()
  {
    if (this.o != null)
      this.R = true;
  }

  public boolean g()
  {
    AppMethodBeat.i(99614);
    boolean bool;
    if (this.A == null)
    {
      bool = false;
      AppMethodBeat.o(99614);
    }
    while (true)
    {
      return bool;
      bool = this.A.a(this.n, this.p);
      AppMethodBeat.o(99614);
    }
  }

  protected void h()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hv
 * JD-Core Version:    0.6.2
 */