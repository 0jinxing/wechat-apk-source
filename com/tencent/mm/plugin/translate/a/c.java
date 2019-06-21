package com.tencent.mm.plugin.translate.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cis;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public final class c
  implements a
{
  public ArrayList<c.a> eES;
  public int exv;
  public final d[] sKw;
  public Queue<c.c> sKx;
  public HashMap<String, Integer> sKy;

  private c()
  {
    AppMethodBeat.i(26063);
    this.exv = 0;
    this.eES = new ArrayList(1);
    this.sKx = new LinkedList();
    this.sKy = new HashMap();
    this.sKw = new d[1];
    AppMethodBeat.o(26063);
  }

  private void b(int paramInt, SparseArray<c.c> paramSparseArray)
  {
    AppMethodBeat.i(26064);
    Iterator localIterator = this.eES.iterator();
    while (localIterator.hasNext())
      ((c.a)localIterator.next()).a(paramInt, paramSparseArray);
    AppMethodBeat.o(26064);
  }

  public final void a(int paramInt, SparseArray<c.c> paramSparseArray, LinkedList<cis> paramLinkedList)
  {
    AppMethodBeat.i(26067);
    this.exv -= 1;
    Object localObject;
    int i;
    if ((paramLinkedList == null) || (paramSparseArray.size() != paramLinkedList.size()))
    {
      ab.d("MicroMsg.TranslateServiceManager", "originals.size() != translatedMsg.size()");
      localObject = new HashMap();
      for (i = 0; i < paramSparseArray.size(); i++)
        ((HashMap)localObject).put(((c.c)paramSparseArray.valueAt(i)).id, Integer.valueOf(((c.c)paramSparseArray.valueAt(i)).sKB));
    }
    while (true)
    {
      if (paramLinkedList != null)
      {
        Iterator localIterator = paramLinkedList.iterator();
        cis localcis;
        c.c localc;
        while (true)
        {
          if (!localIterator.hasNext())
            break label402;
          localcis = (cis)localIterator.next();
          localc = (c.c)paramSparseArray.get(localcis.xhA);
          if (localc != null)
            break;
          ab.w("MicroMsg.TranslateServiceManager", "[onTranslateEnd] message is null! %s %s %s", new Object[] { Integer.valueOf(localcis.xhA), Integer.valueOf(localcis.Ret), bo.anv(localcis.xhD) });
        }
        String str = localcis.xhD;
        paramLinkedList = str;
        if (localc.type == 1)
        {
          paramLinkedList = bf.al(str, localc.sKC);
          localc.cPz = bf.al(localc.cPz, localc.sKC);
        }
        localc.cPG = paramLinkedList;
        localc.ret = localcis.Ret;
        localc.cNS = localcis.xhE;
        if ((localcis.wlw != null) && (localcis.wlw.getBuffer() != null));
        for (paramLinkedList = localcis.wlw.getBufferToBytes(); ; paramLinkedList = null)
        {
          localc.dJG = paramLinkedList;
          localc.sKA = localcis.xhF;
          this.sKy.remove(localc.id);
          if (localObject == null)
            break;
          ((HashMap)localObject).remove(localc.id);
          break;
        }
      }
      for (i = 0; i < paramSparseArray.size(); i++)
      {
        paramLinkedList = (c.c)paramSparseArray.valueAt(i);
        if (paramLinkedList.type == 1)
          paramLinkedList.cPz = bf.al(paramLinkedList.cPz, paramLinkedList.sKC);
      }
      label402: if ((localObject != null) && (((HashMap)localObject).size() > 0))
      {
        paramLinkedList = ((HashMap)localObject).entrySet().iterator();
        while (paramLinkedList.hasNext())
        {
          localObject = (Map.Entry)paramLinkedList.next();
          this.sKy.remove(((Map.Entry)localObject).getKey());
          ab.d("MicroMsg.TranslateServiceManager", "we found missing translate, msgId : %s, clientId : %s", new Object[] { ((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue() });
        }
      }
      b(paramInt, paramSparseArray);
      cHI();
      AppMethodBeat.o(26067);
      return;
      localObject = null;
    }
  }

  public final boolean abQ(String paramString)
  {
    AppMethodBeat.i(26066);
    boolean bool = this.sKy.containsKey(paramString);
    AppMethodBeat.o(26066);
    return bool;
  }

  public final void cHI()
  {
    int i = 0;
    AppMethodBeat.i(26065);
    ab.d("MicroMsg.TranslateServiceManager", "current waitings : %s", new Object[] { Integer.valueOf(this.sKx.size()) });
    if (this.sKx.size() == 0)
      AppMethodBeat.o(26065);
    while (true)
    {
      return;
      if (this.exv <= this.sKw.length)
        while (i < this.sKw.length)
        {
          if (this.sKw[i] == null)
          {
            this.sKw[i] = new d(i, this);
            this.sKw[i].init();
          }
          if ((!this.sKw[i].sKF) && (this.sKw[i].e(this.sKx)))
            this.exv += 1;
          i++;
        }
      AppMethodBeat.o(26065);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.c
 * JD-Core Version:    0.6.2
 */