package com.tencent.mm.plugin.appbrand.widget.b;

import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$7
  implements RatingBar.OnRatingBarChangeListener
{
  public f$7(f paramf)
  {
  }

  public final void onRatingChanged(RatingBar paramRatingBar, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(134259);
    f.a(this.jck, paramFloat);
    AppMethodBeat.o(134259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.7
 * JD-Core Version:    0.6.2
 */