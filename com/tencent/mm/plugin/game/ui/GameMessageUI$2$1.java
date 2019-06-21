package com.tencent.mm.plugin.game.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.model.r;

final class GameMessageUI$2$1
  implements DialogInterface.OnClickListener
{
  GameMessageUI$2$1(GameMessageUI.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(112100);
    ((c)g.K(c.class)).bCY().hY("GameRawMessage", "delete from GameRawMessage");
    GameMessageUI.b(this.nlv.nlu).KD();
    GameMessageUI.b(this.nlv.nlu).notifyDataSetChanged();
    AppMethodBeat.o(112100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageUI.2.1
 * JD-Core Version:    0.6.2
 */