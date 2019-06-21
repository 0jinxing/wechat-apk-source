package com.tencent.liteav.network;

import android.os.Handler;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Vector;

class TXCStreamDownloader$2
  implements g.a
{
  TXCStreamDownloader$2(TXCStreamDownloader paramTXCStreamDownloader, String paramString, boolean paramBoolean)
  {
  }

  public void a(int paramInt, String paramString, Vector<e> paramVector)
  {
    AppMethodBeat.i(67533);
    int i;
    if ((paramInt == 0) && (paramVector != null) && (!paramVector.isEmpty()))
      if (TXCStreamDownloader.access$400(this.c))
        if (TXCStreamDownloader.access$500(this.c) != null)
        {
          Iterator localIterator = paramVector.iterator();
          i = 0;
          if (localIterator.hasNext())
          {
            paramString = (e)localIterator.next();
            if ((paramString == null) || (!paramString.b) || (paramString.a == null) || (paramString.a.length() <= 0))
              break label354;
            i++;
          }
        }
    label354: 
    while (true)
    {
      break;
      this.c.setStatusValue(7116, Long.valueOf(i));
      this.c.setStatusValue(7112, Long.valueOf(2L));
      TXCStreamDownloader.access$500(this.c).setOriginUrl(this.a);
      TXCStreamDownloader.access$500(this.c).startDownload(paramVector, true, true, this.b);
      if (TXCStreamDownloader.access$600(this.c) != null)
        TXCStreamDownloader.access$600(this.c).postDelayed(TXCStreamDownloader.access$700(this.c), 2000L);
      paramString = TXCStreamDownloader.access$800(this.c).b();
      TXCDRApi.txReportDAU(TXCStreamDownloader.access$900(this.c), a.ay, paramInt, paramString);
      AppMethodBeat.o(67533);
      while (true)
      {
        return;
        TXCDRApi.txReportDAU(TXCStreamDownloader.access$900(this.c), a.ay, -4, "livePlayer have been stopped");
        AppMethodBeat.o(67533);
        continue;
        this.c.onNotifyEvent(12030, null);
        TXCDRApi.txReportDAU(TXCStreamDownloader.access$900(this.c), a.ay, paramInt, paramString);
        TXCLog.e("TXCStreamDownloader", "getAccelerateStreamPlayUrl failed, play stream with raw url");
        if (TXCStreamDownloader.access$400(this.c))
        {
          TXCStreamDownloader.access$1000(this.c, this.a, this.b);
          if (TXCStreamDownloader.access$600(this.c) != null)
            TXCStreamDownloader.access$600(this.c).postDelayed(TXCStreamDownloader.access$700(this.c), 2000L);
        }
        AppMethodBeat.o(67533);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCStreamDownloader.2
 * JD-Core Version:    0.6.2
 */