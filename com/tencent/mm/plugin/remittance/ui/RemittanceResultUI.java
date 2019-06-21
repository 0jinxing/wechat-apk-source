package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fx;
import com.tencent.mm.plugin.remittance.model.o;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.ow;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class RemittanceResultUI extends WalletBaseUI
{
  private Orders pWy;

  private void at(Class<?> paramClass)
  {
    AppMethodBeat.i(45157);
    if (dOD() == null)
    {
      a(paramClass, getIntent());
      AppMethodBeat.o(45157);
    }
    while (true)
    {
      return;
      dOD().b(this, paramClass, this.mBundle);
      AppMethodBeat.o(45157);
    }
  }

  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45158);
    if ((paramm instanceof o))
    {
      ab.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = (o)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramString.pPe;
        ab.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, retcode: %s, retmsg: %s, exposesureInfo: %s", new Object[] { Integer.valueOf(paramString.kCl), paramString.kCm, paramString.tBw });
        if (paramString.kCl != 0);
      }
    }
    while (true)
    {
      try
      {
        this.mBundle.putByteArray("key_succpage_resp", paramString.toByteArray());
        at(RemittanceResultNewUI.class);
        finish();
        AppMethodBeat.o(45158);
        return bool;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.RemittanceResultUI", paramString, "pass succ page resp error: %s", new Object[] { paramString.getMessage() });
        continue;
      }
      Toast.makeText(this, paramString.kCm, 1).show();
      at(RemittanceResultNewUI.class);
      continue;
      AppMethodBeat.o(45158);
      bool = false;
    }
  }

  protected boolean cgg()
  {
    return true;
  }

  public int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45156);
    super.onCreate(paramBundle);
    PayInfo localPayInfo;
    if (cgg())
    {
      AM(4);
      getWindow().setBackgroundDrawableResource(2131690597);
      this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
      localPayInfo = (PayInfo)this.mBundle.getParcelable("key_pay_info");
      if (localPayInfo == null)
        break label686;
    }
    label640: label650: label663: label686: for (int i = localPayInfo.cIf; ; i = 0)
    {
      boolean bool1;
      boolean bool2;
      if ((i == 31) || (i == 5))
      {
        bool1 = false;
        if (this.pWy != null)
          break label621;
        bool2 = true;
        label93: ab.i("MicroMsg.RemittanceResultUI", "orders==null:%s, paysScene: %s, needFetchF2fData: %s", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i), Boolean.valueOf(bool1) });
        if (this.pWy == null)
          break label650;
        ab.i("MicroMsg.RemittanceResultUI", "is_use_new_paid_succ_page: %s", new Object[] { Integer.valueOf(this.pWy.tAA) });
        if (this.pWy.tAA != 1)
          break label640;
        if (!bool1)
          break label650;
        Object localObject1 = this.pWy;
        if ((localPayInfo == null) || (localPayInfo.vwh == null))
          break label627;
        ab.i("MicroMsg.RemittanceResultUI", "fetch f2f data");
        String str1 = localPayInfo.vwh.getString("extinfo_key_11");
        Object localObject2 = "";
        paramBundle = (Bundle)localObject2;
        if (localObject1 != null)
        {
          paramBundle = (Bundle)localObject2;
          if (((Orders)localObject1).tAq.size() > 0)
            paramBundle = ((Orders.Commodity)((Orders)localObject1).tAq.get(0)).cAa;
        }
        i = localPayInfo.vwh.getInt("extinfo_key_15", 0);
        String str2 = localPayInfo.vwh.getString("extinfo_key_7");
        String str3 = localPayInfo.vwh.getString("extinfo_key_3");
        int j = localPayInfo.vwh.getInt("extinfo_key_12", 0);
        String str4 = localPayInfo.vwh.getString("extinfo_key_13");
        String str5 = localPayInfo.vwh.getString("extinfo_key_14");
        localObject1 = localPayInfo.vwh.getString("extinfo_key_16");
        localObject2 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject2 = paramBundle;
        ab.i("MicroMsg.RemittanceResultUI", "fetchF2fData, f2fid: %s, transid: %s, amount: %s, payerDesc: %s, recvDesc: %s, scanScene: %s, paySuccSign: %s, paySuccExtend: %s, channel: %s, payscene: %s", new Object[] { str1, localObject2, Integer.valueOf(i), str2, str3, Integer.valueOf(j), str4, str5, Integer.valueOf(localPayInfo.cIb), Integer.valueOf(localPayInfo.cIf) });
        nf(2773);
        a(new o(str1, (String)localObject2, i, str2, str3, localPayInfo.cIb, j, str4, str5), true, true);
        label468: i = 0;
        localObject2 = (PayInfo)this.mBundle.getParcelable("key_pay_info");
        if (localObject2 != null)
          i = ((PayInfo)localObject2).cIf;
        if ((i == 33) || (i == 32) || (i == 48) || (i == 31))
        {
          paramBundle = new fx();
          paramBundle.czY.czZ = ((PayInfo)localObject2).czZ;
          if (i != 31)
            break label663;
        }
      }
      for (paramBundle.czY.type = 0; ; paramBundle.czY.type = 1)
        label621: label627: 
        do
        {
          if ((this.pWy != null) && (!this.pWy.tAq.isEmpty()))
            paramBundle.czY.cAa = ((Orders.Commodity)this.pWy.tAq.get(0)).cAa;
          com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
          AppMethodBeat.o(45156);
          return;
          bool1 = true;
          break;
          bool2 = false;
          break label93;
          at(RemittanceResultNewUI.class);
          finish();
          break label468;
          at(RemittanceResultOldUI.class);
          break label468;
          at(RemittanceResultNewUI.class);
          finish();
          break label468;
        }
        while ((i != 32) && (i != 33));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45159);
    super.onDestroy();
    ng(2773);
    AppMethodBeat.o(45159);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultUI
 * JD-Core Version:    0.6.2
 */