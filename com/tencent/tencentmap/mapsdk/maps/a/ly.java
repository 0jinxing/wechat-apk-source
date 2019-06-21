package com.tencent.tencentmap.mapsdk.maps.a;

public abstract class ly<T>
  implements lw<T>, lz
{
  private final mg a;
  private final ly<?> b;
  private lx c;
  private long d = -9223372036854775808L;

  protected ly()
  {
    this(null, false);
  }

  protected ly(ly<?> paramly)
  {
    this(paramly, true);
  }

  protected ly(ly<?> paramly, boolean paramBoolean)
  {
    this.b = paramly;
    if ((paramBoolean) && (paramly != null));
    for (paramly = paramly.a; ; paramly = new mg())
    {
      this.a = paramly;
      return;
    }
  }

  public void a(lx paramlx)
  {
    int i = 0;
    while (true)
    {
      long l;
      try
      {
        l = this.d;
        this.c = paramlx;
        int j = i;
        if (this.b != null)
        {
          j = i;
          if (l == -9223372036854775808L)
            j = 1;
        }
        if (j != 0)
        {
          this.b.a(this.c);
          return;
        }
      }
      finally
      {
      }
      if (l == -9223372036854775808L)
        this.c.a(9223372036854775807L);
      else
        this.c.a(l);
    }
  }

  public final void b()
  {
    this.a.b();
  }

  public final boolean c()
  {
    return this.a.a();
  }

  public void d()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ly
 * JD-Core Version:    0.6.2
 */