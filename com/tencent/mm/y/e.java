package com.tencent.mm.y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.view.PhotoEditText;

public final class e extends c
{
  private static final float eHB;
  private static final int eHC;
  private static final int eHD;
  private static TextPaint oz;
  public int eHE = -65536;
  public SpannableString eHF;
  public int mColor = -1;

  static
  {
    AppMethodBeat.i(116299);
    eHB = ah.getResources().getDimension(2131428310);
    eHC = (int)ah.getResources().getDimension(2131428467);
    eHD = (int)ah.getResources().getDimension(2131428592);
    TextPaint localTextPaint = new TextPaint(1);
    oz = localTextPaint;
    localTextPaint.setStrokeCap(Paint.Cap.ROUND);
    oz.setStyle(Paint.Style.FILL);
    oz.setDither(true);
    oz.setTextSize(eHB);
    AppMethodBeat.o(116299);
  }

  public e(Context paramContext, Matrix paramMatrix, String paramString, Rect paramRect, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    super(paramContext, paramMatrix, paramString, paramRect);
    this.mColor = paramInt1;
    this.eHF = paramSpannableString;
    this.eHE = paramInt2;
  }

  protected final Bitmap Qf()
  {
    AppMethodBeat.i(116297);
    oz.setColor(this.mColor);
    Bitmap localBitmap;
    if (this.eHF == null)
    {
      localBitmap = null;
      AppMethodBeat.o(116297);
    }
    while (true)
    {
      return localBitmap;
      PhotoEditText localPhotoEditText = new PhotoEditText(this.mContext);
      int i = a.al(this.mContext, 2131428308);
      localPhotoEditText.setPadding(i, 0, i, 0);
      localPhotoEditText.setTextBackground(this.eHE);
      localPhotoEditText.setTextColor(this.mColor);
      localPhotoEditText.setTextSize(Math.round(eHB / this.mContext.getResources().getDisplayMetrics().density));
      localPhotoEditText.setText(j.b(this.mContext, this.eHF, eHB / 1.3F));
      localPhotoEditText.setSingleLine(false);
      localPhotoEditText.setMaxWidth((int)(this.mContext.getResources().getDisplayMetrics().widthPixels - this.mContext.getResources().getDimension(2131428308) * 2.0F));
      localPhotoEditText.measure(0, 0);
      localBitmap = Bitmap.createBitmap(localPhotoEditText.getMeasuredWidth() - i, localPhotoEditText.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      localPhotoEditText.getLayout().getPaint().setColor(this.mColor);
      localCanvas.save();
      localCanvas.translate(-0.5F * i, 0.0F);
      localPhotoEditText.draw(localCanvas);
      localCanvas.restore();
      localCanvas.save();
      localCanvas.translate(i * 0.5F, 0.0F);
      localPhotoEditText.getLayout().draw(localCanvas);
      localCanvas.restore();
      AppMethodBeat.o(116297);
    }
  }

  public final void setSelected(boolean paramBoolean)
  {
    AppMethodBeat.i(116298);
    super.setSelected(paramBoolean);
    if (!paramBoolean)
      this.eHn = false;
    AppMethodBeat.o(116298);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.e
 * JD-Core Version:    0.6.2
 */