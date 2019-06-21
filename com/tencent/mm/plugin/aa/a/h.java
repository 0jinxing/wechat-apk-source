package com.tencent.mm.plugin.aa.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.protocal.protobuf.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class h
{
  public static double a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    double d1 = 0.0D;
    AppMethodBeat.i(40620);
    try
    {
      double d2 = bo.getDouble(paramString1.trim(), 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d2 == 0.0D);
      for (paramString1 = "0"; ; paramString1 = paramString1.trim())
      {
        localBigDecimal.<init>(paramString1);
        paramString1 = new java/math/BigDecimal;
        paramString1.<init>(paramString2.trim());
        d2 = localBigDecimal.divide(paramString1, paramInt1, paramInt2).doubleValue();
        d1 = d2;
        AppMethodBeat.o(40620);
        return d1;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AAUtil", paramString1, "", new Object[0]);
        AppMethodBeat.o(40620);
      }
    }
  }

  private static void a(String paramString1, String paramString2, com.tencent.mm.plugin.aa.a.b.a parama, String paramString3)
  {
    try
    {
      AppMethodBeat.i(40615);
      bi localbi = new com/tencent/mm/storage/bi;
      localbi.<init>();
      localbi.hO(0);
      localbi.ju(paramString2);
      localbi.setStatus(3);
      localbi.setContent(paramString1);
      localbi.eJ(bf.q(paramString2, System.currentTimeMillis() / 1000L));
      localbi.setType(10000);
      long l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
      ab.i("MicroMsg.AAUtil", "insertPaySysMsg, inserted msgId: %s", new Object[] { Long.valueOf(l) });
      paramString1 = parama;
      if (parama == null)
      {
        paramString1 = new com/tencent/mm/plugin/aa/a/b/a;
        paramString1.<init>();
      }
      if (l > 0L)
      {
        paramString1.field_payMsgId = paramString3;
        paramString1.field_chatroom = paramString2;
        paramString1.field_insertmsg = true;
        paramString1.field_msgId = l;
        com.tencent.mm.plugin.aa.b.aoe().a(paramString1);
      }
      AppMethodBeat.o(40615);
      return;
    }
    finally
    {
    }
    throw paramString1;
  }

  public static void a(String paramString, boolean paramBoolean, long paramLong)
  {
    try
    {
      AppMethodBeat.i(40610);
      if (!bo.isNullOrNil(paramString))
      {
        ab.i("MicroMsg.AAUtil", "insertOrUpdateAARecord, billNo: %s, insertMsg: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        com.tencent.mm.plugin.aa.a.b.c localc = new com/tencent/mm/plugin/aa/a/b/c;
        localc.<init>();
        localc.field_billNo = paramString;
        localc.field_insertmsg = paramBoolean;
        localc.field_localMsgId = paramLong;
        com.tencent.mm.plugin.aa.b.aod().b(localc);
      }
      AppMethodBeat.o(40610);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public static boolean a(Activity paramActivity, y paramy)
  {
    boolean bool = false;
    AppMethodBeat.i(40618);
    if (paramy.vAF == 1)
    {
      ab.i("MicroMsg.AAUtil", "need realname verify");
      paramy = new Bundle();
      paramy.putString("realname_verify_process_jump_activity", ".ui.LaunchAAUI");
      paramy.putString("realname_verify_process_jump_plugin", "aa");
      bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramy, null, 0);
      AppMethodBeat.o(40618);
    }
    while (true)
    {
      return bool;
      if (paramy.vAF == 2)
      {
        ab.i("MicroMsg.AAUtil", "need upload credit");
        bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramy.nZa, paramy.nZd, paramy.nZb, paramy.nZc, false, null);
        AppMethodBeat.o(40618);
      }
      else
      {
        ab.i("MicroMsg.AAUtil", "realnameGuideFlag =  " + paramy.vAF);
        AppMethodBeat.o(40618);
      }
    }
  }

  public static String aom()
  {
    AppMethodBeat.i(40623);
    com.tencent.mm.kernel.g.RQ();
    String str = bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSp, null));
    AppMethodBeat.o(40623);
    return str;
  }

  private static void bf(String paramString1, String paramString2)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(40609);
      j.b localb;
      Object localObject1;
      Object localObject2;
      long l;
      if (!bo.isNullOrNil(paramString1))
      {
        localb = j.b.me(paramString1);
        if ((localb != null) && (!bo.isNullOrNil(localb.fih)))
        {
          localObject1 = com.tencent.mm.plugin.aa.b.aod().vH(localb.fih);
          localObject2 = localb.fih;
          if ((localObject1 != null) && (((com.tencent.mm.plugin.aa.a.b.c)localObject1).field_insertmsg))
          {
            if (localObject1 == null)
              break label149;
            l = ((com.tencent.mm.plugin.aa.a.b.c)localObject1).field_localMsgId;
            label80: ab.i("MicroMsg.AAUtil", "insertAAMsg, billNo: %s, chatroom: %s, oldRecord: %s, insertMsg: %s, localMsgId: %s", new Object[] { localObject2, paramString2, localObject1, Boolean.valueOf(bool), Long.valueOf(l) });
            if (localObject1 != null)
              break label155;
            ab.e("MicroMsg.AAUtil", "insertAAMsg, record is null!!");
            AppMethodBeat.o(40609);
          }
        }
      }
      while (true)
      {
        return;
        bool = false;
        break;
        label149: l = 0L;
        break label80;
        label155: if ((!((com.tencent.mm.plugin.aa.a.b.c)localObject1).field_insertmsg) || (((com.tencent.mm.plugin.aa.a.b.c)localObject1).field_localMsgId <= 0L))
        {
          localObject2 = new com/tencent/mm/storage/bi;
          ((bi)localObject2).<init>();
          ((bi)localObject2).eJ(bf.oC(paramString2));
          ((bi)localObject2).setType(436207665);
          Object localObject3 = r.Yz();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((bi)localObject2).setContent((String)localObject3 + ":\n" + paramString1);
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>();
          localObject1 = com.tencent.mm.a.g.x(bo.anU().getBytes());
          paramString1 = o.ahl().getFullPath((String)localObject1);
          o.ahl();
          localObject1 = com.tencent.mm.at.g.si((String)localObject1);
          localObject3 = o.ahp();
          String str = localb.fhR;
          c.a locala = new com/tencent/mm/at/a/a/c$a;
          locala.<init>();
          locala.ePJ = paramString1;
          locala.ePH = true;
          ((com.tencent.mm.at.a.a)localObject3).a(str, null, locala.ahG());
          ((bi)localObject2).jv((String)localObject1);
          ((bi)localObject2).hO(1);
          ((bi)localObject2).ju(paramString2);
          ((bi)localObject2).setStatus(3);
          ((bi)localObject2).setMsgId(bf.l((bi)localObject2));
          ab.i("MicroMsg.AAUtil", "finish insert aa msg");
          a(localb.fih, true, ((cy)localObject2).field_msgId);
          paramString1 = new com/tencent/mm/af/j;
          paramString1.<init>();
          localb.a(paramString1);
          paramString1.field_msgId = ((cy)localObject2).field_msgId;
          com.tencent.mm.plugin.s.a.bYK().b(paramString1);
        }
        AppMethodBeat.o(40609);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public static void bg(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    while (true)
    {
      Object localObject;
      try
      {
        AppMethodBeat.i(40611);
        if (bo.isNullOrNil(paramString1))
          break label353;
        localObject = j.b.me(paramString1);
        String str;
        if (localObject != null)
        {
          str = ((j.b)localObject).fih;
          ab.d("MicroMsg.AAUtil", "checkIfInsertAAMsg, billNo: %s, appMsgContent: %s", new Object[] { str, paramString1.trim().replace(" ", "") });
          if ((localObject == null) || (bo.isNullOrNil(((j.b)localObject).fih)))
            break label353;
          str = ((j.b)localObject).fih;
          localObject = com.tencent.mm.plugin.aa.b.aod().vH(str);
          if (localObject == null)
          {
            bool2 = true;
            if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg))
              continue;
            if (localObject == null)
              continue;
            l = ((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId;
            ab.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, record==null: %s, billNo: %s, insertMsg: %s, chatroom: %s, localMsgId: %s", new Object[] { Boolean.valueOf(bool2), str, Boolean.valueOf(bool1), paramString2, Long.valueOf(l) });
            if (localObject == null)
            {
              ab.e("MicroMsg.AAUtil", "checkIfInsertAAMsg, record is null, ignore");
              a(str, false, 0L);
            }
            if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg) || (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId <= 0L) || (((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId).field_msgId > 0L))
              continue;
            ab.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, the oldMsgInfo has deleted, ignore this");
            com.tencent.mm.plugin.aa.b.aod().a((com.tencent.mm.plugin.aa.a.b.c)localObject, new String[0]);
            AppMethodBeat.o(40611);
          }
        }
        else
        {
          str = "";
          continue;
        }
        boolean bool2 = false;
        continue;
        bool1 = false;
        continue;
        long l = 0L;
        continue;
        if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg) || (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId <= 0L))
        {
          ab.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, insert new aa msg");
          bf(paramString1, paramString2);
          AppMethodBeat.o(40611);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, update aa msg");
      g(((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId, paramString1);
      label353: AppMethodBeat.o(40611);
    }
  }

  public static long bh(String paramString1, String paramString2)
  {
    AppMethodBeat.i(40621);
    try
    {
      double d1 = bo.getDouble(paramString1, 0.0D);
      double d2 = bo.getDouble(paramString2, 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d1 == 0.0D)
        paramString1 = "0";
      localBigDecimal.<init>(paramString1);
      paramString1 = new java/math/BigDecimal;
      if (d2 == 0.0D)
        paramString2 = "0";
      paramString1.<init>(paramString2);
      l = localBigDecimal.multiply(paramString1).longValue();
      AppMethodBeat.o(40621);
      return l;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AAUtil", paramString1, "", new Object[0]);
        long l = 0L;
        AppMethodBeat.o(40621);
      }
    }
  }

  public static void c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(40613);
      ab.d("MicroMsg.AAUtil", "insertPayMsgAfterPaySucc, launcherUsername: %s, billNo: %s, payMsgId: %s", new Object[] { paramString1, paramString3, paramString4 });
      com.tencent.mm.plugin.aa.a.b.a locala;
      if ((!bo.isNullOrNil(paramString1)) && (!bo.isNullOrNil(paramString3)) && (!bo.isNullOrNil(paramString4)))
      {
        locala = com.tencent.mm.plugin.aa.b.aoe().vG(paramString4);
        if ((locala == null) || (!locala.field_insertmsg))
          break label226;
        ab.i("MicroMsg.AAUtil", "insertPayMsgAfterPaySucc, launcherUsername: %s, chatroom: %s, payMsgId: %s, record: %s, insertmsg: %s", new Object[] { paramString1, paramString2, paramString4, locala, Boolean.valueOf(bool) });
        if ((locala == null) || (!locala.field_insertmsg))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("weixin://weixinnewaa/opendetail?billno=");
          paramString3 = paramString3 + "&launcherusername=" + paramString1;
          if (!bo.isNullOrNil(paramString5))
            break label275;
          ab.i("MicroMsg.AAUtil", "empty msgxml, insert local msgcontent");
          if (!paramString1.equals(r.Yz()))
            break label232;
          paramString5 = ah.getContext().getString(2131301900, new Object[] { paramString3 });
        }
      }
      while (true)
      {
        a(paramString5, paramString2, locala, paramString4);
        AppMethodBeat.o(40613);
        return;
        label226: bool = false;
        break;
        label232: paramString1 = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).getDisplayName(paramString1, paramString2);
        paramString5 = ah.getContext().getString(2131301901, new Object[] { paramString1, paramString3 });
        continue;
        label275: ab.d("MicroMsg.AAUtil", "insert msgxml: %s", new Object[] { paramString5 });
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public static void g(long paramLong, String paramString)
  {
    while (true)
    {
      Object localObject;
      try
      {
        AppMethodBeat.i(40616);
        if ((paramLong <= 0L) || (bo.isNullOrNil(paramString)))
          break label383;
        localObject = j.b.me(paramString);
        if ((localObject == null) || (bo.isNullOrNil(((j.b)localObject).fih)))
          break label355;
        ab.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgId: %s, billNo: %s", new Object[] { Long.valueOf(paramLong), ((j.b)localObject).fih });
        com.tencent.mm.plugin.aa.a.b.c localc = com.tencent.mm.plugin.aa.b.aod().vH(((j.b)localObject).fih);
        if (localc != null)
        {
          long l = localc.field_localMsgId;
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(l);
          if (((cy)localObject).field_msgId > 0L)
          {
            String str = bf.oy(((cy)localObject).field_content);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            ((bi)localObject).setContent(str + ":\n" + paramString);
            ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(l, (bi)localObject);
            ab.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, update success, oldMsgId: %s, billNo: %s", new Object[] { Long.valueOf(l), localc.field_billNo });
            AppMethodBeat.o(40616);
            return;
          }
          ab.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, cannot find old msg, insert new one, billNo: %s, oldMsgId: %s, newMsgId: %s, needUpdateInfo.msgId: %s", new Object[] { localc.field_billNo, Long.valueOf(localc.field_localMsgId), Long.valueOf(paramLong), Long.valueOf(((cy)localObject).field_msgId) });
          AppMethodBeat.o(40616);
          continue;
        }
      }
      finally
      {
      }
      paramString = new com/tencent/mm/plugin/aa/a/b/c;
      paramString.<init>();
      paramString.field_localMsgId = paramLong;
      paramString.field_billNo = ((j.b)localObject).fih;
      paramString.field_insertmsg = true;
      com.tencent.mm.plugin.aa.b.aod().a(paramString);
      ab.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, insert new aa record, msgId: %s, billNo: %s", new Object[] { Long.valueOf(paramLong), ((j.b)localObject).fih });
      AppMethodBeat.o(40616);
      continue;
      label355: ab.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, parse app msg failed, msgId: %s", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(40616);
      continue;
      label383: ab.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgContent is null or msgId invalid, msgId: %s, %s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bo.isNullOrNil(paramString)) });
      AppMethodBeat.o(40616);
    }
  }

  public static void h(long paramLong, String paramString)
  {
    AppMethodBeat.i(40617);
    ab.i("MicroMsg.AAUtil", "do update sys msg, %s, %s", new Object[] { Long.valueOf(paramLong), paramString });
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramLong);
    paramString = vD(paramString);
    if (!bo.isNullOrNil(paramString))
      localbi.setContent(paramString);
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramLong, localbi);
    AppMethodBeat.o(40617);
  }

  // ERROR //
  private static String vD(String paramString)
  {
    // Byte code:
    //   0: ldc_w 533
    //   3: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc_w 535
    //   10: invokestatic 541	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +14 -> 29
    //   18: ldc 50
    //   20: astore_0
    //   21: ldc_w 533
    //   24: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload_0
    //   28: areturn
    //   29: aload_0
    //   30: ldc_w 543
    //   33: invokeinterface 548 2 0
    //   38: checkcast 17	java/lang/String
    //   41: astore_0
    //   42: aload_0
    //   43: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   46: ifeq +23 -> 69
    //   49: ldc 48
    //   51: ldc_w 550
    //   54: invokestatic 302	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: ldc 50
    //   59: astore_0
    //   60: ldc_w 533
    //   63: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: goto -39 -> 27
    //   69: aload_0
    //   70: ldc_w 552
    //   73: invokestatic 557	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   76: astore_0
    //   77: ldc 48
    //   79: ldc_w 559
    //   82: iconst_1
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_0
    //   89: aastore
    //   90: invokestatic 419	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: ldc_w 533
    //   96: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: goto -72 -> 27
    //   102: astore_1
    //   103: ldc 50
    //   105: astore_0
    //   106: ldc 48
    //   108: aload_1
    //   109: invokevirtual 562	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   112: invokestatic 302	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   115: goto -22 -> 93
    //   118: astore_1
    //   119: goto -13 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   69	77	102	java/io/UnsupportedEncodingException
    //   77	93	118	java/io/UnsupportedEncodingException
  }

  public static List<String> vE(String paramString)
  {
    AppMethodBeat.i(40622);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.AAUtil", "illegal chatroomName");
      paramString = new ArrayList();
      AppMethodBeat.o(40622);
    }
    while (true)
    {
      return paramString;
      Object localObject;
      if (!t.kH(paramString))
      {
        localObject = new ArrayList();
        ((List)localObject).add(r.Yz());
        ((List)localObject).add(paramString);
        AppMethodBeat.o(40622);
        paramString = (String)localObject;
      }
      else
      {
        try
        {
          localObject = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oe(paramString);
          paramString = (String)localObject;
          if (localObject == null)
          {
            paramString = new java/util/ArrayList;
            paramString.<init>();
          }
          AppMethodBeat.o(40622);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.AAUtil", "getChatroomMemberList error! %s", new Object[] { paramString.getMessage() });
          paramString = new ArrayList();
          AppMethodBeat.o(40622);
        }
      }
    }
  }

  public static void vF(String paramString)
  {
    AppMethodBeat.i(40624);
    Object localObject = aom();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(",");
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = ((String)localObject).split(",");
      int i = 0;
      int k;
      for (int j = 1; i < localObject.length; j = k)
      {
        String str = localObject[i];
        k = j;
        if (!str.equals(paramString))
        {
          k = j;
          if (j < 5)
          {
            localStringBuilder.append(str);
            localStringBuilder.append(",");
            k = j + 1;
          }
        }
        i++;
      }
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    ab.d("MicroMsg.AAUtil", "recent group: %s", new Object[] { localStringBuilder.toString() });
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSp, localStringBuilder.toString());
    AppMethodBeat.o(40624);
  }

  public static void w(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      AppMethodBeat.i(40612);
      com.tencent.mm.plugin.aa.a.b.c localc = com.tencent.mm.plugin.aa.b.aod().vH(paramString1);
      ab.i("MicroMsg.AAUtil", "setAARecordAfterLaunchAA, billNo: %s, chatroom: %s, msgContent==null:%s, oldRecord: %s", new Object[] { paramString1, paramString2, Boolean.valueOf(bo.isNullOrNil(paramString3)), localc });
      if (localc == null)
        a(paramString1, false, 0L);
      bg(paramString3, paramString2);
      AppMethodBeat.o(40612);
      return;
    }
    finally
    {
    }
    throw paramString1;
  }

  // ERROR //
  public static void x(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 627
    //   6: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   13: ifne +164 -> 177
    //   16: aload_1
    //   17: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   20: ifne +157 -> 177
    //   23: aload_2
    //   24: invokestatic 160	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   27: ifne +150 -> 177
    //   30: ldc 48
    //   32: ldc_w 629
    //   35: iconst_2
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_1
    //   42: aastore
    //   43: dup
    //   44: iconst_1
    //   45: aload_2
    //   46: aastore
    //   47: invokestatic 126	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: invokestatic 149	com/tencent/mm/plugin/aa/b:aoe	()Lcom/tencent/mm/plugin/aa/a/b/b;
    //   53: aload_2
    //   54: invokevirtual 461	com/tencent/mm/plugin/aa/a/b/b:vG	(Ljava/lang/String;)Lcom/tencent/mm/plugin/aa/a/b/a;
    //   57: astore_3
    //   58: aload_3
    //   59: ifnull +10 -> 69
    //   62: aload_3
    //   63: getfield 139	com/tencent/mm/plugin/aa/a/b/a:field_insertmsg	Z
    //   66: ifne +28 -> 94
    //   69: ldc 48
    //   71: ldc_w 631
    //   74: invokestatic 200	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_0
    //   78: aload_1
    //   79: aload_3
    //   80: aload_2
    //   81: invokestatic 488	com/tencent/mm/plugin/aa/a/h:a	(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/aa/a/b/a;Ljava/lang/String;)V
    //   84: ldc_w 627
    //   87: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: ldc 2
    //   92: monitorexit
    //   93: return
    //   94: ldc 99
    //   96: invokestatic 105	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   99: checkcast 99	com/tencent/mm/plugin/messenger/foundation/a/j
    //   102: invokeinterface 109 1 0
    //   107: aload_3
    //   108: getfield 143	com/tencent/mm/plugin/aa/a/b/a:field_msgId	J
    //   111: invokeinterface 427 3 0
    //   116: astore_1
    //   117: ldc 48
    //   119: ldc_w 633
    //   122: iconst_2
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_3
    //   129: getfield 143	com/tencent/mm/plugin/aa/a/b/a:field_msgId	J
    //   132: invokestatic 123	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   135: aastore
    //   136: dup
    //   137: iconst_1
    //   138: aload_1
    //   139: getfield 387	com/tencent/mm/g/c/cy:field_msgId	J
    //   142: invokestatic 123	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   145: aastore
    //   146: invokestatic 126	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_1
    //   150: aload_0
    //   151: invokevirtual 76	com/tencent/mm/storage/bi:setContent	(Ljava/lang/String;)V
    //   154: ldc 99
    //   156: invokestatic 105	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   159: checkcast 99	com/tencent/mm/plugin/messenger/foundation/a/j
    //   162: invokeinterface 109 1 0
    //   167: aload_3
    //   168: getfield 143	com/tencent/mm/plugin/aa/a/b/a:field_msgId	J
    //   171: aload_1
    //   172: invokeinterface 509 4 0
    //   177: ldc_w 627
    //   180: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: goto -93 -> 90
    //   186: astore_0
    //   187: ldc 2
    //   189: monitorexit
    //   190: aload_0
    //   191: athrow
    //   192: astore_0
    //   193: ldc 48
    //   195: ldc_w 635
    //   198: iconst_1
    //   199: anewarray 4	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: aload_0
    //   205: invokevirtual 594	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   208: aastore
    //   209: invokestatic 515	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: ldc_w 627
    //   215: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   218: goto -128 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   3	9	186	finally
    //   9	58	186	finally
    //   62	69	186	finally
    //   69	90	186	finally
    //   94	177	186	finally
    //   177	183	186	finally
    //   193	218	186	finally
    //   9	58	192	java/lang/Exception
    //   62	69	192	java/lang/Exception
    //   69	90	192	java/lang/Exception
    //   94	177	192	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.h
 * JD-Core Version:    0.6.2
 */