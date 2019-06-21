package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

final class WalletBankcardManageUI$9
  implements AdapterView.OnItemClickListener
{
  WalletBankcardManageUI$9(WalletBankcardManageUI paramWalletBankcardManageUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(45773);
    paramAdapterView = (Bankcard)paramAdapterView.getAdapter().getItem(paramInt);
    com.tencent.mm.wallet_core.ui.e.QS(18);
    a locala;
    label58: Object localObject;
    if (paramAdapterView != null)
    {
      locala = WalletBankcardManageUI.b(this.tlZ);
      if ((locala.tlo == null) || (locala.tlo.isEmpty()))
      {
        break label253;
        if (!paramAdapterView.cPb())
          break label382;
        if (paramAdapterView.field_wxcreditState != 0)
          break label353;
        if ((b.b(paramAdapterView)) && (paramAdapterView != null))
        {
          g.RQ();
          localObject = (String)g.RP().Ry().get(196659, null);
          paramView = new StringBuilder();
          if (TextUtils.isEmpty((CharSequence)localObject))
            break label341;
          paramView.append((String)localObject);
          paramView.append("&");
          paramView.append(paramAdapterView.field_bankcardType);
          label143: g.RQ();
          g.RP().Ry().set(196659, paramView.toString());
        }
        paramView = new Bundle();
        paramView.putParcelable("key_bankcard", paramAdapterView);
        paramView.putString("key_bank_username", paramAdapterView.field_bizUsername);
        paramView.putString("key_bank_type", paramAdapterView.field_bankcardType);
        com.tencent.mm.wallet_core.a.a(this.tlZ, "WXCreditOpenProcess", paramView, null);
        label208: h.pYm.e(14422, new Object[] { Integer.valueOf(1), paramAdapterView.field_bankcardType });
        AppMethodBeat.o(45773);
      }
    }
    while (true)
    {
      return;
      localObject = locala.tlo.iterator();
      label253: if (!((Iterator)localObject).hasNext())
        break label58;
      paramView = (String)((Iterator)localObject).next();
      if (!paramView.equals(paramAdapterView.field_bindSerial))
        break;
      ab.d("MicroMsg.BankcardListAdapter", "remove new: %s", new Object[] { paramView });
      locala.tlo.remove(paramView);
      g.RQ();
      g.RP().Ry().set(ac.a.xSN, bo.c(locala.tlo, ","));
      break label58;
      label341: paramView.append(paramAdapterView.field_bankcardType);
      break label143;
      label353: paramView = new Bundle();
      paramView.putParcelable("key_bankcard", paramAdapterView);
      com.tencent.mm.wallet_core.a.a(this.tlZ, "WXCreditManagerProcess", paramView, null);
      break label208;
      label382: if (paramAdapterView.cPg())
      {
        ab.i("MicroMsg.WalletBankcardManageUI", "do honey pay card back");
        paramView = new Intent();
        paramView.putExtra("key_card_no", paramAdapterView.field_bindSerial);
        d.b(this.tlZ, "honey_pay", ".ui.HoneyPayCardBackUI", paramView);
        break label208;
      }
      paramView = r.cPI().cQo();
      if ((paramView.tCP & 0x1000) > 0);
      for (boolean bool = true; ; bool = false)
      {
        ab.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramView.tCP) });
        if (!bool)
          break label626;
        ab.i("MicroMsg.WalletBankcardManageUI", "jump to H5 bankcard detail page");
        g.RQ();
        paramView = (String)g.RP().Ry().get(ac.a.xNy, "");
        g.RQ();
        long l = ((Long)g.RP().Ry().get(ac.a.xNz, Long.valueOf(0L))).longValue();
        paramLong = System.currentTimeMillis() / 1000L;
        if ((bo.isNullOrNil(paramView)) || (paramLong - l >= 7200L))
          break label599;
        ab.i("MicroMsg.WalletBankcardManageUI", "bank's url is not null");
        this.tlZ.c(paramAdapterView);
        break;
      }
      label599: ab.i("MicroMsg.WalletBankcardManageUI", "listen BankcardLogoReadyEvent for newest url");
      com.tencent.mm.sdk.b.a.xxA.c(new WalletBankcardManageUI.9.1(this, paramAdapterView));
      break label208;
      label626: this.tlZ.d(paramAdapterView);
      break label208;
      this.tlZ.cNv();
      h.pYm.e(14422, new Object[] { Integer.valueOf(2) });
      AppMethodBeat.o(45773);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.9
 * JD-Core Version:    0.6.2
 */