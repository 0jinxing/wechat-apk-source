package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class e extends b
{
  private final Rect Hx;
  private ak lda;
  int lfO;
  private Context mContext;
  private int mHeight;
  boolean mIsPlaying;
  private final Paint mPaint;
  private Resources mResources;
  private int mWidth;
  private float noE;
  private float noF;
  private boolean noG;
  private long noP;
  private final Runnable noW;
  private final Runnable noX;
  private volatile boolean npd;
  private int npe;
  private int npf;
  private int[] npg;
  private Bitmap nph;
  private boolean npi;
  boolean npj;
  private String npk;
  int npl;
  private k npm;

  public e(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, int paramInt, int[] paramArrayOfInt, String paramString)
  {
    AppMethodBeat.i(62410);
    this.npd = false;
    this.lfO = 0;
    this.nph = null;
    this.npi = false;
    this.mIsPlaying = true;
    this.npj = true;
    this.npl = 0;
    this.noE = 1.0F;
    this.noF = 1.0F;
    this.Hx = new Rect();
    this.mPaint = new Paint(6);
    this.lda = new ak(Looper.getMainLooper());
    this.noP = 0L;
    this.noX = new e.1(this);
    this.noW = new e.2(this);
    this.mContext = paramContext;
    this.mResources = this.mContext.getResources();
    this.npi = false;
    this.mIsPlaying = paramBoolean1;
    this.npj = paramBoolean2;
    this.npk = paramString;
    this.npf = paramInt;
    this.npg = paramArrayOfInt;
    if (!paramBoolean1)
    {
      this.nph = wQ(Oy(paramString));
      this.mWidth = this.nph.getWidth();
      this.mHeight = this.nph.getHeight();
      if (this.npg.length != 3)
        break label254;
    }
    label254: for (this.npe = 300; ; this.npe = 100)
    {
      this.npl = 0;
      AppMethodBeat.o(62410);
      return;
      this.nph = wQ(this.npg[0]);
      break;
    }
  }

  private int Oy(String paramString)
  {
    AppMethodBeat.i(62418);
    paramString = paramString.split("\\.")[0];
    int i = this.mResources.getIdentifier(paramString, "drawable", this.mContext.getPackageName());
    AppMethodBeat.o(62418);
    return i;
  }

  private void k(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(62412);
    this.noP = (SystemClock.uptimeMillis() + paramLong);
    if (this.lda != null)
      this.lda.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(62412);
  }

  private Bitmap wQ(int paramInt)
  {
    AppMethodBeat.i(62417);
    Bitmap localBitmap = BitmapFactory.decodeResource(this.mResources, paramInt);
    AppMethodBeat.o(62417);
    return localBitmap;
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(62411);
    if (this.noG)
    {
      this.Hx.set(getBounds());
      this.noE = (this.Hx.width() / this.mWidth);
      this.noF = (this.Hx.height() / this.mHeight);
      this.noG = false;
    }
    if (this.mPaint.getShader() == null)
    {
      paramCanvas.scale(this.noE, this.noF);
      if (this.npi)
      {
        this.nph = wQ(this.npf);
        if ((this.nph == null) || (this.nph.isRecycled()))
          break label387;
        paramCanvas.drawBitmap(this.nph, 0.0F, 0.0F, this.mPaint);
        AppMethodBeat.o(62411);
      }
    }
    while (true)
    {
      return;
      if (!this.mIsPlaying)
      {
        this.nph = wQ(Oy(this.npk));
        if ((this.nph != null) && (!this.nph.isRecycled()))
        {
          paramCanvas.drawBitmap(this.nph, 0.0F, 0.0F, this.mPaint);
          AppMethodBeat.o(62411);
        }
      }
      else
      {
        this.nph = wQ(this.npg[this.lfO]);
        if ((this.nph != null) && (!this.nph.isRecycled()))
          paramCanvas.drawBitmap(this.nph, 0.0F, 0.0F, this.mPaint);
        this.lfO += 1;
        if (this.npl < 3)
        {
          if (this.lfO >= this.npg.length)
          {
            this.lfO = 0;
            if (this.npj)
              break label320;
          }
          label320: for (this.npl = 0; ; this.npl += 1)
          {
            k(this.noX, this.npe);
            AppMethodBeat.o(62411);
            break;
          }
        }
        this.mIsPlaying = false;
        k(this.noX, this.npe);
        k(this.noW, 0L);
        AppMethodBeat.o(62411);
        continue;
        ab.i("MicroMsg.GIF.MMGIFGameDrawable", "shader is not null.");
        paramCanvas.drawRect(this.Hx, this.mPaint);
        label387: AppMethodBeat.o(62411);
      }
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(62419);
    this.npm = null;
    super.finalize();
    AppMethodBeat.o(62419);
  }

  public final int getIntrinsicHeight()
  {
    return this.mHeight;
  }

  public final int getIntrinsicWidth()
  {
    return this.mWidth;
  }

  public final int getOpacity()
  {
    return -2;
  }

  public final boolean isRunning()
  {
    return this.npd;
  }

  protected final void onBoundsChange(Rect paramRect)
  {
    AppMethodBeat.i(62415);
    super.onBoundsChange(paramRect);
    this.noG = true;
    AppMethodBeat.o(62415);
  }

  public final void pause()
  {
  }

  public final void recycle()
  {
  }

  public final void reset()
  {
  }

  public final void resume()
  {
  }

  public final void setAlpha(int paramInt)
  {
    AppMethodBeat.i(62413);
    this.mPaint.setAlpha(paramInt);
    AppMethodBeat.o(62413);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    AppMethodBeat.i(62414);
    this.mPaint.setColorFilter(paramColorFilter);
    AppMethodBeat.o(62414);
  }

  public final void start()
  {
    AppMethodBeat.i(62416);
    this.npd = true;
    this.lda.post(this.noX);
    AppMethodBeat.o(62416);
  }

  public final void stop()
  {
    this.npd = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.e
 * JD-Core Version:    0.6.2
 */