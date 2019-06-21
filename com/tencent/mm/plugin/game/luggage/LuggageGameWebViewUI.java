package com.tencent.mm.plugin.game.luggage;

import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.tencent.luggage.d.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask;
import com.tencent.mm.plugin.webview.ui.tools.game.g;
import com.tencent.mm.plugin.wepkg.event.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.lang.reflect.Field;

public class LuggageGameWebViewUI extends MMActivity
{
  private com.tencent.mm.plugin.game.luggage.d.b mTJ;
  private int mTK = -1;
  private boolean mTL = true;

  public final boolean W(int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(135821);
    if (Build.VERSION.SDK_INT < 21)
    {
      AppMethodBeat.o(135821);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (getSwipeBackLayout() == null)
      {
        paramBoolean = com.tencent.mm.plugin.webview.luggage.c.a.c(this, paramInt, paramBoolean);
        AppMethodBeat.o(135821);
      }
      else if ((Build.VERSION.SDK_INT >= 21) && (getWindow() != null))
      {
        com.tencent.mm.ui.statusbar.a.d(getSwipeBackLayout().getChildAt(0), paramInt, paramBoolean);
        paramBoolean = true;
        AppMethodBeat.o(135821);
      }
      else
      {
        AppMethodBeat.o(135821);
        paramBoolean = bool;
      }
    }
  }

  public final void aBS()
  {
    AppMethodBeat.i(135820);
    if (this.mTK != -1)
    {
      setRequestedOrientation(this.mTK);
      AppMethodBeat.o(135820);
    }
    while (true)
    {
      return;
      this.ylk = getSharedPreferences(ah.doA(), 4).getBoolean("settings_landscape_mode", false);
      if (this.ylk)
      {
        setRequestedOrientation(-1);
        AppMethodBeat.o(135820);
      }
      else
      {
        setRequestedOrientation(1);
        AppMethodBeat.o(135820);
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void initSwipeBack()
  {
    AppMethodBeat.i(135812);
    super.initSwipeBack();
    if (getSwipeBackLayout() == null)
    {
      AppMethodBeat.o(135812);
      return;
    }
    View localView1 = getSwipeBackLayout().getChildAt(0);
    getSwipeBackLayout().removeView(localView1);
    com.tencent.mm.ui.statusbar.b localb = new com.tencent.mm.ui.statusbar.b(this);
    if ((localView1 instanceof FrameLayout))
    {
      View localView2 = ((FrameLayout)localView1).getChildAt(0);
      ViewGroup.LayoutParams localLayoutParams = localView2.getLayoutParams();
      ((FrameLayout)localView1).removeView(localView2);
      localb.addView(localView2, localLayoutParams);
    }
    while (true)
    {
      getSwipeBackLayout().addView(localb);
      getSwipeBackLayout().setContentView(localb);
      AppMethodBeat.o(135812);
      break;
      localb.addView(localView1);
    }
  }

  public final boolean noActionBar()
  {
    return true;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(135819);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.mTJ.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(135819);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(135817);
    if (!this.mTJ.wY())
      finish();
    AppMethodBeat.o(135817);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(135811);
    super.onCreate(paramBundle);
    overridePendingTransition(MMFragmentActivity.a.yng, MMFragmentActivity.a.ynh);
    AppBrandMainProcessService.a(new ActiveMainProcessTask());
    ab.i("MicroMsg.LuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", new Object[] { Long.valueOf(getIntent().getLongExtra("start_activity_time", System.currentTimeMillis())), Long.valueOf(System.currentTimeMillis()) });
    String str = getIntent().getStringExtra("rawUrl");
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.LuggageGameWebViewUI", "url is null");
      AppMethodBeat.o(135811);
    }
    while (true)
    {
      return;
      paramBundle = GameWebPerformanceInfo.kU(str);
      paramBundle.url = str;
      paramBundle.eBT = getIntent().getLongExtra("gamecenterui_createtime", 0L);
      paramBundle.eBU = getIntent().getLongExtra("start_activity_time", System.currentTimeMillis());
      paramBundle.startTime = getIntent().getLongExtra("start_time", paramBundle.eBU);
      paramBundle.eBZ = System.currentTimeMillis();
      paramBundle.eBK = 1;
      paramBundle.eBN = 1;
      ab.i("MicroMsg.LuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", new Object[] { str, Long.valueOf(paramBundle.startTime), Long.valueOf(paramBundle.eBT), Long.valueOf(paramBundle.eBU), Long.valueOf(paramBundle.eBZ) });
      g.az(str, System.currentTimeMillis());
      if (Build.VERSION.SDK_INT >= 11)
        getWindow().setFlags(16777216, 16777216);
      getWindow().setFormat(-3);
      this.mTJ = new com.tencent.mm.plugin.game.luggage.d.b(this);
      setContentView(this.mTJ.bPj);
      this.mTJ.a(new LuggageGameWebViewUI.1(this));
      Object localObject1 = (GameWebViewLaunchParams)getIntent().getParcelableExtra("launchParams");
      if (localObject1 != null)
      {
        localObject1 = ((GameWebViewLaunchParams)localObject1).mTF;
        if (localObject1 != null)
        {
          Object localObject2 = GameWebPerformanceInfo.kU(((GameFloatLayerInfo)localObject1).url);
          ((GameWebPerformanceInfo)localObject2).url = ((GameFloatLayerInfo)localObject1).url;
          ((GameWebPerformanceInfo)localObject2).eBT = getIntent().getLongExtra("gamecenterui_createtime", 0L);
          ((GameWebPerformanceInfo)localObject2).eBU = getIntent().getLongExtra("start_activity_time", System.currentTimeMillis());
          ((GameWebPerformanceInfo)localObject2).startTime = getIntent().getLongExtra("start_time", ((GameWebPerformanceInfo)localObject2).eBU);
          ((GameWebPerformanceInfo)localObject2).eBZ = System.currentTimeMillis();
          ((GameWebPerformanceInfo)localObject2).eBK = 1;
          ((GameWebPerformanceInfo)localObject2).eBN = 1;
          g.az(((GameFloatLayerInfo)localObject1).url, System.currentTimeMillis());
          localObject2 = new Bundle();
          ((Bundle)localObject2).putString("rawUrl", ((GameFloatLayerInfo)localObject1).url);
          ((Bundle)localObject2).putBoolean("show_full_screen", ((GameFloatLayerInfo)localObject1).mTC);
          ((Bundle)localObject2).putInt("screen_orientation", ((GameFloatLayerInfo)localObject1).orientation);
          ((Bundle)localObject2).putBoolean("float_layer_page", true);
          ((Bundle)localObject2).putBoolean("needAnimation", false);
          ((Bundle)localObject2).putInt("customize_status_bar_color", getIntent().getIntExtra("customize_status_bar_color", 0));
          ((Bundle)localObject2).putString("customize_status_bar_color", getIntent().getStringExtra("status_bar_style"));
          this.mTJ.a(((GameFloatLayerInfo)localObject1).url, (Bundle)localObject2, false);
        }
      }
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label593;
        paramBundle.eBR = 1;
        new Handler().postDelayed(new LuggageGameWebViewUI.2(this, str), 300L);
        AppMethodBeat.o(135811);
        break;
      }
      label593: this.mTJ.h(str, getIntent().getExtras());
      AppMethodBeat.o(135811);
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(135813);
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
    supportRequestWindowFeature(9);
    AppMethodBeat.o(135813);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(135816);
    super.onDestroy();
    ab.i("MicroMsg.LuggageGameWebViewUI", "onDestroy");
    b.mTH = null;
    b.mHeaders = null;
    b.JQ = 0L;
    this.mTJ.destroy();
    c.clear();
    ab.i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak");
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      ab.i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
      int i = 0;
      while (true)
        if (i < 3)
        {
          Object localObject1 = new String[] { "mCurRootView", "mServedView", "mNextServedView" }[i];
          try
          {
            localObject1 = localInputMethodManager.getClass().getDeclaredField((String)localObject1);
            if (!((Field)localObject1).isAccessible())
              ((Field)localObject1).setAccessible(true);
            Object localObject2 = ((Field)localObject1).get(localInputMethodManager);
            if ((localObject2 != null) && ((localObject2 instanceof View)))
            {
              localObject2 = (View)localObject2;
              if (!(((View)localObject2).getContext() instanceof ContextWrapper))
                break label189;
              if (((ContextWrapper)((View)localObject2).getContext()).getBaseContext() == this)
                ((Field)localObject1).set(localInputMethodManager, null);
            }
            while (true)
            {
              i++;
              break;
              label189: if (((View)localObject2).getContext() != this)
                break label224;
              ((Field)localObject1).set(localInputMethodManager, null);
            }
          }
          catch (Throwable localThrowable)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.LuggageGameWebViewUI", localThrowable, "", new Object[0]);
          }
        }
    }
    label224: System.gc();
    AppMethodBeat.o(135816);
  }

  public void onPause()
  {
    AppMethodBeat.i(135815);
    super.onPause();
    ab.i("MicroMsg.LuggageGameWebViewUI", "onPause");
    this.mTJ.onPause();
    AppMethodBeat.o(135815);
  }

  public void onResume()
  {
    AppMethodBeat.i(135814);
    super.onResume();
    ab.i("MicroMsg.LuggageGameWebViewUI", "onResume, time: " + System.currentTimeMillis());
    this.mTJ.onResume();
    AppMethodBeat.o(135814);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(135818);
    ab.i("MicroMsg.LuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(System.currentTimeMillis()) });
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
    AppMethodBeat.o(135818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI
 * JD-Core Version:    0.6.2
 */