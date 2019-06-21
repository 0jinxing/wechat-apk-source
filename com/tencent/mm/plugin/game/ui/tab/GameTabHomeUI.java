package com.tencent.mm.plugin.game.ui.tab;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.ui.GameCenterUI5;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public class GameTabHomeUI extends GameCenterUI5
{
  private BroadcastReceiver nnj;
  public String nnm;

  public GameTabHomeUI()
  {
    AppMethodBeat.i(112252);
    this.nnj = new GameTabHomeUI.2(this);
    AppMethodBeat.o(112252);
  }

  private void bFA()
  {
    AppMethodBeat.i(112259);
    if (bo.nullAsNil(getIntent().getStringExtra("jump_find_more_friends")).equals("jump_find_more_friends"))
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      localIntent.putExtra("preferred_tab", 2);
      d.f(this, ".ui.LauncherUI", localIntent);
      finish();
      overridePendingTransition(2131034261, 2131034266);
      ab.i("MicroMsg.GameTabHomeUI", "back to FindMoreFriendsUI");
    }
    AppMethodBeat.o(112259);
  }

  private void goBack()
  {
    AppMethodBeat.i(112258);
    ab.i("MicroMsg.GameTabHomeUI", "GameTabHomeUI goBack!");
    bFA();
    sendBroadcast(new Intent("com.tencent.mm.ACTION_EXIT"), "com.tencent.mm.permission.MM_MESSAGE");
    AppMethodBeat.o(112258);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112253);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.GameTabHomeUI", "%s create", new Object[] { getClass().getSimpleName() });
    GameTabData localGameTabData = (GameTabData)getIntent().getParcelableExtra("tab_data");
    this.nnm = getIntent().getStringExtra("tab_key");
    paramBundle = (GameTabWidget)findViewById(2131824302);
    a locala = new a(this);
    paramBundle.setAdapter(locala);
    locala.a(localGameTabData, this.nnm);
    paramBundle = new IntentFilter();
    paramBundle.addAction("com.tencent.mm.ACTION_EXIT");
    registerReceiver(this.nnj, paramBundle, "com.tencent.mm.permission.MM_MESSAGE", null);
    setBackBtn(new GameTabHomeUI.1(this));
    AppMethodBeat.o(112253);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112256);
    super.onDestroy();
    unregisterReceiver(this.nnj);
    AppMethodBeat.o(112256);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(112257);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(112257);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(112257);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(112255);
    super.onNewIntent(paramIntent);
    if (paramIntent == null)
      AppMethodBeat.o(112255);
    while (true)
    {
      return;
      setIntent(paramIntent);
      String str = paramIntent.getStringExtra("tab_key");
      if (!bo.nullAsNil(this.nnm).equals(str))
      {
        ab.i("MicroMsg.GameTabHomeUI", "reload %s. current_key:%s, next_key:%s", new Object[] { getClass().getSimpleName(), this.nnm, str });
        finish();
        startActivity(paramIntent);
      }
      overridePendingTransition(2131034194, 2131034194);
      AppMethodBeat.o(112255);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(112254);
    super.onResume();
    if (getSwipeBackLayout() != null)
      getSwipeBackLayout().setEnableGesture(false);
    AppMethodBeat.o(112254);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI
 * JD-Core Version:    0.6.2
 */