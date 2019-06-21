package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;

public final class c extends p<com.tencent.mm.aj.a.c>
  implements n.b
{
  private final MMActivity crP;
  private com.tencent.mm.at.a.a.c elH;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.f jJQ;
  protected MMSlideDelView.d jJR;
  private final String jMp;

  public c(Context paramContext, p.a parama, String paramString)
  {
    super(paramContext, new com.tencent.mm.aj.a.c());
    AppMethodBeat.i(30100);
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.elH = null;
    super.a(parama);
    this.crP = ((MMActivity)paramContext);
    this.jMp = paramString;
    paramContext = new com.tencent.mm.at.a.a.c.a();
    paramContext.ePK = com.tencent.mm.aj.a.e.cC(this.jMp);
    paramContext.ePH = true;
    paramContext.ePZ = true;
    paramContext.ePT = 2131231172;
    this.elH = paramContext.ahG();
    AppMethodBeat.o(30100);
  }

  public final void KC()
  {
    AppMethodBeat.i(30101);
    bIf();
    d locald = z.aeT();
    Object localObject = this.jMp;
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("select * from BizChatInfo");
    localStringBuilder1.append(" where brandUserName = '").append((String)localObject).append("'");
    localStringBuilder1.append(" and (bitFlag & 8) != 0 ");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" order by ");
    localObject = new StringBuffer();
    ((StringBuffer)localObject).append(" case when length(BizChatInfo.chatNamePY) > 0 then upper(BizChatInfo.chatNamePY) ");
    ((StringBuffer)localObject).append(" else upper(BizChatInfo.chatName) end asc, ");
    ((StringBuffer)localObject).append(" upper(BizChatInfo.chatNamePY) asc, ");
    ((StringBuffer)localObject).append(" upper(BizChatInfo.chatName) asc ");
    localStringBuilder2.append(((StringBuffer)localObject).toString());
    ab.d("MicroMsg.BizChatInfoStorage", "getBizChatFavCursor: sql:%s", new Object[] { localStringBuilder1.toString() });
    setCursor(locald.bSd.rawQuery(localStringBuilder1.toString(), null));
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(30101);
  }

  public final void KD()
  {
    AppMethodBeat.i(30104);
    KC();
    AppMethodBeat.o(30104);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(30105);
    super.a(paramInt, paramn, paramObject);
    AppMethodBeat.o(30105);
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
    AppMethodBeat.i(30103);
    com.tencent.mm.aj.a.c localc = (com.tencent.mm.aj.a.c)getItem(paramInt);
    if (paramView == null)
    {
      paramViewGroup = new c.a();
      paramView = View.inflate(this.crP, 2130969401, null);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
      paramViewGroup.ejp = ((TextView)paramView.findViewById(2131821227));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      o.ahp().a(localc.field_headImageUrl, paramViewGroup.ejo, this.elH);
      paramViewGroup.ejp.setText(j.b(this.crP, localc.field_chatName, (int)paramViewGroup.ejp.getTextSize()));
      AppMethodBeat.o(30103);
      return paramView;
      paramViewGroup = (c.a)paramView.getTag();
    }
  }

  public final int getViewTypeCount()
  {
    return 1;
  }

  public final void onPause()
  {
    AppMethodBeat.i(30102);
    if (this.jJR != null)
      this.jJR.bIp();
    AppMethodBeat.o(30102);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.c
 * JD-Core Version:    0.6.2
 */