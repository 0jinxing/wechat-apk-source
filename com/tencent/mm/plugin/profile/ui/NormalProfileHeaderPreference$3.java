package com.tencent.mm.plugin.profile.ui;

import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ad;

final class NormalProfileHeaderPreference$3
  implements PopupWindow.OnDismissListener
{
  NormalProfileHeaderPreference$3(NormalProfileHeaderPreference paramNormalProfileHeaderPreference, TextView paramTextView, ad paramad)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(23654);
    NormalProfileHeaderPreference.a(this.pnT, this.pnU, this.emj);
    AppMethodBeat.o(23654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference.3
 * JD-Core Version:    0.6.2
 */