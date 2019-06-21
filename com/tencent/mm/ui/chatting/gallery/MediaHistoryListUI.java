package com.tencent.mm.ui.chatting.gallery;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.chatting.e.b.a;
import com.tencent.mm.ui.chatting.e.b.b;
import com.tencent.mm.ui.chatting.i.g;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MediaHistoryListUI extends MMActivity
  implements b.b
{
  private RecyclerView aiB;
  private String emo;
  private TextView emq;
  private ProgressDialog kvA;
  private b.a yTE;
  private com.tencent.mm.modelvoiceaddr.ui.b yXV;

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(32451);
    ab.i("MicroMsg.MediaHistoryListUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.kvA = p.b(this, getString(2131300968), true, null);
      AppMethodBeat.o(32451);
    }
    while (true)
    {
      return;
      if ((this.kvA != null) && (this.kvA.isShowing()))
      {
        this.kvA.dismiss();
        this.kvA = null;
      }
      AppMethodBeat.o(32451);
    }
  }

  public final void ch(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(32450);
    if (paramBoolean)
    {
      String str = getString(2131298214, new Object[] { paramString });
      this.emq.setVisibility(0);
      this.aiB.setVisibility(8);
      TextView localTextView = this.emq;
      this.emq.getContext();
      localTextView.setText(com.tencent.mm.plugin.fts.a.f.a(str, paramString));
      AppMethodBeat.o(32450);
    }
    while (true)
    {
      return;
      this.emq.setVisibility(8);
      this.aiB.setVisibility(0);
      AppMethodBeat.o(32450);
    }
  }

  public final void dFL()
  {
    AppMethodBeat.i(32447);
    fE(true);
    AppMethodBeat.o(32447);
  }

  public final int getLayoutId()
  {
    return 2130970080;
  }

  public final void initView()
  {
    AppMethodBeat.i(32440);
    this.yXV = new com.tencent.mm.modelvoiceaddr.ui.b();
    this.yXV.qQ(false);
    this.yXV.a(this.yTE.dFJ());
    this.yXV.gcl = false;
    this.emq = ((TextView)findViewById(2131821477));
    this.aiB = ((RecyclerView)findViewById(2131821478));
    findViewById(2131821476).setBackgroundColor(-1);
    this.aiB.setBackgroundColor(-1);
    this.aiB.setLayoutManager(this.yTE.bfC());
    this.aiB.a(this.yTE.dFG());
    this.aiB.setAdapter(this.yTE.aru(this.emo));
    this.aiB.setHasFixedSize(true);
    setMMTitle(this.yTE.aoy());
    AppMethodBeat.o(32440);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(32446);
    super.onBackPressed();
    finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(32446);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(32439);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    this.emo = getIntent().getStringExtra("kintent_talker");
    int i = getIntent().getIntExtra("key_media_type", -1);
    paramBundle = null;
    switch (i)
    {
    default:
      if (paramBundle == null)
      {
        ab.e("MicroMsg.MediaHistoryListUI", "[onCreate] presenter is null!");
        AppMethodBeat.o(32439);
      }
      break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return;
      paramBundle = new com.tencent.mm.ui.chatting.i.d(this);
      break;
      paramBundle = new com.tencent.mm.ui.chatting.i.h(this);
      break;
      paramBundle = new com.tencent.mm.ui.chatting.i.f(this);
      break;
      paramBundle = new g(this);
      break;
      paramBundle = new com.tencent.mm.ui.chatting.i.a(this);
      break;
      paramBundle.a(this);
      xE(android.support.v4.content.b.i(this.mController.ylL, 2131690310));
      dyb();
      initView();
      this.yTE.dFH();
      boolean bool = t.kH(this.emo);
      aw.ZK();
      paramBundle = c.XV().ob(this.emo);
      if (bool)
      {
        if (this.yTE.getType() == 6)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramBundle.afg().size()), Integer.valueOf(1) });
          AppMethodBeat.o(32439);
        }
        else if (this.yTE.getType() == -1)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(paramBundle.afg().size()), Integer.valueOf(1) });
          AppMethodBeat.o(32439);
        }
        else if (this.yTE.getType() == 3)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(paramBundle.afg().size()), Integer.valueOf(1) });
          AppMethodBeat.o(32439);
        }
        else if (this.yTE.getType() == 5)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramBundle.afg().size()), Integer.valueOf(1), Integer.valueOf(1) });
          AppMethodBeat.o(32439);
        }
        else if (this.yTE.getType() == 33)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramBundle.afg().size()), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(8) });
          AppMethodBeat.o(32439);
        }
      }
      else if (this.yTE.getType() == 6)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(32439);
      }
      else if (this.yTE.getType() == -1)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(32439);
      }
      else if (this.yTE.getType() == 3)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(32439);
      }
      else if (this.yTE.getType() == 5)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        AppMethodBeat.o(32439);
      }
      else
      {
        if (this.yTE.getType() == 33)
          com.tencent.mm.plugin.report.service.h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(8) });
        AppMethodBeat.o(32439);
      }
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(32443);
    this.yXV.a(this, paramMenu);
    com.tencent.mm.modelvoiceaddr.ui.b localb = this.yXV;
    paramMenu = this.yTE.dFK();
    if ((localb.zGZ != null) && (!bo.isNullOrNil(paramMenu)))
      localb.zGZ.setSelectedTag(paramMenu);
    this.mController.contentView.postDelayed(new MediaHistoryListUI.1(this), 200L);
    AppMethodBeat.o(32443);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(32441);
    super.onDestroy();
    this.yTE.onDetach();
    AppMethodBeat.o(32441);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(32449);
    ab.i("MicroMsg.MediaHistoryListUI", "[onRefreshed]");
    finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(32449);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(32445);
    boolean bool;
    if (paramKeyEvent.getAction() == 4)
    {
      finish();
      overridePendingTransition(0, 0);
      bool = true;
      AppMethodBeat.o(32445);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(32445);
    }
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(32442);
    super.onKeyboardStateChanged();
    if (this.mController.ymc == 2)
      this.yXV.clearFocus();
    AppMethodBeat.o(32442);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(32444);
    this.yXV.a(this, paramMenu);
    AppMethodBeat.o(32444);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(32448);
    fE(false);
    ab.i("MicroMsg.MediaHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramInt <= 0)
    {
      this.emq.setVisibility(0);
      this.aiB.setVisibility(8);
      this.emq.setText(getString(2131298210));
      AppMethodBeat.o(32448);
    }
    while (true)
    {
      return;
      this.emq.setVisibility(8);
      this.aiB.setVisibility(0);
      this.aiB.getAdapter().aop.notifyChanged();
      AppMethodBeat.o(32448);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI
 * JD-Core Version:    0.6.2
 */