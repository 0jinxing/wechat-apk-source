package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public class WxaBindBizInfoUI extends MMActivity
{
  private ThreeDotsLoadingView iDW;
  private String iJF;
  WxaBindBizInfoUI.a iJG;
  private LoadMoreRecyclerView iJH;
  private View iJI;
  private String mAppId;

  public final int getLayoutId()
  {
    return 2130971240;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133201);
    super.onCreate(paramBundle);
    setBackBtn(new WxaBindBizInfoUI.1(this), 2131230737);
    setMMTitle(2131296779);
    ta(-16777216);
    xE(-855310);
    paramBundle = getIntent().getParcelableArrayListExtra("wxa_entry_info_list");
    this.mAppId = getIntent().getStringExtra("app_id");
    this.iJH = ((LoadMoreRecyclerView)findViewById(2131821796));
    this.iJG = new WxaBindBizInfoUI.a(getLayoutInflater());
    this.iJH.setOnItemClickListener(new MRecyclerView.a()
    {
      public final void I(View paramAnonymousView, int paramAnonymousInt)
      {
        AppMethodBeat.i(133190);
        paramAnonymousView = WxaBindBizInfoUI.this.iJG.pQ(paramAnonymousInt);
        if (paramAnonymousView == null)
          AppMethodBeat.o(133190);
        while (true)
        {
          return;
          Intent localIntent = new Intent();
          localIntent.putExtra("Contact_User", paramAnonymousView.username);
          localIntent.putExtra("key_start_biz_profile_from_app_brand_profile", true);
          localIntent.putExtra("key_use_new_contact_profile", true);
          localIntent.putExtra("force_get_contact", true);
          d.b(WxaBindBizInfoUI.this, "profile", ".ui.ContactInfoUI", localIntent);
          AppMethodBeat.o(133190);
        }
      }
    });
    this.iJG.aN(paramBundle);
    this.iJH.setItemAnimator(null);
    this.iJH.setOnLoadingStateChangedListener(new WxaBindBizInfoUI.3(this));
    this.iJH.setAdapter(this.iJG);
    paramBundle = getLayoutInflater().inflate(2130971241, this.iJH, false);
    this.iDW = ((ThreeDotsLoadingView)paramBundle.findViewById(2131821325));
    this.iDW.dKS();
    this.iJH.setLoadingView(paramBundle);
    this.iJI = getLayoutInflater().inflate(2130971242, this.iJH, false);
    this.iJH.addFooterView(this.iJI);
    this.iJI.setVisibility(8);
    if (this.iJG.getItemCount() > 20)
    {
      this.iJH.fh(true);
      this.iJG.iJM = false;
    }
    this.mController.contentView.setBackgroundColor(-855310);
    AppMethodBeat.o(133201);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.WxaBindBizInfoUI
 * JD-Core Version:    0.6.2
 */