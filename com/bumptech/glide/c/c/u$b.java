package com.bumptech.glide.c.c;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class u$b
  implements o<String, ParcelFileDescriptor>
{
  public final n<String, ParcelFileDescriptor> a(r paramr)
  {
    AppMethodBeat.i(92135);
    paramr = new u(paramr.b(Uri.class, ParcelFileDescriptor.class));
    AppMethodBeat.o(92135);
    return paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.u.b
 * JD-Core Version:    0.6.2
 */