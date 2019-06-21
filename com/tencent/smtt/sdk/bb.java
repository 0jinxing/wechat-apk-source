package com.tencent.smtt.sdk;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.a.d;

class bb
  implements TbsReaderView.ReaderCallback
{
  bb(TbsReaderView paramTbsReaderView)
  {
  }

  public void onCallBackAction(Integer paramInteger, Object paramObject1, Object paramObject2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    int i = 0;
    AppMethodBeat.i(64553);
    switch (paramInteger.intValue())
    {
    default:
    case 5008:
      while (true)
      {
        if ((this.a.d != null) && (i == 0))
          this.a.d.onCallBackAction(paramInteger, paramObject1, paramObject2);
        AppMethodBeat.o(64553);
        return;
        if (d.c(this.a.a))
          break;
        paramInteger = Integer.valueOf(5011);
        localObject4 = TbsReaderView.getResString(this.a.a, 5023);
        paramObject1 = new Bundle();
        paramObject1.putString("tip", (String)localObject4);
        paramObject1.putString("statistics", "AHNG812");
        paramObject1.putInt("channel_id", 10834);
        this.a.userStatistics("AHNG811");
      }
      localObject1 = "";
      if (paramObject1 != null)
      {
        localObject4 = (Bundle)paramObject1;
        localObject1 = ((Bundle)localObject4).getString("docpath");
      }
      QbSdk.startQBForDoc(this.a.a, (String)localObject1, 4, 0, "pdf", (Bundle)localObject4);
      this.a.userStatistics("AHNG813");
    case 5009:
    case 5010:
    case 5026:
    case 5030:
    }
    while (true)
    {
      i = 1;
      break;
      if (!d.c(this.a.a))
      {
        paramInteger = Integer.valueOf(5011);
        localObject4 = TbsReaderView.getResString(this.a.a, 5021);
        paramObject1 = new Bundle();
        paramObject1.putString("tip", (String)localObject4);
        paramObject1.putString("statistics", "AHNG808");
        paramObject1.putInt("channel_id", 10833);
        this.a.userStatistics("AHNG807");
        break;
      }
      localObject4 = "";
      if (paramObject1 != null)
      {
        localObject1 = (Bundle)paramObject1;
        localObject4 = ((Bundle)localObject1).getString("docpath");
      }
      QbSdk.startQBForDoc(this.a.a, (String)localObject4, 4, 0, "", (Bundle)localObject1);
      this.a.userStatistics("AHNG809");
      continue;
      if (!d.c(this.a.a))
      {
        paramInteger = Integer.valueOf(5011);
        localObject4 = TbsReaderView.getResString(this.a.a, 5022);
        paramObject1 = new Bundle();
        paramObject1.putString("tip", (String)localObject4);
        paramObject1.putString("statistics", "AHNG816");
        paramObject1.putInt("channel_id", 10835);
        this.a.userStatistics("AHNG815");
        break;
      }
      localObject1 = "";
      localObject4 = localObject2;
      if (paramObject1 != null)
      {
        localObject4 = (Bundle)paramObject1;
        localObject1 = ((Bundle)localObject4).getString("docpath");
      }
      QbSdk.startQBForDoc(this.a.a, (String)localObject1, 4, 0, "txt", (Bundle)localObject4);
      continue;
      if (!d.c(this.a.a))
      {
        paramInteger = Integer.valueOf(5011);
        localObject4 = TbsReaderView.getResString(this.a.a, 5029);
        paramObject1 = new Bundle();
        paramObject1.putString("tip", (String)localObject4);
        paramObject1.putString("statistics", "AHNG828");
        paramObject1.putInt("channel_id", 10965);
        this.a.userStatistics("AHNG827");
        break;
      }
      localObject4 = "";
      localObject1 = localObject3;
      if (paramObject1 != null)
      {
        localObject1 = (Bundle)paramObject1;
        localObject4 = ((Bundle)localObject1).getString("docpath");
      }
      QbSdk.startQBForDoc(this.a.a, (String)localObject4, 4, 0, "doc", (Bundle)localObject1);
      this.a.userStatistics("AHNG829");
      continue;
      if (paramObject1 != null)
      {
        localObject4 = (Bundle)paramObject1;
        TbsReaderView.gReaderPackName = ((Bundle)localObject4).getString("name");
        TbsReaderView.gReaderPackVersion = ((Bundle)localObject4).getString("version");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bb
 * JD-Core Version:    0.6.2
 */