package android.support.constraint;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.a.a.b;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper
{
  private int cT;
  private int cU;
  private b cV;

  public Barrier(Context paramContext)
  {
    super(paramContext);
    super.setVisibility(8);
  }

  public Barrier(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }

  public Barrier(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }

  protected final void b(AttributeSet paramAttributeSet)
  {
    super.b(paramAttributeSet);
    this.cV = new b();
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, b.a.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      int j = 0;
      if (j < i)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == 6)
          setType(paramAttributeSet.getInt(k, 0));
        while (true)
        {
          j++;
          break;
          if (k == 5)
            this.cV.he = paramAttributeSet.getBoolean(k, true);
        }
      }
    }
    this.cY = this.cV;
    ap();
  }

  public int getType()
  {
    return this.cT;
  }

  public void setAllowsGoneWidget(boolean paramBoolean)
  {
    this.cV.he = paramBoolean;
  }

  public void setType(int paramInt)
  {
    this.cT = paramInt;
    this.cU = paramInt;
    if (Build.VERSION.SDK_INT < 17)
      if (this.cT == 5)
        this.cU = 0;
    while (true)
    {
      this.cV.hc = this.cU;
      return;
      if (this.cT == 6)
      {
        this.cU = 1;
        continue;
        if (1 == getResources().getConfiguration().getLayoutDirection())
          paramInt = 1;
        while (true)
          if (paramInt != 0)
          {
            if (this.cT == 5)
            {
              this.cU = 1;
              break;
              paramInt = 0;
              continue;
            }
            if (this.cT != 6)
              break;
            this.cU = 0;
            break;
          }
        if (this.cT == 5)
          this.cU = 0;
        else if (this.cT == 6)
          this.cU = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.constraint.Barrier
 * JD-Core Version:    0.6.2
 */