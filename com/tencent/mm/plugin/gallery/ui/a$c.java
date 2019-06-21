package com.tencent.mm.plugin.gallery.ui;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Looper;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

final class a$c
  implements Runnable
{
  private static HashMap<TextView, c> mOU;
  private WeakReference<TextView> lWO;
  private GalleryItem.VideoMediaItem mOS;
  private a.c.a mOT;

  static
  {
    AppMethodBeat.i(21371);
    mOU = new HashMap();
    AppMethodBeat.o(21371);
  }

  private a$c(TextView paramTextView, GalleryItem.VideoMediaItem paramVideoMediaItem, a.c.a parama)
  {
    AppMethodBeat.i(21363);
    this.lWO = new WeakReference(paramTextView);
    this.mOS = paramVideoMediaItem;
    this.mOT = parama;
    AppMethodBeat.o(21363);
  }

  static void a(TextView paramTextView, GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    Object localObject = null;
    AppMethodBeat.i(21365);
    if ((paramTextView == null) || (paramVideoMediaItem == null))
    {
      ab.e("MicroMsg.AlbumAdapter", "Error input for duration fetcher");
      AppMethodBeat.o(21365);
    }
    while (true)
    {
      return;
      c localc;
      if (mOU.containsKey(paramTextView))
      {
        localc = (c)mOU.get(paramTextView);
        if (localc.mOS.equals(paramVideoMediaItem))
          AppMethodBeat.o(21365);
        else if (paramTextView.equals(localc.lWO.get()))
          localc.h(null);
      }
      else if (paramVideoMediaItem.fPW >= 0)
      {
        ab.i("MicroMsg.AlbumAdapter", "Directly attach durationMs %d to tv, path %s", new Object[] { Integer.valueOf(paramVideoMediaItem.fPW), paramVideoMediaItem });
        d(paramTextView, paramVideoMediaItem.fPW);
        mOU.remove(paramTextView);
        AppMethodBeat.o(21365);
      }
      else
      {
        paramTextView.setText("");
        localc = new c(paramTextView, paramVideoMediaItem, new a.c.2());
        if (d.xDG.ao(localc))
        {
          ab.i("MicroMsg.AlbumAdapter", "task has post to thread pool");
          Iterator localIterator = mOU.entrySet().iterator();
          do
          {
            paramVideoMediaItem = localObject;
            if (!localIterator.hasNext())
              break;
            paramVideoMediaItem = (Map.Entry)localIterator.next();
          }
          while (!localc.equals(paramVideoMediaItem.getValue()));
          if ((paramVideoMediaItem == null) || (paramVideoMediaItem.getValue() == null))
          {
            ab.e("MicroMsg.AlbumAdapter", "no entry found");
            AppMethodBeat.o(21365);
          }
          else
          {
            ((c)paramVideoMediaItem.getValue()).h(paramTextView);
            mOU.remove(paramVideoMediaItem.getKey());
            mOU.put(paramTextView, paramVideoMediaItem.getValue());
            AppMethodBeat.o(21365);
          }
        }
        else
        {
          d.post(localc, "load_duration_for_" + paramVideoMediaItem.fPT);
          mOU.put(paramTextView, localc);
          AppMethodBeat.o(21365);
        }
      }
    }
  }

  private static void d(TextView paramTextView, int paramInt)
  {
    AppMethodBeat.i(21366);
    if (paramTextView == null)
      AppMethodBeat.o(21366);
    while (true)
    {
      return;
      if (paramInt < 0)
      {
        paramTextView.setText("--:--");
        AppMethodBeat.o(21366);
      }
      else
      {
        paramInt = Math.round(paramInt / 1000.0F);
        paramTextView.setText(String.format(Locale.CHINA, "%d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) }));
        AppMethodBeat.o(21366);
      }
    }
  }

  private void h(TextView paramTextView)
  {
    AppMethodBeat.i(21364);
    this.lWO = new WeakReference(paramTextView);
    AppMethodBeat.o(21364);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(21367);
    boolean bool;
    if ((paramObject == null) || (!(paramObject instanceof c)))
    {
      bool = false;
      AppMethodBeat.o(21367);
    }
    while (true)
    {
      return bool;
      bool = this.mOS.equals(((c)paramObject).mOS);
      AppMethodBeat.o(21367);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(21368);
    int i = this.mOS.hashCode();
    AppMethodBeat.o(21368);
    return i;
  }

  public final void run()
  {
    AppMethodBeat.i(21369);
    MediaExtractor localMediaExtractor = new MediaExtractor();
    String str1 = this.mOS.Wy();
    while (true)
    {
      try
      {
        localMediaExtractor.setDataSource(str1);
        int i = localMediaExtractor.getTrackCount();
        int j = 0;
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject4 = localObject1;
        Object localObject5 = localObject2;
        MediaFormat localMediaFormat;
        String str2;
        if (j < i)
        {
          localMediaFormat = localMediaExtractor.getTrackFormat(j);
          if (!localMediaFormat.containsKey("mime"))
          {
            ab.d("MicroMsg.AlbumAdapter", "find video mime : not found.");
            localObject6 = localObject2;
            localObject7 = localObject1;
            j++;
            localObject1 = localObject7;
            localObject2 = localObject6;
            continue;
          }
          str2 = localMediaFormat.getString("mime");
          ab.d("MicroMsg.AlbumAdapter", "find video mime : %s", new Object[] { str2 });
          Object localObject7 = localObject1;
          Object localObject6 = localObject2;
          if (str2 == null)
            continue;
          if (!str2.startsWith("video/"))
            continue;
          localObject4 = localObject1;
          localObject5 = localObject2;
          if (localObject2 == null)
          {
            localObject5 = localMediaFormat;
            localObject4 = localObject1;
          }
          localObject7 = localObject4;
          localObject6 = localObject5;
          if (localObject4 == null)
            continue;
          localObject7 = localObject4;
          localObject6 = localObject5;
          if (localObject5 == null)
            continue;
        }
        if (this.mOS != null)
        {
          if (localObject5 != null)
          {
            localObject2 = this.mOS;
            if (localObject5.containsKey("durationUs"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).fPW = j;
            localObject2 = this.mOS;
            if (localObject5.containsKey("height"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoHeight = j;
            localObject2 = this.mOS;
            if (localObject5.containsKey("width"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoWidth = j;
            localObject1 = this.mOS;
            if (localObject5.containsKey("mime"))
              continue;
            localObject2 = "";
            ((GalleryItem.VideoMediaItem)localObject1).fPU = ((String)localObject2);
            localObject2 = this.mOS;
            if (localObject5.containsKey("bitrate"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoBitRate = j;
            localObject2 = this.mOS;
            if (localObject5.containsKey("i-frame-interval"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).fPX = j;
            localObject2 = this.mOS;
            if (localObject5.containsKey("frame-rate"))
              continue;
            j = 0;
            ((GalleryItem.VideoMediaItem)localObject2).videoFrameRate = j;
            this.mOS.eXL = SightVideoJNI.getMp4Rotate(str1);
          }
          if (localObject4 != null)
          {
            localObject1 = this.mOS;
            if (localObject4.containsKey("mime"))
              continue;
            localObject2 = "";
            ((GalleryItem.VideoMediaItem)localObject1).fPV = ((String)localObject2);
          }
        }
        ab.d("MicroMsg.AlbumAdapter", "mediaItem format:%s, videoPath:%s", new Object[] { localObject5, str1 });
        localMediaExtractor.release();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
          if (this.mOT != null)
            this.mOT.a(this, this.mOS.fPW);
          AppMethodBeat.o(21369);
          return;
          localObject4 = localObject1;
          localObject5 = localObject2;
          if (!str2.startsWith("audio/"))
            continue;
          localObject4 = localObject1;
          localObject5 = localObject2;
          if (localObject1 != null)
            continue;
          localObject4 = localMediaFormat;
          localObject5 = localObject2;
          continue;
          j = (int)(localObject5.getLong("durationUs") / 1000L);
          continue;
          j = localObject5.getInteger("height");
          continue;
          j = localObject5.getInteger("width");
          continue;
          localObject2 = localObject5.getString("mime");
          continue;
          j = localObject5.getInteger("bitrate");
          continue;
          j = localObject5.getInteger("i-frame-interval");
          continue;
          j = localObject5.getInteger("frame-rate");
          continue;
          localObject2 = localObject4.getString("mime");
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.d("MicroMsg.AlbumAdapter", "Video extractor init failed. video path = [%s] e = [%s]", new Object[] { str1, localException.getMessage() });
        localMediaExtractor.release();
        continue;
      }
      finally
      {
        localMediaExtractor.release();
        AppMethodBeat.o(21369);
      }
      al.d(new a.c.1(this));
      AppMethodBeat.o(21369);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.a.c
 * JD-Core Version:    0.6.2
 */