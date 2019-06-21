package com.tencent.mm.wallet_core.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class h
{
  public static boolean a(WalletBaseUI paramWalletBaseUI, m paramm, int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(49136);
    if (paramInt1 == 1000)
    {
      if (!bo.isNullOrNil(paramString))
        break label580;
      paramString = paramWalletBaseUI.getString(2131305389);
    }
    label145: label154: label580: 
    while (true)
    {
      c localc = a.aE(paramWalletBaseUI);
      switch (paramInt2)
      {
      default:
        bool = false;
        paramInt1 = 0;
        if (paramInt1 != 0)
        {
          paramWalletBaseUI.Ahw = 2;
          if ((paramm instanceof com.tencent.mm.wallet_core.c.q))
            ((com.tencent.mm.wallet_core.c.q)paramm).AfO = bool;
          AppMethodBeat.o(49136);
          return bool;
        }
        break;
      case 401:
        if (!(paramm instanceof n));
        break;
      case 402:
      case 403:
      case 408:
      case 407:
      case 404:
      case 405:
      case 412:
      case 414:
      case -100868:
      case -100869:
      }
      for (paramInt1 = ((n)paramm).tAz; ; paramInt1 = 0)
      {
        if (paramInt1 == 1)
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131304811), new h.1(paramWalletBaseUI));
        while (true)
        {
          bool = true;
          paramInt1 = 1;
          break;
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, false, paramString, "", paramWalletBaseUI.getString(2131304812), paramWalletBaseUI.getString(2131297036), new h.4(paramm, paramWalletBaseUI), new h.5(paramWalletBaseUI));
        }
        if (localc != null)
        {
          bool = localc.a(paramWalletBaseUI, paramInt2, paramString);
          paramInt1 = 1;
          break label145;
          dOk();
          if (r.YM())
            b(paramWalletBaseUI, paramInt2, paramString);
          while (true)
          {
            bool = true;
            paramInt1 = 1;
            break;
            com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, null, false, new h.6(paramWalletBaseUI, paramInt2));
          }
          if (localc != null)
          {
            bool = localc.a(paramWalletBaseUI, paramInt2, paramString);
            paramInt1 = 1;
            break label145;
            paramInt1 = i;
            if ((paramm instanceof n))
              paramInt1 = ((n)paramm).tAz;
            if (paramInt1 == 1)
              com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131304811), new h.7(paramWalletBaseUI));
            while (true)
            {
              bool = true;
              paramInt1 = 1;
              break;
              com.tencent.mm.ui.base.h.d(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131305305), paramWalletBaseUI.getString(2131296868), new h.8(paramWalletBaseUI), null);
            }
            com.tencent.mm.ui.base.h.d(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131305416), paramWalletBaseUI.getString(2131296868), new h.9(paramWalletBaseUI), null);
            bool = true;
            paramInt1 = 1;
            break label145;
            dOk();
            b(paramWalletBaseUI, paramInt2, paramString);
            bool = true;
            paramInt1 = 1;
            break label145;
            com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramWalletBaseUI.getString(2131304793), null, false, new h.10(paramWalletBaseUI, paramInt2));
            bool = true;
            paramInt1 = 1;
            break label145;
            com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramWalletBaseUI.getString(2131304792), null, false, new h.11(paramWalletBaseUI, paramInt2));
            bool = true;
            break;
            paramWalletBaseUI.Ahw = 3;
            break label154;
          }
        }
        bool = false;
        paramInt1 = 1;
        break label145;
      }
    }
  }

  private static void b(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    AppMethodBeat.i(49138);
    com.tencent.mm.ui.base.h.a(paramWalletBaseUI, false, paramString, "", paramWalletBaseUI.getString(2131304791), paramWalletBaseUI.getString(2131296868), new h.2(paramWalletBaseUI), new h.3(paramWalletBaseUI, paramInt));
    AppMethodBeat.o(49138);
  }

  private static void dOk()
  {
    AppMethodBeat.i(49137);
    if (!r.YM());
    for (Object localObject = new com.tencent.mm.wallet_core.tenpay.model.q(); ; localObject = new com.tencent.mm.wallet_core.e.a.b())
    {
      g.RQ();
      g.RO().eJo.a((m)localObject, 0);
      AppMethodBeat.o(49137);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.h
 * JD-Core Version:    0.6.2
 */