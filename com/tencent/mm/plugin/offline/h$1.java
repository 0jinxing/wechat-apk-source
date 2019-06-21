package com.tencent.mm.plugin.offline;

import android.app.Dialog;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.plugin.offline.a.n;
import com.tencent.mm.plugin.offline.a.p;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i.8;

final class h$1 extends com.tencent.mm.wallet_core.d.g
{
  h$1(h paramh, MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.i parami)
  {
    super(paramMMActivity, parami);
  }

  private void bXe()
  {
    AppMethodBeat.i(43329);
    n localn = new n(System.currentTimeMillis(), com.tencent.mm.plugin.offline.c.a.pbe);
    this.Agm.a(localn, false, 1);
    AppMethodBeat.o(43329);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(43327);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.k))
      {
        ab.i("MicroMsg.OfflineProcess", "Offline is Create ");
        bXe();
        h.a(this.oXo).putBoolean("is_offline_create", true);
        AppMethodBeat.o(43327);
        bool = true;
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof n))
      {
        ab.i("MicroMsg.OfflineProcess", "OfflineQueryUser is ok ");
        paramString = this.Agm;
        if ((paramString.gII == null) || ((paramString.gII != null) && (!paramString.gII.isShowing())))
        {
          if (paramString.gII != null)
            paramString.gII.dismiss();
          if (paramString.mContext != null)
            break label174;
          ab.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
        }
        while (true)
        {
          paramString = new uq();
          paramString.cQP.scene = 8;
          paramString.cQQ.cQH = new h.1.1(this);
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
          break;
          label174: paramString.gII = com.tencent.mm.wallet_core.ui.g.a(paramString.mContext, false, new i.8(paramString));
        }
      }
      Object localObject;
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.i))
      {
        paramm = (com.tencent.mm.plugin.offline.a.i)paramm;
        if ("1".equals(paramm.oYi))
        {
          paramString = this.hwd;
          paramm = paramm.cFl;
          localObject = new Bundle();
          ((Bundle)localObject).putParcelable("key_authen", new Authen());
          ((Bundle)localObject).putString("key_pwd1", h.j(this.oXo).getString("key_pwd1"));
          ((Bundle)localObject).putString("key_mobile", paramm);
          ((Bundle)localObject).putInt("verify_scene", 1);
          ((Bundle)localObject).putInt("offline_add_fee", h.k(this.oXo).getInt("offline_chg_fee", 0));
          com.tencent.mm.wallet_core.a.a(paramString, l.class, (Bundle)localObject);
          this.oXo.a(paramString, 0, h.l(this.oXo));
          break;
        }
        h.c(this.oXo).putBoolean("back_to_coin_purse_ui", true);
        bXe();
        break;
      }
      if (!(paramm instanceof p))
        break;
      com.tencent.mm.plugin.offline.c.a.Ud("");
      k.bXg();
      k.bXh().oYL = null;
      this.oXo.a(this.hwd, 0, h.d(this.oXo));
      break;
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.k))
      {
        ab.i("MicroMsg.OfflineProcess", "Offline Create is failed!");
        localObject = (com.tencent.mm.plugin.offline.a.k)paramm;
        if (paramInt2 == 410)
        {
          paramm = this.hwd;
          paramInt1 = ((com.tencent.mm.plugin.offline.a.k)localObject).oYw;
          com.tencent.mm.ui.base.h.d(paramm, paramString, "", paramm.getString(2131305157), paramm.getString(2131296868), new h.1.2(this, paramm, paramInt1), new h.1.3(this, paramm));
          AppMethodBeat.o(43327);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(43327);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    boolean bool = false;
    AppMethodBeat.i(43328);
    String str = (String)paramArrayOfObject[0];
    h.e(this.oXo).putString("key_pwd1", str);
    Object localObject1 = com.tencent.mm.plugin.offline.c.a.bYg();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.OfflineProcess", "no support bank car for offline");
      localObject2 = com.tencent.mm.plugin.offline.c.a.bYh();
    }
    if (localObject2 == null)
    {
      ab.e("MicroMsg.OfflineProcess", "no any bank car for offline");
      AppMethodBeat.o(43328);
    }
    while (true)
    {
      return bool;
      localObject1 = h.f(this.oXo).getString("oper");
      if (!com.tencent.mm.plugin.offline.c.a.bYd())
      {
        ab.i("MicroMsg.OfflineProcess", "Offline is not Create ");
        this.Agm.a(new com.tencent.mm.plugin.offline.a.k((Bankcard)localObject2, (String)paramArrayOfObject[0], h.g(this.oXo).getInt("offline_chg_fee", 0)), true, 1);
      }
      while (true)
      {
        AppMethodBeat.o(43328);
        bool = true;
        break;
        if (localObject1 != null)
        {
          ab.i("MicroMsg.OfflineProcess", "oper == ".concat(String.valueOf(localObject1)));
          if (((String)localObject1).equals("create"))
          {
            this.Agm.a(new com.tencent.mm.plugin.offline.a.k((Bankcard)localObject2, (String)paramArrayOfObject[0], h.h(this.oXo).getInt("offline_chg_fee", 0)), true, 1);
          }
          else if (((String)localObject1).equals("clr"))
          {
            this.Agm.a(new com.tencent.mm.plugin.offline.a.i((Bankcard)localObject2, str, "clr", 0, ""), true, 1);
          }
          else if (((String)localObject1).equals("changeto"))
          {
            this.Agm.a(new com.tencent.mm.plugin.offline.a.i((Bankcard)localObject2, str, "changeto", h.i(this.oXo).getInt("offline_chg_fee"), ""), true, 1);
          }
          else
          {
            if (!((String)localObject1).equals("freeze"))
              break label345;
            this.Agm.a(new p(str), true, 1);
          }
        }
      }
      label345: AppMethodBeat.o(43328);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.h.1
 * JD-Core Version:    0.6.2
 */