package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.plugin.wallet_core.ui.b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public abstract class p<K>
{
  Map<String, Integer> tzB = new HashMap();
  List<K> tzC = new LinkedList();
  public Vector<p<K>.b> tzD = new Vector();
  List<String> tzE = new LinkedList();

  private void cPC()
  {
    int i = 0;
    int j;
    if (i < this.tzD.size())
      if (((p.b)this.tzD.get(i)).tzL != p.a.tzH)
      {
        Object localObject = a(this.tzD, i);
        if (this.tzB.containsKey(localObject))
          break label154;
        localObject = b.acV((String)localObject);
        j = 0;
        label63: if (j >= this.tzE.size())
          break label149;
        k = 0;
        label79: if (k >= localObject.length)
          break label166;
        if (((String)this.tzE.get(j)).contains(localObject[k]))
          break label137;
      }
    label137: label149: label154: label166: for (int k = 0; ; k = 1)
    {
      if (k != 0)
      {
        j = 1;
        label119: if (j != 0)
          break label154;
        a(i, p.a.tzG);
      }
      while (true)
      {
        i++;
        break;
        k++;
        break label79;
        j++;
        break label63;
        j = 0;
        break label119;
        a(i, p.a.tzI);
      }
      return;
    }
  }

  public abstract String a(Vector<p<K>.b> paramVector, int paramInt);

  public final void a(int paramInt, p.a parama)
  {
    ((p.b)this.tzD.get(paramInt)).tzL = parama;
  }

  public final void d(List<K> paramList1, List<K> paramList2, List<String> paramList)
  {
    this.tzE = paramList;
    this.tzC = paramList2;
    this.tzD.clear();
    this.tzD = new Vector(paramList1.size());
    int i = 0;
    if (i < paramList1.size())
    {
      p.b localb = new p.b(this);
      paramList2 = paramList1.get(i);
      localb.tzK = paramList2;
      if (this.tzC.contains(paramList2));
      for (localb.tzL = p.a.tzH; ; localb.tzL = p.a.tzG)
      {
        this.tzD.add(localb);
        i++;
        break;
      }
    }
    this.tzB.clear();
    for (i = 0; i < paramList.size(); i++)
      this.tzB.put(paramList.get(i), Integer.valueOf(0));
    cPC();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.p
 * JD-Core Version:    0.6.2
 */