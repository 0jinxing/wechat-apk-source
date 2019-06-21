package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;

final class a extends p<ak>
  implements n.b
{
  private final MMActivity crP;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.f jJQ;
  protected MMSlideDelView.d jJR;

  public a(Context paramContext, p.a parama)
  {
    super(paramContext, new ak());
    AppMethodBeat.i(18545);
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    super.a(parama);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(18545);
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(18550);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(18550);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  final String E(ad paramad)
  {
    AppMethodBeat.i(18549);
    paramad = com.tencent.mm.plugin.bottle.a.c.a(this.crP, paramad);
    AppMethodBeat.o(18549);
    return paramad;
  }

  public final void KC()
  {
    AppMethodBeat.i(18546);
    aw.ZK();
    setCursor(com.tencent.mm.model.c.XR().dsP());
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(18546);
  }

  public final void KD()
  {
    AppMethodBeat.i(18551);
    KC();
    AppMethodBeat.o(18551);
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.jJQ = paramf;
  }

  public final int getItemViewType(int paramInt)
  {
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18548);
    ak localak = (ak)getItem(paramInt);
    Object localObject;
    label259: label478: label499: int i;
    int j;
    int k;
    if (paramView == null)
    {
      paramViewGroup = new a.a();
      paramView = (MMSlideDelView)View.inflate(this.crP, 2130968832, null);
      localObject = View.inflate(this.crP, 2130970931, null);
      paramViewGroup.ejo = ((ImageView)((View)localObject).findViewById(2131821183));
      paramViewGroup.ejp = ((TextView)((View)localObject).findViewById(2131823149));
      paramViewGroup.jJT = ((TextView)((View)localObject).findViewById(2131823150));
      paramViewGroup.jJU = ((TextView)((View)localObject).findViewById(2131823151));
      paramViewGroup.iYg = ((ImageView)((View)localObject).findViewById(2131828242));
      paramViewGroup.jJV = ((TextView)((View)localObject).findViewById(2131821067));
      paramViewGroup.jJW = paramView.findViewById(2131821704);
      paramViewGroup.jJX = ((TextView)paramView.findViewById(2131821082));
      paramView.setView((View)localObject);
      paramView.setPerformItemClickListener(this.jJO);
      paramView.setGetViewPositionCallback(this.jJP);
      paramView.setItemStatusCallBack(this.jJR);
      paramView.setEnable(false);
      paramView.setTag(paramViewGroup);
      aw.ZK();
      localObject = com.tencent.mm.model.c.XM().aoO(localak.field_username);
      paramViewGroup.ejp.setText(E((ad)localObject));
      TextView localTextView = paramViewGroup.jJT;
      if (localak.field_status != 1)
        break label623;
      localObject = this.crP.getString(2131301306);
      localTextView.setText((CharSequence)localObject);
      a.b.b(paramViewGroup.ejo, ad.aoC(localak.field_username));
      aw.ZK();
      localObject = com.tencent.mm.model.c.XR().Cb().a(localak.field_isSend, localak.field_username, localak.field_content, FB(localak.field_msgType), this.crP);
      paramViewGroup.jJU.setText(j.b(this.crP, (CharSequence)localObject, paramViewGroup.jJU.getTextSize()));
      paramViewGroup.jJU.setTextColor(com.tencent.mm.bz.a.h(this.crP, 2131690754));
      if ((FB(localak.field_msgType) == 34) && (localak.field_isSend == 0) && (!bo.isNullOrNil(localak.field_content)) && (!new n(localak.field_content).fWX))
        paramViewGroup.jJU.setTextColor(com.tencent.mm.bz.a.h(this.crP, 2131690755));
      switch (localak.field_status)
      {
      case 3:
      case 4:
      default:
        paramInt = -1;
        if (paramInt != -1)
        {
          paramViewGroup.iYg.setBackgroundResource(paramInt);
          paramViewGroup.iYg.setVisibility(0);
          paramViewGroup.jJW.setTag(localak.field_username);
          paramViewGroup.jJW.setOnClickListener(new a.1(this));
          paramInt = paramView.getPaddingBottom();
          i = paramView.getPaddingTop();
          j = paramView.getPaddingRight();
          k = paramView.getPaddingLeft();
          if (localak.field_unReadCount <= 100)
            break label677;
          paramViewGroup.jJV.setText("...");
          paramViewGroup.jJV.setVisibility(0);
          ab.v("MicroMsg.BottleConversationAdapter", "has unread 100");
        }
        break;
      case 0:
      case 1:
      case 2:
      case 5:
      }
    }
    while (true)
    {
      paramView.setBackgroundResource(2130840827);
      paramView.setPadding(k, i, j, paramInt);
      AppMethodBeat.o(18548);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label623: localObject = h.c(this.crP, localak.field_conversationTime, true);
      break label259;
      paramInt = -1;
      break label478;
      paramInt = 2131231663;
      break label478;
      paramInt = -1;
      break label478;
      paramInt = 2131231662;
      break label478;
      paramViewGroup.iYg.setVisibility(8);
      break label499;
      label677: if (localak.field_unReadCount > 0)
      {
        paramViewGroup.jJV.setText(localak.field_unReadCount);
        paramViewGroup.jJV.setVisibility(0);
        ab.v("MicroMsg.BottleConversationAdapter", "has unread");
      }
      else
      {
        paramViewGroup.jJV.setVisibility(4);
        ab.v("MicroMsg.BottleConversationAdapter", "no unread");
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 1;
  }

  public final void onPause()
  {
    AppMethodBeat.i(18547);
    if (this.jJR != null)
      this.jJR.bIp();
    AppMethodBeat.o(18547);
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.a
 * JD-Core Version:    0.6.2
 */