package com.tencent.mm.plugin.sns.ui;

import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class d<T>
{
  private ak handler = null;
  List<Integer> rga = new LinkedList();

  public d()
  {
    this.rga.clear();
  }

  public abstract List<T> Kx();

  final void dp(List<T> paramList)
  {
    this.handler.post(new d.2(this, paramList));
  }

  public abstract void dq(List<T> paramList);

  protected final void hM(boolean paramBoolean)
  {
    int i;
    int j;
    if (paramBoolean)
    {
      i = 0;
      if (i != 1)
        break label73;
      Iterator localIterator = this.rga.iterator();
      while (localIterator.hasNext())
        if (((Integer)localIterator.next()).intValue() == 1)
        {
          j = 1;
          label49: if (j == 0)
            break label73;
          ab.e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
        }
    }
    while (true)
    {
      return;
      i = 1;
      break;
      j = 0;
      break label49;
      label73: if (!paramBoolean)
        ab.d("MicroMsg.AdapterLoader", "ui load");
      while (true)
      {
        if (this.rga.size() > 1)
          break label164;
        this.rga.add(Integer.valueOf(i));
        if (!paramBoolean)
          break label166;
        af.cno().post(new d.1(this, paramBoolean));
        break;
        ab.d("MicroMsg.AdapterLoader", "thread load" + this.rga.size());
      }
      label164: continue;
      label166: dp(Kx());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d
 * JD-Core Version:    0.6.2
 */