package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class e$5
  implements ViewTreeObserver.OnPreDrawListener
{
  e$5(e parame, DynamicGridView paramDynamicGridView, List paramList)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(40325);
    this.rLc.getViewTreeObserver().removeOnPreDrawListener(this);
    this.rLd.Eu(this.rLf.size());
    AppMethodBeat.o(40325);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.e.5
 * JD-Core Version:    0.6.2
 */