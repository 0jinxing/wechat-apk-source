package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.p;
import java.util.List;

final class BizChatAtSomeoneUI$a extends p<com.tencent.mm.aj.a.j>
{
  private com.tencent.mm.at.a.a.c elH;
  private List<String> elZ;
  String ema;
  private com.tencent.mm.aj.a.c yDI;
  private String[] yDL;
  private Bitmap yDM;

  public BizChatAtSomeoneUI$a(Context paramContext, com.tencent.mm.aj.a.j paramj, com.tencent.mm.aj.a.c paramc, String[] paramArrayOfString, List<String> paramList)
  {
    super(paramContext, paramj);
    AppMethodBeat.i(30031);
    this.elH = null;
    this.yDI = paramc;
    this.yDL = paramArrayOfString;
    this.elZ = paramList;
    paramj = new c.a();
    paramj.ePK = com.tencent.mm.aj.a.e.rz(this.yDI.field_brandUserName);
    paramj.ePH = true;
    paramj.ePZ = true;
    paramj.ePT = 2131231172;
    this.elH = paramj.ahG();
    this.yDM = d.v(paramContext.getResources().getDrawable(2131230920));
    AppMethodBeat.o(30031);
  }

  public final void KC()
  {
    AppMethodBeat.i(30034);
    bIf();
    k localk = z.aeV();
    Object localObject1 = this.yDL;
    Object localObject2 = this.ema;
    List localList = this.elZ;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select *  from BizChatUserInfo where ");
    localObject1 = localStringBuilder.append(k.a((String[])localObject1, localList));
    if ((localObject2 == null) || (((String)localObject2).equals("")));
    for (localObject2 = ""; ; localObject2 = " and (" + "userName like '%" + (String)localObject2 + "%' )")
    {
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder.append(" order by ");
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append(" case when length(BizChatUserInfo.userNamePY) > 0 then upper(BizChatUserInfo.userNamePY) ");
      ((StringBuffer)localObject2).append(" else upper(BizChatUserInfo.userName) end asc, ");
      ((StringBuffer)localObject2).append(" upper(BizChatUserInfo.userNamePY) asc, ");
      ((StringBuffer)localObject2).append(" upper(BizChatUserInfo.userName) asc ");
      ((StringBuilder)localObject1).append(((StringBuffer)localObject2).toString());
      setCursor(localk.bSd.rawQuery(localStringBuilder.toString(), null));
      super.notifyDataSetChanged();
      AppMethodBeat.o(30034);
      return;
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(30035);
    KC();
    AppMethodBeat.o(30035);
  }

  public final int bFs()
  {
    AppMethodBeat.i(30032);
    int i;
    if (BizChatAtSomeoneUI.access$100())
    {
      i = 1;
      AppMethodBeat.o(30032);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(30032);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30033);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130968781, null);
      paramViewGroup = new BizChatAtSomeoneUI.b((byte)0);
      paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131821519));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131821520));
      paramView.setTag(paramViewGroup);
    }
    while ((paramInt == 0) && (BizChatAtSomeoneUI.access$100()))
    {
      paramViewGroup.yDN.setImageBitmap(this.yDM);
      paramViewGroup.emg.setText(this.context.getResources().getString(2131297179, new Object[] { "@" }));
      AppMethodBeat.o(30033);
      return paramView;
      paramViewGroup = (BizChatAtSomeoneUI.b)paramView.getTag();
    }
    if (BizChatAtSomeoneUI.access$100());
    for (int i = 1; ; i = 0)
    {
      Object localObject = (com.tencent.mm.aj.a.j)getItem(paramInt - i);
      paramViewGroup.emg.setTextColor(com.tencent.mm.bz.a.h(this.context, 2131690750));
      ImageView localImageView = (ImageView)paramViewGroup.emP.getContentView();
      o.ahp().a(((com.tencent.mm.aj.a.j)localObject).field_headImageUrl, localImageView, this.elH);
      paramViewGroup.emP.setMaskDrawable(null);
      localObject = BizChatAtSomeoneUI.a(this.yDI, ((com.tencent.mm.aj.a.j)localObject).field_userId);
      paramViewGroup.emg.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.context, (CharSequence)localObject, paramViewGroup.emg.getTextSize()));
      AppMethodBeat.o(30033);
      break;
    }
  }

  public final boolean wK(int paramInt)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI.a
 * JD-Core Version:    0.6.2
 */