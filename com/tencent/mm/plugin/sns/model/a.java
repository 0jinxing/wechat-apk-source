package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bpx;
import com.tencent.mm.protocal.protobuf.brf;
import com.tencent.mm.protocal.protobuf.bs;
import com.tencent.mm.protocal.protobuf.cai;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbt;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cdh;
import com.tencent.mm.protocal.protobuf.cy;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private static final String qHv;
  private static LinkedHashMap<Long, Integer> qHw;
  private static Comparator<cat> qHx;

  static
  {
    AppMethodBeat.i(36096);
    StringBuilder localStringBuilder = new StringBuilder();
    g.RQ();
    qHv = g.RP().cachePath + "sns_recvd_ad";
    qHx = new a.1();
    AppMethodBeat.o(36096);
  }

  public static void XB(String paramString)
  {
    AppMethodBeat.i(36087);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(36087);
    while (true)
    {
      return;
      d.post(new a.4(paramString), "preDownloadAdLandingPagesForMsg");
      AppMethodBeat.o(36087);
    }
  }

  private static int a(cbf paramcbf)
  {
    AppMethodBeat.i(36088);
    n localn = af.cnF().kD(paramcbf.vQE);
    int i;
    if (localn == null)
    {
      i = paramcbf.pcX;
      AppMethodBeat.o(36088);
    }
    while (true)
    {
      return i;
      i = localn.field_createTime;
      AppMethodBeat.o(36088);
    }
  }

  private static cy a(bpx parambpx)
  {
    Object localObject = null;
    AppMethodBeat.i(36076);
    cy localcy;
    if (parambpx != null)
    {
      localcy = new cy();
      localcy.vEY = parambpx.wSg;
      if (localcy.vEY == null)
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "recObject.RecommendInfo is null");
        AppMethodBeat.o(36076);
        parambpx = localObject;
      }
    }
    while (true)
    {
      return parambpx;
      localcy.vEX = b(parambpx.wSf);
      AppMethodBeat.o(36076);
      parambpx = localcy;
      continue;
      AppMethodBeat.o(36076);
      parambpx = localObject;
    }
  }

  // ERROR //
  private static String a(String paramString, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    // Byte code:
    //   0: ldc 152
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnull +7 -> 13
    //   9: aload_0
    //   10: ifnonnull +17 -> 27
    //   13: ldc 129
    //   15: ldc 154
    //   17: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: ldc 152
    //   22: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_0
    //   26: areturn
    //   27: new 156	com/tencent/mm/protocal/protobuf/z
    //   30: astore_2
    //   31: aload_2
    //   32: invokespecial 157	com/tencent/mm/protocal/protobuf/z:<init>	()V
    //   35: aload_2
    //   36: aload_1
    //   37: invokevirtual 163	com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t:getBufferToBytes	()[B
    //   40: invokevirtual 167	com/tencent/mm/protocal/protobuf/z:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   43: pop
    //   44: aload_2
    //   45: getfield 171	com/tencent/mm/protocal/protobuf/z:vAH	Ljava/util/LinkedList;
    //   48: ifnull +329 -> 377
    //   51: ldc 173
    //   53: astore_3
    //   54: aload_2
    //   55: getfield 171	com/tencent/mm/protocal/protobuf/z:vAH	Ljava/util/LinkedList;
    //   58: invokevirtual 179	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   61: astore 4
    //   63: aload_0
    //   64: astore_1
    //   65: aload_1
    //   66: astore_2
    //   67: aload 4
    //   69: invokeinterface 185 1 0
    //   74: ifeq +221 -> 295
    //   77: aload_1
    //   78: astore_2
    //   79: aload 4
    //   81: invokeinterface 189 1 0
    //   86: checkcast 191	com/tencent/mm/protocal/protobuf/cal
    //   89: astore 5
    //   91: aload_1
    //   92: astore_2
    //   93: aload 5
    //   95: getfield 194	com/tencent/mm/protocal/protobuf/cal:key	Ljava/lang/String;
    //   98: ifnull +276 -> 374
    //   101: aload_1
    //   102: astore_2
    //   103: ldc 196
    //   105: iconst_1
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload 5
    //   113: getfield 194	com/tencent/mm/protocal/protobuf/cal:key	Ljava/lang/String;
    //   116: aastore
    //   117: invokestatic 202	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   120: astore 6
    //   122: aload_1
    //   123: astore_2
    //   124: aload 6
    //   126: invokestatic 208	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   129: aload_1
    //   130: invokevirtual 212	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   133: astore 7
    //   135: aload_1
    //   136: astore_2
    //   137: aload 7
    //   139: invokevirtual 217	java/util/regex/Matcher:find	()Z
    //   142: ifeq +232 -> 374
    //   145: aload_1
    //   146: astore_2
    //   147: aload 7
    //   149: iconst_2
    //   150: invokevirtual 221	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   153: astore 8
    //   155: aload 8
    //   157: ifnull +217 -> 374
    //   160: aload_1
    //   161: astore_2
    //   162: aload 8
    //   164: invokevirtual 225	java/lang/String:length	()I
    //   167: ifle +207 -> 374
    //   170: aload_1
    //   171: astore_2
    //   172: new 23	java/lang/StringBuilder
    //   175: astore 7
    //   177: aload_1
    //   178: astore_2
    //   179: aload 7
    //   181: invokespecial 26	java/lang/StringBuilder:<init>	()V
    //   184: aload_1
    //   185: astore_2
    //   186: aload_1
    //   187: aload 7
    //   189: aload 6
    //   191: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc 227
    //   196: iconst_1
    //   197: anewarray 4	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: aload 8
    //   204: aastore
    //   205: invokestatic 202	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   208: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: ldc 229
    //   216: iconst_2
    //   217: anewarray 4	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload 5
    //   224: getfield 232	com/tencent/mm/protocal/protobuf/cal:value	Ljava/lang/String;
    //   227: aastore
    //   228: dup
    //   229: iconst_1
    //   230: aload 8
    //   232: aastore
    //   233: invokestatic 202	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   236: invokevirtual 236	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   239: astore_1
    //   240: aload_1
    //   241: astore_2
    //   242: new 23	java/lang/StringBuilder
    //   245: astore 6
    //   247: aload_1
    //   248: astore_2
    //   249: aload 6
    //   251: invokespecial 26	java/lang/StringBuilder:<init>	()V
    //   254: aload_1
    //   255: astore_2
    //   256: aload 6
    //   258: aload_3
    //   259: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload 5
    //   264: getfield 194	com/tencent/mm/protocal/protobuf/cal:key	Ljava/lang/String;
    //   267: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: ldc 238
    //   272: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload 5
    //   277: getfield 232	com/tencent/mm/protocal/protobuf/cal:value	Ljava/lang/String;
    //   280: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: ldc 240
    //   285: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: astore_3
    //   292: goto -227 -> 65
    //   295: aload_1
    //   296: astore_2
    //   297: ldc 129
    //   299: ldc 242
    //   301: iconst_1
    //   302: anewarray 4	java/lang/Object
    //   305: dup
    //   306: iconst_0
    //   307: aload_3
    //   308: aastore
    //   309: invokestatic 245	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload_1
    //   313: astore_3
    //   314: aload_1
    //   315: astore_2
    //   316: aload_0
    //   317: ldc 247
    //   319: invokestatic 253	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   322: ifnonnull +36 -> 358
    //   325: aload_1
    //   326: astore_2
    //   327: ldc 129
    //   329: ldc 255
    //   331: invokestatic 258	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   334: ldc 152
    //   336: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   339: goto -314 -> 25
    //   342: astore_1
    //   343: aload_0
    //   344: astore_3
    //   345: ldc 129
    //   347: aload_1
    //   348: ldc_w 260
    //   351: iconst_0
    //   352: anewarray 4	java/lang/Object
    //   355: invokestatic 264	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: ldc 152
    //   360: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: aload_3
    //   364: astore_0
    //   365: goto -340 -> 25
    //   368: astore_1
    //   369: aload_2
    //   370: astore_3
    //   371: goto -26 -> 345
    //   374: goto -82 -> 292
    //   377: aload_0
    //   378: astore_3
    //   379: goto -21 -> 358
    //
    // Exception table:
    //   from	to	target	type
    //   27	51	342	java/lang/Exception
    //   54	63	342	java/lang/Exception
    //   67	77	368	java/lang/Exception
    //   79	91	368	java/lang/Exception
    //   93	101	368	java/lang/Exception
    //   103	122	368	java/lang/Exception
    //   124	135	368	java/lang/Exception
    //   137	145	368	java/lang/Exception
    //   147	155	368	java/lang/Exception
    //   162	170	368	java/lang/Exception
    //   172	177	368	java/lang/Exception
    //   179	184	368	java/lang/Exception
    //   186	240	368	java/lang/Exception
    //   242	247	368	java/lang/Exception
    //   249	254	368	java/lang/Exception
    //   256	292	368	java/lang/Exception
    //   297	312	368	java/lang/Exception
    //   316	325	368	java/lang/Exception
    //   327	334	368	java/lang/Exception
  }

  private static void a(long paramLong, com.tencent.mm.plugin.sns.storage.a parama)
  {
    AppMethodBeat.i(36082);
    if ((!parama.qTV) || (bo.isNullOrNil(parama.qTU)))
      AppMethodBeat.o(36082);
    while (true)
    {
      return;
      parama = new m(paramLong, 1, parama.qTU);
      g.RQ();
      g.RO().eJo.a(parama, 0);
      AppMethodBeat.o(36082);
    }
  }

  public static void a(cai paramcai)
  {
    AppMethodBeat.i(36068);
    if (paramcai == null)
    {
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      AppMethodBeat.o(36068);
    }
    while (true)
    {
      return;
      if (paramcai.wZu == null)
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
        AppMethodBeat.o(36068);
      }
      else
      {
        com.tencent.mm.plugin.sns.storage.e locale = b(paramcai);
        af.cnI().a(paramcai.wZu.vQE, locale);
        AppMethodBeat.o(36068);
      }
    }
  }

  public static void a(cai paramcai, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    AppMethodBeat.i(36066);
    if (paramcai == null)
    {
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      AppMethodBeat.o(36066);
    }
    while (true)
    {
      return;
      if (paramcai.wZu == null)
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
        AppMethodBeat.o(36066);
      }
      else
      {
        com.tencent.mm.plugin.sns.storage.e locale = b(paramcai);
        if (locale == null)
        {
          AppMethodBeat.o(36066);
        }
        else
        {
          locale.field_adinfo = a(locale.field_adinfo, paramSKBuiltinBuffer_t);
          if (af.cnI().kv(paramcai.wZu.vQE))
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "find this adobj and update" + paramcai.wZu.vQE);
            af.cnI().b(paramcai.wZu.vQE, locale);
            AppMethodBeat.o(36066);
          }
          else
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "local can not find this adobj " + paramcai.wZu.vQE);
            AppMethodBeat.o(36066);
          }
        }
      }
    }
  }

  public static void a(cbt paramcbt)
  {
    AppMethodBeat.i(36067);
    a(b(paramcbt));
    AppMethodBeat.o(36067);
  }

  public static void a(cy paramcy)
  {
    AppMethodBeat.i(36069);
    if (paramcy == null)
    {
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject null");
      AppMethodBeat.o(36069);
    }
    while (true)
    {
      return;
      if (paramcy.vEX == null)
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject is null");
        AppMethodBeat.o(36069);
      }
      else
      {
        if (paramcy.vEX.wZu != null)
          break;
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "advertiseObject.SnsADObject.SnsObject is null");
        AppMethodBeat.o(36069);
      }
    }
    Object localObject;
    if (!af.cnI().kv(paramcy.vEX.wZu.vQE))
    {
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "insert at adObject");
      int i = (int)(System.currentTimeMillis() / 1000L);
      if (paramcy.vEX.wZu.xas > 0)
        i = ((cat)paramcy.vEX.wZu.xat.get(0)).pcX;
      a(paramcy, i, i);
      localObject = af.cnI().ku(paramcy.vEX.wZu.vQE);
      if (localObject != null)
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "set at ad invisible");
        ((com.tencent.mm.plugin.sns.storage.e)localObject).field_localFlag |= 256;
        af.cnI().a(((com.tencent.mm.plugin.sns.storage.e)localObject).field_snsId, (com.tencent.mm.plugin.sns.storage.e)localObject);
      }
    }
    while (true)
    {
      com.tencent.mm.plugin.sns.storage.e locale = af.cnI().ku(paramcy.vEX.wZu.vQE);
      if (locale != null)
      {
        locale.field_atAdinfo = aa.a(paramcy.vEY);
        bs localbs = locale.cqv();
        localObject = localbs;
        if (localbs == null)
          localObject = new bs();
        ((bs)localObject).vDZ = paramcy.vFa;
        if (((bs)localObject).vDZ != null)
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "update atFriend remindInfo, aid %d", new Object[] { Integer.valueOf(((bs)localObject).vDZ.wTz) });
        locale.a((bs)localObject);
        af.cnI().a(locale.field_snsId, locale);
      }
      AppMethodBeat.o(36069);
      break;
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "just update at SnsAdObject");
      a(paramcy.vEX);
    }
  }

  private static void a(cy paramcy, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36074);
    if (paramcy == null)
    {
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
      AppMethodBeat.o(36074);
    }
    while (true)
    {
      return;
      if ((paramcy.vEX == null) || (paramcy.vEX.wZu == null))
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "error adobj");
        AppMethodBeat.o(36074);
      }
      else
      {
        cbf localcbf = paramcy.vEX.wZu;
        com.tencent.mm.plugin.sns.storage.e locale = b(paramcy.vEX);
        if (locale == null)
        {
          ab.w("MicroMsg.AdSnsInfoStorageLogic", "adSnsInfo is null!");
          AppMethodBeat.o(36074);
        }
        else
        {
          Object localObject = new com.tencent.mm.plugin.sns.storage.a(aa.a(paramcy.vEY));
          TimeLineObject localTimeLineObject = locale.cqu();
          cdg localcdg = new cdg();
          localcdg.xcS = new cdh();
          localcdg.xcS.xcW = ((com.tencent.mm.plugin.sns.storage.a)localObject).qPj;
          localcdg.xcS.xcV = localTimeLineObject.Id;
          localcdg.xcS.cvd = locale.getSource();
          localcdg.xcS.reJ = com.tencent.mm.modelstat.p.a(localcdg.xcS);
          if (localTimeLineObject.xfI.wbJ == 1)
          {
            localcdg.xcS.qUe = 1;
            label218: localcdg.xcS.xcX = locale.cqt();
          }
          try
          {
            localObject = Base64.encodeToString(localcdg.toByteArray(), 0).replace("\n", "");
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "replace newly add snsId:%s, statExtStr:%s(id=%s,uxInfo=%s)", new Object[] { localTimeLineObject.Id, localObject, localcdg.xcS.xcV, localcdg.xcS.xcW });
            localTimeLineObject.rjC = ((String)localObject);
            locale.c(localTimeLineObject);
            if (locale == null)
            {
              AppMethodBeat.o(36074);
              continue;
              if (localTimeLineObject.xfI.wbJ == 15)
              {
                localcdg.xcS.qUe = 2;
                break label218;
              }
              localcdg.xcS.qUe = 0;
            }
          }
          catch (IOException localIOException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", localIOException, "", new Object[0]);
            locale.field_createTime = paramInt1;
            locale.field_createAdTime = paramInt2;
            String str = aa.a(paramcy.vEX.wZv);
            if (!bo.isNullOrNil(str))
              locale.field_recxml = str;
            locale.field_adinfo = aa.a(paramcy.vEY);
            locale.field_adxml = locale.field_recxml;
            af.cnI().a(localcbf.vQE, locale);
            AppMethodBeat.o(36074);
          }
        }
      }
    }
  }

  public static boolean a(long paramLong, cao paramcao)
  {
    AppMethodBeat.i(36090);
    can localcan = paramcao.wZN;
    boolean bool;
    if ((localcan.jCt != 7) && (localcan.jCt != 8) && (localcan.jCt != 16))
    {
      AppMethodBeat.o(36090);
      bool = false;
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.sns.storage.e locale = af.cnI().ku(paramLong);
      if (locale == null)
      {
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "pass the action because the snsinfo is null ".concat(String.valueOf(paramLong)));
        AppMethodBeat.o(36090);
        bool = false;
        continue;
      }
      try
      {
        cbf localcbf = new com/tencent/mm/protocal/protobuf/cbf;
        localcbf.<init>();
        localcbf = (cbf)localcbf.parseFrom(locale.field_attrBuf);
        localcbf.vQE = paramLong;
        Iterator localIterator;
        cat localcat;
        if (localcan.jCt == 7)
        {
          localIterator = localcbf.xaq.iterator();
          while (true)
            if (localIterator.hasNext())
            {
              localcat = (cat)localIterator.next();
              if ((localcat.pcX == localcan.pcX) && (localcat.vHl.equals(localcan.wPm)))
              {
                paramcao = new java/lang/StringBuilder;
                paramcao.<init>("like create time ");
                ab.i("MicroMsg.AdSnsInfoStorageLogic", localcat.pcX + " ");
                AppMethodBeat.o(36090);
                bool = false;
                break;
              }
            }
          localcbf.xaq.add(ad.b(paramcao));
        }
        while (true)
        {
          locale.bi(localcbf.toByteArray());
          af.cnI().a(localcbf.vQE, locale);
          bool = true;
          AppMethodBeat.o(36090);
          break;
          if ((localcan.jCt == 8) || (localcan.jCt == 16))
          {
            localIterator = localcbf.xat.iterator();
            while (true)
              if (localIterator.hasNext())
              {
                localcat = (cat)localIterator.next();
                if ((localcat.pcX == localcan.pcX) && (localcat.vHl.equals(localcan.wPm)))
                {
                  paramcao = new java/lang/StringBuilder;
                  paramcao.<init>("like create time ");
                  ab.i("MicroMsg.AdSnsInfoStorageLogic", localcat.pcX + " ");
                  AppMethodBeat.o(36090);
                  bool = false;
                  break;
                }
              }
            localcbf.xat.add(ad.b(paramcao));
          }
        }
      }
      catch (Exception paramcao)
      {
        while (true)
        {
          ab.e("MicroMsg.AdSnsInfoStorageLogic", "e " + paramcao.getMessage());
          ab.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramcao, "", new Object[0]);
        }
      }
    }
  }

  public static boolean a(long paramLong, cao paramcao, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(36089);
    Object localObject1;
    if (paramcao != null)
    {
      localObject1 = paramcao.wZN;
      if ((((can)localObject1).jCt != 7) && (((can)localObject1).jCt != 8) && (((can)localObject1).jCt != 16))
      {
        paramBoolean = false;
        AppMethodBeat.o(36089);
      }
    }
    Object localObject2;
    Object localObject3;
    while (true)
    {
      return paramBoolean;
      localObject2 = r.Yz();
      if ((paramcao != null) && (paramcao.wZO != null) && (paramcao.wZO.wPm != null) && (paramcao.wZO.wPm.equals(localObject2)))
      {
        paramBoolean = true;
        AppMethodBeat.o(36089);
      }
      else
      {
        localObject3 = af.cnI().ku(paramLong);
        if (localObject3 != null)
          break;
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "AdSnsInfo of %s is not exist!", new Object[] { Long.valueOf(paramLong) });
        paramBoolean = false;
        AppMethodBeat.o(36089);
      }
    }
    int i;
    long l;
    while (true)
    {
      try
      {
        localObject1 = new com/tencent/mm/protocal/protobuf/cbf;
        ((cbf)localObject1).<init>();
        localObject1 = (cbf)((cbf)localObject1).parseFrom(((com.tencent.mm.plugin.sns.storage.e)localObject3).field_attrBuf);
        ((cbf)localObject1).vQE = paramLong;
        i = ((com.tencent.mm.plugin.sns.storage.e)localObject3).field_firstControlTime;
        paramcao = paramcao.wZN;
        if (paramcao.jCt != 7)
          break label538;
        if ((paramInt2 <= 0) || (i + paramInt2 >= paramcao.pcX))
          break label861;
        if (paramBoolean)
        {
          if (af.cnF().YS(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqA()) == null)
            break label527;
          localObject4 = ((com.tencent.mm.plugin.sns.storage.e)localObject3).cqq();
          if (localObject4 == null)
            continue;
          localObject2 = (com.tencent.mm.plugin.sns.b.c)g.K(com.tencent.mm.plugin.sns.b.c.class);
          j = ((com.tencent.mm.plugin.sns.storage.e)localObject3).getSource();
          l = v.Zm(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqA());
          localObject3 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).hnw;
          if (((cbf)localObject1).xaq != null)
          {
            paramInt1 = ((cbf)localObject1).xaq.size();
            if (((cbf)localObject1).xat == null)
              continue;
            paramInt3 = ((cbf)localObject1).xat.size();
            ((com.tencent.mm.plugin.sns.b.c)localObject2).a(13182, j, new Object[] { Long.valueOf(l), localObject3, Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
          }
        }
        else
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("snsid ");
          ab.i("MicroMsg.AdSnsInfoStorageLogic", paramLong + " firstCreateTime " + i + " actionLikeTimeLimit: " + paramInt2 + " curAction.createTime: " + paramcao.pcX + "is over the time limit!");
          paramBoolean = false;
          AppMethodBeat.o(36089);
          break;
        }
        paramInt1 = 0;
        continue;
        paramInt3 = 0;
        continue;
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        continue;
      }
      catch (Exception paramcao)
      {
        ab.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramcao, "", new Object[0]);
      }
      label515: paramBoolean = true;
      AppMethodBeat.o(36089);
      break;
      label527: ab.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
    }
    label538: if (((paramcao.jCt == 8) || (paramcao.jCt == 16)) && (paramInt3 > 0) && (i + paramInt3 < paramcao.pcX))
    {
      if (paramBoolean)
      {
        if (af.cnF().YS(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqA()) == null)
          break label850;
        localObject4 = ((com.tencent.mm.plugin.sns.storage.e)localObject3).cqq();
        if (localObject4 == null)
          break label839;
        localObject2 = (com.tencent.mm.plugin.sns.b.c)g.K(com.tencent.mm.plugin.sns.b.c.class);
        j = ((com.tencent.mm.plugin.sns.storage.e)localObject3).getSource();
        l = v.Zm(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqA());
        localObject3 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).hnw;
        if (((cbf)localObject1).xaq == null)
          break label828;
        paramInt1 = ((cbf)localObject1).xaq.size();
        if (((cbf)localObject1).xat == null)
          break label833;
        paramInt2 = ((cbf)localObject1).xat.size();
        label674: ((com.tencent.mm.plugin.sns.b.c)localObject2).a(13182, j, new Object[] { Long.valueOf(l), localObject3, Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
      }
      while (true)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("snsid ");
        ab.i("MicroMsg.AdSnsInfoStorageLogic", paramLong + " firstCreateTime " + i + " actionCommentTimeLimit: " + paramInt3 + " curAction.createTime: " + paramcao.pcX + "is over the time limit!");
        paramBoolean = false;
        AppMethodBeat.o(36089);
        break;
        label828: paramInt1 = 0;
        break label656;
        label833: paramInt2 = 0;
        break label674;
        label839: ab.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
        continue;
        label850: ab.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
      }
    }
    label656: label861: int j = 0;
    Object localObject4 = ((cbf)localObject1).xaq.iterator();
    label874: if (((Iterator)localObject4).hasNext())
    {
      paramcao = (cat)((Iterator)localObject4).next();
      if ((paramcao.pcX <= i) || ((paramcao != null) && (paramcao.vHl != null) && (paramcao.vHl.equals(localObject2))))
        break label1310;
      j++;
    }
    label1172: label1307: label1310: 
    while (true)
    {
      break label874;
      int k = 0;
      paramcao = ((cbf)localObject1).xat.iterator();
      label945: if (paramcao.hasNext())
      {
        localObject4 = (cat)paramcao.next();
        if ((((cat)localObject4).pcX <= i) || ((localObject4 != null) && (((cat)localObject4).vHl != null) && (((cat)localObject4).vHl.equals(localObject2))))
          break label1307;
        k++;
      }
      while (true)
      {
        break label945;
        j = j + 0 + k;
        paramcao = new java/lang/StringBuilder;
        paramcao.<init>("totalsize ");
        ab.i("MicroMsg.AdSnsInfoStorageLogic", j + " firstCreateTime " + i + " actionLimit: " + paramInt1 + " actionLikeTimeLimit: " + paramInt2 + " actionCommentTimeLimit: " + paramInt3);
        if (j < paramInt1)
          break label515;
        if (paramBoolean)
        {
          paramcao = af.cnF().YS(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqA());
          if (paramcao == null)
            break label1296;
          localObject2 = paramcao.cqq();
          if (localObject2 == null)
            break label1285;
          paramcao = (com.tencent.mm.plugin.sns.b.c)g.K(com.tencent.mm.plugin.sns.b.c.class);
          paramInt3 = ((com.tencent.mm.plugin.sns.storage.e)localObject3).getSource();
          paramLong = v.Zm(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqA());
          localObject3 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).hnw;
          if (((cbf)localObject1).xaq == null)
            break label1274;
          paramInt1 = ((cbf)localObject1).xaq.size();
          if (((cbf)localObject1).xat == null)
            break label1279;
          paramInt2 = ((cbf)localObject1).xat.size();
          label1190: paramcao.a(13182, paramInt3, new Object[] { Long.valueOf(paramLong), localObject3, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)) });
        }
        while (true)
        {
          paramBoolean = false;
          AppMethodBeat.o(36089);
          break;
          label1274: paramInt1 = 0;
          break label1172;
          label1279: paramInt2 = 0;
          break label1190;
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the adinfo is null!");
          continue;
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "when report ad time limit,the snsInfo is null!");
        }
      }
    }
  }

  private static boolean a(cat paramcat, List<cat> paramList)
  {
    AppMethodBeat.i(36072);
    Iterator localIterator = paramList.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      paramList = (cat)localIterator.next();
      if ((!bo.isNullOrNil(paramcat.vHl)) && (paramcat.vHl.equals(paramList.vHl)))
      {
        bool = true;
        AppMethodBeat.o(36072);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36072);
    }
  }

  private static LinkedList<cy> am(LinkedList<bpx> paramLinkedList)
  {
    AppMethodBeat.i(36079);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = a((bpx)localIterator.next());
      if (paramLinkedList != null)
        localLinkedList.add(paramLinkedList);
    }
    AppMethodBeat.o(36079);
    return localLinkedList;
  }

  public static void an(LinkedList<bpx> paramLinkedList)
  {
    AppMethodBeat.i(36083);
    if ((paramLinkedList != null) && (!paramLinkedList.isEmpty()))
    {
      paramLinkedList = am(paramLinkedList);
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      ao(paramLinkedList);
    }
    AppMethodBeat.o(36083);
  }

  public static void ao(LinkedList<cy> paramLinkedList)
  {
    AppMethodBeat.i(36084);
    if (paramLinkedList == null)
      AppMethodBeat.o(36084);
    while (true)
    {
      return;
      for (int i = 0; i < paramLinkedList.size(); i++)
        b((cy)paramLinkedList.get(i));
      AppMethodBeat.o(36084);
    }
  }

  public static void ap(LinkedList<cbf> paramLinkedList)
  {
    AppMethodBeat.i(36086);
    if (paramLinkedList == null)
      AppMethodBeat.o(36086);
    while (true)
    {
      return;
      o localo = af.cnF();
      for (int i = 0; i < paramLinkedList.size(); i++)
      {
        Object localObject = (cbf)paramLinkedList.get(i);
        if (localObject != null)
        {
          localObject = localo.kD(((cbf)localObject).vQE);
          if (localObject != null)
          {
            localObject = ((n)localObject).cqu();
            if ((localObject != null) && (!bo.isNullOrNil(((TimeLineObject)localObject).rCK)))
              d.post(new a.3((TimeLineObject)localObject), "preDownloadAdLandingPagesForSnsObject");
          }
        }
      }
      AppMethodBeat.o(36086);
    }
  }

  private static com.tencent.mm.plugin.sns.storage.e b(cai paramcai)
  {
    AppMethodBeat.i(36071);
    com.tencent.mm.plugin.sns.storage.e locale = af.cnI().ku(paramcai.wZu.vQE);
    cbf localcbf = paramcai.wZu;
    Object localObject1 = null;
    Object localObject2;
    if (locale == null)
    {
      locale = new com.tencent.mm.plugin.sns.storage.e();
      localObject2 = aa.b(localcbf.xam);
      if (!bo.isNullOrNil((String)localObject2))
        break label77;
      locale = null;
      AppMethodBeat.o(36071);
    }
    label663: 
    while (true)
    {
      return locale;
      localObject1 = locale.cqu().rjC;
      break;
      label77: if (!locale.YR((String)localObject2))
      {
        locale = null;
        AppMethodBeat.o(36071);
      }
      else
      {
        if (!bo.isNullOrNil((String)localObject1))
        {
          localObject2 = locale.cqu();
          ((TimeLineObject)localObject2).rjC = ((String)localObject1);
          locale.c((TimeLineObject)localObject2);
        }
        localcbf.xaD = aj.b(localcbf.xaD, locale.field_attrBuf);
        ab.d("MicroMsg.AdSnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(localcbf.vQE) });
        localcbf.xam.setBuffer(new byte[0]);
        locale.field_userName = localcbf.vHl;
        if (paramcai.wZv != null)
        {
          paramcai = aa.a(paramcai.wZv);
          if (!bo.isNullOrNil(paramcai))
            locale.field_recxml = paramcai;
          paramcai = locale.field_recxml;
          if ((!bo.isNullOrNil(paramcai)) && (!paramcai.equals(locale.field_adxml)))
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "update field adxml ".concat(String.valueOf(paramcai)));
            locale.field_adxml = paramcai;
          }
        }
        locale.field_likeFlag = localcbf.xan;
        long l = localcbf.vQE;
        locale.field_snsId = l;
        if (l != 0L)
        {
          locale.field_stringSeq = com.tencent.mm.plugin.sns.data.i.jV(l);
          locale.field_stringSeq = com.tencent.mm.plugin.sns.data.i.Xl(locale.field_stringSeq);
          ab.d("MicroMsg.AdSnsInfo", l + " stringSeq " + locale.field_stringSeq);
        }
        locale.DF(2);
        locale.DF(32);
        try
        {
          if (locale.field_attrBuf == null)
          {
            paramcai = new com/tencent/mm/protocal/protobuf/cbf;
            paramcai.<init>();
            if ((paramcai == null) || (paramcai.xat == null))
              break label874;
            localObject1 = new java/util/LinkedList;
            ((LinkedList)localObject1).<init>();
            localObject2 = localcbf.xat.iterator();
            while (true)
            {
              if (!((Iterator)localObject2).hasNext())
                break label663;
              localObject3 = (cat)((Iterator)localObject2).next();
              if (((cat)localObject3).wGu > 0)
              {
                ((List)localObject1).add(localObject3);
                localIterator = paramcai.xat.iterator();
                if (localIterator.hasNext())
                {
                  localcat = (cat)localIterator.next();
                  if (localcat.wZJ != ((cat)localObject3).wZJ)
                    break;
                  paramcai.xat.remove(localcat);
                }
              }
            }
          }
        }
        catch (Exception paramcai)
        {
          while (true)
          {
            Object localObject3;
            Iterator localIterator;
            cat localcat;
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "error " + paramcai.getMessage());
            ab.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramcai, "", new Object[0]);
            try
            {
              while (true)
              {
                locale.bi(localcbf.toByteArray());
                paramcai = locale.cqu();
                paramcai.jBB = localcbf.vHl;
                locale.field_pravited = paramcai.wEJ;
                ab.d("MicroMsg.AdSnsInfoStorageLogic", "ext flag " + localcbf.wGz + " " + localcbf.xat.size() + " " + localcbf.xaq.size());
                localObject1 = paramcai.xfI.wbK.iterator();
                while (((Iterator)localObject1).hasNext())
                  ((bau)((Iterator)localObject1).next()).qFG = true;
                paramcai = new com/tencent/mm/protocal/protobuf/cbf;
                paramcai.<init>();
                paramcai = (cbf)paramcai.parseFrom(locale.field_attrBuf);
                break;
                localObject2 = ((List)localObject1).iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  localObject3 = (cat)((Iterator)localObject2).next();
                  localcbf.xat.remove(localObject3);
                }
                ((List)localObject1).clear();
                localObject1 = paramcai.xat.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (cat)((Iterator)localObject1).next();
                  if ((!b((cat)localObject2, localcbf.xat)) && (((cat)localObject2).wZJ != 0L))
                  {
                    g.RQ();
                    localObject3 = ((j)g.K(j.class)).XM().aoO(((cat)localObject2).vHl);
                    if ((localObject3 != null) && (com.tencent.mm.n.a.jh(((ap)localObject3).field_type)) && (!((com.tencent.mm.storage.ad)localObject3).Oa()))
                    {
                      localcbf.xat.add(localObject2);
                      localcbf.xas = localcbf.xat.size();
                    }
                    else
                    {
                      localObject3 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject3).<init>("not in ommentlist not mycontact ");
                      ab.i("MicroMsg.AdSnsInfoStorageLogic", ((cat)localObject2).vHl);
                    }
                  }
                }
                label874: Collections.sort(localcbf.xat, qHx);
                if (localcbf.xaq != null)
                {
                  localObject1 = new java/util/LinkedList;
                  ((LinkedList)localObject1).<init>();
                  localIterator = localcbf.xaq.iterator();
                  while (true)
                  {
                    if (!localIterator.hasNext())
                      break label1018;
                    localcat = (cat)localIterator.next();
                    if (localcat.wGu > 0)
                    {
                      ((List)localObject1).add(localcat);
                      localObject3 = paramcai.xaq.iterator();
                      if (((Iterator)localObject3).hasNext())
                      {
                        localObject2 = (cat)((Iterator)localObject3).next();
                        if ((!bo.isNullOrNil(((cat)localObject2).vHl)) && (!((cat)localObject2).vHl.equals(localcat.vHl)))
                          break;
                        paramcai.xaq.remove(localObject2);
                      }
                    }
                  }
                  label1018: localObject2 = ((List)localObject1).iterator();
                  while (((Iterator)localObject2).hasNext())
                  {
                    localObject3 = (cat)((Iterator)localObject2).next();
                    localcbf.xaq.remove(localObject3);
                  }
                  ((List)localObject1).clear();
                  if ((paramcai != null) && (paramcai.xaq != null))
                  {
                    paramcai = paramcai.xaq.iterator();
                    while (paramcai.hasNext())
                    {
                      localObject1 = (cat)paramcai.next();
                      if (!a((cat)localObject1, localcbf.xaq))
                      {
                        g.RQ();
                        localObject2 = ((j)g.K(j.class)).XM().aoO(((cat)localObject1).vHl);
                        if ((localObject2 != null) && (com.tencent.mm.n.a.jh(((ap)localObject2).field_type)) && (!((com.tencent.mm.storage.ad)localObject2).Oa()))
                        {
                          localcbf.xaq.add(localObject1);
                          localcbf.xap = localcbf.xaq.size();
                        }
                        else
                        {
                          localObject2 = new java/lang/StringBuilder;
                          ((StringBuilder)localObject2).<init>("not in likelist not mycontact ");
                          ab.i("MicroMsg.AdSnsInfoStorageLogic", ((cat)localObject1).vHl);
                        }
                      }
                    }
                  }
                  Collections.sort(localcbf.xaq, qHx);
                }
              }
            }
            catch (Exception paramcai)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.AdSnsInfoStorageLogic", paramcai, "", new Object[0]);
              locale.c(paramcai);
              locale.field_type = paramcai.xfI.wbJ;
              locale.field_subType = paramcai.xfI.wbL;
              AppMethodBeat.o(36071);
            }
          }
        }
      }
    }
  }

  private static cai b(cbt paramcbt)
  {
    AppMethodBeat.i(36075);
    if (paramcbt != null)
    {
      cai localcai = new cai();
      localcai.wZv = paramcbt.xbf;
      if (localcai.wZv == null)
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "recommendObj.RecommendXml is null");
      localcai.wZu = paramcbt.wZu;
      AppMethodBeat.o(36075);
      paramcbt = localcai;
    }
    while (true)
    {
      return paramcbt;
      paramcbt = null;
      AppMethodBeat.o(36075);
    }
  }

  public static void b(bpx parambpx)
  {
    AppMethodBeat.i(36077);
    cy localcy = a(parambpx);
    if (localcy == null)
    {
      AppMethodBeat.o(36077);
      return;
    }
    com.tencent.mm.plugin.sns.storage.a locala = new com.tencent.mm.plugin.sns.storage.a(aa.a(localcy.vEY));
    int i = locala.qTt;
    label49: n localn;
    if (i <= 0)
    {
      j = 1;
      int k = af.cnF().Zg("");
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      parambpx = af.cnF().ah("", k, j);
      if ((parambpx == null) || (parambpx.getCount() <= 0))
        break label301;
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", new Object[] { Integer.valueOf(parambpx.getCount()) });
      localn = new n();
      if (i >= 0)
        break label279;
      j = 0;
      label160: if (!parambpx.moveToPosition(j))
        break label285;
      localn.d(parambpx);
    }
    label177: for (int j = localn.field_createTime + 1; ; j = (int)bo.anT())
    {
      parambpx.close();
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + localcy.vEX.wZu.vQE + " ,createTime " + j);
      a(localcy, j, (int)bo.anT());
      b(localcy);
      a(localcy.vEX.wZu.vQE, locala);
      AppMethodBeat.o(36077);
      break;
      j = i + 1;
      break label49;
      j = i;
      break label160;
      parambpx.moveToLast();
      localn.d(parambpx);
      break label177;
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
    }
  }

  private static void b(cy paramcy)
  {
    AppMethodBeat.i(36085);
    paramcy = aa.a(paramcy.vEX.wZv);
    if ((!bo.isNullOrNil(paramcy)) && (new com.tencent.mm.plugin.sns.storage.b(paramcy).coK()))
      d.post(new a.2(paramcy), "predownloadAdLandingPages");
    AppMethodBeat.o(36085);
  }

  private static boolean b(cat paramcat, List<cat> paramList)
  {
    AppMethodBeat.i(36073);
    Iterator localIterator = paramList.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      paramList = (cat)localIterator.next();
      if ((paramcat.wZJ == paramList.wZJ) && (paramList.wZJ != 0L))
      {
        bool = true;
        AppMethodBeat.o(36073);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36073);
    }
  }

  // ERROR //
  private static void cmF()
  {
    // Byte code:
    //   0: ldc_w 951
    //   3: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 953	com/tencent/mm/plugin/sns/model/a:qHw	Ljava/util/LinkedHashMap;
    //   9: ifnonnull +61 -> 70
    //   12: getstatic 53	com/tencent/mm/plugin/sns/model/a:qHv	Ljava/lang/String;
    //   15: invokestatic 959	com/tencent/mm/pluginsdk/g/a/d/a:aji	(Ljava/lang/String;)[B
    //   18: astore_0
    //   19: aload_0
    //   20: ifnull +41 -> 61
    //   23: new 961	java/io/ByteArrayInputStream
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 963	java/io/ByteArrayInputStream:<init>	([B)V
    //   31: astore_0
    //   32: new 965	java/io/ObjectInputStream
    //   35: astore_1
    //   36: aload_1
    //   37: aload_0
    //   38: invokespecial 968	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   41: aload_1
    //   42: astore_0
    //   43: aload_1
    //   44: invokeinterface 973 1 0
    //   49: checkcast 975	java/util/LinkedHashMap
    //   52: putstatic 953	com/tencent/mm/plugin/sns/model/a:qHw	Ljava/util/LinkedHashMap;
    //   55: aload_1
    //   56: invokeinterface 976 1 0
    //   61: getstatic 953	com/tencent/mm/plugin/sns/model/a:qHw	Ljava/util/LinkedHashMap;
    //   64: ifnonnull +6 -> 70
    //   67: invokestatic 979	com/tencent/mm/plugin/sns/model/a:cmG	()V
    //   70: ldc_w 951
    //   73: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: return
    //   77: astore_2
    //   78: aconst_null
    //   79: astore_1
    //   80: aload_1
    //   81: astore_0
    //   82: ldc 129
    //   84: aload_2
    //   85: invokestatic 983	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   88: invokestatic 603	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_1
    //   92: ifnull -31 -> 61
    //   95: aload_1
    //   96: invokeinterface 976 1 0
    //   101: goto -40 -> 61
    //   104: astore_0
    //   105: goto -44 -> 61
    //   108: astore_2
    //   109: aconst_null
    //   110: astore_1
    //   111: aload_1
    //   112: astore_0
    //   113: ldc 129
    //   115: aload_2
    //   116: invokestatic 983	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   119: invokestatic 603	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_1
    //   123: ifnull -62 -> 61
    //   126: aload_1
    //   127: invokeinterface 976 1 0
    //   132: goto -71 -> 61
    //   135: astore_0
    //   136: goto -75 -> 61
    //   139: astore_2
    //   140: aconst_null
    //   141: astore_1
    //   142: aload_1
    //   143: astore_0
    //   144: ldc 129
    //   146: aload_2
    //   147: invokestatic 983	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   150: invokestatic 603	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: aload_1
    //   154: ifnull -93 -> 61
    //   157: aload_1
    //   158: invokeinterface 976 1 0
    //   163: goto -102 -> 61
    //   166: astore_0
    //   167: goto -106 -> 61
    //   170: astore_1
    //   171: aconst_null
    //   172: astore_0
    //   173: aload_0
    //   174: ifnull +9 -> 183
    //   177: aload_0
    //   178: invokeinterface 976 1 0
    //   183: ldc_w 951
    //   186: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   189: aload_1
    //   190: athrow
    //   191: astore_0
    //   192: goto -131 -> 61
    //   195: astore_0
    //   196: goto -13 -> 183
    //   199: astore_1
    //   200: goto -27 -> 173
    //   203: astore_2
    //   204: goto -62 -> 142
    //   207: astore_2
    //   208: goto -97 -> 111
    //   211: astore_2
    //   212: goto -132 -> 80
    //
    // Exception table:
    //   from	to	target	type
    //   32	41	77	java/io/StreamCorruptedException
    //   95	101	104	java/io/IOException
    //   32	41	108	java/io/IOException
    //   126	132	135	java/io/IOException
    //   32	41	139	java/lang/ClassNotFoundException
    //   157	163	166	java/io/IOException
    //   32	41	170	finally
    //   55	61	191	java/io/IOException
    //   177	183	195	java/io/IOException
    //   43	55	199	finally
    //   82	91	199	finally
    //   113	122	199	finally
    //   144	153	199	finally
    //   43	55	203	java/lang/ClassNotFoundException
    //   43	55	207	java/io/IOException
    //   43	55	211	java/io/StreamCorruptedException
  }

  private static void cmG()
  {
    AppMethodBeat.i(36093);
    qHw = new a.5((int)Math.ceil(666.66668701171875D) + 1);
    AppMethodBeat.o(36093);
  }

  public static void e(LinkedList<bpx> paramLinkedList, LinkedList<cbf> paramLinkedList1)
  {
    AppMethodBeat.i(36078);
    if (paramLinkedList != null)
    {
      paramLinkedList = am(paramLinkedList);
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "convert " + paramLinkedList.size() + " recObj to AdvertiseObj");
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        cy localcy = (cy)localIterator.next();
        if (jY(localcy.vEX.wZu.vQE))
        {
          ab.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by snsId " + localcy.vEX.wZu.vQE);
          localIterator.remove();
        }
      }
      j(paramLinkedList, paramLinkedList1);
    }
    AppMethodBeat.o(36078);
  }

  private static void j(List<cy> paramList, List<cbf> paramList1)
  {
    AppMethodBeat.i(36080);
    if ((paramList == null) || (paramList1 == null) || (paramList1.size() == 0))
      AppMethodBeat.o(36080);
    while (true)
    {
      return;
      int i = a((cbf)paramList1.get(paramList1.size() - 1));
      int j = 0;
      if (j < paramList.size())
      {
        cy localcy = (cy)paramList.get(j);
        if (localcy == null)
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
        Object localObject;
        com.tencent.mm.plugin.sns.storage.a locala;
        while (true)
        {
          j++;
          break;
          if (localcy.vEX == null)
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
          }
          else if (localcy.vEX.wZu == null)
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
          }
          else
          {
            String str1 = aa.a(localcy.vEY);
            String str2 = aa.a(localcy.vEX.wZv);
            localObject = aa.b(localcy.vEX.wZu.xam);
            locala = new com.tencent.mm.plugin.sns.storage.a(str1);
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "skXml ".concat(String.valueOf(str1)));
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "adXml ".concat(String.valueOf(str2)));
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "snsXml " + (String)localObject + "\r\n");
            localObject = new com.tencent.mm.plugin.sns.storage.b(str2);
            if ((((com.tencent.mm.plugin.sns.storage.b)localObject).qUC == 0L) || (!jY(((com.tencent.mm.plugin.sns.storage.b)localObject).qUC)))
              break label307;
            ab.w("MicroMsg.AdSnsInfoStorageLogic", "ignore recvd ad filter by originSnsId " + ((com.tencent.mm.plugin.sns.storage.b)localObject).qUC);
          }
        }
        label307: int k = i + 1;
        if ((locala.qTt < paramList1.size()) && (locala.qTt >= 0))
        {
          k = a((cbf)paramList1.get(locala.qTt)) + 1;
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + k + " pos " + locala.qTt);
        }
        while (true)
        {
          int m = (int)(System.currentTimeMillis() / 1000L);
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "gettime ".concat(String.valueOf(m)));
          a(localcy, k, m);
          jZ(localcy.vEX.wZu.vQE);
          jZ(((com.tencent.mm.plugin.sns.storage.b)localObject).qUC);
          a(localcy.vEX.wZu.vQE, locala);
          break;
          ab.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + locala.qTt);
        }
      }
      AppMethodBeat.o(36080);
    }
  }

  public static void jX(long paramLong)
  {
    AppMethodBeat.i(36070);
    Object localObject1 = af.cnI().ku(paramLong);
    if (localObject1 == null)
    {
      ab.i("MicroMsg.AdSnsInfoStorageLogic", "adSnsInfo is null!");
      AppMethodBeat.o(36070);
    }
    while (true)
    {
      return;
      try
      {
        Object localObject2 = new com/tencent/mm/protocal/protobuf/cbf;
        ((cbf)localObject2).<init>();
        localObject2 = (cbf)((cbf)localObject2).parseFrom(((com.tencent.mm.plugin.sns.storage.e)localObject1).field_attrBuf);
        if (localObject2 == null)
        {
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "snsObject is null!");
          AppMethodBeat.o(36070);
        }
        else
        {
          if (((cbf)localObject2).xan == 0)
          {
            localObject1 = ((cbf)localObject2).xat;
            localObject2 = r.Yz();
            if (localObject1 == null)
              break label206;
            localObject1 = ((List)localObject1).iterator();
            cat localcat;
            do
            {
              if (!((Iterator)localObject1).hasNext())
                break;
              localcat = (cat)((Iterator)localObject1).next();
            }
            while ((localcat == null) || (bo.isNullOrNil(localcat.vHl)) || (!localcat.vHl.equals(localObject2)));
          }
          label206: for (boolean bool = true; ; bool = false)
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "hasCommentLike %s", new Object[] { Boolean.valueOf(bool) });
            if (!bool)
            {
              af.cnI().delete(paramLong);
              af.cnK().ky(paramLong);
              com.tencent.mm.plugin.sns.storage.i.kx(paramLong);
            }
            AppMethodBeat.o(36070);
            break;
          }
        }
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.AdSnsInfoStorageLogic", "parse SnsObject error!");
        AppMethodBeat.o(36070);
      }
    }
  }

  private static boolean jY(long paramLong)
  {
    AppMethodBeat.i(36091);
    cmF();
    boolean bool;
    if (qHw.get(Long.valueOf(paramLong)) != null)
    {
      bool = true;
      AppMethodBeat.o(36091);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36091);
    }
  }

  private static void jZ(long paramLong)
  {
    AppMethodBeat.i(36094);
    if (paramLong == 0L)
      AppMethodBeat.o(36094);
    while (true)
    {
      return;
      if (qHw == null)
        cmF();
      qHw.put(Long.valueOf(paramLong), Integer.valueOf(0));
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      try
      {
        Object localObject1 = new java/io/ObjectOutputStream;
        ((ObjectOutputStream)localObject1).<init>(localByteArrayOutputStream);
        ((ObjectOutput)localObject1).writeObject(qHw);
        ((ObjectOutput)localObject1).flush();
        localObject1 = localByteArrayOutputStream.toByteArray();
        com.tencent.mm.pluginsdk.g.a.d.a.D(qHv, (byte[])localObject1);
        try
        {
          localByteArrayOutputStream.close();
          AppMethodBeat.o(36094);
        }
        catch (IOException localIOException1)
        {
          AppMethodBeat.o(36094);
        }
      }
      catch (IOException localIOException4)
      {
        localIOException4 = localIOException4;
        ab.e("MicroMsg.AdSnsInfoStorageLogic", bo.l(localIOException4));
        try
        {
          localIOException1.close();
          AppMethodBeat.o(36094);
        }
        catch (IOException localIOException2)
        {
          AppMethodBeat.o(36094);
        }
      }
      finally
      {
      }
    }
    try
    {
      localIOException2.close();
      label149: AppMethodBeat.o(36094);
      throw localObject2;
    }
    catch (IOException localIOException3)
    {
      break label149;
    }
  }

  public static void k(List<cy> paramList, List<cbf> paramList1)
  {
    AppMethodBeat.i(36081);
    if ((paramList == null) || (paramList1 == null) || (paramList1.size() == 0))
      AppMethodBeat.o(36081);
    while (true)
    {
      return;
      int i = a((cbf)paramList1.get(paramList1.size() - 1));
      int j = 0;
      if (j < paramList.size())
      {
        cy localcy = (cy)paramList.get(j);
        if (localcy == null)
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "ad is null");
        while (true)
        {
          j++;
          break;
          if (localcy.vEX == null)
          {
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject is null");
          }
          else
          {
            if (localcy.vEX.wZu != null)
              break label135;
            ab.i("MicroMsg.AdSnsInfoStorageLogic", "item.SnsADObject.SnsObject is null");
          }
        }
        label135: Object localObject1 = aa.a(localcy.vEY);
        Object localObject2 = aa.a(localcy.vEX.wZv);
        Object localObject3 = aa.b(localcy.vEX.wZu.xam);
        com.tencent.mm.plugin.sns.storage.a locala = new com.tencent.mm.plugin.sns.storage.a((String)localObject1);
        ab.i("MicroMsg.AdSnsInfoStorageLogic", "skXml %s, adXml %s, snsXml %s", new Object[] { localObject1, localObject2, localObject3 });
        int k = i + 1;
        if ((locala.qTt < paramList1.size()) && (locala.qTt >= 0))
        {
          k = a((cbf)paramList1.get(locala.qTt)) + 1;
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "create adinfo time  " + k + " pos " + locala.qTt);
        }
        while (true)
        {
          int m = (int)(System.currentTimeMillis() / 1000L);
          ab.i("MicroMsg.AdSnsInfoStorageLogic", "gettime ".concat(String.valueOf(m)));
          a(localcy, k, m);
          localObject3 = af.cnI().ku(localcy.vEX.wZu.vQE);
          if (localObject3 != null)
          {
            localObject2 = ((com.tencent.mm.plugin.sns.storage.e)localObject3).cqv();
            localObject1 = localObject2;
            if (localObject2 == null)
              localObject1 = new bs();
            ((bs)localObject1).vDY = localcy.vFa;
            if (((bs)localObject1).vDY != null)
              ab.i("MicroMsg.AdSnsInfoStorageLogic", "update timeline remind info , aid:%d", new Object[] { Integer.valueOf(((bs)localObject1).vDY.wTz) });
            ((com.tencent.mm.plugin.sns.storage.e)localObject3).a((bs)localObject1);
            ((com.tencent.mm.plugin.sns.storage.e)localObject3).field_localFlag &= -257;
            af.cnI().a((com.tencent.mm.sdk.e.c)localObject3);
          }
          a(localcy.vEX.wZu.vQE, locala);
          break;
          ab.w("MicroMsg.AdSnsInfoStorageLogic", "invalid ad.pos " + locala.qTt);
        }
      }
      AppMethodBeat.o(36081);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a
 * JD-Core Version:    0.6.2
 */