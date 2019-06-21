package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;

public final class ao$a extends a
{
  final ao aqb;

  public ao$a(ao paramao)
  {
    this.aqb = paramao;
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    if ((!this.aqb.aiB.jO()) && (this.aqb.aiB.getLayoutManager() != null))
      this.aqb.aiB.getLayoutManager().a(paramView, paramb);
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool1 = false;
    boolean bool2;
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      bool2 = true;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (!this.aqb.aiB.jO())
      {
        bool2 = bool1;
        if (this.aqb.aiB.getLayoutManager() != null)
        {
          this.aqb.aiB.getLayoutManager();
          bool2 = bool1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ao.a
 * JD-Core Version:    0.6.2
 */