package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class h
{
  private static Map<Long, Long> meR;
  private static Map<Long, Long> meS;

  static
  {
    AppMethodBeat.i(102657);
    meR = new HashMap();
    meS = new HashMap();
    AppMethodBeat.o(102657);
  }

  public static String a(h.a parama)
  {
    int i = 1;
    AppMethodBeat.i(102654);
    String str = parama.toString();
    ab.v("MicroMsg.Fav.FavReportApiLogic", "reportDetailObj %s", new Object[] { str });
    e.pXa.X(15098, str);
    int j = parama.scene;
    int k = parama.index;
    long l1 = parama.meT;
    int m = parama.type;
    str = parama.meU;
    int n = parama.cvd;
    long l2 = parama.timestamp;
    long l3 = parama.meV;
    long l4 = parama.meW;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    if (parama.meX)
    {
      i1 = 1;
      i2 = parama.meY;
      i3 = parama.meZ;
      i4 = parama.mfa;
      i5 = parama.mfb;
      i6 = parama.mfc;
      if (!parama.mfd)
        break label322;
      i7 = 1;
      label139: if (!parama.mfe)
        break label328;
    }
    while (true)
    {
      parama = String.format("scene[%s],index[%s],favId[%s],type[%s],infoLength[%s],source[%s],timestamp[%s],detailPeriod[%s],subDetailPeriod[%s],needOpenOtherApp[%s],subDetailCount[%s],shareFriendCount[%s],shareSnsCount[%s],editContentCount[%s],editTagCount[%s],isDelete[%s],isScrollBottom[%s],subScene[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), Integer.valueOf(m), str, Integer.valueOf(n), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i), Integer.valueOf(parama.jSW) });
      AppMethodBeat.o(102654);
      return parama;
      i1 = 0;
      break;
      label322: i7 = 0;
      break label139;
      label328: i = 0;
    }
  }

  public static int ed(int paramInt1, int paramInt2)
  {
    if (paramInt2 == -401)
      paramInt1 = -4;
    while (true)
    {
      return paramInt1;
      if (paramInt1 == 4)
        paramInt1 = -2;
      else
        paramInt1 = -1;
    }
  }

  public static void iw(long paramLong)
  {
    AppMethodBeat.i(102651);
    if (meR.containsKey(Long.valueOf(paramLong)))
      AppMethodBeat.o(102651);
    while (true)
    {
      return;
      meR.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(102651);
    }
  }

  public static long ix(long paramLong)
  {
    AppMethodBeat.i(102652);
    Long localLong = (Long)meR.get(Long.valueOf(paramLong));
    if (localLong == null)
    {
      paramLong = -1L;
      AppMethodBeat.o(102652);
    }
    while (true)
    {
      return paramLong;
      paramLong = System.currentTimeMillis() - localLong.longValue();
      AppMethodBeat.o(102652);
    }
  }

  public static void iy(long paramLong)
  {
    AppMethodBeat.i(102653);
    if (meS.containsKey(Long.valueOf(paramLong)))
      AppMethodBeat.o(102653);
    while (true)
    {
      return;
      meS.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(102653);
    }
  }

  public static void j(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(102655);
    g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    int i;
    String str;
    if (localg != null)
    {
      i = localg.field_favProto.wit.cvp;
      str = localg.field_favProto.wit.cEV;
      j = 0;
      if (paramInt1 == 1)
        if (!t.kH(localg.field_favProto.wit.cEV))
          break label194;
    }
    label194: for (int j = 2; ; j = 1)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(10651, new Object[] { Integer.valueOf(localg.field_type), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(localg.field_id), b.r(localg), Long.valueOf(localg.field_updateTime / 1000L), Integer.valueOf(i), str, Integer.valueOf(j), "" });
      AppMethodBeat.o(102655);
      return;
    }
  }

  public static void k(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(102656);
    g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(paramLong);
    if (localg != null)
      com.tencent.mm.plugin.report.service.h.pYm.e(11122, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavTagSetMgr().buE()), Integer.valueOf(paramInt2), Integer.valueOf(localg.field_type), b.r(localg), Long.valueOf(localg.field_updateTime), Integer.valueOf(localg.field_favProto.wit.cvp), localg.field_favProto.wit.cEV });
    AppMethodBeat.o(102656);
  }

  public static final void vv(int paramInt)
  {
    AppMethodBeat.i(102649);
    e.pXa.a(802L, paramInt, 1L, false);
    AppMethodBeat.o(102649);
  }

  public static final void vw(int paramInt)
  {
    AppMethodBeat.i(102650);
    e.pXa.a(802L, 4L, paramInt, false);
    AppMethodBeat.o(102650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.h
 * JD-Core Version:    0.6.2
 */