package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class LuckyAvatarParticleView extends View
{
  public static DisplayMetrics ghw;
  private Paint aFY;
  private long duration;
  private ValueAnimator jcQ;
  private int nUA;
  private int nUB;
  private int nUC;
  private int nUu;
  private int nUv;
  private List<Rect> nUw;
  private List<Integer> nUx;
  private List<Integer> nUy;
  private int nUz;

  public LuckyAvatarParticleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42161);
    this.nUw = new ArrayList();
    this.nUx = new ArrayList();
    this.nUy = new ArrayList();
    this.aFY = new Paint();
    AppMethodBeat.o(42161);
  }

  private int getRandomRectWidth()
  {
    AppMethodBeat.i(42163);
    int i = this.nUB;
    int j = (int)(Math.random() * (this.nUC - this.nUB));
    AppMethodBeat.o(42163);
    return i + j;
  }

  private int getRandomVelocity()
  {
    AppMethodBeat.i(42162);
    int i = this.nUz;
    int j = (int)(Math.random() * (this.nUA - this.nUz));
    AppMethodBeat.o(42162);
    return i + j;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(42164);
    super.onDraw(paramCanvas);
    for (int i = 0; i < this.nUw.size(); i++)
      paramCanvas.drawRect((Rect)this.nUw.get(i), this.aFY);
    AppMethodBeat.o(42164);
  }

  public void setColor(int paramInt)
  {
    AppMethodBeat.i(42166);
    this.aFY.setColor(paramInt);
    this.aFY.setStyle(Paint.Style.FILL);
    AppMethodBeat.o(42166);
  }

  public void setDuration(long paramLong)
  {
    AppMethodBeat.i(42165);
    this.duration = paramLong;
    this.jcQ = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(this.duration);
    this.jcQ.addUpdateListener(new LuckyAvatarParticleView.1(this));
    AppMethodBeat.o(42165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView
 * JD-Core Version:    0.6.2
 */