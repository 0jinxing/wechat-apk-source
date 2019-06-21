package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public final class dc$a
{
  private double a = (1.0D / 0.0D);
  private double b = (-1.0D / 0.0D);
  private double c = (0.0D / 0.0D);
  private double d = (0.0D / 0.0D);

  private boolean a(double paramDouble)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.c <= this.d)
      if ((this.c <= paramDouble) && (paramDouble <= this.d))
        bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = false;
      continue;
      bool2 = bool1;
      if (this.c > paramDouble)
      {
        bool2 = bool1;
        if (paramDouble > this.d)
          bool2 = false;
      }
    }
  }

  public final a a(db paramdb)
  {
    AppMethodBeat.i(100991);
    this.a = Math.min(this.a, paramdb.a);
    this.b = Math.max(this.b, paramdb.a);
    double d1 = paramdb.b;
    if (Double.isNaN(this.c))
    {
      this.c = d1;
      this.d = d1;
    }
    while (true)
    {
      AppMethodBeat.o(100991);
      return this;
      if (!a(d1))
      {
        if (dc.a(this.c, d1) >= dc.b(this.d, d1))
          break;
        this.c = d1;
      }
    }
  }

  public final a a(Iterable<db> paramIterable)
  {
    AppMethodBeat.i(100992);
    if (paramIterable != null)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
        a((db)paramIterable.next());
    }
    AppMethodBeat.o(100992);
    return this;
  }

  public final dc a()
  {
    AppMethodBeat.i(100993);
    dc localdc = new dc(new db(this.a, this.c), new db(this.b, this.d));
    AppMethodBeat.o(100993);
    return localdc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dc.a
 * JD-Core Version:    0.6.2
 */