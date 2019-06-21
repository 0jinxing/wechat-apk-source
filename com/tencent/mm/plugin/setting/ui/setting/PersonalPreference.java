package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference;

public class PersonalPreference extends Preference
{
  private String cIR;
  private String dFl;
  private TextView emg;
  Bitmap fru;
  ImageView moN;
  private TextView qkY;
  int qkZ;
  String qla;
  private View.OnClickListener qlb;
  private String username;

  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.emg = null;
    this.qkY = null;
    this.moN = null;
    this.fru = null;
    this.qkZ = -1;
    this.qla = null;
  }

  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126972);
    this.emg = null;
    this.qkY = null;
    this.moN = null;
    this.fru = null;
    this.qkZ = -1;
    this.qla = null;
    setLayoutResource(2130970127);
    setWidgetLayoutResource(2130970202);
    AppMethodBeat.o(126972);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(126974);
    if (this.moN == null)
      this.moN = ((ImageView)paramView.findViewById(2131822184));
    if (this.fru != null)
    {
      this.moN.setImageBitmap(this.fru);
      this.moN.setOnClickListener(this.qlb);
      if ((this.emg != null) && (this.cIR != null))
        this.emg.setText(j.b(this.mContext, this.cIR, this.emg.getTextSize()));
      if (this.qkY != null)
        if (!bo.isNullOrNil(this.dFl))
          break label230;
    }
    label230: for (String str = this.username; ; str = this.dFl)
    {
      if ((bo.isNullOrNil(this.dFl)) && (ad.aoA(this.username)))
        this.qkY.setVisibility(8);
      this.qkY.setText(this.mContext.getString(2131296930) + str);
      super.onBindView(paramView);
      AppMethodBeat.o(126974);
      return;
      if (this.qkZ > 0)
      {
        this.moN.setImageResource(this.qkZ);
        break;
      }
      if (this.qla == null)
        break;
      a.b.b(this.moN, this.qla);
      break;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(126973);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970159, paramViewGroup);
    AppMethodBeat.o(126973);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PersonalPreference
 * JD-Core Version:    0.6.2
 */