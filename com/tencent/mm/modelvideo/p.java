package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.m.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bh;
import java.util.Arrays;

public final class p
  implements w
{
  private VideoTransPara fWR = null;
  private VideoTransPara fWS = null;
  private String fWT;
  private String fWU;
  Boolean fWV = Boolean.FALSE;

  public final void tZ(String paramString)
  {
    AppMethodBeat.i(50779);
    o.all();
    this.fWT = t.uh(paramString);
    Object localObject1 = new StringBuilder();
    o.all();
    this.fWU = (t.uh(paramString) + ".tmp");
    ab.i("MicroMsg.TransferVideoMsgSendCallback", "srcPath： %s", new Object[] { this.fWT });
    ab.i("MicroMsg.TransferVideoMsgSendCallback", "dstPath：%s", new Object[] { this.fWU });
    this.fWV = Boolean.valueOf(com.tencent.mm.bj.e.uD(this.fWT));
    long l;
    if ((com.tencent.mm.vfs.e.ct(this.fWT)) && (this.fWV.booleanValue()))
    {
      ab.i("MicroMsg.TransferVideoMsgSendCallback", "before video send, is h265");
      l = bo.yz();
      if (!com.tencent.mm.vfs.e.ct(this.fWT))
      {
        ab.e("MicroMsg.TransferVideoMsgSendCallback", "before video send, is h265 file not exist!");
        AppMethodBeat.o(50779);
      }
    }
    while (true)
    {
      return;
      h.pYm.a(354L, 249L, 1L, false);
      this.fWS = com.tencent.mm.bj.e.uE(this.fWT);
      this.fWR = com.tencent.mm.bj.e.a(this.fWS, this.fWT);
      if ((this.fWS != null) && (this.fWR != null))
      {
        if (com.tencent.mm.bj.e.a(this.fWT, this.fWU, this.fWR) < 0)
          h.pYm.a(354L, 250L, 1L, false);
        FileOp.aQ(this.fWU, this.fWT);
        FileOp.deleteFile(this.fWU);
        paramString = u.ut(paramString);
        if (paramString != null)
        {
          paramString.videoFormat = 1;
          paramString.bJt = 2;
          o.all().c(paramString);
        }
        ab.i("MicroMsg.TransferVideoMsgSendCallback", "transfer to h264 finish, used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      }
      AppMethodBeat.o(50779);
      continue;
      ab.i("MicroMsg.TransferVideoMsgSendCallback", "video format is h264，do not need to tranfer");
      localObject1 = u.ut(paramString);
      if ((localObject1 != null) && (!bo.isNullOrNil(((s)localObject1).alv())) && (com.tencent.mm.vfs.e.ct(((s)localObject1).alv())))
      {
        Object localObject2 = ((s)localObject1).fXn;
        if ((localObject2 == null) || (!((baa)localObject2).wDP))
        {
          localObject2 = ((s)localObject1).alv();
          o.all();
          String str = t.uh(paramString);
          this.fWS = com.tencent.mm.bj.e.uE((String)localObject2);
          this.fWR = com.tencent.mm.bj.e.a(this.fWS, (String)localObject2);
          if ((!com.tencent.mm.vfs.e.ct(str)) && (this.fWS != null) && (this.fWR != null))
          {
            paramString = new int[2];
            j.c((String)localObject2, paramString);
            l = bo.yz();
            this.fWV = Boolean.valueOf(com.tencent.mm.bj.e.uD((String)localObject2));
            ab.i("MicroMsg.TransferVideoMsgSendCallback", "before video send, local remux file path not exist, do remux here, outsize: %s, localDstFilePath: %s, importPath: %s, isH265: %s", new Object[] { Arrays.toString(paramString), str, localObject2, this.fWV });
            int i;
            if (this.fWV.booleanValue())
            {
              i = com.tencent.mm.bj.e.a((String)localObject2, str, this.fWR);
              ab.i("MicroMsg.TransferVideoMsgSendCallback", "transfer to h264 finish, used %sms %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(i) });
            }
            while (true)
            {
              if (this.fWS.duration > 0)
              {
                ((s)localObject1).fXd = this.fWS.duration;
                o.all().c((s)localObject1);
              }
              AppMethodBeat.o(50779);
              break;
              i = SightVideoJNI.remuxing((String)localObject2, str, paramString[0], paramString[1], this.fWR.videoBitrate, this.fWR.fzV, 8, this.fWR.fzU, 25.0F, this.fWR.fps, null, 0, b.qwX);
              ab.i("MicroMsg.TransferVideoMsgSendCallback", "remux finish: %s, used %sms", new Object[] { Integer.valueOf(i), Long.valueOf(bo.az(l)) });
              ((a)g.K(a.class)).XT().P((String)localObject2, str, i);
            }
          }
          ab.i("MicroMsg.TransferVideoMsgSendCallback", "before video send, is a local capture video, do nothing");
        }
      }
      AppMethodBeat.o(50779);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.p
 * JD-Core Version:    0.6.2
 */