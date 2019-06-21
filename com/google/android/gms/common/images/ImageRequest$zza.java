package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageRequest$zza
{
  public final Uri uri;

  public ImageRequest$zza(Uri paramUri)
  {
    this.uri = paramUri;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(61242);
    boolean bool;
    if (!(paramObject instanceof zza))
    {
      bool = false;
      AppMethodBeat.o(61242);
    }
    while (true)
    {
      return bool;
      if (this == paramObject)
      {
        bool = true;
        AppMethodBeat.o(61242);
      }
      else
      {
        bool = Objects.equal(((zza)paramObject).uri, this.uri);
        AppMethodBeat.o(61242);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(61241);
    int i = Objects.hashCode(new Object[] { this.uri });
    AppMethodBeat.o(61241);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageRequest.zza
 * JD-Core Version:    0.6.2
 */