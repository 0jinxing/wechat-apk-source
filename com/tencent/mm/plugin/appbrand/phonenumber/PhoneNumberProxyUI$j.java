package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class PhoneNumberProxyUI$j
  implements View.OnClickListener
{
  PhoneNumberProxyUI$j(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void onClick(View paramView)
  {
    paramView = null;
    AppMethodBeat.i(134878);
    Object localObject1;
    Object localObject2;
    if (this.iyQ.ixy.size() == 1)
    {
      localObject1 = PhoneNumberAddUI.ixW;
      localObject1 = this.iyQ.dxU();
      j.o(localObject1, "context");
      PhoneNumberAddUI.a.X((Context)localObject1, this.iyQ.appId);
      localObject1 = this.iyQ.ixV;
      if (localObject1 != null)
      {
        localObject2 = this.iyQ.ixV;
        if (localObject2 != null)
          paramView = Long.valueOf(((be)localObject2).GE());
        if (paramView == null)
          j.dWJ();
        ((be)localObject1).cU(paramView.longValue() + 1L);
        AppMethodBeat.o(134878);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134878);
      continue;
      paramView = PhoneNumberManagerUI.iyG;
      paramView = this.iyQ.dxU();
      j.o(paramView, "context");
      localObject2 = (Context)paramView;
      String str1 = this.iyQ.appId;
      String str2 = this.iyQ.csu;
      localObject1 = this.iyQ.iyA;
      paramView = (View)localObject1;
      if (localObject1 == null)
        paramView = "";
      j.p(localObject2, "context");
      j.p(str1, "appId");
      j.p(str2, "pagePath");
      j.p(paramView, "authDesc");
      localObject1 = new Intent((Context)localObject2, PhoneNumberManagerUI.class);
      ((Intent)localObject1).putExtra("APPID", str1);
      ((Intent)localObject1).putExtra("AUTHDESC", paramView);
      ((Intent)localObject1).putExtra("PAGEPATH", str2);
      ((Intent)localObject1).putExtra("SHOW_DELETE", false);
      ((Context)localObject2).startActivity((Intent)localObject1);
      localObject1 = this.iyQ.ixV;
      if (localObject1 != null)
      {
        paramView = this.iyQ.ixV;
        if (paramView != null);
        for (paramView = Long.valueOf(paramView.GF()); ; paramView = null)
        {
          if (paramView == null)
            j.dWJ();
          ((be)localObject1).cV(paramView.longValue() + 1L);
          AppMethodBeat.o(134878);
          break;
        }
      }
      AppMethodBeat.o(134878);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.j
 * JD-Core Version:    0.6.2
 */