package com.tencent.liteav.beauty.b;

import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class u
{
  private static final String b;
  SurfaceTexture.OnFrameAvailableListener a;
  private SurfaceTexture c;
  private int d;
  private boolean e;
  private MediaExtractor f;
  private AssetFileDescriptor g;
  private int h;
  private int i;
  private int j;
  private int k;
  private long l;
  private MediaCodec m;
  private boolean n;
  private boolean o;
  private Handler p;
  private Object q;

  static
  {
    AppMethodBeat.i(67034);
    b = u.class.getSimpleName();
    AppMethodBeat.o(67034);
  }

  u()
  {
    AppMethodBeat.i(67029);
    this.d = -1;
    this.e = false;
    this.h = -1;
    this.i = -1;
    this.j = -1;
    this.k = -1;
    this.n = false;
    this.q = new Object();
    AppMethodBeat.o(67029);
  }

  // ERROR //
  private void b()
  {
    // Byte code:
    //   0: ldc 75
    //   2: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 59	com/tencent/liteav/beauty/b/u:e	Z
    //   9: ifeq +169 -> 178
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield 59	com/tencent/liteav/beauty/b/u:e	Z
    //   17: aload_0
    //   18: getfield 77	com/tencent/liteav/beauty/b/u:f	Landroid/media/MediaExtractor;
    //   21: ifnull +15 -> 36
    //   24: aload_0
    //   25: getfield 77	com/tencent/liteav/beauty/b/u:f	Landroid/media/MediaExtractor;
    //   28: invokevirtual 82	android/media/MediaExtractor:release	()V
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 77	com/tencent/liteav/beauty/b/u:f	Landroid/media/MediaExtractor;
    //   36: aload_0
    //   37: getfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   40: invokevirtual 89	android/media/MediaCodec:stop	()V
    //   43: aload_0
    //   44: getfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   47: invokevirtual 90	android/media/MediaCodec:release	()V
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   55: ldc 75
    //   57: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: aconst_null
    //   64: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   67: ldc 75
    //   69: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -12 -> 60
    //   75: astore_1
    //   76: aload_0
    //   77: aconst_null
    //   78: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   81: ldc 75
    //   83: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: aload_1
    //   87: athrow
    //   88: astore_1
    //   89: aload_0
    //   90: getfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   93: invokevirtual 90	android/media/MediaCodec:release	()V
    //   96: aload_0
    //   97: aconst_null
    //   98: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   101: ldc 75
    //   103: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -46 -> 60
    //   109: astore_1
    //   110: aload_0
    //   111: aconst_null
    //   112: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   115: ldc 75
    //   117: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: goto -60 -> 60
    //   123: astore_1
    //   124: aload_0
    //   125: aconst_null
    //   126: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   129: ldc 75
    //   131: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   134: aload_1
    //   135: athrow
    //   136: astore_2
    //   137: aload_0
    //   138: getfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   141: invokevirtual 90	android/media/MediaCodec:release	()V
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   149: ldc 75
    //   151: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload_2
    //   155: athrow
    //   156: astore_1
    //   157: aload_0
    //   158: aconst_null
    //   159: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   162: goto -13 -> 149
    //   165: astore_1
    //   166: aload_0
    //   167: aconst_null
    //   168: putfield 84	com/tencent/liteav/beauty/b/u:m	Landroid/media/MediaCodec;
    //   171: ldc 75
    //   173: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: aload_1
    //   177: athrow
    //   178: ldc 75
    //   180: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: goto -123 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   43	50	61	java/lang/Exception
    //   43	50	75	finally
    //   36	43	88	java/lang/Exception
    //   89	96	109	java/lang/Exception
    //   89	96	123	finally
    //   36	43	136	finally
    //   137	144	156	java/lang/Exception
    //   137	144	165	finally
  }

  private void c()
  {
    AppMethodBeat.i(67032);
    b();
    this.a = null;
    this.l = 0L;
    this.o = false;
    if (this.c != null)
    {
      this.c.release();
      this.c = null;
    }
    synchronized (this.q)
    {
      if (this.p != null)
      {
        this.p.removeCallbacksAndMessages(null);
        this.p.getLooper().quit();
        this.p = null;
        this.q.notify();
      }
      if (this.g == null);
    }
    try
    {
      this.g.close();
      label103: this.g = null;
      AppMethodBeat.o(67032);
      return;
      localObject2 = finally;
      AppMethodBeat.o(67032);
      throw localObject2;
    }
    catch (Exception localException)
    {
      break label103;
    }
  }

  void a()
  {
    try
    {
      AppMethodBeat.i(67030);
      synchronized (this.q)
      {
        if (this.p != null)
        {
          if (Looper.myLooper() != this.p.getLooper())
            break label48;
          c();
        }
        while (true)
        {
          AppMethodBeat.o(67030);
          return;
          label48: u.1 local1 = new com/tencent/liteav/beauty/b/u$1;
          local1.<init>(this);
          this.p.removeCallbacksAndMessages(null);
          this.p.post(local1);
          this.p.getLooper().quitSafely();
          try
          {
            this.q.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.u
 * JD-Core Version:    0.6.2
 */