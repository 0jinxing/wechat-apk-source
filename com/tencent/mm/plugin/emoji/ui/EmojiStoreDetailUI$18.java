package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;

final class EmojiStoreDetailUI$18
  implements View.OnClickListener
{
  EmojiStoreDetailUI$18(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53435);
    paramView = new Intent();
    paramView.setClass(this.lbG, EmojiStoreV2RewardDetailUI.class);
    paramView.putExtra("extra_id", EmojiStoreDetailUI.a(this.lbG));
    paramView.putExtra("extra_iconurl", EmojiStoreDetailUI.b(this.lbG).IconUrl);
    paramView.putExtra("extra_name", EmojiStoreDetailUI.b(this.lbG).PackName);
    if (EmojiStoreDetailUI.b(this.lbG).PersonalDesigner != null)
      paramView.putExtra("name", EmojiStoreDetailUI.b(this.lbG).PersonalDesigner.Name);
    this.lbG.startActivity(paramView);
    AppMethodBeat.o(53435);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.18
 * JD-Core Version:    0.6.2
 */