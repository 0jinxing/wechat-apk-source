package com.tencent.mm.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.preference.IconPreference;

final class MoreTabUI$5
  implements g
{
  MoreTabUI$5(MoreTabUI paramMoreTabUI, IconPreference paramIconPreference)
  {
  }

  public final Bitmap a(String paramString, View paramView, b paramb)
  {
    return null;
  }

  public final void b(String paramString, View paramView, b paramb)
  {
    AppMethodBeat.i(29696);
    if (paramb.bitmap != null)
    {
      al.d(new MoreTabUI.5.2(this, paramb.bitmap));
      AppMethodBeat.o(29696);
    }
    while (true)
    {
      return;
      al.d(new MoreTabUI.5.3(this));
      AppMethodBeat.o(29696);
    }
  }

  public final void sH(String paramString)
  {
    AppMethodBeat.i(29695);
    al.d(new MoreTabUI.5.1(this));
    AppMethodBeat.o(29695);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.5
 * JD-Core Version:    0.6.2
 */