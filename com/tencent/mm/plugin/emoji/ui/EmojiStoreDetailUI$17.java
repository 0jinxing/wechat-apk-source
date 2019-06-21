package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;

final class EmojiStoreDetailUI$17
  implements View.OnClickListener
{
  EmojiStoreDetailUI$17(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53434);
    paramView = new Intent();
    paramView.setClass(this.lbG, EmojiStoreV2RewardUI.class);
    paramView.putExtra("extra_id", EmojiStoreDetailUI.a(this.lbG));
    paramView.putExtra("extra_name", EmojiStoreDetailUI.b(this.lbG).PackName);
    if ((EmojiStoreDetailUI.b(this.lbG) != null) && (EmojiStoreDetailUI.b(this.lbG).PersonalDesigner != null))
      paramView.putExtra("name", EmojiStoreDetailUI.b(this.lbG).PersonalDesigner.Name);
    paramView.putExtra("scene", EmojiStoreDetailUI.c(this.lbG));
    paramView.putExtra("pageType", 1);
    paramView.putExtra("searchID", EmojiStoreDetailUI.d(this.lbG));
    this.lbG.startActivity(paramView);
    h.pYm.e(12738, new Object[] { EmojiStoreDetailUI.a(this.lbG), Integer.valueOf(1), Integer.valueOf(EmojiStoreDetailUI.c(this.lbG)), Integer.valueOf(0) });
    AppMethodBeat.o(53434);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.17
 * JD-Core Version:    0.6.2
 */