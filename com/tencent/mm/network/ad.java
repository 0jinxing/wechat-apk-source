package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ah;

public final class ad
{
  public static final String gen;
  private static long geo;
  private static long lastUpdateTime;

  static
  {
    AppMethodBeat.i(58692);
    gen = e.eSl + "/tencent/noop.dat";
    lastUpdateTime = 0L;
    Object localObject = ah.getContext().getSharedPreferences("noop_prefs", 0);
    int i = ((SharedPreferences)localObject).getInt("noop_strategy", 1);
    if (1 == i)
    {
      geo = 270L;
      new StringBuilder("getNoopIntervalInMs use hard code noop:").append(geo);
      l = geo * 1000L;
    }
    while (true)
    {
      geo = l / 1000L;
      AppMethodBeat.o(58692);
      return;
      if (3 != i)
        break;
      l = ((SharedPreferences)localObject).getLong("noop_min_interval", 270L);
      if ((l >= 180L) && (l <= 3600L))
      {
        geo = l;
        l *= 1000L;
      }
      else
      {
        geo = 270L;
        new StringBuilder("getNoopIntervalInMs use wx noop:").append(geo);
        l = geo * 1000L;
      }
    }
    long l = System.currentTimeMillis() / 1000L;
    if (l - lastUpdateTime > 3600L)
    {
      localObject = ant();
      if ((localObject[0] < 180L) || (localObject[0] > 3600L))
        break label262;
    }
    label262: for (geo = localObject[0]; ; geo = 270L)
    {
      lastUpdateTime = l;
      new StringBuilder("getNoopIntervalInMs use sync noop:").append(geo);
      l = geo * 1000L;
      break;
    }
  }

  // ERROR //
  private static long[] ant()
  {
    // Byte code:
    //   0: ldc 109
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_2
    //   6: newarray long
    //   8: astore_0
    //   9: aload_0
    //   10: dup
    //   11: iconst_0
    //   12: lconst_0
    //   13: lastore
    //   14: dup
    //   15: iconst_1
    //   16: lconst_0
    //   17: lastore
    //   18: pop
    //   19: new 111	java/io/File
    //   22: dup
    //   23: getstatic 40	com/tencent/mm/network/ad:gen	Ljava/lang/String;
    //   26: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;)V
    //   29: astore_1
    //   30: aload_1
    //   31: invokevirtual 116	java/io/File:exists	()Z
    //   34: ifne +10 -> 44
    //   37: ldc 109
    //   39: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: aload_0
    //   43: areturn
    //   44: new 118	java/io/DataInputStream
    //   47: astore_2
    //   48: new 120	java/io/FileInputStream
    //   51: astore_3
    //   52: aload_3
    //   53: aload_1
    //   54: invokespecial 123	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   57: aload_2
    //   58: aload_3
    //   59: invokespecial 126	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   62: aload_2
    //   63: astore_3
    //   64: aload_2
    //   65: invokevirtual 130	java/io/DataInputStream:readInt	()I
    //   68: istore 4
    //   70: iload 4
    //   72: i2l
    //   73: ldc2_w 88
    //   76: lcmp
    //   77: iflt +13 -> 90
    //   80: iload 4
    //   82: i2l
    //   83: ldc2_w 90
    //   86: lcmp
    //   87: ifle +21 -> 108
    //   90: aload_2
    //   91: astore_3
    //   92: aload_2
    //   93: invokevirtual 133	java/io/DataInputStream:close	()V
    //   96: aload_2
    //   97: invokevirtual 133	java/io/DataInputStream:close	()V
    //   100: ldc 109
    //   102: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: goto -63 -> 42
    //   108: iload 4
    //   110: i2l
    //   111: lstore 5
    //   113: aload_0
    //   114: iconst_0
    //   115: lload 5
    //   117: lastore
    //   118: aload_2
    //   119: astore_3
    //   120: aload_2
    //   121: invokevirtual 130	java/io/DataInputStream:readInt	()I
    //   124: istore 4
    //   126: aload_2
    //   127: astore_3
    //   128: iload 4
    //   130: i2l
    //   131: invokestatic 99	java/lang/System:currentTimeMillis	()J
    //   134: ldc2_w 77
    //   137: ldiv
    //   138: lcmp
    //   139: ifle +21 -> 160
    //   142: aload_2
    //   143: astore_3
    //   144: aload_2
    //   145: invokevirtual 133	java/io/DataInputStream:close	()V
    //   148: aload_2
    //   149: invokevirtual 133	java/io/DataInputStream:close	()V
    //   152: ldc 109
    //   154: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: goto -115 -> 42
    //   160: iload 4
    //   162: i2l
    //   163: lstore 5
    //   165: aload_0
    //   166: iconst_1
    //   167: lload 5
    //   169: lastore
    //   170: aload_2
    //   171: astore_3
    //   172: aload_2
    //   173: invokevirtual 133	java/io/DataInputStream:close	()V
    //   176: aload_2
    //   177: invokevirtual 133	java/io/DataInputStream:close	()V
    //   180: ldc 109
    //   182: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -143 -> 42
    //   188: astore_1
    //   189: aconst_null
    //   190: astore_2
    //   191: aload_2
    //   192: astore_3
    //   193: new 20	java/lang/StringBuilder
    //   196: astore 7
    //   198: aload_2
    //   199: astore_3
    //   200: aload 7
    //   202: ldc 135
    //   204: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   207: aload_2
    //   208: astore_3
    //   209: aload 7
    //   211: aload_1
    //   212: invokevirtual 139	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   215: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload_2
    //   220: ifnull +7 -> 227
    //   223: aload_2
    //   224: invokevirtual 133	java/io/DataInputStream:close	()V
    //   227: ldc 109
    //   229: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: goto -190 -> 42
    //   235: astore_2
    //   236: aconst_null
    //   237: astore_3
    //   238: aload_3
    //   239: ifnull +7 -> 246
    //   242: aload_3
    //   243: invokevirtual 133	java/io/DataInputStream:close	()V
    //   246: ldc 109
    //   248: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   251: aload_2
    //   252: athrow
    //   253: astore_3
    //   254: goto -154 -> 100
    //   257: astore_3
    //   258: goto -106 -> 152
    //   261: astore_3
    //   262: goto -82 -> 180
    //   265: astore_3
    //   266: goto -39 -> 227
    //   269: astore_3
    //   270: goto -24 -> 246
    //   273: astore_2
    //   274: goto -36 -> 238
    //   277: astore_1
    //   278: goto -87 -> 191
    //
    // Exception table:
    //   from	to	target	type
    //   44	62	188	java/lang/Exception
    //   44	62	235	finally
    //   96	100	253	java/lang/Exception
    //   148	152	257	java/lang/Exception
    //   176	180	261	java/lang/Exception
    //   223	227	265	java/lang/Exception
    //   242	246	269	java/lang/Exception
    //   64	70	273	finally
    //   92	96	273	finally
    //   120	126	273	finally
    //   128	142	273	finally
    //   144	148	273	finally
    //   172	176	273	finally
    //   193	198	273	finally
    //   200	207	273	finally
    //   209	219	273	finally
    //   64	70	277	java/lang/Exception
    //   92	96	277	java/lang/Exception
    //   120	126	277	java/lang/Exception
    //   128	142	277	java/lang/Exception
    //   144	148	277	java/lang/Exception
    //   172	176	277	java/lang/Exception
  }

  // ERROR //
  public static void y(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc 145
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 20	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 147
    //   11: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: lload_0
    //   15: invokevirtual 76	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   18: ldc 149
    //   20: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: lload_2
    //   24: invokevirtual 76	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: lload_2
    //   29: lconst_0
    //   30: lcmp
    //   31: ifgt +134 -> 165
    //   34: lload_0
    //   35: lconst_0
    //   36: lcmp
    //   37: ifgt +37 -> 74
    //   40: invokestatic 48	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   43: ldc 50
    //   45: iconst_0
    //   46: invokevirtual 56	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   49: invokeinterface 153 1 0
    //   54: ldc 58
    //   56: iconst_1
    //   57: invokeinterface 159 3 0
    //   62: invokeinterface 162 1 0
    //   67: pop
    //   68: ldc 145
    //   70: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: return
    //   74: lload_0
    //   75: ldc2_w 88
    //   78: lcmp
    //   79: iflt +55 -> 134
    //   82: lload_0
    //   83: ldc2_w 90
    //   86: lcmp
    //   87: ifgt +47 -> 134
    //   90: invokestatic 48	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   93: ldc 50
    //   95: iconst_0
    //   96: invokevirtual 56	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   99: invokeinterface 153 1 0
    //   104: ldc 58
    //   106: iconst_3
    //   107: invokeinterface 159 3 0
    //   112: ldc 83
    //   114: lload_0
    //   115: invokeinterface 166 4 0
    //   120: invokeinterface 162 1 0
    //   125: pop
    //   126: ldc 145
    //   128: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: goto -58 -> 73
    //   134: new 20	java/lang/StringBuilder
    //   137: dup
    //   138: ldc 168
    //   140: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: lload_0
    //   144: invokevirtual 76	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   147: ldc 170
    //   149: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: lload_2
    //   153: invokevirtual 76	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: ldc 145
    //   159: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -89 -> 73
    //   165: invokestatic 48	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   168: ldc 50
    //   170: iconst_0
    //   171: invokevirtual 56	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   174: invokeinterface 153 1 0
    //   179: ldc 58
    //   181: iconst_2
    //   182: invokeinterface 159 3 0
    //   187: invokeinterface 162 1 0
    //   192: pop
    //   193: lload_0
    //   194: ldc2_w 88
    //   197: lcmp
    //   198: iflt +11 -> 209
    //   201: lload_0
    //   202: ldc2_w 90
    //   205: lcmp
    //   206: ifle +11 -> 217
    //   209: ldc 145
    //   211: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: goto -141 -> 73
    //   217: invokestatic 99	java/lang/System:currentTimeMillis	()J
    //   220: ldc2_w 77
    //   223: ldiv
    //   224: lload_2
    //   225: lcmp
    //   226: ifge +11 -> 237
    //   229: ldc 145
    //   231: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: goto -161 -> 73
    //   237: new 111	java/io/File
    //   240: astore 4
    //   242: aload 4
    //   244: getstatic 40	com/tencent/mm/network/ad:gen	Ljava/lang/String;
    //   247: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;)V
    //   250: aload 4
    //   252: invokevirtual 116	java/io/File:exists	()Z
    //   255: ifeq +38 -> 293
    //   258: invokestatic 103	com/tencent/mm/network/ad:ant	()[J
    //   261: astore 4
    //   263: aload 4
    //   265: iconst_1
    //   266: laload
    //   267: lconst_0
    //   268: lcmp
    //   269: ifle +44 -> 313
    //   272: aload 4
    //   274: iconst_1
    //   275: laload
    //   276: lstore 5
    //   278: lload 5
    //   280: lload_2
    //   281: lcmp
    //   282: iflt +31 -> 313
    //   285: ldc 145
    //   287: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: goto -217 -> 73
    //   293: aload 4
    //   295: invokevirtual 173	java/io/File:createNewFile	()Z
    //   298: istore 7
    //   300: iload 7
    //   302: ifne +11 -> 313
    //   305: ldc 145
    //   307: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: goto -237 -> 73
    //   313: aconst_null
    //   314: astore 8
    //   316: aconst_null
    //   317: astore 9
    //   319: aload 8
    //   321: astore 4
    //   323: new 111	java/io/File
    //   326: astore 10
    //   328: aload 8
    //   330: astore 4
    //   332: aload 10
    //   334: getstatic 40	com/tencent/mm/network/ad:gen	Ljava/lang/String;
    //   337: invokespecial 112	java/io/File:<init>	(Ljava/lang/String;)V
    //   340: aload 8
    //   342: astore 4
    //   344: aload 10
    //   346: invokevirtual 116	java/io/File:exists	()Z
    //   349: ifne +55 -> 404
    //   352: aload 8
    //   354: astore 4
    //   356: aload 10
    //   358: invokevirtual 173	java/io/File:createNewFile	()Z
    //   361: istore 7
    //   363: iload 7
    //   365: ifne +39 -> 404
    //   368: ldc 145
    //   370: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   373: goto -300 -> 73
    //   376: astore 4
    //   378: new 20	java/lang/StringBuilder
    //   381: dup
    //   382: ldc 175
    //   384: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   387: aload 4
    //   389: invokevirtual 139	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   392: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   395: pop
    //   396: ldc 145
    //   398: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: goto -328 -> 73
    //   404: aload 8
    //   406: astore 4
    //   408: new 177	java/io/DataOutputStream
    //   411: astore 11
    //   413: aload 8
    //   415: astore 4
    //   417: new 179	java/io/FileOutputStream
    //   420: astore 12
    //   422: aload 8
    //   424: astore 4
    //   426: aload 12
    //   428: aload 10
    //   430: invokespecial 180	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   433: aload 8
    //   435: astore 4
    //   437: aload 11
    //   439: aload 12
    //   441: invokespecial 183	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   444: lload_0
    //   445: l2i
    //   446: istore 13
    //   448: aload 11
    //   450: iload 13
    //   452: invokevirtual 186	java/io/DataOutputStream:writeInt	(I)V
    //   455: aload 11
    //   457: lload_2
    //   458: l2i
    //   459: invokevirtual 186	java/io/DataOutputStream:writeInt	(I)V
    //   462: aload 11
    //   464: invokevirtual 189	java/io/DataOutputStream:flush	()V
    //   467: aload 11
    //   469: invokevirtual 190	java/io/DataOutputStream:close	()V
    //   472: aload 11
    //   474: invokevirtual 190	java/io/DataOutputStream:close	()V
    //   477: ldc 145
    //   479: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   482: goto -409 -> 73
    //   485: astore 4
    //   487: ldc 145
    //   489: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   492: goto -419 -> 73
    //   495: astore 8
    //   497: aload 9
    //   499: astore 11
    //   501: aload 11
    //   503: astore 4
    //   505: new 20	java/lang/StringBuilder
    //   508: astore 9
    //   510: aload 11
    //   512: astore 4
    //   514: aload 9
    //   516: ldc 192
    //   518: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   521: aload 11
    //   523: astore 4
    //   525: aload 9
    //   527: aload 8
    //   529: invokevirtual 139	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   532: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   535: pop
    //   536: aload 11
    //   538: ifnull +8 -> 546
    //   541: aload 11
    //   543: invokevirtual 190	java/io/DataOutputStream:close	()V
    //   546: ldc 145
    //   548: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   551: goto -478 -> 73
    //   554: astore 4
    //   556: ldc 145
    //   558: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   561: goto -488 -> 73
    //   564: astore 8
    //   566: aload 4
    //   568: astore 11
    //   570: aload 8
    //   572: astore 4
    //   574: aload 11
    //   576: ifnull +8 -> 584
    //   579: aload 11
    //   581: invokevirtual 190	java/io/DataOutputStream:close	()V
    //   584: ldc 145
    //   586: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   589: aload 4
    //   591: athrow
    //   592: astore 11
    //   594: goto -10 -> 584
    //   597: astore 4
    //   599: goto -25 -> 574
    //   602: astore 8
    //   604: goto -103 -> 501
    //
    // Exception table:
    //   from	to	target	type
    //   237	263	376	java/lang/Exception
    //   293	300	376	java/lang/Exception
    //   368	373	376	java/lang/Exception
    //   477	482	376	java/lang/Exception
    //   487	492	376	java/lang/Exception
    //   546	551	376	java/lang/Exception
    //   556	561	376	java/lang/Exception
    //   584	592	376	java/lang/Exception
    //   472	477	485	java/lang/Exception
    //   323	328	495	java/lang/Exception
    //   332	340	495	java/lang/Exception
    //   344	352	495	java/lang/Exception
    //   356	363	495	java/lang/Exception
    //   408	413	495	java/lang/Exception
    //   417	422	495	java/lang/Exception
    //   426	433	495	java/lang/Exception
    //   437	444	495	java/lang/Exception
    //   541	546	554	java/lang/Exception
    //   323	328	564	finally
    //   332	340	564	finally
    //   344	352	564	finally
    //   356	363	564	finally
    //   408	413	564	finally
    //   417	422	564	finally
    //   426	433	564	finally
    //   437	444	564	finally
    //   505	510	564	finally
    //   514	521	564	finally
    //   525	536	564	finally
    //   579	584	592	java/lang/Exception
    //   448	472	597	finally
    //   448	472	602	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ad
 * JD-Core Version:    0.6.2
 */