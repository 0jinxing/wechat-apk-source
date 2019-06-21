package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
  private TypedValue ahf;
  private TypedValue ahg;
  private TypedValue ahh;
  private TypedValue ahi;
  private TypedValue ahj;
  private TypedValue ahk;
  private final Rect ahl = new Rect();
  private a ahm;

  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void g(Rect paramRect)
  {
    fitSystemWindows(paramRect);
  }

  public TypedValue getFixedHeightMajor()
  {
    if (this.ahj == null)
      this.ahj = new TypedValue();
    return this.ahj;
  }

  public TypedValue getFixedHeightMinor()
  {
    if (this.ahk == null)
      this.ahk = new TypedValue();
    return this.ahk;
  }

  public TypedValue getFixedWidthMajor()
  {
    if (this.ahh == null)
      this.ahh = new TypedValue();
    return this.ahh;
  }

  public TypedValue getFixedWidthMinor()
  {
    if (this.ahi == null)
      this.ahi = new TypedValue();
    return this.ahi;
  }

  public TypedValue getMinWidthMajor()
  {
    if (this.ahf == null)
      this.ahf = new TypedValue();
    return this.ahf;
  }

  public TypedValue getMinWidthMinor()
  {
    if (this.ahg == null)
      this.ahg = new TypedValue();
    return this.ahg;
  }

  public final void j(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ahl.set(paramInt1, paramInt2, paramInt3, paramInt4);
    if (s.as(this))
      requestLayout();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.ahm != null)
      this.ahm.onDetachedFromWindow();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    int j;
    int k;
    int m;
    TypedValue localTypedValue;
    label60: int n;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      j = 1;
      k = View.MeasureSpec.getMode(paramInt1);
      m = View.MeasureSpec.getMode(paramInt2);
      if (k != -2147483648)
        break label504;
      if (j == 0)
        break label362;
      localTypedValue = this.ahi;
      if ((localTypedValue == null) || (localTypedValue.type == 0))
        break label504;
      if (localTypedValue.type != 5)
        break label371;
      n = (int)localTypedValue.getDimension(localDisplayMetrics);
    }
    while (true)
    {
      label92: int i1;
      int i2;
      if (n > 0)
      {
        i1 = View.MeasureSpec.makeMeasureSpec(Math.min(n - (this.ahl.left + this.ahl.right), View.MeasureSpec.getSize(paramInt1)), 1073741824);
        i2 = 1;
      }
      while (true)
      {
        n = paramInt2;
        if (m == -2147483648)
        {
          if (j == 0)
            break label404;
          localTypedValue = this.ahj;
          label153: n = paramInt2;
          if (localTypedValue != null)
          {
            n = paramInt2;
            if (localTypedValue.type != 0)
            {
              if (localTypedValue.type != 5)
                break label413;
              paramInt1 = (int)localTypedValue.getDimension(localDisplayMetrics);
            }
          }
        }
        while (true)
        {
          label190: n = paramInt2;
          if (paramInt1 > 0)
            n = View.MeasureSpec.makeMeasureSpec(Math.min(paramInt1 - (this.ahl.top + this.ahl.bottom), View.MeasureSpec.getSize(paramInt2)), 1073741824);
          super.onMeasure(i1, n);
          m = getMeasuredWidth();
          i1 = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
          if ((i2 == 0) && (k == -2147483648))
            if (j != 0)
            {
              localTypedValue = this.ahg;
              label274: if ((localTypedValue == null) || (localTypedValue.type == 0))
                break label486;
              if (localTypedValue.type != 5)
                break label454;
              paramInt1 = (int)localTypedValue.getDimension(localDisplayMetrics);
            }
          while (true)
          {
            label305: paramInt2 = paramInt1;
            if (paramInt1 > 0)
              paramInt2 = paramInt1 - (this.ahl.left + this.ahl.right);
            if (m < paramInt2)
              paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
            for (paramInt1 = 1; ; paramInt1 = i)
            {
              if (paramInt1 != 0)
                super.onMeasure(paramInt2, n);
              return;
              j = 0;
              break;
              label362: localTypedValue = this.ahh;
              break label60;
              label371: if (localTypedValue.type != 6)
                break label513;
              n = (int)localTypedValue.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label92;
              label404: localTypedValue = this.ahk;
              break label153;
              label413: if (localTypedValue.type != 6)
                break label499;
              paramInt1 = (int)localTypedValue.getFraction(localDisplayMetrics.heightPixels, localDisplayMetrics.heightPixels);
              break label190;
              localTypedValue = this.ahf;
              break label274;
              label454: if (localTypedValue.type != 6)
                break label494;
              paramInt1 = (int)localTypedValue.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label305;
              label486: paramInt2 = i1;
            }
            label494: paramInt1 = 0;
          }
          label499: paramInt1 = 0;
        }
        label504: i2 = 0;
        i1 = paramInt1;
      }
      label513: n = 0;
    }
  }

  public void setAttachListener(a parama)
  {
    this.ahm = parama;
  }

  public static abstract interface a
  {
    public abstract void onDetachedFromWindow();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ContentFrameLayout
 * JD-Core Version:    0.6.2
 */