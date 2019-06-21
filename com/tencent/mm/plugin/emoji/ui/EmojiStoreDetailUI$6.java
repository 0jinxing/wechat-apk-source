package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class EmojiStoreDetailUI$6
  implements View.OnClickListener
{
  EmojiStoreDetailUI$6(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53425);
    paramView = new Intent();
    paramView.setClass(this.lbG.mController.ylL, EmojiStoreV2DesignerUI.class);
    paramView.putExtra("uin", EmojiStoreDetailUI.b(this.lbG).PersonalDesigner.DesignerUin);
    paramView.putExtra("name", EmojiStoreDetailUI.b(this.lbG).PersonalDesigner.Name);
    paramView.putExtra("headurl", EmojiStoreDetailUI.b(this.lbG).PersonalDesigner.HeadUrl);
    paramView.putExtra("rediret_url", EmojiStoreDetailUI.b(this.lbG).OldRedirectUrl);
    paramView.putExtra("searchID", EmojiStoreDetailUI.d(this.lbG));
    paramView.putExtra("extra_scence", 26);
    this.lbG.mController.ylL.startActivity(paramView);
    AppMethodBeat.o(53425);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.6
 * JD-Core Version:    0.6.2
 */