package com.bumptech.glide.c.c;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.bumptech.glide.c.a.a;
import com.bumptech.glide.c.a.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w$a
  implements o<Uri, AssetFileDescriptor>, w.c<AssetFileDescriptor>
{
  private final ContentResolver azy;

  public w$a(ContentResolver paramContentResolver)
  {
    this.azy = paramContentResolver;
  }

  public final n<Uri, AssetFileDescriptor> a(r paramr)
  {
    AppMethodBeat.i(92145);
    paramr = new w(this);
    AppMethodBeat.o(92145);
    return paramr;
  }

  public final d<AssetFileDescriptor> l(Uri paramUri)
  {
    AppMethodBeat.i(92146);
    paramUri = new a(this.azy, paramUri);
    AppMethodBeat.o(92146);
    return paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.w.a
 * JD-Core Version:    0.6.2
 */