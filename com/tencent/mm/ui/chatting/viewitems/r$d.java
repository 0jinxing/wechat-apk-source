package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class r$d extends c.a
{
  public static final int zej;
  public static final int zek;
  static final c zel;
  protected ThreeDotsLoadingView iNB;
  protected ImageView kuG;
  protected ImageView zbO;
  protected ImageView zbR;
  protected ImageView zbS;
  protected TextView zbU;
  protected ChattingItemFooter zbV;
  protected ImageView zbW;
  protected LinearLayout zbX;
  protected ViewGroup zbY;
  protected TextView zbZ;
  protected LinearLayout zca;
  ImageView zci;
  protected TextView zcm;
  protected ImageView zcn;
  protected TextView zco;
  protected TextView zcp;
  protected LinearLayout zcq;
  protected TextView zct;
  protected ViewGroup zem;
  protected View zen;

  static
  {
    AppMethodBeat.i(33042);
    zej = a.fromDPToPix(ah.getContext(), 240);
    zek = a.fromDPToPix(ah.getContext(), 192);
    com.tencent.mm.at.a.a.c.a locala1 = new com.tencent.mm.at.a.a.c.a();
    locala1.ePT = 2131230834;
    com.tencent.mm.at.a.a.c.a locala2 = locala1.ct(a.fromDPToPix(ah.getContext(), 20), a.fromDPToPix(ah.getContext(), 20));
    locala2.eQf = true;
    locala2.ePH = true;
    locala2.ePF = true;
    zel = locala1.ahG();
    AppMethodBeat.o(33042);
  }

  public final d B(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(33041);
    super.eP(paramView);
    this.zbO = ((ImageView)paramView.findViewById(2131822557));
    this.zbR = ((ImageView)this.mRR.findViewById(2131822556));
    this.zbS = ((ImageView)this.mRR.findViewById(2131822555));
    this.zbU = ((TextView)paramView.findViewById(2131822454));
    this.zbW = ((ImageView)paramView.findViewById(2131822558));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.zbV = ((ChattingItemFooter)paramView.findViewById(2131822554));
    this.zbX = ((LinearLayout)paramView.findViewById(2131822514));
    this.zbY = ((ViewGroup)paramView.findViewById(2131822511));
    this.zbZ = ((TextView)paramView.findViewById(2131822513));
    this.zca = ((LinearLayout)paramView.findViewById(2131821893));
    this.jPL = paramView.findViewById(2131822515);
    if (!paramBoolean)
    {
      this.zci = ((ImageView)this.mRR.findViewById(2131822661));
      this.pyf = ((ProgressBar)this.mRR.findViewById(2131822660));
    }
    this.zcq = ((LinearLayout)paramView.findViewById(2131822516));
    this.iNB = ((ThreeDotsLoadingView)paramView.findViewById(2131821325));
    this.kuG = ((ImageView)paramView.findViewById(2131821842));
    this.zct = ((TextView)paramView.findViewById(2131822519));
    this.zcm = ((TextView)paramView.findViewById(2131822520));
    this.zcn = ((ImageView)paramView.findViewById(2131822517));
    this.zco = ((TextView)paramView.findViewById(2131822518));
    this.zcp = ((TextView)paramView.findViewById(2131822524));
    this.zem = ((ViewGroup)paramView.findViewById(2131822590));
    AppMethodBeat.o(33041);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.r.d
 * JD-Core Version:    0.6.2
 */