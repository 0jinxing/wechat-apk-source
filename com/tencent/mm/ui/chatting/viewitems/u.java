package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.e.b;

public final class u
{
  public static void a(com.tencent.mm.ui.chatting.d.a parama, String paramString, bi.a parama1, a parama2)
  {
    AppMethodBeat.i(33119);
    if (!ad.aox(paramString))
      AppMethodBeat.o(33119);
    while (true)
    {
      return;
      String str = parama1.xZm;
      str = ((b)g.K(b.class)).a(str, "openim_card_type_name", b.a.geR);
      if (TextUtils.isEmpty(str))
      {
        parama2.zeH.setText(2131298191);
        label63: parama2.zeG.setBackgroundResource(2130838444);
        c.v(parama2.zeG, paramString);
        str = parama1.xZo;
        paramString = parama1.xZn;
        if (com.tencent.mm.platformtools.ah.isNullOrNil(str))
          break label173;
      }
      label173: for (parama = ((b)g.K(b.class)).a(parama.yTx.getContext(), str, paramString, parama2.zeI.getTextSize()); ; parama = paramString)
      {
        if (TextUtils.isEmpty(parama))
          break label178;
        parama2.zeI.setVisibility(0);
        parama2.zeI.setText(parama);
        AppMethodBeat.o(33119);
        break;
        parama2.zeH.setText(str);
        break label63;
      }
      label178: parama2.zeI.setVisibility(8);
      AppMethodBeat.o(33119);
    }
  }

  public static void a(com.tencent.mm.ui.chatting.d.a parama, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, bi parambi)
  {
    AppMethodBeat.i(33120);
    Object localObject = paramString2;
    if (paramBoolean1)
    {
      localObject = paramString2;
      if (paramBoolean2)
        localObject = bf.oz(paramString2);
    }
    aw.ZK();
    localObject = com.tencent.mm.model.c.XO().Rn((String)localObject);
    if (localObject == null)
    {
      AppMethodBeat.o(33120);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", ((bi.a)localObject).svN);
    localIntent.putExtra("Contact_Alias", ((bi.a)localObject).dFl);
    localIntent.putExtra("Contact_Nick", ((bi.a)localObject).nickname);
    localIntent.putExtra("Contact_QuanPin", ((bi.a)localObject).gwG);
    localIntent.putExtra("Contact_PyInitial", ((bi.a)localObject).gwF);
    localIntent.putExtra("Contact_Uin", ((bi.a)localObject).pnz);
    localIntent.putExtra("Contact_Mobile_MD5", ((bi.a)localObject).xZi);
    localIntent.putExtra("Contact_full_Mobile_MD5", ((bi.a)localObject).xZj);
    localIntent.putExtra("Contact_QQNick", ((bi.a)localObject).dtZ());
    localIntent.putExtra("User_From_Fmessage", false);
    localIntent.putExtra("Contact_Scene", ((bi.a)localObject).scene);
    localIntent.putExtra("Contact_FMessageCard", true);
    localIntent.putExtra("Contact_RemarkName", ((bi.a)localObject).gwK);
    localIntent.putExtra("Contact_VUser_Info_Flag", ((bi.a)localObject).ufB);
    localIntent.putExtra("Contact_VUser_Info", ((bi.a)localObject).duh);
    localIntent.putExtra("Contact_BrandIconURL", ((bi.a)localObject).pln);
    localIntent.putExtra("Contact_Province", ((bi.a)localObject).getProvince());
    localIntent.putExtra("Contact_City", ((bi.a)localObject).getCity());
    localIntent.putExtra("Contact_Sex", ((bi.a)localObject).dtS);
    localIntent.putExtra("Contact_Signature", ((bi.a)localObject).signature);
    localIntent.putExtra("Contact_ShowUserName", true);
    localIntent.putExtra("Contact_KSnsIFlag", 0);
    localIntent.putExtra("Contact_Source_FMessage", 17);
    localIntent.putExtra("source_from_user_name", paramString1);
    localIntent.putExtra("source_from_nick_name", s.mI(paramString1));
    localIntent.putExtra(e.b.yfT, ((bi.a)localObject).vqs);
    localIntent.putExtra("key_add_contact_openim_appid", ((bi.a)localObject).xZm);
    localIntent.putExtra("key_add_contact_custom_detail", ((bi.a)localObject).xZp);
    if ((((bi.a)localObject).ufB & 0x8) > 0)
    {
      if (!com.tencent.mm.platformtools.ah.isNullOrNil(paramString1))
      {
        aw.ZK();
        if (com.tencent.mm.model.c.XM().aoO(paramString1).dsf());
      }
      else
      {
        localIntent.putExtra("Contact_Scene", 17);
        com.tencent.mm.plugin.report.service.h.pYm.X(10298, ((bi.a)localObject).svN + ",17");
      }
    }
    else
    {
      label492: if ((ad.aox(((bi.a)localObject).svN)) && (((bi.a)localObject).scene == 0))
        localIntent.putExtra("Contact_Scene", 17);
      if (t.kv(((bi.a)localObject).ufB))
      {
        if (!parama.dFx())
          break label696;
        localIntent.putExtra("preChatTYPE", 2);
      }
    }
    while (true)
    {
      localIntent.putExtra("prePublishId", "msg_" + parambi.field_msgSvrId);
      paramString2 = paramString1;
      if (com.tencent.mm.platformtools.ah.isNullOrNil(paramString1))
        paramString2 = r.Yz();
      localIntent.putExtra("preUsername", paramString2);
      localIntent.putExtra("preChatName", parambi.field_talker);
      d.b(parama.yTx.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
      com.tencent.mm.bq.a.Lu(((bi.a)localObject).scene);
      AppMethodBeat.o(33120);
      break;
      localIntent.putExtra("Contact_Scene", 41);
      com.tencent.mm.plugin.report.service.h.pYm.X(10298, ((bi.a)localObject).svN + ",41");
      break label492;
      label696: localIntent.putExtra("preChatTYPE", 1);
    }
  }

  static final class a extends c.a
  {
    TextView ejp;
    public int zcJ;
    ImageView zci;
    ImageView zeG;
    TextView zeH;
    TextView zeI;

    public final c.a z(View paramView, boolean paramBoolean)
    {
      AppMethodBeat.i(33106);
      super.eP(paramView);
      this.zeG = ((ImageView)paramView.findViewById(2131822591));
      this.enf = ((TextView)paramView.findViewById(2131820587));
      this.zeH = ((TextView)paramView.findViewById(2131822594));
      this.zeI = ((TextView)paramView.findViewById(2131822593));
      this.ejp = ((TextView)paramView.findViewById(2131822592));
      this.qkY = ((TextView)paramView.findViewById(2131821102));
      this.jPL = paramView.findViewById(2131822515);
      this.moo = ((CheckBox)paramView.findViewById(2131820580));
      this.iVh = paramView.findViewById(2131820586);
      if (!paramBoolean)
      {
        this.zby = ((ImageView)paramView.findViewById(2131822629));
        this.zci = ((ImageView)paramView.findViewById(2131822661));
        this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
      }
      this.zcJ = c.hV(com.tencent.mm.sdk.platformtools.ah.getContext());
      AppMethodBeat.o(33106);
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.u
 * JD-Core Version:    0.6.2
 */