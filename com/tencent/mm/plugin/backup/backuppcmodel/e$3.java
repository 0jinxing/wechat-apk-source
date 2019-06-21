package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.b.d;
import com.tencent.mm.plugin.backup.i.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$3
  implements b.d
{
  e$3(e parame)
  {
  }

  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(17546);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify isLocal[%b], type[%d], seq[%d], buf[%d], isBackupFinish[%b]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Boolean.valueOf(e.aTO()) });
      if ((!paramBoolean) || (paramArrayOfByte == null))
        break label516;
      if (10011 == paramInt1)
      {
        paramInt1 = b.aTD().aSu().jqW;
        ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify local disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramInt1) });
      }
      switch (paramInt1)
      {
      default:
        label188: AppMethodBeat.o(17546);
      case 1:
      case 11:
      case -21:
      case -5:
      case 15:
      case 4:
      case 12:
      case 14:
      case -4:
      }
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      b.aTD().aTa().stop();
      b.aTD().aSu().jqW = -100;
      this.jwz.ru(-100);
      AppMethodBeat.o(17546);
      continue;
      b.aTD().aTa().stop();
      AppMethodBeat.o(17546);
      continue;
      b.aTD().aTa().stop();
      b.aTD().aSu().jqW = -100;
      this.jwz.ru(-100);
      AppMethodBeat.o(17546);
      continue;
      if ((b.aTD().aTE().jwe) && (!e.aTO()))
      {
        paramInt1 = com.tencent.mm.plugin.backup.g.b.aUb();
        switch (paramInt1)
        {
        default:
        case 0:
        case 2:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(17546);
          break;
          ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify startBackupReconnectHandler, reconnectState[%d]", new Object[] { Integer.valueOf(paramInt1) });
          this.jwz.rt(19);
          e.c(this.jwz);
          com.tencent.mm.plugin.backup.g.b.a(b.aTD().aTE().jwj);
          AppMethodBeat.o(17546);
          break;
          ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify already start reconnect, state[%d]", new Object[] { Integer.valueOf(paramInt1) });
        }
      }
      ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify not support reconnect, disconnect");
      this.jwz.cancel(true);
      b.aTD().aTa().stop();
      b.aTD().aSu().jqW = -4;
      this.jwz.ru(-4);
      h.pYm.a(400L, 9L, 1L, false);
      this.jwz.rt(3);
      AppMethodBeat.o(17546);
      continue;
      this.jwz.cancel(true);
      break label188;
      label516: Object localObject;
      if ((1 == b.aTD().aTE().jwa) || (3 == b.aTD().aTE().jwa))
      {
        if (paramInt1 == 10)
        {
          localObject = new f();
          try
          {
            ((f)localObject).parseFrom(paramArrayOfByte);
            ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive heartbeatResp, ack[%d]", new Object[] { Long.valueOf(((f)localObject).jxD) });
            AppMethodBeat.o(17546);
          }
          catch (Exception paramArrayOfByte)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.BackupPcServer", paramArrayOfByte, "onBackupPcServerNotify buf to BackupHeartBeatResponse error.", new Object[0]);
          }
        }
        if (paramInt1 == 5)
        {
          ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive cancelReq");
          this.jwz.cancel(true);
          b.aTD().aSu().jqW = -100;
          this.jwz.ru(-100);
          h.pYm.a(400L, 51L, 1L, false);
          this.jwz.rt(5);
          AppMethodBeat.o(17546);
          continue;
        }
        if (paramInt1 == 18)
        {
          localObject = new com.tencent.mm.plugin.backup.i.c();
          try
          {
            ((com.tencent.mm.plugin.backup.i.c)localObject).parseFrom(paramArrayOfByte);
            ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandResp, cmd[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.c)localObject).jBh) });
            if (((com.tencent.mm.plugin.backup.i.c)localObject).jBh == 9)
            {
              paramInt1 = com.tencent.mm.plugin.backup.g.b.aUb();
              if (paramInt1 == 1)
              {
                com.tencent.mm.plugin.backup.g.b.ry(2);
                ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify reconnect success, start resendSceneMap");
                this.jwz.rt(20);
                com.tencent.mm.plugin.backup.g.b.aUa();
                b.aTD().aSu().jqW = 14;
                this.jwz.ru(14);
                com.tencent.mm.plugin.backup.g.b.a(new e.3.1(this));
                AppMethodBeat.o(17546);
              }
            }
          }
          catch (Exception paramArrayOfByte)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.BackupPcServer", paramArrayOfByte, "onBackupPcServerNotify buf to BackupCommandResponse error.", new Object[0]);
            ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify reconnect is started, ignore. state[%d]", new Object[] { Integer.valueOf(paramInt1) });
            AppMethodBeat.o(17546);
          }
          continue;
        }
        if (paramInt1 == 17)
          localObject = new com.tencent.mm.plugin.backup.i.b();
      }
      try
      {
        ((com.tencent.mm.plugin.backup.i.b)localObject).parseFrom(paramArrayOfByte);
        ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandReq, cmd[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.b)localObject).jBh) });
        if (((com.tencent.mm.plugin.backup.i.b)localObject).jBh == 10)
        {
          paramInt1 = b.aTD().aSu().jqW;
          ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify pc request disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramInt1) });
          if ((paramInt1 == 12) || (paramInt1 == 14))
          {
            this.jwz.cancel(true);
            b.aTD().aTa().stop();
            b.aTD().aSu().jqW = -4;
            this.jwz.ru(-4);
            h.pYm.a(400L, 51L, 1L, false);
            this.jwz.rt(5);
            long l = 0L;
            if (e.b(this.jwz).jrH != 0L)
              l = bo.gb(e.b(this.jwz).jrH);
            h.pYm.e(13737, new Object[] { Integer.valueOf(3), Long.valueOf(e.b(this.jwz).aSH()), Long.valueOf(l / 1000L), Integer.valueOf(1) });
            ab.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify transfer disconnect, backupDataSize[%d kb], backupCostTime[%d s]", new Object[] { Long.valueOf(e.b(this.jwz).aSH()), Long.valueOf(l / 1000L) });
          }
        }
        AppMethodBeat.o(17546);
      }
      catch (Exception paramArrayOfByte)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BackupPcServer", paramArrayOfByte, "onBackupPcServerNotify buf to BackupCommandRequest error.", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e.3
 * JD-Core Version:    0.6.2
 */