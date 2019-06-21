package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.al.b;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;
import java.util.Map;

final class g$1
  implements g.a
{
  g$1(g paramg)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(50695);
    ab.d("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { g.a(this.fVM), g.b(this.fVM), Integer.valueOf(paramInt), paramc, paramd });
    if (paramInt == -21005)
    {
      ab.d("MicroMsg.NetSceneUploadVideo", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { g.b(this.fVM) });
      AppMethodBeat.o(50695);
    }
    while (true)
    {
      return 0;
      if (paramInt != 0)
      {
        u.um(g.c(this.fVM));
        new com.tencent.mm.g.b.a.f(a.r(new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(g.d(this.fVM)), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(g.e(this.fVM)), Integer.valueOf(0), "" })).ajK();
        g.f(this.fVM).onSceneEnd(3, paramInt, "", this.fVM);
        AppMethodBeat.o(50695);
      }
      else
      {
        g.a(this.fVM, u.ut(g.c(this.fVM)));
        if ((g.g(this.fVM) == null) || (g.g(this.fVM).status == 105))
        {
          if (g.g(this.fVM) == null);
          for (int i = -1; ; i = g.g(this.fVM).status)
          {
            ab.i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", new Object[] { g.a(this.fVM), Integer.valueOf(i) });
            com.tencent.mm.al.f.afx().rN(g.b(this.fVM));
            g.f(this.fVM).onSceneEnd(3, paramInt, "info is null or has paused, status".concat(String.valueOf(i)), this.fVM);
            AppMethodBeat.o(50695);
            break;
          }
        }
        if (paramc != null)
        {
          if (g.g(this.fVM).fVG > paramc.field_finishedLength)
          {
            ab.w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", new Object[] { g.a(this.fVM), Integer.valueOf(g.g(this.fVM).fVG), Integer.valueOf(paramc.field_finishedLength) });
            AppMethodBeat.o(50695);
          }
          else
          {
            g.g(this.fVM).fXb = bo.anT();
            g.g(this.fVM).fVG = paramc.field_finishedLength;
            g.g(this.fVM).bJt = 1032;
            u.f(g.g(this.fVM));
            AppMethodBeat.o(50695);
          }
        }
        else
        {
          if (paramd != null)
          {
            if (paramd.field_retCode == 0)
              break;
            ab.e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", new Object[] { g.a(this.fVM), Integer.valueOf(paramd.field_retCode), paramd.field_arg, paramd.field_transInfo });
            u.um(g.c(this.fVM));
            paramString = a.r(new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(1), Long.valueOf(g.d(this.fVM)), Long.valueOf(bo.anU()), Integer.valueOf(com.tencent.mm.al.c.bW(ah.getContext())), Integer.valueOf(g.e(this.fVM)), Integer.valueOf(paramd.field_fileLength), paramd.field_transInfo, "", "", "", "", "", "", "", paramd.efY });
            new com.tencent.mm.g.b.a.f(paramString).ajK();
            new com.tencent.mm.g.b.a.d(paramString).ajK();
            g.f(this.fVM).onSceneEnd(3, paramd.field_retCode, "", this.fVM);
          }
          AppMethodBeat.o(50695);
        }
      }
    }
    ab.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn uploadvideo by cdn, videohash isHitCacheUpload: %d, enableHitcheck:%b", new Object[] { g.a(this.fVM), Integer.valueOf(paramd.field_UploadHitCacheType), Boolean.valueOf(g.h(this.fVM)) });
    paramString = com.tencent.mm.plugin.report.service.h.pYm;
    if (g.i(this.fVM))
    {
      paramInt = 810;
      label846: paramString.e(12696, new Object[] { Integer.valueOf(paramInt + paramd.field_UploadHitCacheType), Integer.valueOf(g.g(this.fVM).frO) });
      boolean bool = paramd.field_isVideoReduced;
      ab.i("MicroMsg.NetSceneUploadVideo", "%s it video was reduced by cdn %b %s", new Object[] { g.a(this.fVM), Boolean.valueOf(bool), g.c(this.fVM) });
      if (bool)
        break label1606;
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, 205L, 1L, false);
      if ((g.k(this.fVM) > 0) && (paramd.field_thumbimgLength > 0))
      {
        ab.i("MicroMsg.NetSceneUploadVideo", "%s send video thumb too big thumb length [%d, %d] ", new Object[] { g.a(this.fVM), Integer.valueOf(g.k(this.fVM)), Integer.valueOf(paramd.field_thumbimgLength) });
        if (g.k(this.fVM) * 2 <= paramd.field_thumbimgLength)
          break label1572;
        com.tencent.mm.plugin.report.service.h.pYm.a(106L, 206L, 1L, false);
      }
      label1046: o.all();
      paramInt = (int)e.asZ(t.uh(g.c(this.fVM)));
      ab.i("MicroMsg.NetSceneUploadVideo", "%s send video too big thumb length [%d, %d] ", new Object[] { g.a(this.fVM), Integer.valueOf(g.g(this.fVM).frO), Integer.valueOf(paramInt) });
      if (g.g(this.fVM).frO == paramInt)
        break label1589;
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, 208L, 1L, false);
      label1138: g.a(this.fVM, u.ut(g.c(this.fVM)));
      if (bo.isNullOrNil(g.g(this.fVM).alw()))
      {
        paramString = "<msg><videomsg aeskey=\"" + paramd.field_aesKey + "\" cdnthumbaeskey=\"" + paramd.field_aesKey + "\" cdnvideourl=\"" + paramd.field_fileId + "\" ";
        paramString = paramString + "cdnthumburl=\"" + paramd.field_fileId + "\" ";
        paramString = paramString + "length=\"" + paramd.field_fileLength + "\" ";
        paramString = paramString + "cdnthumblength=\"" + paramd.field_thumbimgLength + "\"/></msg>";
        ab.i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", new Object[] { g.a(this.fVM), paramString });
        g.g(this.fVM).fXj = paramString;
        u.f(g.g(this.fVM));
      }
      paramc = br.z(g.g(this.fVM).alw(), "msg");
      if (paramc != null)
      {
        paramString = o.all();
        o.all();
        paramBoolean = paramString.s(t.uh(g.c(this.fVM)), (String)paramc.get(".msg.videomsg.$cdnvideourl"), (String)paramc.get(".msg.videomsg.$aeskey"));
        paramString = com.tencent.mm.plugin.report.service.h.pYm;
        if (!paramBoolean)
          break label1623;
        paramInt = 1;
        label1461: paramString.e(12696, new Object[] { Integer.valueOf(paramInt + 900), Integer.valueOf(g.g(this.fVM).frO) });
      }
      paramString = com.tencent.mm.kernel.g.Rg();
      paramc = g.c(this.fVM);
      if (!bool)
        break label1628;
    }
    label1572: label1589: label1606: label1623: label1628: for (paramInt = 0; ; paramInt = g.l(this.fVM))
    {
      paramString.a(new h(paramc, paramInt, paramd, new g.1.1(this, paramd)), 0);
      break;
      if (g.j(this.fVM))
      {
        paramInt = 820;
        break label846;
      }
      paramInt = 830;
      break label846;
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, 207L, 1L, false);
      break label1046;
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, 209L, 1L, false);
      break label1138;
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, 200L, 1L, false);
      break label1138;
      paramInt = 2;
      break label1461;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.g.1
 * JD-Core Version:    0.6.2
 */