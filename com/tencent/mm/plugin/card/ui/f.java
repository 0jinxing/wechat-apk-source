package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.oa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class f
{
  private View jcl;
  private MMActivity jiE;
  private b kha;
  private int klA;
  private View klB;
  private TextView klC;
  private TextView klD;
  private CdnImageView klE;
  private ImageView[] klF;
  private ImageView klG;
  private oa klH;

  public f(MMActivity paramMMActivity, View paramView, int paramInt, b paramb)
  {
    this(paramMMActivity, paramView, paramInt, paramb, null);
  }

  public f(MMActivity paramMMActivity, View paramView, int paramInt, b paramb, oa paramoa)
  {
    AppMethodBeat.i(88479);
    this.klF = new ImageView[3];
    this.jiE = paramMMActivity;
    this.jcl = paramView;
    this.klA = paramInt;
    this.kha = paramb;
    this.klH = paramoa;
    this.klB = this.jcl.findViewById(2131822139);
    this.klC = ((TextView)this.jcl.findViewById(2131822141));
    this.klD = ((TextView)this.jcl.findViewById(2131822142));
    this.klE = ((CdnImageView)this.jcl.findViewById(2131822140));
    this.klF[0] = ((ImageView)this.jcl.findViewById(2131822144));
    this.klF[1] = ((ImageView)this.jcl.findViewById(2131822145));
    this.klF[2] = ((ImageView)this.jcl.findViewById(2131822146));
    this.klG = ((ImageView)this.jcl.findViewById(2131822147));
    if (this.klA == 1)
    {
      this.klC.setText(this.jiE.getString(2131297917, new Object[] { Integer.valueOf(0) }));
      this.klE.setImageResource(2131231057);
      AppMethodBeat.o(88479);
    }
    while (true)
    {
      return;
      if (this.klA == 2)
      {
        this.klC.setText(2131297977);
        this.klE.setImageResource(2131231056);
        AppMethodBeat.o(88479);
      }
      else if (this.klA == 3)
      {
        this.klC.setText(2131298010);
        this.klE.setImageResource(2131231058);
        AppMethodBeat.o(88479);
      }
      else if (this.klA == 4)
      {
        if (this.klH == null)
        {
          ab.w("MicroMsg.CardHomePageItemController", "cell element is null");
          bde();
        }
        this.jcl.findViewById(2131822143).setVisibility(8);
        this.klC.setText(this.klH.vTt);
        this.klE.setUseSdcardCache(true);
        this.klE.setUrl(this.klH.vTu);
        if (!bo.isNullOrNil(this.klH.vTv))
        {
          this.klD.setText(this.klH.vTv);
          this.klD.setVisibility(0);
          AppMethodBeat.o(88479);
        }
        else
        {
          this.klD.setVisibility(8);
        }
      }
      else
      {
        AppMethodBeat.o(88479);
      }
    }
  }

  public final void bde()
  {
    AppMethodBeat.i(88482);
    this.jcl.setVisibility(8);
    AppMethodBeat.o(88482);
  }

  public final void cu()
  {
    AppMethodBeat.i(88481);
    Object localObject;
    if (this.klA == 2)
    {
      localObject = (l)am.bbb().getValue("key_share_card_layout_data");
      if (localObject == null)
      {
        ab.w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
        AppMethodBeat.o(88481);
      }
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(((l)localObject).kfM))
        this.klD.setVisibility(8);
      while (bo.ek(((l)localObject).kfL))
      {
        for (i = 0; i < 3; i++)
          this.klF[i].setVisibility(8);
        this.klD.setVisibility(0);
        this.klD.setText(((l)localObject).kfM);
      }
      int i = 0;
      if (i < 3)
      {
        if (i < ((l)localObject).kfL.size())
        {
          this.klF[i].setVisibility(0);
          int j = this.jiE.getResources().getDimensionPixelSize(2131427779);
          m.a(this.klF[i], (String)((l)localObject).kfL.get(i), j, 2130839644, false);
        }
        while (true)
        {
          i++;
          break;
          this.klF[i].setVisibility(8);
        }
      }
      if ((!bo.ek(((l)localObject).kfL)) && (((l)localObject).kfL.size() == 1) && (((l)localObject).cML) && (!((l)localObject).cMM))
      {
        this.klG.setVisibility(0);
        AppMethodBeat.o(88481);
      }
      else
      {
        this.klG.setVisibility(8);
        AppMethodBeat.o(88481);
        continue;
        if (this.klA == 3)
        {
          this.klC.setText(2131298010);
          this.jcl.findViewById(2131822143).setVisibility(8);
          localObject = (String)am.bbb().getValue("key_card_entrance_tips");
          if (!bo.isNullOrNil((String)localObject))
          {
            this.klD.setText((CharSequence)localObject);
            this.klD.setVisibility(0);
            AppMethodBeat.o(88481);
          }
          else
          {
            this.klD.setVisibility(8);
          }
        }
        else
        {
          AppMethodBeat.o(88481);
        }
      }
    }
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(88480);
    this.klB.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(88480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.f
 * JD-Core Version:    0.6.2
 */