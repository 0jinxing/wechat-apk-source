package com.tencent.mm.plugin.setting.ui.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.List;

final class SettingsTrustFriendUI$a extends BaseAdapter
{
  private SettingsTrustFriendUI$a(SettingsTrustFriendUI paramSettingsTrustFriendUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(127544);
    int i = SettingsTrustFriendUI.e(this.qpo).size();
    if (SettingsTrustFriendUI.b(this.qpo));
    while (true)
    {
      AppMethodBeat.o(127544);
      return i;
      if (i == 0)
        i = 1;
      else if ((i > 0) && (i < SettingsTrustFriendUI.AN()))
        i += 2;
      else if (i >= SettingsTrustFriendUI.AN())
        i++;
      else
        i = 0;
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(127545);
    Object localObject;
    if (getItemViewType(paramInt) == 0)
    {
      localObject = SettingsTrustFriendUI.e(this.qpo).get(paramInt);
      AppMethodBeat.o(127545);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(127545);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(127546);
    int j = SettingsTrustFriendUI.e(this.qpo).size();
    if ((SettingsTrustFriendUI.b(this.qpo)) || (paramInt < j))
    {
      paramInt = 0;
      AppMethodBeat.o(127546);
    }
    while (true)
    {
      return paramInt;
      if (j == 0)
      {
        AppMethodBeat.o(127546);
        paramInt = i;
      }
      else if (j >= SettingsTrustFriendUI.AN())
      {
        AppMethodBeat.o(127546);
        paramInt = 2;
      }
      else if (paramInt == j)
      {
        AppMethodBeat.o(127546);
        paramInt = i;
      }
      else if (paramInt == j + 1)
      {
        AppMethodBeat.o(127546);
        paramInt = 2;
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(127546);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127547);
    if (paramView == null)
    {
      paramView = this.qpo.getLayoutInflater().inflate(2130970647, null);
      ImageView localImageView = (ImageView)paramView.findViewById(2131827448);
      Object localObject1 = (ImageView)paramView.findViewById(2131827449);
      Object localObject2 = (TextView)paramView.findViewById(2131827450);
      paramViewGroup = new SettingsTrustFriendUI.a.a(this, (byte)0);
      paramViewGroup.qgZ = localImageView;
      paramViewGroup.qpr = ((ImageView)localObject1);
      paramViewGroup.jAJ = ((TextView)localObject2);
      paramView.setTag(paramViewGroup);
      if (getItemViewType(paramInt) != 0)
        break label230;
      localObject1 = (String)SettingsTrustFriendUI.e(this.qpo).get(paramInt);
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject1);
      paramViewGroup.qgZ.setScaleType(ImageView.ScaleType.FIT_XY);
      a.b.b(paramViewGroup.qgZ, (String)localObject1);
      paramViewGroup.jAJ.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.qpo, ((ad)localObject2).Oj(), paramViewGroup.jAJ.getTextSize()));
      if (!SettingsTrustFriendUI.b(this.qpo))
        break label218;
      paramViewGroup.qpr.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(127547);
      return paramView;
      paramViewGroup = (SettingsTrustFriendUI.a.a)paramView.getTag();
      break;
      label218: paramViewGroup.qpr.setVisibility(8);
      continue;
      label230: paramViewGroup.jAJ.setVisibility(4);
      paramViewGroup.qpr.setVisibility(8);
      paramViewGroup.qgZ.setScaleType(ImageView.ScaleType.FIT_XY);
      if (getItemViewType(paramInt) == 1)
        paramViewGroup.qgZ.setImageResource(2130837886);
      else if (getItemViewType(paramInt) == 2)
        paramViewGroup.qgZ.setImageResource(2130837887);
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.a
 * JD-Core Version:    0.6.2
 */