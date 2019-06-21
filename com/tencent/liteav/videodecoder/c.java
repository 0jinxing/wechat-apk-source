package com.tencent.liteav.videodecoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class c
  implements a
{
  private MediaCodec.BufferInfo a;
  private MediaCodec b;
  private String c;
  private int d;
  private int e;
  private long f;
  private long g;
  private boolean h;
  private boolean i;
  private boolean j;
  private Surface k;
  private int l;
  private ArrayList<com.tencent.liteav.basic.g.b> m;
  private d n;
  private WeakReference<com.tencent.liteav.basic.d.a> o;

  public c()
  {
    AppMethodBeat.i(67783);
    this.a = new MediaCodec.BufferInfo();
    this.b = null;
    this.c = "video/avc";
    this.d = 540;
    this.e = 960;
    this.f = 0L;
    this.g = 0L;
    this.h = true;
    this.i = false;
    this.j = false;
    this.k = null;
    this.l = 0;
    this.m = new ArrayList();
    AppMethodBeat.o(67783);
  }

  // ERROR //
  private int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: iconst_m1
    //   4: istore 5
    //   6: iconst_0
    //   7: istore 6
    //   9: ldc 84
    //   11: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   14: aload_0
    //   15: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   18: ifnonnull +10 -> 28
    //   21: aload_0
    //   22: getfield 70	com/tencent/liteav/videodecoder/c:k	Landroid/view/Surface;
    //   25: ifnonnull +52 -> 77
    //   28: new 86	java/lang/StringBuilder
    //   31: astore_1
    //   32: aload_1
    //   33: ldc 88
    //   35: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: ldc 93
    //   40: aload_1
    //   41: aload_0
    //   42: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   45: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   48: ldc 99
    //   50: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: aload_0
    //   54: getfield 70	com/tencent/liteav/videodecoder/c:k	Landroid/view/Surface;
    //   57: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 111	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: ldc 84
    //   68: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: iconst_m1
    //   72: istore 4
    //   74: iload 4
    //   76: ireturn
    //   77: aload_0
    //   78: iload_3
    //   79: putfield 68	com/tencent/liteav/videodecoder/c:j	Z
    //   82: aload_0
    //   83: getfield 68	com/tencent/liteav/videodecoder/c:j	Z
    //   86: ifeq +155 -> 241
    //   89: aload_0
    //   90: ldc 113
    //   92: putfield 54	com/tencent/liteav/videodecoder/c:c	Ljava/lang/String;
    //   95: aload_0
    //   96: getfield 54	com/tencent/liteav/videodecoder/c:c	Ljava/lang/String;
    //   99: aload_0
    //   100: getfield 56	com/tencent/liteav/videodecoder/c:d	I
    //   103: aload_0
    //   104: getfield 58	com/tencent/liteav/videodecoder/c:e	I
    //   107: invokestatic 119	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   110: astore 7
    //   112: aload_1
    //   113: ifnull +11 -> 124
    //   116: aload 7
    //   118: ldc 121
    //   120: aload_1
    //   121: invokevirtual 125	android/media/MediaFormat:setByteBuffer	(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    //   124: aload_2
    //   125: ifnull +11 -> 136
    //   128: aload 7
    //   130: ldc 127
    //   132: aload_2
    //   133: invokevirtual 125	android/media/MediaFormat:setByteBuffer	(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    //   136: aload_0
    //   137: aload_0
    //   138: getfield 54	com/tencent/liteav/videodecoder/c:c	Ljava/lang/String;
    //   141: invokestatic 133	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   144: putfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   147: aload_0
    //   148: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   151: aload 7
    //   153: aload_0
    //   154: getfield 70	com/tencent/liteav/videodecoder/c:k	Landroid/view/Surface;
    //   157: aconst_null
    //   158: iconst_0
    //   159: invokevirtual 137	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   162: iconst_2
    //   163: istore 4
    //   165: aload_0
    //   166: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   169: iconst_1
    //   170: invokevirtual 140	android/media/MediaCodec:setVideoScalingMode	(I)V
    //   173: iconst_3
    //   174: istore 4
    //   176: aload_0
    //   177: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   180: invokevirtual 143	android/media/MediaCodec:start	()V
    //   183: iconst_4
    //   184: istore 8
    //   186: iload 8
    //   188: istore 4
    //   190: new 86	java/lang/StringBuilder
    //   193: astore_1
    //   194: iload 8
    //   196: istore 4
    //   198: aload_1
    //   199: ldc 145
    //   201: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   204: iload 8
    //   206: istore 4
    //   208: ldc 93
    //   210: aload_1
    //   211: aload_0
    //   212: getfield 68	com/tencent/liteav/videodecoder/c:j	Z
    //   215: invokevirtual 148	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   218: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokestatic 151	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: aload_0
    //   225: iconst_0
    //   226: putfield 72	com/tencent/liteav/videodecoder/c:l	I
    //   229: iload 6
    //   231: istore 4
    //   233: ldc 84
    //   235: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: goto -164 -> 74
    //   241: aload_0
    //   242: ldc 52
    //   244: putfield 54	com/tencent/liteav/videodecoder/c:c	Ljava/lang/String;
    //   247: goto -152 -> 95
    //   250: astore_1
    //   251: iconst_0
    //   252: istore 4
    //   254: aload_0
    //   255: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   258: ifnull +22 -> 280
    //   261: aload_0
    //   262: getfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   265: invokevirtual 154	android/media/MediaCodec:release	()V
    //   268: ldc 93
    //   270: ldc 156
    //   272: invokestatic 151	com/tencent/liteav/basic/log/TXCLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   275: aload_0
    //   276: aconst_null
    //   277: putfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   280: ldc 93
    //   282: new 86	java/lang/StringBuilder
    //   285: dup
    //   286: ldc 158
    //   288: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   291: iload 4
    //   293: invokevirtual 161	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   296: ldc 163
    //   298: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: aload_1
    //   302: invokevirtual 164	java/lang/Exception:toString	()Ljava/lang/String;
    //   305: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: invokestatic 111	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   314: aload_0
    //   315: invokespecial 166	com/tencent/liteav/videodecoder/c:f	()V
    //   318: iload 5
    //   320: istore 4
    //   322: goto -89 -> 233
    //   325: astore_2
    //   326: new 86	java/lang/StringBuilder
    //   329: astore_2
    //   330: aload_2
    //   331: ldc 168
    //   333: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   336: ldc 93
    //   338: aload_2
    //   339: aload_1
    //   340: invokevirtual 164	java/lang/Exception:toString	()Ljava/lang/String;
    //   343: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: invokestatic 111	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   352: aload_0
    //   353: aconst_null
    //   354: putfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   357: goto -77 -> 280
    //   360: astore_1
    //   361: aload_0
    //   362: aconst_null
    //   363: putfield 50	com/tencent/liteav/videodecoder/c:b	Landroid/media/MediaCodec;
    //   366: ldc 84
    //   368: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   371: aload_1
    //   372: athrow
    //   373: astore_1
    //   374: goto -120 -> 254
    //   377: astore_1
    //   378: iconst_0
    //   379: istore 5
    //   381: iload 8
    //   383: istore 4
    //   385: goto -131 -> 254
    //
    // Exception table:
    //   from	to	target	type
    //   14	28	250	java/lang/Exception
    //   28	66	250	java/lang/Exception
    //   77	95	250	java/lang/Exception
    //   95	112	250	java/lang/Exception
    //   116	124	250	java/lang/Exception
    //   128	136	250	java/lang/Exception
    //   136	147	250	java/lang/Exception
    //   241	247	250	java/lang/Exception
    //   261	275	325	java/lang/Exception
    //   261	275	360	finally
    //   326	352	360	finally
    //   147	162	373	java/lang/Exception
    //   165	173	373	java/lang/Exception
    //   176	183	373	java/lang/Exception
    //   190	194	373	java/lang/Exception
    //   198	204	373	java/lang/Exception
    //   208	224	373	java/lang/Exception
    //   224	229	377	java/lang/Exception
  }

  private void a()
  {
    AppMethodBeat.i(67788);
    if (this.b != null);
    try
    {
      this.b.stop();
      TXCLog.w("MediaCodecDecoder", "decode: stop decoder sucess");
      try
      {
        this.b.release();
        TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
        this.b = null;
        this.m.clear();
        this.f = 0L;
        this.h = true;
        AppMethodBeat.o(67788);
        return;
      }
      catch (Exception localException1)
      {
        while (true)
        {
          localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>("decode: release decoder exception: ");
          TXCLog.e("MediaCodecDecoder", localException1.toString());
          this.b = null;
        }
      }
      finally
      {
        this.b = null;
        AppMethodBeat.o(67788);
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>("decode: stop decoder Exception: ");
        TXCLog.e("MediaCodecDecoder", localException2.toString());
        try
        {
          this.b.release();
          TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
          this.b = null;
        }
        catch (Exception localException4)
        {
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>("decode: release decoder exception: ");
          TXCLog.e("MediaCodecDecoder", localException4.toString());
          this.b = null;
        }
        finally
        {
          this.b = null;
          AppMethodBeat.o(67788);
        }
      }
    }
    finally
    {
      try
      {
        this.b.release();
        TXCLog.w("MediaCodecDecoder", "decode: release decoder sucess");
        throw localObject4;
      }
      catch (Exception localException3)
      {
        while (true)
        {
          StringBuilder localStringBuilder3 = new java/lang/StringBuilder;
          localStringBuilder3.<init>("decode: release decoder exception: ");
          TXCLog.e("MediaCodecDecoder", localException3.toString());
          this.b = null;
        }
      }
      finally
      {
        this.b = null;
        AppMethodBeat.o(67788);
      }
    }
  }

  private void a(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(67790);
    this.b.releaseOutputBuffer(paramInt, true);
    if ((this.a.flags & 0x4) != 0)
      TXCLog.d("MediaCodecDecoder", "output EOS");
    try
    {
      if (this.n != null)
        this.n.a(null, this.d, this.e, paramLong1, paramLong2);
      label61: d();
      AppMethodBeat.o(67790);
      return;
    }
    catch (Exception localException)
    {
      break label61;
    }
  }

  private void a(boolean paramBoolean)
  {
    AppMethodBeat.i(67796);
    if (this.j != paramBoolean)
    {
      this.j = paramBoolean;
      if (this.i)
        AppMethodBeat.o(67796);
    }
    while (true)
    {
      return;
      if ((this.j) && (!e()))
      {
        a();
        f();
        AppMethodBeat.o(67796);
      }
      else
      {
        a();
        a(null, null, this.j);
        AppMethodBeat.o(67796);
      }
    }
  }

  @TargetApi(16)
  private void b()
  {
    AppMethodBeat.i(67789);
    if (this.b == null)
    {
      TXCLog.e("MediaCodecDecoder", "null decoder");
      AppMethodBeat.o(67789);
    }
    while (true)
    {
      return;
      com.tencent.liteav.basic.g.b localb = (com.tencent.liteav.basic.g.b)this.m.get(0);
      if ((localb == null) || (localb.a.length == 0))
      {
        TXCLog.e("MediaCodecDecoder", "decode: empty buffer");
        this.m.remove(0);
        AppMethodBeat.o(67789);
        continue;
      }
      ByteBuffer[] arrayOfByteBuffer = this.b.getInputBuffers();
      if ((arrayOfByteBuffer == null) || (arrayOfByteBuffer.length == 0))
      {
        TXCLog.e("MediaCodecDecoder", "decode: getInputBuffers failed");
        AppMethodBeat.o(67789);
        continue;
      }
      int i1;
      try
      {
        i1 = this.b.dequeueInputBuffer(10000L);
        if (i1 >= 0)
        {
          arrayOfByteBuffer[i1].put(localb.a);
          this.b.queueInputBuffer(i1, 0, localb.a.length, localb.g, 0);
          this.m.remove(0);
          if (this.f == 0L)
            TXCLog.w("MediaCodecDecoder", "decode: input buffer available, dequeueInputBuffer index: ".concat(String.valueOf(i1)));
        }
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            i1 = this.b.dequeueOutputBuffer(this.a, 10000L);
            if (i1 < 0)
              break label297;
            a(i1, this.a.presentationTimeUs, this.a.presentationTimeUs);
            this.l = 0;
            AppMethodBeat.o(67789);
            break;
            localException2 = localException2;
            TXCLog.e("MediaCodecDecoder", "decode: dequeueInputBuffer Exception!! ".concat(String.valueOf(localException2)));
            i1 = -10000;
            continue;
            TXCLog.w("MediaCodecDecoder", "decode: input buffer not available, dequeueInputBuffer failed");
          }
        }
        catch (Exception localException1)
        {
          while (true)
          {
            g();
            TXCLog.e("MediaCodecDecoder", "decode: dequeueOutputBuffer exception!!".concat(String.valueOf(localException1)));
            i1 = -10000;
          }
        }
      }
      label297: if (i1 == -1);
      try
      {
        Thread.sleep(10L);
        label308: TXCLog.d("MediaCodecDecoder", "decode: no output from decoder available when timeout");
        g();
        AppMethodBeat.o(67789);
        continue;
        if (i1 == -3)
        {
          TXCLog.d("MediaCodecDecoder", "decode: output buffers changed");
          AppMethodBeat.o(67789);
          continue;
        }
        if (i1 == -2)
        {
          c();
          AppMethodBeat.o(67789);
          continue;
        }
        TXCLog.e("MediaCodecDecoder", "decode: unexpected result from decoder.dequeueOutputBuffer: ".concat(String.valueOf(i1)));
        AppMethodBeat.o(67789);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label308;
      }
    }
  }

  private void c()
  {
    AppMethodBeat.i(67791);
    MediaFormat localMediaFormat = this.b.getOutputFormat();
    TXCLog.d("MediaCodecDecoder", "decode output format changed: ".concat(String.valueOf(localMediaFormat)));
    int i1 = Math.abs(localMediaFormat.getInteger("crop-right") - localMediaFormat.getInteger("crop-left"));
    int i2 = Math.abs(localMediaFormat.getInteger("crop-bottom") - localMediaFormat.getInteger("crop-top"));
    int i3 = localMediaFormat.getInteger("width");
    int i4 = localMediaFormat.getInteger("height");
    i3 = Math.min(i1 + 1, i3);
    i2 = Math.min(i2 + 1, i4);
    if ((i3 != this.d) || (i2 != this.e))
    {
      this.d = i3;
      this.e = i2;
    }
    try
    {
      if (this.n != null)
        this.n.a(this.d, this.e);
      label156: TXCLog.d("MediaCodecDecoder", "decode: video size change to w:" + i3 + ",h:" + i2);
      AppMethodBeat.o(67791);
      while (true)
      {
        return;
        if (this.h)
        {
          this.h = false;
          if (this.n != null)
            this.n.a(this.d, this.e);
        }
        AppMethodBeat.o(67791);
      }
    }
    catch (Exception localException)
    {
      break label156;
    }
  }

  private void d()
  {
    AppMethodBeat.i(67792);
    if (this.f == 0L)
      TXCLog.w("MediaCodecDecoder", "decode first frame sucess");
    long l1 = System.currentTimeMillis();
    if ((this.f > 0L) && (l1 > this.f + 1000L) && (l1 > this.g + 2000L) && (this.g != 0L))
    {
      TXCLog.e("MediaCodecDecoder", "frame interval[" + (l1 - this.f) + "] > 1000");
      this.g = l1;
    }
    if (this.g == 0L)
      this.g = l1;
    this.f = l1;
    AppMethodBeat.o(67792);
  }

  private boolean e()
  {
    boolean bool = true;
    AppMethodBeat.i(67793);
    int i1;
    int i2;
    MediaCodecInfo localMediaCodecInfo;
    String[] arrayOfString;
    int i3;
    int i4;
    if (Build.VERSION.SDK_INT >= 21)
    {
      MediaCodecInfo[] arrayOfMediaCodecInfo = new MediaCodecList(1).getCodecInfos();
      i1 = arrayOfMediaCodecInfo.length;
      i2 = 0;
      if (i2 < i1)
      {
        localMediaCodecInfo = arrayOfMediaCodecInfo[i2];
        arrayOfString = localMediaCodecInfo.getSupportedTypes();
        i3 = arrayOfString.length;
        i4 = 0;
        label61: if (i4 < i3)
          if (arrayOfString[i4].contains("video/hevc"))
          {
            TXCLog.e("MediaCodecDecoder", "decode: video/hevc MediaCodecInfo: " + localMediaCodecInfo.getName() + ",encoder:" + localMediaCodecInfo.isEncoder());
            AppMethodBeat.o(67793);
          }
      }
    }
    while (true)
    {
      return bool;
      i4++;
      break label61;
      i2++;
      break;
      AppMethodBeat.o(67793);
      bool = false;
      continue;
      if (Build.VERSION.SDK_INT >= 16)
      {
        i1 = MediaCodecList.getCodecCount();
        label270: for (i2 = 0; ; i2++)
        {
          if (i2 >= i1)
            break label276;
          localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
          arrayOfString = localMediaCodecInfo.getSupportedTypes();
          i3 = arrayOfString.length;
          for (i4 = 0; ; i4++)
          {
            if (i4 >= i3)
              break label270;
            if (arrayOfString[i4].contains("video/hevc"))
            {
              TXCLog.e("MediaCodecDecoder", "video/hevc MediaCodecInfo: " + localMediaCodecInfo.getName() + ",encoder:" + localMediaCodecInfo.isEncoder());
              AppMethodBeat.o(67793);
              break;
            }
          }
        }
      }
      label276: AppMethodBeat.o(67793);
      bool = false;
    }
  }

  private void f()
  {
    AppMethodBeat.i(67794);
    if (!this.i)
    {
      TXCLog.w("MediaCodecDecoder", "decode hw decode error, hevc: " + this.j);
      if (!this.j)
        break label70;
      com.tencent.liteav.basic.util.b.a(this.o, -2304, "h265解码失败");
    }
    while (true)
    {
      this.i = true;
      AppMethodBeat.o(67794);
      return;
      label70: com.tencent.liteav.basic.util.b.a(this.o, 2106, "硬解启动失败，采用软解");
    }
  }

  private void g()
  {
    AppMethodBeat.i(67795);
    if (this.l >= 40)
    {
      f();
      this.l = 0;
      AppMethodBeat.o(67795);
    }
    while (true)
    {
      return;
      this.l += 1;
      AppMethodBeat.o(67795);
    }
  }

  public int config(Surface paramSurface)
  {
    if (paramSurface == null);
    for (int i1 = -1; ; i1 = 0)
    {
      return i1;
      this.k = paramSurface;
    }
  }

  public void decode(com.tencent.liteav.basic.g.b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(67784);
    if (paramb.i == 1);
    while (true)
    {
      a(bool);
      this.m.add(paramb);
      int i1;
      do
      {
        if (this.m.isEmpty())
          break;
        i1 = this.m.size();
        b();
      }
      while (i1 != this.m.size());
      AppMethodBeat.o(67784);
      return;
      bool = false;
    }
  }

  public boolean isHevc()
  {
    return this.j;
  }

  public void setListener(d paramd)
  {
    this.n = paramd;
  }

  public void setNotifyListener(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference)
  {
    this.o = paramWeakReference;
  }

  public int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(67785);
    int i1 = a(paramByteBuffer1, paramByteBuffer2, paramBoolean2);
    AppMethodBeat.o(67785);
    return i1;
  }

  public void stop()
  {
    AppMethodBeat.i(67786);
    a();
    AppMethodBeat.o(67786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videodecoder.c
 * JD-Core Version:    0.6.2
 */