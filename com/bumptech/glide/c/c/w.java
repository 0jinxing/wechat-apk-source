package com.bumptech.glide.c.c;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class w<Data>
  implements n<Uri, Data>
{
  private static final Set<String> aEL;
  private final w.c<Data> aEM;

  static
  {
    AppMethodBeat.i(92153);
    aEL = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "file", "android.resource", "content" })));
    AppMethodBeat.o(92153);
  }

  public w(w.c<Data> paramc)
  {
    this.aEM = paramc;
  }

  public static final class b
    implements o<Uri, ParcelFileDescriptor>, w.c<ParcelFileDescriptor>
  {
    private final ContentResolver azy;

    public b(ContentResolver paramContentResolver)
    {
      this.azy = paramContentResolver;
    }

    public final n<Uri, ParcelFileDescriptor> a(r paramr)
    {
      AppMethodBeat.i(92148);
      paramr = new w(this);
      AppMethodBeat.o(92148);
      return paramr;
    }

    public final d<ParcelFileDescriptor> l(Uri paramUri)
    {
      AppMethodBeat.i(92147);
      paramUri = new i(this.azy, paramUri);
      AppMethodBeat.o(92147);
      return paramUri;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.w
 * JD-Core Version:    0.6.2
 */