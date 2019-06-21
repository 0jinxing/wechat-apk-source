package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.p;

final class ShakeItemListUI$a extends p<d>
{
  b gvm;
  private b.b gvn;
  private int showType;

  public ShakeItemListUI$a(ShakeItemListUI paramShakeItemListUI1, ShakeItemListUI paramShakeItemListUI2)
  {
    super(paramShakeItemListUI2, new d());
    AppMethodBeat.i(24732);
    this.showType = 0;
    this.gvn = null;
    this.gvm = new b(new ShakeItemListUI.a.1(this));
    KD();
    AppMethodBeat.o(24732);
  }

  protected final void CB(int paramInt)
  {
    AppMethodBeat.i(24736);
    this.showType = paramInt;
    KD();
    AppMethodBeat.o(24736);
  }

  public final void KC()
  {
    AppMethodBeat.i(24735);
    if (!aw.RK())
    {
      AppMethodBeat.o(24735);
      return;
    }
    switch (this.showType)
    {
    default:
    case 100:
    case 0:
    case -1:
    case 4:
    case -5:
    case 5:
    case -6:
    case 11:
    case -12:
    }
    while (true)
    {
      super.notifyDataSetChanged();
      AppMethodBeat.o(24735);
      break;
      setCursor(m.cjS().cjy());
      continue;
      setCursor(m.cjS().cjA());
      continue;
      setCursor(m.cjS().cjz());
      continue;
      setCursor(m.cjS().cjB());
      continue;
      setCursor(m.cjS().cjC());
      continue;
      setCursor(m.cjS().cjD());
      continue;
      setCursor(m.cjS().cjE());
      continue;
      setCursor(m.cjS().cjF());
      continue;
      setCursor(m.cjS().Cs(this.quC.getIntent().getIntExtra("_ibeacon_new_insert_size", 2)));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(24734);
    bIf();
    KC();
    AppMethodBeat.o(24734);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24733);
    if (this.gvn == null)
      this.gvn = new ShakeItemListUI.a.2(this);
    if (this.gvm != null)
      this.gvm.a(paramInt, this.gvn);
    if (paramView == null)
    {
      paramViewGroup = new ShakeItemListUI.a.a(this);
      paramView = View.inflate(this.context, 2130970652, null);
      paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131823615));
      paramViewGroup.gtG = ((TextView)paramView.findViewById(2131823616));
      paramViewGroup.gvr = ((TextView)paramView.findViewById(2131826300));
      paramViewGroup.quH = ((ImageView)paramView.findViewById(2131826301));
      paramViewGroup.oQz = ((TextView)paramView.findViewById(2131826303));
      paramViewGroup.oQA = ((TextView)paramView.findViewById(2131826309));
      paramViewGroup.oQB = ((ImageView)paramView.findViewById(2131826302));
      paramViewGroup.quI = ((TextView)paramView.findViewById(2131827476));
      paramViewGroup.quG = paramView.findViewById(2131826308);
      paramViewGroup.quJ = ((LinearLayout)paramView.findViewById(2131827478));
      paramViewGroup.quK = ((TextView)paramView.findViewById(2131827477));
      paramView.setTag(paramViewGroup);
    }
    Object localObject1;
    while (true)
    {
      localObject1 = (d)getItem(paramInt);
      if (localObject1 != null)
        break;
      paramViewGroup.clear();
      AppMethodBeat.o(24733);
      return paramView;
      paramViewGroup = (ShakeItemListUI.a.a)paramView.getTag();
    }
    paramViewGroup.clear();
    if ((4 == ((d)localObject1).field_type) || ((k.Cz(((d)localObject1).field_type)) && (6 != ((d)localObject1).field_type)))
    {
      if (4 != ((d)localObject1).field_type)
        paramViewGroup.gvq.setScaleType(ImageView.ScaleType.CENTER_CROP);
      e.a(paramViewGroup.gvq, ((d)localObject1).field_sns_bgurl, 2131230820, false);
      label319: paramViewGroup.gvq.setVisibility(0);
      if ((7 != ((d)localObject1).field_type) && (10 != ((d)localObject1).field_type) && (12 != ((d)localObject1).field_type) && (13 != ((d)localObject1).field_type) && ((8 != ((d)localObject1).field_type) || (!bo.isNullOrNil(((d)localObject1).field_nickname)) || (!bo.isNullOrNil(((d)localObject1).field_username))))
        break label509;
      if (8 != ((d)localObject1).field_type)
        break label494;
      paramViewGroup.quK.setText(((d)localObject1).field_distance);
    }
    while (true)
    {
      paramViewGroup.quK.setVisibility(0);
      paramViewGroup.quJ.setVisibility(8);
      AppMethodBeat.o(24733);
      break;
      if (11 == ((d)localObject1).field_type)
      {
        ShakeItemListUI.g(this.quC).a(((d)localObject1).getProvince(), paramViewGroup.gvq);
        break label319;
      }
      a.b.b(paramViewGroup.gvq, ((d)localObject1).field_username);
      break label319;
      label494: paramViewGroup.quK.setText(((d)localObject1).field_nickname);
    }
    label509: paramViewGroup.quK.setVisibility(8);
    paramViewGroup.quJ.setVisibility(0);
    if ((8 == ((d)localObject1).field_type) && (bo.isNullOrNil(((d)localObject1).field_nickname)))
    {
      ((d)localObject1).field_nickname = ((d)localObject1).field_distance;
      ((d)localObject1).field_distance = ((d)localObject1).field_username;
    }
    Object localObject2 = bo.nullAsNil(((d)localObject1).field_nickname);
    paramViewGroup.gtG.setText(j.b(this.context, (CharSequence)localObject2, paramViewGroup.gtG.getTextSize()));
    paramViewGroup.gtG.setVisibility(0);
    int i = paramView.getPaddingBottom();
    int j = paramView.getPaddingTop();
    paramInt = paramView.getPaddingRight();
    int k = paramView.getPaddingLeft();
    if (((d)localObject1).field_insertBatch == 2)
    {
      paramView.setBackgroundDrawable(com.tencent.mm.bz.a.g(this.context, 2130838395));
      label654: paramView.setPadding(k, j, paramInt, i);
      switch (((d)localObject1).field_type)
      {
      default:
        paramViewGroup.quG.setVisibility(0);
        paramViewGroup.oQz.setText(((d)localObject1).field_distance);
        paramViewGroup.oQz.setVisibility(0);
        if ((((d)localObject1).field_signature == null) || (((d)localObject1).field_signature.trim().equals("")))
        {
          paramViewGroup.oQA.setVisibility(8);
          label758: if (((d)localObject1).field_sex != 1)
            break label1061;
          paramViewGroup.quH.setVisibility(0);
          paramViewGroup.quH.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231387));
          paramViewGroup.quH.setContentDescription(this.context.getString(2131301309));
          label809: aw.ZK();
          localObject2 = c.XM().aoO(((d)localObject1).field_username);
          if ((localObject2 == null) || (!com.tencent.mm.n.a.jh(((ap)localObject2).field_type)))
            break label1147;
          paramViewGroup.gvr.setVisibility(0);
          if (!ad.Mn(((d)localObject1).field_reserved1))
            break label1127;
          paramViewGroup.gvr.setText(this.context.getString(2131301621));
          label880: if (6 == ((d)localObject1).field_type)
          {
            paramViewGroup.oQz.setText(this.context.getString(2131303409));
            paramViewGroup.gvr.setVisibility(8);
          }
          if (((d)localObject1).field_reserved1 == 0)
            break label1159;
          paramViewGroup.oQB.setVisibility(0);
          localObject1 = BackwardSupportUtil.b.i(ao.a.flw.ky(((d)localObject1).field_reserved1), 2.0F);
          paramViewGroup.oQB.setImageBitmap((Bitmap)localObject1);
          paramViewGroup.quH.setVisibility(8);
        }
        break;
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(24733);
      break;
      paramView.setBackgroundDrawable(com.tencent.mm.bz.a.g(this.context, 2130838396));
      break label654;
      paramViewGroup.quI.setText(((d)localObject1).field_nickname);
      paramViewGroup.quI.setVisibility(0);
      AppMethodBeat.o(24733);
      break;
      paramViewGroup.oQA.setVisibility(0);
      paramViewGroup.oQA.setText(j.b(this.context, ((d)localObject1).field_signature, paramViewGroup.gtG.getTextSize()));
      break label758;
      label1061: if (((d)localObject1).field_sex == 2)
      {
        paramViewGroup.quH.setVisibility(0);
        paramViewGroup.quH.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231386));
        paramViewGroup.quH.setContentDescription(this.context.getString(2131299774));
        break label809;
      }
      paramViewGroup.quH.setVisibility(8);
      break label809;
      label1127: paramViewGroup.gvr.setText(this.context.getString(2131301626));
      break label880;
      label1147: paramViewGroup.gvr.setVisibility(8);
      break label880;
      label1159: paramViewGroup.oQB.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.a
 * JD-Core Version:    0.6.2
 */