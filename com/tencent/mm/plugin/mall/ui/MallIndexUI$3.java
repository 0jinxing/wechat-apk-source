package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.g.a.uq.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.wallet_core.c.k;
import com.tencent.mm.wallet_core.tenpay.model.m;

final class MallIndexUI$3
  implements Runnable
{
  boolean ftW = false;

  MallIndexUI$3(MallIndexUI paramMallIndexUI, uq paramuq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43207);
    ab.d("MicorMsg.MallIndexUI", "mUserInfo needBind : " + MallIndexUI.e(this.onu).cQU + " hasNewTips : " + MallIndexUI.e(this.onu).cQV + " swipeOn : " + MallIndexUI.e(this.onu).cQW);
    if ((MallIndexUI.f(this.onu)) || (this.onu.mController.ylL.isFinishing()))
    {
      ab.e("MicorMsg.MallIndexUI", "error for callback ac finish");
      AppMethodBeat.o(43207);
      return;
    }
    ab.i("MicorMsg.MallIndexUI", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", new Object[] { Boolean.valueOf(this.onv.cQQ.cRt), Boolean.valueOf(this.ftW) });
    MallIndexUI.a(this.onu, this.onv.cQQ);
    int i;
    label177: Object localObject1;
    Object localObject2;
    boolean bool1;
    if (MallIndexUI.e(this.onu).cRu != null)
    {
      i = 1;
      if ((i & MallIndexUI.e(this.onu).cRu instanceof m) != 0)
      {
        localObject1 = (m)MallIndexUI.e(this.onu).cRu;
        if (((m)localObject1).bLD())
          ((com.tencent.mm.wallet_core.c.q)localObject1).nYe.a(this.onu, new MallIndexUI.3.1(this));
      }
      if (MallIndexUI.e(this.onu).errCode == 0)
      {
        this.onu.bNm();
        this.onu.bNi();
        localObject2 = this.onu;
        ab.i("MicorMsg.MallIndexUI", "showGetNewWalletTip call");
        if ((((MallIndexUI)localObject2).onh == null) || ((!((MallIndexUI)localObject2).onh.cQT) && (!((MallIndexUI)localObject2).onh.cQZ)))
          break label763;
        bool1 = r.cPI().cQo().cQa();
        localObject1 = g.RP().Ry().get(ac.a.xML, Boolean.FALSE);
        if (localObject1 == null)
          break label795;
      }
    }
    label780: label795: for (boolean bool2 = ((Boolean)localObject1).booleanValue(); ; bool2 = false)
    {
      ab.i("MicorMsg.MallIndexUI", "showGetNewWalletTip hadShow=" + bool2 + ";isswc=" + bool1);
      if ((!bool2) && (bool1))
      {
        g.RP().Ry().set(ac.a.xML, Boolean.TRUE);
        localObject1 = new c.a((Context)localObject2);
        localObject2 = LayoutInflater.from((Context)localObject2).inflate(2130971175, null, false);
        ImageView localImageView = (ImageView)((View)localObject2).findViewById(2131829070);
        TextView localTextView = (TextView)((View)localObject2).findViewById(2131829071);
        localImageView.setImageResource(2130840749);
        localTextView.setText(2131301325);
        ((c.a)localObject1).rd(true);
        ((c.a)localObject1).rc(false);
        ((c.a)localObject1).fn((View)localObject2);
        ((c.a)localObject1).PV(2131305379);
        ((c.a)localObject1).Qc(2131305646);
        ((c.a)localObject1).aMb().show();
      }
      label501: if (!this.ftW)
        MallIndexUI.bNn();
      MallIndexUI.b(this.onu, MallIndexUI.e(this.onu));
      this.onu.bNk();
      ab.i("MicorMsg.MallIndexUI", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", new Object[] { Integer.valueOf(MallIndexUI.e(this.onu).cRq), Boolean.valueOf(MallIndexUI.e(this.onu).cRr), MallIndexUI.e(this.onu).cRs });
      localObject1 = this.onu;
      if (MallIndexUI.e(this.onu).cRq == 1)
      {
        bool2 = true;
        label612: MallIndexUI.a((MallIndexUI)localObject1, bool2);
        MallIndexUI.b(this.onu, MallIndexUI.e(this.onu).cRr);
        MallIndexUI.a(this.onu, MallIndexUI.e(this.onu).cRs);
        if (MallIndexUI.g(this.onu) != null)
        {
          if (!MallIndexUI.h(this.onu))
            break label780;
          MallIndexUI.g(this.onu).setVisibility(0);
        }
      }
      while (true)
      {
        localObject1 = this.onu;
        localObject2 = new ai();
        ((MallIndexUI)localObject1).onl.a(new MallIndexUI.4((MallIndexUI)localObject1), ((ai)localObject2).cQe());
        if ((this.onv.cQQ.cRt) && (this.ftW))
          this.onu.cu();
        this.ftW = true;
        AppMethodBeat.o(43207);
        break;
        i = 0;
        break label177;
        label763: ab.e("MicorMsg.MallIndexUI", "user is not reg or simplereg，should not show this dialog");
        break label501;
        bool2 = false;
        break label612;
        MallIndexUI.g(this.onu).setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.3
 * JD-Core Version:    0.6.2
 */