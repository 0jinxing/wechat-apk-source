package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.b.b.c;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.g.b.d;
import com.tencent.mm.plugin.backup.g.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public final class e
{
  private static boolean jsA = false;
  private static boolean jtX = false;
  static boolean jwu = false;
  private b.b jrE;
  final f jtI;
  LinkedList<String> jtQ;
  private com.tencent.mm.plugin.backup.c.b jtR;
  com.tencent.mm.plugin.backup.c.c jtS;
  private long jtT;
  private long jtU;
  public Set<b.c> jwm;
  public b.a jwn;
  private boolean jwp;
  public boolean jwv;
  public boolean jww;
  final f jwx;
  private final b.d jwy;

  public e()
  {
    AppMethodBeat.i(17553);
    this.jwm = new HashSet();
    this.jwp = false;
    this.jtT = 0L;
    this.jtU = 0L;
    this.jwv = false;
    this.jww = false;
    this.jtI = new e.1(this);
    this.jwx = new e.2(this);
    this.jwy = new e.3(this);
    this.jrE = new e.5(this);
    AppMethodBeat.o(17553);
  }

  public static void aTN()
  {
    jwu = true;
  }

  public static void e(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    AppMethodBeat.i(17557);
    ab.i("MicroMsg.BackupPcServer", "setBackupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong2 = 0L;
      paramLong1 = 0L;
    }
    b.aTD();
    SharedPreferences.Editor localEditor = b.aSz().edit();
    if (1 == b.aTD().aTE().jwa)
    {
      localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", paramInt1);
      localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
      localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", paramLong1);
      localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", paramLong2);
    }
    localEditor.commit();
    AppMethodBeat.o(17557);
  }

  public final void G(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(17556);
    this.jtQ = paramLinkedList;
    b.aTD();
    label95: int i;
    label101: SharedPreferences.Editor localEditor;
    if (b.aSz().getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0) == 1)
    {
      jtX = true;
      b.aTD();
      this.jtT = b.aSz().getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
      b.aTD();
      this.jtU = b.aSz().getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
      b.aTD();
      if (b.aSz().getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0) != 1)
        break label246;
      jsA = true;
      if (paramLinkedList != null)
        break label253;
      i = -1;
      ab.i("MicroMsg.BackupPcServer", "setBackupChooseData users size[%d], isSelectTime[%b], isQuickBackup[%b], selectStartTime[%d], selectEndTime[%d]", new Object[] { Integer.valueOf(i), Boolean.valueOf(jtX), Boolean.valueOf(jsA), Long.valueOf(this.jtT), Long.valueOf(this.jtU) });
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xPB, Boolean.TRUE);
      if (1 == b.aTD().aTE().jwa)
      {
        b.aTD();
        localEditor = b.aSz().edit();
        if (paramLinkedList != null)
          break label261;
      }
    }
    label261: for (paramLinkedList = new String[0]; ; paramLinkedList = (String[])paramLinkedList.toArray(new String[paramLinkedList.size()]))
    {
      localEditor.putString("BACKUP_PC_CHOOSE_SESSION", g.a("", ",", paramLinkedList));
      localEditor.commit();
      AppMethodBeat.o(17556);
      return;
      jtX = false;
      break;
      label246: jsA = false;
      break label95;
      label253: i = paramLinkedList.size();
      break label101;
    }
  }

  public final void aSs()
  {
    AppMethodBeat.i(17560);
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(this.jwm);
    al.d(new e.4(this, localHashSet));
    AppMethodBeat.o(17560);
  }

  public final void cancel(boolean paramBoolean)
  {
    AppMethodBeat.i(17555);
    ab.i("MicroMsg.BackupPcServer", "cancel, isSelf[%b], Caller:%s", new Object[] { Boolean.valueOf(paramBoolean), an.doQ() });
    jwu = true;
    if (!paramBoolean)
    {
      b.aTD().aTE();
      c.aTj();
    }
    this.jtS.cancel();
    if (this.jtR != null)
    {
      this.jtR.cancel();
      this.jtR = null;
    }
    com.tencent.mm.plugin.backup.g.b.aTV();
    com.tencent.mm.plugin.backup.g.b.aTX();
    com.tencent.mm.plugin.backup.g.b.aUa();
    AppMethodBeat.o(17555);
  }

  public final void gx(long paramLong)
  {
    int i = 3;
    AppMethodBeat.i(17558);
    ab.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest");
    com.tencent.mm.plugin.backup.g.b.a(3, this.jtI);
    k localk = new k(b.aTD().jqO);
    PLong localPLong1 = new PLong();
    PLong localPLong2 = new PLong();
    aw.ZK();
    g.a(localPLong1, localPLong2, com.tencent.mm.model.c.getAccPath());
    if (jsA);
    while (true)
    {
      localk.a(paramLong, g.gw(localPLong2.value), i);
      ab.i("MicroMsg.BackupPcServer", "backupPcSendStartRequest sessionCount:%d, transferType:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      localk.aUc();
      AppMethodBeat.o(17558);
      return;
      aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xPH, Boolean.FALSE)).booleanValue())
        i = 0;
      else
        i = 1;
    }
  }

  public final void init()
  {
    AppMethodBeat.i(17554);
    ab.i("MicroMsg.BackupPcServer", "BackupPcServer init.");
    jwu = false;
    this.jwp = false;
    com.tencent.mm.plugin.backup.g.b.a(this.jwy);
    this.jtS = new com.tencent.mm.plugin.backup.c.c(b.aTD(), 1, this.jrE);
    AppMethodBeat.o(17554);
  }

  public final void rt(int paramInt)
  {
    long l1 = 0L;
    AppMethodBeat.i(17559);
    long l2;
    if (this.jtS != null)
    {
      if (this.jtS.jrH != 0L)
        l1 = bo.gb(this.jtS.jrH);
      l2 = this.jtS.aSH();
    }
    while (true)
    {
      h.pYm.e(13737, new Object[] { Integer.valueOf(paramInt), Long.valueOf(l2), Long.valueOf(l1 / 1000L), Integer.valueOf(1), Integer.valueOf(b.aTD().aTE().jwg) });
      ab.i("MicroMsg.BackupPcServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], backupCostTime[%d s]", new Object[] { Integer.valueOf(13737), Integer.valueOf(paramInt), Long.valueOf(l2), Long.valueOf(l1 / 1000L) });
      AppMethodBeat.o(17559);
      return;
      l2 = 0L;
      l1 = 0L;
    }
  }

  public final void ru(int paramInt)
  {
    AppMethodBeat.i(17561);
    this.jrE.rj(paramInt);
    AppMethodBeat.o(17561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.e
 * JD-Core Version:    0.6.2
 */