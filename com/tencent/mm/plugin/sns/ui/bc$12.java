package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.i.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import java.util.LinkedList;

final class bc$12
  implements View.OnClickListener
{
  bc$12(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39875);
    if (!(paramView.getTag() instanceof q))
      AppMethodBeat.o(39875);
    while (true)
    {
      return;
      Object localObject1 = (q)paramView.getTag();
      Object localObject2 = ((q)localObject1).rin;
      if (((TimeLineObject)localObject2).xfI.wbK.size() > 0)
      {
        localObject1 = af.cnF().YT(((q)localObject1).cwT);
        if (this.rDG.rhQ != null)
          this.rDG.rhQ.cnj().x((n)localObject1);
        localObject1 = ((bau)((TimeLineObject)localObject2).xfI.wbK.get(0)).rik;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
        ((Intent)localObject2).putExtra("preceding_scence", 10);
        ((Intent)localObject2).putExtra("download_entrance_scene", 13);
        d.b(paramView.getContext(), "emoji", ".ui.EmojiStoreDetailUI", (Intent)localObject2);
      }
      AppMethodBeat.o(39875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.12
 * JD-Core Version:    0.6.2
 */