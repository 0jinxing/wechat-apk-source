package com.tencent.mm.graphics.b;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
  implements a
{
  private Context eCA;
  private List<Double> eCB;
  private int eCC;
  public double eCD;
  public double eCE;
  public double eCF;
  public double eCG;
  public double eCH;

  static
  {
    AppMethodBeat.i(57079);
    if (!b.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(57079);
      return;
    }
  }

  public b(Context paramContext)
  {
    AppMethodBeat.i(57075);
    this.eCB = new ArrayList(100);
    this.eCC = 0;
    this.eCD = 0.0D;
    this.eCE = 0.0D;
    this.eCF = 2147483647.0D;
    this.eCG = 0.0D;
    this.eCH = 0.0D;
    this.eCA = paramContext;
    this.eCD = bK(paramContext);
    ab.v("MicroMsg.MemoryRecord", "hy: init mem to " + this.eCD);
    AppMethodBeat.o(57075);
  }

  private static double bK(Context paramContext)
  {
    AppMethodBeat.i(57078);
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    paramContext = new ActivityManager.MemoryInfo();
    if ((!$assertionsDisabled) && (localActivityManager == null))
    {
      paramContext = new AssertionError();
      AppMethodBeat.o(57078);
      throw paramContext;
    }
    localActivityManager.getMemoryInfo(paramContext);
    double d = (paramContext.totalMem - paramContext.availMem) / 1024.0D / 1024.0D;
    AppMethodBeat.o(57078);
    return d;
  }

  public final void Pw()
  {
    AppMethodBeat.i(57076);
    this.eCC = this.eCB.size();
    if (this.eCC == 0)
    {
      ab.w("MicroMsg.MemoryRecord", "hy: check frames 0!");
      AppMethodBeat.o(57076);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.eCB.iterator();
      Double localDouble1 = Double.valueOf(0.0D);
      Double localDouble2;
      while (localIterator.hasNext())
      {
        localDouble2 = (Double)localIterator.next();
        localDouble1 = Double.valueOf(localDouble1.doubleValue() + localDouble2.doubleValue());
        this.eCE = Math.max(this.eCE, localDouble2.doubleValue());
        this.eCF = Math.min(this.eCF, localDouble2.doubleValue());
      }
      localDouble1 = Double.valueOf(localDouble1.doubleValue() / this.eCC);
      this.eCH = (localDouble1.doubleValue() - this.eCD);
      this.eCE -= this.eCD;
      this.eCF -= this.eCD;
      localIterator = this.eCB.iterator();
      double d;
      for (long l = 0L; localIterator.hasNext(); l = ()(Math.pow(localDouble2.doubleValue() - localDouble1.doubleValue(), 2.0D) + d))
      {
        localDouble2 = (Double)localIterator.next();
        d = l;
      }
      this.eCG = Math.sqrt(l / this.eCC);
      AppMethodBeat.o(57076);
    }
  }

  public final void Px()
  {
    AppMethodBeat.i(57077);
    if (this.eCB == null)
      AppMethodBeat.o(57077);
    while (true)
    {
      return;
      if (this.eCB.size() > 10000)
      {
        AppMethodBeat.o(57077);
      }
      else
      {
        if (this.eCA != null)
        {
          double d = bK(this.eCA);
          this.eCD = Math.min(d, this.eCD);
          if (this.eCD == d)
            ab.v("MicroMsg.MemoryRecord", "hy: updating min mem to " + this.eCD);
          this.eCB.add(Double.valueOf(d));
        }
        AppMethodBeat.o(57077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.b.b
 * JD-Core Version:    0.6.2
 */