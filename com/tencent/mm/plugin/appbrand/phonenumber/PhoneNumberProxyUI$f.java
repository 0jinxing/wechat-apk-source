package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberProxyUI$onCreate$1", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManageDialog$OnPhoneItemSelect;", "onPhoneItemSelect", "", "phoneItem", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "plugin-appbrand-integration_release"})
public final class PhoneNumberProxyUI$f
  implements l.b
{
  public final void c(PhoneItem paramPhoneItem)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(134874);
    a.f.b.j.p(paramPhoneItem, "phoneItem");
    d.d("MicroMsg.PhoneNumberProxyUI", "selelct phoneItem:%s", new Object[] { paramPhoneItem });
    Object localObject3 = this.iyQ.ixV;
    if (localObject3 != null)
    {
      localObject4 = this.iyQ.ixV;
      if (localObject4 == null)
        break label178;
    }
    label178: for (Object localObject4 = Long.valueOf(((be)localObject4).Gy()); ; localObject4 = null)
    {
      if (localObject4 == null)
        a.f.b.j.dWJ();
      ((be)localObject3).cO(((Long)localObject4).longValue() + 1L);
      if (!paramPhoneItem.ixK)
        break;
      localObject1 = (Context)this.iyQ;
      localObject3 = this.iyQ.appId;
      be localbe = this.iyQ.ixV;
      localObject2 = this.iyQ.iyM;
      localObject4 = localObject2;
      if (localObject2 == null)
        localObject4 = "";
      new m((Context)localObject1, (String)localObject3, localbe, (String)localObject4, paramPhoneItem, (m.b)new PhoneNumberProxyUI.f.a(this, paramPhoneItem)).ez(true);
      AppMethodBeat.o(134874);
      return;
    }
    if (paramPhoneItem.ixM)
    {
      localObject1 = this.iyQ.ixV;
      if (localObject1 != null)
      {
        localObject3 = this.iyQ.ixV;
        localObject4 = localObject2;
        if (localObject3 != null)
          localObject4 = Long.valueOf(((be)localObject3).GB());
        if (localObject4 == null)
          a.f.b.j.dWJ();
        ((be)localObject1).cR(((Long)localObject4).longValue() + 1L);
      }
    }
    while (true)
    {
      PhoneNumberProxyUI.a(this.iyQ, paramPhoneItem.ixJ, paramPhoneItem.biC);
      j.ixQ.b(paramPhoneItem);
      AppMethodBeat.o(134874);
      break;
      localObject2 = this.iyQ.ixV;
      if (localObject2 != null)
      {
        localObject3 = this.iyQ.ixV;
        localObject4 = localObject1;
        if (localObject3 != null)
          localObject4 = Long.valueOf(((be)localObject3).GC());
        if (localObject4 == null)
          a.f.b.j.dWJ();
        ((be)localObject2).cS(((Long)localObject4).longValue() + 1L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.f
 * JD-Core Version:    0.6.2
 */