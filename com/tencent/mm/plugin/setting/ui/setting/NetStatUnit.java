package com.tencent.mm.plugin.setting.ui.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

class NetStatUnit extends View
{
  protected static int max;
  private int qkX;
  private int total;

  public NetStatUnit(Context paramContext)
  {
    this(paramContext, null);
  }

  public NetStatUnit(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NetStatUnit(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private static void Cj(int paramInt)
  {
    paramInt = (paramInt / 1572864 + 1) * 1572864;
    if (94371840 > paramInt)
      if (3145728 >= paramInt)
        break label40;
    while (true)
    {
      if (paramInt > max)
        max = paramInt;
      return;
      paramInt = 94371840;
      break;
      label40: paramInt = 3145728;
    }
  }

  public final void fg(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126970);
    this.qkX = paramInt1;
    this.total = paramInt2;
    if (paramInt1 > 94371840)
      this.qkX = 94371840;
    if (paramInt2 > 94371840)
      this.total = 94371840;
    if (paramInt1 > paramInt2);
    while (true)
    {
      Cj(paramInt1);
      AppMethodBeat.o(126970);
      return;
      paramInt1 = paramInt2;
    }
  }

  @SuppressLint({"DrawAllocation"})
  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(126971);
    super.onDraw(paramCanvas);
    Paint localPaint = new Paint();
    Rect localRect1 = new Rect();
    getDrawingRect(localRect1);
    float f1 = localRect1.height() * this.total / max;
    float f2 = localRect1.width();
    Rect localRect2 = new Rect(localRect1.left, (int)(localRect1.bottom - f1), (int)(f2 * 0.6F + localRect1.left), localRect1.bottom);
    localPaint.setColor(-7829368);
    paramCanvas.drawRect(localRect2, localPaint);
    f1 = localRect1.height() * this.qkX / max;
    f2 = localRect1.width();
    localRect2 = new Rect(localRect1.left, (int)(localRect1.bottom - f1), (int)(f2 * 0.6F + localRect1.left), localRect1.bottom);
    localPaint.setColor(-16711936);
    paramCanvas.drawRect(localRect2, localPaint);
    AppMethodBeat.o(126971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.NetStatUnit
 * JD-Core Version:    0.6.2
 */