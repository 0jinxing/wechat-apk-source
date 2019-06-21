package com.tencent.mm.ui.conversation.a;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.List;

final class m$a
  implements Runnable
{
  WeakReference<m> zwF;

  public final void run()
  {
    AppMethodBeat.i(34689);
    List localList1 = o.all().alB();
    List localList2 = o.all().alC();
    Object localObject = (m)this.zwF.get();
    if (localObject == null)
    {
      ab.w("MicroMsg.MassSightBanner", "try to load date, but banner ref is null");
      AppMethodBeat.o(34689);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MassSightBanner", "ViewCount %d, unfinish size %d, fail size %d", new Object[] { Integer.valueOf(((m)localObject).mContainer.getChildCount()), Integer.valueOf(localList1.size()), Integer.valueOf(localList2.size()) });
      if ((((m)localObject).mContainer.getChildCount() == 0) && (localList1.isEmpty()) && (localList2.isEmpty()))
      {
        AppMethodBeat.o(34689);
      }
      else
      {
        localObject = new m.c((byte)0);
        ((m.c)localObject).zwF = new WeakReference(this.zwF.get());
        ((m.c)localObject).zwO = localList1;
        ((m.c)localObject).zwP = localList2;
        al.d((Runnable)localObject);
        AppMethodBeat.o(34689);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.m.a
 * JD-Core Version:    0.6.2
 */