package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class r extends LinearLayout
  implements u
{
  private Context context;
  private String czD;
  private boolean czr;
  private int czs;
  private String ecX;
  private int klY;
  r.b riN;
  private n riO;
  private r.a riP;
  private View.OnTouchListener riQ;
  private boolean riR;

  public r(Context paramContext, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(38241);
    this.riN = new r.b(this);
    this.riO = null;
    this.klY = 0;
    this.czD = "";
    this.czr = false;
    this.riQ = bo.dpE();
    this.ecX = "";
    this.riR = true;
    this.klY = paramInt;
    this.czr = paramBoolean;
    init(paramContext);
    AppMethodBeat.o(38241);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(38243);
    this.context = paramContext;
    if (this.klY == -1)
    {
      AppMethodBeat.o(38243);
      return;
    }
    this.ecX = com.tencent.mm.model.r.Yz();
    View localView = LayoutInflater.from(paramContext).inflate(2130970760, this, true);
    this.riN.riU = ((LinearLayout)localView.findViewById(2131827754));
    this.riN.rje = ((LinearLayout)localView.findViewById(2131827748));
    this.riN.riX = ((LinearLayout)localView.findViewById(2131827755));
    this.riN.riX.setOnTouchListener(this.riQ);
    this.riN.riY = ((ImageView)localView.findViewById(2131827756));
    this.riN.riZ = ((LinearLayout)localView.findViewById(2131827758));
    this.riN.riZ.setOnTouchListener(this.riQ);
    this.riN.rja = ((LinearLayout)localView.findViewById(2131827759));
    this.riN.rjc = ((TextView)localView.findViewById(2131827760));
    this.riN.rjd = ((TextView)localView.findViewById(2131827761));
    this.riN.rjb = ((TextView)localView.findViewById(2131827757));
    this.riN.riV = ((TextView)localView.findViewById(2131827747));
    this.riN.riW = ((LinearLayout)localView.findViewById(2131827746));
    this.riN.hrg = ((TextView)localView.findViewById(2131827751));
    this.riN.rji = ((LinearLayout)localView.findViewById(2131827749));
    ((LinearLayout)localView.findViewById(2131827749)).getBackground().setAlpha(50);
    this.riN.eks = ((ImageView)localView.findViewById(2131827750));
    this.riN.rjf = ((ImageView)localView.findViewById(2131827752));
    this.riN.rjg = ((ImageView)localView.findViewById(2131827753));
    this.riN.rjh = ((LinearLayout)localView.findViewById(2131827744));
    this.riN.rjj = ((TextView)localView.findViewById(2131827745));
    if (this.klY == 2)
    {
      this.riN.rje.setVisibility(8);
      this.riN.rjh.setVisibility(8);
      this.riN.riW.setVisibility(0);
    }
    while (true)
    {
      this.riN.riX.setOnClickListener(new r.1(this));
      this.riN.riZ.setOnClickListener(new r.2(this, paramContext));
      this.riN.rja.setOnClickListener(new r.3(this, paramContext));
      this.riN.riV.setOnClickListener(new r.4(this));
      this.riN.rjj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(38239);
          if (r.c(r.this) != null)
            r.c(r.this);
          AppMethodBeat.o(38239);
        }
      });
      AppMethodBeat.o(38243);
      break;
      if (this.klY == 3)
      {
        this.riN.rje.setVisibility(8);
        this.riN.riW.setVisibility(8);
        this.riN.rjh.setVisibility(0);
      }
      else
      {
        this.riN.rje.setVisibility(0);
        this.riN.riW.setVisibility(8);
        this.riN.rjh.setVisibility(8);
      }
    }
  }

  public final void Zv(String paramString)
  {
    AppMethodBeat.i(38246);
    setFooter(paramString);
    AppMethodBeat.o(38246);
  }

  public final int getFooterH()
  {
    AppMethodBeat.i(38247);
    int i;
    if (this.riN.riU != null)
    {
      i = this.riN.riU.getHeight();
      AppMethodBeat.o(38247);
    }
    while (true)
    {
      return i;
      i = 10;
      AppMethodBeat.o(38247);
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(38244);
    if (this.klY == -1)
      AppMethodBeat.o(38244);
    while (true)
    {
      return;
      this.riO = af.cnF().YT(this.czD);
      if ((!bo.isNullOrNil(this.czD)) && (this.riO != null))
        break;
      AppMethodBeat.o(38244);
    }
    this.riN.rjg.setVisibility(8);
    if (aj.ab(this.riO.field_localPrivate, this.czr))
    {
      this.riN.riZ.setVisibility(8);
      this.riN.riX.setVisibility(8);
      label111: localObject = aj.q(this.riO);
      if (localObject != null)
      {
        if (this.riO.cqT())
        {
          int i = ((cbf)localObject).xar;
          if (i <= 0)
            break label510;
          this.riN.rjd.setText(String.valueOf(i));
          this.riN.rjd.setVisibility(0);
          label167: int j = ((cbf)localObject).xao;
          if (j <= 0)
            break label525;
          this.riN.rjc.setText(String.valueOf(j));
          this.riN.rjc.setVisibility(0);
          label201: ab.d("MicroMsg.GalleryFooter", "commentCount " + i + " " + j);
          if (this.riO.field_likeFlag != 1)
            break label540;
          localObject = getResources().getString(2131303646);
          this.riN.rjb.setText((CharSequence)localObject);
          this.riN.riY.setImageResource(2131231321);
        }
        label280: if ((this.ecX.equals(this.riO.field_userName)) || (!this.czr))
          break label581;
        this.riN.eks.setVisibility(0);
        a.b.b(this.riN.eks, this.riO.field_userName);
      }
    }
    while (true)
    {
      if (this.riO.cqu() != null)
        break label596;
      this.riN.hrg.setVisibility(8);
      AppMethodBeat.o(38244);
      break;
      if (!this.riO.cqT())
      {
        this.riN.rji.setVisibility(0);
        this.riN.rje.setVisibility(0);
        this.riN.riU.setVisibility(8);
        this.riN.rja.setVisibility(8);
        this.riN.riZ.setVisibility(8);
        this.riN.riX.setVisibility(8);
        break label111;
      }
      if (this.riR)
        this.riN.riU.setVisibility(0);
      this.riN.rja.setVisibility(0);
      this.riN.riZ.setVisibility(0);
      this.riN.riX.setVisibility(0);
      this.riN.rje.setVisibility(0);
      break label111;
      label510: this.riN.rjd.setVisibility(8);
      break label167;
      label525: this.riN.rjc.setVisibility(8);
      break label201;
      label540: localObject = getResources().getString(2131303647);
      this.riN.rjb.setText(String.valueOf(localObject));
      this.riN.riY.setImageResource(2131231322);
      break label280;
      label581: this.riN.eks.setVisibility(8);
    }
    label596: Object localObject = this.riO.cqu().xfF;
    if ((localObject == null) || (((String)localObject).equals("")))
    {
      this.riN.hrg.setText("");
      this.riN.hrg.setVisibility(8);
      label644: if (!aj.ab(this.riO.field_localPrivate, this.czr))
        break label802;
      this.riN.rjf.setVisibility(0);
      this.riN.hrg.setVisibility(0);
    }
    while (true)
    {
      if ((this.czr) && (this.riO.cqW()))
      {
        this.riN.rja.setVisibility(0);
        this.riN.hrg.setVisibility(0);
        this.riN.rjg.setVisibility(0);
      }
      AppMethodBeat.o(38244);
      break;
      this.riN.hrg.setText(j.b(getContext(), (String)localObject + " ", this.riN.hrg.getTextSize()));
      this.riN.hrg.setVisibility(0);
      break label644;
      label802: this.riN.rjf.setVisibility(8);
    }
  }

  public final void setCallBack(r.a parama)
  {
    this.riP = parama;
  }

  public final void setFooter(String paramString)
  {
    AppMethodBeat.i(38245);
    this.czD = paramString;
    refresh();
    AppMethodBeat.o(38245);
  }

  public final void setSnsSource(int paramInt)
  {
    this.czs = paramInt;
  }

  public final void setType(int paramInt)
  {
    AppMethodBeat.i(38242);
    this.klY = paramInt;
    init(this.context);
    AppMethodBeat.o(38242);
  }

  public final void setVisibility(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(38240);
    if ((this.klY == 2) || (this.klY == 3))
    {
      super.setVisibility(paramInt);
      if (paramInt == 8)
      {
        this.riR = bool;
        AppMethodBeat.o(38240);
      }
    }
    while (true)
    {
      return;
      bool = true;
      break;
      if ((this.riO != null) && (!this.riO.cqT()))
      {
        AppMethodBeat.o(38240);
      }
      else if (paramInt == 8)
      {
        this.riN.riU.setVisibility(8);
        this.riR = false;
        AppMethodBeat.o(38240);
      }
      else
      {
        if (paramInt == 0)
        {
          this.riN.riU.setVisibility(0);
          this.riR = true;
        }
        AppMethodBeat.o(38240);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.r
 * JD-Core Version:    0.6.2
 */