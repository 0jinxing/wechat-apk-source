package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.Map;

class b$k
  implements b.i
{
  private final WeakReference<ImageView> aIp;
  private final b fqu;
  boolean fqv;
  final String key;

  private b$k(ImageView paramImageView, b paramb)
  {
    AppMethodBeat.i(77341);
    this.fqv = false;
    this.aIp = new WeakReference(paramImageView);
    this.fqu = paramb;
    this.key = ("ImageView#" + paramImageView.hashCode());
    AppMethodBeat.o(77341);
  }

  private void abX()
  {
    AppMethodBeat.i(77342);
    if (this.aIp.get() != null)
      b.c(this.fqu).remove(Integer.valueOf(((ImageView)this.aIp.get()).hashCode()));
    AppMethodBeat.o(77342);
  }

  public void abU()
  {
  }

  final ImageView getImageView()
  {
    AppMethodBeat.i(77340);
    ImageView localImageView = (ImageView)this.aIp.get();
    AppMethodBeat.o(77340);
    return localImageView;
  }

  public final void mr()
  {
    AppMethodBeat.i(77344);
    abX();
    AppMethodBeat.o(77344);
  }

  public final String wP()
  {
    return this.key;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(77343);
    abX();
    ImageView localImageView = (ImageView)this.aIp.get();
    if (localImageView != null)
    {
      if (!al.isMainThread())
        ab.b("MicroMsg.AppBrandSimpleImageLoader", "onBitmapLoaded invoke in non-main thread!!!", new Object[0]);
      localImageView.setImageDrawable(new e(localImageView.getResources(), paramBitmap));
    }
    this.fqv = true;
    AppMethodBeat.o(77343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.k
 * JD-Core Version:    0.6.2
 */