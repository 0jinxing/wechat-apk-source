package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;

final class SightSettingsUI$a extends BaseAdapter
{
  SightSettingsUI$a(SightSettingsUI paramSightSettingsUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(55282);
    int i = SightSettingsUI.d(this.oDq).size();
    AppMethodBeat.o(55282);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(55283);
    Object localObject = SightSettingsUI.d(this.oDq).get(paramInt);
    AppMethodBeat.o(55283);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(55284);
    paramViewGroup = new TextView(this.oDq);
    paramView = (SightSettingsUI.b)getItem(paramInt);
    paramViewGroup.setText(paramView.oDt + "->:" + paramView.zc(((Integer)SightSettingsUI.b(paramView.oDq).get(paramView.oDw, Integer.valueOf(0))).intValue()));
    paramViewGroup.setGravity(17);
    paramViewGroup.setTextSize(1, 20.0F);
    paramViewGroup.setHeight(a.fromDPToPix(ah.getContext(), 50));
    if (paramInt % 2 == 1)
      paramViewGroup.setBackgroundColor(Color.parseColor("#e2efda"));
    paramViewGroup.setOnClickListener(new SightSettingsUI.a.1(this, paramView));
    AppMethodBeat.o(55284);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI.a
 * JD-Core Version:    0.6.2
 */