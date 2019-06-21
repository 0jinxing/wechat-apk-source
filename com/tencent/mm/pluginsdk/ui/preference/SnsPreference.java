package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.no;
import com.tencent.mm.g.a.no.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.g;
import com.tencent.mm.ui.widget.QDisFadeImageView;
import java.util.LinkedList;
import java.util.List;

public final class SnsPreference extends Preference
  implements g
{
  private MMActivity crP;
  private int lXY;
  private List<bau> list;
  private String mTitle;
  private View omq;
  private az qFT;
  private QDisFadeImageView vro;
  private QDisFadeImageView vrp;
  private QDisFadeImageView vrq;
  private QDisFadeImageView vrr;
  private ImageView vrs;
  private ImageView vrt;
  private ImageView vru;
  private ImageView vrv;
  private SnsPreference.a vrw;

  public SnsPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(28117);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(28117);
  }

  public SnsPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28118);
    this.mTitle = "";
    this.vro = null;
    this.vrp = null;
    this.vrq = null;
    this.vrr = null;
    this.vrs = null;
    this.vrt = null;
    this.vru = null;
    this.vrv = null;
    this.lXY = 255;
    this.list = new LinkedList();
    this.vrw = new SnsPreference.a();
    this.crP = ((MMActivity)paramContext);
    this.mTitle = paramContext.getString(2131298679);
    setLayoutResource(2130970127);
    AppMethodBeat.o(28118);
  }

  private void dld()
  {
    int i = 0;
    AppMethodBeat.i(28119);
    if (this.vro != null)
    {
      this.vro.setImageResource(2131690691);
      this.vro.setVisibility(4);
    }
    if (this.vrp != null)
    {
      this.vrp.setImageResource(2131690691);
      this.vrp.setVisibility(4);
    }
    if (this.vrq != null)
    {
      this.vrq.setImageResource(2131690691);
      this.vrq.setVisibility(4);
    }
    if (this.vrr != null)
    {
      this.vrr.setImageResource(2131690691);
      this.vrr.setVisibility(4);
    }
    ImageView localImageView;
    if ((this.vro != null) && (this.list.size() > 0))
    {
      this.vro.setVisibility(0);
      if (com.tencent.mm.compatible.util.f.Mn())
        break label295;
      this.vro.setImageResource(2130839706);
      localImageView = this.vrs;
    }
    label295: label440: label587: label602: 
    while (true)
    {
      for (int j = 8; ; j = 0)
      {
        localImageView.setVisibility(j);
        if ((this.vrp != null) && (this.list.size() >= 2))
        {
          this.vrp.setVisibility(0);
          if (com.tencent.mm.compatible.util.f.Mn())
            break;
          this.vrp.setImageResource(2130839706);
        }
        if ((this.vrq != null) && (this.list.size() >= 3))
        {
          this.vrq.setVisibility(0);
          if (com.tencent.mm.compatible.util.f.Mn())
            break label440;
          this.vrq.setImageResource(2130839706);
        }
        if ((this.vrr == null) || (this.list.size() < 4))
          break label587;
        this.vrr.setVisibility(0);
        if (com.tencent.mm.compatible.util.f.Mn())
          break label518;
        this.vrr.setImageResource(2130839706);
        AppMethodBeat.o(28119);
        return;
        n.qFx.b((bau)this.list.get(0), this.vro, this.crP.hashCode(), this.qFT);
        localImageView = this.vrs;
        if (((bau)this.list.get(0)).jCt != 6)
          break label602;
      }
      n.qFx.b((bau)this.list.get(1), this.vrp, this.crP.hashCode(), this.qFT);
      localImageView = this.vrt;
      if (((bau)this.list.get(1)).jCt == 6);
      for (j = 0; ; j = 8)
      {
        localImageView.setVisibility(j);
        break;
      }
      n.qFx.b((bau)this.list.get(2), this.vrq, this.crP.hashCode(), this.qFT);
      localImageView = this.vru;
      if (((bau)this.list.get(2)).jCt == 6);
      for (j = 0; ; j = 8)
      {
        localImageView.setVisibility(j);
        break;
      }
      n.qFx.b((bau)this.list.get(3), this.vrr, this.crP.hashCode(), this.qFT);
      localImageView = this.vrv;
      if (((bau)this.list.get(3)).jCt == 6);
      for (j = i; ; j = 8)
      {
        localImageView.setVisibility(j);
        AppMethodBeat.o(28119);
        break;
      }
    }
  }

  public final void ajO(String paramString)
  {
    AppMethodBeat.i(28122);
    if (paramString == null)
    {
      AppMethodBeat.o(28122);
      return;
    }
    this.list.clear();
    aw.ZK();
    Object localObject = c.XM().aoO(paramString);
    if ((localObject != null) && ((int)((com.tencent.mm.n.a)localObject).ewQ > 0) && (com.tencent.mm.n.a.jh(((ap)localObject).field_type)))
      this.qFT = az.xYQ;
    while (true)
    {
      localObject = new no();
      ((no)localObject).cJO.username = paramString;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      if (((no)localObject).cJP.cJQ != null)
        this.list.add(((no)localObject).cJP.cJQ);
      if (((no)localObject).cJP.cJR != null)
        this.list.add(((no)localObject).cJP.cJR);
      if (((no)localObject).cJP.cJS != null)
        this.list.add(((no)localObject).cJP.cJS);
      if (((no)localObject).cJP.cJT != null)
        this.list.add(((no)localObject).cJP.cJT);
      dld();
      AppMethodBeat.o(28122);
      break;
      if (paramString.equals(r.Yz()))
        this.qFT = az.xYQ;
      else
        this.qFT = az.xYR;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(28121);
    super.onBindView(paramView);
    this.vro = ((QDisFadeImageView)paramView.findViewById(2131826024));
    this.vro.setAlpha(this.lXY);
    this.vro.setImageDrawable(this.vrw);
    this.vrp = ((QDisFadeImageView)paramView.findViewById(2131826026));
    this.vrp.setAlpha(this.lXY);
    this.vrp.setImageDrawable(this.vrw);
    this.vrq = ((QDisFadeImageView)paramView.findViewById(2131826028));
    this.vrq.setAlpha(this.lXY);
    this.vrq.setImageDrawable(this.vrw);
    this.vrr = ((QDisFadeImageView)paramView.findViewById(2131826030));
    this.vrr.setAlpha(this.lXY);
    this.vrr.setImageDrawable(this.vrw);
    TextView localTextView = (TextView)paramView.findViewById(2131826014);
    if (!bo.isNullOrNil(this.mTitle))
    {
      localTextView.setText(this.mTitle);
      ViewGroup.LayoutParams localLayoutParams = localTextView.getLayoutParams();
      localLayoutParams.width = com.tencent.mm.bz.a.al(this.mContext, 2131427668);
      localTextView.setLayoutParams(localLayoutParams);
    }
    this.vrs = ((ImageView)paramView.findViewById(2131826025));
    this.vrt = ((ImageView)paramView.findViewById(2131826027));
    this.vru = ((ImageView)paramView.findViewById(2131826029));
    this.vrv = ((ImageView)paramView.findViewById(2131826031));
    this.vrs.setVisibility(8);
    this.vrt.setVisibility(8);
    this.vru.setVisibility(8);
    this.vrv.setVisibility(8);
    dld();
    if ((paramView == null) || (this.list == null))
      AppMethodBeat.o(28121);
    while (true)
    {
      return;
      paramView.setContentDescription(this.mContext.getString(2131302033, new Object[] { Integer.valueOf(this.list.size()) }));
      AppMethodBeat.o(28121);
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(28120);
    if (this.omq == null)
    {
      View localView = super.onCreateView(paramViewGroup);
      paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
      ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
      localViewGroup.removeAllViews();
      paramViewGroup.inflate(2130970144, localViewGroup);
      this.omq = localView;
    }
    paramViewGroup = this.omq;
    AppMethodBeat.o(28120);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.SnsPreference
 * JD-Core Version:    0.6.2
 */