package com.tencent.mm.ui.chatting.f;

import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.l.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements c<bi>
{
  private SparseArray<bi> yYk;

  public a(SparseArray<bi> paramSparseArray)
  {
    this.yYk = paramSparseArray;
  }

  public final void a(d.a parama, e<bi> parame, d.d<bi> paramd, d.b paramb)
  {
    AppMethodBeat.i(32477);
    Object localObject = com.tencent.mm.ui.chatting.j.a.yZE;
    switch (com.tencent.mm.ui.chatting.j.a.1.yZG[paramd.yYA.ordinal()])
    {
    default:
      if (parame == null)
      {
        ab.e("MicroMsg.ChattingLoader.ChattingDataCallback", "[load] null == source!");
        paramb.dY();
        AppMethodBeat.o(32477);
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      localObject = ((com.tencent.mm.ui.chatting.j.a)localObject).yZF;
      localObject[0] += 1;
      break;
      localObject = ((com.tencent.mm.ui.chatting.j.a)localObject).yZF;
      localObject[1] += 1;
      break;
      localObject = ((com.tencent.mm.ui.chatting.j.a)localObject).yZF;
      localObject[2] += 1;
      break;
      if ((paramd.yYz != null) && (paramd.yYz.getInt("SCENE") == 1))
      {
        localObject = ((com.tencent.mm.ui.chatting.j.a)localObject).yZF;
        localObject[3] += 1;
        break;
      }
      localObject = ((com.tencent.mm.ui.chatting.j.a)localObject).yZF;
      localObject[4] += 1;
      break;
      parame.a(new a.1(this, parame, paramd, parama, paramb));
      AppMethodBeat.o(32477);
    }
  }

  public final SparseArray<bi> fd(List<bi> paramList)
  {
    AppMethodBeat.i(32478);
    Object localObject = paramList;
    if (paramList == null)
    {
      localObject = new LinkedList();
      ab.e("MicroMsg.ChattingLoader.ChattingDataCallback", "[fillData] list is null!");
    }
    this.yYk.clear();
    paramList = ((List)localObject).iterator();
    for (int i = 0; paramList.hasNext(); i++)
      this.yYk.put(i, paramList.next());
    paramList = this.yYk;
    AppMethodBeat.o(32478);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.f.a
 * JD-Core Version:    0.6.2
 */