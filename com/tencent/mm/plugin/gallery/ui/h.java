package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends Drawable
{
  private static final Paint feO;
  private static Rect rect;
  protected int cyQ;
  protected ImageView ikh;
  private Bitmap mBitmap;
  protected String mFilePath;
  protected String mNC;
  protected long mND;
  protected boolean mSb;
  public h.a mSc;
  long mSd;
  boolean mSe;
  private Rect mSf;
  private int mWidth;

  static
  {
    AppMethodBeat.i(21619);
    feO = new Paint();
    rect = null;
    feO.setAntiAlias(true);
    feO.setFilterBitmap(true);
    AppMethodBeat.o(21619);
  }

  private h(ImageView paramImageView)
  {
    AppMethodBeat.i(21610);
    this.cyQ = 0;
    this.mFilePath = "";
    this.mNC = "";
    this.mSb = false;
    this.mND = 0L;
    this.mSe = false;
    this.mSf = new Rect();
    this.ikh = paramImageView;
    this.mFilePath = "";
    AppMethodBeat.o(21610);
  }

  private static void a(Bitmap paramBitmap, Rect paramRect)
  {
    AppMethodBeat.i(21616);
    if (paramBitmap.getWidth() > paramBitmap.getHeight())
    {
      paramRect.top = 0;
      paramRect.bottom = paramBitmap.getHeight();
      paramRect.left = (paramBitmap.getWidth() - paramBitmap.getHeight() >> 1);
      paramRect.right = (paramRect.left + paramBitmap.getHeight());
      AppMethodBeat.o(21616);
    }
    while (true)
    {
      return;
      paramRect.left = 0;
      paramRect.right = paramBitmap.getWidth();
      paramRect.top = (paramBitmap.getHeight() - paramBitmap.getWidth() >> 1);
      paramRect.bottom = (paramRect.top + paramBitmap.getWidth());
      AppMethodBeat.o(21616);
    }
  }

  public static void a(ImageView paramImageView, int paramInt, String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(21617);
    a(paramImageView, paramInt, paramString1, paramString2, paramLong, -1, null);
    AppMethodBeat.o(21617);
  }

  public static void a(ImageView paramImageView, int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, h.a parama)
  {
    AppMethodBeat.i(21618);
    Object localObject = paramImageView.getDrawable();
    if ((localObject != null) && ((localObject instanceof h)));
    for (localObject = (h)localObject; ; localObject = new h(paramImageView))
    {
      if (paramInt2 > 0)
        ((h)localObject).mWidth = paramInt2;
      ((h)localObject).mSc = parama;
      ((h)localObject).b(paramInt1, paramString1, paramString2, paramLong);
      paramImageView.setImageDrawable((Drawable)localObject);
      AppMethodBeat.o(21618);
      return;
    }
  }

  private void b(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(21611);
    if (bo.isNullOrNil(paramString1));
    for (String str = paramString2; bo.isNullOrNil(str); str = paramString1)
    {
      ab.e("MicroMsg.ThumbDrawable", "filepath is null or nil");
      AppMethodBeat.o(21611);
      return;
    }
    if (!bo.isNullOrNil(paramString1))
    {
      this.mSb = true;
      label59: e.bBY().a(new h.c(this.ikh));
      if ((this.mFilePath.equals(str)) && (this.mBitmap != null) && (!this.mBitmap.isRecycled()))
        break label319;
      this.mFilePath = str;
      this.mNC = paramString2;
      this.mND = paramLong;
      this.cyQ = paramInt;
      this.mBitmap = e.bBY().Nz(this.mFilePath);
      if (this.mBitmap != null)
        break label299;
      bool2 = true;
      label151: if (this.mBitmap == null)
        break label305;
      bool1 = this.mBitmap.isRecycled();
      label167: ab.d("MicroMsg.ThumbDrawable", "setMediaFeature ok filePath:[%s] mBitmap:[%s], mBitmap.isRecycled():[%s]", new Object[] { str, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if ((this.mBitmap != null) && (!this.mBitmap.isRecycled()))
        break label311;
      this.mSe = true;
      this.mSd = 0L;
      this.mBitmap = e.bBY().b(str, paramInt, paramString2, paramLong);
    }
    while (true)
    {
      if ((this.mSc != null) && (this.mBitmap != null) && (!this.mBitmap.isRecycled()))
        this.mSc.bCx();
      this.ikh.invalidate();
      AppMethodBeat.o(21611);
      break;
      this.mSb = false;
      break label59;
      label299: bool2 = false;
      break label151;
      label305: bool1 = false;
      break label167;
      label311: this.mSe = false;
    }
    label319: if (this.mBitmap == null);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if (this.mBitmap != null)
        bool1 = this.mBitmap.isRecycled();
      ab.d("MicroMsg.ThumbDrawable", "setMediaFeature fuck filePath:[%s] mBitmap:[%s], mBitmap.isRecycled():[%s]", new Object[] { str, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      AppMethodBeat.o(21611);
      break;
    }
  }

  private boolean d(Canvas paramCanvas, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(21615);
    if ((this.mBitmap == null) || (this.mBitmap.isRecycled()))
    {
      ab.d("MicroMsg.ThumbDrawable", "[duanyi test] get bitmap is null: " + this.mFilePath);
      if ((this.mBitmap != null) && (this.mBitmap.isRecycled()))
      {
        this.mSe = true;
        this.mSd = 0L;
        this.mBitmap = e.bBY().b(this.mFilePath, this.cyQ, this.mNC, this.mND);
        if ((this.mSc != null) && (this.mBitmap != null) && (!this.mBitmap.isRecycled()))
          this.mSc.bCx();
      }
      AppMethodBeat.o(21615);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.ThumbDrawable", "[duanyi test] get bitmap ok:" + this.mFilePath);
      a(this.mBitmap, this.mSf);
      feO.setAlpha(paramInt);
      paramCanvas.drawBitmap(this.mBitmap, this.mSf, getBounds(), feO);
      ab.v("MicroMsg.ThumbDrawable", "Bounts:%s", new Object[] { getBounds().toString() });
      AppMethodBeat.o(21615);
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(21614);
    float f = (float)(SystemClock.uptimeMillis() - this.mSd) / 200.0F;
    if (this.mSd == 0L)
    {
      ab.d("MicroMsg.ThumbDrawable", "[duanyi test]: draw:[%s] startTimeMillis is 0", new Object[] { this.mFilePath });
      f = 0.0F;
    }
    ab.d("MicroMsg.ThumbDrawable", "[duanyi test]: hash:[%s] draw:[%s] animating:[%s] normalized:[%s] alpha[%s]", new Object[] { Integer.valueOf(hashCode()), this.mFilePath, Boolean.valueOf(this.mSe), Float.valueOf(f), Integer.valueOf((int)(255.0F * f)) });
    if (!this.mSe)
    {
      d(paramCanvas, 255);
      setAlpha(255);
      AppMethodBeat.o(21614);
    }
    while (true)
    {
      return;
      if (f >= 1.0F)
      {
        this.mSe = false;
        d(paramCanvas, 255);
        AppMethodBeat.o(21614);
      }
      else
      {
        if (d(paramCanvas, (int)(f * 255.0F)))
          invalidateSelf();
        AppMethodBeat.o(21614);
      }
    }
  }

  public final int getIntrinsicHeight()
  {
    return 400;
  }

  public final int getIntrinsicWidth()
  {
    return 400;
  }

  public final int getOpacity()
  {
    return 0;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(21612);
    ab.v("MicroMsg.ThumbDrawable", "setBountsLTRB:%d %d - %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(21612);
  }

  public final void setBounds(Rect paramRect)
  {
    AppMethodBeat.i(21613);
    ab.v("MicroMsg.ThumbDrawable", "setBountsRECT:%s", new Object[] { paramRect.toString() });
    super.setBounds(paramRect);
    AppMethodBeat.o(21613);
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.h
 * JD-Core Version:    0.6.2
 */