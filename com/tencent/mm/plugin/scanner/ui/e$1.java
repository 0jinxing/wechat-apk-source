package com.tencent.mm.plugin.scanner.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;

final class e$1
  implements View.OnTouchListener
{
  e$1(e parame)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(81018);
    if (paramMotionEvent.getAction() == 0)
    {
      ab.d("MicroMsg.scanner.PlainTextPreference", "moreTv onTouch");
      e.a(this.qcq).setVisibility(4);
      e.b(this.qcq).setMaxLines(2000);
      this.qcq.qcl = true;
      if (e.c(this.qcq) != null)
      {
        e.c(this.qcq).a(this.qcq.mKey, Boolean.TRUE);
        e.c(this.qcq).chl();
      }
    }
    AppMethodBeat.o(81018);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.e.1
 * JD-Core Version:    0.6.2
 */