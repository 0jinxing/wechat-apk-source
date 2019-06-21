package com.tencent.mm.plugin.appbrand.game.e.a;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.widget.input.WAGamePanelInputEditText;
import com.tencent.mm.plugin.appbrand.s;

final class e$7
  implements TextView.OnEditorActionListener
{
  e$7(e parame, boolean paramBoolean, WAGamePanelInputEditText paramWAGamePanelInputEditText, s params)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(130211);
    boolean bool;
    if (this.hsx)
    {
      this.hsz.hst.a(this.hsA.getEditableText().toString(), this.hsj);
      bool = true;
      AppMethodBeat.o(130211);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(130211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.e.7
 * JD-Core Version:    0.6.2
 */