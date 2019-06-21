package com.tencent.mm.plugin.game.ui.tab;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class GameTabWebUI$2 extends BroadcastReceiver
{
  GameTabWebUI$2(GameTabWebUI paramGameTabWebUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(112262);
    if ((paramIntent != null) && ("com.tencent.mm.ACTION_EXIT".equals(paramIntent.getAction())) && (GameTabWebUI.b(this.nno) != null) && (!GameTabWebUI.b(this.nno).isFinishing()))
    {
      ab.i("MicroMsg.GameTabWebUI", "%s exit!", new Object[] { GameTabWebUI.b(this.nno).getClass().getSimpleName() });
      GameTabWebUI.b(this.nno).finish();
    }
    AppMethodBeat.o(112262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.tab.GameTabWebUI.2
 * JD-Core Version:    0.6.2
 */