package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
{
  private static Map<String, Long> sKg;
  private static Map<String, Integer> sKh;
  public final String TAG = "Traf.TrafficModel";
  private long sKb;
  private double sKc = 0.35D;
  private double sKd = 3.0D;
  long sKe = 0L;
  double sKf = 0.0D;

  static
  {
    AppMethodBeat.i(114780);
    sKg = new HashMap();
    sKh = new HashMap();
    sKg.put("null", Long.valueOf(4194304L));
    sKg.put("Background", Long.valueOf(5242880L));
    sKg.put("WebViewUI", Long.valueOf(83886080L));
    sKg.put("WebviewMpUI", Long.valueOf(83886080L));
    sKg.put("SnsTimeLineUI", Long.valueOf(15728640L));
    sKg.put("SnsUserUI", Long.valueOf(15728640L));
    sKg.put("AppBrandLaunchProxyUI", Long.valueOf(12582912L));
    sKg.put("AppBrandUI", Long.valueOf(20971520L));
    sKg.put("ChattingUI", Long.valueOf(12582912L));
    sKg.put("SnsBrowseUI", Long.valueOf(12582912L));
    sKg.put("SnsOnlineVideoActivity", Long.valueOf(12582912L));
    sKg.put("EmojiStoreV2UI", Long.valueOf(16777216L));
    sKg.put("EmojiStoreDetailUI", Long.valueOf(16777216L));
    sKg.put("FTSSOSMoreWebViewUI", Long.valueOf(12582912L));
    sKg.put("FTSWebViewUI", Long.valueOf(12582912L));
    sKg.put("TopStoryHomeUI", Long.valueOf(16777216L));
    sKg.put("TopStoryVideoStreamUI", Long.valueOf(25165824L));
    sKg.put("GameDemoActivity1", Long.valueOf(12582912L));
    sKg.put("ImageGalleryUI", Long.valueOf(12582912L));
    sKg.put("SnsGalleryUI", Long.valueOf(12582912L));
    sKg.put("VideoActivity", Long.valueOf(16777216L));
    sKg.put("MultiTalkMainUI", Long.valueOf(16777216L));
    sKg.put("FavoriteVideoPlayUI", Long.valueOf(16777216L));
    sKg.put("AppAttachDownloadUI", Long.valueOf(20971520L));
    sKg.put("LuggageGameWebViewUI", Long.valueOf(20971520L));
    sKh.put("AppAttachDownloadUI", Integer.valueOf(2));
    sKh.put("SendImgProxyUI", Integer.valueOf(2));
    AppMethodBeat.o(114780);
  }

  public d()
  {
  }

  public d(long paramLong)
  {
    this.sKb = paramLong;
  }

  public final boolean a(List<TrafficClickFlowReceiver.c> paramList, long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(114778);
    ab.i("Traf.TrafficModel", "realInterval:%d", new Object[] { Long.valueOf(paramLong3) });
    boolean bool;
    if (paramLong3 <= 5000L)
    {
      bool = false;
      AppMethodBeat.o(114778);
    }
    while (true)
    {
      return bool;
      int i;
      int j;
      label89: long l2;
      int k;
      double d1;
      if (paramLong3 <= 300000L)
      {
        i = 100;
        this.sKb = (i * paramLong3 * 1048576L / 60000L);
        this.sKe = 0L;
        l1 = 0L;
        j = 0;
        i = 0;
        if (i >= paramList.size())
          break label396;
        l2 = Math.min(((TrafficClickFlowReceiver.c)paramList.get(i)).endTime - ((TrafficClickFlowReceiver.c)paramList.get(i)).startTime, paramLong2);
        l1 += l2;
        Object localObject1 = ((TrafficClickFlowReceiver.c)paramList.get(i)).sJY;
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = "null";
        k = j;
        if (((String)localObject2).equals("AppAttachDownloadUI"))
        {
          k = j;
          if (j == 0)
            k = 1;
        }
        ((String)localObject2).equals("SendImgProxyUI");
        localObject1 = localObject2;
        if (((String)localObject2).contains("_"))
          localObject1 = ((String)localObject2).substring(0, ((String)localObject2).indexOf("_"));
        if (!sKg.containsKey(localObject1))
          break label363;
        d1 = this.sKe;
        d2 = ((Long)sKg.get(localObject1)).longValue();
      }
      for (this.sKe = (()(l2 / 1000.0D / 60.0D * d2 + d1)); ; this.sKe = (()(l2 / 1000.0D / 60.0D * 8388608.0D + d2)))
      {
        i++;
        j = k;
        break label89;
        if ((paramLong3 > 300000L) && (paramLong3 <= 600000L))
        {
          i = 90;
          break;
        }
        if ((paramLong3 > 600000L) && (paramLong3 <= 1800000L))
        {
          i = 60;
          break;
        }
        i = 50;
        break;
        label363: d2 = this.sKe;
      }
      label396: if (l1 < paramLong2)
        this.sKe += (paramLong2 - l1) / 1000L / 60L * 8388608L;
      this.sKe = Math.max(((Long)sKg.get("null")).longValue() * (paramLong2 / 1000L / 60L), this.sKe);
      if (j != 0)
      {
        paramLong2 = this.sKe;
        this.sKe = (((Integer)sKh.get("AppAttachDownloadUI")).intValue() * paramLong2);
      }
      if (j != 0)
      {
        paramLong2 = this.sKe;
        this.sKe = (((Integer)sKh.get("SendImgProxyUI")).intValue() * paramLong2);
      }
      paramLong2 = this.sKb;
      long l1 = this.sKe;
      this.sKf = (paramLong1 / paramLong2 + paramLong1 / l1 * this.sKc);
      if (this.sKf < 0.0D)
        this.sKf = 0.0D;
      double d2 = this.sKf;
      ab.i("Traf.TrafficModel", "compute Traffic realTraffic:%d , standardTraffic:%d, predictionTraffic:%d, realInterval:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(this.sKb), Long.valueOf(this.sKe), Long.valueOf(paramLong3) });
      if (d2 > this.sKd)
      {
        bool = true;
        AppMethodBeat.o(114778);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(114778);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(114779);
    String str = "TrafficModel{standardTraffic=" + this.sKb + ", preciseRatio=" + this.sKc + ", threshold=" + this.sKd + '}';
    AppMethodBeat.o(114779);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.d
 * JD-Core Version:    0.6.2
 */