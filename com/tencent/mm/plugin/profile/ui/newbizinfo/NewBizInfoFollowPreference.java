package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoFollowPreference extends Preference
{
  private MMActivity crP;
  private boolean lyb;
  a plh;
  private TextView ppS;
  private TextView ppT;

  public NewBizInfoFollowPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23851);
    this.lyb = false;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23851);
  }

  public NewBizInfoFollowPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23852);
    this.lyb = false;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23852);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23853);
    this.lyb = true;
    this.ppS = ((TextView)paramView.findViewById(2131822976));
    if (this.ppS.getPaint() != null)
      this.ppS.getPaint().setFakeBoldText(true);
    this.ppT = ((TextView)paramView.findViewById(2131822977));
    if (this.ppT.getPaint() != null)
      this.ppT.getPaint().setFakeBoldText(true);
    if (this.lyb)
    {
      this.ppS.setOnClickListener(new NewBizInfoFollowPreference.1(this));
      this.ppT.setOnClickListener(new NewBizInfoFollowPreference.2(this));
    }
    AppMethodBeat.o(23853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoFollowPreference
 * JD-Core Version:    0.6.2
 */