package com.tencent.mm.wallet_core.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.e.a.b;
import com.tencent.mm.wallet_core.tenpay.model.p;

public final class f
{
  private static String hxN = null;
  private static int lqL = 0;
  private static int lqz = 0;

  public static void a(WalletBaseUI paramWalletBaseUI, int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(49332);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = paramWalletBaseUI.getString(2131305389);
    boolean bool = true;
    if ((paramm instanceof com.tencent.mm.wallet_core.c.q))
      bool = ((com.tencent.mm.wallet_core.c.q)paramm).bXm();
    if ((paramm instanceof n))
      bool = ((n)paramm).cNi;
    label305: label699: 
    while (true)
    {
      ab.i("MicroMsg.WalletDispatcher", "dispatch errType:%d errCode %s ,errMsg: %s, isBlock %s scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str, Boolean.valueOf(bool), paramm });
      Bundle localBundle;
      if ((!(paramm instanceof com.tencent.mm.wallet_core.tenpay.model.q)) && (!(paramm instanceof b)))
      {
        if (!(paramm instanceof com.tencent.mm.wallet_core.c.q))
          break label559;
        paramString = (com.tencent.mm.wallet_core.c.q)paramm;
        if (!paramString.dNO())
          break label459;
        ab.d("MicroMsg.WalletDispatcher", "order pay end!!!");
        localBundle = paramWalletBaseUI.mBundle;
        localBundle.putInt("intent_pay_end_errcode", paramInt2);
        localBundle.putString("intent_pay_app_url", paramString.AfI);
        localBundle.putString("intent_wap_pay_jump_url", paramString.AfJ);
        localBundle.putBoolean("intent_pay_end", true);
        a.k(paramWalletBaseUI, localBundle);
        if ((!bool) || (!com.tencent.mm.wallet_core.d.h.a(paramWalletBaseUI, paramm, paramInt1, paramInt2, str)) || (paramString.cOW()))
          break label707;
      }
      label449: label705: label707: for (int i = 0; ; i = 1)
      {
        if (i != 0)
          if (((paramWalletBaseUI.dOD() == null) || (!paramWalletBaseUI.dOE().c(paramInt1, paramInt2, str, paramm))) && (!paramWalletBaseUI.c(paramInt1, paramInt2, str, (com.tencent.mm.wallet_core.c.q)paramm)) && (bool))
          {
            if ((paramInt1 != 0) || (paramInt2 != 0))
            {
              lqL = paramInt1;
              lqz = paramInt2;
              hxN = str;
              ab.d("MicroMsg.WalletDispatcher", "wallet base consume this response in the end!");
            }
          }
          else
          {
            if (!paramBoolean)
              break label699;
            ab.d("MicroMsg.WalletDispatcher", "scenes & forcescenes isEmpty! %s", new Object[] { Boolean.valueOf(bool) });
            if (lqz == 0)
              break label687;
            ab.e("MicroMsg.WalletDispatcher", "showAlert! mErrCode : " + lqz);
            if (!(paramm instanceof com.tencent.mm.wallet_core.c.q))
              break label641;
            paramString = ((com.tencent.mm.wallet_core.c.q)paramm).dNP();
            if (bo.isNullOrNil(paramString))
              break label641;
            ab.i("MicroMsg.WalletDispatcher", "error_detail_url is not null ");
            com.tencent.mm.ui.base.h.a(paramWalletBaseUI.mController.ylL, hxN, null, paramWalletBaseUI.getResources().getString(2131304787), paramWalletBaseUI.getResources().getString(2131296994), true, new f.2(paramWalletBaseUI, paramString), new f.3(paramWalletBaseUI));
            dOB();
            e.QS(4);
            paramInt1 = 1;
            if (paramInt1 == 0)
              break label646;
            AppMethodBeat.o(49332);
          }
        while (true)
        {
          return;
          label459: if ((!(paramm instanceof p)) || (!((p)paramm).tpw))
            break label705;
          ab.i("MicroMsg.WalletDispatcher", "delay order pay end");
          localBundle = paramWalletBaseUI.mBundle;
          localBundle.putInt("intent_pay_end_errcode", paramInt2);
          localBundle.putString("intent_pay_app_url", paramString.AfI);
          localBundle.putString("intent_wap_pay_jump_url", paramString.AfJ);
          localBundle.putBoolean("intent_pay_end", true);
          a.k(paramWalletBaseUI, localBundle);
          break;
          ab.d("MicroMsg.WalletDispatcher", "wallet this response havn't error!");
          break label305;
          ab.d("MicroMsg.WalletDispatcher", "wallet base consume this response before subclass!");
          break label305;
          if (((paramWalletBaseUI.dOD() != null) && (paramWalletBaseUI.dOE().c(paramInt1, paramInt2, str, paramm))) || (paramWalletBaseUI.c(paramInt1, paramInt2, str, paramm)) || (!bool))
            break label305;
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            lqL = paramInt1;
            lqz = paramInt2;
            hxN = str;
            ab.d("MicroMsg.WalletDispatcher", "wallet base consume this response in the end!");
            break label305;
          }
          ab.d("MicroMsg.WalletDispatcher", "wallet other scene this response havn't error!");
          break label305;
          paramInt1 = 0;
          break label449;
          ab.i("MicroMsg.WalletDispatcher", "error_detail_url is null ");
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI.mController.ylL, hxN, null, false, new f.1(paramWalletBaseUI, paramm));
          AppMethodBeat.o(49332);
          continue;
          if (!paramWalletBaseUI.bwQ())
            paramWalletBaseUI.AM(0);
          AppMethodBeat.o(49332);
        }
        break;
      }
    }
  }

  public static void dOB()
  {
    lqL = 0;
    lqz = 0;
    hxN = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.f
 * JD-Core Version:    0.6.2
 */