package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;

public class fj extends ey
{
  private static ThreadLocal<Object> b;
  private static final ThreadLocal<ArrayList<fj>> h;
  private static final ThreadLocal<ArrayList<fj>> i;
  private static final ThreadLocal<ArrayList<fj>> j;
  private static final ThreadLocal<ArrayList<fj>> k;
  private static final ThreadLocal<ArrayList<fj>> l;
  private static final Interpolator m;
  private static long v;
  long c = -1L;
  int d = 0;
  fg[] e;
  HashMap<Integer, fg> f;
  protected ex g;
  private boolean n = false;
  private int o = 0;
  private float p = 0.0F;
  private boolean q = false;
  private boolean r = false;
  private boolean s = false;
  private long t = 300L;
  private long u = 0L;
  private int w = 0;
  private int x = 1;
  private Interpolator y = m;
  private ArrayList<Object> z = null;

  static
  {
    AppMethodBeat.i(98916);
    b = new ThreadLocal();
    h = new ThreadLocal()
    {
      protected final ArrayList<fj> a()
      {
        AppMethodBeat.i(98899);
        ArrayList localArrayList = new ArrayList();
        AppMethodBeat.o(98899);
        return localArrayList;
      }
    };
    i = new ThreadLocal()
    {
      protected final ArrayList<fj> a()
      {
        AppMethodBeat.i(98901);
        ArrayList localArrayList = new ArrayList();
        AppMethodBeat.o(98901);
        return localArrayList;
      }
    };
    j = new fj.3();
    k = new fj.4();
    l = new fj.5();
    m = new LinearInterpolator();
    v = 10L;
    AppMethodBeat.o(98916);
  }

  public fj(ex paramex)
  {
    this.g = paramex;
  }

  public static void a(long paramLong)
  {
    v = paramLong;
  }

  public ey a()
  {
    int i1 = 0;
    AppMethodBeat.i(98913);
    fj localfj = (fj)super.a();
    int i2;
    int i3;
    if (this.z != null)
    {
      localObject = this.z;
      localfj.z = new ArrayList();
      i2 = ((ArrayList)localObject).size();
      for (i3 = 0; i3 < i2; i3++)
        localfj.z.add(((ArrayList)localObject).get(i3));
    }
    localfj.c = -1L;
    localfj.n = false;
    localfj.o = 0;
    localfj.d = 0;
    localfj.q = false;
    Object localObject = this.e;
    if (localObject != null)
    {
      i2 = localObject.length;
      localfj.e = new fg[i2];
      localfj.f = new HashMap(i2);
      for (i3 = i1; i3 < i2; i3++)
      {
        fg localfg = localObject[i3].a();
        localfj.e[i3] = localfg;
        localfj.f.put(Integer.valueOf(localfg.b()), localfg);
      }
    }
    AppMethodBeat.o(98913);
    return localfj;
  }

  public void a(fi<?> paramfi)
  {
    AppMethodBeat.i(98912);
    if ((paramfi != null) && (this.e != null) && (this.e.length > 0))
      this.e[0].a(paramfi);
    AppMethodBeat.o(98912);
  }

  public void a(double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(98909);
    if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length == 0))
      AppMethodBeat.o(98909);
    while (true)
    {
      return;
      if ((this.e == null) || (this.e.length == 0))
      {
        a(new fg[] { fg.a(0, paramArrayOfDouble) });
        AppMethodBeat.o(98909);
      }
      else
      {
        this.e[0].a(paramArrayOfDouble);
        AppMethodBeat.o(98909);
      }
    }
  }

  public void a(fg[] paramArrayOffg)
  {
    AppMethodBeat.i(98911);
    int i1 = paramArrayOffg.length;
    this.e = paramArrayOffg;
    this.f = new HashMap(i1);
    for (int i2 = 0; i2 < i1; i2++)
    {
      fg localfg = paramArrayOffg[i2];
      this.f.put(Integer.valueOf(localfg.b()), localfg);
    }
    AppMethodBeat.o(98911);
  }

  public void a(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(98910);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
      AppMethodBeat.o(98910);
    while (true)
    {
      return;
      if ((this.e == null) || (this.e.length == 0))
      {
        a(new fg[] { fg.a(0, null, paramArrayOfObject) });
        AppMethodBeat.o(98910);
      }
      else
      {
        this.e[0].a(paramArrayOfObject);
        AppMethodBeat.o(98910);
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(98914);
    String str1 = "ValueAnimator@" + Integer.toHexString(hashCode());
    String str2 = str1;
    if (this.e != null)
      for (int i1 = 0; ; i1++)
      {
        str2 = str1;
        if (i1 >= this.e.length)
          break;
        str1 = str1 + "\n    " + this.e[i1].toString();
      }
    AppMethodBeat.o(98914);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fj
 * JD-Core Version:    0.6.2
 */