package com.tencent.mm.plugin.game.ui.tab;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.ui.GameCenterActivity;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.SwipeBackLayout;

@com.tencent.mm.ui.base.a(19)
public class GameTabBridgeUI extends GameCenterActivity
{
  private BroadcastReceiver nnj;

  public GameTabBridgeUI()
  {
    AppMethodBeat.i(112241);
    this.nnj = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(112240);
        if ((paramAnonymousIntent != null) && ("com.tencent.mm.ACTION_EXIT".equals(paramAnonymousIntent.getAction())) && (GameTabBridgeUI.this != null) && (!GameTabBridgeUI.this.isFinishing()))
        {
          ab.i("MicroMsg.GameTabBridgeUI", "GameTabBridgeUI exit!");
          GameTabBridgeUI.this.finish();
        }
        AppMethodBeat.o(112240);
      }
    };
    AppMethodBeat.o(112241);
  }

  private void bFA()
  {
    AppMethodBeat.i(112248);
    if (bo.nullAsNil(getIntent().getStringExtra("jump_find_more_friends")).equals("jump_find_more_friends"))
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      localIntent.putExtra("preferred_tab", 2);
      d.f(this, ".ui.LauncherUI", localIntent);
      finish();
      overridePendingTransition(2131034261, 2131034266);
      ab.i("MicroMsg.GameTabBridgeUI", "back to FindMoreFriendsUI");
    }
    AppMethodBeat.o(112248);
  }

  private void goBack()
  {
    AppMethodBeat.i(112247);
    ab.i("MicroMsg.GameTabBridgeUI", "GameTabHomeUI goBack!");
    bFA();
    sendBroadcast(new Intent("com.tencent.mm.ACTION_EXIT"), "com.tencent.mm.permission.MM_MESSAGE");
    AppMethodBeat.o(112247);
  }

  public final boolean bFe()
  {
    return false;
  }

  public final int bFf()
  {
    return 0;
  }

  public final int bFg()
  {
    return 0;
  }

  public final int bFh()
  {
    return 0;
  }

  public final int getLayoutId()
  {
    return 2130969656;
  }

  public final void initView()
  {
    AppMethodBeat.i(112243);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(112239);
        GameTabBridgeUI.a(GameTabBridgeUI.this);
        AppMethodBeat.o(112239);
        return true;
      }
    });
    setMMTitle(2131300361);
    AppMethodBeat.o(112243);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112242);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.GameTabBridgeUI", "%s create", new Object[] { getClass().getSimpleName() });
    GameTabWidget.nnp = hashCode();
    initView();
    paramBundle = new IntentFilter();
    paramBundle.addAction("com.tencent.mm.ACTION_EXIT");
    registerReceiver(this.nnj, paramBundle, "com.tencent.mm.permission.MM_MESSAGE", null);
    Intent localIntent = getIntent();
    paramBundle = (GameTabData)localIntent.getParcelableExtra("tab_data");
    String str = localIntent.getStringExtra("tab_key");
    GameTabWidget localGameTabWidget = (GameTabWidget)findViewById(2131824302);
    a locala = new a(this);
    localGameTabWidget.setAdapter(locala);
    locala.a(paramBundle, str);
    localIntent.setComponent((ComponentName)localIntent.getParcelableExtra("next_tab_component"));
    ToolsProcessIPCService.a(null, GameTabWidget.a.class, new c()
    {
    });
    AppMethodBeat.o(112242);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112245);
    super.onDestroy();
    unregisterReceiver(this.nnj);
    AppMethodBeat.o(112245);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(112246);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(112246);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(112246);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(112244);
    super.onResume();
    if (getSwipeBackLayout() != null)
      getSwipeBackLayout().setEnableGesture(false);
    AppMethodBeat.o(112244);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI
 * JD-Core Version:    0.6.2
 */