package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class MultiButtonPreference extends Preference
{
  private String pnJ;
  public String pnK;
  private String pnL;
  private View.OnClickListener pnM;
  public View.OnClickListener pnN;
  private View.OnClickListener pnO;

  public MultiButtonPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23650);
    setLayoutResource(2130970409);
    AppMethodBeat.o(23650);
  }

  public MultiButtonPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23649);
    setLayoutResource(2130970409);
    AppMethodBeat.o(23649);
  }

  public final void a(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.pnJ = paramString;
    this.pnM = paramOnClickListener;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23651);
    super.onBindView(paramView);
    Button localButton1 = (Button)paramView.findViewById(2131826658);
    View localView1 = paramView.findViewById(2131826659);
    Button localButton2 = (Button)paramView.findViewById(2131826660);
    View localView2 = paramView.findViewById(2131826661);
    Button localButton3 = (Button)paramView.findViewById(2131826662);
    paramView.setBackgroundColor(0);
    if (!bo.isNullOrNil(this.pnJ))
    {
      localButton1.setVisibility(0);
      localButton1.setText(this.pnJ);
      if (bo.isNullOrNil(this.pnK))
        break label219;
      if (!bo.isNullOrNil(this.pnJ))
        break label211;
      localView1.setVisibility(8);
      label112: localButton2.setVisibility(0);
      localButton2.setText(this.pnK);
      label127: if (bo.isNullOrNil(this.pnL))
        break label244;
      if (!bo.isNullOrNil(this.pnK))
        break label235;
      localView2.setVisibility(8);
      label154: localButton3.setVisibility(0);
      localButton3.setText(this.pnL);
    }
    while (true)
    {
      localButton1.setOnClickListener(this.pnM);
      localButton2.setOnClickListener(this.pnN);
      localButton3.setOnClickListener(this.pnO);
      AppMethodBeat.o(23651);
      return;
      localButton1.setVisibility(8);
      break;
      label211: localView1.setVisibility(0);
      break label112;
      label219: localView1.setVisibility(8);
      localButton2.setVisibility(8);
      break label127;
      label235: localView2.setVisibility(0);
      break label154;
      label244: localView2.setVisibility(8);
      localButton3.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.MultiButtonPreference
 * JD-Core Version:    0.6.2
 */