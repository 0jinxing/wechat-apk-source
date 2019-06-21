package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class e extends a
{
  protected TextView gnB;
  private LinearLayout kgv;
  private RelativeLayout ksA;
  private TextView ksB;
  private View ksC;
  private ImageView ksD;
  private ImageView ksE;
  private ImageView ksF;
  private ImageView ksG;
  private ImageView ksH;

  public e(Context paramContext)
  {
    super(paramContext);
  }

  private void beO()
  {
    AppMethodBeat.i(88984);
    Object localObject = new c.a();
    ((c.a)localObject).ePK = com.tencent.mm.compatible.util.e.eSn;
    o.ahq();
    ((c.a)localObject).ePY = null;
    ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kaS.aZW().vSm);
    ((c.a)localObject).ePH = true;
    ((c.a)localObject).eQf = true;
    ((c.a)localObject).eQg = this.mContext.getResources().getDimensionPixelSize(2131428179);
    ((c.a)localObject).eQa = true;
    ((c.a)localObject).ePF = true;
    ((c.a)localObject).ePT = 2130838139;
    ((c.a)localObject).ePO = com.tencent.mm.bz.a.al(this.mContext, 2131428183);
    ((c.a)localObject).ePN = com.tencent.mm.bz.a.gd(this.mContext);
    localObject = ((c.a)localObject).ahG();
    o.ahp().a(this.kaS.aZW().vSm, this.ksG, (c)localObject);
    ab.i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.kaS.aZW().vSm);
    AppMethodBeat.o(88984);
  }

  public final void a(ShapeDrawable paramShapeDrawable)
  {
    AppMethodBeat.i(88982);
    if (!TextUtils.isEmpty(this.kaS.aZW().vSm))
    {
      this.ksG.setBackgroundDrawable(null);
      this.ksH.setVisibility(0);
      beO();
      AppMethodBeat.o(88982);
    }
    while (true)
    {
      return;
      if (this.ksf != null)
      {
        this.ksG.setBackgroundDrawable(paramShapeDrawable);
        this.ksH.setVisibility(8);
      }
      AppMethodBeat.o(88982);
    }
  }

  protected final void beJ()
  {
    AppMethodBeat.i(88978);
    this.gnB = ((TextView)beI().findViewById(2131822004));
    this.ksA = ((RelativeLayout)beI().findViewById(2131822226));
    this.kgv = ((LinearLayout)beI().findViewById(2131822230));
    this.ksB = ((TextView)beI().findViewById(2131821958));
    this.ksC = beI().findViewById(2131822229);
    this.ksD = ((ImageView)beI().findViewById(2131822003));
    this.ksE = ((ImageView)this.ksf.findViewById(2131822232));
    this.ksF = ((ImageView)this.ksf.findViewById(2131822231));
    this.ksG = ((ImageView)this.ksf.findViewById(2131822227));
    this.ksH = ((ImageView)this.ksf.findViewById(2131822228));
    AppMethodBeat.o(88978);
  }

  protected final void beK()
  {
    AppMethodBeat.i(88979);
    if (this.iPD != null)
      this.iPD.setText(this.kaS.aZV().kdg);
    Object localObject;
    if ((this.kaS.aZV().vTW != null) && (this.kaS.aZV().vTW.size() > 0))
    {
      localObject = (tm)this.kaS.aZV().vTW.get(0);
      if (!TextUtils.isEmpty(((tm)localObject).title))
        this.gnB.setText(((tm)localObject).title);
    }
    else
    {
      if (!this.kaS.isNormal())
        break label472;
      fL(true);
      this.ksG.setAlpha(255);
      if (this.ksG.getBackground() != null)
        this.ksG.getBackground().setAlpha(255);
      localObject = this.kaS.aZW().code;
      if (!TextUtils.isEmpty((CharSequence)localObject))
        break label302;
      ab.e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
      fL(false);
    }
    while (true)
    {
      localObject = this.ksA.getLayoutParams();
      int i = this.mContext.getResources().getDimensionPixelSize(2131427779);
      int j = this.mContext.getResources().getDisplayMetrics().widthPixels - i * 2;
      int k = j * 3 / 5;
      ((ViewGroup.LayoutParams)localObject).height = k;
      ab.d("MicroMsg.CardWidgetMembership", "padding:%d,originWidth:%d,targetWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      this.ksA.setLayoutParams((ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(88979);
      return;
      this.gnB.setText("");
      break;
      label302: this.ksC.setOnClickListener(this.gKK);
      this.ksD.setOnClickListener(this.gKK);
      this.ksB.setOnClickListener(this.gKK);
      switch (this.kaS.aZW().vSb)
      {
      default:
        break;
      case 0:
        if (((String)localObject).length() <= 40)
          this.ksB.setText(com.tencent.mm.plugin.card.d.m.Hu((String)localObject));
        break;
      case 1:
      case 2:
        if (((String)localObject).length() <= 40)
        {
          if (this.kaS.aZL())
            this.ksB.setText(com.tencent.mm.plugin.card.d.m.Hu((String)localObject));
          else
            this.ksB.setText("");
        }
        else
        {
          this.ksB.setText("");
          continue;
          this.ksB.setText("");
          continue;
          label472: this.ksB.setText("");
          this.ksD.setVisibility(8);
          this.ksC.setVisibility(8);
          this.ksG.setAlpha(90);
          if (this.ksG.getBackground() != null)
            this.ksG.getBackground().setAlpha(90);
        }
        break;
      }
    }
  }

  public final void fL(boolean paramBoolean)
  {
    AppMethodBeat.i(88980);
    if ((!TextUtils.isEmpty(this.kaS.aZW().code)) && (paramBoolean) && (this.kaS.aZW().vSb != 0) && (!this.kaS.aZV().vUE))
    {
      this.ksD.setVisibility(0);
      this.ksC.setVisibility(0);
      AppMethodBeat.o(88980);
    }
    while (true)
    {
      return;
      this.ksD.setVisibility(8);
      this.ksC.setVisibility(8);
      AppMethodBeat.o(88980);
    }
  }

  public final void fM(boolean paramBoolean)
  {
    AppMethodBeat.i(88983);
    if (!TextUtils.isEmpty(this.kaS.aZW().vSm))
    {
      this.ksF.setVisibility(8);
      this.ksE.setVisibility(8);
      AppMethodBeat.o(88983);
    }
    while (true)
    {
      return;
      this.ksF.setVisibility(0);
      this.ksE.setVisibility(0);
      AppMethodBeat.o(88983);
    }
  }

  public final void tq(int paramInt)
  {
    AppMethodBeat.i(88981);
    if (!TextUtils.isEmpty(this.kaS.aZW().vSm))
    {
      this.ksG.setBackgroundDrawable(null);
      this.ksH.setVisibility(0);
      beO();
      AppMethodBeat.o(88981);
    }
    while (true)
    {
      return;
      if (this.ksf != null)
      {
        this.ksG.setBackgroundResource(paramInt);
        this.ksH.setVisibility(8);
      }
      AppMethodBeat.o(88981);
    }
  }

  public final void x(boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.e
 * JD-Core Version:    0.6.2
 */