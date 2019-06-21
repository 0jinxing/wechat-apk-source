package com.tencent.mm.plugin.collect.model;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$a
{
  // ERROR //
  public static MediaPlayer a(android.content.Context paramContext, MediaPlayer.OnCompletionListener paramOnCompletionListener, MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    // Byte code:
    //   0: ldc 13
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnonnull +35 -> 41
    //   9: ldc 21
    //   11: ldc 23
    //   13: iconst_2
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_0
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: ldc 24
    //   25: invokestatic 30	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: aastore
    //   29: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aconst_null
    //   33: astore_0
    //   34: ldc 13
    //   36: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: aload_0
    //   40: areturn
    //   41: aload_0
    //   42: ldc 24
    //   44: invokevirtual 45	android/content/Context:getString	(I)Ljava/lang/String;
    //   47: astore_3
    //   48: new 47	android/media/MediaPlayer
    //   51: dup
    //   52: invokespecial 51	android/media/MediaPlayer:<init>	()V
    //   55: astore 4
    //   57: aload 4
    //   59: iconst_3
    //   60: invokevirtual 54	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   63: ldc 21
    //   65: ldc 56
    //   67: iconst_4
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: aload 4
    //   75: invokevirtual 60	java/lang/Object:hashCode	()I
    //   78: invokestatic 30	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload_3
    //   85: aastore
    //   86: dup
    //   87: iconst_2
    //   88: aload_0
    //   89: aastore
    //   90: dup
    //   91: iconst_3
    //   92: ldc 24
    //   94: invokestatic 30	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: aastore
    //   98: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aconst_null
    //   102: astore 5
    //   104: aload_0
    //   105: invokevirtual 66	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   108: aload_3
    //   109: invokevirtual 72	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   112: astore_0
    //   113: aload 4
    //   115: aload_0
    //   116: invokevirtual 78	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   119: aload_0
    //   120: invokevirtual 82	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   123: aload_0
    //   124: invokevirtual 85	android/content/res/AssetFileDescriptor:getLength	()J
    //   127: invokevirtual 89	android/media/MediaPlayer:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   130: aload 4
    //   132: iconst_0
    //   133: invokevirtual 93	android/media/MediaPlayer:setLooping	(Z)V
    //   136: new 95	com/tencent/mm/plugin/collect/model/g$a$1
    //   139: astore 5
    //   141: aload 5
    //   143: aload 4
    //   145: aload_2
    //   146: invokespecial 98	com/tencent/mm/plugin/collect/model/g$a$1:<init>	(Landroid/media/MediaPlayer;Landroid/media/MediaPlayer$OnErrorListener;)V
    //   149: aload 4
    //   151: aload 5
    //   153: invokevirtual 102	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   156: new 104	com/tencent/mm/plugin/collect/model/g$a$2
    //   159: astore_2
    //   160: aload_2
    //   161: aload_3
    //   162: aload 4
    //   164: aload_1
    //   165: invokespecial 107	com/tencent/mm/plugin/collect/model/g$a$2:<init>	(Ljava/lang/String;Landroid/media/MediaPlayer;Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   168: aload 4
    //   170: aload_2
    //   171: invokevirtual 111	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   174: aload 4
    //   176: invokevirtual 114	android/media/MediaPlayer:prepare	()V
    //   179: aload 4
    //   181: invokevirtual 117	android/media/MediaPlayer:start	()V
    //   184: aload 4
    //   186: invokevirtual 60	java/lang/Object:hashCode	()I
    //   189: istore 6
    //   191: invokestatic 123	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   194: ifnull +69 -> 263
    //   197: iconst_1
    //   198: istore 7
    //   200: invokestatic 126	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   203: ifnull +66 -> 269
    //   206: iconst_1
    //   207: istore 8
    //   209: ldc 21
    //   211: ldc 128
    //   213: iconst_3
    //   214: anewarray 4	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: iload 6
    //   221: invokestatic 30	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: iload 7
    //   229: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   232: aastore
    //   233: dup
    //   234: iconst_2
    //   235: iload 8
    //   237: invokestatic 133	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   240: aastore
    //   241: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   244: aload_0
    //   245: ifnull +7 -> 252
    //   248: aload_0
    //   249: invokevirtual 136	android/content/res/AssetFileDescriptor:close	()V
    //   252: ldc 13
    //   254: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: aload 4
    //   259: astore_0
    //   260: goto -221 -> 39
    //   263: iconst_0
    //   264: istore 7
    //   266: goto -66 -> 200
    //   269: iconst_0
    //   270: istore 8
    //   272: goto -63 -> 209
    //   275: astore_0
    //   276: ldc 21
    //   278: aload_0
    //   279: ldc 138
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -36 -> 252
    //   291: astore_1
    //   292: aload 5
    //   294: astore_0
    //   295: ldc 21
    //   297: ldc 144
    //   299: iconst_2
    //   300: anewarray 4	java/lang/Object
    //   303: dup
    //   304: iconst_0
    //   305: ldc 24
    //   307: invokestatic 30	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   310: aastore
    //   311: dup
    //   312: iconst_1
    //   313: aload_1
    //   314: invokevirtual 148	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   317: aastore
    //   318: invokestatic 36	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   321: ldc 21
    //   323: aload_1
    //   324: ldc 138
    //   326: iconst_0
    //   327: anewarray 4	java/lang/Object
    //   330: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   333: aload 4
    //   335: invokevirtual 151	android/media/MediaPlayer:release	()V
    //   338: aload_0
    //   339: ifnull +7 -> 346
    //   342: aload_0
    //   343: invokevirtual 136	android/content/res/AssetFileDescriptor:close	()V
    //   346: aconst_null
    //   347: astore_0
    //   348: ldc 13
    //   350: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: goto -314 -> 39
    //   356: astore_0
    //   357: ldc 21
    //   359: aload_0
    //   360: ldc 138
    //   362: iconst_0
    //   363: anewarray 4	java/lang/Object
    //   366: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   369: goto -23 -> 346
    //   372: astore_1
    //   373: aconst_null
    //   374: astore_0
    //   375: aload_0
    //   376: ifnull +7 -> 383
    //   379: aload_0
    //   380: invokevirtual 136	android/content/res/AssetFileDescriptor:close	()V
    //   383: ldc 13
    //   385: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   388: aload_1
    //   389: athrow
    //   390: astore_0
    //   391: ldc 21
    //   393: aload_0
    //   394: ldc 138
    //   396: iconst_0
    //   397: anewarray 4	java/lang/Object
    //   400: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: goto -20 -> 383
    //   406: astore_1
    //   407: goto -32 -> 375
    //   410: astore_1
    //   411: goto -36 -> 375
    //   414: astore_1
    //   415: goto -120 -> 295
    //
    // Exception table:
    //   from	to	target	type
    //   248	252	275	java/io/IOException
    //   104	113	291	java/lang/Exception
    //   342	346	356	java/io/IOException
    //   104	113	372	finally
    //   379	383	390	java/io/IOException
    //   113	197	406	finally
    //   200	206	406	finally
    //   209	244	406	finally
    //   295	338	410	finally
    //   113	197	414	java/lang/Exception
    //   200	206	414	java/lang/Exception
    //   209	244	414	java/lang/Exception
  }

  public static MediaPlayer a(String paramString, MediaPlayer.OnCompletionListener paramOnCompletionListener, MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    AppMethodBeat.i(40946);
    MediaPlayer localMediaPlayer = new MediaPlayer();
    localMediaPlayer.setAudioStreamType(3);
    ab.i("MicroMsg.F2fRcvVoiceListener", "play start mp:%d path:%s", new Object[] { Integer.valueOf(localMediaPlayer.hashCode()), paramString });
    try
    {
      localMediaPlayer.setDataSource(paramString);
      localMediaPlayer.setLooping(false);
      g.a.3 local3 = new com/tencent/mm/plugin/collect/model/g$a$3;
      local3.<init>(localMediaPlayer, paramOnErrorListener);
      localMediaPlayer.setOnErrorListener(local3);
      paramOnErrorListener = new com/tencent/mm/plugin/collect/model/g$a$4;
      paramOnErrorListener.<init>(paramString, localMediaPlayer, paramOnCompletionListener);
      localMediaPlayer.setOnCompletionListener(paramOnErrorListener);
      localMediaPlayer.prepare();
      localMediaPlayer.start();
      int i = localMediaPlayer.hashCode();
      boolean bool1;
      if (Looper.myLooper() != null)
      {
        bool1 = true;
        if (Looper.getMainLooper() == null)
          break label169;
      }
      label169: for (boolean bool2 = true; ; bool2 = false)
      {
        ab.i("MicroMsg.F2fRcvVoiceListener", "play start mp finish [%d], myLooper[%b] mainLooper[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        AppMethodBeat.o(40946);
        paramString = localMediaPlayer;
        return paramString;
        bool1 = false;
        break;
      }
    }
    catch (Exception paramOnCompletionListener)
    {
      while (true)
      {
        ab.e("MicroMsg.F2fRcvVoiceListener", "play failed path:%s e:%s", new Object[] { paramString, paramOnCompletionListener.getMessage() });
        ab.printErrStackTrace("MicroMsg.F2fRcvVoiceListener", paramOnCompletionListener, "", new Object[0]);
        localMediaPlayer.release();
        paramString = null;
        AppMethodBeat.o(40946);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g.a
 * JD-Core Version:    0.6.2
 */