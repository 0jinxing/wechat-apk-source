package com.tencent.mm.plugin.facedetectaction.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FaceActionMask extends RelativeLayout
{
  private Paint mcJ;
  private Paint mcK;
  private PorterDuffXfermode mcL;
  private boolean mcM;
  private Rect rect;

  public FaceActionMask(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(707);
    this.rect = new Rect();
    this.mcM = false;
    this.mcJ = new Paint(1);
    this.mcJ.setStyle(Paint.Style.FILL);
    this.mcK = new Paint(1);
    setWillNotDraw(false);
    this.mcL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    setLayerType(1, null);
    AppMethodBeat.o(707);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(708);
    paramCanvas.save();
    float f1 = (float)(getWidth() * 0.35D);
    float f2 = (float)(getWidth() * 0.5D);
    float f3 = (float)(getHeight() * 0.4D);
    this.rect.left = 0;
    this.rect.right = getWidth();
    this.rect.top = 0;
    this.rect.bottom = getHeight();
    this.mcJ.setColor(-1);
    paramCanvas.drawARGB(255, 0, 0, 0);
    paramCanvas.drawRect(this.rect, this.mcJ);
    if (!this.mcM)
    {
      this.mcK.setStyle(Paint.Style.FILL_AND_STROKE);
      this.mcK.setXfermode(this.mcL);
      paramCanvas.drawCircle(f2, f3, f1, this.mcK);
    }
    paramCanvas.restore();
    AppMethodBeat.o(708);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionMask
 * JD-Core Version:    0.6.2
 */