package com.tencent.mm.plugin.report;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Map;

public enum e
  implements d
{
  d pXb;

  static
  {
    AppMethodBeat.i(115125);
    pXa = new e("INSTANCE");
    pXc = new e[] { pXa };
    AppMethodBeat.o(115125);
  }

  private e()
  {
    AppMethodBeat.i(115113);
    this.pXb = new a((byte)0);
    AppMethodBeat.o(115113);
  }

  public static Object a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    int i = 0;
    AppMethodBeat.i(115123);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0) || (paramInt3 <= paramInt2) || (paramInt3 > 255) || (paramArrayOfInt.length != paramInt3 - paramInt2))
    {
      AppMethodBeat.o(115123);
      paramArrayOfInt = null;
    }
    while (true)
    {
      return paramArrayOfInt;
      if (paramInt1 <= paramArrayOfInt[0])
      {
        paramArrayOfInt = Integer.valueOf(paramInt2);
        AppMethodBeat.o(115123);
      }
      else
      {
        do
        {
          i++;
          if (i >= paramArrayOfInt.length - 1)
            break label137;
          if (paramArrayOfInt[i] >= paramArrayOfInt[(i + 1)])
          {
            AppMethodBeat.o(115123);
            paramArrayOfInt = null;
            break;
          }
        }
        while ((paramInt1 <= paramArrayOfInt[i]) || (paramInt1 > paramArrayOfInt[(i + 1)]));
        paramArrayOfInt = Integer.valueOf(i + (paramInt2 + 1));
        AppMethodBeat.o(115123);
        continue;
        label137: paramArrayOfInt = Integer.valueOf(paramInt3);
        AppMethodBeat.o(115123);
      }
    }
  }

  public static Object a(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    if ((paramArrayOfInt.length <= 0) || (paramArrayOfInt.length + 1 != paramArrayOfObject.length))
      paramArrayOfInt = null;
    while (true)
    {
      return paramArrayOfInt;
      if (paramInt <= paramArrayOfInt[0])
      {
        paramArrayOfInt = paramArrayOfObject[0];
      }
      else
      {
        do
        {
          i++;
          if (i >= paramArrayOfInt.length - 1)
            break label86;
          if (paramArrayOfInt[i] >= paramArrayOfInt[(i + 1)])
          {
            paramArrayOfInt = null;
            break;
          }
        }
        while ((paramInt <= paramArrayOfInt[i]) || (paramInt > paramArrayOfInt[(i + 1)]));
        paramArrayOfInt = paramArrayOfObject[(i + 1)];
        continue;
        label86: paramArrayOfInt = paramArrayOfObject[(paramArrayOfObject.length - 1)];
      }
    }
  }

  public final void X(int paramInt, String paramString)
  {
    AppMethodBeat.i(115115);
    this.pXb.X(paramInt, paramString);
    AppMethodBeat.o(115115);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    AppMethodBeat.i(115120);
    ab.d("MicroMsg.ReportService", "idkeyGroupForPair [%d, %d] -> %d / [%d, %d] -> %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt5), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt6) });
    this.pXb.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean);
    AppMethodBeat.o(115120);
  }

  public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(115116);
    this.pXb.a(paramInt, paramString, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(115116);
  }

  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(115117);
    this.pXb.a(paramInt, paramBoolean1, paramBoolean2, paramArrayOfObject);
    AppMethodBeat.o(115117);
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    AppMethodBeat.i(115118);
    ab.d("MicroMsg.ReportService", "idkeyStat [%d, %d] -> %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) });
    this.pXb.a(paramLong1, paramLong2, paramLong3, paramBoolean);
    AppMethodBeat.o(115118);
  }

  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(115119);
    this.pXb.b(paramArrayList, paramBoolean);
    AppMethodBeat.o(115119);
  }

  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(115121);
    ab.d("MicroMsg.ReportService", "idkeyGroupForPairAverger [%d, %d] -> %d / [%d, %d] -> 1", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    this.pXb.d(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
    AppMethodBeat.o(115121);
  }

  public final void e(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(115114);
    this.pXb.e(paramInt, paramArrayOfObject);
    AppMethodBeat.o(115114);
  }

  public final void g(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(115124);
    this.pXb.g(paramString1, paramString2, paramMap);
    AppMethodBeat.o(115124);
  }

  public final void hB(int paramInt)
  {
    AppMethodBeat.i(115122);
    this.pXb.hB(paramInt);
    AppMethodBeat.o(115122);
  }

  static final class a
    implements d
  {
    public final void X(int paramInt, String paramString)
    {
      AppMethodBeat.i(115104);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115104);
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
    {
      AppMethodBeat.i(115107);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115107);
    }

    public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      AppMethodBeat.i(115105);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115105);
    }

    public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(115106);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115106);
    }

    public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
    {
      AppMethodBeat.i(115101);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115101);
    }

    public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
    {
      AppMethodBeat.i(115110);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115110);
    }

    public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      AppMethodBeat.i(115108);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115108);
    }

    public final void e(int paramInt, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(115103);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115103);
    }

    public final void g(String paramString1, String paramString2, Map<String, Object> paramMap)
    {
      AppMethodBeat.i(115109);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115109);
    }

    public final void hB(int paramInt)
    {
      AppMethodBeat.i(115102);
      ab.i("MicroMsg.ReportService", "this is DummyReportService");
      AppMethodBeat.o(115102);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.e
 * JD-Core Version:    0.6.2
 */