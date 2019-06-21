package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public final class be
{
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26)
      paramView.setTooltipText(paramCharSequence);
    while (true)
    {
      return;
      bf.a(paramView, paramCharSequence);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.be
 * JD-Core Version:    0.6.2
 */