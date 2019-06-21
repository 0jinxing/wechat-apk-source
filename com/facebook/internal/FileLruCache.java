package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class FileLruCache
{
  private static final String HEADER_CACHEKEY_KEY = "key";
  private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
  static final String TAG;
  private static final AtomicLong bufferIndex;
  private final File directory;
  private boolean isTrimInProgress;
  private boolean isTrimPending;
  private AtomicLong lastClearCacheTime;
  private final Limits limits;
  private final Object lock;
  private final String tag;

  static
  {
    AppMethodBeat.i(72368);
    TAG = FileLruCache.class.getSimpleName();
    bufferIndex = new AtomicLong();
    AppMethodBeat.o(72368);
  }

  public FileLruCache(String paramString, Limits paramLimits)
  {
    AppMethodBeat.i(72353);
    this.lastClearCacheTime = new AtomicLong(0L);
    this.tag = paramString;
    this.limits = paramLimits;
    this.directory = new File(FacebookSdk.getCacheDir(), paramString);
    this.lock = new Object();
    if ((this.directory.mkdirs()) || (this.directory.isDirectory()))
      FileLruCache.BufferFile.deleteAll(this.directory);
    AppMethodBeat.o(72353);
  }

  private void postTrim()
  {
    AppMethodBeat.i(72364);
    synchronized (this.lock)
    {
      if (!this.isTrimPending)
      {
        this.isTrimPending = true;
        Executor localExecutor = FacebookSdk.getExecutor();
        FileLruCache.3 local3 = new com/facebook/internal/FileLruCache$3;
        local3.<init>(this);
        localExecutor.execute(local3);
      }
      AppMethodBeat.o(72364);
      return;
    }
  }

  private void renameToTargetAndTrim(String paramString, File paramFile)
  {
    AppMethodBeat.i(72361);
    if (!paramFile.renameTo(new File(this.directory, Utility.md5hash(paramString))))
      paramFile.delete();
    postTrim();
    AppMethodBeat.o(72361);
  }

  private void trim()
  {
    AppMethodBeat.i(72365);
    synchronized (this.lock)
    {
      this.isTrimPending = false;
      this.isTrimInProgress = true;
    }
    try
    {
      Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
      PriorityQueue localPriorityQueue = new java/util/PriorityQueue;
      localPriorityQueue.<init>();
      long l1 = 0L;
      long l2 = 0L;
      Object localObject7 = this.directory.listFiles(FileLruCache.BufferFile.excludeBufferFiles());
      long l3 = l2;
      long l4 = l1;
      if (localObject7 != null)
      {
        int i = localObject7.length;
        Object localObject8;
        Object localObject9;
        for (int j = 0; ; j++)
        {
          l3 = l2;
          l4 = l1;
          if (j >= i)
            break;
          ??? = localObject7[j];
          localObject8 = new com/facebook/internal/FileLruCache$ModifiedFile;
          ((FileLruCache.ModifiedFile)localObject8).<init>((File)???);
          localPriorityQueue.add(localObject8);
          LoggingBehavior localLoggingBehavior = LoggingBehavior.CACHE;
          String str = TAG;
          localObject9 = new java/lang/StringBuilder;
          ((StringBuilder)localObject9).<init>("  trim considering time=");
          Logger.log(localLoggingBehavior, str, Long.valueOf(((FileLruCache.ModifiedFile)localObject8).getModified()) + " name=" + ((FileLruCache.ModifiedFile)localObject8).getFile().getName());
          l4 = ((File)???).length();
          l1 += l4;
          l2 += 1L;
        }
        localObject5 = finally;
        AppMethodBeat.o(72365);
        throw localObject5;
        while ((l4 > this.limits.getByteCount()) || (l3 > this.limits.getFileCount()))
        {
          ??? = ((FileLruCache.ModifiedFile)localObject5.remove()).getFile();
          localObject7 = LoggingBehavior.CACHE;
          localObject9 = TAG;
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>("  trim removing ");
          Logger.log((LoggingBehavior)localObject7, (String)localObject9, ((File)???).getName());
          l4 -= ((File)???).length();
          ((File)???).delete();
          l3 -= 1L;
        }
        synchronized (this.lock)
        {
          this.isTrimInProgress = false;
          this.lock.notifyAll();
          AppMethodBeat.o(72365);
          return;
        }
      }
    }
    finally
    {
      while (true)
        synchronized (this.lock)
        {
          this.isTrimInProgress = false;
          this.lock.notifyAll();
          AppMethodBeat.o(72365);
          throw localObject3;
        }
    }
  }

  public final void clearCache()
  {
    AppMethodBeat.i(72359);
    final File[] arrayOfFile = this.directory.listFiles(FileLruCache.BufferFile.excludeBufferFiles());
    this.lastClearCacheTime.set(System.currentTimeMillis());
    if (arrayOfFile != null)
      FacebookSdk.getExecutor().execute(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(72324);
          File[] arrayOfFile = arrayOfFile;
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
            arrayOfFile[j].delete();
          AppMethodBeat.o(72324);
        }
      });
    AppMethodBeat.o(72359);
  }

  public final InputStream get(String paramString)
  {
    AppMethodBeat.i(72355);
    paramString = get(paramString, null);
    AppMethodBeat.o(72355);
    return paramString;
  }

  public final InputStream get(String paramString1, String paramString2)
  {
    LoggingBehavior localLoggingBehavior = null;
    AppMethodBeat.i(72356);
    File localFile = new File(this.directory, Utility.md5hash(paramString1));
    try
    {
      localObject = new java/io/FileInputStream;
      ((FileInputStream)localObject).<init>(localFile);
      localObject = new BufferedInputStream((InputStream)localObject, 8192);
    }
    catch (IOException paramString1)
    {
      try
      {
        JSONObject localJSONObject = StreamHeader.readHeader((InputStream)localObject);
        if (localJSONObject == null)
        {
          ((BufferedInputStream)localObject).close();
          AppMethodBeat.o(72356);
          paramString1 = localLoggingBehavior;
        }
        while (true)
        {
          return paramString1;
          paramString1 = paramString1;
          AppMethodBeat.o(72356);
          paramString1 = localLoggingBehavior;
          continue;
          String str = localJSONObject.optString("key");
          boolean bool;
          if (str != null)
          {
            bool = str.equals(paramString1);
            if (bool);
          }
          else
          {
            ((BufferedInputStream)localObject).close();
            AppMethodBeat.o(72356);
            paramString1 = localLoggingBehavior;
            continue;
          }
          paramString1 = localJSONObject.optString("tag", null);
          if ((paramString2 != null) || (paramString1 == null))
          {
            if (paramString2 != null)
            {
              bool = paramString2.equals(paramString1);
              if (bool);
            }
          }
          else
          {
            ((BufferedInputStream)localObject).close();
            AppMethodBeat.o(72356);
            paramString1 = localLoggingBehavior;
            continue;
          }
          paramString1 = new java/util/Date;
          paramString1.<init>();
          long l = paramString1.getTime();
          localLoggingBehavior = LoggingBehavior.CACHE;
          paramString2 = TAG;
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>("Setting lastModified to ");
          Logger.log(localLoggingBehavior, paramString2, Long.valueOf(l) + " for " + localFile.getName());
          localFile.setLastModified(l);
          AppMethodBeat.o(72356);
          paramString1 = (String)localObject;
        }
      }
      finally
      {
        Object localObject;
        ((BufferedInputStream)localObject).close();
        AppMethodBeat.o(72356);
      }
    }
    throw paramString1;
  }

  public final String getLocation()
  {
    AppMethodBeat.i(72360);
    String str = this.directory.getPath();
    AppMethodBeat.o(72360);
    return str;
  }

  public final InputStream interceptAndPut(String paramString, InputStream paramInputStream)
  {
    AppMethodBeat.i(72362);
    paramString = new FileLruCache.CopyingInputStream(paramInputStream, openPutStream(paramString));
    AppMethodBeat.o(72362);
    return paramString;
  }

  public final OutputStream openPutStream(String paramString)
  {
    AppMethodBeat.i(72357);
    paramString = openPutStream(paramString, null);
    AppMethodBeat.o(72357);
    return paramString;
  }

  // ERROR //
  public final OutputStream openPutStream(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc_w 335
    //   3: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 95	com/facebook/internal/FileLruCache:directory	Ljava/io/File;
    //   10: invokestatic 339	com/facebook/internal/FileLruCache$BufferFile:newFile	(Ljava/io/File;)Ljava/io/File;
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 157	java/io/File:delete	()Z
    //   18: pop
    //   19: aload_3
    //   20: invokevirtual 342	java/io/File:createNewFile	()Z
    //   23: ifne +39 -> 62
    //   26: new 268	java/io/IOException
    //   29: dup
    //   30: new 195	java/lang/StringBuilder
    //   33: dup
    //   34: ldc_w 344
    //   37: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload_3
    //   41: invokevirtual 347	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   44: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokespecial 348	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   53: astore_1
    //   54: ldc_w 335
    //   57: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: aload_1
    //   61: athrow
    //   62: new 350	java/io/FileOutputStream
    //   65: dup
    //   66: aload_3
    //   67: invokespecial 351	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   70: astore 4
    //   72: new 353	java/io/BufferedOutputStream
    //   75: dup
    //   76: new 10	com/facebook/internal/FileLruCache$CloseCallbackOutputStream
    //   79: dup
    //   80: aload 4
    //   82: new 355	com/facebook/internal/FileLruCache$1
    //   85: dup
    //   86: aload_0
    //   87: invokestatic 254	java/lang/System:currentTimeMillis	()J
    //   90: aload_3
    //   91: aload_1
    //   92: invokespecial 358	com/facebook/internal/FileLruCache$1:<init>	(Lcom/facebook/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V
    //   95: invokespecial 361	com/facebook/internal/FileLruCache$CloseCallbackOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V
    //   98: sipush 8192
    //   101: invokespecial 364	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   104: astore 4
    //   106: new 286	org/json/JSONObject
    //   109: astore_3
    //   110: aload_3
    //   111: invokespecial 365	org/json/JSONObject:<init>	()V
    //   114: aload_3
    //   115: ldc 26
    //   117: aload_1
    //   118: invokevirtual 369	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   121: pop
    //   122: aload_2
    //   123: invokestatic 373	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   126: ifne +11 -> 137
    //   129: aload_3
    //   130: ldc 29
    //   132: aload_2
    //   133: invokevirtual 369	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   136: pop
    //   137: aload 4
    //   139: aload_3
    //   140: invokestatic 377	com/facebook/internal/FileLruCache$StreamHeader:writeHeader	(Ljava/io/OutputStream;Lorg/json/JSONObject;)V
    //   143: ldc_w 335
    //   146: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload 4
    //   151: areturn
    //   152: astore_1
    //   153: getstatic 168	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   156: iconst_5
    //   157: getstatic 59	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   160: ldc_w 379
    //   163: aload_1
    //   164: invokestatic 382	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   167: invokevirtual 385	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   170: invokestatic 388	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   173: new 268	java/io/IOException
    //   176: dup
    //   177: aload_1
    //   178: invokevirtual 391	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   181: invokespecial 348	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   184: astore_1
    //   185: ldc_w 335
    //   188: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: aload_1
    //   192: athrow
    //   193: astore_2
    //   194: getstatic 168	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   197: iconst_5
    //   198: getstatic 59	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   201: ldc_w 393
    //   204: aload_2
    //   205: invokestatic 382	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   208: invokevirtual 385	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   211: invokestatic 388	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   214: new 268	java/io/IOException
    //   217: astore_1
    //   218: aload_1
    //   219: aload_2
    //   220: invokevirtual 394	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   223: invokespecial 348	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   226: ldc_w 335
    //   229: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: aload_1
    //   233: athrow
    //   234: astore_1
    //   235: aload 4
    //   237: invokevirtual 395	java/io/BufferedOutputStream:close	()V
    //   240: ldc_w 335
    //   243: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   246: aload_1
    //   247: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   62	72	152	java/io/FileNotFoundException
    //   106	137	193	org/json/JSONException
    //   137	143	193	org/json/JSONException
    //   106	137	234	finally
    //   137	143	234	finally
    //   194	234	234	finally
  }

  final long sizeInBytesForTest()
  {
    AppMethodBeat.i(72354);
    long l2;
    synchronized (this.lock)
    {
      while (true)
      {
        if (!this.isTrimPending)
        {
          boolean bool = this.isTrimInProgress;
          if (!bool)
            break;
        }
        try
        {
          this.lock.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
      ??? = this.directory.listFiles();
      long l1 = 0L;
      l2 = l1;
      if (??? != null)
      {
        int i = ???.length;
        int j = 0;
        l2 = l1;
        if (j < i)
        {
          l1 += ???[j].length();
          j++;
        }
      }
    }
    AppMethodBeat.o(72354);
    return l2;
  }

  public final String toString()
  {
    AppMethodBeat.i(72363);
    String str = "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + "}";
    AppMethodBeat.o(72363);
    return str;
  }

  public static final class Limits
  {
    private int byteCount = 1048576;
    private int fileCount = 1024;

    final int getByteCount()
    {
      return this.byteCount;
    }

    final int getFileCount()
    {
      return this.fileCount;
    }

    final void setByteCount(int paramInt)
    {
      AppMethodBeat.i(72344);
      if (paramInt < 0)
      {
        InvalidParameterException localInvalidParameterException = new InvalidParameterException("Cache byte-count limit must be >= 0");
        AppMethodBeat.o(72344);
        throw localInvalidParameterException;
      }
      this.byteCount = paramInt;
      AppMethodBeat.o(72344);
    }

    final void setFileCount(int paramInt)
    {
      AppMethodBeat.i(72345);
      if (paramInt < 0)
      {
        InvalidParameterException localInvalidParameterException = new InvalidParameterException("Cache file count limit must be >= 0");
        AppMethodBeat.o(72345);
        throw localInvalidParameterException;
      }
      this.fileCount = paramInt;
      AppMethodBeat.o(72345);
    }
  }

  static final class StreamHeader
  {
    private static final int HEADER_VERSION = 0;

    static JSONObject readHeader(InputStream paramInputStream)
    {
      int i = 0;
      AppMethodBeat.i(72352);
      if (paramInputStream.read() != 0)
      {
        AppMethodBeat.o(72352);
        paramInputStream = null;
      }
      while (true)
      {
        return paramInputStream;
        int j = 0;
        int k = 0;
        while (true)
        {
          if (j >= 3)
            break label83;
          int m = paramInputStream.read();
          if (m == -1)
          {
            Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
            AppMethodBeat.o(72352);
            paramInputStream = null;
            break;
          }
          k = (k << 8) + (m & 0xFF);
          j++;
        }
        label83: Object localObject = new byte[k];
        j = i;
        while (true)
        {
          if (j >= k)
            break label164;
          i = paramInputStream.read((byte[])localObject, j, k - j);
          if (i <= 0)
          {
            Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read stopped at " + Integer.valueOf(j) + " when expected " + k);
            AppMethodBeat.o(72352);
            paramInputStream = null;
            break;
          }
          j += i;
        }
        label164: paramInputStream = new JSONTokener(new String((byte[])localObject));
        try
        {
          paramInputStream = paramInputStream.nextValue();
          if (!(paramInputStream instanceof JSONObject))
          {
            LoggingBehavior localLoggingBehavior = LoggingBehavior.CACHE;
            localObject = FileLruCache.TAG;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("readHeader: expected JSONObject, got ");
            Logger.log(localLoggingBehavior, (String)localObject, paramInputStream.getClass().getCanonicalName());
            AppMethodBeat.o(72352);
            paramInputStream = null;
          }
          else
          {
            paramInputStream = (JSONObject)paramInputStream;
            AppMethodBeat.o(72352);
          }
        }
        catch (JSONException paramInputStream)
        {
          paramInputStream = new IOException(paramInputStream.getMessage());
          AppMethodBeat.o(72352);
        }
      }
      throw paramInputStream;
    }

    static void writeHeader(OutputStream paramOutputStream, JSONObject paramJSONObject)
    {
      AppMethodBeat.i(72351);
      paramJSONObject = paramJSONObject.toString().getBytes();
      paramOutputStream.write(0);
      paramOutputStream.write(paramJSONObject.length >> 16 & 0xFF);
      paramOutputStream.write(paramJSONObject.length >> 8 & 0xFF);
      paramOutputStream.write(paramJSONObject.length >> 0 & 0xFF);
      paramOutputStream.write(paramJSONObject);
      AppMethodBeat.o(72351);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache
 * JD-Core Version:    0.6.2
 */