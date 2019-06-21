package com.tencent.mm.plugin.fav.ui.gallery;

import android.support.v7.widget.RecyclerView.v;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  f$1(f paramf, RecyclerView.v paramv)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(74565);
    ((f.d)this.ahD).mok.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    ((f.d)this.ahD).mom.setLayoutParams(new RelativeLayout.LayoutParams(((f.d)this.ahD).mok.getWidth(), ((f.d)this.ahD).mok.getHeight()));
    AppMethodBeat.o(74565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.1
 * JD-Core Version:    0.6.2
 */