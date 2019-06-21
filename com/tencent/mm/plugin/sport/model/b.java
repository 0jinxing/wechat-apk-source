package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.g.a.fp.a;
import com.tencent.mm.g.a.fp.b;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bs;
import java.util.Calendar;
import org.json.JSONObject;

public final class b
{
  public c<sd> rPb;
  public f rPc;
  public c rPh;
  private long rPi;
  private long rPj;

  public b()
  {
    AppMethodBeat.i(93645);
    this.rPh = new b.1(this);
    this.rPb = new c()
    {
    };
    this.rPh.dnU();
    this.rPb.dnU();
    AppMethodBeat.o(93645);
  }

  private void kU(long paramLong)
  {
    AppMethodBeat.i(93648);
    this.rPi = paramLong;
    k.ab(515, paramLong);
    AppMethodBeat.o(93648);
  }

  private void kV(long paramLong)
  {
    AppMethodBeat.i(93650);
    this.rPj = paramLong;
    k.aa(516, this.rPj);
    AppMethodBeat.o(93650);
  }

  public final long cwi()
  {
    AppMethodBeat.i(93649);
    if (this.rPj == 0L)
      this.rPj = k.aa(516, 0L);
    long l = this.rPj;
    AppMethodBeat.o(93649);
    return l;
  }

  final boolean i(com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(93646);
    paramb = (fp)paramb;
    switch (paramb.czu.action)
    {
    default:
    case 3:
      while (true)
      {
        AppMethodBeat.o(93646);
        return true;
        try
        {
          JSONObject localJSONObject1 = h.cwt().optJSONObject("extStepApiConfig");
          if (localJSONObject1 != null)
            paramb.czv.czy = localJSONObject1.toString();
          if (bo.isNullOrNil(paramb.czv.czy));
          for (paramb.czv.czA = 3905; ; paramb.czv.czA = 1)
          {
            paramb.czv.czz = true;
            break;
          }
        }
        catch (Exception localException)
        {
          while (true)
            paramb.czv.czA = 3905;
        }
      }
    case 2:
    }
    long l1 = paramb.czu.czx;
    long l2 = System.currentTimeMillis();
    long l3 = paramb.czu.baZ;
    fp.b localb = paramb.czv;
    int i;
    if (!n.cvY())
      i = 3906;
    while (true)
    {
      localb.czA = i;
      if (paramb.czv.czA == 1)
      {
        if (this.rPi == 0L)
          this.rPi = k.aa(515, 0L);
        boolean bool1 = n.Y(this.rPi, System.currentTimeMillis());
        boolean bool2 = n.Z(cwi(), l1);
        if ((bool1) && (bool2))
          kT(l1);
      }
      paramb.czv.czz = true;
      break;
      if (!n.cwF())
      {
        i = 3902;
      }
      else
      {
        long l4 = k.aa(513, 0L);
        long l5 = k.aa(512, 0L);
        ab.v("MicroMsg.Sport.ExtApiStepManager", "lastUpdateTime:%d lastUpdateStep:%d newUpdateTime:%d newUpdateStep:%d", new Object[] { Long.valueOf(l4), Long.valueOf(l5), Long.valueOf(l2), Long.valueOf(l1) });
        if (l2 - l4 < 300000L)
        {
          ab.w("MicroMsg.Sport.ExtApiStepManager", "update interval must larger than 5 minute");
          i = 3903;
        }
        else
        {
          JSONObject localJSONObject2 = h.cwt();
          long l6 = l4;
          if (!bo.L(l2, l4))
          {
            l6 = bo.dpC();
            l5 = 0L;
          }
          l4 = l2 - l6;
          long l7 = l4 / 300000L;
          if (l4 % 300000L > 0L);
          for (i = 1; ; i = 0)
          {
            long l8 = l7 + i;
            l7 = localJSONObject2.optInt("stepCounterMaxStep5m") * l8;
            ab.v("MicroMsg.Sport.ExtApiStepManager", "interval5m %d intervalTime %d newUpdateTime:%d compareUpdateTime:%d maxIncreaseStep:%d", new Object[] { Long.valueOf(l8), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l6), Long.valueOf(l7) });
            l6 = l1 - l5;
            if ((l6 >= 0L) && (l6 <= l7))
              break label545;
            ab.w("MicroMsg.Sport.ExtApiStepManager", "invalid step in 5 minute actual: %d max: %d", new Object[] { Long.valueOf(l6), Long.valueOf(l7) });
            i = 3904;
            break;
          }
          label545: ab.i("MicroMsg.Sport.ExtApiStepManager", "can update time: %s, step: %d", new Object[] { n.fQ(l2), Long.valueOf(l1) });
          k.ab(513, l2);
          k.ab(512, l1);
          k.ab(514, l3);
          i = 1;
        }
      }
    }
  }

  final boolean kT(long paramLong)
  {
    AppMethodBeat.i(93647);
    if (this.rPc != null)
      g.Rg().c(this.rPc);
    long l = System.currentTimeMillis();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    ab.i("MicroMsg.Sport.ExtApiStepManager", "update Api Step time: %s stepCount: %s", new Object[] { n.fQ(l), Long.valueOf(paramLong) });
    this.rPc = new f("", "gh_43f2581f6fd6", (int)(localCalendar.getTimeInMillis() / 1000L), (int)(l / 1000L), (int)paramLong, bs.dut(), 2);
    g.Rg().a(this.rPc, 0);
    kU(l);
    kV(paramLong);
    AppMethodBeat.o(93647);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.b
 * JD-Core Version:    0.6.2
 */