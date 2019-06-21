package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.preference.FMessageListView;
import com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference;
import com.tencent.mm.pluginsdk.ui.preference.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.widget.MMNeat7extView;

public class NormalProfileHeaderPreference extends Preference
  implements View.OnClickListener, View.OnLongClickListener
{
  private int gOW;
  public f iFE;
  private ad ldh;
  private Context mContext;
  private View omq;
  private com.tencent.mm.plugin.profile.a.b pkh;
  private boolean pnP = false;
  private String pnQ;
  private boolean pnR;
  private int pnS;
  private boolean readOnly = false;

  public NormalProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public NormalProfileHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }

  private String N(ad paramad)
  {
    AppMethodBeat.i(23661);
    Resources localResources;
    if (caj())
    {
      localResources = this.mContext.getResources();
      if (bo.isNullOrNil(paramad.getCity()))
        paramad = s.mL(paramad.getProvince());
    }
    for (paramad = localResources.getString(2131297710, new Object[] { paramad }).trim(); ; paramad = paramad.Oj())
    {
      paramad = bo.bc(paramad, "");
      AppMethodBeat.o(23661);
      return paramad;
      paramad = paramad.getCity();
      break;
    }
  }

  public static CharSequence a(Context paramContext, ad paramad, int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(23664);
    int i = paramInt;
    if (paramInt == 9)
      i = paramad.getSource();
    switch (i)
    {
    default:
      paramContext = null;
      AppMethodBeat.o(23664);
    case 4:
    case 12:
    case 1:
    case 3:
    case 17:
    case 18:
    case 30:
    case 48:
    case 8:
    case 14:
    case 96:
    case 22:
    case 23:
    case 24:
    case 26:
    case 27:
    case 28:
    case 29:
    case 34:
    case 58:
    case 59:
    case 60:
    case 76:
    case 10:
    case 13:
    case 25:
    case 15:
    case 6:
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getResources().getString(2131299903);
      AppMethodBeat.o(23664);
      continue;
      if ((paramBoolean) || (paramad.Ol() > 1000000))
      {
        paramContext = paramContext.getResources().getString(2131298718);
        AppMethodBeat.o(23664);
      }
      else if (com.tencent.mm.n.a.jh(paramad.field_type))
      {
        paramContext = paramContext.getResources().getString(2131298717);
        AppMethodBeat.o(23664);
      }
      else
      {
        paramContext = paramContext.getResources().getString(2131298719);
        AppMethodBeat.o(23664);
        continue;
        if ((paramBoolean) || (paramad.Ol() > 1000000))
        {
          paramContext = paramContext.getResources().getString(2131298721);
          AppMethodBeat.o(23664);
        }
        else if (com.tencent.mm.n.a.jh(paramad.field_type))
        {
          paramContext = paramContext.getResources().getString(2131298720);
          AppMethodBeat.o(23664);
        }
        else
        {
          paramContext = paramContext.getResources().getString(2131298722);
          AppMethodBeat.o(23664);
          continue;
          Object localObject = s.mJ(((Activity)paramContext).getIntent().getStringExtra("source_from_user_name"));
          paramString = (String)localObject;
          if (bo.isNullOrNil((String)localObject))
            paramString = ((Activity)paramContext).getIntent().getStringExtra("source_from_nick_name");
          if ((paramBoolean) || (paramad.Ol() > 1000000))
          {
            if (bo.isNullOrNil(paramString));
            for (paramContext = paramContext.getString(2131298698); ; paramContext = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, paramContext.getString(2131298697, new Object[] { paramString })))
            {
              AppMethodBeat.o(23664);
              break;
            }
          }
          if (com.tencent.mm.n.a.jh(paramad.field_type))
          {
            if (bo.isNullOrNil(paramString));
            for (paramContext = paramContext.getString(2131298695); ; paramContext = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, paramContext.getString(2131298696, new Object[] { paramString })))
            {
              AppMethodBeat.o(23664);
              break;
            }
          }
          if (!bo.isNullOrNil(paramString))
          {
            paramContext = paramContext.getString(2131298699, new Object[] { paramString });
            AppMethodBeat.o(23664);
          }
          else
          {
            paramContext = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, paramContext.getString(2131298700));
            AppMethodBeat.o(23664);
            continue;
            if ((paramBoolean) || (paramad.Ol() > 1000000))
            {
              paramContext = paramContext.getResources().getString(2131298706);
              AppMethodBeat.o(23664);
            }
            else if (com.tencent.mm.n.a.jh(paramad.field_type))
            {
              paramContext = paramContext.getResources().getString(2131298705);
              AppMethodBeat.o(23664);
            }
            else
            {
              paramContext = paramContext.getResources().getString(2131298707);
              AppMethodBeat.o(23664);
              continue;
              if ((paramBoolean) || (paramad.Ol() > 1000000))
              {
                paramContext = paramContext.getResources().getString(2131298711);
                AppMethodBeat.o(23664);
              }
              else if (com.tencent.mm.n.a.jh(paramad.field_type))
              {
                paramContext = paramContext.getResources().getString(2131298710);
                AppMethodBeat.o(23664);
              }
              else
              {
                paramContext = paramContext.getResources().getString(2131298712);
                AppMethodBeat.o(23664);
                continue;
                paramContext = paramContext.getResources().getString(2131298713);
                AppMethodBeat.o(23664);
                continue;
                paramString = d.akO().apw(paramString);
                localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM();
                if (paramString == null)
                {
                  paramString = "";
                  label864: paramString = ((bd)localObject).aoO(paramString);
                  if (paramString == null)
                    break label935;
                  paramString = paramString.field_nickname;
                  label882: if ((!paramBoolean) && (paramad.Ol() <= 1000000))
                    break label951;
                  if (bo.isNullOrNil(paramString))
                    break label941;
                }
                label935: label941: for (paramContext = paramContext.getString(2131298704, new Object[] { paramString }); ; paramContext = paramContext.getString(2131298702))
                {
                  AppMethodBeat.o(23664);
                  break;
                  paramString = paramString.field_chatroomName;
                  break label864;
                  paramString = "";
                  break label882;
                }
                label951: if (com.tencent.mm.n.a.jh(paramad.field_type))
                {
                  paramContext = paramContext.getResources().getString(2131298703, new Object[] { paramString });
                  AppMethodBeat.o(23664);
                }
                else
                {
                  paramContext = paramContext.getResources().getString(2131298701);
                  AppMethodBeat.o(23664);
                  continue;
                  if ((paramBoolean) || (paramad.Ol() > 1000000))
                  {
                    paramContext = paramContext.getResources().getString(2131298724);
                    AppMethodBeat.o(23664);
                  }
                  else if (com.tencent.mm.n.a.jh(paramad.field_type))
                  {
                    paramContext = paramContext.getResources().getString(2131298723);
                    AppMethodBeat.o(23664);
                  }
                  else
                  {
                    paramContext = paramContext.getResources().getString(2131298725);
                    AppMethodBeat.o(23664);
                    continue;
                    paramContext = paramContext.getResources().getString(2131298690);
                    AppMethodBeat.o(23664);
                    continue;
                    paramContext = paramContext.getResources().getString(2131300369);
                    AppMethodBeat.o(23664);
                    continue;
                    paramContext = paramContext.getResources().getString(2131298708);
                    AppMethodBeat.o(23664);
                    continue;
                    if ((paramBoolean) || (paramad.Ol() > 1000000))
                    {
                      paramContext = paramContext.getResources().getString(2131298727);
                      AppMethodBeat.o(23664);
                    }
                    else if (com.tencent.mm.n.a.jh(paramad.field_type))
                    {
                      paramContext = paramContext.getResources().getString(2131298726);
                      AppMethodBeat.o(23664);
                    }
                    else
                    {
                      paramContext = paramContext.getResources().getString(2131298728);
                      AppMethodBeat.o(23664);
                      continue;
                      if ((paramBoolean) || (paramad.Ol() > 1000000))
                      {
                        paramContext = paramContext.getResources().getString(2131298693);
                        AppMethodBeat.o(23664);
                      }
                      else if (com.tencent.mm.n.a.jh(paramad.field_type))
                      {
                        paramContext = paramContext.getResources().getString(2131298692);
                        AppMethodBeat.o(23664);
                      }
                      else
                      {
                        paramContext = paramContext.getResources().getString(2131298694);
                        AppMethodBeat.o(23664);
                        continue;
                        if ((paramBoolean) || (paramad.Ol() > 1000000))
                        {
                          paramContext = paramContext.getResources().getString(2131298715);
                          AppMethodBeat.o(23664);
                        }
                        else if (com.tencent.mm.n.a.jh(paramad.field_type))
                        {
                          paramContext = paramContext.getResources().getString(2131298714);
                          AppMethodBeat.o(23664);
                        }
                        else
                        {
                          paramContext = paramContext.getResources().getString(2131298716);
                          AppMethodBeat.o(23664);
                          continue;
                          paramContext = paramContext.getResources().getString(2131299904);
                          AppMethodBeat.o(23664);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private static void a(NormalProfileHeaderPreference.a parama, Context paramContext, ad paramad, int paramInt, com.tencent.mm.pluginsdk.ui.preference.b[] paramArrayOfb)
  {
    int i = 0;
    AppMethodBeat.i(23662);
    if ((paramArrayOfb == null) || (com.tencent.mm.n.a.jh(paramad.field_type)))
    {
      parama.pok.setVisibility(8);
      AppMethodBeat.o(23662);
    }
    while (true)
    {
      return;
      parama.pok.setVisibility(0);
      paramContext = bo.nullAsNil(((Activity)paramContext).getIntent().getStringExtra("Verify_ticket"));
      a.a locala = new a.a();
      locala.talker = paramad.field_username;
      locala.scene = paramInt;
      locala.mGZ = paramContext;
      locala.vqs = paramad.dus;
      locala.type = 0;
      if (paramInt == 18)
        locala.type = 1;
      while (true)
      {
        parama.pok.setFMessageArgs(locala);
        int j = paramArrayOfb.length;
        for (paramInt = i; paramInt < j; paramInt++)
        {
          paramContext = paramArrayOfb[paramInt];
          parama.pok.a(paramContext);
        }
        if (bf.kE(paramInt))
          locala.type = 2;
      }
      AppMethodBeat.o(23662);
    }
  }

  private void a(String paramString, ad paramad)
  {
    AppMethodBeat.i(23667);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.NormalProfileHeaderPreference", "view stranger remark, username is null");
      AppMethodBeat.o(23667);
    }
    while (true)
    {
      return;
      paramString = new Intent();
      paramString.putExtra("Contact_Scene", this.gOW);
      paramString.putExtra("Contact_mode_name_type", 0);
      paramString.putExtra("Contact_ModStrangerRemark", true);
      paramString.putExtra("Contact_User", paramad.field_username);
      paramString.putExtra("Contact_Nick", paramad.field_nickname);
      paramString.putExtra("Contact_RemarkName", paramad.field_conRemark);
      com.tencent.mm.plugin.profile.b.gkE.n(paramString, this.mContext);
      AppMethodBeat.o(23667);
    }
  }

  private boolean caj()
  {
    AppMethodBeat.i(23660);
    boolean bool = ad.mR(this.ldh.field_username);
    AppMethodBeat.o(23660);
    return bool;
  }

  public final void A(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23663);
    ab.d("MicroMsg.NormalProfileHeaderPreference", "setHasStory action=%s", new Object[] { Integer.valueOf(paramInt) });
    this.pnR = paramBoolean;
    this.pnS = paramInt;
    if (this.iFE != null)
      this.iFE.notifyDataSetChanged();
    AppMethodBeat.o(23663);
  }

  public final void a(ad paramad, int paramInt, boolean paramBoolean, com.tencent.mm.plugin.profile.a.b paramb)
  {
    AppMethodBeat.i(23656);
    this.pnQ = ((Activity)this.mContext).getIntent().getStringExtra("Contact_RoomNickname");
    this.ldh = paramad;
    this.gOW = paramInt;
    this.readOnly = paramBoolean;
    this.pnP = true;
    this.pkh = paramb;
    AppMethodBeat.o(23656);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23659);
    super.onBindView(paramView);
    if (!this.pnP)
    {
      ab.w("MicroMsg.NormalProfileHeaderPreference", "[onBindView] never attach!");
      AppMethodBeat.o(23659);
      return;
    }
    if (paramView.getTag() == null)
      paramView.setTag(new NormalProfileHeaderPreference.a(this, paramView));
    NormalProfileHeaderPreference.a locala = (NormalProfileHeaderPreference.a)paramView.getTag();
    a.b.b(locala.poj, this.ldh.field_username);
    float f1;
    int i;
    int j;
    int k;
    label175: boolean bool2;
    boolean bool3;
    int m;
    if (!bo.isNullOrNil(N(this.ldh)))
    {
      locala.pod.setVisibility(0);
      f1 = locala.pod.getTextSize();
      paramView = N(this.ldh);
      i = (int)this.mContext.getResources().getDimension(2131427601);
      j = (int)this.mContext.getResources().getDimension(2131427593);
      if (this.ldh.dtS == 0)
        break label1032;
      k = this.mContext.getResources().getDrawable(2131231387).getIntrinsicWidth();
      boolean bool1 = this.ldh.Od();
      bool2 = com.tencent.mm.plugin.sns.b.n.qFA.UV(this.ldh.field_username);
      bool3 = this.ldh.Oc();
      m = (int)this.mContext.getResources().getDimension(2131427585);
      if (!bool1)
        break label2159;
    }
    label530: label707: label742: label1382: label2024: label2159: for (int n = this.mContext.getResources().getDrawable(2131231122).getIntrinsicWidth() + m + m; ; n = m)
    {
      int i1 = n;
      if (bool3)
        i1 = n + this.mContext.getResources().getDrawable(2131231828).getIntrinsicWidth() + m;
      n = i1;
      if (bool2)
        n = i1 + this.mContext.getResources().getDrawable(2131231123).getIntrinsicWidth() + m;
      i1 = this.mContext.getResources().getDisplayMetrics().widthPixels - i - j * 3 - k - n;
      ab.i("MicroMsg.NormalProfileHeaderPreference", "[onBindView] calculateRemarkNameTvSize:%s", new Object[] { Integer.valueOf(i1) });
      locala.pod.setMaxWidth(i1);
      locala.pod.ah(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramView, f1));
      locala.pod.setContentDescription(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramView, f1));
      if (locala.pod.QV(i1).dPe() > 1)
      {
        float f2 = com.tencent.mm.bz.a.dm(this.mContext);
        f1 = com.tencent.mm.bz.a.ao(this.mContext, (int)locala.pod.getResources().getDimension(2131427869));
        locala.pod.setTextSize(f2 * f1);
        locala.pod.ah(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramView, locala.pod.getTextSize()));
      }
      String str;
      label630: Object localObject;
      if (this.pnR)
      {
        locala.pod.setTextColor(this.mContext.getResources().getColor(2131690693));
        locala.pod.setMaxLines(1);
        locala.pod.getPaint().setFakeBoldText(true);
        str = ((Activity)this.mContext).getIntent().getStringExtra("Contact_Distance");
        if ((!((Activity)this.mContext).getIntent().getBooleanExtra("Contact_IsLBSFriend", false)) || (bo.isNullOrNil(str)))
          break label1071;
        locala.poh.setText(this.mContext.getString(2131298506) + str);
        locala.poh.setVisibility(0);
        if (ad.aox(this.ldh.field_username))
        {
          locala.poc.setVisibility(0);
          locala.poc.setText(com.tencent.mm.openim.room.a.a.A(this.ldh));
        }
        if ((!bo.isNullOrNil(this.ldh.field_nickname)) && (!bo.isNullOrNil(this.ldh.field_conRemark)) && (!caj()))
          break label1083;
        locala.niS.setVisibility(8);
        if (bo.isNullOrNil(this.pnQ))
          break label1156;
        if (((Activity)this.mContext).getIntent().getIntExtra("Contact_Scene", -1) != 14)
          break label1150;
        i1 = 1;
        if (i1 == 0)
          break label1156;
        locala.poe.setVisibility(0);
        paramView = this.mContext.getString(2131298490) + this.pnQ;
        locala.poe.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramView, locala.niS.getTextSize()));
        if (((bo.isNullOrNil(this.ldh.Hq())) && (bo.isNullOrNil(this.ldh.field_username))) || (!com.tencent.mm.n.a.jh(this.ldh.field_type)) || (ad.aox(this.ldh.field_username)) || (caj()))
          break label1179;
        locala.nrD.setVisibility(0);
        TextView localTextView = locala.nrD;
        localObject = new StringBuilder().append(this.mContext.getString(2131296930));
        if (!bo.isNullOrNil(this.ldh.Hq()))
          break label1168;
        paramView = this.ldh.field_username;
        localTextView.setText(paramView);
        if (this.ldh.field_deleteFlag != 1)
          break label1191;
        locala.poi.setVisibility(0);
        locala.poi.setText(this.mContext.getText(2131298437));
        locala.niS.setVisibility(8);
        locala.pof.setVisibility(8);
      }
      for (i1 = 1; ; i1 = 0)
      {
        if (i1 == 0)
          break label1215;
        ab.i("MicroMsg.NormalProfileHeaderPreference", "[onBindView] has delete account! username:%s", new Object[] { this.ldh.field_username });
        AppMethodBeat.o(23659);
        break;
        k = 0;
        break label175;
        locala.pod.setTextColor(this.mContext.getResources().getColor(2131689764));
        locala.pod.setMaxLines(2147483647);
        break label530;
        locala.poh.setVisibility(8);
        break label630;
        locala.niS.setVisibility(0);
        paramView = this.mContext.getString(2131298600) + this.ldh.field_nickname;
        locala.niS.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramView, locala.niS.getTextSize()));
        break label707;
        label1150: i1 = 0;
        break label742;
        locala.poe.setVisibility(8);
        break label808;
        paramView = this.ldh.Hq();
        break label924;
        locala.nrD.setVisibility(8);
        break label938;
        locala.poi.setVisibility(8);
        locala.pof.setVisibility(8);
      }
      if ((!com.tencent.mm.n.a.jh(this.ldh.field_type)) && (!caj()) && (!t.nB(this.ldh.field_username)))
      {
        ab.i("MicroMsg.NormalProfileHeaderPreference", "[onBindView] accept contact! username:%s", new Object[] { this.ldh.field_username });
        locala.poq.setVisibility(8);
        if ((com.tencent.mm.n.a.jh(this.ldh.field_type)) || (!((Activity)this.mContext).getIntent().getBooleanExtra("User_Verify", false)))
          break label1790;
        i1 = 1;
        if (i1 == 0)
          break label1796;
        locala.poq.setVisibility(0);
        a(locala, this.mContext, this.ldh, this.gOW, p.a(this.mContext, this.ldh, this.gOW));
        if (!bo.isNullOrNil(this.ldh.signature))
          break label1808;
        locala.pof.setVisibility(8);
        if (!bo.isNullOrNil(this.ldh.getProvince()))
          break label1841;
        locala.pog.setVisibility(8);
        paramView = locala.pob;
        localObject = this.ldh;
        paramView.setVisibility(0);
        if (((ap)localObject).dtS != 1)
          break label1961;
        paramView.setImageDrawable(com.tencent.mm.bz.a.g(this.mContext, 2131231387));
        paramView.setContentDescription(this.mContext.getString(2131302036));
        i1 = ((Activity)this.mContext).getIntent().getIntExtra("Contact_Scene", 0);
        if ((26 > i1) || (i1 > 29))
          break label2018;
        i1 = 1;
        if (i1 != 0)
        {
          locala.poh.setVisibility(0);
          locala.niS.setVisibility(8);
          locala.poh.setText(this.mContext.getString(2131298506) + str);
        }
        if (!t.nB(this.ldh.field_username))
        {
          bool3 = this.ldh.Od();
          bool2 = com.tencent.mm.plugin.sns.b.n.qFA.UV(this.ldh.field_username);
          paramView = locala.poo;
          if (!bool3)
            break label2024;
          i1 = 0;
          paramView.setVisibility(i1);
          paramView = locala.pop;
          if ((!bool2) || (!com.tencent.mm.n.a.jh(this.ldh.field_type)))
            break label2031;
          i1 = 0;
          paramView.setVisibility(i1);
          paramView = locala.pon;
          if ((!this.ldh.Oc()) || (!com.tencent.mm.n.a.jh(this.ldh.field_type)))
            break label2038;
        }
      }
      label2031: label2038: for (i1 = 0; ; i1 = 8)
      {
        paramView.setVisibility(i1);
        i1 = ak.getStatusBarHeight(this.mContext);
        ab.d("MicroMsg.NormalProfileHeaderPreference", "actionBarHeight=%s statusBarHeight=%s", new Object[] { Integer.valueOf(this.pnS), Integer.valueOf(i1) });
        if (!this.pnR)
          break label2045;
        locala.pot.setPadding(locala.pot.getPaddingLeft(), com.tencent.mm.bz.a.am(this.mContext, 2131428603), locala.pot.getPaddingRight(), locala.pot.getPaddingBottom());
        AppMethodBeat.o(23659);
        break;
        if (locala.poq == null)
          break label1280;
        locala.poq.setVisibility(8);
        break label1280;
        label1790: i1 = 0;
        break label1316;
        locala.poq.setVisibility(8);
        break label1329;
        locala.pof.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, this.ldh.signature));
        locala.pof.setVisibility(8);
        break label1382;
        locala.pog.setVisibility(0);
        localObject = new StringBuilder().append(s.mL(this.ldh.getProvince()));
        if (bo.isNullOrNil(this.ldh.getCity()));
        for (paramView = ""; ; paramView = "  " + this.ldh.getCity())
        {
          paramView = paramView;
          locala.pog.setText(this.mContext.getString(2131298579) + paramView);
          break;
        }
        if (((ap)localObject).dtS == 2)
        {
          paramView.setImageDrawable(com.tencent.mm.bz.a.g(this.mContext, 2131231386));
          paramView.setContentDescription(this.mContext.getString(2131302035));
          break label1457;
        }
        if (((ap)localObject).dtS != 0)
          break label1457;
        paramView.setVisibility(8);
        break label1457;
        i1 = 0;
        break label1493;
        i1 = 8;
        break label1602;
        i1 = 8;
        break label1634;
      }
      label2045: if ((i1 > 0) && (this.pnS > 0))
      {
        locala.pot.setPadding(locala.pot.getPaddingLeft(), i1 + this.pnS + com.tencent.mm.bz.a.am(this.mContext, 2131427858), locala.pot.getPaddingRight(), locala.pot.getPaddingBottom());
        AppMethodBeat.o(23659);
        break;
      }
      locala.pot.setPadding(locala.pot.getPaddingLeft(), com.tencent.mm.bz.a.am(this.mContext, 2131428605), locala.pot.getPaddingRight(), locala.pot.getPaddingBottom());
      AppMethodBeat.o(23659);
      break;
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(23665);
    int i = paramView.getId();
    if (i == 2131823098)
    {
      paramView = this.ldh;
      if (paramView == null)
      {
        ab.e("MicroMsg.NormalProfileHeaderPreference", "contact is null");
        AppMethodBeat.o(23665);
      }
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.n.a.jh(paramView.field_type))
      {
        if (!bo.isNullOrNil(paramView.field_encryptUsername))
        {
          a(paramView.field_encryptUsername, paramView);
          AppMethodBeat.o(23665);
        }
        else
        {
          a(paramView.field_username, paramView);
          AppMethodBeat.o(23665);
        }
      }
      else
      {
        PhoneNumPreference localPhoneNumPreference = (PhoneNumPreference)this.iFE.aqO("contact_profile_phone");
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_Scene", this.gOW);
        localIntent.putExtra("Contact_User", paramView.field_username);
        localIntent.putExtra("view_mode", true);
        localIntent.putExtra("contact_phone_number_by_md5", localPhoneNumPreference.vim);
        localIntent.putExtra("contact_phone_number_list", paramView.dur);
        com.tencent.mm.plugin.profile.b.gkE.m(localIntent, this.mContext);
        AppMethodBeat.o(23665);
        continue;
        if (i == 2131823099)
        {
          if (this.pkh != null)
          {
            this.pkh.cas();
            AppMethodBeat.o(23665);
          }
        }
        else
        {
          if (i == 2131823083)
          {
            paramView = this.ldh.field_username;
            localIntent = new Intent(this.mContext, ProfileHdHeadImg.class);
            localIntent.putExtra("username", paramView);
            this.mContext.startActivity(localIntent);
          }
          AppMethodBeat.o(23665);
        }
      }
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(23658);
    if (this.omq == null)
      this.omq = super.onCreateView(paramViewGroup);
    paramViewGroup = this.omq;
    AppMethodBeat.o(23658);
    return paramViewGroup;
  }

  public final void onDetach()
  {
    AppMethodBeat.i(23657);
    if (this.omq != null)
    {
      NormalProfileHeaderPreference.a locala = (NormalProfileHeaderPreference.a)this.omq.getTag();
      if (locala.pok != null)
        locala.pok.detach();
    }
    AppMethodBeat.o(23657);
  }

  public boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(23666);
    boolean bool;
    if (paramView.getId() == 2131823092)
    {
      TextView localTextView = (TextView)paramView;
      ad localad = this.ldh;
      ClipboardManager localClipboardManager = (ClipboardManager)ah.getContext().getSystemService("clipboard");
      if ((localTextView.getText() != null) && (localClipboardManager != null))
      {
        Object localObject = localTextView.getText().toString();
        int i = ((String)localObject).indexOf(':');
        paramView = (View)localObject;
        if (i >= 0)
        {
          paramView = (View)localObject;
          if (i < ((String)localObject).length())
            paramView = ((String)localObject).substring(i + 1).trim();
        }
        localObject = new SpannableString(localTextView.getText());
        ((SpannableString)localObject).setSpan(new BackgroundColorSpan(this.mContext.getResources().getColor(2131690200)), i + 1, localTextView.getText().length(), 33);
        localTextView.setText((CharSequence)localObject);
        localObject = new com.tencent.mm.ui.widget.b.a(this.mContext, localTextView);
        ((com.tencent.mm.ui.widget.b.a)localObject).zRZ = new NormalProfileHeaderPreference.1(this);
        ((com.tencent.mm.ui.widget.b.a)localObject).rBm = new NormalProfileHeaderPreference.2(this, localClipboardManager, paramView);
        ((com.tencent.mm.ui.widget.b.a)localObject).zHM = new NormalProfileHeaderPreference.3(this, localTextView, localad);
        ((com.tencent.mm.ui.widget.b.a)localObject).dn(0, 0);
      }
      bool = true;
      AppMethodBeat.o(23666);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(23666);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference
 * JD-Core Version:    0.6.2
 */