package com.tencent.mm.plugin.subapp.ui.gallery;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class GestureGalleryUI$4
  implements AdapterView.OnItemSelectedListener
{
  GestureGalleryUI$4(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25378);
    GestureGalleryUI.c(this.sum, paramInt);
    this.sum.setMMTitle(GestureGalleryUI.p(this.sum) + 1 + " / " + GestureGalleryUI.q(this.sum).size());
    ab.d("MicroMsg.GestureGalleryUI", "pos:".concat(String.valueOf(paramInt)));
    GestureGalleryUI.c(this.sum, GestureGalleryUI.t(this.sum).c((String)GestureGalleryUI.q(this.sum).get(paramInt), GestureGalleryUI.r(this.sum), paramInt, GestureGalleryUI.s(this.sum)));
    if (bo.isNullOrNil(GestureGalleryUI.c(this.sum)))
      GestureGalleryUI.c(this.sum, (String)GestureGalleryUI.q(this.sum).get(paramInt));
    GestureGalleryUI.e(this.sum);
    AppMethodBeat.o(25378);
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.4
 * JD-Core Version:    0.6.2
 */