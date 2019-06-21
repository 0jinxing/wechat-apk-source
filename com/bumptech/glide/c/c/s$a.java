package com.bumptech.glide.c.c;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s$a
  implements o<Integer, AssetFileDescriptor>
{
  private final Resources aEH;

  public s$a(Resources paramResources)
  {
    this.aEH = paramResources;
  }

  public final n<Integer, AssetFileDescriptor> a(r paramr)
  {
    AppMethodBeat.i(92126);
    paramr = new s(this.aEH, paramr.b(Uri.class, AssetFileDescriptor.class));
    AppMethodBeat.o(92126);
    return paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.s.a
 * JD-Core Version:    0.6.2
 */