package com.tencent.mm.ui;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MultiTalkRoomPopupNav$a
{
  private Button lXI;
  TextView titleView;
  LinearLayout yoZ;

  private MultiTalkRoomPopupNav$a(MultiTalkRoomPopupNav paramMultiTalkRoomPopupNav, boolean paramBoolean)
  {
    AppMethodBeat.i(29772);
    this.lXI = ((Button)paramMultiTalkRoomPopupNav.findViewById(2131826245));
    this.titleView = ((TextView)paramMultiTalkRoomPopupNav.findViewById(2131826241));
    this.yoZ = ((LinearLayout)paramMultiTalkRoomPopupNav.findViewById(2131826240));
    if (paramBoolean)
    {
      this.yoZ.setBackgroundResource(2130839633);
      this.lXI.setTextColor(paramMultiTalkRoomPopupNav.getResources().getColor(2131690294));
      AppMethodBeat.o(29772);
    }
    while (true)
    {
      return;
      this.yoZ.setBackgroundResource(2130839625);
      this.lXI.setTextColor(paramMultiTalkRoomPopupNav.getResources().getColor(2131689817));
      AppMethodBeat.o(29772);
    }
  }

  final void close()
  {
    AppMethodBeat.i(29773);
    this.yoZ.setVisibility(8);
    AppMethodBeat.o(29773);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MultiTalkRoomPopupNav.a
 * JD-Core Version:    0.6.2
 */