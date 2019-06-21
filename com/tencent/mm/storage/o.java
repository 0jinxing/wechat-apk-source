package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.a;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class o extends e
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS bizchatmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT ) ", "CREATE INDEX IF NOT EXISTS  bizmessageChatIdIndex ON bizchatmessage ( bizChatId )", "CREATE INDEX IF NOT EXISTS  bizmessageSvrIdIndex ON bizchatmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizmessageTalkerIndex ON bizchatmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizmessageTalerStatusIndex ON bizchatmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTimeIndex ON bizchatmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTaklerTimeIndex ON bizchatmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageBizChatIdTypeCreateTimeIndex ON bizchatmessage ( bizChatId,type,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageSendCreateTimeIndex ON bizchatmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerTypeIndex ON bizchatmessage ( talker,type )" };

  public o(com.tencent.mm.plugin.messenger.foundation.a.a.h paramh)
  {
    super(paramh);
    AppMethodBeat.i(11826);
    a(bOy(), "bizchatmessage");
    a(new h.b(16, "bizchatmessage", h.b.a(2500001L, 3000000L, 99000001L, 102000000L)));
    AppMethodBeat.o(11826);
  }

  private static String aL(String paramString, long paramLong)
  {
    AppMethodBeat.i(11828);
    paramString = " bizChatId= " + paramLong + " AND talker= '" + paramString + "'";
    AppMethodBeat.o(11828);
    return paramString;
  }

  public final int Rh(String paramString)
  {
    AppMethodBeat.i(11837);
    ab.w("MicroMsg.BizChatMessageStorage", "not attention  deleteEnterpriseMsgByTalker :%s  stack:%s", new Object[] { paramString, an.doR() });
    String str = "talker= '" + paramString + "'";
    hZ(Rr(paramString), str);
    int i = bOy().delete(Rr(paramString), str, null);
    if (i != 0)
    {
      this.xHO.anF("delete_talker ".concat(String.valueOf(paramString)));
      paramString = new h.c(paramString, "delete", null, i, (byte)0);
      paramString.oqO = -1L;
      a(paramString);
    }
    AppMethodBeat.o(11837);
    return i;
  }

  protected final boolean a(bi parambi, bf.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(11831);
    if (parambi == null)
    {
      ab.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:message == null");
      AppMethodBeat.o(11831);
    }
    while (true)
    {
      return bool;
      parambi.eK(-1L);
      if (paramb != null)
      {
        if (f.kq(parambi.field_talker))
        {
          if (bo.isNullOrNil(paramb.fmz))
          {
            ab.w("MicroMsg.BizChatMessageStorage", "EnterpriseChat msgSourceValue error: %s", new Object[] { parambi.dqJ });
            AppMethodBeat.o(11831);
            continue;
          }
          localObject = new c();
          ((c)localObject).field_bizChatServId = paramb.fmz;
          ((c)localObject).field_brandUserName = parambi.field_talker;
          if (!bo.isNullOrNil(paramb.fmA))
            ((c)localObject).field_chatVersion = bo.getInt(paramb.fmA, -1);
          if (!bo.isNullOrNil(paramb.fmy))
            ((c)localObject).field_chatType = bo.getInt(paramb.fmy, -1);
          ab.d("MicroMsg.BizChatMessageStorage", "bizchatId:%s,userId:%s", new Object[] { paramb.fmz, paramb.userId });
          localObject = com.tencent.mm.aj.a.e.e((c)localObject);
          if (localObject != null)
          {
            parambi.eK(((c)localObject).field_bizChatLocalId);
            parambi.field_bizChatUserId = bo.nullAsNil(paramb.userId);
            parambi.dJo = true;
            if (paramb.fmC.equals("1"))
              parambi.hO(1);
            if ((parambi.field_isSend != 1) && (paramb.userId != null))
            {
              localObject = z.aeV().cI(parambi.field_talker);
              if (paramb.userId.equals(localObject))
                parambi.hO(1);
            }
            if (!bo.isNullOrNil(paramb.userId))
            {
              localObject = new j();
              ((j)localObject).field_userId = paramb.userId;
              ((j)localObject).field_userName = paramb.fmB;
              ((j)localObject).field_brandUserName = parambi.field_talker;
              z.aeV().c((j)localObject);
            }
          }
        }
      }
      else
      {
        while (bo.isNullOrNil(paramb.fmz))
        {
          Object localObject;
          AppMethodBeat.o(11831);
          bool = true;
          break;
          ab.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:bizChatInfo == null!");
          AppMethodBeat.o(11831);
          break;
        }
        ab.i("MicroMsg.BizChatMessageStorage", "is EnterpriseChat but contact not ready");
        AppMethodBeat.o(11831);
      }
    }
  }

  public final bi aM(String paramString, long paramLong)
  {
    bi localbi = null;
    AppMethodBeat.i(11829);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(11829);
    for (paramString = localbi; ; paramString = localbi)
    {
      return paramString;
      localbi = new bi();
      paramString = "select * from " + Rr(paramString) + " where" + aL(paramString, paramLong) + "order by createTime DESC limit 1";
      paramString = bOy().a(paramString, null, 0);
      if (paramString.getCount() != 0)
      {
        paramString.moveToFirst();
        localbi.d(paramString);
      }
      paramString.close();
      AppMethodBeat.o(11829);
    }
  }

  public final Cursor aN(String paramString, long paramLong)
  {
    String str = null;
    AppMethodBeat.i(11833);
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(11833);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      str = "select * from " + str + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + aL(paramString, paramLong) + "AND " + this.xHO.bOG() + "  order by createTime";
      paramString = bOy().a(str, null, 0);
      ab.d("MicroMsg.BizChatMessageStorage", "all time: %d, sql: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str });
      AppMethodBeat.o(11833);
    }
  }

  public final int aO(String paramString, long paramLong)
  {
    AppMethodBeat.i(11836);
    ab.w("MicroMsg.BizChatMessageStorage", "deleteByTalker :%s  stack:%s", new Object[] { paramString, an.doR() });
    hZ(Rr(paramString), aL(paramString, paramLong));
    int i = bOy().delete(Rr(paramString), aL(paramString, paramLong), null);
    if (i != 0)
    {
      this.xHO.anF("delete_talker ".concat(String.valueOf(paramString)));
      paramString = new h.c(paramString, "delete", null, i, (byte)0);
      paramString.oqO = -1L;
      a(paramString);
    }
    AppMethodBeat.o(11836);
    return i;
  }

  public final Cursor aP(String paramString, long paramLong)
  {
    AppMethodBeat.i(11838);
    paramString = bOy().query(Rr(paramString), null, aL(paramString, paramLong), null, null, null, "createTime ASC ");
    AppMethodBeat.o(11838);
    return paramString;
  }

  public final int aQ(String paramString, long paramLong)
  {
    AppMethodBeat.i(11840);
    int i;
    if (paramString == null)
    {
      ab.w("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable talker:%s,bizChatId:%s", new Object[] { paramString, Long.valueOf(paramLong) });
      i = -1;
      AppMethodBeat.o(11840);
    }
    while (true)
    {
      return i;
      a locala = z.aeU().fv(paramLong);
      if (locala.field_msgCount != 0)
      {
        i = locala.field_msgCount;
        AppMethodBeat.o(11840);
      }
      else
      {
        ab.i("MicroMsg.BizChatMessageStorage", "geBiztMsgCount contactMsgCount is 0 ,go normal %s", new Object[] { paramString });
        i = aR(paramString, paramLong);
        AppMethodBeat.o(11840);
      }
    }
  }

  public final int aR(String paramString, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(11841);
    paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE " + aL(paramString, paramLong);
    ab.v("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable sql:[%s]", new Object[] { paramString });
    paramString = bOy().a(paramString, null, 0);
    if (paramString.moveToLast())
      i = paramString.getInt(0);
    paramString.close();
    AppMethodBeat.o(11841);
    return i;
  }

  public final int aS(String paramString, long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(11842);
    paramString = "SELECT COUNT(*) FROM " + this.xHO.Rr(paramString) + " WHERE " + aL(paramString, paramLong) + "AND " + this.xHO.bOF();
    paramString = bOy().a(paramString, null, 0);
    if (paramString.moveToLast())
      i = paramString.getInt(0);
    paramString.close();
    AppMethodBeat.o(11842);
    return i;
  }

  public final String aog(String paramString)
  {
    AppMethodBeat.i(11827);
    boolean bool;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      if (!f.kq(paramString))
        break label46;
      paramString = "bizchatmessage";
      AppMethodBeat.o(11827);
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label46: paramString = null;
      AppMethodBeat.o(11827);
    }
  }

  public final Cursor b(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    String str = null;
    AppMethodBeat.i(11834);
    System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(11834);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from ( select * from " + str + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + aL(paramString, paramLong) + "AND " + this.xHO.bOF() + " order by createTime DESC limit " + paramInt2 + " OFFSET " + paramInt1 + ") order by createTime ASC ";
      paramString = bOy().a(paramString, null, 0);
      AppMethodBeat.o(11834);
    }
  }

  public final List<bi> b(String paramString, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(11832);
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid, limit = 10");
      paramString = null;
      AppMethodBeat.o(11832);
    }
    while (true)
    {
      return paramString;
      paramLong2 = this.xHO.Z(paramString, paramLong2);
      if (paramLong2 == 0L)
      {
        ab.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, msg is null");
        paramString = null;
        AppMethodBeat.o(11832);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        Cursor localCursor;
        if (paramBoolean)
        {
          paramString = "select * from " + Rr(paramString) + " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + aL(paramString, paramLong1) + "AND " + this.xHO.bOF() + " AND createTime > " + paramLong2 + "  order by createTime ASC limit 10";
          localCursor = bOy().a(paramString, null, 0);
          if (!localCursor.moveToFirst());
        }
        else
        {
          while (true)
          {
            if (localCursor.isAfterLast())
              break label322;
            paramString = new bi();
            paramString.d(localCursor);
            localCursor.moveToNext();
            if (paramBoolean)
            {
              localArrayList.add(paramString);
              continue;
              paramString = "select * from " + Rr(paramString) + " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + aL(paramString, paramLong1) + "AND " + this.xHO.bOF() + " AND createTime < " + paramLong2 + "  order by createTime DESC limit 10";
              break;
            }
            localArrayList.add(0, paramString);
          }
        }
        label322: localCursor.close();
        ab.i("MicroMsg.BizChatMessageStorage", "getBizChatImgVideoMessage spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(11832);
        paramString = localArrayList;
      }
    }
  }

  public final Cursor c(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    String str = null;
    AppMethodBeat.i(11835);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(11835);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from " + str + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + aL(paramString, paramLong1) + "AND " + this.xHO.bOF() + " AND createTime >= " + paramLong2 + " AND createTime< " + paramLong3 + " order by createTime ASC";
      paramString = bOy().a(paramString, null, 0);
      AppMethodBeat.o(11835);
    }
  }

  public final List<bi> o(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(11830);
    ArrayList localArrayList = new ArrayList();
    paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + aL(paramString, paramLong) + "AND isSend = 0 ORDER BY createTime DESC LIMIT " + paramInt;
    paramString = bOy().a(paramString, null, 0);
    if (paramString.moveToFirst())
      while (!paramString.isAfterLast())
      {
        bi localbi = new bi();
        localbi.d(paramString);
        paramString.moveToNext();
        if (localbi.isText())
          localArrayList.add(localbi);
      }
    paramString.close();
    AppMethodBeat.o(11830);
    return localArrayList;
  }

  public final Cursor p(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(11839);
    String str = "SELECT * FROM ( SELECT * FROM " + Rr(paramString) + " WHERE" + aL(paramString, paramLong) + "ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC";
    ab.d("MicroMsg.BizChatMessageStorage", "getBizInitCursor talker:%s, bizChatId:%s, limitCount:%s, sql:[%s]", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt), str });
    paramString = bOy().a(str, null, 0);
    AppMethodBeat.o(11839);
    return paramString;
  }

  public final int z(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(11843);
    bi localbi = this.xHO.jf(paramLong2);
    if (localbi.field_msgId == 0L)
    {
      ab.e("MicroMsg.BizChatMessageStorage", "getCountEarlyThan fail, msg does not exist");
      AppMethodBeat.o(11843);
    }
    while (true)
    {
      return j;
      String str = Rr(paramString);
      paramString = "SELECT COUNT(*) FROM " + str + " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  WHERE " + aL(paramString, paramLong1) + "AND " + this.xHO.bOF() + " AND createTime < " + localbi.field_createTime;
      paramString = bOy().a(paramString, null, 0);
      j = i;
      if (paramString.moveToLast())
        j = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(11843);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.o
 * JD-Core Version:    0.6.2
 */