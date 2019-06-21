package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.f;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.bf.a;
import com.tencent.mm.g.a.cs;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class j
{
  private static String kTY = "";
  private static String kTZ = "temp";
  static String kUa = "newemoji";
  private static String kUb = "panel";
  public static String kUc = "suggest";
  public static String kUd = "egg";
  private static String kUe = "search";
  private static String kUf = "config.conf";
  private static String kUg = "emojipanel.zip";
  private static String kUh = "newemoji.zip";
  private static String kUi = "emoji_template.zip";
  private static String kUj = "emojisuggest.zip";
  private static String kUk = "egg.zip";
  private static String kUl = "newemoji-config.xml";
  private static String kUm = "emojipanel-config.xml";
  public static String kUn = "emojisuggest-config.xml";
  public static String kUo = "egg.xml";
  private static int kUp = 0;
  private static int kUq = 0;
  private static int kUr = 0;
  private static int kUs = 0;
  private static j kUt;
  public f kUu;

  public static void a(bf parambf, boolean paramBoolean)
  {
    AppMethodBeat.i(52972);
    if ((paramBoolean) || (a(parambf, j.a.kUw)))
      if ((a(parambf, j.a.kUw, kUa)) || (paramBoolean))
      {
        parambf = new com.tencent.mm.vfs.b(new com.tencent.mm.vfs.b(getDataEmojiPath(), kUa), kUl);
        if (parambf.exists())
        {
          parambf = com.tencent.mm.emoji.e.a.a(parambf);
          if ((!parambf.isEmpty()) && (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().w(parambf)))
          {
            parambf = new cs();
            parambf.cvT.cuu = 1;
            com.tencent.mm.sdk.b.a.xxA.m(parambf);
            kUp = g(new com.tencent.mm.vfs.b(getDataEmojiPath() + "/" + kUa, kUf));
            g.RP().Ry().set(ac.a.xJw, Integer.valueOf(kUp));
          }
          AppMethodBeat.o(52972);
        }
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji config don't exist.");
      AppMethodBeat.o(52972);
      continue;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji unzip file failed.");
      AppMethodBeat.o(52972);
      continue;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji need no update.");
      AppMethodBeat.o(52972);
    }
  }

  public static boolean a(bf parambf, j.a parama)
  {
    AppMethodBeat.i(52968);
    int i;
    int j;
    if (a(parambf, parama, kTZ))
    {
      parambf = new com.tencent.mm.vfs.b(getDataEmojiPath(), kTZ);
      ab.d("MicroMsg.emoji.EmojiResUpdateMgr", "readVersionCode unzip file done.");
      i = g(new com.tencent.mm.vfs.b(parambf, kUf));
      switch (1.kUv[parama.ordinal()])
      {
      default:
        j = -1;
        label98: ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "file version:%d, current version:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if ((i != -1) && (j < i))
          AppMethodBeat.o(52968);
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "unzip file failed. type:%s", new Object[] { String.valueOf(parama) });
      i = -1;
      break;
      j = ((Integer)g.RP().Ry().get(ac.a.xJw, Integer.valueOf(0))).intValue();
      kUp = j;
      break label98;
      j = ((Integer)g.RP().Ry().get(ac.a.xJx, Integer.valueOf(0))).intValue();
      kUq = j;
      break label98;
      j = com.tencent.mm.ao.a.fAH;
      break label98;
      j = ((Integer)g.RP().Ry().get(ac.a.xJy, Integer.valueOf(0))).intValue();
      kUr = j;
      break label98;
      j = ((Integer)g.RP().Ry().get(ac.a.xJz, Integer.valueOf(0))).intValue();
      kUs = j;
      break label98;
      AppMethodBeat.o(52968);
    }
  }

  public static boolean a(bf parambf, j.a parama, String paramString)
  {
    AppMethodBeat.i(52966);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(parambf.cus.filePath);
    boolean bool;
    if ((localb.exists()) && (localb.length() > 0L))
    {
      long l = System.currentTimeMillis();
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "copyAndUnzipFile start. type:%s filePath:%s", new Object[] { String.valueOf(parama), com.tencent.mm.vfs.j.w(localb.dMD()) });
      paramString = new com.tencent.mm.vfs.b(getDataEmojiPath(), paramString);
      if (paramString.exists())
        com.tencent.mm.vfs.e.N(com.tencent.mm.vfs.j.w(paramString.mUri), true);
      switch (1.kUv[parama.ordinal()])
      {
      default:
        ab.w("MicroMsg.emoji.EmojiResUpdateMgr", "unknown type. type:%s", new Object[] { String.valueOf(parama) });
        parambf = "";
        parambf = new com.tencent.mm.vfs.b(paramString, parambf);
        paramString.mkdirs();
        com.tencent.mm.vfs.e.y(com.tencent.mm.vfs.j.w(localb.dMD()), com.tencent.mm.vfs.j.w(parambf.dMD()));
        int i = bo.hU(com.tencent.mm.vfs.j.w(parambf.dMD()), com.tencent.mm.vfs.j.w(paramString.dMD()));
        com.tencent.mm.vfs.e.deleteFile(com.tencent.mm.vfs.j.w(parambf.mUri));
        ab.d("MicroMsg.emoji.EmojiResUpdateMgr", "copyAndUnzipFile done. user time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        if (i >= 0)
        {
          AppMethodBeat.o(52966);
          bool = true;
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    while (true)
    {
      return bool;
      parambf = kUh;
      break;
      parambf = kUg;
      break;
      parambf = kUi;
      break;
      parambf = kUj;
      break;
      parambf = kUk;
      break;
      AppMethodBeat.o(52966);
      bool = false;
      continue;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "copyAndUnzipFile update file don't exist.");
      AppMethodBeat.o(52966);
      bool = false;
    }
  }

  public static void b(bf parambf, boolean paramBoolean)
  {
    AppMethodBeat.i(52973);
    Object localObject1;
    Object localObject2;
    int i;
    if ((!paramBoolean) && (!a(parambf, j.a.kUx)))
    {
      localObject1 = (String)g.RP().Ry().get(ac.a.xJA, kUm);
      localObject2 = com.tencent.mm.emoji.a.e.OP();
      if ((!bo.isNullOrNil((String)localObject2)) && (!((String)localObject1).equalsIgnoreCase((String)localObject2)))
      {
        i = 1;
        if (i == 0)
          break label367;
      }
    }
    else
    {
      if ((!a(parambf, j.a.kUx, kUb)) && (!paramBoolean))
        break label350;
      localObject1 = new com.tencent.mm.vfs.b(getDataEmojiPath(), kUb);
      localObject2 = com.tencent.mm.emoji.a.e.OP();
      if (!bo.isNullOrNil((String)localObject2))
        break label282;
      parambf = kUm;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "no dynamic config panel file name. use default.");
      label120: localObject2 = new com.tencent.mm.vfs.b((com.tencent.mm.vfs.b)localObject1, parambf);
      if (!((com.tencent.mm.vfs.b)localObject2).exists())
        break label333;
      localObject2 = com.tencent.mm.emoji.e.a.b((com.tencent.mm.vfs.b)localObject2);
      if (((ArrayList)localObject2).isEmpty())
        break label322;
      if (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().x((ArrayList)localObject2))
      {
        localObject2 = new cs();
        ((cs)localObject2).cvT.cuu = 2;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        kUq = g(new com.tencent.mm.vfs.b(getDataEmojiPath() + "/" + kUb, kUf));
        g.RP().Ry().set(ac.a.xJx, Integer.valueOf(kUq));
      }
      label256: g.RP().Ry().set(ac.a.xJA, parambf);
      AppMethodBeat.o(52973);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label282: parambf = (bf)localObject2;
      if (!new com.tencent.mm.vfs.b((com.tencent.mm.vfs.b)localObject1, (String)localObject2).exists())
        parambf = kUm;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "dynamic config panel file name :%s", new Object[] { parambf });
      break label120;
      label322: ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiPanelConfigFromFile smiley panel list is null.");
      break label256;
      label333: ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmojiPanel config don't exist.");
      AppMethodBeat.o(52973);
      continue;
      label350: ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmojiPanel unzip file failed.");
      AppMethodBeat.o(52973);
      continue;
      label367: ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmojiPanel need no update.");
      AppMethodBeat.o(52973);
    }
  }

  public static boolean b(bf parambf)
  {
    AppMethodBeat.i(52974);
    long l1 = System.currentTimeMillis();
    com.tencent.mm.cb.b.dqD();
    long l2 = com.tencent.mm.cb.b.dqD().xFH;
    com.tencent.mm.cb.b.dqD();
    int i = com.tencent.mm.cb.b.anS(parambf.cus.filePath);
    com.tencent.mm.cb.b.dqD();
    long l3 = com.tencent.mm.cb.b.anR(parambf.cus.filePath);
    ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "currentSupportVersion:%d current version:%d supportVersion:%d file version:%d use time:%d", new Object[] { Integer.valueOf(1), Long.valueOf(l2), Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(System.currentTimeMillis() - l1) });
    boolean bool;
    if ((i == 1) && (l3 > l2))
    {
      bool = true;
      AppMethodBeat.o(52974);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "need not update color emoji");
      bool = false;
      AppMethodBeat.o(52974);
    }
  }

  public static String bjS()
  {
    AppMethodBeat.i(52969);
    String str1 = com.tencent.mm.emoji.a.e.OP();
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = (String)g.RP().Ry().get(ac.a.xJA, kUm);
    AppMethodBeat.o(52969);
    return str2;
  }

  public static j bkb()
  {
    AppMethodBeat.i(52964);
    if (kUt == null);
    try
    {
      j localj = new com/tencent/mm/plugin/emoji/e/j;
      localj.<init>();
      kUt = localj;
      localj = kUt;
      AppMethodBeat.o(52964);
      return localj;
    }
    finally
    {
      AppMethodBeat.o(52964);
    }
  }

  // ERROR //
  private static int g(com.tencent.mm.vfs.b paramb)
  {
    // Byte code:
    //   0: ldc_w 456
    //   3: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 332	java/lang/System:currentTimeMillis	()J
    //   9: lstore_1
    //   10: iconst_m1
    //   11: istore_3
    //   12: aload_0
    //   13: invokevirtual 152	com/tencent/mm/vfs/b:exists	()Z
    //   16: ifeq +371 -> 387
    //   19: new 458	com/tencent/mm/vfs/d
    //   22: astore 4
    //   24: aload 4
    //   26: aload_0
    //   27: invokespecial 461	com/tencent/mm/vfs/d:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   30: new 463	java/io/InputStreamReader
    //   33: astore 5
    //   35: aload 5
    //   37: aload 4
    //   39: invokespecial 466	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   42: new 468	java/io/BufferedReader
    //   45: astore_0
    //   46: aload_0
    //   47: aload 5
    //   49: invokespecial 471	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   52: ldc 39
    //   54: astore 6
    //   56: aload_0
    //   57: astore 7
    //   59: aload 5
    //   61: astore 8
    //   63: aload 4
    //   65: astore 9
    //   67: iload_3
    //   68: istore 10
    //   70: aload_0
    //   71: invokevirtual 474	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   74: astore 11
    //   76: aload 11
    //   78: ifnull +75 -> 153
    //   81: aload_0
    //   82: astore 7
    //   84: aload 5
    //   86: astore 8
    //   88: aload 4
    //   90: astore 9
    //   92: iload_3
    //   93: istore 10
    //   95: new 204	java/lang/StringBuilder
    //   98: astore 12
    //   100: aload_0
    //   101: astore 7
    //   103: aload 5
    //   105: astore 8
    //   107: aload 4
    //   109: astore 9
    //   111: iload_3
    //   112: istore 10
    //   114: aload 12
    //   116: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   119: aload_0
    //   120: astore 7
    //   122: aload 5
    //   124: astore 8
    //   126: aload 4
    //   128: astore 9
    //   130: iload_3
    //   131: istore 10
    //   133: aload 12
    //   135: aload 6
    //   137: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload 11
    //   142: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: astore 6
    //   150: goto -94 -> 56
    //   153: aload_0
    //   154: astore 7
    //   156: aload 5
    //   158: astore 8
    //   160: aload 4
    //   162: astore 9
    //   164: iload_3
    //   165: istore 10
    //   167: new 476	org/json/JSONObject
    //   170: astore 12
    //   172: aload_0
    //   173: astore 7
    //   175: aload 5
    //   177: astore 8
    //   179: aload 4
    //   181: astore 9
    //   183: iload_3
    //   184: istore 10
    //   186: aload 12
    //   188: aload 6
    //   190: invokespecial 477	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   193: aload_0
    //   194: astore 7
    //   196: aload 5
    //   198: astore 8
    //   200: aload 4
    //   202: astore 9
    //   204: iload_3
    //   205: istore 10
    //   207: aload 12
    //   209: ldc_w 479
    //   212: invokevirtual 482	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   215: istore_3
    //   216: aload_0
    //   217: astore 7
    //   219: aload 5
    //   221: astore 8
    //   223: aload 4
    //   225: astore 9
    //   227: iload_3
    //   228: istore 10
    //   230: ldc 251
    //   232: ldc_w 484
    //   235: iconst_2
    //   236: anewarray 4	java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: aload 6
    //   243: aastore
    //   244: dup
    //   245: iconst_1
    //   246: iload_3
    //   247: invokestatic 240	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   250: aastore
    //   251: invokestatic 383	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: aload 4
    //   256: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   259: aload 5
    //   261: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   264: aload_0
    //   265: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   268: iload_3
    //   269: istore 10
    //   271: ldc 251
    //   273: ldc_w 489
    //   276: iconst_1
    //   277: anewarray 4	java/lang/Object
    //   280: dup
    //   281: iconst_0
    //   282: invokestatic 332	java/lang/System:currentTimeMillis	()J
    //   285: lload_1
    //   286: lsub
    //   287: invokestatic 381	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   290: aastore
    //   291: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   294: ldc_w 456
    //   297: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: iload 10
    //   302: ireturn
    //   303: astore 6
    //   305: aconst_null
    //   306: astore_0
    //   307: aconst_null
    //   308: astore 5
    //   310: aconst_null
    //   311: astore 4
    //   313: iload_3
    //   314: istore 10
    //   316: aload_0
    //   317: astore 7
    //   319: aload 5
    //   321: astore 8
    //   323: aload 4
    //   325: astore 9
    //   327: ldc 251
    //   329: aload 6
    //   331: invokestatic 493	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   334: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   337: aload 4
    //   339: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   342: aload 5
    //   344: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   347: aload_0
    //   348: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   351: goto -80 -> 271
    //   354: astore_0
    //   355: aconst_null
    //   356: astore 6
    //   358: aconst_null
    //   359: astore 5
    //   361: aconst_null
    //   362: astore 4
    //   364: aload 4
    //   366: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   369: aload 5
    //   371: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   374: aload 6
    //   376: invokestatic 487	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   379: ldc_w 456
    //   382: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   385: aload_0
    //   386: athrow
    //   387: ldc 251
    //   389: ldc_w 498
    //   392: iconst_1
    //   393: anewarray 4	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: aload_0
    //   399: invokevirtual 338	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   402: invokestatic 343	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   405: aastore
    //   406: invokestatic 280	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   409: iload_3
    //   410: istore 10
    //   412: goto -141 -> 271
    //   415: astore_0
    //   416: aconst_null
    //   417: astore 6
    //   419: aconst_null
    //   420: astore 5
    //   422: goto -58 -> 364
    //   425: astore_0
    //   426: aconst_null
    //   427: astore 6
    //   429: goto -65 -> 364
    //   432: astore_0
    //   433: aload 7
    //   435: astore 6
    //   437: aload 8
    //   439: astore 5
    //   441: aload 9
    //   443: astore 4
    //   445: goto -81 -> 364
    //   448: astore 6
    //   450: aconst_null
    //   451: astore_0
    //   452: aconst_null
    //   453: astore 5
    //   455: iload_3
    //   456: istore 10
    //   458: goto -142 -> 316
    //   461: astore 6
    //   463: aconst_null
    //   464: astore_0
    //   465: iload_3
    //   466: istore 10
    //   468: goto -152 -> 316
    //   471: astore 6
    //   473: goto -157 -> 316
    //
    // Exception table:
    //   from	to	target	type
    //   19	30	303	java/lang/Exception
    //   19	30	354	finally
    //   30	42	415	finally
    //   42	52	425	finally
    //   70	76	432	finally
    //   95	100	432	finally
    //   114	119	432	finally
    //   133	150	432	finally
    //   167	172	432	finally
    //   186	193	432	finally
    //   207	216	432	finally
    //   230	254	432	finally
    //   327	337	432	finally
    //   30	42	448	java/lang/Exception
    //   42	52	461	java/lang/Exception
    //   70	76	471	java/lang/Exception
    //   95	100	471	java/lang/Exception
    //   114	119	471	java/lang/Exception
    //   133	150	471	java/lang/Exception
    //   167	172	471	java/lang/Exception
    //   186	193	471	java/lang/Exception
    //   207	216	471	java/lang/Exception
    //   230	254	471	java/lang/Exception
  }

  public static String getDataEmojiPath()
  {
    AppMethodBeat.i(52965);
    if (bo.isNullOrNil(kTY))
    {
      kTY = com.tencent.mm.compatible.util.e.eSk.replace("/data/user/0", "/data/data");
      kTY += "/emoji";
    }
    String str = kTY;
    AppMethodBeat.o(52965);
    return str;
  }

  // ERROR //
  public static void h(com.tencent.mm.vfs.b paramb)
  {
    // Byte code:
    //   0: ldc_w 518
    //   3: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 524	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   9: astore_1
    //   10: aload_0
    //   11: invokestatic 528	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   14: astore_2
    //   15: aconst_null
    //   16: astore_0
    //   17: aload_1
    //   18: invokevirtual 532	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   21: aload_2
    //   22: invokevirtual 538	javax/xml/parsers/DocumentBuilder:parse	(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    //   25: astore_1
    //   26: aload_1
    //   27: invokeinterface 543 1 0
    //   32: aload_1
    //   33: invokeinterface 547 1 0
    //   38: ldc_w 549
    //   41: invokeinterface 555 2 0
    //   46: astore_3
    //   47: aload_3
    //   48: ifnull +267 -> 315
    //   51: aload_3
    //   52: invokeinterface 560 1 0
    //   57: ifle +258 -> 315
    //   60: aload_3
    //   61: invokeinterface 560 1 0
    //   66: istore 4
    //   68: new 159	java/util/ArrayList
    //   71: astore 5
    //   73: aload 5
    //   75: invokespecial 561	java/util/ArrayList:<init>	()V
    //   78: iconst_0
    //   79: istore 6
    //   81: iload 6
    //   83: iload 4
    //   85: if_icmpge +150 -> 235
    //   88: aload_3
    //   89: iload 6
    //   91: invokeinterface 565 2 0
    //   96: invokeinterface 571 1 0
    //   101: astore 7
    //   103: aload 7
    //   105: ifnull +124 -> 229
    //   108: aload 7
    //   110: invokeinterface 560 1 0
    //   115: ifle +114 -> 229
    //   118: aload 7
    //   120: invokeinterface 560 1 0
    //   125: istore 8
    //   127: new 159	java/util/ArrayList
    //   130: astore_1
    //   131: aload_1
    //   132: invokespecial 561	java/util/ArrayList:<init>	()V
    //   135: iconst_0
    //   136: istore 9
    //   138: iload 9
    //   140: iload 8
    //   142: if_icmpge +80 -> 222
    //   145: aload 7
    //   147: iload 9
    //   149: invokeinterface 565 2 0
    //   154: astore 10
    //   156: aload 10
    //   158: invokeinterface 574 1 0
    //   163: ldc_w 576
    //   166: invokevirtual 580	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   169: ifeq +47 -> 216
    //   172: aload 10
    //   174: invokeinterface 583 1 0
    //   179: astore 10
    //   181: aload 10
    //   183: invokestatic 401	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   186: ifne +30 -> 216
    //   189: ldc 251
    //   191: ldc_w 585
    //   194: iconst_1
    //   195: anewarray 4	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload 10
    //   202: aastore
    //   203: invokestatic 383	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_1
    //   207: aload 10
    //   209: invokevirtual 588	java/lang/String:trim	()Ljava/lang/String;
    //   212: invokevirtual 591	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   215: pop
    //   216: iinc 9 1
    //   219: goto -81 -> 138
    //   222: aload 5
    //   224: aload_1
    //   225: invokevirtual 591	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   228: pop
    //   229: iinc 6 1
    //   232: goto -151 -> 81
    //   235: invokestatic 597	com/tencent/mm/plugin/emoji/model/j:getEmojiStorageMgr	()Lcom/tencent/mm/storage/at;
    //   238: getfield 603	com/tencent/mm/storage/at:xYx	Lcom/tencent/mm/storage/emotion/f;
    //   241: aload 5
    //   243: invokevirtual 608	com/tencent/mm/storage/emotion/f:am	(Ljava/util/ArrayList;)Z
    //   246: pop
    //   247: new 138	com/tencent/mm/vfs/b
    //   250: astore 7
    //   252: new 204	java/lang/StringBuilder
    //   255: astore_1
    //   256: aload_1
    //   257: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   260: aload 7
    //   262: aload_1
    //   263: invokestatic 142	com/tencent/mm/plugin/emoji/e/j:getDataEmojiPath	()Ljava/lang/String;
    //   266: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: ldc 211
    //   271: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: getstatic 57	com/tencent/mm/plugin/emoji/e/j:kUc	Ljava/lang/String;
    //   277: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: getstatic 69	com/tencent/mm/plugin/emoji/e/j:kUf	Ljava/lang/String;
    //   286: invokespecial 145	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   289: aload 7
    //   291: invokestatic 218	com/tencent/mm/plugin/emoji/e/j:g	(Lcom/tencent/mm/vfs/b;)I
    //   294: putstatic 111	com/tencent/mm/plugin/emoji/e/j:kUr	I
    //   297: invokestatic 222	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   300: invokevirtual 228	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   303: getstatic 305	com/tencent/mm/storage/ac$a:xJy	Lcom/tencent/mm/storage/ac$a;
    //   306: getstatic 111	com/tencent/mm/plugin/emoji/e/j:kUr	I
    //   309: invokestatic 240	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   312: invokevirtual 246	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   315: aload_2
    //   316: ifnull +89 -> 405
    //   319: aload_2
    //   320: invokevirtual 613	java/io/InputStream:close	()V
    //   323: ldc_w 518
    //   326: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   329: return
    //   330: astore_0
    //   331: ldc_w 518
    //   334: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   337: aload_0
    //   338: athrow
    //   339: astore_1
    //   340: aload_2
    //   341: ifnull +11 -> 352
    //   344: aload_0
    //   345: ifnull +53 -> 398
    //   348: aload_2
    //   349: invokevirtual 613	java/io/InputStream:close	()V
    //   352: ldc_w 518
    //   355: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   358: aload_1
    //   359: athrow
    //   360: astore_0
    //   361: ldc 251
    //   363: ldc_w 615
    //   366: iconst_1
    //   367: anewarray 4	java/lang/Object
    //   370: dup
    //   371: iconst_0
    //   372: aload_0
    //   373: invokevirtual 616	java/lang/Exception:toString	()Ljava/lang/String;
    //   376: aastore
    //   377: invokestatic 618	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   380: ldc_w 518
    //   383: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   386: goto -57 -> 329
    //   389: astore_2
    //   390: aload_0
    //   391: aload_2
    //   392: invokevirtual 622	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   395: goto -43 -> 352
    //   398: aload_2
    //   399: invokevirtual 613	java/io/InputStream:close	()V
    //   402: goto -50 -> 352
    //   405: ldc_w 518
    //   408: invokestatic 249	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -82 -> 329
    //   414: astore_1
    //   415: goto -75 -> 340
    //
    // Exception table:
    //   from	to	target	type
    //   17	47	330	java/lang/Throwable
    //   51	78	330	java/lang/Throwable
    //   88	103	330	java/lang/Throwable
    //   108	135	330	java/lang/Throwable
    //   145	216	330	java/lang/Throwable
    //   222	229	330	java/lang/Throwable
    //   235	315	330	java/lang/Throwable
    //   331	339	339	finally
    //   10	15	360	java/lang/Exception
    //   319	329	360	java/lang/Exception
    //   348	352	360	java/lang/Exception
    //   352	360	360	java/lang/Exception
    //   390	395	360	java/lang/Exception
    //   398	402	360	java/lang/Exception
    //   348	352	389	java/lang/Throwable
    //   17	47	414	finally
    //   51	78	414	finally
    //   88	103	414	finally
    //   108	135	414	finally
    //   145	216	414	finally
    //   222	229	414	finally
    //   235	315	414	finally
  }

  public static void i(com.tencent.mm.vfs.b paramb)
  {
    AppMethodBeat.i(52971);
    try
    {
      paramb = com.tencent.mm.vfs.e.cy(com.tencent.mm.vfs.j.w(paramb.dMD()));
      Object localObject1 = br.z(paramb, "EasterEgg");
      ab.i("MicroMsg.emoji.EmojiResUpdateMgr", "eggXml:".concat(String.valueOf(paramb)));
      if (localObject1 == null)
      {
        ab.e("MicroMsg.emoji.EmojiResUpdateMgr", "Exception in parseXml EasterEgg, please check the xml");
        AppMethodBeat.o(52971);
      }
      while (true)
      {
        return;
        f localf = new com/tencent/mm/ba/f;
        localf.<init>();
        localf.fMj = bo.ank((String)((Map)localObject1).get(".EasterEgg.$version"));
        for (int i = 0; ; i++)
        {
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(".EasterEgg.Item");
          com.tencent.mm.ba.d locald;
          int j;
          label565: Object localObject3;
          if (i == 0)
          {
            paramb = "";
            localObject2 = paramb;
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            if (((Map)localObject1).get((String)localObject2 + ".$name") == null)
              break;
            locald = new com/tencent/mm/ba/d;
            locald.<init>();
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.name = bo.nullAsNil((String)((Map)localObject1).get((String)localObject2 + ".$name"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMc = bo.nullAsNil((String)((Map)localObject1).get((String)localObject2 + ".$langs"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.cKB = bo.ank((String)((Map)localObject1).get((String)localObject2 + ".$reportType"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMa = bo.anb((String)((Map)localObject1).get((String)localObject2 + ".$BeginDate"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMb = bo.anb((String)((Map)localObject1).get((String)localObject2 + ".$EndDate"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMd = bo.nullAsNil((String)((Map)localObject1).get((String)localObject2 + ".FileName"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMe = bo.ank((String)((Map)localObject1).get((String)localObject2 + ".AnimType"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMf = bo.ank((String)((Map)localObject1).get((String)localObject2 + ".AnimType.$viewcount"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.fMg = bo.ank((String)((Map)localObject1).get((String)localObject2 + ".AnimType.$minSize"));
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            locald.maxSize = bo.ank((String)((Map)localObject1).get((String)localObject2 + ".AnimType.$maxSize"));
            j = 0;
            paramb = new java/lang/StringBuilder;
            paramb.<init>();
            localObject3 = paramb.append((String)localObject2).append(".KeyWord");
            if (j != 0)
              break label714;
          }
          label714: for (paramb = ""; ; paramb = Integer.valueOf(j))
          {
            paramb = paramb;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = paramb + ".$lang";
            if (((Map)localObject1).get(paramb) == null)
              break label723;
            com.tencent.mm.ba.e locale = new com/tencent/mm/ba/e;
            locale.<init>();
            locale.fMh = bo.nullAsNil((String)((Map)localObject1).get(paramb));
            locale.lang = bo.nullAsNil((String)((Map)localObject1).get(localObject3));
            locald.fLY.add(locale);
            j++;
            break label565;
            paramb = Integer.valueOf(i);
            break;
          }
          label723: localf.fMi.add(locald);
        }
        localObject1 = localf.toByteArray();
        paramb = new java/lang/StringBuilder;
        paramb.<init>();
        com.tencent.mm.vfs.e.b(g.RP().cachePath + "eggingfo.ini", (byte[])localObject1, localObject1.length);
        paramb = new com/tencent/mm/vfs/b;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        paramb.<init>(getDataEmojiPath() + "/" + kUd, kUf);
        kUs = g(paramb);
        g.RP().Ry().set(ac.a.xJz, Integer.valueOf(kUs));
        AppMethodBeat.o(52971);
      }
    }
    catch (Exception paramb)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", paramb, "", new Object[0]);
        AppMethodBeat.o(52971);
      }
    }
  }

  public final f bjQ()
  {
    AppMethodBeat.i(52975);
    try
    {
      Object localObject;
      if (this.kUu == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = com.tencent.mm.vfs.e.e(g.RP().cachePath + "eggingfo.ini", 0, -1);
        if (localObject != null)
          break label71;
        ab.d("MicroMsg.emoji.EmojiResUpdateMgr", "data is null, parse EggList from config file fail");
      }
      while (true)
      {
        localObject = this.kUu;
        AppMethodBeat.o(52975);
        return localObject;
        label71: f localf = new com/tencent/mm/ba/f;
        localf.<init>();
        this.kUu = ((f)localf.parseFrom((byte[])localObject));
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.emoji.EmojiResUpdateMgr", "init crash : %s, try delete egg file", new Object[] { localException.getLocalizedMessage() });
        ab.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", localException, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.j
 * JD-Core Version:    0.6.2
 */