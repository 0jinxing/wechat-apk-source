package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class gs$a
  implements Cloneable
{
  private float a = 3.051758E-005F;
  private float b = 4.0F;
  private int c = 3;
  private int d = 20;
  private float e;
  private int f;

  float a()
  {
    return this.e;
  }

  float a(int paramInt)
  {
    return 1.907349E-006F * (1 << paramInt - 1);
  }

  public void a(float paramFloat)
  {
    this.e = paramFloat;
  }

  public void a(int paramInt, float paramFloat)
  {
    this.e = paramFloat;
    this.f = paramInt;
  }

  void a(a parama)
  {
    this.a = parama.a;
    this.b = parama.b;
    this.c = parama.c;
    this.d = parama.d;
    this.e = parama.e;
    this.f = parama.f;
  }

  int b()
  {
    return this.f;
  }

  void b(float paramFloat)
  {
    AppMethodBeat.i(99447);
    a locala = new a();
    this.c = locala.b();
    this.a = (paramFloat / locala.c());
    AppMethodBeat.o(99447);
  }

  void b(int paramInt)
  {
    this.d = paramInt;
  }

  float c()
  {
    AppMethodBeat.i(99448);
    float f1 = this.e / a(this.f);
    AppMethodBeat.o(99448);
    return f1;
  }

  public Object clone()
  {
    AppMethodBeat.i(99451);
    Object localObject = super.clone();
    AppMethodBeat.o(99451);
    return localObject;
  }

  int d()
  {
    return this.c;
  }

  int e()
  {
    return this.d;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!(paramObject instanceof a))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      paramObject = (a)paramObject;
      bool2 = bool1;
      if (this.e == paramObject.e)
      {
        bool2 = bool1;
        if (this.f == paramObject.f)
          bool2 = true;
      }
    }
  }

  int f()
  {
    return 20;
  }

  float g()
  {
    return this.a;
  }

  public int hashCode()
  {
    AppMethodBeat.i(99449);
    int i = toString().hashCode();
    AppMethodBeat.o(99449);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(99450);
    String str = "scale:" + this.e + ", scaleLevel:" + this.f;
    AppMethodBeat.o(99450);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gs.a
 * JD-Core Version:    0.6.2
 */