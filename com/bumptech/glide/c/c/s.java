package com.bumptech.glide.c.c;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class s<Data>
  implements n<Integer, Data>
{
  private final n<Uri, Data> aEG;
  private final Resources aEH;

  public s(Resources paramResources, n<Uri, Data> paramn)
  {
    this.aEH = paramResources;
    this.aEG = paramn;
  }

  private Uri a(Integer paramInteger)
  {
    AppMethodBeat.i(92130);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("android.resource://");
      localObject = Uri.parse(this.aEH.getResourcePackageName(paramInteger.intValue()) + '/' + this.aEH.getResourceTypeName(paramInteger.intValue()) + '/' + this.aEH.getResourceEntryName(paramInteger.intValue()));
      paramInteger = (Integer)localObject;
      AppMethodBeat.o(92130);
      return paramInteger;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      while (true)
      {
        if (Log.isLoggable("ResourceLoader", 5))
          new StringBuilder("Received invalid resource id: ").append(paramInteger);
        paramInteger = null;
        AppMethodBeat.o(92130);
      }
    }
  }

  public static final class c
    implements o<Integer, InputStream>
  {
    private final Resources aEH;

    public c(Resources paramResources)
    {
      this.aEH = paramResources;
    }

    public final n<Integer, InputStream> a(r paramr)
    {
      AppMethodBeat.i(92128);
      paramr = new s(this.aEH, paramr.b(Uri.class, InputStream.class));
      AppMethodBeat.o(92128);
      return paramr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.s
 * JD-Core Version:    0.6.2
 */