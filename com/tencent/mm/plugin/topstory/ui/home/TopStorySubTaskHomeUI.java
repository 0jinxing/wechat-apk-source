package com.tencent.mm.plugin.topstory.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(1)
public class TopStorySubTaskHomeUI extends MMActivity
{
  private b sBF;

  public TopStorySubTaskHomeUI()
  {
    AppMethodBeat.i(1663);
    this.sBF = new b(this, false);
    AppMethodBeat.o(1663);
  }

  public final int getLayoutId()
  {
    return 2130970950;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1664);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
    this.sBF.onCreate(paramBundle);
    AppMethodBeat.o(1664);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1668);
    this.sBF.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(1668);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(1665);
    boolean bool = this.sBF.FA(paramInt);
    AppMethodBeat.o(1665);
    return bool;
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(1669);
    this.sBF.onNewIntent(paramIntent);
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(1669);
  }

  public void onPause()
  {
    AppMethodBeat.i(1667);
    this.sBF.onPause();
    super.onPause();
    AppMethodBeat.o(1667);
  }

  public void onResume()
  {
    AppMethodBeat.i(1666);
    super.onResume();
    this.sBF.onResume();
    AppMethodBeat.o(1666);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(1670);
    super.onSaveInstanceState(paramBundle);
    this.sBF.onSaveInstanceState(paramBundle);
    AppMethodBeat.o(1670);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySubTaskHomeUI
 * JD-Core Version:    0.6.2
 */