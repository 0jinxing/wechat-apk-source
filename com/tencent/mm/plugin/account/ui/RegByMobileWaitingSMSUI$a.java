package com.tencent.mm.plugin.account.ui;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class RegByMobileWaitingSMSUI$a extends ArrayAdapter<String>
{
  private final LayoutInflater ezi;
  private final ArrayList<String> gHf;

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(125480);
    String str = (String)this.gHf.get(paramInt);
    AppMethodBeat.o(125480);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(125479);
    int i = this.gHf.size();
    AppMethodBeat.o(125479);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(125481);
    if (((Integer)RegByMobileWaitingSMSUI.h(this.gHd).get(paramInt % RegByMobileWaitingSMSUI.h(this.gHd).size())).intValue() % 4 == 0)
    {
      paramInt = 1;
      AppMethodBeat.o(125481);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(125481);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(125478);
    int i = getItemViewType(paramInt);
    label111: int j;
    if (paramView == null)
    {
      paramViewGroup = new RegByMobileWaitingSMSUI.b(this.gHd, (byte)0);
      switch (i)
      {
      default:
        paramView = new IllegalArgumentException("UNIMPLEMENT TYPE");
        AppMethodBeat.o(125478);
        throw paramView;
      case 0:
        paramView = this.ezi.inflate(2130968648, null);
        paramViewGroup.gHg = ((TextView)paramView.findViewById(2131821103));
        paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131821101));
        paramView.setTag(paramViewGroup);
        j = ((Integer)RegByMobileWaitingSMSUI.h(this.gHd).get(paramInt % RegByMobileWaitingSMSUI.h(this.gHd).size())).intValue();
        switch (i)
        {
        default:
        case 0:
        case 1:
        }
        break;
      case 1:
      }
    }
    while (true)
    {
      paramViewGroup.gHg.setText(getItem(paramInt));
      AppMethodBeat.o(125478);
      return paramView;
      paramView = this.ezi.inflate(2130968649, null);
      break;
      paramViewGroup = (RegByMobileWaitingSMSUI.b)paramView.getTag();
      break label111;
      paramViewGroup.gvq.setImageDrawable((Drawable)RegByMobileWaitingSMSUI.i(this.gHd).get(j % RegByMobileWaitingSMSUI.i(this.gHd).size()));
      continue;
      paramViewGroup.gvq.setImageDrawable(RegByMobileWaitingSMSUI.j(this.gHd));
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final void wy(String paramString)
  {
    AppMethodBeat.i(125482);
    this.gHf.add(paramString);
    notifyDataSetChanged();
    AppMethodBeat.o(125482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileWaitingSMSUI.a
 * JD-Core Version:    0.6.2
 */