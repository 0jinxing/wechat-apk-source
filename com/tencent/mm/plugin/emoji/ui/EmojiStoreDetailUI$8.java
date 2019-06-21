package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.al.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.f.q;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreDetailUI$8
  implements DialogInterface.OnClickListener
{
  EmojiStoreDetailUI$8(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(53427);
    if (com.tencent.mm.plugin.emoji.h.a.JW(EmojiStoreDetailUI.a(this.lbG)))
    {
      ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks stop tuzi downloading");
      com.tencent.mm.plugin.emoji.f.a.bkq().bks();
      if (!TextUtils.isEmpty(EmojiStoreDetailUI.t(this.lbG)))
      {
        f.afx().rO(EmojiStoreDetailUI.t(this.lbG));
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onClickClose] cancel RecvTask. CdnClientId:%s", new Object[] { EmojiStoreDetailUI.t(this.lbG) });
      }
      if ((!com.tencent.mm.plugin.emoji.a.a.e.dR(EmojiStoreDetailUI.b(this.lbG).PackFlag, 1)) && (!com.tencent.mm.plugin.emoji.a.a.e.uc(EmojiStoreDetailUI.b(this.lbG).PackType)))
        break label262;
      EmojiStoreDetailUI.a(this.lbG, 3);
    }
    while (true)
    {
      j.bkn().g(EmojiStoreDetailUI.a(this.lbG), EmojiStoreDetailUI.u(this.lbG), 0, EmojiStoreDetailUI.t(this.lbG));
      EmojiStoreDetailUI.i(this.lbG).setVisibility(8);
      EmojiStoreDetailUI.l(this.lbG).setProgress(0);
      EmojiStoreDetailUI.j(this.lbG).setVisibility(4);
      EmojiStoreDetailUI.h(this.lbG).setVisibility(0);
      EmojiStoreDetailUI.v(this.lbG);
      EmojiStoreDetailUI.g(this.lbG);
      paramDialogInterface = new q(EmojiStoreDetailUI.a(this.lbG), 2);
      g.RO().eJo.a(paramDialogInterface, 0);
      AppMethodBeat.o(53427);
      return;
      g.RO().eJo.c(EmojiStoreDetailUI.s(this.lbG));
      break;
      label262: EmojiStoreDetailUI.a(this.lbG, -1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.8
 * JD-Core Version:    0.6.2
 */