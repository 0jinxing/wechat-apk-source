package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.g.b.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Arrays;
import java.util.LinkedList;

final class c$4
  implements b.d
{
  c$4(c paramc)
  {
  }

  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(17502);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify isLocal[%b], type[%d], seq[%d], buf[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((!paramBoolean) || (paramArrayOfByte == null))
        break label255;
      if (10011 == paramInt1)
      {
        paramInt1 = b.aTD().aSu().jqW;
        ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify local disconnect, backupPcState[%d]", new Object[] { Integer.valueOf(paramInt1) });
      }
      switch (paramInt1)
      {
      default:
        label140: AppMethodBeat.o(17502);
      case 1:
      case -100:
      case -21:
      case -5:
      }
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      if (!c.access$200())
      {
        if (c.c(this.jwk) != null)
        {
          ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify stop backupConnectTimerHandler.");
          c.c(this.jwk).stopTimer();
        }
        c.d(this.jwk);
        AppMethodBeat.o(17502);
      }
      else
      {
        b.aTD().aTa().stop();
        b.aTD().aSu().jqW = -4;
        b.aTD().aTF().ru(-4);
        AppMethodBeat.o(17502);
        continue;
        b.aTD().aTa().stop();
        break label140;
        label255: Object localObject;
        if (paramInt1 == 17)
          localObject = new com.tencent.mm.plugin.backup.i.b();
        try
        {
          ((com.tencent.mm.plugin.backup.i.b)localObject).parseFrom(paramArrayOfByte);
          ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify receive commandReq, command[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.b)localObject).jBh) });
          i = ((com.tencent.mm.plugin.backup.i.b)localObject).jBh;
          switch (i)
          {
          case 2:
          case 4:
          case 6:
          default:
          case 1:
            while (true)
            {
              if (paramInt1 != 5)
                break label847;
              ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify receive cancelReq");
              h.pYm.e(13737, new Object[] { Integer.valueOf(5), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(b.aTD().aTE().jwg) });
              b.aTD().aSu().jqW = -100;
              b.aTD().aTF().ru(-100);
              AppMethodBeat.o(17502);
              break;
              c.a(this.jwk, 1, paramInt2);
            }
          case 5:
          case 3:
          case 7:
          }
        }
        catch (Exception paramArrayOfByte)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.BackupPcProcessMgr", paramArrayOfByte, "onBackupPcProcessMgrNotify buf to BackupCommandRequest error.", new Object[0]);
            continue;
            aw.ZK();
            if (!((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xPB, Boolean.FALSE)).booleanValue())
            {
              ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify not backuping, start new backup.");
              c.a(this.jwk, 5, paramInt2);
            }
            else
            {
              b.aTD();
              paramArrayOfByte = b.aSz().getString("BACKUP_PC_CHOOSE_SESSION", null);
              if (paramArrayOfByte == null)
              {
                ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify sessionString is null, start new backup.");
                c.a(this.jwk, 5, paramInt2);
              }
              else
              {
                ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify start continue Backup.");
                h.pYm.a(400L, 29L, 1L, false);
                this.jwk.jwa = 3;
                localObject = new java/util/LinkedList;
                ((LinkedList)localObject).<init>(Arrays.asList(g.cX(paramArrayOfByte, ",")));
                b.aTD().aTF().init();
                b.aTD().aTF().G((LinkedList)localObject);
                c.dA(5, paramInt2);
                b.aTD().aTF().aSs();
                this.jwk.rs(6);
                paramArrayOfByte = b.aTD().aTF();
                com.tencent.mm.plugin.backup.h.d.aUr().aUu();
                paramArrayOfByte.gx(paramArrayOfByte.jtQ.size());
                continue;
                c.b(this.jwk, 3, paramInt2);
                continue;
                aw.ZK();
                if (!((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xPC, Boolean.FALSE)).booleanValue())
                {
                  ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify not recovering, start new recover.");
                  c.b(this.jwk, 7, paramInt2);
                }
                else
                {
                  b.aTD().aTG();
                  if (!d.aTe())
                  {
                    ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify MsgDataIdList not exist, start new recover.");
                    c.b(this.jwk, 7, paramInt2);
                  }
                  else
                  {
                    ab.i("MicroMsg.BackupPcProcessMgr", "onBackupPcProcessMgrNotify continue Recover.");
                    h.pYm.a(400L, 30L, 1L, false);
                    this.jwk.jwa = 4;
                    b.aTD().aTG().init();
                    c.dA(7, paramInt2);
                    b.aTD().aTF().aSs();
                    this.jwk.rs(8);
                  }
                }
              }
            }
          }
          label847: AppMethodBeat.o(17502);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c.4
 * JD-Core Version:    0.6.2
 */