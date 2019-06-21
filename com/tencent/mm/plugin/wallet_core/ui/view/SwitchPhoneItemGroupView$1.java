package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class SwitchPhoneItemGroupView$1
  implements View.OnClickListener
{
  SwitchPhoneItemGroupView$1(SwitchPhoneItemGroupView paramSwitchPhoneItemGroupView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47880);
    Iterator localIterator = this.tNw.tNt.iterator();
    while (localIterator.hasNext())
      ((SwitchPhoneItemView)localIterator.next()).tNz.setImageResource(2131231852);
    ((SwitchPhoneItemView)paramView).tNz.setImageResource(2131231853);
    if (SwitchPhoneItemGroupView.a(this.tNw) != null)
      SwitchPhoneItemGroupView.a(this.tNw).eo(paramView);
    AppMethodBeat.o(47880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView.1
 * JD-Core Version:    0.6.2
 */