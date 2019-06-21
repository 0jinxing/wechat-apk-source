package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.g.a.fs;
import com.tencent.mm.g.a.fs.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderMsg extends ExtContentProviderBase
{
  private static final UriMatcher lQc;
  private static final String[] lQf;
  private static final String[] lQg;
  private static final String[] lQh;
  private static final String[] lQi;
  private static final String[] lQj;
  private static final String[] lQk;
  private String[] lPN = null;
  private int lPO = -1;
  private boolean lQd = false;
  private Context lQe;
  private MatrixCursor lQl = null;

  static
  {
    AppMethodBeat.i(20361);
    lQf = new String[] { "msgId", "fromUserId", "fromUserNickName", "msgType", "contentType", "content", "status", "createTime" };
    lQg = new String[] { "userId", "unReadCount" };
    lQh = new String[] { "userId", "unReadCount" };
    lQi = new String[] { "userId", "retCode", "msgId" };
    lQj = new String[] { "msgId", "retCode" };
    lQk = new String[] { "msgId", "retCode" };
    UriMatcher localUriMatcher = new UriMatcher(-1);
    lQc = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.message", "oneMsg", 7);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "unReadCount", 8);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "unReadMsgs", 9);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "unReadUserList", 10);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "recordMsg", 11);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "playVoice", 12);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "setReaded", 13);
    lQc.addURI("com.tencent.mm.plugin.ext.message", "sendTextMsg", 14);
    AppMethodBeat.o(20361);
  }

  public ExtControlProviderMsg()
  {
  }

  public ExtControlProviderMsg(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.lQd = true;
    this.lPN = paramArrayOfString;
    this.lPO = paramInt;
    this.lQe = paramContext;
  }

  // ERROR //
  private Cursor a(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 20353
    //   3: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 128
    //   8: ldc 130
    //   10: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: ldc 128
    //   15: ldc 137
    //   17: iconst_2
    //   18: anewarray 139	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_2
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: aload_3
    //   28: aastore
    //   29: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aload_1
    //   33: ifnull +8 -> 41
    //   36: aload_1
    //   37: arraylength
    //   38: ifgt +33 -> 71
    //   41: ldc 128
    //   43: ldc 145
    //   45: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: aload_0
    //   49: iconst_3
    //   50: sipush 3701
    //   53: invokevirtual 152	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:dZ	(II)V
    //   56: sipush 3701
    //   59: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   62: astore_1
    //   63: sipush 20353
    //   66: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: aload_1
    //   70: areturn
    //   71: aload_2
    //   72: invokestatic 164	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   75: ifeq +34 -> 109
    //   78: ldc 128
    //   80: ldc 166
    //   82: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload_0
    //   86: iconst_3
    //   87: sipush 3702
    //   90: invokevirtual 152	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:dZ	(II)V
    //   93: sipush 3702
    //   96: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   99: astore_1
    //   100: sipush 20353
    //   103: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -37 -> 69
    //   109: aload_3
    //   110: invokestatic 164	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   113: ifeq +34 -> 147
    //   116: ldc 128
    //   118: ldc 168
    //   120: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload_0
    //   124: iconst_3
    //   125: sipush 3703
    //   128: invokevirtual 152	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:dZ	(II)V
    //   131: sipush 3703
    //   134: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   137: astore_1
    //   138: sipush 20353
    //   141: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: goto -75 -> 69
    //   147: aload_2
    //   148: ifnull +85 -> 233
    //   151: aload_2
    //   152: ldc 170
    //   154: invokevirtual 173	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   157: ifeq +76 -> 233
    //   160: iconst_1
    //   161: istore 4
    //   163: iload 4
    //   165: ifeq +147 -> 312
    //   168: invokestatic 179	com/tencent/mm/plugin/ext/b:brB	()Lcom/tencent/mm/storage/ca;
    //   171: aload_1
    //   172: iconst_0
    //   173: aaload
    //   174: invokevirtual 185	com/tencent/mm/storage/ca:apZ	(Ljava/lang/String;)Lcom/tencent/mm/storage/bz;
    //   177: astore_2
    //   178: aload_2
    //   179: ifnull +23 -> 202
    //   182: aload_2
    //   183: getfield 191	com/tencent/mm/storage/bz:field_openId	Ljava/lang/String;
    //   186: invokestatic 164	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   189: ifne +13 -> 202
    //   192: aload_2
    //   193: getfield 194	com/tencent/mm/storage/bz:field_username	Ljava/lang/String;
    //   196: invokestatic 164	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   199: ifeq +40 -> 239
    //   202: ldc 128
    //   204: ldc 196
    //   206: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: aload_0
    //   210: iconst_3
    //   211: sipush 3704
    //   214: invokevirtual 152	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:dZ	(II)V
    //   217: sipush 3704
    //   220: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   223: astore_1
    //   224: sipush 20353
    //   227: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: goto -161 -> 69
    //   233: iconst_0
    //   234: istore 4
    //   236: goto -73 -> 163
    //   239: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   242: pop
    //   243: invokestatic 208	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   246: aload_2
    //   247: getfield 194	com/tencent/mm/storage/bz:field_username	Ljava/lang/String;
    //   250: invokeinterface 214 2 0
    //   255: astore 5
    //   257: aload 5
    //   259: ifnull +22 -> 281
    //   262: aload 5
    //   264: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   267: ifnull +14 -> 281
    //   270: aload 5
    //   272: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   275: invokevirtual 221	java/lang/String:length	()I
    //   278: ifgt +61 -> 339
    //   281: ldc 128
    //   283: ldc 223
    //   285: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: aload_0
    //   289: iconst_3
    //   290: sipush 3705
    //   293: invokevirtual 152	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:dZ	(II)V
    //   296: sipush 3705
    //   299: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   302: astore_1
    //   303: sipush 20353
    //   306: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: goto -240 -> 69
    //   312: aload_1
    //   313: iconst_0
    //   314: aaload
    //   315: invokestatic 229	com/tencent/mm/plugin/ext/a/a:Le	(Ljava/lang/String;)J
    //   318: lstore 6
    //   320: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   323: pop
    //   324: invokestatic 208	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   327: lload 6
    //   329: invokeinterface 233 3 0
    //   334: astore 5
    //   336: goto -79 -> 257
    //   339: aload 5
    //   341: invokevirtual 239	com/tencent/mm/storage/ad:Oj	()Ljava/lang/String;
    //   344: astore 8
    //   346: aload 5
    //   348: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   351: invokestatic 244	com/tencent/mm/model/t:kH	(Ljava/lang/String;)Z
    //   354: ifeq +321 -> 675
    //   357: aload 5
    //   359: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   362: invokestatic 250	com/tencent/mm/model/s:mJ	(Ljava/lang/String;)Ljava/lang/String;
    //   365: astore 8
    //   367: iconst_1
    //   368: istore 9
    //   370: iload 4
    //   372: ifeq +125 -> 497
    //   375: aload_3
    //   376: iconst_0
    //   377: invokestatic 254	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   380: istore 10
    //   382: iload 10
    //   384: ifle +10 -> 394
    //   387: iload 10
    //   389: bipush 15
    //   391: if_icmplt +83 -> 474
    //   394: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   397: pop
    //   398: invokestatic 258	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   401: aload 5
    //   403: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   406: bipush 15
    //   408: invokeinterface 264 3 0
    //   413: astore_2
    //   414: aload_2
    //   415: ifnonnull +104 -> 519
    //   418: ldc 128
    //   420: ldc_w 266
    //   423: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   426: aload_0
    //   427: iconst_3
    //   428: iconst_4
    //   429: sipush 3706
    //   432: invokevirtual 270	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:T	(III)V
    //   435: sipush 3706
    //   438: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   441: astore_1
    //   442: sipush 20353
    //   445: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   448: goto -379 -> 69
    //   451: astore_2
    //   452: ldc 128
    //   454: ldc_w 272
    //   457: iconst_1
    //   458: anewarray 139	java/lang/Object
    //   461: dup
    //   462: iconst_0
    //   463: aload_3
    //   464: aastore
    //   465: invokestatic 274	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   468: iconst_0
    //   469: istore 10
    //   471: goto -89 -> 382
    //   474: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   477: pop
    //   478: invokestatic 258	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   481: aload 5
    //   483: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   486: iload 10
    //   488: invokeinterface 264 3 0
    //   493: astore_2
    //   494: goto -80 -> 414
    //   497: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   500: pop
    //   501: invokestatic 258	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   504: aload 5
    //   506: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   509: iconst_3
    //   510: invokeinterface 264 3 0
    //   515: astore_2
    //   516: goto -102 -> 414
    //   519: new 276	android/database/MatrixCursor
    //   522: dup
    //   523: getstatic 62	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:lQf	[Ljava/lang/String;
    //   526: invokespecial 279	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   529: astore_3
    //   530: aload_2
    //   531: invokeinterface 284 1 0
    //   536: ifle +55 -> 591
    //   539: aload_2
    //   540: invokeinterface 288 1 0
    //   545: ifeq +46 -> 591
    //   548: new 290	com/tencent/mm/storage/bi
    //   551: astore 11
    //   553: aload 11
    //   555: invokespecial 291	com/tencent/mm/storage/bi:<init>	()V
    //   558: aload 11
    //   560: aload_2
    //   561: invokevirtual 294	com/tencent/mm/storage/bi:d	(Landroid/database/Cursor;)V
    //   564: aload_0
    //   565: aload_3
    //   566: aload 11
    //   568: aload 5
    //   570: iload 9
    //   572: aload 8
    //   574: iload 4
    //   576: aload_1
    //   577: iconst_0
    //   578: aaload
    //   579: invokespecial 297	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:a	(Landroid/database/MatrixCursor;Lcom/tencent/mm/storage/bi;Lcom/tencent/mm/storage/ad;ZLjava/lang/String;ZLjava/lang/String;)V
    //   582: aload_2
    //   583: invokeinterface 300 1 0
    //   588: ifne -30 -> 558
    //   591: aload_2
    //   592: invokeinterface 303 1 0
    //   597: aload_0
    //   598: iconst_2
    //   599: iconst_0
    //   600: iconst_1
    //   601: invokevirtual 270	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:T	(III)V
    //   604: sipush 20353
    //   607: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   610: aload_3
    //   611: astore_1
    //   612: goto -543 -> 69
    //   615: astore_1
    //   616: aconst_null
    //   617: astore_3
    //   618: ldc 128
    //   620: aload_1
    //   621: invokevirtual 306	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   624: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   627: ldc 128
    //   629: aload_1
    //   630: ldc_w 308
    //   633: iconst_0
    //   634: anewarray 139	java/lang/Object
    //   637: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   640: aload_3
    //   641: ifnull +7 -> 648
    //   644: aload_3
    //   645: invokevirtual 313	android/database/MatrixCursor:close	()V
    //   648: aload_0
    //   649: iconst_3
    //   650: iconst_4
    //   651: bipush 12
    //   653: invokevirtual 270	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:T	(III)V
    //   656: bipush 12
    //   658: invokestatic 158	com/tencent/mm/pluginsdk/d/a/a:Kn	(I)Landroid/database/MatrixCursor;
    //   661: astore_1
    //   662: sipush 20353
    //   665: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   668: goto -599 -> 69
    //   671: astore_1
    //   672: goto -54 -> 618
    //   675: iconst_0
    //   676: istore 9
    //   678: goto -308 -> 370
    //
    // Exception table:
    //   from	to	target	type
    //   375	382	451	java/lang/Exception
    //   168	178	615	java/lang/Exception
    //   182	202	615	java/lang/Exception
    //   202	224	615	java/lang/Exception
    //   239	257	615	java/lang/Exception
    //   262	281	615	java/lang/Exception
    //   281	303	615	java/lang/Exception
    //   312	336	615	java/lang/Exception
    //   339	367	615	java/lang/Exception
    //   394	414	615	java/lang/Exception
    //   418	442	615	java/lang/Exception
    //   452	468	615	java/lang/Exception
    //   474	494	615	java/lang/Exception
    //   497	516	615	java/lang/Exception
    //   519	530	615	java/lang/Exception
    //   530	558	671	java/lang/Exception
    //   558	591	671	java/lang/Exception
    //   591	604	671	java/lang/Exception
  }

  private void a(MatrixCursor paramMatrixCursor, bi parambi, ad paramad, boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    AppMethodBeat.i(20360);
    if (parambi == null)
      AppMethodBeat.o(20360);
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString2))
      {
        ab.d("MicroMsg.ExtControlProviderMsg", "userOpenId is null");
        AppMethodBeat.o(20360);
      }
      else
      {
        if ((parambi.getType() != 9999) && (parambi.getType() != 10000))
          break;
        AppMethodBeat.o(20360);
      }
    }
    String str1 = "";
    String str2 = "";
    String str3 = str2;
    Object localObject = str1;
    int i;
    if (paramBoolean1)
    {
      i = bf.ox(parambi.field_content);
      str3 = str2;
      localObject = str1;
      if (i != -1)
      {
        str3 = str2;
        localObject = str1;
        if (parambi.field_content.length() > i)
        {
          String str4 = parambi.field_content.substring(0, i).trim();
          str3 = str2;
          localObject = str1;
          if (str4 != null)
          {
            str3 = str2;
            localObject = str1;
            if (str4.length() > 0)
            {
              str3 = str2;
              localObject = str1;
              if (parambi.field_content.length() >= i + 2)
              {
                localObject = s.mJ(str4);
                str3 = parambi.field_content.substring(i + 2);
              }
            }
          }
        }
      }
    }
    int j = com.tencent.mm.plugin.ext.b.b.V(parambi);
    if (j == 1)
      if (paramBoolean1)
      {
        localObject = (String)localObject + "!]" + str3;
        label268: if (!paramBoolean2)
          break label404;
      }
    while (true)
    {
      try
      {
        if (bo.isNullOrNil(paramString2))
        {
          ab.w("MicroMsg.ExtControlProviderMsg", "userId is null");
          AppMethodBeat.o(20360);
          break;
          localObject = parambi.field_content;
          break label268;
          if (j == 2)
          {
            localObject = m.ama().mv((int)parambi.field_msgId);
            if ((localObject == null) || (((p)localObject).fileName == null))
              break label564;
            localObject = q.getFullPath(((p)localObject).fileName);
            ab.d("MicroMsg.ExtControlProviderMsg", "voice file = %s", new Object[] { localObject });
            break label268;
          }
          if (paramBoolean1)
            break label268;
          if (this.lQe != null)
          {
            localObject = this.lQe.getString(2131299426);
            break label268;
          }
          localObject = "";
          break label268;
          label404: paramString2 = com.tencent.mm.plugin.ext.a.a.ii((int)paramad.ewQ);
          continue;
        }
        paramad = com.tencent.mm.plugin.ext.a.a.ii(parambi.field_msgId);
        if (parambi.field_isSend == 0)
        {
          i = 1;
          if (parambi.field_status != 4)
            continue;
          k = 1;
          paramMatrixCursor.addRow(new Object[] { paramad, paramString2, paramString1, Integer.valueOf(i), Integer.valueOf(j), localObject, Integer.valueOf(k), Long.valueOf(parambi.field_createTime) });
          AppMethodBeat.o(20360);
          break;
        }
        i = 2;
        continue;
        int k = 2;
        continue;
      }
      catch (Exception paramMatrixCursor)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", paramMatrixCursor.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramMatrixCursor, "", new Object[0]);
        AppMethodBeat.o(20360);
      }
      break;
      label564: localObject = "";
    }
  }

  // ERROR //
  private Cursor b(String[] paramArrayOfString, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: sipush 20355
    //   5: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 128
    //   10: ldc_w 437
    //   13: invokestatic 319	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_1
    //   17: ifnull +8 -> 25
    //   20: aload_1
    //   21: arraylength
    //   22: ifgt +25 -> 47
    //   25: ldc 128
    //   27: ldc 145
    //   29: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload_0
    //   33: iconst_3
    //   34: invokevirtual 440	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:vf	(I)V
    //   37: sipush 20355
    //   40: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   43: aconst_null
    //   44: astore_1
    //   45: aload_1
    //   46: areturn
    //   47: aload_1
    //   48: iconst_0
    //   49: aaload
    //   50: invokestatic 229	com/tencent/mm/plugin/ext/a/a:Le	(Ljava/lang/String;)J
    //   53: lstore 4
    //   55: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   58: pop
    //   59: invokestatic 258	com/tencent/mm/model/c:XO	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/h;
    //   62: lload 4
    //   64: invokeinterface 444 3 0
    //   69: astore 6
    //   71: invokestatic 202	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   74: pop
    //   75: invokestatic 208	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   78: aload 6
    //   80: getfield 447	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   83: invokeinterface 214 2 0
    //   88: astore 7
    //   90: aload 7
    //   92: ifnull +12 -> 104
    //   95: aload 7
    //   97: getfield 405	com/tencent/mm/n/a:ewQ	J
    //   100: l2i
    //   101: ifgt +19 -> 120
    //   104: aload_0
    //   105: iconst_3
    //   106: invokevirtual 440	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:vf	(I)V
    //   109: sipush 20355
    //   112: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: aconst_null
    //   116: astore_1
    //   117: goto -72 -> 45
    //   120: aload 7
    //   122: invokevirtual 239	com/tencent/mm/storage/ad:Oj	()Ljava/lang/String;
    //   125: astore 8
    //   127: aload 7
    //   129: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   132: invokestatic 244	com/tencent/mm/model/t:kH	(Ljava/lang/String;)Z
    //   135: ifeq +131 -> 266
    //   138: aload 7
    //   140: getfield 217	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   143: invokestatic 250	com/tencent/mm/model/s:mJ	(Ljava/lang/String;)Ljava/lang/String;
    //   146: astore 8
    //   148: iconst_1
    //   149: istore 9
    //   151: aload_2
    //   152: ifnull +56 -> 208
    //   155: aload_2
    //   156: ldc 170
    //   158: invokevirtual 173	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   161: ifeq +47 -> 208
    //   164: new 276	android/database/MatrixCursor
    //   167: dup
    //   168: getstatic 62	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:lQf	[Ljava/lang/String;
    //   171: invokespecial 279	android/database/MatrixCursor:<init>	([Ljava/lang/String;)V
    //   174: astore_2
    //   175: aload_0
    //   176: aload_2
    //   177: aload 6
    //   179: aload 7
    //   181: iload 9
    //   183: aload 8
    //   185: iload_3
    //   186: aload_1
    //   187: iconst_0
    //   188: aaload
    //   189: invokespecial 297	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:a	(Landroid/database/MatrixCursor;Lcom/tencent/mm/storage/bi;Lcom/tencent/mm/storage/ad;ZLjava/lang/String;ZLjava/lang/String;)V
    //   192: aload_0
    //   193: iconst_0
    //   194: invokevirtual 440	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:vf	(I)V
    //   197: sipush 20355
    //   200: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: aload_2
    //   204: astore_1
    //   205: goto -160 -> 45
    //   208: iconst_0
    //   209: istore_3
    //   210: goto -46 -> 164
    //   213: astore_1
    //   214: aconst_null
    //   215: astore_2
    //   216: ldc 128
    //   218: aload_1
    //   219: invokevirtual 306	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   222: invokestatic 148	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   225: ldc 128
    //   227: aload_1
    //   228: ldc_w 308
    //   231: iconst_0
    //   232: anewarray 139	java/lang/Object
    //   235: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_2
    //   239: ifnull +7 -> 246
    //   242: aload_2
    //   243: invokevirtual 313	android/database/MatrixCursor:close	()V
    //   246: aload_0
    //   247: iconst_4
    //   248: invokevirtual 440	com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg:vf	(I)V
    //   251: sipush 20355
    //   254: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: aconst_null
    //   258: astore_1
    //   259: goto -214 -> 45
    //   262: astore_1
    //   263: goto -47 -> 216
    //   266: iconst_0
    //   267: istore 9
    //   269: goto -118 -> 151
    //
    // Exception table:
    //   from	to	target	type
    //   47	90	213	java/lang/Exception
    //   95	104	213	java/lang/Exception
    //   104	109	213	java/lang/Exception
    //   120	148	213	java/lang/Exception
    //   155	164	213	java/lang/Exception
    //   164	175	213	java/lang/Exception
    //   175	197	262	java/lang/Exception
  }

  private Cursor brN()
  {
    AppMethodBeat.i(20354);
    ab.d("MicroMsg.ExtControlProviderMsg", "getUnReadUserList()");
    MatrixCursor localMatrixCursor = new MatrixCursor(lQh);
    try
    {
      aw.ZK();
      Cursor localCursor = c.XO().bOE();
      ad localad;
      if (localCursor != null)
        if (localCursor.moveToFirst())
        {
          String str = localCursor.getString(localCursor.getColumnIndex("talker"));
          aw.ZK();
          localad = c.XM().aoO(str);
          if (!t.kH(str))
            if ((!t.nI(localad.field_username)) && (!t.nG(localad.field_username)) && (!ad.Mn(localad.field_verifyFlag)) && (!t.ny(localad.field_username)) && (!t.nz(localad.field_username)))
              break label221;
        }
      label221: for (int i = 0; ; i = 1)
      {
        if (i == 0)
          localMatrixCursor.addRow(new Object[] { com.tencent.mm.plugin.ext.a.a.ii((int)localad.ewQ), Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("unReadCount"))) });
        if (localCursor.moveToNext())
          break;
        localCursor.close();
        vf(0);
        AppMethodBeat.o(20354);
        return localMatrixCursor;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
        localMatrixCursor.close();
        vf(4);
        localMatrixCursor = null;
        AppMethodBeat.o(20354);
      }
    }
  }

  private Cursor v(String[] paramArrayOfString)
  {
    AppMethodBeat.i(20352);
    ab.d("MicroMsg.ExtControlProviderMsg", "getUnReadCount()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      vf(3);
      AppMethodBeat.o(20352);
      paramArrayOfString = null;
    }
    while (true)
    {
      return paramArrayOfString;
      MatrixCursor localMatrixCursor = new MatrixCursor(lQg);
      try
      {
        if ("*".equals(paramArrayOfString[0]))
        {
          aw.ZK();
          localMatrixCursor.addRow(new Object[] { "0", Integer.valueOf(c.XR().nR("")) });
        }
        while (true)
        {
          vf(0);
          AppMethodBeat.o(20352);
          paramArrayOfString = localMatrixCursor;
          break;
          for (int i = 0; i < paramArrayOfString.length; i++)
          {
            long l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString[i]);
            aw.ZK();
            ad localad = c.XM().mQ(l);
            if ((localad != null) && ((int)localad.ewQ > 0))
            {
              aw.ZK();
              be localbe = c.XR();
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>(" and ( rconversation.username='");
              localMatrixCursor.addRow(new Object[] { Long.valueOf(l), Integer.valueOf(localbe.nR(localad.field_username + "' );")) });
            }
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        localMatrixCursor.close();
        vf(4);
        AppMethodBeat.o(20352);
        paramArrayOfString = null;
      }
    }
  }

  private Cursor w(String[] paramArrayOfString)
  {
    Object localObject = null;
    AppMethodBeat.i(20356);
    ab.d("MicroMsg.ExtControlProviderMsg", "handleRecordMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      ab.w("MicroMsg.ExtControlProviderMsg", "wrong args");
      vf(3);
      AppMethodBeat.o(20356);
      paramArrayOfString = localObject;
    }
    while (true)
    {
      return paramArrayOfString;
      try
      {
        int i = Integer.valueOf(paramArrayOfString[0]).intValue();
        long l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString[1]);
        if (l <= 0L)
        {
          vf(3);
          AppMethodBeat.o(20356);
          paramArrayOfString = localObject;
        }
        else
        {
          com.tencent.mm.pluginsdk.d.a.b localb = new com/tencent/mm/pluginsdk/d/a/b;
          localb.<init>();
          ExtControlProviderMsg.1 local1 = new com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg$1;
          local1.<init>(this, i, l, localb, paramArrayOfString);
          localb.b(4000L, local1);
          paramArrayOfString = this.lQl;
          AppMethodBeat.o(20356);
        }
      }
      catch (Exception paramArrayOfString)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        if (this.lQl != null)
          this.lQl.close();
        vf(4);
        AppMethodBeat.o(20356);
        paramArrayOfString = localObject;
      }
    }
  }

  private Cursor x(String[] paramArrayOfString)
  {
    AppMethodBeat.i(20357);
    ab.d("MicroMsg.ExtControlProviderMsg", "handlePlayVoice()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      ab.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      vf(3);
      paramArrayOfString = null;
      AppMethodBeat.o(20357);
    }
    while (true)
    {
      return paramArrayOfString;
      fs localfs = null;
      try
      {
        int i = Integer.valueOf(paramArrayOfString[0]).intValue();
        long l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString[1]);
        if (l <= 0L)
        {
          vf(3);
          paramArrayOfString = null;
          AppMethodBeat.o(20357);
          continue;
        }
        if (i == 3)
        {
          localObject = new MatrixCursor(lQj);
          try
          {
            localfs = new com/tencent/mm/g/a/fs;
            localfs.<init>();
            localfs.czI.cvx = l;
            com.tencent.mm.sdk.b.a.xxA.m(localfs);
            if ((localfs.czJ.fileName == null) || (localfs.czJ.fileName.length() <= 0))
            {
              ((MatrixCursor)localObject).addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(2) });
              vf(4);
              AppMethodBeat.o(20357);
              paramArrayOfString = (String[])localObject;
              continue;
            }
            fk localfk = new com/tencent/mm/g/a/fk;
            localfk.<init>();
            localfk.czf.op = 1;
            localfk.czf.fileName = localfs.czJ.fileName;
            if (com.tencent.mm.sdk.b.a.xxA.m(localfk))
            {
              ((MatrixCursor)localObject).addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(1) });
              vf(0);
            }
            while (true)
            {
              com.tencent.mm.plugin.ext.b.bry();
              com.tencent.mm.plugin.ext.b.ih(l);
              AppMethodBeat.o(20357);
              paramArrayOfString = (String[])localObject;
              break;
              ab.e("MicroMsg.ExtControlProviderMsg", "play failed");
              ((MatrixCursor)localObject).addRow(new Object[] { paramArrayOfString[1], Integer.valueOf(2) });
              vf(4);
            }
          }
          catch (Exception paramArrayOfString)
          {
          }
          ab.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
          ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
          if (localObject != null)
            ((MatrixCursor)localObject).close();
          vf(4);
          paramArrayOfString = null;
          AppMethodBeat.o(20357);
          continue;
        }
        if (i == 4)
        {
          paramArrayOfString = new com/tencent/mm/g/a/fk;
          paramArrayOfString.<init>();
          paramArrayOfString.czf.op = 2;
          if (!com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfString))
            break label428;
          ab.i("MicroMsg.ExtControlProviderMsg", "stop last playing");
          vf(0);
        }
        while (true)
        {
          paramArrayOfString = null;
          AppMethodBeat.o(20357);
          break;
          label428: ab.i("MicroMsg.ExtControlProviderMsg", "stop last playing fail");
          vf(4);
        }
      }
      catch (Exception paramArrayOfString)
      {
        while (true)
          Object localObject = localfs;
      }
    }
  }

  private Cursor y(String[] paramArrayOfString)
  {
    AppMethodBeat.i(20358);
    ab.i("MicroMsg.ExtControlProviderMsg", "setMsgReaded()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      dZ(3, 3801);
      paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(3801);
      AppMethodBeat.o(20358);
    }
    while (true)
    {
      return paramArrayOfString;
      int i = 0;
      try
      {
        if (i >= paramArrayOfString.length)
          break label160;
        if ((paramArrayOfString[i] == null) || (paramArrayOfString[i].length() <= 0))
          ab.w("MicroMsg.ExtControlProviderMsg", "setMsgReaded() wrongArgs i = ".concat(String.valueOf(i)));
        while (true)
        {
          i++;
          break;
          long l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString[i]);
          com.tencent.mm.plugin.ext.b.bry();
          com.tencent.mm.plugin.ext.b.ih(l);
        }
      }
      catch (Exception paramArrayOfString)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        dZ(4, 12);
        paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(12);
        AppMethodBeat.o(20358);
      }
      continue;
      label160: dZ(0, 1);
      paramArrayOfString = com.tencent.mm.pluginsdk.d.a.a.Kn(1);
      AppMethodBeat.o(20358);
    }
  }

  private Cursor z(String[] paramArrayOfString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(20359);
    ab.d("MicroMsg.ExtControlProviderMsg", "sendTextMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      ab.e("MicroMsg.ExtControlProviderMsg", "wrong args");
      vf(3);
      AppMethodBeat.o(20359);
      paramArrayOfString = localObject1;
    }
    while (true)
    {
      return paramArrayOfString;
      try
      {
        long l = com.tencent.mm.plugin.ext.a.a.Le(paramArrayOfString[0]);
        if (l <= 0L)
        {
          vf(3);
          AppMethodBeat.o(20359);
          paramArrayOfString = localObject1;
        }
        else
        {
          com.tencent.mm.plugin.ext.b.bry();
          ad localad = com.tencent.mm.plugin.ext.b.ig(l);
          if ((localad == null) || ((int)localad.ewQ <= 0))
          {
            ab.e("MicroMsg.ExtControlProviderMsg", "toContact is null ");
            vf(3);
            AppMethodBeat.o(20359);
            paramArrayOfString = localObject1;
          }
          else
          {
            Object localObject2 = new android/database/MatrixCursor;
            ((MatrixCursor)localObject2).<init>(lQk);
            this.lQl = ((MatrixCursor)localObject2);
            localObject2 = new com/tencent/mm/pluginsdk/d/a/b;
            ((com.tencent.mm.pluginsdk.d.a.b)localObject2).<init>();
            ExtControlProviderMsg.2 local2 = new com/tencent/mm/plugin/ext/provider/ExtControlProviderMsg$2;
            local2.<init>(this, localad, paramArrayOfString, (com.tencent.mm.pluginsdk.d.a.b)localObject2);
            ((com.tencent.mm.pluginsdk.d.a.b)localObject2).b(15000L, local2);
            paramArrayOfString = this.lQl;
            AppMethodBeat.o(20359);
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        ab.e("MicroMsg.ExtControlProviderMsg", paramArrayOfString.getMessage());
        ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", paramArrayOfString, "", new Object[0]);
        if (this.lQl != null)
          this.lQl.close();
        vf(4);
        AppMethodBeat.o(20359);
        paramArrayOfString = localObject1;
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString1 = null;
    AppMethodBeat.i(20351);
    ab.i("MicroMsg.ExtControlProviderMsg", "ExtControlProviderMsg query() mIsLocalUsed :" + this.lQd);
    if (this.lQd)
    {
      a(paramUri, this.lQe, this.lPO, this.lPN);
      if (bo.isNullOrNil(this.lPW))
      {
        ab.e("MicroMsg.ExtControlProviderMsg", "AppID == null");
        dZ(3, 7);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(7);
        AppMethodBeat.o(20351);
      }
    }
    while (true)
    {
      return paramUri;
      if (bo.isNullOrNil(brL()))
      {
        ab.e("MicroMsg.ExtControlProviderMsg", "PkgName == null");
        dZ(3, 6);
        paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(6);
        AppMethodBeat.o(20351);
      }
      else
      {
        int i = brM();
        if (i != 1)
        {
          ab.e("MicroMsg.ExtControlProviderMsg", "invalid appid ! return code = ".concat(String.valueOf(i)));
          dZ(2, i);
          paramUri = com.tencent.mm.pluginsdk.d.a.a.Kn(i);
          AppMethodBeat.o(20351);
          continue;
          this.lQe = getContext();
          a(paramUri, this.lQe, lQc);
          if (paramUri == null)
          {
            vf(3);
            AppMethodBeat.o(20351);
            paramUri = paramArrayOfString1;
          }
          else if ((bo.isNullOrNil(this.lPW)) || (bo.isNullOrNil(brL())))
          {
            vf(3);
            AppMethodBeat.o(20351);
            paramUri = paramArrayOfString1;
          }
          else if (!aVl())
          {
            vf(1);
            paramUri = this.jDN;
            AppMethodBeat.o(20351);
          }
          else if (!dJ(this.lQe))
          {
            ab.w("MicroMsg.ExtControlProviderMsg", "invalid appid ! return null");
            vf(2);
            AppMethodBeat.o(20351);
            paramUri = paramArrayOfString1;
          }
        }
        else
        {
          paramString2 = bo.nullAsNil(paramUri.getQueryParameter("source"));
          paramString1 = bo.nullAsNil(paramUri.getQueryParameter("count"));
          if (!this.lQd)
            this.lPO = lQc.match(paramUri);
          switch (this.lPO)
          {
          default:
            dZ(3, 15);
            AppMethodBeat.o(20351);
            paramUri = paramArrayOfString1;
            break;
          case 7:
            paramUri = b(paramArrayOfString2, paramString2);
            AppMethodBeat.o(20351);
            break;
          case 8:
            paramUri = v(paramArrayOfString2);
            AppMethodBeat.o(20351);
            break;
          case 9:
            paramUri = a(paramArrayOfString2, paramString2, paramString1);
            AppMethodBeat.o(20351);
            break;
          case 10:
            paramUri = brN();
            AppMethodBeat.o(20351);
            break;
          case 11:
            paramUri = w(paramArrayOfString2);
            AppMethodBeat.o(20351);
            break;
          case 12:
            paramUri = x(paramArrayOfString2);
            AppMethodBeat.o(20351);
            break;
          case 13:
            paramUri = y(paramArrayOfString2);
            AppMethodBeat.o(20351);
            break;
          case 14:
            paramUri = z(paramArrayOfString2);
            AppMethodBeat.o(20351);
          }
        }
      }
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg
 * JD-Core Version:    0.6.2
 */