package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class i$b
  implements View.OnClickListener
{
  i$b(i parami, PhoneItem paramPhoneItem)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134793);
    paramView = this.ixH.ixy.iterator();
    while (paramView.hasNext())
      ((PhoneItem)paramView.next()).ixN = false;
    this.ixE.ixN = true;
    this.ixH.notifyDataSetChanged();
    AppMethodBeat.o(134793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.i.b
 * JD-Core Version:    0.6.2
 */