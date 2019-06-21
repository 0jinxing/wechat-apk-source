package com.tencent.mm.aj.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.aa;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.atomic.AtomicLong;

public final class d extends j<aa>
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;
  final l<d.a, d.a.b> fuL;
  private AtomicLong fxu;

  static
  {
    AppMethodBeat.i(11527);
    fnj = new String[] { j.a(c.ccO, "BizChatInfo") };
    AppMethodBeat.o(11527);
  }

  public d(com.tencent.mm.sdk.e.e arg1)
  {
    super(???, c.ccO, "BizChatInfo", null);
    AppMethodBeat.i(11518);
    this.fxu = new AtomicLong(-1L);
    this.fuL = new d.1(this);
    this.bSd = ???;
    ???.hY("BizChatInfo", "CREATE INDEX IF NOT EXISTS bizChatLocalIdIndex ON BizChatInfo ( bizChatLocalId )");
    ???.hY("BizChatInfo", "CREATE INDEX IF NOT EXISTS bizChatIdIndex ON BizChatInfo ( bizChatServId )");
    ???.hY("BizChatInfo", "CREATE INDEX IF NOT EXISTS brandUserNameIndex ON BizChatInfo ( brandUserName )");
    synchronized (this.fxu)
    {
      Cursor localCursor = this.bSd.a("select max(bizChatLocalId) from BizChatInfo", null, 2);
      long l1 = 0L;
      if (localCursor.moveToFirst())
      {
        long l2 = localCursor.getInt(0);
        l1 = l2;
        if (l2 > this.fxu.get())
        {
          this.fxu.set(l2);
          l1 = l2;
        }
      }
      localCursor.close();
      ab.i("MicroMsg.BizChatInfoStorage", "loading new BizChat id:".concat(String.valueOf(l1)));
      AppMethodBeat.o(11518);
      return;
    }
  }

  private long afi()
  {
    AppMethodBeat.i(11526);
    synchronized (this.fxu)
    {
      long l = this.fxu.incrementAndGet();
      ab.i("MicroMsg.BizChatInfoStorage", "incBizChatLocalId %d  ", new Object[] { Long.valueOf(l) });
      AppMethodBeat.o(11526);
      return l;
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(11520);
    if (this.fuL != null)
      this.fuL.remove(parama);
    AppMethodBeat.o(11520);
  }

  public final void a(d.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(11519);
    this.fuL.a(parama, paramLooper);
    AppMethodBeat.o(11519);
  }

  public final boolean a(c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(11524);
    if (paramc == null)
    {
      ab.w("MicroMsg.BizChatInfoStorage", "insert wrong argument");
      AppMethodBeat.o(11524);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramc.field_bizChatServId))
      {
        ab.e("MicroMsg.BizChatInfoStorage", "insert bizchat servid null");
        AppMethodBeat.o(11524);
      }
      else
      {
        Object localObject = rq(paramc.field_bizChatServId);
        if (localObject != null)
        {
          paramc.field_bizChatLocalId = ((c)localObject).field_bizChatLocalId;
          ab.e("MicroMsg.BizChatInfoStorage", "insert bizchat servid exist");
          bool = true;
          AppMethodBeat.o(11524);
        }
        else
        {
          paramc.field_bizChatLocalId = afi();
          bool = super.b(paramc);
          if (bool)
          {
            localObject = new d.a.b();
            ((d.a.b)localObject).fxq = paramc.field_bizChatLocalId;
            ((d.a.b)localObject).cwz = paramc.field_brandUserName;
            ((d.a.b)localObject).fxA = d.a.a.fxw;
            ((d.a.b)localObject).fxB = paramc;
            this.fuL.cF(localObject);
            this.fuL.doNotify();
          }
          AppMethodBeat.o(11524);
        }
      }
    }
  }

  public final c aK(long paramLong)
  {
    AppMethodBeat.i(11521);
    c localc = new c();
    localc.field_bizChatLocalId = paramLong;
    super.b(localc, new String[0]);
    AppMethodBeat.o(11521);
    return localc;
  }

  public final boolean b(c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(11525);
    if (paramc == null)
    {
      ab.w("MicroMsg.BizChatInfoStorage", "update wrong argument");
      AppMethodBeat.o(11525);
    }
    Object localObject;
    while (true)
    {
      return bool;
      if (paramc.field_bizChatLocalId < 0L)
      {
        ab.e("MicroMsg.BizChatInfoStorage", "update bizchat localid neg");
        AppMethodBeat.o(11525);
      }
      else
      {
        localObject = aK(paramc.field_bizChatLocalId);
        if ((bo.isNullOrNil(((c)localObject).field_bizChatServId)) || (((c)localObject).field_bizChatServId.equals(paramc.field_bizChatServId)))
          break;
        ab.e("MicroMsg.BizChatInfoStorage", "update bizchat servid nequal");
        AppMethodBeat.o(11525);
      }
    }
    if ((paramc == null) || (bo.isNullOrNil(paramc.field_chatName)))
      ab.i("MicroMsg.BizChatInfoStorage", "dealWithChatNamePY null");
    while (true)
    {
      bool = super.a(paramc);
      if (bool)
      {
        e.g(paramc);
        localObject = new d.a.b();
        ((d.a.b)localObject).fxq = paramc.field_bizChatLocalId;
        ((d.a.b)localObject).cwz = paramc.field_brandUserName;
        ((d.a.b)localObject).fxA = d.a.a.fxy;
        ((d.a.b)localObject).fxB = paramc;
        this.fuL.cF(localObject);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11525);
      break;
      paramc.field_chatNamePY = g.vo(paramc.field_chatName);
    }
  }

  public final boolean fw(long paramLong)
  {
    AppMethodBeat.i(11523);
    c localc = aK(paramLong);
    boolean bool = super.a(localc, new String[] { "bizChatLocalId" });
    if (bool)
    {
      d.a.b localb = new d.a.b();
      localb.fxq = localc.field_bizChatLocalId;
      localb.cwz = localc.field_brandUserName;
      localb.fxA = d.a.a.fxx;
      localb.fxB = localc;
      this.fuL.cF(localb);
      this.fuL.doNotify();
    }
    AppMethodBeat.o(11523);
    return bool;
  }

  public final c rq(String paramString)
  {
    AppMethodBeat.i(11522);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("select * ");
    ((StringBuilder)localObject3).append(" from BizChatInfo");
    ((StringBuilder)localObject3).append(" where bizChatServId = '").append(paramString).append("' ");
    ((StringBuilder)localObject3).append(" limit 1");
    paramString = ((StringBuilder)localObject3).toString();
    ab.d("MicroMsg.BizChatInfoStorage", "getByServId sql %s", new Object[] { paramString });
    localObject3 = rawQuery(paramString, new String[0]);
    paramString = localObject1;
    if (localObject3 != null)
    {
      paramString = localObject2;
      if (((Cursor)localObject3).moveToFirst())
      {
        paramString = new c();
        paramString.d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
    }
    AppMethodBeat.o(11522);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.d
 * JD-Core Version:    0.6.2
 */