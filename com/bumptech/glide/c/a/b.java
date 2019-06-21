package com.bumptech.glide.c.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.c.a;
import com.bumptech.glide.g;
import java.io.IOException;

public abstract class b<T>
  implements d<T>
{
  private final String azi;
  private final AssetManager azj;
  private T data;

  public b(AssetManager paramAssetManager, String paramString)
  {
    this.azj = paramAssetManager;
    this.azi = paramString;
  }

  protected abstract void R(T paramT);

  protected abstract T a(AssetManager paramAssetManager, String paramString);

  public final void a(g paramg, d.a<? super T> parama)
  {
    try
    {
      this.data = a(this.azj, this.azi);
      parama.S(this.data);
      return;
    }
    catch (IOException paramg)
    {
      while (true)
      {
        Log.isLoggable("AssetPathFetcher", 3);
        parama.b(paramg);
      }
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
    if (this.data == null);
    while (true)
    {
      return;
      try
      {
        R(this.data);
      }
      catch (IOException localIOException)
      {
      }
    }
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.b
 * JD-Core Version:    0.6.2
 */