package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView;
import java.util.ArrayList;
import java.util.List;

public class RadarGrid extends ChartGridView
{
  public static final Point qYx;
  private Rect mRect;
  private int qYD;
  private Point qYE;
  private Spannable[] qYG;
  private List<PointF> qYH;
  private int qYs;
  private int qYt;
  private float qYv;
  private c qYw;
  private Path vr;

  static
  {
    AppMethodBeat.i(37012);
    qYx = new Point(0, 0);
    AppMethodBeat.o(37012);
  }

  public RadarGrid(Context paramContext, int paramInt1, int paramInt2, float paramFloat, Spannable[] paramArrayOfSpannable, c paramc)
  {
    super(paramContext);
    AppMethodBeat.i(36982);
    this.qYs = 4;
    this.qYt = 4;
    this.qYv = 1.0F;
    this.qYD = 80;
    this.qYE = qYx;
    this.vr = new Path();
    this.mRect = new Rect();
    this.qYv = paramFloat;
    this.qYs = paramInt1;
    this.qYt = paramInt2;
    this.qYv = paramFloat;
    this.qYG = paramArrayOfSpannable;
    this.qYw = paramc;
    AppMethodBeat.o(36982);
  }

  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(36980);
    this.qYs = 4;
    this.qYt = 4;
    this.qYv = 1.0F;
    this.qYD = 80;
    this.qYE = qYx;
    this.vr = new Path();
    this.mRect = new Rect();
    cpj();
    AppMethodBeat.o(36980);
  }

  public RadarGrid(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(36981);
    this.qYs = 4;
    this.qYt = 4;
    this.qYv = 1.0F;
    this.qYD = 80;
    this.qYE = qYx;
    this.vr = new Path();
    this.mRect = new Rect();
    cpj();
    AppMethodBeat.o(36981);
  }

  private List<PointF> aX(float paramFloat)
  {
    AppMethodBeat.i(36984);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.qYs; i++)
    {
      PointF localPointF = new PointF();
      localPointF.set((float)(this.qYE.x - this.qYD * paramFloat * Math.sin(i * 2 * 3.141592653589793D / this.qYs)), (float)(this.qYE.y - this.qYD * paramFloat * Math.cos(i * 2 * 3.141592653589793D / this.qYs)));
      localArrayList.add(localPointF);
    }
    AppMethodBeat.o(36984);
    return localArrayList;
  }

  private void cpj()
  {
    AppMethodBeat.i(36983);
    setMinimumHeight(160);
    setMinimumWidth(160);
    AppMethodBeat.o(36983);
  }

  private int getGridDotRadius()
  {
    return this.qYw.qYh;
  }

  private Paint getPaintGLabelFont()
  {
    AppMethodBeat.i(36991);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYw.qXY);
    localPaint.setTextSize(this.qYw.qXZ);
    AppMethodBeat.o(36991);
    return localPaint;
  }

  private Paint getPaintGScaleFont()
  {
    AppMethodBeat.i(36993);
    Paint localPaint = new Paint();
    c localc = this.qYw;
    if (localc.qYb == -1);
    for (int i = localc.qXY; ; i = localc.qYb)
    {
      localPaint.setColor(i);
      localPaint.setTextSize(this.qYw.qYc);
      AppMethodBeat.o(36993);
      return localPaint;
    }
  }

  private Paint getPaintGridBorder()
  {
    AppMethodBeat.i(36987);
    Paint localPaint = new Paint();
    c localc = this.qYw;
    int i;
    if (localc.qXT == -1)
    {
      i = localc.qXU;
      localPaint.setColor(i);
      localPaint.setStyle(Paint.Style.STROKE);
      localc = this.qYw;
      if (localc.qXX != -1.0F)
        break label90;
    }
    label90: for (float f = localc.qXW; ; f = localc.qXX)
    {
      localPaint.setStrokeWidth(f);
      localPaint.setAntiAlias(true);
      AppMethodBeat.o(36987);
      return localPaint;
      i = localc.qXT;
      break;
    }
  }

  private Paint getPaintGridDot()
  {
    AppMethodBeat.i(36989);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYw.qYg);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setAntiAlias(true);
    AppMethodBeat.o(36989);
    return localPaint;
  }

  private Paint getPaintGridFill()
  {
    AppMethodBeat.i(36986);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYw.backgroundColor);
    localPaint.setAntiAlias(true);
    AppMethodBeat.o(36986);
    return localPaint;
  }

  private Paint getPaintGridLatitude()
  {
    AppMethodBeat.i(36988);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYw.qXU);
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(this.qYw.qXW);
    localPaint.setAntiAlias(true);
    AppMethodBeat.o(36988);
    return localPaint;
  }

  private Paint getPaintGridLongitude()
  {
    AppMethodBeat.i(36990);
    Paint localPaint = new Paint();
    localPaint.setColor(this.qYw.qXV);
    localPaint.setStrokeWidth(this.qYw.qXW);
    AppMethodBeat.o(36990);
    return localPaint;
  }

  private TextPaint getTextPaintGLabelFont()
  {
    AppMethodBeat.i(36992);
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setColor(this.qYw.qXY);
    localTextPaint.setTextSize(this.qYw.qXZ);
    AppMethodBeat.o(36992);
    return localTextPaint;
  }

  public final int cpg()
  {
    return this.qYD * 2;
  }

  public final int cph()
  {
    return this.qYD * 2;
  }

  public c getGridStyle()
  {
    return this.qYw;
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(36985);
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    this.qYD = ((int)(Math.min(i, j) / 2.0F * 0.8D));
    this.qYE.set((int)(j / 2.0F), (int)(i / 2.0F));
    if (this.qYw.qYi != null)
    {
      j = (int)(j / 2.0F);
      int k = (int)(i / 2.0F);
      int m = (int)(this.qYD * 2 + this.qYw.qYf * 2.0F);
      i = this.qYw.qYi.getWidth() * m / this.qYw.qYi.getHeight();
      if (this.qYw.qYi != null)
        paramCanvas.drawBitmap(Bitmap.createScaledBitmap(this.qYw.qYi, i, m, false), j - (i >>> 1), k - (m >>> 1), null);
    }
    if (this.qYw.qXP)
      switch (this.qYw.qXO)
      {
      default:
      case 1:
      case 0:
      }
    Object localObject;
    while (this.qYw.qXQ)
    {
      this.qYH = aX(1.0F);
      for (j = 0; j < this.qYs; j++)
      {
        localObject = (PointF)this.qYH.get(j);
        paramCanvas.drawLine(this.qYE.x, this.qYE.y, ((PointF)localObject).x, ((PointF)localObject).y, getPaintGridLongitude());
      }
      paramCanvas.drawCircle(this.qYE.x, this.qYE.y, this.qYD, getPaintGridFill());
      continue;
      this.qYH = aX(1.0F);
      j = 0;
      if (j < this.qYs)
      {
        localObject = (PointF)this.qYH.get(j);
        if (j == 0)
          this.vr.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
        while (true)
        {
          j++;
          break;
          this.vr.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
        }
      }
      this.vr.close();
      if ((this.qYw.backgroundColor != 0) && (this.qYw.qYi == null))
        paramCanvas.drawPath(this.vr, getPaintGridFill());
    }
    if (this.qYw.qXP)
      switch (this.qYw.qXO)
      {
      default:
      case 1:
      case 0:
      }
    float f1;
    label836: float f2;
    while (true)
      if ((this.qYG != null) && (this.qYw.qXS))
        if (this.qYG.length != this.qYs)
        {
          paramCanvas = new RuntimeException("Labels array length not matches longitude lines number.");
          AppMethodBeat.o(36985);
          throw paramCanvas;
          paramCanvas.drawCircle(this.qYE.x, this.qYE.y, this.qYD, getPaintGridBorder());
          for (j = 1; j < this.qYt; j++)
            paramCanvas.drawCircle(this.qYE.x, this.qYE.y, this.qYD * (j * 1.0F / this.qYt), getPaintGridLatitude());
          paramCanvas.drawPath(this.vr, getPaintGridBorder());
          this.vr.reset();
          for (j = 1; j < this.qYt; j++)
          {
            this.qYH = aX(j * 1.0F / this.qYt);
            i = 0;
            if (i < this.qYs)
            {
              localObject = (PointF)this.qYH.get(i);
              if (i == 0)
                this.vr.moveTo(((PointF)localObject).x, ((PointF)localObject).y);
              while (true)
              {
                paramCanvas.drawCircle(((PointF)localObject).x, ((PointF)localObject).y, getGridDotRadius(), getPaintGridDot());
                i++;
                break;
                this.vr.lineTo(((PointF)localObject).x, ((PointF)localObject).y);
              }
            }
            this.vr.close();
            paramCanvas.drawPath(this.vr, getPaintGridLatitude());
            this.vr.reset();
          }
        }
        else
        {
          j = 0;
          if (j < this.qYs)
          {
            localObject = this.qYG[j];
            if (!localObject.equals(null))
            {
              if ((j != 0) && (j != this.qYs >>> 1))
                break label1021;
              f1 = 0.5F;
              if (j != 0)
                break label1047;
              f2 = this.qYw.qYa;
            }
          }
        }
    while (true)
    {
      localObject = new StaticLayout((CharSequence)localObject, getTextPaintGLabelFont(), 1000, Layout.Alignment.ALIGN_NORMAL, 0.0F, 0.0F, false);
      f1 = (float)(this.qYE.x - ((StaticLayout)localObject).getLineWidth(0) * f1 - (this.qYD + this.qYw.qYa) * Math.sin(6.283185307179586D - j * 2 * 3.141592653589793D / this.qYs));
      f2 = (float)(this.qYE.y - ((StaticLayout)localObject).getHeight() / 2 - (this.qYD + this.qYw.qYa) * Math.cos(6.283185307179586D - j * 2 * 3.141592653589793D / this.qYs) - f2);
      paramCanvas.save();
      paramCanvas.translate(f1, f2);
      ((StaticLayout)localObject).draw(paramCanvas);
      paramCanvas.restore();
      j++;
      break;
      label1021: if ((j > 0) && (j < this.qYs >>> 1))
      {
        f1 = 0.0F;
        break label836;
      }
      f1 = 1.0F;
      break label836;
      label1047: if (j == this.qYs >>> 1)
      {
        f2 = -this.qYw.qYa;
        continue;
        AppMethodBeat.o(36985);
      }
      else
      {
        f2 = 0.0F;
      }
    }
  }

  public void setBackgroundColor(int paramInt)
  {
    AppMethodBeat.i(37000);
    this.qYw.backgroundColor = paramInt;
    invalidate();
    AppMethodBeat.o(37000);
  }

  public void setGridBorderColor(int paramInt)
  {
    AppMethodBeat.i(37001);
    this.qYw.qXT = paramInt;
    invalidate();
    AppMethodBeat.o(37001);
  }

  public void setGridBorderStrokeWidth(float paramFloat)
  {
    AppMethodBeat.i(37005);
    this.qYw.qXX = paramFloat;
    invalidate();
    AppMethodBeat.o(37005);
  }

  public void setGridChartType(int paramInt)
  {
    AppMethodBeat.i(36994);
    this.qYw.qXO = paramInt;
    invalidate();
    AppMethodBeat.o(36994);
  }

  public void setGridLabelColor(int paramInt)
  {
    AppMethodBeat.i(37006);
    this.qYw.qXY = paramInt;
    invalidate();
    AppMethodBeat.o(37006);
  }

  public void setGridLabelPadding(float paramFloat)
  {
    AppMethodBeat.i(37008);
    this.qYw.qYa = paramFloat;
    invalidate();
    AppMethodBeat.o(37008);
  }

  public void setGridLabelSize(float paramFloat)
  {
    AppMethodBeat.i(37007);
    this.qYw.qXZ = paramFloat;
    invalidate();
    AppMethodBeat.o(37007);
  }

  public void setGridLatitudeColor(int paramInt)
  {
    AppMethodBeat.i(37002);
    this.qYw.qXU = paramInt;
    invalidate();
    AppMethodBeat.o(37002);
  }

  public void setGridLongitudeColor(int paramInt)
  {
    AppMethodBeat.i(37003);
    this.qYw.qXV = paramInt;
    invalidate();
    AppMethodBeat.o(37003);
  }

  public void setGridScaleColor(int paramInt)
  {
    AppMethodBeat.i(37009);
    this.qYw.qYb = paramInt;
    invalidate();
    AppMethodBeat.o(37009);
  }

  public void setGridScaleLabelPadding(float paramFloat)
  {
    AppMethodBeat.i(37011);
    this.qYw.qYd = paramFloat;
    invalidate();
    AppMethodBeat.o(37011);
  }

  public void setGridScaleSize(float paramFloat)
  {
    AppMethodBeat.i(37010);
    this.qYw.qYc = paramFloat;
    invalidate();
    AppMethodBeat.o(37010);
  }

  public void setGridStrokeWidth(float paramFloat)
  {
    AppMethodBeat.i(37004);
    this.qYw.qXW = paramFloat;
    invalidate();
    AppMethodBeat.o(37004);
  }

  public void setGridStyle(c paramc)
  {
    AppMethodBeat.i(36999);
    this.qYw = paramc;
    invalidate();
    AppMethodBeat.o(36999);
  }

  public void setLabelsArray(Spannable[] paramArrayOfSpannable)
  {
    AppMethodBeat.i(36998);
    this.qYG = paramArrayOfSpannable;
    invalidate();
    AppMethodBeat.o(36998);
  }

  public void setLatNum(int paramInt)
  {
    AppMethodBeat.i(36996);
    this.qYt = paramInt;
    invalidate();
    AppMethodBeat.o(36996);
  }

  public void setLonNum(int paramInt)
  {
    AppMethodBeat.i(36995);
    this.qYs = paramInt;
    invalidate();
    AppMethodBeat.o(36995);
  }

  public void setMaxValue(float paramFloat)
  {
    AppMethodBeat.i(36997);
    this.qYv = paramFloat;
    invalidate();
    AppMethodBeat.o(36997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid
 * JD-Core Version:    0.6.2
 */