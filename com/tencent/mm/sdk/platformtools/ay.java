package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ay
{
  // ERROR //
  public static MediaPlayer a(Context paramContext, int paramInt1, ay.b paramb, int paramInt2, boolean paramBoolean, ay.a parama)
  {
    // Byte code:
    //   0: ldc 15
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnull +7 -> 13
    //   9: aload_2
    //   10: ifnonnull +51 -> 61
    //   13: ldc 23
    //   15: ldc 25
    //   17: iconst_5
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_0
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: iload_1
    //   28: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: aload_2
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: iload 4
    //   40: invokestatic 36	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   43: aastore
    //   44: dup
    //   45: iconst_4
    //   46: aload 5
    //   48: aastore
    //   49: invokestatic 42	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: aconst_null
    //   53: astore_0
    //   54: ldc 15
    //   56: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aload_0
    //   60: areturn
    //   61: aload_0
    //   62: iload_1
    //   63: invokevirtual 51	android/content/Context:getString	(I)Ljava/lang/String;
    //   66: astore 6
    //   68: new 53	android/media/MediaPlayer
    //   71: dup
    //   72: invokespecial 57	android/media/MediaPlayer:<init>	()V
    //   75: astore 7
    //   77: aload_2
    //   78: getstatic 61	com/tencent/mm/sdk/platformtools/ay$b:xAR	Lcom/tencent/mm/sdk/platformtools/ay$b;
    //   81: if_acmpeq +246 -> 327
    //   84: iconst_m1
    //   85: iload_3
    //   86: if_icmpne +241 -> 327
    //   89: aload_2
    //   90: getstatic 64	com/tencent/mm/sdk/platformtools/ay$b:xAS	Lcom/tencent/mm/sdk/platformtools/ay$b;
    //   93: if_acmpne +228 -> 321
    //   96: iconst_3
    //   97: istore_3
    //   98: aload 7
    //   100: iload_3
    //   101: invokevirtual 67	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   104: ldc 23
    //   106: ldc 69
    //   108: bipush 7
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload 7
    //   117: invokevirtual 73	java/lang/Object:hashCode	()I
    //   120: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: aload 6
    //   128: aastore
    //   129: dup
    //   130: iconst_2
    //   131: aload_0
    //   132: aastore
    //   133: dup
    //   134: iconst_3
    //   135: iload_1
    //   136: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   139: aastore
    //   140: dup
    //   141: iconst_4
    //   142: aload_2
    //   143: aastore
    //   144: dup
    //   145: iconst_5
    //   146: iload 4
    //   148: invokestatic 36	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   151: aastore
    //   152: dup
    //   153: bipush 6
    //   155: aload 5
    //   157: aastore
    //   158: invokestatic 75	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aconst_null
    //   162: astore 8
    //   164: aload_0
    //   165: invokevirtual 79	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   168: aload 6
    //   170: invokevirtual 85	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   173: astore_0
    //   174: aload 7
    //   176: aload_0
    //   177: invokevirtual 91	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   180: aload_0
    //   181: invokevirtual 95	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   184: aload_0
    //   185: invokevirtual 98	android/content/res/AssetFileDescriptor:getLength	()J
    //   188: invokevirtual 102	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   191: aload 7
    //   193: iload 4
    //   195: invokevirtual 106	android/media/MediaPlayer:setLooping	(Z)V
    //   198: new 108	com/tencent/mm/sdk/platformtools/ay$1
    //   201: astore_2
    //   202: aload_2
    //   203: aload 7
    //   205: invokespecial 111	com/tencent/mm/sdk/platformtools/ay$1:<init>	(Landroid/media/MediaPlayer;)V
    //   208: aload 7
    //   210: aload_2
    //   211: invokevirtual 115	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   214: new 117	com/tencent/mm/sdk/platformtools/ay$2
    //   217: astore_2
    //   218: aload_2
    //   219: aload 6
    //   221: aload 7
    //   223: aload 5
    //   225: invokespecial 120	com/tencent/mm/sdk/platformtools/ay$2:<init>	(Ljava/lang/String;Landroid/media/MediaPlayer;Lcom/tencent/mm/sdk/platformtools/ay$a;)V
    //   228: aload 7
    //   230: aload_2
    //   231: invokevirtual 124	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   234: aload 7
    //   236: invokevirtual 127	android/media/MediaPlayer:prepare	()V
    //   239: aload 7
    //   241: invokevirtual 130	android/media/MediaPlayer:start	()V
    //   244: aload 7
    //   246: invokevirtual 73	java/lang/Object:hashCode	()I
    //   249: istore_3
    //   250: invokestatic 136	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   253: ifnull +88 -> 341
    //   256: iconst_1
    //   257: istore 4
    //   259: invokestatic 139	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   262: ifnull +85 -> 347
    //   265: iconst_1
    //   266: istore 9
    //   268: ldc 23
    //   270: ldc 141
    //   272: iconst_3
    //   273: anewarray 4	java/lang/Object
    //   276: dup
    //   277: iconst_0
    //   278: iload_3
    //   279: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: aastore
    //   283: dup
    //   284: iconst_1
    //   285: iload 4
    //   287: invokestatic 36	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   290: aastore
    //   291: dup
    //   292: iconst_2
    //   293: iload 9
    //   295: invokestatic 36	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   298: aastore
    //   299: invokestatic 75	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: aload_0
    //   303: ifnull +7 -> 310
    //   306: aload_0
    //   307: invokevirtual 144	android/content/res/AssetFileDescriptor:close	()V
    //   310: ldc 15
    //   312: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   315: aload 7
    //   317: astore_0
    //   318: goto -259 -> 59
    //   321: bipush 8
    //   323: istore_3
    //   324: goto -226 -> 98
    //   327: iload_3
    //   328: iconst_m1
    //   329: if_icmpeq -225 -> 104
    //   332: aload 7
    //   334: iload_3
    //   335: invokevirtual 67	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   338: goto -234 -> 104
    //   341: iconst_0
    //   342: istore 4
    //   344: goto -85 -> 259
    //   347: iconst_0
    //   348: istore 9
    //   350: goto -82 -> 268
    //   353: astore_0
    //   354: ldc 23
    //   356: aload_0
    //   357: ldc 146
    //   359: iconst_0
    //   360: anewarray 4	java/lang/Object
    //   363: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   366: goto -56 -> 310
    //   369: astore_2
    //   370: aload 8
    //   372: astore_0
    //   373: ldc 23
    //   375: ldc 152
    //   377: iconst_2
    //   378: anewarray 4	java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: iload_1
    //   384: invokestatic 31	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   387: aastore
    //   388: dup
    //   389: iconst_1
    //   390: aload_2
    //   391: invokevirtual 156	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   394: aastore
    //   395: invokestatic 42	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: ldc 23
    //   400: aload_2
    //   401: ldc 146
    //   403: iconst_0
    //   404: anewarray 4	java/lang/Object
    //   407: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: aload 7
    //   412: invokevirtual 159	android/media/MediaPlayer:release	()V
    //   415: aload_0
    //   416: ifnull +7 -> 423
    //   419: aload_0
    //   420: invokevirtual 144	android/content/res/AssetFileDescriptor:close	()V
    //   423: aconst_null
    //   424: astore_0
    //   425: ldc 15
    //   427: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   430: goto -371 -> 59
    //   433: astore_0
    //   434: ldc 23
    //   436: aload_0
    //   437: ldc 146
    //   439: iconst_0
    //   440: anewarray 4	java/lang/Object
    //   443: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   446: goto -23 -> 423
    //   449: astore_2
    //   450: aconst_null
    //   451: astore_0
    //   452: aload_0
    //   453: ifnull +7 -> 460
    //   456: aload_0
    //   457: invokevirtual 144	android/content/res/AssetFileDescriptor:close	()V
    //   460: ldc 15
    //   462: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: aload_2
    //   466: athrow
    //   467: astore_0
    //   468: ldc 23
    //   470: aload_0
    //   471: ldc 146
    //   473: iconst_0
    //   474: anewarray 4	java/lang/Object
    //   477: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   480: goto -20 -> 460
    //   483: astore_2
    //   484: goto -32 -> 452
    //   487: astore_2
    //   488: goto -36 -> 452
    //   491: astore_2
    //   492: goto -119 -> 373
    //
    // Exception table:
    //   from	to	target	type
    //   306	310	353	java/io/IOException
    //   164	174	369	java/lang/Exception
    //   419	423	433	java/io/IOException
    //   164	174	449	finally
    //   456	460	467	java/io/IOException
    //   174	256	483	finally
    //   259	265	483	finally
    //   268	302	483	finally
    //   373	415	487	finally
    //   174	256	491	java/lang/Exception
    //   259	265	491	java/lang/Exception
    //   268	302	491	java/lang/Exception
  }

  public static MediaPlayer a(Context paramContext, int paramInt, ay.b paramb, ay.a parama)
  {
    AppMethodBeat.i(52226);
    paramContext = a(paramContext, paramInt, paramb, -1, false, parama);
    AppMethodBeat.o(52226);
    return paramContext;
  }

  public static void a(Context paramContext, int paramInt, ay.a parama)
  {
    AppMethodBeat.i(52229);
    a(paramContext, paramInt, ay.b.xAR, parama);
    AppMethodBeat.o(52229);
  }

  public static void a(Context paramContext, ay.a parama)
  {
    AppMethodBeat.i(52228);
    a(paramContext, 2131304023, ay.b.xAS, parama);
    AppMethodBeat.o(52228);
  }

  public static void au(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(52230);
    a(paramContext, paramInt, ay.b.xAR, null);
    AppMethodBeat.o(52230);
  }

  public static void gL(Context paramContext)
  {
    AppMethodBeat.i(52231);
    a(paramContext, 2131296797, ay.b.xAR, 3, false, null);
    AppMethodBeat.o(52231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ay
 * JD-Core Version:    0.6.2
 */