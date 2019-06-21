package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public final class aa
{
  public final Object NF;

  private aa(Object paramObject)
  {
    this.NF = paramObject;
  }

  static aa G(Object paramObject)
  {
    if (paramObject == null);
    for (paramObject = null; ; paramObject = new aa(paramObject))
      return paramObject;
  }

  static Object c(aa paramaa)
  {
    if (paramaa == null);
    for (paramaa = null; ; paramaa = paramaa.NF)
      return paramaa;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
      }
      else
      {
        paramObject = (aa)paramObject;
        if (this.NF == null)
        {
          if (paramObject.NF != null)
            bool = false;
        }
        else
          bool = this.NF.equals(paramObject.NF);
      }
    }
  }

  public final aa et()
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (aa localaa = new aa(((WindowInsets)this.NF).consumeSystemWindowInsets()); ; localaa = null)
      return localaa;
  }

  public final aa f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (aa localaa = new aa(((WindowInsets)this.NF).replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4)); ; localaa = null)
      return localaa;
  }

  public final int getSystemWindowInsetBottom()
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (int i = ((WindowInsets)this.NF).getSystemWindowInsetBottom(); ; i = 0)
      return i;
  }

  public final int getSystemWindowInsetLeft()
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (int i = ((WindowInsets)this.NF).getSystemWindowInsetLeft(); ; i = 0)
      return i;
  }

  public final int getSystemWindowInsetRight()
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (int i = ((WindowInsets)this.NF).getSystemWindowInsetRight(); ; i = 0)
      return i;
  }

  public final int getSystemWindowInsetTop()
  {
    if (Build.VERSION.SDK_INT >= 20);
    for (int i = ((WindowInsets)this.NF).getSystemWindowInsetTop(); ; i = 0)
      return i;
  }

  public final int hashCode()
  {
    if (this.NF == null);
    for (int i = 0; ; i = this.NF.hashCode())
      return i;
  }

  public final boolean isConsumed()
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = ((WindowInsets)this.NF).isConsumed(); ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.aa
 * JD-Core Version:    0.6.2
 */