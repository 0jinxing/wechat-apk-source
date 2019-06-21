package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public class HighlightRectSideView extends View
{
  private ap gyS;
  private boolean[] qcr;
  private Rect qcs;
  private int qct;
  private int qcu;
  private int qcv;
  private int qcw;
  private Paint vw;

  public HighlightRectSideView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(81024);
    this.qcw = 0;
    this.gyS = new ap(new HighlightRectSideView.1(this), true);
    paramContext = a.decodeResource(getResources(), 2130840085);
    this.qct = paramContext.getWidth();
    this.qcu = paramContext.getHeight();
    if (this.qcu != this.qct)
      ab.e("MicroMsg.HighlightRectSideView", "width is not same as height");
    this.qcv = (this.qct * 6 / 24);
    this.qcr = new boolean[4];
    this.vw = new Paint();
    this.vw.setColor(6676738);
    this.vw.setAlpha(255);
    this.vw.setStrokeWidth(this.qcv);
    this.vw.setStyle(Paint.Style.STROKE);
    AppMethodBeat.o(81024);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(81026);
    super.onAttachedToWindow();
    this.gyS.ae(300L, 300L);
    AppMethodBeat.o(81026);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(81027);
    super.onDetachedFromWindow();
    if (this.gyS != null)
    {
      this.gyS.stopTimer();
      this.gyS = null;
    }
    AppMethodBeat.o(81027);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(81028);
    super.onDraw(paramCanvas);
    int i = 0;
    if (i < 4)
      if (this.qcr[i] != 0);
    for (i = 0; ; i = 1)
    {
      int j = this.qcv / 2;
      if ((this.qcr[0] != 0) && ((1 == i) || (this.qcw % 2 == 0)))
        paramCanvas.drawLine(this.qcs.left + j, this.qcs.top + this.qcu, this.qcs.left + j, this.qcs.bottom - this.qcu, this.vw);
      if ((this.qcr[1] != 0) && ((1 == i) || (this.qcw % 2 == 0)))
        paramCanvas.drawLine(this.qcs.right - j, this.qcs.top + this.qcu, this.qcs.right - j, this.qcs.bottom - this.qcu, this.vw);
      if ((this.qcr[2] != 0) && ((1 == i) || (this.qcw % 3 == 0)))
        paramCanvas.drawLine(this.qcs.left + this.qct, this.qcs.top + j, this.qcs.right - this.qct, this.qcs.top + j, this.vw);
      if ((this.qcr[3] != 0) && ((1 == i) || (this.qcw % 3 == 0)))
        paramCanvas.drawLine(this.qcs.left + this.qct, this.qcs.bottom - j, this.qcs.right - this.qct, this.qcs.bottom - j, this.vw);
      AppMethodBeat.o(81028);
      return;
      i++;
      break;
    }
  }

  public void setMaskRect(Rect paramRect)
  {
    AppMethodBeat.i(81025);
    this.qcs = paramRect;
    ab.d("MicroMsg.HighlightRectSideView", "rect:%s", new Object[] { paramRect });
    AppMethodBeat.o(81025);
  }

  public void setShowRectEdges(boolean[] paramArrayOfBoolean)
  {
    int i = 0;
    AppMethodBeat.i(81029);
    if ((paramArrayOfBoolean == null) || (4 != paramArrayOfBoolean.length))
      AppMethodBeat.o(81029);
    while (true)
    {
      return;
      ab.d("MicroMsg.HighlightRectSideView", "%s, %s, %s, %s", new Object[] { Boolean.valueOf(paramArrayOfBoolean[0]), Boolean.valueOf(paramArrayOfBoolean[1]), Boolean.valueOf(paramArrayOfBoolean[2]), Boolean.valueOf(paramArrayOfBoolean[3]) });
      while (i < 4)
      {
        this.qcr[i] = paramArrayOfBoolean[i];
        i++;
      }
      invalidate();
      AppMethodBeat.o(81029);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.HighlightRectSideView
 * JD-Core Version:    0.6.2
 */