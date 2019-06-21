package com.tencent.mm.modelstat;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

final class e$c$1
  implements Runnable
{
  e$c$1(e.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78723);
    ab.i("MicroMsg.IndoorReporter", "start wifi");
    while (true)
    {
      try
      {
        if (!this.fSO.fSM)
          break label433;
        long l = bo.anU();
        List localList = this.fSO.bJj.getScanResults();
        Object localObject1 = "";
        if ((localList == null) || (localList.size() <= 0))
          break label444;
        localObject2 = new com/tencent/mm/modelstat/e$c$1$1;
        ((e.c.1.1)localObject2).<init>(this);
        Collections.sort(localList, (Comparator)localObject2);
        int i = 0;
        j = 0;
        k = j;
        localObject2 = localObject1;
        if (i < localList.size())
        {
          ScanResult localScanResult = (ScanResult)localList.get(i);
          if ((localScanResult == null) || (bo.isNullOrNil(localScanResult.BSSID)) || (bo.isNullOrNil(localScanResult.SSID)))
            break label441;
          localObject2 = localScanResult.SSID.replace(";", "").replace(" ", "").replace(",", "").replace("#", "");
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject2 = (String)localObject1 + (String)localObject2 + ";" + localScanResult.BSSID + ";" + localScanResult.level + ";";
          j++;
          if (j < this.fSO.fSk)
          {
            localObject1 = localObject2;
            i++;
            continue;
          }
          k = j;
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append(l - this.fSO.startTime).append(";");
        if (localList != null)
        {
          j = localList.size();
          localObject1 = j + ";" + k + ";" + (String)localObject2;
          ab.i("MicroMsg.IndoorReporter", "%d %s", new Object[] { Integer.valueOf(((String)localObject1).length()), localObject1 });
          this.fSO.fSN.add(localObject1);
          this.fSO.bJj.startScan();
          Thread.sleep(this.fSO.fSL);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IndoorReporter", "Except:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(78723);
        return;
      }
      int j = 0;
      continue;
      label433: AppMethodBeat.o(78723);
      continue;
      label441: continue;
      label444: int k = 0;
      Object localObject2 = localException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e.c.1
 * JD-Core Version:    0.6.2
 */