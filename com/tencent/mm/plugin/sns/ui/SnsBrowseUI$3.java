package com.tencent.mm.plugin.sns.ui;

import android.graphics.BitmapFactory.Options;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.tools.e;

final class SnsBrowseUI$3
  implements ViewTreeObserver.OnPreDrawListener
{
  SnsBrowseUI$3(SnsBrowseUI paramSnsBrowseUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(38751);
    this.rpC.rpp.getViewTreeObserver().removeOnPreDrawListener(this);
    SnsBrowseUI.a(this.rpC, this.rpC.rpp.getWidth());
    SnsBrowseUI.b(this.rpC, this.rpC.rpp.getHeight());
    SnsBrowseUI.c(this.rpC, this.rpC.rpp.getWidth());
    SnsBrowseUI.d(this.rpC, this.rpC.rpp.getHeight());
    af.cnC();
    Object localObject = g.C(this.rpC.rpp.getCntMedia());
    if (localObject != null)
    {
      BitmapFactory.Options localOptions = d.amj((String)localObject);
      localObject = this.rpC;
      float f = SnsBrowseUI.b(this.rpC) / localOptions.outWidth;
      SnsBrowseUI.d((SnsBrowseUI)localObject, (int)(localOptions.outHeight * f));
      if (SnsBrowseUI.c(this.rpC) > this.rpC.rpp.getHeight())
        SnsBrowseUI.d(this.rpC, this.rpC.rpp.getHeight());
    }
    this.rpC.jYE.hw(SnsBrowseUI.b(this.rpC), SnsBrowseUI.c(this.rpC));
    this.rpC.jYE.a(this.rpC.rpp, SnsBrowseUI.d(this.rpC), null);
    this.rpC.csT();
    AppMethodBeat.o(38751);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsBrowseUI.3
 * JD-Core Version:    0.6.2
 */