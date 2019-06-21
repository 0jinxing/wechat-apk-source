package com.tencent.mm.ui.base.preference;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public final class e
{
  Bitmap bitmap = null;
  int resId = -1;

  public final void l(ImageView paramImageView)
  {
    AppMethodBeat.i(107159);
    if (paramImageView == null)
      AppMethodBeat.o(107159);
    while (true)
    {
      return;
      if (this.resId != -1)
        paramImageView.setImageDrawable(a.g(paramImageView.getContext(), this.resId));
      if (this.bitmap != null)
        paramImageView.setImageBitmap(this.bitmap);
      AppMethodBeat.o(107159);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.e
 * JD-Core Version:    0.6.2
 */