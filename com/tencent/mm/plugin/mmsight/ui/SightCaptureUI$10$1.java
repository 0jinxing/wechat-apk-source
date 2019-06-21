package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.j;
import com.tencent.mm.plugin.mmsight.model.k;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import org.json.JSONObject;

final class SightCaptureUI$10$1
  implements Runnable
{
  SightCaptureUI$10$1(SightCaptureUI.10 param10, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55194);
    String str = SightCaptureUI.p(this.oDi.oDf).getFilePath();
    baa localbaa = SightCaptureUI.K(this.oDi.oDf);
    try
    {
      if (!bo.isNullOrNil(str))
      {
        boolean bool = e.ct(str);
        if (bool)
          break label62;
      }
      while (true)
      {
        k.d(false, this.oDh);
        AppMethodBeat.o(55194);
        return;
        label62: h.pYm.a(440L, 87L, 1L, false);
        Object localObject1 = SightVideoJNI.getSimpleMp4Info(str);
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        i = (int)((JSONObject)localObject2).getDouble("videoFPS");
        j = ((JSONObject)localObject2).optInt("videoBitrate");
        ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, videoFPS: %s, videoBitrate: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        localObject1 = com.tencent.mm.plugin.mmsight.model.a.bPi();
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).otv = j.ouz.etz;
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).videoBitrate = j.ouz.videoBitrate;
        if (!j.ouz.ouL)
          break;
        k = 1;
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).etA = k;
        if (!j.ouz.ouM)
          break label581;
        k = 1;
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).otw = k;
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).fay = j.ouz.fay;
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).otx = i;
        ((com.tencent.mm.plugin.mmsight.model.a)localObject1).fileSize = e.asZ(str);
        localObject2 = com.tencent.mm.plugin.sight.base.d.WR(str);
        if (localObject2 != null)
        {
          ((com.tencent.mm.plugin.mmsight.model.a)localObject1).otA = ((com.tencent.mm.plugin.sight.base.a)localObject2).width;
          ((com.tencent.mm.plugin.mmsight.model.a)localObject1).otB = ((com.tencent.mm.plugin.sight.base.a)localObject2).height;
          ((com.tencent.mm.plugin.mmsight.model.a)localObject1).otC = ((com.tencent.mm.plugin.sight.base.a)localObject2).videoBitrate;
          ((com.tencent.mm.plugin.mmsight.model.a)localObject1).oty = ((com.tencent.mm.plugin.sight.base.a)localObject2).eWK;
        }
        if (j.ouz.etz != 1)
          break label587;
        h.pYm.a(440L, 89L, 1L, false);
        h.pYm.a(440L, 49L, i, false);
        m = 93;
        n = 73;
        k = 69;
        if (j.ouz.fay != 720)
          break label632;
        m++;
        i1 = n + 6;
        n = k + 6;
        k = i1;
        h.pYm.a(440L, k, i, false);
        h.pYm.a(440L, m, 1L, false);
        h.pYm.a(440L, 47L, i, false);
        ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", new Object[] { str, Integer.valueOf(n) });
        if ((i < 0) || (i > 10))
          break label665;
        h.pYm.a(440L, n, 1L, false);
        if (j > 0)
        {
          if (j.ouz.etz != 2)
            break label805;
          h.pYm.a(440L, 175L, j, false);
          h.pYm.a(440L, 176L, 1L, false);
          if (localbaa != null)
          {
            if (localbaa.wDR != 1)
              break label764;
            h.pYm.a(440L, 184L, j, false);
            h.pYm.a(440L, 185L, 1L, false);
          }
        }
      }
    }
    catch (Exception localException)
    {
      label665: label805: 
      while (true)
      {
        int i;
        int j;
        int i1;
        ab.e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", new Object[] { localException.getMessage() });
        continue;
        int k = 0;
        continue;
        label581: k = 0;
        continue;
        label587: h.pYm.a(440L, 88L, 1L, false);
        h.pYm.a(440L, 48L, i, false);
        int m = 90;
        int n = 54;
        k = 50;
        continue;
        label632: if (j.ouz.bPI())
        {
          m += 2;
          n += 12;
          i1 = k + 12;
          k = n;
          n = i1;
          continue;
          if ((i > 10) && (i <= 15))
          {
            h.pYm.a(440L, n + 1, 1L, false);
          }
          else if ((i > 15) && (i <= 20))
          {
            h.pYm.a(440L, n + 2, 1L, false);
          }
          else if ((i > 20) && (i <= 30))
          {
            h.pYm.a(440L, n + 3, 1L, false);
            continue;
            label764: if (localException.wDR == 2)
            {
              h.pYm.a(440L, 194L, j, false);
              h.pYm.a(440L, 195L, 1L, false);
              continue;
              h.pYm.a(440L, 179L, j, false);
              h.pYm.a(440L, 180L, 1L, false);
              if (localException != null)
                if (localException.wDR == 1)
                {
                  h.pYm.a(440L, 189L, j, false);
                  h.pYm.a(440L, 190L, 1L, false);
                }
                else if (localException.wDR == 2)
                {
                  h.pYm.a(440L, 199L, j, false);
                  h.pYm.a(440L, 200L, 1L, false);
                }
            }
          }
        }
        else
        {
          i1 = k;
          k = n;
          n = i1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.10.1
 * JD-Core Version:    0.6.2
 */