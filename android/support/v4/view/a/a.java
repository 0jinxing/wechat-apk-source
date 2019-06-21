package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19)
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.a
 * JD-Core Version:    0.6.2
 */