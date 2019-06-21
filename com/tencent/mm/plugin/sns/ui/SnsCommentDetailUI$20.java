package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

final class SnsCommentDetailUI$20
  implements f.a
{
  SnsCommentDetailUI$20(SnsCommentDetailUI paramSnsCommentDetailUI, SnsAvatarImageView paramSnsAvatarImageView)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(38800);
    ab.i("MicroMsg.SnsCommentDetailUI", "download img %s", new Object[] { paramString });
    if ((!bo.Q(new String[] { (String)this.rqP.getTag(2131820666), paramString })) && (paramString.equals(h.gj("adId", (String)this.rqP.getTag(2131820666)))))
    {
      paramString = d.decodeFile(paramString, null);
      if (paramString != null)
        this.rqP.setImageBitmap(paramString);
    }
    AppMethodBeat.o(38800);
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.20
 * JD-Core Version:    0.6.2
 */