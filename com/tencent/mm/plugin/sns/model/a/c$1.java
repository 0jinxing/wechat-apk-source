package com.tencent.mm.plugin.sns.model.a;

import android.util.SparseArray;
import com.tencent.mars.cdn.CdnLogic.BatchSnsReqImageData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.f;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;

final class c$1
  implements g.a
{
  c$1(c paramc, com.tencent.mm.i.e parame, long paramLong)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(36746);
    if (this.qOx.qOa == null)
    {
      ab.e("MicroMsg.SnsCdnDownloadBase", "pack is null.");
      AppMethodBeat.o(36746);
      return 0;
    }
    int i;
    int j;
    int k;
    bau localbau;
    if (paramd != null)
      if (paramd.field_retCode != 0)
      {
        ab.e("MicroMsg.SnsCdnDownloadBase", "download err, retCode: %d reqDownType: %d.", new Object[] { Integer.valueOf(paramd.field_retCode), Integer.valueOf(this.qOx.qOa.qNV) });
        com.tencent.mm.network.b.reportFailIp(paramd.field_serverIP);
        if (9 != this.qOx.qOa.qNV)
          break label1012;
        paramString = paramd.egb;
        if ((paramString != null) && (paramString.length > 0))
        {
          h.pYm.k(1040L, 12L, 1L);
          paramc = (f)this.qOv;
          ab.e("MicroMsg.SnsCdnDownloadBase", "download err, taskInfo2 need inc counter, before: %d, inc: %d, count: %d.", new Object[] { Integer.valueOf(paramc.counter), Integer.valueOf(paramString.length), Integer.valueOf(paramc.egj) });
          paramc.counter += paramString.length;
          i = paramString.length;
          for (j = 0; j < i; j++)
          {
            paramc = paramString[j];
            if (paramc.retry)
            {
              k = paramc.picIndex;
              localbau = (bau)this.qOx.qOa.qFU.get(k);
              paramc = (com.tencent.mm.plugin.sns.data.e)this.qOx.qOa.qFK.get(k);
              af.cnA().a(localbau, 1, paramc, this.qOx.qOa.qNW);
              ab.i("MicroMsg.SnsCdnDownloadBase", "group download err, retry single download. index: %d.", new Object[] { Integer.valueOf(k) });
            }
          }
          j = 2;
        }
      }
    while (true)
    {
      this.qOx.b(paramd);
      af.bCo().post(new c.1.1(this, j, paramd));
      while (true)
      {
        if (paramInt == 0)
          break label1004;
        ab.e("MicroMsg.SnsCdnDownloadBase", "task build error! startRet: %d, type: %d.", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.qOx.qOa.qNV) });
        if (9 != this.qOx.qOa.qNV)
          break label1004;
        h.pYm.k(1040L, 13L, 1L);
        c.cow().remove(this.qOx.qOa.qJg);
        this.qOx.qNY.a(2, null, this.qOx.qOa.qNV, this.qOx.qOa.qNT, this.qOx.qOa.qJg, -1, -1, true);
        paramd = ((f)this.qOv).egb;
        j = paramd.length;
        for (paramInt = 0; paramInt < j; paramInt++)
        {
          i = paramd[paramInt].picIndex;
          paramString = (bau)this.qOx.qOa.qFU.get(i);
          paramc = (com.tencent.mm.plugin.sns.data.e)this.qOx.qOa.qFK.get(i);
          af.cnA().a(paramString, 1, paramc, this.qOx.qOa.qNW);
          ab.i("MicroMsg.SnsCdnDownloadBase", "group download err, retry single download. index: %d.", new Object[] { Integer.valueOf(i) });
        }
        h.pYm.k(1040L, 14L, 1L);
        ab.e("MicroMsg.SnsCdnDownloadBase", "download error, totally re-download by single.");
        paramString = (f)this.qOv;
        paramString.counter = paramString.egj;
        paramc = paramString.egb;
        i = paramc.length;
        for (j = 0; j < i; j++)
        {
          k = paramc[j].picIndex;
          localbau = (bau)this.qOx.qOa.qFU.get(k);
          paramString = (com.tencent.mm.plugin.sns.data.e)this.qOx.qOa.qFK.get(k);
          af.cnA().a(localbau, 1, paramString, this.qOx.qOa.qNW);
          ab.i("MicroMsg.SnsCdnDownloadBase", "group download err, retry single download. index: %d.", new Object[] { Integer.valueOf(k) });
        }
        j = 2;
        break;
        ab.d("MicroMsg.SnsCdnDownloadBase", "download succ, type: %d.", new Object[] { Integer.valueOf(this.qOx.qOa.qNV) });
        this.qOx.qOt = paramd.field_fileLength;
        if (9 == this.qOx.qOa.qNV)
        {
          paramString = (f)this.qOv;
          paramString.counter += 1;
          ab.d("MicroMsg.SnsCdnDownloadBase", "download succ, counter++, res: %d, count: %d.", new Object[] { Integer.valueOf(paramString.counter), Integer.valueOf(paramString.egj) });
        }
        for (paramBoolean = this.qOx.Dj(paramd.index); ; paramBoolean = this.qOx.cor())
        {
          if (paramBoolean)
            break label879;
          j = 2;
          break;
        }
        label879: if (this.qOx.qOa.qNT)
        {
          j = 3;
          break;
        }
        j = 1;
        break;
        if (paramc != null)
        {
          float f = paramc.field_finishedLength / paramc.field_toltalLength;
          if (this.qOx.qOa.qNX < f)
          {
            this.qOx.qOa.qNX = f;
            ab.d("MicroMsg.SnsCdnDownloadBase", "Download sns image type: %d, mediaId: %s, progress: %f, url: %s", new Object[] { Integer.valueOf(this.qOx.qOa.qNV), paramString, Float.valueOf(f), this.qOx.qOa.url });
          }
        }
      }
      label1004: AppMethodBeat.o(36746);
      break;
      label1012: j = 2;
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.c.1
 * JD-Core Version:    0.6.2
 */