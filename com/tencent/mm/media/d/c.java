package com.tencent.mm.media.d;

import a.f.a.m;
import a.l;
import a.y;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecAACEncoder;", "Lcom/tencent/mm/media/encoder/IAudioEncoder;", "mediaFormat", "Landroid/media/MediaFormat;", "frameEncodeCallback", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/ParameterName;", "name", "data", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "", "frameEncodeEndCallback", "Lkotlin/Function0;", "(Landroid/media/MediaFormat;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "drainEncoder", "sendDataToEncoder", "pcmData", "", "pts", "", "isLast", "", "startEncoder", "Companion", "plugin-mediaeditor_release"})
public final class c extends a
{
  public static final a eVC;

  static
  {
    AppMethodBeat.i(12934);
    eVC = new a((byte)0);
    AppMethodBeat.o(12934);
  }

  public c(MediaFormat paramMediaFormat, m<? super ByteBuffer, ? super MediaCodec.BufferInfo, y> paramm, a.f.a.a<y> parama)
  {
    super(paramMediaFormat, paramm, parama);
    AppMethodBeat.i(12933);
    this.eVq.start();
    AppMethodBeat.o(12933);
  }

  // ERROR //
  @android.annotation.SuppressLint({"WrongConstant"})
  private final void UR()
  {
    // Byte code:
    //   0: sipush 12931
    //   3: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 91	com/tencent/mm/media/d/a:eTu	Ljava/lang/Object;
    //   10: astore_1
    //   11: aload_1
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield 95	com/tencent/mm/media/d/a:eTf	Z
    //   17: ifeq +19 -> 36
    //   20: ldc 97
    //   22: ldc 99
    //   24: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   27: aload_1
    //   28: monitorexit
    //   29: sipush 12931
    //   32: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: return
    //   36: getstatic 110	a/y:AUy	La/y;
    //   39: astore_2
    //   40: aload_1
    //   41: monitorexit
    //   42: new 112	android/media/MediaCodec$BufferInfo
    //   45: astore_1
    //   46: aload_1
    //   47: invokespecial 114	android/media/MediaCodec$BufferInfo:<init>	()V
    //   50: aload_0
    //   51: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   54: aload_1
    //   55: ldc2_w 115
    //   58: invokevirtual 120	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   61: istore_3
    //   62: ldc 97
    //   64: ldc 122
    //   66: iconst_1
    //   67: anewarray 124	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: iload_3
    //   73: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aastore
    //   77: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: iload_3
    //   81: iconst_m1
    //   82: if_icmpne +62 -> 144
    //   85: ldc 97
    //   87: ldc 136
    //   89: invokestatic 138	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: sipush 12931
    //   95: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   98: goto -63 -> 35
    //   101: astore_1
    //   102: ldc 97
    //   104: aload_1
    //   105: checkcast 140	java/lang/Throwable
    //   108: ldc 142
    //   110: iconst_1
    //   111: anewarray 124	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload_1
    //   117: invokevirtual 146	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   120: aastore
    //   121: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: sipush 12931
    //   127: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -95 -> 35
    //   133: astore_2
    //   134: aload_1
    //   135: monitorexit
    //   136: sipush 12931
    //   139: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: aload_2
    //   143: athrow
    //   144: iload_3
    //   145: bipush 254
    //   147: if_icmpne +43 -> 190
    //   150: aload_0
    //   151: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   154: invokevirtual 154	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   157: astore_2
    //   158: aload_2
    //   159: ldc 156
    //   161: invokestatic 158	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   164: aload_0
    //   165: aload_2
    //   166: invokevirtual 162	com/tencent/mm/media/d/c:c	(Landroid/media/MediaFormat;)V
    //   169: ldc 97
    //   171: ldc 164
    //   173: iconst_1
    //   174: anewarray 124	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload_0
    //   180: getfield 167	com/tencent/mm/media/d/a:eVr	Landroid/media/MediaFormat;
    //   183: aastore
    //   184: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: goto -137 -> 50
    //   190: iload_3
    //   191: ifge +24 -> 215
    //   194: ldc 97
    //   196: ldc 171
    //   198: iconst_1
    //   199: anewarray 124	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: iload_3
    //   205: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   208: aastore
    //   209: invokestatic 174	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: goto -162 -> 50
    //   215: aload_1
    //   216: getfield 178	android/media/MediaCodec$BufferInfo:flags	I
    //   219: iconst_2
    //   220: iand
    //   221: ifeq +35 -> 256
    //   224: ldc 97
    //   226: ldc 180
    //   228: iconst_2
    //   229: anewarray 124	java/lang/Object
    //   232: dup
    //   233: iconst_0
    //   234: aload_1
    //   235: getfield 183	android/media/MediaCodec$BufferInfo:size	I
    //   238: invokestatic 130	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aastore
    //   242: dup
    //   243: iconst_1
    //   244: getstatic 189	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   247: aastore
    //   248: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   251: aload_1
    //   252: iconst_0
    //   253: putfield 183	android/media/MediaCodec$BufferInfo:size	I
    //   256: ldc 97
    //   258: ldc 194
    //   260: invokestatic 196	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   263: aload_0
    //   264: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   267: invokevirtual 200	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   270: iload_3
    //   271: aaload
    //   272: astore_2
    //   273: aload_2
    //   274: ifnonnull +19 -> 293
    //   277: ldc 97
    //   279: ldc 202
    //   281: invokestatic 204	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: sipush 12931
    //   287: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: goto -255 -> 35
    //   293: aload_1
    //   294: getfield 183	android/media/MediaCodec$BufferInfo:size	I
    //   297: ifle +9 -> 306
    //   300: aload_0
    //   301: aload_2
    //   302: aload_1
    //   303: invokevirtual 208	com/tencent/mm/media/d/c:f	(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    //   306: aload_0
    //   307: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   310: iload_3
    //   311: iconst_0
    //   312: invokevirtual 212	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   315: aload_1
    //   316: getfield 178	android/media/MediaCodec$BufferInfo:flags	I
    //   319: iconst_4
    //   320: iand
    //   321: ifeq -271 -> 50
    //   324: ldc 97
    //   326: ldc 214
    //   328: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: aload_0
    //   332: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   335: invokevirtual 217	android/media/MediaCodec:stop	()V
    //   338: aload_0
    //   339: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   342: invokevirtual 220	android/media/MediaCodec:release	()V
    //   345: sipush 12931
    //   348: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   351: goto -316 -> 35
    //
    // Exception table:
    //   from	to	target	type
    //   6	13	101	java/lang/Exception
    //   27	35	101	java/lang/Exception
    //   40	50	101	java/lang/Exception
    //   50	80	101	java/lang/Exception
    //   85	98	101	java/lang/Exception
    //   134	144	101	java/lang/Exception
    //   150	187	101	java/lang/Exception
    //   194	212	101	java/lang/Exception
    //   215	256	101	java/lang/Exception
    //   256	273	101	java/lang/Exception
    //   277	290	101	java/lang/Exception
    //   293	306	101	java/lang/Exception
    //   306	351	101	java/lang/Exception
    //   13	27	133	finally
    //   36	40	133	finally
  }

  // ERROR //
  public final void b(byte[] paramArrayOfByte, long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: sipush 12932
    //   3: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ldc 224
    //   9: invokestatic 66	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_1
    //   13: ifnonnull +17 -> 30
    //   16: ldc 97
    //   18: ldc 226
    //   20: invokestatic 204	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: sipush 12932
    //   26: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: return
    //   30: aload_0
    //   31: getfield 91	com/tencent/mm/media/d/a:eTu	Ljava/lang/Object;
    //   34: astore 5
    //   36: aload 5
    //   38: monitorenter
    //   39: aload_0
    //   40: getfield 95	com/tencent/mm/media/d/a:eTf	Z
    //   43: ifeq +47 -> 90
    //   46: ldc 97
    //   48: ldc 228
    //   50: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: aload 5
    //   55: monitorexit
    //   56: sipush 12932
    //   59: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: goto -33 -> 29
    //   65: astore_1
    //   66: ldc 97
    //   68: aload_1
    //   69: checkcast 140	java/lang/Throwable
    //   72: ldc 229
    //   74: iconst_0
    //   75: anewarray 124	java/lang/Object
    //   78: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: sipush 12932
    //   84: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: goto -58 -> 29
    //   90: getstatic 110	a/y:AUy	La/y;
    //   93: astore 6
    //   95: aload 5
    //   97: monitorexit
    //   98: aload_0
    //   99: invokestatic 235	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   102: putfield 239	com/tencent/mm/media/d/a:eVs	J
    //   105: new 241	java/lang/StringBuilder
    //   108: astore 5
    //   110: aload 5
    //   112: ldc 243
    //   114: invokespecial 246	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: ldc 97
    //   119: aload 5
    //   121: aload_1
    //   122: arraylength
    //   123: invokevirtual 250	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   126: ldc 252
    //   128: invokevirtual 255	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: lload_2
    //   132: invokevirtual 258	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   135: ldc_w 260
    //   138: invokevirtual 255	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: iload 4
    //   143: invokevirtual 263	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   146: invokevirtual 266	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   156: ldc2_w 115
    //   159: invokevirtual 270	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   162: istore 7
    //   164: iload 7
    //   166: ifge +15 -> 181
    //   169: ldc 97
    //   171: ldc_w 272
    //   174: invokestatic 138	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: aload_0
    //   178: invokespecial 274	com/tencent/mm/media/d/c:UR	()V
    //   181: iload 7
    //   183: iflt +97 -> 280
    //   186: aload_0
    //   187: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   190: invokevirtual 277	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   193: iload 7
    //   195: aaload
    //   196: astore 5
    //   198: aload 5
    //   200: ifnull +9 -> 209
    //   203: aload 5
    //   205: invokevirtual 283	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   208: pop
    //   209: aload 5
    //   211: ifnull +10 -> 221
    //   214: aload 5
    //   216: iconst_0
    //   217: invokevirtual 287	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   220: pop
    //   221: aload 5
    //   223: ifnull +10 -> 233
    //   226: aload 5
    //   228: aload_1
    //   229: invokevirtual 291	java/nio/ByteBuffer:put	([B)Ljava/nio/ByteBuffer;
    //   232: pop
    //   233: iload 4
    //   235: ifeq +87 -> 322
    //   238: ldc 97
    //   240: ldc_w 293
    //   243: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: iconst_1
    //   247: istore 8
    //   249: aload_0
    //   250: invokevirtual 296	com/tencent/mm/media/d/c:releaseEncoder	()V
    //   253: iload 8
    //   255: ifeq +50 -> 305
    //   258: ldc 97
    //   260: ldc_w 298
    //   263: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: aload_0
    //   267: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   270: iload 7
    //   272: iconst_0
    //   273: aload_1
    //   274: arraylength
    //   275: lload_2
    //   276: iconst_4
    //   277: invokevirtual 302	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   280: aload_0
    //   281: invokespecial 274	com/tencent/mm/media/d/c:UR	()V
    //   284: sipush 12932
    //   287: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   290: goto -261 -> 29
    //   293: astore_1
    //   294: aload 5
    //   296: monitorexit
    //   297: sipush 12932
    //   300: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: aload_1
    //   304: athrow
    //   305: aload_0
    //   306: getfield 74	com/tencent/mm/media/d/a:eVq	Landroid/media/MediaCodec;
    //   309: iload 7
    //   311: iconst_0
    //   312: aload_1
    //   313: arraylength
    //   314: lload_2
    //   315: iconst_0
    //   316: invokevirtual 302	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   319: goto -39 -> 280
    //   322: iconst_0
    //   323: istore 8
    //   325: goto -72 -> 253
    //
    // Exception table:
    //   from	to	target	type
    //   16	29	65	java/lang/Exception
    //   30	39	65	java/lang/Exception
    //   53	62	65	java/lang/Exception
    //   95	164	65	java/lang/Exception
    //   169	181	65	java/lang/Exception
    //   186	198	65	java/lang/Exception
    //   203	209	65	java/lang/Exception
    //   214	221	65	java/lang/Exception
    //   226	233	65	java/lang/Exception
    //   238	246	65	java/lang/Exception
    //   249	253	65	java/lang/Exception
    //   258	280	65	java/lang/Exception
    //   280	284	65	java/lang/Exception
    //   294	305	65	java/lang/Exception
    //   305	319	65	java/lang/Exception
    //   39	53	293	finally
    //   90	95	293	finally
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/MediaCodecAACEncoder$Companion;", "", "()V", "TAG", "", "TIMEOUT", "", "plugin-mediaeditor_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.c
 * JD-Core Version:    0.6.2
 */