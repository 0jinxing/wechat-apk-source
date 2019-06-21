package com.tencent.mm.plugin.topstory.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class TopStoryHomeUI extends MMActivity
{
  private b sBF;

  public TopStoryHomeUI()
  {
    AppMethodBeat.i(1555);
    this.sBF = new b(this, true);
    AppMethodBeat.o(1555);
  }

  public void finish()
  {
    AppMethodBeat.i(1564);
    int i = 100;
    if (!this.mController.hideVKB())
      i = 0;
    al.n(new TopStoryHomeUI.1(this), i);
    AppMethodBeat.o(1564);
  }

  public final int getLayoutId()
  {
    return 2130970950;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(1563);
    b localb = this.sBF;
    if (localb.sBS)
      localb.cFD();
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
        super.onBackPressed();
      AppMethodBeat.o(1563);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1556);
    this.yll = true;
    super.onCreate(paramBundle);
    ab.i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
    this.sBF.onCreate(paramBundle);
    AppMethodBeat.o(1556);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1560);
    this.sBF.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(1560);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(1557);
    boolean bool;
    if (this.sBF.FA(paramInt))
    {
      bool = true;
      AppMethodBeat.o(1557);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(1557);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(1561);
    this.sBF.onNewIntent(paramIntent);
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(1561);
  }

  public void onPause()
  {
    AppMethodBeat.i(1559);
    this.sBF.onPause();
    super.onPause();
    AppMethodBeat.o(1559);
  }

  public void onResume()
  {
    AppMethodBeat.i(1558);
    super.onResume();
    this.sBF.onResume();
    AppMethodBeat.o(1558);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(1562);
    super.onSaveInstanceState(paramBundle);
    this.sBF.onSaveInstanceState(paramBundle);
    AppMethodBeat.o(1562);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI
 * JD-Core Version:    0.6.2
 */