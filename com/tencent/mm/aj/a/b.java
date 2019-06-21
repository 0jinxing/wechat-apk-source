package com.tencent.mm.aj.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.List;

public final class b extends com.tencent.mm.sdk.e.j<a>
  implements n.b
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;
  final l<b.a, b.a.b> fuL;

  static
  {
    AppMethodBeat.i(11513);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(a.ccO, "BizChatConversation") };
    AppMethodBeat.o(11513);
  }

  public b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, a.ccO, "BizChatConversation", null);
    AppMethodBeat.i(11494);
    this.fuL = new b.1(this);
    this.bSd = parame;
    parame.hY("BizChatConversation", "CREATE INDEX IF NOT EXISTS bizChatIdIndex ON BizChatConversation ( bizChatId )");
    parame.hY("BizChatConversation", "CREATE INDEX IF NOT EXISTS brandUserNameIndex ON BizChatConversation ( brandUserName )");
    parame.hY("BizChatConversation", "CREATE INDEX IF NOT EXISTS unreadCountIndex ON BizChatConversation ( unReadCount )");
    int i = 0;
    Cursor localCursor = parame.a("PRAGMA table_info( BizChatConversation)", null, 2);
    do
    {
      j = i;
      if (!localCursor.moveToNext())
        break;
      j = localCursor.getColumnIndex("name");
    }
    while ((j < 0) || (!"flag".equalsIgnoreCase(localCursor.getString(j))));
    int j = 1;
    localCursor.close();
    if (j == 0)
      parame.hY("BizChatConversation", "update BizChatConversation set flag = lastMsgTime");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().a(this);
    AppMethodBeat.o(11494);
  }

  public static long a(a parama, int paramInt, long paramLong)
  {
    long l = 0L;
    AppMethodBeat.i(11507);
    if (parama == null)
    {
      AppMethodBeat.o(11507);
      paramLong = l;
    }
    while (true)
    {
      label22: return paramLong;
      if (paramLong != 0L);
      while (true)
        switch (paramInt)
        {
        default:
          paramLong = a(parama, paramLong);
          AppMethodBeat.o(11507);
          break label22;
          paramLong = bo.anU();
        case 2:
        case 3:
        case 4:
        }
      paramLong = a(parama, paramLong) | 0x0;
      AppMethodBeat.o(11507);
      continue;
      paramLong = a(parama, paramLong) & 0xFFFFFFFF;
      AppMethodBeat.o(11507);
      continue;
      paramLong = a(parama, paramLong) & 0x0;
      AppMethodBeat.o(11507);
    }
  }

  private static long a(a parama, long paramLong)
  {
    return parama.field_flag & 0x0 | 0xFFFFFFFF & paramLong;
  }

  public static void a(a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(11505);
    if (parama.field_msgCount == 0)
    {
      String str = parama.field_brandUserName;
      long l = parama.field_bizChatId;
      parama.field_msgCount = ((com.tencent.mm.aj.o)g.K(com.tencent.mm.aj.o.class)).XP().aR(str, l);
      ab.i("MicroMsg.BizConversationStorage", "getMsgCount from message table");
    }
    while (true)
    {
      ab.i("MicroMsg.BizConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", new Object[] { Integer.valueOf(parama.field_msgCount), Long.valueOf(parama.field_bizChatId), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(11505);
      return;
      if (paramInt1 > 0)
      {
        parama.field_msgCount -= paramInt1;
        if (parama.field_msgCount < 0)
        {
          ab.e("MicroMsg.BizConversationStorage", "msg < 0 ,some path must be ignore!");
          parama.field_msgCount = 0;
        }
      }
      else if (paramInt2 > 0)
      {
        parama.field_msgCount += paramInt2;
      }
    }
  }

  public static boolean c(a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(11509);
    if (parama == null)
    {
      ab.e("MicroMsg.BizConversationStorage", "isPlacedTop failed, conversation null");
      AppMethodBeat.o(11509);
    }
    while (true)
    {
      return bool;
      if (a(parama, 4, 0L) != 0L)
      {
        bool = true;
        AppMethodBeat.o(11509);
      }
      else
      {
        AppMethodBeat.o(11509);
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(11498);
    ab.i("MicroMsg.BizConversationStorage", "onNotifyChange");
    if ((paramObject == null) || (!(paramObject instanceof String)))
      AppMethodBeat.o(11498);
    while (true)
    {
      return;
      paramn = (String)paramObject;
      if ((f.kq(paramn)) && (!t.mY(paramn)))
        e.G(paramn, true);
      AppMethodBeat.o(11498);
    }
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(11497);
    if (this.fuL != null)
      this.fuL.remove(parama);
    AppMethodBeat.o(11497);
  }

  public final void a(b.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(11496);
    this.fuL.a(parama, paramLooper);
    AppMethodBeat.o(11496);
  }

  public final boolean a(a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(11501);
    ab.d("MicroMsg.BizConversationStorage", "BizChatConversationStorage insert");
    if (parama == null)
    {
      ab.w("MicroMsg.BizConversationStorage", "insert wrong argument");
      AppMethodBeat.o(11501);
    }
    while (true)
    {
      return bool;
      bool = super.b(parama);
      ab.i("MicroMsg.BizConversationStorage", "BizChatConversationStorage insert res:%s", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        b.a.b localb = new b.a.b();
        localb.fxq = parama.field_bizChatId;
        localb.cwz = parama.field_brandUserName;
        localb.fxp = b.a.a.fxl;
        localb.fxr = parama;
        this.fuL.cF(localb);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11501);
    }
  }

  public final List<c> aC(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11504);
    ArrayList localArrayList = new ArrayList();
    if (bo.isNullOrNil(paramString2))
      AppMethodBeat.o(11504);
    while (true)
    {
      return localArrayList;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("select BizChatInfo.*");
      localStringBuilder.append(" from BizChatConversation , BizChatInfo");
      localStringBuilder.append(" where BizChatConversation.brandUserName = '").append(paramString1).append("'");
      localStringBuilder.append(" and BizChatInfo.brandUserName = '").append(paramString1).append("'");
      localStringBuilder.append(" and BizChatConversation.bizChatId");
      localStringBuilder.append(" = BizChatInfo.bizChatLocalId");
      localStringBuilder.append(" and BizChatInfo.chatName like '%").append(paramString2).append("%'");
      localStringBuilder.append(" order by BizChatConversation.flag desc");
      localStringBuilder.append(" , BizChatConversation.lastMsgTime desc");
      ab.d("MicroMsg.BizConversationStorage", "getBizChatConversationSearchCursor: sql:%s", new Object[] { localStringBuilder.toString() });
      paramString1 = rawQuery(localStringBuilder.toString(), new String[0]);
      if (paramString1 != null)
      {
        if (paramString1.moveToFirst())
          do
          {
            paramString2 = new c();
            paramString2.d(paramString1);
            localArrayList.add(paramString2);
          }
          while (paramString1.moveToNext());
        paramString1.close();
      }
      AppMethodBeat.o(11504);
    }
  }

  public final boolean b(a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(11502);
    if (parama == null)
    {
      ab.w("MicroMsg.BizConversationStorage", "update wrong argument");
      AppMethodBeat.o(11502);
    }
    while (true)
    {
      return bool;
      bool = super.a(parama);
      ab.i("MicroMsg.BizConversationStorage", "BizChatConversationStorage update res:%s", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        e.g(z.aeT().aK(parama.field_bizChatId));
        b.a.b localb = new b.a.b();
        localb.fxq = parama.field_bizChatId;
        localb.cwz = parama.field_brandUserName;
        localb.fxp = b.a.a.fxn;
        localb.fxr = parama;
        this.fuL.cF(localb);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11502);
    }
  }

  public final boolean fA(long paramLong)
  {
    AppMethodBeat.i(11511);
    a locala = fv(paramLong);
    boolean bool = this.bSd.hY("BizChatConversation", "update BizChatConversation set flag = " + a(locala, 3, locala.field_lastMsgTime) + " where bizChatId = " + locala.field_bizChatId);
    if (bool)
    {
      locala = fv(locala.field_bizChatId);
      b.a.b localb = new b.a.b();
      localb.fxq = locala.field_bizChatId;
      localb.cwz = locala.field_brandUserName;
      localb.fxp = b.a.a.fxn;
      localb.fxr = locala;
      this.fuL.cF(localb);
      this.fuL.doNotify();
    }
    AppMethodBeat.o(11511);
    return bool;
  }

  protected final void finalize()
  {
    AppMethodBeat.i(11495);
    ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(this);
    AppMethodBeat.o(11495);
  }

  public final a fv(long paramLong)
  {
    AppMethodBeat.i(11499);
    a locala = new a();
    locala.field_bizChatId = paramLong;
    super.b(locala, new String[0]);
    AppMethodBeat.o(11499);
    return locala;
  }

  public final boolean fw(long paramLong)
  {
    AppMethodBeat.i(11500);
    a locala = fv(paramLong);
    boolean bool = super.a(locala, new String[] { "bizChatId" });
    if (bool)
    {
      b.a.b localb = new b.a.b();
      localb.fxq = locala.field_bizChatId;
      localb.cwz = locala.field_brandUserName;
      localb.fxp = b.a.a.fxm;
      localb.fxr = locala;
      this.fuL.cF(localb);
      this.fuL.doNotify();
    }
    AppMethodBeat.o(11500);
    return bool;
  }

  public final boolean fx(long paramLong)
  {
    AppMethodBeat.i(11506);
    a locala = fv(paramLong);
    if ((locala.field_unReadCount == 0) && (locala.field_bizChatId == paramLong))
      AppMethodBeat.o(11506);
    while (true)
    {
      return true;
      locala.field_unReadCount = 0;
      locala.field_atCount = 0;
      b(locala);
      AppMethodBeat.o(11506);
    }
  }

  public final boolean fy(long paramLong)
  {
    AppMethodBeat.i(11508);
    boolean bool = c(fv(paramLong));
    AppMethodBeat.o(11508);
    return bool;
  }

  public final boolean fz(long paramLong)
  {
    AppMethodBeat.i(11510);
    fv(paramLong);
    Object localObject = fv(paramLong);
    boolean bool = this.bSd.hY("BizChatConversation", "update BizChatConversation set flag = " + a((a)localObject, 2, 0L) + " where bizChatId = " + ((a)localObject).field_bizChatId);
    if (bool)
    {
      a locala = fv(((a)localObject).field_bizChatId);
      localObject = new b.a.b();
      ((b.a.b)localObject).fxq = locala.field_bizChatId;
      ((b.a.b)localObject).cwz = locala.field_brandUserName;
      ((b.a.b)localObject).fxp = b.a.a.fxn;
      ((b.a.b)localObject).fxr = locala;
      this.fuL.cF(localObject);
      this.fuL.doNotify();
    }
    AppMethodBeat.o(11510);
    return bool;
  }

  public final Cursor rn(String paramString)
  {
    AppMethodBeat.i(11503);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select * from BizChatConversation");
    localStringBuilder.append(" where brandUserName = '").append(paramString).append("'");
    localStringBuilder.append(" order by flag desc , lastMsgTime desc");
    ab.d("MicroMsg.BizConversationStorage", "getBizChatConversationCursor: sql:%s", new Object[] { localStringBuilder.toString() });
    paramString = this.bSd.rawQuery(localStringBuilder.toString(), null);
    AppMethodBeat.o(11503);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.b
 * JD-Core Version:    0.6.2
 */