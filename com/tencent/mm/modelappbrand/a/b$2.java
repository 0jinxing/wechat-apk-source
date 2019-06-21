package com.tencent.mm.modelappbrand.a;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2 extends b.k
{
  b$2(b paramb1, ImageView paramImageView, b paramb2, Drawable paramDrawable)
  {
    super(paramImageView, paramb2, (byte)0);
  }

  public final void abU()
  {
    AppMethodBeat.i(77316);
    if ((getImageView() != null) && (this.fqj != null))
      getImageView().setImageDrawable(this.fqj);
    AppMethodBeat.o(77316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.2
 * JD-Core Version:    0.6.2
 */