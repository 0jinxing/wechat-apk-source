package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.f;
import java.util.List;

final class MoreShareAppUI$a extends ArrayAdapter<f>
{
  private List<f> kSg;
  private Context mContext;

  public MoreShareAppUI$a(Context paramContext, List<f> paramList)
  {
    super(paramContext, 2130970245, paramList);
    this.mContext = paramContext;
    this.kSg = paramList;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(34887);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130970245, null);
      paramViewGroup = new MoreShareAppUI.a.a(paramView);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      f localf = (f)getItem(paramInt);
      paramViewGroup.gnB.setText(localf.field_appName);
      paramView.setVisibility(0);
      AppMethodBeat.o(34887);
      return paramView;
      paramViewGroup = (MoreShareAppUI.a.a)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MoreShareAppUI.a
 * JD-Core Version:    0.6.2
 */