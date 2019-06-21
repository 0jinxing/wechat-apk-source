package com.tencent.mm.plugin.game.ui.tab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bg;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.model.GameTabData.TabItem;
import com.tencent.mm.plugin.game.model.aj;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.plugin.game.ui.GameCenterActivity;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragmentActivity.a;
import java.io.IOException;
import java.util.List;
import java.util.List<Lcom.tencent.mm.plugin.game.d.al;>;

@com.tencent.mm.ui.base.a(19)
public class GameRouteUI extends GameCenterActivity
  implements f
{
  private int mXC;

  private static bg bFz()
  {
    AppMethodBeat.i(112229);
    byte[] arrayOfByte = ((c)g.K(c.class)).bCZ().NK("game_index4_tab_nav");
    bg localbg;
    if (bo.cb(arrayOfByte))
    {
      AppMethodBeat.o(112229);
      localbg = null;
    }
    while (true)
    {
      return localbg;
      try
      {
        localbg = new com/tencent/mm/plugin/game/d/bg;
        localbg.<init>();
      }
      catch (IOException localIOException2)
      {
        try
        {
          localbg.parseFrom(arrayOfByte);
          while (true)
          {
            label54: AppMethodBeat.o(112229);
            break;
            localIOException2 = localIOException2;
            Object localObject = null;
          }
        }
        catch (IOException localIOException1)
        {
          break label54;
        }
      }
    }
  }

  private void c(List<com.tencent.mm.plugin.game.d.al> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(112228);
    if ((isFinishing()) || (isDestroyed()))
      AppMethodBeat.o(112228);
    GameTabData localGameTabData;
    while (true)
    {
      return;
      localGameTabData = GameTabData.cc(paramList);
      if ((localGameTabData != null) && (!bo.ek(localGameTabData.getItemList())))
        break;
      ab.e("MicroMsg.GameRouteUI", "game tab data is null");
      exit();
      AppMethodBeat.o(112228);
    }
    Object localObject1 = localGameTabData.getItemList();
    paramList = null;
    int i = 0;
    label74: Object localObject2;
    if (i < ((List)localObject1).size())
    {
      localObject2 = (GameTabData.TabItem)((List)localObject1).get(i);
      if (localObject2 == null)
        break label256;
      if (!((GameTabData.TabItem)localObject2).mYq)
        break label253;
      paramList = (List<com.tencent.mm.plugin.game.d.al>)localObject2;
      label116: com.tencent.mm.plugin.game.e.a.a(this, 18, ((GameTabData.TabItem)localObject2).cKG, ((GameTabData.TabItem)localObject2).mYy, null, this.mXC, com.tencent.mm.plugin.game.e.a.kY(((GameTabData.TabItem)localObject2).mVB));
    }
    label256: 
    while (true)
    {
      i++;
      break label74;
      localObject2 = paramList;
      if (paramList == null)
        localObject2 = (GameTabData.TabItem)((List)localObject1).get(0);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.GameRouteUI", "game tab entry item is null");
        exit();
        AppMethodBeat.o(112228);
        break;
      }
      localObject1 = getIntent().getExtras();
      paramList = (List<com.tencent.mm.plugin.game.d.al>)localObject1;
      if (localObject1 == null)
        paramList = new Bundle();
      paramList.putParcelable("tab_data", localGameTabData);
      getIntent().putExtras(paramList);
      GameTabWidget.a(this, (GameTabData.TabItem)localObject2, paramBoolean, true, true);
      AppMethodBeat.o(112228);
      break;
      label253: break label116;
    }
  }

  private void exit()
  {
    AppMethodBeat.i(112227);
    if ((!isFinishing()) && (!isDestroyed()))
    {
      finish();
      overridePendingTransition(MMFragmentActivity.a.yne, MMFragmentActivity.a.ynf);
    }
    AppMethodBeat.o(112227);
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
    return 2130969773;
  }

  public final void initView()
  {
    AppMethodBeat.i(112223);
    setBackBtn(new GameRouteUI.1(this));
    setMMTitle(2131300361);
    AppMethodBeat.o(112223);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(112222);
    super.onCreate(paramBundle);
    initView();
    this.mXC = getIntent().getIntExtra("game_report_from_scene", 0);
    paramBundle = bFz();
    if ((paramBundle != null) && (!bo.ek(paramBundle.naO)))
    {
      ab.i("MicroMsg.GameRouteUI", "use cache data");
      aj.updateData();
      boolean bool2 = getIntent().getBooleanExtra("switch_country_no_anim", false);
      getIntent().removeExtra("switch_country_no_anim");
      paramBundle = paramBundle.naO;
      if (!bool2)
        bool1 = true;
      c(paramBundle, bool1);
      AppMethodBeat.o(112222);
    }
    while (true)
    {
      return;
      g.Rg().a(2641, this);
      paramBundle = new aj();
      g.Rg().a(paramBundle, 0);
      AppMethodBeat.o(112222);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112224);
    g.Rg().b(2641, this);
    super.onDestroy();
    AppMethodBeat.o(112224);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(112226);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      exit();
      bool = true;
      AppMethodBeat.o(112226);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(112226);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(112225);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data success");
      com.tencent.mm.sdk.platformtools.al.d(new GameRouteUI.2(this, ((aj)paramm).bET()));
      AppMethodBeat.o(112225);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GameRouteUI", "pull gameIndexTabNav data fail");
      exit();
      AppMethodBeat.o(112225);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameRouteUI
 * JD-Core Version:    0.6.2
 */