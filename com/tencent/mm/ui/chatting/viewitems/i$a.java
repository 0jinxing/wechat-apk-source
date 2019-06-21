package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.app.b;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMImageView;
import com.tencent.tinker.entry.ApplicationLike;

final class i$a extends c.a
{
  public static final int zdB;
  public TextView gnB;
  public TextView gnC;
  public TextView rGU;
  public MMImageView zbI;
  public int zcJ = 0;
  public boolean zdA;
  public View zdz;

  static
  {
    AppMethodBeat.i(32918);
    zdB = (int)com.tencent.mm.bz.a.getDensity(b.cdV.getApplication()) * 64;
    AppMethodBeat.o(32918);
  }

  public final a A(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(32916);
    super.eP(paramView);
    this.zdA = paramBoolean;
    this.enf = ((TextView)this.mRR.findViewById(2131820587));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = this.mRR.findViewById(2131820586);
    this.qkY = ((TextView)this.mRR.findViewById(2131821102));
    this.zbI = ((MMImageView)this.mRR.findViewById(2131822596));
    this.gnB = ((TextView)this.mRR.findViewById(2131822597));
    this.gnC = ((TextView)this.mRR.findViewById(2131822598));
    this.rGU = ((TextView)this.mRR.findViewById(2131822599));
    this.zdz = this.mRR.findViewById(2131822595);
    this.zcJ = c.hV(ah.getContext());
    AppMethodBeat.o(32916);
    return this;
  }

  public final void a(Context paramContext, j.b paramb, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(32917);
    an(this.jPL, this.zcJ);
    Object localObject1;
    int i;
    switch (paramb.type)
    {
    default:
      this.gnB.setText(paramb.description);
      this.gnC.setText(paramb.fhC);
      this.zbI.setVisibility(0);
      if (paramBoolean)
      {
        paramContext = o.ahp();
        paramString = o.ahl().I(paramString, true);
        paramb = this.zbI;
        localObject1 = new com.tencent.mm.at.a.a.c.a();
        ((com.tencent.mm.at.a.a.c.a)localObject1).fHe = 1;
        i = zdB;
        localObject1 = ((com.tencent.mm.at.a.a.c.a)localObject1).ct(i, i);
        ((com.tencent.mm.at.a.a.c.a)localObject1).ePT = 2131230820;
        ((com.tencent.mm.at.a.a.c.a)localObject1).eQf = true;
        paramContext.a(paramString, paramb, ((com.tencent.mm.at.a.a.c.a)localObject1).ahG());
        AppMethodBeat.o(32917);
      }
      break;
    case 16:
    case 34:
    }
    while (true)
    {
      return;
      this.gnB.setText(paramb.description);
      this.gnC.setText(paramb.fhC);
      this.zbI.setVisibility(0);
      if (paramBoolean)
      {
        paramContext = o.ahp();
        paramb = paramb.thumburl;
        paramString = this.zbI;
        localObject1 = new com.tencent.mm.at.a.a.c.a();
        i = zdB;
        localObject1 = ((com.tencent.mm.at.a.a.c.a)localObject1).ct(i, i);
        ((com.tencent.mm.at.a.a.c.a)localObject1).ePT = 2131230820;
        ((com.tencent.mm.at.a.a.c.a)localObject1).eQf = true;
        paramContext.a(paramb, paramString, ((com.tencent.mm.at.a.a.c.a)localObject1).ahG());
        AppMethodBeat.o(32917);
      }
      else
      {
        this.zbI.setImageResource(2130839706);
        AppMethodBeat.o(32917);
        continue;
        if ((paramb.title != null) && (paramb.title.length() > 0))
        {
          this.gnB.setVisibility(0);
          this.gnB.setText(paramb.title);
          if (!bo.isNullOrNil(paramb.fhL))
          {
            this.gnB.setTextColor(bo.bS(paramb.fhL, paramContext.getResources().getColor(2131689761)));
            label354: this.gnC.setMaxLines(2);
            this.gnC.setVisibility(0);
            this.gnC.setText(paramb.description);
            if (bo.isNullOrNil(paramb.fhM))
              break label611;
            this.gnC.setTextColor(bo.bS(paramb.fhM, paramContext.getResources().getColor(2131690139)));
            label414: if (bo.isNullOrNil(paramb.fhH))
              break label630;
            this.rGU.setText(paramb.fhH);
          }
        }
        while (true)
          if (paramBoolean)
          {
            Object localObject2;
            com.tencent.mm.at.a.a.c.a locala;
            if (!bo.isNullOrNil(paramb.fhK))
            {
              localObject1 = o.ahp();
              localObject2 = paramb.thumburl;
              paramString = this.zbI;
              locala = new com.tencent.mm.at.a.a.c.a();
              i = zdB;
              locala = locala.ct(i, i);
              locala.ePT = 2131230820;
              locala.eQf = true;
              ((com.tencent.mm.at.a.a)localObject1).a((String)localObject2, paramString, locala.ahG());
              paramString = o.ahp();
              localObject1 = paramb.fhK;
              paramb = new ImageView(paramContext);
              localObject2 = new com.tencent.mm.at.a.a.c.a();
              ((com.tencent.mm.at.a.a.c.a)localObject2).ePH = true;
              paramString.a((String)localObject1, paramb, ((com.tencent.mm.at.a.a.c.a)localObject2).ahG(), new i.a.1(this, paramContext));
              AppMethodBeat.o(32917);
              break;
              this.gnB.setTextColor(paramContext.getResources().getColor(2131689761));
              break label354;
              this.gnB.setVisibility(8);
              break label354;
              label611: this.gnC.setTextColor(paramContext.getResources().getColor(2131690139));
              break label414;
              label630: this.rGU.setText(2131298139);
              continue;
            }
            paramString = o.ahl().a(paramString, com.tencent.mm.bz.a.getDensity(paramContext), false);
            if ((paramString != null) && (!paramString.isRecycled()))
            {
              paramb = d.a(paramString, false, paramString.getWidth() / 2);
              this.zbI.setImageBitmap(paramb);
            }
            while (true)
            {
              this.zdz.getViewTreeObserver().addOnPreDrawListener(new i.a.2(this, paramContext, paramString));
              AppMethodBeat.o(32917);
              break;
              localObject1 = o.ahp();
              paramb = paramb.thumburl;
              localObject2 = this.zbI;
              locala = new com.tencent.mm.at.a.a.c.a();
              i = zdB;
              locala = locala.ct(i, i);
              locala.ePT = 2131230820;
              locala.eQf = true;
              ((com.tencent.mm.at.a.a)localObject1).a(paramb, (ImageView)localObject2, locala.ahG());
            }
          }
        this.zbI.setImageBitmap(BitmapFactory.decodeResource(paramContext.getResources(), 2130839706));
        AppMethodBeat.o(32917);
        continue;
        this.zbI.setImageResource(2130839706);
        AppMethodBeat.o(32917);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.i.a
 * JD-Core Version:    0.6.2
 */