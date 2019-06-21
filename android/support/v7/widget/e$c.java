package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class e$c
{
  public final ComponentName aey;
  public final long time;
  public final float weight;

  public e$c(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.aey = paramComponentName;
    this.time = paramLong;
    this.weight = paramFloat;
  }

  public e$c(String paramString, long paramLong, float paramFloat)
  {
    this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
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
        paramObject = (c)paramObject;
        if (this.aey == null)
        {
          if (paramObject.aey != null)
            bool = false;
        }
        else if (!this.aey.equals(paramObject.aey))
          bool = false;
        else if (this.time != paramObject.time)
          bool = false;
        else if (Float.floatToIntBits(this.weight) != Float.floatToIntBits(paramObject.weight))
          bool = false;
      }
    }
  }

  public final int hashCode()
  {
    if (this.aey == null);
    for (int i = 0; ; i = this.aey.hashCode())
      return ((i + 31) * 31 + (int)(this.time ^ this.time >>> 32)) * 31 + Float.floatToIntBits(this.weight);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("; activity:").append(this.aey);
    localStringBuilder.append("; time:").append(this.time);
    localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.e.c
 * JD-Core Version:    0.6.2
 */