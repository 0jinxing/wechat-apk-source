package com.tencent.mm.plugin.backup.bakoldlogic.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.LinkedList;
import java.util.Map;

public final class c
  implements j
{
  private static boolean Fd(String paramString)
  {
    AppMethodBeat.i(17783);
    int i = paramString.indexOf('<');
    String str = paramString;
    if (i > 0)
      str = paramString.substring(i);
    boolean bool;
    if (br.z(str, "msg") != null)
    {
      bool = true;
      AppMethodBeat.o(17783);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(17783);
    }
  }

  public final int a(gu paramgu, bi parambi, LinkedList<u> paramLinkedList)
  {
    AppMethodBeat.i(17784);
    int i;
    Object localObject1;
    Object localObject2;
    if (bo.isNullOrNil(parambi.field_content))
    {
      i = 0;
      localObject1 = ap.aps(parambi.field_content).xXL.trim();
      localObject2 = localObject1;
      if (!Fd((String)localObject1))
      {
        localObject1 = parambi.field_content;
        localObject2 = localObject1;
        if (!Fd((String)localObject1))
        {
          localObject1 = a.a(parambi, paramgu);
          localObject2 = localObject1;
          if (parambi.field_isSend != 1)
          {
            localObject2 = localObject1;
            if (com.tencent.mm.plugin.backup.bakoldlogic.d.d.kH(parambi.field_talker))
              localObject2 = parambi.field_talker + " :\n " + (String)localObject1;
          }
        }
      }
      if ((localObject2 != null) && (Fd((String)localObject2)))
        break label179;
      ab.d("MicroMsg.BakOldItemEmoji", "emoji error".concat(String.valueOf(localObject2)));
      AppMethodBeat.o(17784);
      i = -1;
    }
    while (true)
    {
      return i;
      i = parambi.field_content.getBytes().length;
      break;
      label179: localObject1 = new bts();
      ((bts)localObject1).alV(bo.bc((String)localObject2, ""));
      paramgu.vED = ((bts)localObject1);
      parambi = b.aUY().aUZ().aUp().aqi(parambi.field_imgPath);
      if ((parambi != null) && (parambi.duS()))
      {
        AppMethodBeat.o(17784);
      }
      else
      {
        if (parambi == null)
          break label667;
        if (!TextUtils.isEmpty(parambi.field_groupId))
          break label454;
        localObject2 = b.aUY().aUZ().Yb();
        localObject2 = (String)localObject2 + parambi.Aq() + "_thumb";
        if (e.cs((String)localObject2) >= 0)
          break label325;
        ab.e("MicroMsg.BakOldItemEmoji", "thumbPath error");
        AppMethodBeat.o(17784);
        i = -1;
      }
    }
    label325: int j = i.a(new i.a((String)localObject2, paramgu, paramLinkedList, 4, "_thumb")) + i;
    label347: if ((TextUtils.isEmpty(parambi.field_groupId)) && (parambi.duP()))
    {
      localObject2 = b.aUY().aUZ().Yb();
      parambi = (String)localObject2 + parambi.Aq();
      localObject2 = ap.aps(aa.a(paramgu.vED));
      i = j + i.a(new i.a(parambi, paramgu, paramLinkedList, b.aUY().aUZ().aUp().aqi(((ap)localObject2).cvZ)));
    }
    label667: 
    while (true)
    {
      AppMethodBeat.o(17784);
      break;
      label454: localObject2 = b.aUY().aUZ().Yb();
      localObject2 = (String)localObject2 + parambi.field_groupId + File.separator + parambi.Aq() + "_cover";
      if (e.cs((String)localObject2) < 0)
      {
        ab.e("MicroMsg.BakOldItemEmoji", "thumbPath error");
        AppMethodBeat.o(17784);
        i = -1;
        break;
      }
      j = i.a(new i.a((String)localObject2, paramgu, paramLinkedList, 4, "_thumb")) + i;
      break label347;
      i = j;
      if (parambi.duR())
      {
        localObject2 = b.aUY().aUZ().Yb();
        localObject2 = (String)localObject2 + parambi.field_groupId + File.separator + parambi.Aq();
        parambi = ap.aps(aa.a(paramgu.vED));
        i = j + i.a(new i.a((String)localObject2, paramgu, paramLinkedList, b.aUY().aUZ().aUp().aqi(parambi.cvZ)));
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    boolean bool = true;
    int i = 0;
    AppMethodBeat.i(17785);
    parambi.setContent(paramgu.vED.wVI);
    paramString = paramgu.vEB.wVI;
    Object localObject1 = paramgu.vEC.wVI;
    Object localObject2;
    if (((String)b.aUY().aUZ().Ry().get(2, null)).equals(paramString))
    {
      paramString = (String)localObject1;
      localObject2 = paramgu.vED.wVI;
      localObject1 = br.z((String)localObject2, "msg");
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().dK((String)localObject2, paramString);
      if (paramString != null)
        break label135;
      ab.w("MicroMsg.BakOldItemEmoji", "EmojiMsgInfo is null");
      AppMethodBeat.o(17785);
    }
    for (i = -1; ; i = -1)
    {
      return i;
      break;
      label135: localObject2 = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramString.cvZ);
      if (localObject2 != null)
        break label185;
      ab.w("MicroMsg.BakOldItemEmoji", "EmojiInfo is null");
      AppMethodBeat.o(17785);
    }
    label185: if (((Map)localObject1).get(".msg.emoji.$androidmd5") == null)
    {
      localObject3 = a.Fg(paramString.cvZ);
      if (!bo.isNullOrNil((String)localObject3))
      {
        paramString.cvZ = ((String)localObject3);
        ab.d("MicroMsg.BakOldItemEmoji", "convert ip to android md5 %s", new Object[] { localObject3 });
      }
    }
    localObject1 = (String)((Map)localObject1).get(".msg.emoji.$productid");
    if (!TextUtils.isEmpty((CharSequence)localObject1))
      paramString.cwg = ((String)localObject1);
    parambi.setType(47);
    parambi.jv(paramString.cvZ);
    Object localObject3 = paramString.fWW;
    if ((!((EmojiInfo)localObject2).xy()) && (!((EmojiInfo)localObject2).isGif()))
    {
      label303: parambi.setContent(ap.a((String)localObject3, 0L, bool, paramString.cvZ, false, ""));
      if (!((EmojiInfo)localObject2).duP())
      {
        localObject2 = b.aUY().aUZ().Yb();
        if (!TextUtils.isEmpty((CharSequence)localObject1))
          break label545;
        com.tencent.mm.plugin.backup.bakoldlogic.a.a.b(paramgu, 4, (String)localObject2 + paramString.cvZ + "_thumb");
        com.tencent.mm.plugin.backup.bakoldlogic.a.a.b(paramgu, 5, (String)localObject2 + paramString.cvZ);
      }
    }
    while (true)
    {
      paramgu = new EmojiInfo((String)localObject2);
      paramgu.field_md5 = paramString.cvZ;
      paramgu.field_svrid = paramString.id;
      paramgu.field_catalog = EmojiInfo.yaf;
      paramgu.field_type = paramString.xYc;
      paramgu.field_size = paramString.xYd;
      paramgu.field_state = EmojiInfo.yar;
      if (!TextUtils.isEmpty((CharSequence)localObject1))
        paramgu.field_groupId = ((String)localObject1);
      if (!bo.isNullOrNil(paramString.xYl))
        paramgu.field_activityid = paramString.xYl;
      b.aUY().aUZ().aUp().a(paramgu);
      ab.d("MicroMsg.BakOldItemEmoji", "id ".concat(String.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.d.d.l(parambi))));
      AppMethodBeat.o(17785);
      break;
      bool = false;
      break label303;
      label545: localObject3 = new File((String)localObject2 + (String)localObject1);
      if (!((File)localObject3).exists())
        ((File)localObject3).mkdirs();
      com.tencent.mm.plugin.backup.bakoldlogic.a.a.b(paramgu, 4, (String)localObject2 + (String)localObject1 + File.separator + paramString.cvZ + "_cover");
      com.tencent.mm.plugin.backup.bakoldlogic.a.a.b(paramgu, 5, (String)localObject2 + (String)localObject1 + File.separator + paramString.cvZ);
    }
  }

  static final class a
  {
    public static String jrk = "<msg>";
    public static String jrl = "</msg>";

    public static String Fg(String paramString)
    {
      AppMethodBeat.i(17781);
      paramString = a.Fq(paramString);
      if (paramString == null)
      {
        paramString = null;
        AppMethodBeat.o(17781);
      }
      while (true)
      {
        return paramString;
        paramString = paramString.jvN;
        AppMethodBeat.o(17781);
      }
    }

    // ERROR //
    public static String a(bi parambi, gu paramgu)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: sipush 17782
      //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   8: invokestatic 60	com/tencent/mm/plugin/backup/bakoldlogic/d/b:aUY	()Lcom/tencent/mm/plugin/backup/bakoldlogic/d/b;
      //   11: invokevirtual 64	com/tencent/mm/plugin/backup/bakoldlogic/d/b:aUZ	()Lcom/tencent/mm/plugin/backup/bakoldlogic/d/c;
      //   14: invokevirtual 70	com/tencent/mm/plugin/backup/bakoldlogic/d/c:aUp	()Lcom/tencent/mm/storage/emotion/d;
      //   17: aload_0
      //   18: getfield 75	com/tencent/mm/g/c/cy:field_imgPath	Ljava/lang/String;
      //   21: invokevirtual 81	com/tencent/mm/storage/emotion/d:aqi	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
      //   24: astore_3
      //   25: aload_3
      //   26: ifnonnull +13 -> 39
      //   29: sipush 17782
      //   32: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   35: aload_2
      //   36: astore_0
      //   37: aload_0
      //   38: areturn
      //   39: aload_3
      //   40: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
      //   43: invokestatic 90	com/tencent/mm/plugin/backup/bakoldlogic/b/a:Fr	(Ljava/lang/String;)Lcom/tencent/mm/plugin/backup/bakoldlogic/b/a$a;
      //   46: astore_2
      //   47: aload_2
      //   48: astore_0
      //   49: aload_2
      //   50: ifnonnull +27 -> 77
      //   53: new 40	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a
      //   56: dup
      //   57: aload_3
      //   58: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
      //   61: aload_3
      //   62: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
      //   65: aload_3
      //   66: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
      //   69: aload_3
      //   70: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
      //   73: invokespecial 94	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      //   76: astore_0
      //   77: new 96	java/io/StringWriter
      //   80: dup
      //   81: invokespecial 98	java/io/StringWriter:<init>	()V
      //   84: astore_2
      //   85: invokestatic 104	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
      //   88: invokevirtual 108	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
      //   91: astore 4
      //   93: aload 4
      //   95: aload_2
      //   96: invokeinterface 114 2 0
      //   101: aload 4
      //   103: ldc 116
      //   105: getstatic 122	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
      //   108: invokeinterface 126 3 0
      //   113: aload 4
      //   115: aconst_null
      //   116: ldc 128
      //   118: invokeinterface 132 3 0
      //   123: pop
      //   124: aload 4
      //   126: aconst_null
      //   127: ldc 134
      //   129: invokeinterface 132 3 0
      //   134: pop
      //   135: aload 4
      //   137: aconst_null
      //   138: ldc 136
      //   140: aload_1
      //   141: getfield 142	com/tencent/mm/protocal/protobuf/gu:vEB	Lcom/tencent/mm/protocal/protobuf/bts;
      //   144: getfield 147	com/tencent/mm/protocal/protobuf/bts:wVI	Ljava/lang/String;
      //   147: invokeinterface 151 4 0
      //   152: pop
      //   153: aload 4
      //   155: aconst_null
      //   156: ldc 153
      //   158: aload_1
      //   159: getfield 156	com/tencent/mm/protocal/protobuf/gu:vEC	Lcom/tencent/mm/protocal/protobuf/bts;
      //   162: getfield 147	com/tencent/mm/protocal/protobuf/bts:wVI	Ljava/lang/String;
      //   165: invokeinterface 151 4 0
      //   170: pop
      //   171: new 158	java/lang/StringBuilder
      //   174: astore_1
      //   175: aload_1
      //   176: invokespecial 159	java/lang/StringBuilder:<init>	()V
      //   179: aload 4
      //   181: aconst_null
      //   182: ldc 161
      //   184: aload_1
      //   185: aload_3
      //   186: getfield 165	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
      //   189: invokevirtual 169	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   192: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   195: invokeinterface 151 4 0
      //   200: pop
      //   201: aload 4
      //   203: aconst_null
      //   204: ldc 174
      //   206: aload_3
      //   207: invokevirtual 177	com/tencent/mm/storage/emotion/EmojiInfo:duW	()Ljava/lang/String;
      //   210: invokeinterface 151 4 0
      //   215: pop
      //   216: aload 4
      //   218: aconst_null
      //   219: ldc 179
      //   221: aload_0
      //   222: getfield 182	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvO	Ljava/lang/String;
      //   225: invokeinterface 151 4 0
      //   230: pop
      //   231: aload 4
      //   233: aconst_null
      //   234: ldc 184
      //   236: ldc 186
      //   238: invokeinterface 151 4 0
      //   243: pop
      //   244: aload 4
      //   246: aconst_null
      //   247: ldc 188
      //   249: aload_0
      //   250: getfield 43	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvN	Ljava/lang/String;
      //   253: invokeinterface 151 4 0
      //   258: pop
      //   259: aload 4
      //   261: aconst_null
      //   262: ldc 190
      //   264: ldc 186
      //   266: invokeinterface 151 4 0
      //   271: pop
      //   272: aload 4
      //   274: aconst_null
      //   275: ldc 192
      //   277: aload_3
      //   278: getfield 195	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
      //   281: invokeinterface 151 4 0
      //   286: pop
      //   287: aload 4
      //   289: aconst_null
      //   290: ldc 134
      //   292: invokeinterface 198 3 0
      //   297: pop
      //   298: aload_3
      //   299: invokevirtual 202	com/tencent/mm/storage/emotion/EmojiInfo:xy	()Z
      //   302: ifeq +133 -> 435
      //   305: aload 4
      //   307: aconst_null
      //   308: ldc 204
      //   310: invokeinterface 132 3 0
      //   315: pop
      //   316: aload_3
      //   317: invokevirtual 207	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
      //   320: ldc 204
      //   322: invokestatic 213	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
      //   325: astore_1
      //   326: aload_1
      //   327: ldc 215
      //   329: invokeinterface 221 2 0
      //   334: checkcast 223	java/lang/String
      //   337: ldc 225
      //   339: invokestatic 231	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   342: astore_0
      //   343: aload_1
      //   344: ldc 233
      //   346: invokeinterface 221 2 0
      //   351: checkcast 223	java/lang/String
      //   354: ldc 225
      //   356: invokestatic 231	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   359: astore_1
      //   360: aload_0
      //   361: ldc 225
      //   363: invokevirtual 237	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   366: ifne +12 -> 378
      //   369: aload_1
      //   370: ldc 225
      //   372: invokevirtual 237	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   375: ifeq +19 -> 394
      //   378: aload_2
      //   379: invokevirtual 240	java/io/StringWriter:close	()V
      //   382: ldc 225
      //   384: astore_0
      //   385: sipush 17782
      //   388: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   391: goto -354 -> 37
      //   394: aload 4
      //   396: aconst_null
      //   397: ldc 161
      //   399: aload_0
      //   400: invokestatic 244	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   403: invokeinterface 151 4 0
      //   408: pop
      //   409: aload 4
      //   411: aconst_null
      //   412: ldc 246
      //   414: aload_1
      //   415: invokestatic 244	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   418: invokeinterface 151 4 0
      //   423: pop
      //   424: aload 4
      //   426: aconst_null
      //   427: ldc 204
      //   429: invokeinterface 198 3 0
      //   434: pop
      //   435: aload 4
      //   437: aconst_null
      //   438: ldc 128
      //   440: invokeinterface 198 3 0
      //   445: pop
      //   446: aload 4
      //   448: invokeinterface 249 1 0
      //   453: aload_2
      //   454: invokevirtual 252	java/io/StringWriter:flush	()V
      //   457: aload_2
      //   458: invokevirtual 240	java/io/StringWriter:close	()V
      //   461: aload_2
      //   462: invokevirtual 256	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
      //   465: invokevirtual 259	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   468: astore_0
      //   469: aload_0
      //   470: aload_0
      //   471: getstatic 16	com/tencent/mm/plugin/backup/bakoldlogic/b/c$a:jrk	Ljava/lang/String;
      //   474: invokevirtual 263	java/lang/String:indexOf	(Ljava/lang/String;)I
      //   477: aload_0
      //   478: getstatic 20	com/tencent/mm/plugin/backup/bakoldlogic/b/c$a:jrl	Ljava/lang/String;
      //   481: invokevirtual 263	java/lang/String:indexOf	(Ljava/lang/String;)I
      //   484: getstatic 20	com/tencent/mm/plugin/backup/bakoldlogic/b/c$a:jrl	Ljava/lang/String;
      //   487: invokevirtual 267	java/lang/String:length	()I
      //   490: iadd
      //   491: invokevirtual 271	java/lang/String:substring	(II)Ljava/lang/String;
      //   494: astore_0
      //   495: ldc_w 273
      //   498: ldc_w 275
      //   501: aload_0
      //   502: invokestatic 244	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   505: invokevirtual 278	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
      //   508: invokestatic 284	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   511: sipush 17782
      //   514: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   517: goto -480 -> 37
      //   520: astore_0
      //   521: ldc_w 273
      //   524: aload_0
      //   525: ldc 225
      //   527: iconst_0
      //   528: anewarray 4	java/lang/Object
      //   531: invokestatic 288	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   534: ldc 225
      //   536: astore_0
      //   537: sipush 17782
      //   540: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   543: goto -506 -> 37
      //   546: astore_0
      //   547: ldc_w 273
      //   550: aload_0
      //   551: ldc 225
      //   553: iconst_0
      //   554: anewarray 4	java/lang/Object
      //   557: invokestatic 288	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   560: ldc 225
      //   562: astore_0
      //   563: sipush 17782
      //   566: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   569: goto -532 -> 37
      //   572: astore_0
      //   573: ldc_w 273
      //   576: aload_0
      //   577: ldc 225
      //   579: iconst_0
      //   580: anewarray 4	java/lang/Object
      //   583: invokestatic 288	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   586: ldc 225
      //   588: astore_0
      //   589: sipush 17782
      //   592: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   595: goto -558 -> 37
      //   598: astore_0
      //   599: ldc_w 273
      //   602: aload_0
      //   603: ldc 225
      //   605: iconst_0
      //   606: anewarray 4	java/lang/Object
      //   609: invokestatic 288	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   612: ldc 225
      //   614: astore_0
      //   615: sipush 17782
      //   618: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   621: goto -584 -> 37
      //   624: astore_0
      //   625: ldc 225
      //   627: astore_0
      //   628: sipush 17782
      //   631: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   634: goto -597 -> 37
      //
      // Exception table:
      //   from	to	target	type
      //   85	378	520	org/xmlpull/v1/XmlPullParserException
      //   378	382	520	org/xmlpull/v1/XmlPullParserException
      //   394	435	520	org/xmlpull/v1/XmlPullParserException
      //   435	461	520	org/xmlpull/v1/XmlPullParserException
      //   85	378	546	java/lang/IllegalArgumentException
      //   378	382	546	java/lang/IllegalArgumentException
      //   394	435	546	java/lang/IllegalArgumentException
      //   435	461	546	java/lang/IllegalArgumentException
      //   85	378	572	java/lang/IllegalStateException
      //   378	382	572	java/lang/IllegalStateException
      //   394	435	572	java/lang/IllegalStateException
      //   435	461	572	java/lang/IllegalStateException
      //   85	378	598	java/io/IOException
      //   378	382	598	java/io/IOException
      //   394	435	598	java/io/IOException
      //   435	461	598	java/io/IOException
      //   469	511	624	java/lang/Exception
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.c
 * JD-Core Version:    0.6.2
 */