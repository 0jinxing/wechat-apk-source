package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import com.tencent.liteav.basic.e.b;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.e.j;
import com.tencent.liteav.basic.e.k;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayDeque;
import javax.microedition.khronos.egl.EGL10;

public class a extends c
{
  private static final String a;
  private boolean A;
  private boolean B;
  private ByteBuffer[] C;
  private byte[] D;
  private volatile long E;
  private long F;
  private long G;
  private int H;
  private int I;
  private boolean J;
  private int K;
  private int L;
  private int M;
  private int N;
  private int b;
  private long c;
  private long d;
  private long e;
  private long f;
  private int g;
  private boolean h;
  private boolean i;
  private long j;
  private long k;
  private long l;
  private long m;
  private long n;
  private boolean o;
  private long p;
  private long q;
  private MediaCodec r;
  private com.tencent.liteav.basic.util.c s;
  private Runnable t;
  private Runnable u;
  private Runnable v;
  private ArrayDeque<Long> w;
  private Object x;
  private Surface y;
  private boolean z;

  static
  {
    AppMethodBeat.i(67395);
    a = a.class.getSimpleName();
    AppMethodBeat.o(67395);
  }

  public a()
  {
    AppMethodBeat.i(67366);
    this.b = 0;
    this.c = 0L;
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
    this.g = 0;
    this.h = false;
    this.i = true;
    this.j = 0L;
    this.k = 0L;
    this.l = 0L;
    this.m = 0L;
    this.n = 0L;
    this.p = 0L;
    this.q = 0L;
    this.r = null;
    this.s = null;
    this.t = new a.6(this);
    this.u = new a.7(this);
    this.v = new a.8(this);
    this.w = new ArrayDeque(10);
    this.y = null;
    this.z = true;
    this.A = true;
    this.B = false;
    this.C = null;
    this.D = null;
    this.E = 0L;
    this.F = 0L;
    this.G = 0L;
    this.K = 0;
    this.L = 0;
    this.M = 0;
    this.N = -1;
    this.s = new com.tencent.liteav.basic.util.c("HWVideoEncoder");
    AppMethodBeat.o(67366);
  }

  private int a(int paramInt)
  {
    AppMethodBeat.i(67382);
    if (this.r == null)
    {
      paramInt = -1;
      AppMethodBeat.o(67382);
    }
    MediaCodec.BufferInfo localBufferInfo;
    int i1;
    while (true)
    {
      return paramInt;
      localBufferInfo = new MediaCodec.BufferInfo();
      try
      {
        i1 = this.r.dequeueOutputBuffer(localBufferInfo, paramInt * 1000);
        if (i1 != -1)
          break label71;
        paramInt = 0;
        AppMethodBeat.o(67382);
      }
      catch (IllegalStateException localIllegalStateException1)
      {
        paramInt = -1;
        AppMethodBeat.o(67382);
      }
      continue;
      label71: if (i1 == -3)
      {
        this.C = this.r.getOutputBuffers();
        paramInt = 1;
        AppMethodBeat.o(67382);
      }
      else if (i1 == -2)
      {
        callDelegate(this.r.getOutputFormat());
        paramInt = 1;
        AppMethodBeat.o(67382);
      }
      else
      {
        if (i1 >= 0)
          break;
        paramInt = -1;
        AppMethodBeat.o(67382);
      }
    }
    ByteBuffer localByteBuffer = this.C[i1];
    if (localByteBuffer == null)
      paramInt = -1;
    while (true)
    {
      byte[] arrayOfByte1;
      try
      {
        if (this.r != null)
          this.r.releaseOutputBuffer(i1, false);
        AppMethodBeat.o(67382);
        break;
        arrayOfByte1 = new byte[localBufferInfo.size];
        localByteBuffer.position(localBufferInfo.offset);
        localByteBuffer.limit(localBufferInfo.offset + localBufferInfo.size);
        localByteBuffer.get(arrayOfByte1, 0, localBufferInfo.size);
        int i2 = arrayOfByte1.length;
        if ((localBufferInfo.size <= 5) || (arrayOfByte1[0] != 0) || (arrayOfByte1[1] != 0) || (arrayOfByte1[2] != 0) || (arrayOfByte1[3] != 0) || (arrayOfByte1[4] != 0) || (arrayOfByte1[5] != 0))
          break label1112;
        paramInt = 3;
        if (paramInt >= i2 - 4)
          break label1107;
        if ((arrayOfByte1[paramInt] == 0) && (arrayOfByte1[(paramInt + 1)] == 0) && (arrayOfByte1[(paramInt + 2)] == 0) && (arrayOfByte1[(paramInt + 3)] == 1))
        {
          i2 -= paramInt;
          localObject1 = new byte[i2];
          System.arraycopy(arrayOfByte1, paramInt, localObject1, 0, i2);
          if (localBufferInfo.size != 0)
            continue;
          if ((localBufferInfo.flags & 0x4) == 0)
            continue;
          if (this.mListener != null)
            this.mListener.a(null, 0);
          paramInt = -2;
          continue;
        }
        paramInt++;
        continue;
        paramInt = -1;
        continue;
        paramInt = 1;
        if ((localBufferInfo.flags & 0x2) == 2)
        {
          if (this.h)
          {
            this.D = ((byte[])((byte[])localObject1).clone());
            paramInt = 1;
            continue;
          }
          this.D = a((byte[])((byte[])localObject1).clone());
          continue;
        }
        long l3;
        if ((localBufferInfo.flags & 0x1) == 1)
        {
          paramInt = 0;
          this.H = -1;
          if (this.h)
          {
            arrayOfByte2 = new byte[this.D.length + localObject1.length];
            System.arraycopy(this.D, 0, arrayOfByte2, 0, this.D.length);
            System.arraycopy(localObject1, 0, arrayOfByte2, this.D.length, localObject1.length);
            localObject1 = arrayOfByte2;
            if (!this.J)
            {
              i2 = this.H + 1;
              this.H = i2;
              if (i2 == this.g * this.I)
                d();
            }
            l1 = a();
            l2 = localBufferInfo.presentationTimeUs / 1000L;
            if (this.G == 0L)
              this.G = l1;
            if (this.F == 0L)
              this.F = l2;
            l3 = l2 + (this.G - this.F);
            l2 = l1;
            if (l1 <= this.n)
              l2 = this.n + 1L;
            l1 = l2;
            if (l2 > l3)
              l1 = l3;
            this.n = l1;
            l2 = TXCTimeUtil.getTimeTick();
            if (paramInt != 0)
              continue;
            if (l2 > this.e + 1000L)
            {
              this.c = (()(this.p * 8000.0D / (l2 - this.e) / 1024.0D));
              this.p = 0L;
              this.e = l2;
            }
            this.k += 1L;
            this.l = 0L;
            this.p += localObject1.length;
            if (l2 > this.f + 2000L)
            {
              this.d = (()(this.q * 1000.0D / (l2 - this.f)));
              this.q = 0L;
              this.f = l2;
            }
            this.q += 1L;
            localByteBuffer.position(localBufferInfo.offset);
            if (!this.i)
              continue;
            l4 = this.k;
            l1 = this.l;
            l5 = this.m;
            if (paramInt != 0)
              continue;
            l2 = 0L;
            callDelegate((byte[])localObject1, paramInt, l4, l1, l5, l2, l3, l3, 0, localByteBuffer, localBufferInfo);
            this.m += 1L;
            this.M += 1;
            if ((localBufferInfo.flags & 0x4) == 0)
              continue;
            if (this.mListener != null)
              this.mListener.a(null, 0);
            paramInt = -2;
            continue;
          }
          byte[] arrayOfByte2 = a((byte[])localObject1);
          localObject1 = new byte[this.D.length + arrayOfByte2.length];
          System.arraycopy(this.D, 0, localObject1, 0, this.D.length);
          System.arraycopy(arrayOfByte2, 0, localObject1, this.D.length, arrayOfByte2.length);
          continue;
        }
        if (this.h)
          break label1104;
        Object localObject1 = a((byte[])localObject1);
        continue;
        this.l += 1L;
        continue;
        long l2 = this.l - 1L;
        continue;
        long l4 = this.k;
        long l1 = this.l;
        long l5 = this.m;
        if (paramInt == 0)
        {
          l2 = 0L;
          callDelegate(arrayOfByte1, paramInt, l4, l1, l5, l2, l3, l3, 0, localByteBuffer, localBufferInfo);
          continue;
        }
        l2 = this.l - 1L;
        continue;
      }
      catch (IllegalStateException localIllegalStateException2)
      {
        continue;
        paramInt = 1;
      }
      continue;
      label1104: continue;
      label1107: paramInt = 0;
      continue;
      label1112: Object localObject2 = arrayOfByte1;
    }
  }

  private int a(int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3)
  {
    AppMethodBeat.i(67384);
    int i1 = paramInt3;
    if (paramInt2 > 0)
    {
      i1 = paramInt3;
      if (paramInt1 > paramInt2)
        paramInt1 -= paramInt2;
    }
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[4]);
      localByteBuffer.asIntBuffer().put(paramInt1);
      localByteBuffer.order(ByteOrder.BIG_ENDIAN);
      System.arraycopy(localByteBuffer.array(), 0, paramArrayOfByte1, paramInt3, 4);
      System.arraycopy(paramArrayOfByte2, paramInt2, paramArrayOfByte1, paramInt3 + 4, paramInt1);
      i1 = paramInt3 + (paramInt1 + 4);
      AppMethodBeat.o(67384);
      return i1;
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        TXCLog.e(a, "setNalData exception");
        i1 = paramInt3;
      }
    }
  }

  private long a()
  {
    AppMethodBeat.i(67378);
    Long localLong = (Long)this.w.poll();
    long l1;
    if (localLong == null)
    {
      l1 = 0L;
      AppMethodBeat.o(67378);
    }
    while (true)
    {
      return l1;
      l1 = localLong.longValue();
      AppMethodBeat.o(67378);
    }
  }

  @TargetApi(16)
  private static MediaCodecInfo a(String paramString)
  {
    AppMethodBeat.i(67376);
    int i1 = MediaCodecList.getCodecCount();
    int i2 = 0;
    int i4;
    if (i2 < i1)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
      if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        int i3 = arrayOfString.length;
        i4 = 0;
        label43: if (i4 < i3)
          if (arrayOfString[i4].equalsIgnoreCase(paramString))
          {
            AppMethodBeat.o(67376);
            paramString = localMediaCodecInfo;
          }
      }
    }
    while (true)
    {
      return paramString;
      i4++;
      break label43;
      i2++;
      break;
      paramString = null;
      AppMethodBeat.o(67376);
    }
  }

  @TargetApi(16)
  private MediaFormat a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(67374);
    MediaFormat localMediaFormat;
    if ((paramInt1 == 0) || (paramInt2 == 0) || (paramInt3 == 0) || (paramInt4 == 0))
    {
      localMediaFormat = null;
      AppMethodBeat.o(67374);
    }
    while (true)
    {
      return localMediaFormat;
      localMediaFormat = MediaFormat.createVideoFormat("video/avc", paramInt1, paramInt2);
      localMediaFormat.setInteger("bitrate", paramInt3 * 1024);
      localMediaFormat.setInteger("frame-rate", paramInt4);
      localMediaFormat.setInteger("color-format", 2130708361);
      localMediaFormat.setInteger("i-frame-interval", paramInt5);
      AppMethodBeat.o(67374);
    }
  }

  @TargetApi(16)
  private MediaFormat a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    AppMethodBeat.i(67375);
    MediaFormat localMediaFormat = a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    if (localMediaFormat == null)
    {
      localMediaFormat = null;
      AppMethodBeat.o(67375);
    }
    while (true)
    {
      return localMediaFormat;
      if (Build.VERSION.SDK_INT >= 21)
      {
        Object localObject = a("video/avc");
        if (localObject == null)
        {
          AppMethodBeat.o(67375);
        }
        else
        {
          MediaCodecInfo.CodecCapabilities localCodecCapabilities = ((MediaCodecInfo)localObject).getCapabilitiesForType("video/avc");
          localObject = localCodecCapabilities.getEncoderCapabilities();
          if (((MediaCodecInfo.EncoderCapabilities)localObject).isBitrateModeSupported(paramInt6))
            localMediaFormat.setInteger("bitrate-mode", paramInt6);
          while (true)
          {
            localMediaFormat.setInteger("complexity", ((Integer)((MediaCodecInfo.EncoderCapabilities)localObject).getComplexityRange().clamp(Integer.valueOf(5))).intValue());
            paramInt2 = 0;
            if (Build.VERSION.SDK_INT < 23)
              break;
            localObject = localCodecCapabilities.profileLevels;
            paramInt4 = localObject.length;
            paramInt1 = 0;
            while (paramInt1 < paramInt4)
            {
              localCodecCapabilities = localObject[paramInt1];
              paramInt3 = paramInt2;
              if (localCodecCapabilities.profile <= paramInt7)
              {
                paramInt3 = paramInt2;
                if (localCodecCapabilities.profile > paramInt2)
                {
                  paramInt3 = localCodecCapabilities.profile;
                  localMediaFormat.setInteger("profile", localCodecCapabilities.profile);
                  localMediaFormat.setInteger("level", localCodecCapabilities.level);
                }
              }
              paramInt1++;
              paramInt2 = paramInt3;
            }
            if (((MediaCodecInfo.EncoderCapabilities)localObject).isBitrateModeSupported(2))
              localMediaFormat.setInteger("bitrate-mode", 2);
          }
        }
      }
      else
      {
        AppMethodBeat.o(67375);
      }
    }
  }

  private void a(long paramLong)
  {
    AppMethodBeat.i(67377);
    this.w.add(Long.valueOf(paramLong));
    AppMethodBeat.o(67377);
  }

  private boolean a(Surface paramSurface, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67379);
    boolean bool;
    if (paramSurface == null)
    {
      AppMethodBeat.o(67379);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1;
      Object localObject2;
      if (this.B)
      {
        localObject1 = (android.opengl.EGLContext)this.mGLContextExternal;
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = EGL14.EGL_NO_CONTEXT;
      }
      for (this.x = com.tencent.liteav.basic.e.c.a(null, (android.opengl.EGLContext)localObject2, paramSurface, paramInt1, paramInt2); ; this.x = b.a(null, (javax.microedition.khronos.egl.EGLContext)localObject2, paramSurface, paramInt1, paramInt2))
      {
        if (this.x != null)
          break label123;
        AppMethodBeat.o(67379);
        bool = false;
        break;
        localObject1 = (javax.microedition.khronos.egl.EGLContext)this.mGLContextExternal;
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = EGL10.EGL_NO_CONTEXT;
      }
      label123: GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      this.mEncodeFilter = new g();
      this.mEncodeFilter.a(k.e, k.a(j.a, false, false));
      if (!this.mEncodeFilter.a())
      {
        this.mEncodeFilter = null;
        AppMethodBeat.o(67379);
        bool = false;
      }
      else
      {
        GLES20.glViewport(0, 0, paramInt1, paramInt2);
        bool = true;
        AppMethodBeat.o(67379);
      }
    }
  }

  // ERROR //
  @TargetApi(18)
  private boolean a(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 527
    //   5: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield 141	com/tencent/liteav/videoencoder/a:A	Z
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield 139	com/tencent/liteav/videoencoder/a:z	Z
    //   18: aload_0
    //   19: lconst_0
    //   20: putfield 82	com/tencent/liteav/videoencoder/a:c	J
    //   23: aload_0
    //   24: lconst_0
    //   25: putfield 84	com/tencent/liteav/videoencoder/a:d	J
    //   28: aload_0
    //   29: lconst_0
    //   30: putfield 86	com/tencent/liteav/videoencoder/a:e	J
    //   33: aload_0
    //   34: lconst_0
    //   35: putfield 88	com/tencent/liteav/videoencoder/a:f	J
    //   38: aload_0
    //   39: iconst_0
    //   40: putfield 90	com/tencent/liteav/videoencoder/a:g	I
    //   43: aload_0
    //   44: lconst_0
    //   45: putfield 96	com/tencent/liteav/videoencoder/a:j	J
    //   48: aload_0
    //   49: lconst_0
    //   50: putfield 98	com/tencent/liteav/videoencoder/a:k	J
    //   53: aload_0
    //   54: lconst_0
    //   55: putfield 100	com/tencent/liteav/videoencoder/a:l	J
    //   58: aload_0
    //   59: lconst_0
    //   60: putfield 102	com/tencent/liteav/videoencoder/a:m	J
    //   63: aload_0
    //   64: lconst_0
    //   65: putfield 104	com/tencent/liteav/videoencoder/a:n	J
    //   68: aload_0
    //   69: lconst_0
    //   70: putfield 106	com/tencent/liteav/videoencoder/a:p	J
    //   73: aload_0
    //   74: lconst_0
    //   75: putfield 108	com/tencent/liteav/videoencoder/a:q	J
    //   78: aload_0
    //   79: aconst_null
    //   80: putfield 145	com/tencent/liteav/videoencoder/a:C	[Ljava/nio/ByteBuffer;
    //   83: aload_0
    //   84: aconst_null
    //   85: putfield 147	com/tencent/liteav/videoencoder/a:D	[B
    //   88: aload_0
    //   89: lconst_0
    //   90: putfield 149	com/tencent/liteav/videoencoder/a:E	J
    //   93: aload_0
    //   94: iconst_m1
    //   95: putfield 244	com/tencent/liteav/videoencoder/a:H	I
    //   98: aload_0
    //   99: aload_1
    //   100: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   103: putfield 535	com/tencent/liteav/videoencoder/a:mOutputWidth	I
    //   106: aload_0
    //   107: aload_1
    //   108: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   111: putfield 541	com/tencent/liteav/videoencoder/a:mOutputHeight	I
    //   114: aload_0
    //   115: aload_1
    //   116: getfield 544	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:gop	I
    //   119: putfield 248	com/tencent/liteav/videoencoder/a:I	I
    //   122: aload_0
    //   123: aload_1
    //   124: getfield 547	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:fullIFrame	Z
    //   127: putfield 246	com/tencent/liteav/videoencoder/a:J	Z
    //   130: aload_0
    //   131: aload_1
    //   132: getfield 550	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:syncOutput	Z
    //   135: putfield 552	com/tencent/liteav/videoencoder/a:o	Z
    //   138: aload_0
    //   139: aload_1
    //   140: getfield 555	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:enableEGL14	Z
    //   143: putfield 143	com/tencent/liteav/videoencoder/a:B	Z
    //   146: aload_0
    //   147: getfield 135	com/tencent/liteav/videoencoder/a:w	Ljava/util/ArrayDeque;
    //   150: invokevirtual 558	java/util/ArrayDeque:clear	()V
    //   153: aload_1
    //   154: ifnull +31 -> 185
    //   157: aload_1
    //   158: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   161: ifeq +24 -> 185
    //   164: aload_1
    //   165: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   168: ifeq +17 -> 185
    //   171: aload_1
    //   172: getfield 561	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:fps	I
    //   175: ifeq +10 -> 185
    //   178: aload_1
    //   179: getfield 544	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:gop	I
    //   182: ifne +16 -> 198
    //   185: aload_0
    //   186: iconst_1
    //   187: putfield 139	com/tencent/liteav/videoencoder/a:z	Z
    //   190: ldc_w 527
    //   193: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: iload_2
    //   197: ireturn
    //   198: aload_0
    //   199: aload_1
    //   200: getfield 564	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:annexb	Z
    //   203: putfield 92	com/tencent/liteav/videoencoder/a:h	Z
    //   206: aload_0
    //   207: aload_1
    //   208: getfield 567	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:appendSpsPps	Z
    //   211: putfield 94	com/tencent/liteav/videoencoder/a:i	Z
    //   214: aload_0
    //   215: getfield 80	com/tencent/liteav/videoencoder/a:b	I
    //   218: ifne +38 -> 256
    //   221: aload_0
    //   222: aload_1
    //   223: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   226: aload_1
    //   227: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   230: imul
    //   231: i2d
    //   232: dconst_1
    //   233: dmul
    //   234: aload_1
    //   235: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   238: aload_1
    //   239: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   242: imul
    //   243: i2d
    //   244: dadd
    //   245: invokestatic 573	java/lang/Math:sqrt	(D)D
    //   248: ldc2_w 574
    //   251: dmul
    //   252: d2i
    //   253: putfield 80	com/tencent/liteav/videoencoder/a:b	I
    //   256: aload_0
    //   257: aload_0
    //   258: getfield 80	com/tencent/liteav/videoencoder/a:b	I
    //   261: i2l
    //   262: putfield 96	com/tencent/liteav/videoencoder/a:j	J
    //   265: aload_0
    //   266: aload_1
    //   267: getfield 561	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:fps	I
    //   270: putfield 90	com/tencent/liteav/videoencoder/a:g	I
    //   273: iconst_2
    //   274: istore_3
    //   275: aload_1
    //   276: getfield 578	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:encoderMode	I
    //   279: tableswitch	default:+25 -> 304, 1:+87->366, 2:+92->371, 3:+97->376
    //   305: iconst_m1
    //   306: dstore_0
    //   307: invokevirtual 585	com/tencent/liteav/basic/f/b:c	()I
    //   310: iconst_1
    //   311: if_icmpne +8 -> 319
    //   314: aload_1
    //   315: iconst_1
    //   316: putfield 588	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:encoderProfile	I
    //   319: aload_0
    //   320: aload_1
    //   321: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   324: aload_1
    //   325: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   328: aload_0
    //   329: getfield 80	com/tencent/liteav/videoencoder/a:b	I
    //   332: aload_1
    //   333: getfield 561	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:fps	I
    //   336: aload_1
    //   337: getfield 544	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:gop	I
    //   340: iload_3
    //   341: iconst_1
    //   342: invokespecial 590	com/tencent/liteav/videoencoder/a:a	(IIIIIII)Landroid/media/MediaFormat;
    //   345: astore 4
    //   347: aload 4
    //   349: ifnonnull +32 -> 381
    //   352: aload_0
    //   353: iconst_1
    //   354: putfield 139	com/tencent/liteav/videoencoder/a:z	Z
    //   357: ldc_w 527
    //   360: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: goto -167 -> 196
    //   366: iconst_2
    //   367: istore_3
    //   368: goto -64 -> 304
    //   371: iconst_1
    //   372: istore_3
    //   373: goto -69 -> 304
    //   376: iconst_0
    //   377: istore_3
    //   378: goto -74 -> 304
    //   381: aload_0
    //   382: ldc_w 358
    //   385: invokestatic 594	android/media/MediaCodec:createEncoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   388: putfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   391: aload_0
    //   392: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   395: aload 4
    //   397: aconst_null
    //   398: aconst_null
    //   399: iconst_1
    //   400: invokevirtual 598	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   403: iconst_3
    //   404: istore_3
    //   405: aload_0
    //   406: aload_0
    //   407: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   410: invokevirtual 602	android/media/MediaCodec:createInputSurface	()Landroid/view/Surface;
    //   413: putfield 137	com/tencent/liteav/videoencoder/a:y	Landroid/view/Surface;
    //   416: iconst_4
    //   417: istore_3
    //   418: aload_0
    //   419: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   422: invokevirtual 605	android/media/MediaCodec:start	()V
    //   425: iconst_5
    //   426: istore_3
    //   427: aload_0
    //   428: aload_0
    //   429: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   432: invokevirtual 185	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   435: putfield 145	com/tencent/liteav/videoencoder/a:C	[Ljava/nio/ByteBuffer;
    //   438: aload_0
    //   439: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   442: ifnull +17 -> 459
    //   445: aload_0
    //   446: getfield 145	com/tencent/liteav/videoencoder/a:C	[Ljava/nio/ByteBuffer;
    //   449: ifnull +10 -> 459
    //   452: aload_0
    //   453: getfield 137	com/tencent/liteav/videoencoder/a:y	Landroid/view/Surface;
    //   456: ifnonnull +144 -> 600
    //   459: aload_0
    //   460: iconst_1
    //   461: putfield 139	com/tencent/liteav/videoencoder/a:z	Z
    //   464: ldc_w 527
    //   467: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   470: goto -274 -> 196
    //   473: astore 4
    //   475: aload 4
    //   477: instanceof 607
    //   480: ifne +19 -> 499
    //   483: getstatic 386	android/os/Build$VERSION:SDK_INT	I
    //   486: bipush 21
    //   488: if_icmplt +103 -> 591
    //   491: aload 4
    //   493: instanceof 609
    //   496: ifeq +95 -> 591
    //   499: aload_0
    //   500: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   503: aload_0
    //   504: aload_1
    //   505: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   508: aload_1
    //   509: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   512: aload_0
    //   513: getfield 80	com/tencent/liteav/videoencoder/a:b	I
    //   516: aload_1
    //   517: getfield 561	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:fps	I
    //   520: aload_1
    //   521: getfield 544	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:gop	I
    //   524: invokespecial 381	com/tencent/liteav/videoencoder/a:a	(IIIII)Landroid/media/MediaFormat;
    //   527: aconst_null
    //   528: aconst_null
    //   529: iconst_1
    //   530: invokevirtual 598	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   533: goto -130 -> 403
    //   536: astore 4
    //   538: iconst_2
    //   539: istore_3
    //   540: iload_3
    //   541: iconst_5
    //   542: if_icmplt +17 -> 559
    //   545: aload_0
    //   546: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   549: ifnull +10 -> 559
    //   552: aload_0
    //   553: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   556: invokevirtual 612	android/media/MediaCodec:stop	()V
    //   559: aload_0
    //   560: aconst_null
    //   561: putfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   564: aload_0
    //   565: getfield 137	com/tencent/liteav/videoencoder/a:y	Landroid/view/Surface;
    //   568: ifnull +10 -> 578
    //   571: aload_0
    //   572: getfield 137	com/tencent/liteav/videoencoder/a:y	Landroid/view/Surface;
    //   575: invokevirtual 617	android/view/Surface:release	()V
    //   578: aload_0
    //   579: aconst_null
    //   580: putfield 137	com/tencent/liteav/videoencoder/a:y	Landroid/view/Surface;
    //   583: goto -145 -> 438
    //   586: astore 4
    //   588: goto -150 -> 438
    //   591: ldc_w 527
    //   594: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   597: aload 4
    //   599: athrow
    //   600: aload_0
    //   601: aload_0
    //   602: getfield 137	com/tencent/liteav/videoencoder/a:y	Landroid/view/Surface;
    //   605: aload_1
    //   606: getfield 532	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:width	I
    //   609: aload_1
    //   610: getfield 538	com/tencent/liteav/videoencoder/TXSVideoEncoderParam:height	I
    //   613: invokespecial 619	com/tencent/liteav/videoencoder/a:a	(Landroid/view/Surface;II)Z
    //   616: ifne +17 -> 633
    //   619: aload_0
    //   620: iconst_1
    //   621: putfield 139	com/tencent/liteav/videoencoder/a:z	Z
    //   624: ldc_w 527
    //   627: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   630: goto -434 -> 196
    //   633: aload_0
    //   634: iconst_1
    //   635: putfield 622	com/tencent/liteav/videoencoder/a:mInit	Z
    //   638: ldc_w 527
    //   641: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   644: iconst_1
    //   645: istore_2
    //   646: goto -450 -> 196
    //   649: astore 4
    //   651: iconst_1
    //   652: istore_3
    //   653: goto -113 -> 540
    //   656: astore 4
    //   658: goto -118 -> 540
    //
    // Exception table:
    //   from	to	target	type
    //   391	403	473	java/lang/Exception
    //   475	499	536	java/lang/Exception
    //   499	533	536	java/lang/Exception
    //   591	600	536	java/lang/Exception
    //   545	559	586	java/lang/Exception
    //   559	578	586	java/lang/Exception
    //   578	583	586	java/lang/Exception
    //   319	347	649	java/lang/Exception
    //   352	357	649	java/lang/Exception
    //   381	391	649	java/lang/Exception
    //   405	416	656	java/lang/Exception
    //   418	425	656	java/lang/Exception
    //   427	438	656	java/lang/Exception
  }

  private byte[] a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67383);
    int i1 = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[i1 + 20];
    int i2 = 0;
    int i3 = 0;
    int i7;
    for (int i4 = 0; ; i4 = i7)
    {
      int i5 = i2;
      int i6 = i3;
      i7 = i4;
      if (i2 < i1)
      {
        if ((paramArrayOfByte[i2] != 0) || (paramArrayOfByte[(i2 + 1)] != 0) || (paramArrayOfByte[(i2 + 2)] != 1))
          break label168;
        i7 = a(i2, i3, arrayOfByte, paramArrayOfByte, i4);
        i6 = i2 + 3;
        i5 = i6;
      }
      while ((i5 == i1 - 4) && ((paramArrayOfByte[(i5 + 1)] != 0) || (paramArrayOfByte[(i5 + 2)] != 0) || (paramArrayOfByte[(i5 + 3)] != 1)))
      {
        i5 = i1;
        i2 = a(i5, i6, arrayOfByte, paramArrayOfByte, i7);
        paramArrayOfByte = new byte[i2];
        System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, i2);
        AppMethodBeat.o(67383);
        return paramArrayOfByte;
        label168: i5 = i2;
        i6 = i3;
        i7 = i4;
        if (paramArrayOfByte[i2] == 0)
        {
          i5 = i2;
          i6 = i3;
          i7 = i4;
          if (paramArrayOfByte[(i2 + 1)] == 0)
          {
            i5 = i2;
            i6 = i3;
            i7 = i4;
            if (paramArrayOfByte[(i2 + 2)] == 0)
            {
              i5 = i2;
              i6 = i3;
              i7 = i4;
              if (paramArrayOfByte[(i2 + 3)] == 1)
              {
                i7 = a(i2, i3, arrayOfByte, paramArrayOfByte, i4);
                i6 = i2 + 4;
                i5 = i6;
              }
            }
          }
        }
      }
      i2 = i5 + 1;
      i3 = i6;
    }
  }

  private void b()
  {
    AppMethodBeat.i(67380);
    if (this.mEncodeFilter != null)
    {
      this.mEncodeFilter.d();
      this.mEncodeFilter = null;
    }
    if ((this.x instanceof b))
    {
      ((b)this.x).b();
      this.x = null;
    }
    if ((this.x instanceof com.tencent.liteav.basic.e.c))
    {
      ((com.tencent.liteav.basic.e.c)this.x).b();
      this.x = null;
    }
    AppMethodBeat.o(67380);
  }

  @TargetApi(18)
  private void b(int paramInt)
  {
    AppMethodBeat.i(67385);
    if ((this.z == true) || (this.x == null))
      AppMethodBeat.o(67385);
    while (true)
    {
      return;
      a(this.E);
      this.mEncodeFilter.a(this.N);
      if ((this.x instanceof com.tencent.liteav.basic.e.c))
      {
        ((com.tencent.liteav.basic.e.c)this.x).a(this.E * 1000000L);
        ((com.tencent.liteav.basic.e.c)this.x).c();
      }
      if ((this.x instanceof b))
        ((b)this.x).a();
      int i1;
      do
        i1 = a(paramInt);
      while (i1 > 0);
      if ((i1 == -1) || (i1 == -2))
      {
        if (i1 == -1)
          callDelegate(10000005);
        this.z = true;
        c();
        AppMethodBeat.o(67385);
      }
      else
      {
        this.L += 1;
        AppMethodBeat.o(67385);
      }
    }
  }

  // ERROR //
  private void c()
  {
    // Byte code:
    //   0: ldc_w 656
    //   3: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 622	com/tencent/liteav/videoencoder/a:mInit	Z
    //   10: ifne +10 -> 20
    //   13: ldc_w 656
    //   16: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aload_0
    //   21: iconst_1
    //   22: putfield 139	com/tencent/liteav/videoencoder/a:z	Z
    //   25: aload_0
    //   26: iconst_1
    //   27: putfield 141	com/tencent/liteav/videoencoder/a:A	Z
    //   30: aload_0
    //   31: invokespecial 657	com/tencent/liteav/videoencoder/a:b	()V
    //   34: aload_0
    //   35: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   38: invokevirtual 612	android/media/MediaCodec:stop	()V
    //   41: aload_0
    //   42: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   45: invokevirtual 658	android/media/MediaCodec:release	()V
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   53: aload_0
    //   54: iconst_m1
    //   55: putfield 161	com/tencent/liteav/videoencoder/a:N	I
    //   58: aload_0
    //   59: lconst_0
    //   60: putfield 82	com/tencent/liteav/videoencoder/a:c	J
    //   63: aload_0
    //   64: lconst_0
    //   65: putfield 84	com/tencent/liteav/videoencoder/a:d	J
    //   68: aload_0
    //   69: lconst_0
    //   70: putfield 86	com/tencent/liteav/videoencoder/a:e	J
    //   73: aload_0
    //   74: lconst_0
    //   75: putfield 88	com/tencent/liteav/videoencoder/a:f	J
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 90	com/tencent/liteav/videoencoder/a:g	I
    //   83: aload_0
    //   84: lconst_0
    //   85: putfield 96	com/tencent/liteav/videoencoder/a:j	J
    //   88: aload_0
    //   89: lconst_0
    //   90: putfield 98	com/tencent/liteav/videoencoder/a:k	J
    //   93: aload_0
    //   94: lconst_0
    //   95: putfield 100	com/tencent/liteav/videoencoder/a:l	J
    //   98: aload_0
    //   99: lconst_0
    //   100: putfield 102	com/tencent/liteav/videoencoder/a:m	J
    //   103: aload_0
    //   104: lconst_0
    //   105: putfield 104	com/tencent/liteav/videoencoder/a:n	J
    //   108: aload_0
    //   109: lconst_0
    //   110: putfield 106	com/tencent/liteav/videoencoder/a:p	J
    //   113: aload_0
    //   114: lconst_0
    //   115: putfield 108	com/tencent/liteav/videoencoder/a:q	J
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield 462	com/tencent/liteav/videoencoder/a:mGLContextExternal	Ljava/lang/Object;
    //   123: aload_0
    //   124: aconst_null
    //   125: putfield 145	com/tencent/liteav/videoencoder/a:C	[Ljava/nio/ByteBuffer;
    //   128: aload_0
    //   129: aconst_null
    //   130: putfield 147	com/tencent/liteav/videoencoder/a:D	[B
    //   133: aload_0
    //   134: lconst_0
    //   135: putfield 149	com/tencent/liteav/videoencoder/a:E	J
    //   138: aload_0
    //   139: iconst_0
    //   140: putfield 535	com/tencent/liteav/videoencoder/a:mOutputWidth	I
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield 541	com/tencent/liteav/videoencoder/a:mOutputHeight	I
    //   148: aload_0
    //   149: iconst_0
    //   150: putfield 622	com/tencent/liteav/videoencoder/a:mInit	Z
    //   153: aload_0
    //   154: aconst_null
    //   155: putfield 229	com/tencent/liteav/videoencoder/a:mListener	Lcom/tencent/liteav/videoencoder/d;
    //   158: aload_0
    //   159: getfield 135	com/tencent/liteav/videoencoder/a:w	Ljava/util/ArrayDeque;
    //   162: invokevirtual 558	java/util/ArrayDeque:clear	()V
    //   165: ldc_w 656
    //   168: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -152 -> 19
    //   174: astore_1
    //   175: aload_0
    //   176: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   179: invokevirtual 658	android/media/MediaCodec:release	()V
    //   182: goto -134 -> 48
    //   185: astore_1
    //   186: goto -138 -> 48
    //   189: astore_1
    //   190: aload_0
    //   191: getfield 110	com/tencent/liteav/videoencoder/a:r	Landroid/media/MediaCodec;
    //   194: invokevirtual 658	android/media/MediaCodec:release	()V
    //   197: ldc_w 656
    //   200: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: aload_1
    //   204: athrow
    //   205: astore_2
    //   206: goto -9 -> 197
    //   209: astore_1
    //   210: goto -162 -> 48
    //
    // Exception table:
    //   from	to	target	type
    //   34	41	174	java/lang/IllegalStateException
    //   175	182	185	java/lang/Exception
    //   34	41	189	finally
    //   190	197	205	java/lang/Exception
    //   41	48	209	java/lang/Exception
  }

  private void c(int paramInt)
  {
    AppMethodBeat.i(67387);
    if (this.j == this.b)
      AppMethodBeat.o(67387);
    while (true)
    {
      return;
      this.j = this.b;
      if ((Build.VERSION.SDK_INT >= 19) && (this.r != null))
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("video-bitrate", this.b * 1024);
        this.r.setParameters(localBundle);
      }
      AppMethodBeat.o(67387);
    }
  }

  private void d()
  {
    AppMethodBeat.i(67388);
    if ((Build.VERSION.SDK_INT >= 19) && (this.r != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("request-sync", 0);
      this.r.setParameters(localBundle);
    }
    AppMethodBeat.o(67388);
  }

  private void d(int paramInt)
  {
  }

  public long getRealBitrate()
  {
    return this.c;
  }

  public long getRealFPS()
  {
    return this.d;
  }

  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67371);
    if (this.A)
    {
      paramLong = 10000004L;
      AppMethodBeat.o(67371);
    }
    while (true)
    {
      return paramLong;
      GLES20.glFinish();
      this.E = paramLong;
      this.N = paramInt1;
      this.K += 1;
      if (this.J)
        d();
      this.s.b(this.u);
      paramLong = 0L;
      AppMethodBeat.o(67371);
    }
  }

  public long pushVideoFrameSync(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67372);
    if (this.A)
    {
      paramLong = 10000004L;
      AppMethodBeat.o(67372);
    }
    while (true)
    {
      return paramLong;
      GLES20.glFinish();
      this.E = paramLong;
      this.N = paramInt1;
      this.K += 1;
      if (this.J)
        d();
      this.s.a(this.v);
      paramLong = 0L;
      AppMethodBeat.o(67372);
    }
  }

  public void setBitrate(int paramInt)
  {
    AppMethodBeat.i(67370);
    this.b = paramInt;
    this.s.b(new a.4(this, paramInt));
    AppMethodBeat.o(67370);
  }

  public void setFPS(int paramInt)
  {
    AppMethodBeat.i(67369);
    this.s.b(new a.3(this, paramInt));
    AppMethodBeat.o(67369);
  }

  public void signalEOSAndFlush()
  {
    AppMethodBeat.i(67373);
    if (this.A)
      AppMethodBeat.o(67373);
    while (true)
    {
      return;
      this.s.a(new a.5(this));
      AppMethodBeat.o(67373);
    }
  }

  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    int i1 = 0;
    AppMethodBeat.i(67367);
    super.start(paramTXSVideoEncoderParam);
    boolean[] arrayOfBoolean = new boolean[1];
    if (Build.VERSION.SDK_INT < 18)
    {
      arrayOfBoolean[0] = false;
      if (arrayOfBoolean[0] == 0)
        callDelegate(10000004);
      if (arrayOfBoolean[0] == 0)
        break label101;
      AppMethodBeat.o(67367);
    }
    while (true)
    {
      while (true)
      {
        return i1;
        try
        {
          com.tencent.liteav.basic.util.c localc = this.s;
          a.1 local1 = new com/tencent/liteav/videoencoder/a$1;
          local1.<init>(this, arrayOfBoolean, paramTXSVideoEncoderParam);
          localc.a(local1);
          break;
        }
        finally
        {
          AppMethodBeat.o(67367);
        }
      }
      label101: AppMethodBeat.o(67367);
      i1 = 10000004;
    }
  }

  public void stop()
  {
    AppMethodBeat.i(67368);
    this.A = true;
    try
    {
      com.tencent.liteav.basic.util.c localc = this.s;
      a.2 local2 = new com/tencent/liteav/videoencoder/a$2;
      local2.<init>(this);
      localc.a(local2);
      return;
    }
    finally
    {
      AppMethodBeat.o(67368);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.a
 * JD-Core Version:    0.6.2
 */