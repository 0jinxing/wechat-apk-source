package android.support.design.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;

final class c$2 extends a
{
  c$2(c paramc)
  {
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    if (this.nE.mCancelable)
    {
      paramb.addAction(1048576);
      paramb.setDismissable(true);
    }
    while (true)
    {
      return;
      paramb.setDismissable(false);
    }
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    if ((paramInt == 1048576) && (this.nE.mCancelable))
      this.nE.cancel();
    for (boolean bool = true; ; bool = super.performAccessibilityAction(paramView, paramInt, paramBundle))
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.c.2
 * JD-Core Version:    0.6.2
 */