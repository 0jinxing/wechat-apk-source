package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoLoadingPreference extends Preference
{
  private MMActivity crP;
  private View gbS;
  private TextView hrg;
  private boolean lyb;
  private d ppN;
  private ProgressBar ppY;
  private boolean ppZ;
  private int state;

  public NewBizInfoLoadingPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23864);
    this.ppZ = false;
    this.state = 1;
    this.lyb = false;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23864);
  }

  public NewBizInfoLoadingPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23865);
    this.ppZ = false;
    this.state = 1;
    this.lyb = false;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23865);
  }

  private void cbv()
  {
    AppMethodBeat.i(23869);
    if ((this.ppN != null) && (this.ppN.cbP()))
    {
      this.state = 2;
      AppMethodBeat.o(23869);
    }
    while (true)
    {
      return;
      if (this.ppZ)
      {
        this.state = 3;
        AppMethodBeat.o(23869);
      }
      else if (this.ppN != null)
      {
        this.state = 0;
        AppMethodBeat.o(23869);
      }
      else
      {
        this.state = 1;
        AppMethodBeat.o(23869);
      }
    }
  }

  private void initView()
  {
    AppMethodBeat.i(23867);
    if (!this.lyb)
      AppMethodBeat.o(23867);
    while (true)
    {
      return;
      if (this.state == 1)
      {
        this.gbS.setVisibility(0);
        this.ppY.setVisibility(0);
        this.hrg.setVisibility(8);
        AppMethodBeat.o(23867);
      }
      else if (this.state == 2)
      {
        this.gbS.setVisibility(0);
        SpannableString localSpannableString = j.d(this.crP, this.ppN.field_newBanReason, (int)this.hrg.getTextSize());
        this.hrg.setText(localSpannableString);
        this.hrg.setMovementMethod(LinkMovementMethod.getInstance());
        this.hrg.setVisibility(0);
        this.ppY.setVisibility(8);
        AppMethodBeat.o(23867);
      }
      else if (this.state == 3)
      {
        this.gbS.setVisibility(0);
        this.hrg.setText(this.crP.getString(2131298735));
        this.hrg.setVisibility(0);
        this.ppY.setVisibility(8);
        AppMethodBeat.o(23867);
      }
      else
      {
        this.gbS.setVisibility(8);
        AppMethodBeat.o(23867);
      }
    }
  }

  public final void a(d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(23868);
    this.ppN = paramd;
    this.ppZ = paramBoolean;
    cbv();
    initView();
    AppMethodBeat.o(23868);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23866);
    this.gbS = paramView.findViewById(2131823041);
    this.hrg = ((TextView)paramView.findViewById(2131823043));
    this.ppY = ((ProgressBar)paramView.findViewById(2131823042));
    this.lyb = true;
    initView();
    AppMethodBeat.o(23866);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoLoadingPreference
 * JD-Core Version:    0.6.2
 */