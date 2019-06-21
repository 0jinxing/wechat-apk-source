package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.b.i;
import com.tencent.mm.openim.e.e;
import com.tencent.mm.openim.e.f;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class SeeAccessVerifyInfoUI$b extends BaseAdapter
{
  List<SeeAccessVerifyInfoUI.a> elG;
  private c elH;
  Context mContext;

  public SeeAccessVerifyInfoUI$b(SeeAccessVerifyInfoUI paramSeeAccessVerifyInfoUI, Context paramContext)
  {
    AppMethodBeat.i(104268);
    this.elG = new ArrayList();
    this.elH = null;
    this.mContext = paramContext;
    Kk();
    paramSeeAccessVerifyInfoUI = new c.a();
    paramSeeAccessVerifyInfoUI.ePH = true;
    paramSeeAccessVerifyInfoUI.ePZ = true;
    paramSeeAccessVerifyInfoUI.ePT = 2131231172;
    this.elH = paramSeeAccessVerifyInfoUI.ahG();
    AppMethodBeat.o(104268);
  }

  private void Kk()
  {
    AppMethodBeat.i(104269);
    String[] arrayOfString2;
    String[] arrayOfString3;
    String[] arrayOfString4;
    label110: String[] arrayOfString5;
    label137: int i;
    String str2;
    label197: String str3;
    label222: String str4;
    label250: String str5;
    if (!bo.isNullOrNil(SeeAccessVerifyInfoUI.l(this.elC)))
    {
      String[] arrayOfString1 = SeeAccessVerifyInfoUI.l(this.elC).split(",");
      if (!bo.isNullOrNil(SeeAccessVerifyInfoUI.n(this.elC)))
      {
        arrayOfString2 = SeeAccessVerifyInfoUI.n(this.elC).split(",");
        if (bo.isNullOrNil(SeeAccessVerifyInfoUI.o(this.elC)))
          break label339;
        arrayOfString3 = SeeAccessVerifyInfoUI.o(this.elC).split(",");
        if (bo.isNullOrNil(SeeAccessVerifyInfoUI.p(this.elC)))
          break label351;
        arrayOfString4 = SeeAccessVerifyInfoUI.p(this.elC).split(",");
        if (bo.isNullOrNil(SeeAccessVerifyInfoUI.q(this.elC)))
          break label364;
        arrayOfString5 = SeeAccessVerifyInfoUI.q(this.elC).split(",");
        this.elG.clear();
        for (i = 0; ; i++)
        {
          if (i >= arrayOfString1.length)
            break label415;
          List localList = this.elG;
          SeeAccessVerifyInfoUI localSeeAccessVerifyInfoUI = this.elC;
          String str1 = arrayOfString1[i];
          if ((arrayOfString2.length > i) && (!bo.isNullOrNil(arrayOfString2[i])))
            break;
          str2 = arrayOfString1[i];
          if ((arrayOfString3 != null) && (arrayOfString3.length > i) && (!bo.isNullOrNil(arrayOfString3[i])))
            break label386;
          str3 = "";
          if ((arrayOfString4 != null) && (arrayOfString4.length > i) && (!bo.isNullOrNil(arrayOfString4[i])))
            break label395;
          str4 = "";
          if ((arrayOfString5 != null) && (arrayOfString5.length > i) && (!bo.isNullOrNil(arrayOfString5[i])))
            break label405;
          str5 = "";
          label278: localList.add(new SeeAccessVerifyInfoUI.a(localSeeAccessVerifyInfoUI, str1, str2, str3, str4, str5));
        }
      }
    }
    else
    {
      ab.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesUsernames null");
      AppMethodBeat.o(104269);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesNicknames null");
      AppMethodBeat.o(104269);
      continue;
      label339: ab.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesAppids null");
      arrayOfString3 = null;
      break;
      label351: ab.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesDescids null");
      arrayOfString4 = null;
      break label110;
      label364: ab.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesHeadimgurls null");
      arrayOfString5 = null;
      break label137;
      str2 = arrayOfString2[i];
      break label197;
      label386: str3 = arrayOfString3[i];
      break label222;
      label395: str4 = arrayOfString4[i];
      break label250;
      label405: str5 = arrayOfString5[i];
      break label278;
      label415: AppMethodBeat.o(104269);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(104270);
    int i = this.elG.size();
    AppMethodBeat.o(104270);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(104271);
    Object localObject = this.elG.get(paramInt);
    AppMethodBeat.o(104271);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(104272);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130970531, null);
      paramViewGroup = this.elC.cd(paramView);
    }
    label477: 
    while (true)
    {
      paramViewGroup.ejo.setVisibility(0);
      paramViewGroup.elJ.setVisibility(0);
      o.ahp().a(((SeeAccessVerifyInfoUI.a)this.elG.get(paramInt)).elF, paramViewGroup.ejo, this.elH);
      paramViewGroup.elJ.setText(j.b(this.mContext, bo.nullAsNil(((SeeAccessVerifyInfoUI.a)this.elG.get(paramInt)).nickname), paramViewGroup.elJ.getTextSize()));
      e locale;
      if (ad.aox(((SeeAccessVerifyInfoUI.a)this.elG.get(paramInt)).username))
      {
        SeeAccessVerifyInfoUI.r(this.elC);
        locale = new e();
        locale.field_appid = bo.nullAsNil(((SeeAccessVerifyInfoUI.a)this.elG.get(paramInt)).csB);
        locale.field_wordingId = bo.nullAsNil(((SeeAccessVerifyInfoUI.a)this.elG.get(paramInt)).elE);
        locale.field_language = aa.gw(ah.getContext());
        g.RQ();
        ((PluginOpenIM)g.M(PluginOpenIM.class)).getWordingInfoStg().b(locale, new String[] { "appid", "wordingId", "language" });
        if (!TextUtils.isEmpty(locale.field_wording))
        {
          paramViewGroup.elK.setVisibility(0);
          paramViewGroup.elK.setText("＠" + locale.field_wording);
        }
      }
      while (true)
      {
        paramView.setOnClickListener(new SeeAccessVerifyInfoUI.b.1(this, paramInt));
        AppMethodBeat.o(104272);
        return paramView;
        paramViewGroup = (SeeAccessVerifyInfoUI.c)paramView.getTag();
        if (paramViewGroup != null)
          break label477;
        paramViewGroup = this.elC.cd(paramView);
        break;
        if ((!bo.isNullOrNil(locale.field_appid)) && (!bo.isNullOrNil(locale.field_wordingId)))
        {
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(locale.field_wordingId);
          if (!bo.C(paramViewGroup.elK.getTag(), "first"))
          {
            SeeAccessVerifyInfoUI.s(this.elC);
            g.RO().eJo.a(new i(locale.field_appid, locale.field_language, localLinkedList), 0);
          }
        }
        paramViewGroup.elK.setVisibility(4);
        paramViewGroup.elK.setTag("first");
        continue;
        paramViewGroup.elK.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.b
 * JD-Core Version:    0.6.2
 */