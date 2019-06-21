package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Queue;

final class j$1
  implements ap.a
{
  j$1(j paramj)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(17676);
    long l = bo.gb(j.a(this.jye));
    if (l != 0L)
    {
      j.a(this.jye, j.b(this.jye) / l * 1000L);
      j.d(this.jye).offer(Long.valueOf(j.c(this.jye)));
    }
    try
    {
      l = ((Long)j.d(this.jye).poll()).longValue();
      j.a(this.jye, (j.e(this.jye) * 10L - l + j.c(this.jye)) / 10L);
      j localj = this.jye;
      if (j.c(this.jye) > 0L)
      {
        l = j.c(this.jye);
        j.a(localj, l);
        j.b(this.jye, j.c(this.jye));
        j.f(this.jye);
        j.c(this.jye, bo.anU());
        j.g(this.jye).aTn();
        if (j.c(this.jye) < 102400L)
          break label281;
        if (j.h(this.jye) != 0)
        {
          j.a(this.jye, 0);
          j.d(this.jye, 0L);
          j.g(this.jye).ro(0);
          ab.i("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is not low speed now.");
        }
        AppMethodBeat.o(17676);
        bool = true;
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        l = 0L;
        continue;
        l = 0L;
        continue;
        label281: if (j.c(this.jye) < 2L)
        {
          if (j.h(this.jye) == 0)
          {
            j.a(this.jye, 1);
            j.g(this.jye).ro(1);
            j.d(this.jye, bo.anU());
            ab.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", new Object[] { Long.valueOf(j.i(this.jye)) });
          }
          else if (j.h(this.jye) == 1)
          {
            if (j.i(this.jye) > 0L)
            {
              if (bo.gb(j.i(this.jye)) > j.aUn())
              {
                ab.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler low speed overtime, overtime[%d]", new Object[] { Long.valueOf(bo.gb(j.i(this.jye))) });
                j.a(this.jye, 2);
                j.g(this.jye).aTo();
                j.d(this.jye, 0L);
                AppMethodBeat.o(17676);
                bool = false;
              }
            }
            else
            {
              j.d(this.jye, bo.anU());
              ab.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", new Object[] { Long.valueOf(j.i(this.jye)) });
            }
          }
        }
        else if (j.h(this.jye) != 1)
        {
          j.a(this.jye, 1);
          j.g(this.jye).ro(1);
          ab.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is weak now.");
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.j.1
 * JD-Core Version:    0.6.2
 */