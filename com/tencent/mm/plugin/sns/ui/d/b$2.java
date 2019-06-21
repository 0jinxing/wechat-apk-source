package com.tencent.mm.plugin.sns.ui.d;

import android.content.Intent;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.widget.b.a;

final class b$2
  implements View.OnLongClickListener
{
  b$2(b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(40242);
    String str = (String)paramView.getTag();
    ab.d("MicroMsg.TimelineClickListener", "onCommentLongClick:".concat(String.valueOf(str)));
    if (bo.isNullOrNil(str))
      AppMethodBeat.o(40242);
    for (boolean bool = true; ; bool = true)
    {
      return bool;
      if (!str.equals(af.cnk()))
        break;
      AppMethodBeat.o(40242);
    }
    Object localObject;
    label98: n localn;
    if ((((MaskImageButton)paramView).eSe != null) && ((((MaskImageButton)paramView).eSe instanceof String)))
    {
      localObject = (String)((MaskImageButton)paramView).eSe;
      new Intent();
      localn = af.cnF().YT((String)localObject);
      if ((localn == null) || (!localn.DI(32)))
        break label256;
    }
    label256: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        AppMethodBeat.o(40242);
        bool = false;
        break;
        localObject = "";
        break label98;
      }
      a locala = new a(this.rKt.activity, paramView);
      locala.zRZ = new b.2.1(this);
      locala.rBm = new b.2.2(this, localn, str, (String)localObject);
      localObject = new int[2];
      if ((paramView.getTag(2131820679) instanceof int[]))
        localObject = (int[])paramView.getTag(2131820679);
      locala.dn(localObject[0], localObject[1]);
      AppMethodBeat.o(40242);
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.2
 * JD-Core Version:    0.6.2
 */