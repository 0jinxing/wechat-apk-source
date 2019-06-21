package android.support.constraint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.HashMap;

public class Constraints extends ViewGroup
{
  a fp;

  public Constraints(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }

  public Constraints(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new ConstraintLayout.LayoutParams(paramLayoutParams);
  }

  public a getConstraintSet()
  {
    if (this.fp == null)
      this.fp = new a();
    a locala = this.fp;
    int i = getChildCount();
    locala.eL.clear();
    for (int j = 0; j < i; j++)
    {
      Object localObject = getChildAt(j);
      Constraints.LayoutParams localLayoutParams = (Constraints.LayoutParams)((View)localObject).getLayoutParams();
      int k = ((View)localObject).getId();
      if (k == -1)
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      if (!locala.eL.containsKey(Integer.valueOf(k)))
        locala.eL.put(Integer.valueOf(k), new a.a((byte)0));
      a.a locala1 = (a.a)locala.eL.get(Integer.valueOf(k));
      if ((localObject instanceof ConstraintHelper))
      {
        localObject = (ConstraintHelper)localObject;
        locala1.a(k, localLayoutParams);
        if ((localObject instanceof Barrier))
        {
          locala1.fl = 1;
          localObject = (Barrier)localObject;
          locala1.fk = ((Barrier)localObject).getType();
          locala1.fn = ((Barrier)localObject).getReferencedIds();
        }
      }
      locala1.a(k, localLayoutParams);
    }
    return this.fp;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.constraint.Constraints
 * JD-Core Version:    0.6.2
 */