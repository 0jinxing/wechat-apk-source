package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Intent;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.ui.MMActivity.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "mmOnActivityResult"})
final class PhoneNumberProxyUI$b
  implements MMActivity.a
{
  PhoneNumberProxyUI$b(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(134869);
    if (paramInt1 == 100)
    {
      if (paramInt2 != -1)
        break label61;
      d.i("MicroMsg.PhoneNumberProxyUI", "mmOnActivityResult RESULT_OK");
      PhoneNumberProxyUI.a(this.iyQ);
      paramIntent = this.iyQ.ixV;
      if (paramIntent != null)
        paramIntent.cM(1L);
    }
    while (true)
    {
      this.iyQ.dye();
      AppMethodBeat.o(134869);
      return;
      label61: d.e("MicroMsg.PhoneNumberProxyUI", "mmOnActivityResult RESULT_CANCEL OR RESULT_FIRST_USER");
      paramIntent = this.iyQ.ixV;
      if (paramIntent != null)
        paramIntent.cM(0L);
      PhoneNumberProxyUI.a(this.iyQ, "fail:user cancel");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.b
 * JD-Core Version:    0.6.2
 */