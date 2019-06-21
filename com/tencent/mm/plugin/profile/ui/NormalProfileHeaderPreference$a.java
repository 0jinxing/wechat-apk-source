package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.preference.FMessageListView;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class NormalProfileHeaderPreference$a
{
  TextView niS;
  TextView nrD;
  private View pnV;
  private View pnW;
  private View pnX;
  private View pnY;
  private View pnZ;
  private View poa;
  ImageView pob;
  TextView poc;
  MMNeat7extView pod;
  TextView poe;
  TextView pof;
  TextView pog;
  TextView poh;
  TextView poi;
  ImageView poj;
  FMessageListView pok;
  private View pol;
  private LinearLayout pom;
  ImageView pon;
  ImageView poo;
  ImageView pop;
  View poq;
  private ImageView por;
  View pot;
  private View pou;

  NormalProfileHeaderPreference$a(NormalProfileHeaderPreference paramNormalProfileHeaderPreference, View paramView)
  {
    AppMethodBeat.i(23655);
    this.pnV = null;
    this.pnW = null;
    this.pnX = null;
    this.pnY = null;
    this.pnZ = null;
    this.poa = null;
    this.pob = null;
    this.niS = null;
    this.poc = null;
    this.pod = null;
    this.poe = null;
    this.nrD = null;
    this.pof = null;
    this.pog = null;
    this.poh = null;
    this.poi = null;
    this.poj = null;
    this.pom = null;
    this.poq = paramView.findViewById(2131823097);
    this.pok = ((FMessageListView)paramView.findViewById(2131823101));
    this.pol = paramView.findViewById(2131823100);
    this.pnV = paramView.findViewById(2131823104);
    this.pnW = paramView.findViewById(2131823105);
    this.pnX = paramView.findViewById(2131823102);
    this.pnZ = paramView.findViewById(2131823103);
    this.poa = paramView.findViewById(2131823106);
    this.pnY = paramView.findViewById(2131823108);
    this.poj = ((ImageView)paramView.findViewById(2131823083));
    this.poe = ((TextView)paramView.findViewById(2131823091));
    this.pod = ((MMNeat7extView)paramView.findViewById(2131823084));
    this.niS = ((TextView)paramView.findViewById(2131823090));
    this.poc = ((TextView)paramView.findViewById(2131823089));
    this.pob = ((ImageView)paramView.findViewById(2131823085));
    this.nrD = ((TextView)paramView.findViewById(2131823092));
    this.pof = ((TextView)paramView.findViewById(2131823093));
    this.pog = ((TextView)paramView.findViewById(2131823095));
    this.poh = ((TextView)paramView.findViewById(2131823094));
    this.poi = ((TextView)paramView.findViewById(2131823096));
    this.pon = ((ImageView)paramView.findViewById(2131823088));
    this.poo = ((ImageView)paramView.findViewById(2131823087));
    this.pop = ((ImageView)paramView.findViewById(2131823086));
    this.por = ((ImageView)paramView.findViewById(2131823080));
    this.pot = paramView.findViewById(2131823079);
    this.pou = paramView.findViewById(2131823082);
    this.pom = ((LinearLayout)paramView.findViewById(2131823081));
    this.poq.findViewById(2131823098).setOnClickListener(paramNormalProfileHeaderPreference);
    this.poq.findViewById(2131823099).setOnClickListener(paramNormalProfileHeaderPreference);
    this.poa.setOnClickListener(paramNormalProfileHeaderPreference);
    this.pnY.setOnClickListener(paramNormalProfileHeaderPreference);
    this.poj.setOnClickListener(paramNormalProfileHeaderPreference);
    this.pnV.setOnClickListener(paramNormalProfileHeaderPreference);
    this.pnW.setOnClickListener(paramNormalProfileHeaderPreference);
    this.pnX.setOnClickListener(paramNormalProfileHeaderPreference);
    this.pnZ.setOnClickListener(paramNormalProfileHeaderPreference);
    this.nrD.setOnLongClickListener(paramNormalProfileHeaderPreference);
    this.por.setOnClickListener(paramNormalProfileHeaderPreference);
    AppMethodBeat.o(23655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference.a
 * JD-Core Version:    0.6.2
 */