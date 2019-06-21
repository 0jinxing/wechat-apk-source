package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.a.a.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.reflect.Field;
import java.util.Arrays;

public abstract class ConstraintHelper extends View
{
  protected int[] cW = new int[32];
  protected Context cX;
  protected j cY;
  protected boolean cZ = false;
  private String da;
  protected int mCount;

  public ConstraintHelper(Context paramContext)
  {
    super(paramContext);
    this.cX = paramContext;
    b(null);
  }

  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cX = paramContext;
    b(paramAttributeSet);
  }

  public ConstraintHelper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.cX = paramContext;
    b(paramAttributeSet);
  }

  private void A(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      if (this.cX == null)
        continue;
      paramString = paramString.trim();
      int i = 0;
      try
      {
        int j = R.id.class.getField(paramString).getInt(null);
        i = j;
        j = i;
        if (i == 0)
          j = this.cX.getResources().getIdentifier(paramString, "id", this.cX.getPackageName());
        if ((j == 0) && (isInEditMode()) && ((getParent() instanceof ConstraintLayout)))
        {
          Object localObject = ((ConstraintLayout)getParent()).f(paramString);
          if ((localObject != null) && ((localObject instanceof Integer)))
          {
            j = ((Integer)localObject).intValue();
            if (j != 0)
            {
              setTag(j, null);
              continue;
            }
            new StringBuilder("Could not find id of \"").append(paramString).append("\"");
          }
        }
      }
      catch (Exception localException)
      {
        while (true);
      }
    }
  }

  private void setIds(String paramString)
  {
    if (paramString == null)
      return;
    int j;
    for (int i = 0; ; i = j + 1)
    {
      j = paramString.indexOf(',', i);
      if (j == -1)
      {
        A(paramString.substring(i));
        break;
      }
      A(paramString.substring(i, j));
    }
  }

  public void a(ConstraintLayout paramConstraintLayout)
  {
    if (isInEditMode())
      setIds(this.da);
    if (this.cY == null);
    while (true)
    {
      return;
      this.cY.bd();
      for (int i = 0; i < this.mCount; i++)
      {
        View localView = paramConstraintLayout.q(this.cW[i]);
        if (localView != null)
          this.cY.e(paramConstraintLayout.b(localView));
      }
    }
  }

  public final void ap()
  {
    if (this.cY == null);
    while (true)
    {
      return;
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      if ((localLayoutParams instanceof ConstraintLayout.LayoutParams))
        ((ConstraintLayout.LayoutParams)localLayoutParams).eH = this.cY;
    }
  }

  public void aq()
  {
  }

  protected void b(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, b.a.ConstraintLayout_Layout);
      int i = paramAttributeSet.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramAttributeSet.getIndex(j);
        if (k == 9)
        {
          this.da = paramAttributeSet.getString(k);
          setIds(this.da);
        }
      }
    }
  }

  public int[] getReferencedIds()
  {
    return Arrays.copyOf(this.cW, this.mCount);
  }

  public void onDraw(Canvas paramCanvas)
  {
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.cZ)
      super.onMeasure(paramInt1, paramInt2);
    while (true)
    {
      return;
      setMeasuredDimension(0, 0);
    }
  }

  public void setReferencedIds(int[] paramArrayOfInt)
  {
    int i = 0;
    this.mCount = 0;
    while (i < paramArrayOfInt.length)
    {
      setTag(paramArrayOfInt[i], null);
      i++;
    }
  }

  public void setTag(int paramInt, Object paramObject)
  {
    if (this.mCount + 1 > this.cW.length)
      this.cW = Arrays.copyOf(this.cW, this.cW.length * 2);
    this.cW[this.mCount] = paramInt;
    this.mCount += 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.ConstraintHelper
 * JD-Core Version:    0.6.2
 */