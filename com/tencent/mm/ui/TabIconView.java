package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

public class TabIconView extends ImageView
{
  private Paint aFY;
  private Paint bmE;
  private Context mContext;
  private float scale = 1.166667F;
  private Bitmap yqC;
  private Bitmap yqD;
  private Bitmap yqE;
  private Rect yqF;
  private Rect yqG;
  private Rect yqH;
  private int yqI = 0;

  public TabIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public TabIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }

  public final void h(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(29922);
    if (paramBoolean)
      this.scale *= 1.25F;
    this.yqC = d.o(paramInt1, this.scale);
    this.yqD = d.o(paramInt3, this.scale);
    this.yqE = d.o(paramInt2, this.scale);
    this.yqF = new Rect(0, 0, this.yqC.getWidth(), this.yqC.getHeight());
    this.yqG = new Rect(0, 0, this.yqD.getWidth(), this.yqD.getHeight());
    this.yqH = new Rect(0, 0, this.yqE.getWidth(), this.yqE.getHeight());
    this.aFY = new Paint(1);
    this.bmE = new Paint(1);
    this.bmE.setColorFilter(new PorterDuffColorFilter(this.mContext.getResources().getColor(2131689764), PorterDuff.Mode.SRC_ATOP));
    this.aFY.setColorFilter(new PorterDuffColorFilter(this.mContext.getResources().getColor(2131690683), PorterDuff.Mode.SRC_ATOP));
    AppMethodBeat.o(29922);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(29924);
    super.onDraw(paramCanvas);
    if (this.aFY == null)
      AppMethodBeat.o(29924);
    while (true)
    {
      return;
      if (this.yqI < 128)
      {
        this.aFY.setAlpha(255 - this.yqI * 2);
        this.bmE.setAlpha(255 - this.yqI * 2);
        paramCanvas.drawBitmap(this.yqD, null, this.yqG, this.bmE);
        this.aFY.setAlpha(this.yqI * 2);
        paramCanvas.drawBitmap(this.yqE, null, this.yqH, this.aFY);
        AppMethodBeat.o(29924);
      }
      else
      {
        this.aFY.setAlpha(255 - this.yqI * 2);
        paramCanvas.drawBitmap(this.yqE, null, this.yqH, this.aFY);
        this.aFY.setAlpha(this.yqI * 2);
        paramCanvas.drawBitmap(this.yqC, null, this.yqF, this.aFY);
        AppMethodBeat.o(29924);
      }
    }
  }

  public void setFocusAlpha(int paramInt)
  {
    AppMethodBeat.i(29923);
    this.yqI = paramInt;
    invalidate();
    AppMethodBeat.o(29923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.TabIconView
 * JD-Core Version:    0.6.2
 */