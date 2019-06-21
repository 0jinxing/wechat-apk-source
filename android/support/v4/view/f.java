package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class f
{
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    if (Build.VERSION.SDK_INT >= 17);
    for (int i = paramMarginLayoutParams.getMarginStart(); ; i = paramMarginLayoutParams.leftMargin)
      return i;
  }

  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    if (Build.VERSION.SDK_INT >= 17);
    for (int i = paramMarginLayoutParams.getMarginEnd(); ; i = paramMarginLayoutParams.rightMargin)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.f
 * JD-Core Version:    0.6.2
 */