package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FFmpegMetadataRetriever
{
  public static final String METADATA_CHAPTER_COUNT = "chapter_count";
  public static final String METADATA_KEY_ALBUM = "album";
  public static final String METADATA_KEY_ALBUM_ARTIST = "album_artist";
  public static final String METADATA_KEY_ARTIST = "artist";
  public static final String METADATA_KEY_AUDIO_CODEC = "audio_codec";
  public static final String METADATA_KEY_CHAPTER_END_TIME = "chapter_end_time";
  public static final String METADATA_KEY_CHAPTER_START_TIME = "chapter_start_time";
  public static final String METADATA_KEY_COMMENT = "comment";
  public static final String METADATA_KEY_COMPOSER = "composer";
  public static final String METADATA_KEY_COPYRIGHT = "copyright";
  public static final String METADATA_KEY_CREATION_TIME = "creation_time";
  public static final String METADATA_KEY_DATE = "date";
  public static final String METADATA_KEY_DISC = "disc";
  public static final String METADATA_KEY_DURATION = "duration";
  public static final String METADATA_KEY_ENCODED_BY = "encoded_by";
  public static final String METADATA_KEY_ENCODER = "encoder";
  public static final String METADATA_KEY_FILENAME = "filename";
  public static final String METADATA_KEY_FILESIZE = "filesize";
  public static final String METADATA_KEY_FRAMERATE = "framerate";
  public static final String METADATA_KEY_GENRE = "genre";
  public static final String METADATA_KEY_ICY_METADATA = "icy_metadata";
  public static final String METADATA_KEY_LANGUAGE = "language";
  public static final String METADATA_KEY_PERFORMER = "performer";
  public static final String METADATA_KEY_PUBLISHER = "publisher";
  public static final String METADATA_KEY_SERVICE_NAME = "service_name";
  public static final String METADATA_KEY_SERVICE_PROVIDER = "service_provider";
  public static final String METADATA_KEY_TITLE = "title";
  public static final String METADATA_KEY_TRACK = "track";
  public static final String METADATA_KEY_VARIANT_BITRATE = "bitrate";
  public static final String METADATA_KEY_VIDEO_CODEC = "video_codec";
  public static final String METADATA_KEY_VIDEO_HEIGHT = "video_height";
  public static final String METADATA_KEY_VIDEO_ROTATION = "rotate";
  public static final String METADATA_KEY_VIDEO_WIDTH = "video_width";
  public static final int OPTION_CLOSEST = 3;
  public static final int OPTION_CLOSEST_SYNC = 2;
  public static final int OPTION_NEXT_SYNC = 1;
  public static final int OPTION_PREVIOUS_SYNC = 0;
  private static final String TAG = "FFmpegMetadataRetriever";
  private long mNativeContext;
  private Bitmap reuse;

  static
  {
    AppMethodBeat.i(3627);
    native_init();
    AppMethodBeat.o(3627);
  }

  public FFmpegMetadataRetriever()
  {
    AppMethodBeat.i(3609);
    native_setup();
    AppMethodBeat.o(3609);
  }

  private native byte[] _getFrameAtTime(long paramLong, int paramInt);

  private native byte[] _getScaledFrameAtTime(long paramLong, int paramInt1, int paramInt2, int paramInt3);

  private native void _setDataSource(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2);

  private Bitmap getBitmapFromPixels(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3621);
    Object localObject;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      localObject = null;
      AppMethodBeat.o(3621);
    }
    while (true)
    {
      return localObject;
      int i = paramInt1;
      if (paramInt1 == -1)
        i = getVideoWidth();
      paramInt1 = paramInt2;
      if (paramInt2 == -1)
        paramInt1 = getVideoHeight();
      if ((i <= 0) || (paramInt1 <= 0))
      {
        paramArrayOfByte = new IllegalStateException(String.format(Locale.CHINA, "Can not get bitmap width and height [%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) }));
        AppMethodBeat.o(3621);
        throw paramArrayOfByte;
      }
      Bitmap localBitmap = this.reuse;
      localObject = localBitmap;
      if (localBitmap == null)
        localObject = Bitmap.createBitmap(i, paramInt1, Bitmap.Config.ARGB_8888);
      ((Bitmap)localObject).copyPixelsFromBuffer(ByteBuffer.wrap(paramArrayOfByte));
      AppMethodBeat.o(3621);
    }
  }

  private native void native_finalize();

  private final native HashMap<String, String> native_getMetadata(boolean paramBoolean1, boolean paramBoolean2, HashMap<String, String> paramHashMap);

  private static native void native_init();

  private native void native_setup();

  public native String extractMetadata(String paramString);

  public native String extractMetadataFromChapter(String paramString, int paramInt);

  protected void finalize()
  {
    AppMethodBeat.i(3626);
    try
    {
      native_finalize();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("FFmpegMetadataRetriever", "do nothing");
        super.finalize();
        AppMethodBeat.o(3626);
      }
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(3626);
    }
  }

  public Bitmap getFrameAtTime()
  {
    AppMethodBeat.i(3617);
    Bitmap localBitmap = getFrameAtTime(-1L, 2);
    AppMethodBeat.o(3617);
    return localBitmap;
  }

  public Bitmap getFrameAtTime(long paramLong)
  {
    AppMethodBeat.i(3616);
    Bitmap localBitmap = null;
    byte[] arrayOfByte = _getFrameAtTime(paramLong, 2);
    if (arrayOfByte != null)
      localBitmap = getBitmapFromPixels(arrayOfByte, -1, -1);
    AppMethodBeat.o(3616);
    return localBitmap;
  }

  public Bitmap getFrameAtTime(long paramLong, int paramInt)
  {
    AppMethodBeat.i(3615);
    if ((paramInt < 0) || (paramInt > 3))
    {
      localObject = new IllegalArgumentException("Unsupported option: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(3615);
      throw ((Throwable)localObject);
    }
    Object localObject = null;
    byte[] arrayOfByte = _getFrameAtTime(paramLong, paramInt);
    if (arrayOfByte != null)
      localObject = getBitmapFromPixels(arrayOfByte, -1, -1);
    AppMethodBeat.o(3615);
    return localObject;
  }

  public FFmpegMetadataRetriever.a getMetadata()
  {
    Object localObject1 = null;
    int i = 0;
    AppMethodBeat.i(3614);
    Object localObject2 = new FFmpegMetadataRetriever.a(this);
    HashMap localHashMap = native_getMetadata(false, false, null);
    if (localHashMap == null)
    {
      AppMethodBeat.o(3614);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      if (localHashMap == null);
      while (true)
      {
        if (i != 0)
          break label74;
        AppMethodBeat.o(3614);
        localObject2 = localObject1;
        break;
        ((FFmpegMetadataRetriever.a)localObject2).oxG = localHashMap;
        i = 1;
      }
      label74: AppMethodBeat.o(3614);
    }
  }

  public Bitmap getScaledFrameAtTime(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3619);
    Bitmap localBitmap = null;
    byte[] arrayOfByte = _getScaledFrameAtTime(paramLong, 0, paramInt1, paramInt2);
    if (arrayOfByte != null)
      localBitmap = getBitmapFromPixels(arrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(3619);
    return localBitmap;
  }

  public Bitmap getScaledFrameAtTime(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(3618);
    if ((paramInt1 < 0) || (paramInt1 > 3))
    {
      localObject = new IllegalArgumentException("Unsupported option: ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(3618);
      throw ((Throwable)localObject);
    }
    Object localObject = null;
    byte[] arrayOfByte = _getScaledFrameAtTime(paramLong, paramInt1, paramInt2, paramInt3);
    if (arrayOfByte != null)
      localObject = getBitmapFromPixels(arrayOfByte, paramInt2, paramInt3);
    AppMethodBeat.o(3618);
    return localObject;
  }

  public byte[] getScaledFrameAtTimeUndecoded(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3625);
    byte[] arrayOfByte = _getScaledFrameAtTime(paramLong, 2, paramInt1, paramInt2);
    AppMethodBeat.o(3625);
    return arrayOfByte;
  }

  public int getVideoHeight()
  {
    int i = 0;
    AppMethodBeat.i(3624);
    try
    {
      String str1 = extractMetadata("rotate");
      if (("90".equals(str1)) || ("270".equals(str1)));
      for (String str2 = extractMetadata("video_width"); ; str2 = extractMetadata("video_height"))
      {
        ab.d("FFmpegMetadataRetriever", "video height %s rotate %s", new Object[] { str2, str1 });
        j = Integer.valueOf(str2).intValue();
        AppMethodBeat.o(3624);
        return j;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("FFmpegMetadataRetriever", "can not get video height %s", new Object[] { localException.getMessage() });
        int j = i;
      }
    }
  }

  public int getVideoRotation()
  {
    int i = 0;
    AppMethodBeat.i(3623);
    try
    {
      int j = Integer.valueOf(extractMetadata("rotate")).intValue();
      i = j;
      AppMethodBeat.o(3623);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("FFmpegMetadataRetriever", "can not get video rotation. %s", new Object[] { localException.getMessage() });
    }
  }

  public int getVideoWidth()
  {
    int i = 0;
    AppMethodBeat.i(3622);
    try
    {
      String str = extractMetadata("rotate");
      if (("90".equals(str)) || ("270".equals(str)));
      for (str = extractMetadata("video_height"); ; str = extractMetadata("video_width"))
      {
        int j = Integer.valueOf(str).intValue();
        i = j;
        AppMethodBeat.o(3622);
        return i;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("FFmpegMetadataRetriever", "can not get video width %s", new Object[] { localException.getMessage() });
    }
  }

  public native void release();

  public void reuseBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(3620);
    if (paramBitmap == null)
      AppMethodBeat.o(3620);
    while (true)
    {
      return;
      if (this.reuse != null)
        this.reuse.recycle();
      this.reuse = paramBitmap;
      AppMethodBeat.o(3620);
    }
  }

  // ERROR //
  public void setDataSource(android.content.Context paramContext, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: sipush 3613
    //   3: invokestatic 130	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_2
    //   7: ifnonnull +19 -> 26
    //   10: new 243	java/lang/IllegalArgumentException
    //   13: dup
    //   14: invokespecial 320	java/lang/IllegalArgumentException:<init>	()V
    //   17: astore_1
    //   18: sipush 3613
    //   21: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: aload_1
    //   25: athrow
    //   26: aload_2
    //   27: invokevirtual 325	android/net/Uri:getScheme	()Ljava/lang/String;
    //   30: astore_3
    //   31: aload_3
    //   32: ifnull +13 -> 45
    //   35: aload_3
    //   36: ldc_w 327
    //   39: invokevirtual 278	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   42: ifeq +18 -> 60
    //   45: aload_0
    //   46: aload_2
    //   47: invokevirtual 330	android/net/Uri:getPath	()Ljava/lang/String;
    //   50: invokevirtual 332	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   53: sipush 3613
    //   56: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: return
    //   60: aconst_null
    //   61: astore_3
    //   62: aload_1
    //   63: invokevirtual 338	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   66: astore_1
    //   67: aload_1
    //   68: aload_2
    //   69: ldc_w 340
    //   72: invokevirtual 346	android/content/ContentResolver:openAssetFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   75: astore_1
    //   76: aload_1
    //   77: ifnonnull +68 -> 145
    //   80: new 243	java/lang/IllegalArgumentException
    //   83: astore_3
    //   84: aload_3
    //   85: invokespecial 320	java/lang/IllegalArgumentException:<init>	()V
    //   88: sipush 3613
    //   91: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_3
    //   95: athrow
    //   96: astore_3
    //   97: aload_1
    //   98: ifnull +7 -> 105
    //   101: aload_1
    //   102: invokevirtual 351	android/content/res/AssetFileDescriptor:close	()V
    //   105: aload_0
    //   106: aload_2
    //   107: invokevirtual 354	android/net/Uri:toString	()Ljava/lang/String;
    //   110: invokevirtual 332	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   113: sipush 3613
    //   116: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: goto -60 -> 59
    //   122: astore_1
    //   123: new 243	java/lang/IllegalArgumentException
    //   126: astore_1
    //   127: aload_1
    //   128: invokespecial 320	java/lang/IllegalArgumentException:<init>	()V
    //   131: sipush 3613
    //   134: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: aload_1
    //   138: athrow
    //   139: astore_1
    //   140: aload_3
    //   141: astore_1
    //   142: goto -45 -> 97
    //   145: aload_1
    //   146: invokevirtual 358	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   149: astore_3
    //   150: aload_3
    //   151: invokevirtual 364	java/io/FileDescriptor:valid	()Z
    //   154: ifne +40 -> 194
    //   157: new 243	java/lang/IllegalArgumentException
    //   160: astore_3
    //   161: aload_3
    //   162: invokespecial 320	java/lang/IllegalArgumentException:<init>	()V
    //   165: sipush 3613
    //   168: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: aload_3
    //   172: athrow
    //   173: astore_3
    //   174: aload_1
    //   175: astore_2
    //   176: aload_3
    //   177: astore_1
    //   178: aload_2
    //   179: ifnull +7 -> 186
    //   182: aload_2
    //   183: invokevirtual 351	android/content/res/AssetFileDescriptor:close	()V
    //   186: sipush 3613
    //   189: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aload_1
    //   193: athrow
    //   194: aload_1
    //   195: invokevirtual 368	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   198: lconst_0
    //   199: lcmp
    //   200: ifge +25 -> 225
    //   203: aload_0
    //   204: aload_3
    //   205: invokevirtual 371	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/io/FileDescriptor;)V
    //   208: aload_1
    //   209: ifnull +7 -> 216
    //   212: aload_1
    //   213: invokevirtual 351	android/content/res/AssetFileDescriptor:close	()V
    //   216: sipush 3613
    //   219: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: goto -163 -> 59
    //   225: aload_0
    //   226: aload_3
    //   227: aload_1
    //   228: invokevirtual 374	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   231: aload_1
    //   232: invokevirtual 368	android/content/res/AssetFileDescriptor:getDeclaredLength	()J
    //   235: invokevirtual 377	com/tencent/mm/plugin/mmsight/segment/FFmpegMetadataRetriever:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   238: goto -30 -> 208
    //   241: astore_1
    //   242: sipush 3613
    //   245: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   248: goto -189 -> 59
    //   251: astore_1
    //   252: goto -147 -> 105
    //   255: astore_2
    //   256: goto -70 -> 186
    //   259: astore_1
    //   260: aconst_null
    //   261: astore_2
    //   262: goto -84 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   80	96	96	java/lang/SecurityException
    //   145	173	96	java/lang/SecurityException
    //   194	208	96	java/lang/SecurityException
    //   225	238	96	java/lang/SecurityException
    //   67	76	122	java/io/FileNotFoundException
    //   62	67	139	java/lang/SecurityException
    //   67	76	139	java/lang/SecurityException
    //   123	139	139	java/lang/SecurityException
    //   80	96	173	finally
    //   145	173	173	finally
    //   194	208	173	finally
    //   225	238	173	finally
    //   212	216	241	java/io/IOException
    //   101	105	251	java/io/IOException
    //   182	186	255	java/io/IOException
    //   62	67	259	finally
    //   67	76	259	finally
    //   123	139	259	finally
  }

  public void setDataSource(FileDescriptor paramFileDescriptor)
  {
    AppMethodBeat.i(3612);
    setDataSource(paramFileDescriptor, 0L, 576460752303423487L);
    AppMethodBeat.o(3612);
  }

  public native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2);

  public void setDataSource(String paramString)
  {
    AppMethodBeat.i(3610);
    _setDataSource(paramString, null, null);
    AppMethodBeat.o(3610);
  }

  public void setDataSource(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(3611);
    String[] arrayOfString1 = new String[paramMap.size()];
    String[] arrayOfString2 = new String[paramMap.size()];
    Iterator localIterator = paramMap.entrySet().iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      paramMap = (Map.Entry)localIterator.next();
      arrayOfString1[i] = ((String)paramMap.getKey());
      arrayOfString2[i] = ((String)paramMap.getValue());
    }
    _setDataSource(paramString, arrayOfString1, arrayOfString2);
    AppMethodBeat.o(3611);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever
 * JD-Core Version:    0.6.2
 */