package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class FaceDetectDecorView extends View
{
  public boolean mau;
  public boolean mav;
  public boolean maw;
  public RectF may;
  private Paint maz;

  public FaceDetectDecorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FaceDetectDecorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(615);
    this.mau = false;
    this.mav = false;
    this.maw = false;
    this.may = null;
    this.maz = null;
    this.maz = new Paint();
    this.maz.setColor(getResources().getColor(2131689761));
    this.maz.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    setLayerType(1, null);
    AppMethodBeat.o(615);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(616);
    super.onDraw(paramCanvas);
    ab.i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", new Object[] { Boolean.valueOf(this.mav), Boolean.valueOf(this.mau), this.may });
    if ((this.mav != this.mau) || (this.maw))
    {
      if (!this.mav)
        break label114;
      paramCanvas.drawColor(getResources().getColor(2131690011));
      paramCanvas.drawRect(this.may, this.maz);
    }
    while (true)
    {
      this.mau = this.mav;
      AppMethodBeat.o(616);
      return;
      label114: paramCanvas.drawColor(getResources().getColor(2131690597));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView
 * JD-Core Version:    0.6.2
 */