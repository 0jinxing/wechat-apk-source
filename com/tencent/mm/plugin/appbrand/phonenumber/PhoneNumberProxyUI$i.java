package com.tencent.mm.plugin.appbrand.phonenumber;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class PhoneNumberProxyUI$i
  implements View.OnClickListener
{
  PhoneNumberProxyUI$i(PhoneNumberProxyUI paramPhoneNumberProxyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134877);
    Object localObject1 = this.iyQ.ixV;
    int i;
    if (localObject1 != null)
    {
      paramView = this.iyQ.ixV;
      if (paramView != null)
      {
        paramView = Long.valueOf(paramView.GD());
        if (paramView == null)
          a.f.b.j.dWJ();
        ((be)localObject1).cT(paramView.longValue() + 1L);
      }
    }
    else
    {
      localObject1 = this.iyQ.appId;
      Object localObject2 = this.iyQ.csu;
      paramView = this.iyQ.dxU();
      a.f.b.j.o(paramView, "context");
      localObject2 = new k((String)localObject1, (String)localObject2, (Context)paramView);
      localObject1 = this.iyQ.iyA;
      paramView = (View)localObject1;
      if (localObject1 == null)
        paramView = ((k)localObject2).context.getString(2131297135);
      ((k)localObject2).gKl.setText((CharSequence)paramView);
      paramView = this.iyQ.iyL;
      if (paramView == null)
        break label247;
      i = paramView.iym.getMeasuredHeight();
      label155: ((k)localObject2).iyk = ((com.tencent.mm.plugin.appbrand.widget.b.k)PhoneNumberProxyUI.b(this.iyQ));
      ((k)localObject2).iyl.setOnClickListener((View.OnClickListener)new k.a((k)localObject2));
      paramView = ((k)localObject2).iyk;
      if (paramView != null)
        paramView.b((com.tencent.mm.plugin.appbrand.widget.b.j)localObject2);
      if (i >= 0)
      {
        localObject1 = ((k)localObject2).iym;
        paramView = ((View)localObject1).getLayoutParams();
        if (paramView == null)
          break label253;
        paramView.height = i;
      }
    }
    while (true)
    {
      ((View)localObject1).setLayoutParams(paramView);
      AppMethodBeat.o(134877);
      return;
      paramView = null;
      break;
      label247: i = -1;
      break label155;
      label253: paramView = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberProxyUI.i
 * JD-Core Version:    0.6.2
 */