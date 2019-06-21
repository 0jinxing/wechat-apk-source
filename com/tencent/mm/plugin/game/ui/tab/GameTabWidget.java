package com.tencent.mm.plugin.game.ui.tab;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.GameTabData;
import com.tencent.mm.plugin.game.model.GameTabData.StatusBar;
import com.tencent.mm.plugin.game.model.GameTabData.TabItem;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.a;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragmentActivity.a;
import java.util.LinkedHashMap;

public class GameTabWidget extends LinearLayout
{
  public static int nnp = 0;
  private Activity mActivity;
  private a nnq;

  public GameTabWidget(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(112275);
    cA(paramContext);
    AppMethodBeat.o(112275);
  }

  public GameTabWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112276);
    cA(paramContext);
    AppMethodBeat.o(112276);
  }

  public GameTabWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112277);
    cA(paramContext);
    AppMethodBeat.o(112277);
  }

  public static void a(Activity paramActivity, Intent paramIntent, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    AppMethodBeat.i(112281);
    Object localObject;
    if (paramIntent.getComponent() == null)
    {
      localObject = "";
      ab.i("MicroMsg.GameTabWidget", "(%s isActivityExist):%b, hasAnimation:%b, forceFinish:%b, isNative:%b", new Object[] { localObject, Boolean.valueOf(paramBoolean3), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean4) });
      if ((!paramBoolean3) && (!paramBoolean4))
        break label181;
      localObject = "straight to jump";
      label76: ab.i("MicroMsg.GameTabWidget", (String)localObject);
      if ((!paramBoolean3) && (paramBoolean4))
        ToolsProcessIPCService.a(null, GameTabWidget.a.class, null);
      if ((!paramBoolean3) && (!paramBoolean4))
        break label188;
      nnp = 0;
      paramIntent.addFlags(131072);
      paramActivity.startActivity(paramIntent);
      label127: if ((paramBoolean2) && (!paramActivity.isDestroyed()) && (!paramActivity.isFinishing()))
        paramActivity.finish();
      if (!paramBoolean1)
        break label231;
      paramActivity.overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
      AppMethodBeat.o(112281);
    }
    while (true)
    {
      return;
      localObject = paramIntent.getComponent().getClassName();
      break;
      label181: localObject = "jump to bridge";
      break label76;
      label188: localObject = new Intent(paramActivity, GameTabBridgeUI.class);
      ((Intent)localObject).putExtras(paramIntent.getExtras());
      ((Intent)localObject).putExtra("next_tab_component", paramIntent.getComponent());
      paramActivity.startActivity((Intent)localObject);
      break label127;
      label231: paramActivity.overridePendingTransition(2131034194, 2131034194);
      AppMethodBeat.o(112281);
    }
  }

  public static void a(Activity paramActivity, GameTabData.TabItem paramTabItem, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(112280);
    if ((paramActivity == null) || (paramTabItem == null))
      AppMethodBeat.o(112280);
    Object localObject1;
    while (true)
    {
      return;
      if (c.ay(paramActivity, paramTabItem.jumpUrl))
      {
        AppMethodBeat.o(112280);
      }
      else
      {
        localObject1 = paramActivity.getIntent().getStringExtra("tab_key");
        if (!bo.nullAsNil(paramTabItem.mYp).equals(localObject1))
          break;
        AppMethodBeat.o(112280);
      }
    }
    ab.i("MicroMsg.GameTabWidget", "current_page:%s, next_page:%s, hasAnimation:%b", new Object[] { paramActivity.getClass().getSimpleName(), paramTabItem.mYw, Boolean.valueOf(paramBoolean1) });
    Intent localIntent = new Intent();
    localIntent.setClassName(paramActivity, paramTabItem.mYw);
    Object localObject2 = paramActivity.getIntent().getExtras();
    label149: Bundle localBundle;
    boolean bool;
    if (localObject2 != null)
    {
      localIntent.putExtras((Bundle)localObject2);
      localBundle = new Bundle();
      localBundle.putString("tab_key", paramTabItem.mYp);
      localObject2 = (GameTabData)((Bundle)localObject2).getParcelable("tab_data");
      if (localObject2 == null)
        break label709;
      localObject1 = (GameTabData.TabItem)((GameTabData)localObject2).mYm.get(bo.nullAsNil((String)localObject1));
      if (localObject1 != null)
        ((GameTabData.TabItem)localObject1).mYx = true;
      localObject1 = (GameTabData.TabItem)((GameTabData)localObject2).mYm.get(paramTabItem.mYp);
      if (localObject1 == null)
        break label703;
      bool = ((GameTabData.TabItem)localObject1).mYx;
      label244: localBundle.putParcelable("tab_data", (Parcelable)localObject2);
    }
    while (true)
    {
      if (!paramBoolean3)
        com.tencent.mm.plugin.game.e.b.a(paramActivity, 18, paramTabItem.cKG, paramTabItem.mYy, 2, null, paramActivity.getIntent().getIntExtra("game_report_from_scene", 0), com.tencent.mm.plugin.game.e.a.kY(paramTabItem.mVB));
      if (!paramTabItem.mYr)
      {
        localBundle.putString("rawUrl", paramTabItem.jumpUrl);
        localBundle.putBoolean("KRightBtn", true);
        localBundle.putBoolean("isWebwx", true);
        localBundle.putBoolean("show_bottom", false);
        localBundle.putString("title", paramActivity.getString(2131300361));
        localBundle.putBoolean("forceHideShare", true);
        localBundle.putBoolean("disable_swipe_back", true);
        localBundle.putBoolean("show_native_web_view", true);
        localBundle.putBoolean("disable_progress_bar", true);
        localBundle.putBoolean("disable_bounce_scroll", true);
        localBundle.putInt("screen_orientation", 1);
        localBundle.putString("KPublisherId", "game_center_entrance");
        localBundle.putInt("geta8key_scene", 32);
        if ((localObject2 != null) && (((GameTabData)localObject2).mYn != null))
        {
          localBundle.putString("status_bar_style", ((GameTabData)localObject2).mYn.mYo);
          localBundle.putInt("customize_status_bar_color", ((GameTabData)localObject2).mYn.color);
        }
        localBundle.putBoolean("game_check_float", paramBoolean3);
        String str = localBundle.getString("rawUrl");
        if (!bo.isNullOrNil(str))
        {
          if (!paramBoolean3)
            break label684;
          paramBoolean3 = localIntent.getBooleanExtra("from_find_more_friend", false);
          int i = localIntent.getIntExtra("game_report_from_scene", 0);
          if (paramBoolean3)
          {
            ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
            localObject1 = q.bEo();
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
              localObject2 = q.bEs();
            }
            localBundle.putString("rawUrl", l.a(str, (n)localObject2));
            if (localObject2 != null)
            {
              ((n)localObject2).bEl();
              if (((n)localObject2).mWG.mXg)
                localBundle.putString("game_transparent_float_url", ((n)localObject2).mWG.url);
              localBundle.putInt("game_sourceScene", i);
            }
          }
        }
      }
      while (true)
      {
        localIntent.putExtras(localBundle);
        a(paramActivity, localIntent, paramBoolean1, paramBoolean2, bool, paramTabItem.mYr);
        AppMethodBeat.o(112280);
        break;
        localObject2 = new Bundle();
        break label149;
        label684: localBundle.remove("game_transparent_float_url");
        localBundle.remove("game_sourceScene");
      }
      label703: bool = false;
      break label244;
      label709: bool = false;
    }
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(112278);
    this.mActivity = ((Activity)paramContext);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    setBackgroundResource(2131690101);
    setOrientation(0);
    AppMethodBeat.o(112278);
  }

  public void setAdapter(a parama)
  {
    AppMethodBeat.i(112279);
    this.nnq = parama;
    parama.registerDataSetObserver(new GameTabWidget.1(this));
    parama.notifyDataSetChanged();
    AppMethodBeat.o(112279);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabWidget
 * JD-Core Version:    0.6.2
 */