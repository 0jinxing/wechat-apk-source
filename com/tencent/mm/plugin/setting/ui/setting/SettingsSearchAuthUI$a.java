package com.tencent.mm.plugin.setting.ui.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cmb;
import java.util.List;

final class SettingsSearchAuthUI$a extends BaseAdapter
{
  List<cmb> qnw;

  private SettingsSearchAuthUI$a(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final cmb Cm(int paramInt)
  {
    AppMethodBeat.i(127453);
    cmb localcmb;
    if ((paramInt >= 0) && (paramInt < getCount()))
    {
      localcmb = (cmb)this.qnw.get(paramInt);
      AppMethodBeat.o(127453);
    }
    while (true)
    {
      return localcmb;
      localcmb = null;
      AppMethodBeat.o(127453);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(127452);
    int i;
    if ((this.qnw != null) && (!this.qnw.isEmpty()))
    {
      i = this.qnw.size();
      AppMethodBeat.o(127452);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(127452);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127454);
    if (paramView == null)
    {
      paramView = this.qoM.getLayoutInflater().inflate(2130970632, null);
      paramViewGroup = new a((byte)0);
      paramView.setTag(paramViewGroup);
      paramViewGroup.iPD = ((TextView)paramView.findViewById(2131827384));
      paramViewGroup.qnA = ((TextView)paramView.findViewById(2131827385));
      paramViewGroup.qnB = ((TextView)paramView.findViewById(2131827386));
      paramViewGroup.gzI = ((Button)paramView.findViewById(2131827387));
      paramViewGroup.gzI.setOnClickListener(new SettingsSearchAuthUI.a.1(this, paramInt));
      if (!SettingsSearchAuthUI.f(this.qoM))
        break label198;
      paramViewGroup.gzI.setVisibility(0);
    }
    while (true)
    {
      if (Cm(paramInt) != null)
      {
        paramViewGroup.iPD.setText(Cm(paramInt).fhH);
        paramViewGroup.qnA.setText(Cm(paramInt).xjO);
        paramViewGroup.qnB.setText(SettingsSearchAuthUI.cY(Cm(paramInt).xjN));
      }
      AppMethodBeat.o(127454);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label198: paramViewGroup.gzI.setVisibility(8);
    }
  }

  final class a
  {
    Button gzI;
    TextView iPD;
    TextView qnA;
    TextView qnB;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.a
 * JD-Core Version:    0.6.2
 */