package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RoundedCornerRelativeLayout extends RelativeLayout
{
  private Paint aFY;
  private RoundedCornerRelativeLayout.a zNX;
  private Bitmap zNY;

  public RoundedCornerRelativeLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(107959);
    dKQ();
    AppMethodBeat.o(107959);
  }

  public RoundedCornerRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107960);
    dKQ();
    AppMethodBeat.o(107960);
  }

  public RoundedCornerRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107961);
    dKQ();
    AppMethodBeat.o(107961);
  }

  private void dKQ()
  {
    AppMethodBeat.i(107962);
    this.zNX = new RoundedCornerRelativeLayout.a(this);
    this.aFY = new Paint(1);
    this.aFY.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    setWillNotDraw(false);
    AppMethodBeat.o(107962);
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107964);
    if ((paramCanvas.getWidth() <= 0) || (paramCanvas.getHeight() <= 0))
      AppMethodBeat.o(107964);
    while (true)
    {
      return;
      int i = paramCanvas.saveLayer(new RectF(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight()), null, 31);
      super.draw(paramCanvas);
      if ((this.zNX.zNZ > 0.0F) || (this.zNX.zOa > 0.0F) || (this.zNX.zOb > 0.0F) || (this.zNX.zOc > 0.0F))
      {
        if (this.zNY == null)
        {
          int j = paramCanvas.getWidth();
          int k = paramCanvas.getHeight();
          Bitmap localBitmap = Bitmap.createBitmap(j, k, Bitmap.Config.ALPHA_8);
          Canvas localCanvas = new Canvas(localBitmap);
          Path localPath = new Path();
          RectF localRectF = new RectF(0.0F, 0.0F, j, k);
          float f1 = this.zNX.zNZ;
          float f2 = this.zNX.zNZ;
          float f3 = this.zNX.zOa;
          float f4 = this.zNX.zOa;
          float f5 = this.zNX.zOc;
          float f6 = this.zNX.zOc;
          float f7 = this.zNX.zOb;
          float f8 = this.zNX.zOb;
          Path.Direction localDirection = Path.Direction.CCW;
          localPath.addRoundRect(localRectF, new float[] { f1, f2, f3, f4, f5, f6, f7, f8 }, localDirection);
          localPath.setFillType(Path.FillType.WINDING);
          localCanvas.drawPath(localPath, new Paint(1));
          this.zNY = localBitmap;
        }
        paramCanvas.drawBitmap(this.zNY, 0.0F, 0.0F, this.aFY);
      }
      paramCanvas.restoreToCount(i);
      AppMethodBeat.o(107964);
    }
  }

  public void setRadius(float paramFloat)
  {
    AppMethodBeat.i(107963);
    this.zNX.zNZ = paramFloat;
    this.zNX.zOa = paramFloat;
    this.zNX.zOb = paramFloat;
    this.zNX.zOc = paramFloat;
    if (this.zNY != null)
    {
      this.zNY = null;
      postInvalidate();
    }
    AppMethodBeat.o(107963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.RoundedCornerRelativeLayout
 * JD-Core Version:    0.6.2
 */