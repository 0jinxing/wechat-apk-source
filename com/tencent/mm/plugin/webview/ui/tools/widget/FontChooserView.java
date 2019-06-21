package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class FontChooserView extends View
{
  private static SoftReference<Bitmap> qqG = null;
  private int bCp;
  private int eCL;
  private float neG;
  private float neH;
  private List<FontChooserView.b> qqH;
  private int qqI;
  private int qqJ;
  private int qqK;
  private int qqL;
  private int qqN;
  private boolean qqQ;
  private boolean qqR;
  private int topOffset;
  private FontChooserView.a uJf;

  public FontChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(9896);
    this.qqH = new ArrayList(4);
    this.qqI = 0;
    this.topOffset = 0;
    this.bCp = 0;
    this.eCL = 0;
    this.neG = 0.0F;
    this.neH = 0.0F;
    this.qqJ = 0;
    this.qqK = 0;
    this.qqL = 0;
    this.qqN = 0;
    this.uJf = null;
    this.qqQ = false;
    this.qqR = false;
    AppMethodBeat.o(9896);
  }

  public FontChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(9897);
    this.qqH = new ArrayList(4);
    this.qqI = 0;
    this.topOffset = 0;
    this.bCp = 0;
    this.eCL = 0;
    this.neG = 0.0F;
    this.neH = 0.0F;
    this.qqJ = 0;
    this.qqK = 0;
    this.qqL = 0;
    this.qqN = 0;
    this.uJf = null;
    this.qqQ = false;
    this.qqR = false;
    AppMethodBeat.o(9897);
  }

  private static int JS(int paramInt)
  {
    AppMethodBeat.i(9902);
    Paint localPaint = new Paint();
    localPaint.setTextSize(paramInt);
    localPaint.setAntiAlias(true);
    paramInt = (int)Math.ceil(localPaint.getFontMetrics().bottom);
    AppMethodBeat.o(9902);
    return paramInt;
  }

  private void cjs()
  {
    AppMethodBeat.i(9899);
    if ((qqG == null) || (qqG.get() == null))
      qqG = new SoftReference(BitmapFactory.decodeResource(getResources(), 2130838832));
    AppMethodBeat.o(9899);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(9900);
    super.onDraw(paramCanvas);
    cjs();
    Object localObject = new Paint();
    ((Paint)localObject).setARGB(255, 152, 152, 152);
    ((Paint)localObject).setStrokeWidth(2.0F);
    int i = getWidth();
    int j = a.fromDPToPix(getContext(), 5);
    paramCanvas.drawLine(this.qqI, this.bCp, i - this.qqI, this.bCp, (Paint)localObject);
    for (i = 0; i < 4; i++)
      paramCanvas.drawLine(this.qqI + this.eCL * i, this.bCp - j, this.qqI + this.eCL * i, this.bCp + j, (Paint)localObject);
    localObject = (Bitmap)qqG.get();
    if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      paramCanvas.drawBitmap((Bitmap)localObject, this.qqK, this.qqL, null);
    for (i = ((Bitmap)localObject).getHeight(); ; i = getResources().getDrawable(2130838832).getIntrinsicHeight())
    {
      String str1 = getResources().getString(2131305550);
      String str2 = getResources().getString(2131305551);
      String str3 = getResources().getString(2131305548);
      String str4 = getResources().getString(2131305549);
      int k = getResources().getDimensionPixelSize(2131428410);
      localObject = new Paint();
      ((Paint)localObject).setTextSize(k);
      j = (int)((Paint)localObject).measureText(str1);
      k = JS(k);
      ((Paint)localObject).setColor(getResources().getColor(2131690671));
      ((Paint)localObject).setAntiAlias(true);
      paramCanvas.drawText(str1, this.qqI - j / 2, this.bCp - k - i / 3, (Paint)localObject);
      k = getResources().getDimensionPixelSize(2131428411);
      ((Paint)localObject).setTextSize(k);
      j = (int)((Paint)localObject).measureText(str2);
      k = JS(k);
      paramCanvas.drawText(str2, this.qqI + this.eCL * 1 - j / 2, this.bCp - k - i / 3, (Paint)localObject);
      k = getResources().getDimensionPixelSize(2131428408);
      ((Paint)localObject).setTextSize(k);
      j = (int)((Paint)localObject).measureText(str3);
      k = JS(k);
      paramCanvas.drawText(str3, this.qqI + this.eCL * 2 - j / 2, this.bCp - k - i / 3, (Paint)localObject);
      k = getResources().getDimensionPixelSize(2131428409);
      ((Paint)localObject).setTextSize(k);
      j = (int)((Paint)localObject).measureText(str4);
      k = JS(k);
      paramCanvas.drawText(str4, this.qqI + this.eCL * 3 - j / 2, this.bCp - k - i / 3, (Paint)localObject);
      AppMethodBeat.o(9900);
      return;
    }
  }

  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(9898);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    cjs();
    this.qqH.clear();
    setClickable(true);
    this.qqI = a.fromDPToPix(getContext(), 50);
    this.topOffset = a.fromDPToPix(getContext(), 10);
    paramInt1 = getWidth();
    paramInt3 = getHeight();
    paramInt2 = this.topOffset;
    this.bCp = (paramInt3 / 2 + paramInt2);
    this.eCL = ((paramInt1 - this.qqI * 2) / 3);
    Object localObject = (Bitmap)qqG.get();
    if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      paramInt2 = ((Bitmap)localObject).getHeight();
    for (paramInt1 = ((Bitmap)localObject).getWidth(); ; paramInt1 = ((Drawable)localObject).getIntrinsicWidth())
    {
      for (paramInt3 = 0; paramInt3 < 4; paramInt3++)
      {
        localObject = new FontChooserView.b((byte)0);
        ((FontChooserView.b)localObject).left = (this.qqI + this.eCL * paramInt3 - paramInt1 / 2);
        ((FontChooserView.b)localObject).top = (this.bCp - paramInt2 / 2);
        ((FontChooserView.b)localObject).right = (this.qqI + this.eCL * paramInt3 + paramInt1 / 2);
        ((FontChooserView.b)localObject).bottom = (this.bCp + paramInt2 / 2);
        this.qqH.add(localObject);
      }
      localObject = getResources().getDrawable(2130838832);
      paramInt2 = ((Drawable)localObject).getIntrinsicHeight();
    }
    this.qqJ = this.qqN;
    this.qqK = ((FontChooserView.b)this.qqH.get(this.qqJ)).left;
    this.qqL = ((FontChooserView.b)this.qqH.get(this.qqJ)).top;
    invalidate();
    AppMethodBeat.o(9898);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(9901);
    boolean bool;
    FontChooserView.b localb;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
      for (bool = true; ; bool = true)
      {
        AppMethodBeat.o(9901);
        return bool;
        this.neG = paramMotionEvent.getX();
        this.neH = paramMotionEvent.getY();
        localb = (FontChooserView.b)this.qqH.get(this.qqJ);
        i = j;
        if (this.neG >= localb.left)
        {
          i = j;
          if (this.neG <= localb.right)
          {
            i = j;
            if (this.neH >= localb.top)
            {
              i = j;
              if (this.neH <= localb.bottom)
                i = 1;
            }
          }
        }
        if (i == 0)
          break;
        this.qqQ = true;
      }
      this.qqR = true;
    case 2:
    case 1:
    }
    label279: label539: label586: 
    do
    {
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.qqQ)
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.qqK += (int)(f1 - this.neG);
        this.neG = f1;
        this.neH = f2;
        localb = (FontChooserView.b)this.qqH.get(0);
        paramMotionEvent = (FontChooserView.b)this.qqH.get(3);
        if (this.qqK <= localb.left)
          this.qqK = localb.left;
        while (true)
        {
          invalidate();
          bool = true;
          break;
          if (this.qqK >= paramMotionEvent.left)
          {
            this.qqK = paramMotionEvent.left;
            continue;
            i++;
          }
          else if (i < 4)
          {
            paramMotionEvent = (FontChooserView.b)this.qqH.get(i);
            if ((this.qqK < paramMotionEvent.left - 5) || (this.qqK > paramMotionEvent.right + 5))
              break label279;
            this.qqJ = i;
            this.qqN = this.qqJ;
            if (this.uJf != null)
              this.uJf.Cl(this.qqJ);
          }
        }
      }
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.qqQ)
        for (i = 0; ; i++)
        {
          if (i < 3)
          {
            localb = (FontChooserView.b)this.qqH.get(i);
            paramMotionEvent = (FontChooserView.b)this.qqH.get(i + 1);
            if ((this.qqK > localb.left + this.eCL / 2) || (this.qqK < localb.left))
              break label539;
            this.qqJ = i;
          }
          for (this.qqK = localb.left; ; this.qqK = paramMotionEvent.left)
          {
            this.qqN = this.qqJ;
            if (this.uJf != null)
              this.uJf.Cl(this.qqJ);
            invalidate();
            this.qqQ = false;
            bool = true;
            break;
            if ((this.qqK < paramMotionEvent.left - this.eCL / 2) || (this.qqK > paramMotionEvent.left))
              break label586;
            this.qqJ = (i + 1);
          }
        }
    }
    while (!this.qqR);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if ((Math.abs(f1 - this.neG) <= 10.0F) && (Math.abs(f2 - this.neH) <= 10.0F));
    for (i = 0; ; i++)
    {
      if (i < 4)
      {
        paramMotionEvent = (FontChooserView.b)this.qqH.get(i);
        if ((f1 < paramMotionEvent.left - 5) || (f1 > paramMotionEvent.right + 5))
          continue;
        this.qqJ = i;
        this.qqN = this.qqJ;
        this.qqK = paramMotionEvent.left;
        if (this.uJf != null)
          this.uJf.Cl(this.qqJ);
      }
      this.qqR = false;
      invalidate();
      bool = true;
      break;
    }
  }

  public void setOnChangeListener(FontChooserView.a parama)
  {
    this.uJf = parama;
  }

  public void setSliderIndex(int paramInt)
  {
    this.qqN = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView
 * JD-Core Version:    0.6.2
 */