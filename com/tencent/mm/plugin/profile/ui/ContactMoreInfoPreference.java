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

public class ContactMoreInfoPreference extends Preference
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

  public ContactMoreInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.plK = 8;
    this.plL = 8;
    this.plM = 8;
    this.plN = 8;
    this.plO = 8;
    this.plP = 8;
  }

  public ContactMoreInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23398);
    this.plK = 8;
    this.plL = 8;
    this.plM = 8;
    this.plN = 8;
    this.plO = 8;
    this.plP = 8;
    setLayoutResource(2130970127);
    AppMethodBeat.o(23398);
  }

  private void cu()
  {
    AppMethodBeat.i(23405);
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
    AppMethodBeat.o(23405);
  }

  public final void AX(int paramInt)
  {
    AppMethodBeat.i(23401);
    this.plL = paramInt;
    cu();
    AppMethodBeat.o(23401);
  }

  public final void AY(int paramInt)
  {
    AppMethodBeat.i(23402);
    this.plM = paramInt;
    cu();
    AppMethodBeat.o(23402);
  }

  public final void AZ(int paramInt)
  {
    AppMethodBeat.i(23403);
    this.plO = paramInt;
    cu();
    AppMethodBeat.o(23403);
  }

  public final void Ba(int paramInt)
  {
    AppMethodBeat.i(23404);
    this.plP = paramInt;
    cu();
    AppMethodBeat.o(23404);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23400);
    this.plE = ((ImageView)paramView.findViewById(2131826041));
    this.plF = ((ImageView)paramView.findViewById(2131826042));
    this.plG = ((ImageView)paramView.findViewById(2131826043));
    this.plH = ((ImageView)paramView.findViewById(2131826044));
    this.plI = ((ImageView)paramView.findViewById(2131826045));
    this.plJ = ((ImageView)paramView.findViewById(2131826046));
    this.klC = ((TextView)paramView.findViewById(2131820678));
    cu();
    super.onBindView(paramView);
    AppMethodBeat.o(23400);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23399);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970157, localViewGroup);
    AppMethodBeat.o(23399);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMoreInfoPreference
 * JD-Core Version:    0.6.2
 */