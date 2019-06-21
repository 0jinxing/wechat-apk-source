package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.c.b.a;
import com.tencent.mm.plugin.backup.c.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.a
{
  public long jsU;
  private LinkedList<f.b> jsV;
  private LinkedList<f.b> jsW;
  private LinkedList<f.b> jsX;
  public boolean jsY;
  com.tencent.mm.plugin.backup.c.b jtR;
  public boolean jvR;
  public b.a jvS;
  private Object lock;

  public a()
  {
    AppMethodBeat.i(17478);
    this.jvR = false;
    this.lock = new Object();
    this.jsV = null;
    this.jsW = null;
    this.jsX = null;
    this.jsY = false;
    AppMethodBeat.o(17478);
  }

  private static long E(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17479);
    long l1 = 0L;
    long l2 = l1;
    if (paramLinkedList != null)
    {
      l2 = l1;
      if (paramLinkedList.size() > 0)
      {
        l1 = ((f.b)paramLinkedList.get(0)).jrg;
        paramLinkedList = paramLinkedList.iterator();
        l2 = l1;
        if (paramLinkedList.hasNext())
        {
          f.b localb = (f.b)paramLinkedList.next();
          if (l1 <= localb.jrg)
            break label89;
          l1 = localb.jrg;
        }
      }
    }
    label89: 
    while (true)
    {
      break;
      AppMethodBeat.o(17479);
      return l2;
    }
  }

  private LinkedList<f.b> aSW()
  {
    AppMethodBeat.i(17484);
    if (this.jsX == null)
      this.jsX = new LinkedList();
    LinkedList localLinkedList = this.jsX;
    AppMethodBeat.o(17484);
    return localLinkedList;
  }

  public final void B(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17486);
    int i;
    if (paramLinkedList == null)
    {
      i = -1;
      ab.i("MicroMsg.BackupPcChooseServer", "onCalcuConvFinish, conv size[%d]", new Object[] { Integer.valueOf(i) });
      this.jsY = true;
      if ((paramLinkedList != null) && (paramLinkedList.size() != 0))
        break label134;
      if (this.jvS != null)
        this.jvS.B(paramLinkedList);
      if (this.jvR)
      {
        paramLinkedList = b.aTD().aTF();
        e.jwu = true;
        paramLinkedList.jtS.aSI();
        b.aTD().aTa().stop();
        b.aTD().aSu().jqW = -23;
        b.aTD().aTF().ru(-23);
      }
      AppMethodBeat.o(17486);
    }
    while (true)
    {
      return;
      i = paramLinkedList.size();
      break;
      label134: this.jsV = new LinkedList(paramLinkedList);
      this.jsU = E(this.jsV);
      b.aTD();
      SharedPreferences localSharedPreferences = b.aSz();
      a(localSharedPreferences.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L), aSU());
      ab.i("MicroMsg.BackupPcChooseServer", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(paramLinkedList.size()), Integer.valueOf(aSV().size()) });
      if (this.jvR)
      {
        F(aSV());
        b.aTD().aTF().G(g.A(aSW()));
        b.aTD().aTF().gx(aSW().size());
      }
      if (this.jvS != null)
        this.jvS.B(aSV());
      AppMethodBeat.o(17486);
    }
  }

  public final void F(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17483);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      this.jsX = new LinkedList();
      AppMethodBeat.o(17483);
    }
    while (true)
    {
      return;
      this.jsX = new LinkedList(paramLinkedList.subList(paramLinkedList.size() * 3 / 4, paramLinkedList.size()));
      this.jsX.addAll(paramLinkedList.subList(0, paramLinkedList.size() * 3 / 4));
      AppMethodBeat.o(17483);
    }
  }

  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17482);
    if (paramInt == 0)
    {
      this.jsW = new LinkedList(paramLinkedList);
      AppMethodBeat.o(17482);
    }
    while (true)
    {
      return;
      if (this.jsW == null)
        this.jsW = new LinkedList();
      while (true)
      {
        Iterator localIterator = paramLinkedList.iterator();
        while (localIterator.hasNext())
        {
          paramLinkedList = (f.b)localIterator.next();
          if (com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().v(paramLinkedList.jrf, paramLong1, paramLong2) > 0)
            this.jsW.add(paramLinkedList);
        }
        this.jsW.clear();
      }
      AppMethodBeat.o(17482);
    }
  }

  public final LinkedList<f.b> aSU()
  {
    AppMethodBeat.i(17480);
    if (this.jsV == null)
      this.jsV = new LinkedList();
    LinkedList localLinkedList = this.jsV;
    AppMethodBeat.o(17480);
    return localLinkedList;
  }

  public final LinkedList<f.b> aSV()
  {
    AppMethodBeat.i(17481);
    if (this.jsW == null)
      this.jsW = new LinkedList();
    LinkedList localLinkedList = this.jsW;
    AppMethodBeat.o(17481);
    return localLinkedList;
  }

  public final void aTC()
  {
    this.jsV = null;
    this.jsX = null;
    this.jsW = null;
    this.jsY = false;
  }

  public final void cancel()
  {
    AppMethodBeat.i(17487);
    ab.i("MicroMsg.BackupPcChooseServer", "cancel, stack:%s", new Object[] { bo.dpG() });
    synchronized (this.lock)
    {
      if (this.jtR != null)
      {
        this.jtR.cancel();
        this.jtR = null;
      }
      this.jsY = false;
      AppMethodBeat.o(17487);
      return;
    }
  }

  public final void fn(boolean paramBoolean)
  {
    AppMethodBeat.i(17485);
    ab.i("MicroMsg.BackupPcChooseServer", "calculateToChoose, isChooseAllRecords[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jvR = paramBoolean;
    com.tencent.mm.plugin.backup.h.d.aUr().aUu();
    com.tencent.mm.sdk.g.d.post(new a.1(this), "BackupPcChooseServer.calculateToChoose");
    AppMethodBeat.o(17485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.a
 * JD-Core Version:    0.6.2
 */