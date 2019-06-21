package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.vfs.e;

public final class h extends b
{
  private final Rect Hx;
  private int ehv;
  private ak lda;
  private float mDensity;
  private int mHeight;
  private boolean mIsRunning;
  private final Paint mPaint;
  private int mWidth;
  private boolean noA;
  private int[] noD;
  private float noE;
  private float noF;
  private boolean noG;
  private int noI;
  private int noJ;
  private long noK;
  private long noL;
  private long noM;
  private long noN;
  private long noO;
  private long noP;
  private boolean noV;
  private final Runnable noX;
  private final Runnable noY;
  private final Runnable noZ;
  private final Runnable npb;
  private volatile long npq;
  private int[] npr;
  private Bitmap nps;
  private boolean npt;

  public h(String paramString)
  {
    this(e.e(paramString, 0, (int)e.asZ(paramString)));
    AppMethodBeat.i(62430);
    AppMethodBeat.o(62430);
  }

  public h(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(62431);
    this.mIsRunning = false;
    this.noA = false;
    this.noD = new int[4];
    this.npr = new int[4];
    this.noE = 1.0F;
    this.noF = 1.0F;
    this.Hx = new Rect();
    this.mPaint = new Paint(6);
    this.noI = 0;
    this.noJ = -1;
    this.noK = 0L;
    this.noL = 0L;
    this.noM = 0L;
    this.noN = 0L;
    this.noP = 0L;
    this.npt = false;
    this.lda = new ak(Looper.getMainLooper());
    this.noV = true;
    this.noX = new h.1(this);
    this.noY = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(62426);
        h.a(h.this, h.e(h.this), h.f(h.this));
        AppMethodBeat.o(62426);
      }
    };
    this.noZ = new h.3(this);
    this.npb = new h.4(this);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new NullPointerException("bytes is null.");
      AppMethodBeat.o(62431);
      throw paramArrayOfByte;
    }
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int i = WXHardCoderJNI.hcGifDelay;
    int j = WXHardCoderJNI.hcGifCPU;
    int k = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr);
    for (int m = Process.myTid(); ; m = 0)
    {
      this.ehv = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, "MicroMsg.GIF.MMWXGFDrawable");
      this.npq = MMWXGFJNI.nativeInitWxAMDecoder();
      if ((this.npq != 0L) && (this.npq != -901L))
        break;
      ab.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan init wxam decoder failed. mWXGFJNIHandle:%d", new Object[] { Long.valueOf(this.npq) });
      if (this.npq == -901L)
        com.tencent.mm.plugin.report.service.h.pYm.a(711L, 5L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(711L, 4L, 1L, false);
      paramArrayOfByte = new MMGIFException(201);
      AppMethodBeat.o(62431);
      throw paramArrayOfByte;
    }
    m = MMWXGFJNI.nativeDecodeBufferHeader(this.npq, paramArrayOfByte, paramArrayOfByte.length);
    if (m != 0)
    {
      ab.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(m) });
      if (m == -904)
        com.tencent.mm.plugin.report.service.h.pYm.a(711L, 8L, 1L, false);
      while (true)
      {
        paramArrayOfByte = new MMGIFException(m);
        AppMethodBeat.o(62431);
        throw paramArrayOfByte;
        com.tencent.mm.plugin.report.service.h.pYm.a(711L, 3L, 1L, false);
      }
    }
    m = MMWXGFJNI.nativeGetOption(this.npq, paramArrayOfByte, paramArrayOfByte.length, this.noD);
    if (m != 0)
    {
      ab.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(m) });
      if (m == -903)
        com.tencent.mm.plugin.report.service.h.pYm.a(711L, 7L, 1L, false);
      while (true)
      {
        paramArrayOfByte = new MMGIFException(m);
        AppMethodBeat.o(62431);
        throw paramArrayOfByte;
        com.tencent.mm.plugin.report.service.h.pYm.a(711L, 3L, 1L, false);
      }
    }
    this.noI = this.noD[0];
    this.mWidth = this.noD[1];
    this.mHeight = this.noD[2];
    if ((this.mWidth == 0) || (this.mHeight == 0))
    {
      m = com.tencent.mm.bz.a.al(ah.getContext(), 2131428381);
      this.mHeight = m;
      this.mWidth = m;
    }
    this.nps = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
    AppMethodBeat.o(62431);
  }

  private void k(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(62429);
    this.noP = (SystemClock.uptimeMillis() + paramLong);
    if (this.lda != null)
      this.lda.postAtTime(paramRunnable, this.noP);
    AppMethodBeat.o(62429);
  }

  public final int bFO()
  {
    return this.noD[1];
  }

  public final int bFP()
  {
    return this.noD[2];
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(62436);
    if (this.noG)
    {
      this.Hx.set(getBounds());
      this.noE = (this.Hx.width() / this.mWidth);
      this.noF = (this.Hx.height() / this.mHeight);
      this.noG = false;
    }
    if (this.mPaint.getShader() == null)
    {
      if (this.noN == 0L)
        this.noN = System.currentTimeMillis();
      paramCanvas.scale(this.noE, this.noF);
      if ((this.nps != null) && (!this.nps.isRecycled()) && (!this.noA))
      {
        paramCanvas.drawBitmap(this.nps, 0.0F, 0.0F, this.mPaint);
        this.noO = (System.currentTimeMillis() - this.noN);
        if (!this.noV)
          break label204;
        com.tencent.mm.as.a.h(this.npb, 0L);
        this.noV = false;
        AppMethodBeat.o(62436);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.GIF.MMWXGFDrawable", "Cpan draw bitmap failed. Bitmap buffer is null or recycle");
      break;
      paramCanvas.drawRect(this.Hx, this.mPaint);
      label204: AppMethodBeat.o(62436);
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(62441);
    try
    {
      recycle();
      AppMethodBeat.o(62441);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.GIF.MMWXGFDrawable", localThrowable, "", new Object[0]);
        super.finalize();
        AppMethodBeat.o(62441);
      }
    }
  }

  public final float getEmojiDensityScale()
  {
    AppMethodBeat.i(62432);
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.bz.a.getDensity(ah.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F)
        break label54;
      this.mDensity = 1.0F;
    }
    while (true)
    {
      float f = this.mDensity;
      AppMethodBeat.o(62432);
      return f;
      label54: if (this.mDensity > 2.0F)
        this.mDensity = 2.0F;
    }
  }

  public final int getIntrinsicHeight()
  {
    AppMethodBeat.i(62434);
    int i = (int)(this.mHeight * getEmojiDensityScale());
    AppMethodBeat.o(62434);
    return i;
  }

  public final int getIntrinsicWidth()
  {
    AppMethodBeat.i(62433);
    int i = (int)(this.mWidth * getEmojiDensityScale());
    AppMethodBeat.o(62433);
    return i;
  }

  public final int getOpacity()
  {
    return -2;
  }

  public final boolean isRunning()
  {
    return this.mIsRunning;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    AppMethodBeat.i(62435);
    super.onBoundsChange(paramRect);
    this.noG = true;
    AppMethodBeat.o(62435);
  }

  public final void pause()
  {
    this.mIsRunning = false;
  }

  public final void recycle()
  {
    try
    {
      AppMethodBeat.i(62444);
      ab.v("MicroMsg.GIF.MMWXGFDrawable", "Cpan recycle decode handle:%d", new Object[] { Long.valueOf(this.npq) });
      this.noA = true;
      this.mIsRunning = false;
      long l = this.npq;
      this.npq = 0L;
      this.lda.removeCallbacks(this.noX);
      int i = MMWXGFJNI.nativeUninit(l);
      if (i == -906)
        com.tencent.mm.plugin.report.service.h.pYm.a(401L, 10L, 1L, false);
      ab.d("MicroMsg.GIF.MMWXGFDrawable", "nativeUninit result:%d mWXGFJNIHandle:%s mIsRender:%b", new Object[] { Integer.valueOf(i), Long.valueOf(l), Boolean.valueOf(this.npt) });
      if ((l != 0L) && (i == 0) && (this.nps != null))
        this.nps.isRecycled();
      this.nps = null;
      AppMethodBeat.o(62444);
      return;
    }
    finally
    {
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(62443);
    this.mIsRunning = true;
    com.tencent.mm.as.a.h(this.noZ, 0L);
    AppMethodBeat.o(62443);
  }

  public final void resume()
  {
    AppMethodBeat.i(62442);
    if (!this.noA)
    {
      this.mIsRunning = true;
      k(this.noX, 0L);
    }
    AppMethodBeat.o(62442);
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(62437);
    this.mPaint.setAlpha(paramInt);
    AppMethodBeat.o(62437);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(62438);
    this.mPaint.setColorFilter(paramColorFilter);
    AppMethodBeat.o(62438);
  }

  public final void start()
  {
    AppMethodBeat.i(62439);
    this.mIsRunning = true;
    com.tencent.mm.as.a.h(this.noY, 0L);
    AppMethodBeat.o(62439);
  }

  public final void stop()
  {
    boolean bool1 = true;
    AppMethodBeat.i(62440);
    this.mIsRunning = false;
    if (this.ehv != 0)
    {
      ab.i("MicroMsg.GIF.MMWXGFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", new Object[] { Integer.valueOf(this.ehv) });
      bool2 = bool1;
      if (!WXHardCoderJNI.hcGifEnable)
        if (!WXHardCoderJNI.hcGifFrameEnable)
          break label79;
    }
    label79: for (boolean bool2 = bool1; ; bool2 = false)
    {
      WXHardCoderJNI.stopPerformance(bool2, this.ehv);
      this.ehv = 0;
      AppMethodBeat.o(62440);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.h
 * JD-Core Version:    0.6.2
 */