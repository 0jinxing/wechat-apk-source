package com.tencent.mm.plugin.subapp.ui.gallery;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;

final class GestureGalleryUI$9
  implements MMGestureGallery.c
{
  GestureGalleryUI$9(GestureGalleryUI paramGestureGalleryUI, int paramInt)
  {
  }

  public final void bvE()
  {
    AppMethodBeat.i(25386);
    Object localObject;
    if (1 == this.sun)
    {
      localObject = v.Zp().y("basescanui@datacenter", true);
      ((v.b)localObject).j("key_basescanui_screen_x", Integer.valueOf(GestureGalleryUI.a(this.sum).getXDown()));
      ((v.b)localObject).j("key_basescanui_screen_y", Integer.valueOf(GestureGalleryUI.a(this.sum).getYDown()));
      GestureGalleryUI.b(this.sum);
      AppMethodBeat.o(25386);
    }
    while (true)
    {
      return;
      if (2 == this.sun)
      {
        localObject = this.sum.mController.ylL.getResources().getStringArray(2131755051);
        h.a(this.sum, null, (String[])localObject, "", false, new GestureGalleryUI.9.1(this));
      }
      AppMethodBeat.o(25386);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.9
 * JD-Core Version:    0.6.2
 */