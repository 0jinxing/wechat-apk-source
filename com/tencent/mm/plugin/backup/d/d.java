package com.tencent.mm.plugin.backup.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.l;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.g.b.c;
import com.tencent.mm.plugin.backup.g.j.a;
import com.tencent.mm.plugin.backup.i.f;
import com.tencent.mm.plugin.backup.i.i;
import com.tencent.mm.plugin.backup.i.j;
import com.tencent.mm.plugin.backup.i.m;
import com.tencent.mm.plugin.backup.i.o;
import com.tencent.mm.plugin.backup.i.v;
import com.tencent.mm.plugin.backup.i.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
  implements b.b, com.tencent.mm.plugin.backup.g.b.d
{
  public static boolean jsA = false;
  public static boolean jtX = false;
  public byte[] bitmapData;
  public com.tencent.mm.plugin.backup.b.b.d jsv;
  public b.c jtL;
  public final j.a jtM;
  public LinkedList<String> jtQ;
  private com.tencent.mm.plugin.backup.c.b jtR;
  private com.tencent.mm.plugin.backup.c.c jtS;
  public long jtT;
  public long jtU;
  public boolean jtV;
  public int jtW;
  private int jtY;
  private int jtZ;
  public boolean jtw;
  private int jua;
  public e jub;

  public d()
  {
    AppMethodBeat.i(17290);
    this.jtT = 0L;
    this.jtU = 0L;
    this.jtV = false;
    this.jtW = 0;
    this.jtw = false;
    this.jua = 0;
    this.jtL = new d.2(this);
    this.jtM = new d.3(this);
    this.jub = new e(new d.4(this), b.aSZ().aSu());
    AppMethodBeat.o(17290);
  }

  private void A(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(17296);
    ab.i("MicroMsg.BackupMoveServer", "backupSendRequestSession sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(this.jtQ.size()), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    i locali = new i();
    locali.jBx = this.jtQ;
    locali.jBy = new LinkedList();
    Iterator localIterator = this.jtQ.iterator();
    while (localIterator.hasNext())
    {
      localIterator.next();
      locali.jBy.add(Long.valueOf(paramLong1));
      locali.jBy.add(Long.valueOf(paramLong2));
    }
    try
    {
      ab.i("MicroMsg.BackupMoveServer", "backupSendRequestSession, chooseConvNames size:%d", new Object[] { Integer.valueOf(this.jtQ.size()) });
      com.tencent.mm.plugin.backup.g.b.K(locali.toByteArray(), 11);
      AppMethodBeat.o(17296);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "backupSendRequestSession BackupRequestSession parse req failed.", new Object[0]);
        AppMethodBeat.o(17296);
      }
    }
  }

  private static void aTj()
  {
    AppMethodBeat.i(17297);
    com.tencent.mm.plugin.backup.i.a locala = new com.tencent.mm.plugin.backup.i.a();
    locala.ID = b.aSZ().jqO;
    try
    {
      ab.i("MicroMsg.BackupMoveServer", "backupSendCancelRequest.");
      com.tencent.mm.plugin.backup.g.b.K(locala.toByteArray(), 5);
      AppMethodBeat.o(17297);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
        AppMethodBeat.o(17297);
      }
    }
  }

  public static String aTq()
  {
    AppMethodBeat.i(17298);
    String str = com.tencent.mm.plugin.backup.g.b.aTY();
    AppMethodBeat.o(17298);
    return str;
  }

  public static void d(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    AppMethodBeat.i(17292);
    ab.i("MicroMsg.BackupMoveServer", "setBakupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong2 = 0L;
      paramLong1 = 0L;
    }
    b.aSZ();
    SharedPreferences.Editor localEditor = b.aSz().edit();
    localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", paramInt1);
    localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", paramLong1);
    localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", paramLong2);
    localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
    localEditor.commit();
    AppMethodBeat.o(17292);
  }

  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(17293);
    int i;
    label168: Object localObject;
    if (paramArrayOfByte == null)
    {
      i = -1;
      ab.i("MicroMsg.BackupMoveServer", "summerbak onNotify isLocal:%b type:%d seq:%d buf:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((paramBoolean) && (paramArrayOfByte != null) && (10011 == paramInt1))
      {
        i = b.aSZ().aSu().jqW;
        ab.i("MicroMsg.BackupMoveServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
      }
      switch (i)
      {
      default:
        if (paramInt1 == 1)
        {
          localObject = (v)com.tencent.mm.plugin.backup.b.g.a(new v(), paramArrayOfByte);
          if (localObject == null)
          {
            ab.e("MicroMsg.BackupMoveServer", "authReq parseBuf failed:%d", new Object[] { Integer.valueOf(bo.cc(paramArrayOfByte)) });
            b.aSZ().aSu().jqW = -5;
            rj(-5);
            AppMethodBeat.o(17293);
          }
        }
        break;
      case 1:
      case -23:
      case -21:
      case -5:
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
      b.aSZ().aTa().stop();
      b.aSZ().aSu().jqW = -100;
      rj(-100);
      break label168;
      b.aSZ().aTa().stop();
      break label168;
      cancel(true);
      b.aSZ().aTa().stop();
      b.aSZ().aSu().jqW = -4;
      rj(-4);
      h.pYm.a(485L, 24L, 1L, false);
      if ((this.jtS == null) || (this.jtS.jrH == 0L))
        break label168;
      long l = bo.gb(this.jtS.jrH);
      ab.i("MicroMsg.BackupMoveServer", "onNotify backup transfer disconnect, backupDataSize:%d kb, backupCostTime:%d s", new Object[] { Long.valueOf(this.jtS.aSH()), Long.valueOf(l / 1000L) });
      break label168;
      cancel(true);
      break label168;
      if (bo.isNullOrNil(b.aSZ().jqO))
        b.aSZ().jqO = ((v)localObject).ID;
      if (!((v)localObject).ID.equals(b.aSZ().jqO))
      {
        ab.e("MicroMsg.BackupMoveServer", "id not equel:self:%s, authReq.id:%s", new Object[] { b.aSZ().jqO, ((v)localObject).ID });
        cancel(false);
        b.aSZ().aSu().jqW = -5;
        rj(-5);
        AppMethodBeat.o(17293);
      }
      else
      {
        ab.i("MicroMsg.BackupMoveServer", "authReq info, id:%s, step:%d", new Object[] { ((v)localObject).ID, Integer.valueOf(((v)localObject).jCs) });
        if (((v)localObject).jCs == 0)
        {
          paramArrayOfByte = ((v)localObject).jBi.wR;
          if (!b.aSZ().jqP.equals(new String(l.c(paramArrayOfByte, com.tencent.mm.plugin.backup.b.d.aSy()))))
          {
            paramArrayOfByte = new w();
            paramArrayOfByte.jCs = 0;
            paramArrayOfByte.ID = b.aSZ().jqO;
            paramArrayOfByte.jBT = 1;
            ab.e("MicroMsg.BackupMoveServer", "get authReq step 0, but hello failed");
          }
          try
          {
            ab.i("MicroMsg.BackupMoveServer", "summerbak send authFailResp.");
            com.tencent.mm.plugin.backup.g.b.r(paramArrayOfByte.toByteArray(), 2, paramInt2);
            b.aSZ().aSu().jqW = -5;
            rj(-5);
            if (((v)localObject).Version < com.tencent.mm.plugin.backup.b.c.jqG)
            {
              ab.i("MicroMsg.BackupMoveServer", "summerbak old move, version:%d", new Object[] { Integer.valueOf(((v)localObject).Version) });
              h.pYm.a(485L, 103L, 1L, false);
              b.aSZ().aSu().jqW = -12;
              rj(-12);
              AppMethodBeat.o(17293);
            }
          }
          catch (Exception paramArrayOfByte)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
            ab.i("MicroMsg.BackupMoveServer", "summerbak start move");
            this.jtZ = paramInt2;
            if ((jtX) || (jsA))
            {
              if ((jtX) && (jsA) && ((((v)localObject).jCu & com.tencent.mm.plugin.backup.b.c.jqL) == 0) && ((((v)localObject).jCu & com.tencent.mm.plugin.backup.b.c.jqM) == 0))
              {
                b.aSZ().aSu().jqW = -31;
                rj(-31);
                this.jua = 1;
                AppMethodBeat.o(17293);
                continue;
              }
              if ((jtX) && ((((v)localObject).jCu & com.tencent.mm.plugin.backup.b.c.jqL) == 0))
              {
                b.aSZ().aSu().jqW = -32;
                rj(-32);
                this.jua = 2;
                AppMethodBeat.o(17293);
                continue;
              }
              if ((jsA) && ((((v)localObject).jCu & com.tencent.mm.plugin.backup.b.c.jqM) == 0))
              {
                b.aSZ().aSu().jqW = -33;
                rj(-33);
                this.jua = 3;
                AppMethodBeat.o(17293);
                continue;
              }
            }
            fl(false);
            AppMethodBeat.o(17293);
          }
        }
        else
        {
          if (((v)localObject).jCs == 1)
          {
            paramArrayOfByte = ((v)localObject).jBi.wR;
            if (!b.aSZ().jqQ.equals(new String(l.c(paramArrayOfByte, com.tencent.mm.plugin.backup.b.d.aSy()))))
            {
              ab.e("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok failed");
              b.aSZ().aSu().jqW = -5;
              rj(-5);
            }
            ab.i("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok success");
            b.aSZ().aSu().jqW = 2;
            rj(2);
          }
          AppMethodBeat.o(17293);
          continue;
          if (paramInt1 == 3)
          {
            this.jtY = paramInt2;
            if (b.aSZ().aTd().jsZ)
            {
              aTp();
              AppMethodBeat.o(17293);
            }
            else
            {
              this.jtV = true;
              AppMethodBeat.o(17293);
            }
          }
          else if (paramInt1 == 9)
          {
            localObject = (com.tencent.mm.plugin.backup.i.e)com.tencent.mm.plugin.backup.b.g.a(new com.tencent.mm.plugin.backup.i.e(), paramArrayOfByte);
            if (localObject == null)
            {
              ab.e("MicroMsg.BackupMoveServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bo.cc(paramArrayOfByte)) });
              AppMethodBeat.o(17293);
            }
            else
            {
              ab.i("MicroMsg.BackupMoveServer", "summerbak receive heartbeatReq,req:%s ack:%d", new Object[] { localObject, Long.valueOf(((com.tencent.mm.plugin.backup.i.e)localObject).jxD) });
              paramArrayOfByte = (f)com.tencent.mm.plugin.backup.b.g.a(new f(), paramArrayOfByte);
              paramArrayOfByte.jxD = ((com.tencent.mm.plugin.backup.i.e)localObject).jxD;
              try
              {
                ab.i("MicroMsg.BackupMoveServer", "summerbak send heartbeatResp");
                com.tencent.mm.plugin.backup.g.b.r(paramArrayOfByte.toByteArray(), 10, paramInt2);
                AppMethodBeat.o(17293);
              }
              catch (Exception paramArrayOfByte)
              {
                ab.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
                AppMethodBeat.o(17293);
              }
            }
          }
          else if (paramInt1 == 10)
          {
            localObject = new f();
            try
            {
              ((f)localObject).parseFrom(paramArrayOfByte);
              AppMethodBeat.o(17293);
            }
            catch (Exception paramArrayOfByte)
            {
              ab.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak heartbeatResp parse from buf error.", new Object[0]);
              AppMethodBeat.o(17293);
            }
          }
          else if (paramInt1 == 5)
          {
            ab.i("MicroMsg.BackupMoveServer", "summerbak receive command cancel");
            cancel(true);
            b.aSZ().aSu().jqW = -100;
            rj(-100);
            AppMethodBeat.o(17293);
          }
          else if (paramInt1 == 12)
          {
            localObject = (j)com.tencent.mm.plugin.backup.b.g.a(new j(), paramArrayOfByte);
            if (localObject == null)
            {
              ab.e("MicroMsg.BackupMoveServer", "requestSessionResp parseBuf failed:%d", new Object[] { Integer.valueOf(bo.cc(paramArrayOfByte)) });
              b.aSZ().aSu().jqW = -5;
              rj(-5);
              AppMethodBeat.o(17293);
            }
            else
            {
              paramArrayOfByte = com.tencent.mm.plugin.backup.b.g.b(((j)localObject).jBx, ((j)localObject).jBy);
              if (paramArrayOfByte == null);
              for (paramInt1 = -1; ; paramInt1 = paramArrayOfByte.size())
              {
                ab.i("MicroMsg.BackupMoveServer", "summerbak backup receive requestsession response. backupSessionList:%d ", new Object[] { Integer.valueOf(paramInt1) });
                if (paramArrayOfByte != null)
                  break label1528;
                ab.e("MicroMsg.BackupMoveServer", "requestSessionResp sessionName or timeInterval null or requestSessionResp number error.");
                aTj();
                b.aSZ().aSu().jqW = -21;
                rj(-21);
                AppMethodBeat.o(17293);
                break;
              }
              label1528: com.tencent.mm.plugin.backup.g.b.aTU();
              this.jtS = new com.tencent.mm.plugin.backup.c.c(b.aSZ(), 2, this);
              this.jtS.fj(false);
              this.jtS.a(paramArrayOfByte, b.aSZ().aSu().jrc, jsA);
            }
          }
          else
          {
            AppMethodBeat.o(17293);
          }
        }
      }
    }
  }

  public final void aSq()
  {
    AppMethodBeat.i(17300);
    com.tencent.mm.plugin.backup.g.b.rx(21);
    AppMethodBeat.o(17300);
  }

  public final void aSr()
  {
    AppMethodBeat.i(17301);
    cancel(false);
    AppMethodBeat.o(17301);
  }

  public final void aTp()
  {
    AppMethodBeat.i(17295);
    ab.i("MicroMsg.BackupMoveServer", "startRequestNotify receive start request.");
    this.jtV = false;
    b.aSZ().aSu().jqW = 12;
    rj(12);
    com.tencent.mm.plugin.backup.h.d.aUr().aUu();
    if (this.jtQ == null)
      AppMethodBeat.o(17295);
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupMoveServer", "transfer conversation size:%d", new Object[] { Integer.valueOf(this.jtQ.size()) });
      o localo = new o();
      localo.ID = b.aSZ().jqO;
      localo.jBR = this.jtQ.size();
      localo.jBS = b.aSZ().aTd().aSY();
      localo.jBT = 0;
      int i;
      if (this.jtw)
      {
        i = com.tencent.mm.plugin.backup.b.c.jqF;
        localo.jBU = i;
        if (jsA)
          localo.jBQ = 3;
        m localm = new m();
        localm.jBE = q.LM();
        localm.jBF = Build.MANUFACTURER;
        localm.jBG = Build.MODEL;
        localm.jBH = "Android";
        localm.jBI = Build.VERSION.RELEASE;
        localm.jBJ = com.tencent.mm.protocal.d.vxo;
        localm.jBK = 0L;
        ab.i("MicroMsg.BackupMoveServer", "startRequestNotify generalinfo wechatversion:%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo) });
        localo.jBO = localm;
      }
      try
      {
        com.tencent.mm.plugin.backup.g.b.r(localo.toByteArray(), 4, this.jtY);
        A(this.jtT, this.jtU);
        AppMethodBeat.o(17295);
        continue;
        i = com.tencent.mm.plugin.backup.b.c.jqE;
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.BackupMoveServer", "startRequestNotify prase startResp error!!");
        ab.printErrStackTrace("MicroMsg.BackupMoveServer", localIOException, "", new Object[0]);
        AppMethodBeat.o(17295);
      }
    }
  }

  public final void cancel(boolean paramBoolean)
  {
    AppMethodBeat.i(17291);
    ab.e("MicroMsg.BackupMoveServer", "summerbak BackupMoveServer CANCEL, Caller:%s", new Object[] { an.doQ() });
    if (!paramBoolean)
      aTj();
    if (this.jtS != null)
      this.jtS.cancel();
    if (this.jtR != null)
    {
      this.jtR.cancel();
      this.jtR = null;
    }
    ab.i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
    com.tencent.mm.plugin.backup.g.b.aTV();
    com.tencent.mm.plugin.backup.g.b.aTX();
    AppMethodBeat.o(17291);
  }

  public final void fl(boolean paramBoolean)
  {
    AppMethodBeat.i(17294);
    if (paramBoolean)
      switch (this.jua)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    while (true)
    {
      w localw = new w();
      localw.jCs = 0;
      localw.ID = b.aSZ().jqO;
      localw.Version = com.tencent.mm.plugin.backup.b.c.jqG;
      localw.jBT = 0;
      localw.jCt = this.jtW;
      localw.jBi = new com.tencent.mm.bt.b(l.d(b.aSZ().jqQ.getBytes(), com.tencent.mm.plugin.backup.b.d.aSy()));
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("ChattingRecordsKvstatDisable"), 0) == 0)
        localw.jCu |= com.tencent.mm.plugin.backup.b.c.jqK;
      localw.jCu |= com.tencent.mm.plugin.backup.b.c.jqL;
      localw.jCu |= com.tencent.mm.plugin.backup.b.c.jqM;
      try
      {
        ab.i("MicroMsg.BackupMoveServer", "summerbak send authSuccessResp.");
        com.tencent.mm.plugin.backup.g.b.r(localw.toByteArray(), 2, this.jtZ);
        AppMethodBeat.o(17294);
        return;
        jtX = false;
        jsA = false;
        this.jtT = 0L;
        this.jtU = 0L;
        continue;
        jtX = false;
        this.jtT = 0L;
        this.jtU = 0L;
        continue;
        jsA = false;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
          AppMethodBeat.o(17294);
        }
      }
    }
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17299);
    if (this.jsv != null)
      al.d(new d.1(this, paramInt));
    AppMethodBeat.o(17299);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.d
 * JD-Core Version:    0.6.2
 */