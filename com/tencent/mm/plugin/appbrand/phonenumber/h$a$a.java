package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class h$a$a
  implements View.OnClickListener
{
  h$a$a(h.a parama, PhoneItem paramPhoneItem)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134786);
    paramView = this.ixD.ixC;
    PhoneItem localPhoneItem = this.ixE;
    j.p(localPhoneItem, "phoneItem");
    paramView.ixw.add(localPhoneItem);
    paramView.ixy.remove(localPhoneItem);
    paramView.notifyDataSetChanged();
    AppMethodBeat.o(134786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.h.a.a
 * JD-Core Version:    0.6.2
 */