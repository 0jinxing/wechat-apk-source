package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f$10
  implements View.OnClickListener
{
  public f$10(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134262);
    ab.i(f.TAG, "user clicked dialog inside");
    AppMethodBeat.o(134262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.10
 * JD-Core Version:    0.6.2
 */