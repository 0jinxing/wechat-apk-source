package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;

final class o
{
  private static final int[] tW = { 2130772201 };

  static void G(Context paramContext)
  {
    int i = 0;
    paramContext = paramContext.obtainStyledAttributes(tW);
    if (!paramContext.hasValue(0))
      i = 1;
    paramContext.recycle();
    if (i != 0)
      throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.o
 * JD-Core Version:    0.6.2
 */