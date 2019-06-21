package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.zero.c;
import com.tencent.mm.protocal.protobuf.bec;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import junit.framework.Assert;

final class e$1
  implements ap.a
{
  e$1(e parame)
  {
  }

  public final boolean BI()
  {
    float f1 = 1.0F;
    boolean bool = false;
    AppMethodBeat.i(58360);
    if ((!com.tencent.mm.kernel.g.RK()) || (a.QT()))
    {
      ab.e("MicroMsg.NetSceneInit.dkInit", "acc is not ready stop handle resp");
      AppMethodBeat.o(58360);
    }
    while (true)
    {
      return bool;
      if (this.fIb.fIa)
      {
        ab.w("MicroMsg.NetSceneInit.dkInit", "Init CANCELED hash:%d", new Object[] { Integer.valueOf(this.fIb.hashCode()) });
        AppMethodBeat.o(58360);
      }
      else
      {
        if (!this.fIb.fCB.isEmpty())
          break;
        ab.v("MicroMsg.NetSceneInit.dkInit", "queue maybe this time is null , wait doscene!");
        AppMethodBeat.o(58360);
      }
    }
    ab.i("MicroMsg.NetSceneInit.dkInit", "pusher hash:%d time:%d list:%d [%d/%b,%d/%d]", new Object[] { Integer.valueOf(this.fIb.hashCode()), Long.valueOf(this.fIb.eOm.Mr()), Integer.valueOf(this.fIb.fCB.size()), Integer.valueOf(this.fIb.fHW), Boolean.valueOf(this.fIb.fHX), Integer.valueOf(this.fIb.fHZ), Integer.valueOf(this.fIb.fHY) });
    com.tencent.mm.kernel.g.RQ();
    long l = com.tencent.mm.kernel.g.RP().eJN.iV(Thread.currentThread().getId());
    Object localObject1 = new c();
    ((c)localObject1).ca("NetSceneInit");
    int i;
    label269: int j;
    label272: Object localObject2;
    label316: Object localObject3;
    if (this.fIb.fHX)
    {
      i = 40;
      j = 0;
      if (j >= i)
        break label1066;
      localObject2 = (e.a)this.fIb.fCB.peek();
      if (((e.a)localObject2).fIf != 2147483647)
        break label633;
      if (((e.a)localObject2).fIe != null)
        break label628;
      bool = true;
      Assert.assertTrue("in Queue tail , resp should be null", bool);
      com.tencent.mm.kernel.g.RQ();
      localObject3 = (String)com.tencent.mm.kernel.g.RP().Ry().get(8198, null);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(8195, localObject3);
      ah.getContext().getSharedPreferences("notify_sync_pref", com.tencent.mm.compatible.util.h.Mu()).edit().putString("notify_sync_key_keybuf", (String)localObject3).commit();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(8197, "");
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(8198, "");
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(15, Integer.valueOf(1));
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().dsb();
      ab.i("MicroMsg.NetSceneInit.dkInit", "INIT DONE: hash:%d time:%d netCnt:%d cmdCnt:%d err:[%d,%d] ", new Object[] { Integer.valueOf(this.fIb.hashCode()), Long.valueOf(this.fIb.eOm.Mr()), Integer.valueOf(this.fIb.fHW), Integer.valueOf(this.fIb.fHY), Integer.valueOf(((e.a)localObject2).errType), Integer.valueOf(((e.a)localObject2).errCode) });
      com.tencent.mm.kernel.g.RS().aa(new e.1.1(this, (e.a)localObject2));
      bool = false;
    }
    while (true)
    {
      label569: ((c)localObject1).cc("NetSceneInit");
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().eJN.mB(l);
      localObject1 = this.fIb;
      if (((e)localObject1).fHU == null)
        ab.w("MicroMsg.NetSceneInit.dkInit", "dkinit doProgressCallBack progressRef is null");
      while (true)
      {
        AppMethodBeat.o(58360);
        break;
        i = 10;
        break label269;
        label628: bool = false;
        break label316;
        label633: localObject3 = ((e.a)localObject2).fIe.wHL;
        if ((localObject3 != null) && (((LinkedList)localObject3).size() > ((e.a)localObject2).fCP))
        {
          ((LinkedList)localObject3).size();
          if (((c)localObject1).a((tb)((LinkedList)localObject3).get(((e.a)localObject2).fCP), true));
        }
        else
        {
          this.fIb.fCB.poll();
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(8197, bo.cd(aa.a(((e.a)localObject2).fIe.wHH)));
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(8198, bo.cd(aa.a(((e.a)localObject2).fIe.wHI)));
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(16, Integer.valueOf(0));
          ab.i("MicroMsg.NetSceneInit.dkInit", "ContinueFlag:%s", new Object[] { Long.valueOf(((e.a)localObject2).fIe.vQe) });
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(8196, Long.valueOf(((e.a)localObject2).fIe.vQe));
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().dsb();
          bool = true;
          break label569;
        }
        ((e.a)localObject2).fCP += 1;
        localObject2 = this.fIb;
        ((e)localObject2).fHZ += 1;
        j++;
        break label272;
        localObject2 = (com.tencent.mm.ai.g)((e)localObject1).fHU.get();
        if (localObject2 != null)
          break label919;
        ab.w("MicroMsg.NetSceneInit.dkInit", "dkinit doProgressCallBack progress is null");
      }
      label919: if (((e)localObject1).fHW > 50);
      for (i = 50; ; i = ((e)localObject1).fHW)
      {
        if (((e)localObject1).fHX)
          break label1020;
        j = i;
        ab.d("MicroMsg.NetSceneInit.dkInit", "doProgressCallBack index:%d sum:%d ratiocmd:%f ratioDoScene:%d", new Object[] { Integer.valueOf(((e)localObject1).fHZ), Integer.valueOf(((e)localObject1).fHY), Float.valueOf(f1), Integer.valueOf(i) });
        ((com.tencent.mm.ai.g)localObject2).a(j, 100, (m)localObject1);
        break;
      }
      label1020: float f2 = ((e)localObject1).fHZ / ((e)localObject1).fHY;
      if (f2 > 1.0F);
      while (true)
      {
        j = (int)((100 - i) * f1 + i);
        break;
        f1 = f2;
      }
      label1066: bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.e.1
 * JD-Core Version:    0.6.2
 */