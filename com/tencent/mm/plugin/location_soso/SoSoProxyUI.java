package com.tencent.mm.plugin.location_soso;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.c;
import com.tencent.mm.plugin.k.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.v;
import com.tencent.tencentmap.mapsdk.map.MapActivity;

@com.tencent.mm.ui.base.a(19)
public class SoSoProxyUI extends MapActivity
{
  protected static final String TAG = "MicroMsg.SoSoProxyUI";
  private com.tencent.mm.plugin.k.a basemapUI;

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(113766);
    boolean bool;
    if (this.basemapUI.dispatchKeyEvent(paramKeyEvent))
    {
      bool = true;
      AppMethodBeat.o(113766);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(113766);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113765);
    boolean bool;
    if (this.basemapUI.dispatchTouchEvent(paramMotionEvent))
    {
      bool = true;
      AppMethodBeat.o(113765);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(113765);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(113774);
    super.finish();
    AppMethodBeat.o(113774);
  }

  public Resources getResources()
  {
    AppMethodBeat.i(113773);
    Resources localResources;
    if ((getAssets() != null) && (ah.getResources() != null))
    {
      localResources = ah.getResources();
      AppMethodBeat.o(113773);
    }
    while (true)
    {
      return localResources;
      localResources = super.getResources();
      AppMethodBeat.o(113773);
    }
  }

  public Object getSystemService(String paramString)
  {
    AppMethodBeat.i(113772);
    Object localObject = super.getSystemService(paramString);
    if ((getAssets() != null) && ("layout_inflater".equals(paramString)))
    {
      paramString = v.a((LayoutInflater)localObject);
      AppMethodBeat.o(113772);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(113772);
      paramString = localObject;
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(113771);
    this.basemapUI.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(113771);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(113764);
    this.basemapUI.onBackPressed();
    AppMethodBeat.o(113764);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    AppMethodBeat.i(113763);
    ab.i("MicroMsg.SoSoProxyUI", "SoSoProxyUI onCreate");
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("intent_map_key", -1);
    if (c.a.nRw == null);
    while (true)
    {
      try
      {
        boolean bool2 = b.foreground;
        if (paramBundle != null)
        {
          ab.e("MicroMsg.SoSoProxyUI", "summerasyncinit not init activity foreground[%b] savedInstanceState[%b], activity[%s, %d]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), getClass().getSimpleName(), Integer.valueOf(hashCode()) });
          finish();
          h.pYm.a(598L, 20L, 1L, false);
          AppMethodBeat.o(113763);
          return;
        }
        bool1 = false;
        continue;
      }
      catch (Throwable paramBundle)
      {
        ab.printErrStackTrace("MicroMsg.SoSoProxyUI", paramBundle, "summerasyncinit finish:", new Object[0]);
        continue;
      }
      this.basemapUI = c.a.nRw.d(this, i);
      if (this.basemapUI == null)
      {
        finish();
        AppMethodBeat.o(113763);
      }
      else
      {
        this.basemapUI.onCreate(paramBundle);
        AppMethodBeat.o(113763);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(113770);
    if (this.basemapUI != null)
      this.basemapUI.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(113770);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(113767);
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      this.basemapUI.bKn();
      AppMethodBeat.o(113767);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(113767);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(113769);
    super.onPause();
    this.basemapUI.onPause();
    AppMethodBeat.o(113769);
  }

  public void onResume()
  {
    AppMethodBeat.i(113768);
    super.onResume();
    this.basemapUI.onResume();
    AppMethodBeat.o(113768);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location_soso.SoSoProxyUI
 * JD-Core Version:    0.6.2
 */