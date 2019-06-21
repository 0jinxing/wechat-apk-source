package com.tencent.mm.ui.chatting.gallery;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.e.b.a;
import com.tencent.mm.ui.chatting.e.b.b;
import com.tencent.mm.ui.chatting.i.a;

public class AppBrandHistoryListUI extends MMActivity
  implements b.b
{
  private RecyclerView aiB;
  private String emo;
  private TextView emq;
  private ProgressDialog kvA;
  private b.a yTE;

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(31958);
    ab.i("MicroMsg.AppBrandHistoryListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kvA = p.b(this, getString(2131300968), true, null);
      AppMethodBeat.o(31958);
    }
    while (true)
    {
      return;
      if ((this.kvA != null) && (this.kvA.isShowing()))
      {
        this.kvA.dismiss();
        this.kvA = null;
      }
      AppMethodBeat.o(31958);
    }
  }

  public final void ch(String paramString, boolean paramBoolean)
  {
  }

  public final void dFL()
  {
    AppMethodBeat.i(31955);
    fE(true);
    AppMethodBeat.o(31955);
  }

  public final int getLayoutId()
  {
    return 2130968763;
  }

  public final void initView()
  {
    AppMethodBeat.i(31953);
    setMMTitle(getString(2131298024));
    this.emq = ((TextView)findViewById(2131821477));
    this.aiB = ((RecyclerView)findViewById(2131821478));
    this.aiB.setBackgroundColor(-1);
    this.aiB.setLayoutManager(this.yTE.bfC());
    this.aiB.setAdapter(this.yTE.aru(this.emo));
    this.aiB.setHasFixedSize(true);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(31951);
        AppBrandHistoryListUI.this.finish();
        AppMethodBeat.o(31951);
        return true;
      }
    });
    AppMethodBeat.o(31953);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(31952);
    super.onCreate(paramBundle);
    this.emo = getIntent().getStringExtra("Chat_User");
    new a(this).a(this);
    initView();
    this.yTE.dFH();
    if (t.kH(this.emo))
    {
      h.pYm.e(14562, new Object[] { this.emo, Integer.valueOf(0) });
      AppMethodBeat.o(31952);
    }
    while (true)
    {
      return;
      h.pYm.e(14562, new Object[] { this.emo, Integer.valueOf(1) });
      AppMethodBeat.o(31952);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(31954);
    super.onDestroy();
    this.yTE.onDetach();
    AppMethodBeat.o(31954);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(31957);
    ab.i("MicroMsg.AppBrandHistoryListUI", "[onRefreshed]");
    finish();
    AppMethodBeat.o(31957);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(31956);
    fE(false);
    ab.i("MicroMsg.AppBrandHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      this.emq.setVisibility(0);
      this.aiB.setVisibility(8);
      this.emq.setText(getString(2131298210));
      AppMethodBeat.o(31956);
    }
    while (true)
    {
      return;
      this.emq.setVisibility(8);
      this.aiB.setVisibility(0);
      this.aiB.getAdapter().ar(0, paramInt);
      AppMethodBeat.o(31956);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.AppBrandHistoryListUI
 * JD-Core Version:    0.6.2
 */