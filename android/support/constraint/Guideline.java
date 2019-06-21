package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View
{
  public Guideline(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }

  public Guideline(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }

  public Guideline(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }

  public void draw(Canvas paramCanvas)
  {
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }

  public void setGuidelineBegin(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.dw = paramInt;
    setLayoutParams(localLayoutParams);
  }

  public void setGuidelineEnd(int paramInt)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.dz = paramInt;
    setLayoutParams(localLayoutParams);
  }

  public void setGuidelinePercent(float paramFloat)
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.dA = paramFloat;
    setLayoutParams(localLayoutParams);
  }

  public void setVisibility(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.constraint.Guideline
 * JD-Core Version:    0.6.2
 */