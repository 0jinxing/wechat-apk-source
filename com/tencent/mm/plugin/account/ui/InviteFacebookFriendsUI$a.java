package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.plugin.account.friend.a.g;
import com.tencent.mm.plugin.account.friend.a.q;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;

public final class InviteFacebookFriendsUI$a extends p<g>
{
  private int[] gty;
  String gtz;
  private boolean[] gxh;

  public InviteFacebookFriendsUI$a(Context paramContext, p.a parama)
  {
    super(paramContext, new g());
    AppMethodBeat.i(124888);
    super.a(parama);
    AppMethodBeat.o(124888);
  }

  public final void KC()
  {
    AppMethodBeat.i(124892);
    com.tencent.mm.plugin.account.friend.a.h localh = com.tencent.mm.plugin.account.a.getFacebookFrdStg();
    String str = this.gtz;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where facebookfriend.status = 102 ");
    if ((str != null) && (str.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("facebookfriend.fbname like '%" + str + "%' or ");
      localStringBuilder.append("facebookfriend.nickname like '%" + str + "%' or ");
      localStringBuilder.append("facebookfriend.username like '%" + str + "%' ) ");
    }
    setCursor(localh.fni.a("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + localStringBuilder.toString() + " order by  case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end  , nicknamepyinitial", null, 0));
    this.gty = new int[getCount()];
    this.gxh = new boolean[getCount()];
    super.notifyDataSetChanged();
    AppMethodBeat.o(124892);
  }

  public final void KD()
  {
    AppMethodBeat.i(124893);
    KC();
    AppMethodBeat.o(124893);
  }

  public final long[] aqS()
  {
    AppMethodBeat.i(124890);
    Object localObject = this.gxh;
    int i = localObject.length;
    int j = 0;
    for (int k = 0; j < i; k = m)
    {
      m = k;
      if (localObject[j] != 0)
        m = k + 1;
      j++;
    }
    localObject = new long[k];
    j = 0;
    int m = 0;
    if (m < getCount())
    {
      if (this.gxh[m] == 0)
        break label109;
      localObject[j] = ((g)getItem(m)).dtU;
      j++;
    }
    label109: 
    while (true)
    {
      m++;
      break;
      AppMethodBeat.o(124890);
      return localObject;
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(124889);
    g localg = (g)getItem(paramInt);
    Bitmap localBitmap;
    if (paramView == null)
    {
      paramViewGroup = new InviteFacebookFriendsUI.a.a();
      paramView = View.inflate(this.context, 2130969484, null);
      paramViewGroup.eks = ((ImageView)paramView.findViewById(2131823840));
      paramViewGroup.gtG = ((TextView)paramView.findViewById(2131823841));
      paramViewGroup.gxk = ((TextView)paramView.findViewById(2131823846));
      paramViewGroup.gxl = ((CheckBox)paramView.findViewById(2131823847));
      paramView.setTag(paramViewGroup);
      paramViewGroup.gtG.setText(j.b(this.context, localg.apL(), paramViewGroup.gtG.getTextSize()));
      localBitmap = b.pS(localg.dtU);
      if (localBitmap != null)
        break label221;
      paramViewGroup.eks.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231172));
      label165: paramViewGroup.gxl.setChecked(this.gxh[paramInt]);
      if (!com.tencent.mm.plugin.account.a.getInviteFriendOpenStg().wi(Long.toString(localg.dtU)))
        break label233;
      paramViewGroup.gxk.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(124889);
      return paramView;
      paramViewGroup = (InviteFacebookFriendsUI.a.a)paramView.getTag();
      break;
      label221: paramViewGroup.eks.setImageBitmap(localBitmap);
      break label165;
      label233: paramViewGroup.gxk.setVisibility(8);
    }
  }

  public final void na(int paramInt)
  {
    AppMethodBeat.i(124891);
    if ((paramInt < 0) || (paramInt >= this.gxh.length))
    {
      AppMethodBeat.o(124891);
      return;
    }
    boolean[] arrayOfBoolean = this.gxh;
    if (arrayOfBoolean[paramInt] == 0);
    for (int i = 1; ; i = 0)
    {
      arrayOfBoolean[paramInt] = i;
      super.notifyDataSetChanged();
      AppMethodBeat.o(124891);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI.a
 * JD-Core Version:    0.6.2
 */