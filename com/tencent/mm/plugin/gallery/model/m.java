package com.tencent.mm.plugin.gallery.model;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

@TargetApi(16)
public final class m
  implements Runnable
{
  public GalleryItem.VideoMediaItem mOA;
  public m.a mOB;
  public MediaFormat mOy;
  public MediaFormat mOz;
  public String path;
  public int position;

  public m(String paramString, int paramInt, GalleryItem.VideoMediaItem paramVideoMediaItem, m.a parama)
  {
    this.path = paramString;
    this.position = paramInt;
    this.mOA = paramVideoMediaItem;
    this.mOB = parama;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(21332);
    boolean bool;
    if (((paramObject instanceof m)) && ((this == paramObject) || (this.position == ((m)paramObject).position) || ((this.path != null) && (this.path.equals(((m)paramObject).path)))))
    {
      bool = true;
      AppMethodBeat.o(21332);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(21332);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(21331);
    MediaExtractor localMediaExtractor = new MediaExtractor();
    while (true)
    {
      try
      {
        localMediaExtractor.setDataSource(this.path);
        int i = localMediaExtractor.getTrackCount();
        j = 0;
        Object localObject1;
        Object localObject2;
        if (j < i)
        {
          localObject1 = localMediaExtractor.getTrackFormat(j);
          if (!((MediaFormat)localObject1).containsKey("mime"))
          {
            ab.d("VideoAnalysisTask", "find video mime : not found.");
            j++;
            continue;
          }
          localObject2 = ((MediaFormat)localObject1).getString("mime");
          ab.d("VideoAnalysisTask", "find video mime : %s", new Object[] { localObject2 });
          if (localObject2 == null)
            continue;
          if (!((String)localObject2).startsWith("video/"))
            continue;
          if (this.mOy == null)
            this.mOy = ((MediaFormat)localObject1);
          if ((this.mOz == null) || (this.mOy == null))
            continue;
        }
        if (this.mOA != null)
        {
          if (this.mOy != null)
          {
            localObject2 = this.mOA;
            if (this.mOy.containsKey("durationUs"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).fPW = j;
            localObject2 = this.mOA;
            if (this.mOy.containsKey("height"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoHeight = j;
            localObject2 = this.mOA;
            if (this.mOy.containsKey("width"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoWidth = j;
            localObject1 = this.mOA;
            if (this.mOy.containsKey("mime"))
              continue;
            localObject2 = "";
            ((GalleryItem.VideoMediaItem)localObject1).fPU = ((String)localObject2);
            localObject2 = this.mOA;
            if (this.mOy.containsKey("bitrate"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoBitRate = j;
            localObject2 = this.mOA;
            if (this.mOy.containsKey("i-frame-interval"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).fPX = j;
            localObject2 = this.mOA;
            if (this.mOy.containsKey("frame-rate"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoFrameRate = j;
          }
          if (this.mOz != null)
          {
            localObject1 = this.mOA;
            if (this.mOz.containsKey("mime"))
              continue;
            localObject2 = "";
            ((GalleryItem.VideoMediaItem)localObject1).fPV = ((String)localObject2);
          }
        }
        localMediaExtractor.release();
        if (this.mOB == null)
        {
          ab.d("VideoAnalysisTask", "video analysis end. observer == null, position = [%d], mediaItem = [%s]", new Object[] { Integer.valueOf(this.position), this.mOA });
          AppMethodBeat.o(21331);
          return;
          if ((!((String)localObject2).startsWith("audio/")) || (this.mOz != null))
            continue;
          this.mOz = ((MediaFormat)localObject1);
          continue;
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.d("VideoAnalysisTask", "Video extractor init failed. video path = [%s] e = [%s]", new Object[] { this.path, localException.getMessage() });
        localMediaExtractor.release();
        continue;
        int j = (int)(this.mOy.getLong("durationUs") / 1000L);
        continue;
        j = this.mOy.getInteger("height");
        continue;
        j = this.mOy.getInteger("width");
        continue;
        String str = this.mOy.getString("mime");
        continue;
        j = this.mOy.getInteger("bitrate");
        continue;
        j = this.mOy.getInteger("i-frame-interval");
        continue;
        j = this.mOy.getInteger("frame-rate");
        continue;
        str = this.mOz.getString("mime");
        continue;
      }
      finally
      {
        localMediaExtractor.release();
        AppMethodBeat.o(21331);
      }
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(21330);
          if (m.this.mOB != null)
            m.this.mOB.a(m.this);
          AppMethodBeat.o(21330);
        }
      });
      AppMethodBeat.o(21331);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.m
 * JD-Core Version:    0.6.2
 */