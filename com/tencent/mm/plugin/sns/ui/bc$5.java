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
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class bc$5
  implements View.OnClickListener
{
  bc$5(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39866);
    ab.i("MicroMsg.TimeLineClickEvent", "hardMallProductRedirectListener");
    if (!(paramView.getTag() instanceof q))
      AppMethodBeat.o(39866);
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
        localObject = ((bau)paramView.xfI.wbK.get(0)).rik;
        paramView = new Intent();
        paramView.putExtra("key_product_scene", 2);
        paramView.putExtra("key_product_info", (String)localObject);
        d.b(this.rDG.context, "product", ".ui.MallProductUI", paramView);
      }
      AppMethodBeat.o(39866);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.5
 * JD-Core Version:    0.6.2
 */