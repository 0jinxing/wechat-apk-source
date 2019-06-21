package com.tencent.qqmusic.mediaplayer;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Arrays;
import java.util.Iterator;

public enum NativeLibs
{
  private static final SparseArray<String> SUFFIX;
  private static final String TAG = "NativeLibs";
  private boolean mHasLoadSoSuccess;
  private final String name;
  private final long supportedAbi;

  static
  {
    AppMethodBeat.i(128461);
    nlog = new NativeLibs("nlog", 0, "NLog", 1L);
    audioCommon = new NativeLibs("audioCommon", 1, "audio_common", 1L);
    QmNativeDataSource = new NativeLibs("QmNativeDataSource", 2, "QmNativeDataSource", 1L);
    formatDetector = new NativeLibs("formatDetector", 3, "FormatDetector", 1L);
    codecFactory = new NativeLibs("codecFactory", 4, "codec_factory", 3L);
    decoderJni = new NativeLibs("decoderJni", 5, "qqmusic_decoder_jni", 3L);
    FFmpeg = new NativeLibs("FFmpeg", 6, "FFmpeg", 3L);
    cppShared = new NativeLibs("cppShared", 7, "c++_shared", 3L);
    stlportShared = new NativeLibs("stlportShared", 8, "stlport_shared", 3L);
    xlog = new NativeLibs("xlog", 9, "wechatxlog", 3L);
    $VALUES = new NativeLibs[] { nlog, audioCommon, QmNativeDataSource, formatDetector, codecFactory, decoderJni, FFmpeg, cppShared, stlportShared, xlog };
    SparseArray localSparseArray = new SparseArray();
    SUFFIX = localSparseArray;
    localSparseArray.put(1, "");
    SUFFIX.put(2, "");
    AppMethodBeat.o(128461);
  }

  private NativeLibs(String paramString, long paramLong)
  {
    this.name = paramString;
    this.supportedAbi = paramLong;
  }

  public static boolean loadAll(Iterable<NativeLibs> paramIterable)
  {
    AppMethodBeat.i(128458);
    paramIterable = paramIterable.iterator();
    boolean bool;
    while (paramIterable.hasNext())
      if (!((NativeLibs)paramIterable.next()).load())
      {
        bool = false;
        AppMethodBeat.o(128458);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128458);
    }
  }

  public static boolean loadAll(NativeLibs[] paramArrayOfNativeLibs)
  {
    AppMethodBeat.i(128457);
    boolean bool = loadAll(Arrays.asList(paramArrayOfNativeLibs));
    AppMethodBeat.o(128457);
    return bool;
  }

  private boolean loadLibrary(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(128460);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(128460);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      try
      {
        Logger.i("NativeLibs", "[loadLibrary] loading: ".concat(String.valueOf(paramString)));
        bool2 = AudioPlayerConfigure.getSoLibraryLoader().load(paramString);
        bool1 = bool2;
        if (bool1)
        {
          Logger.i("NativeLibs", "[loadLibrary] succeed: ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(128460);
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          Logger.e("NativeLibs", "[loadLibrary] failed: ".concat(String.valueOf(paramString)), localThrowable);
          continue;
          Logger.e("NativeLibs", "[loadLibrary] failed: ".concat(String.valueOf(paramString)));
        }
      }
    }
  }

  public final String getName()
  {
    return this.name;
  }

  public final boolean load()
  {
    AppMethodBeat.i(128459);
    boolean bool;
    if (this.mHasLoadSoSuccess)
    {
      bool = true;
      AppMethodBeat.o(128459);
    }
    while (true)
    {
      return bool;
      this.mHasLoadSoSuccess = loadLibrary(getName());
      bool = this.mHasLoadSoSuccess;
      AppMethodBeat.o(128459);
    }
  }

  public final boolean supportAbi(int paramInt)
  {
    if ((this.supportedAbi & paramInt) == paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.NativeLibs
 * JD-Core Version:    0.6.2
 */