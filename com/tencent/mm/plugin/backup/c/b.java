package com.tencent.mm.plugin.backup.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.backup.b.f.b;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.h.d;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;

public final class b
{
  public boolean jrv = false;

  public final void a(a parama)
  {
    AppMethodBeat.i(17172);
    ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation start");
    long l = bo.anU();
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = d.aUr().aUs().XR().c(t.fkP, g.Ko(), "*");
    if (localCursor.getCount() == 0)
    {
      if (parama != null)
        al.d(new b.1(this, parama, localLinkedList));
      ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation!");
      localCursor.close();
      AppMethodBeat.o(17172);
      return;
    }
    localCursor.moveToFirst();
    ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation count[%d]", new Object[] { Integer.valueOf(localCursor.getCount()) });
    label305: label486: 
    while (true)
    {
      if (this.jrv)
      {
        ab.e("MicroMsg.BackupCalculator", "calculateChooseConversation cancel.");
        localCursor.close();
        AppMethodBeat.o(17172);
        break;
      }
      ak localak = new ak();
      localak.d(localCursor);
      int i;
      if (!bo.isNullOrNil(localak.field_username))
      {
        i = d.aUr().aUs().XO().Rp(localak.field_username);
        if (i > 0)
          break label305;
        ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation:%s", new Object[] { localak.field_username });
      }
      while (true)
      {
        if (localCursor.moveToNext())
          break label486;
        localCursor.close();
        if ((!this.jrv) && (parama != null))
          al.d(new b.2(this, parama, localLinkedList));
        ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation finish, use time[%d]", new Object[] { Long.valueOf(bo.gb(l)) });
        AppMethodBeat.o(17172);
        break;
        aw.ZK();
        if (ad.Mn(c.XM().aoO(localak.field_username).field_verifyFlag))
        {
          ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation Biz conv:%s, msgCount[%d]", new Object[] { localak.field_username, Integer.valueOf(i) });
        }
        else
        {
          f.b localb = new f.b();
          localb.jrf = localak.field_username;
          localb.jrg = d.aUr().aUs().XO().Rs(localak.field_username);
          localb.jrh = d.aUr().aUs().XO().Rt(localak.field_username);
          ab.i("MicroMsg.BackupCalculator", "calculateChooseConversation add conv:%s, msgCount[%d], firstMsgTime[%d], lastMsgTime[%d]", new Object[] { localb.jrf, Integer.valueOf(i), Long.valueOf(localb.jrg), Long.valueOf(localb.jrh) });
          localLinkedList.add(localb);
        }
      }
    }
  }

  public final boolean a(f.b paramb, String paramString, long paramLong)
  {
    AppMethodBeat.i(17173);
    boolean bool;
    if (paramb == null)
    {
      bool = false;
      AppMethodBeat.o(17173);
    }
    while (true)
    {
      return bool;
      Cursor localCursor = d.aUr().aUs().XO().Rj(paramb.jrf);
      ab.i("MicroMsg.BackupCalculator", "calConversation start convName:%s msgCnt:%d[cu.getCount]", new Object[] { paramb.jrf, Integer.valueOf(localCursor.getCount()) });
      if (localCursor.moveToFirst())
      {
        PLong localPLong1 = new PLong();
        PLong localPLong2 = new PLong();
        while (true)
          if (!localCursor.isAfterLast())
          {
            if (this.jrv)
            {
              ab.i("MicroMsg.BackupCalculator", "calConversation cancel, return");
              localCursor.close();
              bool = true;
              AppMethodBeat.o(17173);
              break;
            }
            bi localbi = new bi();
            localbi.d(localCursor);
            try
            {
              com.tencent.mm.plugin.backup.f.h.a(localbi, true, paramString, localPLong1, null, null, false, false, paramLong);
              localPLong2.value += 1L;
              localCursor.moveToNext();
            }
            catch (Exception localException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.BackupCalculator", localException, "packedMsg", new Object[0]);
            }
          }
        paramb.jri = localPLong1.value;
        paramb.jrj = localPLong2.value;
        ab.i("MicroMsg.BackupCalculator", "calConversation convName:%s, convDataSize:%d, convMsgCount:%d", new Object[] { paramb.jrf, Long.valueOf(paramb.jri), Long.valueOf(paramb.jrj) });
      }
      localCursor.close();
      bool = false;
      AppMethodBeat.o(17173);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(17171);
    ab.i("MicroMsg.BackupCalculator", "cancel. stack:%s", new Object[] { bo.dpG() });
    this.jrv = true;
    AppMethodBeat.o(17171);
  }

  public static abstract interface a
  {
    public abstract void B(LinkedList<f.b> paramLinkedList);
  }

  public static abstract interface b extends b.a
  {
    public abstract void C(LinkedList<f.b> paramLinkedList);

    public abstract void a(LinkedList<f.b> paramLinkedList, f.b paramb, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.b
 * JD-Core Version:    0.6.2
 */