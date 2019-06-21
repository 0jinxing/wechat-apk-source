package com.tencent.mm.plugin.topstory.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public class TopStoryTabHomeUI extends MMActivity
{
  private c sCP;

  public TopStoryTabHomeUI()
  {
    AppMethodBeat.i(1671);
    this.sCP = new c(this);
    AppMethodBeat.o(1671);
  }

  public final int getLayoutId()
  {
    return 2130970950;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1672);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
    this.sCP.onCreate(paramBundle);
    AppMethodBeat.o(1672);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1676);
    this.sCP.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(1676);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(1673);
    boolean bool;
    if (this.sCP.FA(paramInt))
    {
      bool = true;
      AppMethodBeat.o(1673);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(1673);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(1677);
    this.sCP.onNewIntent(paramIntent);
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(1677);
  }

  public void onPause()
  {
    AppMethodBeat.i(1675);
    this.sCP.onPause();
    super.onPause();
    AppMethodBeat.o(1675);
  }

  public void onResume()
  {
    AppMethodBeat.i(1674);
    super.onResume();
    this.sCP.onResume();
    AppMethodBeat.o(1674);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(1678);
    super.onSaveInstanceState(paramBundle);
    this.sCP.onSaveInstanceState(paramBundle);
    AppMethodBeat.o(1678);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryTabHomeUI
 * JD-Core Version:    0.6.2
 */