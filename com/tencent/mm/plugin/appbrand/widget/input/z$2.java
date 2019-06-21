package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.SpanWatcher;
import android.text.Spannable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class z$2
  implements SpanWatcher
{
  z$2(z paramz)
  {
  }

  public final void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123829);
    if (aj.bM(paramObject))
      ab.d("MicroMsg.EditTextComposingTextDismissedObserver", "[bindInput] onSpanAdded %s, %s", new Object[] { paramSpannable, paramObject.getClass().getSimpleName() });
    AppMethodBeat.o(123829);
  }

  public final void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(123831);
    if (aj.bM(paramObject))
      ab.d("MicroMsg.EditTextComposingTextDismissedObserver", "[bindInput] onSpanChanged %s, %s", new Object[] { paramSpannable, paramObject.getClass().getSimpleName() });
    AppMethodBeat.o(123831);
  }

  public final void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123830);
    if (aj.bM(paramObject))
    {
      ab.d("MicroMsg.EditTextComposingTextDismissedObserver", "[bindInput] onSpanRemoved %s, %s", new Object[] { paramSpannable, paramObject.getClass().getSimpleName() });
      this.jgB.iGP.removeCallbacks(this.jgB.jgA);
      this.jgB.iGP.postDelayed(this.jgB.jgA, 100L);
    }
    AppMethodBeat.o(123830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.z.2
 * JD-Core Version:    0.6.2
 */