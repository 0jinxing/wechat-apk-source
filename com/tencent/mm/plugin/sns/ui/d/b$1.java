package com.tencent.mm.plugin.sns.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import java.util.LinkedList;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(40239);
    if (paramView.getTag() == null)
      AppMethodBeat.o(40239);
    n localn;
    while (true)
    {
      return;
      localn = b.dQ(paramView);
      if ((localn != null) && (localn.DI(32)))
        break;
      AppMethodBeat.o(40239);
    }
    int i;
    int j;
    label86: Object localObject;
    label118: int k;
    if (localn.crd().cqo().coS())
    {
      i = v.gr(localn.crd().cqo().coN(), localn.crc());
      if (i > 0)
      {
        j = 1;
        String str1 = localn.crd().cqo().coN();
        String str2 = localn.crc();
        g.RN();
        localObject = a.QG();
        if (j == 0)
          break label211;
        if (j == 0)
          break label217;
        k = 0;
        label126: v.h(str1, str2, (String)localObject, i, k);
        if (j != 0);
      }
    }
    for (bool = true; ; bool = false)
    {
      localObject = localn.cqu();
      if ((((TimeLineObject)localObject).xfI.wbJ == 15) && (((TimeLineObject)localObject).xfP != 1))
      {
        b.a(this.rKt, paramView, localn, 1001, localn.crd().cqo().coT(), bool);
        AppMethodBeat.o(40239);
        break;
        j = 0;
        break label86;
        label211: i = 1;
        break label118;
        label217: k = 1;
        break label126;
      }
      if (((((TimeLineObject)localObject).xfI.wbJ == 1) && (((TimeLineObject)localObject).xfI.wbK.size() == 1)) || (((TimeLineObject)localObject).xfI.wbJ == 7))
        b.b(this.rKt, paramView, localn, 1001, localn.crd().cqo().coT(), bool);
      AppMethodBeat.o(40239);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.1
 * JD-Core Version:    0.6.2
 */