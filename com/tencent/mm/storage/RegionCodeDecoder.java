package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;

public final class RegionCodeDecoder
{
  private static RegionCodeDecoder xZR;
  public static final String xZS;
  public String xZT = "";
  private String xZU = "";

  static
  {
    AppMethodBeat.i(60229);
    xZR = null;
    xZS = com.tencent.mm.compatible.util.e.eSi + "MicroMsg/regioncode/";
    AppMethodBeat.o(60229);
  }

  // ERROR //
  public static void a(b paramb1, b paramb2)
  {
    // Byte code:
    //   0: ldc 65
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 67
    //   7: ldc 69
    //   9: iconst_1
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_0
    //   16: invokevirtual 74	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   19: aastore
    //   20: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: new 71	com/tencent/mm/vfs/b
    //   26: dup
    //   27: aload_1
    //   28: new 29	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   35: aload_0
    //   36: invokevirtual 74	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   39: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc 81
    //   44: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokespecial 84	com/tencent/mm/vfs/b:<init>	(Lcom/tencent/mm/vfs/b;Ljava/lang/String;)V
    //   53: astore_1
    //   54: aload_0
    //   55: invokestatic 88	com/tencent/mm/storage/RegionCodeDecoder:m	(Lcom/tencent/mm/vfs/b;)Ljava/lang/String;
    //   58: astore_2
    //   59: aload_2
    //   60: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   63: ifne +120 -> 183
    //   66: aload_1
    //   67: invokevirtual 98	com/tencent/mm/vfs/b:exists	()Z
    //   70: ifne +11 -> 81
    //   73: aload_1
    //   74: invokevirtual 102	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   77: invokevirtual 105	com/tencent/mm/vfs/b:mkdirs	()Z
    //   80: pop
    //   81: new 107	com/tencent/mm/vfs/h
    //   84: astore_3
    //   85: aload_3
    //   86: aload_1
    //   87: invokespecial 110	com/tencent/mm/vfs/h:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   90: aload_3
    //   91: astore_1
    //   92: aload_3
    //   93: aload_2
    //   94: invokevirtual 116	java/io/Writer:write	(Ljava/lang/String;)V
    //   97: aload_3
    //   98: invokevirtual 119	java/io/Writer:close	()V
    //   101: ldc 65
    //   103: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: return
    //   107: astore_0
    //   108: ldc 65
    //   110: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: goto -7 -> 106
    //   116: astore_2
    //   117: aconst_null
    //   118: astore_3
    //   119: aload_3
    //   120: astore_1
    //   121: ldc 67
    //   123: aload_2
    //   124: ldc 121
    //   126: iconst_1
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload_0
    //   133: invokevirtual 74	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   136: aastore
    //   137: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload_3
    //   141: ifnull +42 -> 183
    //   144: aload_3
    //   145: invokevirtual 119	java/io/Writer:close	()V
    //   148: ldc 65
    //   150: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: goto -47 -> 106
    //   156: astore_0
    //   157: ldc 65
    //   159: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -56 -> 106
    //   165: astore_0
    //   166: aconst_null
    //   167: astore_1
    //   168: aload_1
    //   169: ifnull +7 -> 176
    //   172: aload_1
    //   173: invokevirtual 119	java/io/Writer:close	()V
    //   176: ldc 65
    //   178: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload_0
    //   182: athrow
    //   183: ldc 65
    //   185: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: goto -82 -> 106
    //   191: astore_1
    //   192: goto -16 -> 176
    //   195: astore_0
    //   196: goto -28 -> 168
    //   199: astore_2
    //   200: goto -81 -> 119
    //
    // Exception table:
    //   from	to	target	type
    //   97	101	107	java/lang/Throwable
    //   81	90	116	java/lang/Throwable
    //   144	148	156	java/lang/Throwable
    //   81	90	165	finally
    //   172	176	191	java/lang/Throwable
    //   92	97	195	finally
    //   121	140	195	finally
    //   92	97	199	java/lang/Throwable
  }

  public static final String aC(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(60219);
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bo.isNullOrNil(paramString1))
    {
      localStringBuffer.append(paramString1);
      if (!bo.isNullOrNil(paramString2))
      {
        localStringBuffer.append('_');
        localStringBuffer.append(paramString2);
        if (!bo.isNullOrNil(paramString3))
        {
          localStringBuffer.append('_');
          localStringBuffer.append(paramString3);
        }
      }
    }
    paramString1 = localStringBuffer.toString();
    AppMethodBeat.o(60219);
    return paramString1;
  }

  public static String aD(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(60225);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)))
    {
      paramString1 = null;
      if (!bo.isNullOrNil(paramString1))
        break label60;
      paramString1 = bo.nullAsNil(paramString3);
      AppMethodBeat.o(60225);
    }
    while (true)
    {
      return paramString1;
      paramString1 = getLocName(aC(paramString1, paramString2, paramString3));
      break;
      label60: AppMethodBeat.o(60225);
    }
  }

  private static String apO(String paramString)
  {
    AppMethodBeat.i(60213);
    b localb = new b(paramString);
    Object localObject = l(localb);
    boolean bool;
    int i;
    if (bo.isNullOrNil((String)localObject))
    {
      bool = false;
      if (bool)
        break label198;
      if (com.tencent.mm.vfs.e.y("assets:///regioncode/" + localb.getName(), paramString) <= 0L)
        break label136;
      i = 1;
      label63: if (i != 0)
        break label148;
      localObject = new b(localb.dMC(), "mmregioncode_en.txt");
      paramString = j.w(((b)localObject).dMD());
      if (com.tencent.mm.vfs.e.y("assets:///regioncode/mmregioncode_en.txt", j.w(((b)localObject).dMD())) <= 0L)
        break label142;
      i = 1;
      label110: if (i != 0)
        break label148;
      paramString = null;
      AppMethodBeat.o(60213);
    }
    while (true)
    {
      return paramString;
      bool = ((String)localObject).equals(m(localb));
      break;
      label136: i = 0;
      break label63;
      label142: i = 0;
      break label110;
      label148: localObject = new b(paramString);
      a((b)localObject, ((b)localObject).dMC());
      ab.w("MicroMsg.RegionCodeDecoder", "Verifying codeFile: %s failed, after fallback, %s will be used.", new Object[] { localb.getName(), ((b)localObject).getName() });
      AppMethodBeat.o(60213);
      continue;
      label198: AppMethodBeat.o(60213);
    }
  }

  public static String apP(String paramString)
  {
    AppMethodBeat.i(60220);
    if ((bo.isNullOrNil(paramString)) || (!aa.amv(paramString)))
    {
      paramString = null;
      AppMethodBeat.o(60220);
    }
    while (true)
    {
      return paramString;
      String str = paramString;
      if (paramString.equalsIgnoreCase("zh_HK"))
        str = "zh_TW";
      paramString = xZS + "mmregioncode_" + str + ".txt";
      AppMethodBeat.o(60220);
    }
  }

  public static final boolean apQ(String paramString)
  {
    AppMethodBeat.i(60221);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(60221);
    }
    while (true)
    {
      return bool;
      bool = paramString.equalsIgnoreCase("cn");
      AppMethodBeat.o(60221);
    }
  }

  public static String apR(String paramString)
  {
    AppMethodBeat.i(60223);
    String str = getLocName(paramString);
    if (bo.isNullOrNil(str))
    {
      paramString = bo.nullAsNil(paramString);
      AppMethodBeat.o(60223);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(60223);
      paramString = str;
    }
  }

  public static RegionCodeDecoder duj()
  {
    AppMethodBeat.i(60211);
    if (xZR == null)
      xZR = new RegionCodeDecoder();
    RegionCodeDecoder localRegionCodeDecoder = xZR;
    if (!aa.dor().equals(localRegionCodeDecoder.xZT))
      localRegionCodeDecoder.drS();
    localRegionCodeDecoder = xZR;
    AppMethodBeat.o(60211);
    return localRegionCodeDecoder;
  }

  public static String getLocName(String paramString)
  {
    AppMethodBeat.i(60222);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(60222);
    }
    while (true)
    {
      return paramString;
      paramString = DecoderJni.getLocName(paramString);
      AppMethodBeat.o(60222);
    }
  }

  public static String id(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(60224);
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(paramString1))
    {
      if (bo.isNullOrNil(paramString2))
        localObject2 = localObject1;
    }
    else
    {
      if (!bo.isNullOrNil((String)localObject2))
        break label57;
      localObject2 = bo.nullAsNil(paramString2);
      AppMethodBeat.o(60224);
    }
    while (true)
    {
      return localObject2;
      localObject2 = getLocName(aC(paramString1, paramString2, null));
      break;
      label57: AppMethodBeat.o(60224);
    }
  }

  // ERROR //
  private static String l(b paramb)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 231
    //   6: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 71	com/tencent/mm/vfs/b
    //   12: dup
    //   13: new 29	java/lang/StringBuilder
    //   16: dup
    //   17: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   20: aload_0
    //   21: invokevirtual 171	com/tencent/mm/vfs/b:dMD	()Landroid/net/Uri;
    //   24: invokestatic 177	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   27: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: ldc 81
    //   32: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokespecial 153	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   41: astore_3
    //   42: aload_3
    //   43: invokevirtual 98	com/tencent/mm/vfs/b:exists	()Z
    //   46: ifeq +108 -> 154
    //   49: new 233	java/io/BufferedReader
    //   52: astore_1
    //   53: new 235	com/tencent/mm/vfs/g
    //   56: astore_0
    //   57: aload_0
    //   58: aload_3
    //   59: invokespecial 236	com/tencent/mm/vfs/g:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   62: aload_1
    //   63: aload_0
    //   64: invokespecial 239	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   67: aload_1
    //   68: astore_0
    //   69: aload_1
    //   70: invokevirtual 242	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   73: astore 4
    //   75: aload 4
    //   77: astore_0
    //   78: aload_1
    //   79: invokevirtual 243	java/io/BufferedReader:close	()V
    //   82: ldc 231
    //   84: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_0
    //   88: areturn
    //   89: astore 4
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_1
    //   94: astore_0
    //   95: ldc 67
    //   97: aload 4
    //   99: ldc 245
    //   101: iconst_1
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_3
    //   108: invokevirtual 74	com/tencent/mm/vfs/b:getName	()Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_2
    //   116: astore_0
    //   117: aload_1
    //   118: ifnull -36 -> 82
    //   121: aload_1
    //   122: invokevirtual 243	java/io/BufferedReader:close	()V
    //   125: aload_2
    //   126: astore_0
    //   127: goto -45 -> 82
    //   130: astore_0
    //   131: aload_2
    //   132: astore_0
    //   133: goto -51 -> 82
    //   136: astore_1
    //   137: aconst_null
    //   138: astore_0
    //   139: aload_0
    //   140: ifnull +7 -> 147
    //   143: aload_0
    //   144: invokevirtual 243	java/io/BufferedReader:close	()V
    //   147: ldc 231
    //   149: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: aload_1
    //   153: athrow
    //   154: ldc 231
    //   156: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: aload_1
    //   160: astore_0
    //   161: goto -74 -> 87
    //   164: astore_1
    //   165: goto -83 -> 82
    //   168: astore_0
    //   169: goto -22 -> 147
    //   172: astore_1
    //   173: goto -34 -> 139
    //   176: astore 4
    //   178: goto -85 -> 93
    //
    // Exception table:
    //   from	to	target	type
    //   49	67	89	java/lang/Throwable
    //   121	125	130	java/lang/Throwable
    //   49	67	136	finally
    //   78	82	164	java/lang/Throwable
    //   143	147	168	java/lang/Throwable
    //   69	75	172	finally
    //   95	115	172	finally
    //   69	75	176	java/lang/Throwable
  }

  private static String m(b paramb)
  {
    AppMethodBeat.i(60216);
    String str = com.tencent.mm.vfs.e.atg(j.w(paramb.mUri));
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.RegionCodeDecoder", "Failed to calculate hash for file %s", new Object[] { paramb.getName() });
      paramb = null;
      AppMethodBeat.o(60216);
    }
    while (true)
    {
      return paramb;
      paramb = ag.ck(str + "#" + paramb.lastModified() + "#" + q.LK());
      AppMethodBeat.o(60216);
    }
  }

  // ERROR //
  private void n(b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc_w 281
    //   7: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aconst_null
    //   11: astore_3
    //   12: aload_1
    //   13: invokevirtual 98	com/tencent/mm/vfs/b:exists	()Z
    //   16: ifeq +8 -> 24
    //   19: aload_1
    //   20: invokevirtual 285	com/tencent/mm/vfs/b:list	()[Ljava/lang/String;
    //   23: astore_3
    //   24: aload_1
    //   25: invokevirtual 98	com/tencent/mm/vfs/b:exists	()Z
    //   28: ifeq +21 -> 49
    //   31: aload_3
    //   32: ifnull +17 -> 49
    //   35: aload_3
    //   36: arraylength
    //   37: ifeq +12 -> 49
    //   40: ldc_w 281
    //   43: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: invokestatic 291	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   52: invokevirtual 297	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   55: ldc_w 299
    //   58: invokevirtual 304	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   61: astore_3
    //   62: aload_3
    //   63: arraylength
    //   64: istore 4
    //   66: iload_2
    //   67: iload 4
    //   69: if_icmpge +155 -> 224
    //   72: aload_3
    //   73: iload_2
    //   74: aaload
    //   75: astore 5
    //   77: ldc_w 306
    //   80: aload 5
    //   82: invokestatic 310	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   85: invokevirtual 313	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   88: astore 6
    //   90: new 29	java/lang/StringBuilder
    //   93: astore 7
    //   95: aload 7
    //   97: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   100: ldc 67
    //   102: ldc_w 315
    //   105: iconst_2
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload 6
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: aload 7
    //   118: aload_1
    //   119: getfield 250	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   122: invokestatic 177	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   125: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc_w 317
    //   131: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 5
    //   136: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: aastore
    //   143: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: new 29	java/lang/StringBuilder
    //   149: astore 6
    //   151: aload 6
    //   153: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   156: aload 6
    //   158: aload_1
    //   159: getfield 250	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   162: invokestatic 177	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   165: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: ldc_w 317
    //   171: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload 5
    //   176: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: astore 6
    //   184: ldc 158
    //   186: aload 5
    //   188: invokestatic 310	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   191: invokevirtual 313	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   194: aload 6
    //   196: invokestatic 165	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   199: pop2
    //   200: new 71	com/tencent/mm/vfs/b
    //   203: astore 5
    //   205: aload 5
    //   207: aload 6
    //   209: invokespecial 153	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   212: aload 5
    //   214: aload_1
    //   215: invokestatic 187	com/tencent/mm/storage/RegionCodeDecoder:a	(Lcom/tencent/mm/vfs/b;Lcom/tencent/mm/vfs/b;)V
    //   218: iinc 2 1
    //   221: goto -155 -> 66
    //   224: ldc_w 281
    //   227: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: goto -184 -> 46
    //   233: astore_1
    //   234: aload_0
    //   235: monitorexit
    //   236: aload_1
    //   237: athrow
    //   238: astore_1
    //   239: ldc 67
    //   241: aload_1
    //   242: ldc 56
    //   244: iconst_0
    //   245: anewarray 4	java/lang/Object
    //   248: invokestatic 125	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: ldc_w 281
    //   254: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: goto -211 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   4	10	233	finally
    //   12	24	233	finally
    //   24	31	233	finally
    //   35	46	233	finally
    //   49	66	233	finally
    //   77	218	233	finally
    //   224	230	233	finally
    //   239	257	233	finally
    //   49	66	238	java/lang/Exception
    //   77	218	238	java/lang/Exception
  }

  public final Region[] apS(String paramString)
  {
    AppMethodBeat.i(60227);
    if ((bo.isNullOrNil(this.xZU)) || (bo.isNullOrNil(paramString)))
    {
      paramString = null;
      AppMethodBeat.o(60227);
    }
    while (true)
    {
      return paramString;
      paramString = DecoderJni.getProvinces(this.xZU, paramString);
      AppMethodBeat.o(60227);
    }
  }

  public final void drS()
  {
    AppMethodBeat.i(60212);
    Object localObject1 = new b(xZS);
    if (!((b)localObject1).exists())
    {
      ((b)localObject1).mkdirs();
      n((b)localObject1);
    }
    Object localObject2 = ((b)localObject1).list();
    if ((localObject2 == null) || (localObject2.length == 0))
      n((b)localObject1);
    this.xZT = aa.dor();
    localObject1 = duk();
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.e("MicroMsg.RegionCodeDecoder", "buildMap error, no codeFile found, curLang: " + this.xZT);
      AppMethodBeat.o(60212);
    }
    while (true)
    {
      return;
      localObject2 = xZS + (String)localObject1;
      localObject1 = apO((String)localObject2);
      if (bo.isNullOrNil((String)localObject1))
      {
        ab.e("MicroMsg.RegionCodeDecoder", "buildMap error, no codeFile found after verify, curLang: " + this.xZT);
        AppMethodBeat.o(60212);
      }
      else if ((!bo.isNullOrNil(this.xZU)) && (this.xZU.equals(localObject2)) && (((String)localObject2).equals(localObject1)))
      {
        AppMethodBeat.o(60212);
      }
      else
      {
        ab.w("MicroMsg.RegionCodeDecoder", "buildMap, after verify, codeFile %s is used. curLang: %s", new Object[] { new b((String)localObject1).getName(), this.xZT });
        this.xZU = ((String)localObject1);
        DecoderJni.buildFromFile(this.xZU);
        AppMethodBeat.o(60212);
      }
    }
  }

  public final String duk()
  {
    AppMethodBeat.i(60218);
    Object localObject1 = new StringBuilder("mmregioncode_");
    Object localObject2;
    if (this.xZT.equalsIgnoreCase("zh_HK"))
    {
      localObject2 = "zh_TW";
      localObject1 = (String)localObject2 + ".txt";
      localObject2 = new b(xZS);
      if (((b)localObject2).exists())
        break label86;
      ((b)localObject2).mkdirs();
      AppMethodBeat.o(60218);
      localObject2 = null;
    }
    while (true)
    {
      return localObject2;
      localObject2 = this.xZT;
      break;
      label86: String[] arrayOfString = ((b)localObject2).list();
      if ((arrayOfString == null) || (arrayOfString.length == 0))
      {
        AppMethodBeat.o(60218);
        localObject2 = null;
      }
      else
      {
        int i = arrayOfString.length;
        int j = 0;
        int m;
        for (int k = 0; ; k = m)
        {
          if (j >= i)
            break label185;
          localObject2 = arrayOfString[j];
          if (((String)localObject2).equals(localObject1))
          {
            AppMethodBeat.o(60218);
            break;
          }
          m = k;
          if (k == 0)
          {
            m = k;
            if (((String)localObject2).equals("mmregioncode_en.txt"))
              m = 1;
          }
          j++;
        }
        label185: if (k != 0)
        {
          AppMethodBeat.o(60218);
          localObject2 = "mmregioncode_en.txt";
        }
        else
        {
          AppMethodBeat.o(60218);
          localObject2 = null;
        }
      }
    }
  }

  public final Region[] dul()
  {
    AppMethodBeat.i(60226);
    Region[] arrayOfRegion;
    if (bo.isNullOrNil(this.xZU))
    {
      arrayOfRegion = null;
      AppMethodBeat.o(60226);
    }
    while (true)
    {
      return arrayOfRegion;
      arrayOfRegion = DecoderJni.getCountries(this.xZU);
      AppMethodBeat.o(60226);
    }
  }

  public final Region[] ie(String paramString1, String paramString2)
  {
    AppMethodBeat.i(60228);
    if ((bo.isNullOrNil(this.xZU)) || (bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = null;
      AppMethodBeat.o(60228);
    }
    while (true)
    {
      return paramString1;
      paramString1 = DecoderJni.getCities(this.xZU, paramString1, paramString2);
      AppMethodBeat.o(60228);
    }
  }

  static class DecoderJni
  {
    public static native void buildFromFile(String paramString);

    public static native RegionCodeDecoder.Region[] getCities(String paramString1, String paramString2, String paramString3);

    public static native RegionCodeDecoder.Region[] getCountries(String paramString);

    public static native String getLocName(String paramString);

    public static native RegionCodeDecoder.Region[] getProvinces(String paramString1, String paramString2);

    public static native void release();
  }

  public static class Region
  {
    private String code;
    private String countryCode;
    private boolean hasChildren = false;
    private boolean isCity = false;
    private boolean isCountry = false;
    private boolean isProvince = false;
    private String name;
    private Region parent = null;

    public String getCode()
    {
      return this.code;
    }

    public String getCountryCode()
    {
      return this.countryCode;
    }

    public String getName()
    {
      return this.name;
    }

    public Region getParent()
    {
      return this.parent;
    }

    public boolean hasChildren()
    {
      return this.hasChildren;
    }

    public boolean isCity()
    {
      return this.isCity;
    }

    public boolean isCountry()
    {
      return this.isCountry;
    }

    public boolean isProvince()
    {
      return this.isProvince;
    }

    public void setCity(boolean paramBoolean)
    {
      this.isCity = paramBoolean;
    }

    public void setCode(String paramString)
    {
      this.code = paramString;
    }

    public void setCountry(boolean paramBoolean)
    {
      this.isCountry = paramBoolean;
    }

    public void setCountryCode(String paramString)
    {
      this.countryCode = paramString;
    }

    public void setHasChildren(boolean paramBoolean)
    {
      this.hasChildren = paramBoolean;
    }

    public void setName(String paramString)
    {
      this.name = paramString;
    }

    public void setParent(Region paramRegion)
    {
      this.parent = paramRegion;
    }

    public void setProvince(boolean paramBoolean)
    {
      this.isProvince = paramBoolean;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.RegionCodeDecoder
 * JD-Core Version:    0.6.2
 */