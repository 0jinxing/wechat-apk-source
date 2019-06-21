package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.text.TextUtils;
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
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class bc$6
  implements View.OnClickListener
{
  bc$6(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39867);
    ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener");
    if (!(paramView.getTag() instanceof q))
      AppMethodBeat.o(39867);
    while (true)
    {
      return;
      Object localObject = (q)paramView.getTag();
      paramView = ((q)localObject).rin;
      if (paramView.xfI.wbK.size() > 0)
      {
        localObject = af.cnF().YT(((q)localObject).cwT);
        if (this.rDG.rhQ != null)
          this.rDG.rhQ.cnj().x((n)localObject);
        paramView = ((bau)paramView.xfI.wbK.get(0)).rik;
        Intent localIntent = new Intent();
        localIntent.putExtra("key_from_scene", 12);
        if (!TextUtils.isEmpty(paramView))
        {
          localObject = paramView.split("#");
          if (localObject.length >= 2)
          {
            ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData[0]:" + localObject[0]);
            localIntent.putExtra("key_card_id", localObject[0]);
            localIntent.putExtra("key_card_ext", localObject[1]);
            d.b(this.rDG.context, "card", ".ui.CardDetailUI", localIntent);
            AppMethodBeat.o(39867);
          }
          else if (localObject.length == 1)
          {
            ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include cardExt");
            ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener card_id :".concat(String.valueOf(paramView)));
            localIntent.putExtra("key_card_id", localObject[0]);
            localIntent.putExtra("key_card_ext", "");
            d.b(this.rDG.context, "card", ".ui.CardDetailUI", localIntent);
            AppMethodBeat.o(39867);
          }
          else
          {
            ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include card_id and cardExt");
            ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData :".concat(String.valueOf(paramView)));
            AppMethodBeat.o(39867);
          }
        }
        else
        {
          ab.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData is empty");
        }
      }
      else
      {
        AppMethodBeat.o(39867);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.6
 * JD-Core Version:    0.6.2
 */