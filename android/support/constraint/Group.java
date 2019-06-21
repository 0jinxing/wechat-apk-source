package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.a.a.f;
import android.util.AttributeSet;
import android.view.View;

public class Group extends ConstraintHelper
{
  public Group(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public Group(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(ConstraintLayout paramConstraintLayout)
  {
    int i = getVisibility();
    if (Build.VERSION.SDK_INT >= 21);
    for (float f = getElevation(); ; f = 0.0F)
    {
      for (int j = 0; j < this.mCount; j++)
      {
        View localView = paramConstraintLayout.q(this.cW[j]);
        if (localView != null)
        {
          localView.setVisibility(i);
          if ((f > 0.0F) && (Build.VERSION.SDK_INT >= 21))
            localView.setElevation(f);
        }
      }
      return;
    }
  }

  public final void aq()
  {
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)getLayoutParams();
    localLayoutParams.eH.setWidth(0);
    localLayoutParams.eH.setHeight(0);
  }

  protected final void b(AttributeSet paramAttributeSet)
  {
    super.b(paramAttributeSet);
    this.cZ = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.constraint.Group
 * JD-Core Version:    0.6.2
 */