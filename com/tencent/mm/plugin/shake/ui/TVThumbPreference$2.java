package com.tencent.mm.plugin.shake.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.f;

final class TVThumbPreference$2
  implements Runnable
{
  TVThumbPreference$2(TVThumbPreference paramTVThumbPreference, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24937);
    TVThumbPreference.c(this.qwM).setImageBitmap(this.val$bitmap);
    if (TVThumbPreference.b(this.qwM) != null)
      TVThumbPreference.b(this.qwM).notifyDataSetChanged();
    AppMethodBeat.o(24937);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVThumbPreference.2
 * JD-Core Version:    0.6.2
 */