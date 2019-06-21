package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.c;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;

public final class b extends p<av>
{
  private Context context;
  private View.OnClickListener stx;
  private View.OnClickListener sty;

  public b(Context paramContext)
  {
    super(paramContext, new av());
    AppMethodBeat.i(25351);
    this.stx = new b.2(this);
    this.sty = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(25349);
        Object localObject1;
        Object localObject2;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.pluginsdk.ui.preference.b))
        {
          ab.d("MicroMsg.FMessageConversationUI", "verifyOkOnClick onClick");
          localObject1 = (com.tencent.mm.pluginsdk.ui.preference.b)paramAnonymousView.getTag();
          localObject2 = com.tencent.mm.bi.d.akO().apx(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
          if ((localObject2 == null) || (((ax)localObject2).field_msgContent == null))
          {
            ab.e("MicroMsg.FMessageConversationUI", "lastRecvFmsg is null, verify fail, talker = " + ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
            AppMethodBeat.o(25349);
          }
        }
        while (true)
        {
          return;
          paramAnonymousView = bi.d.apF(((ax)localObject2).field_msgContent);
          ab.d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username + ", opcode = MM_VERIFYUSER_VERIFYOK");
          if (paramAnonymousView.xZy == 1)
          {
            h.a(b.a(b.this), paramAnonymousView.xZz, null, b.a(b.this).getString(2131299908), b.a(b.this).getString(2131296868), true, new b.3.1(this, (ax)localObject2), null);
            AppMethodBeat.o(25349);
          }
          else
          {
            com.tencent.mm.model.aw.ZK();
            bv localbv = c.XN().RB(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("Contact_User", ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
            ((Intent)localObject2).putExtra("Contact_Nick", ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).nickname);
            if (localbv != null)
              ((Intent)localObject2).putExtra("Contact_RemarkName", localbv.field_conRemark);
            if (!bo.isNullOrNil(paramAnonymousView.chatroomName))
            {
              com.tencent.mm.model.aw.ZK();
              localObject1 = c.XV().oa(paramAnonymousView.chatroomName);
              if (localObject1 != null)
                ((Intent)localObject2).putExtra("Contact_RoomNickname", ((u)localObject1).mJ(paramAnonymousView.svN));
            }
            ((Intent)localObject2).putExtra("Contact_Scene", paramAnonymousView.scene);
            ((Intent)localObject2).putExtra("Verify_ticket", paramAnonymousView.mGZ);
            ((Intent)localObject2).putExtra("sayhi_with_sns_perm_send_verify", false);
            ((Intent)localObject2).putExtra("sayhi_with_sns_perm_add_remark", true);
            ((Intent)localObject2).putExtra("sayhi_with_sns_perm_set_label", true);
            ((Intent)localObject2).putExtra("sayhi_with_jump_to_profile", true);
            com.tencent.mm.bp.d.b(b.a(b.this), "profile", ".ui.SayHiWithSnsPermissionUI", (Intent)localObject2);
            AppMethodBeat.o(25349);
          }
        }
      }
    };
    this.context = paramContext;
    AppMethodBeat.o(25351);
  }

  public final void KC()
  {
    AppMethodBeat.i(25353);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      setCursor(com.tencent.mm.bi.d.akP().baR());
      notifyDataSetChanged();
      AppMethodBeat.o(25353);
    }
    while (true)
    {
      return;
      al.d(new b.1(this));
      AppMethodBeat.o(25353);
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(25354);
    bIf();
    KC();
    AppMethodBeat.o(25354);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25352);
    av localav;
    if (paramView == null)
    {
      paramView = v.hu(this.context).inflate(2130969576, null);
      paramViewGroup = new a();
      paramViewGroup.stF = ((MaskLayout)paramView.findViewById(2131824087));
      paramViewGroup.pnE = ((TextView)paramView.findViewById(2131824089));
      paramViewGroup.stK = ((TextView)paramView.findViewById(2131824090));
      paramViewGroup.stG = ((Button)paramView.findViewById(2131824092));
      paramViewGroup.stG.setOnClickListener(this.stx);
      paramViewGroup.stH = ((Button)paramView.findViewById(2131824093));
      paramViewGroup.stH.setOnClickListener(this.sty);
      paramViewGroup.stI = ((TextView)paramView.findViewById(2131824094));
      paramViewGroup.stJ = ((TextView)paramView.findViewById(2131824095));
      paramViewGroup.gnf = ((TextView)paramView.findViewById(2131824085));
      paramView.setTag(paramViewGroup);
      localav = (av)getItem(paramInt);
      a.b.b((ImageView)paramViewGroup.stF.getContentView(), localav.field_talker);
      paramViewGroup.pnE.setText(j.b(this.context, localav.field_displayName, paramViewGroup.pnE.getTextSize()));
      if (localav.field_fmsgSysRowId > 0L)
        break label529;
      ab.w("MicroMsg.FMessageConversationUI", "getView, fconv fmsgSysRowId is invalid, try getLastFmsg");
      localObject1 = com.tencent.mm.bi.d.akO().apw(localav.field_talker);
      if (localObject1 != null)
        break label341;
      ab.e("MicroMsg.FMessageConversationUI", "getView, lastFmsg is null, talker = " + localav.field_talker);
      paramViewGroup.stG.setVisibility(8);
      paramViewGroup.stH.setVisibility(8);
      paramViewGroup.stI.setVisibility(8);
      paramViewGroup.stJ.setVisibility(8);
      paramViewGroup.stK.setVisibility(8);
      AppMethodBeat.o(25352);
    }
    label341: Object localObject2;
    while (true)
    {
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.b(this.context, (ax)localObject1);
      ab.i("MicroMsg.FMessageConversationUI", "getView, lastFmsg talker = " + localav.field_talker);
      if (localav.field_state == 1)
      {
        com.tencent.mm.model.aw.ZK();
        localObject2 = c.XM().aoO(localav.field_talker);
        if ((localObject2 != null) && ((int)((com.tencent.mm.n.a)localObject2).ewQ != 0) && (!com.tencent.mm.n.a.jh(((ap)localObject2).field_type)))
          com.tencent.mm.bi.d.akP().ep(localav.field_talker, 0);
      }
      if (localObject1 != null)
        break label660;
      ab.e("MicroMsg.FMessageConversationUI", "getView, fProvider is null, talker = " + localav.field_talker);
      paramViewGroup.stG.setVisibility(8);
      paramViewGroup.stH.setVisibility(8);
      paramViewGroup.stI.setVisibility(8);
      paramViewGroup.stJ.setVisibility(8);
      paramViewGroup.stK.setVisibility(8);
      AppMethodBeat.o(25352);
    }
    label529: Object localObject1 = this.context;
    long l = localav.field_fmsgSysRowId;
    if (localav.field_fmsgIsSend % 2 == 0);
    for (boolean bool = true; ; bool = false)
    {
      localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a((Context)localObject1, l, bool, localav.field_talker, localav.field_fmsgContent, localav.field_fmsgType, localav.field_contentFromUsername, localav.field_contentNickname, localav.field_contentPhoneNumMD5, localav.field_contentFullPhoneNumMD5, localav.field_contentVerifyContent, localav.field_addScene);
      ab.i("MicroMsg.FMessageConversationUI", "getView, lastFmsg sysrowid = " + localav.field_fmsgSysRowId + ", talker = " + localav.field_talker);
      break;
    }
    label660: ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).qvb = localav.field_addScene;
    paramViewGroup.stK.setText(j.b(this.context, ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).fjz, paramViewGroup.stK.getTextSize()));
    switch (localav.field_state)
    {
    default:
      paramViewGroup.stG.setVisibility(8);
      paramViewGroup.stH.setVisibility(8);
      paramViewGroup.stI.setVisibility(8);
      paramViewGroup.stJ.setVisibility(8);
      label764: paramView.findViewById(2131824086).setBackgroundResource(2130840827);
      l = cb.aaE();
      if ((paramInt == 0) && (localav.field_lastModifiedTime + 259200000L >= l))
      {
        paramViewGroup.gnf.setVisibility(0);
        paramViewGroup.gnf.setText(this.context.getString(2131299917));
      }
      break;
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(25352);
      break;
      int i;
      if (localav.field_fmsgSysRowId <= 0L)
      {
        ab.w("MicroMsg.FMessageConversationUI", "getView, fmsgSysRowId invalid, try use lastRecvFmsg");
        localObject2 = com.tencent.mm.bi.d.akO().apx(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
        if (localObject2 == null)
        {
          i = 0;
          label874: if ((i != 0) && (i != 3))
            break label952;
          paramViewGroup.stG.setVisibility(0);
          paramViewGroup.stG.setTag(localObject1);
          paramViewGroup.stH.setVisibility(8);
        }
      }
      while (true)
      {
        paramViewGroup.stI.setVisibility(8);
        paramViewGroup.stJ.setVisibility(8);
        break;
        i = ((ax)localObject2).field_type;
        break label874;
        i = localav.field_recvFmsgType;
        break label874;
        label952: paramViewGroup.stH.setVisibility(0);
        paramViewGroup.stH.setTag(localObject1);
        paramViewGroup.stG.setVisibility(8);
      }
      paramViewGroup.stI.setVisibility(0);
      paramViewGroup.stG.setVisibility(8);
      paramViewGroup.stH.setVisibility(8);
      paramViewGroup.stJ.setVisibility(8);
      break label764;
      paramViewGroup.stJ.setVisibility(0);
      paramViewGroup.stG.setVisibility(8);
      paramViewGroup.stH.setVisibility(8);
      paramViewGroup.stI.setVisibility(8);
      break label764;
      if (((paramInt == 0) || (((av)getItem(paramInt - 1)).field_lastModifiedTime + 259200000L >= l)) && (((av)getItem(paramInt)).field_lastModifiedTime + 259200000L < l))
      {
        paramViewGroup.gnf.setVisibility(0);
        paramViewGroup.gnf.setText(this.context.getString(2131299916));
      }
      else
      {
        paramViewGroup.gnf.setVisibility(8);
      }
    }
  }

  static final class a
  {
    public TextView gnf;
    public TextView pnE;
    public MaskLayout stF;
    public Button stG;
    public Button stH;
    public TextView stI;
    public TextView stJ;
    public TextView stK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.b
 * JD-Core Version:    0.6.2
 */