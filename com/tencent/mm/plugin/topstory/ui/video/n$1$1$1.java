package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.LinearLayoutManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class n$1$1$1
  implements Runnable
{
  n$1$1$1(n.1.1 param1, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1755);
    while (true)
      synchronized (this.sFi.sFg.sFe)
      {
        List localList = this.sFi.sFg.sFe.cGQ();
        if ((!bo.ek(this.sFh)) && (!bo.ek(localList)) && ((this.sFi.sFg.sFe.sDo.getLayoutManager() instanceof LinearLayoutManager)))
        {
          chw localchw = (chw)this.sFh.get(0);
          int i = 0;
          if (i < localList.size())
          {
            if (((chw)localList.get(i)).xgS.equals(localchw.xgS))
            {
              ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "Fail insert. code=item exist");
              AppMethodBeat.o(1755);
              return;
            }
            i++;
          }
          else
          {
            int j = ((chw)this.sFh.get(0)).voe;
            int k = this.sFi.sFg.sFe.sDo.cFY();
            int m = this.sFi.sFg.sFe.sDo.cGa().getHeadersCount();
            i = ((LinearLayoutManager)this.sFi.sFg.sFe.sDo.getLayoutManager()).iS();
            int n = localList.size() - 1;
            if (k == n)
            {
              ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "Fail insert. code=last pos");
              AppMethodBeat.o(1755);
            }
            else if ((j <= k) || (j > n + 1))
            {
              j = i - m + 1;
              i = j;
              if (j <= 0)
                i = k + 1;
              j = i;
              if (i > localList.size())
                j = localList.size();
              localList.add(j, localchw);
              ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "insert success pos:%s, vid[%s], title:%s", new Object[] { Integer.valueOf(j), localchw.xgS, localchw.title });
              this.sFi.sFg.sFe.sDo.cGa().ch(j + m);
              AppMethodBeat.o(1755);
            }
          }
        }
        else
        {
          ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "Fail insert. code=result list or curlist is null");
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n.1.1.1
 * JD-Core Version:    0.6.2
 */