package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Typeface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dk
{
  private final List<db> a;
  private float b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private String h;
  private int i;
  private Typeface j;
  private int k;
  private int l;
  private int m;
  private int n;

  public dk()
  {
    AppMethodBeat.i(101056);
    this.h = "";
    this.i = -16777216;
    this.j = Typeface.DEFAULT;
    this.k = 2147483647;
    this.l = 1;
    this.m = -1;
    this.n = di.c;
    this.b = 1.0F;
    this.c = -16777216;
    this.d = ic.k;
    this.e = 0;
    this.f = true;
    this.g = false;
    this.a = new ArrayList();
    AppMethodBeat.o(101056);
  }

  public dk a(float paramFloat)
  {
    if (paramFloat < 0.0F);
    for (this.b = 1.0F; ; this.b = paramFloat)
      return this;
  }

  public dk a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }

  public dk a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    return this;
  }

  public List<db> a()
  {
    return this.a;
  }

  public void a(Iterable<db> paramIterable)
  {
    AppMethodBeat.i(101057);
    if (this.a == null)
      AppMethodBeat.o(101057);
    while (true)
    {
      return;
      this.a.clear();
      if (paramIterable == null)
      {
        AppMethodBeat.o(101057);
      }
      else
      {
        b(paramIterable);
        AppMethodBeat.o(101057);
      }
    }
  }

  public float b()
  {
    return this.b;
  }

  public dk b(int paramInt)
  {
    this.d = paramInt;
    return this;
  }

  public dk b(Iterable<db> paramIterable)
  {
    AppMethodBeat.i(101058);
    if (paramIterable != null)
    {
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext())
      {
        paramIterable = (db)localIterator.next();
        this.a.add(paramIterable);
      }
    }
    AppMethodBeat.o(101058);
    return this;
  }

  public int c()
  {
    return this.c;
  }

  public dk c(int paramInt)
  {
    this.e = paramInt;
    return this;
  }

  public int d()
  {
    return this.d;
  }

  public dk d(int paramInt)
  {
    if ((paramInt < di.a) || (paramInt > di.c));
    while (true)
    {
      return this;
      this.n = paramInt;
    }
  }

  public float e()
  {
    return this.e;
  }

  public boolean f()
  {
    return this.f;
  }

  public String g()
  {
    return this.h;
  }

  public int h()
  {
    return this.n;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dk
 * JD-Core Version:    0.6.2
 */