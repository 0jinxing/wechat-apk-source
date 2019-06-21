package com.bumptech.glide.c.c;

import android.content.res.Resources;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s$d
  implements o<Integer, Uri>
{
  private final Resources aEH;

  public s$d(Resources paramResources)
  {
    this.aEH = paramResources;
  }

  public final n<Integer, Uri> a(r paramr)
  {
    AppMethodBeat.i(92129);
    paramr = new s(this.aEH, v.nk());
    AppMethodBeat.o(92129);
    return paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.s.d
 * JD-Core Version:    0.6.2
 */