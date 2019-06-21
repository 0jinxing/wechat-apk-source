package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

public final class d
{
  private final AccessibilityRecord Oq;

  @Deprecated
  private d(Object paramObject)
  {
    this.Oq = ((AccessibilityRecord)paramObject);
  }

  @Deprecated
  public static d eu()
  {
    return new d(AccessibilityRecord.obtain());
  }

  @Deprecated
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
        paramObject = (d)paramObject;
        if (this.Oq == null)
        {
          if (paramObject.Oq != null)
            bool = false;
        }
        else if (!this.Oq.equals(paramObject.Oq))
          bool = false;
      }
    }
  }

  @Deprecated
  public final int hashCode()
  {
    if (this.Oq == null);
    for (int i = 0; ; i = this.Oq.hashCode())
      return i;
  }

  @Deprecated
  public final void setFromIndex(int paramInt)
  {
    this.Oq.setFromIndex(paramInt);
  }

  @Deprecated
  public final void setItemCount(int paramInt)
  {
    this.Oq.setItemCount(paramInt);
  }

  @Deprecated
  public final void setScrollable(boolean paramBoolean)
  {
    this.Oq.setScrollable(paramBoolean);
  }

  @Deprecated
  public final void setToIndex(int paramInt)
  {
    this.Oq.setToIndex(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.d
 * JD-Core Version:    0.6.2
 */