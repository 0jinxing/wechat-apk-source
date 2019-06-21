package com.tencent.mm.storage;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.l;
import java.util.LinkedList;
import java.util.List;

public final class t extends j<q>
{
  public static final String[] diI;
  public static final String[] fnj;
  public final h fni;
  private final l<r.c, r.a> xHV;

  static
  {
    AppMethodBeat.i(11917);
    fnj = new String[] { j.a(q.ccO, "BizTimeLineSingleMsgInfo") };
    diI = new String[] { "CREATE  INDEX IF NOT EXISTS msg_svr_id_index ON BizTimeLineSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS talker_index ON BizTimeLineSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  create_time_index ON BizTimeLineSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_index ON BizTimeLineSingleMsgInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_id_index ON BizTimeLineSingleMsgInfo ( status,talkerId ) ", "CREATE  INDEX IF NOT EXISTS  status_create_time_index ON BizTimeLineSingleMsgInfo ( status,createTime ) " };
    AppMethodBeat.o(11917);
  }

  public t(h paramh)
  {
    super(paramh, q.ccO, "BizTimeLineSingleMsgInfo", diI);
    AppMethodBeat.i(11907);
    this.xHV = new t.1(this);
    this.fni = paramh;
    AppMethodBeat.o(11907);
  }

  public static List<q> p(Cursor paramCursor)
  {
    AppMethodBeat.i(11910);
    LinkedList localLinkedList = new LinkedList();
    while (paramCursor.moveToNext())
    {
      q localq = new q();
      localq.d(paramCursor);
      localLinkedList.add(localq);
    }
    paramCursor.close();
    AppMethodBeat.o(11910);
    return localLinkedList;
  }

  public final boolean QS(String paramString)
  {
    AppMethodBeat.i(11914);
    q localq = new q();
    localq.field_talker = paramString;
    boolean bool = super.a(localq, false, new String[] { "talker" });
    paramString = new r.a();
    paramString.talker = localq.field_talker;
    paramString.jOa = localq;
    paramString.xId = r.b.xIg;
    a(paramString);
    AppMethodBeat.o(11914);
    return bool;
  }

  public final void a(r.a parama)
  {
    AppMethodBeat.i(11904);
    if (this.xHV.cF(parama))
      this.xHV.doNotify();
    AppMethodBeat.o(11904);
  }

  public final void a(r.c paramc)
  {
    AppMethodBeat.i(11906);
    this.xHV.remove(paramc);
    AppMethodBeat.o(11906);
  }

  public final void a(r.c paramc, Looper paramLooper)
  {
    AppMethodBeat.i(11905);
    this.xHV.a(paramc, paramLooper);
    AppMethodBeat.o(11905);
  }

  public final int baS()
  {
    int i = 0;
    AppMethodBeat.i(11912);
    Cursor localCursor = this.fni.a("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4", null, 0);
    if (localCursor.moveToFirst())
      i = localCursor.getInt(0);
    localCursor.close();
    AppMethodBeat.o(11912);
    return i;
  }

  public final q drQ()
  {
    q localq = null;
    AppMethodBeat.i(11911);
    Cursor localCursor = this.fni.a("SELECT * FROM BizTimeLineSingleMsgInfo where status != 4 order by createTime DESC limit 1", null, 0);
    if (localCursor.moveToFirst())
    {
      localq = new q();
      localq.d(localCursor);
    }
    localCursor.close();
    AppMethodBeat.o(11911);
    return localq;
  }

  public final boolean g(q paramq)
  {
    AppMethodBeat.i(11908);
    boolean bool = super.a(paramq, false);
    r.a locala = new r.a();
    locala.talker = paramq.field_talker;
    locala.jOa = paramq;
    locala.xId = r.b.xIf;
    a(locala);
    AppMethodBeat.o(11908);
    return bool;
  }

  public final boolean h(q paramq)
  {
    AppMethodBeat.i(11909);
    boolean bool = super.b(paramq, false, new String[] { "msgSvrId" });
    r.a locala = new r.a();
    locala.talker = paramq.field_talker;
    locala.jOa = paramq;
    locala.xId = r.b.xIh;
    a(locala);
    AppMethodBeat.o(11909);
    return bool;
  }

  public final void mJ(long paramLong)
  {
    AppMethodBeat.i(11915);
    Object localObject = new q();
    ((q)localObject).field_msgId = paramLong;
    super.a((c)localObject, false, new String[] { "msgId" });
    localObject = new r.a();
    ((r.a)localObject).xId = r.b.xIg;
    a((r.a)localObject);
    AppMethodBeat.o(11915);
  }

  public final int mN(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(11913);
    Object localObject = "SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4 and talkerId = " + paramLong + " ";
    localObject = this.fni.a((String)localObject, null, 0);
    if (((Cursor)localObject).moveToFirst())
      i = ((Cursor)localObject).getInt(0);
    ((Cursor)localObject).close();
    AppMethodBeat.o(11913);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.t
 * JD-Core Version:    0.6.2
 */