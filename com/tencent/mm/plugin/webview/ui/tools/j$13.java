package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.e.f;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.neattextview.textview.view.NeatTextView;

final class j$13 extends f
{
  j$13(j paramj, NeatTextView paramNeatTextView, m paramm, String paramString)
  {
    super(paramNeatTextView, paramm);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(7654);
    boolean bool = super.onTouch(paramView, paramMotionEvent);
    if (bool)
    {
      ab.i("MMNeatTouchListener", "terry h5 apply click");
      h.pYm.e(16337, new Object[] { this.val$url, Integer.valueOf(1), Integer.valueOf(1) });
    }
    AppMethodBeat.o(7654);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.13
 * JD-Core Version:    0.6.2
 */