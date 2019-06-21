package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class e extends RecyclerView.a<h>
{
  protected android.support.v4.f.n<View> sDl = new android.support.v4.f.n();
  protected android.support.v4.f.n<View> sDm = new android.support.v4.f.n();
  public Map<chw, h> sDn = new HashMap();
  public b sDo;

  public e(b paramb)
  {
    this.sDo = paramb;
  }

  public int FG(int paramInt)
  {
    return 1;
  }

  public final boolean FH(int paramInt)
  {
    if (paramInt < this.sDl.size());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean FI(int paramInt)
  {
    if (paramInt >= this.sDl.size() + this.sDo.cGg().cGR());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void addHeaderView(View paramView)
  {
    this.sDl.put(this.sDl.size() + 100000, paramView);
  }

  public final h b(chw paramchw)
  {
    h localh;
    if (this.sDn.containsKey(paramchw))
    {
      localh = (h)this.sDn.get(paramchw);
      if ((localh == null) || (localh.sAX == null) || (localh.sAX != paramchw));
    }
    for (paramchw = localh; ; paramchw = null)
    {
      return paramchw;
      this.sDn.remove(paramchw);
      ab.i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "getViewHolderByVideoInfo not match");
    }
  }

  public final void cGm()
  {
    this.sDm.clear();
  }

  public final void ei(View paramView)
  {
    this.sDm.put(this.sDm.size() + 200000, paramView);
  }

  public final int getFootersCount()
  {
    return this.sDm.size();
  }

  public final int getHeadersCount()
  {
    return this.sDl.size();
  }

  public final int getItemCount()
  {
    return this.sDo.cGg().cGR() + this.sDl.size() + this.sDm.size();
  }

  public final int getItemViewType(int paramInt)
  {
    if (FH(paramInt))
      paramInt = this.sDl.keyAt(paramInt);
    while (true)
    {
      return paramInt;
      if (FI(paramInt))
        paramInt = this.sDm.keyAt(paramInt - this.sDl.size() - this.sDo.cGg().cGR());
      else
        paramInt = FG(paramInt);
    }
  }

  protected void j(List<chw> paramList, boolean paramBoolean)
  {
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "callbackToSuccess %d %b", new Object[] { Integer.valueOf(paramList.size()), Boolean.valueOf(paramBoolean) });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.e
 * JD-Core Version:    0.6.2
 */