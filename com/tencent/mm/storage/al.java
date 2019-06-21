package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.f;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class al extends n
  implements be
{
  public static final String[] fnj;
  private final com.tencent.mm.sdk.e.e bSd;
  private be.b xXr;
  private com.tencent.mm.plugin.messenger.foundation.a.e xXs;
  private al.a xXt;
  private l<be.a, ak> xXu;
  private l<be.a, ak> xXv;

  static
  {
    AppMethodBeat.i(1265);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(com.tencent.mm.o.a.ccO, "rconversation"), com.tencent.mm.sdk.e.j.a(com.tencent.mm.o.a.ccO, "rbottleconversation"), "CREATE TABLE IF NOT EXISTS conversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );", "CREATE TABLE IF NOT EXISTS bottleconversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );", "DROP INDEX IF EXISTS rconversation_unreadcount_index ", "DROP INDEX IF EXISTS multi_index ", "CREATE INDEX IF NOT EXISTS rconversation_multi_index ON  rconversation ( unReadCount,parentRef )", "CREATE INDEX IF NOT EXISTS rconversation_parentref_index ON  rconversation ( parentRef )", "CREATE INDEX IF NOT EXISTS rbottleconversation_unreadcount_index ON  rbottleconversation ( unReadCount )" };
    AppMethodBeat.o(1265);
  }

  public al(com.tencent.mm.sdk.e.e parame)
  {
    AppMethodBeat.i(1199);
    this.xXt = new al.a((byte)0);
    this.xXu = new al.1(this);
    this.xXv = new l()
    {
    };
    Assert.assertTrue(parame instanceof com.tencent.mm.cd.h);
    Object localObject = parame.a("PRAGMA table_info( rconversation)", null, 2);
    int i = ((Cursor)localObject).getColumnIndex("name");
    do
      if (!((Cursor)localObject).moveToNext())
        break;
    while ((i < 0) || (!"flag".equalsIgnoreCase(((Cursor)localObject).getString(i))));
    for (i = 1; ; i = 0)
    {
      ((Cursor)localObject).close();
      localObject = com.tencent.mm.sdk.e.j.a(com.tencent.mm.o.a.ccO, "rconversation", parame);
      ((List)localObject).addAll(com.tencent.mm.sdk.e.j.a(com.tencent.mm.o.a.ccO, "rbottleconversation", parame));
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        parame.hY("rconversation", (String)((Iterator)localObject).next());
      if (i == 0)
        parame.hY("rconversation", "update rconversation set flag = conversationTime");
      this.bSd = parame;
      AppMethodBeat.o(1199);
      return;
    }
  }

  private static String aoW(String paramString)
  {
    AppMethodBeat.i(1200);
    ab.v("MicroMsg.ConversationStorage", "talker :".concat(String.valueOf(paramString)));
    if (ad.mR(paramString))
    {
      paramString = "rbottleconversation";
      AppMethodBeat.o(1200);
    }
    while (true)
    {
      return paramString;
      paramString = "rconversation";
      AppMethodBeat.o(1200);
    }
  }

  private static long c(ak paramak)
  {
    AppMethodBeat.i(1207);
    long l;
    if (paramak != null)
    {
      l = com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramak, paramak.field_conversationTime);
      AppMethodBeat.o(1207);
    }
    while (true)
    {
      return l;
      l = bo.anU() & 0xFFFFFFFF;
      AppMethodBeat.o(1207);
    }
  }

  private long dsM()
  {
    AppMethodBeat.i(1225);
    long l1 = System.currentTimeMillis();
    long l2 = 0L;
    Cursor localCursor = this.bSd.a("select max(conversationTime) as conversationTime from rconversation", null, 2);
    while (localCursor.moveToNext())
      l2 = localCursor.getLong(0);
    localCursor.close();
    ab.d("MicroMsg.ConversationStorage", "latestConversationTime = %s, cost = %d", new Object[] { Long.valueOf(l2), Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(1225);
    return l2;
  }

  private static void e(ak paramak)
  {
    AppMethodBeat.i(1224);
    if (paramak == null)
      AppMethodBeat.o(1224);
    while (true)
    {
      return;
      if (paramak.field_unReadCount > 0)
      {
        ab.d("MicroMsg.ConversationStorage", "jacks check attrFlag & cancel mark");
        if ((paramak.field_attrflag & 0x100000) != 0)
        {
          paramak.hM(paramak.field_unReadCount - 1);
          paramak.hQ(paramak.field_attrflag & 0xFFEFFFFF);
        }
      }
      AppMethodBeat.o(1224);
    }
  }

  private static String z(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(1236);
    String str = "";
    Object localObject = str;
    if (paramList != null)
    {
      localObject = str;
      if (paramList.size() > 0)
      {
        paramString = "" + paramString + " not in (";
        int i = 0;
        if (i < paramList.size())
        {
          localObject = new StringBuilder().append(paramString).append("\"").append(bo.vA((String)paramList.get(i))).append("\"");
          if (i == paramList.size() - 1);
          for (paramString = ""; ; paramString = ",")
          {
            paramString = paramString;
            i++;
            break;
          }
        }
        localObject = paramString + ") ";
      }
    }
    AppMethodBeat.o(1236);
    return localObject;
  }

  public final Cursor A(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(1246);
    ab.i("MicroMsg.ConversationStorage", "getTotalUnreadCursor filter[%s] [%s]", new Object[] { paramString, bo.dpG() });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select sum(unReadCount) from rconversation, rcontact");
    localStringBuilder.append(" where rconversation.unReadCount > 0 AND (rconversation.parentRef is ").append(com.tencent.mm.o.a.ewS).append(" or parentRef = '' ) AND rconversation.username = rcontact.username").append(bo.nullAsNil(paramString)).append(" AND ( type & 512 ) == 0");
    localStringBuilder.append(" AND rcontact.username != 'officialaccounts'");
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        paramList = (String)paramString.next();
        localStringBuilder.append(" AND rconversation.username != '").append(paramList).append("'");
      }
    }
    paramString = localStringBuilder.toString();
    ab.v("MicroMsg.ConversationStorage", "get total unread with black list, sql is %s", new Object[] { paramString });
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(1246);
    return paramString;
  }

  public final be.b Cb()
  {
    return this.xXr;
  }

  public final boolean MV(String paramString)
  {
    AppMethodBeat.i(1243);
    paramString = this.bSd.a(aoW(paramString), null, "username=?", new String[] { String.valueOf(paramString) }, null, null, null, 2);
    if (paramString.moveToFirst());
    for (boolean bool = true; ; bool = false)
    {
      paramString.close();
      AppMethodBeat.o(1243);
      return bool;
    }
  }

  public final int a(ak paramak, String paramString)
  {
    AppMethodBeat.i(138674);
    int i = a(paramak, paramString, true);
    AppMethodBeat.o(138674);
    return i;
  }

  public final int a(ak paramak, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(1223);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "update conversation failed");
      AppMethodBeat.o(1223);
      i = 0;
      return i;
    }
    if (paramBoolean)
      paramak.eE(c(paramak));
    e(paramak);
    int i = this.bSd.update(aoW(paramString), paramak.Hl(), "username=?", new String[] { paramString });
    if (i != 0)
      b(3, this, paramString);
    while (true)
    {
      AppMethodBeat.o(1223);
      break;
      ab.e("MicroMsg.ConversationStorage", "update failed return 0,  table:%s", new Object[] { aoW(paramString) });
    }
  }

  public final Cursor a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(1234);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite");
    localStringBuilder.append(" from rconversation where ");
    if (com.tencent.mm.o.a.ewS == paramString2)
      localStringBuilder.append(" ( parentRef is null  or parentRef = '' ) ");
    while (true)
    {
      localStringBuilder.append(bo.nullAsNil(paramString1));
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      paramString1 = paramList.iterator();
      while (paramString1.hasNext())
      {
        paramList = (String)paramString1.next();
        localStringBuilder.append(" and rconversation.username != '").append(paramList).append("'");
      }
      if ("*".equals(paramString2))
        localStringBuilder.append(" 1 = 1 ");
      else
        localStringBuilder.append("parentRef = '").append(bo.vA(paramString2)).append("' ");
    }
    localStringBuilder.append(" order by flag desc");
    ab.d("MicroMsg.ConversationStorage", "getNecessaryCursor sql " + localStringBuilder.toString());
    paramString1 = this.bSd;
    paramList = localStringBuilder.toString();
    if (paramBoolean);
    for (int i = 4; ; i = 0)
    {
      paramString1 = paramString1.a(paramList, null, i);
      AppMethodBeat.o(1234);
      return paramString1;
    }
  }

  public final Cursor a(String paramString1, List<String> paramList, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(1237);
    String str1 = " ";
    String str2 = str1;
    if (paramString2 != null)
    {
      str2 = str1;
      if (paramString2.length() > 0)
        str2 = " and rconversation.username = rcontact.username ";
    }
    paramString1 = "select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rconversation.digest, rconversation.digestUser, rconversation.hasTrunc, rcontact.nickname from rconversation,rcontact" + " " + " where rconversation.username = rcontact.username" + str2 + bo.nullAsNil(paramString1);
    paramList = z(" and rconversation.username", paramList);
    paramList = paramString1 + paramList;
    paramString1 = paramList;
    if (paramBoolean)
      paramString1 = paramList + " and ( verifyFlag & 8 ) = 0";
    paramList = paramString1;
    if (paramString2 != null)
    {
      paramList = paramString1;
      if (paramString2.length() > 0)
        paramList = paramString1 + new StringBuilder(" and ( rconversation.username like '%").append(paramString2).append("%' or content like '%").append(paramString2).append("%' or rcontact.nickname like '%").append(paramString2).append("%' or rcontact.alias like '%").append(paramString2).append("%' or rcontact.pyInitial like '%").append(paramString2).append("%' or rcontact.quanPin like '%").append(paramString2).append("%' or rcontact.conRemark like '%").append(paramString2).append("%'  ) ").toString();
    }
    if ((paramString2 == null) || (paramString2.equals("")));
    for (paramString1 = paramList + " order by flag desc, conversationTime desc"; ; paramString1 = paramList + " order by rconversation.username like \"%@chatroom\" asc")
    {
      ab.d("MicroMsg.ConversationStorage", "getSearchCursor sql ".concat(String.valueOf(paramString1)));
      paramString1 = this.bSd.rawQuery(paramString1, null);
      AppMethodBeat.o(1237);
      return paramString1;
    }
  }

  public final Cursor a(ArrayList<String> paramArrayList, String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(1235);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite");
    localStringBuilder.append(" from rconversation where (");
    int i = 0;
    if (i < paramArrayList.size())
    {
      if (i != paramArrayList.size() - 1)
        localStringBuilder.append("username = '" + (String)paramArrayList.get(i) + "' OR ");
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("username = '" + (String)paramArrayList.get(i) + "'");
      }
    }
    localStringBuilder.append(") and ");
    if (com.tencent.mm.o.a.ewS == paramString2)
      localStringBuilder.append(" ( parentRef is null  or parentRef = '' ) ");
    while (true)
    {
      localStringBuilder.append(bo.nullAsNil(paramString1));
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      paramArrayList = paramList.iterator();
      while (paramArrayList.hasNext())
      {
        paramString1 = (String)paramArrayList.next();
        localStringBuilder.append(" and rconversation.username != '").append(paramString1).append("'");
      }
      if ("*".equals(paramString2))
        localStringBuilder.append(" 1 = 1 ");
      else
        localStringBuilder.append("parentRef = '").append(bo.vA(paramString2)).append("' ");
    }
    ab.d("MicroMsg.ConversationStorage", "getNecessaryCursorByNames sql %s", new Object[] { localStringBuilder.toString() });
    paramArrayList = this.bSd.rawQuery(localStringBuilder.toString(), null);
    AppMethodBeat.o(1235);
    return paramArrayList;
  }

  public final com.tencent.mm.vending.b.b a(f paramf)
  {
    AppMethodBeat.i(1201);
    paramf = this.xXt.aD(paramf);
    AppMethodBeat.o(1201);
    return paramf;
  }

  public final void a(com.tencent.mm.plugin.messenger.foundation.a.e parame)
  {
    this.xXs = parame;
  }

  public final void a(ak paramak, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1215);
    if (!bf.oB(paramak.field_username))
      AppMethodBeat.o(1215);
    while (true)
    {
      return;
      if (bo.nullAsNil(paramak.field_username).length() > 0)
        break;
      ab.e("MicroMsg.ConversationStorage", "countMsg conversation failed, username empty");
      AppMethodBeat.o(1215);
    }
    if (paramak.field_msgCount == 0)
    {
      paramak.hL(bf.oA(paramak.field_username));
      ab.i("MicroMsg.ConversationStorage", "getMsgCount from message table");
    }
    while (true)
    {
      ab.i("MicroMsg.ConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", new Object[] { Integer.valueOf(paramak.field_msgCount), paramak.field_username, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(1215);
      break;
      if (paramInt1 > 0)
      {
        paramak.hL(paramak.field_msgCount - paramInt1);
        if (paramak.field_msgCount < 0)
        {
          ab.e("MicroMsg.ConversationStorage", "msg < 0 ,some path must be ignore!");
          paramak.hL(0);
        }
      }
      else if (paramInt2 > 0)
      {
        paramak.hL(paramak.field_msgCount + paramInt2);
      }
    }
  }

  public final void a(be.a parama)
  {
    AppMethodBeat.i(1202);
    this.xXv.a(parama, null);
    AppMethodBeat.o(1202);
  }

  public final void a(be.b paramb)
  {
    this.xXr = paramb;
  }

  public final boolean a(String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(1221);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1221);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (aoZ(paramString) == null)
      {
        paramBoolean = true;
        AppMethodBeat.o(1221);
      }
      else
      {
        if (paramBoolean);
        for (paramInt1 = paramInt2 | paramInt1; ; paramInt1 = (paramInt1 ^ 0xFFFFFFFF) & paramInt2)
        {
          if (paramInt1 != paramInt2)
            break label83;
          AppMethodBeat.o(1221);
          paramBoolean = bool;
          break;
        }
        label83: paramBoolean = this.bSd.hY("rconversation", "update " + aoW(paramString) + " set attrflag = " + paramInt1 + " where username = \"" + bo.vA(paramString) + "\"");
        if (paramBoolean)
          b(3, this, paramString);
        AppMethodBeat.o(1221);
      }
    }
  }

  public final void aF(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(1239);
    ab.w("MicroMsg.ConversationStorage", "deleteConversations   stack:%s", new Object[] { an.doR() });
    if (paramLinkedList.isEmpty())
    {
      ab.w("MicroMsg.ConversationStorage", "deleteConversation:namelist is null");
      AppMethodBeat.o(1239);
    }
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      String str = (String)paramLinkedList.poll();
      localStringBuilder.append("delete from rconversation where ");
      localStringBuilder.append("username='").append(str).append('\'');
      while (!paramLinkedList.isEmpty())
      {
        str = (String)paramLinkedList.poll();
        localStringBuilder.append(" or username='").append(str).append('\'');
      }
      ab.i("MicroMsg.ConversationStorage", "deleteConversations:sql is %s", new Object[] { localStringBuilder.toString() });
      this.bSd.hY("rconversation", localStringBuilder.toString());
      AppMethodBeat.o(1239);
    }
  }

  public final String ac(int paramInt, String paramString)
  {
    AppMethodBeat.i(1259);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(paramString))
      switch (paramInt)
      {
      default:
        localObject2 = localObject1;
      case 49:
      }
    while (true)
    {
      AppMethodBeat.o(1259);
      return localObject2;
      paramString = br.z(paramString, "msg");
      localObject2 = localObject1;
      if (paramString != null)
      {
        localObject2 = (String)paramString.get(".msg.appmsg.title");
        ab.d("MicroMsg.ConversationStorage", "[oneliang][parseConversationMsgContentTitle] title:%s", new Object[] { localObject2 });
      }
    }
  }

  public final void aoX(String paramString)
  {
    AppMethodBeat.i(1208);
    ab.w("MicroMsg.ConversationStorage", "delChatContact username:%s  stack:%s", new Object[] { paramString, an.doR() });
    if (this.bSd.delete(aoW(paramString), "username=?", new String[] { paramString }) != 0)
      b(5, this, paramString);
    AppMethodBeat.o(1208);
  }

  public final boolean aoY(String paramString)
  {
    AppMethodBeat.i(1210);
    ab.w("MicroMsg.ConversationStorage", "deleteMessageEndByName nameTag:%s  stack:%s", new Object[] { paramString, an.doR() });
    boolean bool = this.bSd.hY("rconversation", "delete from " + aoW(paramString) + " where username like '%" + paramString + "'");
    if (bool)
      b(5, this, paramString);
    AppMethodBeat.o(1210);
    return bool;
  }

  public final ak aoZ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(1211);
    Cursor localCursor = this.bSd.a(aoW(paramString), null, "username=?", new String[] { paramString }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      ab.w("MicroMsg.ConversationStorage", "get null with username:".concat(String.valueOf(paramString)));
      localCursor.close();
      AppMethodBeat.o(1211);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = new ak();
      paramString.d(localCursor);
      localCursor.close();
      AppMethodBeat.o(1211);
    }
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(1260);
    Object localObject;
    if ((this.bSd == null) || (this.bSd.dpU()))
      if (this.bSd == null)
      {
        localObject = "null";
        ab.w("MicroMsg.ConversationStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(1260);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(this.bSd.dpU());
      break;
      AppMethodBeat.o(1260);
    }
  }

  public final void apa(String paramString)
  {
    AppMethodBeat.i(1217);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("msgCount", Integer.valueOf(0));
    this.bSd.update("rconversation", localContentValues, "username=?", new String[] { paramString });
    AppMethodBeat.o(1217);
  }

  public final boolean apb(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(1218);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "update conversation failed");
      AppMethodBeat.o(1218);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.ConversationStorage", "updateUnreadByTalker %s", new Object[] { paramString });
      ak localak = aoZ(paramString);
      if (localak == null)
      {
        AppMethodBeat.o(1218);
      }
      else
      {
        ContentValues localContentValues;
        if ((localak.field_unReadCount == 0) && (localak.field_unReadMuteCount == 0) && (paramString.equals(localak.field_username)))
        {
          a(paramString, 1048576, false, localak.field_attrflag);
          localContentValues = new ContentValues();
          localContentValues.put("UnReadInvite", Integer.valueOf(0));
          localContentValues.put("atCount", Integer.valueOf(0));
          if (this.bSd.update(aoW(paramString), localContentValues, "username= ?", new String[] { bo.vA(paramString) }) > 0)
            b(3, this, paramString);
          AppMethodBeat.o(1218);
        }
        else
        {
          localContentValues = new ContentValues();
          localContentValues.put("unReadCount", Integer.valueOf(0));
          localContentValues.put("unReadMuteCount", Integer.valueOf(0));
          localContentValues.put("UnReadInvite", Integer.valueOf(0));
          localContentValues.put("atCount", Integer.valueOf(0));
          localContentValues.put("attrflag", Integer.valueOf(localak.field_attrflag & 0xFFEFFFFF));
          int i = this.bSd.update(aoW(paramString), localContentValues, "username= ?", new String[] { bo.vA(paramString) });
          if (i > 0)
            b(3, this, paramString);
          if (i <= 0)
            break;
          AppMethodBeat.o(1218);
        }
      }
    }
  }

  public final boolean apc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(1219);
    if (paramString.length() <= 0)
    {
      ab.e("MicroMsg.ConversationStorage", "update updateUnreadByParentRef failed");
      AppMethodBeat.o(1219);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.ConversationStorage", "updateUnreadByParentRef %s", new Object[] { paramString });
      ak localak = aoZ(paramString);
      if (localak == null)
      {
        AppMethodBeat.o(1219);
        bool = true;
      }
      else
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("unReadCount", Integer.valueOf(0));
        localContentValues.put("unReadMuteCount", Integer.valueOf(0));
        localContentValues.put("UnReadInvite", Integer.valueOf(0));
        localContentValues.put("atCount", Integer.valueOf(0));
        localContentValues.put("attrflag", Integer.valueOf(localak.field_attrflag & 0xFFEFFFFF));
        int i = this.bSd.update(aoW(paramString), localContentValues, "parentRef= ?", new String[] { bo.vA(paramString) });
        if (i > 0)
          b(3, this, paramString);
        if (i > 0)
        {
          AppMethodBeat.o(1219);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(1219);
        }
      }
    }
  }

  public final boolean apd(String paramString)
  {
    AppMethodBeat.i(1220);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "update conversation failed");
      bool = false;
      AppMethodBeat.o(1220);
    }
    while (true)
    {
      return bool;
      ak localak = aoZ(paramString);
      if ((localak == null) || ((localak.field_unReadCount > 0) && (paramString.equals(localak.field_username))))
      {
        bool = true;
        AppMethodBeat.o(1220);
      }
      else
      {
        bool = this.bSd.hY("rconversation", "update " + aoW(paramString) + " set unReadCount = 1, atCount = 0, attrflag = " + (localak.field_attrflag | 0x100000) + " where username = \"" + bo.vA(paramString) + "\"");
        if (bool)
          b(3, this, paramString);
        AppMethodBeat.o(1220);
      }
    }
  }

  public final boolean ape(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(1226);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "setMoveUp conversation failed");
      AppMethodBeat.o(1226);
    }
    while (true)
    {
      return bool;
      paramString = aoZ(paramString);
      if (paramString == null)
      {
        ab.e("MicroMsg.ConversationStorage", "setMoveUp conv == null");
        AppMethodBeat.o(1226);
      }
      else
      {
        bool = this.bSd.hY("rconversation", "update " + aoW(paramString.field_username) + " set flag = " + com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramString, 1, dsM() + 1L) + " where username = \"" + bo.vA(paramString.field_username) + "\"");
        if (bool)
          b(3, this, paramString.field_username);
        AppMethodBeat.o(1226);
      }
    }
  }

  public final boolean apf(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(1227);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "setPlacedTop conversation failed");
      AppMethodBeat.o(1227);
    }
    while (true)
    {
      return bool;
      if (aoZ(paramString) == null)
      {
        ak localak = new ak(paramString);
        localak.eD(System.currentTimeMillis());
        d(localak);
        ab.i("MicroMsg.ConversationStorage", "setPlacedTop username = ".concat(String.valueOf(paramString)));
      }
      paramString = aoZ(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(1227);
      }
      else
      {
        bool = this.bSd.hY("rconversation", "update " + aoW(paramString.field_username) + " set flag = " + com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramString, 2, 0L) + " where username = \"" + bo.vA(paramString.field_username) + "\"");
        if (bool)
          b(3, this, paramString.field_username);
        AppMethodBeat.o(1227);
      }
    }
  }

  public final boolean apg(String paramString)
  {
    AppMethodBeat.i(1228);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "unSetPlacedTop conversation failed");
      bool = false;
      AppMethodBeat.o(1228);
    }
    while (true)
    {
      return bool;
      bool = f(aoZ(paramString));
      AppMethodBeat.o(1228);
    }
  }

  public final boolean aph(String paramString)
  {
    AppMethodBeat.i(1230);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ConversationStorage", "isPlacedTop failed");
      bool = false;
      AppMethodBeat.o(1230);
    }
    while (true)
    {
      return bool;
      bool = g(aoZ(paramString));
      AppMethodBeat.o(1230);
    }
  }

  public final Cursor api(String paramString)
  {
    AppMethodBeat.i(1238);
    paramString = "select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, nickname from rconversation,rcontact where rconversation.username = rcontact.username" + bo.nullAsNil(paramString) + " order by flag desc, conversationTime desc";
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(1238);
    return paramString;
  }

  public final Cursor apj(String paramString)
  {
    AppMethodBeat.i(1244);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT username, unReadCount");
    localStringBuilder.append(" FROM rconversation");
    localStringBuilder.append(" WHERE (username LIKE '%@chatroom' ");
    localStringBuilder.append(" or username LIKE '%@im.chatroom' ) ");
    localStringBuilder.append(bo.nullAsNil(paramString));
    localStringBuilder.append(" AND unReadCount > 0");
    paramString = localStringBuilder.toString();
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(1244);
    return paramString;
  }

  public final Cursor apk(String paramString)
  {
    AppMethodBeat.i(1247);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT COUNT(rconversation.username)");
    localStringBuilder.append(" FROM rconversation, rcontact");
    localStringBuilder.append(" WHERE unReadCount > 0");
    localStringBuilder.append(" AND rconversation.username = rcontact.username");
    localStringBuilder.append(bo.nullAsNil(paramString));
    localStringBuilder.append(" AND ( type & 512 ) == 0");
    localStringBuilder.append(" AND ( attrflag & 2097152 ) == 0");
    localStringBuilder.append(" AND ( ( parentRef is ").append(com.tencent.mm.o.a.ewS).append(" or parentRef = '' ) ");
    localStringBuilder.append(" AND rcontact.username != 'officialaccounts')");
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.ConversationStorage", "get total unread talker, sql is %s", new Object[] { paramString });
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(1247);
    return paramString;
  }

  public final int apl(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1251);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT COUNT(*) FROM rconversation");
    localStringBuilder.append(" WHERE parentRef = '").append(paramString).append("'");
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.ConversationStorage", "get enterprise conversation count, sql is %s", new Object[] { paramString });
    paramString = this.bSd.a(paramString, null, 2);
    if (paramString != null)
    {
      i = j;
      if (paramString.moveToFirst())
        i = paramString.getInt(0);
      paramString.close();
    }
    AppMethodBeat.o(1251);
    return i;
  }

  public final String apm(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(1252);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("SELECT rconversation.username");
    ((StringBuilder)localObject2).append(" FROM rconversation");
    ((StringBuilder)localObject2).append(" WHERE parentRef = '").append(paramString).append("'");
    ((StringBuilder)localObject2).append(" ORDER BY conversationTime DESC, conversationTime DESC ");
    ((StringBuilder)localObject2).append(" LIMIT 1 ");
    paramString = ((StringBuilder)localObject2).toString();
    ab.i("MicroMsg.ConversationStorage", "get last enterprise conversation user, sql is %s", new Object[] { paramString });
    localObject2 = this.bSd.a(paramString, null, 2);
    if (localObject2 != null)
      if (((Cursor)localObject2).moveToFirst())
      {
        paramString = ((Cursor)localObject2).getString(0);
        ((Cursor)localObject2).close();
        AppMethodBeat.o(1252);
      }
    while (true)
    {
      return paramString;
      ((Cursor)localObject2).close();
      AppMethodBeat.o(1252);
      paramString = localObject1;
    }
  }

  public final ak apn(String paramString)
  {
    AppMethodBeat.i(1256);
    Cursor localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().c(t.fkP, null, paramString);
    if (localCursor != null)
      if ((localCursor.getCount() > 0) && (localCursor.moveToFirst()))
      {
        paramString = new ak();
        paramString.d(localCursor);
        localCursor.close();
      }
    while (true)
    {
      AppMethodBeat.o(1256);
      return paramString;
      paramString = null;
      break;
      paramString = null;
    }
  }

  public final int apo(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1258);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select sum(atCount) from rconversation");
    localStringBuilder.append(" where unReadCount > 0");
    if (!bo.isNullOrNil(paramString))
      localStringBuilder.append(" and username = '").append(paramString).append("'");
    paramString = localStringBuilder.toString();
    ab.d("MicroMsg.ConversationStorage", "query sql: %s", new Object[] { paramString });
    paramString = this.bSd.a(paramString, null, 2);
    if (paramString != null)
    {
      i = j;
      if (paramString.moveToFirst())
        i = paramString.getInt(0);
      paramString.close();
    }
    AppMethodBeat.o(1258);
    return i;
  }

  public final void app(String paramString)
  {
    AppMethodBeat.i(1261);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Update rconversation");
    ((StringBuilder)localObject).append(" set parentRef = '', unReadCount = 0").append(" where username = \"" + bo.vA(paramString) + "\"");
    localObject = ((StringBuilder)localObject).toString();
    ab.d("MicroMsg.ConversationStorage", "removeParentRefAndUnread sql: %s", new Object[] { localObject });
    if (this.bSd.hY("rconversation", (String)localObject))
      b(3, this, paramString);
    AppMethodBeat.o(1261);
  }

  public final void apq(String paramString)
  {
    AppMethodBeat.i(1262);
    int i = this.bSd.delete(aoW(paramString), "username=? or parentRef =?", new String[] { paramString, paramString });
    ab.d("MicroMsg.ConversationStorage", "delEnterpriseFatherAndChildConv %s %d", new Object[] { paramString, Integer.valueOf(i) });
    if (i != 0)
      b(5, this, paramString);
    AppMethodBeat.o(1262);
  }

  public final int apr(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(1263);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(1263);
    while (true)
    {
      return i;
      paramString = "select msgCount from rconversation where username=" + com.tencent.mm.cd.h.escape(paramString);
      paramString = this.bSd.a(paramString, null, 2);
      if (paramString.moveToFirst())
        i = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(1263);
    }
  }

  public final void aq(bi parambi)
  {
    AppMethodBeat.i(1212);
    String str = parambi.field_talker;
    int i = 0;
    ak localak1 = aoZ(str);
    if ((localak1 != null) && (localak1.field_conversationTime > parambi.field_createTime) && (localak1.field_conversationTime != 9223372036854775807L))
    {
      ab.i("MicroMsg.ConversationStorage", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
      AppMethodBeat.o(1212);
    }
    while (true)
    {
      return;
      ak localak2 = localak1;
      if (localak1 == null)
      {
        localak2 = new ak(str);
        i = 1;
      }
      localak2.hO(parambi.field_isSend);
      localak2.hM(localak2.field_unReadCount);
      localak2.ap(parambi);
      localak2.jg(Integer.toString(parambi.getType()));
      localak2.eE(localak2.field_flag & 0x0 | parambi.field_createTime & 0xFFFFFFFF);
      if (i != 0)
      {
        d(localak2);
        AppMethodBeat.o(1212);
      }
      else
      {
        a(localak2, str, true);
        AppMethodBeat.o(1212);
      }
    }
  }

  public final void b(com.tencent.mm.plugin.messenger.foundation.a.a.h paramh, h.c paramc)
  {
    AppMethodBeat.i(1206);
    if (paramc == null)
    {
      ab.f("MicroMsg.ConversationStorage", "null notifyInfo");
      AppMethodBeat.o(1206);
      return;
    }
    Object localObject1 = paramc.talker;
    Object localObject2 = aoZ((String)localObject1);
    bi localbi = paramh.Rb((String)localObject1);
    if (localObject2 == null)
    {
      ab.i("MicroMsg.ConversationStorage", "create new cvs:%s", new Object[] { localObject1 });
      paramh = new ak((String)localObject1);
      if (ad.mR((String)localObject1))
        paramh.hN(1);
    }
    for (boolean bool = true; ; bool = false)
    {
      this.xXt.a(localbi, paramh, bool, paramc);
      ab.i("MicroMsg.ConversationStorage", "dkevent user:%s func:%s cnt:%d ", new Object[] { paramc.talker, paramc.oqJ, Integer.valueOf(paramc.oqL) });
      long l1;
      long l2;
      if ((localbi != null) && (localbi.field_msgId != 0L))
      {
        if ((paramc.oqL == 1) && (((bi)paramc.oqK.get(0)).field_msgId != localbi.field_msgId))
          ab.w("MicroMsg.ConversationStorage", "Warning ! getLastMsg may wrong , lastid:%d  insertlist:%d", new Object[] { Long.valueOf(localbi.field_msgId), Long.valueOf(((bi)paramc.oqK.get(0)).field_msgId) });
        i = localbi.field_flag;
        l1 = paramh.field_lastSeq;
        l2 = localbi.field_msgSeq;
        ab.i("MicroMsg.ConversationStorage", "summerbadcr check last message flag[%d], newseq[%d] oldseq[%d], undeliverCount[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(paramh.field_UnDeliverCount) });
        if (((!paramc.oqJ.equals("insert")) || (paramc.oqL <= 0)) && ((!paramc.oqJ.equals("update")) || (paramh.field_unReadCount + paramc.oqL < 0)))
          break label575;
        paramh.hM(paramh.field_unReadCount + paramc.oqL);
        if (l2 > l1)
        {
          ab.i("MicroMsg.ConversationStorage", "summerbadcr insert or update reset lastseq[%d]", new Object[] { Long.valueOf(l2) });
          paramh.eF(l2);
        }
        if ((localbi.bwt()) && (localbi.field_isSend == 1))
        {
          paramh.field_sightTime = localbi.field_createTime;
          paramh.duU = true;
        }
      }
      label465: Object localObject3;
      if ((paramc.oqJ.equals("insert")) && (paramc.oqK.size() > 0) && (t.kH(paramc.talker)))
      {
        localObject2 = r.Yz();
        localObject1 = paramc.oqK.iterator();
        while (true)
        {
          if (!((Iterator)localObject1).hasNext())
            break label779;
          localObject3 = (bi)((Iterator)localObject1).next();
          if (((cy)localObject3).field_isSend != 1)
            if (!((bi)localObject3).isText())
            {
              if (((bi)localObject3).getType() != 503316529)
                break label727;
              i = 1;
              label516: if (i == 0);
            }
            else
            {
              if (!((bi)localObject3).apB((String)localObject2))
                break label733;
              paramh.hR(paramh.field_atCount + 1);
            }
          while (true)
          {
            localObject3 = br.z(((cy)localObject3).field_content, "sysmsg");
            if (!bi.aT((Map)localObject3))
              break label756;
            paramh.hU(paramh.field_UnReadInvite + 1);
            break label465;
            label575: if ((paramc.oqN <= 0) || (l2 >= l1) || (((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().R(paramh.field_username, l1).field_msgId != 0L))
              break;
            long l3 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Ru(paramh.field_username);
            ab.i("MicroMsg.ConversationStorage", "summerbadcr delete reset lastseq[%d, %d], lastMsgSeq[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
            paramh.eF(l2);
            if (l1 <= l3)
              break;
            ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).Yo().N(paramh.field_username, l3);
            break;
            label727: i = 0;
            break label516;
            label733: if (((bi)localObject3).dtV())
              paramh.hR(paramh.field_atCount + 4096);
          }
          label756: if (bi.aU((Map)localObject3))
            paramh.hU(paramh.field_UnReadInvite + 4096);
        }
      }
      label779: int j = 0;
      int i = 0;
      if (paramc != null);
      for (localObject2 = paramc.talker; ; localObject2 = null)
      {
        int k = j;
        if (paramc != null)
        {
          k = j;
          if (paramc.oqJ != null)
          {
            k = j;
            if (paramc.oqJ.equals("delete"))
            {
              if (paramc.oqN > 0)
                i = paramc.oqN;
              ab.i("MicroMsg.ConversationStorage", "notify delete count %d ", new Object[] { Integer.valueOf(paramc.oqN) });
              k = i;
            }
          }
        }
        if ((paramc != null) && (paramc.oqJ != null) && (paramc.oqJ.equals("insert")))
          if (paramc.oqM > 0)
          {
            i = paramc.oqM;
            label907: ab.i("MicroMsg.ConversationStorage", "notify insert all count %d ", new Object[] { Integer.valueOf(paramc.oqM) });
          }
        while (true)
        {
          localObject1 = bo.bc((String)localObject2, "");
          if (localbi != null);
          for (l2 = localbi.field_msgSeq; ; l2 = -1L)
          {
            ab.i("MicroMsg.ConversationStorage", "summerbadcr updateConversation talker[%s] msgseq[%d],newConv[%b],newMsgInsertCount[%d], deleteCount[%d], tid[%d], ParentRef[%s]", new Object[] { localObject1, Long.valueOf(l2), Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(k), Long.valueOf(Thread.currentThread().getId()), paramh.field_parentRef });
            if ((!bool) || (k <= 0) || (i != 0))
              break label1075;
            ab.i("MicroMsg.ConversationStorage", "summerdel ignore delete event [%s, %s]", new Object[] { localObject2, paramh.field_username });
            AppMethodBeat.o(1206);
            break;
          }
          label1075: this.xXu.cF(paramh);
          this.xXu.doNotify();
          if (localObject2 == null)
          {
            ab.e("MicroMsg.ConversationStorage", "talker == null");
            AppMethodBeat.o(1206);
            break;
          }
          if (!((String)localObject2).equals(paramh.field_username))
          {
            ab.e("MicroMsg.ConversationStorage", "process message for conversation failed: inconsist username");
            AppMethodBeat.o(1206);
            break;
          }
          if ((localbi != null) && (localbi.field_msgId != 0L))
          {
            ab.v("MicroMsg.ConversationStorage", "onNotifyChange   msgId:" + localbi.field_msgId);
            paramh.ap(localbi);
            if (this.xXr != null)
            {
              PString localPString = new PString();
              localObject3 = new PString();
              localObject1 = new PInt();
              this.xXr.a(localbi, localPString, (PString)localObject3, (PInt)localObject1, paramh.jl(2097152));
              ab.d("MicroMsg.ConversationStorage", "oreh onNotifyChange genDigest: pDigestUser.value=%s", new Object[] { ((PString)localObject3).value });
              paramh.jh(localPString.value);
              paramh.ji(((PString)localObject3).value);
              paramh.hP(((PInt)localObject1).value);
              paramh.jg(Integer.toString(localbi.getType()));
              if (this.xXs != null)
                this.xXs.a(localbi, paramh);
              paramh.eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramh, 1, localbi.field_createTime));
              if (!bool)
                break label1555;
              localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject2);
              if ((localObject2 != null) && (!bo.isNullOrNil(((ap)localObject2).field_username)) && (((ad)localObject2).Oe()))
                paramh.eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramh, 2, 0L));
              a(paramh, k, i);
              if ((!localbi.bwt()) && (!com.tencent.mm.sdk.a.b.dnQ()))
                break label1545;
              paramh.eD(localbi.field_createTime);
              label1430: d(paramh);
            }
          }
          label1545: label1555: label1622: 
          do
            while (true)
            {
              this.xXv.cF(paramh);
              this.xXv.doNotify();
              this.xXt.b(localbi, paramh, bool, paramc);
              AppMethodBeat.o(1206);
              break;
              localObject1 = ac(localbi.getType(), paramh.field_content);
              localObject3 = bo.nullAsNil(paramh.field_digest);
              if (bo.isNullOrNil((String)localObject1));
              for (localObject1 = ""; ; localObject1 = " " + bo.nullAsNil((String)localObject1))
              {
                paramh.jh(((String)localObject3).concat((String)localObject1));
                break;
              }
              paramh.eD(bo.anU());
              break label1430;
              a(paramh, k, i);
              a(paramh, (String)localObject2, true);
              continue;
              ab.i("MicroMsg.ConversationStorage", "update null conversation with talker ".concat(String.valueOf(localObject2)));
              if (bool)
                break label1622;
              paramh.dsI();
              a(paramh, k, i);
              a(paramh, (String)localObject2, true);
            }
          while (((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rp((String)localObject2) <= 0);
          if ((localbi.bwt()) || (com.tencent.mm.sdk.a.b.dnQ()))
            paramh.eD(localbi.field_createTime);
          while (true)
          {
            a(paramh, k, i);
            d(paramh);
            break;
            paramh.eD(bo.anU());
          }
          i = 0;
          break label907;
          i = 0;
        }
      }
      paramh = (com.tencent.mm.plugin.messenger.foundation.a.a.h)localObject2;
    }
  }

  public final void b(be.a parama)
  {
    AppMethodBeat.i(1203);
    this.xXv.remove(parama);
    AppMethodBeat.o(1203);
  }

  public final Cursor c(String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(1232);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select * from rconversation where ");
    if (com.tencent.mm.o.a.ewS == paramString2)
      localStringBuilder.append(" ( parentRef is null  or parentRef = '' ) ");
    while (true)
    {
      localStringBuilder.append(bo.nullAsNil(paramString1));
      if ((paramList == null) || (paramList.size() <= 0))
        break;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        paramString1 = (String)paramList.next();
        localStringBuilder.append(" and rconversation.username != '").append(paramString1).append("'");
      }
      if ("*".equals(paramString2))
        localStringBuilder.append(" 1 = 1 ");
      else
        localStringBuilder.append("parentRef = '").append(bo.vA(paramString2)).append("' ");
    }
    localStringBuilder.append(" order by flag desc, conversationTime desc");
    paramString1 = this.bSd.rawQuery(localStringBuilder.toString(), null);
    AppMethodBeat.o(1232);
    return paramString1;
  }

  public final void c(be.a parama)
  {
    AppMethodBeat.i(1204);
    this.xXu.a(parama, null);
    AppMethodBeat.o(1204);
  }

  public final void c(String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(1257);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Update rconversation");
    localStringBuilder.append(" set parentRef = '").append(bo.nullAsNil(paramString)).append("' where 1 != 1 ");
    for (int i = 0; i <= 0; i++)
    {
      paramString = paramArrayOfString[0];
      localStringBuilder.append(" or username = '").append(paramString).append("'");
    }
    paramString = localStringBuilder.toString();
    ab.d("MicroMsg.ConversationStorage", "update sql: %s", new Object[] { paramString });
    if (this.bSd.hY("rconversation", paramString))
      for (i = 0; i <= 0; i++)
        b(3, this, paramArrayOfString[0]);
    AppMethodBeat.o(1257);
  }

  public final long d(ak paramak)
  {
    long l = -1L;
    AppMethodBeat.i(1214);
    String str = bo.nullAsNil(paramak.field_username);
    if (str.length() <= 0)
    {
      ab.e("MicroMsg.ConversationStorage", "insert conversation failed, username empty");
      AppMethodBeat.o(1214);
      return l;
    }
    paramak.eE(c(paramak));
    e(paramak);
    l = this.bSd.insert(aoW(str), null, paramak.Hl());
    if (l != -1L)
      b(2, this, paramak.field_username);
    while (true)
    {
      AppMethodBeat.o(1214);
      break;
      ab.e("MicroMsg.ConversationStorage", "insert failed return -1, table:%s", new Object[] { aoW(str) });
    }
  }

  public final void d(be.a parama)
  {
    AppMethodBeat.i(1205);
    this.xXu.remove(parama);
    AppMethodBeat.o(1205);
  }

  public final boolean dsJ()
  {
    AppMethodBeat.i(1209);
    boolean bool1 = this.bSd.hY("rconversation", "delete from rconversation");
    boolean bool2 = this.bSd.hY("rconversation", "delete from rbottleconversation");
    if ((bool1) || (bool2));
    for (bool1 = true; ; bool1 = false)
    {
      if (bool1)
        b(5, this, "");
      AppMethodBeat.o(1209);
      return bool1;
    }
  }

  public final HashMap<String, Long> dsK()
  {
    AppMethodBeat.i(1213);
    long l = System.currentTimeMillis();
    HashMap localHashMap = new HashMap();
    Cursor localCursor = this.bSd.a("rconversation", new String[] { "username", "conversationTime" }, null, null, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      AppMethodBeat.o(1213);
    }
    while (true)
    {
      return localHashMap;
      int i;
      if (localCursor == null)
        i = 0;
      while (true)
      {
        if (i == 0)
          break label168;
        localHashMap.put(localCursor.getString(0), Long.valueOf(localCursor.getLong(1)));
        localCursor.moveToNext();
        break;
        if ((localCursor.isClosed()) || (localCursor.isBeforeFirst()) || (localCursor.isAfterLast()))
          i = 0;
        else
          i = 1;
      }
      label168: localCursor.close();
      ab.d("MicroMsg.ConversationStorage", "kevin getALLTimeIndex:" + (System.currentTimeMillis() - l));
      AppMethodBeat.o(1213);
    }
  }

  public final void dsL()
  {
    AppMethodBeat.i(1216);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("msgCount", Integer.valueOf(0));
    this.bSd.update("rconversation", localContentValues, null, null);
    AppMethodBeat.o(1216);
  }

  public final List<String> dsN()
  {
    AppMethodBeat.i(1233);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select rconversation.username from rconversation,rcontact where ");
    ((StringBuilder)localObject).append("rconversation.username = rcontact.username");
    ((StringBuilder)localObject).append(bo.nullAsNil(bo.nullAsNil(t.fkP)));
    ((StringBuilder)localObject).append(" and ( verifyFlag & 8 ) = 0");
    ((StringBuilder)localObject).append(" and ( rconversation.parentRef is null  or rconversation.parentRef = '' ) ");
    for (String str : t.fkY)
      ((StringBuilder)localObject).append(" and rconversation.username != '").append(str).append("'");
    ((StringBuilder)localObject).append(" order by sightTime desc, flag desc, conversationTime desc");
    localObject = this.bSd.a(((StringBuilder)localObject).toString(), null, 2);
    if (localObject != null)
    {
      if (((Cursor)localObject).moveToFirst())
        do
          localArrayList.add(((Cursor)localObject).getString(0));
        while (((Cursor)localObject).moveToNext());
      ((Cursor)localObject).close();
    }
    ab.d("MicroMsg.ConversationStorage", "user list:%s", new Object[] { localArrayList });
    AppMethodBeat.o(1233);
    return localArrayList;
  }

  public final List<String> dsO()
  {
    AppMethodBeat.i(1240);
    Object localObject = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    localObject = z(" where username", (List)localObject);
    localObject = "select username from rconversation" + (String)localObject;
    localObject = (String)localObject + " order by flag desc, conversationTime desc";
    ab.i("MicroMsg.ConversationStorage", "getAllConvUserName sql %s", new Object[] { localObject });
    localObject = this.bSd.rawQuery((String)localObject, null);
    int i = ((Cursor)localObject).getColumnIndex("username");
    while (((Cursor)localObject).moveToNext())
      localArrayList.add(((Cursor)localObject).getString(i));
    ((Cursor)localObject).close();
    AppMethodBeat.o(1240);
    return localArrayList;
  }

  public final Cursor dsP()
  {
    AppMethodBeat.i(1242);
    Cursor localCursor = this.bSd.rawQuery("select * from rbottleconversation order by flag desc, conversationTime desc", null);
    AppMethodBeat.o(1242);
    return localCursor;
  }

  public final int dsQ()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1249);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SELECT SUM(rconversation.unReadCount)");
    ((StringBuilder)localObject).append(" FROM rconversation");
    ((StringBuilder)localObject).append(" WHERE parentRef = 'officialaccounts'");
    localObject = ((StringBuilder)localObject).toString();
    ab.d("MicroMsg.ConversationStorage", "getTotalUnreadBizCount sql %s", new Object[] { localObject });
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject != null)
    {
      i = j;
      if (((Cursor)localObject).moveToFirst())
        i = ((Cursor)localObject).getInt(0);
      ((Cursor)localObject).close();
    }
    AppMethodBeat.o(1249);
    return i;
  }

  public final String dsR()
  {
    String str = null;
    AppMethodBeat.i(1250);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SELECT rconversation.username");
    ((StringBuilder)localObject).append(" FROM rconversation");
    ((StringBuilder)localObject).append(" WHERE parentRef = 'officialaccounts'");
    ((StringBuilder)localObject).append(" ORDER BY flag DESC, conversationTime DESC ");
    ((StringBuilder)localObject).append(" LIMIT 1 ");
    localObject = ((StringBuilder)localObject).toString();
    ab.i("MicroMsg.ConversationStorage", "get last conversation user, sql is %s", new Object[] { localObject });
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject != null)
      if (((Cursor)localObject).moveToFirst())
      {
        str = ((Cursor)localObject).getString(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1250);
      }
    while (true)
    {
      return str;
      ((Cursor)localObject).close();
      AppMethodBeat.o(1250);
    }
  }

  public final Cursor dsS()
  {
    AppMethodBeat.i(1253);
    ab.i("MicroMsg.ConversationStorage", "get bottle total conversation unread sql is %s", new Object[] { "select count(*) from rbottleconversation where unReadCount > 0" });
    Cursor localCursor = this.bSd.rawQuery("select count(*) from rbottleconversation where unReadCount > 0", null);
    AppMethodBeat.o(1253);
    return localCursor;
  }

  public final ak dsT()
  {
    AppMethodBeat.i(1255);
    Cursor localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().c(t.fkP, null, "officialaccounts");
    ak localak;
    if (localCursor != null)
      if ((localCursor.getCount() > 0) && (localCursor.moveToFirst()))
      {
        localak = new ak();
        localak.d(localCursor);
        localCursor.close();
      }
    while (true)
    {
      AppMethodBeat.o(1255);
      return localak;
      localak = null;
      break;
      localak = null;
    }
  }

  public final Cursor dsU()
  {
    AppMethodBeat.i(1264);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SELECT rconversation.username, ");
    ((StringBuilder)localObject).append("rconversation.unReadCount");
    ((StringBuilder)localObject).append(" FROM rconversation");
    ((StringBuilder)localObject).append(" WHERE unReadCount > 0");
    ((StringBuilder)localObject).append(" AND ( parentRef is ").append(com.tencent.mm.o.a.ewS).append(" or parentRef = '' ) ");
    localObject = this.bSd.rawQuery(((StringBuilder)localObject).toString(), null);
    AppMethodBeat.o(1264);
    return localObject;
  }

  public final Cursor eo(String paramString, int paramInt)
  {
    AppMethodBeat.i(1248);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT rconversation.username");
    localStringBuilder.append(" FROM rconversation, rcontact");
    localStringBuilder.append(" WHERE unReadCount > 0");
    localStringBuilder.append(" AND rconversation.username = rcontact.username");
    localStringBuilder.append(bo.nullAsNil(paramString));
    localStringBuilder.append(" AND ( type & 512 ) == 0");
    localStringBuilder.append(" AND ( ( parentRef is ").append(com.tencent.mm.o.a.ewS).append(" or parentRef = '' ) ");
    localStringBuilder.append(" AND rcontact.username != 'officialaccounts')");
    localStringBuilder.append(" ORDER BY flag DESC, conversationTime DESC ");
    if (paramInt > 0)
      localStringBuilder.append(" LIMIT ").append(String.valueOf(paramInt));
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.ConversationStorage", "get total unread talker, sql is %s", new Object[] { paramString });
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(1248);
    return paramString;
  }

  public final boolean f(ak paramak)
  {
    AppMethodBeat.i(1229);
    boolean bool;
    if (paramak == null)
    {
      ab.e("MicroMsg.ConversationStorage", "unSetPlacedTop conversation null");
      bool = false;
      AppMethodBeat.o(1229);
    }
    while (true)
    {
      return bool;
      bool = this.bSd.hY("rconversation", "update " + aoW(paramak.field_username) + " set flag = " + com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramak, 3, paramak.field_conversationTime) + " where username = \"" + bo.vA(paramak.field_username) + "\"");
      if (bool)
        b(3, this, paramak.field_username);
      AppMethodBeat.o(1229);
    }
  }

  public final boolean g(ak paramak)
  {
    boolean bool = false;
    AppMethodBeat.i(1231);
    if (paramak == null)
    {
      ab.e("MicroMsg.ConversationStorage", "isPlacedTop failed, conversation null");
      AppMethodBeat.o(1231);
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.plugin.messenger.foundation.a.a.a.a(paramak, 4, 0L) != 0L)
      {
        bool = true;
        AppMethodBeat.o(1231);
      }
      else
      {
        AppMethodBeat.o(1231);
      }
    }
  }

  public final Cursor ic(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1245);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select unReadCount");
    localStringBuilder.append(" from rconversation where username = '").append(paramString1).append("' AND ( parentRef is ").append(com.tencent.mm.o.a.ewS).append(" or parentRef = '' ) ").append(bo.nullAsNil(paramString2));
    paramString1 = localStringBuilder.toString();
    paramString1 = this.bSd.rawQuery(paramString1, null);
    AppMethodBeat.o(1245);
    return paramString1;
  }

  public final int nR(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(1254);
    paramString = "select sum(unReadCount) from rconversation,rcontact where rconversation.username = rcontact.username" + bo.nullAsNil(paramString);
    paramString = this.bSd.a(paramString, null, 2);
    if (paramString.moveToFirst())
      i = paramString.getInt(0);
    paramString.close();
    AppMethodBeat.o(1254);
    return i;
  }

  public final Cursor t(List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(1241);
    String str = "select username from rconversation";
    int i = 0;
    if (i < paramList.size())
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str);
      if (i > 0);
      for (str = " and "; ; str = " where ")
      {
        str = str + "username != \"" + bo.vA((String)paramList.get(i)) + "\"";
        i++;
        break;
      }
    }
    paramList = str + " order by flag desc, conversationTime desc limit 50 offset " + paramInt;
    paramList = this.bSd.rawQuery(paramList, null);
    AppMethodBeat.o(1241);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.al
 * JD-Core Version:    0.6.2
 */