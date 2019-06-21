package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMFormInputView;

final class EmojiStoreV2RewardUI$2
  implements View.OnClickListener
{
  EmojiStoreV2RewardUI$2(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53696);
    if (EmojiStoreV2RewardUI.d(this.leK) != null)
    {
      paramView = EmojiStoreV2RewardUI.d(this.leK).uk(0);
      if (EmojiStoreV2RewardUI.e(this.leK).getText() != null)
      {
        paramView.Number = EmojiStoreV2RewardUI.e(this.leK).getText().toString();
        EmojiStoreV2RewardUI.a(this.leK, EmojiStoreV2RewardUI.f(this.leK), paramView);
        AppMethodBeat.o(53696);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.emoji.EmojiStoreV2RewardUI", "mRewardInputView is null");
      AppMethodBeat.o(53696);
      continue;
      ab.w("MicroMsg.emoji.EmojiStoreV2RewardUI", "mAdapter is null.");
      AppMethodBeat.o(53696);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.2
 * JD-Core Version:    0.6.2
 */