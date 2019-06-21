package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.i.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import junit.framework.Assert;

public final class f
{
  public static int jxA = 5000;
  public static int jxz = 10000;
  private int jxB = 0;
  private long jxC = 0L;
  private long jxD = 0L;
  private boolean jxE = false;
  private Boolean jxF = null;

  public final void aUl()
  {
    AppMethodBeat.i(17662);
    this.jxC = bo.anU();
    ab.d("MicroMsg.BackupHeartBeatHandler", "updateHeartBeatTimeStamp[%d]", new Object[] { Long.valueOf(this.jxC) });
    this.jxE = false;
    if (this.jxB != 0)
    {
      this.jxB = 0;
      cg(false);
    }
    AppMethodBeat.o(17662);
  }

  public final void aUm()
  {
    AppMethodBeat.i(17663);
    long l;
    if (this.jxD == 9223372036854775807L)
      l = 0L;
    while (true)
    {
      this.jxD = l;
      e locale = new e();
      locale.jxD = this.jxD;
      try
      {
        ab.i("MicroMsg.BackupHeartBeatHandler", "sendBackupHeartBeatRequest send heartbeat req, ack:%d", new Object[] { Long.valueOf(locale.jxD) });
        b.K(locale.toByteArray(), 9);
        AppMethodBeat.o(17663);
        return;
        l = this.jxD + 1L;
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.BackupHeartBeatHandler", localIOException, "buf to BackupHeartBeatRequest err.", new Object[0]);
          AppMethodBeat.o(17663);
        }
      }
    }
  }

  public final void cg(boolean paramBoolean)
  {
    AppMethodBeat.i(17665);
    if (paramBoolean)
      if (this.jxF != null)
        break label70;
    label70: for (paramBoolean = true; ; paramBoolean = false)
    {
      Assert.assertTrue("New BackupHeartBeatHandler EveryTime !", paramBoolean);
      ab.i("MicroMsg.BackupHeartBeatHandler", "start backup heart beat handler.");
      aUl();
      this.jxF = Boolean.FALSE;
      d.h(new f.1(this), "BackupSendBackupHeartBeat").start();
      aUm();
      AppMethodBeat.o(17665);
      return;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(17664);
    if (this.jxF != null)
    {
      ab.i("MicroMsg.BackupHeartBeatHandler", "stop");
      this.jxF = Boolean.TRUE;
    }
    AppMethodBeat.o(17664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.f
 * JD-Core Version:    0.6.2
 */