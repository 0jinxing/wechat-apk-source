package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.b.a.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;

final class j$1
  implements g.a
{
  j$1(j paramj, long paramLong1, String paramString1, long paramLong2, int paramInt1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(27312);
    if (paramInt != 0)
    {
      ab.e("MicroMsg.AppMessageExtension", "getThumbByCdn start failed: msgid:%d startRet:%d thumbUrl:%s", new Object[] { Long.valueOf(this.fEC), Integer.valueOf(paramInt), this.fEJ });
      new f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(this.fEG), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_THUMBIMAGE), Integer.valueOf(this.fEK), "" })).ajK();
      AppMethodBeat.o(27312);
    }
    while (true)
    {
      return paramInt;
      if (paramd != null)
        break;
      paramInt = 0;
      AppMethodBeat.o(27312);
    }
    label213: long l1;
    long l2;
    int i;
    int j;
    int k;
    if (paramd.field_retCode != 0)
    {
      ab.e("MicroMsg.AppMessageExtension", "getThumbByCdn failed: msgid:%d sceneResult.field_retCode:%d thumbUrl:%s", new Object[] { Long.valueOf(this.fEC), Integer.valueOf(paramd.field_retCode), this.fEJ });
      if (paramd != null)
        break label904;
      paramInt = -1;
      l1 = this.fEG;
      l2 = bo.anU();
      i = com.tencent.mm.al.c.bW(ah.getContext());
      j = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
      k = this.fEK;
      if (paramd != null)
        break label913;
      paramString = "";
      label251: if (paramd != null)
        break label922;
      paramc = "";
      label259: new f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramString, "", "", "", "", "", "", "", paramc })).ajK();
      if ((paramd != null) && (paramd.field_retCode != 0))
      {
        if (paramd != null)
          break label931;
        paramInt = -1;
        label405: l2 = this.fEG;
        l1 = bo.anU();
        k = com.tencent.mm.al.c.bW(ah.getContext());
        j = com.tencent.mm.i.a.MediaType_THUMBIMAGE;
        i = this.fEK;
        if (paramd != null)
          break label940;
        paramString = "";
        label443: if (paramd != null)
          break label949;
      }
    }
    label896: label904: label913: label922: label931: label940: label949: for (paramc = ""; ; paramc = paramd.efY)
    {
      new com.tencent.mm.g.b.a.d(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2), Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i), paramString, "", "", "", "", "", "", "", paramc })).ajK();
      o.ahl().doNotify();
      paramInt = 0;
      AppMethodBeat.o(27312);
      break;
      aw.ZK();
      paramc = com.tencent.mm.model.c.XO().Q(this.ewn, this.fEC);
      if (paramc.field_msgSvrId != this.fEC)
      {
        ab.e("MicroMsg.AppMessageExtension", "hy: appmsg %d has been deleted", new Object[] { Long.valueOf(this.fEC) });
        paramInt = 0;
        AppMethodBeat.o(27312);
        break;
      }
      ab.i("MicroMsg.AppMessageExtension", "hy: %d current msg type is %d", new Object[] { Long.valueOf(this.fEC), Integer.valueOf(paramc.getType()) });
      paramString = e.e(this.fEH, 0, -1);
      if ((this.vcd == 33) || (this.vcd == 36) || (this.vcd == 46) || (this.vcd == 44))
      {
        paramString = o.ahl().a(paramString, Bitmap.CompressFormat.JPEG);
        label747: if (!bo.isNullOrNil(paramString))
        {
          paramc.jv(paramString);
          aw.ZK();
          com.tencent.mm.model.c.XO().b(paramc.field_msgSvrId, paramc);
        }
        ab.i("MicroMsg.AppMessageExtension", "getThumbByCdn finished msgid:%d talker:%s thumbUrl:%s path:%s", new Object[] { Long.valueOf(this.fEC), this.ewn, this.fEJ, paramString });
        com.tencent.mm.plugin.report.service.h.pYm.a(198L, 16L, this.fEK, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(198L, 17L, 1L, false);
        paramString = com.tencent.mm.plugin.report.service.h.pYm;
        if (!t.kH(this.ewn))
          break label896;
      }
      for (l2 = 19L; ; l2 = 18L)
      {
        paramString.a(198L, l2, 1L, false);
        break;
        paramString = j.a(paramString, this.vce, paramc.dty());
        break label747;
      }
      paramInt = paramd.field_retCode;
      break label213;
      paramString = paramd.field_transInfo;
      break label251;
      paramc = paramd.efY;
      break label259;
      paramInt = paramd.field_retCode;
      break label405;
      paramString = paramd.field_transInfo;
      break label443;
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.j.1
 * JD-Core Version:    0.6.2
 */