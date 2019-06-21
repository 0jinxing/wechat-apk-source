package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends h
  implements Iterable<h>
{
  public final List<h> aCy;

  public b()
  {
    AppMethodBeat.i(70500);
    this.aCy = new ArrayList();
    AppMethodBeat.o(70500);
  }

  public final b U(float paramFloat)
  {
    AppMethodBeat.i(70503);
    this.aCy.add(a.T(paramFloat));
    AppMethodBeat.o(70503);
    return this;
  }

  public final b a(int paramInt, h paramh)
  {
    AppMethodBeat.i(70512);
    if (paramh == null)
    {
      paramh = new NullPointerException("value is null");
      AppMethodBeat.o(70512);
      throw paramh;
    }
    this.aCy.set(paramInt, paramh);
    AppMethodBeat.o(70512);
    return this;
  }

  public final b a(h paramh)
  {
    AppMethodBeat.i(70507);
    if (paramh == null)
    {
      paramh = new NullPointerException("value is null");
      AppMethodBeat.o(70507);
      throw paramh;
    }
    this.aCy.add(paramh);
    AppMethodBeat.o(70507);
    return this;
  }

  final void a(i parami)
  {
    AppMethodBeat.i(70515);
    parami.pr();
    Iterator localIterator = iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      if (i == 0)
        parami.pt();
      ((h)localIterator.next()).a(parami);
    }
    parami.ps();
    AppMethodBeat.o(70515);
  }

  public final b aC(boolean paramBoolean)
  {
    AppMethodBeat.i(70505);
    this.aCy.add(a.aB(paramBoolean));
    AppMethodBeat.o(70505);
    return this;
  }

  public final b aX(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70508);
    this.aCy.set(paramInt1, a.dr(paramInt2));
    AppMethodBeat.o(70508);
    return this;
  }

  public final b aj(String paramString)
  {
    AppMethodBeat.i(70506);
    this.aCy.add(a.ag(paramString));
    AppMethodBeat.o(70506);
    return this;
  }

  public final b b(int paramInt, double paramDouble)
  {
    AppMethodBeat.i(70510);
    this.aCy.set(paramInt, a.m(paramDouble));
    AppMethodBeat.o(70510);
    return this;
  }

  public final b ds(int paramInt)
  {
    AppMethodBeat.i(70501);
    this.aCy.add(a.dr(paramInt));
    AppMethodBeat.o(70501);
    return this;
  }

  public final h dt(int paramInt)
  {
    AppMethodBeat.i(70513);
    h localh = (h)this.aCy.get(paramInt);
    AppMethodBeat.o(70513);
    return localh;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(70517);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(70517);
    }
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(70517);
      }
      else if (getClass() != paramObject.getClass())
      {
        AppMethodBeat.o(70517);
      }
      else
      {
        paramObject = (b)paramObject;
        bool = this.aCy.equals(paramObject.aCy);
        AppMethodBeat.o(70517);
      }
    }
  }

  public final b f(int paramInt, long paramLong)
  {
    AppMethodBeat.i(70509);
    this.aCy.set(paramInt, a.t(paramLong));
    AppMethodBeat.o(70509);
    return this;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(70516);
    int i = this.aCy.hashCode();
    AppMethodBeat.o(70516);
    return i;
  }

  public final boolean isArray()
  {
    return true;
  }

  public final Iterator<h> iterator()
  {
    AppMethodBeat.i(70514);
    b.1 local1 = new b.1(this, this.aCy.iterator());
    AppMethodBeat.o(70514);
    return local1;
  }

  public final b n(double paramDouble)
  {
    AppMethodBeat.i(70504);
    this.aCy.add(a.m(paramDouble));
    AppMethodBeat.o(70504);
    return this;
  }

  public final b oN()
  {
    return this;
  }

  public final b p(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(70511);
    this.aCy.set(paramInt, a.aB(paramBoolean));
    AppMethodBeat.o(70511);
    return this;
  }

  public final b u(long paramLong)
  {
    AppMethodBeat.i(70502);
    this.aCy.add(a.t(paramLong));
    AppMethodBeat.o(70502);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.b
 * JD-Core Version:    0.6.2
 */