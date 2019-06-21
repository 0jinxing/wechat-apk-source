package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abw;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class RemittanceBusiUI$6
  implements n.c
{
  RemittanceBusiUI$6(RemittanceBusiUI paramRemittanceBusiUI, List paramList, HashSet paramHashSet)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(44898);
    int i = 0;
    int j = 0;
    RemittanceBusiUI.a(this.pUd, RemittanceBusiUI.n(this.pUd));
    Object localObject1;
    Object localObject2;
    if ((!RemittanceBusiUI.A(this.pUd).cfx()) || (RemittanceBusiUI.o(this.pUd) <= 0.0D))
    {
      localObject1 = this.pUe.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (abw)((Iterator)localObject1).next();
        paraml.a(j, ((abw)localObject2).wjn, ((abw)localObject2).wjp, null, true);
        this.pUf.add(Integer.valueOf(j));
        j++;
      }
      AppMethodBeat.o(44898);
    }
    while (true)
    {
      return;
      localObject2 = this.pUe.iterator();
      j = i;
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (abw)((Iterator)localObject2).next();
        if (((abw)localObject1).wjv == 1)
        {
          paraml.a(j, ((abw)localObject1).wjn, ((abw)localObject1).wjp, null, true);
          this.pUf.add(Integer.valueOf(j));
        }
        while (true)
        {
          j++;
          break;
          paraml.a(j, ((abw)localObject1).wjn, ((abw)localObject1).wjp);
        }
      }
      AppMethodBeat.o(44898);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.6
 * JD-Core Version:    0.6.2
 */