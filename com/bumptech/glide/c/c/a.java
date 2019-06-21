package com.bumptech.glide.c.c;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class a<Data>
  implements n<Uri, Data>
{
  private static final int aDM = 22;
  private final a<Data> aDN;
  private final AssetManager azj;

  public a(AssetManager paramAssetManager, a<Data> parama)
  {
    this.azj = paramAssetManager;
    this.aDN = parama;
  }

  public static abstract interface a<Data>
  {
    public abstract d<Data> b(AssetManager paramAssetManager, String paramString);
  }

  public static final class c
    implements a.a<InputStream>, o<Uri, InputStream>
  {
    private final AssetManager azj;

    public c(AssetManager paramAssetManager)
    {
      this.azj = paramAssetManager;
    }

    public final n<Uri, InputStream> a(r paramr)
    {
      AppMethodBeat.i(92032);
      paramr = new a(this.azj, this);
      AppMethodBeat.o(92032);
      return paramr;
    }

    public final d<InputStream> b(AssetManager paramAssetManager, String paramString)
    {
      AppMethodBeat.i(92033);
      paramAssetManager = new m(paramAssetManager, paramString);
      AppMethodBeat.o(92033);
      return paramAssetManager;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.a
 * JD-Core Version:    0.6.2
 */