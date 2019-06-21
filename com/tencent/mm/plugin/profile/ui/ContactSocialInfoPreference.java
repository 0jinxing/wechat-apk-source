package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactSocialInfoPreference extends Preference
{
  private TextView klC;
  private ImageView plE;
  private ImageView plF;
  private ImageView plG;
  private ImageView plH;
  private ImageView plI;
  private ImageView plJ;
  private int plK;
  private int plL;
  private int plM;
  private int plN;
  private int plO;
  private int plP;

  public ContactSocialInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.plK = 8;
    this.plL = 8;
    this.plM = 8;
    this.plN = 8;
    this.plO = 8;
    this.plP = 8;
  }

  public ContactSocialInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23431);
    this.plK = 8;
    this.plL = 8;
    this.plM = 8;
    this.plN = 8;
    this.plO = 8;
    this.plP = 8;
    setLayoutResource(2130970127);
    AppMethodBeat.o(23431);
  }

  private void cu()
  {
    AppMethodBeat.i(23439);
    if (this.plE != null)
      this.plE.setVisibility(this.plK);
    if (this.plF != null)
      this.plF.setVisibility(this.plL);
    if (this.plG != null)
      this.plG.setVisibility(this.plM);
    if (this.plH != null)
      this.plH.setVisibility(this.plN);
    if (this.plI != null)
      this.plI.setVisibility(this.plO);
    if (this.klC != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.klC.getLayoutParams();
      localLayoutParams.width = a.al(this.mContext, 2131427668);
      this.klC.setLayoutParams(localLayoutParams);
    }
    if (this.plJ != null)
      this.plJ.setVisibility(this.plP);
    AppMethodBeat.o(23439);
  }

  public final void AX(int paramInt)
  {
    AppMethodBeat.i(23435);
    this.plL = paramInt;
    cu();
    AppMethodBeat.o(23435);
  }

  public final void AY(int paramInt)
  {
    AppMethodBeat.i(23436);
    this.plM = paramInt;
    cu();
    AppMethodBeat.o(23436);
  }

  public final void AZ(int paramInt)
  {
    AppMethodBeat.i(23437);
    this.plO = paramInt;
    cu();
    AppMethodBeat.o(23437);
  }

  public final void Ba(int paramInt)
  {
    AppMethodBeat.i(23438);
    this.plP = paramInt;
    cu();
    AppMethodBeat.o(23438);
  }

  public final void Bb(int paramInt)
  {
    AppMethodBeat.i(23434);
    this.plK = paramInt;
    cu();
    AppMethodBeat.o(23434);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23433);
    this.plE = ((ImageView)paramView.findViewById(2131826041));
    this.plF = ((ImageView)paramView.findViewById(2131826042));
    this.plG = ((ImageView)paramView.findViewById(2131826043));
    this.plH = ((ImageView)paramView.findViewById(2131826044));
    this.plI = ((ImageView)paramView.findViewById(2131826045));
    this.plJ = ((ImageView)paramView.findViewById(2131826046));
    this.klC = ((TextView)paramView.findViewById(2131820678));
    cu();
    super.onBindView(paramView);
    AppMethodBeat.o(23433);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23432);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970169, localViewGroup);
    AppMethodBeat.o(23432);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactSocialInfoPreference
 * JD-Core Version:    0.6.2
 */