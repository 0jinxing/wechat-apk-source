package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.b.a.a;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView extends FrameLayout
{
  private static final int[] agN = { 16842801 };
  private static final u agO;
  private boolean agP;
  int agQ;
  int agR;
  final Rect agS = new Rect();
  final Rect agT = new Rect();
  private final t agU = new CardView.1(this);
  private boolean qh;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
      agO = new r();
    while (true)
    {
      agO.hT();
      return;
      if (Build.VERSION.SDK_INT >= 17)
        agO = new q();
      else
        agO = new s();
    }
  }

  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771975);
  }

  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.CardView, paramInt, 2131493011);
    if (localTypedArray.hasValue(2))
    {
      paramAttributeSet = localTypedArray.getColorStateList(2);
      float f1 = localTypedArray.getDimension(3, 0.0F);
      float f2 = localTypedArray.getDimension(4, 0.0F);
      float f3 = localTypedArray.getDimension(5, 0.0F);
      this.qh = localTypedArray.getBoolean(6, false);
      this.agP = localTypedArray.getBoolean(7, true);
      paramInt = localTypedArray.getDimensionPixelSize(8, 0);
      this.agS.left = localTypedArray.getDimensionPixelSize(9, paramInt);
      this.agS.top = localTypedArray.getDimensionPixelSize(11, paramInt);
      this.agS.right = localTypedArray.getDimensionPixelSize(10, paramInt);
      this.agS.bottom = localTypedArray.getDimensionPixelSize(12, paramInt);
      float f4 = f3;
      if (f2 > f3)
        f4 = f2;
      this.agQ = localTypedArray.getDimensionPixelSize(0, 0);
      this.agR = localTypedArray.getDimensionPixelSize(1, 0);
      localTypedArray.recycle();
      agO.a(this.agU, paramContext, paramAttributeSet, f1, f2, f4);
      return;
    }
    paramAttributeSet = getContext().obtainStyledAttributes(agN);
    paramInt = paramAttributeSet.getColor(0, 0);
    paramAttributeSet.recycle();
    paramAttributeSet = new float[3];
    Color.colorToHSV(paramInt, paramAttributeSet);
    if (paramAttributeSet[2] > 0.5F);
    for (paramInt = getResources().getColor(2131689856); ; paramInt = getResources().getColor(2131689855))
    {
      paramAttributeSet = ColorStateList.valueOf(paramInt);
      break;
    }
  }

  public ColorStateList getCardBackgroundColor()
  {
    return agO.i(this.agU);
  }

  public float getCardElevation()
  {
    return agO.e(this.agU);
  }

  public int getContentPaddingBottom()
  {
    return this.agS.bottom;
  }

  public int getContentPaddingLeft()
  {
    return this.agS.left;
  }

  public int getContentPaddingRight()
  {
    return this.agS.right;
  }

  public int getContentPaddingTop()
  {
    return this.agS.top;
  }

  public float getMaxCardElevation()
  {
    return agO.a(this.agU);
  }

  public boolean getPreventCornerOverlap()
  {
    return this.agP;
  }

  public float getRadius()
  {
    return agO.d(this.agU);
  }

  public boolean getUseCompatPadding()
  {
    return this.qh;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i;
    if (!(agO instanceof r))
    {
      i = View.MeasureSpec.getMode(paramInt1);
      switch (i)
      {
      default:
        i = View.MeasureSpec.getMode(paramInt2);
        switch (i)
        {
        default:
          label72: super.onMeasure(paramInt1, paramInt2);
        case 1073741824:
        case -2147483648:
        }
        break;
      case 1073741824:
      case -2147483648:
      }
    }
    while (true)
    {
      return;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(agO.b(this.agU)), View.MeasureSpec.getSize(paramInt1)), i);
      break;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(agO.c(this.agU)), View.MeasureSpec.getSize(paramInt2)), i);
      break label72;
      super.onMeasure(paramInt1, paramInt2);
    }
  }

  public void setCardBackgroundColor(int paramInt)
  {
    agO.a(this.agU, ColorStateList.valueOf(paramInt));
  }

  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    agO.a(this.agU, paramColorStateList);
  }

  public void setCardElevation(float paramFloat)
  {
    agO.c(this.agU, paramFloat);
  }

  public void setMaxCardElevation(float paramFloat)
  {
    agO.b(this.agU, paramFloat);
  }

  public void setMinimumHeight(int paramInt)
  {
    this.agR = paramInt;
    super.setMinimumHeight(paramInt);
  }

  public void setMinimumWidth(int paramInt)
  {
    this.agQ = paramInt;
    super.setMinimumWidth(paramInt);
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean != this.agP)
    {
      this.agP = paramBoolean;
      agO.h(this.agU);
    }
  }

  public void setRadius(float paramFloat)
  {
    agO.a(this.agU, paramFloat);
  }

  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.qh != paramBoolean)
    {
      this.qh = paramBoolean;
      agO.g(this.agU);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.CardView
 * JD-Core Version:    0.6.2
 */