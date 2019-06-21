package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.plugin.remittance.model.aa;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@a(19)
public class RemittanceResultOldUI extends RemittanceResultUI
{
  private int pQY;
  private boolean pWA;
  private Orders pWy;
  private String pWz;

  private void cgd()
  {
    AppMethodBeat.i(45151);
    if (this.mBundle.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.mBundle.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
        localBundle.putString("realname_verify_process_jump_plugin", "remittance");
        localRealnameGuideHelper.b(this, localBundle, new RemittanceResultOldUI.2(this));
        this.mBundle.remove("key_realname_guide_helper");
      }
      AppMethodBeat.o(45151);
    }
    while (true)
    {
      return;
      cge();
      AppMethodBeat.o(45151);
    }
  }

  private void cge()
  {
    AppMethodBeat.i(45152);
    dOD().b(this, this.mBundle);
    new ak().postDelayed(new RemittanceResultOldUI.3(this), 100L);
    AppMethodBeat.o(45152);
  }

  private void cgf()
  {
    AppMethodBeat.i(45153);
    ((i)g.K(i.class)).g(this);
    AppMethodBeat.o(45153);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  protected final boolean cgg()
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970518;
  }

  public final void initView()
  {
    int i = 1;
    AppMethodBeat.i(45150);
    setMMTitle(getString(2131302462));
    setBackBtn(null);
    showHomeBtn(false);
    enableBackMenu(false);
    Object localObject1 = (TextView)findViewById(2131827120);
    if (this.pWy != null)
      ((TextView)localObject1).setText(e.e(this.pWy.pTN, this.pWy.pcl));
    Object localObject2 = (PayInfo)this.mBundle.getParcelable("key_pay_info");
    if (localObject2 == null)
    {
      ab.e("MicroMsg.RemittanceResultOldUI", "payInfo is null!!!");
      finish();
      AppMethodBeat.o(45150);
      return;
    }
    localObject1 = "";
    if (((PayInfo)localObject2).vwh != null)
    {
      this.pWA = ((PayInfo)localObject2).vwh.getBoolean("extinfo_key_4");
      localObject1 = ((PayInfo)localObject2).vwh.getString("extinfo_key_1");
    }
    int j = ((PayInfo)localObject2).cIf;
    this.pQY = j;
    this.pWz = ((String)localObject1);
    Object localObject3 = e.mJ((String)localObject1);
    if (j == 31)
    {
      localObject1 = (TextView)findViewById(2131827119);
      localObject3 = getString(2131302461, new Object[] { localObject3 });
      if (!bo.isNullOrNil((String)localObject3))
      {
        ((TextView)localObject1).setText(j.b(this, (CharSequence)localObject3, ((TextView)localObject1).getTextSize()));
        ((TextView)localObject1).setVisibility(0);
      }
      while (true)
      {
        findViewById(2131827123).setVisibility(8);
        if (this.pWy.pPp > 0.0D)
        {
          localObject1 = getResources().getString(2131302459, new Object[] { e.e(this.pWy.pPp, this.pWy.pcl) });
          ((TextView)findViewById(2131827122)).setText((CharSequence)localObject1);
          findViewById(2131827121).setVisibility(0);
        }
        ((Button)findViewById(2131827130)).setOnClickListener(new RemittanceResultOldUI.1(this));
        cgf();
        AppMethodBeat.o(45150);
        break;
        ((TextView)localObject1).setVisibility(8);
      }
    }
    localObject1 = "";
    if (((PayInfo)localObject2).vwh != null)
      localObject1 = ((PayInfo)localObject2).vwh.getString("extinfo_key_2");
    if ((j != 32) && (j != 33))
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject1 = e.att((String)localObject1);
        localObject1 = (String)localObject3 + "（" + (String)localObject1 + "）";
      }
    while (true)
    {
      label425: localObject3 = (TextView)findViewById(2131827119);
      label478: View localView;
      Object localObject4;
      Object localObject5;
      if (!bo.isNullOrNil((String)localObject1))
      {
        ((TextView)localObject3).setText(j.b(this, getString(2131302460, new Object[] { localObject1 }), ((TextView)localObject3).getTextSize()));
        ((TextView)localObject3).setVisibility(0);
        if ((j != 33) && (j != 32))
          break label793;
        localView = findViewById(2131827124);
        localObject4 = (TextView)findViewById(2131827125);
        localObject3 = (TextView)findViewById(2131827126);
        localObject1 = ((PayInfo)localObject2).vwh.getString("extinfo_key_3");
        localObject5 = ((PayInfo)localObject2).vwh.getString("extinfo_key_8");
        if (bo.isNullOrNil((String)localObject1))
          break label767;
        ((TextView)localObject3).setText(j.b(this, (CharSequence)localObject1, ((TextView)localObject3).getTextSize()));
        localView.setVisibility(0);
        if (bo.isNullOrNil((String)localObject5))
          break label877;
        ((TextView)localObject4).setText((CharSequence)localObject5);
        j = 1;
      }
      while (true)
      {
        label594: localObject3 = findViewById(2131827127);
        localObject5 = (TextView)findViewById(2131827128);
        localObject1 = (TextView)findViewById(2131827129);
        localObject4 = ((PayInfo)localObject2).vwh.getString("extinfo_key_6");
        localObject2 = ((PayInfo)localObject2).vwh.getString("extinfo_key_7");
        if (!bo.isNullOrNil((String)localObject2))
        {
          ((TextView)localObject1).setText(j.b(this, (CharSequence)localObject2, ((TextView)localObject1).getTextSize()));
          ((TextView)localObject1).setVisibility(0);
          k = i;
          if (!bo.isNullOrNil((String)localObject4))
            ((TextView)localObject5).setText(j.b(this, (CharSequence)localObject4, ((TextView)localObject5).getTextSize()));
        }
        for (int k = i; ; k = 0)
        {
          if ((j != 0) || (k != 0))
            break label791;
          findViewById(2131827123).setVisibility(8);
          break;
          localObject1 = (String)localObject3 + getString(2131302478);
          break label425;
          ((TextView)localObject3).setVisibility(8);
          break label478;
          label767: localView.setVisibility(8);
          j = 0;
          break label594;
          ((View)localObject3).setVisibility(8);
        }
        label791: break;
        label793: if ((j != 5) || (this.pWy.tAq == null) || (this.pWy.tAq.get(0) == null) || (TextUtils.isEmpty(((Orders.Commodity)this.pWy.tAq.get(0)).pca)))
          break;
        ((TextView)localObject3).setText(((Orders.Commodity)this.pWy.tAq.get(0)).pca);
        break;
        label877: j = 1;
      }
      localObject1 = localObject3;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45148);
    super.onCreate(paramBundle);
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    initView();
    if (this.pQY == 31)
    {
      paramBundle = "";
      if (this.pWy.tAq.size() > 0)
        paramBundle = ((Orders.Commodity)this.pWy.tAq.get(0)).cAa;
      ab.i("MicroMsg.RemittanceResultOldUI", "transId: %s", new Object[] { paramBundle });
      com.tencent.mm.plugin.remittance.a.c.ceW().ceZ().fN(paramBundle, this.pWz);
    }
    AppMethodBeat.o(45148);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45149);
    if (paramInt == 4)
      cgd();
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(45149);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI
 * JD-Core Version:    0.6.2
 */