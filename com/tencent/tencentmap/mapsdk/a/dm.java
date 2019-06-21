package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class dm
{
  private static String A = "color_texture_flat_style.png";
  private boolean B;
  private dm.a C;
  private cx D;
  private int E;
  private int F;
  private final List<db> a;
  private float b;
  private float c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private float j;
  private boolean k;
  private ck l;
  private List<Integer> m;
  private int[] n;
  private int[] o;
  private int[] p;
  private int q;
  private int r;

  @Deprecated
  private String s;
  private cm t;
  private boolean u;
  private int v;
  private boolean w;
  private List<db> x;
  private boolean y;
  private cm z;

  public dm()
  {
    AppMethodBeat.i(101083);
    this.i = false;
    this.n = null;
    this.o = new int[] { -16711936 };
    this.p = null;
    this.q = -7829368;
    this.r = 0;
    this.s = A;
    this.t = cn.a(A);
    this.u = false;
    this.v = 0;
    this.w = true;
    this.y = false;
    this.z = null;
    this.C = dm.a.a;
    this.E = di.a;
    this.F = 100;
    this.b = -1.0F;
    this.d = ic.k;
    this.f = true;
    this.g = false;
    this.a = new ArrayList();
    this.j = 1.0F;
    this.k = false;
    this.v = 0;
    this.e = 0;
    this.x = new ArrayList();
    AppMethodBeat.o(101083);
  }

  public int a()
  {
    return this.v;
  }

  public dm a(float paramFloat)
  {
    if (paramFloat < 0.0F);
    for (this.b = 9.0F; ; this.b = paramFloat)
      return this;
  }

  public dm a(int paramInt)
  {
    this.d = paramInt;
    return this;
  }

  public dm a(cm paramcm)
  {
    this.t = paramcm;
    this.C = dm.a.b;
    return this;
  }

  public dm a(cx paramcx)
  {
    if (paramcx != null)
    {
      this.D = paramcx;
      this.i = true;
    }
    return this;
  }

  public dm a(db paramdb, db[] paramArrayOfdb)
  {
    AppMethodBeat.i(101086);
    this.a.add(paramdb);
    if (paramArrayOfdb != null)
      a(paramArrayOfdb);
    AppMethodBeat.o(101086);
    return this;
  }

  public dm a(Iterable<db> paramIterable)
  {
    AppMethodBeat.i(101088);
    if (paramIterable != null)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
        a((db)paramIterable.next(), new db[0]);
    }
    AppMethodBeat.o(101088);
    return this;
  }

  public dm a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    return this;
  }

  public dm a(db[] paramArrayOfdb)
  {
    AppMethodBeat.i(101087);
    if (paramArrayOfdb != null)
      this.a.addAll(Arrays.asList(paramArrayOfdb));
    AppMethodBeat.o(101087);
    return this;
  }

  @Deprecated
  public void a(List<db> paramList)
  {
    AppMethodBeat.i(101084);
    b(paramList);
    AppMethodBeat.o(101084);
  }

  public dm b(float paramFloat)
  {
    if (paramFloat < 0.0F);
    for (this.c = 1.0F; ; this.c = paramFloat)
      return this;
  }

  public dm b(int paramInt)
  {
    this.o = new int[] { paramInt };
    return this;
  }

  public dm b(cm paramcm)
  {
    this.z = paramcm;
    return this;
  }

  public dm b(List<db> paramList)
  {
    AppMethodBeat.i(101085);
    if (paramList != null)
    {
      this.a.clear();
      this.a.addAll(paramList);
    }
    AppMethodBeat.o(101085);
    return this;
  }

  public dm b(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }

  public List<db> b()
  {
    return this.x;
  }

  public dm.a c()
  {
    return this.C;
  }

  public dm c(int paramInt)
  {
    this.q = paramInt;
    return this;
  }

  public dm c(List<Integer> paramList)
  {
    this.m = paramList;
    return this;
  }

  public int d()
  {
    return this.q;
  }

  public dm d(int paramInt)
  {
    AppMethodBeat.i(101089);
    this.e = Math.max(0, paramInt);
    AppMethodBeat.o(101089);
    return this;
  }

  public dm e(int paramInt)
  {
    this.r = paramInt;
    return this;
  }

  public List<db> e()
  {
    return this.a;
  }

  public float f()
  {
    return this.b;
  }

  public dm f(int paramInt)
  {
    if ((paramInt < di.a) || (paramInt > di.c));
    while (true)
    {
      return this;
      this.E = paramInt;
    }
  }

  public int g()
  {
    return this.d;
  }

  public dm g(int paramInt)
  {
    this.F = paramInt;
    return this;
  }

  public int[][] h()
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (this.n != null)
    {
      if (this.p != null)
        break label22;
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      label22: localObject2 = localObject1;
      if (this.n.length == this.p.length)
      {
        int i1 = this.n.length;
        localObject2 = new int[2][i1];
        localObject2[0] = this.n;
        localObject2[1] = this.p;
      }
    }
  }

  public int i()
  {
    return this.e;
  }

  public cx j()
  {
    return this.D;
  }

  public boolean k()
  {
    return this.f;
  }

  public boolean l()
  {
    return this.h;
  }

  public boolean m()
  {
    return this.i;
  }

  public float n()
  {
    return this.j;
  }

  public boolean o()
  {
    return this.k;
  }

  public ck p()
  {
    return this.l;
  }

  public int q()
  {
    return this.r;
  }

  public cm r()
  {
    return this.t;
  }

  public boolean s()
  {
    return this.w;
  }

  public int t()
  {
    return this.E;
  }

  public cm u()
  {
    return this.z;
  }

  public int v()
  {
    return this.F;
  }

  public boolean w()
  {
    return this.B;
  }

  public List<Integer> x()
  {
    return this.m;
  }

  public float y()
  {
    return this.c;
  }

  public int[] z()
  {
    return this.o;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dm
 * JD-Core Version:    0.6.2
 */