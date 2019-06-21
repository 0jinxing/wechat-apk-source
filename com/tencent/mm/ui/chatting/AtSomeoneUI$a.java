package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.m;
import com.tencent.mm.bz.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.List;

final class AtSomeoneUI$a extends p<ad>
{
  private u eih;
  private List<String> elZ;
  String ema;
  private String[] yDL;
  private Bitmap yDM;

  public AtSomeoneUI$a(Context paramContext, ad paramad, u paramu, String[] paramArrayOfString, List<String> paramList)
  {
    super(paramContext, paramad);
    AppMethodBeat.i(30390);
    this.eih = paramu;
    this.yDL = paramArrayOfString;
    this.elZ = paramList;
    this.yDM = d.v(paramContext.getResources().getDrawable(2131230920));
    AppMethodBeat.o(30390);
  }

  public final void KC()
  {
    AppMethodBeat.i(30393);
    aw.ZK();
    bd localbd = c.XM();
    String[] arrayOfString1 = this.yDL;
    String str1 = this.ema;
    String str2 = this.ema;
    Object localObject;
    if ((this.eih == null) || (str2 == null) || (this.yDL == null))
    {
      localObject = null;
      setCursor(localbd.a(arrayOfString1, "@all.chatroom", str1, (List)localObject, this.elZ));
      super.notifyDataSetChanged();
      AppMethodBeat.o(30393);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString2 = this.yDL;
    int i = arrayOfString2.length;
    for (int j = 0; ; j++)
    {
      localObject = localArrayList;
      if (j >= i)
        break;
      String str3 = arrayOfString2[j];
      localObject = this.eih.mJ(str3);
      if ((localObject != null) && (((String)localObject).contains(str2)))
        localArrayList.add(str3);
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(30394);
    bIf();
    KC();
    AppMethodBeat.o(30394);
  }

  public final int bFs()
  {
    AppMethodBeat.i(30391);
    int i;
    if (AtSomeoneUI.access$100())
    {
      i = 1;
      AppMethodBeat.o(30391);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(30391);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30392);
    View localView;
    if (paramView == null)
    {
      localView = View.inflate(this.context, 2130968781, null);
      paramViewGroup = new AtSomeoneUI.b((byte)0);
      paramViewGroup.emP = ((MaskLayout)localView.findViewById(2131821519));
      paramViewGroup.emg = ((TextView)localView.findViewById(2131821520));
      paramViewGroup.yDN = ((ImageView)localView.findViewById(2131821019));
      localView.setTag(paramViewGroup);
    }
    while ((paramInt == 0) && (AtSomeoneUI.access$100()))
    {
      paramViewGroup.yDN.setImageBitmap(this.yDM);
      paramViewGroup.emg.setText(this.context.getResources().getString(2131297179, new Object[] { "@" }));
      AppMethodBeat.o(30392);
      return localView;
      paramViewGroup = (AtSomeoneUI.b)paramView.getTag();
      localView = paramView;
    }
    int i;
    label160: ad localad;
    if (AtSomeoneUI.access$100())
    {
      i = 1;
      localad = (ad)getItem(paramInt - i);
      TextView localTextView = paramViewGroup.emg;
      paramView = this.context;
      if (t.nI(localad.field_username))
        break label374;
      paramInt = 2131690750;
      label198: localTextView.setTextColor(a.h(paramView, paramInt));
      a.b.b((ImageView)paramViewGroup.emP.getContentView(), localad.field_username);
      if (localad.field_verifyFlag == 0)
        break label403;
      if (ao.a.flw == null)
        break label392;
      paramView = ao.a.flw.kz(localad.field_verifyFlag);
      if (paramView == null)
        break label381;
      paramView = m.rk(paramView);
      paramViewGroup.emP.a(paramView, MaskLayout.a.yyU);
      label274: if (ah.isNullOrNil(localad.field_conRemark))
        break label414;
      paramView = localad.field_conRemark;
      label291: if (!ah.isNullOrNil(paramView))
        break label455;
      paramView = localad.Oi();
    }
    label392: label403: label414: label455: 
    while (true)
    {
      if (ad.aox(localad.field_username))
        ((b)g.K(b.class)).a(paramViewGroup.emg.getContext(), paramViewGroup.emg, paramView, localad.field_openImAppid, localad.field_descWordingId, (int)paramViewGroup.emg.getTextSize());
      while (true)
      {
        AppMethodBeat.o(30392);
        break;
        i = 0;
        break label160;
        label374: paramInt = 2131690751;
        break label198;
        label381: paramViewGroup.emP.setMaskDrawable(null);
        break label274;
        paramViewGroup.emP.setMaskDrawable(null);
        break label274;
        paramViewGroup.emP.setMaskDrawable(null);
        break label274;
        paramView = AtSomeoneUI.a(this.eih, localad.field_username);
        break label291;
        paramViewGroup.emg.setText(j.b(this.context, paramView, paramViewGroup.emg.getTextSize()));
      }
    }
  }

  public final boolean wK(int paramInt)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AtSomeoneUI.a
 * JD-Core Version:    0.6.2
 */