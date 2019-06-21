package com.tencent.mm.plugin.expt.roomexpt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomExptDebugUI$6 extends ArrayAdapter
{
  RoomExptDebugUI$6(RoomExptDebugUI paramRoomExptDebugUI, Context paramContext)
  {
    super(paramContext, 2130970529, 2131827158);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(73596);
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    paramViewGroup = (TextView)paramView.findViewById(2131827158);
    if (paramInt % 2 == 0)
      paramViewGroup.setBackgroundResource(2131690683);
    while (true)
    {
      AppMethodBeat.o(73596);
      return paramView;
      paramViewGroup.setBackgroundResource(2131690597);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI.6
 * JD-Core Version:    0.6.2
 */