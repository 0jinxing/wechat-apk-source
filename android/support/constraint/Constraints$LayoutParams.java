package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Constraints$LayoutParams extends ConstraintLayout.LayoutParams
{
  public float alpha = 1.0F;
  public boolean eR = false;
  public float eS = 0.0F;
  public float eT = 0.0F;
  public float eU = 0.0F;
  public float eV = 0.0F;
  public float eW = 0.0F;
  public float eX = 0.0F;
  public float eY = 0.0F;
  public float eZ = 0.0F;
  public float rotation = 0.0F;
  public float scaleX = 1.0F;
  public float scaleY = 1.0F;

  public Constraints$LayoutParams()
  {
  }

  public Constraints$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b.a.ConstraintSet);
    int j = paramContext.getIndexCount();
    if (i < j)
    {
      int k = paramContext.getIndex(i);
      if (k == 13)
        this.alpha = paramContext.getFloat(k, this.alpha);
      while (true)
      {
        i++;
        break;
        if (k == 26)
        {
          this.eS = paramContext.getFloat(k, this.eS);
          this.eR = true;
        }
        else if (k == 21)
        {
          this.eT = paramContext.getFloat(k, this.eT);
        }
        else if (k == 22)
        {
          this.eU = paramContext.getFloat(k, this.eU);
        }
        else if (k == 20)
        {
          this.rotation = paramContext.getFloat(k, this.rotation);
        }
        else if (k == 18)
        {
          this.scaleX = paramContext.getFloat(k, this.scaleX);
        }
        else if (k == 19)
        {
          this.scaleY = paramContext.getFloat(k, this.scaleY);
        }
        else if (k == 14)
        {
          this.eV = paramContext.getFloat(k, this.eV);
        }
        else if (k == 15)
        {
          this.eW = paramContext.getFloat(k, this.eW);
        }
        else if (k == 16)
        {
          this.eX = paramContext.getFloat(k, this.eX);
        }
        else if (k == 17)
        {
          this.eY = paramContext.getFloat(k, this.eY);
        }
        else if (k == 25)
        {
          this.eX = paramContext.getFloat(k, this.eZ);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.constraint.Constraints.LayoutParams
 * JD-Core Version:    0.6.2
 */