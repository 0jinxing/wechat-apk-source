package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public final class ImageRequest$ListenerImageRequest extends ImageRequest
{
  private WeakReference<ImageManager.OnImageLoadedListener> zzpp;

  public ImageRequest$ListenerImageRequest(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    super(paramUri, 0);
    AppMethodBeat.i(61232);
    Asserts.checkNotNull(paramOnImageLoadedListener);
    this.zzpp = new WeakReference(paramOnImageLoadedListener);
    AppMethodBeat.o(61232);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(61234);
    boolean bool;
    if (!(paramObject instanceof ListenerImageRequest))
    {
      AppMethodBeat.o(61234);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        AppMethodBeat.o(61234);
        bool = true;
      }
      else
      {
        ListenerImageRequest localListenerImageRequest = (ListenerImageRequest)paramObject;
        paramObject = (ImageManager.OnImageLoadedListener)this.zzpp.get();
        ImageManager.OnImageLoadedListener localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)localListenerImageRequest.zzpp.get();
        if ((localOnImageLoadedListener != null) && (paramObject != null) && (Objects.equal(localOnImageLoadedListener, paramObject)) && (Objects.equal(localListenerImageRequest.zzpk, this.zzpk)))
        {
          AppMethodBeat.o(61234);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(61234);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(61233);
    int i = Objects.hashCode(new Object[] { this.zzpk });
    AppMethodBeat.o(61233);
    return i;
  }

  protected final void loadImage(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(61235);
    if (!paramBoolean2)
    {
      ImageManager.OnImageLoadedListener localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)this.zzpp.get();
      if (localOnImageLoadedListener != null)
        localOnImageLoadedListener.onImageLoaded(this.zzpk.uri, paramDrawable, paramBoolean3);
    }
    AppMethodBeat.o(61235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageRequest.ListenerImageRequest
 * JD-Core Version:    0.6.2
 */