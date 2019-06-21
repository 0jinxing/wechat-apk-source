package com.tencent.mm.plugin.wallet_ecard.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.bks;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class b
{
  public static void a(int paramInt, String paramString1, String paramString2, String paramString3, Context paramContext, c.a parama)
  {
    AppMethodBeat.i(48054);
    ab.i("MicroMsg.ECardUtil", "start open ecard process, scene: %s, token==null%s, eCardType: %s, extraData: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bo.isNullOrNil(paramString1)), paramString2, paramString3 });
    Bundle localBundle = new Bundle();
    localBundle.putInt(a.tPH, paramInt);
    localBundle.putString(a.tPI, paramString1);
    localBundle.putString(a.tPM, paramString2);
    localBundle.putString(a.tPN, paramString3);
    com.tencent.mm.wallet_core.a.a((Activity)paramContext, com.tencent.mm.plugin.wallet_ecard.b.b.class, localBundle, parama);
    AppMethodBeat.o(48054);
  }

  public static boolean a(WalletBaseUI paramWalletBaseUI, m paramm, int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(48053);
    if (paramInt2 == 0)
      paramString2 = paramString1;
    while (true)
    {
      ab.i("MicroMsg.ECardUtil", "finalRetCode: %s, finalRetMsg: %s", new Object[] { Integer.valueOf(paramInt1), paramString2 });
      if (paramInt1 == 269293577)
      {
        com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString1, "", false, new b.4());
        AppMethodBeat.o(48053);
      }
      while (true)
      {
        return bool;
        bool = com.tencent.mm.wallet_core.d.h.a(paramWalletBaseUI, paramm, 1000, paramInt1, paramString2);
        AppMethodBeat.o(48053);
      }
      paramInt1 = paramInt2;
    }
  }

  public static boolean a(final WalletBaseUI paramWalletBaseUI, bks parambks)
  {
    boolean bool = false;
    AppMethodBeat.i(48051);
    if (parambks == null)
    {
      ab.i("MicroMsg.ECardUtil", "no popItem");
      AppMethodBeat.o(48051);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(parambks.wNN))
        break;
      if ((!bo.isNullOrNil(parambks.tod)) && (!bo.isNullOrNil(parambks.wNO)))
      {
        ab.i("MicroMsg.ECardUtil", "show guide info 1");
        com.tencent.mm.ui.base.h.a(paramWalletBaseUI, parambks.wNN, "", parambks.tod, parambks.wNO, false, new b.1(parambks, paramWalletBaseUI), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(48049);
            c localc;
            if (this.tQe.wvn == a.tPD)
            {
              ab.i("MicroMsg.ECardUtil", "do end process");
              localc = paramWalletBaseUI.dOD();
              if (localc != null)
                localc.b(paramWalletBaseUI, new Bundle());
            }
            while (true)
            {
              paramAnonymousDialogInterface.dismiss();
              AppMethodBeat.o(48049);
              return;
              paramWalletBaseUI.finish();
              continue;
              if (this.tQe.wvn == a.tPG)
              {
                ab.i("MicroMsg.ECardUtil", "back bank list");
                localc = paramWalletBaseUI.dOD();
                if (localc != null)
                  localc.c(paramWalletBaseUI, 100);
                else
                  paramWalletBaseUI.finish();
              }
            }
          }
        });
        AppMethodBeat.o(48051);
        bool = true;
      }
      else
      {
        if (bo.isNullOrNil(parambks.wNO))
          break;
        ab.i("MicroMsg.ECardUtil", "show guide info 2");
        com.tencent.mm.ui.base.h.a(paramWalletBaseUI, parambks.wNN, "", parambks.wNO, false, new b.3(parambks, paramWalletBaseUI));
        AppMethodBeat.o(48051);
        bool = true;
      }
    }
  }

  public static String d(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(48052);
    paramContext = paramContext.getString(2131305389);
    int j;
    if (paramArrayOfString.length > 0)
    {
      int i = paramArrayOfString.length;
      j = 0;
      if (j < i)
      {
        String str = paramArrayOfString[j];
        if (!bo.isNullOrNil(str))
          paramContext = str;
      }
    }
    while (true)
    {
      AppMethodBeat.o(48052);
      return paramContext;
      j++;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.a.b
 * JD-Core Version:    0.6.2
 */