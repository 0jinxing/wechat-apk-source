package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class d
{
  public static void apply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 17)
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
    while (true)
    {
      return;
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2);
    }
  }

  public static int getAbsoluteGravity(int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 17);
    for (paramInt1 = Gravity.getAbsoluteGravity(paramInt1, paramInt2); ; paramInt1 = 0xFF7FFFFF & paramInt1)
      return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.d
 * JD-Core Version:    0.6.2
 */