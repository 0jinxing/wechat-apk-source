package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

public class SuccUnbindQQ extends MMWizardActivity
{
  public final int getLayoutId()
  {
    return 2130970907;
  }

  public final void initView()
  {
    AppMethodBeat.i(13775);
    setMMTitle(2131304141);
    addTextOptionMenu(0, getString(2131296944), new SuccUnbindQQ.1(this));
    AppMethodBeat.o(13775);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13772);
    super.onCreate(paramBundle);
    AppMethodBeat.o(13772);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13773);
    super.onDestroy();
    AppMethodBeat.o(13773);
  }

  public void onResume()
  {
    AppMethodBeat.i(13774);
    super.onResume();
    initView();
    AppMethodBeat.o(13774);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.SuccUnbindQQ
 * JD-Core Version:    0.6.2
 */