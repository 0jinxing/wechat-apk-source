package com.tencent.mm.plugin.shake.c.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.qj.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;

public final class a extends i
{
  private static final String kdH;
  private ProgressBar gHA;
  private boolean gHY;
  private View.OnClickListener gKK;
  private View jcl;
  private String kaE;
  private ImageView kgH;
  private Button kgI;
  private Resources mResources;
  private ImageView nVJ;
  private TextView pUz;
  private View pou;
  private com.tencent.mm.plugin.shake.c.a.e qsJ;
  private View qsN;
  private TextView qsO;
  private TextView qsP;
  private TextView qsQ;
  private TextView qsR;
  private View qsS;
  private View qsT;
  private TextView qsU;
  private TextView qsV;
  private TextView qsW;
  private View qsX;
  private ImageView qsY;
  public boolean qsZ;
  private boolean qta;
  private int qtb;
  private qj.b qtc;
  private a.a qtd;
  private a.b qte;
  private com.tencent.mm.sdk.b.c qtf;

  static
  {
    AppMethodBeat.i(24569);
    kdH = com.tencent.mm.compatible.util.e.eSn + "card";
    AppMethodBeat.o(24569);
  }

  private a(Context paramContext)
  {
    super(paramContext, 2131493868);
    AppMethodBeat.i(24553);
    this.qsZ = false;
    this.qta = false;
    this.qtb = 0;
    this.kaE = "";
    this.qtd = a.a.qti;
    this.qtf = new a.1(this);
    this.gKK = new a.2(this);
    ab.i("MicroMsg.ShakeCardDialog", "init shake card dialog");
    this.mResources = paramContext.getResources();
    setCanceledOnTouchOutside(true);
    getWindow().setSoftInputMode(2);
    this.jcl = View.inflate(paramContext, 2130970649, null);
    this.qsN = this.jcl.findViewById(2131827461);
    this.qsO = ((TextView)this.jcl.findViewById(2131827463));
    this.qsP = ((TextView)this.jcl.findViewById(2131822335));
    this.qsQ = ((TextView)this.jcl.findViewById(2131827464));
    this.nVJ = ((ImageView)this.jcl.findViewById(2131827470));
    this.kgI = ((Button)this.jcl.findViewById(2131821929));
    this.qsR = ((TextView)this.jcl.findViewById(2131827469));
    this.gHA = ((ProgressBar)this.jcl.findViewById(2131827468));
    this.nVJ.setOnClickListener(this.gKK);
    this.kgI.setOnClickListener(this.gKK);
    this.pou = this.jcl.findViewById(2131827462);
    this.qsS = this.jcl.findViewById(2131822001);
    this.qsT = this.jcl.findViewById(2131827471);
    this.kgH = ((ImageView)this.jcl.findViewById(2131827472));
    this.qsU = ((TextView)this.jcl.findViewById(2131822004));
    this.qsV = ((TextView)this.jcl.findViewById(2131821915));
    this.qsW = ((TextView)this.jcl.findViewById(2131827475));
    this.qsX = this.jcl.findViewById(2131827465);
    this.qsY = ((ImageView)this.jcl.findViewById(2131827466));
    this.pUz = ((TextView)this.jcl.findViewById(2131827467));
    this.qtb = com.tencent.mm.plugin.shake.c.c.a.ckk();
    AppMethodBeat.o(24553);
  }

  public static a a(Context paramContext, com.tencent.mm.plugin.shake.c.a.e parame, DialogInterface.OnCancelListener paramOnCancelListener, a.b paramb)
  {
    AppMethodBeat.i(24561);
    if (((Activity)paramContext).isFinishing())
    {
      paramContext = null;
      AppMethodBeat.o(24561);
      return paramContext;
    }
    a locala = new a(paramContext);
    locala.setOnCancelListener(paramOnCancelListener);
    locala.setCancelable(true);
    locala.qsJ = parame;
    if (locala.qsJ == null)
      ab.e("MicroMsg.ShakeCardDialog", "updateView() mCardItem == null");
    while (true)
    {
      locala.qte = paramb;
      locala.show();
      h.a(paramContext, locala);
      AppMethodBeat.o(24561);
      paramContext = locala;
      break;
      if (TextUtils.isEmpty(locala.qsJ.title))
        locala.qsO.setText(locala.qsJ.title);
      ab.i("MicroMsg.ShakeCardDialog", "updateView() action_type is has card");
      locala.qtd = a.a.qti;
      locala.updateLayout();
      locala.ckf();
      if (locala.qtb == 0)
      {
        locala.qsN.setBackgroundResource(2130840132);
        locala.qsS.setBackgroundResource(2130840133);
        locala.qsO.setTextColor(locala.mResources.getColor(2131689761));
        locala.qsP.setTextColor(locala.mResources.getColor(2131690303));
        locala.qsQ.setTextColor(locala.mResources.getColor(2131690303));
        locala.pUz.setTextColor(locala.getContext().getResources().getColor(2131689761));
        locala.kgI.setBackgroundResource(2130838000);
        locala.kgI.setTextColor(locala.getContext().getResources().getColor(2131690691));
        locala.qsR.setTextColor(locala.getContext().getResources().getColor(2131690309));
      }
    }
  }

  private void cke()
  {
    AppMethodBeat.i(24559);
    if ((this.qtd == a.a.qti) || (this.qtd == a.a.qtl))
      if (TextUtils.isEmpty(this.qsJ.qst))
      {
        this.kgI.setText(2131297805);
        AppMethodBeat.o(24559);
      }
    while (true)
    {
      return;
      this.kgI.setText(this.qsJ.qst);
      AppMethodBeat.o(24559);
      continue;
      if (this.qtd == a.a.qtj)
      {
        this.kgI.setText("");
        AppMethodBeat.o(24559);
      }
      else
      {
        if (this.qtd == a.a.qtk)
          this.kgI.setText(2131303400);
        AppMethodBeat.o(24559);
      }
    }
  }

  private void ckf()
  {
    AppMethodBeat.i(24560);
    int i = getContext().getResources().getDimensionPixelOffset(2131428632);
    Object localObject1 = new ShapeDrawable(new RoundRectShape(new float[] { i, i, i, i, 0.0F, 0.0F, 0.0F, 0.0F }, null, null));
    ((ShapeDrawable)localObject1).getPaint().setColor(com.tencent.mm.plugin.shake.c.c.a.Hn(this.qsJ.color));
    this.qsT.setBackgroundDrawable((Drawable)localObject1);
    cke();
    if (!TextUtils.isEmpty(this.qsJ.qsr))
      this.qsO.setText(this.qsJ.qsr);
    if (!TextUtils.isEmpty(this.qsJ.qsv))
    {
      this.qsP.setText(this.qsJ.qsv);
      this.qsP.setVisibility(0);
    }
    if (!TextUtils.isEmpty(this.qsJ.qss))
    {
      this.qsQ.setText(this.qsJ.qss);
      this.qsQ.setVisibility(0);
    }
    String str;
    if (!TextUtils.isEmpty(this.qsJ.kbV))
    {
      i = getContext().getResources().getDimensionPixelSize(2131428631);
      localObject1 = this.kgH;
      str = this.qsJ.kbV;
      if ((localObject1 != null) && (!TextUtils.isEmpty(str)));
    }
    else
    {
      if (!TextUtils.isEmpty(this.qsJ.title))
        this.qsU.setText(this.qsJ.title);
      if (!TextUtils.isEmpty(this.qsJ.kdg))
        this.qsV.setText(this.qsJ.kdg);
      if (this.qsJ.kbZ > 0)
        this.qsW.setText(getContext().getString(2131298013, new Object[] { com.tencent.mm.plugin.shake.c.c.a.fQ(this.qsJ.kbZ) }));
      if (this.qtd != a.a.qtl)
        break label513;
      this.qsR.setVisibility(0);
      AppMethodBeat.o(24560);
    }
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(str))
      {
        Object localObject2 = new c.a();
        ((c.a)localObject2).ePK = com.tencent.mm.compatible.util.e.eSn;
        o.ahq();
        ((c.a)localObject2).ePY = null;
        ((c.a)localObject2).ePJ = String.format("%s/%s", new Object[] { kdH, g.x(str.getBytes()) });
        ((c.a)localObject2).ePH = true;
        ((c.a)localObject2).eQf = true;
        ((c.a)localObject2).ePF = true;
        ((c.a)localObject2).ePO = i;
        ((c.a)localObject2).ePN = i;
        ((c.a)localObject2).ePT = 2131231917;
        localObject2 = ((c.a)localObject2).ahG();
        o.ahp().a(str, (ImageView)localObject1, (com.tencent.mm.at.a.a.c)localObject2);
        break;
      }
      ((ImageView)localObject1).setImageResource(2131231917);
      break;
      label513: this.qsR.setVisibility(8);
      AppMethodBeat.o(24560);
    }
  }

  private void updateLayout()
  {
    AppMethodBeat.i(24558);
    if (this.qtd == a.a.qtk)
    {
      this.pou.setVisibility(8);
      this.qsX.setVisibility(0);
      AppMethodBeat.o(24558);
    }
    while (true)
    {
      return;
      if ((this.qtd == a.a.qti) || (this.qtd == a.a.qtj) || (this.qtd == a.a.qtl))
      {
        this.pou.setVisibility(0);
        this.qsX.setVisibility(8);
      }
      AppMethodBeat.o(24558);
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(24557);
    try
    {
      if (this.qte != null)
        this.qte.ckg();
      if ((this.qtd != a.a.qtk) && (!this.qta))
      {
        this.qta = true;
        ab.i("MicroMsg.ShakeCardDialog", "ShakeCardDialog card is not cancel accepte");
        p localp = aw.Rg();
        com.tencent.mm.plugin.shake.c.a.a locala = new com/tencent/mm/plugin/shake/c/a/a;
        locala.<init>(this.qsJ.kbU, this.qsJ.cMD);
        localp.a(locala, 0);
      }
      com.tencent.mm.sdk.b.a.xxA.d(this.qtf);
      ab.i("MicroMsg.ShakeCardDialog", "dismiss ShakeCardDialog");
      super.dismiss();
      AppMethodBeat.o(24557);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ShakeCardDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(24557);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24555);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    AppMethodBeat.o(24555);
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(24554);
    if (paramInt == 4)
    {
      ab.i("MicroMsg.ShakeCardDialog", "back key in shake card dialog");
      dismiss();
      if (this.qte != null)
        this.qte.ckg();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(24554);
    return bool;
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(24556);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    setCanceledOnTouchOutside(this.gHY);
    AppMethodBeat.o(24556);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.b.a
 * JD-Core Version:    0.6.2
 */