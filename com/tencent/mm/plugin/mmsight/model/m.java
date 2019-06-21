package com.tencent.mm.plugin.mmsight.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvideo.w;
import com.tencent.mm.plugin.mmsight.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;

public final class m
  implements w
{
  public final void tZ(String paramString)
  {
    AppMethodBeat.i(76542);
    final s locals = o.all().uf(paramString);
    if (locals == null)
      AppMethodBeat.o(76542);
    while (true)
    {
      return;
      o.all();
      final String str = t.uh(paramString);
      baa localbaa = locals.fXn;
      VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.afF().afG();
      if (localbaa != null)
      {
        ab.i("MicroMsg.MMSightVideoMsgSendCallback", "beforeVideoSend count %d filename %s filePath %s", new Object[] { Integer.valueOf(localbaa.wDQ), paramString, str });
        if (localbaa.wDQ > 1)
        {
          u.um(paramString);
          AppMethodBeat.o(76542);
        }
      }
      else
      {
        boolean bool1 = l.a(str, localVideoTransPara, localbaa, new d()
        {
          public final boolean bOc()
          {
            AppMethodBeat.i(76540);
            ab.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile1 %s", new Object[] { str });
            int i = t.uj(str);
            locals.frO = i;
            locals.bJt = 32;
            o.all().c(locals);
            AppMethodBeat.o(76540);
            return true;
          }
        });
        if (localbaa != null)
        {
          ab.i("MicroMsg.MMSightVideoMsgSendCallback", "filename: %s need ret: %s", new Object[] { paramString, Boolean.valueOf(bool1) });
          if (bool1)
            break label290;
        }
        label290: for (boolean bool2 = true; ; bool2 = false)
        {
          localbaa.wDT = bool2;
          locals.fXn = localbaa;
          locals.bJt = 536870912;
          o.all().c(locals);
          if (!bool1)
            break label327;
          if (localbaa != null)
          {
            localbaa.wDQ += 1;
            locals.fXn = localbaa;
          }
          locals.bJt = 536870912;
          o.all().c(locals);
          c.yK(locals.fXe);
          if (l.b(str, localVideoTransPara, localbaa, new d()
          {
            public final boolean bOc()
            {
              AppMethodBeat.i(76541);
              c.yL(locals.fXe);
              ab.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile2 %s", new Object[] { str });
              int i = t.uj(str);
              locals.frO = i;
              locals.bJt = 32;
              o.all().c(locals);
              AppMethodBeat.o(76541);
              return true;
            }
          }) >= 0)
            break label296;
          ab.i("MicroMsg.MMSightRecorderIDKeyStat", "mark720CapturePostCompressFailed");
          h.pYm.a(440L, 45L, 1L, false);
          u.um(paramString);
          AppMethodBeat.o(76542);
          break;
        }
        label296: if (localbaa != null)
        {
          localbaa.wDT = true;
          locals.fXn = localbaa;
          locals.bJt = 536870912;
          o.all().c(locals);
        }
        label327: AppMethodBeat.o(76542);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.m
 * JD-Core Version:    0.6.2
 */