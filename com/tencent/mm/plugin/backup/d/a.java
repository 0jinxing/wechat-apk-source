package com.tencent.mm.plugin.backup.d;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.c.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.b
{
  public com.tencent.mm.plugin.backup.c.b jsS;
  public b.b jsT;
  public long jsU;
  public LinkedList<f.b> jsV;
  public LinkedList<f.b> jsW;
  public LinkedList<f.b> jsX;
  public boolean jsY;
  public boolean jsZ;
  private Object lock;

  public a()
  {
    AppMethodBeat.i(17223);
    this.lock = new Object();
    this.jsV = null;
    this.jsW = null;
    this.jsX = null;
    this.jsY = false;
    this.jsZ = false;
    AppMethodBeat.o(17223);
  }

  private static long E(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17225);
    long l1 = 0L;
    long l2 = l1;
    if (paramLinkedList != null)
    {
      l2 = l1;
      if (paramLinkedList.size() > 0)
      {
        l1 = ((f.b)paramLinkedList.get(0)).jrg;
        Iterator localIterator = paramLinkedList.iterator();
        l2 = l1;
        if (localIterator.hasNext())
        {
          paramLinkedList = (f.b)localIterator.next();
          if (l1 <= paramLinkedList.jrg)
            break label89;
          l1 = paramLinkedList.jrg;
        }
      }
    }
    label89: 
    while (true)
    {
      break;
      AppMethodBeat.o(17225);
      return l2;
    }
  }

  public final void B(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17231);
    ab.i("MicroMsg.BackupMoveChooseServer", "onCalcuConvFinish.");
    this.jsY = true;
    this.jsV = new LinkedList(paramLinkedList);
    this.jsU = E(this.jsV);
    aSX();
    ab.i("MicroMsg.BackupMoveChooseServer", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(aSU().size()), Integer.valueOf(aSV().size()) });
    if (this.jsT != null)
      this.jsT.B(aSV());
    AppMethodBeat.o(17231);
  }

  public final void C(LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17233);
    ab.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeFinish.");
    this.jsZ = true;
    this.jsV = ((LinkedList)paramLinkedList.clone());
    aSX();
    if (b.aSZ().aTb().jtV)
    {
      ab.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.aSZ().aTb().aTp();
      AppMethodBeat.o(17233);
    }
    while (true)
    {
      return;
      if (this.jsT != null)
        this.jsT.C(paramLinkedList);
      AppMethodBeat.o(17233);
    }
  }

  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<f.b> paramLinkedList)
  {
    AppMethodBeat.i(17227);
    if (paramInt == 0)
    {
      this.jsW = new LinkedList(paramLinkedList);
      AppMethodBeat.o(17227);
    }
    while (true)
    {
      return;
      this.jsW = new LinkedList();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        f.b localb = (f.b)paramLinkedList.next();
        if (com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().v(localb.jrf, paramLong1, paramLong2) > 0)
          this.jsW.add(localb);
      }
      AppMethodBeat.o(17227);
    }
  }

  public final void a(LinkedList<f.b> paramLinkedList, f.b paramb, int paramInt)
  {
    AppMethodBeat.i(17232);
    ab.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeProgress.");
    this.jsV = paramLinkedList;
    if (this.jsW != null)
    {
      Iterator localIterator = this.jsW.iterator();
      while (localIterator.hasNext())
      {
        f.b localb = (f.b)localIterator.next();
        if (localb.jrf.equals(paramb.jrf))
        {
          localb.jri = paramb.jri;
          localb.jrj = paramb.jrj;
        }
      }
    }
    if (b.aSZ().aTb().jtV)
    {
      ab.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.aSZ().aSu().O(13, paramInt, paramLinkedList.size());
      b.aSZ().aTb().rj(13);
    }
    if (this.jsT != null)
      this.jsT.a(aSV(), paramb, paramInt);
    AppMethodBeat.o(17232);
  }

  public final LinkedList<f.b> aSU()
  {
    AppMethodBeat.i(17224);
    if (this.jsV == null)
      this.jsV = new LinkedList();
    LinkedList localLinkedList = this.jsV;
    AppMethodBeat.o(17224);
    return localLinkedList;
  }

  public final LinkedList<f.b> aSV()
  {
    AppMethodBeat.i(17226);
    if (this.jsW == null)
      this.jsW = new LinkedList();
    LinkedList localLinkedList = this.jsW;
    AppMethodBeat.o(17226);
    return localLinkedList;
  }

  public final LinkedList<f.b> aSW()
  {
    AppMethodBeat.i(17228);
    if (this.jsX == null)
      this.jsX = new LinkedList();
    LinkedList localLinkedList = this.jsX;
    AppMethodBeat.o(17228);
    return localLinkedList;
  }

  public final void aSX()
  {
    AppMethodBeat.i(17230);
    b.aSZ();
    SharedPreferences localSharedPreferences = b.aSz();
    a(localSharedPreferences.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L), aSU());
    AppMethodBeat.o(17230);
  }

  public final long aSY()
  {
    long l = 0L;
    AppMethodBeat.i(17234);
    if (aSW() == null)
      AppMethodBeat.o(17234);
    while (true)
    {
      return l;
      Iterator localIterator = aSW().iterator();
      for (l = 0L; localIterator.hasNext(); l = ((f.b)localIterator.next()).jri + l);
      AppMethodBeat.o(17234);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(17229);
    synchronized (this.lock)
    {
      if (this.jsS != null)
      {
        this.jsS.cancel();
        this.jsS = null;
      }
      AppMethodBeat.o(17229);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.a
 * JD-Core Version:    0.6.2
 */