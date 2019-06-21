package com.tencent.mm.plugin.setting.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.setting.ui.setting.SetTextSizeUI;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class FontSelectorView extends View
{
  private static SoftReference<Bitmap> qqG = null;
  private static int qqP = 8;
  private int bCp;
  private int eCL;
  private float neG;
  private float neH;
  private List<FontSelectorView.b> qqH;
  private int qqI;
  private int qqJ;
  private int qqK;
  private int qqL;
  private int qqM;
  private int qqN;
  private FontSelectorView.a qqO;
  private boolean qqQ;
  private boolean qqR;
  private int topOffset;

  public FontSelectorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(127690);
    this.qqH = new ArrayList(8);
    this.qqI = 0;
    this.topOffset = 0;
    this.bCp = 0;
    this.eCL = 0;
    this.neG = 0.0F;
    this.neH = 0.0F;
    this.qqJ = 0;
    this.qqK = 0;
    this.qqL = 0;
    this.qqM = 0;
    this.qqN = 0;
    this.qqO = null;
    this.qqQ = false;
    this.qqR = false;
    AppMethodBeat.o(127690);
  }

  public FontSelectorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(127691);
    this.qqH = new ArrayList(8);
    this.qqI = 0;
    this.topOffset = 0;
    this.bCp = 0;
    this.eCL = 0;
    this.neG = 0.0F;
    this.neH = 0.0F;
    this.qqJ = 0;
    this.qqK = 0;
    this.qqL = 0;
    this.qqM = 0;
    this.qqN = 0;
    this.qqO = null;
    this.qqQ = false;
    this.qqR = false;
    AppMethodBeat.o(127691);
  }

  private float aU(float paramFloat)
  {
    AppMethodBeat.i(127696);
    paramFloat = TypedValue.applyDimension(1, paramFloat, getResources().getDisplayMetrics());
    AppMethodBeat.o(127696);
    return paramFloat;
  }

  private static int aV(float paramFloat)
  {
    AppMethodBeat.i(127697);
    Paint localPaint = new Paint();
    localPaint.setTextSize(paramFloat);
    localPaint.setAntiAlias(true);
    int i = (int)Math.ceil(localPaint.getFontMetrics().bottom);
    AppMethodBeat.o(127697);
    return i;
  }

  public static void cjr()
  {
    qqP = 8;
  }

  private void cjs()
  {
    AppMethodBeat.i(127693);
    if ((qqG == null) || (qqG.get() == null))
      qqG = new SoftReference(BitmapFactory.decodeResource(getResources(), 2130838832));
    AppMethodBeat.o(127693);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(127694);
    super.onDraw(paramCanvas);
    cjs();
    Object localObject = new Paint();
    ((Paint)localObject).setARGB(255, 152, 152, 152);
    ((Paint)localObject).setStrokeWidth(2.0F);
    int i = getWidth();
    int j = a.fromDPToPix(getContext(), 5);
    paramCanvas.drawLine(this.qqI, this.bCp, i - this.qqI, this.bCp, (Paint)localObject);
    for (i = 0; i < qqP; i++)
      paramCanvas.drawLine(this.qqI + this.eCL * i, this.bCp - j, this.qqI + this.eCL * i, this.bCp + j, (Paint)localObject);
    Bitmap localBitmap = (Bitmap)qqG.get();
    paramCanvas.drawBitmap(localBitmap, this.qqK, this.qqL, null);
    localObject = getResources().getString(2131302992);
    getResources().getString(2131302991);
    getResources().getString(2131302994);
    float f = aU(SetTextSizeUI.aS(0.875F));
    Paint localPaint = new Paint();
    localPaint.setTextSize(f);
    j = (int)localPaint.measureText("A");
    i = aV(f);
    localPaint.setColor(getResources().getColor(2131689761));
    localPaint.setAntiAlias(true);
    paramCanvas.drawText("A", this.qqI - j / 2, this.bCp - i - localBitmap.getHeight() / 3, localPaint);
    f = aU(SetTextSizeUI.aS(1.0F));
    localPaint.setTextSize(f);
    i = (int)localPaint.measureText((String)localObject);
    j = aV(f);
    paramCanvas.drawText((String)localObject, this.qqI + this.eCL * 1 - i / 2, this.bCp - j - localBitmap.getHeight() / 3, localPaint);
    f = aU(SetTextSizeUI.aS(2.025F));
    localPaint.setTextSize(f);
    j = (int)localPaint.measureText("A");
    i = aV(f);
    paramCanvas.drawText("A", this.qqI + this.eCL * (qqP - 1) - j / 2, this.bCp - i - localBitmap.getHeight() / 3, localPaint);
    AppMethodBeat.o(127694);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(127692);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    cjs();
    this.qqH.clear();
    setClickable(true);
    this.qqI = a.fromDPToPix(getContext(), 30);
    this.topOffset = a.fromDPToPix(getContext(), 10);
    paramInt3 = getWidth();
    paramInt2 = getHeight();
    paramInt1 = this.topOffset;
    this.bCp = (paramInt2 / 2 + paramInt1);
    qqP = 8;
    this.eCL = ((paramInt3 - this.qqI * 2) / (qqP - 1));
    Bitmap localBitmap = (Bitmap)qqG.get();
    for (paramInt1 = 0; paramInt1 < qqP; paramInt1++)
    {
      FontSelectorView.b localb = new FontSelectorView.b((byte)0);
      localb.left = (this.qqI + this.eCL * paramInt1 - localBitmap.getWidth() / 2);
      localb.top = (this.bCp - localBitmap.getHeight() / 2);
      localb.right = (this.qqI + this.eCL * paramInt1 + localBitmap.getWidth() / 2);
      localb.bottom = (this.bCp + localBitmap.getHeight() / 2);
      this.qqH.add(localb);
    }
    this.qqJ = this.qqN;
    if (this.qqM >= 0)
      this.qqK = ((FontSelectorView.b)this.qqH.get(this.qqJ)).left;
    while (true)
    {
      this.qqL = ((FontSelectorView.b)this.qqH.get(this.qqJ)).top;
      invalidate();
      AppMethodBeat.o(127692);
      return;
      if (this.qqK <= ((FontSelectorView.b)this.qqH.get(this.qqJ)).right - this.eCL / 2)
        this.qqK = ((FontSelectorView.b)this.qqH.get(this.qqJ)).left;
      else
        this.qqK = ((FontSelectorView.b)this.qqH.get(this.qqJ)).right;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    AppMethodBeat.i(127695);
    boolean bool;
    FontSelectorView.b localb;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
      for (bool = true; ; bool = true)
      {
        AppMethodBeat.o(127695);
        return bool;
        this.neG = paramMotionEvent.getX();
        this.neH = paramMotionEvent.getY();
        localb = (FontSelectorView.b)this.qqH.get(this.qqJ);
        j = i;
        if (this.neG >= localb.left)
        {
          j = i;
          if (this.neG <= localb.right)
          {
            j = i;
            if (this.neH >= localb.top)
            {
              j = i;
              if (this.neH <= localb.bottom)
                j = 1;
            }
          }
        }
        if (j == 0)
          break;
        this.qqQ = true;
      }
      this.qqR = true;
    case 2:
    case 1:
    }
    label418: label567: label618: 
    do
    {
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.qqQ)
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.qqM = ((int)(f1 - this.neG));
        this.qqK += this.qqM;
        this.neG = f1;
        this.neH = f2;
        paramMotionEvent = (FontSelectorView.b)this.qqH.get(0);
        localb = (FontSelectorView.b)this.qqH.get(qqP - 1);
        if (this.qqK <= paramMotionEvent.left)
          this.qqK = paramMotionEvent.left;
        while (true)
        {
          invalidate();
          bool = true;
          break;
          if (this.qqK >= localb.left)
            this.qqK = localb.left;
          else
            for (j = 0; ; j++)
            {
              if (j >= qqP)
                break label418;
              paramMotionEvent = (FontSelectorView.b)this.qqH.get(j);
              if ((this.qqK >= paramMotionEvent.left - 5) && (this.qqK <= paramMotionEvent.right + 5))
              {
                this.qqJ = j;
                this.qqN = this.qqJ;
                if (this.qqO == null)
                  break;
                this.qqO.Cl(this.qqJ);
                break;
              }
            }
        }
      }
      bool = super.onTouchEvent(paramMotionEvent);
      break;
      if (this.qqQ)
        for (j = 0; ; j++)
        {
          if (j < qqP - 1)
          {
            paramMotionEvent = (FontSelectorView.b)this.qqH.get(j);
            localb = (FontSelectorView.b)this.qqH.get(j + 1);
            if ((this.qqK > paramMotionEvent.left + this.eCL / 2) || (this.qqK < paramMotionEvent.left))
              break label567;
            this.qqJ = j;
          }
          for (this.qqK = paramMotionEvent.left; ; this.qqK = localb.left)
          {
            this.qqN = this.qqJ;
            if (this.qqO != null)
              this.qqO.Cl(this.qqJ);
            invalidate();
            this.qqQ = false;
            bool = true;
            break;
            if ((this.qqK < localb.left - this.eCL / 2) || (this.qqK > localb.left))
              break label618;
            this.qqJ = (j + 1);
          }
        }
    }
    while (!this.qqR);
    float f2 = paramMotionEvent.getX();
    float f1 = paramMotionEvent.getY();
    if ((Math.abs(f2 - this.neG) <= 10.0F) && (Math.abs(f1 - this.neH) <= 10.0F));
    for (int j = 0; ; j++)
    {
      if (j < qqP)
      {
        paramMotionEvent = (FontSelectorView.b)this.qqH.get(j);
        if ((f2 < paramMotionEvent.left - 5) || (f2 > paramMotionEvent.right + 5))
          continue;
        this.qqJ = j;
        this.qqN = this.qqJ;
        this.qqK = paramMotionEvent.left;
        if (this.qqO != null)
          this.qqO.Cl(this.qqJ);
      }
      this.qqR = false;
      invalidate();
      bool = true;
      break;
    }
  }

  public void setOnChangeListener(FontSelectorView.a parama)
  {
    this.qqO = parama;
  }

  public void setSliderIndex(int paramInt)
  {
    this.qqN = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.FontSelectorView
 * JD-Core Version:    0.6.2
 */