package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqh;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bvn;
import com.tencent.mm.protocal.protobuf.mh;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f extends c
{
  List<bqh> jMx;
  private SparseArray<com.tencent.mm.plugin.brandservice.ui.base.a> jMy;
  private int jMz;

  public f(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(14032);
    this.jMx = null;
    this.jMy = new SparseArray();
    setReporter(new f.1(this));
    AppMethodBeat.o(14032);
  }

  public final void a(mh parammh, boolean paramBoolean)
  {
    AppMethodBeat.i(14034);
    super.a(parammh, paramBoolean);
    if (this.jMz == 0)
      this.jMz = super.getCount();
    AppMethodBeat.o(14034);
  }

  public final void aWb()
  {
    AppMethodBeat.i(14036);
    super.aWb();
    AppMethodBeat.o(14036);
  }

  public final int getCount()
  {
    AppMethodBeat.i(14035);
    int i = super.getCount();
    int j = i;
    if (i == 0)
    {
      j = i;
      if (this.jMx != null)
      {
        Iterator localIterator = this.jMx.iterator();
        j = i;
        if (localIterator.hasNext())
        {
          bqh localbqh = (bqh)localIterator.next();
          if ((localbqh == null) || (localbqh.wSC == null))
            break label93;
          j += localbqh.wSC.size();
        }
      }
    }
    label93: 
    while (true)
    {
      break;
      AppMethodBeat.o(14035);
      return j;
    }
  }

  public final void h(String paramString, List<mh> paramList)
  {
    AppMethodBeat.i(14033);
    super.h(paramString, paramList);
    this.jMz = super.getCount();
    AppMethodBeat.o(14033);
  }

  public final Object[] sc(int paramInt)
  {
    AppMethodBeat.i(14038);
    Object localObject1 = rZ(paramInt);
    Object localObject2 = sa(paramInt);
    if (localObject1 != null)
    {
      localObject1 = ((c.a)localObject1).jLi;
      if (paramInt < this.jMz)
      {
        paramInt = 39;
        if (localObject2 == null)
          break label85;
        localObject2 = ((mh)localObject2).vQg;
        label47: AppMethodBeat.o(14038);
        localObject2 = new Object[] { this, localObject1, Integer.valueOf(paramInt), localObject2 };
      }
    }
    while (true)
    {
      return localObject2;
      paramInt = 56;
      break;
      label85: localObject2 = "";
      break label47;
      localObject2 = super.sc(paramInt);
      AppMethodBeat.o(14038);
    }
  }

  public final com.tencent.mm.ui.base.sortview.a se(int paramInt)
  {
    AppMethodBeat.i(14037);
    int i = super.getCount();
    if (i != 0)
    {
      localObject1 = super.se(paramInt);
      AppMethodBeat.o(14037);
      return localObject1;
    }
    Object localObject2 = (com.tencent.mm.plugin.brandservice.ui.base.a)this.jMy.get(paramInt);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (this.jMx.size() > 0)
      {
        localObject2 = this.jMx.iterator();
        label76: if (!((Iterator)localObject2).hasNext())
          break label221;
        localObject1 = (bqh)((Iterator)localObject2).next();
        if (i != paramInt)
          break label175;
        if (((bqh)localObject1).wSA != null)
          break label163;
        localObject2 = null;
        label112: localObject1 = (bvn)((bqh)localObject1).wSC.get(0);
      }
    }
    while (true)
    {
      localObject1 = new b(localObject1, (String)localObject2);
      ((com.tencent.mm.plugin.brandservice.ui.base.a)localObject1).sf(paramInt);
      ((com.tencent.mm.plugin.brandservice.ui.base.a)localObject1).setPosition(paramInt);
      this.jMy.put(paramInt, localObject1);
      AppMethodBeat.o(14037);
      break;
      label163: localObject2 = ((bqh)localObject1).wSA.toString();
      break label112;
      label175: if (paramInt < ((bqh)localObject1).wSC.size() + i)
      {
        localObject1 = (bvn)((bqh)localObject1).wSC.get(paramInt - i);
        localObject2 = null;
      }
      else
      {
        i = ((bqh)localObject1).wSC.size() + i;
        break label76;
        label221: localObject2 = null;
        localObject1 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.f
 * JD-Core Version:    0.6.2
 */