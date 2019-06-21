package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.jz;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bf
{
  public static void X(List<Long> paramList)
  {
    AppMethodBeat.i(59908);
    if (paramList.size() == 0)
      AppMethodBeat.o(59908);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        fm(((Long)paramList.next()).longValue());
      AppMethodBeat.o(59908);
    }
  }

  public static int a(String paramString, a parama)
  {
    AppMethodBeat.i(59912);
    ab.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] stack[%s]", new Object[] { paramString, bo.dpG() });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] is null", new Object[] { paramString });
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(59889);
          if (this.fkF != null)
            this.fkF.JV();
          AppMethodBeat.o(59889);
        }
      });
      AppMethodBeat.o(59912);
    }
    while (true)
    {
      return 0;
      d.post(new Runnable()
      {
        final int fmj = 200;
        final int fmk = 30;
        final int fml = 5;
        int fmm = 100;

        public final void run()
        {
          AppMethodBeat.i(59890);
          try
          {
            bi localbi = ((j)g.K(j.class)).bOr().Rb(this.ewn);
            long l1;
            long l2;
            long l3;
            int i;
            if (localbi == null)
            {
              l1 = 9223372036854775807L;
              ((j)g.K(j.class)).Yo().O(this.ewn, l1);
              ab.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] lastMsg[%s] lastMsgCreateTime[%s]", new Object[] { Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()), localbi, Long.valueOf(l1) });
              ((ak)g.K(ak.class)).oq(this.ewn);
              l2 = bo.anU();
              l3 = 0L;
              i = 0;
            }
            long l5;
            label274: 
            do
            {
              if ((this.fmm < 200) && (this.fmm > 30))
                if (l3 <= 500L)
                  break label274;
              long l4;
              Cursor localCursor;
              for (int j = this.fmm - 5; ; j = this.fmm + 5)
              {
                this.fmm = j;
                l4 = bo.anU();
                localCursor = ((j)g.K(j.class)).bOr().h(this.ewn, this.fmm, l1);
                l3 = 0L;
                l5 = 0L;
                while (localCursor.moveToNext())
                {
                  localbi = new com/tencent/mm/storage/bi;
                  localbi.<init>();
                  localbi.d(localCursor);
                  if (l3 >= localbi.field_createTime)
                    break label515;
                  l3 = localbi.field_createTime;
                  l5 += 1L;
                  bf.m(localbi);
                }
                l1 = localbi.field_createTime;
                break;
              }
              localCursor.close();
              long l6 = bo.anU();
              if ((l3 > 0L) && (l5 > 0L))
              {
                ((j)g.K(j.class)).bOr().ab(this.ewn, l3);
                ((ak)g.K(ak.class)).o(this.ewn, l3);
              }
              i = (int)(i + l5);
              long l7 = bo.anU();
              long l8 = l7 - l4;
              ab.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", new Object[] { bo.anv(this.ewn), Integer.valueOf(i), Long.valueOf(l5), Long.valueOf(l1 - l3), Long.valueOf(l1), Long.valueOf(l7 - l6), Long.valueOf(l7 - l4), Long.valueOf(l7 - l2), Integer.valueOf(this.fmm) });
              l3 = l8;
            }
            while (l5 > 0L);
            AppMethodBeat.o(59890);
            return;
          }
          catch (b localb)
          {
            label515: 
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.MsgInfoStorageLogic", localb, "", new Object[0]);
              AppMethodBeat.o(59890);
            }
          }
        }
      }
      , "deleteMsgByTalker");
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(59891);
          if (this.fkF != null)
            this.fkF.JV();
          AppMethodBeat.o(59891);
        }
      });
      AppMethodBeat.o(59912);
    }
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(59913);
    g.RQ();
    g.RS().aa(new Runnable()
    {
      public final void run()
      {
        int i = 0;
        AppMethodBeat.i(59893);
        if ((this.fkF == null) || (!this.fkF.JU()))
        {
          ((j)g.K(j.class)).XR().dsJ();
          if ((this.fkF == null) || (!this.fkF.JU()))
          {
            bf.aab();
            if ((this.fkF == null) || (!this.fkF.JU()))
            {
              bf.aac();
              if ((this.fkF == null) || (!this.fkF.JU()))
              {
                List localList = ((j)g.K(j.class)).bOr().Re("bottlemessage");
                int j;
                if (localList != null)
                  for (j = 0; j < localList.size(); j++)
                    bf.m((bi)localList.get(j));
                ((j)g.K(j.class)).bOr().Rg("bottlemessage");
                if ((this.fkF == null) || (!this.fkF.JU()))
                {
                  localList = ((j)g.K(j.class)).bOr().Re("message");
                  if (localList != null)
                    for (j = i; j < localList.size(); j++)
                      bf.m((bi)localList.get(j));
                  ((j)g.K(j.class)).bOr().Rg("message");
                }
              }
            }
          }
        }
        if (this.fkF != null)
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(59892);
              bf.5.this.fkF.JV();
              AppMethodBeat.o(59892);
            }
          });
        AppMethodBeat.o(59893);
      }

      public final String toString()
      {
        AppMethodBeat.i(59894);
        String str = super.toString() + "|deleteAllMsg";
        AppMethodBeat.o(59894);
        return str;
      }
    });
    AppMethodBeat.o(59913);
  }

  public static void a(bi parambi, e.a parama)
  {
    AppMethodBeat.i(59918);
    if ((parambi == null) || (parama == null) || (parama.eAB == null))
    {
      ab.e("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgWithAddMsgInfo error input is null, stack[%s]", new Object[] { bo.dpG() });
      AppMethodBeat.o(59918);
    }
    cm localcm;
    while (true)
    {
      return;
      if (parambi.field_msgSvrId != parama.eAB.ptF)
      {
        AppMethodBeat.o(59918);
      }
      else
      {
        localcm = parama.eAB;
        if ((parambi.field_isSend == 0) || (localcm.vEI != 0))
          break;
        AppMethodBeat.o(59918);
      }
    }
    if ((parambi.field_msgSeq == 0L) && (localcm.vEI != 0))
      parambi.eL(localcm.vEI);
    int i = parambi.field_flag;
    if (parama.fsU)
    {
      i |= 2;
      label134: if (!parama.fsV)
        break label201;
      i |= 1;
      label145: if (!parama.fsW)
        break label209;
      i |= 4;
    }
    while (true)
    {
      parambi.hY(i);
      if ((parambi.field_msgId == 0L) && (parama.fsU))
        parambi.eJ(parama.fsX);
      AppMethodBeat.o(59918);
      break;
      i &= -3;
      break label134;
      label201: i &= -2;
      break label145;
      label209: i &= -5;
    }
  }

  public static long aaa()
  {
    AppMethodBeat.i(59904);
    long l1 = System.currentTimeMillis();
    long l2 = cb.aaE();
    if (Math.abs(l1 - l2) > 300000L)
      ab.w("MicroMsg.MsgInfoStorageLogic", "[getFixTime] nowServer:" + l2 + " now:" + l1);
    AppMethodBeat.o(59904);
    return l2;
  }

  public static void aab()
  {
    AppMethodBeat.i(59914);
    List localList = ((j)g.K(j.class)).bOr().Re("qmessage");
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
        m((bi)localList.get(i));
    ((j)g.K(j.class)).bOr().Rg("qmessage");
    AppMethodBeat.o(59914);
  }

  public static void aac()
  {
    AppMethodBeat.i(59915);
    List localList = ((j)g.K(j.class)).bOr().Re("tmessage");
    if (localList != null)
      for (int i = 0; i < localList.size(); i++)
        m((bi)localList.get(i));
    ((j)g.K(j.class)).bOr().Rg("tmessage");
    AppMethodBeat.o(59915);
  }

  public static String al(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59897);
    if (bo.isNullOrNil(paramString1))
    {
      paramString1 = null;
      AppMethodBeat.o(59897);
    }
    while (true)
    {
      return paramString1;
      if (bo.isNullOrNil(paramString2))
      {
        AppMethodBeat.o(59897);
      }
      else
      {
        paramString1 = paramString2 + ": " + paramString1;
        AppMethodBeat.o(59897);
      }
    }
  }

  public static String b(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(59920);
    String str = paramString;
    if (paramBoolean)
    {
      str = paramString;
      if (paramString != null)
      {
        str = paramString;
        if (paramInt == 0)
          str = oz(paramString);
      }
    }
    AppMethodBeat.o(59920);
    return str;
  }

  public static boolean c(e.a parama)
  {
    AppMethodBeat.i(59919);
    boolean bool;
    if ((parama == null) || (parama.eAB == null))
    {
      AppMethodBeat.o(59919);
      bool = false;
    }
    while (true)
    {
      return bool;
      cm localcm = parama.eAB;
      Object localObject = aa.a(localcm.vEB);
      localObject = ((j)g.K(j.class)).bOr().Q((String)localObject, localcm.ptF);
      if (((cy)localObject).field_msgId == 0L)
      {
        AppMethodBeat.o(59919);
        bool = false;
      }
      else if ((((cy)localObject).field_isSend != 0) && (localcm.vEI == 0))
      {
        AppMethodBeat.o(59919);
        bool = false;
      }
      else
      {
        int i = ((cy)localObject).field_flag;
        if (parama.fsU)
        {
          i |= 2;
          label128: if (!parama.fsV)
            break label253;
          i |= 1;
          label141: if (!parama.fsW)
            break label263;
          i |= 4;
        }
        while (true)
        {
          if (i == ((cy)localObject).field_flag)
            break label273;
          ab.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr updateMsgFlagByAddMsgInfo msgType[%d], flag new[%d], old[%d]", new Object[] { Integer.valueOf(localcm.nao), Integer.valueOf(i), Integer.valueOf(((cy)localObject).field_flag) });
          ((bi)localObject).hY(i);
          ((j)g.K(j.class)).bOr().b(((cy)localObject).field_msgSvrId, (bi)localObject);
          AppMethodBeat.o(59919);
          bool = true;
          break;
          i &= -3;
          break label128;
          label253: i &= -2;
          break label141;
          label263: i &= -5;
        }
        label273: AppMethodBeat.o(59919);
        bool = false;
      }
    }
  }

  public static int d(e.a parama)
  {
    int i = 0;
    if (parama.fsU)
      i = 2;
    int j = i;
    if (parama.fsV)
      j = i | 0x1;
    i = j;
    if (parama.fsW)
      i = j | 0x4;
    return i;
  }

  public static int fm(long paramLong)
  {
    AppMethodBeat.i(59909);
    bi localbi = ((j)g.K(j.class)).bOr().jf(paramLong);
    int i;
    if (localbi.field_msgId != paramLong)
    {
      i = 0;
      AppMethodBeat.o(59909);
    }
    while (true)
    {
      return i;
      m(localbi);
      i = ((j)g.K(j.class)).bOr().jg(paramLong);
      AppMethodBeat.o(59909);
    }
  }

  public static long g(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(59921);
    long l1 = paramLong1 * 1000L;
    paramLong1 = 0L;
    long l2 = -1L;
    long l3 = paramLong1;
    bi localbi;
    if (paramString != null)
    {
      localbi = ((j)g.K(j.class)).bOr().Rb(paramString);
      if (localbi != null)
        paramLong1 = localbi.field_createTime;
      l2 = ((j)g.K(j.class)).bOr().Rs(paramString);
      l3 = paramLong1;
    }
    if (l2 == l3)
      if (l1 == l3)
      {
        paramLong1 = l1 + 1L;
        AppMethodBeat.o(59921);
      }
    while (true)
    {
      return paramLong1;
      AppMethodBeat.o(59921);
      paramLong1 = l1;
      continue;
      if (l2 < l3)
      {
        if (l1 == l2)
        {
          paramLong1 = l1 - 1L;
          AppMethodBeat.o(59921);
        }
        else if (l1 == l3)
        {
          paramLong1 = l1 + 1L;
          AppMethodBeat.o(59921);
        }
        else if ((paramLong2 == 0L) || (l1 > l3))
        {
          AppMethodBeat.o(59921);
          paramLong1 = l1;
        }
        else
        {
          localbi = ((j)g.K(j.class)).bOr().S(paramString, l1);
          if ((localbi.field_msgSeq != 0L) && (localbi.field_msgSeq != paramLong2))
          {
            ab.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d] need fix serverMillTime[%d, %d]", new Object[] { Long.valueOf(localbi.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(localbi.field_createTime), Long.valueOf(l1) });
            if (paramLong2 < localbi.field_msgSeq)
            {
              paramString = ((j)g.K(j.class)).bOr().W(paramString, l1 - 1000L);
              label330: if ((paramString.field_msgSeq == 0L) || (paramString.field_msgSeq == paramLong2))
                break label481;
              if (paramString.field_msgSeq >= paramLong2)
                break label471;
              paramLong1 = paramString.field_createTime + 1L;
              label364: ab.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d, %d] need fix serverMillTime[%d, %d, %d] done", new Object[] { Long.valueOf(localbi.field_msgSeq), Long.valueOf(paramString.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(localbi.field_createTime), Long.valueOf(paramString.field_createTime), Long.valueOf(paramLong1) });
            }
          }
          while (true)
          {
            AppMethodBeat.o(59921);
            break;
            paramString = ((j)g.K(j.class)).bOr().V(paramString, 1000L + l1);
            break label330;
            label471: paramLong1 = paramString.field_createTime - 1L;
            break label364;
            label481: ab.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d] no need fix serverMillTime[%d, %d]", new Object[] { Long.valueOf(localbi.field_msgSeq), Long.valueOf(paramLong2), Long.valueOf(localbi.field_createTime), Long.valueOf(l1) });
            paramLong1 = l1;
          }
        }
      }
      else
      {
        ab.w("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgCreateTime first > last [%d > %d], ret serverMillTime:%d", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l1) });
        AppMethodBeat.o(59921);
        paramLong1 = l1;
      }
    }
  }

  public static boolean kE(int paramInt)
  {
    switch (paramInt)
    {
    case 25:
    default:
    case 22:
    case 23:
    case 24:
    case 26:
    case 27:
    case 28:
    case 29:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private static int kF(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case -1879048191:
    case -1879048190:
    case -1879048189:
    }
    while (true)
    {
      return paramInt;
      paramInt = 49;
    }
  }

  public static long l(bi parambi)
  {
    AppMethodBeat.i(59901);
    Object localObject = ((j)g.K(j.class)).XM().aoO(parambi.field_talker);
    if ((localObject == null) || ((int)((com.tencent.mm.n.a)localObject).ewQ == 0))
    {
      ad localad = new ad(parambi.field_talker);
      localad.setType(2);
      localObject = new jz();
      ((jz)localObject).cFm.cFn = localad;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      ((j)g.K(j.class)).XM().Z(localad);
    }
    long l = ((j)g.K(j.class)).bOr().Z(parambi);
    AppMethodBeat.o(59901);
    return l;
  }

  public static void m(bi parambi)
  {
    AppMethodBeat.i(59907);
    if (parambi == null)
      AppMethodBeat.o(59907);
    while (true)
    {
      return;
      Object localObject = e.d.bg(Integer.valueOf(kF(parambi.getType())));
      if (localObject != null)
        ((e)localObject).a(new e.c(parambi));
      localObject = new ch();
      ((ch)localObject).cvw.cvx = parambi.field_msgId;
      ((ch)localObject).cvw.talker = parambi.field_talker;
      ((ch)localObject).cvw.msgType = parambi.getType();
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(59907);
    }
  }

  public static int oA(String paramString)
  {
    AppMethodBeat.i(59902);
    int i = ((j)g.K(j.class)).bOr().oA(paramString);
    AppMethodBeat.o(59902);
    return i;
  }

  public static boolean oB(String paramString)
  {
    AppMethodBeat.i(59903);
    boolean bool = ((j)g.K(j.class)).bOr().oB(paramString);
    AppMethodBeat.o(59903);
    return bool;
  }

  public static long oC(String paramString)
  {
    AppMethodBeat.i(59905);
    long l = aaa();
    ab.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, after fix, now is :%s", new Object[] { Long.valueOf(l) });
    if (paramString != null)
    {
      paramString = ((j)g.K(j.class)).bOr().Rb(paramString);
      if (paramString != null)
      {
        ab.i("MicroMsg.MsgInfoStorageLogic", "[oneliang] fix send msg create time, before return, msg id:%s, now is :%s", new Object[] { Long.valueOf(paramString.field_msgId), Long.valueOf(l) });
        if (paramString.field_createTime + 1L > l)
        {
          l = paramString.field_createTime + 1L;
          AppMethodBeat.o(59905);
        }
      }
    }
    while (true)
    {
      return l;
      AppMethodBeat.o(59905);
    }
  }

  public static int oD(String paramString)
  {
    AppMethodBeat.i(59911);
    int i = ((j)g.K(j.class)).bOr().Rh(paramString);
    AppMethodBeat.o(59911);
    return i;
  }

  public static b oE(String paramString)
  {
    AppMethodBeat.i(59916);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(59916);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      try
      {
        Map localMap = br.z(paramString, "msgsource");
        if (localMap != null)
        {
          boolean bool = localMap.isEmpty();
          if (!bool);
        }
        else
        {
          AppMethodBeat.o(59916);
          paramString = null;
          continue;
        }
        paramString = new com/tencent/mm/model/bf$b;
        paramString.<init>();
        paramString.fmp = ((String)localMap.get(".msgsource.bizmsg.msgcluster"));
        paramString.fmu = ((String)localMap.get(".msgsource.kf.kf_worker"));
        paramString.fmt = bo.nullAsNil((String)localMap.get(".msgsource.bizmsg.bizclientmsgid"));
        paramString.fmy = bo.nullAsNil((String)localMap.get(".msgsource.enterprise_info.qy_msg_type"));
        paramString.fmz = bo.nullAsNil((String)localMap.get(".msgsource.enterprise_info.bizchat_id"));
        paramString.fmA = bo.nullAsNil((String)localMap.get(".msgsource.enterprise_info.bizchat_ver"));
        paramString.userId = bo.nullAsNil((String)localMap.get(".msgsource.enterprise_info.user_id"));
        paramString.fmB = bo.nullAsNil((String)localMap.get(".msgsource.enterprise_info.user_nickname"));
        paramString.fmC = bo.nullAsNil((String)localMap.get(".msgsource.enterprise_info.sync_from_qy_im"));
        paramString.fmx = ((String)localMap.get(".msgsource.strangerantispamticket.$ticket"));
        paramString.scene = bo.getInt((String)localMap.get(".msgsource.strangerantispamticket.$scene"), 0);
        paramString.fmD = ((String)localMap.get(".msgsource.NotAutoDownloadRange"));
        paramString.fmE = bo.getInt((String)localMap.get(".msgsource.DownloadLimitKbps"), 0);
        paramString.fmF = bo.getInt((String)localMap.get(".msgsource.videopreloadlen"), 0);
        paramString.fmG = bo.getInt((String)localMap.get(".msgsource.PreDownload"), 0);
        paramString.fmH = bo.getInt((String)localMap.get(".msgsource.PreDownloadNetType"), 0);
        paramString.fmI = ((String)localMap.get(".msgsource.NoPreDownloadRange"));
        paramString.fmq = bo.getInt((String)localMap.get(".msgsource.msg_cluster_type"), -1);
        paramString.fmr = bo.getInt((String)localMap.get(".msgsource.service_type"), -1);
        paramString.fms = bo.getInt((String)localMap.get(".msgsource.scene"), -1);
        paramString.fmv = bo.getInt((String)localMap.get(".msgsource.bizmsg.msg_predict"), 0);
        paramString.fmw = bo.getLong((String)localMap.get(".msgsource.bizflag"), 0L);
        AppMethodBeat.o(59916);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.MsgInfoStorageLogic", "exception:%s", new Object[] { bo.l(paramString) });
        ab.e("MicroMsg.MsgInfoStorageLogic", "Exception in getMsgSourceValue, %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(59916);
        paramString = null;
      }
    }
  }

  public static String oF(String paramString)
  {
    AppMethodBeat.i(59917);
    paramString = oE(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(59917);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.fmu;
      AppMethodBeat.o(59917);
    }
  }

  public static String ow(String paramString)
  {
    AppMethodBeat.i(59896);
    int i = ox(paramString);
    if (i != -1)
    {
      paramString = paramString.substring(i + 1).trim();
      AppMethodBeat.o(59896);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(59896);
    }
  }

  public static int ox(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(59898);
    if (paramString == null)
    {
      ab.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos text is null]");
      AppMethodBeat.o(59898);
    }
    while (true)
    {
      return i;
      if (paramString.length() <= 0)
      {
        ab.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos length < 0]");
        AppMethodBeat.o(59898);
      }
      else if (paramString.startsWith("~SEMI_XML~"))
      {
        ab.e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos startsWith(SemiXml.MAGIC_HEAD)]");
        AppMethodBeat.o(59898);
      }
      else
      {
        int j = paramString.indexOf(':');
        if ((j != -1) && (paramString.substring(0, j).contains("<")))
        {
          ab.e("MicroMsg.MsgInfoStorageLogic", "dz[reject illegal character]");
          AppMethodBeat.o(59898);
        }
        else
        {
          AppMethodBeat.o(59898);
          i = j;
        }
      }
    }
  }

  public static String oy(String paramString)
  {
    AppMethodBeat.i(59899);
    int i = ox(paramString);
    if (i == -1)
    {
      paramString = null;
      AppMethodBeat.o(59899);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(59899);
    }
  }

  public static String oz(String paramString)
  {
    AppMethodBeat.i(59900);
    int i = ox(paramString);
    if (i == -1)
      AppMethodBeat.o(59900);
    while (true)
    {
      return paramString;
      if (i + 2 >= paramString.length())
      {
        AppMethodBeat.o(59900);
      }
      else
      {
        paramString = paramString.substring(i + 2);
        AppMethodBeat.o(59900);
      }
    }
  }

  public static long q(String paramString, long paramLong)
  {
    AppMethodBeat.i(59906);
    if (paramString != null)
    {
      paramString = ((j)g.K(j.class)).bOr().Rb(paramString);
      if (paramString == null);
    }
    for (long l = paramString.field_createTime + 1L; ; l = 0L)
    {
      if (l > paramLong * 1000L)
        AppMethodBeat.o(59906);
      while (true)
      {
        return l;
        l = paramLong * 1000L;
        AppMethodBeat.o(59906);
      }
    }
  }

  public static int r(String paramString, long paramLong)
  {
    AppMethodBeat.i(59910);
    bi localbi = ((j)g.K(j.class)).bOr().Q(paramString, paramLong);
    int i;
    if (localbi.field_msgSvrId != paramLong)
    {
      i = 0;
      AppMethodBeat.o(59910);
    }
    while (true)
    {
      return i;
      m(localbi);
      i = ((j)g.K(j.class)).bOr().aa(paramString, paramLong);
      AppMethodBeat.o(59910);
    }
  }

  public static abstract interface a
  {
    public abstract boolean JU();

    public abstract void JV();
  }

  public static final class b
  {
    public String fmA;
    public String fmB;
    public String fmC;
    public String fmD;
    public int fmE;
    public int fmF;
    public int fmG;
    public int fmH;
    public String fmI;
    public String fmp;
    public int fmq;
    public int fmr;
    public int fms;
    public String fmt;
    public String fmu;
    public int fmv;
    public long fmw;
    public String fmx;
    public String fmy;
    public String fmz;
    public int scene = 0;
    public String userId;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bf
 * JD-Core Version:    0.6.2
 */