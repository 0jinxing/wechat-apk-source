package android.support.v4.widget;

import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

final class d$a
{
  int HD;
  final RectF Pi = new RectF();
  final Paint Pj = new Paint();
  final Paint Pk = new Paint();
  float Pl = 0.0F;
  float Pm = 0.0F;
  int[] Pn;
  int Po;
  float Pp;
  float Pq;
  float Pr;
  boolean Ps;
  Path Pt;
  float Pu = 1.0F;
  float Pv;
  int Pw;
  int Px;
  int mAlpha = 255;
  final Paint mPaint = new Paint();
  float nR = 0.0F;
  float uW = 5.0F;

  d$a()
  {
    this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
    this.mPaint.setAntiAlias(true);
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.Pj.setStyle(Paint.Style.FILL);
    this.Pj.setAntiAlias(true);
    this.Pk.setColor(0);
  }

  final void I(boolean paramBoolean)
  {
    if (this.Ps != paramBoolean)
      this.Ps = paramBoolean;
  }

  final void aR(int paramInt)
  {
    this.Po = paramInt;
    this.HD = this.Pn[this.Po];
  }

  final int eA()
  {
    return this.Pn[this.Po];
  }

  final void eB()
  {
    this.Pp = this.Pl;
    this.Pq = this.Pm;
    this.Pr = this.nR;
  }

  final void eC()
  {
    this.Pp = 0.0F;
    this.Pq = 0.0F;
    this.Pr = 0.0F;
    this.Pl = 0.0F;
    this.Pm = 0.0F;
    this.nR = 0.0F;
  }

  final int ez()
  {
    return (this.Po + 1) % this.Pn.length;
  }

  final void setColors(int[] paramArrayOfInt)
  {
    this.Pn = paramArrayOfInt;
    aR(0);
  }

  final void setStrokeWidth(float paramFloat)
  {
    this.uW = paramFloat;
    this.mPaint.setStrokeWidth(paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d.a
 * JD-Core Version:    0.6.2
 */