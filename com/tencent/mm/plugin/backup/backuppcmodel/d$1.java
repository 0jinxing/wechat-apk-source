package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.b.d;
import com.tencent.mm.plugin.backup.i.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class d$1
  implements b.d
{
  d$1(d paramd)
  {
  }

  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(17521);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify isLocal[%b], type[%d], seq[%d], buflen[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((!paramBoolean) || (10011 != paramInt1))
        break label86;
      d.a(this.jwr);
      AppMethodBeat.o(17521);
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      label86: if (paramInt1 == 5)
      {
        ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive cancelReq.");
        this.jwr.c(true, false, -100);
        h.pYm.a(400L, 52L, 1L, false);
        this.jwr.rt(5);
        AppMethodBeat.o(17521);
      }
      else
      {
        i = b.aTD().aTE().jwa;
        if ((2 != i) && (4 != i))
        {
          ab.e("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify cmdmode error[%d]", new Object[] { Integer.valueOf(b.aTD().aTE().jwa) });
          AppMethodBeat.o(17521);
        }
        else
        {
          long l;
          if (paramInt1 == 10)
          {
            paramArrayOfByte = (f)g.a(new f(), paramArrayOfByte);
            if (paramArrayOfByte != null);
            for (l = paramArrayOfByte.jxD; ; l = -1L)
            {
              ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive heartbeatResp, ack[%d]", new Object[] { Long.valueOf(l) });
              AppMethodBeat.o(17521);
              break;
            }
          }
          Object localObject;
          if (paramInt1 == 18)
          {
            localObject = new com.tencent.mm.plugin.backup.i.c();
            try
            {
              ((com.tencent.mm.plugin.backup.i.c)localObject).parseFrom(paramArrayOfByte);
              ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandResp, cmd[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.c)localObject).jBh) });
              if (((com.tencent.mm.plugin.backup.i.c)localObject).jBh == 9)
              {
                paramInt1 = com.tencent.mm.plugin.backup.g.b.aUb();
                if (paramInt1 == 1)
                {
                  com.tencent.mm.plugin.backup.g.b.ry(2);
                  ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify reconnect success");
                  this.jwr.rt(20);
                  com.tencent.mm.plugin.backup.g.b.aUa();
                  b.aTD().aSu().jqW = 23;
                  this.jwr.rj(23);
                  com.tencent.mm.plugin.backup.g.b.ry(0);
                  AppMethodBeat.o(17521);
                }
              }
            }
            catch (Exception paramArrayOfByte)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.BackupPcRecoverServer", paramArrayOfByte, "onBackupPcRecoverServerNotify buf to BackupCommandResponse error.", new Object[0]);
              ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify reconnect is started, ignore. state[%d]", new Object[] { Integer.valueOf(paramInt1) });
              AppMethodBeat.o(17521);
            }
          }
          else if (paramInt1 == 17)
          {
            localObject = new com.tencent.mm.plugin.backup.i.b();
            try
            {
              ((com.tencent.mm.plugin.backup.i.b)localObject).parseFrom(paramArrayOfByte);
              ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandReq, cmd[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.b)localObject).jBh) });
              if (((com.tencent.mm.plugin.backup.i.b)localObject).jBh == 10)
              {
                paramInt1 = b.aTD().aSu().jqW;
                ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify pc request disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramInt1) });
                if ((paramInt1 == 22) || (paramInt1 == 23))
                {
                  this.jwr.c(true, false, -4);
                  b.aTD().aTa().stop();
                  h.pYm.a(400L, 52L, 1L, false);
                  this.jwr.rt(5);
                  l = 0L;
                  if (d.b(this.jwr) != 0L)
                    l = bo.gb(d.b(this.jwr));
                  h.pYm.e(13737, new Object[] { Integer.valueOf(3), Long.valueOf(d.c(this.jwr)), Long.valueOf(l), Integer.valueOf(2) });
                  ab.i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", new Object[] { Long.valueOf(d.c(this.jwr)), Long.valueOf(l) });
                }
              }
              AppMethodBeat.o(17521);
            }
            catch (Exception paramArrayOfByte)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.BackupPcRecoverServer", paramArrayOfByte, "onBackupPcRecoverServerNotify buf to BackupCommandRequest error.", new Object[0]);
            }
          }
          else
          {
            aw.RS().aa(new d.1.1(this, paramInt1, paramArrayOfByte, paramInt2));
            AppMethodBeat.o(17521);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.d.1
 * JD-Core Version:    0.6.2
 */