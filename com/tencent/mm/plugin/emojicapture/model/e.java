package com.tencent.mm.plugin.emojicapture.model;

import a.f.b.j;
import a.k.m;
import a.l;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/EmojiCaptureUtil;", "", "()V", "TAG", "", "checkVideoValid", "", "videoPath", "plugin-emojicapture_release"})
public final class e
{
  private static final String TAG = "MicroMsg.EmojiCaptureUtil";
  public static final e lhA;

  static
  {
    AppMethodBeat.i(2616);
    lhA = new e();
    TAG = "MicroMsg.EmojiCaptureUtil";
    AppMethodBeat.o(2616);
  }

  public static boolean Kb(String paramString)
  {
    AppMethodBeat.i(2615);
    j.p(paramString, "videoPath");
    boolean bool;
    if (com.tencent.mm.vfs.e.asZ(paramString) <= 0L)
    {
      AppMethodBeat.o(2615);
      bool = false;
    }
    MediaExtractor localMediaExtractor;
    while (true)
    {
      return bool;
      localMediaExtractor = new MediaExtractor();
      try
      {
        localMediaExtractor.setDataSource(paramString);
        int i = localMediaExtractor.getTrackCount();
        if (i <= 0)
        {
          try
          {
            localMediaExtractor.release();
            AppMethodBeat.o(2615);
            bool = false;
          }
          catch (Exception paramString)
          {
            while (true)
              ab.printErrStackTrace(TAG, (Throwable)paramString, "checkVideoValid, release extractor error", new Object[0]);
          }
        }
        else
        {
          int j = localMediaExtractor.getTrackCount();
          for (i = 0; ; i++)
            while (true)
            {
              if (i >= j)
                break label191;
              paramString = localMediaExtractor.getTrackFormat(i);
              if ((paramString != null) && (paramString.containsKey("mime")))
              {
                paramString = paramString.getString("mime");
                if (paramString != null)
                {
                  bool = m.d((CharSequence)paramString, (CharSequence)"video");
                  if (bool == true)
                    try
                    {
                      localMediaExtractor.release();
                      AppMethodBeat.o(2615);
                      bool = true;
                    }
                    catch (Exception paramString)
                    {
                      while (true)
                        ab.printErrStackTrace(TAG, (Throwable)paramString, "checkVideoValid, release extractor error", new Object[0]);
                    }
                }
              }
            }
          try
          {
            label191: localMediaExtractor.release();
            AppMethodBeat.o(2615);
            bool = false;
          }
          catch (Exception paramString)
          {
            while (true)
              ab.printErrStackTrace(TAG, (Throwable)paramString, "checkVideoValid, release extractor error", new Object[0]);
          }
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          paramString = paramString;
          ab.printErrStackTrace(TAG, (Throwable)paramString, "checkVideoValid error", new Object[0]);
          try
          {
            localMediaExtractor.release();
          }
          catch (Exception paramString)
          {
            ab.printErrStackTrace(TAG, (Throwable)paramString, "checkVideoValid, release extractor error", new Object[0]);
          }
        }
      }
      finally
      {
      }
    }
    try
    {
      localMediaExtractor.release();
      AppMethodBeat.o(2615);
      throw paramString;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace(TAG, (Throwable)localException, "checkVideoValid, release extractor error", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.e
 * JD-Core Version:    0.6.2
 */