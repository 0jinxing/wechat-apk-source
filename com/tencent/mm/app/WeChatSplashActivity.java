package com.tencent.mm.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.u;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.splash.SplashActivity;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.v;

public class WeChatSplashActivity extends SplashActivity
{
  public Resources getResources()
  {
    AppMethodBeat.i(137988);
    Resources localResources;
    if ((getAssets() != null) && (ah.getResources() != null))
    {
      localResources = ah.getResources();
      AppMethodBeat.o(137988);
    }
    while (true)
    {
      return localResources;
      localResources = super.getResources();
      AppMethodBeat.o(137988);
    }
  }

  public Object getSystemService(String paramString)
  {
    AppMethodBeat.i(137989);
    Object localObject = super.getSystemService(paramString);
    if ("layout_inflater".equals(paramString))
    {
      paramString = v.a((LayoutInflater)localObject);
      AppMethodBeat.o(137989);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(137989);
      paramString = localObject;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(137987);
    super.onCreate(paramBundle);
    MMActivity.initLanguage(getBaseContext());
    setContentView(2130971222);
    AppMethodBeat.o(137987);
  }

  public void onPause()
  {
    AppMethodBeat.i(137990);
    u.dgS();
    super.onPause();
    AppMethodBeat.o(137990);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashActivity
 * JD-Core Version:    0.6.2
 */