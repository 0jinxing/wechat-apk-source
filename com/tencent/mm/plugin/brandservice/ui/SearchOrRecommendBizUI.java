package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.m.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper.a;

public class SearchOrRecommendBizUI extends MMActivity
  implements BizSearchResultItemContainer.b
{
  private int emC = 0;
  private BizSearchResultItemContainer jKU;
  private ProgressDialog jMB = null;
  private int jMC = 0;
  private SearchViewNotRealTimeHelper jMD;

  private void aWk()
  {
    AppMethodBeat.i(14052);
    this.jMD = ((SearchViewNotRealTimeHelper)findViewById(2131823137));
    this.jMD.setSearchColor(getResources().getColor(2131690316));
    this.jMD.setSearchHint(getString(2131298762));
    this.jMD.setSearchHintColor(getResources().getColor(2131690163));
    this.jMD.setSearchIcon(0);
    this.jMD.setShowBackIcon(false);
    this.jMD.setCallBack(new SearchViewNotRealTimeHelper.a()
    {
      public final void FD(String paramAnonymousString)
      {
        AppMethodBeat.i(14046);
        if (!bo.isNullOrNil(paramAnonymousString))
        {
          SearchOrRecommendBizUI.this.aqX();
          SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this).bH(paramAnonymousString, 0);
          AppMethodBeat.o(14046);
        }
        while (true)
        {
          return;
          h.bQ(SearchOrRecommendBizUI.this.mController.ylL, SearchOrRecommendBizUI.this.getString(2131298758));
          AppMethodBeat.o(14046);
        }
      }

      public final void aWl()
      {
        AppMethodBeat.i(14047);
        SearchOrRecommendBizUI.this.showVKB();
        AppMethodBeat.o(14047);
      }

      public final boolean vN(String paramAnonymousString)
      {
        AppMethodBeat.i(14045);
        FD(paramAnonymousString);
        AppMethodBeat.o(14045);
        return true;
      }
    });
    AppMethodBeat.o(14052);
  }

  public final void aWc()
  {
    AppMethodBeat.i(14053);
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.jMB = h.b(localAppCompatActivity, getString(2131298760), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(14048);
        paramAnonymousDialogInterface = SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this);
        g.Rg().c(paramAnonymousDialogInterface.jLr);
        paramAnonymousDialogInterface.jLp.jLC = false;
        AppMethodBeat.o(14048);
      }
    });
    AppMethodBeat.o(14053);
  }

  public final void aWd()
  {
    AppMethodBeat.i(14054);
    if (this.jMB != null)
    {
      this.jMB.dismiss();
      this.jMB = null;
    }
    AppMethodBeat.o(14054);
  }

  public final int getLayoutId()
  {
    return 2130969238;
  }

  public final void initView()
  {
    AppMethodBeat.i(14051);
    setMMTitle(2131298762);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(14043);
        SearchOrRecommendBizUI.this.aqX();
        SearchOrRecommendBizUI.this.finish();
        AppMethodBeat.o(14043);
        return true;
      }
    });
    aWk();
    this.jKU = ((BizSearchResultItemContainer)findViewById(2131821800));
    this.jKU.setOnTouchListener(new SearchOrRecommendBizUI.4(this));
    f localf = new f(this);
    localf.jMx = com.tencent.mm.plugin.brandservice.b.f.aVW();
    this.jKU.setAdapter(localf);
    this.jKU.setBusinessTypes(new long[] { 1L });
    this.jKU.setDisplayArgs$25decb5(false);
    this.jKU.setMode(1);
    this.jKU.setScene(this.emC);
    this.jKU.setIOnSearchStateChangedListener(this);
    AppMethodBeat.o(14051);
  }

  public void onCreate(final Bundle paramBundle)
  {
    AppMethodBeat.i(14049);
    super.onCreate(paramBundle);
    this.jMC = getIntent().getIntExtra("intent_extra_entry_flag", 0);
    this.emC = getIntent().getIntExtra("fromScene", 0);
    initView();
    if (com.tencent.mm.plugin.brandservice.b.f.aVV())
    {
      g.Rg().a(456, new SearchOrRecommendBizUI.1(this));
      g.Rg().a(new com.tencent.mm.plugin.brandservice.b.f(), 0);
    }
    paramBundle = getIntent().getStringExtra("Search_Str");
    if (!bo.isNullOrNil(paramBundle))
      new ak(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(14042);
          SearchOrRecommendBizUI.b(SearchOrRecommendBizUI.this).setSearchContent(paramBundle);
          SearchOrRecommendBizUI.b(SearchOrRecommendBizUI.this).zHm.performClick();
          AppMethodBeat.o(14042);
        }
      });
    AppMethodBeat.o(14049);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(14050);
    super.onDestroy();
    z.afb().aeL();
    AppMethodBeat.o(14050);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI
 * JD-Core Version:    0.6.2
 */