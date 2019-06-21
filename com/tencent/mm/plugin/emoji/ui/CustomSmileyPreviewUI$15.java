package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.protocal.protobuf.aic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CustomSmileyPreviewUI$15
  implements View.OnClickListener
{
  CustomSmileyPreviewUI$15(CustomSmileyPreviewUI paramCustomSmileyPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138345);
    if ((CustomSmileyPreviewUI.h(this.kYV) != null) && (CustomSmileyPreviewUI.h(this.kYV).woq != null))
    {
      paramView = new Intent();
      paramView.setClass(this.kYV.mController.ylL, EmojiStoreV2DesignerUI.class);
      paramView.putExtra("uin", CustomSmileyPreviewUI.h(this.kYV).woq.DesignerUin);
      paramView.putExtra("name", CustomSmileyPreviewUI.h(this.kYV).woq.Name);
      paramView.putExtra("headurl", CustomSmileyPreviewUI.h(this.kYV).woq.HeadUrl);
      paramView.putExtra("extra_scence", 9);
      this.kYV.mController.ylL.startActivity(paramView);
      AppMethodBeat.o(138345);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "simple designer info is null");
      AppMethodBeat.o(138345);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.15
 * JD-Core Version:    0.6.2
 */