package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.model.ak;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import junit.framework.Assert;

public final class bj extends k
  implements com.tencent.mm.plugin.messenger.foundation.a.a.h
{
  public static final String[] fnj;
  private final com.tencent.mm.cd.h fni;
  private bd jyn;
  private be jyp;
  private final com.tencent.mm.sdk.e.l<h.a, h.c> xHV;
  private final long xXI;
  private boolean xZB;
  private final List<e> xZC;
  private List<h.b> xZD;
  private final f<Integer, bi.c> xZE;
  private final f<Integer, bi.d> xZF;
  private final f<Integer, bi.a> xZG;
  private final f<Integer, bi.b> xZH;
  private final f<Integer, Object> xZI;
  private final f<String, Long> xZJ;
  private an xZK;
  private Map<String, h.c> xZL;
  private boolean xZM;
  private String xZN;
  private long xZO;

  static
  {
    AppMethodBeat.i(1450);
    fnj = new String[] { "CREATE TABLE IF NOT EXISTS " + "message" + " ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT,transBrandWording TEXT ,talkerId INTEGER, bizClientMsgId" + " TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT, msgSeq INTEGER, flag INT) " };
    AppMethodBeat.o(1450);
  }

  public bj(com.tencent.mm.cd.h paramh, bd parambd, be parambe)
  {
    AppMethodBeat.i(1334);
    this.xZB = false;
    this.xZC = new CopyOnWriteArrayList();
    this.xZE = new c(100);
    this.xZF = new c(100);
    this.xZG = new c(100);
    this.xZH = new c(100);
    this.xZI = new c(100);
    this.xZJ = new c(100);
    this.xZK = new an();
    this.xHV = new com.tencent.mm.sdk.e.l()
    {
      public final void el(List<h.c> paramAnonymousList)
      {
        AppMethodBeat.i(1319);
        if ((!isLocked()) && (bj.a(bj.this) != null))
        {
          Iterator localIterator = paramAnonymousList.iterator();
          while (localIterator.hasNext())
          {
            paramAnonymousList = (h.c)localIterator.next();
            if (paramAnonymousList != null)
              bj.a(bj.this).b(bj.this, paramAnonymousList);
          }
        }
        AppMethodBeat.o(1319);
      }
    };
    this.xZL = new HashMap();
    this.xZM = false;
    this.xZN = "";
    this.xZO = 0L;
    this.xXI = 86400L;
    this.fni = paramh;
    this.jyn = parambd;
    this.jyp = parambe;
    g.RQ();
    if (((Integer)g.RP().Ry().get(348169, Integer.valueOf(0))).intValue() == 0)
    {
      ab.i("MicroMsg.MsgInfoStorage", "deleted dirty msg ,count is %d", new Object[] { Integer.valueOf(this.fni.delete("message", "msgId> ? ", new String[] { "80000000" })) });
      g.RQ();
      g.RP().Ry().set(348169, Integer.valueOf(1));
    }
    a(paramh, "message");
    dug();
    if (this.xZD == null)
      this.xZD = new LinkedList();
    this.xZD.clear();
    a(new h.b(1, "message", h.b.a(1L, 1000000L, 10000000L, 90000000L)));
    AppMethodBeat.o(1334);
  }

  private String apG(String paramString)
  {
    AppMethodBeat.i(1348);
    String str = Rr(paramString);
    if ((this.xZB) && (str.equals("message")))
    {
      paramString = " talkerId=" + apH(paramString) + " ";
      AppMethodBeat.o(1348);
    }
    while (true)
    {
      return paramString;
      paramString = " talker= '" + bo.vA(paramString) + "' ";
      AppMethodBeat.o(1348);
    }
  }

  private long apH(String paramString)
  {
    AppMethodBeat.i(1349);
    long l = this.jyn.aoP(paramString);
    if (l < 0L);
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
      {
        ad localad = new ad(paramString);
        localad.setType(2);
        this.jyn.Z(localad);
        l = this.jyn.aoP(paramString);
      }
      if (!b.dnQ())
        ab.i("MicroMsg.MsgInfoStorage", "getTalkerIdByTalkerName:%s id:%s needinsert:%s [%s]", new Object[] { paramString, Long.valueOf(l), Boolean.valueOf(bool), bo.dpG() });
      AppMethodBeat.o(1349);
      return l;
    }
  }

  private static String apI(String paramString)
  {
    AppMethodBeat.i(1366);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1366);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = br.z(paramString, "msgsource");
        if (paramString != null)
        {
          boolean bool = paramString.isEmpty();
          if (!bool);
        }
        else
        {
          AppMethodBeat.o(1366);
          paramString = null;
          continue;
        }
        paramString = (String)paramString.get(".msgsource.bizmsg.msgcluster");
        AppMethodBeat.o(1366);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.MsgInfoStorage", "exception:%s", new Object[] { bo.l(paramString) });
        ab.e("MicroMsg.MsgInfoStorage", "Exception in getMsgcluster, %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(1366);
        paramString = null;
      }
    }
  }

  private String apJ(String paramString)
  {
    AppMethodBeat.i(1408);
    if ((paramString == null) || (!paramString.equals("message")))
    {
      paramString = "";
      AppMethodBeat.o(1408);
    }
    while (true)
    {
      return paramString;
      if (this.xZB)
      {
        paramString = "INDEXED BY messageTaklerIdTypeCreateTimeIndex";
        AppMethodBeat.o(1408);
      }
      else
      {
        paramString = "INDEXED BY messageCreateTaklerTypeTimeIndex";
        AppMethodBeat.o(1408);
      }
    }
  }

  private h.b apK(String paramString)
  {
    AppMethodBeat.i(1415);
    boolean bool;
    int i;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue("tableName == null", bool);
      i = 0;
      label28: if (i >= this.xZD.size())
        break label97;
      if (!paramString.equals(((h.b)this.xZD.get(i)).name))
        break label91;
      paramString = (h.b)this.xZD.get(i);
      AppMethodBeat.o(1415);
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label91: i++;
      break label28;
      label97: Assert.assertTrue("no table match", false);
      paramString = null;
      AppMethodBeat.o(1415);
    }
  }

  private String apL(String paramString)
  {
    AppMethodBeat.i(1416);
    boolean bool;
    if ((paramString != null) && (paramString.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      Iterator localIterator = this.xZC.iterator();
      while (localIterator.hasNext())
      {
        String str = ((e)localIterator.next()).aog(paramString);
        if (!bo.isNullOrNil(str))
        {
          AppMethodBeat.o(1416);
          paramString = str;
        }
      }
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      paramString = "message";
      AppMethodBeat.o(1416);
    }
  }

  private h.b apM(String paramString)
  {
    AppMethodBeat.i(1417);
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      paramString = apK(apL(paramString));
      AppMethodBeat.o(1417);
      return paramString;
    }
  }

  private static void as(bi parambi)
  {
    AppMethodBeat.i(1367);
    if ((parambi == null) || (!parambi.bAA()))
      AppMethodBeat.o(1367);
    while (true)
    {
      return;
      try
      {
        String str = parambi.field_content;
        int i = str.indexOf("<msg>");
        Object localObject = str;
        if (i > 0)
        {
          localObject = str;
          if (i < str.length())
            localObject = str.substring(i).trim();
        }
        localObject = br.z((String)localObject, "msg");
        if ((localObject != null) && (((Map)localObject).size() > 0))
          parambi.jw(com.tencent.mm.sdk.platformtools.be.aS((Map)localObject));
        AppMethodBeat.o(1367);
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.MsgInfoStorage", parambi.getMessage());
        AppMethodBeat.o(1367);
      }
    }
  }

  private void b(h.b paramb)
  {
    AppMethodBeat.i(1337);
    Cursor localCursor = this.fni.a("select max(msgid) from " + paramb.name, null, 2);
    if (localCursor.moveToFirst())
    {
      int i = localCursor.getInt(0);
      ab.i("MicroMsg.MsgInfoStorage", "id count is %d, now id:%d", new Object[] { Integer.valueOf(i), Long.valueOf(paramb.fDH) });
      if (i >= paramb.fDH)
        paramb.yx(i);
    }
    localCursor.close();
    ab.w("MicroMsg.MsgInfoStorage", "loading new msg id:" + paramb.fDH);
    AppMethodBeat.o(1337);
  }

  private void dug()
  {
    AppMethodBeat.i(1332);
    long l1 = System.currentTimeMillis();
    long l2 = this.fni.iV(Thread.currentThread().getId());
    long l3 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = new String[13];
    arrayOfString[0] = ("CREATE INDEX IF NOT EXISTS " + "message" + "IdIndex ON message ( msgId )");
    arrayOfString[1] = ("CREATE INDEX IF NOT EXISTS " + "message" + "SvrIdIndex ON message ( msgSvrId )");
    arrayOfString[2] = ("CREATE INDEX IF NOT EXISTS " + "message" + "SendCreateTimeIndex ON message ( status,isSend,createTime )");
    arrayOfString[3] = ("CREATE INDEX IF NOT EXISTS " + "message" + "CreateTimeIndex ON message ( createTime )");
    arrayOfString[4] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TaklerIdTypeCreateTimeIndex ON message ( talkerId,type,createTime )");
    arrayOfString[5] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdStatusIndex ON message ( talkerId,status )");
    arrayOfString[6] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdCreateTimeIsSendIndex ON message ( talkerId,isSend,createTime )");
    arrayOfString[7] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdCreateTimeIndex ON message ( talkerId,createTime )");
    arrayOfString[8] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdSvrIdIndex ON message ( talkerId,msgSvrId )");
    arrayOfString[9] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerIdTypeIndex ON message ( talkerId,type )");
    arrayOfString[10] = ("CREATE INDEX IF NOT EXISTS " + "message" + "TalkerTypeIndex ON message ( talker,type )");
    arrayOfString[11] = ("CREATE INDEX IF NOT EXISTS " + "message" + "messageTalkerMsgSeqIndex ON message ( talker,msgSeq )");
    arrayOfString[12] = ("CREATE INDEX IF NOT EXISTS " + "message" + "messageTalkerFlagMsgSeqIndex ON message ( talker,flag,msgSeq )");
    if (!this.xZB)
    {
      arrayOfString[4] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTypeTimeIndex ON message ( talker,type,createTime )";
      arrayOfString[5] = "CREATE INDEX IF NOT EXISTS  messageTalkerStatusIndex ON message ( talker,status )";
      arrayOfString[6] = "CREATE INDEX IF NOT EXISTS  messageTalkerCreateTimeIsSendIndex ON message ( talker,isSend,createTime )";
      arrayOfString[7] = "CREATE INDEX IF NOT EXISTS  messageCreateTaklerTimeIndex ON message ( talker,createTime )";
      arrayOfString[8] = "CREATE INDEX IF NOT EXISTS  messageTalkerSvrIdIndex ON message ( talker,msgSvrId )";
    }
    localArrayList.addAll(Arrays.asList(arrayOfString));
    for (int i = 0; i < localArrayList.size(); i++)
      this.fni.hY("message", (String)localArrayList.get(i));
    ab.i("MicroMsg.MsgInfoStorage", "build new index last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
    this.fni.mB(l2);
    ab.i("MicroMsg.MsgInfoStorage", "executeMsgInitSQL last %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(1332);
  }

  private String duh()
  {
    if (this.xZB);
    for (String str = "INDEXED BY messageTalkerIdStatusIndex"; ; str = "INDEXED BY messageTalkerStatusIndex")
      return str;
  }

  private String mT(long paramLong)
  {
    AppMethodBeat.i(1419);
    String str;
    if ((paramLong == 0L) || (paramLong == -1L))
    {
      AppMethodBeat.o(1419);
      str = null;
    }
    while (true)
    {
      return str;
      bi.mS(paramLong);
      for (int i = 0; ; i++)
      {
        if (i >= this.xZD.size())
          break label105;
        if (((h.b)this.xZD.get(i)).jk(paramLong))
        {
          str = ((h.b)this.xZD.get(i)).name;
          AppMethodBeat.o(1419);
          break;
        }
      }
      label105: Assert.assertTrue(String.format("getTableNameByLocalId failed:%d", new Object[] { Long.valueOf(paramLong) }), false);
      AppMethodBeat.o(1419);
      str = null;
    }
  }

  public final Cursor G(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(1434);
    String str = " SELECT * FROM " + Rr(paramString1) + " WHERE" + apG(paramString1) + "AND content LIKE '" + paramString2 + "%' ORDER BY createTime DESC LIMIT " + paramInt;
    ab.d("MicroMsg.MsgInfoStorage", "getInitCursorByMember getCursor talk:%s member:%s,limitCount:%d [%s]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), str });
    paramString1 = this.fni.a(str, null, 0);
    AppMethodBeat.o(1434);
    return paramString1;
  }

  public final void K(ArrayList<Long> paramArrayList)
  {
    AppMethodBeat.i(1351);
    long l1 = this.fni.iV(-1L);
    try
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        long l2 = ((Long)paramArrayList.next()).longValue();
        bi localbi = jf(l2);
        localbi.ht(localbi.dqI | 0x20);
        ab.d("MicroMsg.MsgInfoStorage", "msgId:%d, setOmitFailResend", new Object[] { Long.valueOf(l2) });
        a(l2, localbi);
      }
    }
    finally
    {
      this.fni.mB(l1);
      AppMethodBeat.o(1351);
    }
    this.fni.mB(l1);
    AppMethodBeat.o(1351);
  }

  public final void P(String paramString, long paramLong)
  {
    AppMethodBeat.i(1331);
    h.b localb = apM(paramString);
    long l = localb.fDH;
    Random localRandom = new Random();
    this.fni.hY("message", "BEGIN;");
    bi localbi = new bi(paramString);
    for (int i = 0; i < paramLong; i++)
    {
      localbi.eJ(System.currentTimeMillis());
      localbi.setType(1);
      localbi.setContent("纵观目前国内手游市场，大量同质类手游充斥玩家的视野，而在主机和PC平台上经久不衰的体育类游戏，却鲜有佳作。在获得了NBA官方认可以后。" + bo.dpF());
      localbi.setMsgId(l);
      localbi.setStatus(localRandom.nextInt(4));
      localbi.hO(localRandom.nextInt(1));
      l += 1L;
      localb.fDH += 1L;
      localbi.eI(System.currentTimeMillis() + bo.dpF());
      this.fni.hY("message", "INSERT INTO " + Rr(localbi.field_talker) + " (msgid,msgSvrid,type,status,createTime,talker,content,talkerid)  VALUES(" + localbi.field_msgId + "," + localbi.field_msgSvrId + "," + localbi.getType() + "," + localbi.field_status + "," + localbi.field_createTime + ",'" + localbi.field_talker + "','" + localbi.field_content + "'," + apH(paramString) + ");");
      if (i % 10000 == 0)
      {
        this.fni.hY("message", "COMMIT;");
        this.fni.hY("message", "BEGIN;");
      }
    }
    this.fni.hY("message", "COMMIT;");
    this.jyp.apa(paramString);
    localbi.setMsgId(1L + l);
    Z(localbi);
    AppMethodBeat.o(1331);
  }

  public final bi Q(String paramString, long paramLong)
  {
    AppMethodBeat.i(1340);
    bi localbi = new bi();
    paramString = this.fni.a(Rr(paramString), null, "msgSvrId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst())
      localbi.d(paramString);
    paramString.close();
    AppMethodBeat.o(1340);
    return localbi;
  }

  public final void QW(String paramString)
  {
    AppMethodBeat.i(1327);
    ab.i("MicroMsg.MsgInfoStorage", "lockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", new Object[] { paramString, Boolean.valueOf(this.xZM), Integer.valueOf(this.xDf.xDi), Integer.valueOf(this.xHV.xDi), Integer.valueOf(this.xZL.size()), this.xZN, Long.valueOf(bo.gb(this.xZO)) });
    if (bo.isNullOrNil(paramString))
      Assert.assertTrue("lockForSync, do not call me by null tag.", false);
    if (this.xZM)
    {
      ab.w("MicroMsg.MsgInfoStorage", "lockForSync, has been locked by :%s  time:%d", new Object[] { this.xZN, Long.valueOf(bo.gb(this.xZO)) });
      AppMethodBeat.o(1327);
    }
    while (true)
    {
      return;
      this.xZN = paramString;
      this.xZO = bo.anU();
      this.xZM = true;
      super.lock();
      this.xHV.lock();
      AppMethodBeat.o(1327);
    }
  }

  public final void QX(String paramString)
  {
    AppMethodBeat.i(1328);
    ab.i("MicroMsg.MsgInfoStorage", "unlockForSync tag:%s islock:%b lockCnt[%d,%d] notifyCnt:%d last:[%s,%d]", new Object[] { paramString, Boolean.valueOf(this.xZM), Integer.valueOf(this.xDf.xDi), Integer.valueOf(this.xHV.xDi), Integer.valueOf(this.xZL.size()), this.xZN, Long.valueOf(bo.gb(this.xZO)) });
    if (bo.isNullOrNil(paramString))
      Assert.assertTrue("lockForSync, do not call me by null tag.", false);
    if (!this.xZM)
    {
      ab.w("MicroMsg.MsgInfoStorage", "unlockForSync, No one Locking Now , why this fucking tag:%s call it ! [%s]", new Object[] { paramString, bo.dpG() });
      AppMethodBeat.o(1328);
    }
    while (true)
    {
      return;
      if (!paramString.equals(this.xZN))
      {
        ab.w("MicroMsg.MsgInfoStorage", "unlockForSync locking[%s] diff:%d, but unlock[%s] , Ignore this call.", new Object[] { this.xZN, Long.valueOf(bo.gb(this.xZO)), paramString });
        AppMethodBeat.o(1328);
      }
      else
      {
        this.xZM = false;
        this.xZO = 0L;
        this.xZN = "";
        Iterator localIterator = this.xZL.keySet().iterator();
        while (localIterator.hasNext())
        {
          paramString = (String)localIterator.next();
          a((h.c)this.xZL.get(paramString));
        }
        this.xZL.clear();
        super.unlock();
        this.xHV.unlock();
        doNotify();
        AppMethodBeat.o(1328);
      }
    }
  }

  public final void QY(String paramString)
  {
    AppMethodBeat.i(1329);
    if (!this.xZM)
      AppMethodBeat.o(1329);
    while (true)
    {
      return;
      h.c localc = null;
      if (this.xZL.containsKey(paramString))
        localc = (h.c)this.xZL.get(paramString);
      if (localc == null)
      {
        ab.w("MicroMsg.MsgInfoStorage", "statusNotify, No one Locking info Now , why this fucking talker:%s call it ! [%s]", new Object[] { paramString, bo.dpG() });
        AppMethodBeat.o(1329);
      }
      else
      {
        if ((localc.oqJ != null) && (localc.oqJ.equals("insert")) && (localc.oqL > 0))
        {
          ab.i("MicroMsg.MsgInfoStorage", "statusNotify talker[%s] insertCount[%d]", new Object[] { paramString, Integer.valueOf(localc.oqL) });
          localc.oqL = 0;
        }
        AppMethodBeat.o(1329);
      }
    }
  }

  public final Cursor QZ(String paramString)
  {
    AppMethodBeat.i(1343);
    com.tencent.mm.cd.h localh = this.fni;
    String str = Rr(paramString);
    paramString = apG(paramString);
    paramString = localh.query(str, new String[] { "createTime", "msgId" }, paramString, null, "createTime", null, "createTime ASC");
    AppMethodBeat.o(1343);
    return paramString;
  }

  public final bi R(String paramString, long paramLong)
  {
    AppMethodBeat.i(1341);
    bi localbi = new bi();
    paramString = this.fni.a(Rr(paramString), null, apG(paramString) + " AND msgSeq=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst())
      localbi.d(paramString);
    paramString.close();
    AppMethodBeat.o(1341);
    return localbi;
  }

  public final bi Ra(String paramString)
  {
    AppMethodBeat.i(1354);
    bi localbi = new bi();
    paramString = this.fni.a(Rr(paramString), null, apG(paramString), null, null, null, "msgSvrId  DESC limit 1 ", 2);
    if (paramString.moveToFirst())
      localbi.d(paramString);
    paramString.close();
    AppMethodBeat.o(1354);
    return localbi;
  }

  public final bi Rb(String paramString)
  {
    bi localbi = null;
    AppMethodBeat.i(1355);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1355);
    for (paramString = localbi; ; paramString = localbi)
    {
      return paramString;
      localbi = new bi();
      paramString = "select * from " + Rr(paramString) + " where" + apG(paramString) + "order by createTime DESC limit 1";
      paramString = this.fni.a(paramString, null, 2);
      if (paramString.moveToFirst())
        localbi.d(paramString);
      paramString.close();
      AppMethodBeat.o(1355);
    }
  }

  public final bi Rc(String paramString)
  {
    bi localbi = null;
    AppMethodBeat.i(1358);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1358);
    for (paramString = localbi; ; paramString = localbi)
    {
      return paramString;
      localbi = new bi();
      paramString = "select * from " + Rr(paramString) + " where" + apG(paramString) + "and isSend = 0  order by createTime DESC limit 1";
      paramString = this.fni.a(paramString, null, 2);
      if (paramString.moveToFirst())
        localbi.d(paramString);
      paramString.close();
      AppMethodBeat.o(1358);
    }
  }

  public final bi Rd(String paramString)
  {
    AppMethodBeat.i(1361);
    if (this.xZD == null)
    {
      ab.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
      AppMethodBeat.o(1361);
    }
    bi localbi;
    for (paramString = null; ; paramString = localbi)
    {
      return paramString;
      localbi = new bi();
      long l1 = 0L;
      if (bo.isNullOrNil(paramString));
      for (paramString = ""; ; paramString = paramString.replaceFirst("and", "where"))
      {
        int i = 0;
        while (i < this.xZD.size())
        {
          long l2 = l1;
          if ((((h.b)this.xZD.get(i)).oqG & 0x8) != 0)
          {
            Object localObject = "select * from " + ((h.b)this.xZD.get(i)).name + paramString + "  order by createTime DESC limit 1";
            localObject = this.fni.a((String)localObject, null, 2);
            l2 = l1;
            if (((Cursor)localObject).moveToFirst())
            {
              long l3 = ((Cursor)localObject).getLong(((Cursor)localObject).getColumnIndex("createTime"));
              l2 = l1;
              if (l1 < l3)
              {
                localbi.d((Cursor)localObject);
                l2 = l3;
              }
            }
            ((Cursor)localObject).close();
          }
          i++;
          l1 = l2;
        }
      }
      AppMethodBeat.o(1361);
    }
  }

  public final List<bi> Re(String paramString)
  {
    Object localObject = null;
    bi localbi = null;
    AppMethodBeat.i(1371);
    Cursor localCursor = this.fni.a("select * from ".concat(String.valueOf(paramString)), null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(1371);
      paramString = localbi;
    }
    while (true)
    {
      return paramString;
      paramString = localObject;
      if (localCursor.moveToFirst())
      {
        paramString = new ArrayList();
        do
        {
          localbi = new bi();
          localbi.d(localCursor);
          paramString.add(localbi);
        }
        while (localCursor.moveToNext());
      }
      localCursor.close();
      AppMethodBeat.o(1371);
    }
  }

  public final Cursor Rf(String paramString)
  {
    String str = null;
    AppMethodBeat.i(1378);
    long l = System.currentTimeMillis();
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(1378);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      str = "select * from " + str + " " + apJ(str) + " where" + apG(paramString) + "AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime";
      paramString = this.fni.a(str, null, 0);
      ab.d("MicroMsg.MsgInfoStorage", "all time: %d, sql: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str });
      AppMethodBeat.o(1378);
    }
  }

  public final void Rg(String paramString)
  {
    AppMethodBeat.i(1383);
    b(paramString, "", null);
    if (this.fni.hY(paramString, "delete from ".concat(String.valueOf(paramString))))
    {
      anF("delete_all ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(1383);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.e.pXa.a(111L, 247L, 1L, false);
      AppMethodBeat.o(1383);
    }
  }

  public final int Rh(String paramString)
  {
    AppMethodBeat.i(1385);
    ab.w("MicroMsg.MsgInfoStorage", "deleteByTalker :%s  stack:%s", new Object[] { paramString, com.tencent.mm.sdk.platformtools.an.doR() });
    b(Rr(paramString), apG(paramString), null);
    int i = this.fni.delete(Rr(paramString), apG(paramString), null);
    if (i != 0)
    {
      anF("delete_talker ".concat(String.valueOf(paramString)));
      paramString = new h.c(paramString, "delete", null, i, (byte)0);
      paramString.oqO = -1L;
      a(paramString);
    }
    AppMethodBeat.o(1385);
    return i;
  }

  public final int Ri(String paramString)
  {
    AppMethodBeat.i(1392);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    int i = this.fni.update(Rr(paramString), localContentValues, apG(paramString) + "AND isSend=? AND status!=? ", new String[] { "0", "4" });
    if (i != 0)
    {
      doNotify();
      a(new h.c(paramString, "update", null));
    }
    AppMethodBeat.o(1392);
    return i;
  }

  public final Cursor Rj(String paramString)
  {
    AppMethodBeat.i(1394);
    paramString = this.fni.query(Rr(paramString), null, apG(paramString), null, null, null, "createTime ASC ");
    AppMethodBeat.o(1394);
    return paramString;
  }

  public final Cursor Rk(String paramString)
  {
    AppMethodBeat.i(1398);
    paramString = this.fni.query(Rr(paramString), null, "isSend=? AND" + apG(paramString) + "AND status!=?", new String[] { "0", "4" }, null, null, null);
    AppMethodBeat.o(1398);
    return paramString;
  }

  public final bi.c Rl(String paramString)
  {
    AppMethodBeat.i(1401);
    bi.c localc1 = (bi.c)this.xZE.get(Integer.valueOf(paramString.hashCode()));
    bi.c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = bi.c.apE(paramString);
      this.xZE.k(Integer.valueOf(paramString.hashCode()), localc2);
    }
    AppMethodBeat.o(1401);
    return localc2;
  }

  public final bi.d Rm(String paramString)
  {
    AppMethodBeat.i(1402);
    bi.d locald1 = (bi.d)this.xZF.get(Integer.valueOf(paramString.hashCode()));
    bi.d locald2 = locald1;
    if (locald1 == null)
    {
      locald2 = bi.d.apF(paramString);
      this.xZF.k(Integer.valueOf(paramString.hashCode()), locald2);
    }
    AppMethodBeat.o(1402);
    return locald2;
  }

  public final bi.a Rn(String paramString)
  {
    AppMethodBeat.i(1403);
    bi.a locala1 = null;
    if ((!bo.isNullOrNil(paramString)) && (this.xZG != null))
      locala1 = (bi.a)this.xZG.get(Integer.valueOf(paramString.hashCode()));
    while (true)
    {
      bi.a locala2 = locala1;
      if (locala1 == null)
      {
        locala1 = bi.a.apC(paramString);
        locala2 = locala1;
        if (this.xZG != null)
        {
          this.xZG.k(Integer.valueOf(bo.bc(paramString, "").hashCode()), locala1);
          locala2 = locala1;
        }
      }
      AppMethodBeat.o(1403);
      return locala2;
      ab.e("MicroMsg.MsgInfoStorage", "input text null ???? %B", new Object[] { Boolean.valueOf(bo.isNullOrNil(paramString)) });
      ab.e("MicroMsg.MsgInfoStorage", "[arthurdan.FriendContentCrash] Fatal error!!! cachesForFriend is null!");
    }
  }

  public final bi.b Ro(String paramString)
  {
    AppMethodBeat.i(1404);
    bi.b localb1 = (bi.b)this.xZH.get(Integer.valueOf(paramString.hashCode()));
    bi.b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = bi.b.apD(paramString);
      this.xZH.k(Integer.valueOf(paramString.hashCode()), localb2);
    }
    AppMethodBeat.o(1404);
    return localb2;
  }

  public final int Rp(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1405);
    if (oB(paramString))
    {
      j = this.jyp.apr(paramString);
      if (j > 0)
      {
        ab.i("MicroMsg.MsgInfoStorage", "getMsgCount conversationStorage.getMsgCountByUsername count:%d", new Object[] { Integer.valueOf(j) });
        AppMethodBeat.o(1405);
      }
    }
    while (true)
    {
      return j;
      ab.i("MicroMsg.MsgInfoStorage", "getMsgCount contactMsgCount is 0 ,go normal %s", new Object[] { paramString });
      do
      {
        j = oA(paramString);
        AppMethodBeat.o(1405);
        break;
        if ("appbrandmessage".equals(Rr(paramString)))
        {
          paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE" + apG(paramString);
          paramString = this.fni.a(paramString, null, 0);
          if (paramString.moveToLast())
            j = paramString.getInt(0);
          paramString.close();
          AppMethodBeat.o(1405);
          break;
        }
      }
      while (!"bottlemessage".equals(Rr(paramString)));
      paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE" + apG(paramString);
      paramString = this.fni.a(paramString, null, 2);
      j = i;
      if (paramString.moveToFirst())
        j = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(1405);
    }
  }

  public final int Rq(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1411);
    if (paramString == null)
    {
      ab.w("MicroMsg.MsgInfoStorage", "getImgVideoMsgCount talker is null!");
      AppMethodBeat.o(1411);
      return j;
    }
    StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(*) FROM ");
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      String str = apM(paramString).name;
      paramString = new StringBuilder().append(str).append("  indexed by  ").append(str).append("TalkerTypeIndex ").toString() + " WHERE talker= '" + bo.vA(paramString) + "' AND type IN (3,39,13,43,62,44,268435505)";
      paramString = this.fni.a(paramString, null, 2);
      j = i;
      if (paramString.moveToFirst())
        j = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(1411);
      break;
    }
  }

  public final String Rr(String paramString)
  {
    AppMethodBeat.i(1414);
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("username == null", bool);
      paramString = apM(paramString).name;
      AppMethodBeat.o(1414);
      return paramString;
    }
  }

  public final long Rs(String paramString)
  {
    long l = -1L;
    AppMethodBeat.i(1420);
    Object localObject = "select createTime from message where" + apG(paramString) + "order by createTime LIMIT 1 OFFSET 0";
    ab.d("MicroMsg.MsgInfoStorage", "get first message create time: ".concat(String.valueOf(localObject)));
    localObject = this.fni.a((String)localObject, null, 2);
    if (localObject == null)
    {
      ab.e("MicroMsg.MsgInfoStorage", "get first message create time failed: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(1420);
    }
    while (true)
    {
      return l;
      if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1420);
      }
      else
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(1420);
      }
    }
  }

  public final long Rt(String paramString)
  {
    long l = -1L;
    AppMethodBeat.i(1421);
    Object localObject = "select createTime from message where" + apG(paramString) + "order by createTime DESC LIMIT 1 ";
    ab.d("MicroMsg.MsgInfoStorage", "get last message create time: ".concat(String.valueOf(localObject)));
    localObject = this.fni.a((String)localObject, null, 2);
    if (localObject == null)
    {
      ab.e("MicroMsg.MsgInfoStorage", "get last message create time failed ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(1421);
    }
    while (true)
    {
      return l;
      if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1421);
      }
      else
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(1421);
      }
    }
  }

  public final long Ru(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(1422);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1422);
    while (true)
    {
      return l;
      Object localObject = "select msgSeq from message where" + apG(paramString) + "order by msgSeq DESC LIMIT 1 ";
      ab.i("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq: ".concat(String.valueOf(localObject)));
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.e("MicroMsg.MsgInfoStorage", "summerbadcr get last message msgseq failed ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1422);
      }
      else if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1422);
      }
      else
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(1422);
      }
    }
  }

  public final bi Rv(String paramString)
  {
    AppMethodBeat.i(1424);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1424);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg talker[%s], onlyCache[%b]", new Object[] { paramString, Boolean.FALSE });
      Object localObject1 = (Long)this.xZJ.get(paramString);
      if ((localObject1 != null) && (((Long)localObject1).longValue() > 0L))
      {
        ab.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg hit cache msgid[%d]", new Object[] { Long.valueOf(((Long)localObject1).longValue()) });
        localObject1 = jf(((Long)localObject1).longValue());
        if ((((cy)localObject1).field_flag & 0x1) != 0)
        {
          AppMethodBeat.o(1424);
          paramString = (String)localObject1;
        }
        else
        {
          this.xZJ.remove(paramString);
          AppMethodBeat.o(1424);
          paramString = null;
        }
      }
      else
      {
        ab.i("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg not hit cache");
        localObject1 = new bi();
        long l = System.currentTimeMillis();
        Object localObject2 = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND flag %2 = 1  ORDER BY msgSeq DESC LIMIT 1 ";
        localObject2 = this.fni.a((String)localObject2, null, 2);
        ab.d("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg take %dms, tid[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Long.valueOf(Thread.currentThread().getId()) });
        if (localObject2 == null)
        {
          ab.e("MicroMsg.MsgInfoStorage", "summerbadcr getLastFaultMsg failed ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(1424);
          paramString = (String)localObject1;
        }
        else
        {
          if (((Cursor)localObject2).moveToFirst())
            ((bi)localObject1).d((Cursor)localObject2);
          ((Cursor)localObject2).close();
          this.xZJ.k(paramString, Long.valueOf(((cy)localObject1).field_msgId));
          AppMethodBeat.o(1424);
          paramString = (String)localObject1;
        }
      }
    }
  }

  public final int Rw(String paramString)
  {
    AppMethodBeat.i(1437);
    String str = " SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND isSend=1";
    Cursor localCursor = this.fni.a(str, null, 2);
    while (true)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          i = localCursor.getInt(0);
          localCursor.close();
          ab.d("MicroMsg.MsgInfoStorage", "[getMsgCountBySelf] getCursor talk:%s,count:%s,[%s]", new Object[] { paramString, Integer.valueOf(i), str });
          AppMethodBeat.o(1437);
          return i;
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(1437);
      }
      int i = 0;
    }
  }

  // ERROR //
  public final List<bi> Rx(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: sipush 1444
    //   5: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 494	java/util/ArrayList
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 495	java/util/ArrayList:<init>	()V
    //   16: aload_0
    //   17: getfield 143	com/tencent/mm/storage/bj:fni	Lcom/tencent/mm/cd/h;
    //   20: ldc 70
    //   22: aconst_null
    //   23: ldc_w 1081
    //   26: iconst_2
    //   27: anewarray 60	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: aload_1
    //   33: invokestatic 267	com/tencent/mm/sdk/platformtools/bo:vA	(Ljava/lang/String;)Ljava/lang/String;
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: invokestatic 479	java/lang/System:currentTimeMillis	()J
    //   42: ldc2_w 1082
    //   45: lsub
    //   46: invokestatic 708	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   49: aastore
    //   50: aconst_null
    //   51: aconst_null
    //   52: ldc_w 792
    //   55: iconst_2
    //   56: invokevirtual 711	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   59: astore_1
    //   60: aload_1
    //   61: astore_2
    //   62: aload_2
    //   63: astore_1
    //   64: aload_2
    //   65: invokeinterface 851 1 0
    //   70: ifeq +80 -> 150
    //   73: aload_2
    //   74: astore_1
    //   75: new 406	com/tencent/mm/storage/bi
    //   78: astore 4
    //   80: aload_2
    //   81: astore_1
    //   82: aload 4
    //   84: invokespecial 704	com/tencent/mm/storage/bi:<init>	()V
    //   87: aload_2
    //   88: astore_1
    //   89: aload 4
    //   91: aload_2
    //   92: invokevirtual 714	com/tencent/mm/storage/bi:d	(Landroid/database/Cursor;)V
    //   95: aload_2
    //   96: astore_1
    //   97: aload_3
    //   98: aload 4
    //   100: invokevirtual 1084	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   103: pop
    //   104: goto -42 -> 62
    //   107: astore_3
    //   108: aload_2
    //   109: astore_1
    //   110: ldc 182
    //   112: aload_3
    //   113: ldc_w 1086
    //   116: iconst_1
    //   117: anewarray 186	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_3
    //   123: invokevirtual 344	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   126: aastore
    //   127: invokestatic 1078	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_2
    //   131: ifnull +9 -> 140
    //   134: aload_2
    //   135: invokeinterface 468 1 0
    //   140: sipush 1444
    //   143: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_1
    //   149: areturn
    //   150: aload_2
    //   151: ifnull +9 -> 160
    //   154: aload_2
    //   155: invokeinterface 468 1 0
    //   160: sipush 1444
    //   163: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   166: aload_3
    //   167: astore_1
    //   168: goto -20 -> 148
    //   171: astore_1
    //   172: aload_2
    //   173: astore_3
    //   174: aload_3
    //   175: ifnull +9 -> 184
    //   178: aload_3
    //   179: invokeinterface 468 1 0
    //   184: sipush 1444
    //   187: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload_1
    //   191: athrow
    //   192: astore_2
    //   193: aload_1
    //   194: astore_3
    //   195: aload_2
    //   196: astore_1
    //   197: goto -23 -> 174
    //   200: astore_3
    //   201: aconst_null
    //   202: astore_2
    //   203: goto -95 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   64	73	107	java/lang/Exception
    //   75	80	107	java/lang/Exception
    //   82	87	107	java/lang/Exception
    //   89	95	107	java/lang/Exception
    //   97	104	107	java/lang/Exception
    //   8	60	171	finally
    //   64	73	192	finally
    //   75	80	192	finally
    //   82	87	192	finally
    //   89	95	192	finally
    //   97	104	192	finally
    //   110	130	192	finally
    //   8	60	200	java/lang/Exception
  }

  public final long Ry(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(1447);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1447);
    while (true)
    {
      return l;
      paramString = apK(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(1447);
      }
      else
      {
        l = paramString.fDH;
        AppMethodBeat.o(1447);
      }
    }
  }

  public final Cursor Rz(String paramString)
  {
    AppMethodBeat.i(1445);
    try
    {
      com.tencent.mm.cd.h localh = this.fni;
      String str = Rr(paramString);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramString = localh.a(str, null, apG(paramString) + " AND createTime>=? AND type IN (436207665,419430449)", new String[] { String.valueOf(System.currentTimeMillis() - 86400000L) }, null, null, "createTime ASC", 2);
      AppMethodBeat.o(1445);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MsgInfoStorage", paramString, "getLastDayC2CMsgByTalker error: %s", new Object[] { paramString.getMessage() });
        paramString = null;
        AppMethodBeat.o(1445);
      }
    }
  }

  public final bi S(String paramString, long paramLong)
  {
    AppMethodBeat.i(1342);
    bi localbi = new bi();
    paramString = this.fni.a(Rr(paramString), null, "createTime=? AND" + apG(paramString), new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (paramString.moveToFirst())
      localbi.d(paramString);
    paramString.close();
    AppMethodBeat.o(1342);
    return localbi;
  }

  public final List<bi> T(String paramString, long paramLong)
  {
    AppMethodBeat.i(1344);
    ArrayList localArrayList = new ArrayList();
    paramString = "Select * From " + Rr(paramString) + " Where " + apG(paramString) + " AND createTime < ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 11";
    paramString = this.fni.a(paramString, new String[] { String.valueOf(paramLong) }, 2);
    while (paramString.moveToNext())
    {
      bi localbi = new bi();
      localbi.d(paramString);
      localArrayList.add(localbi);
    }
    paramString.close();
    AppMethodBeat.o(1344);
    return localArrayList;
  }

  public final List<bi> U(String paramString, long paramLong)
  {
    AppMethodBeat.i(1345);
    ArrayList localArrayList = new ArrayList();
    paramString = "Select * From " + Rr(paramString) + " Where " + apG(paramString) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 11;";
    paramString = this.fni.a(paramString, new String[] { String.valueOf(paramLong) }, 2);
    while (paramString.moveToNext())
    {
      bi localbi = new bi();
      localbi.d(paramString);
      localArrayList.add(localbi);
    }
    paramString.close();
    AppMethodBeat.o(1345);
    return localArrayList;
  }

  public final bi V(String paramString, long paramLong)
  {
    AppMethodBeat.i(1346);
    bi localbi = new bi();
    paramString = "Select * From " + Rr(paramString) + " Where " + apG(paramString) + " AND createTime < ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 1;";
    paramString = this.fni.a(paramString, new String[] { String.valueOf(paramLong) }, 2);
    if (paramString.moveToFirst())
      localbi.d(paramString);
    paramString.close();
    AppMethodBeat.o(1346);
    return localbi;
  }

  public final bi W(String paramString, long paramLong)
  {
    AppMethodBeat.i(1347);
    bi localbi = new bi();
    paramString = "Select * From " + Rr(paramString) + " Where " + apG(paramString) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime ASC Limit 1;";
    paramString = this.fni.a(paramString, new String[] { String.valueOf(paramLong) }, 2);
    if (paramString.moveToFirst())
      localbi.d(paramString);
    paramString.close();
    AppMethodBeat.o(1347);
    return localbi;
  }

  public final boolean X(String paramString, long paramLong)
  {
    AppMethodBeat.i(1352);
    boolean bool;
    if (S(paramString, paramLong).field_msgId > 0L)
    {
      bool = true;
      AppMethodBeat.o(1352);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1352);
    }
  }

  public final int Y(bi parambi)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1365);
    if ((parambi == null) || (bo.isNullOrNil(parambi.field_talker)))
      AppMethodBeat.o(1365);
    while (true)
    {
      return j;
      parambi = "SELECT count(msgId) FROM " + Rr(parambi.field_talker) + " WHERE" + apG(parambi.field_talker) + "AND isSend = 0 AND msgId >= " + parambi.field_msgId + " ORDER BY createTime DESC";
      parambi = this.fni.a(parambi, null, 2);
      j = i;
      if (parambi.moveToFirst())
        j = parambi.getInt(0);
      parambi.close();
      AppMethodBeat.o(1365);
    }
  }

  public final bi Y(String paramString, long paramLong)
  {
    bi localbi = null;
    AppMethodBeat.i(1356);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1356);
    for (paramString = localbi; ; paramString = localbi)
    {
      return paramString;
      localbi = new bi();
      String str = "select * from " + Rr(paramString) + " where" + apG(paramString) + "AND msgSeq<" + paramLong + " order by msgSeq DESC limit 1";
      paramString = this.fni.a(str, null, 2);
      if (paramString.moveToFirst())
        localbi.d(paramString);
      paramString.close();
      ab.d("MicroMsg.MsgInfoStorage", "[getBeforeSeqLastMsg] sql: ".concat(String.valueOf(str)));
      AppMethodBeat.o(1356);
    }
  }

  public final long Z(bi parambi)
  {
    AppMethodBeat.i(1368);
    long l = c(parambi, false);
    AppMethodBeat.o(1368);
    return l;
  }

  public final long Z(String paramString, long paramLong)
  {
    AppMethodBeat.i(1372);
    paramString = "select createTime from " + Rr(paramString) + " where msgId = " + paramLong;
    paramLong = 0L;
    paramString = this.fni.a(paramString, null, 2);
    if (paramString.moveToFirst())
      paramLong = paramString.getLong(0);
    paramString.close();
    AppMethodBeat.o(1372);
    return paramLong;
  }

  public final Cursor a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    AppMethodBeat.i(1426);
    long l;
    if (paramLong2 < paramLong1)
      l = paramLong2;
    while (true)
    {
      paramString = new StringBuilder("SELECT * FROM ").append(Rr(paramString)).append(" WHERE").append(apG(paramString)).append("AND createTime >= ").append(l).append(" AND createTime <= ").append(paramLong1).append(" AND isSend=");
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        paramString = i + " LIMIT 1";
        ab.d("MicroMsg.MsgInfoStorage", "get cursor: ".concat(String.valueOf(paramString)));
        paramString = this.fni.a(paramString, null, 0);
        AppMethodBeat.o(1426);
        return paramString;
      }
      l = paramLong1;
      paramLong1 = paramLong2;
    }
  }

  public final void a(long paramLong, bi parambi)
  {
    AppMethodBeat.i(1389);
    if (parambi.dtu())
    {
      String str = apI(parambi.dqJ);
      if (t.nE(str))
      {
        ab.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { str });
        parambi.ju("notifymessage");
      }
    }
    as(parambi);
    if (this.fni.update(mT(paramLong), parambi.Hl(), "msgId=?", new String[] { String.valueOf(paramLong) }) != 0)
    {
      doNotify();
      a(new h.c(parambi.field_talker, "update", parambi));
      AppMethodBeat.o(1389);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.e.pXa.a(111L, 244L, 1L, false);
      AppMethodBeat.o(1389);
    }
  }

  public final void a(com.tencent.mm.cd.h paramh, String paramString)
  {
    AppMethodBeat.i(1330);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    Cursor localCursor = paramh.a("PRAGMA table_info( " + paramString + " )", null, 2);
    int i5 = localCursor.getColumnIndex("name");
    while (localCursor.moveToNext())
      if (i5 >= 0)
      {
        String str = localCursor.getString(i5);
        if ("lvbuffer".equalsIgnoreCase(str))
          i = 1;
        else if ("transContent".equalsIgnoreCase(str))
          j = 1;
        else if ("transBrandWording".equalsIgnoreCase(str))
          k = 1;
        else if ("talkerId".equalsIgnoreCase(str))
          m = 1;
        else if ("bizClientMsgId".equalsIgnoreCase(str))
          n = 1;
        else if ("bizChatId".equalsIgnoreCase(str))
          i1 = 1;
        else if ("bizChatUserId".equalsIgnoreCase(str))
          i2 = 1;
        else if ("msgSeq".equalsIgnoreCase(str))
          i3 = 1;
        else if ("flag".equalsIgnoreCase(str))
          i4 = 1;
      }
    localCursor.close();
    long l = paramh.iV(Thread.currentThread().getId());
    if (i == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add lvbuffer BLOB ");
    if (j == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add transContent TEXT ");
    if (k == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add transBrandWording TEXT ");
    if (m == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add talkerId INTEGER ");
    if (n == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add bizClientMsgId TEXT ");
    if (i1 == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add bizChatId INTEGER DEFAULT -1");
    if (i2 == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add bizChatUserId TEXT ");
    if (i3 == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add msgSeq INTEGER ");
    if (i4 == 0)
      paramh.hY(paramString, "Alter table " + paramString + " add flag INT DEFAULT 0 ");
    paramh.mB(l);
    AppMethodBeat.o(1330);
  }

  public final void a(h.a parama)
  {
    AppMethodBeat.i(1324);
    this.xHV.remove(parama);
    AppMethodBeat.o(1324);
  }

  public final void a(h.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(1323);
    this.xHV.a(parama, paramLooper);
    AppMethodBeat.o(1323);
  }

  public final void a(h.b paramb)
  {
    AppMethodBeat.i(1335);
    synchronized (this.xZD)
    {
      this.xZD.add(paramb);
      b(paramb);
      AppMethodBeat.o(1335);
      return;
    }
  }

  public final void a(h.c paramc)
  {
    AppMethodBeat.i(1322);
    if (this.xHV.cF(paramc))
      this.xHV.doNotify();
    AppMethodBeat.o(1322);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(1321);
    if (!this.xZC.contains(parame))
    {
      ab.i("MicroMsg.MsgInfoStorage", "addMessageStorageImpl %s", new Object[] { parame });
      this.xZC.add(parame);
    }
    AppMethodBeat.o(1321);
  }

  public final int aa(String paramString, long paramLong)
  {
    AppMethodBeat.i(1384);
    bi localbi = Q(paramString, paramLong);
    this.xZK.m((int)(bo.anT() / 86400L), localbi.field_msgSvrId, localbi.field_createTime / 1000L);
    int i = this.fni.delete(Rr(paramString), "msgSvrId=?", new String[] { String.valueOf(paramLong) });
    if (i != 0)
    {
      doNotify();
      a(new h.c(paramString, "delete", null, 1, (byte)0));
    }
    while (true)
    {
      AppMethodBeat.o(1384);
      return i;
      com.tencent.mm.plugin.report.e.pXa.a(111L, 246L, 1L, false);
    }
  }

  public final List<bi> aa(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1364);
    ArrayList localArrayList = new ArrayList();
    paramString = "SELECT * FROM " + Rr(paramString) + " WHERE type = 49 ORDER BY createTime DESC LIMIT " + paramInt1 + " , " + paramInt2;
    ab.d("MicroMsg.MsgInfoStorage", "getAppMsgTypeList sql=%s", new Object[] { paramString });
    Cursor localCursor = this.fni.a(paramString, null, 2);
    while (localCursor.moveToNext())
    {
      paramString = new bi();
      paramString.d(localCursor);
      if (paramString.bAA())
        localArrayList.add(paramString);
    }
    localCursor.close();
    AppMethodBeat.o(1364);
    return localArrayList;
  }

  public final void aa(bi parambi)
  {
    AppMethodBeat.i(1390);
    if ((parambi == null) || (parambi.field_status == 4))
      AppMethodBeat.o(1390);
    while (true)
    {
      return;
      parambi.setStatus(4);
      String str = mT(parambi.field_msgId);
      if ((str != null) && (str.length() > 0))
        if (this.fni.update(str, parambi.Hl(), "msgId=?", new String[] { parambi.field_msgId }) != 0)
        {
          doNotify();
          a(new h.c(parambi.field_talker, "update", parambi, -1));
        }
      AppMethodBeat.o(1390);
    }
  }

  public final int ab(bi parambi)
  {
    int i = 0;
    AppMethodBeat.i(1393);
    if (parambi != null)
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("content", parambi.field_content);
      localContentValues.put("status", Integer.valueOf(parambi.field_status));
      int j = this.fni.update(mT(parambi.field_msgId), localContentValues, "msgId=?", new String[] { String.valueOf(parambi.field_msgId) });
      i = j;
      if (j != 0)
      {
        doNotify();
        a(new h.c(parambi.field_talker, "update", parambi));
        i = j;
      }
    }
    AppMethodBeat.o(1393);
    return i;
  }

  public final int ab(String paramString, long paramLong)
  {
    AppMethodBeat.i(1386);
    String str = apG(paramString) + " and createTime <= " + paramLong;
    b(Rr(paramString), str, null);
    int i = this.fni.delete(Rr(paramString), str, null);
    if (i != 0)
    {
      anF("delete_talker ".concat(String.valueOf(paramString)));
      paramString = new h.c(paramString, "delete", null, i, (byte)0);
      paramString.oqO = -1L;
      a(paramString);
    }
    AppMethodBeat.o(1386);
    return i;
  }

  public final Cursor ab(String paramString, int paramInt1, int paramInt2)
  {
    String str = null;
    AppMethodBeat.i(1374);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(1374);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from ( select * from " + str + " where" + apG(paramString) + " AND type IN (3,39,13,43,62,44,268435505)  order by createTime DESC limit " + paramInt2 + " OFFSET " + paramInt1 + ") order by createTime ASC ";
      paramString = this.fni.a(paramString, null, 2);
      AppMethodBeat.o(1374);
    }
  }

  public final int ac(String paramString, long paramLong)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(1412);
    bi localbi = jf(paramLong);
    if (localbi.field_msgId == 0L)
    {
      ab.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
      AppMethodBeat.o(1412);
    }
    while (true)
    {
      return j;
      String str = Rr(paramString);
      paramString = "SELECT COUNT(*) FROM " + str + " " + apJ(str) + " WHERE " + apG(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime < " + localbi.field_createTime;
      paramString = this.fni.a(paramString, null, 2);
      j = i;
      if (paramString.moveToFirst())
        j = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(1412);
    }
  }

  public final String ad(String paramString, long paramLong)
  {
    String str = null;
    int i = 0;
    AppMethodBeat.i(1413);
    Object localObject = jf(paramLong);
    if (((cy)localObject).field_msgId == 0L)
    {
      ab.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
      AppMethodBeat.o(1413);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "EXPLAIN QUERY PLAN SELECT COUNT(*) FROM " + str + " " + apJ(str) + " WHERE" + apG(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime < " + ((cy)localObject).field_createTime;
      localObject = this.fni.a(paramString, null, 0);
      str = "";
      paramString = str;
      if (((Cursor)localObject).moveToFirst())
        while (true)
        {
          paramString = str;
          if (i >= ((Cursor)localObject).getColumnCount())
            break;
          str = str + ((Cursor)localObject).getString(i) + " ";
          i++;
        }
      ((Cursor)localObject).close();
      AppMethodBeat.o(1413);
    }
  }

  public final bi ae(String paramString, long paramLong)
  {
    Object localObject1 = null;
    AppMethodBeat.i(1423);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1423);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = "select * from message where" + apG(paramString) + " and msgSeq < " + paramLong + " order by msgSeq DESC LIMIT 1 ";
      ab.i("MicroMsg.MsgInfoStorage", "summerbadcr getOlderMsgByMsgSeq: ".concat(String.valueOf(localObject2)));
      localObject2 = this.fni.a((String)localObject2, null, 0);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.MsgInfoStorage", "summerbadcr getNewerMsgByMsgSeq failed ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1423);
        paramString = localObject1;
      }
      else if (((Cursor)localObject2).moveToFirst())
      {
        paramString = new bi();
        paramString.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        AppMethodBeat.o(1423);
      }
      else
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(1423);
        paramString = localObject1;
      }
    }
  }

  public final bi af(String paramString, long paramLong)
  {
    AppMethodBeat.i(1439);
    ab.d("MicroMsg.MsgInfoStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(1) });
    bi localbi = new bi();
    paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime < " + paramLong + " AND isSend = 0 ORDER BY createTime DESC  LIMIT 1";
    ab.d("MicroMsg.MsgInfoStorage", "get up inc msg create time sql: %s", new Object[] { paramString });
    paramString = this.fni.a(paramString, null, 0);
    if (paramString == null)
    {
      ab.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
      AppMethodBeat.o(1439);
    }
    while (true)
    {
      return localbi;
      if (paramString.moveToLast())
      {
        localbi.d(paramString);
        paramString.close();
        AppMethodBeat.o(1439);
      }
      else
      {
        paramString.close();
        ab.w("MicroMsg.MsgInfoStorage", "get result fail");
        AppMethodBeat.o(1439);
      }
    }
  }

  public final Cursor b(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(1429);
    long l;
    if (paramLong2 < paramLong1)
      l = paramLong1;
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM ( SELECT * FROM ").append(Rr(paramString)).append(" WHERE").append(apG(paramString));
      if (paramLong2 > 0L)
      {
        str = " AND createTime >= ".concat(String.valueOf(paramLong2));
        localStringBuilder = localStringBuilder.append(str);
        if (l <= 0L)
          break label184;
      }
      label184: for (String str = " AND createTime <= ".concat(String.valueOf(l)); ; str = "")
      {
        str = str + " ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC";
        ab.d("MicroMsg.MsgInfoStorage", "getCursorAfterStratTimeBeforeEndTimeLimit talk:%s limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
        paramString = this.fni.a(str, null, 0);
        AppMethodBeat.o(1429);
        return paramString;
        str = "";
        break;
      }
      l = paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public final void b(long paramLong, bi parambi)
  {
    AppMethodBeat.i(1391);
    boolean bool;
    if (bo.nullAsNil(parambi.field_talker).length() > 0)
    {
      bool = true;
      Assert.assertTrue("no talker set when update by svrid", bool);
      if (parambi.dtu())
      {
        String str = apI(parambi.dqJ);
        if (t.nE(str))
        {
          ab.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { str });
          parambi.ju("notifymessage");
        }
      }
      as(parambi);
      if (this.fni.update(Rr(parambi.field_talker), parambi.Hl(), "msgSvrId=?", new String[] { String.valueOf(paramLong) }) == 0)
        break label154;
      doNotify();
      a(new h.c(parambi.field_talker, "update", parambi));
      AppMethodBeat.o(1391);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label154: com.tencent.mm.plugin.report.e.pXa.a(111L, 243L, 1L, false);
      AppMethodBeat.o(1391);
    }
  }

  public final void b(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(1381);
    long l = bo.anT();
    Object localObject = "SELECT msgSvrId,createTime FROM " + paramString1 + " WHERE createTime > " + (l - 172800L) * 1000L;
    paramString1 = (String)localObject;
    if (!bo.isNullOrNil(paramString2))
      paramString1 = (String)localObject + " AND " + paramString2;
    paramString2 = new ArrayList();
    localObject = new ArrayList();
    paramString1 = this.fni.a(paramString1, paramArrayOfString, 2);
    if (paramString1.moveToFirst())
    {
      do
      {
        int i = paramString1.getInt(0);
        l = paramString1.getLong(1) / 1000L;
        paramString2.add(Integer.valueOf(i));
        ((List)localObject).add(Long.valueOf(l));
      }
      while (paramString1.moveToNext());
      this.xZK.p(paramString2, (List)localObject);
    }
    paramString1.close();
    AppMethodBeat.o(1381);
  }

  public final void bOA()
  {
    AppMethodBeat.i(1336);
    for (int i = 0; i < this.xZD.size(); i++)
      b((h.b)this.xZD.get(i));
    AppMethodBeat.o(1336);
  }

  public final void bOB()
  {
    AppMethodBeat.i(1338);
    if (!this.xZB)
    {
      AppMethodBeat.o(1338);
      return;
    }
    Object localObject = "select count(*) from " + "message" + " where talkerId ISNULL ";
    localObject = this.fni.a((String)localObject, null, 2);
    if (localObject != null)
      if (!((Cursor)localObject).moveToFirst())
        break label281;
    label281: for (int i = ((Cursor)localObject).getInt(0); ; i = 0)
    {
      ((Cursor)localObject).close();
      if (i > 0)
      {
        ab.i("MicroMsg.MsgInfoStorage", " msg table exists null talkerid ,start translate tableName %s ", new Object[] { "message" });
        long l = System.currentTimeMillis();
        localObject = "update " + "message" + " set talkerId=(select rowid from rcontact where rcontact.username = " + "message" + ".talker)";
        boolean bool = this.fni.hY("message", (String)localObject);
        ab.i("MicroMsg.MsgInfoStorage", "update result :%b last %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
        if ((bool) && (this.xZB))
        {
          this.fni.hY("message", "DROP INDEX messageCreateTaklerTypeTimeIndex IF EXISTS");
          this.fni.hY("message", "DROP INDEX messageTalkerStatusIndex IF EXISTS");
          this.fni.hY("message", "DROP INDEX messageTalkerCreateTimeIsSendIndex IF EXISTS");
          this.fni.hY("message", "DROP INDEX messageCreateTaklerTimeIndex IF EXISTS");
          this.fni.hY("message", "DROP INDEX messageTalkerSvrIdIndex IF EXISTS");
          ab.i("MicroMsg.MsgInfoStorage", "clear talker Name index");
        }
      }
      AppMethodBeat.o(1338);
      break;
    }
  }

  public final ArrayList<bi> bOC()
  {
    AppMethodBeat.i(1350);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.fni.a("message", null, "createTime>=? AND status=? AND isSend=?", new String[] { String.valueOf(System.currentTimeMillis() - 172800000L), "5", "1" }, null, null, "createTime ASC", 2);
    label145: 
    while (localCursor.moveToNext())
    {
      bi localbi = new bi();
      localbi.d(localCursor);
      if (!localbi.dtK());
      for (int i = 1; ; i = 0)
      {
        if (((i & 0x1) == 0) || (ad.aou(localbi.field_talker)) || (ad.aow(localbi.field_talker)) || (ad.mR(localbi.field_talker)))
          break label145;
        localArrayList.add(localbi);
        break;
      }
    }
    localCursor.close();
    AppMethodBeat.o(1350);
    return localArrayList;
  }

  public final List<bi> bOD()
  {
    AppMethodBeat.i(1362);
    ArrayList localArrayList = new ArrayList();
    boolean bool;
    Object localObject1;
    if (this.xZD != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localObject1 = new ArrayList();
    }
    Object localObject2;
    for (int i = 0; ; i++)
    {
      if (i >= this.xZD.size())
        break label205;
      Cursor localCursor = this.fni.a(((h.b)this.xZD.get(i)).name, null, "status=1 and isSend=1", null, null, null, "createTime DESC ", 2);
      while (true)
      {
        if (!localCursor.moveToNext())
          break label192;
        localObject2 = new bi();
        ((bi)localObject2).d(localCursor);
        if ((((bi)localObject2).isText()) || (((bi)localObject2).dtw()) || (((bi)localObject2).bAC()) || (((bi)localObject2).dtE()))
        {
          if (bf.aaa() - ((cy)localObject2).field_createTime > 86400000L)
          {
            ((List)localObject1).add(localObject2);
            continue;
            bool = false;
            break;
          }
          localArrayList.add(localObject2);
        }
      }
      label192: localCursor.close();
    }
    label205: if (((List)localObject1).size() > 0)
    {
      long l = this.fni.iV(-1L);
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (bi)((Iterator)localObject2).next();
        ab.i("MicroMsg.MsgInfoStorage", "Set msg timtout : id:%d time:%d talker:%s content:%s", new Object[] { Long.valueOf(((cy)localObject1).field_msgId), Long.valueOf(((cy)localObject1).field_createTime), ((cy)localObject1).field_talker, bo.anv(((cy)localObject1).field_content) });
        ((bi)localObject1).setStatus(5);
        a(((cy)localObject1).field_msgId, (bi)localObject1);
      }
      this.fni.mB(l);
    }
    AppMethodBeat.o(1362);
    return localArrayList;
  }

  public final Cursor bOE()
  {
    AppMethodBeat.i(1400);
    Cursor localCursor = this.fni.query("message", new String[] { "talker", "count(*) as unReadCount" }, "isSend=? AND status!=?", new String[] { "0", "4" }, "talker", null, null);
    AppMethodBeat.o(1400);
    return localCursor;
  }

  public final String bOF()
  {
    return "type IN (3,39,13,43,62,44,268435505)";
  }

  public final String bOG()
  {
    return "type IN (3,39,13,43,62,44,49,268435505)";
  }

  // ERROR //
  public final List<bi> bOH()
  {
    // Byte code:
    //   0: sipush 1446
    //   3: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 494	java/util/ArrayList
    //   9: astore_1
    //   10: aload_1
    //   11: invokespecial 495	java/util/ArrayList:<init>	()V
    //   14: aload_0
    //   15: getfield 143	com/tencent/mm/storage/bj:fni	Lcom/tencent/mm/cd/h;
    //   18: ldc 70
    //   20: aconst_null
    //   21: ldc_w 1456
    //   24: iconst_1
    //   25: anewarray 60	java/lang/String
    //   28: dup
    //   29: iconst_0
    //   30: invokestatic 479	java/lang/System:currentTimeMillis	()J
    //   33: ldc2_w 1082
    //   36: lsub
    //   37: invokestatic 708	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   40: aastore
    //   41: aconst_null
    //   42: aconst_null
    //   43: ldc_w 792
    //   46: iconst_2
    //   47: invokevirtual 711	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   50: astore_2
    //   51: aload_2
    //   52: astore_3
    //   53: aload_2
    //   54: invokeinterface 851 1 0
    //   59: ifeq +80 -> 139
    //   62: aload_2
    //   63: astore_3
    //   64: new 406	com/tencent/mm/storage/bi
    //   67: astore 4
    //   69: aload_2
    //   70: astore_3
    //   71: aload 4
    //   73: invokespecial 704	com/tencent/mm/storage/bi:<init>	()V
    //   76: aload_2
    //   77: astore_3
    //   78: aload 4
    //   80: aload_2
    //   81: invokevirtual 714	com/tencent/mm/storage/bi:d	(Landroid/database/Cursor;)V
    //   84: aload_2
    //   85: astore_3
    //   86: aload_1
    //   87: aload 4
    //   89: invokevirtual 1084	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   92: pop
    //   93: goto -42 -> 51
    //   96: astore_1
    //   97: aload_2
    //   98: astore_3
    //   99: ldc 182
    //   101: aload_1
    //   102: ldc_w 1086
    //   105: iconst_1
    //   106: anewarray 186	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload_1
    //   112: invokevirtual 344	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   115: aastore
    //   116: invokestatic 1078	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload_2
    //   120: ifnull +9 -> 129
    //   123: aload_2
    //   124: invokeinterface 468 1 0
    //   129: sipush 1446
    //   132: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: aconst_null
    //   136: astore_3
    //   137: aload_3
    //   138: areturn
    //   139: aload_2
    //   140: ifnull +9 -> 149
    //   143: aload_2
    //   144: invokeinterface 468 1 0
    //   149: sipush 1446
    //   152: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aload_1
    //   156: astore_3
    //   157: goto -20 -> 137
    //   160: astore_2
    //   161: aconst_null
    //   162: astore_3
    //   163: aload_3
    //   164: ifnull +9 -> 173
    //   167: aload_3
    //   168: invokeinterface 468 1 0
    //   173: sipush 1446
    //   176: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_2
    //   180: athrow
    //   181: astore_2
    //   182: goto -19 -> 163
    //   185: astore_1
    //   186: aconst_null
    //   187: astore_2
    //   188: goto -91 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   53	62	96	java/lang/Exception
    //   64	69	96	java/lang/Exception
    //   71	76	96	java/lang/Exception
    //   78	84	96	java/lang/Exception
    //   86	93	96	java/lang/Exception
    //   6	51	160	finally
    //   53	62	181	finally
    //   64	69	181	finally
    //   71	76	181	finally
    //   78	84	181	finally
    //   86	93	181	finally
    //   99	119	181	finally
    //   6	51	185	java/lang/Exception
  }

  public final com.tencent.mm.cd.h bOy()
  {
    return this.fni;
  }

  public final void bOz()
  {
    AppMethodBeat.i(1333);
    g.RQ();
    g.RP().Ry().set(348167, Integer.valueOf(1));
    AppMethodBeat.o(1333);
  }

  public final long c(bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(1369);
    Object localObject1;
    long l;
    if ((parambi == null) || (bo.isNullOrNil(parambi.field_talker)))
    {
      com.tencent.mm.plugin.report.e.pXa.a(111L, 250L, 1L, false);
      if (parambi == null)
      {
        localObject1 = "-1";
        ab.e("MicroMsg.MsgInfoStorage", "Error insert message msg:%s talker:%s", new Object[] { parambi, localObject1 });
        l = -1L;
        AppMethodBeat.o(1369);
      }
    }
    while (true)
    {
      return l;
      localObject1 = parambi.field_talker;
      break;
      ab.d("MicroMsg.MsgInfoStorage", "insert lockForSync[%b], message seq[%d]", new Object[] { Boolean.valueOf(this.xZM), Long.valueOf(parambi.field_msgSeq) });
      localObject1 = null;
      localObject2 = bf.oE(parambi.dqJ);
      if (localObject2 != null)
        localObject1 = ((bf.b)localObject2).fmp;
      if (t.nE((String)localObject1))
      {
        ab.d("MicroMsg.MsgInfoStorage", "msgCluster = %s", new Object[] { localObject1 });
        if (parambi.getType() == 436207665)
        {
          ab.w("MicroMsg.MsgInfoStorage", "protect:c2c msg should not here");
          l = -1L;
          AppMethodBeat.o(1369);
        }
        else
        {
          parambi.ju("notifymessage");
        }
      }
      else
      {
        localObject1 = apM(parambi.field_talker);
        if (localObject1 == null)
        {
          com.tencent.mm.plugin.report.e.pXa.a(111L, 249L, 1L, false);
          ab.e("MicroMsg.MsgInfoStorage", "Error insert message getTableByTalker failed. talker:%s", new Object[] { parambi.field_talker });
          l = -1L;
          AppMethodBeat.o(1369);
        }
        else
        {
          ((h.b)localObject1).ac(parambi);
          Assert.assertTrue(String.format("check table name from id:%d table:%s getTableNameByLocalId:%s", new Object[] { Long.valueOf(parambi.field_msgId), localObject1, mT(parambi.field_msgId) }), ((h.b)localObject1).name.equals(mT(parambi.field_msgId)));
          if (parambi.field_msgSvrId != 0L)
            parambi.HH();
          Iterator localIterator = this.xZC.iterator();
          while (true)
            if (localIterator.hasNext())
              if (!((e)localIterator.next()).a(parambi, (bf.b)localObject2))
              {
                ab.e("MicroMsg.MsgInfoStorage", "Error dealMsgSource. talker:%s ,msgSouce:%s", new Object[] { parambi.field_talker, parambi.dqJ });
                l = -1L;
                AppMethodBeat.o(1369);
                break;
              }
          as(parambi);
          if (((h.b)localObject1).name.equals("message"))
            parambi.hX((int)apH(parambi.field_talker));
          localObject2 = parambi.Hl();
          l = this.fni.a(((h.b)localObject1).name, "msgId", (ContentValues)localObject2, paramBoolean);
          ab.i("MicroMsg.MsgInfoStorage", "insert:%d talker:%s id:%d type:%d status:%d svrid:%d msgseq:%d flag:%d create:%d issend:%d lockforsync[%s,%d]", new Object[] { Long.valueOf(l), parambi.field_talker, Long.valueOf(parambi.field_msgId), Integer.valueOf(parambi.getType()), Integer.valueOf(parambi.field_status), Long.valueOf(parambi.field_msgSvrId), Long.valueOf(parambi.field_msgSeq), Integer.valueOf(parambi.field_flag), Long.valueOf(parambi.field_createTime), Integer.valueOf(parambi.field_isSend), this.xZN, Long.valueOf(bo.gb(this.xZO)) });
          if (l != -1L)
            break label666;
          com.tencent.mm.plugin.report.e.pXa.a(111L, 248L, 1L, false);
          ab.e("MicroMsg.MsgInfoStorage", "insert failed svrid:%d ret:%d", new Object[] { Long.valueOf(parambi.field_msgSvrId), Long.valueOf(l) });
          l = -1L;
          AppMethodBeat.o(1369);
        }
      }
    }
    label666: if ((this.xZM) && (bo.gb(this.xZO) > 2000L) && (parambi.field_isSend == 1) && (parambi.field_status == 1))
    {
      ab.w("MicroMsg.MsgInfoStorage", "insert this fucking tag[%s] lockForSync too long:%d force to release Now.", new Object[] { this.xZN, Long.valueOf(bo.gb(this.xZO)) });
      QX(this.xZN);
    }
    if (this.xZM)
    {
      localObject1 = null;
      if (e.xHP != null)
        localObject1 = e.xHP.N(parambi);
      if (!bo.isNullOrNil((String)localObject1))
        break label944;
    }
    label944: for (Object localObject2 = parambi.field_talker; ; localObject2 = localObject1)
    {
      localObject1 = null;
      if (this.xZL.containsKey(localObject2))
        localObject1 = (h.c)this.xZL.get(localObject2);
      if (localObject1 == null)
      {
        localObject1 = new h.c(parambi.field_talker, "insert", parambi);
        label832: if (h.c.ad(parambi))
          ((h.c)localObject1).oqL += 1;
        ((h.c)localObject1).oqM += 1;
        this.xZL.put(localObject2, localObject1);
      }
      while (true)
      {
        l = parambi.field_msgId;
        AppMethodBeat.o(1369);
        break;
        ((h.c)localObject1).oqK.add(parambi);
        break label832;
        localObject1 = new h.c(parambi.field_talker, "insert", parambi);
        if (h.c.ad(parambi))
          ((h.c)localObject1).oqL = 1;
        ((h.c)localObject1).oqM = 1;
        doNotify();
        a((h.c)localObject1);
      }
    }
  }

  public final Cursor c(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(1431);
    if (paramLong2 == 0L)
    {
      paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime > " + paramLong1 + " ORDER BY createTime ASC  LIMIT 50 OFFSET " + paramInt;
      ab.d("MicroMsg.MsgInfoStorage", "get cursor: ".concat(String.valueOf(paramString)));
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1431);
      return paramString;
    }
    long l;
    if (paramLong2 < paramLong1)
      l = paramLong1;
    while (true)
    {
      paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime > " + paramLong2 + " AND createTime < " + l + " ORDER BY createTime ASC  LIMIT 50 OFFSET " + paramInt;
      ab.d("MicroMsg.MsgInfoStorage", "get cursor: ".concat(String.valueOf(paramString)));
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1431);
      break;
      l = paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public final int cA(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(1409);
    paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND type = " + paramInt;
    paramString = this.fni.a(paramString, null, 2);
    paramInt = i;
    if (paramString.moveToFirst())
      paramInt = paramString.getInt(0);
    paramString.close();
    AppMethodBeat.o(1409);
    return paramInt;
  }

  public final Cursor cB(String paramString, int paramInt)
  {
    AppMethodBeat.i(1435);
    String str = " SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND isSend=1 ORDER BY createTime DESC LIMIT " + paramInt;
    ab.d("MicroMsg.MsgInfoStorage", "[getInitCursorBySelf] getCursor talk:%s,limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
    paramString = this.fni.a(str, null, 0);
    AppMethodBeat.o(1435);
    return paramString;
  }

  public final bi[] cC(String paramString, int paramInt)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(1441);
    if ((paramString == null) || (paramString.length() == 0) || (paramInt <= 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getLastMsgList, invalid argument, talker = " + paramString + ", limit = " + paramInt);
      AppMethodBeat.o(1441);
      paramString = localArrayList;
    }
    while (true)
    {
      return paramString;
      Object localObject = "select * from " + Rr(paramString) + " where" + apG(paramString) + "order by createTime DESC limit " + paramInt;
      localObject = this.fni.a((String)localObject, null, 2);
      if (((Cursor)localObject).moveToFirst())
      {
        localArrayList = new ArrayList();
        do
        {
          bi localbi = new bi();
          localbi.d((Cursor)localObject);
          localArrayList.add(localbi);
        }
        while (((Cursor)localObject).moveToNext());
        ((Cursor)localObject).close();
        ab.d("MicroMsg.MsgInfoStorage", "getLastMsgList, talker = " + paramString + ", limit = " + paramInt + ", count = " + localArrayList.size());
        Collections.reverse(localArrayList);
        paramString = (bi[])localArrayList.toArray(new bi[localArrayList.size()]);
        AppMethodBeat.o(1441);
      }
      else
      {
        ab.w("MicroMsg.MsgInfoStorage", "getLastMsgList, cursor is empty");
        ((Cursor)localObject).close();
        AppMethodBeat.o(1441);
        paramString = localArrayList;
      }
    }
  }

  public final Cursor cD(String paramString, int paramInt)
  {
    String str = null;
    AppMethodBeat.i(1449);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(1449);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from " + str + " where" + apG(paramString) + " AND type IN (436207665,419430449)  order by createTime DESC limit " + paramInt + " OFFSET 0";
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1449);
    }
  }

  public final List<bi> cs(String paramString, int paramInt)
  {
    AppMethodBeat.i(1359);
    ArrayList localArrayList = new ArrayList();
    if (this.xZD != null);
    Cursor localCursor;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND status = 3 AND type <> 10000 ORDER BY createTime DESC LIMIT " + paramInt;
      localCursor = this.fni.a(paramString, null, 2);
      while (localCursor.moveToNext())
      {
        paramString = new bi();
        paramString.d(localCursor);
        localArrayList.add(paramString);
      }
    }
    localCursor.close();
    AppMethodBeat.o(1359);
    return localArrayList;
  }

  public final List<bi> ct(String paramString, int paramInt)
  {
    AppMethodBeat.i(1363);
    ArrayList localArrayList = new ArrayList();
    if (this.xZD != null);
    Cursor localCursor;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND isSend = 0 ORDER BY createTime DESC LIMIT " + paramInt;
      localCursor = this.fni.a(paramString, null, 2);
      while (localCursor.moveToNext())
      {
        paramString = new bi();
        paramString.d(localCursor);
        if (paramString.isText())
          localArrayList.add(paramString);
      }
    }
    localCursor.close();
    AppMethodBeat.o(1363);
    return localArrayList;
  }

  public final Cursor cu(String paramString, int paramInt)
  {
    String str = null;
    AppMethodBeat.i(1379);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(1379);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from " + str + " where" + apG(paramString) + " AND type = 49  order by createTime DESC limit " + paramInt + " OFFSET 0";
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1379);
    }
  }

  public final Cursor cv(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(1380);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(1380);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = Rr(paramString);
      paramString = new StringBuilder("select msgId,msgSvrId,createTime,content,isSend,imgPath from ").append((String)localObject).append(" where").append(apG(paramString)).append(" AND ");
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(" (type = 49");
      ((StringBuilder)localObject).append(" or type = 587202609");
      ((StringBuilder)localObject).append(" or type = 553648177) ");
      paramString = ((StringBuilder)localObject).toString() + "  order by createTime DESC limit 100 OFFSET " + paramInt;
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1380);
    }
  }

  public final Cursor cw(String paramString, int paramInt)
  {
    String str = null;
    AppMethodBeat.i(1376);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getAllFileMessage fail, argument is invalid");
      AppMethodBeat.o(1376);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from ( select * from " + str + " where" + apG(paramString) + " AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime DESC limit 200 OFFSET " + paramInt + ") order by createTime ASC ";
      paramString = this.fni.a(paramString, null, 2);
      AppMethodBeat.o(1376);
    }
  }

  public final int cx(String paramString, int paramInt)
  {
    AppMethodBeat.i(1387);
    ab.w("MicroMsg.MsgInfoStorage", "deleteByTalkerFrom :%s  :%d stack:%s", new Object[] { paramString, Integer.valueOf(paramInt), com.tencent.mm.sdk.platformtools.an.doR() });
    bi localbi = Q(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localbi.field_talker));
    b(Rr(paramString), "createTime<=? AND" + apG(paramString), new String[] { localbi.field_createTime });
    paramInt = this.fni.delete(Rr(paramString), "createTime<=? AND" + apG(paramString), new String[] { localbi.field_createTime });
    if (paramInt != 0)
    {
      doNotify();
      a(new h.c(paramString, "delete", null, paramInt, (byte)0));
    }
    AppMethodBeat.o(1387);
    return paramInt;
  }

  public final Cursor cy(String paramString, int paramInt)
  {
    AppMethodBeat.i(1388);
    bi localbi = Q(paramString, paramInt);
    Assert.assertTrue(paramString.equals(localbi.field_talker));
    paramString = this.fni.query(Rr(paramString), null, "createTime<=? AND" + apG(paramString), new String[] { localbi.field_createTime }, null, null, null);
    AppMethodBeat.o(1388);
    return paramString;
  }

  public final Cursor cz(String paramString, int paramInt)
  {
    AppMethodBeat.i(1399);
    paramString = this.fni.query(Rr(paramString), null, "isSend=? AND" + apG(paramString) + "AND status!=?  order by msgId DESC limit " + paramInt, new String[] { "0", "4" }, null, null, null);
    AppMethodBeat.o(1399);
    return paramString;
  }

  public final Cursor d(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(1428);
    if (paramLong2 < paramLong1);
    while (true)
    {
      paramString = "SELECT * FROM (SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1 + " ORDER BY createTime DESC LIMIT " + paramInt + " ) ORDER BY createTime ASC";
      ab.d("MicroMsg.MsgInfoStorage", "get cursor: ".concat(String.valueOf(paramString)));
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1428);
      return paramString;
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }

  public final int e(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(1353);
    String str = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime < " + paramLong + " ORDER BY createTime ASC LIMIT -1 OFFSET " + paramInt;
    Cursor localCursor = this.fni.a(str, null, 0);
    paramInt = localCursor.getCount();
    localCursor.close();
    ab.d("MicroMsg.MsgInfoStorage", "getPositionByCreateTime talk:" + paramString + " time:" + paramLong + " count " + paramInt + " [" + str + "]");
    AppMethodBeat.o(1353);
    return paramInt;
  }

  public final long f(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(1438);
    ab.d("MicroMsg.MsgInfoStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      ab.w("MicroMsg.MsgInfoStorage", "error target inc count");
      AppMethodBeat.o(1438);
    }
    while (true)
    {
      return paramLong;
      paramString = "SELECT createTime FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime < " + paramLong + " ORDER BY createTime DESC  LIMIT " + paramInt;
      ab.d("MicroMsg.MsgInfoStorage", "get up inc msg create time sql: %s", new Object[] { paramString });
      paramString = this.fni.a(paramString, null, 0);
      if (paramString == null)
      {
        ab.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
        AppMethodBeat.o(1438);
      }
      else if (paramString.moveToLast())
      {
        paramLong = paramString.getLong(0);
        ab.d("MicroMsg.MsgInfoStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong) });
        paramString.close();
        AppMethodBeat.o(1438);
      }
      else
      {
        paramString.close();
        ab.w("MicroMsg.MsgInfoStorage", "get result fail");
        AppMethodBeat.o(1438);
      }
    }
  }

  public final bi fa(String paramString1, String paramString2)
  {
    bi localbi = null;
    AppMethodBeat.i(1357);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getLastMsg failed : talker:%s", new Object[] { paramString1 });
      AppMethodBeat.o(1357);
    }
    for (paramString1 = localbi; ; paramString1 = localbi)
    {
      return paramString1;
      localbi = new bi();
      paramString2 = "select * from " + Rr(paramString1) + " where" + apG(paramString1) + paramString2 + " order by createTime DESC limit 1";
      paramString2 = this.fni.a(paramString2, null, 2);
      if (paramString2.moveToFirst())
        localbi.d(paramString2);
      paramString2.close();
      ab.i("MicroMsg.MsgInfoStorage", "getLastMsg talker:%s msgid:%d", new Object[] { paramString1, Long.valueOf(localbi.field_msgId) });
      AppMethodBeat.o(1357);
    }
  }

  public final Cursor fb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1396);
    paramString1 = "SELECT * FROM " + Rr(paramString1) + " WHERE" + apG(paramString1) + "AND content LIKE '%" + paramString2 + "%' AND type = 1";
    paramString1 = paramString1 + " ORDER BY createTime DESC";
    paramString1 = this.fni.a(paramString1, null, 0);
    AppMethodBeat.o(1396);
    return paramString1;
  }

  public final int fc(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1436);
    String str = " SELECT COUNT(*) FROM " + Rr(paramString1) + " WHERE" + apG(paramString1) + "AND content LIKE '" + paramString2 + "%' ";
    Cursor localCursor = this.fni.a(str, null, 2);
    while (true)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          i = localCursor.getInt(0);
          localCursor.close();
          ab.d("MicroMsg.MsgInfoStorage", "getMsgCountByMember getCursor talk:%s member:%s,count:%s,[%s]", new Object[] { paramString1, paramString2, Integer.valueOf(i), str });
          AppMethodBeat.o(1436);
          return i;
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
        localCursor.close();
        i = 0;
        continue;
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(1436);
      }
      int i = 0;
    }
  }

  public final LinkedList<bi> fd(String paramString1, String paramString2)
  {
    bi localbi = null;
    AppMethodBeat.i(1442);
    paramString2 = this.fni.a("message", null, "talker=? AND bizClientMsgId=?", new String[] { paramString1, paramString2 }, null, null, null, 2);
    if ((paramString2 == null) || (!paramString2.moveToFirst()))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getByBizClientMsgId fail");
      AppMethodBeat.o(1442);
      paramString1 = localbi;
    }
    while (true)
    {
      return paramString1;
      paramString1 = new LinkedList();
      do
      {
        localbi = new bi();
        localbi.d(paramString2);
        paramString1.add(localbi);
      }
      while (paramString2.moveToNext());
      paramString2.close();
      AppMethodBeat.o(1442);
    }
  }

  public final long g(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(1440);
    ab.d("MicroMsg.MsgInfoStorage", "get down inc create time, talker %s, fromCreateTime %d, targetIncCount %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      ab.w("MicroMsg.MsgInfoStorage", "error target inc count");
      AppMethodBeat.o(1440);
    }
    while (true)
    {
      return paramLong;
      paramString = "SELECT createTime FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime > " + paramLong + " ORDER BY createTime ASC  LIMIT " + paramInt;
      ab.d("MicroMsg.MsgInfoStorage", "get down inc msg create time sql: %s", new Object[] { paramString });
      paramString = this.fni.a(paramString, null, 0);
      if (paramString == null)
      {
        ab.w("MicroMsg.MsgInfoStorage", "get down inc msg create time error, cursor is null");
        AppMethodBeat.o(1440);
      }
      else if (paramString.moveToLast())
      {
        paramLong = paramString.getLong(0);
        ab.d("MicroMsg.MsgInfoStorage", "result msg create time %d", new Object[] { Long.valueOf(paramLong) });
        paramString.close();
        AppMethodBeat.o(1440);
      }
      else
      {
        paramString.close();
        ab.w("MicroMsg.MsgInfoStorage", "get result fail");
        AppMethodBeat.o(1440);
      }
    }
  }

  public final List<bi> g(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(1373);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid, limit = 10");
      AppMethodBeat.o(1373);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramLong = Z(paramString, paramLong);
      if (paramLong == 0L)
      {
        ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, msg is null");
        AppMethodBeat.o(1373);
        paramString = null;
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        if (paramBoolean);
        Cursor localCursor;
        for (paramString = "select * from " + Rr(paramString) + " where" + apG(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime > " + paramLong + "  order by createTime ASC limit 10"; ; paramString = "select * from " + Rr(paramString) + " where" + apG(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime < " + paramLong + "  order by createTime DESC limit 10")
        {
          localCursor = this.fni.a(paramString, null, 2);
          while (localCursor.moveToNext())
          {
            paramString = new bi();
            paramString.d(localCursor);
            localArrayList.add(paramString);
          }
        }
        if (!paramBoolean)
          Collections.reverse(localArrayList);
        localCursor.close();
        AppMethodBeat.o(1373);
        paramString = localArrayList;
      }
    }
  }

  public final Cursor h(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(1395);
    paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + " AND createTime <= " + paramLong + " order by createTime ASC limit " + paramInt;
    paramString = this.fni.a(paramString, null, 0);
    AppMethodBeat.o(1395);
    return paramString;
  }

  public final Cursor h(String paramString, long paramLong, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(1448);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("select * from ");
      paramString = paramString + " where " + "type IN (3,39,13,43,62,44,49,268435505,34)" + " AND msgId >= " + paramLong + "  order by msgId ASC  limit " + paramInt;
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1448);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        paramString = localObject;
    }
  }

  public final Cursor i(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(1397);
    StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM ( SELECT * FROM ").append(Rr(paramString)).append(" WHERE").append(apG(paramString));
    if (paramLong > 0L);
    for (String str = " AND createTime > ".concat(String.valueOf(paramLong)); ; str = "")
    {
      str = str + " ORDER BY createTime DESC LIMIT " + paramInt + ") ORDER BY createTime ASC";
      ab.i("MicroMsg.MsgInfoStorage", "getInitCursor1 getCursor talk:%s limitCount:%d [%s]", new Object[] { paramString, Integer.valueOf(paramInt), str });
      paramString = this.fni.a(str, null, 0);
      AppMethodBeat.o(1397);
      return paramString;
    }
  }

  public final bi jf(long paramLong)
  {
    AppMethodBeat.i(1339);
    bi localbi = new bi();
    Cursor localCursor = this.fni.a(mT(paramLong), null, "msgId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst())
      localbi.d(localCursor);
    localCursor.close();
    AppMethodBeat.o(1339);
    return localbi;
  }

  public final int jg(long paramLong)
  {
    AppMethodBeat.i(1370);
    bi localbi = jf(paramLong);
    Object localObject = localbi.field_talker;
    this.xZK.m((int)(bo.anT() / 86400L), localbi.field_msgSvrId, localbi.field_createTime / 1000L);
    int i = this.fni.delete(mT(paramLong), "msgId=?", new String[] { String.valueOf(paramLong) });
    ((ak)g.K(ak.class)).fk(paramLong);
    if (i != 0)
    {
      anF("delete_id ".concat(String.valueOf(paramLong)));
      localObject = new h.c((String)localObject, "delete", localbi, 1, (byte)0);
      ((h.c)localObject).oqO = paramLong;
      ((h.c)localObject).jMj = localbi.field_bizChatId;
      a((h.c)localObject);
    }
    while (true)
    {
      AppMethodBeat.o(1370);
      return i;
      com.tencent.mm.plugin.report.e.pXa.a(111L, 245L, 1L, false);
    }
  }

  public final boolean jh(long paramLong)
  {
    AppMethodBeat.i(1382);
    boolean bool = this.xZK.mR(paramLong);
    AppMethodBeat.o(1382);
    return bool;
  }

  public final boolean ji(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(1418);
    int i = 0;
    if (i < this.xZD.size())
      if (((h.b)this.xZD.get(i)).jk(paramLong))
      {
        bool = true;
        AppMethodBeat.o(1418);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(1418);
    }
  }

  public final void jj(long paramLong)
  {
    AppMethodBeat.i(1443);
    this.xZK.b(0, paramLong, 0L, false);
    AppMethodBeat.o(1443);
  }

  public final void lock()
  {
    AppMethodBeat.i(1325);
    Assert.assertTrue("lock deprecated, use lockForSync instead.", false);
    AppMethodBeat.o(1325);
  }

  public final int oA(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(1407);
    paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " " + duh() + " WHERE" + apG(paramString);
    paramString = this.fni.a(paramString, null, 2);
    if (paramString.moveToFirst())
      i = paramString.getInt(0);
    paramString.close();
    AppMethodBeat.o(1407);
    return i;
  }

  public final boolean oB(String paramString)
  {
    AppMethodBeat.i(1406);
    boolean bool = "message".equals(Rr(paramString));
    AppMethodBeat.o(1406);
    return bool;
  }

  public final Cursor p(String paramString, long paramLong1, long paramLong2)
  {
    String str = null;
    AppMethodBeat.i(1375);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
      AppMethodBeat.o(1375);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from " + str + " where" + apG(paramString) + "AND type IN (3,39,13,43,62,44,268435505) AND createTime >= " + paramLong1 + " AND createTime< " + paramLong2 + " order by createTime ASC";
      paramString = this.fni.a(paramString, null, 2);
      AppMethodBeat.o(1375);
    }
  }

  public final Cursor q(String paramString, long paramLong1, long paramLong2)
  {
    String str = null;
    AppMethodBeat.i(1377);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.MsgInfoStorage", "getAllFileMessage fail, argument is invalid");
      AppMethodBeat.o(1377);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = Rr(paramString);
      paramString = "select * from " + str + " where" + apG(paramString) + "AND type IN (3,39,13,43,62,44,49,268435505) AND createTime >= " + paramLong1 + " AND createTime< " + paramLong2 + " order by createTime ASC";
      paramString = this.fni.a(paramString, null, 2);
      AppMethodBeat.o(1377);
    }
  }

  public final int r(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    AppMethodBeat.i(1410);
    paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND type = 50 AND createTime >= " + paramLong1 + " AND createTime <= " + paramLong2 + " LIMIT 1";
    paramString = this.fni.a(paramString, null, 2);
    if (paramString.moveToFirst())
      i = paramString.getInt(0);
    paramString.close();
    AppMethodBeat.o(1410);
    return i;
  }

  public final int s(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(1425);
    long l;
    if (paramLong2 < paramLong1)
      l = paramLong1;
    while (true)
    {
      ab.d("MicroMsg.MsgInfoStorage", "talker %s, get count fromCreateTime %d, toCreateTime %d", new Object[] { paramString, Long.valueOf(paramLong2), Long.valueOf(l) });
      paramString = "SELECT COUNT(msgId) FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime >= " + paramLong2 + " AND createTime <= " + l;
      ab.d("MicroMsg.MsgInfoStorage", "get count sql: ".concat(String.valueOf(paramString)));
      paramString = this.fni.a(paramString, null, 2);
      int i;
      if (paramString == null)
      {
        ab.w("MicroMsg.MsgInfoStorage", "get count error, cursor is null");
        i = 0;
        AppMethodBeat.o(1425);
      }
      while (true)
      {
        return i;
        if (paramString.moveToFirst())
        {
          i = paramString.getInt(0);
          ab.d("MicroMsg.MsgInfoStorage", "result msg count %d", new Object[] { Integer.valueOf(i) });
          paramString.close();
          AppMethodBeat.o(1425);
        }
        else
        {
          paramString.close();
          i = 0;
          AppMethodBeat.o(1425);
        }
      }
      l = paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public final Cursor t(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(1427);
    if (paramLong2 < paramLong1);
    while (true)
    {
      paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime >= " + paramLong2 + " AND createTime <= " + paramLong1 + " ORDER BY createTime ASC ";
      ab.d("MicroMsg.MsgInfoStorage", "get cursor: ".concat(String.valueOf(paramString)));
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1427);
      return paramString;
      long l = paramLong1;
      paramLong1 = paramLong2;
      paramLong2 = l;
    }
  }

  public final int u(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(1430);
    if (paramLong2 < paramLong1);
    while (true)
    {
      StringBuilder localStringBuilder = new StringBuilder("SELECT COUNT(*) FROM ( SELECT * FROM ").append(Rr(paramString)).append(" WHERE").append(apG(paramString));
      String str;
      if (paramLong2 > 0L)
        str = " AND createTime >= ".concat(String.valueOf(paramLong2));
      while (true)
      {
        localStringBuilder = localStringBuilder.append(str);
        label94: int i;
        int j;
        if (paramLong1 > 0L)
        {
          str = " AND createTime <= ".concat(String.valueOf(paramLong1));
          str = str + " ORDER BY createTime)";
          ab.d("MicroMsg.MsgInfoStorage", "getCountAfterStratTimeBeforeEndTime talk:%s [%s]", new Object[] { paramString, str });
          paramString = this.fni.a(str, null, 2);
          i = 0;
          j = 0;
        }
        try
        {
          if (paramString.moveToFirst())
            j = paramString.getInt(0);
          return j;
          str = "";
          continue;
          str = "";
          break label94;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
            paramString.close();
            j = i;
          }
        }
        finally
        {
          paramString.close();
          AppMethodBeat.o(1430);
        }
      }
      long l = paramLong2;
      paramLong2 = paramLong1;
      paramLong1 = l;
    }
  }

  public final void unlock()
  {
    AppMethodBeat.i(1326);
    Assert.assertTrue("unlock deprecated, use lockForSync instead.", false);
    AppMethodBeat.o(1326);
  }

  public final int v(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(1432);
    long l;
    if (paramLong2 < paramLong1)
      l = paramLong1;
    while (true)
    {
      paramString = "SELECT COUNT(*) FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime > " + paramLong2 + " AND createTime < " + l;
      paramString = this.fni.a(paramString, null, 2);
      while (true)
      {
        try
        {
          if (paramString.moveToFirst())
          {
            i = paramString.getInt(0);
            return i;
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.MsgInfoStorage", localException, "", new Object[0]);
          paramString.close();
          i = 0;
          continue;
        }
        finally
        {
          paramString.close();
          AppMethodBeat.o(1432);
        }
        int i = 0;
      }
      l = paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public final Cursor w(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(1433);
    long l;
    if (paramLong2 < paramLong1)
    {
      l = paramLong2;
      paramLong2 = paramLong1;
    }
    while (true)
    {
      paramString = "SELECT * FROM " + Rr(paramString) + " WHERE" + apG(paramString) + "AND createTime >= " + l + " AND createTime <= " + paramLong2;
      ab.d("MicroMsg.MsgInfoStorage", "get cursor: ".concat(String.valueOf(paramString)));
      paramString = this.fni.a(paramString, null, 0);
      AppMethodBeat.o(1433);
      return paramString;
      l = paramLong1;
    }
  }

  public final bi yw(int paramInt)
  {
    AppMethodBeat.i(1360);
    bi localbi;
    if (this.xZD == null)
    {
      ab.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
      AppMethodBeat.o(1360);
      localbi = null;
    }
    while (true)
    {
      return localbi;
      localbi = new bi();
      long l1 = 0L;
      int i = 0;
      while (i < this.xZD.size())
      {
        long l2 = l1;
        if ((((h.b)this.xZD.get(i)).oqG & paramInt) != 0)
        {
          Object localObject = "select * from " + ((h.b)this.xZD.get(i)).name + "  order by createTime DESC limit 1";
          localObject = this.fni.a((String)localObject, null, 2);
          l2 = l1;
          if (((Cursor)localObject).moveToFirst())
          {
            long l3 = ((Cursor)localObject).getLong(((Cursor)localObject).getColumnIndex("createTime"));
            l2 = l1;
            if (l1 < l3)
            {
              localbi.d((Cursor)localObject);
              l2 = l3;
            }
          }
          ((Cursor)localObject).close();
        }
        i++;
        l1 = l2;
      }
      AppMethodBeat.o(1360);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bj
 * JD-Core Version:    0.6.2
 */