package com.tencent.mm.plugin.fts.ui;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.fts.ui.a.q;
import com.tencent.mm.plugin.fts.ui.c.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import java.util.ArrayList;

public final class k
{
  public static void M(int paramInt, long paramLong)
  {
    AppMethodBeat.i(61935);
    ab.v("MicroMsg.FTS.FTSReportLogic", "reportIDKey: type=%d time=%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    switch (paramInt)
    {
    default:
    case 0:
    case 3:
    case 6:
    case 9:
    case 12:
    }
    while (true)
    {
      AppMethodBeat.o(61935);
      return;
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(79);
      localIDKey1.SetKey(paramInt + 1);
      localIDKey1.SetValue((int)paramLong);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(79);
      localIDKey2.SetKey(paramInt + 2);
      localIDKey2.SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      h.pYm.b(localArrayList, false);
    }
  }

  public static void a(com.tencent.mm.plugin.fts.a.d.a.a parama, com.tencent.mm.plugin.fts.ui.c.a parama1)
  {
    AppMethodBeat.i(61941);
    int i = parama.mFm;
    String str1 = parama.mFo;
    long l1 = parama.mFp;
    int j = l(parama.mFr, parama.mFs, parama.bAv());
    int k;
    label145: Object localObject;
    label236: int n;
    switch (parama.klY)
    {
    case 10:
    case 11:
    case 12:
    case 15:
    case 18:
    case 19:
    default:
      AppMethodBeat.o(61941);
      return;
    case 1:
      k = 3;
      localObject = "";
      long l3;
      if ((parama instanceof q))
      {
        localObject = (q)parama;
        boolean bool = ((q)localObject).ehM.DX();
        long l2 = ((q)localObject).hpS.timestamp / 1000L;
        l3 = ((q)localObject).hpS.mEB;
        localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().aoZ(((q)localObject).username);
        int m = 0;
        if (localObject != null)
        {
          m = ((at)localObject).field_unReadCount;
          if (!bool)
            break label800;
          n = 1;
          label244: localObject = String.format(",%s,%s,%s,%s,%s,%s", new Object[] { Long.valueOf(l2), Integer.valueOf(0), Long.valueOf(l3), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(0) });
        }
      }
      else
      {
        l3 = System.currentTimeMillis() - parama1.mLr;
        if ((l3 < 0L) || (parama1.mLr == 0L))
          l3 = 0L;
        parama = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(parama.mFa), Integer.valueOf(k), Integer.valueOf(i), bo.bc(str1, ""), Long.valueOf(l1), Integer.valueOf(j), Integer.valueOf(parama.aAq()), Integer.valueOf(we(parama.bAu())), parama.aAp(), Long.valueOf(l3), Integer.valueOf(parama1.mLs) });
        if (bo.isNullOrNil((String)localObject))
          break label806;
        parama = parama + (String)localObject;
      }
      break;
    case 2:
    case 4:
    case 3:
    case 6:
    case 7:
    case 8:
    case 9:
    case 5:
    case 14:
    case 13:
    case 17:
    case 16:
    case 20:
    }
    label800: label806: 
    while (true)
    {
      ab.d("MicroMsg.FTS.FTSReportLogic", "report detail page click 11310: %s", new Object[] { parama });
      h.pYm.X(11310, parama);
      AppMethodBeat.o(61941);
      break;
      k = 4;
      break label145;
      k = 5;
      break label145;
      k = 10;
      break label145;
      k = 11;
      break label145;
      k = 12;
      break label145;
      k = 13;
      break label145;
      k = 14;
      break label145;
      k = 16;
      break label145;
      k = 15;
      break label145;
      k = 17;
      break label145;
      k = 20;
      break label145;
      d locald = new d();
      String str2 = parama.mDz.mDY;
      localObject = str2;
      if (str2 != null)
        localObject = str2.replaceAll(",", " ");
      locald.l("20KeyWordId", (String)localObject + ",");
      locald.l("21ViewType", "2,");
      locald.l("22OpType", "2,");
      locald.l("23ResultCount", ",");
      locald.l("24ClickPos", parama.mFn + ",");
      locald.l("25ClickAppUserName", parama.info + ",");
      ab.i("MicroMsg.FTS.FTSReportLogic", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.Fk() });
      h.pYm.e(13963, new Object[] { locald });
      k = 19;
      break label145;
      k = 21;
      break label145;
      ab.w("MicroMsg.FTS.FTSReportLogic", "11310 conv null");
      break label236;
      n = 0;
      break label244;
    }
  }

  public static void a(com.tencent.mm.plugin.fts.a.d.a.a parama, b paramb)
  {
    AppMethodBeat.i(61939);
    int i = 1;
    int j = parama.mFm;
    int k = parama.mFn;
    String str1 = parama.mFo;
    long l1 = parama.mFp;
    Object localObject1 = parama.aAp();
    int m = l(parama.mFr, parama.mFs, parama.bAv());
    int n;
    Object localObject2;
    label131: int i1;
    label222: int i2;
    label230: String str2;
    if (parama.mFl == -8)
    {
      n = 0;
      switch (parama.klY)
      {
      default:
        localObject2 = n + "$" + (String)localObject1;
        n = 2;
        localObject1 = "";
        long l3;
        if ((parama instanceof q))
        {
          localObject1 = (q)parama;
          boolean bool = ((q)localObject1).ehM.DX();
          long l2 = ((q)localObject1).hpS.timestamp / 1000L;
          l3 = ((q)localObject1).hpS.mEB;
          localObject1 = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().aoZ(((q)localObject1).username);
          i1 = 0;
          if (localObject1 != null)
          {
            i1 = ((at)localObject1).field_unReadCount;
            if (!bool)
              break label1528;
            i2 = 1;
            localObject1 = String.format(",%s,%s,%s,%s,%s,%s", new Object[] { Long.valueOf(l2), Integer.valueOf(0), Long.valueOf(l3), Integer.valueOf(i2), Integer.valueOf(i1), Integer.valueOf(0) });
          }
        }
        else
        {
          l3 = System.currentTimeMillis() - paramb.mLr;
          if ((l3 < 0L) || (paramb.mLr == 0L))
            l3 = 0L;
          if (paramb.mLI.equals(parama.mDz.mDY))
            break label1534;
          i1 = 1;
          label337: int i3 = parama.mFa;
          str2 = bo.bc(str1, "");
          int i4 = parama.aAq();
          int i5 = we(parama.bAu());
          int i6 = paramb.mLu;
          int i7 = paramb.mLv;
          int i8 = paramb.mLw;
          int i9 = paramb.mLx;
          int i10 = paramb.mLy;
          i2 = paramb.mLz;
          int i11 = paramb.mLA;
          int i12 = paramb.mLC;
          int i13 = paramb.mLD;
          str1 = e.mCM;
          parama = parama.mDz.mDY;
          int i14 = paramb.mLB;
          int i15 = paramb.mLE;
          int i16 = paramb.bBj();
          if (i1 == 0)
            break label1540;
          i1 = 1;
          label460: parama = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i3), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), str2, Long.valueOf(l1), Integer.valueOf(m), Integer.valueOf(0), Integer.valueOf(i4), Integer.valueOf(i5), localObject2, Long.valueOf(l3), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i2), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), str1, parama, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), "", "", "", Integer.valueOf(1), Integer.valueOf(i1) });
          if (bo.isNullOrNil((String)localObject1))
            break label1546;
          parama = parama + (String)localObject1;
        }
        break;
      case 1:
      case 2:
      case 4:
      case 3:
      }
    }
    label1540: label1546: 
    while (true)
    {
      ab.d("MicroMsg.FTS.FTSReportLogic", "10991 report home page click: %d, %s", new Object[] { Integer.valueOf(10991), parama });
      h.pYm.X(10991, parama);
      AppMethodBeat.o(61939);
      while (true)
      {
        return;
        n = 3;
        break;
        n = 4;
        break;
        n = 5;
        break;
        n = 10;
        break;
        switch (parama.klY)
        {
        case 11:
        case 15:
        case 18:
        default:
          AppMethodBeat.o(61939);
          break;
        case 1:
          n = 3;
          localObject2 = localObject1;
          break;
        case 2:
          n = 4;
          localObject2 = localObject1;
          break;
        case 4:
          n = 5;
          localObject2 = localObject1;
          break;
        case 3:
          n = 10;
          localObject2 = localObject1;
          break;
        case 6:
          n = 11;
          localObject2 = localObject1;
          break;
        case 14:
          n = 15;
          localObject2 = localObject1;
          break;
        case 5:
          n = 16;
          localObject2 = localObject1;
          break;
        case 13:
          n = 17;
          localObject2 = localObject1;
          break;
        case 7:
          n = 12;
          localObject2 = localObject1;
          break;
        case 8:
          n = 13;
          localObject2 = localObject1;
          break;
        case 9:
          n = 14;
          localObject2 = localObject1;
          break;
        case 17:
          n = 20;
          localObject2 = localObject1;
          break;
        case 12:
          if (parama.mFl == -5)
          {
            n = 16;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -3)
          {
            n = 4;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -4)
          {
            n = 3;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -1)
          {
            n = 12;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -2)
          {
            n = 11;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -15)
          {
            n = 21;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -6)
          {
            n = 10;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -13)
          {
            n = 19;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          if (parama.mFl == -7)
          {
            n = 5;
            i = 2;
            localObject2 = localObject1;
            break;
          }
          AppMethodBeat.o(61939);
        case 10:
        case 16:
        case 20:
        case 19:
        }
      }
      if (parama.mFq)
      {
        n = 8;
        localObject2 = localObject1;
        break label131;
      }
      n = 9;
      localObject2 = localObject1;
      break label131;
      d locald = new d();
      str2 = parama.mDz.mDY;
      localObject2 = str2;
      if (str2 != null)
        localObject2 = str2.replaceAll(",", " ");
      locald.l("20KeyWordId", (String)localObject2 + ",");
      locald.l("21ViewType", "1,");
      locald.l("22OpType", "2,");
      locald.l("23ResultCount", ",");
      locald.l("24ClickPos", parama.mFn + ",");
      locald.l("25ClickAppUserName", parama.info + ",");
      ab.i("MicroMsg.FTS.FTSReportLogic", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.Fk() });
      h.pYm.e(13963, new Object[] { locald });
      n = 19;
      localObject2 = localObject1;
      break label131;
      n = 21;
      localObject2 = localObject1;
      break label131;
      n = 22;
      localObject2 = localObject1;
      break label131;
      ab.w("MicroMsg.FTS.FTSReportLogic", "10991 conv null");
      break label222;
      label1528: i2 = 0;
      break label230;
      label1534: i1 = 0;
      break label337;
      i1 = 0;
      break label460;
    }
  }

  public static void a(b paramb)
  {
    AppMethodBeat.i(61938);
    String str = paramb.query;
    if (TextUtils.isEmpty(str))
      AppMethodBeat.o(61938);
    while (true)
    {
      return;
      paramb = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%s", new Object[] { str, Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(paramb.mLt), Integer.valueOf(paramb.mLw), Integer.valueOf(paramb.mLD), Integer.valueOf(paramb.mLA), Integer.valueOf(paramb.mLB), e.mCM, Integer.valueOf(paramb.mLv), Integer.valueOf(paramb.mLx), Integer.valueOf(paramb.mLG), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramb.mLH), e.mCM });
      ab.i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", new Object[] { Integer.valueOf(16050), paramb });
      h.pYm.X(16050, paramb);
      AppMethodBeat.o(61938);
    }
  }

  static void a(String paramString, int paramInt1, int paramInt2, b paramb, int paramInt3)
  {
    AppMethodBeat.i(61940);
    long l = System.currentTimeMillis() - paramb.mLr;
    if ((l < 0L) || (paramb.mLr == 0L))
      l = 0L;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    String str;
    int i6;
    int i7;
    int i8;
    if (!paramb.mLI.equals(paramString))
    {
      i = 1;
      j = paramb.mLu;
      k = paramb.mLv;
      m = paramb.mLw;
      n = paramb.mLx;
      i1 = paramb.mLy;
      i2 = paramb.mLz;
      i3 = paramb.mLA;
      i4 = paramb.mLC;
      i5 = paramb.mLD;
      str = e.mCM;
      i6 = paramb.mLB;
      i7 = paramb.mLE;
      i8 = paramb.bBj();
      if (i == 0)
        break label444;
    }
    label444: for (int i = 1; ; i = 0)
    {
      paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1 + 1), Integer.valueOf(0), Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str, paramString, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), "", "", "", Integer.valueOf(1), Integer.valueOf(i) });
      ab.d("MicroMsg.FTS.FTSReportLogic", "10991 reportWebSearch click: %d, %s", new Object[] { Integer.valueOf(10991), paramString });
      h.pYm.X(10991, paramString);
      AppMethodBeat.o(61940);
      return;
      i = 0;
      break;
    }
  }

  public static void a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2, b paramb)
  {
    AppMethodBeat.i(61937);
    switch (paramInt2)
    {
    case -14:
    case -13:
    case -12:
    case -11:
    case -10:
    case -9:
    case -8:
    case -7:
    case -6:
    default:
      paramInt2 = 0;
      if (paramBoolean)
        paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s", new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramInt2), Integer.valueOf(paramb.mLt), Integer.valueOf(paramb.mLw), Integer.valueOf(paramb.mLD), Integer.valueOf(paramb.mLA), Integer.valueOf(paramb.mLB), e.mCM, Integer.valueOf(paramb.mLv), Integer.valueOf(paramb.mLx), Integer.valueOf(paramb.mLG), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramb.mLH) });
      break;
    case -15:
    case -5:
    case -4:
    case -3:
    case -2:
    case -1:
    case 0:
    }
    while (true)
    {
      ab.i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", new Object[] { Integer.valueOf(11062), paramString });
      h.pYm.X(11062, paramString);
      AppMethodBeat.o(61937);
      return;
      paramInt2 = 2;
      break;
      paramInt2 = 1;
      break;
      if (paramInt1 > 0)
        paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s", new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(paramInt2), Integer.valueOf(paramb.mLt), Integer.valueOf(paramb.mLw), Integer.valueOf(paramb.mLD), Integer.valueOf(paramb.mLA), Integer.valueOf(paramb.mLB), e.mCM, Integer.valueOf(paramb.mLv), Integer.valueOf(paramb.mLx), Integer.valueOf(paramb.mLG), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramb.mLH) });
      else
        paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s", new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramb.mLt), Integer.valueOf(paramb.mLw), Integer.valueOf(paramb.mLD), Integer.valueOf(paramb.mLA), Integer.valueOf(paramb.mLB), e.mCM, Integer.valueOf(paramb.mLv), Integer.valueOf(paramb.mLx), Integer.valueOf(paramb.mLG), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramb.mLH) });
    }
  }

  public static void c(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61936);
    a(paramString, paramBoolean, paramInt1, paramInt2, new b());
    AppMethodBeat.o(61936);
  }

  public static final void hA(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(61942);
    h localh;
    if (paramBoolean)
    {
      j = 1;
      ab.v("MicroMsg.FTS.FTSReportLogic", "reportFTSCreateChatroom: %d %d", new Object[] { Integer.valueOf(13970), Integer.valueOf(j) });
      localh = h.pYm;
      if (!paramBoolean)
        break label82;
    }
    label82: for (int j = i; ; j = 0)
    {
      localh.e(13970, new Object[] { Integer.valueOf(j) });
      AppMethodBeat.o(61942);
      return;
      j = 0;
      break;
    }
  }

  private static int l(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
      paramInt2 = 15;
    while (true)
    {
      return paramInt2;
      if (paramInt1 == 131072)
      {
        switch (paramInt2)
        {
        case 8:
        case 9:
        case 10:
        case 12:
        case 13:
        case 14:
        default:
          paramInt2 = i;
          break;
        case 1:
          paramInt2 = 1;
          break;
        case 2:
          paramInt2 = 2;
          break;
        case 3:
          paramInt2 = 3;
          break;
        case 4:
          paramInt2 = 4;
          break;
        case 5:
          paramInt2 = 5;
          break;
        case 6:
          paramInt2 = 6;
          break;
        case 7:
          paramInt2 = 7;
          break;
        case 11:
          paramInt2 = 8;
          break;
        case 16:
          paramInt2 = 10;
          break;
        case 17:
        case 18:
          paramInt2 = 9;
          break;
        case 15:
          paramInt2 = 16;
          break;
        }
      }
      else if (paramInt1 == 131075)
      {
        switch (paramInt2)
        {
        default:
          paramInt2 = i;
          break;
        case 1:
        case 5:
          paramInt2 = 12;
          break;
        case 2:
        case 6:
          paramInt2 = 13;
          break;
        case 3:
        case 7:
          paramInt2 = 14;
          break;
        case 29:
        case 30:
        case 31:
        case 32:
        case 34:
        case 35:
        case 36:
        case 37:
        case 38:
          paramInt2 = 11;
          break;
        }
      }
      else if (paramInt1 == 131081)
      {
        paramInt2 = 19;
      }
      else
      {
        paramInt2 = i;
        if (paramInt1 == 65536)
          paramInt2 = 17;
      }
    }
  }

  private static int we(int paramInt)
  {
    int i = 6;
    switch (paramInt)
    {
    case 33:
    default:
      i = 0;
    case 35:
    case 36:
    case 37:
    case 32:
    case 34:
    case 29:
    case 30:
    case 31:
    }
    while (true)
    {
      return i;
      i = 16;
      continue;
      i = 4;
      continue;
      i = 5;
      continue;
      i = 1;
      continue;
      i = 2;
      continue;
      i = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.k
 * JD-Core Version:    0.6.2
 */