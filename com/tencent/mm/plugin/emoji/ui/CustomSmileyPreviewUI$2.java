package com.tencent.mm.plugin.emoji.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.protocal.protobuf.aic;
import com.tencent.mm.protocal.protobuf.aii;
import com.tencent.mm.protocal.protobuf.yg;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class CustomSmileyPreviewUI$2
  implements Runnable
{
  CustomSmileyPreviewUI$2(CustomSmileyPreviewUI paramCustomSmileyPreviewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138339);
    if ((CustomSmileyPreviewUI.i(this.kYV) != null) && (CustomSmileyPreviewUI.i(this.kYV).wou != null))
    {
      CustomSmileyPreviewUI.j(this.kYV).setVisibility(0);
      CustomSmileyPreviewUI.k(this.kYV).setText(CustomSmileyPreviewUI.i(this.kYV).wou.Name);
      if (bo.isNullOrNil(CustomSmileyPreviewUI.i(this.kYV).wou.IconUrl))
      {
        CustomSmileyPreviewUI.l(this.kYV).setVisibility(8);
        CustomSmileyPreviewUI.m(this.kYV).setText(2131299007);
        CustomSmileyPreviewUI.j(this.kYV).setOnClickListener(new CustomSmileyPreviewUI.2.1(this));
        CustomSmileyPreviewUI.n(this.kYV).setVisibility(8);
        AppMethodBeat.o(138339);
      }
    }
    while (true)
    {
      return;
      CustomSmileyPreviewUI.l(this.kYV).setVisibility(0);
      o.ahp().a(CustomSmileyPreviewUI.i(this.kYV).wou.IconUrl, CustomSmileyPreviewUI.l(this.kYV), g.dJ(CustomSmileyPreviewUI.b(this.kYV).field_groupId, CustomSmileyPreviewUI.i(this.kYV).wou.IconUrl));
      break;
      if ((CustomSmileyPreviewUI.h(this.kYV) != null) && (CustomSmileyPreviewUI.h(this.kYV).woq != null))
      {
        CustomSmileyPreviewUI.j(this.kYV).setVisibility(0);
        CustomSmileyPreviewUI.k(this.kYV).setText(CustomSmileyPreviewUI.h(this.kYV).woq.Name);
        o.ahp().a(CustomSmileyPreviewUI.h(this.kYV).woq.HeadUrl, CustomSmileyPreviewUI.l(this.kYV), g.dI(CustomSmileyPreviewUI.b(this.kYV).field_groupId, CustomSmileyPreviewUI.h(this.kYV).woq.HeadUrl));
        CustomSmileyPreviewUI.n(this.kYV).setVisibility(8);
        AppMethodBeat.o(138339);
      }
      else
      {
        CustomSmileyPreviewUI.j(this.kYV).setVisibility(8);
        AppMethodBeat.o(138339);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI.2
 * JD-Core Version:    0.6.2
 */