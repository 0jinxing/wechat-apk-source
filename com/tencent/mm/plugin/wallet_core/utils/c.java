package com.tencent.mm.plugin.wallet_core.utils;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static boolean aw(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(48008);
    if (paramIntent == null)
      AppMethodBeat.o(48008);
    while (true)
    {
      return bool;
      int i = paramIntent.getIntExtra("key_pay_reslut_type", 0);
      if (i == 1000)
      {
        ab.i("MicroMsg.WalletPayUtil", "onActivityResult isCanFinish %s %s", new Object[] { Integer.valueOf(i), bo.dpG().toString() });
        AppMethodBeat.o(48008);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(48008);
      }
    }
  }

  public static boolean ax(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(48009);
    if (paramIntent == null)
      AppMethodBeat.o(48009);
    while (true)
    {
      return bool;
      int i = paramIntent.getIntExtra("key_pay_reslut_type", 0);
      if (i == 1001)
      {
        ab.i("MicroMsg.WalletPayUtil", "onActivityResult isCanIgnore %s %s", new Object[] { Integer.valueOf(i), bo.dpG().toString() });
        AppMethodBeat.o(48009);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(48009);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.c
 * JD-Core Version:    0.6.2
 */