package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.TextView;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(19)
public final class AppBrand404PageUI extends MMActivity
{
  public static void a(ActivityStarterIpcDelegate paramActivityStarterIpcDelegate)
  {
    AppMethodBeat.i(132886);
    a(ah.getContext().getString(2131296711), paramActivityStarterIpcDelegate);
    AppMethodBeat.o(132886);
  }

  private static void a(String paramString, ActivityStarterIpcDelegate paramActivityStarterIpcDelegate)
  {
    AppMethodBeat.i(132884);
    paramString = new Intent(ah.getContext(), AppBrand404PageUI.class).putExtra("key_wording", paramString).putExtra("key_icon_url", null);
    if (paramActivityStarterIpcDelegate != null)
    {
      if (paramString != null)
      {
        Bundle localBundle = new Bundle(1);
        localBundle.putParcelable("intent", paramString);
        paramActivityStarterIpcDelegate.bRc.send(4660, localBundle);
      }
      AppMethodBeat.o(132884);
    }
    while (true)
    {
      return;
      al.d(new AppBrand404PageUI.1(paramString));
      AppMethodBeat.o(132884);
    }
  }

  public static void show(int paramInt)
  {
    AppMethodBeat.i(132885);
    a(ah.getContext().getString(paramInt), null);
    AppMethodBeat.o(132885);
  }

  public final void finish()
  {
    AppMethodBeat.i(132888);
    super.finish();
    AppMethodBeat.o(132888);
  }

  public final int getLayoutId()
  {
    return 2130968653;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132887);
    super.onCreate(paramBundle);
    setMMTitle(2131296614);
    setBackBtn(new AppBrand404PageUI.2(this));
    TextView localTextView = (TextView)findViewById(2131821110);
    paramBundle = getIntent().getStringExtra("key_wording");
    bo.isNullOrNil(paramBundle);
    if (localTextView != null)
      localTextView.setText(paramBundle);
    AppMethodBeat.o(132887);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(132889);
    super.onDestroy();
    AppMethodBeat.o(132889);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI
 * JD-Core Version:    0.6.2
 */