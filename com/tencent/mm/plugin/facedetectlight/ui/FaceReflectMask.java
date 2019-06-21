package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytagreflectlivecheck.controller.ReflectController;
import com.tencent.youtu.ytagreflectlivecheck.ui.YTReflectLayout;

public class FaceReflectMask extends YTReflectLayout
{
  private ColorMatrixColorFilter mColorMatrixColorFilter;
  private Paint mcJ;
  private Paint mcK;
  private PorterDuffXfermode mcL;
  public boolean mcM;
  public boolean mdZ;
  private Rect rect;

  public FaceReflectMask(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(803);
    this.rect = new Rect();
    this.mcM = false;
    this.mcJ = new Paint(1);
    this.mcJ.setStyle(Paint.Style.FILL);
    this.mcK = new Paint(1);
    this.mColorMatrixColorFilter = ReflectController.DEFAULT_MATRIX_COLOR_FILTER;
    setWillNotDraw(false);
    this.mcL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    this.mdZ = true;
    setLayerType(1, null);
    AppMethodBeat.o(803);
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(805);
    paramCanvas.save();
    float f1 = (float)(getWidth() * 0.35D);
    float f2 = (float)(getWidth() * 0.5D);
    float f3 = (float)(getHeight() * 0.4D);
    this.rect.left = 0;
    this.rect.right = getWidth();
    this.rect.top = 0;
    this.rect.bottom = getHeight();
    if (this.mdZ)
    {
      this.mcJ.setColor(-16777216);
      this.mdZ = false;
    }
    while (true)
    {
      paramCanvas.drawARGB(255, 0, 0, 0);
      paramCanvas.drawRect(this.rect, this.mcJ);
      if (!this.mcM)
      {
        this.mcK.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mcK.setXfermode(this.mcL);
        paramCanvas.drawCircle(f2, f3, f1, this.mcK);
      }
      paramCanvas.restore();
      AppMethodBeat.o(805);
      return;
      this.mcJ.setColor(-16777216);
      this.mcJ.setColorFilter(this.mColorMatrixColorFilter);
    }
  }

  public void setColorMatrixColorFilter(ColorMatrixColorFilter paramColorMatrixColorFilter)
  {
    AppMethodBeat.i(804);
    this.mColorMatrixColorFilter = paramColorMatrixColorFilter;
    invalidate();
    AppMethodBeat.o(804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.FaceReflectMask
 * JD-Core Version:    0.6.2
 */