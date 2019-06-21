package com.bumptech.glide.c.c;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.c.a.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class w$d
  implements o<Uri, InputStream>, w.c<InputStream>
{
  private final ContentResolver azy;

  public w$d(ContentResolver paramContentResolver)
  {
    this.azy = paramContentResolver;
  }

  public final n<Uri, InputStream> a(r paramr)
  {
    AppMethodBeat.i(92150);
    paramr = new w(this);
    AppMethodBeat.o(92150);
    return paramr;
  }

  public final d<InputStream> l(Uri paramUri)
  {
    AppMethodBeat.i(92149);
    paramUri = new com.bumptech.glide.c.a.n(this.azy, paramUri);
    AppMethodBeat.o(92149);
    return paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.w.d
 * JD-Core Version:    0.6.2
 */