package com.tencent.mm.plugin.appbrand.game.e.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText;
import com.tencent.mm.plugin.appbrand.game.widget.input.a;
import com.tencent.mm.plugin.appbrand.s;

final class e$5
  implements View.OnClickListener
{
  e$5(e parame, WAGamePanelInputEditText paramWAGamePanelInputEditText, s params, boolean paramBoolean, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(130209);
    this.hsz.hst.a(this.hsA.getEditableText().toString(), this.hsj);
    this.hsz.hsr.a(this.hsA.getEditableText().toString(), this.hsj);
    if (!this.hsx)
      this.hsB.hide();
    AppMethodBeat.o(130209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.e.5
 * JD-Core Version:    0.6.2
 */