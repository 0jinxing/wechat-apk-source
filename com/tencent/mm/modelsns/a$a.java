package com.tencent.mm.modelsns;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$a
{
  public String fPT;
  public String fPU;
  public String fPV;
  public int fPW = -1;
  public int fPX = -1;
  public int videoBitRate = -1;
  public int videoFrameRate = -1;
  public int videoHeight = -1;
  public int videoWidth = -1;

  public static a tw(String paramString)
  {
    AppMethodBeat.i(16606);
    MediaExtractor localMediaExtractor = new MediaExtractor();
    a locala = new a();
    locala.fPT = paramString;
    try
    {
      localMediaExtractor.setDataSource(paramString);
      int i = localMediaExtractor.getTrackCount();
      int j = 0;
      Object localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = localObject1;
      Object localObject4 = localObject2;
      MediaFormat localMediaFormat;
      String str;
      if (j < i)
      {
        localMediaFormat = localMediaExtractor.getTrackFormat(j);
        Object localObject5;
        Object localObject6;
        if (!localMediaFormat.containsKey("mime"))
        {
          ab.i("MicroMsg.ShareSnsImpl", "find video mime : not found.");
          localObject5 = localObject2;
          localObject6 = localObject1;
        }
        do
        {
          do
          {
            do
            {
              j++;
              localObject1 = localObject6;
              localObject2 = localObject5;
              break;
              str = localMediaFormat.getString("mime");
              ab.i("MicroMsg.ShareSnsImpl", "find video mime : %s", new Object[] { str });
              localObject6 = localObject1;
              localObject5 = localObject2;
            }
            while (str == null);
            if (!str.startsWith("video/"))
              break label378;
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (localObject2 == null)
            {
              localObject4 = localMediaFormat;
              localObject3 = localObject1;
            }
            localObject6 = localObject3;
            localObject5 = localObject4;
          }
          while (localObject3 == null);
          localObject6 = localObject3;
          localObject5 = localObject4;
        }
        while (localObject4 == null);
      }
      if (localObject4 != null)
      {
        if (!localObject4.containsKey("durationUs"))
        {
          j = 0;
          label220: locala.fPW = j;
          if (localObject4.containsKey("height"))
            break label437;
          j = 0;
          label239: locala.videoHeight = j;
          if (localObject4.containsKey("width"))
            break label449;
          j = 0;
          label258: locala.videoWidth = j;
          if (localObject4.containsKey("mime"))
            break label461;
          localObject2 = "";
          label278: locala.fPU = ((String)localObject2);
          if (localObject4.containsKey("bitrate"))
            break label473;
          j = 0;
          label297: locala.videoBitRate = j;
          if (localObject4.containsKey("i-frame-interval"))
            break label485;
          j = 0;
          label316: locala.fPX = j;
          if (localObject4.containsKey("frame-rate"))
            break label497;
          j = 0;
          label335: locala.videoFrameRate = j;
        }
      }
      else if (localObject3 != null)
        if (localObject3.containsKey("mime"))
          break label509;
      label378: label509: for (localObject2 = ""; ; localObject2 = localObject3.getString("mime"))
      {
        locala.fPV = ((String)localObject2);
        return locala;
        localObject3 = localObject1;
        localObject4 = localObject2;
        if (!str.startsWith("audio/"))
          break;
        localObject3 = localObject1;
        localObject4 = localObject2;
        if (localObject1 != null)
          break;
        localObject3 = localMediaFormat;
        localObject4 = localObject2;
        break;
        j = (int)(localObject4.getLong("durationUs") / 1000L);
        break label220;
        j = localObject4.getInteger("height");
        break label239;
        j = localObject4.getInteger("width");
        break label258;
        localObject2 = localObject4.getString("mime");
        break label278;
        j = localObject4.getInteger("bitrate");
        break label297;
        j = localObject4.getInteger("i-frame-interval");
        break label316;
        j = localObject4.getInteger("frame-rate");
        break label335;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        label437: label449: label461: label473: label485: label497: ab.i("MicroMsg.ShareSnsImpl", "Video extractor init failed. video path = [%s] e = [%s]", new Object[] { paramString, localException.getMessage() });
        localMediaExtractor.release();
      }
    }
    finally
    {
      localMediaExtractor.release();
      AppMethodBeat.o(16606);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.a.a
 * JD-Core Version:    0.6.2
 */