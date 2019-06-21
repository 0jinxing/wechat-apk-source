package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

public class MemberCardTopCropImageView extends ImageView
{
  protected int itemHeight;
  protected int itemPadding;
  protected int itemWidth;
  private float ksR;
  private Path ksS;
  private RectF ksT;
  private float radius;

  public MemberCardTopCropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(88987);
    this.itemWidth = -1;
    this.itemHeight = -1;
    this.itemPadding = -1;
    init();
    AppMethodBeat.o(88987);
  }

  public MemberCardTopCropImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(88988);
    this.itemWidth = -1;
    this.itemHeight = -1;
    this.itemPadding = -1;
    init();
    AppMethodBeat.o(88988);
  }

  private void init()
  {
    AppMethodBeat.i(88990);
    setScaleType(ImageView.ScaleType.MATRIX);
    this.itemHeight = a.al(ah.getContext(), 2131428167);
    this.itemPadding = (a.al(ah.getContext(), 2131427796) * 2);
    AppMethodBeat.o(88990);
  }

  public float getShowScale()
  {
    return this.ksR;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(88992);
    if ((this.ksT != null) && (this.ksS != null))
    {
      this.ksT.right = getWidth();
      this.ksT.bottom = getHeight();
      this.ksS.addRoundRect(this.ksT, this.radius, this.radius, Path.Direction.CW);
      paramCanvas.clipPath(this.ksS);
    }
    super.onDraw(paramCanvas);
    AppMethodBeat.o(88992);
  }

  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(88991);
    boolean bool;
    if (getDrawable() == null)
    {
      bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(88991);
      return bool;
    }
    Matrix localMatrix = getImageMatrix();
    int i = getDrawable().getIntrinsicWidth();
    int j = getDrawable().getIntrinsicHeight();
    this.itemWidth = (getContext().getResources().getDisplayMetrics().widthPixels - this.itemPadding);
    int k = this.itemWidth;
    int m = this.itemHeight;
    if (i * m > j * k);
    for (this.ksR = (m / j); ; this.ksR = (k / i))
    {
      localMatrix.setScale(this.ksR, this.ksR);
      setImageMatrix(localMatrix);
      bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(88991);
      break;
    }
  }

  public void setRadius(float paramFloat)
  {
    AppMethodBeat.i(88989);
    this.radius = paramFloat;
    if (paramFloat > 0.0F)
    {
      this.ksS = new Path();
      this.ksT = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    }
    AppMethodBeat.o(88989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView
 * JD-Core Version:    0.6.2
 */