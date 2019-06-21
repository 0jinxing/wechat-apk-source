package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Vibrator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.offline.a.e;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.a.s.b;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class c
{
  Vibrator kgA;
  Activity mActivity;
  a oZn;
  q oZo;
  float oZp = 0.0F;
  int oZq = 20000;

  public c(Activity paramActivity, a parama)
  {
    this.mActivity = paramActivity;
    this.oZn = parama;
  }

  private void Ua(String paramString)
  {
    AppMethodBeat.i(43493);
    ab.i("MicroMsg.OfflineLogicMgr", "showBindNewBankcardDialog msg:".concat(String.valueOf(paramString)));
    com.tencent.mm.ui.base.h.d(this.mActivity, paramString, "", getString(2131305157), getString(2131296868), new c.16(this), new c.17(this));
    AppMethodBeat.o(43493);
  }

  private void Ub(String paramString)
  {
    AppMethodBeat.i(43494);
    ab.i("MicroMsg.OfflineLogicMgr", "goLimitChangeUI msg:".concat(String.valueOf(paramString)));
    com.tencent.mm.ui.base.h.d(this.mActivity, paramString, "", getString(2131305459), getString(2131296868), new c.18(this), new c.2(this));
    AppMethodBeat.o(43494);
  }

  private void Uc(String paramString)
  {
    AppMethodBeat.i(43495);
    ab.i("MicroMsg.OfflineLogicMgr", "goChangeBankcard msg:".concat(String.valueOf(paramString)));
    com.tencent.mm.ui.base.h.d(this.mActivity, paramString, "", getString(2131305435), getString(2131296868), new c.3(this), new c.4(this));
    AppMethodBeat.o(43495);
  }

  public static boolean bXw()
  {
    AppMethodBeat.i(43497);
    k.bXg();
    boolean bool;
    if (k.bXh().oYL != null)
    {
      bool = true;
      AppMethodBeat.o(43497);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43497);
    }
  }

  public final void a(m paramm, int paramInt, String paramString)
  {
    AppMethodBeat.i(43489);
    a(paramm, paramInt, paramString, null);
    AppMethodBeat.o(43489);
  }

  public final void a(m paramm, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(43490);
    ab.i("MicroMsg.OfflineLogicMgr", "handleErrorEvent errCode :" + paramInt + " msg:" + paramString1);
    bXv();
    if (paramInt == 409)
    {
      Ub(paramString1);
      AppMethodBeat.o(43490);
    }
    while (true)
    {
      return;
      if (paramInt == 410)
      {
        Ua(paramString1);
        AppMethodBeat.o(43490);
      }
      else if (paramInt == 413)
      {
        Uc(paramString1);
        AppMethodBeat.o(43490);
      }
      else if (paramInt == 411)
      {
        if ((r.cPI().cQi()) || (r.cPI().cQh()))
        {
          ab.i("MicroMsg.OfflineLogicMgr", "is unreg or simplereg");
          AppMethodBeat.o(43490);
        }
        else
        {
          if ((k.oXK) && ((this.mActivity instanceof WalletOfflineCoinPurseUI)))
            ((WalletOfflineCoinPurseUI)this.mActivity).bXT();
          while (true)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(135L, 1L, 1L, true);
            AppMethodBeat.o(43490);
            break;
            com.tencent.mm.plugin.offline.c.a.c(this.mActivity, paramString1);
          }
        }
      }
      else if ((this.mActivity instanceof WalletBaseUI))
      {
        if (!com.tencent.mm.wallet_core.d.h.a((WalletBaseUI)this.mActivity, paramm, 1000, paramInt, paramString1))
          b.c(this.mActivity, paramString1, paramString2);
        AppMethodBeat.o(43490);
      }
      else
      {
        b.b(this.mActivity, paramString1);
        AppMethodBeat.o(43490);
      }
    }
  }

  public final void a(s.b paramb)
  {
    AppMethodBeat.i(43496);
    if (paramb == null)
      AppMethodBeat.o(43496);
    while (true)
    {
      return;
      ab.i("MicroMsg.OfflineLogicMgr", "showFreeMsg");
      if ("1".equals(paramb.oYP))
        com.tencent.mm.ui.base.h.a(this.mActivity, false, paramb.oYR, "", getString(2131305449), getString(2131296868), new c.5(this), new c.6(this));
      AppMethodBeat.o(43496);
    }
  }

  public final void bXv()
  {
    AppMethodBeat.i(43492);
    if (this.oZo != null)
    {
      this.oZo.dismiss();
      this.oZo = null;
    }
    AppMethodBeat.o(43492);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(43491);
    ab.i("MicroMsg.OfflineLogicMgr", "errType:" + paramInt1 + "  errCode" + paramInt2 + " errMsg:" + paramString + " cgi type:" + paramm.getType());
    e locale;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof e))
      {
        locale = (e)paramm;
        paramString = locale.oXY;
        bXv();
        if ((locale.oXZ != 0) || (TextUtils.isEmpty(paramString)))
          break label150;
        com.tencent.mm.plugin.offline.c.a.a(this.mActivity, paramString, paramm);
        this.mActivity.setResult(-1);
        this.mActivity.finish();
        bool = true;
      }
    while (true)
    {
      AppMethodBeat.o(43491);
      return bool;
      label150: if ((locale.oXZ != 0) && (locale.kCl != 0) && (locale.oYb == 1))
      {
        ab.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
        a(locale, locale.oXZ, locale.oYa);
      }
      bool = true;
      continue;
      if ((paramm instanceof e))
      {
        locale = (e)paramm;
        bXv();
        if (locale.oYb == 1)
        {
          ab.i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
          a(paramm, paramInt2, paramString);
        }
        bool = true;
      }
    }
  }

  final String getString(int paramInt)
  {
    AppMethodBeat.i(43498);
    String str = this.mActivity.getString(paramInt);
    AppMethodBeat.o(43498);
    return str;
  }

  public final void init()
  {
    AppMethodBeat.i(43488);
    this.kgA = ((Vibrator)this.mActivity.getSystemService("vibrator"));
    AppMethodBeat.o(43488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.c
 * JD-Core Version:    0.6.2
 */