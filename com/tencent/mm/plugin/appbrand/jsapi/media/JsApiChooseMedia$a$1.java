package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class JsApiChooseMedia$a$1
  implements View.OnCreateContextMenuListener
{
  JsApiChooseMedia$a$1(JsApiChooseMedia.a parama)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(131168);
    paramContextMenu.add(0, 1, 0, JsApiChooseMedia.a.a(this.hPt).getString(2131296918));
    paramContextMenu.add(0, 2, 1, JsApiChooseMedia.a.b(this.hPt).getString(2131296925));
    AppMethodBeat.o(131168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a.1
 * JD-Core Version:    0.6.2
 */