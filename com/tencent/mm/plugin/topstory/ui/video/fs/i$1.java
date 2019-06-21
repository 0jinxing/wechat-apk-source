package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.List;
import java.util.Map;

final class i$1
  implements Runnable
{
  i$1(i parami, List paramList, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2008);
    while (true)
    {
      synchronized (this.sGL.sDN.cGg())
      {
        Object localObject1 = ???.cGQ();
        ab.i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", new Object[] { Integer.valueOf(((List)localObject1).size()), Integer.valueOf(this.sEx.size()) });
        if (!this.sEy)
          break label373;
        i = ((List)localObject1).size();
        if (((List)localObject1).size() > 0)
        {
          ((List)localObject1).clear();
          ((List)localObject1).addAll(this.sEx);
          if (this.sGL.sGJ)
          {
            this.sGL.aop.notifyChanged();
            this.sGL.sDN.cFR().e((chw)this.sEx.get(0));
            AppMethodBeat.o(2008);
            return;
          }
          if ((this.sGL.sGK != null) && (localObject1 != null) && (((List)localObject1).get(0) != null))
          {
            localObject1 = (chw)((List)localObject1).get(0);
            this.sGL.sGK.c((chw)localObject1);
            this.sGL.sDn.put(localObject1, this.sGL.sGK);
            this.sGL.sGK = null;
            if (((((chw)localObject1).xhd & 0x80) > 0) && (com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xUO, 0) <= 0))
            {
              RecyclerView localRecyclerView = this.sGL.sDo.getRecyclerView();
              localObject1 = new com/tencent/mm/plugin/topstory/ui/video/fs/i$1$1;
              ((i.1.1)localObject1).<init>(this);
              localRecyclerView.postDelayed((Runnable)localObject1, 1000L);
            }
          }
          localObject1 = this.sGL;
          ((i)localObject1).at(((i)localObject1).getHeadersCount() + i, this.sEx.size() - i);
        }
      }
      localObject2.addAll(this.sEx);
      this.sGL.at(this.sGL.getHeadersCount(), this.sEx.size());
      continue;
      label373: int i = localObject2.size();
      localObject2.addAll(this.sEx);
      i locali = this.sGL;
      locali.cg(locali.getHeadersCount() + i);
      locali = this.sGL;
      locali.at(i + locali.getHeadersCount(), this.sEx.size());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.i.1
 * JD-Core Version:    0.6.2
 */