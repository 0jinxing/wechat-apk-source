package com.bumptech.glide.c.a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.c.a;
import com.bumptech.glide.g;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T>
  implements d<T>
{
  private final ContentResolver azy;
  private T data;
  private final Uri uri;

  public l(ContentResolver paramContentResolver, Uri paramUri)
  {
    this.azy = paramContentResolver;
    this.uri = paramUri;
  }

  protected abstract void R(T paramT);

  protected abstract T a(Uri paramUri, ContentResolver paramContentResolver);

  public final void a(g paramg, d.a<? super T> parama)
  {
    try
    {
      this.data = a(this.uri, this.azy);
      parama.S(this.data);
      return;
    }
    catch (FileNotFoundException paramg)
    {
      while (true)
      {
        Log.isLoggable("LocalUriFetcher", 3);
        parama.b(paramg);
      }
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
    if (this.data != null);
    try
    {
      R(this.data);
      label15: return;
    }
    catch (IOException localIOException)
    {
      break label15;
    }
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.l
 * JD-Core Version:    0.6.2
 */