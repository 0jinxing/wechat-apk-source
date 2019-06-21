package com.tencent.mm.plugin.multitalk.model;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class e
{
  public static int oFV = 0;
  public static int oFW = 0;
  public static int oFX = 0;
  public static int oFY = 0;
  public static int oFZ = 0;

  public static final void Sh(String paramString)
  {
    AppMethodBeat.i(53919);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkTalkFunction %s %d %d %d %d %d", new Object[] { paramString, Integer.valueOf(oFV), Integer.valueOf(oFW), Integer.valueOf(oFX), Integer.valueOf(oFY), Integer.valueOf(oFZ) });
    h.pYm.e(12729, new Object[] { paramString, Integer.valueOf(oFV), Integer.valueOf(oFW), Integer.valueOf(oFX), Integer.valueOf(oFY), Integer.valueOf(oFZ) });
    eC(9, oFV);
    eC(10, oFZ);
    eC(11, oFW);
    eC(12, oFX);
    eC(13, oFY);
    oFV = 0;
    oFW = 0;
    oFX = 0;
    oFY = 0;
    oFZ = 0;
    AppMethodBeat.o(53919);
  }

  public static final void a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(53917);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkSelectContact %d %b %d %s %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramInt3) });
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      h.pYm.e(12727, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt3) });
      AppMethodBeat.o(53917);
      return;
    }
  }

  public static final void a(boolean paramBoolean, long paramLong, String paramString)
  {
    AppMethodBeat.i(53911);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectSuccess %b %d %s", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong), paramString });
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      h.pYm.e(12725, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Long.valueOf(paramLong), paramString });
      AppMethodBeat.o(53911);
      return;
    }
  }

  public static final void a(boolean paramBoolean, long paramLong, String paramString, int paramInt)
  {
    AppMethodBeat.i(53912);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkConnectFail %b %d %s %d", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) });
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      h.pYm.e(12725, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(53912);
      return;
    }
  }

  public static final void aR(int paramInt, String paramString)
  {
    AppMethodBeat.i(53915);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkReceiveCall %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    h.pYm.e(12723, new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(53915);
  }

  public static final void bRA()
  {
    AppMethodBeat.i(53932);
    h.pYm.e(14849, new Object[] { Integer.valueOf(6) });
    AppMethodBeat.o(53932);
  }

  public static final void bRB()
  {
    AppMethodBeat.i(53933);
    h.pYm.e(14849, new Object[] { Integer.valueOf(7) });
    AppMethodBeat.o(53933);
  }

  public static final void bRC()
  {
    AppMethodBeat.i(53934);
    h.pYm.e(14849, new Object[] { Integer.valueOf(8) });
    AppMethodBeat.o(53934);
  }

  public static final void bRD()
  {
    AppMethodBeat.i(53935);
    h.pYm.e(14849, new Object[] { Integer.valueOf(9) });
    AppMethodBeat.o(53935);
  }

  public static final void bRE()
  {
    AppMethodBeat.i(53936);
    h.pYm.e(14849, new Object[] { Integer.valueOf(10) });
    AppMethodBeat.o(53936);
  }

  public static final void bRr()
  {
    AppMethodBeat.i(53913);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailSuccess");
    h.pYm.e(12722, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(53913);
  }

  public static final void bRs()
  {
    AppMethodBeat.i(53914);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkDailFail");
    h.pYm.e(12722, new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(53914);
  }

  public static final void bRt()
  {
    AppMethodBeat.i(53921);
    h.pYm.a(220L, 0L, 1L, false);
    AppMethodBeat.o(53921);
  }

  public static final void bRu()
  {
    AppMethodBeat.i(53923);
    h.pYm.a(220L, 1L, 1L, false);
    AppMethodBeat.o(53923);
  }

  public static final void bRv()
  {
    AppMethodBeat.i(53927);
    h.pYm.e(14849, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(53927);
  }

  public static final void bRw()
  {
    AppMethodBeat.i(53928);
    h.pYm.e(14849, new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(53928);
  }

  public static final void bRx()
  {
    AppMethodBeat.i(53929);
    h.pYm.e(14849, new Object[] { Integer.valueOf(3) });
    AppMethodBeat.o(53929);
  }

  public static final void bRy()
  {
    AppMethodBeat.i(53930);
    h.pYm.e(14849, new Object[] { Integer.valueOf(4) });
    AppMethodBeat.o(53930);
  }

  public static final void bRz()
  {
    AppMethodBeat.i(53931);
    h.pYm.e(14849, new Object[] { Integer.valueOf(5) });
    AppMethodBeat.o(53931);
  }

  private static void eC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53926);
    h.pYm.a(220L, paramInt1, paramInt2, false);
    AppMethodBeat.o(53926);
  }

  public static final void f(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(53920);
    if ((paramBoolean1) && (paramBoolean2))
    {
      h.pYm.e(12917, new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(1) });
      AppMethodBeat.o(53920);
    }
    while (true)
    {
      return;
      if (paramBoolean1)
      {
        h.pYm.e(12917, new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(2) });
        AppMethodBeat.o(53920);
      }
      else if (paramBoolean2)
      {
        h.pYm.e(12917, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(1) });
        AppMethodBeat.o(53920);
      }
      else
      {
        h.pYm.e(12917, new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(2) });
        AppMethodBeat.o(53920);
      }
    }
  }

  public static final void jl(boolean paramBoolean)
  {
    AppMethodBeat.i(53922);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(3);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(220);
      localIDKey.SetKey(4);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    h.pYm.b(localArrayList, false);
    AppMethodBeat.o(53922);
  }

  public static final void jm(boolean paramBoolean)
  {
    AppMethodBeat.i(53924);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(5);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    if (paramBoolean)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(220);
      localIDKey.SetKey(6);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    h.pYm.b(localArrayList, false);
    AppMethodBeat.o(53924);
  }

  public static final void q(long paramLong, String paramString)
  {
    AppMethodBeat.i(53916);
    ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMutliTalkDuration %d %s", new Object[] { Long.valueOf(paramLong), paramString });
    h.pYm.e(12726, new Object[] { Long.valueOf(paramLong), paramString });
    AppMethodBeat.o(53916);
  }

  public static final void r(long paramLong, String paramString)
  {
    AppMethodBeat.i(53918);
    if (paramLong > 1000L);
    for (paramLong /= 1000L; ; paramLong = 1L)
    {
      ab.v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkVideoDuration %d %s", new Object[] { Long.valueOf(paramLong), paramString });
      h.pYm.e(12728, new Object[] { Long.valueOf(paramLong), paramString });
      AppMethodBeat.o(53918);
      return;
    }
  }

  public static final void zd(int paramInt)
  {
    AppMethodBeat.i(53925);
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(7);
    localIDKey.SetValue(paramInt);
    localArrayList.add(localIDKey);
    localIDKey = new IDKey();
    localIDKey.SetID(220);
    localIDKey.SetKey(8);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    h.pYm.b(localArrayList, false);
    AppMethodBeat.o(53925);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.e
 * JD-Core Version:    0.6.2
 */