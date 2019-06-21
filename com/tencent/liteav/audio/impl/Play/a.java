package com.tencent.liteav.audio.impl.Play;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.c;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class a
  implements Runnable
{
  private static final String a;
  private WeakReference<c> b = null;
  private MediaCodec c = null;
  private MediaCodec.BufferInfo d;
  private MediaFormat e;
  private long f = 0L;
  private volatile boolean g = false;
  private Vector<com.tencent.liteav.basic.g.a> h;
  private List i;
  private Thread j = null;

  static
  {
    AppMethodBeat.i(66592);
    a = "AudioCenter:" + a.class.getSimpleName();
    AppMethodBeat.o(66592);
  }

  private int a(com.tencent.liteav.basic.g.a parama, ByteBuffer[] paramArrayOfByteBuffer, int paramInt)
  {
    int k = -1;
    AppMethodBeat.i(66590);
    if (paramInt >= 0);
    while (true)
    {
      try
      {
        if (parama.f != null)
        {
          paramArrayOfByteBuffer = paramArrayOfByteBuffer[paramInt];
          paramArrayOfByteBuffer.clear();
          paramArrayOfByteBuffer.put(parama.f);
        }
        if ((parama != null) && (parama.f.length > 0))
        {
          this.c.queueInputBuffer(paramInt, 0, parama.f.length, c(), 0);
          paramArrayOfByteBuffer = this.c.getOutputBuffers();
          parama = paramArrayOfByteBuffer;
          if (this.d == null)
          {
            parama = new android/media/MediaCodec$BufferInfo;
            parama.<init>();
            this.d = parama;
            parama = paramArrayOfByteBuffer;
          }
          paramInt = this.c.dequeueOutputBuffer(this.d, 10000L);
          if (paramInt != -3)
            break label182;
          parama = this.c.getOutputBuffers();
          if (paramInt >= 0)
            continue;
          paramInt = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
          AppMethodBeat.o(66590);
          return paramInt;
        }
        this.c.queueInputBuffer(paramInt, 0, 0, c(), 4);
        continue;
      }
      catch (Exception parama)
      {
        continue;
      }
      if (paramInt == -1)
      {
        AppMethodBeat.o(66590);
        paramInt = k;
        continue;
        label182: Object localObject;
        if (paramInt == -2)
        {
          this.e = this.c.getOutputFormat();
          if (this.b != null)
          {
            paramArrayOfByteBuffer = (c)this.b.get();
            localObject = new com/tencent/liteav/basic/g/a;
            ((com.tencent.liteav.basic.g.a)localObject).<init>();
            ((com.tencent.liteav.basic.g.a)localObject).c = com.tencent.liteav.basic.a.a.h;
            ((com.tencent.liteav.basic.g.a)localObject).b = this.e.getInteger("channel-count");
            ((com.tencent.liteav.basic.g.a)localObject).a = this.e.getInteger("sample-rate");
            if (paramArrayOfByteBuffer != null)
              paramArrayOfByteBuffer.onPlayAudioInfoChanged((com.tencent.liteav.basic.g.a)localObject, (com.tencent.liteav.basic.g.a)localObject);
          }
        }
        else if (paramInt >= 0)
        {
          localObject = parama[paramInt];
          ((ByteBuffer)localObject).position(this.d.offset);
          ((ByteBuffer)localObject).limit(this.d.offset + this.d.size);
          paramArrayOfByteBuffer = new byte[this.d.size];
          ((ByteBuffer)localObject).get(paramArrayOfByteBuffer);
          long l = ((Long)this.i.get(0)).longValue();
          this.i.remove(0);
          if (this.b != null)
          {
            localObject = (c)this.b.get();
            if (localObject != null)
              ((c)localObject).onPlayPcmData(paramArrayOfByteBuffer, l);
          }
          this.c.releaseOutputBuffer(paramInt, false);
        }
      }
    }
  }

  // ERROR //
  private int b(com.tencent.liteav.basic.g.a parama)
  {
    // Byte code:
    //   0: ldc 211
    //   2: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: getfield 84	com/tencent/liteav/basic/g/a:f	[B
    //   9: arraylength
    //   10: iconst_2
    //   11: if_icmpeq +29 -> 40
    //   14: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   17: new 38	java/lang/StringBuilder
    //   20: dup
    //   21: ldc 213
    //   23: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_1
    //   27: getfield 84	com/tencent/liteav/basic/g/a:f	[B
    //   30: arraylength
    //   31: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   34: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: invokestatic 222	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: aload_1
    //   41: getfield 84	com/tencent/liteav/basic/g/a:f	[B
    //   44: ifnull +640 -> 684
    //   47: aload_1
    //   48: getfield 84	com/tencent/liteav/basic/g/a:f	[B
    //   51: iconst_0
    //   52: baload
    //   53: bipush 7
    //   55: iand
    //   56: iconst_1
    //   57: ishl
    //   58: aload_1
    //   59: getfield 84	com/tencent/liteav/basic/g/a:f	[B
    //   62: iconst_1
    //   63: baload
    //   64: sipush 128
    //   67: iand
    //   68: bipush 7
    //   70: ishr
    //   71: ior
    //   72: invokestatic 227	com/tencent/liteav/audio/impl/b:a	(I)I
    //   75: istore_2
    //   76: aload_1
    //   77: getfield 84	com/tencent/liteav/basic/g/a:f	[B
    //   80: iconst_1
    //   81: baload
    //   82: bipush 120
    //   84: iand
    //   85: iconst_3
    //   86: ishr
    //   87: istore_3
    //   88: aload_0
    //   89: ldc 229
    //   91: iload_2
    //   92: iload_3
    //   93: invokestatic 233	android/media/MediaFormat:createAudioFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   96: putfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   99: aload_0
    //   100: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   103: ldc 235
    //   105: ldc 236
    //   107: invokevirtual 240	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   110: aload_0
    //   111: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   114: ldc 242
    //   116: iconst_0
    //   117: invokevirtual 240	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   120: aload_0
    //   121: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   124: ldc 244
    //   126: iconst_2
    //   127: invokevirtual 240	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   130: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   133: new 38	java/lang/StringBuilder
    //   136: dup
    //   137: ldc 246
    //   139: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   142: aload_0
    //   143: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   146: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 251	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: aload_0
    //   156: getfield 67	com/tencent/liteav/audio/impl/Play/a:b	Ljava/lang/ref/WeakReference;
    //   159: ifnull +60 -> 219
    //   162: aload_0
    //   163: getfield 67	com/tencent/liteav/audio/impl/Play/a:b	Ljava/lang/ref/WeakReference;
    //   166: invokevirtual 136	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   169: checkcast 138	com/tencent/liteav/audio/c
    //   172: astore 4
    //   174: new 81	com/tencent/liteav/basic/g/a
    //   177: dup
    //   178: invokespecial 139	com/tencent/liteav/basic/g/a:<init>	()V
    //   181: astore 5
    //   183: aload 5
    //   185: getstatic 143	com/tencent/liteav/basic/a/a:h	I
    //   188: putfield 145	com/tencent/liteav/basic/g/a:c	I
    //   191: aload 5
    //   193: iload_3
    //   194: putfield 155	com/tencent/liteav/basic/g/a:b	I
    //   197: aload 5
    //   199: iload_2
    //   200: putfield 159	com/tencent/liteav/basic/g/a:a	I
    //   203: aload 4
    //   205: ifnull +14 -> 219
    //   208: aload 4
    //   210: aload 5
    //   212: aload 5
    //   214: invokeinterface 163 3 0
    //   219: aload_0
    //   220: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   223: ifnull +17 -> 240
    //   226: aload_0
    //   227: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   230: invokevirtual 254	android/media/MediaCodec:stop	()V
    //   233: aload_0
    //   234: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   237: invokevirtual 257	android/media/MediaCodec:release	()V
    //   240: aload_0
    //   241: ldc 229
    //   243: invokestatic 261	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   246: putfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   249: getstatic 266	android/os/Build$VERSION:SDK_INT	I
    //   252: bipush 21
    //   254: if_icmplt +310 -> 564
    //   257: iconst_0
    //   258: istore_2
    //   259: aload_0
    //   260: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   263: aload_0
    //   264: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   267: aconst_null
    //   268: aconst_null
    //   269: iconst_0
    //   270: invokevirtual 270	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   273: aload_0
    //   274: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   277: invokevirtual 273	android/media/MediaCodec:start	()V
    //   280: aload_0
    //   281: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   284: ifnull +26 -> 310
    //   287: aload_0
    //   288: aload_1
    //   289: aload_0
    //   290: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   293: invokevirtual 276	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   296: aload_0
    //   297: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   300: ldc2_w 113
    //   303: invokevirtual 280	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   306: invokespecial 282	com/tencent/liteav/audio/impl/Play/a:a	(Lcom/tencent/liteav/basic/g/a;[Ljava/nio/ByteBuffer;I)I
    //   309: pop
    //   310: getstatic 124	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_OK	I
    //   313: istore_2
    //   314: ldc 211
    //   316: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   319: iload_2
    //   320: ireturn
    //   321: astore 5
    //   323: iconst_0
    //   324: istore_2
    //   325: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   328: new 38	java/lang/StringBuilder
    //   331: dup
    //   332: ldc_w 284
    //   335: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   338: iload_2
    //   339: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   342: ldc_w 286
    //   345: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: aload 5
    //   350: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   353: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: goto -119 -> 240
    //   362: astore 5
    //   364: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   367: new 38	java/lang/StringBuilder
    //   370: dup
    //   371: ldc_w 290
    //   374: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   377: aload 5
    //   379: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   382: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   388: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   391: goto -142 -> 249
    //   394: astore 5
    //   396: iconst_0
    //   397: istore_3
    //   398: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   401: new 38	java/lang/StringBuilder
    //   404: dup
    //   405: ldc_w 295
    //   408: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   411: aload 5
    //   413: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   416: ldc_w 297
    //   419: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: iload_3
    //   423: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   426: ldc_w 299
    //   429: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: aload_0
    //   433: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   436: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   439: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   442: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   445: iinc 2 1
    //   448: iload_2
    //   449: iconst_1
    //   450: if_icmple +36 -> 486
    //   453: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   456: ldc_w 301
    //   459: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   462: aload_0
    //   463: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   466: invokevirtual 257	android/media/MediaCodec:release	()V
    //   469: aload_0
    //   470: aconst_null
    //   471: putfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   474: getstatic 304	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   477: istore_2
    //   478: ldc 211
    //   480: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   483: goto -164 -> 319
    //   486: aload 5
    //   488: invokevirtual 308	android/media/MediaCodec$CodecException:isRecoverable	()Z
    //   491: ifeq +18 -> 509
    //   494: aload_0
    //   495: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   498: invokevirtual 254	android/media/MediaCodec:stop	()V
    //   501: goto -242 -> 259
    //   504: astore 5
    //   506: goto -247 -> 259
    //   509: aload 5
    //   511: invokevirtual 311	android/media/MediaCodec$CodecException:isTransient	()Z
    //   514: ifeq +17 -> 531
    //   517: ldc2_w 312
    //   520: invokestatic 319	java/lang/Thread:sleep	(J)V
    //   523: goto -264 -> 259
    //   526: astore 5
    //   528: goto -269 -> 259
    //   531: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   534: ldc_w 321
    //   537: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   540: aload_0
    //   541: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   544: invokevirtual 257	android/media/MediaCodec:release	()V
    //   547: aload_0
    //   548: aconst_null
    //   549: putfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   552: getstatic 304	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   555: istore_2
    //   556: ldc 211
    //   558: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   561: goto -242 -> 319
    //   564: iconst_0
    //   565: istore_2
    //   566: aload_0
    //   567: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   570: aload_0
    //   571: getfield 130	com/tencent/liteav/audio/impl/Play/a:e	Landroid/media/MediaFormat;
    //   574: aconst_null
    //   575: aconst_null
    //   576: iconst_0
    //   577: invokevirtual 270	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   580: aload_0
    //   581: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   584: invokevirtual 273	android/media/MediaCodec:start	()V
    //   587: goto -307 -> 280
    //   590: astore 5
    //   592: iconst_1
    //   593: istore_3
    //   594: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   597: new 38	java/lang/StringBuilder
    //   600: dup
    //   601: ldc_w 323
    //   604: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   607: aload 5
    //   609: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   612: ldc_w 297
    //   615: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: iload_3
    //   619: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   622: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   625: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   628: iinc 2 1
    //   631: iload_2
    //   632: iconst_1
    //   633: if_icmple +36 -> 669
    //   636: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   639: ldc_w 301
    //   642: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   645: aload_0
    //   646: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   649: invokevirtual 257	android/media/MediaCodec:release	()V
    //   652: aload_0
    //   653: aconst_null
    //   654: putfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   657: getstatic 304	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   660: istore_2
    //   661: ldc 211
    //   663: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   666: goto -347 -> 319
    //   669: aload_0
    //   670: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   673: invokevirtual 326	android/media/MediaCodec:reset	()V
    //   676: goto -110 -> 566
    //   679: astore 5
    //   681: goto -115 -> 566
    //   684: getstatic 329	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_COMMON_ERR_INVALID_PARAMS	I
    //   687: istore_2
    //   688: ldc 211
    //   690: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   693: goto -374 -> 319
    //   696: astore 5
    //   698: iconst_0
    //   699: istore_3
    //   700: goto -106 -> 594
    //   703: astore 5
    //   705: iconst_1
    //   706: istore_3
    //   707: goto -309 -> 398
    //   710: astore 5
    //   712: iconst_1
    //   713: istore_2
    //   714: goto -389 -> 325
    //
    // Exception table:
    //   from	to	target	type
    //   226	233	321	java/lang/Exception
    //   240	249	362	java/io/IOException
    //   259	273	394	android/media/MediaCodec$CodecException
    //   494	501	504	java/lang/Exception
    //   517	523	526	java/lang/InterruptedException
    //   580	587	590	java/lang/IllegalStateException
    //   669	676	679	java/lang/Exception
    //   566	580	696	java/lang/IllegalStateException
    //   273	280	703	android/media/MediaCodec$CodecException
    //   233	240	710	java/lang/Exception
  }

  private long c()
  {
    AppMethodBeat.i(66591);
    long l1 = TXCTimeUtil.getTimeTick();
    long l2 = l1;
    if (l1 < this.f)
      l2 = l1 + (this.f - l1);
    this.f = l2;
    AppMethodBeat.o(66591);
    return l2;
  }

  public long a()
  {
    long l = 0L;
    AppMethodBeat.i(66586);
    if (this.e != null)
    {
      float f1 = this.e.getInteger("sample-rate");
      if (f1 != 0.0F)
      {
        l = ()(this.i.size() * 1024.0F * 1000.0F / f1);
        AppMethodBeat.o(66586);
      }
    }
    while (true)
    {
      return l;
      AppMethodBeat.o(66586);
      continue;
      AppMethodBeat.o(66586);
    }
  }

  public void a(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(66585);
    if (!this.g)
      AppMethodBeat.o(66585);
    while (true)
    {
      return;
      synchronized (this.h)
      {
        if (this.h != null)
          this.h.add(parama);
        AppMethodBeat.o(66585);
      }
    }
  }

  public void a(WeakReference<c> paramWeakReference)
  {
    AppMethodBeat.i(66584);
    if (this.g)
      b();
    this.b = paramWeakReference;
    this.f = 0L;
    this.h = new Vector();
    this.i = new ArrayList();
    this.g = true;
    this.j = new Thread(this);
    this.j.setName(a);
    this.j.start();
    AppMethodBeat.o(66584);
  }

  public void b()
  {
    AppMethodBeat.i(66587);
    this.g = false;
    if (this.j != null);
    try
    {
      this.j.join();
      label25: this.j = null;
      AppMethodBeat.o(66587);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label25;
    }
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc_w 374
    //   3: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 73	com/tencent/liteav/audio/impl/Play/a:g	Z
    //   10: ifeq +245 -> 255
    //   13: aload_0
    //   14: getfield 345	com/tencent/liteav/audio/impl/Play/a:h	Ljava/util/Vector;
    //   17: astore_1
    //   18: aload_1
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 345	com/tencent/liteav/audio/impl/Play/a:h	Ljava/util/Vector;
    //   24: invokevirtual 377	java/util/Vector:isEmpty	()Z
    //   27: istore_2
    //   28: aload_1
    //   29: monitorexit
    //   30: iload_2
    //   31: ifeq +27 -> 58
    //   34: ldc2_w 378
    //   37: invokestatic 319	java/lang/Thread:sleep	(J)V
    //   40: goto -34 -> 6
    //   43: astore_3
    //   44: goto -38 -> 6
    //   47: astore_3
    //   48: aload_1
    //   49: monitorexit
    //   50: ldc_w 374
    //   53: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_3
    //   57: athrow
    //   58: aload_0
    //   59: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   62: ifnull +236 -> 298
    //   65: aload_0
    //   66: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   69: invokevirtual 276	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   72: astore_3
    //   73: iconst_1
    //   74: istore 4
    //   76: aload_0
    //   77: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   80: ldc2_w 113
    //   83: invokevirtual 280	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   86: istore 5
    //   88: iload 5
    //   90: ifge +10 -> 100
    //   93: ldc_w 374
    //   96: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: return
    //   100: aload_0
    //   101: getfield 345	com/tencent/liteav/audio/impl/Play/a:h	Ljava/util/Vector;
    //   104: astore_1
    //   105: aload_1
    //   106: monitorenter
    //   107: aload_0
    //   108: getfield 345	com/tencent/liteav/audio/impl/Play/a:h	Ljava/util/Vector;
    //   111: iconst_0
    //   112: invokevirtual 380	java/util/Vector:remove	(I)Ljava/lang/Object;
    //   115: checkcast 81	com/tencent/liteav/basic/g/a
    //   118: astore 6
    //   120: aload_1
    //   121: monitorexit
    //   122: aload 6
    //   124: getfield 382	com/tencent/liteav/basic/g/a:d	I
    //   127: getstatic 385	com/tencent/liteav/basic/a/a:k	I
    //   130: if_icmpne +71 -> 201
    //   133: aload_0
    //   134: aload 6
    //   136: invokespecial 387	com/tencent/liteav/audio/impl/Play/a:b	(Lcom/tencent/liteav/basic/g/a;)I
    //   139: pop
    //   140: goto -134 -> 6
    //   143: astore_3
    //   144: iconst_0
    //   145: istore 5
    //   147: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   150: new 38	java/lang/StringBuilder
    //   153: dup
    //   154: ldc_w 389
    //   157: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   160: iload 5
    //   162: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   165: ldc_w 391
    //   168: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_3
    //   172: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: ldc_w 374
    //   184: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -88 -> 99
    //   190: astore_3
    //   191: aload_1
    //   192: monitorexit
    //   193: ldc_w 374
    //   196: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: aload_3
    //   200: athrow
    //   201: aload 6
    //   203: getfield 382	com/tencent/liteav/basic/g/a:d	I
    //   206: getstatic 394	com/tencent/liteav/basic/a/a:l	I
    //   209: if_icmpne +34 -> 243
    //   212: aload_0
    //   213: getfield 180	com/tencent/liteav/audio/impl/Play/a:i	Ljava/util/List;
    //   216: aload 6
    //   218: getfield 396	com/tencent/liteav/basic/g/a:e	J
    //   221: invokestatic 400	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   224: invokeinterface 401 2 0
    //   229: pop
    //   230: aload_0
    //   231: aload 6
    //   233: aload_3
    //   234: iload 5
    //   236: invokespecial 282	com/tencent/liteav/audio/impl/Play/a:a	(Lcom/tencent/liteav/basic/g/a;[Ljava/nio/ByteBuffer;I)I
    //   239: pop
    //   240: goto -234 -> 6
    //   243: getstatic 59	com/tencent/liteav/audio/impl/Play/a:a	Ljava/lang/String;
    //   246: ldc_w 403
    //   249: invokestatic 288	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   252: goto -246 -> 6
    //   255: aload_0
    //   256: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   259: ifnull +22 -> 281
    //   262: aload_0
    //   263: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   266: invokevirtual 254	android/media/MediaCodec:stop	()V
    //   269: aload_0
    //   270: getfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   273: invokevirtual 257	android/media/MediaCodec:release	()V
    //   276: aload_0
    //   277: aconst_null
    //   278: putfield 69	com/tencent/liteav/audio/impl/Play/a:c	Landroid/media/MediaCodec;
    //   281: ldc_w 374
    //   284: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: goto -188 -> 99
    //   290: astore_3
    //   291: iload 4
    //   293: istore 5
    //   295: goto -148 -> 147
    //   298: iconst_m1
    //   299: istore 5
    //   301: aconst_null
    //   302: astore_3
    //   303: goto -203 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   34	40	43	java/lang/Exception
    //   20	30	47	finally
    //   48	50	47	finally
    //   65	73	143	java/lang/Exception
    //   107	122	190	finally
    //   191	193	190	finally
    //   76	88	290	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.a
 * JD-Core Version:    0.6.2
 */