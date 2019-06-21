package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class p
{
  private Object lock;
  private Set<String> nXG;

  public p()
  {
    AppMethodBeat.i(42336);
    this.lock = new Object();
    this.nXG = new HashSet();
    String str = (String)g.RP().Ry().get(ac.a.xQa, "");
    if (!bo.isNullOrNil(str))
      for (str : str.split(","))
        this.nXG.add(str);
    AppMethodBeat.o(42336);
  }

  public final boolean Qh(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(42337);
    while (true)
    {
      synchronized (this.lock)
      {
        if (!this.nXG.contains(paramString))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>((String)g.RP().Ry().get(ac.a.xQa, ""));
          if (this.nXG.size() <= 0)
          {
            localStringBuilder.append(paramString);
            g.RP().Ry().set(ac.a.xQa, localStringBuilder.toString());
            bool = this.nXG.add(paramString);
            AppMethodBeat.o(42337);
            return bool;
          }
          localStringBuilder.append(",").append(paramString);
        }
      }
      ab.i("MicroMsg.LuckyMoneyMsg", "has contains msg, %s", new Object[] { paramString });
      AppMethodBeat.o(42337);
    }
  }

  public final void Qi(String paramString)
  {
    AppMethodBeat.i(42338);
    synchronized (this.lock)
    {
      this.nXG.remove(paramString);
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      Iterator localIterator = this.nXG.iterator();
      if (localIterator.hasNext())
        paramString.append((String)localIterator.next()).append(",");
    }
    if (paramString.length() == 0);
    for (paramString = paramString.toString(); ; paramString = paramString.substring(0, paramString.length() - 1))
    {
      g.RP().Ry().set(ac.a.xQa, paramString);
      AppMethodBeat.o(42338);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.p
 * JD-Core Version:    0.6.2
 */