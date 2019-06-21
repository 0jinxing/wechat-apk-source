package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class a$1
  implements f.a
{
  a$1(a parama, a.a parama1)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(40128);
    ab.i("MiroMsg.CardAdTimeLineItem", "download img %s", new Object[] { paramString });
    if ((!bo.Q(new String[] { (String)this.rIB.rGM.getTag(), paramString })) && (paramString.equals(h.gj("adId", (String)this.rIB.rGM.getTag()))))
    {
      paramString = d.decodeFile(paramString, null);
      if (paramString != null)
      {
        this.rIB.rGM.setVisibility(0);
        this.rIB.rIJ.setImageBitmap(paramString);
        this.rIB.rIJ.setVisibility(0);
      }
    }
    AppMethodBeat.o(40128);
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.a.1
 * JD-Core Version:    0.6.2
 */