package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.q.a;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/AudioWaveView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isPlayerLoading", "", "()Z", "setPlayerLoading", "(Z)V", "isRunningShow", "setRunningShow", "mRandom", "", "getMRandom", "()D", "setMRandom", "(D)V", "mRectCount", "getMRectCount", "()I", "setMRectCount", "(I)V", "mRectHeight", "getMRectHeight", "setMRectHeight", "mRectWidth", "getMRectWidth", "setMRectWidth", "mWavePaint", "Landroid/graphics/Paint;", "getMWavePaint", "()Landroid/graphics/Paint;", "setMWavePaint", "(Landroid/graphics/Paint;)V", "mWidth", "getMWidth", "setMWidth", "offset", "", "getOffset", "()F", "value", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "player", "getPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setPlayer", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V", "drawRoundRect", "", "canvas", "Landroid/graphics/Canvas;", "rectF", "Landroid/graphics/RectF;", "r1", "r2", "initView", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "setColor", "color", "setShow", "isShow", "plugin-story_release"})
public final class AudioWaveView extends View
{
  private int mWidth;
  private final float offset;
  private int shT;
  private int shU;
  private Paint shV;
  private int shW;
  private double shX;
  private boolean shY;
  private boolean shZ;
  private v sia;

  public AudioWaveView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110292);
    this.offset = e.cZ(getContext());
    this.shZ = true;
    initView();
    AppMethodBeat.o(110292);
  }

  public AudioWaveView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110293);
    this.offset = e.cZ(getContext());
    this.shZ = true;
    initView();
    AppMethodBeat.o(110293);
  }

  private void a(Canvas paramCanvas, RectF paramRectF)
  {
    AppMethodBeat.i(110291);
    j.p(paramCanvas, "canvas");
    j.p(paramRectF, "rectF");
    paramCanvas.drawRect(paramRectF, this.shV);
    AppMethodBeat.o(110291);
  }

  private final void initView()
  {
    AppMethodBeat.i(110287);
    this.shW = 20;
    this.shV = new Paint();
    Paint localPaint = this.shV;
    if (localPaint == null)
      j.dWJ();
    localPaint.setStyle(Paint.Style.FILL);
    localPaint = this.shV;
    if (localPaint == null)
      j.dWJ();
    localPaint.setColor(-3355444);
    localPaint = this.shV;
    if (localPaint == null)
      j.dWJ();
    localPaint.setAntiAlias(true);
    AppMethodBeat.o(110287);
  }

  public final double getMRandom()
  {
    return this.shX;
  }

  public final int getMRectCount()
  {
    return this.shW;
  }

  public final int getMRectHeight()
  {
    return this.shU;
  }

  public final int getMRectWidth()
  {
    return this.shT;
  }

  public final Paint getMWavePaint()
  {
    return this.shV;
  }

  public final int getMWidth()
  {
    return this.mWidth;
  }

  public final float getOffset()
  {
    return this.offset;
  }

  public final v getPlayer()
  {
    return this.sia;
  }

  @SuppressLint({"DrawAllocation"})
  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110290);
    j.p(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    paramCanvas.translate(getWidth() / 2, getHeight());
    int i = 0;
    int j = this.shW;
    if (i < j)
    {
      if ((this.shY) && (!this.shZ))
      {
        this.shX = Math.random();
        float f = (float)(this.shU * this.shX);
        a(paramCanvas, new RectF((float)(this.shT * i + this.offset), 0.0F, this.shT * (i + 1), -f));
      }
      while (true)
      {
        i++;
        break;
        a(paramCanvas, new RectF((float)(this.shT * i + this.offset), 0.0F, this.shT * (i + 1), -0.5F));
      }
    }
    postInvalidateDelayed(100L);
    AppMethodBeat.o(110290);
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(110289);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.mWidth = getWidth();
    this.shU = (getHeight() / 2);
    this.shT = (this.mWidth / (this.shW * 2));
    AppMethodBeat.o(110289);
  }

  public final void setColor(int paramInt)
  {
    AppMethodBeat.i(110288);
    Paint localPaint = this.shV;
    if (localPaint == null)
      j.dWJ();
    localPaint.setColor(paramInt);
    AppMethodBeat.o(110288);
  }

  public final void setMRandom(double paramDouble)
  {
    this.shX = paramDouble;
  }

  public final void setMRectCount(int paramInt)
  {
    this.shW = paramInt;
  }

  public final void setMRectHeight(int paramInt)
  {
    this.shU = paramInt;
  }

  public final void setMRectWidth(int paramInt)
  {
    this.shT = paramInt;
  }

  public final void setMWavePaint(Paint paramPaint)
  {
    this.shV = paramPaint;
  }

  public final void setMWidth(int paramInt)
  {
    this.mWidth = paramInt;
  }

  public final void setPlayer(v paramv)
  {
    AppMethodBeat.i(110286);
    if (paramv != null)
    {
      this.sia = paramv;
      paramv = this.sia;
      if (paramv != null)
      {
        paramv.a((q.a)new AudioWaveView.a(this));
        AppMethodBeat.o(110286);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110286);
    }
  }

  public final void setPlayerLoading(boolean paramBoolean)
  {
    this.shZ = paramBoolean;
  }

  public final void setRunningShow(boolean paramBoolean)
  {
    this.shY = paramBoolean;
  }

  public final void setShow(boolean paramBoolean)
  {
    this.shY = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.AudioWaveView
 * JD-Core Version:    0.6.2
 */