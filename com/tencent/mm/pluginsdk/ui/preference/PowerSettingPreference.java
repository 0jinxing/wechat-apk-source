package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference;

public class PowerSettingPreference extends Preference
{
  private ad ldh;
  private View omq;
  private ImageView pon;
  private ImageView poo;
  private ImageView pop;

  public PowerSettingPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public PowerSettingPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onBindView(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(28114);
    super.onBindView(paramView);
    if (this.ldh == null)
    {
      AppMethodBeat.o(28114);
      return;
    }
    if (this.pon == null)
      this.pon = ((ImageView)paramView.findViewById(2131823088));
    if (this.poo == null)
      this.poo = ((ImageView)paramView.findViewById(2131823087));
    if (this.pop == null)
      this.pop = ((ImageView)paramView.findViewById(2131823086));
    boolean bool1 = this.ldh.Od();
    boolean bool2 = n.qFA.UV(this.ldh.field_username);
    paramView = this.poo;
    if (bool1)
    {
      j = 0;
      label124: paramView.setVisibility(j);
      paramView = this.pop;
      if (!bool2)
        break label189;
      j = 0;
      label143: paramView.setVisibility(j);
      paramView = this.pon;
      if (!this.ldh.Oc())
        break label196;
    }
    label189: label196: for (int j = i; ; j = 8)
    {
      paramView.setVisibility(j);
      AppMethodBeat.o(28114);
      break;
      j = 8;
      break label124;
      j = 8;
      break label143;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28113);
    if (this.omq == null)
    {
      View localView = super.onCreateView(paramViewGroup);
      paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
      paramViewGroup.removeAllViews();
      paramViewGroup.addView(LayoutInflater.from(this.mContext).inflate(2130970413, null), new AbsListView.LayoutParams(-1, -2));
      this.omq = localView;
    }
    paramViewGroup = this.omq;
    AppMethodBeat.o(28113);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.PowerSettingPreference
 * JD-Core Version:    0.6.2
 */