package com.tencent.mm.storage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.l;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class s
{
  private static int ctE = 0;
  private static String xIj = null;
  private static long xIk = 0L;
  private static Boolean xIl = null;

  public static void Mj(int paramInt)
  {
    ctE = paramInt;
  }

  public static boolean aVO()
  {
    AppMethodBeat.i(11902);
    if (xIl != null)
    {
      bool = xIl.booleanValue();
      AppMethodBeat.o(11902);
      return bool;
    }
    int i = as.eg("brandService", 1).decodeInt("BizTimeLineOpenStatus", -1);
    if (i == 1)
      xIl = Boolean.TRUE;
    while (true)
    {
      if (xIl == null)
        break label86;
      bool = xIl.booleanValue();
      AppMethodBeat.o(11902);
      break;
      if (i == 0)
        xIl = Boolean.FALSE;
    }
    label86: c localc = com.tencent.mm.model.c.c.abi().ll("100391");
    if ((localc.isValid()) && ("1".equals(localc.dru().get("isOpenSubscribeListVersion1"))));
    for (boolean bool = true; ; bool = false)
    {
      xIl = Boolean.valueOf(bool);
      ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "isBizTimeLineOpen open %b", new Object[] { xIl });
      if ((!xIl.booleanValue()) && ((((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVm, Integer.valueOf(0))).intValue() & 0x1) > 0))
      {
        xIl = Boolean.TRUE;
        ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "BizTimeLineOpen migrated user");
      }
      if ((!xIl.booleanValue()) && (com.tencent.mm.m.g.Nu().getInt("BizTimeLineOpen", 0) == 1))
      {
        xIl = Boolean.TRUE;
        ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "BizTimeLineOpen dynamicConfigOpen user");
      }
      bool = xIl.booleanValue();
      AppMethodBeat.o(11902);
      break;
    }
  }

  private static long ag(long paramLong1, long paramLong2)
  {
    long l1 = -1L;
    AppMethodBeat.i(11899);
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVl, "");
    long l2 = l1;
    Object localObject;
    if (!bo.isNullOrNil(str))
    {
      localObject = str.split(":");
      l2 = l1;
      if (localObject.length == 2)
      {
        l2 = l1;
        if (bo.getLong(localObject[0], -1L) == paramLong1)
          l2 = paramLong2 - bo.getLong(localObject[1], -1L);
      }
    }
    if (l2 < 0L)
    {
      l2 = 604800L;
      localObject = paramLong1 + ":" + (paramLong2 - 604800L);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVl, localObject);
      ab.d("MicroMsg.BizTimeLineInfoStorageLogic", "getSerialNumber set groupStartTime %s,createTime %d", new Object[] { localObject, Long.valueOf(paramLong2) });
    }
    for (paramLong1 = l2; ; paramLong1 = l2)
    {
      AppMethodBeat.o(11899);
      return paramLong1;
      ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "getSerialNumber groupStartTime %s,createTime %d", new Object[] { str, Long.valueOf(paramLong2) });
    }
  }

  public static void an(bi parambi)
  {
    AppMethodBeat.i(11894);
    if (parambi == null)
      AppMethodBeat.o(11894);
    while (true)
    {
      return;
      if (l.mg(parambi.field_talker))
      {
        AppMethodBeat.o(11894);
      }
      else if (com.tencent.mm.model.t.kH(parambi.field_talker))
      {
        AppMethodBeat.o(11894);
      }
      else
      {
        ad localad = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(parambi.field_talker);
        if ((localad != null) && (a.jh(localad.field_type)) && (!localad.dsf()))
        {
          AppMethodBeat.o(11894);
        }
        else
        {
          int i = 0;
          int j = -1;
          int k = 0;
          long l1 = 0L;
          boolean bool1 = false;
          boolean bool2 = false;
          int m = 0;
          int n = 0;
          Object localObject1 = bf.oE(parambi.dqJ);
          if (localObject1 != null)
          {
            i = ((bf.b)localObject1).fmq;
            j = ((bf.b)localObject1).fmr;
            k = ((bf.b)localObject1).fms;
            l1 = ((bf.b)localObject1).fmv;
            bool1 = bool2;
            if ((((bf.b)localObject1).fmw & 0x8) != 0L)
              bool1 = true;
            m = n;
            if ((((bf.b)localObject1).fmw & 0x10) != 0L)
              m = 1;
            if ((((bf.b)localObject1).fmw & 0x4) != 0L)
            {
              ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d", new Object[] { parambi.field_talker, Long.valueOf(((bf.b)localObject1).fmw) });
              AppMethodBeat.o(11894);
            }
          }
          else if (j != 0)
          {
            AppMethodBeat.o(11894);
          }
          else
          {
            bool2 = b(parambi, i, k);
            ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg %s, isTimeLine %b", new Object[] { parambi.field_talker, Boolean.valueOf(bool2) });
            Object localObject2;
            if (!bool2)
            {
              if (bo.isEqual(parambi.field_talker, xIj))
              {
                ab.v("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg is currentTalker %s, just return.", new Object[] { xIj });
                AppMethodBeat.o(11894);
              }
              else
              {
                localObject2 = com.tencent.mm.aj.z.aeY();
                l1 = parambi.field_msgSvrId;
                localObject1 = new q();
                localObject2 = ((t)localObject2).fni.a("BizTimeLineSingleMsgInfo", null, "msgSvrId" + "=?", new String[] { String.valueOf(l1) }, null, null, null, 2);
                if (((Cursor)localObject2).moveToFirst())
                {
                  ((q)localObject1).d((Cursor)localObject2);
                  ((Cursor)localObject2).close();
                  label456: if (localObject1 != null)
                    break label605;
                }
                label605: for (localObject2 = new q(); ; localObject2 = localObject1)
                {
                  ((q)localObject2).field_msgId = parambi.field_msgId;
                  ((q)localObject2).field_msgSvrId = parambi.field_msgSvrId;
                  ((q)localObject2).field_content = parambi.field_content;
                  ((q)localObject2).field_type = parambi.getType();
                  ((q)localObject2).field_talker = parambi.field_talker;
                  ((q)localObject2).field_talkerId = parambi.field_talkerId;
                  ((q)localObject2).field_createTime = parambi.field_createTime;
                  ((q)localObject2).field_imgPath = parambi.field_imgPath;
                  ((q)localObject2).ht(parambi.dqI);
                  ((q)localObject2).ix(parambi.dqJ);
                  ((q)localObject2).field_status = parambi.field_status;
                  if (localObject1 != null)
                    break label612;
                  com.tencent.mm.aj.z.aeY().g((q)localObject2);
                  AppMethodBeat.o(11894);
                  break;
                  ((Cursor)localObject2).close();
                  localObject1 = null;
                  break label456;
                }
                label612: com.tencent.mm.aj.z.aeY().h((q)localObject2);
                AppMethodBeat.o(11894);
              }
            }
            else if ((localObject1 != null) && ((((bf.b)localObject1).fmw & 0x2) != 0L))
            {
              ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d", new Object[] { parambi.field_talker, Long.valueOf(((bf.b)localObject1).fmw) });
              AppMethodBeat.o(11894);
            }
            else
            {
              localObject2 = com.tencent.mm.aj.z.aeX().B(parambi.field_msgSvrId, "msgSvrId");
              if (localObject2 == null)
              {
                localObject1 = new q();
                ((q)localObject1).field_msgId = parambi.field_msgId;
                ((q)localObject1).field_msgSvrId = parambi.field_msgSvrId;
                ((q)localObject1).field_content = parambi.field_content;
                ((q)localObject1).field_type = parambi.getType();
                ((q)localObject1).field_talker = parambi.field_talker;
                ((q)localObject1).field_talkerId = parambi.field_talkerId;
                ((q)localObject1).field_createTime = parambi.field_createTime;
                ((q)localObject1).field_imgPath = parambi.field_imgPath;
                ((q)localObject1).ht(parambi.dqI);
                ((q)localObject1).ix(parambi.dqJ);
                if (!aVO())
                  break label993;
                ((q)localObject1).field_status = parambi.field_status;
              }
              long l2;
              long l4;
              for (((q)localObject1).field_hasShow = 0; ; ((q)localObject1).field_hasShow = 1)
              {
                if (m != 0)
                  ((q)localObject1).drG();
                if (localObject2 != null)
                  break label1091;
                ((q)localObject1).field_isExpand = bool1;
                l2 = com.tencent.mm.aj.z.aeX().drB();
                long l3 = ag(l2, ((q)localObject1).field_createTime / 1000L);
                l4 = l3;
                if (l3 >= 4294967296L)
                {
                  ab.w("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg serialNumber is too big %d", new Object[] { Long.valueOf(l3) });
                  l2 = com.tencent.mm.aj.z.aeX().drM();
                  l4 = ag(l2, ((q)localObject1).field_createTime / 1000L);
                }
                for (((q)localObject1).field_orderFlag = (l1 << 24 & 0xFF000000 | l2 << 32 | l4); com.tencent.mm.aj.z.aeX().B(((q)localObject1).field_orderFlag, "orderFlag") != null; ((q)localObject1).field_orderFlag += 1L);
                localObject1 = localObject2;
                break;
                label993: ((q)localObject1).field_status = 4;
              }
              if ((localad != null) && (localad.Oe()));
              for (((q)localObject1).field_placeTop = 1; ; ((q)localObject1).field_placeTop = 0)
              {
                com.tencent.mm.aj.z.aeX().g((q)localObject1);
                ab.v("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg groupId %d, serialNumber %d,orderFlag %d", new Object[] { Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(((q)localObject1).field_orderFlag) });
                AppMethodBeat.o(11894);
                break;
              }
              label1091: com.tencent.mm.aj.z.aeX().h((q)localObject1);
              AppMethodBeat.o(11894);
            }
          }
        }
      }
    }
  }

  public static void ao(bi parambi)
  {
    AppMethodBeat.i(11898);
    if (parambi == null)
      AppMethodBeat.o(11898);
    while (true)
    {
      return;
      com.tencent.mm.aj.z.aeX().mJ(parambi.field_msgId);
      AppMethodBeat.o(11898);
    }
  }

  public static void aom(String paramString)
  {
    xIj = paramString;
  }

  private static boolean b(bi parambi, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(11895);
    if (((parambi.drC()) || (parambi.getType() == 1) || (parambi.getType() == 34) || (parambi.getType() == 3)) && ((paramInt1 == 3) || (paramInt2 == 9) || (paramInt2 == 15) || (paramInt2 == 17)))
      AppMethodBeat.o(11895);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11895);
    }
  }

  public static void drP()
  {
    AppMethodBeat.i(11900);
    if (!aVO())
    {
      AppMethodBeat.o(11900);
      return;
    }
    be localbe = ((j)com.tencent.mm.kernel.g.K(j.class)).XR();
    ak localak = localbe.aoZ("officialaccounts");
    if (localak == null)
      localak = new ak("officialaccounts");
    label128: label158: label672: label698: for (boolean bool = true; ; bool = false)
    {
      Object localObject1 = com.tencent.mm.aj.z.aeY().fni.a("SELECT * FROM BizTimeLineSingleMsgInfo order by createTime DESC limit 1", null, 0);
      Object localObject2 = null;
      if (((Cursor)localObject1).moveToFirst())
      {
        localObject2 = new q();
        ((q)localObject2).d((Cursor)localObject1);
      }
      ((Cursor)localObject1).close();
      Object localObject3 = com.tencent.mm.aj.z.aeX().drI();
      long l1;
      if (localObject2 != null)
      {
        l1 = ((q)localObject2).field_createTime;
        if (localObject3 == null)
          break label715;
      }
      label326: label582: label715: for (int i = com.tencent.mm.aj.z.aeX().mI(((q)localObject3).field_orderFlag); ; i = 0)
      {
        long l2;
        int j;
        if (localObject3 != null)
        {
          l2 = ((q)localObject3).field_createTime;
          localak.jk(32);
          j = com.tencent.mm.aj.z.aeY().baS();
          if ((j <= 0) || (i <= 0))
            break label285;
          if (l1 <= l2)
            break label267;
          localak.jk(16);
          localak.hM(j);
          localObject1 = localObject2;
        }
        while (true)
        {
          if ((localObject1 != null) && (((q)localObject1).field_msgId != 0L))
            break label326;
          ab.w("MicroMsg.BizTimeLineInfoStorageLogic", "doUpdateBizMainCell BizTimeLineInfo is null");
          localak.dsI();
          if (!bool)
            localbe.a(localak, localak.field_username);
          AppMethodBeat.o(11900);
          break;
          l1 = 0L;
          break label128;
          l2 = 0L;
          break label158;
          localak.jj(16);
          localak.hM(i);
          localObject1 = localObject3;
          continue;
          if (j > 0)
          {
            localak.jk(16);
            localak.hM(j);
            localObject1 = localObject2;
          }
          else
          {
            localak.jj(16);
            localak.hM(i);
            localObject1 = localObject3;
          }
        }
        if ((localObject1 == localObject3) && (((q)localObject1).field_placeTop == 1))
          localak.jj(32);
        long l3;
        if (localObject1 == localObject2)
        {
          l3 = ((q)localObject1).field_msgId;
          if (xIk == 0L)
            xIk = ah.doB().getLong("biz_time_line_last_notify_msg_id", -1L);
          if (l3 == xIk)
            localak.jk(64);
        }
        else
        {
          localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(((q)localObject1).field_msgId);
          if (((cy)localObject2).field_msgId <= 0L)
            break label672;
          localak.ap((bi)localObject2);
          localak.setContent(((cy)localObject2).field_talker + ":" + ((cy)localObject2).field_content);
          localak.jg(Integer.toString(((bi)localObject2).getType()));
          be.b localb = localbe.Cb();
          if (localb != null)
          {
            localObject1 = new PString();
            PString localPString = new PString();
            localObject3 = new PInt();
            ((bi)localObject2).ju("officialaccounts");
            ((bi)localObject2).setContent(localak.field_content);
            localb.a((bi)localObject2, (PString)localObject1, localPString, (PInt)localObject3, true);
            localak.jh(((PString)localObject1).value);
            localak.ji(localPString.value);
            localak.hP(((PInt)localObject3).value);
          }
          l3 = l2;
          if (l1 > l2)
            l3 = l1;
          localak.eD(l3);
          if (!bool)
            break label698;
        }
        for (l1 = localbe.d(localak); ; l1 = localbe.a(localak, localak.field_username))
        {
          ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "doUpdateBizMainCell ret %d, shouldOfInsert %b, time %d", new Object[] { Long.valueOf(l1), Boolean.valueOf(bool), Long.valueOf(localak.field_conversationTime) });
          AppMethodBeat.o(11900);
          break;
          localak.jj(64);
          break label398;
          localak.dsI();
          ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "lastOfMsg is null or MsgId <= 0, lastTalker is %s", new Object[] { ((q)localObject1).field_talker });
          break label582;
        }
      }
    }
  }

  public static int getSessionId()
  {
    return ctE;
  }

  public static boolean mL(long paramLong)
  {
    AppMethodBeat.i(11897);
    boolean bool;
    if (com.tencent.mm.aj.z.aeX().mG(paramLong) <= 0)
    {
      bool = false;
      AppMethodBeat.o(11897);
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.aj.z.aeX().drB() <= com.tencent.mm.aj.z.aeX().drL())
        com.tencent.mm.aj.z.aeX().drM();
      com.tencent.mm.aj.z.aeX().mF(paramLong);
      bool = true;
      AppMethodBeat.o(11897);
    }
  }

  public static void mM(long paramLong)
  {
    AppMethodBeat.i(11901);
    xIk = paramLong;
    ah.doB().edit().putLong("biz_time_line_last_notify_msg_id", paramLong).apply();
    AppMethodBeat.o(11901);
  }

  public static void pp(boolean paramBoolean)
  {
    AppMethodBeat.i(11896);
    Cursor localCursor1 = ((j)com.tencent.mm.kernel.g.K(j.class)).XR().c(com.tencent.mm.model.t.fkP, null, "officialaccounts");
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = com.tencent.mm.aj.z.aeX().drI();
      if (localObject1 == null);
    }
    for (long l1 = ((q)localObject1).field_createTime; ; l1 = 0L)
    {
      int i = 0;
      int j = 0;
      Cursor localCursor2;
      bi localbi;
      int k;
      int m;
      int n;
      boolean bool1;
      boolean bool2;
      int i2;
      if ((i < 50) && (localCursor1.moveToNext()))
      {
        localObject1 = new ak();
        ((ak)localObject1).d(localCursor1);
        localCursor2 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().i(((at)localObject1).field_username, 3, 0L);
        while (localCursor2.moveToNext())
        {
          localbi = new bi();
          localbi.d(localCursor2);
          if ((!paramBoolean) || (localbi.field_createTime >= l1))
          {
            k = 0;
            m = -1;
            n = 0;
            bool1 = false;
            bool2 = false;
            localObject1 = bf.oE(localbi.dqJ);
            if (localObject1 == null)
              break label678;
            int i1 = ((bf.b)localObject1).fmq;
            i2 = ((bf.b)localObject1).fmr;
            int i3 = ((bf.b)localObject1).fms;
            if ((((bf.b)localObject1).fmw & 0x8) != 0L)
              bool2 = true;
            bool1 = bool2;
            n = i3;
            m = i2;
            k = i1;
            if ((((bf.b)localObject1).fmw & 0x10) == 0L)
              break label678;
            n = 1;
            k = i1;
            m = i2;
            i2 = n;
            n = i3;
          }
        }
      }
      while (true)
      {
        if ((m == 0) && (b(localbi, k, n)))
        {
          ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "doMigrateBizTimeLineMsg %s", new Object[] { localbi.field_talker });
          Object localObject2 = com.tencent.mm.aj.z.aeX().B(localbi.field_msgSvrId, "msgSvrId");
          if (localObject2 == null);
          for (localObject1 = new q(); ; localObject1 = localObject2)
          {
            ((q)localObject1).field_msgId = localbi.field_msgId;
            ((q)localObject1).field_msgSvrId = localbi.field_msgSvrId;
            ((q)localObject1).field_content = localbi.field_content;
            ((q)localObject1).field_type = localbi.getType();
            ((q)localObject1).field_talker = localbi.field_talker;
            ((q)localObject1).field_talkerId = localbi.field_talkerId;
            ((q)localObject1).field_createTime = localbi.field_createTime;
            ((q)localObject1).field_imgPath = localbi.field_imgPath;
            ((q)localObject1).ht(localbi.dqI);
            ((q)localObject1).ix(localbi.dqJ);
            if (i2 != 0)
              ((q)localObject1).drG();
            if (localObject2 != null)
              break label563;
            ((q)localObject1).field_status = 4;
            ((q)localObject1).field_isExpand = bool2;
            long l2 = 1L;
            if (paramBoolean)
              l2 = com.tencent.mm.aj.z.aeX().drB();
            for (((q)localObject1).field_orderFlag = (l2 << 32 | ((q)localObject1).field_createTime / 1000L); com.tencent.mm.aj.z.aeX().B(((q)localObject1).field_orderFlag, "orderFlag") != null; ((q)localObject1).field_orderFlag += 1L);
          }
          localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(localbi.field_talker);
          if ((localObject2 == null) || (!((ad)localObject2).Oe()))
            break label569;
        }
        label563: label569: for (((q)localObject1).field_placeTop = 1; ; ((q)localObject1).field_placeTop = 0)
        {
          com.tencent.mm.aj.z.aeX().g((q)localObject1);
          j++;
          break;
        }
        localCursor2.close();
        i++;
        break;
        ab.i("MicroMsg.BizTimeLineInfoStorageLogic", "doMigrate %d/%d", new Object[] { Integer.valueOf(localCursor1.getCount()), Integer.valueOf(j) });
        localCursor1.close();
        m = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVm, Integer.valueOf(0))).intValue();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVm, Integer.valueOf(m | 0x2));
        AppMethodBeat.o(11896);
        return;
        label678: i2 = 0;
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.s
 * JD-Core Version:    0.6.2
 */