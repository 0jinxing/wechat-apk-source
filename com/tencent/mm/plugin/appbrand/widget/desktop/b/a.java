package com.tencent.mm.plugin.appbrand.widget.desktop.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements b
{
  private List<Double> jbt;
  public double jbu;
  public double jbv;
  public double jbw;

  public a()
  {
    AppMethodBeat.i(134236);
    this.jbt = new ArrayList(100);
    this.jbu = 0.0D;
    this.jbv = 1.7976931348623157E+308D;
    this.jbw = 4.9E-324D;
    AppMethodBeat.o(134236);
  }

  public final void Pw()
  {
    AppMethodBeat.i(134237);
    if (this.jbt == null)
      AppMethodBeat.o(134237);
    while (true)
    {
      return;
      if (this.jbt.size() > 10000)
      {
        AppMethodBeat.o(134237);
      }
      else
      {
        if (this.jbt.size() != 0)
        {
          Iterator localIterator = this.jbt.iterator();
          double d2;
          for (double d1 = 0.0D; localIterator.hasNext(); d1 += d2)
          {
            d2 = ((Double)localIterator.next()).doubleValue();
            this.jbv = Math.min(this.jbv, d2);
            this.jbw = Math.max(this.jbw, d2);
          }
          this.jbu = (d1 / this.jbt.size());
        }
        AppMethodBeat.o(134237);
      }
    }
  }

  public final void Px()
  {
    double d1 = 60.0D;
    double d2 = 0.0D;
    AppMethodBeat.i(134238);
    double d3 = c.jbx.eCK;
    if (d3 > 60.0D);
    while (true)
    {
      if (d1 < 0.0D)
        d1 = d2;
      while (true)
      {
        this.jbt.add(Double.valueOf(d1));
        AppMethodBeat.o(134238);
        return;
      }
      d1 = d3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.b.a
 * JD-Core Version:    0.6.2
 */