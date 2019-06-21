package com.tencent.mm.plugin.gif;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.InputStream;

public final class d extends b
{
  private final Rect Hx;
  private int ehv;
  private ak lda;
  private float mDensity;
  private boolean mIsRunning;
  private final Paint mPaint;
  private boolean noA;
  private volatile long noB;
  private AssetFileDescriptor noC;
  private final int[] noD;
  private float noE;
  private float noF;
  private boolean noG;
  private int[] noH;
  private int noI;
  private int noJ;
  private long noK;
  private long noL;
  private long noM;
  private long noN;
  private long noO;
  private long noP;
  private int noQ;
  private boolean noR;
  int noS;
  private int noT;
  k noU;
  private boolean noV;
  private final Runnable noW;
  private final Runnable noX;
  private final Runnable noY;
  private final Runnable noZ;
  private final Runnable npa;
  private final Runnable npb;

  private d(AssetFileDescriptor paramAssetFileDescriptor)
  {
    AppMethodBeat.i(62389);
    this.mIsRunning = true;
    this.noA = false;
    this.noC = null;
    this.noD = new int[6];
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
    this.noR = false;
    this.noS = 0;
    this.noT = 0;
    this.lda = new ak(Looper.getMainLooper());
    this.noV = true;
    this.noW = new d.1(this);
    this.noX = new d.2(this);
    this.noY = new d.3(this);
    this.noZ = new d.4(this);
    this.npa = new d.5(this);
    this.npb = new d.6(this);
    if (paramAssetFileDescriptor == null)
    {
      paramAssetFileDescriptor = new NullPointerException("assert file Descriptor is null.");
      AppMethodBeat.o(62389);
      throw paramAssetFileDescriptor;
    }
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int j = WXHardCoderJNI.hcGifDelay;
    int k = WXHardCoderJNI.hcGifCPU;
    int m = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr)
      i = Process.myTid();
    this.ehv = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.noC = paramAssetFileDescriptor;
    this.noB = MMGIFJNI.openByFileDescroptor(this.noC.getFileDescriptor(), paramAssetFileDescriptor.getStartOffset(), this.noD);
    init();
    AppMethodBeat.o(62389);
  }

  public d(Resources paramResources, int paramInt)
  {
    this(paramResources.openRawResourceFd(paramInt));
    AppMethodBeat.i(62387);
    AppMethodBeat.o(62387);
  }

  public d(InputStream paramInputStream)
  {
    AppMethodBeat.i(62390);
    this.mIsRunning = true;
    this.noA = false;
    this.noC = null;
    this.noD = new int[6];
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
    this.noR = false;
    this.noS = 0;
    this.noT = 0;
    this.lda = new ak(Looper.getMainLooper());
    this.noV = true;
    this.noW = new d.1(this);
    this.noX = new d.2(this);
    this.noY = new d.3(this);
    this.noZ = new d.4(this);
    this.npa = new d.5(this);
    this.npb = new d.6(this);
    if (paramInputStream == null)
    {
      paramInputStream = new NullPointerException("input stream is null.");
      AppMethodBeat.o(62390);
      throw paramInputStream;
    }
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int j = WXHardCoderJNI.hcGifDelay;
    int k = WXHardCoderJNI.hcGifCPU;
    int m = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr)
      i = Process.myTid();
    this.ehv = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.noB = MMGIFJNI.openByInputStrem(paramInputStream, this.noD);
    init();
    AppMethodBeat.o(62390);
  }

  public d(String paramString)
  {
    AppMethodBeat.i(62388);
    this.mIsRunning = true;
    this.noA = false;
    this.noC = null;
    this.noD = new int[6];
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
    this.noR = false;
    this.noS = 0;
    this.noT = 0;
    this.lda = new ak(Looper.getMainLooper());
    this.noV = true;
    this.noW = new d.1(this);
    this.noX = new d.2(this);
    this.noY = new d.3(this);
    this.noZ = new d.4(this);
    this.npa = new d.5(this);
    this.npb = new d.6(this);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = new NullPointerException("file path is null.");
      AppMethodBeat.o(62388);
      throw paramString;
    }
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int j = WXHardCoderJNI.hcGifDelay;
    int k = WXHardCoderJNI.hcGifCPU;
    int m = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr)
      i = Process.myTid();
    this.ehv = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.noB = MMGIFJNI.openByFilePath(paramString, this.noD);
    init();
    AppMethodBeat.o(62388);
  }

  public d(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(62391);
    this.mIsRunning = true;
    this.noA = false;
    this.noC = null;
    this.noD = new int[6];
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
    this.noR = false;
    this.noS = 0;
    this.noT = 0;
    this.lda = new ak(Looper.getMainLooper());
    this.noV = true;
    this.noW = new d.1(this);
    this.noX = new d.2(this);
    this.noY = new d.3(this);
    this.noZ = new d.4(this);
    this.npa = new d.5(this);
    this.npb = new d.6(this);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new NullPointerException("bytes is null.");
      AppMethodBeat.o(62391);
      throw paramArrayOfByte;
    }
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int j = WXHardCoderJNI.hcGifDelay;
    int k = WXHardCoderJNI.hcGifCPU;
    int m = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr)
      i = Process.myTid();
    this.ehv = WXHardCoderJNI.startPerformance(bool, j, k, m, i, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, "MicroMsg.GIF.MMGIFDrawable");
    this.noB = MMGIFJNI.openByByteArray(paramArrayOfByte, this.noD);
    init();
    AppMethodBeat.o(62391);
  }

  private void init()
  {
    AppMethodBeat.i(62392);
    ab.i("MicroMsg.GIF.MMGIFDrawable", "gif info pointer:%d", new Object[] { Long.valueOf(this.noB) });
    this.noI = this.noD[2];
    this.noQ = com.tencent.mm.bz.a.al(ah.getContext(), 2131428381);
    if ((this.noD[0] > 1024) || (this.noD[1] > 1024))
    {
      ab.w("MicroMsg.GIF.MMGIFDrawable", "emoji width or height over size. Width:%d Height:%d", new Object[] { Integer.valueOf(this.noD[0]), Integer.valueOf(this.noD[1]) });
      this.noH = new int[this.noQ * this.noQ];
      this.noR = true;
      h.pYm.a(401L, 2L, 1L, false);
      AppMethodBeat.o(62392);
    }
    while (true)
    {
      return;
      this.noH = new int[this.noD[0] * this.noD[1]];
      AppMethodBeat.o(62392);
    }
  }

  private void k(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(62386);
    this.noP = (SystemClock.uptimeMillis() + paramLong);
    if (this.lda != null)
      this.lda.postAtTime(paramRunnable, this.noP);
    AppMethodBeat.o(62386);
  }

  public final int bFO()
  {
    return this.noD[0];
  }

  public final int bFP()
  {
    return this.noD[1];
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(62397);
    if (this.noG)
    {
      this.Hx.set(getBounds());
      this.noE = (this.Hx.width() / this.noD[0]);
      this.noF = (this.Hx.height() / this.noD[1]);
      this.noG = false;
    }
    int[] arrayOfInt;
    if (this.mPaint.getShader() == null)
    {
      if (this.noN == 0L)
        this.noN = System.currentTimeMillis();
      paramCanvas.scale(this.noE, this.noF);
      arrayOfInt = this.noH;
      if (arrayOfInt != null)
        if (arrayOfInt.length == this.noD[0] * this.noD[1])
        {
          paramCanvas.drawBitmap(arrayOfInt, 0, this.noD[0], 0.0F, 0.0F, this.noD[0], this.noD[1], true, this.mPaint);
          this.noO = (System.currentTimeMillis() - this.noN);
          if ((this.noR) || (this.noD[2] <= 0))
            break label347;
          if (this.noD[4] < 0)
            ab.i("MicroMsg.GIF.MMGIFDrawable", "current index error. start first frame");
          if ((this.noS == 0) || (this.noT <= this.noS - 1))
            break label317;
          k(this.noW, 0L);
          AppMethodBeat.o(62397);
        }
    }
    while (true)
    {
      return;
      paramCanvas.drawRGB(230, 230, 230);
      ab.w("MicroMsg.GIF.MMGIFDrawable", "colors is not equal width*height. length:%d width:%d height:%d", new Object[] { Integer.valueOf(arrayOfInt.length), Integer.valueOf(this.noD[0]), Integer.valueOf(this.noD[1]) });
      break;
      ab.e("MicroMsg.GIF.MMGIFDrawable", "colors is null.");
      break;
      label317: if (this.noV)
      {
        com.tencent.mm.as.a.h(this.npb, 0L);
        this.noV = false;
        AppMethodBeat.o(62397);
        continue;
        label347: ab.e("MicroMsg.GIF.MMGIFDrawable", "framecount:%d errorcode:%d no post and oversize:%b", new Object[] { Integer.valueOf(this.noD[2]), Integer.valueOf(this.noD[4]), Boolean.valueOf(this.noR) });
      }
      else
      {
        AppMethodBeat.o(62397);
        continue;
        ab.i("MicroMsg.GIF.MMGIFDrawable", "colors drawRect ");
        paramCanvas.drawRect(this.Hx, this.mPaint);
        AppMethodBeat.o(62397);
      }
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(62405);
    try
    {
      recycle();
      AppMethodBeat.o(62405);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        super.finalize();
        AppMethodBeat.o(62405);
      }
    }
  }

  public final float getEmojiDensityScale()
  {
    AppMethodBeat.i(62393);
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
      AppMethodBeat.o(62393);
      return f;
      label54: if (this.mDensity > 2.0F)
        this.mDensity = 2.0F;
    }
  }

  public final int getIntrinsicHeight()
  {
    AppMethodBeat.i(62395);
    int i = (int)(this.noD[1] * getEmojiDensityScale());
    AppMethodBeat.o(62395);
    return i;
  }

  public final int getIntrinsicWidth()
  {
    AppMethodBeat.i(62394);
    int i = (int)(this.noD[0] * getEmojiDensityScale());
    AppMethodBeat.o(62394);
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
    AppMethodBeat.i(62396);
    super.onBoundsChange(paramRect);
    this.noG = true;
    AppMethodBeat.o(62396);
  }

  public final void pause()
  {
    this.mIsRunning = false;
  }

  public final void recycle()
  {
    AppMethodBeat.i(62404);
    ab.d("MicroMsg.GIF.MMGIFDrawable", "recycle");
    this.noA = true;
    this.mIsRunning = false;
    long l = this.noB;
    this.noB = 0L;
    MMGIFJNI.recycle(l);
    this.noH = null;
    if (this.noC != null);
    while (true)
    {
      try
      {
        this.noC.close();
        AppMethodBeat.o(62404);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(62404);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(62403);
    this.noA = false;
    this.mIsRunning = true;
    com.tencent.mm.as.a.h(this.noZ, 0L);
    AppMethodBeat.o(62403);
  }

  public final void resume()
  {
    AppMethodBeat.i(62402);
    if (!this.noA)
    {
      this.mIsRunning = true;
      k(this.noX, 0L);
    }
    AppMethodBeat.o(62402);
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(62398);
    this.mPaint.setAlpha(paramInt);
    AppMethodBeat.o(62398);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(62399);
    this.mPaint.setColorFilter(paramColorFilter);
    AppMethodBeat.o(62399);
  }

  public final void start()
  {
    AppMethodBeat.i(62400);
    this.mIsRunning = true;
    com.tencent.mm.as.a.h(this.noY, 0L);
    AppMethodBeat.o(62400);
  }

  public final void stop()
  {
    boolean bool1 = true;
    AppMethodBeat.i(62401);
    ab.d("MicroMsg.GIF.MMGIFDrawable", "stop");
    this.mIsRunning = false;
    if (this.ehv != 0)
    {
      ab.i("MicroMsg.GIF.MMGIFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", new Object[] { Integer.valueOf(this.ehv) });
      bool2 = bool1;
      if (!WXHardCoderJNI.hcGifEnable)
        if (!WXHardCoderJNI.hcGifFrameEnable)
          break label98;
    }
    label98: for (boolean bool2 = bool1; ; bool2 = false)
    {
      WXHardCoderJNI.stopPerformance(bool2, this.ehv);
      this.ehv = 0;
      com.tencent.mm.as.a.h(this.npa, 300L);
      AppMethodBeat.o(62401);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.d
 * JD-Core Version:    0.6.2
 */