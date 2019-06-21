package com.bumptech.glide.c.c;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$b
  implements a.a<ParcelFileDescriptor>, o<Uri, ParcelFileDescriptor>
{
  private final AssetManager azj;

  public a$b(AssetManager paramAssetManager)
  {
    this.azj = paramAssetManager;
  }

  public final n<Uri, ParcelFileDescriptor> a(r paramr)
  {
    AppMethodBeat.i(92030);
    paramr = new a(this.azj, this);
    AppMethodBeat.o(92030);
    return paramr;
  }

  public final d<ParcelFileDescriptor> b(AssetManager paramAssetManager, String paramString)
  {
    AppMethodBeat.i(92031);
    paramAssetManager = new h(paramAssetManager, paramString);
    AppMethodBeat.o(92031);
    return paramAssetManager;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.a.b
 * JD-Core Version:    0.6.2
 */