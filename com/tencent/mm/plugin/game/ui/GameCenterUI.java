package com.tencent.mm.plugin.game.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.game.d.ak;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.a;
import com.tencent.mm.plugin.game.model.n.d;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.ui.tab.GameRouteUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import java.util.HashMap;

@i
@com.tencent.mm.ui.base.a(19)
public class GameCenterUI extends MMBaseActivity
{
  private void Om(String paramString)
  {
    AppMethodBeat.i(111783);
    getIntent().putExtra("rawUrl", paramString);
    if (((com.tencent.mm.game.report.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.game.report.a.b.class)).a(a.a.lFH))
      On(paramString);
    while (true)
    {
      e.bEc();
      AppMethodBeat.o(111783);
      return;
      X(7, false);
      l.a(this, paramString, getIntent());
      h.pYm.a(848L, 3L, 1L, false);
    }
  }

  private void On(String paramString)
  {
    AppMethodBeat.i(111784);
    X(7, true);
    l.b(this, paramString, getIntent());
    h.pYm.a(848L, 3L, 1L, false);
    h.pYm.a(848L, 9L, 1L, false);
    AppMethodBeat.o(111784);
  }

  private void X(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(111786);
    n localn;
    HashMap localHashMap;
    if (getIntent().getBooleanExtra("from_find_more_friend", false))
    {
      ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      localn = q.bEm();
      localHashMap = new HashMap();
      if (paramBoolean)
        localHashMap.put("luggage", "1");
      if (localn == null)
      {
        localHashMap.put("function_type", "resource");
        localHashMap.put("function_value", "0");
        com.tencent.mm.plugin.game.e.b.a(this, 9, 901, 1, paramInt, 0, com.tencent.mm.plugin.game.e.a.K(localHashMap));
        AppMethodBeat.o(111786);
      }
    }
    while (true)
    {
      return;
      localn.bEl();
      int i = localn.field_msgType;
      if (localn.field_msgType == 100)
        i = localn.mXb;
      localHashMap.put("function_type", "resource");
      localHashMap.put("function_value", String.valueOf(localn.mWr.mXl));
      com.tencent.mm.plugin.game.e.b.a(this, 9, 901, 1, paramInt, 0, localn.field_appId, 0, i, localn.field_gameMsgId, localn.mXc, com.tencent.mm.plugin.game.e.a.K(localHashMap));
      ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      q.bEn();
      h.pYm.a(858L, 3L, 1L, false);
      AppMethodBeat.o(111786);
    }
  }

  private void hS(boolean paramBoolean)
  {
    AppMethodBeat.i(111782);
    if (com.tencent.mm.sdk.platformtools.g.dnY())
    {
      ab.i("MicroMsg.GameCenterUI", "GP version");
      h.pYm.a(848L, 13L, 1L, false);
      hT(paramBoolean);
      AppMethodBeat.o(111782);
    }
    while (true)
    {
      return;
      String str = c.bFG();
      if (bo.isNullOrNil(str))
        break;
      Om(str);
      AppMethodBeat.o(111782);
    }
  }

  private void hT(boolean paramBoolean)
  {
    AppMethodBeat.i(111785);
    Intent localIntent = new Intent(this, GameRouteUI.class);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
      localIntent.putExtras(localBundle);
    startActivity(localIntent);
    if (paramBoolean)
      overridePendingTransition(2131034194, 2131034194);
    while (true)
    {
      X(6, false);
      h.pYm.a(848L, 4L, 1L, false);
      AppMethodBeat.o(111785);
      return;
      overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(111781);
    super.onCreate(paramBundle);
    getIntent().putExtra("gamecenterui_createtime", System.currentTimeMillis());
    ab.i("MicroMsg.GameCenterUI", "onCreate, time: " + System.currentTimeMillis());
    if (getIntent().getBooleanExtra("game_check_float", false))
    {
      int i = getIntent().getIntExtra("game_sourceScene", 0);
      ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      paramBundle = q.bEo();
      if (paramBundle != null)
      {
        paramBundle.bEl();
        if (!bo.isNullOrNil(paramBundle.mWG.url))
          c.a(getBaseContext(), paramBundle, "game_center_h5_floatlayer");
      }
      l.a(paramBundle, i, 1);
      finish();
      AppMethodBeat.o(111781);
      return;
    }
    boolean bool = getIntent().getBooleanExtra("switch_country_no_anim", false);
    paramBundle = com.tencent.mm.plugin.game.commlib.a.bDe();
    if (paramBundle != null);
    switch (paramBundle.naz)
    {
    default:
      hS(bool);
    case 0:
    case 1:
      while (true)
      {
        finish();
        AppMethodBeat.o(111781);
        break;
        hS(bool);
        continue;
        if (!bo.isNullOrNil(paramBundle.mZj))
          Om(paramBundle.mZj);
        else
          hS(bool);
      }
    case 2:
      paramBundle = new Intent(this, GameOverSeaCenterUI.class);
      localObject = getIntent().getExtras();
      if (localObject != null)
        paramBundle.putExtras((Bundle)localObject);
      startActivity(paramBundle);
      if (bool)
        overridePendingTransition(2131034194, 2131034194);
      while (true)
      {
        X(6, false);
        h.pYm.a(848L, 5L, 1L, false);
        break;
        overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
      }
    case 3:
    }
    Object localObject = new Intent(this, GameDownloadGuidanceUI.class);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
      ((Intent)localObject).putExtras(paramBundle);
    startActivity((Intent)localObject);
    if (bool)
      overridePendingTransition(2131034194, 2131034194);
    while (true)
    {
      X(6, false);
      h.pYm.a(848L, 6L, 1L, false);
      break;
      overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterUI
 * JD-Core Version:    0.6.2
 */