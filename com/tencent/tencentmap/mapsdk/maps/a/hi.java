package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class hi<E>
{
  private int a;
  private volatile Object[] b;
  private volatile int c;
  private volatile int d;

  public hi(int paramInt)
  {
    AppMethodBeat.i(99539);
    this.a = paramInt;
    this.b = new Object[paramInt];
    this.d = 0;
    this.c = 0;
    AppMethodBeat.o(99539);
  }

  private void e()
  {
    this.d = 0;
    this.c = 0;
  }

  public E a()
  {
    Object localObject = null;
    AppMethodBeat.i(99541);
    if (d())
      AppMethodBeat.o(99541);
    while (true)
    {
      return localObject;
      this.c %= this.a;
      localObject = this.b[this.c];
      this.b[this.c] = null;
      this.c += 1;
      AppMethodBeat.o(99541);
    }
  }

  public boolean a(E paramE)
  {
    AppMethodBeat.i(99540);
    boolean bool;
    if (c())
    {
      bool = false;
      AppMethodBeat.o(99540);
    }
    while (true)
    {
      return bool;
      this.d %= this.a;
      Object[] arrayOfObject = this.b;
      int i = this.d;
      this.d = (i + 1);
      arrayOfObject[i] = paramE;
      bool = true;
      AppMethodBeat.o(99540);
    }
  }

  public void b()
  {
    AppMethodBeat.i(99542);
    e();
    for (int i = 0; i < this.b.length; i++)
      this.b[i] = null;
    AppMethodBeat.o(99542);
  }

  public boolean c()
  {
    if ((this.d + 1) % this.a == this.c);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean d()
  {
    if (this.d == this.c);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hi
 * JD-Core Version:    0.6.2
 */