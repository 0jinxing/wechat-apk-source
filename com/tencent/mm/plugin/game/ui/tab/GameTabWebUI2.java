package com.tencent.mm.plugin.game.ui.tab;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameTabWebUI2 extends GameTabWebUI
{
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabWebUI2
 * JD-Core Version:    0.6.2
 */