package com.bumptech.glide.c.c;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class x<Data>
  implements n<Uri, Data>
{
  private static final Set<String> aEL;
  private final n<g, Data> aEN;

  static
  {
    AppMethodBeat.i(92157);
    aEL = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "http", "https" })));
    AppMethodBeat.o(92157);
  }

  public x(n<g, Data> paramn)
  {
    this.aEN = paramn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.x
 * JD-Core Version:    0.6.2
 */