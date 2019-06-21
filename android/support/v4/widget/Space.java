package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@Deprecated
public class Space extends View
{
  @Deprecated
  public Space(Context paramContext)
  {
    this(paramContext, null);
  }

  @Deprecated
  public Space(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  @Deprecated
  public Space(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (getVisibility() == 0)
      setVisibility(4);
  }

  private static int B(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    paramInt2 = paramInt1;
    switch (i)
    {
    default:
      paramInt2 = paramInt1;
    case 0:
    case -2147483648:
    case 1073741824:
    }
    while (true)
    {
      return paramInt2;
      paramInt2 = Math.min(paramInt1, j);
      continue;
      paramInt2 = j;
    }
  }

  @Deprecated
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas)
  {
  }

  @Deprecated
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(B(getSuggestedMinimumWidth(), paramInt1), B(getSuggestedMinimumHeight(), paramInt2));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.Space
 * JD-Core Version:    0.6.2
 */