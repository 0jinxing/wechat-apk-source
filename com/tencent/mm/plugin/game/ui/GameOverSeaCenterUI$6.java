package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.game.d.bk;
import com.tencent.mm.plugin.game.model.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class GameOverSeaCenterUI$6
  implements Runnable
{
  GameOverSeaCenterUI$6(GameOverSeaCenterUI paramGameOverSeaCenterUI, a parama, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(112134);
    if (this.nfV == null)
      GameOverSeaCenterUI.a(this.nlH, new bk());
    while (true)
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(112133);
          try
          {
            GameOverSeaCenterUI.a(GameOverSeaCenterUI.6.this.nlH, this.nlJ, 2);
            if (GameOverSeaCenterUI.a(GameOverSeaCenterUI.6.this.nlH) != null)
              GameOverSeaCenterUI.a(GameOverSeaCenterUI.6.this.nlH).dismiss();
            ab.i("MicroMsg.GameOverSeaCenterUI", "Server data parsing time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - GameOverSeaCenterUI.6.this.ecn) });
            AppMethodBeat.o(112133);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI crash, %s", new Object[] { localException.getMessage() });
              GameOverSeaCenterUI.6.this.nlH.finish();
            }
          }
        }
      });
      AppMethodBeat.o(112134);
      return;
      GameOverSeaCenterUI.a(this.nlH, (bk)this.nfV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI.6
 * JD-Core Version:    0.6.2
 */