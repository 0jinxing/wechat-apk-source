package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.az.b.a;
import com.tencent.mm.az.b.c;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.openim.a.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bhr;
import com.tencent.mm.protocal.protobuf.bhs;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.vl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class UnfamiliarContactDetailUI$d
  implements f, Runnable
{
  int index;
  int oqN;
  UnfamiliarContactDetailUI.g qql;
  Collection<Integer> qqm;
  int qqn;
  LinkedList<String> qqo;
  LinkedList<j.b> qqp;

  UnfamiliarContactDetailUI$d(Collection<Integer> paramCollection, UnfamiliarContactDetailUI.g paramg)
  {
    AppMethodBeat.i(127663);
    this.oqN = 0;
    this.qqn = 0;
    this.index = 0;
    this.qqo = new LinkedList();
    this.qqp = new LinkedList();
    this.qqm = paramg;
    Object localObject;
    this.qql = localObject;
    AppMethodBeat.o(127663);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127665);
    if (paramm.getType() == 681)
      if ((((com.tencent.mm.az.b)paramm).fLr == null) || ((b.c)((com.tencent.mm.az.b)paramm).fLr.fLu == null))
      {
        ab.e("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] rr is null!");
        AppMethodBeat.o(127665);
      }
    while (true)
    {
      return;
      Object localObject = ((b.c)((com.tencent.mm.az.b)paramm).fLr.fLu).fLw;
      if ((((bhr)localObject).Ret != 0) || (((bhr)localObject).wKS == null) || (((bhr)localObject).wKS.wof == null))
      {
        ab.e("MicroMsg.UnfamiliarContactUI", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", new Object[] { Integer.valueOf(((bhr)localObject).Ret) });
        AppMethodBeat.o(127665);
      }
      else
      {
        paramString = ((com.tencent.mm.az.b)paramm).fLs;
        paramm = ((bhr)localObject).wKS.wof;
        ab.i("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] list size:%s, result:%s", new Object[] { Integer.valueOf(paramString.size()), Integer.valueOf(paramm.size()) });
        paramInt1 = 0;
        if (paramInt1 < paramString.size())
        {
          localObject = (j.b)paramString.get(paramInt1);
          if (((j.b)localObject).getCmdId() != 4)
            ab.w("MicroMsg.UnfamiliarContactUI", "cmdId:%s operation:%s", new Object[] { Integer.valueOf(((j.b)localObject).getCmdId()), localObject.toString() });
          while (true)
          {
            paramInt1++;
            break;
            this.oqN -= 1;
            localObject = (vl)((j.b)localObject).oqT;
            if (((Integer)paramm.get(paramInt1)).intValue() == 0)
            {
              this.qqn += 1;
              localObject = ((j)g.K(j.class)).XM().aoO(aa.a(((vl)localObject).wcB));
              if (localObject != null)
              {
                ((ad)localObject).NC();
                bf.a(((ap)localObject).field_username, null);
                ((j)g.K(j.class)).XM().b(((ap)localObject).field_username, (ad)localObject);
                ((j)g.K(j.class)).XR().aoX(((ap)localObject).field_username);
                this.qqo.add(((ap)localObject).field_username);
              }
            }
            else
            {
              ab.e("MicroMsg.UnfamiliarContactUI", "delete contact fail! ret:%s", new Object[] { paramm.get(paramInt1), aa.a(((vl)localObject).wcB) });
            }
          }
        }
        if (this.oqN <= 0)
        {
          paramm = this.qqo.iterator();
          while (paramm.hasNext())
          {
            paramString = (String)paramm.next();
            localObject = UnfamiliarContactDetailUI.f(this.qpX).iterator();
            while (((Iterator)localObject).hasNext())
              if (((UnfamiliarContactDetailUI.b)((Iterator)localObject).next()).ehM.field_username.equals(paramString))
                ((Iterator)localObject).remove();
          }
          UnfamiliarContactDetailUI.a(this.qpX, UnfamiliarContactDetailUI.f(this.qpX));
          this.qpX.runOnUiThread(new UnfamiliarContactDetailUI.d.1(this));
        }
        AppMethodBeat.o(127665);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(127664);
    this.oqN = this.qqm.size();
    Iterator localIterator = this.qqm.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      this.index += 1;
      int j = this.qqm.size();
      int k = this.index;
      if (UnfamiliarContactDetailUI.e(this.qpX) != null)
      {
        ad localad = UnfamiliarContactDetailUI.e(this.qpX).Cr(i).ehM;
        if (ad.aox(localad.field_username))
        {
          ((a)g.K(a.class)).ve(localad.field_username);
        }
        else
        {
          vl localvl = new vl();
          localvl.wcB = new bts().alV(bo.nullAsNil(localad.field_username));
          this.qqp.add(new j.a(4, localvl));
          if ((this.qqp.size() % 20 == 0) || (k == j))
          {
            g.RQ();
            g.RO().eJo.a(new com.tencent.mm.az.b(this.qqp), 0);
            this.qqp.clear();
          }
        }
      }
    }
    AppMethodBeat.o(127664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.d
 * JD-Core Version:    0.6.2
 */