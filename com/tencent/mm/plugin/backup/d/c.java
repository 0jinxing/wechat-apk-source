package com.tencent.mm.plugin.backup.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.c.a.a;
import com.tencent.mm.plugin.backup.g.b.c;
import com.tencent.mm.plugin.backup.g.j.a;
import com.tencent.mm.plugin.backup.i.y;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.m;
import com.tencent.mm.storage.n;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class c
  implements com.tencent.mm.plugin.backup.b.b.d, com.tencent.mm.plugin.backup.g.b.d
{
  private static boolean aGz = false;
  private static int eRu = 0;
  private static boolean jtr = false;
  private static boolean jts = false;
  String ceI;
  private boolean eVT;
  private long jrb;
  private boolean jsA;
  public com.tencent.mm.plugin.backup.b.b.d jsv;
  private boolean jtA;
  private int jtB;
  public String jtC;
  String jtD;
  int jtE;
  private ap jtF;
  final com.tencent.mm.ai.f jtG;
  private final com.tencent.mm.ai.f jtH;
  private final com.tencent.mm.ai.f jtI;
  public long jtJ;
  private int jtK;
  b.c jtL;
  private final j.a jtM;
  private com.tencent.mm.plugin.backup.c.d jti;
  private LinkedList<String> jtj;
  private LinkedList<Long> jtk;
  private LinkedList<String> jtl;
  private LinkedList<Long> jtm;
  public b.a jtn;
  private HashSet<String> jto;
  private long jtp;
  private long jtq;
  private boolean jtt;
  private HashSet<String> jtu;
  private int jtv;
  public boolean jtw;
  private boolean jtx;
  private boolean jty;
  private boolean jtz;
  private Object lock;
  private long recvSize;

  public c()
  {
    AppMethodBeat.i(17260);
    this.jrb = 0L;
    this.recvSize = 0L;
    this.lock = new Object();
    this.eVT = false;
    this.jto = new HashSet();
    this.jtp = 0L;
    this.jtq = 0L;
    this.jtt = true;
    this.jtu = new HashSet();
    this.jtv = 0;
    this.jtw = false;
    this.jtx = true;
    this.jty = true;
    this.jsA = false;
    this.jtz = false;
    this.jtA = false;
    this.jtG = new c.1(this);
    this.jtH = new c.5(this);
    this.jtI = new c.6(this);
    this.jtL = new c.10(this);
    this.jtM = new c.11(this);
    AppMethodBeat.o(17260);
  }

  private static void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(17268);
    y localy = new y();
    localy.jCx = paramString;
    localy.jCy = paramInt1;
    localy.jCA = paramInt2;
    localy.jCB = paramInt3;
    localy.jBT = paramInt4;
    try
    {
      com.tencent.mm.plugin.backup.g.b.r(localy.toByteArray(), 7, paramInt5);
      AppMethodBeat.o(17268);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "sendResp", new Object[0]);
        AppMethodBeat.o(17268);
      }
    }
  }

  public static boolean aTe()
  {
    AppMethodBeat.i(17261);
    boolean bool = aw.ZK().Yr().drz();
    AppMethodBeat.o(17261);
    return bool;
  }

  private void aTg()
  {
    AppMethodBeat.i(17265);
    String str1 = this.jtC;
    String str2 = this.jtD;
    String str3 = com.tencent.mm.plugin.backup.b.g.ds(ah.getContext());
    ab.e("MicroMsg.BackupMoveRecoverServer", "connect failed thisWifi:%s, oldPhoneWifiName:%s, oldPhoneIpAddress:%s, tryCount:%d", new Object[] { str3, str1, str2, Integer.valueOf(eRu) });
    if ((str3 == null) || (str3.equals("")))
    {
      h.pYm.a(485L, 1L, 1L, false);
      h.pYm.e(11787, new Object[] { Integer.valueOf(1) });
      b.aSZ().aSu().jqW = -1;
      rj(-1);
      AppMethodBeat.o(17265);
    }
    while (true)
    {
      return;
      if ((str1 == null) || (!str1.equals(str3)))
      {
        h.pYm.a(485L, 2L, 1L, false);
        h.pYm.e(11787, new Object[] { Integer.valueOf(2) });
        b.aSZ().aSu().jqW = -2;
        rj(-2);
        AppMethodBeat.o(17265);
      }
      else if (!com.tencent.mm.plugin.backup.b.g.Fc(str2))
      {
        h.pYm.a(485L, 3L, 1L, false);
        h.pYm.e(11787, new Object[] { Integer.valueOf(3) });
        b.aSZ().aSu().jqW = -3;
        rj(-3);
        AppMethodBeat.o(17265);
      }
      else if (eRu <= 0)
      {
        b.aSZ().aSu().jqW = -5;
        rj(-5);
        h.pYm.a(485L, 4L, 1L, false);
        h.pYm.e(11787, new Object[] { Integer.valueOf(6) });
        AppMethodBeat.o(17265);
      }
      else
      {
        eRu -= 1;
        bD(this.jtD, this.jtE);
        AppMethodBeat.o(17265);
      }
    }
  }

  public static String aTi()
  {
    AppMethodBeat.i(17272);
    String str = com.tencent.mm.plugin.backup.g.b.aTY();
    AppMethodBeat.o(17272);
    return str;
  }

  private static void aTj()
  {
    AppMethodBeat.i(17273);
    com.tencent.mm.plugin.backup.i.a locala = new com.tencent.mm.plugin.backup.i.a();
    locala.ID = b.aSZ().jqO;
    try
    {
      ab.i("MicroMsg.BackupMoveRecoverServer", "send cancel req.");
      com.tencent.mm.plugin.backup.g.b.K(locala.toByteArray(), 5);
      AppMethodBeat.o(17273);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
        AppMethodBeat.o(17273);
      }
    }
  }

  private void bD(String paramString, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(17264);
    b.aSZ().aTa().connect(paramString, paramInt);
    com.tencent.mm.plugin.backup.g.b.a(1, this.jtH);
    try
    {
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("ChattingRecordsKvstatDisable"), 0) == 0);
      while (true)
      {
        this.jty = bool;
        paramString = new com.tencent.mm.plugin.backup.g.a(b.aSZ().jqP, b.aSZ().jqQ, com.tencent.mm.plugin.backup.b.d.aSy(), b.aSZ().jqO, com.tencent.mm.plugin.backup.b.c.jqG, 22);
        paramString.u(this.jty, false);
        paramString.aUc();
        ab.i("MicroMsg.BackupMoveRecoverServer", "tryConnect start connect timehandler.");
        if (this.jtF == null)
          this.jtF = new ap(new c.4(this), false);
        this.jtF.ae(3000L, 3000L);
        AppMethodBeat.o(17264);
        return;
        bool = false;
      }
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "getInt", new Object[0]);
    }
  }

  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(17266);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      ab.i("MicroMsg.BackupMoveRecoverServer", "onNotify isLocal:%b, type:%d, seq:%d, buf.len:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((!paramBoolean) || (10011 != paramInt1))
        break label382;
      paramInt1 = b.aSZ().aSu().jqW;
      ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(paramInt1) });
      switch (paramInt1)
      {
      default:
        label164: AppMethodBeat.o(17266);
      case 1:
      case -21:
      case -13:
      case -5:
      case 22:
      case 23:
      case -4:
      }
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      b.aSZ().aTa().stop();
      if (!aGz)
      {
        if (this.jtF != null)
        {
          ab.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify stop backupConnectTimerHandler.");
          this.jtF.stopTimer();
        }
        aTg();
        AppMethodBeat.o(17266);
      }
      else
      {
        b.aSZ().aSu().jqW = -4;
        rj(-4);
        AppMethodBeat.o(17266);
        continue;
        b.aSZ().aTa().stop();
        AppMethodBeat.o(17266);
        continue;
        c(true, false, -4);
        b.aSZ().aTa().stop();
        jts = true;
        h.pYm.a(485L, 43L, 1L, false);
        rn(4);
        long l = 0L;
        if (this.jtp != 0L)
          l = bo.gb(this.jtp);
        ab.i("MicroMsg.BackupMoveRecoverServer", "processNetworkNotify recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", new Object[] { Long.valueOf(this.jrb), Long.valueOf(l) });
        AppMethodBeat.o(17266);
        continue;
        c(true, false, 0);
        break label164;
        label382: if (paramInt1 == 9)
        {
          com.tencent.mm.plugin.backup.i.e locale = (com.tencent.mm.plugin.backup.i.e)com.tencent.mm.plugin.backup.b.g.a(new com.tencent.mm.plugin.backup.i.e(), paramArrayOfByte);
          if (locale == null)
          {
            ab.e("MicroMsg.BackupMoveRecoverServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bo.cc(paramArrayOfByte)) });
            AppMethodBeat.o(17266);
          }
          else
          {
            ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat req, req:%s ack:%d", new Object[] { locale, Long.valueOf(locale.jxD) });
            paramArrayOfByte = new com.tencent.mm.plugin.backup.i.f();
            paramArrayOfByte.jxD = locale.jxD;
            try
            {
              ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak send heartbeat resp");
              com.tencent.mm.plugin.backup.g.b.r(paramArrayOfByte.toByteArray(), 10, paramInt2);
              AppMethodBeat.o(17266);
            }
            catch (Exception paramArrayOfByte)
            {
              ab.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
              AppMethodBeat.o(17266);
            }
          }
        }
        else
        {
          if (paramInt1 == 10)
          {
            paramArrayOfByte = (com.tencent.mm.plugin.backup.i.f)com.tencent.mm.plugin.backup.b.g.a(new com.tencent.mm.plugin.backup.i.f(), paramArrayOfByte);
            if (paramArrayOfByte != null);
            for (l = paramArrayOfByte.jxD; ; l = -1L)
            {
              ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat response, resp:%s ack:%d", new Object[] { paramArrayOfByte, Long.valueOf(l) });
              AppMethodBeat.o(17266);
              break;
            }
          }
          if (paramInt1 == 5)
          {
            h.pYm.a(485L, 51L, 1L, false);
            c(true, false, -100);
          }
          aw.RS().aa(new c.7(this, paramInt1, paramArrayOfByte, paramInt2));
          AppMethodBeat.o(17266);
        }
      }
    }
  }

  public final void aSL()
  {
    AppMethodBeat.i(17271);
    synchronized (this.lock)
    {
      if ((this.jti != null) && (this.jti.jsp))
      {
        ab.e("MicroMsg.BackupMoveRecoverServer", "startMerge hasStartMerge, return.");
        AppMethodBeat.o(17271);
      }
      while (true)
      {
        return;
        if (this.jti != null)
          this.jti.l(false, 0);
        if ((this.jto != null) && (this.jto.size() > 0))
          break;
        i = aw.ZK().Yr().drA();
        b.aSZ().aSu().jqW = 26;
        b.aSZ().aSu().jqZ = 0;
        rj(26);
        this.jtq = bo.anU();
        com.tencent.mm.plugin.backup.c.d locald = new com/tencent/mm/plugin/backup/c/d;
        b localb = b.aSZ();
        LinkedList localLinkedList1 = new java/util/LinkedList;
        localLinkedList1.<init>();
        LinkedList localLinkedList2 = new java/util/LinkedList;
        localLinkedList2.<init>();
        locald.<init>(localb, 22, this, i, false, localLinkedList1, localLinkedList2);
        this.jti = locald;
        this.jti.aSL();
        h.pYm.a(485L, 46L, 1L, false);
        AppMethodBeat.o(17271);
      }
      int i = this.jto.size();
    }
  }

  public final void aSt()
  {
    AppMethodBeat.i(17275);
    h.pYm.a(485L, 49L, 1L, false);
    h.pYm.a(485L, 50L, bo.gb(this.jtq) / 1000L, false);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xPH, Boolean.TRUE);
    ab.i("MicroMsg.BackupMoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS.");
    Object localObject;
    LinkedList localLinkedList;
    Cursor localCursor;
    if (!this.jsA)
    {
      localObject = aw.ZK().Yq();
      localLinkedList = new LinkedList();
      localCursor = ((n)localObject).baR();
      if (localCursor != null)
        break label145;
      ab.e("MicroMsg.BackupTempMoveTimeStorage", "getAllData failed.");
      if (localLinkedList.size() > 0)
        break label185;
      ab.e("MicroMsg.BackupMoveRecoverServer", "merge finish and BackupTempMoveTimeStorage is empty!");
    }
    while (true)
    {
      aTf();
      com.tencent.mm.plugin.backup.g.b.rx(22);
      com.tencent.mm.plugin.backup.g.b.aTV();
      com.tencent.mm.plugin.backup.g.b.aTX();
      AppMethodBeat.o(17275);
      return;
      label145: 
      while (localCursor.moveToNext())
      {
        localObject = new m();
        ((m)localObject).d(localCursor);
        localLinkedList.add(localObject);
      }
      localCursor.close();
      break;
      label185: ab.i("MicroMsg.BackupMoveRecoverServer", "merge finish and start update BackupMoveTimeStorage!");
      aw.ZK().Yp().f(this.ceI, localLinkedList);
    }
  }

  public final void aTf()
  {
    AppMethodBeat.i(17262);
    ab.i("MicroMsg.BackupMoveRecoverServer", "recover clearContinueRecoverData");
    this.jto.clear();
    AppMethodBeat.o(17262);
  }

  public final void aTh()
  {
    AppMethodBeat.i(17270);
    c(true, false, 28);
    b.aSZ().aTa().stop();
    AppMethodBeat.o(17270);
  }

  public final void c(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(17263);
    ab.i("MicroMsg.BackupMoveRecoverServer", "cancel backupMoveRecoverServer cancel isSelf[%b], needClearContinueRecoverData[%b], updateState[%d], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt), an.doQ() });
    if (!paramBoolean1)
      aTj();
    synchronized (this.lock)
    {
      this.eVT = true;
      if ((this.jti != null) && (this.jti.jsp))
      {
        this.jti.l(paramBoolean2, paramInt);
        this.jti = null;
        if ((i != 0) && (paramInt != 0))
        {
          b.aSZ().aSu().jqW = paramInt;
          rj(paramInt);
        }
        if (paramBoolean2)
          aTf();
        com.tencent.mm.plugin.backup.g.b.aTV();
        com.tencent.mm.plugin.backup.g.b.aTX();
        b.aSZ().aTa().jrq = null;
        AppMethodBeat.o(17263);
        return;
      }
      i = 1;
    }
  }

  public final void fk(boolean paramBoolean)
  {
    AppMethodBeat.i(17267);
    this.jtA = paramBoolean;
    Object localObject = new LinkedBlockingQueue();
    b.aSZ().aTa().jrq = new a.a()
    {
      public final void c(int paramAnonymousInt1, int paramAnonymousInt2, byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(17253);
        while (true)
        {
          if (!c.m(c.this));
          try
          {
            LinkedBlockingQueue localLinkedBlockingQueue = this.jtP;
            c.a locala = new com/tencent/mm/plugin/backup/d/c$a;
            locala.<init>(c.this, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousArrayOfByte);
            boolean bool = localLinkedBlockingQueue.offer(locala, 500L, TimeUnit.MILLISECONDS);
            if (bool)
            {
              ab.i("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse offer datapushQueue, datapushQueue size:%d", new Object[] { Integer.valueOf(this.jtP.size()) });
              AppMethodBeat.o(17253);
              return;
            }
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse onBackupMoveRecoverDatapushCallback e:%s", new Object[] { localException.getMessage() });
          }
        }
      }
    };
    com.tencent.mm.sdk.g.d.h(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(17254);
        while (true)
          if ((!c.m(c.this)) && (!c.aTl()))
            try
            {
              c.a locala = (c.a)this.jtP.poll(500L, TimeUnit.MILLISECONDS);
              ab.d("MicroMsg.BackupMoveRecoverServer", "startSendRequestSessionResponse datapushQueue size:%d, startNext receiveData:%s", new Object[] { Integer.valueOf(this.jtP.size()), locala });
              if (locala != null)
                c.this.a(locala.iae, locala.type, locala.buf, locala.fQi);
            }
            catch (Exception localException)
            {
              while (true)
                Object localObject = null;
            }
        AppMethodBeat.o(17254);
      }
    }
    , "startSendRequestSessionResponse.onNotifyWorker").start();
    this.jtl = new LinkedList();
    this.jtm = new LinkedList();
    aw.ZK().Yq().a(this.jtj, this.jtk, this.jtl, this.jtm);
    if ((!this.jsA) && (!paramBoolean))
    {
      LinkedList localLinkedList = this.jtl;
      localObject = this.jtm;
      this.jtl = new LinkedList();
      this.jtm = new LinkedList();
      aw.ZK().Yp().a(this.ceI, localLinkedList, (LinkedList)localObject, this.jtl, this.jtm);
    }
    localObject = new com.tencent.mm.plugin.backup.i.j();
    ((com.tencent.mm.plugin.backup.i.j)localObject).jBx = this.jtl;
    ((com.tencent.mm.plugin.backup.i.j)localObject).jBy = this.jtm;
    try
    {
      ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak send requestsession resp, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(this.jtj.size()), Integer.valueOf(((com.tencent.mm.plugin.backup.i.j)localObject).jBy.size()) });
      com.tencent.mm.plugin.backup.g.b.r(((com.tencent.mm.plugin.backup.i.j)localObject).toByteArray(), 12, this.jtK);
      com.tencent.mm.plugin.backup.g.b.aTW();
      if (this.jtz)
      {
        b.aSZ().aSu().O(23, 1, this.jtj.size());
        this.recvSize = b.aSZ().aSu().jra;
        rj(23);
        AppMethodBeat.o(17267);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupRequestSessionResponse err.", new Object[0]);
        continue;
        b.aSZ().aSu().a(23, 1, this.jtj.size(), 0L, this.jrb);
      }
    }
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17274);
    if (this.jsv != null)
      al.d(new c.2(this, paramInt));
    if (this.jtn != null)
      al.d(new c.3(this, paramInt));
    AppMethodBeat.o(17274);
  }

  public final void rn(int paramInt)
  {
    AppMethodBeat.i(17269);
    long l = 0L;
    if (this.jtp != 0L)
      l = bo.gb(this.jtp);
    h.pYm.e(11789, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt), Integer.valueOf(this.jtB), Long.valueOf(this.jrb / 1024L), Long.valueOf(l / 1000L) });
    ab.i("MicroMsg.BackupMoveRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d KB], recoverCostTime[%d s]", new Object[] { Integer.valueOf(11789), Integer.valueOf(paramInt), Long.valueOf(this.jrb / 1024L), Long.valueOf(l / 1000L) });
    AppMethodBeat.o(17269);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c
 * JD-Core Version:    0.6.2
 */