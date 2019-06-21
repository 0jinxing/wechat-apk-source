package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class g
{
  static long endTime;
  static long jxH;
  static long jxI;
  static long startTime;
  private SimpleDateFormat juL;
  ap jxJ;

  public g()
  {
    AppMethodBeat.i(17667);
    this.juL = new SimpleDateFormat("yyyyMMdd");
    AppMethodBeat.o(17667);
  }

  static void init()
  {
    startTime = 0L;
    endTime = 0L;
    jxH = 0L;
    jxI = 0L;
  }

  private void rA(int paramInt)
  {
    AppMethodBeat.i(17669);
    Long localLong1 = Long.valueOf(bo.anU());
    Long localLong2 = Long.valueOf(gy(bo.anU()));
    if ((localLong1.longValue() == 0L) || (localLong2.longValue() == 0L))
    {
      ab.e("MicroMsg.BackupLogManager", "startLogAfterTimeHandler is zero, startAfterLogTime[%d], startAfterLogSize[%d], skip", new Object[] { localLong1, localLong2 });
      AppMethodBeat.o(17669);
    }
    while (true)
    {
      return;
      this.jxJ = new ap(Looper.getMainLooper(), new g.1(this, localLong1, paramInt, localLong2), false);
      this.jxJ.ae(300000L, 300000L);
      AppMethodBeat.o(17669);
    }
  }

  final long B(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(17670);
    long l = 0L;
    while (paramLong1 <= paramLong2 + 86400000L)
    {
      l += gy(paramLong1);
      paramLong1 += 86400000L;
    }
    AppMethodBeat.o(17670);
    return l;
  }

  final void a(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(17668);
    if (paramLong2 == 0L)
    {
      ab.e("MicroMsg.BackupLogManager", "reportKv logSize is 0, skip report");
      AppMethodBeat.o(17668);
      return;
    }
    long l = paramLong2 / (paramLong1 / 1000L);
    ab.i("MicroMsg.BackupLogManager", "reportKv, backupMode[%d], time[%d ms], logSize[%d KB], aveLogSize[%d B/s]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(l) });
    switch (paramInt)
    {
    default:
    case 11:
    case 12:
    case 21:
    case 22:
    }
    while (true)
    {
      AppMethodBeat.o(17668);
      break;
      if (!paramBoolean)
      {
        h.pYm.a(400L, 81L, paramLong2 / 1024L, false);
        if (paramLong1 != 0L)
          h.pYm.a(400L, 82L, l, false);
        rA(paramInt);
        AppMethodBeat.o(17668);
        break;
      }
      h.pYm.a(400L, 83L, paramLong2 / 1024L, false);
      AppMethodBeat.o(17668);
      break;
      if (!paramBoolean)
      {
        h.pYm.a(400L, 86L, paramLong2 / 1024L, false);
        if (paramLong1 != 0L)
          h.pYm.a(400L, 87L, l, false);
        rA(paramInt);
        AppMethodBeat.o(17668);
        break;
      }
      h.pYm.a(400L, 88L, paramLong2 / 1024L, false);
      AppMethodBeat.o(17668);
      break;
      if (!paramBoolean)
      {
        h.pYm.a(485L, 91L, paramLong2 / 1024L, false);
        if (paramLong1 != 0L)
          h.pYm.a(485L, 92L, l, false);
        rA(paramInt);
        AppMethodBeat.o(17668);
        break;
      }
      h.pYm.a(485L, 93L, paramLong2 / 1024L, false);
      AppMethodBeat.o(17668);
      break;
      if (!paramBoolean)
      {
        h.pYm.a(485L, 96L, paramLong2 / 1024L, false);
        if (paramLong1 != 0L)
          h.pYm.a(485L, 97L, l, false);
        rA(paramInt);
        AppMethodBeat.o(17668);
        break;
      }
      h.pYm.a(485L, 98L, paramLong2 / 1024L, false);
    }
  }

  final long gy(long paramLong)
  {
    AppMethodBeat.i(17671);
    String str1 = this.juL.format(new Date(paramLong));
    String str2 = ac.xIE + "/MM_" + str1 + ".xlog";
    if (com.tencent.mm.vfs.e.ct(str2))
    {
      paramLong = com.tencent.mm.vfs.e.asZ(str2);
      AppMethodBeat.o(17671);
    }
    while (true)
    {
      return paramLong;
      str1 = com.tencent.mm.compatible.util.e.euX + "/MM_" + str1 + ".xlog";
      if (com.tencent.mm.vfs.e.ct(str1))
      {
        paramLong = com.tencent.mm.vfs.e.asZ(str1);
        AppMethodBeat.o(17671);
      }
      else
      {
        paramLong = 0L;
        AppMethodBeat.o(17671);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.g
 * JD-Core Version:    0.6.2
 */