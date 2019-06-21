package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberProxyUI$onCreate$1$onPhoneItemSelect$1", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$OnVerifyCallback;", "onVerifyCallback", "", "isSuccess", "", "result", "", "", "plugin-appbrand-integration_release"})
public final class PhoneNumberProxyUI$f$a
  implements m.b
{
  PhoneNumberProxyUI$f$a(PhoneItem paramPhoneItem)
  {
  }

  public final void a(boolean paramBoolean, Map<String, String> paramMap)
  {
    be localbe1 = null;
    Object localObject = null;
    AppMethodBeat.i(134873);
    a.f.b.j.p(paramMap, "result");
    be localbe2;
    if (paramBoolean)
    {
      if (!this.ixE.ixM)
        break label140;
      localbe1 = this.iyS.iyQ.ixV;
      if (localbe1 != null)
      {
        localbe2 = this.iyS.iyQ.ixV;
        if (localbe2 != null)
          localObject = Long.valueOf(localbe2.GB());
        if (localObject == null)
          a.f.b.j.dWJ();
        localbe1.cR(((Long)localObject).longValue() + 1L);
      }
    }
    while (true)
    {
      PhoneNumberProxyUI.a(this.iyS.iyQ, (String)paramMap.get("encryptedData"), (String)paramMap.get("iv"));
      j.ixQ.b(this.ixE);
      AppMethodBeat.o(134873);
      return;
      label140: localbe2 = this.iyS.iyQ.ixV;
      if (localbe2 != null)
      {
        be localbe3 = this.iyS.iyQ.ixV;
        localObject = localbe1;
        if (localbe3 != null)
          localObject = Long.valueOf(localbe3.GC());
        if (localObject == null)
          a.f.b.j.dWJ();
        localbe2.cS(((Long)localObject).longValue() + 1L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.f.a
 * JD-Core Version:    0.6.2
 */