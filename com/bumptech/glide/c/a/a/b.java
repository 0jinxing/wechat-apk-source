package com.bumptech.glide.c.a.a;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class b
{
  public static boolean aR(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != -2147483648) && (paramInt2 != -2147483648) && (paramInt1 <= 512) && (paramInt2 <= 384));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean f(Uri paramUri)
  {
    AppMethodBeat.i(91734);
    boolean bool;
    if ((paramUri != null) && ("content".equals(paramUri.getScheme())) && ("media".equals(paramUri.getAuthority())))
    {
      bool = true;
      AppMethodBeat.o(91734);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91734);
    }
  }

  public static boolean g(Uri paramUri)
  {
    AppMethodBeat.i(91735);
    boolean bool = paramUri.getPathSegments().contains("video");
    AppMethodBeat.o(91735);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.a.b
 * JD-Core Version:    0.6.2
 */