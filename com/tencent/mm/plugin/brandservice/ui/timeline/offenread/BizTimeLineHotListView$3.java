package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.protocal.protobuf.bfb;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class BizTimeLineHotListView$3
  implements MRecyclerView.a
{
  BizTimeLineHotListView$3(BizTimeLineHotListView paramBizTimeLineHotListView)
  {
  }

  public final void I(View paramView, int paramInt)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(14281);
    paramView = (b)BizTimeLineHotListView.b(this.jQi).get(paramInt);
    if (paramView == null)
    {
      AppMethodBeat.o(14281);
      return;
    }
    Object localObject1 = BizTimeLineHotListView.a(this.jQi);
    Object localObject2;
    if (paramView != null)
    {
      localObject2 = ((e)localObject1).jQC.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        bfb localbfb = (bfb)((Iterator)localObject2).next();
        if (bo.isEqual(localbfb.vNN, paramView.vGE))
        {
          localbfb.wIW = ((int)(System.currentTimeMillis() / 1000L));
          paramInt = j;
          if (paramView.jQz)
            paramInt = 1;
          localbfb.wIV = paramInt;
        }
      }
    }
    while (true)
    {
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Chat_User", paramView.vGE);
      ((Intent)localObject1).putExtra("finish_direct", true);
      ((Intent)localObject1).putExtra("KOpenArticleSceneFromScene", 91);
      ((Intent)localObject1).putExtra("specific_chat_from_scene", 8);
      ((Intent)localObject1).putExtra("preChatTYPE", 12);
      d.f(BizTimeLineHotListView.c(this.jQi), ".ui.chatting.ChattingUI", (Intent)localObject1);
      AppMethodBeat.o(14281);
      break;
      localObject2 = new bfb();
      ((bfb)localObject2).vNN = paramView.vGE;
      ((bfb)localObject2).mXP = (paramView.position - 1);
      ((bfb)localObject2).wIW = ((int)(System.currentTimeMillis() / 1000L));
      paramInt = i;
      if (paramView.jQz)
        paramInt = 1;
      ((bfb)localObject2).wIV = paramInt;
      ((e)localObject1).jQC.add(localObject2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView.3
 * JD-Core Version:    0.6.2
 */