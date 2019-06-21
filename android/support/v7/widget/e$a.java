package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class e$a
  implements Comparable<a>
{
  public final ResolveInfo resolveInfo;
  public float weight;

  public e$a(ResolveInfo paramResolveInfo)
  {
    this.resolveInfo = paramResolveInfo;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        bool = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(paramObject.weight))
          bool = false;
      }
    }
  }

  public final int hashCode()
  {
    return Float.floatToIntBits(this.weight) + 31;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.resolveInfo.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.e.a
 * JD-Core Version:    0.6.2
 */