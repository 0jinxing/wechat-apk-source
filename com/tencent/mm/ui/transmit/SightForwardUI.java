package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.1;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.2;
import com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView.3;
import com.tencent.mm.plugin.sight.encode.ui.MainSightSelectContactView;
import com.tencent.mm.plugin.sight.encode.ui.SightCameraView;
import com.tencent.mm.plugin.sight.encode.ui.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.vfs.e;
import java.util.HashSet;

public class SightForwardUI extends MMActivity
{
  private String mPath;
  private MainSightForwardContainerView zKP;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970019;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35276);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    getSupportActionBar().hide();
    this.mPath = getIntent().getStringExtra("sight_local_path");
    if (!com.tencent.mm.plugin.sight.base.d.WQ(this.mPath))
    {
      ab.e("MicroMsg.SightForwardUI", "Path:%s, NOT SIGHT!", new Object[] { this.mPath });
      finish();
      AppMethodBeat.o(35276);
    }
    while (true)
    {
      return;
      if (!aw.RK())
      {
        ab.e("MicroMsg.SightForwardUI", "acc not ready");
        finish();
        AppMethodBeat.o(35276);
      }
      else
      {
        paramBundle = t.ug(String.valueOf(SystemClock.elapsedRealtime()));
        o.all();
        paramBundle = t.uh(paramBundle);
        if (e.y(this.mPath, paramBundle) <= 0L)
        {
          ab.e("MicroMsg.SightForwardUI", "Copy File %s to %s FAIL!", new Object[] { this.mPath, paramBundle });
          finish();
          AppMethodBeat.o(35276);
        }
        else
        {
          this.mPath = paramBundle;
          ab.i("MicroMsg.SightForwardUI", "Doing Forward Sight, path %s", new Object[] { this.mPath });
          this.zKP = ((MainSightForwardContainerView)findViewById(2131825720));
          this.zKP.setIMainSightViewCallback(new SightForwardUI.1(this));
          Object localObject = this.zKP;
          paramBundle = this.mPath;
          ((MainSightForwardContainerView)localObject).iWA = this;
          ((MainSightForwardContainerView)localObject).qAD = paramBundle;
          ((MainSightForwardContainerView)localObject).qAB = g.cz(paramBundle);
          long l = System.currentTimeMillis();
          ((MainSightForwardContainerView)localObject).qAE = 1.333333F;
          ((MainSightForwardContainerView)localObject).qAu = ((SightCameraView)((ViewStub)((MainSightForwardContainerView)localObject).findViewById(2131825721)).inflate());
          ((MainSightForwardContainerView)localObject).qAu.setTargetWidth(com.tencent.mm.pluginsdk.i.a.ouQ);
          ((MainSightForwardContainerView)localObject).qAu.setFixPreviewRate(((MainSightForwardContainerView)localObject).qAE);
          ((MainSightForwardContainerView)localObject).qAu.setVisibility(0);
          ((MainSightForwardContainerView)localObject).qAy = ((MainSightForwardContainerView)localObject).findViewById(2131825726);
          ((MainSightForwardContainerView)localObject).qAy.setLayoutParams(new RelativeLayout.LayoutParams(-1, getSupportActionBar().getHeight()));
          ((MainSightForwardContainerView)localObject).qAx = ((MainSightForwardContainerView)localObject).findViewById(2131825727);
          ((MainSightForwardContainerView)localObject).ofJ = ((MainSightForwardContainerView)localObject).findViewById(2131825728);
          ((MainSightForwardContainerView)localObject).qAw = ((MainSightForwardContainerView)localObject).findViewById(2131825722);
          ((MainSightForwardContainerView)localObject).qAx.setOnClickListener(new MainSightForwardContainerView.1((MainSightForwardContainerView)localObject));
          ((MainSightForwardContainerView)localObject).ofJ.setOnClickListener(new MainSightForwardContainerView.2((MainSightForwardContainerView)localObject));
          ((MainSightForwardContainerView)localObject).clF();
          ab.d("MicroMsg.MainSightContainerView", "init concrol view use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          this.zKP.clE();
          paramBundle = this.zKP;
          if (paramBundle.qAt == null)
          {
            localObject = paramBundle.getResources().getDisplayMetrics();
            float f = ((DisplayMetrics)localObject).widthPixels / paramBundle.qAE;
            paramBundle.qAt = ((MainSightSelectContactView)paramBundle.findViewById(2131825725));
            MainSightSelectContactView localMainSightSelectContactView = paramBundle.qAt;
            MMFragmentActivity localMMFragmentActivity = paramBundle.iWA;
            int i = (int)(((DisplayMetrics)localObject).heightPixels - f);
            int j = ((DisplayMetrics)localObject).heightPixels;
            localMainSightSelectContactView.iWA = localMMFragmentActivity;
            localMainSightSelectContactView.qBf = i;
            localMainSightSelectContactView.setMainSightContentView(paramBundle);
            localMainSightSelectContactView.addView(View.inflate(localMainSightSelectContactView.getContext(), 2130970020, null), -1, -2);
            localMainSightSelectContactView.mListView = ((ListView)localMainSightSelectContactView.findViewById(2131820897));
            localMainSightSelectContactView.qBi = new c(localMainSightSelectContactView);
            localMainSightSelectContactView.qBl = new LinearLayout(localMainSightSelectContactView.getContext());
            localMainSightSelectContactView.qBl.addView(new View(localMainSightSelectContactView.getContext()), -1, localMainSightSelectContactView.qBk.getViewHeight() - localMainSightSelectContactView.qBf);
            localMainSightSelectContactView.qBl.getChildAt(0).setBackgroundColor(0);
            localMainSightSelectContactView.mListView.addHeaderView(localMainSightSelectContactView.qBl);
            localMainSightSelectContactView.mListView.setAdapter(localMainSightSelectContactView.qBi);
            localMainSightSelectContactView.mListView.setOnItemClickListener(paramBundle);
            localMainSightSelectContactView.qBp = new HashSet();
            localMainSightSelectContactView.qBq = new HashSet();
            localMainSightSelectContactView.mListView.setOnScrollListener(localMainSightSelectContactView);
            localMainSightSelectContactView.qBg = new com.tencent.mm.plugin.sight.encode.ui.d();
            localMainSightSelectContactView.qBg.qBb = localMainSightSelectContactView;
            paramBundle.qAt.setSearchView(paramBundle.findViewById(2131823137));
            paramBundle.qAt.setEmptyBgView(paramBundle.findViewById(2131825723));
            paramBundle.qAt.setMainSightContentView(paramBundle);
          }
          paramBundle.kF(true);
          paramBundle.qAu.postDelayed(new MainSightForwardContainerView.3(paramBundle), 50L);
          AppMethodBeat.o(35276);
        }
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(35278);
    super.onPause();
    this.zKP.onPause();
    AppMethodBeat.o(35278);
  }

  public void onResume()
  {
    AppMethodBeat.i(35277);
    super.onResume();
    this.zKP.onResume();
    AppMethodBeat.o(35277);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SightForwardUI
 * JD-Core Version:    0.6.2
 */