package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$1
  implements Runnable
{
  f$1(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17661);
    while (true)
    {
      if (!f.a(this.jxG).booleanValue());
      try
      {
        Thread.sleep(1000L);
        label25: if (f.a(this.jxG).booleanValue() == true)
        {
          ab.e("MicroMsg.BackupHeartBeatHandler", "start BackupSendBackupHeartBeat thread stopped.");
          AppMethodBeat.o(17661);
        }
        while (true)
        {
          return;
          long l = bo.gb(f.b(this.jxG));
          ab.d("MicroMsg.BackupHeartBeatHandler", "start heartBeatState[%d], heartBeatTimeStamp[%d], timeDiff[%d], hasSendHeartBeat[%b]", new Object[] { Integer.valueOf(f.c(this.jxG)), Long.valueOf(f.b(this.jxG)), Long.valueOf(l), Boolean.valueOf(f.d(this.jxG)) });
          if (!f.d(this.jxG))
          {
            if (l < f.jxz)
            {
              f.a(this.jxG, 0);
              break;
            }
            ab.e("MicroMsg.BackupHeartBeatHandler", "start send heartbeat req, heartBeatTimeStamp[%d], timeDiff[%d]", new Object[] { Long.valueOf(f.b(this.jxG)), Long.valueOf(l) });
            this.jxG.aUm();
            this.jxG.aUl();
            f.e(this.jxG);
            break;
          }
          if (l < f.jxA)
            break;
          if (f.c(this.jxG) != 1)
          {
            ab.e("MicroMsg.BackupHeartBeatHandler", "start weak connect Timeout Now! heartBeatTimeStamp[%d], timeDiff[%d]", new Object[] { Long.valueOf(f.b(this.jxG)), Long.valueOf(l) });
            f.a(this.jxG, 1);
          }
          this.jxG.stop();
          AppMethodBeat.o(17661);
          continue;
          AppMethodBeat.o(17661);
        }
      }
      catch (Exception localException)
      {
        break label25;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.f.1
 * JD-Core Version:    0.6.2
 */