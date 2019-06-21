package com.tencent.mm.plugin.wallet.bind.ui;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.storage.z;

public final class b
{
  public static boolean b(Bankcard paramBankcard)
  {
    boolean bool = false;
    AppMethodBeat.i(45739);
    if (paramBankcard == null)
      AppMethodBeat.o(45739);
    while (true)
    {
      return bool;
      g.RQ();
      String str = (String)g.RP().Ry().get(196659, null);
      if (TextUtils.isEmpty(str))
      {
        AppMethodBeat.o(45739);
        bool = true;
      }
      else
      {
        String[] arrayOfString = str.split("&");
        if ((arrayOfString == null) || (arrayOfString.length == 0))
        {
          AppMethodBeat.o(45739);
          bool = true;
        }
        else
        {
          for (int i = 0; ; i++)
          {
            if (i >= arrayOfString.length)
              break label125;
            str = arrayOfString[i];
            if ((str != null) && (str.equals(paramBankcard.field_bankcardType)))
            {
              AppMethodBeat.o(45739);
              break;
            }
          }
          label125: AppMethodBeat.o(45739);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.b
 * JD-Core Version:    0.6.2
 */