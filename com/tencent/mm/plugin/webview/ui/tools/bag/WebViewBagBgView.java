package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class WebViewBagBgView extends View
{
  int mDuration;
  private Paint mPaint;
  long mStartTime;
  private RectF nI;
  int svV;
  private int uzg;
  private int uzh;
  private float uzi;
  private float uzj;
  private float uzk;
  private int uzl;
  private int uzm;
  boolean uzn;

  public WebViewBagBgView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(8198);
    this.uzg = -7829368;
    this.uzh = -65536;
    this.uzi = 0.0F;
    this.mPaint = new Paint();
    this.mPaint.setAntiAlias(true);
    this.uzm = -1;
    AppMethodBeat.o(8198);
  }

  final void lT(long paramLong)
  {
    AppMethodBeat.i(8201);
    if (this.uzm < 0)
    {
      ab.i("MicroMsg.WebViewBagBgView", "doUpdateAngryInfo not measured, mDiameter:%d", new Object[] { Integer.valueOf(this.uzm) });
      AppMethodBeat.o(8201);
      return;
    }
    this.uzi = (this.uzm * 2 / (this.mDuration / this.svV));
    if (paramLong - this.mStartTime <= 0L)
    {
      f = this.uzm;
      label81: this.uzj = f;
      if (this.uzm - this.uzj >= this.uzl)
        break label193;
    }
    label193: for (float f = this.uzm; ; f = this.uzj + this.uzl)
    {
      this.uzk = f;
      AppMethodBeat.o(8201);
      break;
      int i = (int)((float)(paramLong - this.mStartTime) / this.svV);
      this.uzj = (this.uzm - (i + 1) * this.uzi);
      if (this.uzj < -this.uzl)
      {
        f = -this.uzl;
        break label81;
      }
      f = this.uzj;
      break label81;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(8199);
    super.onDraw(paramCanvas);
    if (this.uzk == this.uzj)
      this.uzj -= 0.001F;
    float f1 = this.uzj;
    float f2 = this.uzk;
    int i = this.uzg;
    int j = this.uzh;
    Object localObject = Shader.TileMode.CLAMP;
    localObject = new LinearGradient(0.0F, f1, 0.0F, f2, new int[] { i, j }, null, (Shader.TileMode)localObject);
    this.mPaint.setShader((Shader)localObject);
    paramCanvas.drawOval(this.nI, this.mPaint);
    if ((this.uzn) && (this.uzk > 0.0F))
    {
      this.uzj -= this.uzi;
      if (this.uzj >= -this.uzl)
        break label213;
      f2 = -this.uzl;
      this.uzj = f2;
      if (this.uzm - this.uzj >= this.uzl)
        break label221;
    }
    label213: label221: for (f2 = this.uzm; ; f2 = this.uzj + this.uzl)
    {
      this.uzk = f2;
      postInvalidateDelayed(this.svV);
      AppMethodBeat.o(8199);
      return;
      f2 = this.uzj;
      break;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8200);
    super.onMeasure(paramInt1, paramInt2);
    this.uzm = View.MeasureSpec.getSize(paramInt1);
    this.nI = new RectF(0.0F, 0.0F, this.uzm, this.uzm);
    this.uzl = (this.uzm / 2);
    lT(System.currentTimeMillis());
    AppMethodBeat.o(8200);
  }

  public void setAngryColor(int paramInt)
  {
    this.uzh = paramInt;
  }

  public void setStartColor(int paramInt)
  {
    this.uzg = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView
 * JD-Core Version:    0.6.2
 */