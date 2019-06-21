package com.tencent.mm.modelstat;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.r;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.aio;
import com.tencent.mm.sdk.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$4$1
  implements Runnable
{
  c$4$1(c.4 param4, aio paramaio)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78661);
    this.fRO.fRL.aK("LAST_UPDATE_CONFIG", bo.anT());
    Object localObject1;
    Object localObject3;
    if ((this.fRN.woA == null) || (this.fRN.woA.wR.length <= 0) || (this.fRN.woy == null) || (this.fRN.woy.wR.length <= 0))
      if (this.fRN.woA == null)
      {
        localObject1 = null;
        if (this.fRN.woy != null)
          break label136;
        localObject3 = null;
        label93: ab.e("MicroMsg.ClickFlowStatReceiver", "OnSceneEnd NetSceneUpdateEventConfig failed, eventsampleconf:%s, versionbuffer:%s", new Object[] { localObject1, localObject3 });
        AppMethodBeat.o(78661);
      }
    while (true)
    {
      return;
      localObject1 = Integer.valueOf(this.fRN.woA.wR.length);
      break;
      label136: localObject3 = Integer.valueOf(this.fRN.woy.wR.length);
      break label93;
      com.tencent.mm.plugin.report.e.pXa.a(346L, 3L, 1L, false);
      localObject3 = bo.cd(this.fRN.woy.wR);
      String str = this.fRO.fRL.getValue("versionBuffer");
      this.fRO.fRL.hV("versionBuffer", (String)localObject3);
      Object localObject4 = this.fRN.woA;
      Object localObject2;
      try
      {
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>(r.B(((b)localObject4).wR), "UTF-8");
        if (TextUtils.isEmpty((CharSequence)localObject1))
        {
          com.tencent.mm.plugin.report.e.pXa.a(346L, 2L, 1L, false);
          AppMethodBeat.o(78661);
        }
      }
      catch (Exception localException1)
      {
        if (localObject4 == null);
        for (int i = 0; ; i = ((b)localObject4).wR.length)
        {
          ab.e("MicroMsg.ClickFlowStatReceiver", "decompress failed, configString length %d, msg:%s  [%s]", new Object[] { Integer.valueOf(i), localException1.getMessage(), bo.l(localException1) });
          localObject2 = null;
          break;
        }
      }
      try
      {
        localObject4 = c.a.tH((String)localObject2);
        com.tencent.mm.a.e.b(this.fRO.fRM, ((String)localObject2).getBytes(), ((String)localObject2).getBytes().length);
        c.a(this.fRO.fRJ, (c.a)localObject4);
        bool = true;
        if (!((String)localObject3).equals(str))
        {
          ab.i("MicroMsg.ClickFlowStatReceiver", "idKeyStat, configOK:%b", new Object[] { Boolean.valueOf(bool) });
          localObject2 = com.tencent.mm.plugin.report.e.pXa;
          if (bool)
          {
            l = 0L;
            ((com.tencent.mm.plugin.report.e)localObject2).a(346L, l, 1L, false);
          }
        }
        else
        {
          AppMethodBeat.o(78661);
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.ClickFlowStatReceiver", "readReportConfig failed :%s  [%s]", new Object[] { localException2.getMessage(), bo.l(localException2) });
          boolean bool = false;
          continue;
          long l = 1L;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c.4.1
 * JD-Core Version:    0.6.2
 */