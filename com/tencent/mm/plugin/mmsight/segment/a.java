package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@TargetApi(16)
public abstract class a
  implements f
{
  private String eys;
  private List<a.a> fYm = new ArrayList();
  private List<a.a> fYn = new ArrayList();
  String fYo;
  String fYp;
  VideoTransPara fYq;
  long fYr;
  long fYs;
  int fYt = -1;
  private boolean isInited = false;
  private MediaExtractor mMediaExtractor;
  int mRotationDegree = -1;

  private void a(MediaExtractor paramMediaExtractor)
  {
    int i = paramMediaExtractor.getTrackCount();
    int j = 0;
    if (j < i)
    {
      MediaFormat localMediaFormat = paramMediaExtractor.getTrackFormat(j);
      String str;
      if ((localMediaFormat.containsKey("mime")) && (!bo.isNullOrNil(localMediaFormat.getString("mime"))))
      {
        str = localMediaFormat.getString("mime");
        ab.i("BaseMediaCodecClipper", "mime: %s", new Object[] { str });
        if (!str.startsWith("audio/"))
          break label104;
        this.fYn.add(new a.a(this, localMediaFormat, j));
      }
      while (true)
      {
        j++;
        break;
        label104: if (str.startsWith("video/"))
          this.fYm.add(new a.a(this, localMediaFormat, j));
      }
    }
    ab.i("BaseMediaCodecClipper", "findMediaFormat mAudioSelectedTrackList.size() = %d, mVideoSelectedTrackList.size() = %d", new Object[] { Integer.valueOf(this.fYn.size()), Integer.valueOf(this.fYm.size()) });
  }

  private int alM()
  {
    int i = -1;
    int j = i;
    Iterator localIterator;
    a.a locala;
    if (this.fYn != null)
    {
      j = i;
      if (this.fYn.size() != 0)
      {
        localIterator = this.fYn.iterator();
        j = -1;
        if (localIterator.hasNext())
        {
          locala = (a.a)localIterator.next();
          if (!locala.mediaFormat.containsKey("max-input-size"))
            break label179;
          j = Math.max(locala.mediaFormat.getInteger("max-input-size"), j);
        }
      }
    }
    label176: label179: 
    while (true)
    {
      break;
      i = j;
      if (this.fYm != null)
      {
        i = j;
        if (this.fYm.size() != 0)
        {
          localIterator = this.fYm.iterator();
          if (localIterator.hasNext())
          {
            locala = (a.a)localIterator.next();
            if (!locala.mediaFormat.containsKey("max-input-size"))
              break label176;
            j = Math.max(locala.mediaFormat.getInteger("max-input-size"), j);
          }
        }
      }
      while (true)
      {
        break;
        i = j;
        return i;
      }
    }
  }

  public int O(long paramLong1, long paramLong2)
  {
    if (!this.isInited)
    {
      ab.e("BaseMediaCodecClipper", "checkTimeParameter has not been initialized.");
      throw new IllegalStateException("Please init this component first.");
    }
    long l = paramLong1;
    if (paramLong1 < 0L)
      l = 0L;
    this.fYr = l;
    MediaFormat localMediaFormat = ((a.a)this.fYm.get(0)).mediaFormat;
    if (!localMediaFormat.containsKey("durationUs"))
      throw new p("Can not find duration.");
    if (paramLong2 > 0L)
    {
      paramLong1 = paramLong2;
      if (paramLong2 <= localMediaFormat.getLong("durationUs") / 1000L);
    }
    else
    {
      paramLong1 = localMediaFormat.getLong("durationUs") / 1000L;
    }
    this.fYs = paramLong1;
    return a(this.mMediaExtractor, this.fYn, this.fYm);
  }

  protected int a(MediaExtractor paramMediaExtractor, List<a.a> paramList1, List<a.a> paramList2)
  {
    return 0;
  }

  protected final String alN()
  {
    if (this.eys == null)
      this.eys = (CaptureMMProxy.getInstance().getAccVideoPath() + "vsg_clip_temp.mp4");
    return this.eys;
  }

  public void b(String paramString1, String paramString2, VideoTransPara paramVideoTransPara)
  {
    ab.d("BaseMediaCodecClipper", "init() called with: src = [" + paramString1 + "], dst = [" + paramString2 + "], para = [" + paramVideoTransPara + "]");
    long l = bo.yz();
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (paramVideoTransPara == null))
      throw new IllegalArgumentException(String.format(Locale.CHINA, "Argument's null or nil. src = %s; dst = %s; param = %s", new Object[] { paramString1, paramString2, paramVideoTransPara }));
    b localb = new b(paramString1);
    new b(paramString2);
    if ((!localb.canRead()) || (localb.length() == 0L))
      throw new IllegalArgumentException(String.format(Locale.CHINA, "Argument src video file can not be read or empty %s", new Object[] { paramString1 }));
    this.fYo = paramString1;
    this.fYp = paramString2;
    this.fYq = paramVideoTransPara;
    this.mMediaExtractor = new MediaExtractor();
    this.mMediaExtractor.setDataSource(paramString1);
    a(this.mMediaExtractor);
    if ((this.fYm == null) || (this.fYm.size() == 0))
      throw new p("Can not find video or audio track in this video file.");
    this.fYt = alM();
    this.mRotationDegree = uG(paramString1);
    this.isInited = true;
    ab.e("BaseMediaCodecClipper", "init cost time %dms", new Object[] { Long.valueOf(bo.az(l)) });
  }

  public final void release()
  {
    this.isInited = false;
    if (this.mMediaExtractor != null)
      this.mMediaExtractor.release();
  }

  public abstract int uG(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a
 * JD-Core Version:    0.6.2
 */