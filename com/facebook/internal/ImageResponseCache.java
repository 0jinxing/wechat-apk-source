package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class ImageResponseCache
{
  static final String TAG;
  private static FileLruCache imageCache;

  static
  {
    AppMethodBeat.i(72398);
    TAG = ImageResponseCache.class.getSimpleName();
    AppMethodBeat.o(72398);
  }

  static void clearCache(Context paramContext)
  {
    AppMethodBeat.i(72397);
    try
    {
      getCache(paramContext).clearCache();
      AppMethodBeat.o(72397);
      return;
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        Logger.log(LoggingBehavior.CACHE, 5, TAG, "clearCache failed " + paramContext.getMessage());
        AppMethodBeat.o(72397);
      }
    }
  }

  static FileLruCache getCache(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(72393);
      if (imageCache == null)
      {
        FileLruCache localFileLruCache = new com/facebook/internal/FileLruCache;
        String str = TAG;
        paramContext = new com/facebook/internal/FileLruCache$Limits;
        paramContext.<init>();
        localFileLruCache.<init>(str, paramContext);
        imageCache = localFileLruCache;
      }
      paramContext = imageCache;
      AppMethodBeat.o(72393);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  static InputStream getCachedImageStream(Uri paramUri, Context paramContext)
  {
    AppMethodBeat.i(72394);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramUri != null)
    {
      localObject2 = localObject1;
      if (!isCDNURL(paramUri));
    }
    try
    {
      localObject2 = getCache(paramContext).get(paramUri.toString());
      AppMethodBeat.o(72394);
      return localObject2;
    }
    catch (IOException paramUri)
    {
      while (true)
      {
        Logger.log(LoggingBehavior.CACHE, 5, TAG, paramUri.toString());
        localObject2 = localObject1;
      }
    }
  }

  static InputStream interceptAndCacheImageStream(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(72395);
    Object localObject1 = null;
    Object localObject2;
    InputStream localInputStream;
    if (paramHttpURLConnection.getResponseCode() == 200)
    {
      localObject2 = Uri.parse(paramHttpURLConnection.getURL().toString());
      localInputStream = paramHttpURLConnection.getInputStream();
      localObject1 = localInputStream;
    }
    try
    {
      if (isCDNURL((Uri)localObject2))
      {
        paramContext = getCache(paramContext);
        localObject2 = ((Uri)localObject2).toString();
        localObject1 = new com/facebook/internal/ImageResponseCache$BufferedHttpInputStream;
        ((ImageResponseCache.BufferedHttpInputStream)localObject1).<init>(localInputStream, paramHttpURLConnection);
        localObject1 = paramContext.interceptAndPut((String)localObject2, (InputStream)localObject1);
      }
      AppMethodBeat.o(72395);
      return localObject1;
    }
    catch (IOException paramContext)
    {
      while (true)
        localObject1 = localInputStream;
    }
  }

  private static boolean isCDNURL(Uri paramUri)
  {
    boolean bool = true;
    AppMethodBeat.i(72396);
    if (paramUri != null)
    {
      paramUri = paramUri.getHost();
      if (paramUri.endsWith("fbcdn.net"))
        AppMethodBeat.o(72396);
    }
    while (true)
    {
      return bool;
      if ((paramUri.startsWith("fbcdn")) && (paramUri.endsWith("akamaihd.net")))
      {
        AppMethodBeat.o(72396);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(72396);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageResponseCache
 * JD-Core Version:    0.6.2
 */