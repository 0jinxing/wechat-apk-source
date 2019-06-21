package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.event.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

final class a$2 extends b
{
  a$2(a parama)
  {
  }

  public final void bDB()
  {
    AppMethodBeat.i(8648);
    ab.i("MicroMsg.GameFloatWebView", "float page, reload url:%s from net", new Object[] { this.uDk.mUH });
    if ((this.uDk.fow != null) && (this.uDk.fow.getParent() != null) && (this.uDk.uDf != null) && (!bo.isNullOrNil(this.uDk.mUH)))
    {
      this.uDk.fow.stopLoading();
      this.uDk.fow.loadUrl(this.uDk.uDf.dbW());
    }
    AppMethodBeat.o(8648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a.2
 * JD-Core Version:    0.6.2
 */