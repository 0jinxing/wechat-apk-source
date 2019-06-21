package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Arrays;

public class NativeDataSourceFactory
{
  private static final String TAG = "NativeDataSourceFactory";
  private static final boolean soLoaded;

  static
  {
    AppMethodBeat.i(128369);
    boolean bool = NativeLibs.loadAll(Arrays.asList(new NativeLibs[] { NativeLibs.audioCommon, NativeLibs.formatDetector, NativeLibs.codecFactory, NativeLibs.decoderJni, NativeLibs.cppShared, NativeLibs.stlportShared, NativeLibs.xlog, NativeLibs.FFmpeg }));
    soLoaded = bool;
    if (!bool)
      Logger.e("NativeDataSourceFactory", "[static initializer] failed to load so!");
    AppMethodBeat.o(128369);
  }

  public static INativeDataSource fileDataSource(String paramString)
  {
    AppMethodBeat.i(128367);
    paramString = new INativeDataSource()
    {
      public final AudioFormat.AudioType getAudioType()
      {
        return null;
      }

      public final long getNativeInstance()
      {
        long l1 = 0L;
        AppMethodBeat.i(128366);
        if (NativeDataSourceFactory.soLoaded);
        while (true)
        {
          try
          {
            l2 = NativeDataSourceFactory.localFile(this.val$filePath, 0);
            AppMethodBeat.o(128366);
            return l2;
          }
          catch (Throwable localThrowable)
          {
            Logger.e("NativeDataSourceFactory", "[getNativeInstance] failed to create native data source!", localThrowable);
            AppMethodBeat.o(128366);
            l2 = l1;
            continue;
          }
          Logger.w("NativeDataSourceFactory", "[getNativeInstance] so not loaded properly!");
          AppMethodBeat.o(128366);
          long l2 = l1;
        }
      }
    };
    AppMethodBeat.o(128367);
    return paramString;
  }

  public static INativeDataSource fileDataSource(String paramString, final int paramInt)
  {
    AppMethodBeat.i(128368);
    paramString = new INativeDataSource()
    {
      public final AudioFormat.AudioType getAudioType()
      {
        return null;
      }

      public final long getNativeInstance()
      {
        long l1 = 0L;
        AppMethodBeat.i(128361);
        if (NativeDataSourceFactory.soLoaded);
        while (true)
        {
          try
          {
            String str = this.val$filePath;
            if (paramInt > 0)
            {
              i = 1;
              long l2 = NativeDataSourceFactory.localFile(str, i);
              l1 = l2;
              AppMethodBeat.o(128361);
              return l1;
            }
            int i = 0;
            continue;
          }
          catch (Throwable localThrowable)
          {
            Logger.e("NativeDataSourceFactory", "[getNativeInstance] failed to create native data source!", localThrowable);
            AppMethodBeat.o(128361);
            continue;
          }
          Logger.w("NativeDataSourceFactory", "[getNativeInstance] so not loaded properly!");
          AppMethodBeat.o(128361);
        }
      }
    };
    AppMethodBeat.o(128368);
    return paramString;
  }

  public static native long localFile(String paramString, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory
 * JD-Core Version:    0.6.2
 */