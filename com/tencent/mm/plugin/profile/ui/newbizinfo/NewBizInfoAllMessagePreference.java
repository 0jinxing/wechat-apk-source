package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoAllMessagePreference extends Preference
{
  private MMActivity crP;
  private TextView gne;
  private TextView nDX;
  d ppN;
  private LinearLayout ppR;

  public NewBizInfoAllMessagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23842);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(23842);
  }

  public NewBizInfoAllMessagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23843);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(23843);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23844);
    this.ppR = ((LinearLayout)paramView.findViewById(2131822967));
    this.gne = ((TextView)paramView.findViewById(2131822968));
    this.nDX = ((TextView)paramView.findViewById(2131822969));
    if ((this.ppN != null) && (this.ppN.cbN()))
    {
      this.ppR.setVisibility(0);
      this.gne.setText(this.crP.getString(2131298455));
      this.nDX.setText(this.ppN.field_allArticleWording);
      AppMethodBeat.o(23844);
    }
    while (true)
    {
      return;
      this.ppR.setVisibility(8);
      AppMethodBeat.o(23844);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoAllMessagePreference
 * JD-Core Version:    0.6.2
 */