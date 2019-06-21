package com.tencent.mm.plugin.downloader_app.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.downloader_app.b.j;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import java.util.LinkedList;

public class DownloadMainUI extends MMActivity
{
  private View emz;
  private com.tencent.mm.plugin.downloader.c.a.a.f kOV;
  TaskListView kQc;
  private DeleteTaskFooterView kQd;
  private TaskManagerHeaderView kQe;
  private View kQf;
  private boolean kQg;
  private boolean kQh;
  private com.tencent.mm.plugin.downloader_app.b.f kQi;
  private boolean kQj = false;
  private String mAppId;

  private void Kh()
  {
    AppMethodBeat.i(136243);
    d.xDG.execute(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(136229);
        DownloadMainUI.a(DownloadMainUI.this, com.tencent.mm.plugin.downloader_app.b.g.biM());
        al.d(new DownloadMainUI.4.1(this));
        boolean bool = DownloadMainUI.a(DownloadMainUI.this, DownloadMainUI.d(DownloadMainUI.this));
        if ((DownloadMainUI.e(DownloadMainUI.this)) || (bool))
        {
          DownloadMainUI.this.c(j.biP(), null);
          AppMethodBeat.o(136229);
        }
        while (true)
        {
          return;
          LinkedList localLinkedList = j.biP();
          if (!localLinkedList.contains(DownloadMainUI.d(DownloadMainUI.this)))
            localLinkedList.add(DownloadMainUI.d(DownloadMainUI.this));
          DownloadMainUI.this.c(localLinkedList, DownloadMainUI.d(DownloadMainUI.this));
          l.q(new DownloadMainUI.4.2(this));
          AppMethodBeat.o(136229);
        }
      }
    });
    AppMethodBeat.o(136243);
  }

  private void a(com.tencent.mm.plugin.downloader_app.b.f paramf, boolean paramBoolean)
  {
    AppMethodBeat.i(136245);
    com.tencent.mm.plugin.downloader.c.a.a.f localf;
    if (paramf != null)
    {
      localf = paramf.kOV;
      this.kOV = localf;
      if ((paramf != null) && (!paramf.biL()))
        break label50;
      if (paramBoolean)
        gk(true);
      AppMethodBeat.o(136245);
    }
    while (true)
    {
      return;
      localf = null;
      break;
      label50: paramf = paramf.O(j.biP());
      if (bo.ek(paramf))
      {
        gk(true);
        AppMethodBeat.o(136245);
      }
      else
      {
        gk(false);
        this.kQc.setData(paramf);
        AppMethodBeat.o(136245);
      }
    }
  }

  public final void c(LinkedList<String> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(136244);
    com.tencent.mm.plugin.downloader_app.b.g.a(paramLinkedList, new DownloadMainUI.8(this, paramString));
    AppMethodBeat.o(136244);
  }

  public final int getLayoutId()
  {
    return 2130969300;
  }

  public final void gj(boolean paramBoolean)
  {
    AppMethodBeat.i(136246);
    DeleteTaskFooterView localDeleteTaskFooterView = this.kQd;
    localDeleteTaskFooterView.kPZ = paramBoolean;
    if (localDeleteTaskFooterView.kPZ)
    {
      localDeleteTaskFooterView.kPV.setImageResource(2130838331);
      AppMethodBeat.o(136246);
    }
    while (true)
    {
      return;
      localDeleteTaskFooterView.kPV.setImageResource(2130838332);
      AppMethodBeat.o(136246);
    }
  }

  final void gk(boolean paramBoolean)
  {
    AppMethodBeat.i(136247);
    if (paramBoolean)
      if ((this.kQf instanceof ViewStub))
      {
        this.kQf = ((ViewStub)this.kQf).inflate();
        this.kQf.setVisibility(0);
      }
    while (true)
    {
      if (paramBoolean)
      {
        this.kQf.setVisibility(0);
        ((NoTaskLayout)this.kQf).setData(this.kOV);
      }
      AppMethodBeat.o(136247);
      return;
      if (!(this.kQf instanceof ViewStub))
        this.kQf.setVisibility(8);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(136242);
    int i;
    if (this.kQc != null)
    {
      TaskListView localTaskListView = this.kQc;
      if (localTaskListView.kRb)
      {
        localTaskListView.biU();
        i = 1;
        if (i == 0)
          break label47;
        AppMethodBeat.o(136242);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label47: super.onBackPressed();
      AppMethodBeat.o(136242);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(136237);
    super.onCreate(paramBundle);
    overridePendingTransition(MMFragmentActivity.a.yng, MMFragmentActivity.a.ynh);
    ab.i("MicroMsg.DownloadMainUI", "onCreate: " + System.currentTimeMillis());
    this.kQh = true;
    xE(getResources().getColor(2131689971));
    dyc();
    setMMTitle(2131305625);
    setBackBtn(new DownloadMainUI.1(this));
    addIconOptionMenu(0, 2131230741, new DownloadMainUI.2(this));
    this.kQc = ((TaskListView)findViewById(2131820986));
    this.kQd = ((DeleteTaskFooterView)findViewById(2131823319));
    this.kQc.kRa = new DownloadMainUI.a()
    {
      public final void gl(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(136226);
        if (paramAnonymousBoolean)
        {
          DownloadMainUI.a(DownloadMainUI.this).setVisibility(0);
          DownloadMainUI.a(DownloadMainUI.this).startAnimation(AnimationUtils.loadAnimation(DownloadMainUI.this, 2131034149));
          DownloadMainUI.b(DownloadMainUI.this).setVisibility(0);
          DownloadMainUI.b(DownloadMainUI.this).startAnimation(AnimationUtils.loadAnimation(DownloadMainUI.this, 2131034285));
          AppMethodBeat.o(136226);
        }
        while (true)
        {
          return;
          DownloadMainUI.a(DownloadMainUI.this).setVisibility(8);
          DownloadMainUI.a(DownloadMainUI.this).startAnimation(AnimationUtils.loadAnimation(DownloadMainUI.this, 2131034150));
          DownloadMainUI.b(DownloadMainUI.this).setVisibility(8);
          DownloadMainUI.b(DownloadMainUI.this).startAnimation(AnimationUtils.loadAnimation(DownloadMainUI.this, 2131034286));
          AppMethodBeat.o(136226);
        }
      }
    };
    this.kQe = ((TaskManagerHeaderView)findViewById(2131822020));
    this.kQf = findViewById(2131823320);
    this.mAppId = getIntent().getStringExtra("appId");
    this.kQj = getIntent().getBooleanExtra("view_task", false);
    com.tencent.mm.pluginsdk.model.app.g.bT(this.mAppId, true);
    Kh();
    com.tencent.mm.plugin.downloader_app.c.a.a(10, 0, 0, 1, "", "", "");
    AppMethodBeat.o(136237);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(136241);
    super.onDestroy();
    com.tencent.mm.plugin.downloader_app.b.g.kOX = null;
    AppMethodBeat.o(136241);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(136240);
    setIntent(paramIntent);
    this.kQc.biU();
    this.mAppId = paramIntent.getStringExtra("appId");
    this.kQj = paramIntent.getBooleanExtra("view_task", false);
    com.tencent.mm.pluginsdk.model.app.g.bT(this.mAppId, true);
    Kh();
    AppMethodBeat.o(136240);
  }

  public void onPause()
  {
    AppMethodBeat.i(136239);
    super.onPause();
    if (this.kQi != null)
    {
      com.tencent.mm.plugin.downloader_app.b.f localf = this.kQi;
      ((com.tencent.mm.plugin.game.commlib.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.commlib.a.a.class)).a("pb_appinfo", localf.kOS);
    }
    this.kQg = false;
    AppMethodBeat.o(136239);
  }

  public void onResume()
  {
    AppMethodBeat.i(136238);
    super.onResume();
    this.kQg = true;
    if (!this.kQh)
    {
      this.kQi = com.tencent.mm.plugin.downloader_app.b.g.biM();
      a(this.kQi, true);
    }
    this.kQh = false;
    AppMethodBeat.o(136238);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI
 * JD-Core Version:    0.6.2
 */