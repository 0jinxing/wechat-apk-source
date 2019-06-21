package com.tencent.mm.storage;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.c.a;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class r extends com.tencent.mm.sdk.e.j<q>
{
  public static final String[] diI;
  public static final String[] fnj;
  private static final com.tencent.mm.a.f<Long, Boolean> xHW;
  public final h fni;
  private final l<c, a> xHV;
  private final long xHX;
  private AtomicLong xHY;
  private long xHZ;
  private long xIa;

  static
  {
    AppMethodBeat.i(11893);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(q.ccO, "BizTimeLineInfo") };
    diI = new String[] { "CREATE  INDEX IF NOT EXISTS msg_svr_id_index ON BizTimeLineInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS msg_id_index ON BizTimeLineInfo ( msgId ) ", "CREATE  INDEX IF NOT EXISTS talker_index ON BizTimeLineInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_index ON BizTimeLineInfo ( orderFlag ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_status_index ON BizTimeLineInfo ( orderFlag,status ) ", "CREATE  INDEX IF NOT EXISTS  has_show_talker_index ON BizTimeLineInfo ( hasShow,talker ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_index ON BizTimeLineInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  has_show_place_top_index ON BizTimeLineInfo ( hasShow,placeTop ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_place_top_index ON BizTimeLineInfo ( orderFlag,placeTop ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_has_show_index ON BizTimeLineInfo ( orderFlag,hasShow ) ", "CREATE  INDEX IF NOT EXISTS  talker_id_order_flag_index ON BizTimeLineInfo ( talkerId,orderFlag ) " };
    xHW = new com.tencent.mm.memory.a.c(3);
    AppMethodBeat.o(11893);
  }

  public r(h paramh)
  {
    super(paramh, q.ccO, "BizTimeLineInfo", diI);
    AppMethodBeat.i(11867);
    this.xHV = new r.1(this);
    this.xHX = 10L;
    this.xHY = new AtomicLong(10L);
    this.xHZ = 10L;
    this.fni = paramh;
    drN();
    AppMethodBeat.o(11867);
  }

  private void drN()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(11890);
        this.xHZ = (drO() >> 32);
        if (this.xHZ < 10L)
          this.xHZ = 10L;
        q localq = drI();
        if (localq == null)
        {
          ab.w("MicroMsg.BizTimeLineInfoStorage", "initGroupId is null, id %d", new Object[] { Long.valueOf(this.xHZ) });
          AppMethodBeat.o(11890);
          return;
        }
        if (localq.field_status == 4)
        {
          this.xHY.set(this.xHZ + 1L);
          this.xIa = this.xHY.longValue();
          ab.i("MicroMsg.BizTimeLineInfoStorage", "initGroupId id %d/%d, status %d", new Object[] { Long.valueOf(this.xHY.longValue()), Long.valueOf(this.xHZ), Integer.valueOf(localq.field_status) });
          AppMethodBeat.o(11890);
          continue;
        }
      }
      finally
      {
      }
      this.xHY.set(this.xHZ);
    }
  }

  private long drO()
  {
    try
    {
      AppMethodBeat.i(11891);
      Cursor localCursor = this.fni.a("select max(orderFlag) from BizTimeLineInfo", null, 2);
      long l = 0L;
      if (localCursor.moveToFirst())
      {
        l = localCursor.getLong(0);
        localCursor.close();
      }
      AppMethodBeat.o(11891);
      return l;
    }
    finally
    {
    }
  }

  private void mK(long paramLong)
  {
    try
    {
      AppMethodBeat.i(11887);
      this.xHZ = Math.max(paramLong, this.xHZ);
      AppMethodBeat.o(11887);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static List<q> p(Cursor paramCursor)
  {
    AppMethodBeat.i(11876);
    LinkedList localLinkedList = new LinkedList();
    while (paramCursor.moveToNext())
    {
      q localq = new q();
      localq.d(paramCursor);
      localLinkedList.add(localq);
    }
    paramCursor.close();
    AppMethodBeat.o(11876);
    return localLinkedList;
  }

  public final q B(long paramLong, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11872);
    q localq = new q();
    paramString = this.fni.a("BizTimeLineInfo", null, paramString + "=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst())
    {
      localq.d(paramString);
      paramString.close();
      AppMethodBeat.o(11872);
    }
    for (paramString = localq; ; paramString = localObject)
    {
      return paramString;
      paramString.close();
      AppMethodBeat.o(11872);
    }
  }

  public final boolean QS(String paramString)
  {
    AppMethodBeat.i(11885);
    q localq = new q();
    localq.field_talker = paramString;
    boolean bool = super.a(localq, false, new String[] { "talker" });
    paramString = new a();
    paramString.talker = localq.field_talker;
    paramString.jOa = localq;
    paramString.xId = r.b.xIg;
    a(paramString);
    AppMethodBeat.o(11885);
    return bool;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(11864);
    if (this.xHV.cF(parama))
      this.xHV.doNotify();
    AppMethodBeat.o(11864);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(11866);
    this.xHV.remove(paramc);
    AppMethodBeat.o(11866);
  }

  public final void a(c paramc, Looper paramLooper)
  {
    AppMethodBeat.i(11865);
    this.xHV.a(paramc, paramLooper);
    AppMethodBeat.o(11865);
  }

  public final List<q> ah(int paramInt, long paramLong)
  {
    AppMethodBeat.i(11873);
    Object localObject = this.fni;
    String str = "orderFlag DESC limit ".concat(String.valueOf(paramInt));
    localObject = p(((h)localObject).query("BizTimeLineInfo", null, "orderFlag<?", new String[] { String.valueOf(paramLong) }, null, null, str));
    AppMethodBeat.o(11873);
    return localObject;
  }

  public final void aol(String paramString)
  {
    AppMethodBeat.i(11870);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(11870);
      return;
    }
    if (((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString).Oe());
    for (int i = 1; ; i = 0)
    {
      Object localObject = "update BizTimeLineInfo set placeTop = " + i + " where status > 4 and talker = '" + paramString + "'";
      this.fni.hY("BizTimeLineInfo", (String)localObject);
      localObject = "update BizTimeLineInfo set placeTop = " + i + " where status < 4 and talker = '" + paramString + "'";
      this.fni.hY("BizTimeLineInfo", (String)localObject);
      localObject = drI();
      if ((localObject != null) && (paramString.equals(((q)localObject).field_talker)))
      {
        ((q)localObject).field_placeTop = i;
        super.b((com.tencent.mm.sdk.e.c)localObject, false, new String[] { "msgSvrId" });
      }
      paramString = new a();
      paramString.xId = r.b.xIh;
      a(paramString);
      AppMethodBeat.o(11870);
      break;
    }
  }

  public final long drB()
  {
    try
    {
      AppMethodBeat.i(11888);
      long l = this.xHY.longValue();
      AppMethodBeat.o(11888);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final List<q> drH()
  {
    AppMethodBeat.i(11874);
    List localList = p(this.fni.query("BizTimeLineInfo", null, null, null, null, null, "orderFlag DESC limit 10"));
    AppMethodBeat.o(11874);
    return localList;
  }

  public final q drI()
  {
    q localq = null;
    AppMethodBeat.i(11877);
    Cursor localCursor = this.fni.a("SELECT * FROM BizTimeLineInfo order by orderFlag DESC limit 1", null, 0);
    if (localCursor.moveToFirst())
    {
      localq = new q();
      localq.d(localCursor);
    }
    localCursor.close();
    AppMethodBeat.o(11877);
    return localq;
  }

  public final q drJ()
  {
    q localq = null;
    AppMethodBeat.i(11879);
    Cursor localCursor = this.fni.a("SELECT * FROM BizTimeLineInfo order by orderFlag asc limit 1", null, 0);
    if (localCursor.moveToFirst())
    {
      localq = new q();
      localq.d(localCursor);
    }
    localCursor.close();
    AppMethodBeat.o(11879);
    return localq;
  }

  public final void drK()
  {
    AppMethodBeat.i(11882);
    q localq = drI();
    if (localq == null)
      AppMethodBeat.o(11882);
    while (true)
    {
      return;
      mH(localq.field_orderFlag);
      AppMethodBeat.o(11882);
    }
  }

  public final long drL()
  {
    try
    {
      long l = this.xHZ;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long drM()
  {
    try
    {
      AppMethodBeat.i(11889);
      long l = this.xHY.incrementAndGet();
      AppMethodBeat.o(11889);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean eo(List<q> paramList)
  {
    AppMethodBeat.i(11871);
    boolean bool;
    if (bo.ek(paramList))
    {
      bool = false;
      AppMethodBeat.o(11871);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.ci.g.dOW().h(new r.4(this, paramList));
      bool = true;
      AppMethodBeat.o(11871);
    }
  }

  public final boolean g(q paramq)
  {
    AppMethodBeat.i(11868);
    boolean bool = super.a(paramq, false);
    mK(paramq.drB());
    a locala = new a();
    locala.talker = paramq.field_talker;
    locala.jOa = paramq;
    locala.xId = r.b.xIf;
    a(locala);
    AppMethodBeat.o(11868);
    return bool;
  }

  public final boolean h(q paramq)
  {
    AppMethodBeat.i(11869);
    boolean bool = super.b(paramq, false, new String[] { "msgSvrId" });
    a locala = new a();
    locala.talker = paramq.field_talker;
    locala.jOa = paramq;
    locala.xId = r.b.xIh;
    a(locala);
    AppMethodBeat.o(11869);
    return bool;
  }

  public final List<q> mD(long paramLong)
  {
    AppMethodBeat.i(11875);
    List localList = p(this.fni.query("BizTimeLineInfo", null, "orderFlag>=?", new String[] { String.valueOf(paramLong) }, null, null, "orderFlag DESC"));
    AppMethodBeat.o(11875);
    return localList;
  }

  public final q mE(long paramLong)
  {
    q localq = null;
    AppMethodBeat.i(11878);
    Object localObject = "SELECT * FROM BizTimeLineInfo where talkerId = " + paramLong + "  order by orderFlag DESC limit 1";
    localObject = this.fni.a((String)localObject, null, 0);
    if (((Cursor)localObject).moveToFirst())
    {
      localq = new q();
      localq.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    AppMethodBeat.o(11878);
    return localq;
  }

  public final void mF(long paramLong)
  {
    AppMethodBeat.i(11880);
    Object localObject;
    if (mG(paramLong) > 2000)
    {
      localObject = B(paramLong, "orderFlag");
      if (localObject != null)
      {
        ((q)localObject).field_status = 4;
        h((q)localObject);
      }
      AppMethodBeat.o(11880);
    }
    while (true)
    {
      return;
      long l1 = System.currentTimeMillis();
      long l2 = 0x0 & paramLong;
      localObject = "update BizTimeLineInfo set status = 4 where orderFlag >= " + l2 + " and status > 4";
      this.fni.hY("BizTimeLineInfo", (String)localObject);
      localObject = "update BizTimeLineInfo set status = 4 where orderFlag >= " + l2 + " and status < 4";
      this.fni.hY("BizTimeLineInfo", (String)localObject);
      ab.d("MicroMsg.BizTimeLineInfoStorage", "resetUnread cost %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      xHW.k(Long.valueOf(paramLong), Boolean.TRUE);
      AppMethodBeat.o(11880);
    }
  }

  public final int mG(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(11881);
    Object localObject = (Boolean)xHW.get(Long.valueOf(paramLong));
    if ((localObject != null) && (((Boolean)localObject).booleanValue()))
    {
      AppMethodBeat.o(11881);
      return i;
    }
    long l1 = System.currentTimeMillis();
    long l2 = 0x0 & paramLong;
    localObject = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + l2 + " and status > 4";
    localObject = this.fni.a((String)localObject, null, 0);
    if (((Cursor)localObject).moveToFirst());
    for (int j = ((Cursor)localObject).getInt(0); ; j = 0)
    {
      ((Cursor)localObject).close();
      localObject = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + l2 + " and status < 4";
      localObject = this.fni.a((String)localObject, null, 0);
      i = j;
      if (((Cursor)localObject).moveToFirst())
        i = j + ((Cursor)localObject).getInt(0);
      ((Cursor)localObject).close();
      j = i;
      if (i > 2000)
        j = 0;
      if (j == 0)
        xHW.k(Long.valueOf(paramLong), Boolean.TRUE);
      ab.d("MicroMsg.BizTimeLineInfoStorage", "getUnread cost %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      AppMethodBeat.o(11881);
      i = j;
      break;
    }
  }

  public final void mH(long paramLong)
  {
    AppMethodBeat.i(11883);
    com.tencent.mm.ci.g.dOW().h(new r.6(this, paramLong)).b(new a()
    {
    });
    AppMethodBeat.o(11883);
  }

  public final int mI(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(11884);
    long l = System.currentTimeMillis();
    Object localObject = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + (0x0 & paramLong) + " and hasShow < 1 ";
    localObject = this.fni.a((String)localObject, null, 0);
    if (((Cursor)localObject).moveToFirst());
    for (int j = ((Cursor)localObject).getInt(0); ; j = 0)
    {
      ab.d("MicroMsg.BizTimeLineInfoStorage", "getUnShowCount count = %d,cost = %d", new Object[] { Integer.valueOf(j), Long.valueOf(System.currentTimeMillis() - l) });
      ((Cursor)localObject).close();
      if (j > 2000)
      {
        if (this.xIa == this.xHY.longValue())
          drM();
        AppMethodBeat.o(11884);
        j = i;
      }
      while (true)
      {
        return j;
        AppMethodBeat.o(11884);
      }
    }
  }

  public final void mJ(long paramLong)
  {
    AppMethodBeat.i(11886);
    Object localObject = new q();
    ((q)localObject).field_msgId = paramLong;
    super.a((com.tencent.mm.sdk.e.c)localObject, false, new String[] { "msgId" });
    localObject = new a();
    ((a)localObject).xId = r.b.xIg;
    a((a)localObject);
    AppMethodBeat.o(11886);
  }

  public static final class a
  {
    public q jOa;
    public List<q> list;
    public String talker;
    public r.b xId = r.b.xIf;
    public boolean xIe = false;
  }

  public static abstract interface c
  {
    public abstract void a(Object paramObject, r.a parama);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.r
 * JD-Core Version:    0.6.2
 */