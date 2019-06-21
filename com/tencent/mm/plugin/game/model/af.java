package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.aq;
import com.tencent.mm.plugin.game.d.ar;
import com.tencent.mm.plugin.game.d.at;
import com.tencent.mm.plugin.game.d.bk;
import com.tencent.mm.plugin.game.d.cc;
import com.tencent.mm.plugin.game.d.cd;
import com.tencent.mm.plugin.game.d.cg;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.h;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class af extends x
{
  public bk mYh;
  private boolean mYi;
  public LinkedList<c> mYj;
  public HashMap<String, Integer> mYk;

  public af(com.tencent.mm.bt.a parama)
  {
    AppMethodBeat.i(111384);
    this.mYk = new HashMap();
    if (parama == null)
    {
      this.mYh = new bk();
      AppMethodBeat.o(111384);
    }
    while (true)
    {
      return;
      this.mYh = ((bk)parama);
      this.mYi = true;
      Kh();
      AppMethodBeat.o(111384);
    }
  }

  public af(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111385);
    this.mYk = new HashMap();
    this.mYh = new bk();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(111385);
    while (true)
    {
      return;
      try
      {
        this.mYh.parseFrom(paramArrayOfByte);
        this.mYi = false;
        Kh();
        AppMethodBeat.o(111385);
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
          ab.e("MicroMsg.GamePBDataOverSea", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }

  private void Kh()
  {
    AppMethodBeat.i(111386);
    this.mYj = bEQ();
    if (this.mYi)
    {
      d.ac(this.mYj);
      bER();
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().init(ah.getContext());
    }
    AppMethodBeat.o(111386);
  }

  private LinkedList<c> bEQ()
  {
    AppMethodBeat.i(111387);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mYh.nck == null) || (this.mYh.nck.mZK == null))
      AppMethodBeat.o(111387);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator1 = this.mYh.nck.mZK.iterator();
      int i = 1;
      while (localIterator1.hasNext())
      {
        Object localObject = (aq)localIterator1.next();
        if (((aq)localObject).mZk != null)
        {
          c localc = a(((aq)localObject).mZk);
          if (localc != null)
          {
            ar localar;
            StringBuilder localStringBuilder;
            int j;
            if (((aq)localObject).mZk.mZE != null)
              if ((((aq)localObject).mZk.mZE.Name != null) && (((aq)localObject).mZk.mZE.ncT != null))
              {
                localc.mVx = ((aq)localObject).mZk.mZE.Name;
                localc.mVy = ((aq)localObject).mZk.mZE.ncT;
                localc.mVB = com.tencent.mm.plugin.game.e.a.T(((aq)localObject).mZL, "label", localc.mVx);
                if (((aq)localObject).nbg == null)
                  break label477;
                Iterator localIterator2 = ((aq)localObject).nbg.iterator();
                do
                {
                  if (!localIterator2.hasNext())
                    break;
                  localar = (ar)localIterator2.next();
                }
                while (localar == null);
                if ((localar.nbh == null) || (localar.nbh.size() == 0))
                  break label463;
                localStringBuilder = new StringBuilder();
                j = 0;
                label269: if (j >= localar.nbh.size())
                  break label424;
                localObject = ((j)g.K(j.class)).XM().aoO((String)localar.nbh.get(j));
                if ((localObject == null) || (((ad)localObject).ewQ == 0L))
                  break label402;
                localStringBuilder.append(((ad)localObject).Oj());
              }
            while (true)
            {
              if (j < localar.nbh.size() - 1)
                localStringBuilder.append("、");
              j++;
              break label269;
              localc.mVB = com.tencent.mm.plugin.game.e.a.kY(((aq)localObject).mZL);
              break;
              localc.mVB = com.tencent.mm.plugin.game.e.a.kY(((aq)localObject).mZL);
              break;
              label402: localStringBuilder.append((String)localar.nbh.get(j));
            }
            label424: localStringBuilder.append(" ");
            localc.mVs.add(localStringBuilder.toString());
            while (true)
            {
              localc.mVs.add(localar.naq);
              break;
              label463: localc.mVs.add("");
            }
            label477: localc.scene = 10;
            localc.cKG = 1004;
            localc.position = i;
            localLinkedList.add(localc);
            i++;
          }
        }
      }
      AppMethodBeat.o(111387);
    }
  }

  private void bER()
  {
    AppMethodBeat.i(111388);
    this.mYk = new HashMap();
    if ((this.mYh.ncl == null) || (this.mYh.ncl.ncP == null))
      AppMethodBeat.o(111388);
    while (true)
    {
      return;
      Iterator localIterator = this.mYh.ncl.ncP.iterator();
      while (localIterator.hasNext())
      {
        cd localcd = (cd)localIterator.next();
        Object localObject = a(localcd.mZk);
        if (localObject != null)
        {
          this.mYk.put(((c)localObject).field_appId, Integer.valueOf(((c)localObject).versionCode));
          localObject = com.tencent.mm.plugin.s.a.bYJ().aiJ(((c)localObject).field_appId);
          if (localObject != null)
          {
            ((f)localObject).ij(localcd.ncR);
            if (!com.tencent.mm.plugin.s.a.bYJ().a((f)localObject, new String[0]))
              ab.e("MicroMsg.GamePBDataOverSea", "Store rank info failed, AppID: %s", new Object[] { ((f)localObject).field_appId });
          }
        }
      }
      AppMethodBeat.o(111388);
    }
  }

  public final at bES()
  {
    if (this.mYh != null);
    for (at localat = this.mYh.nci; ; localat = null)
      return localat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.af
 * JD-Core Version:    0.6.2
 */