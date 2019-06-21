package com.tencent.mm.plugin.recharge.ui.form;

import android.telephony.PhoneNumberUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.b;

final class c$1 extends c.a
{
  c$1()
  {
    super((byte)0);
  }

  public final String VG(String paramString)
  {
    AppMethodBeat.i(44367);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(44367);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replaceAll(" ", "");
      AppMethodBeat.o(44367);
    }
  }

  public final boolean a(MallFormView paramMallFormView)
  {
    AppMethodBeat.i(44366);
    boolean bool = PhoneNumberUtils.isGlobalPhoneNumber(b.ws(paramMallFormView.getText().toString()));
    AppMethodBeat.o(44366);
    return bool;
  }

  public final boolean cev()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.form.c.1
 * JD-Core Version:    0.6.2
 */