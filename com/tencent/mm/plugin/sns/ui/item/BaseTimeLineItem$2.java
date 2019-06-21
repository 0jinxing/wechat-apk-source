package com.tencent.mm.plugin.sns.ui.item;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class BaseTimeLineItem$2
  implements f.a
{
  BaseTimeLineItem$2(BaseTimeLineItem paramBaseTimeLineItem, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(40116);
    ab.i("MicroMsg.BaseTimeLineItem", "download img %s", new Object[] { paramString });
    if ((!bo.Q(new String[] { (String)this.rhK.rHv.getTag(2131820666), paramString })) && (paramString.equals(h.gj("adId", (String)this.rhK.rHv.getTag(2131820666)))))
    {
      paramString = d.decodeFile(paramString, null);
      if (paramString != null)
        this.rhK.rHv.setImageBitmap(d.a(paramString, true, 0.1F * paramString.getWidth()));
    }
    AppMethodBeat.o(40116);
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.2
 * JD-Core Version:    0.6.2
 */