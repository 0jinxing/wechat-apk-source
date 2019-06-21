package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.muxer.jni.TXSWMuxerJNI;
import com.tencent.liteav.muxer.jni.TXSWMuxerJNI.AVOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

@TargetApi(18)
public class d
  implements a
{
  public static float a = 0.5F;
  public static float b = 0.8F;
  public static float c = 1.25F;
  public static float d = 2.0F;
  private int e;
  private TXSWMuxerJNI f;
  private String g;
  private MediaFormat h;
  private MediaFormat i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private ConcurrentLinkedQueue<d.a> n;
  private ConcurrentLinkedQueue<d.a> o;
  private long p;
  private long q;
  private long r;

  public d()
  {
    AppMethodBeat.i(67121);
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
    AppMethodBeat.o(67121);
  }

  private void a(long paramLong)
  {
    AppMethodBeat.i(67140);
    while (this.o.size() > 0)
      if (((d.a)this.o.peek()).b() == null)
      {
        TXCLog.e("TXCMP4SWMuxer", "flushAudioCache, bufferInfo is null");
        this.o.remove();
      }
      else
      {
        if (((d.a)this.o.peek()).b().presentationTimeUs >= paramLong)
          break;
        d.a locala = (d.a)this.o.poll();
        d(locala.a(), locala.b());
      }
    AppMethodBeat.o(67140);
  }

  private void a(boolean paramBoolean, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(67136);
    if ((paramByteBuffer == null) || (paramBufferInfo == null))
      AppMethodBeat.o(67136);
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
      paramByteBuffer = new d.a(localByteBuffer, paramByteBuffer);
      if (paramBoolean)
      {
        if (this.n.size() < 200)
        {
          this.n.add(paramByteBuffer);
          AppMethodBeat.o(67136);
        }
        else
        {
          TXCLog.e("TXCMP4SWMuxer", "drop video frame. video cache size is larger than 200");
          AppMethodBeat.o(67136);
        }
      }
      else
      {
        this.o.add(paramByteBuffer);
        AppMethodBeat.o(67136);
      }
    }
  }

  private void c(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    long l1 = 0L;
    int i1 = 1;
    AppMethodBeat.i(67134);
    long l2 = paramBufferInfo.presentationTimeUs - this.p;
    if (l2 < 0L)
    {
      TXCLog.e("TXCMP4SWMuxer", "pts error! first frame offset timeus = " + this.p + ", current timeus = " + paramBufferInfo.presentationTimeUs);
      if (this.q <= 0L);
    }
    for (l1 = this.q; ; l1 = l2)
    {
      if (l1 < this.q)
        TXCLog.w("TXCMP4SWMuxer", "video is not in chronological order. current frame's pts(" + l1 + ") smaller than pre frame's pts(" + this.q + ")");
      while (true)
      {
        l2 = l1;
        if (this.e != 2)
        {
          if (this.e == 3)
            l2 = ()((float)l1 * b);
        }
        else
          label153: paramBufferInfo.presentationTimeUs = l2;
        try
        {
          paramByteBuffer.position(paramBufferInfo.offset);
          paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
          TXSWMuxerJNI localTXSWMuxerJNI = this.f;
          int i2 = paramBufferInfo.offset;
          int i3 = paramBufferInfo.size;
          if (paramBufferInfo.flags == 1);
          while (true)
          {
            localTXSWMuxerJNI.a(paramByteBuffer, 1, i2, i3, i1, paramBufferInfo.presentationTimeUs);
            if ((paramBufferInfo.flags & 0x1) != 0)
              this.m = true;
            AppMethodBeat.o(67134);
            return;
            this.q = l1;
            break;
            if (this.e == 4)
            {
              l2 = ()((float)l1 * a);
              break label153;
            }
            if (this.e == 1)
            {
              l2 = ()((float)l1 * c);
              break label153;
            }
            l2 = l1;
            if (this.e != 0)
              break label153;
            l2 = ()((float)l1 * d);
            break label153;
            i1 = 0;
          }
        }
        catch (IllegalStateException paramByteBuffer)
        {
          while (true)
          {
            TXCLog.e("TXCMP4SWMuxer", "write frame IllegalStateException: ".concat(String.valueOf(paramByteBuffer)));
            AppMethodBeat.o(67134);
          }
        }
        catch (IllegalArgumentException paramByteBuffer)
        {
          while (true)
          {
            TXCLog.e("TXCMP4SWMuxer", "write frame IllegalArgumentException: ".concat(String.valueOf(paramByteBuffer)));
            AppMethodBeat.o(67134);
          }
        }
      }
    }
  }

  private ByteBuffer d()
  {
    AppMethodBeat.i(67124);
    ByteBuffer localByteBuffer = this.i.getByteBuffer("csd-0");
    localByteBuffer.position(0);
    AppMethodBeat.o(67124);
    return localByteBuffer;
  }

  private void d(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(67135);
    long l1 = paramBufferInfo.presentationTimeUs - this.p;
    if ((this.p < 0L) || (l1 < 0L))
    {
      TXCLog.w("TXCMP4SWMuxer", "drop sample. first frame offset timeus = " + this.p + ", current sample timeus = " + paramBufferInfo.presentationTimeUs);
      AppMethodBeat.o(67135);
    }
    while (true)
    {
      return;
      label126: long l2;
      if (l1 < this.r)
      {
        TXCLog.e("TXCMP4SWMuxer", "audio is not in chronological order. current audio's pts pts(" + l1 + ") must larger than pre audio's pts(" + this.r + ")");
        l1 = this.r + 1L;
        l2 = l1;
        if (this.e != 2)
        {
          if (this.e != 3)
            break label225;
          l2 = ()((float)l1 * b);
        }
        label154: paramBufferInfo.presentationTimeUs = l2;
      }
      try
      {
        paramByteBuffer.position(paramBufferInfo.offset);
        paramByteBuffer.limit(paramBufferInfo.offset + paramBufferInfo.size);
        this.f.a(paramByteBuffer, 0, paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.flags, paramBufferInfo.presentationTimeUs);
        AppMethodBeat.o(67135);
        continue;
        this.r = l1;
        break label126;
        label225: if (this.e == 4)
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
        TXCLog.e("TXCMP4SWMuxer", "write sample IllegalStateException: ".concat(String.valueOf(paramByteBuffer)));
        AppMethodBeat.o(67135);
      }
      catch (IllegalArgumentException paramByteBuffer)
      {
        TXCLog.e("TXCMP4SWMuxer", "write sample IllegalArgumentException: ".concat(String.valueOf(paramByteBuffer)));
        AppMethodBeat.o(67135);
      }
    }
  }

  private ByteBuffer e()
  {
    AppMethodBeat.i(67125);
    ByteBuffer localByteBuffer = this.h.getByteBuffer("csd-0");
    AppMethodBeat.o(67125);
    return localByteBuffer;
  }

  private ByteBuffer f()
  {
    AppMethodBeat.i(67126);
    ByteBuffer localByteBuffer = this.h.getByteBuffer("csd-1");
    AppMethodBeat.o(67126);
    return localByteBuffer;
  }

  private long g()
  {
    AppMethodBeat.i(67137);
    if (this.n.size() > 0);
    for (long l1 = ((d.a)this.n.peek()).b().presentationTimeUs; ; l1 = 0L)
    {
      long l2 = l1;
      if (this.o.size() > 0)
      {
        d.a locala = (d.a)this.o.peek();
        l2 = l1;
        if (locala != null)
        {
          l2 = l1;
          if (locala.b() != null)
          {
            long l3 = ((d.a)this.o.peek()).b().presentationTimeUs;
            l2 = l1;
            if (l1 > l3)
              l2 = l3;
          }
        }
      }
      AppMethodBeat.o(67137);
      return l2;
    }
  }

  private void h()
  {
    AppMethodBeat.i(67138);
    d.a locala;
    while (this.n.size() > 0)
    {
      locala = (d.a)this.n.poll();
      c(locala.a(), locala.b());
    }
    while (this.o.size() > 0)
    {
      locala = (d.a)this.o.poll();
      d(locala.a(), locala.b());
    }
    AppMethodBeat.o(67138);
  }

  private void i()
  {
    AppMethodBeat.i(67139);
    while (this.n.size() > 0)
    {
      d.a locala = (d.a)this.n.poll();
      a(locala.b().presentationTimeUs);
      c(locala.a(), locala.b());
    }
    AppMethodBeat.o(67139);
  }

  public int a()
  {
    int i1 = 0;
    while (true)
    {
      int i2;
      try
      {
        AppMethodBeat.i(67127);
        if ((this.g == null) || (this.g.isEmpty()))
        {
          TXCLog.e("TXCMP4SWMuxer", "target path not set yet!");
          i2 = -1;
          AppMethodBeat.o(67127);
          return i2;
        }
        if (!c())
        {
          TXCLog.e("TXCMP4SWMuxer", "video track not set yet!");
          i2 = -2;
          AppMethodBeat.o(67127);
          continue;
        }
      }
      finally
      {
      }
      if (this.f != null)
      {
        TXCLog.w("TXCMP4SWMuxer", "start has been called. stop must be called before start");
        AppMethodBeat.o(67127);
        i2 = i1;
      }
      else
      {
        TXCLog.d("TXCMP4SWMuxer", "start");
        Object localObject2 = new com/tencent/liteav/muxer/jni/TXSWMuxerJNI;
        ((TXSWMuxerJNI)localObject2).<init>();
        this.f = ((TXSWMuxerJNI)localObject2);
        TXSWMuxerJNI.AVOptions localAVOptions = new com/tencent/liteav/muxer/jni/TXSWMuxerJNI$AVOptions;
        localAVOptions.<init>();
        if (this.h != null)
        {
          i2 = this.h.getInteger("width");
          localAVOptions.videoHeight = this.h.getInteger("height");
          localAVOptions.videoWidth = i2;
          if (!this.h.containsKey("i-frame-interval"))
            break label304;
        }
        ByteBuffer localByteBuffer1;
        ByteBuffer localByteBuffer2;
        label304: for (i2 = this.h.getInteger("i-frame-interval"); ; i2 = 3)
        {
          localAVOptions.videoGOP = i2;
          if (this.i != null)
          {
            i2 = this.i.getInteger("channel-count");
            int i3 = this.i.getInteger("sample-rate");
            localAVOptions.audioChannels = i2;
            localAVOptions.audioSampleRate = i3;
          }
          localByteBuffer1 = e();
          localByteBuffer2 = f();
          localObject2 = null;
          if (this.i != null)
            localObject2 = d();
          if ((localByteBuffer1 != null) && (localByteBuffer2 != null))
            break label309;
          TXCLog.e("TXCMP4SWMuxer", "video format contains error csd!");
          AppMethodBeat.o(67127);
          i2 = -3;
          break;
        }
        label309: if ((this.i != null) && (localObject2 == null))
        {
          TXCLog.e("TXCMP4SWMuxer", "audio format contains error csd!");
          AppMethodBeat.o(67127);
          i2 = -3;
        }
        else
        {
          this.f.a(localByteBuffer1, localByteBuffer1.capacity(), localByteBuffer2, localByteBuffer2.capacity());
          if (this.i != null)
            this.f.a((ByteBuffer)localObject2, ((ByteBuffer)localObject2).capacity());
          this.f.a(localAVOptions);
          this.f.a(this.g);
          this.f.a();
          this.p = -1L;
          this.l = true;
          this.m = false;
          this.q = -1L;
          this.r = -1L;
          AppMethodBeat.o(67127);
          i2 = i1;
        }
      }
    }
  }

  public void a(MediaFormat paramMediaFormat)
  {
    try
    {
      AppMethodBeat.i(67122);
      TXCLog.d("TXCMP4SWMuxer", "addVideoTrack:".concat(String.valueOf(paramMediaFormat)));
      this.h = paramMediaFormat;
      this.n.clear();
      AppMethodBeat.o(67122);
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
      AppMethodBeat.i(67129);
      this.g = paramString;
      if (!TextUtils.isEmpty(this.g))
      {
        paramString = new java/io/File;
        paramString.<init>(this.g);
        if (paramString.exists())
          paramString.delete();
      }
      while (true)
      {
        try
        {
          paramString.createNewFile();
          AppMethodBeat.o(67129);
          return;
        }
        catch (IOException paramString)
        {
        }
        AppMethodBeat.o(67129);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public void a(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(67132);
        if (this.f == null)
        {
          a(true, paramByteBuffer, paramBufferInfo);
          paramByteBuffer = new java/lang/StringBuilder;
          paramByteBuffer.<init>("cache frame before muexer ready. ptsUs: ");
          TXCLog.w("TXCMP4SWMuxer", paramBufferInfo.presentationTimeUs);
          AppMethodBeat.o(67132);
          return;
        }
        if (this.p < 0L)
        {
          a(true, paramByteBuffer, paramBufferInfo);
          this.p = g();
          paramByteBuffer = new java/lang/StringBuilder;
          paramByteBuffer.<init>("first frame offset = ");
          TXCLog.d("TXCMP4SWMuxer", this.p);
          i();
          AppMethodBeat.o(67132);
          continue;
        }
      }
      finally
      {
      }
      a(paramBufferInfo.presentationTimeUs);
      c(paramByteBuffer, paramBufferInfo);
      AppMethodBeat.o(67132);
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(67131);
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt2);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = new android/media/MediaCodec$BufferInfo;
      paramArrayOfByte.<init>();
      paramArrayOfByte.presentationTimeUs = paramLong;
      paramArrayOfByte.offset = 0;
      paramArrayOfByte.size = paramInt2;
      paramArrayOfByte.flags = paramInt3;
      b(localByteBuffer, paramArrayOfByte);
      AppMethodBeat.o(67131);
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
    //   4: ldc_w 394
    //   7: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: getfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   14: ifnull +134 -> 148
    //   17: aload_0
    //   18: invokespecial 396	com/tencent/liteav/muxer/d:h	()V
    //   21: new 187	java/lang/StringBuilder
    //   24: astore_2
    //   25: aload_2
    //   26: ldc_w 398
    //   29: invokespecial 192	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   32: ldc 109
    //   34: aload_2
    //   35: aload_0
    //   36: getfield 75	com/tencent/liteav/muxer/d:l	Z
    //   39: invokevirtual 401	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   42: ldc_w 403
    //   45: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_0
    //   49: getfield 77	com/tencent/liteav/muxer/d:m	Z
    //   52: invokevirtual 401	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   55: invokevirtual 205	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokestatic 286	com/tencent/liteav/basic/log/TXCLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: aload_0
    //   62: getfield 75	com/tencent/liteav/muxer/d:l	Z
    //   65: ifeq +18 -> 83
    //   68: aload_0
    //   69: getfield 77	com/tencent/liteav/muxer/d:m	Z
    //   72: ifeq +11 -> 83
    //   75: aload_0
    //   76: getfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   79: invokevirtual 405	com/tencent/liteav/muxer/jni/TXSWMuxerJNI:b	()I
    //   82: pop
    //   83: aload_0
    //   84: getfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   87: invokevirtual 407	com/tencent/liteav/muxer/jni/TXSWMuxerJNI:c	()V
    //   90: aload_0
    //   91: aconst_null
    //   92: putfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield 75	com/tencent/liteav/muxer/d:l	Z
    //   100: aload_0
    //   101: aconst_null
    //   102: putfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield 77	com/tencent/liteav/muxer/d:m	Z
    //   110: aload_0
    //   111: getfield 82	com/tencent/liteav/muxer/d:n	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   114: invokevirtual 353	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   117: aload_0
    //   118: getfield 84	com/tencent/liteav/muxer/d:o	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   121: invokevirtual 353	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   124: aload_0
    //   125: aconst_null
    //   126: putfield 67	com/tencent/liteav/muxer/d:h	Landroid/media/MediaFormat;
    //   129: aload_0
    //   130: aconst_null
    //   131: putfield 69	com/tencent/liteav/muxer/d:i	Landroid/media/MediaFormat;
    //   134: aload_0
    //   135: ldc2_w 85
    //   138: putfield 90	com/tencent/liteav/muxer/d:q	J
    //   141: aload_0
    //   142: ldc2_w 85
    //   145: putfield 92	com/tencent/liteav/muxer/d:r	J
    //   148: ldc_w 394
    //   151: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_0
    //   155: monitorexit
    //   156: iload_1
    //   157: ireturn
    //   158: astore_2
    //   159: ldc 109
    //   161: ldc_w 409
    //   164: aload_2
    //   165: invokestatic 229	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   168: invokevirtual 233	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   171: invokestatic 116	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield 75	com/tencent/liteav/muxer/d:l	Z
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield 77	com/tencent/liteav/muxer/d:m	Z
    //   189: aload_0
    //   190: getfield 82	com/tencent/liteav/muxer/d:n	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   193: invokevirtual 353	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   196: aload_0
    //   197: getfield 84	com/tencent/liteav/muxer/d:o	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   200: invokevirtual 353	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   203: aload_0
    //   204: aconst_null
    //   205: putfield 67	com/tencent/liteav/muxer/d:h	Landroid/media/MediaFormat;
    //   208: aload_0
    //   209: aconst_null
    //   210: putfield 69	com/tencent/liteav/muxer/d:i	Landroid/media/MediaFormat;
    //   213: aload_0
    //   214: ldc2_w 85
    //   217: putfield 90	com/tencent/liteav/muxer/d:q	J
    //   220: aload_0
    //   221: ldc2_w 85
    //   224: putfield 92	com/tencent/liteav/muxer/d:r	J
    //   227: iconst_m1
    //   228: istore_1
    //   229: ldc_w 394
    //   232: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: goto -81 -> 154
    //   238: astore_2
    //   239: aload_0
    //   240: monitorexit
    //   241: aload_2
    //   242: athrow
    //   243: astore_2
    //   244: aload_0
    //   245: iconst_0
    //   246: putfield 75	com/tencent/liteav/muxer/d:l	Z
    //   249: aload_0
    //   250: aconst_null
    //   251: putfield 216	com/tencent/liteav/muxer/d:f	Lcom/tencent/liteav/muxer/jni/TXSWMuxerJNI;
    //   254: aload_0
    //   255: iconst_0
    //   256: putfield 77	com/tencent/liteav/muxer/d:m	Z
    //   259: aload_0
    //   260: getfield 82	com/tencent/liteav/muxer/d:n	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   263: invokevirtual 353	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   266: aload_0
    //   267: getfield 84	com/tencent/liteav/muxer/d:o	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   270: invokevirtual 353	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   273: aload_0
    //   274: aconst_null
    //   275: putfield 67	com/tencent/liteav/muxer/d:h	Landroid/media/MediaFormat;
    //   278: aload_0
    //   279: aconst_null
    //   280: putfield 69	com/tencent/liteav/muxer/d:i	Landroid/media/MediaFormat;
    //   283: aload_0
    //   284: ldc2_w 85
    //   287: putfield 90	com/tencent/liteav/muxer/d:q	J
    //   290: aload_0
    //   291: ldc2_w 85
    //   294: putfield 92	com/tencent/liteav/muxer/d:r	J
    //   297: ldc_w 394
    //   300: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: aload_2
    //   304: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   61	83	158	java/lang/Exception
    //   83	95	158	java/lang/Exception
    //   4	61	238	finally
    //   95	148	238	finally
    //   148	154	238	finally
    //   174	227	238	finally
    //   229	235	238	finally
    //   244	305	238	finally
    //   61	83	243	finally
    //   83	95	243	finally
    //   159	174	243	finally
  }

  public void b(MediaFormat paramMediaFormat)
  {
    try
    {
      AppMethodBeat.i(67123);
      TXCLog.d("TXCMP4SWMuxer", "addAudioTrack:".concat(String.valueOf(paramMediaFormat)));
      this.i = paramMediaFormat;
      this.o.clear();
      AppMethodBeat.o(67123);
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
      AppMethodBeat.i(67133);
      a(false, paramByteBuffer, paramBufferInfo);
      AppMethodBeat.o(67133);
      return;
    }
    finally
    {
      paramByteBuffer = finally;
    }
    throw paramByteBuffer;
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    try
    {
      AppMethodBeat.i(67130);
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramInt2);
      localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2);
      paramArrayOfByte = new android/media/MediaCodec$BufferInfo;
      paramArrayOfByte.<init>();
      paramArrayOfByte.presentationTimeUs = paramLong;
      paramArrayOfByte.offset = 0;
      paramArrayOfByte.size = paramInt2;
      paramArrayOfByte.flags = paramInt3;
      a(localByteBuffer, paramArrayOfByte);
      AppMethodBeat.o(67130);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.muxer.d
 * JD-Core Version:    0.6.2
 */