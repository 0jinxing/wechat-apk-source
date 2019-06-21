package com.tencent.mm.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.x.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class z
{
  private static z ypB = null;
  private long timestamp;
  int ypC;
  private SparseIntArray ypD;
  private SparseArray<aa.b> ypE;
  private ArrayList<Integer> ypF;
  public SparseArray<aa.c> ypG;
  private boolean ypH;

  public z()
  {
    AppMethodBeat.i(29833);
    this.ypC = 0;
    this.ypD = new SparseIntArray();
    this.ypE = new SparseArray();
    this.ypF = new ArrayList();
    this.ypG = new SparseArray();
    this.timestamp = 0L;
    this.ypH = false;
    AppMethodBeat.o(29833);
  }

  public static z dyZ()
  {
    AppMethodBeat.i(29834);
    if (ypB == null)
      ypB = new z();
    z localz = ypB;
    AppMethodBeat.o(29834);
    return localz;
  }

  private void dza()
  {
    AppMethodBeat.i(29838);
    this.ypD.clear();
    aw.ZK();
    Object localObject = (String)com.tencent.mm.model.c.Ry().get(299010, null);
    if (!bo.isNullOrNil((String)localObject))
    {
      String[] arrayOfString = ((String)localObject).split("\\|");
      for (int i = 0; i < arrayOfString.length; i++)
      {
        localObject = arrayOfString[i].split("\\:");
        if (localObject.length == 2)
          this.ypD.put(bo.ank(localObject[0]), bo.ank(localObject[1]));
      }
    }
    this.ypH = true;
    AppMethodBeat.o(29838);
  }

  private void pX(boolean paramBoolean)
  {
    AppMethodBeat.i(29836);
    if (!paramBoolean)
      if ((this.ypE.size() == 0) || (System.currentTimeMillis() - this.timestamp > 3600000L))
      {
        i = 1;
        if (i != 0)
          break label53;
        AppMethodBeat.o(29836);
      }
    label53: Object localObject4;
    int j;
    Object localObject5;
    while (true)
    {
      return;
      i = 0;
      break;
      long l = System.currentTimeMillis();
      Object localObject1 = com.tencent.mm.m.g.Nu().kC("TopRightMenu\\d*");
      ab.i("MicroMsg.PlusMenaDataManager", "dynaConfigs size %d", new Object[] { Integer.valueOf(((List)localObject1).size()) });
      try
      {
        this.ypE.clear();
        this.ypF.clear();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = br.z((String)((Iterator)localObject1).next(), "Menu");
          if ((localObject4 != null) && (((Map)localObject4).size() != 0))
          {
            j = bo.ank((String)((Map)localObject4).get(".Menu.$id"));
            int k = bo.ank((String)((Map)localObject4).get(".Menu.$shownew"));
            i = bo.ank((String)((Map)localObject4).get(".Menu.$seq"));
            int m = bo.ank((String)((Map)localObject4).get(".Menu.$order"));
            localObject4 = this.ypE;
            localObject5 = new com/tencent/mm/ui/aa$b;
            ((aa.b)localObject5).<init>(j, k, i, m);
            ((SparseArray)localObject4).put(j, localObject5);
            for (i = 0; (i < this.ypF.size()) && (((aa.b)this.ypE.get(((Integer)this.ypF.get(i)).intValue())).order <= m); i++);
            this.ypF.add(i, Integer.valueOf(j));
          }
        }
      }
      finally
      {
        AppMethodBeat.o(29836);
      }
      ab.i("MicroMsg.PlusMenaDataManager", "dynaMenuOrder size %d", new Object[] { Integer.valueOf(this.ypF.size()) });
      if (this.ypF.size() == 0)
      {
        this.ypE.clear();
        this.ypF.clear();
        localObject3 = com.tencent.mm.m.g.Nu().getValue("TopRightMenus");
        if (!bo.isNullOrNil((String)localObject3))
        {
          localObject4 = br.z((String)localObject3, "TopRightMenus");
          if (localObject4 != null)
            break label479;
          ab.e("MicroMsg.PlusMenaDataManager", "TopRightMenus is not right");
        }
      }
      if (this.ypE.size() != 0)
        dza();
      this.timestamp = System.currentTimeMillis();
      ab.d("MicroMsg.PlusMenaDataManager", " plus menu load data spent time : %s", new Object[] { Long.valueOf(this.timestamp - l) });
      AppMethodBeat.o(29836);
    }
    label479: int i = 0;
    label481: if (i < 100)
    {
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>(".TopRightMenus.Menu");
      if (i != 0)
        break label742;
    }
    label742: for (Object localObject3 = ""; ; localObject3 = Integer.valueOf(i))
    {
      Object localObject6 = localObject3;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = (String)((Map)localObject4).get((String)localObject6 + ".$id");
      if ((localObject3 == null) || (bo.isNullOrNil((String)localObject3)))
        break;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = (String)((Map)localObject4).get((String)localObject6 + ".$shownew");
      Object localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      String str = (String)((Map)localObject4).get((String)localObject6 + ".$seq");
      ab.d("MicroMsg.PlusMenaDataManager", "got plus panel configs : %s %s %s", new Object[] { localObject3, localObject5, str });
      localObject6 = this.ypE;
      j = bo.ank((String)localObject3);
      localObject7 = new com/tencent/mm/ui/aa$b;
      ((aa.b)localObject7).<init>(bo.ank((String)localObject3), bo.ank((String)localObject5), bo.ank(str));
      ((SparseArray)localObject6).put(j, localObject7);
      this.ypF.add(Integer.valueOf(bo.ank((String)localObject3)));
      i++;
      break label481;
      break;
    }
  }

  public final void Nt(int paramInt)
  {
    AppMethodBeat.i(29835);
    if (this.ypE.size() != 0)
    {
      Object localObject = (aa.b)this.ypE.get(paramInt);
      if ((localObject != null) && (((aa.b)localObject).ypM == 1))
      {
        this.ypD.put(((aa.b)localObject).id, ((aa.b)localObject).fQi);
        this.ypC -= 1;
        if (this.ypH)
        {
          localObject = new StringBuffer();
          for (paramInt = 0; paramInt < this.ypD.size(); paramInt++)
          {
            int i = this.ypD.keyAt(paramInt);
            int j = this.ypD.get(i);
            ((StringBuffer)localObject).append(i);
            ((StringBuffer)localObject).append(":");
            ((StringBuffer)localObject).append(Integer.valueOf(j));
            ((StringBuffer)localObject).append("|");
          }
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(299010, ((StringBuffer)localObject).toString());
        }
      }
    }
    AppMethodBeat.o(29835);
  }

  public final void pY(boolean paramBoolean)
  {
    AppMethodBeat.i(29837);
    int j;
    try
    {
      pX(paramBoolean);
      this.ypG.clear();
      this.ypC = 0;
      int i = 0;
      int m;
      for (j = 0; i < this.ypF.size(); j = m)
      {
        int k = ((Integer)this.ypF.get(i)).intValue();
        aa.b localb = (aa.b)this.ypE.get(k);
        Object localObject = aa.Nu(k);
        m = j;
        if (localObject != null)
        {
          localObject = new aa.c((aa.d)localObject);
          this.ypG.put(j, localObject);
          m = this.ypD.get(k);
          if (((localb.ypM == 1) && (m != localb.fQi)) || ((k == 20) && (com.tencent.mm.x.c.PK().bY(262159, 266248))))
          {
            ((aa.c)localObject).ypO = true;
            this.ypC += 1;
          }
          m = j + 1;
        }
        i++;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.PlusMenaDataManager", localException, "", new Object[0]);
      ab.i("MicroMsg.PlusMenaDataManager", "dynaMenuOrder.size() %s menuDataMap.size() %s", new Object[] { Integer.valueOf(this.ypF.size()), Integer.valueOf(this.ypG.size()) });
      if (com.tencent.mm.sdk.platformtools.g.dnZ())
        break label276;
    }
    this.ypG.put(j, new aa.c(aa.Nu(2147483647)));
    AppMethodBeat.o(29837);
    while (true)
    {
      return;
      label276: this.ypG.put(j, new aa.c(aa.Nu(2147483645)));
      AppMethodBeat.o(29837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.z
 * JD-Core Version:    0.6.2
 */