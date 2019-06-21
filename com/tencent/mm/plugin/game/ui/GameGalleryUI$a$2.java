package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class GameGalleryUI$a$2
  implements View.OnClickListener
{
  GameGalleryUI$a$2(GameGalleryUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111963);
    ((MMActivity)this.nje.mContext).finish();
    AppMethodBeat.o(111963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameGalleryUI.a.2
 * JD-Core Version:    0.6.2
 */