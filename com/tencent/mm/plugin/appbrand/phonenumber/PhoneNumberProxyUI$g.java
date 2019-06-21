package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class PhoneNumberProxyUI$g
  implements View.OnClickListener
{
  PhoneNumberProxyUI$g(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134875);
    be localbe = this.iyQ.ixV;
    if (localbe != null)
    {
      paramView = this.iyQ.ixV;
      if (paramView == null)
        break label70;
    }
    label70: for (paramView = Long.valueOf(paramView.Gz()); ; paramView = null)
    {
      if (paramView == null)
        j.dWJ();
      localbe.cP(paramView.longValue() + 1L);
      PhoneNumberProxyUI.a(this.iyQ, "user deny");
      AppMethodBeat.o(134875);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.g
 * JD-Core Version:    0.6.2
 */