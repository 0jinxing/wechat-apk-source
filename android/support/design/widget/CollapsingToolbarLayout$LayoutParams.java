package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.a.a;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;

public class CollapsingToolbarLayout$LayoutParams extends FrameLayout.LayoutParams
{
  int pi = 0;
  float pj = 0.5F;

  public CollapsingToolbarLayout$LayoutParams()
  {
    super(-1, -1);
  }

  public CollapsingToolbarLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.CollapsingToolbarLayout_Layout);
    this.pi = paramContext.getInt(0, 0);
    this.pj = paramContext.getFloat(1, 0.5F);
    paramContext.recycle();
  }

  public CollapsingToolbarLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CollapsingToolbarLayout.LayoutParams
 * JD-Core Version:    0.6.2
 */