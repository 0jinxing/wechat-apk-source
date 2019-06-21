package com.tencent.mm.plugin.qmessage.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
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

final class c extends p<ak>
  implements n.b
{
  private final MMActivity crP;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.f jJQ;
  protected MMSlideDelView.d jJR;

  public c(Context paramContext, p.a parama)
  {
    super(paramContext, new ak());
    AppMethodBeat.i(24119);
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    super.a(parama);
    this.crP = ((MMActivity)paramContext);
    AppMethodBeat.o(24119);
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(24122);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(24122);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(24120);
    aw.ZK();
    setCursor(com.tencent.mm.model.c.XR().api(t.fkS));
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(24120);
  }

  public final void KD()
  {
    AppMethodBeat.i(24124);
    KC();
    AppMethodBeat.o(24124);
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
    AppMethodBeat.i(24121);
    ak localak = (ak)getItem(paramInt);
    View localView;
    label130: Object localObject;
    if (paramView == null)
    {
      paramViewGroup = new a();
      localView = View.inflate(this.crP, 2130970931, null);
      paramViewGroup.ejo = ((ImageView)localView.findViewById(2131821183));
      paramViewGroup.ejp = ((TextView)localView.findViewById(2131823149));
      paramViewGroup.jJT = ((TextView)localView.findViewById(2131823150));
      paramViewGroup.jJU = ((TextView)localView.findViewById(2131823151));
      paramViewGroup.iYg = ((ImageView)localView.findViewById(2131828242));
      paramViewGroup.jJV = ((TextView)localView.findViewById(2131821067));
      localView.setTag(paramViewGroup);
      paramViewGroup.ejp.setText(s.mJ(localak.field_username));
      localObject = paramViewGroup.jJT;
      if (localak.field_status != 1)
        break label461;
      paramView = this.crP.getString(2131301306);
      label170: ((TextView)localObject).setText(paramView);
      a.b.b(paramViewGroup.ejo, localak.field_username);
      aw.ZK();
      localObject = com.tencent.mm.model.c.XR().Cb();
      if (bo.isNullOrNil(localak.field_digest))
        break label518;
      if (bo.isNullOrNil(localak.field_digestUser))
        break label508;
      if ((localak.field_isSend != 0) || (!t.kH(localak.field_username)))
        break label496;
      paramView = s.getDisplayName(localak.field_digestUser, localak.field_username);
    }
    while (true)
    {
      try
      {
        paramView = String.format(localak.field_digest, new Object[] { paramView });
        paramViewGroup.jJU.setText(j.b(this.crP, paramView, paramViewGroup.jJU.getTextSize()));
        switch (localak.field_status)
        {
        case 3:
        case 4:
        default:
          paramInt = -1;
          if (paramInt == -1)
            break label580;
          paramViewGroup.iYg.setBackgroundResource(paramInt);
          paramViewGroup.iYg.setVisibility(0);
          int i = localView.getPaddingBottom();
          int j = localView.getPaddingTop();
          int k = localView.getPaddingRight();
          paramInt = localView.getPaddingLeft();
          if (localak.field_unReadCount <= 100)
            break label592;
          paramViewGroup.jJV.setText("...");
          paramViewGroup.jJV.setVisibility(0);
          localView.setBackgroundResource(2130839540);
          localView.setPadding(paramInt, j, k, i);
          AppMethodBeat.o(24121);
          return localView;
          paramViewGroup = (a)paramView.getTag();
          localView = paramView;
          break label130;
          label461: if (localak.field_conversationTime == 9223372036854775807L)
          {
            paramView = "";
            break label170;
          }
          paramView = h.c(this.crP, localak.field_conversationTime, true);
          break label170;
          label496: paramView = s.mJ(localak.field_digestUser);
          continue;
          label508: paramView = localak.field_digest;
          continue;
        case 0:
        case 1:
        case 2:
        case 5:
        }
      }
      catch (Exception paramView)
      {
      }
      label518: paramView = ((be.b)localObject).a(localak.field_isSend, localak.field_username, localak.field_content, FB(localak.field_msgType), this.crP);
      continue;
      paramInt = -1;
      continue;
      paramInt = 2131231663;
      continue;
      paramInt = -1;
      continue;
      paramInt = 2131231662;
      continue;
      label580: paramViewGroup.iYg.setVisibility(8);
      continue;
      label592: if (localak.field_unReadCount > 0)
      {
        paramViewGroup.jJV.setText(localak.field_unReadCount);
        paramViewGroup.jJV.setVisibility(0);
      }
      else
      {
        paramViewGroup.jJV.setVisibility(4);
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 1;
  }

  public final void onPause()
  {
    AppMethodBeat.i(24123);
    if (this.jJR != null)
      this.jJR.bIp();
    AppMethodBeat.o(24123);
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }

  public static final class a
  {
    public ImageView ejo;
    public TextView ejp;
    public ImageView iYg;
    public TextView jJT;
    public TextView jJU;
    public TextView jJV;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.c
 * JD-Core Version:    0.6.2
 */