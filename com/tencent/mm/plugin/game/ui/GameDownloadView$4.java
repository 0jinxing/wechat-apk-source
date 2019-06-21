package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.sdk.platformtools.bo;

final class GameDownloadView$4
  implements j.a
{
  GameDownloadView$4(GameDownloadView paramGameDownloadView)
  {
  }

  public final void f(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(111895);
    if ((!paramBoolean) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(111895);
    while (true)
    {
      return;
      if ((GameDownloadView.b(this.nia) == null) || (GameDownloadView.b(this.nia).mVZ == null) || (!GameDownloadView.b(this.nia).mVZ.field_appId.equals(paramString)))
      {
        AppMethodBeat.o(111895);
      }
      else
      {
        this.nia.refresh();
        AppMethodBeat.o(111895);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadView.4
 * JD-Core Version:    0.6.2
 */