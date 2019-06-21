package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"})
final class m$m
  implements DialogInterface.OnClickListener
{
  m$m(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    EditVerifyCodeView localEditVerifyCodeView = null;
    Object localObject1 = null;
    AppMethodBeat.i(134915);
    Object localObject2 = m.f(this.izd);
    if (localObject2 != null)
    {
      localObject2 = ((EditVerifyCodeView)localObject2).getText();
      ab.i("MicroMsg.PhoneNumberVerifyCodeDialog", "to verify sms %s", new Object[] { localObject2 });
      localObject2 = m.f(this.izd);
      if (localObject2 == null)
        break label150;
      localObject2 = ((EditVerifyCodeView)localObject2).getText();
      if ((localObject2 == null) || (((String)localObject2).length() != 6))
        break label150;
      paramDialogInterface.dismiss();
      m.d(this.izd);
      m.e(this.izd);
      localObject2 = this.izd;
      localEditVerifyCodeView = m.f(this.izd);
      paramDialogInterface = localObject1;
      if (localEditVerifyCodeView != null)
        paramDialogInterface = localEditVerifyCodeView.getText();
      m.a((m)localObject2, String.valueOf(paramDialogInterface));
      AppMethodBeat.o(134915);
    }
    while (true)
    {
      return;
      localObject2 = null;
      break;
      label150: paramDialogInterface = m.f(this.izd);
      if (paramDialogInterface != null)
      {
        paramDialogInterface = paramDialogInterface.getText();
        if (paramDialogInterface == null);
      }
      for (paramDialogInterface = Integer.valueOf(paramDialogInterface.length()); ; paramDialogInterface = null)
      {
        if (paramDialogInterface == null)
          j.dWJ();
        if (paramDialogInterface.intValue() >= 6)
          break label245;
        ab.e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is length is < 6");
        m.d(this.izd);
        h.bN(this.izd.context, this.izd.context.getString(2131296654));
        AppMethodBeat.o(134915);
        break;
      }
      label245: localObject2 = m.f(this.izd);
      paramDialogInterface = localEditVerifyCodeView;
      if (localObject2 != null)
      {
        localObject2 = ((EditVerifyCodeView)localObject2).getText();
        paramDialogInterface = localEditVerifyCodeView;
        if (localObject2 != null)
          paramDialogInterface = Integer.valueOf(((String)localObject2).length());
      }
      if (paramDialogInterface == null)
        j.dWJ();
      if (paramDialogInterface.intValue() == 0)
      {
        ab.e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is empty");
        m.d(this.izd);
        h.bN(this.izd.context, this.izd.context.getString(2131296653));
      }
      AppMethodBeat.o(134915);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.m.m
 * JD-Core Version:    0.6.2
 */