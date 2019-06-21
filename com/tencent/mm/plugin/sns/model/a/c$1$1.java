package com.tencent.mm.plugin.sns.model.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, int paramInt, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36745);
    label228: Object localObject1;
    Object localObject2;
    long l;
    if (9 == this.qOy.qOx.qOa.qNV)
    {
      if (((f)this.qOy.qOv).Jo())
        c.cow().remove(this.qOy.qOx.qOa.qJg);
      ab.i("MicroMsg.SnsCdnDownloadBase", "download done result: %d, url:%s, mediaID:%s, totalSize: %d, runningTasksSize: %d", new Object[] { Integer.valueOf(this.fLS), this.qOy.qOx.qOa.url, this.qOy.qOx.qOa.cHr, Integer.valueOf(this.fyV.field_fileLength), Integer.valueOf(c.cow().size()) });
      if ((!this.qOy.qOx.qOa.qNT) || (this.fLS == 2))
        break label523;
      if (9 != this.qOy.qOx.qOa.qNV)
        break label494;
      av.Yj(((bau)this.qOy.qOx.qOa.qFU.get(this.fyV.index)).Id);
      this.qOy.qOx.Dk(this.fyV.index);
      if (9 != this.qOy.qOx.qOa.qNV)
        break label641;
      localObject1 = (bau)this.qOy.qOx.qOa.qFU.get(this.fyV.index);
      localObject2 = (f)this.qOy.qOv;
      if ((((f)localObject2).Jo()) && (!((f)localObject2).egk))
      {
        ((f)localObject2).egk = true;
        l = bo.gb(this.qOy.qOw);
        ab.d("MicroMsg.SnsCdnDownloadBase", "group download, feed cost: %d.", new Object[] { Long.valueOf(l) });
        h.pYm.k(1040L, 3L, l);
        h.pYm.k(1040L, 4L, 1L);
        h.pYm.k(1040L, 9L, l);
        h.pYm.k(1040L, 10L, ((f)localObject2).egj);
      }
      this.qOy.qOx.qNY.a(this.fLS, (bau)localObject1, this.qOy.qOx.qOa.qNV, this.qOy.qOx.qOa.qNT, this.qOy.qOx.qOa.qJg, this.fyV.field_fileLength, this.fyV.index, ((f)localObject2).Jo());
      AppMethodBeat.o(36745);
    }
    while (true)
    {
      return;
      c.cow().remove(this.qOy.qOx.qOa.qJg);
      break;
      label494: av.Yj(this.qOy.qOx.qOa.cHr);
      this.qOy.qOx.cov();
      break label228;
      label523: if ((this.qOy.qOx.qOa.qNT) || ((this.qOy.qOx.qOa.qNV != 4) && (this.qOy.qOx.qOa.qNV != 6)))
        break label228;
      localObject2 = this.qOy.qOx.qOa.getPath() + i.j(this.qOy.qOx.cNr);
      af.cnC().fX(this.qOy.qOx.qOa.cHr, (String)localObject2);
      break label228;
      label641: if (1 == this.qOy.qOx.qOa.qNV)
      {
        localObject1 = af.cnA();
        localObject2 = this.qOy.qOx.qOa.cHr;
        if (((b)localObject1).qHO.remove(localObject2))
        {
          l = bo.gb(this.qOy.qOw);
          ab.d("MicroMsg.SnsCdnDownloadBase", "single download cost: %d.", new Object[] { Long.valueOf(l) });
          h.pYm.k(1040L, 6L, l);
          h.pYm.k(1040L, 7L, 1L);
        }
      }
      this.qOy.qOx.qNY.a(this.fLS, this.qOy.qOx.cNr, this.qOy.qOx.qOa.qNV, this.qOy.qOx.qOa.qNT, this.qOy.qOx.qOa.qJg, this.fyV.field_fileLength, -1, true);
      AppMethodBeat.o(36745);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.a.c.1.1
 * JD-Core Version:    0.6.2
 */