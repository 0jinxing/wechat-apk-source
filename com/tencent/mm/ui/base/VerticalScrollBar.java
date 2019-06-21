package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.aj;

public abstract class VerticalScrollBar extends View
{
  private Paint aFY;
  private int backgroundColor;
  private int biG;
  private float eOg;
  private float faL;
  View hVf;
  private int ieu;
  private Context mContext;
  protected float nBQ;
  protected int nBR;
  protected String[] nBS;
  private float nBT = 0.0F;
  private o nBU;
  private TextView nBV;
  private int nBW;
  private int textColor;
  private boolean yAT = false;
  public VerticalScrollBar.a yAU;
  private int yAV;
  private int yAW;
  private int yAX;

  public VerticalScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Ky();
    this.mContext = paramContext;
    setFocusable(true);
    setFocusableInTouchMode(true);
    this.nBW = BackwardSupportUtil.b.b(paramContext, 3.0F);
    this.hVf = inflate(paramContext, getToastLayoutId(), null);
    this.yAX = BackwardSupportUtil.b.b(paramContext, this.nBR);
    this.ieu = this.mContext.getResources().getDisplayMetrics().widthPixels;
    this.nBU = new o(this.hVf, this.yAX, this.yAX);
    this.nBV = ((TextView)this.hVf.findViewById(2131827560));
    this.textColor = paramContext.getResources().getColor(2131690316);
    this.yAV = this.mContext.getResources().getColor(2131690693);
    this.backgroundColor = paramContext.getResources().getColor(2131690683);
    this.yAW = aj.fromDPToPix(getContext(), 7);
    this.aFY = new Paint();
    this.aFY.setAntiAlias(true);
  }

  protected abstract void Ky();

  protected abstract int getToastLayoutId();

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getMeasuredHeight();
    int j = getMeasuredWidth();
    float f1 = i / (this.nBS.length * this.nBQ);
    float f2 = aj.fromDPToPix(getContext(), 9);
    this.eOg = aj.fromDPToPix(getContext(), 11);
    if (this.eOg > f1)
    {
      this.eOg = f1;
      if (this.eOg >= f2)
        break label327;
      f1 = f2;
      label87: this.eOg = f1;
      this.aFY.setTextSize(this.eOg);
      if (this.nBT != this.eOg)
      {
        this.nBT = this.eOg;
        post(new VerticalScrollBar.1(this, i, j));
      }
      if ((this.yAT) && (this.biG != 0))
      {
        this.aFY.setStyle(Paint.Style.FILL);
        this.aFY.setColor(this.backgroundColor);
        paramCanvas.drawCircle(j / 2.0F, this.eOg / 2.0F + this.biG * this.eOg * this.nBQ + aj.fromDPToPix(this.mContext, 1), this.yAW, this.aFY);
      }
      this.aFY.setTextAlign(Paint.Align.CENTER);
      i = 0;
      label235: if (i >= this.nBS.length)
        return;
      if ((!this.yAT) || (this.biG == 0) || (this.biG != i))
        break label336;
      this.aFY.setColor(this.yAV);
    }
    while (true)
    {
      paramCanvas.drawText(this.nBS[i], j / 2.0F, this.eOg + i * this.eOg * this.nBQ, this.aFY);
      i++;
      break label235;
      f1 = this.eOg;
      break;
      label327: f1 = this.eOg;
      break label87;
      label336: this.aFY.setColor(this.textColor);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 2))
    {
      this.yAT = true;
      this.faL = paramMotionEvent.getY();
      if (this.faL < 0.0F)
        this.faL = 0.0F;
      if (this.faL > getMeasuredHeight())
        this.faL = getMeasuredHeight();
      int i = (int)(this.faL / (this.eOg * this.nBQ));
      int j = i;
      if (i >= this.nBS.length)
        j = this.nBS.length - 1;
      this.biG = j;
      if (this.biG != -1)
        break label292;
      this.nBV.setText(2131302792);
      i = this.ieu - aj.fromDPToPix(getContext(), 120);
      j = (int)(this.eOg / 2.0F + this.biG * this.eOg * this.nBQ - this.yAX / 2.0D + (paramMotionEvent.getRawY() - paramMotionEvent.getY()));
      if (paramMotionEvent.getAction() == 0)
        this.nBU.showAtLocation(this, 0, i, j);
      if (paramMotionEvent.getAction() == 2)
        this.nBU.update(i, j, this.yAX, this.yAX);
      if (this.yAU != null)
      {
        if (this.biG != -1)
          break label311;
        this.yAU.kp(a.an(getContext(), 2131302792));
      }
    }
    while (true)
    {
      invalidate();
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
      {
        this.nBU.dismiss();
        this.yAT = false;
      }
      return true;
      label292: this.nBV.setText(this.nBS[this.biG]);
      break;
      label311: this.yAU.kp(this.nBS[this.biG]);
    }
  }

  public void setOnScrollBarTouchListener(VerticalScrollBar.a parama)
  {
    this.yAU = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VerticalScrollBar
 * JD-Core Version:    0.6.2
 */