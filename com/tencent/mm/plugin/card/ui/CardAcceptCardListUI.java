package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.protobuf.nx;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardAcceptCardListUI extends MMActivity
  implements com.tencent.mm.ai.f, MMActivity.a
{
  private View En;
  int cME;
  private com.tencent.mm.ui.base.p ejZ;
  private String fhu;
  protected ListView kam;
  protected RelativeLayout kao;
  private boolean kcf;
  private String ked;
  private int kee;
  private String kef;
  private int keg;
  private String keh;
  private Button kgI;
  public int kgP;
  private String kgQ;
  private String kgR;
  public ArrayList<String> kgS;
  public ArrayList<String> kgT;
  HashMap<String, Integer> kic;
  private View kii;
  private View kij;
  protected a kik;
  private View kil;
  private View kim;
  private TextView kin;
  private Button kio;
  LinkedList<nx> kip;
  int kiq;
  String kir;
  String kis;
  private String kit;
  LinkedList<nx> kiu;
  LinkedList<String> kiv;

  public CardAcceptCardListUI()
  {
    AppMethodBeat.i(88221);
    this.kam = null;
    this.kik = null;
    this.kao = null;
    this.ejZ = null;
    this.kip = new LinkedList();
    this.ked = "";
    this.cME = 8;
    this.kiq = 7;
    this.kir = "";
    this.kis = "";
    this.kit = "";
    this.kcf = false;
    this.kgP = 0;
    this.kgQ = "";
    this.kgR = "";
    this.kgS = new ArrayList();
    this.kgT = new ArrayList();
    this.kiu = new LinkedList();
    this.kiv = new LinkedList();
    this.kic = new HashMap();
    this.fhu = "";
    AppMethodBeat.o(88221);
  }

  private String bbF()
  {
    AppMethodBeat.i(88230);
    String str;
    if ((!TextUtils.isEmpty(this.kgQ)) && (!TextUtils.isEmpty(this.kgR)))
    {
      str = this.kgQ + "," + l.Hq(this.kgR);
      AppMethodBeat.o(88230);
    }
    while (true)
    {
      return str;
      if (!TextUtils.isEmpty(this.kgQ))
      {
        str = this.kgQ;
        AppMethodBeat.o(88230);
      }
      else if (!TextUtils.isEmpty(this.kgR))
      {
        str = l.Hq(this.kgR);
        AppMethodBeat.o(88230);
      }
      else
      {
        str = "";
        AppMethodBeat.o(88230);
      }
    }
  }

  private void bbZ()
  {
    AppMethodBeat.i(88231);
    if (!TextUtils.isEmpty(this.keh))
    {
      this.kin.setText(this.keh);
      AppMethodBeat.o(88231);
    }
    while (true)
    {
      return;
      this.kin.setText(2131297969);
      AppMethodBeat.o(88231);
    }
  }

  private ArrayList<CardInfo> bf(List<CardInfo> paramList)
  {
    AppMethodBeat.i(88232);
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
      paramList = null;
      AppMethodBeat.o(88232);
    }
    while (true)
    {
      return paramList;
      this.kiu.clear();
      this.kiv.clear();
      this.kic.clear();
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      if (i < paramList.size())
      {
        CardInfo localCardInfo = (CardInfo)paramList.get(i);
        if (this.kiv.contains(localCardInfo.field_card_tp_id))
        {
          int j = ((Integer)this.kic.get(localCardInfo.field_card_tp_id)).intValue();
          this.kic.put(localCardInfo.field_card_tp_id, Integer.valueOf(j + 1));
        }
        while (true)
        {
          i++;
          break;
          localArrayList.add(localCardInfo);
          this.kic.put(localCardInfo.field_card_tp_id, Integer.valueOf(1));
          this.kiv.add(localCardInfo.field_card_tp_id);
        }
      }
      AppMethodBeat.o(88232);
      paramList = localArrayList;
    }
  }

  private void sZ(int paramInt)
  {
    AppMethodBeat.i(88228);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:".concat(String.valueOf(paramInt)));
    Intent localIntent = new Intent();
    localIntent.putExtra("card_list", this.ked);
    localIntent.putExtra("result_code", paramInt);
    setResult(0, localIntent);
    finish();
    AppMethodBeat.o(88228);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(88229);
    switch (paramInt1)
    {
    default:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(88229);
      while (true)
      {
        return;
        if (paramInt2 != -1)
        {
          AppMethodBeat.o(88229);
        }
        else
        {
          this.kgP = paramIntent.getIntExtra("Ktag_range_index", 0);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.kgP) });
          if (this.kgP < 2)
            break;
          this.kgQ = paramIntent.getStringExtra("Klabel_name_list");
          this.kgR = paramIntent.getStringExtra("Kother_user_name_list");
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CardAcceptCardListUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.kgP), this.kgQ });
          if ((TextUtils.isEmpty(this.kgQ)) && (TextUtils.isEmpty(this.kgR)))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
            bbZ();
            AppMethodBeat.o(88229);
          }
          else
          {
            paramIntent = Arrays.asList(this.kgQ.split(","));
            this.kgT = l.bl(paramIntent);
            this.kgS = l.bk(paramIntent);
            if ((this.kgR != null) && (this.kgR.length() > 0))
            {
              paramIntent = Arrays.asList(this.kgR.split(","));
              this.kgS.addAll(paramIntent);
            }
            if (this.kgT != null)
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.kgT.size());
            if (this.kgS != null)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.kgS.size());
              paramIntent = this.kgS.iterator();
              while (paramIntent.hasNext())
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CardAcceptCardListUI", "username : %s", new Object[] { (String)paramIntent.next() });
            }
            if (!TextUtils.isEmpty(this.kgQ))
            {
              if (this.kgP == 2)
              {
                this.kin.setText(getString(2131297971, new Object[] { bbF() }));
                AppMethodBeat.o(88229);
              }
              else if (this.kgP == 3)
              {
                this.kin.setText(getString(2131297970, new Object[] { bbF() }));
                AppMethodBeat.o(88229);
              }
            }
            else
            {
              bbZ();
              AppMethodBeat.o(88229);
            }
          }
        }
      }
      bbZ();
    }
  }

  final void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(88225);
    if (paramBoolean)
    {
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131300968), false, null);
      AppMethodBeat.o(88225);
    }
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
      AppMethodBeat.o(88225);
    }
  }

  public final int getLayoutId()
  {
    return 2130968891;
  }

  public final void initView()
  {
    AppMethodBeat.i(88222);
    setMMTitle(2131297792);
    setBackBtn(new CardAcceptCardListUI.1(this));
    this.kii = findViewById(2131821923);
    this.kij = findViewById(2131821924);
    this.En = findViewById(2131821925);
    this.kij.setVisibility(4);
    this.kam = ((ListView)findViewById(16908298));
    this.kao = ((RelativeLayout)findViewById(2131821926));
    this.kam.setEmptyView(this.kao);
    this.kik = new a(this);
    this.kam.setAdapter(this.kik);
    this.kam.setOnItemClickListener(new CardAcceptCardListUI.2(this));
    this.kil = findViewById(2131821928);
    this.kgI = ((Button)findViewById(2131821929));
    this.kgI.setOnClickListener(new CardAcceptCardListUI.3(this));
    this.kgI.setEnabled(false);
    this.kim = findViewById(2131821930);
    this.kin = ((TextView)findViewById(2131821931));
    this.kio = ((Button)findViewById(2131821932));
    this.kio.setOnClickListener(new CardAcceptCardListUI.4(this));
    Object localObject1 = getIntent();
    if (localObject1 == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
      sZ(2);
      AppMethodBeat.o(88222);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
      Object localObject2 = ((Intent)localObject1).getStringExtra("key_in_card_list");
      this.cME = ((Intent)localObject1).getIntExtra("key_from_scene", 8);
      Object localObject3 = ((Intent)localObject1).getStringExtra("key_package_name");
      localObject1 = ((Intent)localObject1).getStringExtra("key_sign");
      this.kiq = getIntent().getIntExtra("key_stastic_scene", 7);
      this.kir = getIntent().getStringExtra("src_username");
      this.kis = getIntent().getStringExtra("js_url");
      this.kit = getIntent().getStringExtra("key_consumed_card_id");
      this.fhu = getIntent().getStringExtra("key_template_id");
      localObject2 = com.tencent.mm.plugin.card.d.h.bP((String)localObject2, this.cME);
      if ((localObject2 == null) || (((List)localObject2).size() == 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
        sZ(2);
        AppMethodBeat.o(88222);
      }
      else
      {
        this.kip.clear();
        this.kip.addAll((Collection)localObject2);
        this.kiu.clear();
        this.kiv.clear();
        this.kic.clear();
        localObject2 = this.kip;
        fE(true);
        localObject3 = new com.tencent.mm.plugin.card.model.ab((LinkedList)localObject2, this.cME, (String)localObject3, (String)localObject1, this.kir, this.kis, this.kit, this.kiq);
        com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject3, 0);
        AppMethodBeat.o(88222);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88223);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.RO().eJo.a(690, this);
    com.tencent.mm.kernel.g.RO().eJo.a(687, this);
    com.tencent.mm.kernel.g.RO().eJo.a(902, this);
    initView();
    AppMethodBeat.o(88223);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88224);
    com.tencent.mm.kernel.g.RO().eJo.b(690, this);
    com.tencent.mm.kernel.g.RO().eJo.b(687, this);
    com.tencent.mm.kernel.g.RO().eJo.b(902, this);
    this.kip.clear();
    a locala = this.kik;
    locala.khh.clear();
    locala.mContext = null;
    super.onDestroy();
    AppMethodBeat.o(88224);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88227);
    if (paramInt == 4)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
      sZ(1);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(88227);
    return bool;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(88226);
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.card.model.ab))
      {
        fE(false);
        paramm = (com.tencent.mm.plugin.card.model.ab)paramm;
        paramString = paramm.kdS;
        this.kee = paramm.kee;
        this.kef = paramm.kef;
        this.keg = paramm.keg;
        this.keh = paramm.keh;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.kee + "  accept_button_wording: " + this.kef);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.keg + "  private_wording: " + this.keh);
        localObject1 = com.tencent.mm.plugin.card.d.f.Hg(paramString);
        Object localObject2 = bf((List)localObject1);
        if ((localObject1 != null) && (((List)localObject1).size() > 0))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + ((List)localObject1).size());
          if ((localObject2 != null) && (((List)localObject2).size() > 0))
          {
            paramm = this.kik;
            paramString = this.kic;
            if (localObject2 != null)
            {
              paramm.khh.clear();
              paramm.khh.addAll((Collection)localObject2);
              paramm.kic.putAll(paramString);
            }
          }
          this.kik.notifyDataSetChanged();
          if (((CardInfo)((List)localObject1).get(0)).aZC())
            this.kcf = true;
          this.kij.setVisibility(0);
          if (this.kik.getCount() <= 0)
            break label876;
          paramString = this.kik.sY(0);
          com.tencent.mm.plugin.card.d.m.a(this, paramString);
          this.kii.setBackgroundColor(l.Hn(paramString.aZV().color));
          this.kil.setVisibility(0);
          paramm = new StateListDrawable();
          paramInt1 = getResources().getDimensionPixelOffset(2131428180);
          if (this.kee != 1)
            break label711;
          this.kgI.setEnabled(true);
          localObject2 = l.dI(l.Hn(paramString.aZV().color), paramInt1);
          localObject1 = l.dI(l.bS(paramString.aZV().color, 175), paramInt1);
          paramm.addState(new int[] { 16842919 }, (Drawable)localObject1);
          paramm.addState(new int[0], (Drawable)localObject2);
          label458: this.kgI.setBackgroundDrawable(paramm);
          if (!TextUtils.isEmpty(this.kef))
            this.kgI.setText(this.kef);
          if (this.keg != 1)
            break label769;
          paramInt1 = getResources().getDimensionPixelOffset(2131427812);
          localObject1 = l.b(this, getResources().getColor(2131690691), paramInt1);
          paramm = l.dI(getResources().getColor(2131690691), paramInt1);
          localObject2 = new StateListDrawable();
          ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, paramm);
          ((StateListDrawable)localObject2).addState(new int[0], (Drawable)localObject1);
          this.kio.setBackgroundDrawable((Drawable)localObject2);
          paramInt1 = l.Hn(paramString.aZV().color);
          paramInt2 = getResources().getColor(2131690691);
          paramString = new int[0];
          paramString = new ColorStateList(new int[][] { { 16842919, 16842910 }, paramString }, new int[] { paramInt1, paramInt2 });
          this.kio.setTextColor(paramString);
          this.kim.setVisibility(0);
          if (TextUtils.isEmpty(this.keh))
            break label751;
          this.kin.setText(this.keh);
          AppMethodBeat.o(88226);
        }
      }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
      break;
      label711: this.kgI.setEnabled(false);
      localObject1 = l.dI(l.bS(paramString.aZV().color, 175), paramInt1);
      paramm.addState(new int[0], (Drawable)localObject1);
      break label458;
      label751: this.kin.setText(2131297969);
      AppMethodBeat.o(88226);
      continue;
      label769: this.kim.setVisibility(8);
      paramString = (RelativeLayout.LayoutParams)this.kij.getLayoutParams();
      paramString.topMargin = getResources().getDimensionPixelSize(2131427858);
      paramString.bottomMargin = getResources().getDimensionPixelSize(2131427780);
      this.kij.setLayoutParams(paramString);
      this.kij.invalidate();
      paramString = (RelativeLayout.LayoutParams)this.kil.getLayoutParams();
      paramString.addRule(8, 2131821925);
      this.kil.setLayoutParams(paramString);
      this.kil.invalidate();
      AppMethodBeat.o(88226);
      continue;
      label876: this.kil.setVisibility(8);
      this.kim.setVisibility(8);
      this.kii.setBackgroundColor(getResources().getColor(2131689822));
      AppMethodBeat.o(88226);
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.card.model.p))
      {
        fE(false);
        localObject1 = (com.tencent.mm.plugin.card.model.p)paramm;
        if (((com.tencent.mm.plugin.card.model.p)localObject1).kdT != 0)
        {
          paramm = ((com.tencent.mm.plugin.card.model.p)localObject1).kdU;
          paramString = paramm;
          if (TextUtils.isEmpty(paramm))
            paramString = getString(2131297807);
          com.tencent.mm.ui.base.h.a(this, paramString, null, false, new CardAcceptCardListUI.5(this));
          this.ked = ((com.tencent.mm.plugin.card.model.p)localObject1).kdS;
          AppMethodBeat.o(88226);
        }
        else
        {
          com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297876));
          paramString = new Intent();
          paramString.putExtra("card_list", ((com.tencent.mm.plugin.card.model.p)localObject1).kdS);
          setResult(-1, paramString);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
          l.beB();
          finish();
          AppMethodBeat.o(88226);
        }
      }
      else if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        fE(false);
        paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdS;
        paramInt1 = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdT;
        paramm = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdU;
        this.ked = paramString;
        if (paramInt1 != 0)
        {
          paramString = paramm;
          if (TextUtils.isEmpty(paramm))
            paramString = getString(2131297980);
          com.tencent.mm.ui.base.h.a(this, paramString, null, false, new CardAcceptCardListUI.6(this));
          AppMethodBeat.o(88226);
        }
        else
        {
          com.tencent.mm.ui.base.h.bQ(this, getResources().getString(2131297798));
          paramm = new Intent();
          paramm.putExtra("card_list", this.ked);
          setResult(-1, paramm);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
          l.beD();
          paramm = new ShareCardInfo();
          com.tencent.mm.plugin.card.d.f.a(paramm, paramString);
          l.a(paramm);
          am.bbd().aVU();
          finish();
          AppMethodBeat.o(88226);
          continue;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + paramm.getType() + "errType = " + paramInt1 + " errCode = " + paramInt2);
          fE(false);
          d.b(this, paramString, paramInt2);
          if ((paramm instanceof com.tencent.mm.plugin.card.model.p))
          {
            this.ked = paramString;
            AppMethodBeat.o(88226);
          }
          else if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.g))
          {
            this.ked = "";
          }
        }
      }
      else
      {
        AppMethodBeat.o(88226);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardAcceptCardListUI
 * JD-Core Version:    0.6.2
 */