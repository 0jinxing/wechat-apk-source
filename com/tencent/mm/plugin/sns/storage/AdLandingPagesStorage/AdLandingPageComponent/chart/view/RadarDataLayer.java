package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RadarDataLayer extends DataLayerView
{
  public static final Point qYx;
  private b qYA;
  private ValueAnimator qYB;
  private boolean qYC;
  private int qYD;
  private Point qYE;
  private int qYs;
  private float qYv;
  private a qYy;
  private a qYz;
  private Path vr;

  static
  {
    AppMethodBeat.i(36979);
    qYx = new Point(0, 0);
    AppMethodBeat.o(36979);
  }

  public RadarDataLayer(Context paramContext, float paramFloat, a parama)
  {
    super(paramContext);
    AppMethodBeat.i(36968);
    this.qYA = new b();
    this.qYC = true;
    this.qYs = 4;
    this.qYD = 80;
    this.qYE = qYx;
    this.qYv = 1.0F;
    this.vr = new Path();
    this.qYv = paramFloat;
    this.qYA = parama.qXF;
    this.qYs = parama.size();
    this.qYy = parama;
    paramContext = parama.qXG;
    long l = parama.duration;
    if (l > 0L)
    {
      this.qYB = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.qYz = new a();
      this.qYB.setDuration(l);
      this.qYB.setInterpolator(paramContext);
      this.qYB.addUpdateListener(new RadarDataLayer.1(this));
    }
    AppMethodBeat.o(36968);
  }

  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(36966);
    this.qYA = new b();
    this.qYC = true;
    this.qYs = 4;
    this.qYD = 80;
    this.qYE = qYx;
    this.qYv = 1.0F;
    this.vr = new Path();
    cpj();
    AppMethodBeat.o(36966);
  }

  public RadarDataLayer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(36967);
    this.qYA = new b();
    this.qYC = true;
    this.qYs = 4;
    this.qYD = 80;
    this.qYE = qYx;
    this.qYv = 1.0F;
    this.vr = new Path();
    cpj();
    AppMethodBeat.o(36967);
  }

  private void cpj()
  {
    AppMethodBeat.i(36969);
    setMinimumHeight(160);
    setMinimumWidth(160);
    AppMethodBeat.o(36969);
  }

  private Paint getPaintLayerBorder()
  {
    AppMethodBeat.i(36972);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYA.qXI);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(this.qYA.qXJ);
    localPaint.setAntiAlias(true);
    AppMethodBeat.o(36972);
    return localPaint;
  }

  private Paint getPaintLayerDotPoint()
  {
    AppMethodBeat.i(36974);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYA.qXM);
    AppMethodBeat.o(36974);
    return localPaint;
  }

  private Paint getPaintLayerFilling()
  {
    AppMethodBeat.i(36971);
    Paint localPaint = new Paint();
    b localb = this.qYA;
    if (localb.qXK == -1);
    for (int i = localb.qXI; ; i = localb.qXK)
    {
      localPaint.setColor(i);
      localPaint.setStyle(Paint.Style.FILL);
      localPaint.setAntiAlias(true);
      localPaint.setAlpha(this.qYA.qXL);
      AppMethodBeat.o(36971);
      return localPaint;
    }
  }

  private Paint getPaintLayerPoint()
  {
    AppMethodBeat.i(36973);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYA.qXI);
    localPaint.setStrokeWidth(this.qYA.qXJ);
    AppMethodBeat.o(36973);
    return localPaint;
  }

  public final int cpg()
  {
    return this.qYD * 2;
  }

  public final int cph()
  {
    return this.qYD * 2;
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(36970);
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    this.qYD = ((int)(Math.min(i, j) / 2.0F * 0.8D));
    this.qYE.set((int)(j / 2.0F), (int)(i / 2.0F));
    if (this.qYy == null)
    {
      paramCanvas = new RuntimeException("Error: NullPointerException at data.");
      AppMethodBeat.o(36970);
      throw paramCanvas;
    }
    if (this.qYy != null)
    {
      Object localObject;
      label113: float f1;
      float f2;
      if (this.qYz == null)
      {
        localObject = this.qYy.entrySet();
        Iterator localIterator = ((Set)localObject).iterator();
        i = 0;
        if (!localIterator.hasNext())
          break label327;
        localObject = (Map.Entry)localIterator.next();
        f1 = (float)(this.qYE.x - ((Float)((Map.Entry)localObject).getValue()).floatValue() / this.qYv * this.qYD * Math.sin(6.283185307179586D - i * 2 * 3.141592653589793D / this.qYs));
        f2 = (float)(this.qYE.y - ((Float)((Map.Entry)localObject).getValue()).floatValue() / this.qYv * this.qYD * Math.cos(6.283185307179586D - i * 2 * 3.141592653589793D / this.qYs));
        if (i != 0)
          break label313;
        this.vr.moveTo(f1, f2);
      }
      while (true)
      {
        if (this.qYC)
          paramCanvas.drawCircle(f1, f2, this.qYA.qXN, getPaintLayerDotPoint());
        i++;
        break label113;
        localObject = this.qYz.entrySet();
        break;
        label313: this.vr.lineTo(f1, f2);
      }
      label327: this.vr.close();
      paramCanvas.drawPath(this.vr, getPaintLayerFilling());
      paramCanvas.drawPath(this.vr, getPaintLayerBorder());
      this.vr.reset();
    }
    AppMethodBeat.o(36970);
  }

  public void setData(a parama)
  {
    AppMethodBeat.i(36976);
    this.qYy = parama;
    invalidate();
    AppMethodBeat.o(36976);
  }

  public void setGlobalMax(float paramFloat)
  {
    AppMethodBeat.i(36975);
    this.qYv = paramFloat;
    invalidate();
    AppMethodBeat.o(36975);
  }

  public void setLayerStyle(b paramb)
  {
    AppMethodBeat.i(36977);
    this.qYA = paramb;
    invalidate();
    AppMethodBeat.o(36977);
  }

  public void setMaxValue(float paramFloat)
  {
    AppMethodBeat.i(36978);
    this.qYv = paramFloat;
    invalidate();
    AppMethodBeat.o(36978);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer
 * JD-Core Version:    0.6.2
 */