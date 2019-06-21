package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class GameDetailRankUI extends MMActivity
{
  public static String EXTRA_SESSION_ID = "extra_session_id";
  public static String ngH = "gameDetailRankDataKey";
  private String appId;
  private ListView ngE;
  private GameRankHeadView ngF;
  private i ngG;

  public final int getLayoutId()
  {
    return 2130969693;
  }

  public final void initView()
  {
    AppMethodBeat.i(111838);
    setMMTitle(com.tencent.mm.pluginsdk.model.app.g.t(this.mController.ylL, this.appId));
    setBackBtn(new GameDetailRankUI.2(this));
    AppMethodBeat.o(111838);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111835);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra(EXTRA_SESSION_ID);
    paramBundle = v.Zp().nV(paramBundle);
    if (paramBundle == null)
    {
      finish();
      AppMethodBeat.o(111835);
    }
    while (true)
    {
      return;
      a locala = (a)paramBundle.get(ngH);
      this.ngE = ((ListView)findViewById(2131824452));
      if ((!bo.isNullOrNil(locala.ngJ)) && (!bo.isNullOrNil(locala.ngK)))
      {
        paramBundle = ((LayoutInflater)this.mController.ylL.getSystemService("layout_inflater")).inflate(2130969700, this.ngE, false);
        this.ngF = ((GameRankHeadView)paramBundle.findViewById(2131824468));
        this.ngE.addHeaderView(paramBundle);
        this.ngF.setData(locala);
      }
      this.ngG = new i(this);
      this.ngG.Rt = 2130969694;
      this.ngE.setAdapter(this.ngG);
      this.appId = locala.ngL.field_appId;
      if (bo.isNullOrNil(this.appId))
      {
        finish();
        AppMethodBeat.o(111835);
      }
      else
      {
        initView();
        com.tencent.mm.kernel.g.RS().aa(new GameDetailRankUI.1(this));
        AppMethodBeat.o(111835);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(111837);
    super.onDestroy();
    j.b(this.ngF.ngQ);
    AppMethodBeat.o(111837);
  }

  public void onResume()
  {
    AppMethodBeat.i(111836);
    super.onResume();
    AppMethodBeat.o(111836);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public static final class a
  {
    public String ngJ;
    public String ngK;
    c ngL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailRankUI
 * JD-Core Version:    0.6.2
 */