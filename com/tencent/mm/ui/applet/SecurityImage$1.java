package com.tencent.mm.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SecurityImage$1
  implements View.OnClickListener
{
  SecurityImage$1(SecurityImage paramSecurityImage)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106231);
    SecurityImage.a(this.yrV);
    if (SecurityImage.b(this.yrV) != null)
      SecurityImage.b(this.yrV).apw();
    AppMethodBeat.o(106231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.SecurityImage.1
 * JD-Core Version:    0.6.2
 */