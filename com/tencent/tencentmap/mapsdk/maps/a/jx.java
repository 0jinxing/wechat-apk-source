package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bg;
import com.tencent.tencentmap.mapsdk.a.cs;
import com.tencent.tencentmap.mapsdk.a.ct;
import com.tencent.tencentmap.mapsdk.a.cu;
import com.tencent.tencentmap.mapsdk.a.cu.a;
import com.tencent.tencentmap.mapsdk.a.cu.b;
import com.tencent.tencentmap.mapsdk.a.cu.c;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.opengles.GL10;

public class jx extends hz
  implements JNICallback.d, fq, fr, ft
{
  public static int a = 1;
  private static final TimeUnit d = TimeUnit.SECONDS;
  ArrayList<ka> b;
  ArrayList<ka> c;
  private int e;
  private final int f;
  private float[] g;
  private cu.a h;
  private iz i;
  private jy j;
  private cu.c k;
  private cu.b l;
  private lb m;
  private final BlockingQueue<Runnable> n;
  private ThreadPoolExecutor o;
  private final BlockingQueue<Runnable> p;
  private ThreadPoolExecutor q;
  private int r;
  private bg s;

  public jx(iz paramiz, cu paramcu)
  {
    AppMethodBeat.i(100138);
    this.f = 80;
    this.b = new ArrayList();
    this.c = new ArrayList();
    this.n = new LinkedBlockingQueue();
    this.p = new LinkedBlockingQueue();
    this.r = -1;
    this.h = paramcu.e();
    this.k = paramcu.b();
    this.e = paramcu.c();
    this.l = paramcu.d();
    if (this.l == null)
      this.l = new kc();
    a(paramiz);
    a(paramcu.a());
    this.s = new bg();
    this.i.b().a(this);
    this.r = this.i.b().B();
    AppMethodBeat.o(100138);
  }

  private Bitmap a(ka paramka)
  {
    AppMethodBeat.i(100146);
    int i1 = 256 / a;
    int i2 = 256 / a;
    Object localObject1 = paramka.c();
    Object localObject2 = paramka.d();
    double d1 = 1.0D / Math.pow(2.0D, 20 - paramka.b());
    Object localObject3 = new DoublePoint(((DoublePoint)localObject1).x - this.e / d1, ((DoublePoint)localObject1).y - this.e / d1);
    localObject2 = new DoublePoint(((DoublePoint)localObject2).x + this.e / d1, ((DoublePoint)localObject2).y + this.e / d1);
    localObject3 = this.m.a((DoublePoint)localObject3, (DoublePoint)localObject2, d1);
    localObject2 = new ArrayList();
    Iterator localIterator = ((List)localObject3).iterator();
    while (localIterator.hasNext())
    {
      kb localkb = (kb)localIterator.next();
      localObject3 = localkb.a();
      d1 = localkb.b();
      double d2 = ((DoublePoint)localObject3).x;
      double d3 = ((DoublePoint)localObject1).x;
      double d4 = ((DoublePoint)localObject3).y;
      double d5 = ((DoublePoint)localObject1).y;
      double d6 = this.j.a(paramka.b());
      ((List)localObject2).add(new ct((d2 - d3) * d6, d6 * (d4 - d5), d1));
    }
    if (this.h != null)
    {
      localObject3 = this.h.a((List)localObject2, this.g, this.e, 256, this.l);
      if (localObject3 != null)
      {
        localObject1 = localObject3;
        if (localObject3.length == 65536);
      }
      else
      {
        localObject1 = a((List)localObject2, this.g, this.e, 256, this.l);
      }
    }
    try
    {
      while (true)
      {
        localObject1 = Bitmap.createBitmap((int[])localObject1, i2, i1, Bitmap.Config.ARGB_8888);
        paramka.a((Bitmap)localObject1);
        AppMethodBeat.o(100146);
        paramka = (ka)localObject1;
        return paramka;
        localObject1 = a((List)localObject2, this.g, this.e, 256, this.l);
      }
    }
    catch (OutOfMemoryError paramka)
    {
      while (true)
      {
        paramka = null;
        AppMethodBeat.o(100146);
      }
    }
    catch (Exception paramka)
    {
      label405: break label405;
    }
  }

  private void a(iz paramiz)
  {
    AppMethodBeat.i(100139);
    this.i = paramiz;
    this.j = new jy(this.i);
    this.m = new lc(this);
    this.o = new ThreadPoolExecutor(1, 1, 30L, d, this.n, new jx.1(this));
    this.q = new ThreadPoolExecutor(1, 1, 30L, d, this.p);
    if (this.h != null)
    {
      this.g = this.h.a(this.e);
      if ((this.g == null) || (this.g.length < this.e * 4 * this.e))
        System.err.println("Invalid fade out matrix, fail to default.");
    }
    else
    {
      this.g = f();
    }
    this.i.b().a(this);
    this.i.b().a(this);
    this.i.b().a(this);
    AppMethodBeat.o(100139);
  }

  private void a(ArrayList<ka> paramArrayList)
  {
    AppMethodBeat.i(100143);
    if (paramArrayList == null)
      AppMethodBeat.o(100143);
    while (true)
    {
      return;
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
        ((ka)localIterator.next()).a();
      paramArrayList.clear();
      AppMethodBeat.o(100143);
    }
  }

  private int[] a(List<ct> paramList, float[] paramArrayOfFloat, float paramFloat, int paramInt, cu.b paramb)
  {
    AppMethodBeat.i(100147);
    float[] arrayOfFloat = new float[paramInt * paramInt];
    int[] arrayOfInt = new int[paramInt * paramInt];
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (ct)localIterator.next();
        double d1 = paramList.c();
        double d2 = paramList.a();
        double d3 = paramList.b();
        if (d1 > 0.0D)
          for (i1 = 0; i1 < 2.0F * paramFloat; i1++)
            for (int i2 = 0; i2 < 2.0F * paramFloat; i2++)
            {
              int i3 = (int)(d2 - paramFloat + i1);
              int i4 = (int)(d3 - paramFloat + i2);
              if ((i4 >= 0) && (i3 >= 0) && (i4 < paramInt) && (i3 < paramInt))
              {
                i3 += i4 * paramInt;
                arrayOfFloat[i3] = ((float)(arrayOfFloat[i3] + paramArrayOfFloat[(i2 * 2 * this.e + i1)] * d1));
              }
            }
      }
      for (int i1 = 0; i1 < paramInt * paramInt; i1++)
        if (arrayOfFloat[i1] > 0.0F)
          arrayOfInt[i1] = paramb.colorForValue(arrayOfFloat[i1]);
    }
    AppMethodBeat.o(100147);
    return arrayOfInt;
  }

  private float[] f()
  {
    AppMethodBeat.i(100141);
    float[] arrayOfFloat = new float[this.e * 2 * 2 * this.e];
    for (int i1 = 0; i1 < this.e * 2; i1++)
    {
      int i2 = 0;
      if (i2 < this.e * 2)
      {
        float f1 = (float)Math.sqrt((i1 - this.e) * (i1 - this.e) + (i2 - this.e) * (i2 - this.e));
        if (1.0F - f1 / this.e < 0.0F);
        for (f1 = 0.0F; ; f1 = (float)((Math.exp(-f1 / 10.0D) - Math.exp(-this.e / 10.0D)) / Math.exp(0.0D)))
        {
          arrayOfFloat[(i2 * 2 * this.e + i1)] = f1;
          i2++;
          break;
        }
      }
    }
    AppMethodBeat.o(100141);
    return arrayOfFloat;
  }

  public Bitmap a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100145);
    if (this.r == -1)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(100145);
    }
    while (true)
    {
      return paramArrayOfByte;
      this.s.a(paramArrayOfByte);
      this.j.a().e();
      ka localka = new ka(this.s.a(), this.s.b(), this.s.c());
      DoublePoint localDoublePoint = new DoublePoint(this.s.a() * 256 << 20 - this.s.c(), this.s.b() * 256 << 20 - this.s.c());
      paramArrayOfByte = new DoublePoint((this.s.a() + 1) * 256 << 20 - this.s.c(), (this.s.b() + 1) * 256 << 20 - this.s.c());
      localka.a(localDoublePoint);
      localka.b(paramArrayOfByte);
      paramArrayOfByte = a(localka);
      AppMethodBeat.o(100145);
    }
  }

  public void a(double paramDouble)
  {
    AppMethodBeat.i(100150);
    if ((paramDouble > 1.0D) || (paramDouble < -1.0D))
      c();
    AppMethodBeat.o(100150);
  }

  public void a(gs.c paramc)
  {
    AppMethodBeat.i(100149);
    if (paramc != gs.c.a)
      c();
    AppMethodBeat.o(100149);
  }

  public void a(List<cs> paramList)
  {
    AppMethodBeat.i(100140);
    try
    {
      ThreadPoolExecutor localThreadPoolExecutor = this.q;
      jx.a locala = new com/tencent/tencentmap/mapsdk/maps/a/jx$a;
      locala.<init>(this, paramList);
      localThreadPoolExecutor.execute(locala);
      AppMethodBeat.o(100140);
      return;
    }
    catch (Exception paramList)
    {
      while (true)
        AppMethodBeat.o(100140);
    }
  }

  public void a(GL10 paramGL10)
  {
  }

  public boolean a()
  {
    return false;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void b()
  {
    AppMethodBeat.i(100142);
    this.i.b().b(this);
    this.i.b().b(this);
    if (this.n != null)
      this.n.clear();
    if (this.o != null)
      this.o.shutdownNow();
    if (this.p != null)
      this.p.clear();
    if (this.q != null)
      this.q.shutdownNow();
    a(this.b);
    a(this.c);
    System.gc();
    AppMethodBeat.o(100142);
  }

  public void c()
  {
  }

  public void c_()
  {
    AppMethodBeat.i(100148);
    c();
    AppMethodBeat.o(100148);
  }

  public void d()
  {
    AppMethodBeat.i(100144);
    this.i.b().a(null);
    this.i.b().i(this.r);
    this.r = -1;
    this.s = null;
    b();
    AppMethodBeat.o(100144);
  }

  public jy e()
  {
    return this.j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jx
 * JD-Core Version:    0.6.2
 */