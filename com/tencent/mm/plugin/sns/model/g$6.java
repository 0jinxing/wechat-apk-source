package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.c;
import com.tencent.mm.plugin.sns.data.f;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.az;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

final class g$6
  implements Runnable
{
  g$6(g paramg, SparseArray paramSparseArray1, SparseArray paramSparseArray2, SparseArray paramSparseArray3, String paramString, az paramaz)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(36140);
    int j = this.qIw.size();
    Object localObject1;
    for (int k = 0; k < j; k++)
    {
      int m = this.qIw.keyAt(k);
      localObject1 = (bau)this.qIw.get(m);
      if (!g.a(this.qIr, 0, (bau)localObject1))
      {
        ??? = new com.tencent.mm.plugin.sns.data.e((bau)localObject1);
        ((com.tencent.mm.plugin.sns.data.e)???).qFQ = 0;
        ((com.tencent.mm.plugin.sns.data.e)???).nQB = ((bau)localObject1).Id;
        this.qIx.put(m, ???);
        this.qIy.put(m, localObject1);
      }
    }
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    SparseArray localSparseArray;
    if (this.qIy.size() > 0)
    {
      localObject1 = af.cnA();
      localObject4 = this.fWy;
      localObject5 = this.qIy;
      localObject6 = this.qIx;
      localObject7 = this.qIz;
      j = ((SparseArray)localObject5).size();
      for (k = 0; k < j; k++)
        av.Yi(((bau)((SparseArray)localObject5).valueAt(k)).Id);
      if (!i.Xn(af.getAccPath()))
      {
        ab.i("MicroMsg.DownloadManager", "addBatchDownloadSns isHasSdcard is false accPath %s sdcard: %s.", new Object[] { af.getAccPath(), com.tencent.mm.compatible.util.e.eSl });
        AppMethodBeat.o(36140);
      }
      while (true)
      {
        return;
        localSparseArray = new SparseArray();
        k = i;
        if (k < j)
        {
          i = ((SparseArray)localObject5).keyAt(k);
          ??? = (bau)((SparseArray)localObject5).get(i);
          if ((!((bau)???).Id.startsWith("Locall_path")) && (!((bau)???).Id.startsWith("pre_temp_sns_pic")))
            localSparseArray.put(i, ???);
          while (true)
          {
            k++;
            break;
            ((SparseArray)localObject6).remove(i);
          }
        }
        if (localSparseArray.size() > 0)
          break;
        ab.i("MicroMsg.DownloadManager", "addBatchDownloadSns do not need download.");
        AppMethodBeat.o(36140);
      }
      localObject5 = i.Xh((String)localObject4);
    }
    while (true)
    {
      synchronized (((b)localObject1).eHH)
      {
        if (!((b)localObject1).qHM.containsKey(localObject5))
        {
          ab.i("MicroMsg.DownloadManager", "addBatchDownloadSns put lock & add list %s.", new Object[] { localObject4 });
          Map localMap = ((b)localObject1).qHM;
          Object localObject8 = new com/tencent/mm/plugin/sns/data/c;
          ((c)localObject8).<init>((SparseArray)localObject6);
          localMap.put(localObject5, localObject8);
          localObject6 = ((b)localObject1).eow;
          localObject8 = new com/tencent/mm/plugin/sns/data/f;
          ((f)localObject8).<init>((String)localObject4, localSparseArray, (String)localObject5, (az)localObject7);
          ((LinkedList)localObject6).add(localObject8);
          continue;
          if (Looper.myLooper() == null)
            break label599;
          Looper.myQueue().addIdleHandler(new b.d((b)localObject1));
          ((b)localObject1).cmJ();
          ((b)localObject1).cmK();
          if (((b)localObject1).eow.size() > 0)
          {
            ab.d("MicroMsg.DownloadManager", "addBatchDownloadSns add success, tryStartNetscene.");
            ((b)localObject1).agK();
          }
          AppMethodBeat.o(36140);
          break;
        }
        localObject4 = ((b)localObject1).eow.iterator();
        if (!((Iterator)localObject4).hasNext())
          continue;
        localObject7 = (f)((Iterator)localObject4).next();
        if (!((f)localObject7).key.equals(localObject5))
          continue;
        if (((b)localObject1).eow.remove(localObject7))
          ((b)localObject1).eow.addLast(localObject7);
        ab.i("MicroMsg.DownloadManager", "addBatchDownloadSns update the download list.");
      }
      label599: ab.w("MicroMsg.DownloadManager", "addBatchDownloadSns Looper.myLooper() == null.");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.6
 * JD-Core Version:    0.6.2
 */