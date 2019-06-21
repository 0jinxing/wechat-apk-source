package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

@TargetApi(18)
public class b
  implements a
{
  public static float a = 0.5F;
  public static float b = 0.8F;
  public static float c = 1.25F;
  public static float d = 2.0F;
  private int e;
  private MediaMuxer f;
  private String g;
  private MediaFormat h;
  private MediaFormat i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private ConcurrentLinkedQueue<b.a> n;
  private ConcurrentLinkedQueue<b.a> o;
  private long p;
  private long q;
  private long r;

  public b()
  {
    AppMethodBeat.i(67097);
    this.e = 2;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = 0;
    this.k = 0;
    this.l = false;
    this.m = false;
    this.n = new ConcurrentLinkedQueue();
    this.o = new ConcurrentLinkedQueue();
    this.p = -1L;
    this.q = -1L;
    this.r = -1L;
    AppMethodBeat.o(67097);
  }

  private void a(boolean paramBoolean, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(67108);
    if ((paramByteBuffer == null) || (paramBufferInfo == null))
      AppMethodBeat.o(67108);
    while (true)
    {
      return;
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramByteBuffer.capacity());
      paramByteBuffer.rewind();
      if (paramBufferInfo.size > 0)
      {
        paramByteBuffer.position(paramBufferInfo.offset);
        paramByteBuffer.limit(paramBufferInfo.size);
      }
      localByteBuffer.rewind();
      localByteBuffer.put(paramByteBuffer);
      paramByteBuffer = new MediaCodec.BufferInfo();
      paramByteBuffer.set(paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.presentationTimeUs, paramBufferInfo.flags);
      paramByteBuffer = new b.a(localByteBuffer, paramByteBuffer);
      if (paramBoolean)
      {
        if (this.n.size() < 200)
        {
          this.n.add(paramByteBuffer);
          AppMethodBeat.o(67108);
        }
        else
        {
          TXCLog.e("TXCMP4HWMuxer", "drop video frame. video cache size is larger than 200");
          AppMethodBeat.o(67108);
        }
      }
      else if (this.o.size() < 600)
      {
        this.o.add(paramByteBuffer);
        AppMethodBeat.o(67108);
      }
      else
      {
        TXCLog.e("TXCMP4HWMuxer", "drop audio frame. audio cache size is larger than 600");
        AppMethodBeat.o(67108);
      }
    }
  }

  private void c(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    long l1 = 0L;
    AppMethodBeat.i(67106);
    long l2 = paramBufferInfo.presentationTimeUs - this.p;
    if (l2 < 0L)
    {
      TXCLog.e("TXCMP4HWMuxer", "pts error! first frame offset timeus = " + this.p + ", current timeus = " + paramBufferInfo.presentationTimeUs);
      l2 = l1;
      if (this.q > 0L)
        l2 = this.q;
    }
    while (true)
    {
      if (l2 < this.q)
        TXCLog.w("TXCMP4HWMuxer", "video is not in chronological order. current frame's pts(" + l2 + ") smaller than pre frame's pts(" + this.q + ")");
      while (true)
      {
        l1 = l2;
        if (this.e != 2)
        {
          if (this.e == 3)
            l1 = ()((float)l2 * b);
        }
        else
          label156: paramBufferInfo.presentationTimeUs = l1;
        try
        {
          paramByteBuffer.position(paramBufferInfo.offset);
          paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
          this.f.writeSampleData(this.k, paramByteBuffer, paramBufferInfo);
          if ((paramBufferInfo.flags & 0x1) != 0)
            this.m = true;
          AppMethodBeat.o(67106);
          return;
          this.q = l2;
          continue;
          if (this.e == 4)
          {
            l1 = ()((float)l2 * a);
            break label156;
          }
          if (this.e == 1)
          {
            l1 = ()((float)l2 * c);
            break label156;
          }
          l1 = l2;
          if (this.e != 0)
            break label156;
          l1 = ()((float)l2 * d);
        }
        catch (IllegalStateException paramByteBuffer)
        {
          while (true)
          {
            TXCLog.e("TXCMP4HWMuxer", "write frame IllegalStateException: ".concat(String.valueOf(paramByteBuffer)));
            AppMethodBeat.o(67106);
          }
        }
        catch (IllegalArgumentException paramByteBuffer)
        {
          while (true)
          {
            TXCLog.e("TXCMP4HWMuxer", "write frame IllegalArgumentException: ".concat(String.valueOf(paramByteBuffer)));
            AppMethodBeat.o(67106);
          }
        }
      }
    }
  }

  private long d()
  {
    AppMethodBeat.i(67109);
    if (this.n.size() > 0);
    for (long l1 = ((b.a)this.n.peek()).b().presentationTimeUs; ; l1 = 0L)
    {
      long l2 = l1;
      if (this.o.size() > 0)
      {
        b.a locala = (b.a)this.o.peek();
        l2 = l1;
        if (locala != null)
        {
          l2 = l1;
          if (locala.b() != null)
          {
            long l3 = ((b.a)this.o.peek()).b().presentationTimeUs;
            l2 = l1;
            if (l1 > l3)
              l2 = l3;
          }
        }
      }
      AppMethodBeat.o(67109);
      return l2;
    }
  }

  private void d(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(67107);
    long l1 = paramBufferInfo.presentationTimeUs - this.p;
    if ((this.p < 0L) || (l1 < 0L))
    {
      TXCLog.w("TXCMP4HWMuxer", "drop sample. first frame offset timeus = " + this.p + ", current sample timeus = " + paramBufferInfo.presentationTimeUs);
      AppMethodBeat.o(67107);
    }
    while (true)
    {
      return;
      label126: long l2;
      if (l1 < this.r)
      {
        TXCLog.e("TXCMP4HWMuxer", "audio is not in chronological order. current audio's pts pts(" + l1 + ") must larger than pre audio's pts(" + this.r + ")");
        l1 = this.r + 1L;
        l2 = l1;
        if (this.e != 2)
        {
          if (this.e != 3)
            break label189;
          l2 = ()((float)l1 * b);
        }
        label154: paramBufferInfo.presentationTimeUs = l2;
      }
      try
      {
        this.f.writeSampleData(this.j, paramByteBuffer, paramBufferInfo);
        AppMethodBeat.o(67107);
        continue;
        this.r = l1;
        break label126;
        label189: if (this.e == 4)
        {
          l2 = ()((float)l1 * a);
          break label154;
        }
        if (this.e == 1)
        {
          l2 = ()((float)l1 * c);
          break label154;
        }
        l2 = l1;
        if (this.e != 0)
          break label154;
        l2 = ()((float)l1 * d);
      }
      catch (IllegalStateException paramByteBuffer)
      {
        TXCLog.e("TXCMP4HWMuxer", "write sample IllegalStateException: ".concat(String.valueOf(paramByteBuffer)));
        AppMethodBeat.o(67107);
      }
      catch (IllegalArgumentException paramByteBuffer)
      {
        TXCLog.e("TXCMP4HWMuxer", "write sample IllegalArgumentException: ".concat(String.valueOf(paramByteBuffer)));
        AppMethodBeat.o(67107);
      }
    }
  }

  private void e()
  {
    AppMethodBeat.i(67110);
    b.a locala;
    while (this.n.size() > 0)
    {
      locala = (b.a)this.n.poll();
      c(locala.a(), locala.b());
    }
    while (this.o.size() > 0)
    {
      locala = (b.a)this.o.poll();
      d(locala.a(), locala.b());
    }
    AppMethodBeat.o(67110);
  }

  // ERROR //
  public int a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 252
    //   6: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: getfield 65	com/tencent/liteav/muxer/b:g	Ljava/lang/String;
    //   13: ifnull +13 -> 26
    //   16: aload_0
    //   17: getfield 65	com/tencent/liteav/muxer/b:g	Ljava/lang/String;
    //   20: invokevirtual 256	java/lang/String:isEmpty	()Z
    //   23: ifeq +22 -> 45
    //   26: ldc 151
    //   28: ldc_w 258
    //   31: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: iconst_m1
    //   35: istore_1
    //   36: ldc 252
    //   38: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_0
    //   42: monitorexit
    //   43: iload_1
    //   44: ireturn
    //   45: aload_0
    //   46: invokevirtual 260	com/tencent/liteav/muxer/b:c	()Z
    //   49: ifne +27 -> 76
    //   52: ldc 151
    //   54: ldc_w 262
    //   57: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: bipush 254
    //   62: istore_1
    //   63: ldc 252
    //   65: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: goto -27 -> 41
    //   71: astore_2
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_2
    //   75: athrow
    //   76: aload_0
    //   77: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   80: ifnull +19 -> 99
    //   83: ldc 151
    //   85: ldc_w 264
    //   88: invokestatic 194	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: ldc 252
    //   93: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: goto -55 -> 41
    //   99: ldc 151
    //   101: ldc_w 266
    //   104: invokestatic 268	com/tencent/liteav/basic/log/TXCLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: new 198	android/media/MediaMuxer
    //   110: astore_2
    //   111: aload_2
    //   112: aload_0
    //   113: getfield 65	com/tencent/liteav/muxer/b:g	Ljava/lang/String;
    //   116: iconst_0
    //   117: invokespecial 271	android/media/MediaMuxer:<init>	(Ljava/lang/String;I)V
    //   120: aload_0
    //   121: aload_2
    //   122: putfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   125: aload_0
    //   126: getfield 67	com/tencent/liteav/muxer/b:h	Landroid/media/MediaFormat;
    //   129: astore_2
    //   130: aload_2
    //   131: ifnull +18 -> 149
    //   134: aload_0
    //   135: aload_0
    //   136: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   139: aload_0
    //   140: getfield 67	com/tencent/liteav/muxer/b:h	Landroid/media/MediaFormat;
    //   143: invokevirtual 275	android/media/MediaMuxer:addTrack	(Landroid/media/MediaFormat;)I
    //   146: putfield 73	com/tencent/liteav/muxer/b:k	I
    //   149: aload_0
    //   150: getfield 69	com/tencent/liteav/muxer/b:i	Landroid/media/MediaFormat;
    //   153: astore_2
    //   154: aload_2
    //   155: ifnull +18 -> 173
    //   158: aload_0
    //   159: aload_0
    //   160: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   163: aload_0
    //   164: getfield 69	com/tencent/liteav/muxer/b:i	Landroid/media/MediaFormat;
    //   167: invokevirtual 275	android/media/MediaMuxer:addTrack	(Landroid/media/MediaFormat;)I
    //   170: putfield 71	com/tencent/liteav/muxer/b:j	I
    //   173: aload_0
    //   174: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   177: invokevirtual 277	android/media/MediaMuxer:start	()V
    //   180: aload_0
    //   181: ldc2_w 85
    //   184: putfield 88	com/tencent/liteav/muxer/b:p	J
    //   187: aload_0
    //   188: iconst_1
    //   189: putfield 75	com/tencent/liteav/muxer/b:l	Z
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield 77	com/tencent/liteav/muxer/b:m	Z
    //   197: aload_0
    //   198: ldc2_w 85
    //   201: putfield 90	com/tencent/liteav/muxer/b:q	J
    //   204: aload_0
    //   205: ldc2_w 85
    //   208: putfield 92	com/tencent/liteav/muxer/b:r	J
    //   211: ldc 252
    //   213: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: goto -175 -> 41
    //   219: astore_2
    //   220: ldc 151
    //   222: ldc_w 279
    //   225: aload_2
    //   226: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   229: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   232: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: bipush 252
    //   237: istore_1
    //   238: ldc 252
    //   240: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: goto -202 -> 41
    //   246: astore_2
    //   247: ldc 151
    //   249: ldc_w 281
    //   252: aload_2
    //   253: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   256: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   259: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: bipush 251
    //   264: istore_1
    //   265: ldc 252
    //   267: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: goto -229 -> 41
    //   273: astore_2
    //   274: ldc 151
    //   276: ldc_w 283
    //   279: aload_2
    //   280: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   283: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   286: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   289: bipush 250
    //   291: istore_1
    //   292: ldc 252
    //   294: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   297: goto -256 -> 41
    //   300: astore_2
    //   301: ldc 151
    //   303: ldc_w 285
    //   306: aload_2
    //   307: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   310: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   313: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   316: bipush 249
    //   318: istore_1
    //   319: ldc 252
    //   321: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   324: goto -283 -> 41
    //   327: astore_2
    //   328: ldc 151
    //   330: ldc_w 287
    //   333: aload_2
    //   334: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   337: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   340: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   343: bipush 248
    //   345: istore_1
    //   346: ldc 252
    //   348: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   351: goto -310 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   4	26	71	finally
    //   26	34	71	finally
    //   36	41	71	finally
    //   45	60	71	finally
    //   63	68	71	finally
    //   76	96	71	finally
    //   99	107	71	finally
    //   107	125	71	finally
    //   125	130	71	finally
    //   134	149	71	finally
    //   149	154	71	finally
    //   158	173	71	finally
    //   173	216	71	finally
    //   220	235	71	finally
    //   238	243	71	finally
    //   247	262	71	finally
    //   265	270	71	finally
    //   274	289	71	finally
    //   292	297	71	finally
    //   301	316	71	finally
    //   319	324	71	finally
    //   328	343	71	finally
    //   346	351	71	finally
    //   107	125	219	java/io/IOException
    //   134	149	246	java/lang/IllegalArgumentException
    //   134	149	273	java/lang/IllegalStateException
    //   158	173	300	java/lang/IllegalArgumentException
    //   158	173	327	java/lang/IllegalStateException
  }

  public void a(MediaFormat paramMediaFormat)
  {
    try
    {
      AppMethodBeat.i(67098);
      TXCLog.d("TXCMP4HWMuxer", "addVideoTrack:".concat(String.valueOf(paramMediaFormat)));
      this.h = paramMediaFormat;
      this.n.clear();
      AppMethodBeat.o(67098);
      return;
    }
    finally
    {
      paramMediaFormat = finally;
    }
    throw paramMediaFormat;
  }

  public void a(String paramString)
  {
    try
    {
      this.g = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(67104);
        if (this.f == null)
        {
          a(true, paramByteBuffer, paramBufferInfo);
          paramByteBuffer = new java/lang/StringBuilder;
          paramByteBuffer.<init>("cache frame before muexer ready. ptsUs: ");
          TXCLog.w("TXCMP4HWMuxer", paramBufferInfo.presentationTimeUs);
          AppMethodBeat.o(67104);
          return;
        }
        if (this.p < 0L)
        {
          a(true, paramByteBuffer, paramBufferInfo);
          this.p = d();
          paramByteBuffer = new java/lang/StringBuilder;
          paramByteBuffer.<init>("first frame offset = ");
          TXCLog.d("TXCMP4HWMuxer", this.p);
          e();
          AppMethodBeat.o(67104);
          continue;
        }
      }
      finally
      {
      }
      c(paramByteBuffer, paramBufferInfo);
      AppMethodBeat.o(67104);
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(67103);
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt2);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = new android/media/MediaCodec$BufferInfo;
      paramArrayOfByte.<init>();
      paramArrayOfByte.presentationTimeUs = paramLong;
      paramArrayOfByte.offset = 0;
      paramArrayOfByte.size = paramInt2;
      paramArrayOfByte.flags = paramInt3;
      b(localByteBuffer, paramArrayOfByte);
      AppMethodBeat.o(67103);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }

  // ERROR //
  public int b()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc_w 315
    //   7: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   14: ifnull +124 -> 138
    //   17: new 167	java/lang/StringBuilder
    //   20: astore_2
    //   21: aload_2
    //   22: ldc_w 317
    //   25: invokespecial 172	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: ldc 151
    //   30: aload_2
    //   31: aload_0
    //   32: getfield 75	com/tencent/liteav/muxer/b:l	Z
    //   35: invokevirtual 320	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   38: ldc_w 322
    //   41: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_0
    //   45: getfield 77	com/tencent/liteav/muxer/b:m	Z
    //   48: invokevirtual 320	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   51: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokestatic 268	com/tencent/liteav/basic/log/TXCLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: aload_0
    //   58: getfield 75	com/tencent/liteav/muxer/b:l	Z
    //   61: ifeq +17 -> 78
    //   64: aload_0
    //   65: getfield 77	com/tencent/liteav/muxer/b:m	Z
    //   68: ifeq +10 -> 78
    //   71: aload_0
    //   72: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   75: invokevirtual 325	android/media/MediaMuxer:stop	()V
    //   78: aload_0
    //   79: getfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   82: invokevirtual 328	android/media/MediaMuxer:release	()V
    //   85: aload_0
    //   86: iconst_0
    //   87: putfield 75	com/tencent/liteav/muxer/b:l	Z
    //   90: aload_0
    //   91: aconst_null
    //   92: putfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield 77	com/tencent/liteav/muxer/b:m	Z
    //   100: aload_0
    //   101: getfield 82	com/tencent/liteav/muxer/b:n	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   104: invokevirtual 294	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   107: aload_0
    //   108: getfield 84	com/tencent/liteav/muxer/b:o	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   111: invokevirtual 294	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   114: aload_0
    //   115: aconst_null
    //   116: putfield 67	com/tencent/liteav/muxer/b:h	Landroid/media/MediaFormat;
    //   119: aload_0
    //   120: aconst_null
    //   121: putfield 69	com/tencent/liteav/muxer/b:i	Landroid/media/MediaFormat;
    //   124: aload_0
    //   125: ldc2_w 85
    //   128: putfield 90	com/tencent/liteav/muxer/b:q	J
    //   131: aload_0
    //   132: ldc2_w 85
    //   135: putfield 92	com/tencent/liteav/muxer/b:r	J
    //   138: ldc_w 315
    //   141: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: aload_0
    //   145: monitorexit
    //   146: iload_1
    //   147: ireturn
    //   148: astore_2
    //   149: ldc 151
    //   151: ldc_w 330
    //   154: aload_2
    //   155: invokestatic 210	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   158: invokevirtual 214	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   161: invokestatic 158	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: aload_0
    //   165: iconst_0
    //   166: putfield 75	com/tencent/liteav/muxer/b:l	Z
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield 77	com/tencent/liteav/muxer/b:m	Z
    //   179: aload_0
    //   180: getfield 82	com/tencent/liteav/muxer/b:n	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   183: invokevirtual 294	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   186: aload_0
    //   187: getfield 84	com/tencent/liteav/muxer/b:o	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   190: invokevirtual 294	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   193: aload_0
    //   194: aconst_null
    //   195: putfield 67	com/tencent/liteav/muxer/b:h	Landroid/media/MediaFormat;
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield 69	com/tencent/liteav/muxer/b:i	Landroid/media/MediaFormat;
    //   203: aload_0
    //   204: ldc2_w 85
    //   207: putfield 90	com/tencent/liteav/muxer/b:q	J
    //   210: aload_0
    //   211: ldc2_w 85
    //   214: putfield 92	com/tencent/liteav/muxer/b:r	J
    //   217: iconst_m1
    //   218: istore_1
    //   219: ldc_w 315
    //   222: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: goto -81 -> 144
    //   228: astore_2
    //   229: aload_0
    //   230: monitorexit
    //   231: aload_2
    //   232: athrow
    //   233: astore_2
    //   234: aload_0
    //   235: iconst_0
    //   236: putfield 75	com/tencent/liteav/muxer/b:l	Z
    //   239: aload_0
    //   240: aconst_null
    //   241: putfield 196	com/tencent/liteav/muxer/b:f	Landroid/media/MediaMuxer;
    //   244: aload_0
    //   245: iconst_0
    //   246: putfield 77	com/tencent/liteav/muxer/b:m	Z
    //   249: aload_0
    //   250: getfield 82	com/tencent/liteav/muxer/b:n	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   253: invokevirtual 294	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   256: aload_0
    //   257: getfield 84	com/tencent/liteav/muxer/b:o	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   260: invokevirtual 294	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   263: aload_0
    //   264: aconst_null
    //   265: putfield 67	com/tencent/liteav/muxer/b:h	Landroid/media/MediaFormat;
    //   268: aload_0
    //   269: aconst_null
    //   270: putfield 69	com/tencent/liteav/muxer/b:i	Landroid/media/MediaFormat;
    //   273: aload_0
    //   274: ldc2_w 85
    //   277: putfield 90	com/tencent/liteav/muxer/b:q	J
    //   280: aload_0
    //   281: ldc2_w 85
    //   284: putfield 92	com/tencent/liteav/muxer/b:r	J
    //   287: ldc_w 315
    //   290: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   293: aload_2
    //   294: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   57	78	148	java/lang/Exception
    //   78	85	148	java/lang/Exception
    //   4	57	228	finally
    //   85	138	228	finally
    //   138	144	228	finally
    //   164	217	228	finally
    //   219	225	228	finally
    //   234	295	228	finally
    //   57	78	233	finally
    //   78	85	233	finally
    //   149	164	233	finally
  }

  public void b(MediaFormat paramMediaFormat)
  {
    try
    {
      AppMethodBeat.i(67099);
      TXCLog.d("TXCMP4HWMuxer", "addAudioTrack:".concat(String.valueOf(paramMediaFormat)));
      this.i = paramMediaFormat;
      this.o.clear();
      AppMethodBeat.o(67099);
      return;
    }
    finally
    {
      paramMediaFormat = finally;
    }
    throw paramMediaFormat;
  }

  public void b(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    try
    {
      AppMethodBeat.i(67105);
      if ((this.f == null) || (this.p < 0L))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("cache sample before muexer ready. ptsUs: ");
        TXCLog.w("TXCMP4HWMuxer", paramBufferInfo.presentationTimeUs);
        a(false, paramByteBuffer, paramBufferInfo);
        AppMethodBeat.o(67105);
      }
      while (true)
      {
        return;
        d(paramByteBuffer, paramBufferInfo);
        AppMethodBeat.o(67105);
      }
    }
    finally
    {
    }
    throw paramByteBuffer;
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(67102);
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt2);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = new android/media/MediaCodec$BufferInfo;
      paramArrayOfByte.<init>();
      paramArrayOfByte.presentationTimeUs = paramLong;
      paramArrayOfByte.offset = 0;
      paramArrayOfByte.size = paramInt2;
      paramArrayOfByte.flags = paramInt3;
      a(localByteBuffer, paramArrayOfByte);
      AppMethodBeat.o(67102);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }

  public boolean c()
  {
    try
    {
      MediaFormat localMediaFormat = this.h;
      if (localMediaFormat != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.muxer.b
 * JD-Core Version:    0.6.2
 */