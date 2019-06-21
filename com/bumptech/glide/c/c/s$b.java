package com.bumptech.glide.c.c;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s$b
  implements o<Integer, ParcelFileDescriptor>
{
  private final Resources aEH;

  public s$b(Resources paramResources)
  {
    this.aEH = paramResources;
  }

  public final n<Integer, ParcelFileDescriptor> a(r paramr)
  {
    AppMethodBeat.i(92127);
    paramr = new s(this.aEH, paramr.b(Uri.class, ParcelFileDescriptor.class));
    AppMethodBeat.o(92127);
    return paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.s.b
 * JD-Core Version:    0.6.2
 */