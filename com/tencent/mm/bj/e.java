package com.tencent.mm.bj;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.os.Parcelable;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.media.g.c;
import com.tencent.mm.media.g.c.a;
import com.tencent.mm.media.g.c.b;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class e
{
  private static final Object fYf;

  static
  {
    AppMethodBeat.i(50931);
    fYf = new Object();
    AppMethodBeat.o(50931);
  }

  public static int a(String paramString1, final String paramString2, final VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(50926);
    ab.i("MicroMsg.TransferUtil", "Begin to local tranfer");
    final long l = bo.yz();
    ??? = new c.b()
    {
      public final void lW(String arg1)
      {
        AppMethodBeat.i(50918);
        ab.i("MicroMsg.TransferUtil", "mediaCodecRemuxer remux onFinish");
        if (bo.isNullOrNil(???))
          ab.e("MicroMsg.TransferUtil", "MediaCodecRemuxer remux failed, ret path is null, retry x264");
        while (true)
        {
          try
          {
            e.b(this.fYg, paramString2, paramVideoTransPara, l);
          }
          catch (Exception )
          {
            synchronized (e.al())
            {
              try
              {
                e.al().notifyAll();
                AppMethodBeat.o(50918);
                return;
                ??? = ???;
                ab.i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer error!!!");
                e.x(-1, l);
              }
              catch (Exception localException1)
              {
                ab.printErrStackTrace("MicroMsg.TransferUtil", localException1, "wait mediaCodecRemuxer error", new Object[0]);
                continue;
              }
            }
          }
          e.x(0, l);
          synchronized (e.al())
          {
            try
            {
              e.al().notifyAll();
              AppMethodBeat.o(50918);
            }
            catch (Exception localException2)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.TransferUtil", localException2, "wait mediaCodecRemuxer error", new Object[0]);
            }
          }
        }
      }
    };
    boolean bool1 = true;
    try
    {
      if (ah.bqo())
        if (((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("HEVCTranscodeMediaCodec", 1) == 1)
        {
          bool2 = true;
          bool1 = bool2;
          label68: i = q.etn.esH;
          if (i == -1)
            break label258;
          if (i != 1)
            break label252;
          bool2 = true;
          label91: ab.i("MicroMsg.TransferUtil", "serverConfigMediaCodec: %s, dynamicConfigX264: %s, useX264: %s", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (!bool2)
            break label275;
          localObject2 = new com/tencent/mm/bj/g;
          ((g)localObject2).<init>();
          ((g)localObject2).b(paramString1, paramString2, paramVideoTransPara);
          ((g)localObject2).fYu = true;
          ((g)localObject2).fYv = bool2;
          ??? = null;
          label165: if ((localObject2 == null) || (!bool2))
            break label408;
        }
    }
    catch (Exception paramString1)
    {
      try
      {
        boolean bool2;
        Object localObject2;
        i = ((g)localObject2).fW(ea(paramString1));
        w(i, l);
        while (true)
        {
          return i;
          bool2 = false;
          break;
          localObject2 = new com/tencent/mm/ipcinvoker/type/IPCVoid;
          ((IPCVoid)localObject2).<init>();
          localObject2 = (IPCBoolean)f.a("com.tencent.mm", (Parcelable)localObject2, e.a.class);
          if (localObject2 == null)
            break label68;
          bool1 = ((IPCBoolean)localObject2).value;
          break label68;
          label252: bool2 = false;
          break label91;
          label258: if (!bool1)
          {
            bool2 = true;
            break label91;
          }
          bool2 = false;
          break label91;
          label275: localObject2 = com.tencent.mm.plugin.sight.base.d.WR(paramString1);
          if ((localObject2 != null) && (((com.tencent.mm.plugin.sight.base.a)localObject2).eTk > 0))
          {
            paramVideoTransPara.fps = ((int)Math.min(30.0F, ((com.tencent.mm.plugin.sight.base.a)localObject2).eTk));
            ab.i("MicroMsg.TransferUtil", "transfer h265 use 30fps, newPara.fps:%s, mediaInfo.frameRate:%s", new Object[] { Integer.valueOf(paramVideoTransPara.fps), Integer.valueOf(((com.tencent.mm.plugin.sight.base.a)localObject2).eTk) });
          }
          ??? = c.eXz.a(paramString1, paramString2, paramVideoTransPara.width, paramVideoTransPara.height, paramVideoTransPara.videoBitrate, paramVideoTransPara.fps, (c.b)???);
          localObject2 = null;
          break label165;
          paramString1 = paramString1;
          ab.e("MicroMsg.TransferUtil", "Local tranfer init failed: %s", new Object[] { paramString1.getMessage() });
          i = -1;
          AppMethodBeat.o(50926);
          continue;
          label408: if (??? != null)
            try
            {
              ab.i("MicroMsg.TransferUtil", "start mediaCodecRemuxer remux");
              ((c)???).Va();
              synchronized (fYf)
              {
                try
                {
                  fYf.wait();
                  ab.i("MicroMsg.TransferUtil", "mediaCodecRemuxLock wait finish");
                  i = 0;
                }
                catch (Exception localException2)
                {
                  while (true)
                    ab.printErrStackTrace("MicroMsg.TransferUtil", localException2, "wait mediaCodecRemux error", new Object[0]);
                }
              }
            }
            catch (Exception localException1)
            {
              ab.i("MicroMsg.TransferUtil", "MediaCodecRemuxer remux, retry x264, error:%s", new Object[] { localException1.getMessage() });
              a(paramString1, paramString2, paramVideoTransPara, l);
            }
          else
            i = 0;
        }
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          int i = -1;
          ab.e("MicroMsg.TransferUtil", "Local tranfer to H264 error: %s", new Object[] { paramString1.getMessage() });
          b.fXS.WY();
        }
      }
      finally
      {
        b.fXS.WY();
        AppMethodBeat.o(50926);
      }
    }
    throw paramString1;
  }

  public static VideoTransPara a(VideoTransPara paramVideoTransPara, String paramString)
  {
    AppMethodBeat.i(50923);
    VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.afF().b(paramVideoTransPara);
    if (localVideoTransPara == null)
    {
      ab.i("MicroMsg.TransferUtil", "get C2C album video para is null. old para %s", new Object[] { paramVideoTransPara });
      paramVideoTransPara = uF(paramString);
      AppMethodBeat.o(50923);
    }
    while (true)
    {
      return paramVideoTransPara;
      ab.d("MicroMsg.TransferUtil", "compress new para is %s", new Object[] { localVideoTransPara });
      if ((paramVideoTransPara.videoBitrate <= 640000) || (localVideoTransPara.videoBitrate > paramVideoTransPara.videoBitrate))
      {
        ab.i("MicroMsg.TransferUtil", "new bitrate is bigger than old bitrate %s %s", new Object[] { localVideoTransPara, paramVideoTransPara });
        paramVideoTransPara = uF(paramString);
        AppMethodBeat.o(50923);
      }
      else if ((paramVideoTransPara.fps >= 45) && (paramVideoTransPara.duration * 1000 >= 180000))
      {
        paramVideoTransPara = uF(paramString);
        AppMethodBeat.o(50923);
      }
      else
      {
        AppMethodBeat.o(50923);
        paramVideoTransPara = localVideoTransPara;
      }
    }
  }

  // ERROR //
  private static void a(String paramString, VideoTransPara paramVideoTransPara)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 263
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 265	android/media/MediaExtractor
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 266	android/media/MediaExtractor:<init>	()V
    //   16: aload_3
    //   17: astore 4
    //   19: aload_3
    //   20: aload_0
    //   21: invokevirtual 270	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   24: aload_3
    //   25: astore 4
    //   27: aload_3
    //   28: invokevirtual 273	android/media/MediaExtractor:getTrackCount	()I
    //   31: istore 5
    //   33: iload_2
    //   34: iload 5
    //   36: if_icmpge +131 -> 167
    //   39: aload_3
    //   40: astore 4
    //   42: aload_3
    //   43: iload_2
    //   44: invokevirtual 277	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   47: astore 6
    //   49: aload_3
    //   50: astore 4
    //   52: aload 6
    //   54: ldc_w 279
    //   57: invokevirtual 285	android/media/MediaFormat:containsKey	(Ljava/lang/String;)Z
    //   60: ifeq +118 -> 178
    //   63: aload_3
    //   64: astore 4
    //   66: aload 6
    //   68: ldc_w 279
    //   71: invokevirtual 289	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   74: invokestatic 292	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   77: ifne +101 -> 178
    //   80: aload_3
    //   81: astore 4
    //   83: aload 6
    //   85: ldc_w 279
    //   88: invokevirtual 289	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   91: astore 7
    //   93: aload_3
    //   94: astore 4
    //   96: ldc 35
    //   98: ldc_w 294
    //   101: iconst_1
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload 7
    //   109: aastore
    //   110: invokestatic 105	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload_3
    //   114: astore 4
    //   116: aload 7
    //   118: ldc_w 296
    //   121: invokevirtual 301	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   124: ifeq +54 -> 178
    //   127: aload_3
    //   128: astore 4
    //   130: aload_1
    //   131: aload 6
    //   133: ldc_w 303
    //   136: invokevirtual 306	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   139: putfield 178	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   142: aload_3
    //   143: astore 4
    //   145: ldc 35
    //   147: ldc_w 308
    //   150: iconst_1
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_1
    //   157: getfield 178	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   160: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   163: aastore
    //   164: invokestatic 105	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: aload_3
    //   168: invokevirtual 311	android/media/MediaExtractor:release	()V
    //   171: ldc_w 263
    //   174: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: return
    //   178: iinc 2 1
    //   181: goto -148 -> 33
    //   184: astore 7
    //   186: aconst_null
    //   187: astore_3
    //   188: aload_3
    //   189: astore 4
    //   191: ldc 35
    //   193: aload 7
    //   195: ldc_w 313
    //   198: iconst_0
    //   199: anewarray 4	java/lang/Object
    //   202: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: aload_3
    //   206: astore 4
    //   208: aload_0
    //   209: invokestatic 161	com/tencent/mm/plugin/sight/base/d:WR	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sight/base/a;
    //   212: astore_0
    //   213: aload_0
    //   214: ifnull +39 -> 253
    //   217: aload_3
    //   218: astore 4
    //   220: aload_1
    //   221: aload_0
    //   222: getfield 166	com/tencent/mm/plugin/sight/base/a:eTk	I
    //   225: putfield 178	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   228: aload_3
    //   229: astore 4
    //   231: ldc 35
    //   233: ldc_w 315
    //   236: iconst_1
    //   237: anewarray 4	java/lang/Object
    //   240: dup
    //   241: iconst_0
    //   242: aload_0
    //   243: getfield 166	com/tencent/mm/plugin/sight/base/a:eTk	I
    //   246: invokestatic 102	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   249: aastore
    //   250: invokestatic 105	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   253: aload_3
    //   254: ifnull +38 -> 292
    //   257: aload_3
    //   258: invokevirtual 311	android/media/MediaExtractor:release	()V
    //   261: ldc_w 263
    //   264: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   267: goto -90 -> 177
    //   270: astore_0
    //   271: aconst_null
    //   272: astore 4
    //   274: aload 4
    //   276: ifnull +8 -> 284
    //   279: aload 4
    //   281: invokevirtual 311	android/media/MediaExtractor:release	()V
    //   284: ldc_w 263
    //   287: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: aload_0
    //   291: athrow
    //   292: ldc_w 263
    //   295: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: goto -121 -> 177
    //   301: astore_0
    //   302: goto -28 -> 274
    //   305: astore 7
    //   307: goto -119 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   8	16	184	java/lang/Exception
    //   8	16	270	finally
    //   19	24	301	finally
    //   27	33	301	finally
    //   42	49	301	finally
    //   52	63	301	finally
    //   66	80	301	finally
    //   83	93	301	finally
    //   96	113	301	finally
    //   116	127	301	finally
    //   130	142	301	finally
    //   145	167	301	finally
    //   191	205	301	finally
    //   208	213	301	finally
    //   220	228	301	finally
    //   231	253	301	finally
    //   19	24	305	java/lang/Exception
    //   27	33	305	java/lang/Exception
    //   42	49	305	java/lang/Exception
    //   52	63	305	java/lang/Exception
    //   66	80	305	java/lang/Exception
    //   83	93	305	java/lang/Exception
    //   96	113	305	java/lang/Exception
    //   116	127	305	java/lang/Exception
    //   130	142	305	java/lang/Exception
    //   145	167	305	java/lang/Exception
  }

  private static void a(String paramString1, String paramString2, VideoTransPara paramVideoTransPara, long paramLong)
  {
    AppMethodBeat.i(50927);
    ab.c("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, srcPath:%s, dstPath:%s, newPara:%s", new Object[] { paramString1, paramString2, paramVideoTransPara });
    g localg = new g();
    localg.b(paramString1, paramString2, paramVideoTransPara);
    localg.fYu = true;
    localg.fYv = true;
    int i = localg.fW(ea(paramString1));
    ab.i("MicroMsg.TransferUtil", "fallbackTransferWithVideoTransfer, finish, segRet:%s", new Object[] { Integer.valueOf(i) });
    w(i, paramLong);
    AppMethodBeat.o(50927);
  }

  public static int ea(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(50925);
    MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
    localMediaMetadataRetriever.setDataSource(paramString);
    paramString = localMediaMetadataRetriever.extractMetadata(9);
    localMediaMetadataRetriever.release();
    int j;
    if (paramString == null)
    {
      AppMethodBeat.o(50925);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        j = Integer.valueOf(paramString).intValue();
        AppMethodBeat.o(50925);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.TransferUtil", "getDuration error %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(50925);
        j = i;
      }
    }
  }

  public static boolean uD(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(50920);
    ab.i("MicroMsg.TransferUtil", "Check video format：h265 or h264？");
    try
    {
      MediaExtractor localMediaExtractor = new android/media/MediaExtractor;
      localMediaExtractor.<init>();
      localMediaExtractor.setDataSource(paramString);
      int i = localMediaExtractor.getTrackCount();
      int j = 0;
      if (j < i)
      {
        paramString = localMediaExtractor.getTrackFormat(j);
        if ((paramString.containsKey("mime")) && (!bo.isNullOrNil(paramString.getString("mime"))))
        {
          paramString = paramString.getString("mime");
          ab.i("MicroMsg.TransferUtil", "mime: %s", new Object[] { paramString });
          boolean bool2 = paramString.startsWith("video/hevc");
          if (bool2)
            AppMethodBeat.o(50920);
        }
      }
      while (true)
      {
        return bool1;
        j++;
        break;
        localMediaExtractor.release();
        AppMethodBeat.o(50920);
        bool1 = false;
      }
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TransferUtil", paramString, "check H265 error", new Object[0]);
    }
  }

  public static VideoTransPara uE(String paramString)
  {
    AppMethodBeat.i(50921);
    ab.i("MicroMsg.TransferUtil", "buildPara：srcPath %s ", new Object[] { paramString });
    VideoTransPara localVideoTransPara = new VideoTransPara();
    Object localObject = Boolean.valueOf(uD(paramString));
    ab.i("MicroMsg.TransferUtil", "Video format is h265 : %s", new Object[] { localObject });
    if (((Boolean)localObject).booleanValue())
    {
      localObject = new MediaMetadataRetriever();
      ((MediaMetadataRetriever)localObject).setDataSource(paramString);
      localVideoTransPara.duration = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(9), 0);
      localVideoTransPara.duration = bo.mA(localVideoTransPara.duration);
      localVideoTransPara.width = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), 0);
      localVideoTransPara.height = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), 0);
      localVideoTransPara.videoBitrate = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(20), 0);
      a(paramString, localVideoTransPara);
      ((MediaMetadataRetriever)localObject).release();
    }
    while (true)
    {
      ab.d("MicroMsg.TransferUtil", "VideoPara is : %s", new Object[] { localVideoTransPara });
      AppMethodBeat.o(50921);
      return localVideoTransPara;
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      PInt localPInt3 = new PInt();
      localObject = new PInt();
      PInt localPInt4 = new PInt();
      com.tencent.mm.plugin.sight.base.d.a(paramString, localPInt1, localPInt2, localPInt3, (PInt)localObject, localPInt4);
      localVideoTransPara.duration = bo.mA(localPInt1.value);
      localVideoTransPara.width = localPInt2.value;
      localVideoTransPara.height = localPInt3.value;
      localVideoTransPara.fps = ((PInt)localObject).value;
      localVideoTransPara.videoBitrate = localPInt4.value;
    }
  }

  // ERROR //
  private static VideoTransPara uF(String paramString)
  {
    // Byte code:
    //   0: ldc_w 381
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 175	com/tencent/mm/modelcontrol/VideoTransPara
    //   9: astore_1
    //   10: aload_1
    //   11: invokespecial 357	com/tencent/mm/modelcontrol/VideoTransPara:<init>	()V
    //   14: iconst_2
    //   15: newarray int
    //   17: astore_2
    //   18: new 329	android/media/MediaMetadataRetriever
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 330	android/media/MediaMetadataRetriever:<init>	()V
    //   26: aload_3
    //   27: aload_0
    //   28: invokevirtual 331	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   31: aload_3
    //   32: bipush 18
    //   34: invokevirtual 335	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   37: iconst_0
    //   38: invokestatic 365	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   41: istore 4
    //   43: aload_3
    //   44: bipush 19
    //   46: invokevirtual 335	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   49: iconst_0
    //   50: invokestatic 365	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   53: istore 5
    //   55: aload_2
    //   56: iconst_0
    //   57: iload 4
    //   59: iastore
    //   60: aload_2
    //   61: iconst_1
    //   62: iload 5
    //   64: iastore
    //   65: iconst_0
    //   66: istore 6
    //   68: iload 6
    //   70: iconst_3
    //   71: if_icmpge +126 -> 197
    //   74: iload 4
    //   76: iconst_2
    //   77: irem
    //   78: ifne +10 -> 88
    //   81: iload 5
    //   83: iconst_2
    //   84: irem
    //   85: ifeq +66 -> 151
    //   88: aload_3
    //   89: invokevirtual 336	android/media/MediaMetadataRetriever:release	()V
    //   92: aload_1
    //   93: aload_2
    //   94: iconst_0
    //   95: iaload
    //   96: putfield 189	com/tencent/mm/modelcontrol/VideoTransPara:width	I
    //   99: aload_1
    //   100: aload_2
    //   101: iconst_1
    //   102: iaload
    //   103: putfield 192	com/tencent/mm/modelcontrol/VideoTransPara:height	I
    //   106: aload_1
    //   107: getstatic 386	com/tencent/mm/plugin/sight/base/b:qwZ	I
    //   110: putfield 195	com/tencent/mm/modelcontrol/VideoTransPara:videoBitrate	I
    //   113: aload_1
    //   114: getstatic 389	com/tencent/mm/plugin/sight/base/b:qwY	I
    //   117: putfield 392	com/tencent/mm/modelcontrol/VideoTransPara:fzV	I
    //   120: aload_1
    //   121: iconst_2
    //   122: putfield 395	com/tencent/mm/modelcontrol/VideoTransPara:fzU	I
    //   125: aload_1
    //   126: getstatic 399	com/tencent/mm/plugin/sight/base/b:qxa	F
    //   129: f2i
    //   130: putfield 178	com/tencent/mm/modelcontrol/VideoTransPara:fps	I
    //   133: aload_1
    //   134: aload_0
    //   135: invokestatic 123	com/tencent/mm/bj/e:ea	(Ljava/lang/String;)I
    //   138: putfield 260	com/tencent/mm/modelcontrol/VideoTransPara:duration	I
    //   141: ldc_w 381
    //   144: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_1
    //   148: astore_0
    //   149: aload_0
    //   150: areturn
    //   151: iload 4
    //   153: iload 5
    //   155: if_icmplt +19 -> 174
    //   158: iload 4
    //   160: sipush 640
    //   163: if_icmple +34 -> 197
    //   166: iload 5
    //   168: sipush 480
    //   171: if_icmple +26 -> 197
    //   174: iload 4
    //   176: iload 5
    //   178: if_icmpgt +68 -> 246
    //   181: iload 4
    //   183: sipush 480
    //   186: if_icmple +11 -> 197
    //   189: iload 5
    //   191: sipush 640
    //   194: if_icmpgt +52 -> 246
    //   197: aload_2
    //   198: iconst_0
    //   199: iload 4
    //   201: iastore
    //   202: aload_2
    //   203: iconst_1
    //   204: iload 5
    //   206: iastore
    //   207: aload_3
    //   208: invokevirtual 336	android/media/MediaMetadataRetriever:release	()V
    //   211: goto -119 -> 92
    //   214: astore_0
    //   215: ldc 35
    //   217: aload_0
    //   218: ldc_w 401
    //   221: iconst_1
    //   222: anewarray 4	java/lang/Object
    //   225: dup
    //   226: iconst_0
    //   227: aload_0
    //   228: invokevirtual 206	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   231: aastore
    //   232: invokestatic 226	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: aconst_null
    //   236: astore_0
    //   237: ldc_w 381
    //   240: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: goto -94 -> 149
    //   246: iload 4
    //   248: iconst_2
    //   249: idiv
    //   250: istore 4
    //   252: iload 5
    //   254: iconst_2
    //   255: idiv
    //   256: istore 5
    //   258: iinc 6 1
    //   261: goto -193 -> 68
    //   264: astore_1
    //   265: aconst_null
    //   266: astore_0
    //   267: aload_0
    //   268: ifnull +7 -> 275
    //   271: aload_0
    //   272: invokevirtual 336	android/media/MediaMetadataRetriever:release	()V
    //   275: ldc_w 381
    //   278: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: aload_1
    //   282: athrow
    //   283: astore_1
    //   284: aload_3
    //   285: astore_0
    //   286: goto -19 -> 267
    //
    // Exception table:
    //   from	to	target	type
    //   6	18	214	java/lang/Exception
    //   88	92	214	java/lang/Exception
    //   92	141	214	java/lang/Exception
    //   207	211	214	java/lang/Exception
    //   271	275	214	java/lang/Exception
    //   275	283	214	java/lang/Exception
    //   18	26	264	finally
    //   26	55	283	finally
    //   246	258	283	finally
  }

  private static void w(int paramInt, long paramLong)
  {
    AppMethodBeat.i(50928);
    if (paramInt < 0)
      ab.i("MicroMsg.TransferUtil", "Local tranfer to H264 failed：%s", new Object[] { Integer.valueOf(paramInt) });
    ab.i("MicroMsg.TransferUtil", "Transfer Finish");
    paramLong = bo.yz() - paramLong;
    ab.i("MicroMsg.TransferUtil", "totalTime：%d", new Object[] { Long.valueOf(paramLong) });
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(354);
    localIDKey1.SetKey(253);
    localIDKey1.SetValue(paramLong);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(354);
    localIDKey2.SetKey(254);
    localIDKey2.SetValue(1L);
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    h.pYm.b(localArrayList, false);
    AppMethodBeat.o(50928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.e
 * JD-Core Version:    0.6.2
 */