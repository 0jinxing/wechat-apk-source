package com.tencent.mm.plugin.scanner.ui;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;

final class e$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  e$2(e parame)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(81019);
    ab.d("MicroMsg.scanner.PlainTextPreference", "summaryTv.getHeight() = " + e.b(this.qcq).getHeight() + ", summaryTv.getLineHeight() = " + e.b(this.qcq).getLineHeight());
    if ((e.b(this.qcq).getText() != null) && (e.b(this.qcq).getHeight() > 0) && (e.b(this.qcq).getLineHeight() > 0) && (e.d(this.qcq) == null))
    {
      if ((e.b(this.qcq).getHeight() / e.b(this.qcq).getLineHeight() > 5) && (!this.qcq.qcm) && (!this.qcq.qcl))
      {
        e.a(this.qcq).setVisibility(0);
        e.b(this.qcq).setMaxLines(5);
        this.qcq.qcm = true;
        if ((e.c(this.qcq) != null) && (e.c(this.qcq).Wg(this.qcq.mKey) == null))
        {
          e.c(this.qcq).a(this.qcq.mKey, Boolean.FALSE);
          e.c(this.qcq).chl();
        }
      }
      ab.d("MicroMsg.scanner.PlainTextPreference", "summaryTv.getHeight() / summaryTv.getLineHeight() = " + e.b(this.qcq).getHeight() / e.b(this.qcq).getLineHeight());
    }
    e.b(this.qcq).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    AppMethodBeat.o(81019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.e.2
 * JD-Core Version:    0.6.2
 */