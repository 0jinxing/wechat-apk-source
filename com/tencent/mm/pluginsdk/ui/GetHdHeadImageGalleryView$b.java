package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.f.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.tools.MMGestureGallery.c;

final class GetHdHeadImageGalleryView$b
  implements MMGestureGallery.c
{
  private GetHdHeadImageGalleryView$b(GetHdHeadImageGalleryView paramGetHdHeadImageGalleryView)
  {
  }

  public final void bvE()
  {
    AppMethodBeat.i(79684);
    if ((GetHdHeadImageGalleryView.b(this.vhx) != null) && (GetHdHeadImageGalleryView.c(this.vhx) != null))
    {
      String[] arrayOfString = this.vhx.getContext().getResources().getStringArray(2131755020);
      h.a(this.vhx.getContext(), null, arrayOfString, "", new h.c()
      {
        public final void iE(int paramAnonymousInt)
        {
          AppMethodBeat.i(79683);
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          }
          while (true)
          {
            AppMethodBeat.o(79683);
            return;
            String str = com.tencent.mm.compatible.util.e.euR + "hdImg_" + g.x(GetHdHeadImageGalleryView.c(GetHdHeadImageGalleryView.b.this.vhx).getBytes()) + System.currentTimeMillis() + ".jpg";
            com.tencent.mm.vfs.e.deleteFile(str);
            com.tencent.mm.vfs.e.y(GetHdHeadImageGalleryView.b(GetHdHeadImageGalleryView.b.this.vhx), str);
            a.a(str, GetHdHeadImageGalleryView.b.this.vhx.getContext());
            Toast.makeText(GetHdHeadImageGalleryView.b.this.vhx.getContext(), GetHdHeadImageGalleryView.b.this.vhx.getContext().getString(2131300410, new Object[] { com.tencent.mm.compatible.util.e.euR }), 1).show();
          }
        }
      });
    }
    AppMethodBeat.o(79684);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView.b
 * JD-Core Version:    0.6.2
 */