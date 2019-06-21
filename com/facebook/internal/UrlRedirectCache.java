package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.OutputStream;

class UrlRedirectCache
{
  private static final String REDIRECT_CONTENT_TAG;
  static final String TAG;
  private static FileLruCache urlRedirectCache;

  static
  {
    AppMethodBeat.i(72489);
    TAG = UrlRedirectCache.class.getSimpleName();
    REDIRECT_CONTENT_TAG = TAG + "_Redirect";
    AppMethodBeat.o(72489);
  }

  static void cacheUriRedirect(Uri paramUri1, Uri paramUri2)
  {
    AppMethodBeat.i(72487);
    if ((paramUri1 == null) || (paramUri2 == null))
      AppMethodBeat.o(72487);
    while (true)
    {
      return;
      Uri localUri1 = null;
      Uri localUri2 = null;
      try
      {
        paramUri1 = getCache().openPutStream(paramUri1.toString(), REDIRECT_CONTENT_TAG);
        localUri2 = paramUri1;
        localUri1 = paramUri1;
        paramUri1.write(paramUri2.toString().getBytes());
        Utility.closeQuietly(paramUri1);
        AppMethodBeat.o(72487);
      }
      catch (IOException paramUri1)
      {
        Utility.closeQuietly(localUri2);
        AppMethodBeat.o(72487);
      }
      finally
      {
        Utility.closeQuietly(localUri1);
        AppMethodBeat.o(72487);
      }
    }
    throw paramUri1;
  }

  static void clearCache()
  {
    AppMethodBeat.i(72488);
    try
    {
      getCache().clearCache();
      AppMethodBeat.o(72488);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Logger.log(LoggingBehavior.CACHE, 5, TAG, "clearCache failed " + localIOException.getMessage());
        AppMethodBeat.o(72488);
      }
    }
  }

  static FileLruCache getCache()
  {
    try
    {
      AppMethodBeat.i(72485);
      if (urlRedirectCache == null)
      {
        localFileLruCache = new com/facebook/internal/FileLruCache;
        String str = TAG;
        FileLruCache.Limits localLimits = new com/facebook/internal/FileLruCache$Limits;
        localLimits.<init>();
        localFileLruCache.<init>(str, localLimits);
        urlRedirectCache = localFileLruCache;
      }
      FileLruCache localFileLruCache = urlRedirectCache;
      AppMethodBeat.o(72485);
      return localFileLruCache;
    }
    finally
    {
    }
  }

  // ERROR //
  static Uri getRedirectedUri(Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 119
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ifnonnull +12 -> 20
    //   11: ldc 119
    //   13: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aload_1
    //   17: astore_2
    //   18: aload_2
    //   19: areturn
    //   20: aload_0
    //   21: invokevirtual 59	android/net/Uri:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: invokestatic 56	com/facebook/internal/UrlRedirectCache:getCache	()Lcom/facebook/internal/FileLruCache;
    //   28: astore_3
    //   29: iconst_0
    //   30: istore 4
    //   32: aconst_null
    //   33: astore_0
    //   34: aload_3
    //   35: aload_2
    //   36: getstatic 42	com/facebook/internal/UrlRedirectCache:REDIRECT_CONTENT_TAG	Ljava/lang/String;
    //   39: invokevirtual 123	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   42: astore 5
    //   44: aload 5
    //   46: ifnull +94 -> 140
    //   49: iconst_1
    //   50: istore 4
    //   52: new 125	java/io/InputStreamReader
    //   55: astore_2
    //   56: aload_2
    //   57: aload 5
    //   59: invokespecial 128	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   62: sipush 128
    //   65: newarray char
    //   67: astore 5
    //   69: new 28	java/lang/StringBuilder
    //   72: astore_0
    //   73: aload_0
    //   74: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   77: aload_2
    //   78: aload 5
    //   80: iconst_0
    //   81: sipush 128
    //   84: invokevirtual 132	java/io/InputStreamReader:read	([CII)I
    //   87: istore 6
    //   89: iload 6
    //   91: ifle +31 -> 122
    //   94: aload_0
    //   95: aload 5
    //   97: iconst_0
    //   98: iload 6
    //   100: invokevirtual 135	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: goto -27 -> 77
    //   107: astore_0
    //   108: aload_2
    //   109: invokestatic 83	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   112: ldc 119
    //   114: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: aload_1
    //   118: astore_2
    //   119: goto -101 -> 18
    //   122: aload_2
    //   123: invokestatic 83	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   126: aload_0
    //   127: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: astore 5
    //   132: aload_2
    //   133: astore_0
    //   134: aload 5
    //   136: astore_2
    //   137: goto -103 -> 34
    //   140: iload 4
    //   142: ifeq +20 -> 162
    //   145: aload_2
    //   146: invokestatic 139	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   149: astore_2
    //   150: aload_0
    //   151: invokestatic 83	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   154: ldc 119
    //   156: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: goto -141 -> 18
    //   162: aload_0
    //   163: invokestatic 83	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   166: goto -54 -> 112
    //   169: astore_2
    //   170: aconst_null
    //   171: astore_0
    //   172: aload_0
    //   173: invokestatic 83	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   176: ldc 119
    //   178: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: aload_2
    //   182: athrow
    //   183: astore 5
    //   185: aload_2
    //   186: astore_0
    //   187: aload 5
    //   189: astore_2
    //   190: goto -18 -> 172
    //   193: astore_2
    //   194: goto -22 -> 172
    //   197: astore_0
    //   198: aconst_null
    //   199: astore_2
    //   200: goto -92 -> 108
    //   203: astore_2
    //   204: aload_0
    //   205: astore_2
    //   206: goto -98 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   62	77	107	java/io/IOException
    //   77	89	107	java/io/IOException
    //   94	104	107	java/io/IOException
    //   122	132	107	java/io/IOException
    //   25	29	169	finally
    //   62	77	183	finally
    //   77	89	183	finally
    //   94	104	183	finally
    //   122	132	183	finally
    //   34	44	193	finally
    //   52	62	193	finally
    //   145	150	193	finally
    //   25	29	197	java/io/IOException
    //   34	44	203	java/io/IOException
    //   52	62	203	java/io/IOException
    //   145	150	203	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.UrlRedirectCache
 * JD-Core Version:    0.6.2
 */