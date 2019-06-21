package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.p.a;

public final class d extends b
{
  private b.a gtA;
  private b.b gtB;
  private int[] gty;
  private String gtz;

  public d(Context paramContext, p.a parama)
  {
    super(paramContext, new com.tencent.mm.plugin.account.friend.a.a());
    AppMethodBeat.i(13712);
    this.gtB = new d.1(this);
    super.a(parama);
    this.context = paramContext;
    pN(true);
    AppMethodBeat.o(13712);
  }

  private static String a(com.tencent.mm.plugin.account.friend.a.a parama)
  {
    AppMethodBeat.i(13717);
    if (parama.guL == 123)
    {
      parama = "#";
      AppMethodBeat.o(13717);
    }
    while (true)
    {
      return parama;
      parama = String.valueOf((char)parama.guL);
      AppMethodBeat.o(13717);
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(13715);
    bIf();
    setCursor(((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vV(this.gtz));
    this.gty = new int[getCount()];
    if ((this.gtA != null) && (this.gtz != null))
      this.gtA.mT(getCursor().getCount());
    notifyDataSetChanged();
    AppMethodBeat.o(13715);
  }

  public final void KD()
  {
    AppMethodBeat.i(13714);
    KC();
    AppMethodBeat.o(13714);
  }

  public final void a(b.a parama)
  {
    this.gtA = parama;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(13716);
    com.tencent.mm.plugin.account.friend.a.a locala = (com.tencent.mm.plugin.account.friend.a.a)getItem(paramInt);
    label160: label192: Object localObject;
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130969602, null);
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.gtF = paramInt;
      paramViewGroup.account = locala.Aq();
      paramViewGroup.status = locala.status;
      paramViewGroup.gtO.setText(locala.apA());
      paramViewGroup.gtP.setText(this.context.getString(2131300092) + locala.apD());
      a.b.b(paramViewGroup.eks, locala.getUsername());
      switch (locala.status)
      {
      default:
        switch (locala.frT)
        {
        default:
          localObject = (com.tencent.mm.plugin.account.friend.a.a)getItem(paramInt - 1);
          if (localObject == null)
          {
            i = -1;
            label212: if (paramInt != 0)
              break label672;
            localObject = a(locala);
            if (!bo.isNullOrNil((String)localObject))
              break label641;
            ab.w("MicroMsg.MobileFriendAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { locala.getUsername(), Integer.valueOf(paramInt) });
            paramViewGroup.gtN.setVisibility(8);
          }
          break;
        case 1:
        case 0:
        case 2:
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(13716);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      if (locala.frT == 2)
      {
        paramViewGroup.gtH.setClickable(false);
        paramViewGroup.gtH.setBackgroundDrawable(null);
        paramViewGroup.gnh.setText(2131300088);
        paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690205));
        break label160;
      }
      paramViewGroup.gtH.setClickable(true);
      paramViewGroup.gtH.setBackgroundResource(2130838000);
      paramViewGroup.gnh.setText(2131300087);
      paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690691));
      break label160;
      if ((((j)g.K(j.class)).XM().aoJ(locala.getUsername())) || (r.Yz().equals(locala.getUsername())))
      {
        paramViewGroup.gtH.setClickable(false);
        paramViewGroup.gtH.setBackgroundDrawable(null);
        paramViewGroup.gnh.setText(2131300086);
        paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690205));
        break label160;
      }
      if (locala.frT == 2)
      {
        paramViewGroup.gtH.setClickable(false);
        paramViewGroup.gtH.setBackgroundDrawable(null);
        paramViewGroup.gnh.setText(2131300091);
        paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690205));
        break label160;
      }
      paramViewGroup.gtH.setClickable(true);
      paramViewGroup.gtH.setBackgroundResource(2130838000);
      paramViewGroup.gnh.setText(2131300085);
      paramViewGroup.gnh.setTextColor(this.context.getResources().getColor(2131690691));
      break label160;
      paramViewGroup.gnh.setVisibility(4);
      paramViewGroup.gtQ.setVisibility(0);
      break label192;
      paramViewGroup.gnh.setVisibility(0);
      paramViewGroup.gtQ.setVisibility(4);
      break label192;
      i = ((com.tencent.mm.plugin.account.friend.a.a)localObject).guL;
      break label212;
      label641: paramViewGroup.gtN.setVisibility(0);
      paramViewGroup.gtN.setText((CharSequence)localObject);
      paramViewGroup.gtN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      continue;
      label672: if (locala.guL != i);
      for (i = 1; ; i = 0)
      {
        localObject = a(locala);
        if ((!bo.isNullOrNil((String)localObject)) && (i != 0))
          break label749;
        ab.w("MicroMsg.MobileFriendAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { locala.getUsername(), Integer.valueOf(paramInt) });
        paramViewGroup.gtN.setVisibility(8);
        break;
      }
      label749: paramViewGroup.gtN.setVisibility(0);
      paramViewGroup.gtN.setText((CharSequence)localObject);
      paramViewGroup.gtN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(13713);
    this.gtz = bo.vA(paramString.trim());
    bIf();
    KC();
    AppMethodBeat.o(13713);
  }

  final class a
  {
    String account;
    ImageView eks;
    TextView gnh;
    int gtF;
    View gtH;
    TextView gtN;
    TextView gtO;
    TextView gtP;
    ProgressBar gtQ;
    int status;

    public a(View arg2)
    {
      AppMethodBeat.i(13711);
      Object localObject;
      this.gtN = ((TextView)localObject.findViewById(2131824172));
      this.eks = ((ImageView)localObject.findViewById(2131824173));
      this.gtO = ((TextView)localObject.findViewById(2131824174));
      this.gtP = ((TextView)localObject.findViewById(2131824175));
      this.gtH = localObject.findViewById(2131824176);
      this.gnh = ((TextView)localObject.findViewById(2131824177));
      this.gtQ = ((ProgressBar)localObject.findViewById(2131824178));
      this.gtH.setOnClickListener(new d.a.1(this, d.this));
      AppMethodBeat.o(13711);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.d
 * JD-Core Version:    0.6.2
 */