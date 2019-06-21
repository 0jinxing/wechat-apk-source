package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.c;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

public class a
  implements com.tencent.liteav.beauty.d, com.tencent.liteav.videoencoder.d
{
  private static final String a;
  private int b;
  private long c;
  private a.a d;
  private HandlerThread e;
  private boolean f;
  private com.tencent.liteav.videoencoder.b g;
  private com.tencent.liteav.basic.g.b h;
  private c i;
  private ByteBuffer j;
  private Bitmap k;
  private int l;
  private int m;
  private WeakReference<a.b> n;

  static
  {
    AppMethodBeat.i(67720);
    a = a.class.getSimpleName();
    AppMethodBeat.o(67720);
  }

  public a(a.b paramb)
  {
    AppMethodBeat.i(67710);
    this.b = 300;
    this.c = 0L;
    this.f = false;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = 0;
    this.m = 0;
    this.n = null;
    this.n = new WeakReference(paramb);
    AppMethodBeat.o(67710);
  }

  private void b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67715);
    int i1;
    if (paramInt1 > 0)
      if (paramInt1 >= 8)
      {
        i1 = 8;
        this.b = (1000 / i1);
        label27: long l1 = paramInt2;
        if (paramInt2 <= 0)
          break label77;
        this.c = (l1 * 1000L + System.currentTimeMillis());
        AppMethodBeat.o(67715);
      }
    while (true)
    {
      return;
      i1 = paramInt1;
      if (paramInt1 > 3)
        break;
      i1 = 3;
      break;
      this.b = 200;
      break label27;
      label77: this.c = (System.currentTimeMillis() + 300000L);
      AppMethodBeat.o(67715);
    }
  }

  private void c()
  {
    AppMethodBeat.i(67716);
    d();
    this.e = new HandlerThread("TXImageCapturer");
    this.e.start();
    this.d = new a.a(this, this.e.getLooper(), this.b, this.c);
    AppMethodBeat.o(67716);
  }

  private void d()
  {
    AppMethodBeat.i(67717);
    if (this.d != null)
    {
      this.d.removeCallbacksAndMessages(null);
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.quit();
      this.e = null;
    }
    AppMethodBeat.o(67717);
  }

  private void e()
  {
    AppMethodBeat.i(67718);
    try
    {
      if ((this.n != null) && (this.f))
      {
        a.b localb = (a.b)this.n.get();
        if (localb != null)
        {
          Bitmap localBitmap = this.k;
          ByteBuffer localByteBuffer1 = this.j;
          ByteBuffer localByteBuffer2 = localByteBuffer1;
          if (localByteBuffer1 == null)
          {
            localByteBuffer2 = localByteBuffer1;
            if (localBitmap != null)
            {
              localByteBuffer2 = ByteBuffer.allocateDirect(localBitmap.getWidth() * localBitmap.getHeight() * 4);
              localBitmap.copyPixelsToBuffer(localByteBuffer2);
              localByteBuffer2.rewind();
              this.j = localByteBuffer2;
            }
          }
          if ((localBitmap != null) && (localByteBuffer2 != null))
            localb.a(localBitmap, localByteBuffer2, this.l, this.m);
        }
      }
      AppMethodBeat.o(67718);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67718);
    }
  }

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return 0;
  }

  public void a()
  {
    AppMethodBeat.i(67713);
    this.f = false;
    this.j = null;
    this.k = null;
    TXCLog.w(a, "bkgpush: stop background publish");
    d();
    AppMethodBeat.o(67713);
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67711);
    if (this.f)
    {
      TXCLog.w(a, "bkgpush: start background publish return when started");
      AppMethodBeat.o(67711);
    }
    while (true)
    {
      return;
      this.f = true;
      b(paramInt1, paramInt2);
      c();
      if (this.d != null)
        this.d.sendEmptyMessageDelayed(1001, this.b);
      TXCLog.w(a, "bkgpush: start background publish with time:" + (this.c - System.currentTimeMillis()) / 1000L + ", interval:" + this.b);
      AppMethodBeat.o(67711);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67708);
    TXCLog.w(a, "bkgpush: got texture");
    if (this.g != null)
      this.g.a(paramInt1, paramInt2, paramInt3, TXCTimeUtil.getTimeTick());
    AppMethodBeat.o(67708);
  }

  public void a(int paramInt1, int paramInt2, Bitmap paramBitmap, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(67712);
    if (this.f)
    {
      TXCLog.w(a, "bkgpush: start background publish return when started");
      AppMethodBeat.o(67712);
    }
    while (true)
    {
      return;
      Bitmap localBitmap = paramBitmap;
      if (paramBitmap == null);
      try
      {
        TXCLog.w(a, "bkgpush: background publish img is empty, add default img");
        paramBitmap = new android/graphics/drawable/ColorDrawable;
        paramBitmap.<init>(-16777216);
        localBitmap = Bitmap.createBitmap(paramInt3, paramInt4, Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new android/graphics/Canvas;
        localCanvas.<init>(localBitmap);
        paramBitmap.draw(localCanvas);
        TXCLog.w(a, "bkgpush: generate bitmap");
        this.k = localBitmap;
        label96: this.l = paramInt3;
        this.m = paramInt4;
        a(paramInt1, paramInt2);
        AppMethodBeat.o(67712);
      }
      catch (Error paramBitmap)
      {
        break label96;
      }
      catch (Exception paramBitmap)
      {
        break label96;
      }
    }
  }

  public void a(MediaFormat paramMediaFormat)
  {
  }

  public void a(com.tencent.liteav.basic.g.b paramb, int paramInt)
  {
    AppMethodBeat.i(67709);
    this.h = paramb;
    String str = a;
    StringBuilder localStringBuilder = new StringBuilder("bkgpush: got nal type: ");
    Object localObject = paramb;
    if (paramb != null)
      localObject = Integer.valueOf(paramb.b);
    TXCLog.w(str, localObject);
    if (this.g != null)
    {
      this.g.a(null);
      paramb = this.g;
    }
    while (true)
    {
      try
      {
        if (this.n != null)
        {
          localObject = (a.b)this.n.get();
          if (localObject != null)
            ((a.b)localObject).a(paramb);
        }
        AppMethodBeat.o(67709);
        return;
      }
      catch (Exception paramb)
      {
      }
      AppMethodBeat.o(67709);
    }
  }

  public void a(EGLContext paramEGLContext, Context paramContext, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67714);
    TXCLog.w(a, "bkgpush: generate background push");
    Bitmap localBitmap = paramBitmap;
    if (paramBitmap == null);
    try
    {
      TXCLog.w(a, "bkgpush: background publish img is empty, add default img");
      paramBitmap = new android/graphics/drawable/ColorDrawable;
      paramBitmap.<init>(-16777216);
      localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>(localBitmap);
      paramBitmap.draw(localCanvas);
      TXCLog.w(a, "bkgpush: generate nal");
      paramBitmap = new com/tencent/liteav/videoencoder/TXSVideoEncoderParam;
      paramBitmap.<init>();
      paramBitmap.width = paramInt1;
      paramBitmap.height = paramInt2;
      paramBitmap.fps = 1;
      paramBitmap.gop = 1;
      paramBitmap.enableBFrame = false;
      paramBitmap.realTime = true;
      paramBitmap.encoderProfile = 1;
      paramBitmap.encoderMode = 1;
      paramBitmap.glContext = paramEGLContext;
      paramEGLContext = new com/tencent/liteav/videoencoder/b;
      paramEGLContext.<init>(2);
      this.g = paramEGLContext;
      this.g.a(this);
      this.g.a(paramBitmap);
      if ((paramInt1 == 720) || (paramInt1 == 1280))
        this.g.a(1800);
      while (true)
      {
        int i1 = localBitmap.getWidth();
        int i2 = localBitmap.getHeight();
        paramEGLContext = ByteBuffer.allocateDirect(i1 * i2 * 4);
        localBitmap.copyPixelsToBuffer(paramEGLContext);
        paramEGLContext.rewind();
        if (this.i == null)
        {
          paramBitmap = new com/tencent/liteav/beauty/c;
          paramBitmap.<init>(paramContext, true);
          this.i = paramBitmap;
          this.i.a(this);
        }
        paramContext = com.tencent.liteav.basic.util.b.a(i1, i2, paramInt1, paramInt2);
        this.i.a(paramContext);
        this.i.a(false);
        this.i.a(paramInt1, paramInt2);
        this.i.a(0);
        this.i.a(paramEGLContext.array(), i1, i2, 0, 2, 0);
        this.i.a();
        this.i.a(null);
        this.i = null;
        AppMethodBeat.o(67714);
        return;
        if ((paramInt1 != 960) && (paramInt1 != 544))
          break;
        this.g.a(1200);
      }
    }
    catch (Exception paramEGLContext)
    {
      while (true)
      {
        AppMethodBeat.o(67714);
        continue;
        this.g.a(800);
      }
    }
    catch (Error paramEGLContext)
    {
      while (true)
        AppMethodBeat.o(67714);
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.a
 * JD-Core Version:    0.6.2
 */