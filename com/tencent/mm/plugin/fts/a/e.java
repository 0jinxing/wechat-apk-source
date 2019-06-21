package com.tencent.mm.plugin.fts.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class e
{
  public static final int[] mCK;
  public static final e.a mCL;
  public static String mCM;

  static
  {
    AppMethodBeat.i(114217);
    mCK = new int[] { 8, 9, 10, 11, 12, 14, 19, 20, 21, 22, 24, 25, 26, 15, 28, 29 };
    mCL = new e.a();
    mCM = "";
    AppMethodBeat.o(114217);
  }

  public static void K(int paramInt, long paramLong)
  {
    AppMethodBeat.i(114211);
    if (paramInt > 0)
    {
      int i = (paramInt - 1) * 2 + 1;
      ab.v("MicroMsg.FTS.FTSReportApiLogic", "reportIDKeySearchTime: reportKey=%d taskId=%d time=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(601);
      localIDKey.SetKey(i);
      localIDKey.SetValue((int)paramLong);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(601);
      localIDKey.SetKey(i + 1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      com.tencent.mm.plugin.report.e.pXa.b(localArrayList, false);
    }
    AppMethodBeat.o(114211);
  }

  public static void L(int paramInt, long paramLong)
  {
    AppMethodBeat.i(114212);
    ArrayList localArrayList;
    IDKey localIDKey;
    if (paramInt > 0)
    {
      paramInt = (paramInt - 1) * 4 + 1;
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(602);
      localIDKey.SetKey(paramInt);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      if (paramLong > 100L)
        break label121;
      localIDKey = new IDKey();
      localIDKey.SetID(602);
      localIDKey.SetKey(paramInt + 1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    while (true)
    {
      com.tencent.mm.plugin.report.e.pXa.b(localArrayList, false);
      AppMethodBeat.o(114212);
      return;
      label121: if (paramLong <= 500L)
      {
        localIDKey = new IDKey();
        localIDKey.SetID(602);
        localIDKey.SetKey(paramInt + 2);
        localIDKey.SetValue(1L);
        localArrayList.add(localIDKey);
      }
      else
      {
        localIDKey = new IDKey();
        localIDKey.SetID(602);
        localIDKey.SetKey(paramInt + 3);
        localIDKey.SetValue(1L);
        localArrayList.add(localIDKey);
      }
    }
  }

  public static final void bAj()
  {
    AppMethodBeat.i(114215);
    ab.i("MicroMsg.FTS.FTSReportApiLogic", "reportIDKeyFTSData %d %d %d %d %d", new Object[] { Long.valueOf(mCL.mCN), Long.valueOf(mCL.mCO), Long.valueOf(mCL.mCP), Long.valueOf(mCL.mCR), Long.valueOf(mCL.mCQ) });
    ArrayList localArrayList = new ArrayList();
    c(localArrayList, 0);
    if (mCL.mCN > 1536L)
      c(localArrayList, 1);
    if (mCL.mCO >= 10000L)
      c(localArrayList, 2);
    if (mCL.mCP >= 5000L)
      c(localArrayList, 3);
    if (mCL.mCR >= 10000L)
      c(localArrayList, 4);
    if (mCL.mCQ >= 1000000L)
      c(localArrayList, 5);
    com.tencent.mm.plugin.report.e.pXa.b(localArrayList, false);
    AppMethodBeat.o(114215);
  }

  private static final void c(ArrayList<IDKey> paramArrayList, int paramInt)
  {
    AppMethodBeat.i(114216);
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(729);
    localIDKey.SetKey(paramInt);
    localIDKey.SetValue(1L);
    paramArrayList.add(localIDKey);
    AppMethodBeat.o(114216);
  }

  public static final void i(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(114210);
    if (!d.e(paramInt, mCK))
      AppMethodBeat.o(114210);
    while (true)
    {
      return;
      g.RN();
      long l = new p(a.QF()).longValue();
      if (com.tencent.mm.protocal.d.vxp)
      {
        if (l % 100L == 1L)
          break;
        AppMethodBeat.o(114210);
      }
      else
      {
        if ((!com.tencent.mm.protocal.d.vxq) || (l % 10L == 1L))
          break;
        AppMethodBeat.o(114210);
      }
    }
    if (mCL.mCN >= 1536L);
    for (int i = 1; ; i = 0)
    {
      String str = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt), Long.valueOf(paramLong1), Integer.valueOf(0), Integer.valueOf(i), Long.valueOf(mCL.mCN), Long.valueOf(mCL.mCO), Long.valueOf(mCL.mCP), Long.valueOf(mCL.mCQ), Long.valueOf(mCL.mCR), Long.valueOf(paramLong2) });
      ab.v("MicroMsg.FTS.FTSReportApiLogic", "reportKVSearchTime: %d %s", new Object[] { Integer.valueOf(14175), str });
      com.tencent.mm.plugin.report.e.pXa.X(14175, str);
      AppMethodBeat.o(114210);
      break;
    }
  }

  public static void vV(int paramInt)
  {
    AppMethodBeat.i(114213);
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(146);
    localIDKey.SetKey(0);
    localIDKey.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey);
    if (paramInt != 1)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(146);
      localIDKey.SetKey(2);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(146);
      localIDKey.SetKey(paramInt);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    while (true)
    {
      com.tencent.mm.plugin.report.e.pXa.b(localArrayList, false);
      AppMethodBeat.o(114213);
      return;
      localIDKey = new IDKey();
      localIDKey.SetID(146);
      localIDKey.SetKey(1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
  }

  public static final void vW(int paramInt)
  {
    AppMethodBeat.i(114214);
    ab.i("MicroMsg.FTS.FTSReportApiLogic", "reportCommonChatroom: %d %d", new Object[] { Integer.valueOf(14731), Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.e.pXa.e(14731, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(114214);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.e
 * JD-Core Version:    0.6.2
 */