package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public class ImageDownloader
{
  private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
  private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
  private static WorkQueue cacheReadQueue;
  private static WorkQueue downloadQueue;
  private static Handler handler;
  private static final Map<RequestKey, ImageDownloader.DownloaderContext> pendingRequests;

  static
  {
    AppMethodBeat.i(72387);
    downloadQueue = new WorkQueue(8);
    cacheReadQueue = new WorkQueue(2);
    pendingRequests = new HashMap();
    AppMethodBeat.o(72387);
  }

  public static boolean cancelRequest(ImageRequest arg0)
  {
    AppMethodBeat.i(72374);
    RequestKey localRequestKey = new RequestKey(???.getImageUri(), ???.getCallerTag());
    while (true)
    {
      synchronized (pendingRequests)
      {
        ImageDownloader.DownloaderContext localDownloaderContext = (ImageDownloader.DownloaderContext)pendingRequests.get(localRequestKey);
        if (localDownloaderContext != null)
        {
          if (localDownloaderContext.workItem.cancel())
          {
            pendingRequests.remove(localRequestKey);
            bool = true;
            AppMethodBeat.o(72374);
            return bool;
          }
          localDownloaderContext.isCancelled = true;
          bool = true;
        }
      }
      boolean bool = false;
    }
  }

  public static void clearCache(Context paramContext)
  {
    AppMethodBeat.i(72376);
    ImageResponseCache.clearCache(paramContext);
    UrlRedirectCache.clearCache();
    AppMethodBeat.o(72376);
  }

  // ERROR //
  private static void download(RequestKey paramRequestKey, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 120
    //   4: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: iconst_1
    //   8: istore_3
    //   9: new 122	java/net/URL
    //   12: astore 4
    //   14: aload 4
    //   16: aload_0
    //   17: getfield 126	com/facebook/internal/ImageDownloader$RequestKey:uri	Landroid/net/Uri;
    //   20: invokevirtual 132	android/net/Uri:toString	()Ljava/lang/String;
    //   23: invokespecial 135	java/net/URL:<init>	(Ljava/lang/String;)V
    //   26: aload 4
    //   28: invokevirtual 139	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   31: checkcast 141	java/net/HttpURLConnection
    //   34: astore 4
    //   36: aload 4
    //   38: iconst_0
    //   39: invokevirtual 145	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   42: aload 4
    //   44: invokevirtual 149	java/net/HttpURLConnection:getResponseCode	()I
    //   47: lookupswitch	default:+33->80, 200:+311->358, 301:+204->251, 302:+204->251
    //   81: iconst_1
    //   82: invokevirtual 153	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   85: astore 5
    //   87: aload 5
    //   89: astore_1
    //   90: aload 5
    //   92: astore 6
    //   94: new 155	java/lang/StringBuilder
    //   97: astore 7
    //   99: aload 5
    //   101: astore_1
    //   102: aload 5
    //   104: astore 6
    //   106: aload 7
    //   108: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   111: aload 5
    //   113: ifnull +318 -> 431
    //   116: aload 5
    //   118: astore_1
    //   119: aload 5
    //   121: astore 6
    //   123: new 158	java/io/InputStreamReader
    //   126: astore 8
    //   128: aload 5
    //   130: astore_1
    //   131: aload 5
    //   133: astore 6
    //   135: aload 8
    //   137: aload 5
    //   139: invokespecial 161	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   142: aload 5
    //   144: astore_1
    //   145: aload 5
    //   147: astore 6
    //   149: sipush 128
    //   152: newarray char
    //   154: astore 9
    //   156: aload 5
    //   158: astore_1
    //   159: aload 5
    //   161: astore 6
    //   163: aload 8
    //   165: aload 9
    //   167: iconst_0
    //   168: sipush 128
    //   171: invokevirtual 165	java/io/InputStreamReader:read	([CII)I
    //   174: istore 10
    //   176: iload 10
    //   178: ifle +211 -> 389
    //   181: aload 5
    //   183: astore_1
    //   184: aload 5
    //   186: astore 6
    //   188: aload 7
    //   190: aload 9
    //   192: iconst_0
    //   193: iload 10
    //   195: invokevirtual 169	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: goto -43 -> 156
    //   202: astore 5
    //   204: iconst_1
    //   205: istore_3
    //   206: aload 4
    //   208: astore 6
    //   210: aload_1
    //   211: astore 4
    //   213: aload 5
    //   215: astore_1
    //   216: aload 4
    //   218: invokestatic 175	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   221: aload 6
    //   223: invokestatic 179	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   226: aload_2
    //   227: astore 6
    //   229: aload_1
    //   230: astore 4
    //   232: iload_3
    //   233: ifeq +12 -> 245
    //   236: aload_0
    //   237: aload 4
    //   239: aload 6
    //   241: iconst_0
    //   242: invokestatic 183	com/facebook/internal/ImageDownloader:issueResponse	(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V
    //   245: ldc 120
    //   247: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: return
    //   251: aload 4
    //   253: ldc 185
    //   255: invokevirtual 189	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   258: astore_1
    //   259: aload_1
    //   260: invokestatic 193	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   263: ifne +271 -> 534
    //   266: aload_1
    //   267: invokestatic 197	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   270: astore_1
    //   271: aload_0
    //   272: getfield 126	com/facebook/internal/ImageDownloader$RequestKey:uri	Landroid/net/Uri;
    //   275: aload_1
    //   276: invokestatic 201	com/facebook/internal/UrlRedirectCache:cacheUriRedirect	(Landroid/net/Uri;Landroid/net/Uri;)V
    //   279: aload_0
    //   280: invokestatic 205	com/facebook/internal/ImageDownloader:removePendingRequest	(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    //   283: astore 6
    //   285: aload 6
    //   287: ifnull +41 -> 328
    //   290: aload 6
    //   292: getfield 106	com/facebook/internal/ImageDownloader$DownloaderContext:isCancelled	Z
    //   295: ifne +33 -> 328
    //   298: aload 6
    //   300: getfield 209	com/facebook/internal/ImageDownloader$DownloaderContext:request	Lcom/facebook/internal/ImageRequest;
    //   303: astore 5
    //   305: new 12	com/facebook/internal/ImageDownloader$RequestKey
    //   308: astore 6
    //   310: aload 6
    //   312: aload_1
    //   313: aload_0
    //   314: getfield 213	com/facebook/internal/ImageDownloader$RequestKey:tag	Ljava/lang/Object;
    //   317: invokespecial 83	com/facebook/internal/ImageDownloader$RequestKey:<init>	(Landroid/net/Uri;Ljava/lang/Object;)V
    //   320: aload 5
    //   322: aload 6
    //   324: iconst_0
    //   325: invokestatic 217	com/facebook/internal/ImageDownloader:enqueueCacheRead	(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    //   328: iconst_0
    //   329: istore_3
    //   330: aconst_null
    //   331: astore_1
    //   332: aconst_null
    //   333: astore 6
    //   335: aconst_null
    //   336: astore 5
    //   338: aload 5
    //   340: invokestatic 175	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   343: aload 4
    //   345: invokestatic 179	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   348: aload 6
    //   350: astore 4
    //   352: aload_1
    //   353: astore 6
    //   355: goto -123 -> 232
    //   358: aload_1
    //   359: aload 4
    //   361: invokestatic 221	com/facebook/internal/ImageResponseCache:interceptAndCacheImageStream	(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    //   364: astore 5
    //   366: aload 5
    //   368: astore_1
    //   369: aload 5
    //   371: astore 6
    //   373: aload 5
    //   375: invokestatic 227	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   378: astore 7
    //   380: aconst_null
    //   381: astore 6
    //   383: aload 7
    //   385: astore_1
    //   386: goto -48 -> 338
    //   389: aload 5
    //   391: astore_1
    //   392: aload 5
    //   394: astore 6
    //   396: aload 8
    //   398: invokestatic 175	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   401: aload 5
    //   403: astore_1
    //   404: aload 5
    //   406: astore 6
    //   408: new 229	com/facebook/FacebookException
    //   411: dup
    //   412: aload 7
    //   414: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   417: invokespecial 231	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   420: astore 7
    //   422: aconst_null
    //   423: astore_1
    //   424: aload 7
    //   426: astore 6
    //   428: goto -90 -> 338
    //   431: aload 5
    //   433: astore_1
    //   434: aload 5
    //   436: astore 6
    //   438: aload 7
    //   440: ldc 233
    //   442: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: pop
    //   446: goto -45 -> 401
    //   449: astore_0
    //   450: aload 4
    //   452: astore_1
    //   453: aload 6
    //   455: invokestatic 175	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   458: aload_1
    //   459: invokestatic 179	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   462: ldc 120
    //   464: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   467: aload_0
    //   468: athrow
    //   469: astore_0
    //   470: aconst_null
    //   471: astore 6
    //   473: aconst_null
    //   474: astore_1
    //   475: goto -22 -> 453
    //   478: astore_0
    //   479: aconst_null
    //   480: astore 6
    //   482: aload 4
    //   484: astore_1
    //   485: goto -32 -> 453
    //   488: astore_1
    //   489: iconst_1
    //   490: istore_3
    //   491: aconst_null
    //   492: astore 4
    //   494: aconst_null
    //   495: astore 6
    //   497: goto -281 -> 216
    //   500: astore_1
    //   501: iconst_1
    //   502: istore_3
    //   503: aconst_null
    //   504: astore 5
    //   506: aload 4
    //   508: astore 6
    //   510: aload 5
    //   512: astore 4
    //   514: goto -298 -> 216
    //   517: astore_1
    //   518: iconst_0
    //   519: istore_3
    //   520: aconst_null
    //   521: astore 5
    //   523: aload 4
    //   525: astore 6
    //   527: aload 5
    //   529: astore 4
    //   531: goto -315 -> 216
    //   534: iconst_0
    //   535: istore_3
    //   536: aconst_null
    //   537: astore_1
    //   538: aconst_null
    //   539: astore 6
    //   541: aconst_null
    //   542: astore 5
    //   544: goto -206 -> 338
    //
    // Exception table:
    //   from	to	target	type
    //   94	99	202	java/io/IOException
    //   106	111	202	java/io/IOException
    //   123	128	202	java/io/IOException
    //   135	142	202	java/io/IOException
    //   149	156	202	java/io/IOException
    //   163	176	202	java/io/IOException
    //   188	199	202	java/io/IOException
    //   373	380	202	java/io/IOException
    //   396	401	202	java/io/IOException
    //   408	422	202	java/io/IOException
    //   438	446	202	java/io/IOException
    //   94	99	449	finally
    //   106	111	449	finally
    //   123	128	449	finally
    //   135	142	449	finally
    //   149	156	449	finally
    //   163	176	449	finally
    //   188	199	449	finally
    //   373	380	449	finally
    //   396	401	449	finally
    //   408	422	449	finally
    //   438	446	449	finally
    //   9	36	469	finally
    //   36	80	478	finally
    //   80	87	478	finally
    //   251	285	478	finally
    //   290	328	478	finally
    //   358	366	478	finally
    //   9	36	488	java/io/IOException
    //   36	80	500	java/io/IOException
    //   80	87	500	java/io/IOException
    //   358	366	500	java/io/IOException
    //   251	285	517	java/io/IOException
    //   290	328	517	java/io/IOException
  }

  public static void downloadAsync(ImageRequest paramImageRequest)
  {
    AppMethodBeat.i(72373);
    if (paramImageRequest == null)
      AppMethodBeat.o(72373);
    while (true)
    {
      return;
      RequestKey localRequestKey = new RequestKey(paramImageRequest.getImageUri(), paramImageRequest.getCallerTag());
      synchronized (pendingRequests)
      {
        ImageDownloader.DownloaderContext localDownloaderContext = (ImageDownloader.DownloaderContext)pendingRequests.get(localRequestKey);
        if (localDownloaderContext != null)
        {
          localDownloaderContext.request = paramImageRequest;
          localDownloaderContext.isCancelled = false;
          localDownloaderContext.workItem.moveToFront();
          AppMethodBeat.o(72373);
          continue;
        }
        enqueueCacheRead(paramImageRequest, localRequestKey, paramImageRequest.isCachedRedirectAllowed());
      }
    }
  }

  private static void enqueueCacheRead(ImageRequest paramImageRequest, RequestKey paramRequestKey, boolean paramBoolean)
  {
    AppMethodBeat.i(72377);
    enqueueRequest(paramImageRequest, paramRequestKey, cacheReadQueue, new ImageDownloader.CacheReadWorkItem(paramImageRequest.getContext(), paramRequestKey, paramBoolean));
    AppMethodBeat.o(72377);
  }

  private static void enqueueDownload(ImageRequest paramImageRequest, RequestKey paramRequestKey)
  {
    AppMethodBeat.i(72378);
    enqueueRequest(paramImageRequest, paramRequestKey, downloadQueue, new ImageDownloader.DownloadImageWorkItem(paramImageRequest.getContext(), paramRequestKey));
    AppMethodBeat.o(72378);
  }

  private static void enqueueRequest(ImageRequest paramImageRequest, RequestKey paramRequestKey, WorkQueue paramWorkQueue, Runnable paramRunnable)
  {
    AppMethodBeat.i(72379);
    synchronized (pendingRequests)
    {
      ImageDownloader.DownloaderContext localDownloaderContext = new com/facebook/internal/ImageDownloader$DownloaderContext;
      localDownloaderContext.<init>(null);
      localDownloaderContext.request = paramImageRequest;
      pendingRequests.put(paramRequestKey, localDownloaderContext);
      localDownloaderContext.workItem = paramWorkQueue.addActiveWorkItem(paramRunnable);
      AppMethodBeat.o(72379);
      return;
    }
  }

  private static Handler getHandler()
  {
    try
    {
      AppMethodBeat.i(72383);
      if (handler == null)
      {
        localHandler = new android/os/Handler;
        localHandler.<init>(Looper.getMainLooper());
        handler = localHandler;
      }
      Handler localHandler = handler;
      AppMethodBeat.o(72383);
      return localHandler;
    }
    finally
    {
    }
  }

  private static void issueResponse(RequestKey paramRequestKey, Exception paramException, Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(72380);
    paramRequestKey = removePendingRequest(paramRequestKey);
    if ((paramRequestKey != null) && (!paramRequestKey.isCancelled))
    {
      paramRequestKey = paramRequestKey.request;
      ImageRequest.Callback localCallback = paramRequestKey.getCallback();
      if (localCallback != null)
        getHandler().post(new ImageDownloader.1(paramRequestKey, paramException, paramBoolean, paramBitmap, localCallback));
    }
    AppMethodBeat.o(72380);
  }

  public static void prioritizeRequest(ImageRequest arg0)
  {
    AppMethodBeat.i(72375);
    Object localObject1 = new RequestKey(???.getImageUri(), ???.getCallerTag());
    synchronized (pendingRequests)
    {
      localObject1 = (ImageDownloader.DownloaderContext)pendingRequests.get(localObject1);
      if (localObject1 != null)
        ((ImageDownloader.DownloaderContext)localObject1).workItem.moveToFront();
      AppMethodBeat.o(72375);
      return;
    }
  }

  private static void readFromCache(RequestKey paramRequestKey, Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(72381);
    Object localObject;
    if (paramBoolean)
    {
      localObject = UrlRedirectCache.getRedirectedUri(paramRequestKey.uri);
      if (localObject != null)
      {
        localObject = ImageResponseCache.getCachedImageStream((Uri)localObject, paramContext);
        paramBoolean = bool;
        if (localObject != null)
          paramBoolean = true;
      }
    }
    while (true)
    {
      if (!paramBoolean);
      for (paramContext = ImageResponseCache.getCachedImageStream(paramRequestKey.uri, paramContext); ; paramContext = (Context)localObject)
      {
        if (paramContext != null)
        {
          localObject = BitmapFactory.decodeStream(paramContext);
          Utility.closeQuietly(paramContext);
          issueResponse(paramRequestKey, null, (Bitmap)localObject, paramBoolean);
          AppMethodBeat.o(72381);
        }
        while (true)
        {
          return;
          paramContext = removePendingRequest(paramRequestKey);
          if ((paramContext != null) && (!paramContext.isCancelled))
            enqueueDownload(paramContext.request, paramRequestKey);
          AppMethodBeat.o(72381);
        }
      }
      paramBoolean = false;
      localObject = null;
    }
  }

  private static ImageDownloader.DownloaderContext removePendingRequest(RequestKey paramRequestKey)
  {
    AppMethodBeat.i(72384);
    synchronized (pendingRequests)
    {
      paramRequestKey = (ImageDownloader.DownloaderContext)pendingRequests.remove(paramRequestKey);
      AppMethodBeat.o(72384);
      return paramRequestKey;
    }
  }

  static class RequestKey
  {
    private static final int HASH_MULTIPLIER = 37;
    private static final int HASH_SEED = 29;
    Object tag;
    Uri uri;

    RequestKey(Uri paramUri, Object paramObject)
    {
      this.uri = paramUri;
      this.tag = paramObject;
    }

    public boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramObject != null)
      {
        bool2 = bool1;
        if ((paramObject instanceof RequestKey))
        {
          paramObject = (RequestKey)paramObject;
          bool2 = bool1;
          if (paramObject.uri == this.uri)
          {
            bool2 = bool1;
            if (paramObject.tag == this.tag)
              bool2 = true;
          }
        }
      }
      return bool2;
    }

    public int hashCode()
    {
      AppMethodBeat.i(72372);
      int i = this.uri.hashCode();
      int j = this.tag.hashCode();
      AppMethodBeat.o(72372);
      return (i + 1073) * 37 + j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageDownloader
 * JD-Core Version:    0.6.2
 */