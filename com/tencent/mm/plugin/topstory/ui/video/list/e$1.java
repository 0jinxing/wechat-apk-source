package com.tencent.mm.plugin.topstory.ui.video.list;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.List;
import java.util.Map;

final class e$1
  implements Runnable
{
  e$1(e parame, List paramList, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2030);
    while (true)
    {
      synchronized (((b)this.sGR.sDo).cGg())
      {
        List localList = ???.cGQ();
        ab.i("MicroMsg.TopStory.TopStoryListVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", new Object[] { Integer.valueOf(localList.size()), Integer.valueOf(this.sEx.size()) });
        if (!this.sEy)
          break label435;
        i = localList.size();
        if (localList.size() <= 0)
          break label398;
        if (!((chw)localList.get(0)).xgS.equals(((chw)this.sEx.get(0)).xgS))
        {
          this.sEx.remove(0);
          localList.addAll(this.sEx);
          if (this.sGR.sGJ)
          {
            this.sGR.aop.notifyChanged();
            ((b)this.sGR.sDo).cFR().e((chw)localList.get(0));
            AppMethodBeat.o(2030);
          }
        }
        else
        {
          localList.clear();
        }
      }
      if ((this.sGR.sGQ != null) && (localObject1 != null) && (localObject1.get(0) != null))
      {
        localObject2 = (chw)localObject1.get(0);
        this.sGR.sGQ.c((chw)localObject2);
        this.sGR.sDn.put(localObject2, this.sGR.sGQ);
        this.sGR.sGQ = null;
        if (((((chw)localObject2).xhd & 0x80) > 0) && (g.RP().Ry().getInt(ac.a.xUO, 0) <= 0))
        {
          localObject2 = this.sGR.sDo.getRecyclerView();
          e.1.1 local1 = new com/tencent/mm/plugin/topstory/ui/video/list/e$1$1;
          local1.<init>(this);
          ((RecyclerView)localObject2).postDelayed(local1, 1000L);
        }
      }
      Object localObject2 = this.sGR;
      ((e)localObject2).at(((e)localObject2).getHeadersCount() + i, this.sEx.size() - i);
      continue;
      label398: localObject1.addAll(this.sEx);
      this.sGR.at(this.sGR.getHeadersCount(), this.sEx.size());
      continue;
      label435: int i = localObject1.size();
      localObject1.addAll(this.sEx);
      e locale = this.sGR;
      locale.at(i + locale.getHeadersCount(), this.sEx.size());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.e.1
 * JD-Core Version:    0.6.2
 */