package com.bumptech.glide.c.c.a;

import android.net.Uri;
import com.bumptech.glide.c.c.g;
import com.bumptech.glide.c.c.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b
  implements n<Uri, InputStream>
{
  private static final Set<String> aEL;
  private final n<g, InputStream> aEN;

  static
  {
    AppMethodBeat.i(92165);
    aEL = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "http", "https" })));
    AppMethodBeat.o(92165);
  }

  public b(n<g, InputStream> paramn)
  {
    this.aEN = paramn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.a.b
 * JD-Core Version:    0.6.2
 */