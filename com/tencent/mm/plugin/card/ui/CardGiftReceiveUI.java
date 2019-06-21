package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.d.a.a;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.card.model.z;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.protocal.protobuf.oj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CardGiftReceiveUI extends MMActivity
  implements View.OnClickListener, f
{
  private int fhF;
  private String fhG;
  private TextView kkA;
  private TextView kkB;
  private ImageView kkC;
  private ImageView kkD;
  private LinearLayout kkE;
  private RelativeLayout kkF;
  private RelativeLayout kkG;
  private TextView kkH;
  private ImageView kkI;
  private TextView kkJ;
  private TextView kkK;
  private TextView kkL;
  private ImageView kkM;
  private ImageView kkN;
  private View kkO;
  private TextView kkP;
  private LinearLayout kkQ;
  private ListView kkR;
  private RelativeLayout kkS;
  private LinearLayout kkT;
  private ImageView kkU;
  private TextView kkV;
  private LinearLayout kkW;
  private TextView kkX;
  private RelativeLayout kkY;
  private RelativeLayout kkZ;
  private CardGiftInfo kkk;
  private ProgressBar kko;
  private ak kkp;
  private ScrollView kkx;
  private LinearLayout kky;
  private ImageView kkz;
  private ImageView kla;
  private ImageView klb;
  private TextView klc;
  private TextView kld;
  private ListView kle;
  private RelativeLayout klf;
  private TextView klg;
  private TextView klh;
  private View kli;
  a.a klj;
  private com.tencent.mm.ui.base.p tipDialog;

  public CardGiftReceiveUI()
  {
    AppMethodBeat.i(88430);
    this.tipDialog = null;
    this.kkp = new ak(Looper.getMainLooper());
    this.klj = new CardGiftReceiveUI.4(this);
    AppMethodBeat.o(88430);
  }

  private void L(LinkedList<CardGiftInfo.AcceptedCardItem> paramLinkedList)
  {
    AppMethodBeat.i(88440);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = (CardGiftInfo.AcceptedCardItem)paramLinkedList.next();
      View localView = View.inflate(this, 2130968920, null);
      TextView localTextView1 = (TextView)localView.findViewById(2131822067);
      TextView localTextView2 = (TextView)localView.findViewById(2131822068);
      localTextView1.setText(localAcceptedCardItem.kcU);
      localTextView2.setText(localAcceptedCardItem.kcV + this.mController.ylL.getString(2131297860));
      this.kkQ.addView(localView);
    }
    AppMethodBeat.o(88440);
  }

  private int ad(int paramInt)
  {
    AppMethodBeat.i(88434);
    paramInt = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, paramInt);
    AppMethodBeat.o(88434);
    return paramInt;
  }

  private static void b(ListView paramListView)
  {
    AppMethodBeat.i(88442);
    ListAdapter localListAdapter = paramListView.getAdapter();
    if (localListAdapter == null)
      AppMethodBeat.o(88442);
    while (true)
    {
      return;
      int i = localListAdapter.getCount();
      int j = 0;
      int k = 0;
      while (j < i)
      {
        localObject = localListAdapter.getView(j, null, paramListView);
        ((View)localObject).measure(0, 0);
        k += ((View)localObject).getMeasuredHeight();
        j++;
      }
      Object localObject = paramListView.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = (paramListView.getDividerHeight() * (localListAdapter.getCount() - 1) + k);
      paramListView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(88442);
    }
  }

  private void bbB()
  {
    AppMethodBeat.i(88433);
    if (this.kkk == null)
    {
      ab.e("MicroMsg.CardGiftReceiveUI", "doUpdate due to cardGiftInfo is null!");
      AppMethodBeat.o(88433);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descLayoutMode:%d", new Object[] { Integer.valueOf(this.kkk.kcE) });
      if ((this.kkk.kcE != 1) && (this.kkk.kcE == 2))
        bcZ();
      while (true)
      {
        bcY();
        bbS();
        bdb();
        if ((bo.isNullOrNil(this.kkk.kcK)) && (bo.isNullOrNil(this.kkk.kcx)))
          break label153;
        this.kkx.getViewTreeObserver().addOnGlobalLayoutListener(new CardGiftReceiveUI.1(this));
        AppMethodBeat.o(88433);
        break;
        bda();
      }
      label153: this.kkx.setFillViewport(true);
      AppMethodBeat.o(88433);
    }
  }

  private void bbS()
  {
    int i = 0;
    AppMethodBeat.i(88439);
    if (this.kkk.kcO.size() > 0)
    {
      this.kkO.setVisibility(0);
      this.kkR.setVisibility(8);
      if (this.kkk.kcO.size() <= 2)
      {
        this.kkP.setVisibility(8);
        L(this.kkk.kcO);
        AppMethodBeat.o(88439);
      }
    }
    while (true)
    {
      return;
      Object localObject = new LinkedList();
      ((LinkedList)localObject).add(this.kkk.kcO.get(0));
      ((LinkedList)localObject).add(this.kkk.kcO.get(1));
      L((LinkedList)localObject);
      this.kkP.setVisibility(0);
      this.kkP.setOnClickListener(this);
      localObject = new LinkedList();
      while (i < this.kkk.kcO.size())
      {
        if ((i != 0) && (i != 1))
          ((LinkedList)localObject).add(this.kkk.kcO.get(i));
        i++;
      }
      localObject = new c((LinkedList)localObject);
      this.kkR.setAdapter((ListAdapter)localObject);
      b(this.kkR);
      AppMethodBeat.o(88439);
      continue;
      this.kkO.setVisibility(8);
      this.kkP.setVisibility(8);
      this.kkR.setVisibility(8);
      AppMethodBeat.o(88439);
    }
  }

  private void bcY()
  {
    AppMethodBeat.i(88435);
    if (this.kkk.kcR == 1)
    {
      this.kkT.setVisibility(0);
      this.kkW.setVisibility(8);
      this.kkS.setVisibility(8);
      this.kkV.setText(j.b(this, this.kkk.cKE, this.kkV.getTextSize()));
      f(this.kkU);
      AppMethodBeat.o(88435);
      return;
    }
    this.kkT.setVisibility(8);
    this.kkW.setVisibility(0);
    this.kkS.setVisibility(0);
    f(this.klb);
    this.klc.setText(j.b(this, this.kkk.cKE, this.klc.getTextSize()));
    if (((!bo.isNullOrNil(this.kkk.kcn)) && (!"undefined".equals(this.kkk.kcn))) || ((!bo.isNullOrNil(this.kkk.kco)) && (!"undefined".equals(this.kkk.kco))))
      this.kkY.setVisibility(0);
    while (true)
    {
      bdc();
      if (!bo.isNullOrNil(this.kkk.kcm))
        this.kkX.setText(j.b(this, this.kkk.kcm, this.kkX.getTextSize()));
      AppMethodBeat.o(88435);
      break;
      this.kkY.setVisibility(8);
      ab.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is empty");
    }
  }

  private void bcZ()
  {
    AppMethodBeat.i(88437);
    this.kkE.setVisibility(8);
    this.kky.setVisibility(0);
    this.kkA.setText(this.kkk.kcC);
    this.kkB.setText(this.kkk.kcv + "     " + this.kkk.kcw + this.mController.ylL.getString(2131297860));
    if (!bo.isNullOrNil(this.kkk.kcD))
    {
      this.kkz.setVisibility(0);
      Object localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kcD);
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kcD, this.kkz, (c)localObject);
      if (bo.isNullOrNil(this.kkk.kcG))
        break label509;
      this.kkA.setTextColor(bo.bS(this.kkk.kcG, getResources().getColor(2131689761)));
      label227: if (bo.isNullOrNil(this.kkk.kcH))
        break label521;
      this.kkB.setTextColor(bo.bS(this.kkk.kcH, getResources().getColor(2131689761)));
      label267: if (bo.isNullOrNil(this.kkk.kcu))
        break label533;
      localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kcu);
      ((c.a)localObject).eQf = true;
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      ((c.a)localObject).ePU = new ColorDrawable(l.Hn("#CCCCCC"));
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kcu, this.kkD, (c)localObject);
      label373: if (bo.isNullOrNil(this.kkk.kct))
        break label545;
      localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kct);
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      ((c.a)localObject).ePU = new ColorDrawable(l.Hn("#CCCCCC"));
      ((c.a)localObject).eQf = true;
      ((c.a)localObject).eQg = com.tencent.mm.bz.a.fromDPToPix(this, 8);
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kct, this.kkC, (c)localObject);
      AppMethodBeat.o(88437);
    }
    while (true)
    {
      return;
      this.kkz.setVisibility(8);
      break;
      label509: ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
      break label227;
      label521: ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
      break label267;
      label533: ab.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
      break label373;
      label545: ab.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
      AppMethodBeat.o(88437);
    }
  }

  private void bda()
  {
    AppMethodBeat.i(88438);
    this.kky.setVisibility(8);
    this.kkE.setVisibility(0);
    this.kkJ.setText(this.kkk.kcv);
    if (this.kkk.kcR == 1)
    {
      this.kkM.setAlpha(0.5F);
      this.kkK.setVisibility(8);
      this.kkL.setVisibility(8);
      this.kkG.setVisibility(8);
      this.kkF.setVisibility(8);
      if (bo.isNullOrNil(this.kkk.kcD))
        break label672;
      this.kkI.setVisibility(0);
      Object localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kcD);
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kcD, this.kkI, (c)localObject);
      label186: if (bo.isNullOrNil(this.kkk.kcC))
        break label705;
      this.kkH.setVisibility(0);
      this.kkH.setText(this.kkk.kcC);
      if (bo.isNullOrNil(this.kkk.kcG))
        break label693;
      this.kkH.setTextColor(bo.bS(this.kkk.kcG, getResources().getColor(2131689761)));
      label261: if (bo.isNullOrNil(this.kkk.kcH))
        break label726;
      this.kkJ.setTextColor(bo.bS(this.kkk.kcH, getResources().getColor(2131689761)));
      label301: if (bo.isNullOrNil(this.kkk.kcu))
        break label738;
      localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kcu);
      ((c.a)localObject).eQf = true;
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      ((c.a)localObject).ePU = new ColorDrawable(l.Hn("#CCCCCC"));
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kcu, this.kkN, (c)localObject);
      label407: if (bo.isNullOrNil(this.kkk.kct))
        break label750;
      localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kct);
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      ((c.a)localObject).ePU = new ColorDrawable(l.Hn("#CCCCCC"));
      ((c.a)localObject).eQf = true;
      ((c.a)localObject).eQg = com.tencent.mm.bz.a.fromDPToPix(this, 8);
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kct, this.kkM, (c)localObject);
      AppMethodBeat.o(88438);
    }
    while (true)
    {
      return;
      this.kkK.setVisibility(0);
      this.kkL.setVisibility(0);
      this.kkG.setVisibility(0);
      this.kkF.setVisibility(0);
      this.kkK.setText(this.kkk.kcw);
      this.kkL.setText(2131297860);
      if (bo.isNullOrNil(this.kkk.kcw))
      {
        this.kkK.setVisibility(8);
        this.kkL.setVisibility(8);
      }
      if (!bo.isNullOrNil(this.kkk.kcI))
      {
        this.kkK.setTextColor(bo.bS(this.kkk.kcI, getResources().getColor(2131689761)));
        break;
      }
      ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardPriceTitleColor is empty");
      break;
      label672: this.kkI.setVisibility(8);
      ab.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
      break label186;
      label693: ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
      break label261;
      label705: this.kkH.setVisibility(8);
      ab.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
      break label261;
      label726: ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
      break label301;
      label738: ab.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
      break label407;
      label750: ab.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
      AppMethodBeat.o(88438);
    }
  }

  private void bdb()
  {
    AppMethodBeat.i(88441);
    if (this.kkk.kcP.size() > 0)
    {
      this.klf.setVisibility(0);
      this.kle.setVisibility(0);
      CardGiftReceiveUI.a locala = new CardGiftReceiveUI.a(this);
      this.kle.setAdapter(locala);
      b(this.kle);
      if (!bo.isNullOrNil(this.kkk.kcQ))
      {
        this.kld.setVisibility(0);
        this.kld.setText(this.kkk.kcQ);
      }
      AppMethodBeat.o(88441);
    }
    while (true)
    {
      return;
      this.klf.setVisibility(0);
      this.kle.setVisibility(0);
      this.kld.setVisibility(0);
      if (!bo.isNullOrNil(this.kkk.kcQ))
      {
        this.kld.setVisibility(0);
        this.kld.setText(this.kkk.kcQ);
      }
      AppMethodBeat.o(88441);
    }
  }

  private void bdc()
  {
    AppMethodBeat.i(88445);
    if ((this.kkk != null) && (!bo.isNullOrNil(this.kkk.kcn)))
    {
      com.tencent.mm.plugin.card.d.a.g(this.kkk.kcn, this.kkk.kcq, this.kkk.kcz, 2);
      if ((this.kkk == null) || (bo.isNullOrNil(this.kkk.kcp)))
        break label115;
      com.tencent.mm.plugin.card.d.a.g(this.kkk.kcp, this.kkk.kcs, this.kkk.kcB, 2);
      AppMethodBeat.o(88445);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.CardGiftReceiveUI", "fromUserContentPicUrl is null");
      break;
      label115: ab.e("MicroMsg.CardGiftReceiveUI", "fromUserContentThumbPicUrl is null");
      AppMethodBeat.o(88445);
    }
  }

  private void f(ImageView paramImageView)
  {
    AppMethodBeat.i(88436);
    if (!bo.isNullOrNil(this.kkk.kcl))
    {
      int i = com.tencent.mm.bz.a.fromDPToPix(this, 20);
      Object localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(this.kkk.kcl);
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).eQf = true;
      ((c.a)localObject).eQg = 3.0F;
      ((c.a)localObject).ePF = true;
      ((c.a)localObject).ePO = i;
      ((c.a)localObject).ePN = i;
      ((c.a)localObject).ePU = new ColorDrawable(l.Hn("#CCCCCC"));
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.kkk.kcl, paramImageView, (c)localObject);
      AppMethodBeat.o(88436);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is null");
      AppMethodBeat.o(88436);
    }
  }

  public final int getLayoutId()
  {
    return 2130968925;
  }

  public final void initView()
  {
    AppMethodBeat.i(88443);
    this.kkx = ((ScrollView)findViewById(2131822102));
    this.kky = ((LinearLayout)findViewById(2131822104));
    this.kkz = ((ImageView)findViewById(2131822105));
    this.kkA = ((TextView)findViewById(2131822106));
    this.kkB = ((TextView)findViewById(2131822109));
    this.kkC = ((ImageView)findViewById(2131822107));
    this.kkD = ((ImageView)findViewById(2131822108));
    this.kkC.setOnClickListener(this);
    this.kkE = ((LinearLayout)findViewById(2131822110));
    this.kkF = ((RelativeLayout)findViewById(2131822111));
    this.kkG = ((RelativeLayout)findViewById(2131822112));
    this.kkH = ((TextView)findViewById(2131822085));
    this.kkJ = ((TextView)findViewById(2131822088));
    this.kkI = ((ImageView)findViewById(2131822087));
    this.kkK = ((TextView)findViewById(2131822089));
    this.kkL = ((TextView)findViewById(2131822113));
    this.kkM = ((ImageView)findViewById(2131822091));
    this.kkN = ((ImageView)findViewById(2131822092));
    this.kkM.setOnClickListener(this);
    this.kkO = findViewById(2131822117);
    this.kkP = ((TextView)findViewById(2131822120));
    this.kkQ = ((LinearLayout)findViewById(2131822118));
    this.kkR = ((ListView)findViewById(2131822119));
    this.kkS = ((RelativeLayout)findViewById(2131822121));
    this.kkT = ((LinearLayout)findViewById(2131822114));
    this.kkU = ((ImageView)findViewById(2131822115));
    this.kkV = ((TextView)findViewById(2131822116));
    this.kkW = ((LinearLayout)findViewById(2131822123));
    this.klb = ((ImageView)findViewById(2131822099));
    this.klc = ((TextView)findViewById(2131822100));
    this.kkX = ((TextView)findViewById(2131822124));
    this.kkY = ((RelativeLayout)findViewById(2131822125));
    this.kkZ = ((RelativeLayout)findViewById(2131822126));
    this.kla = ((ImageView)findViewById(2131822096));
    this.kkY.setOnClickListener(this);
    this.kkZ.setOnClickListener(this);
    this.kld = ((TextView)findViewById(2131822129));
    this.kle = ((ListView)findViewById(2131822130));
    this.klf = ((RelativeLayout)findViewById(2131822127));
    this.kko = ((ProgressBar)findViewById(2131822082));
    com.tencent.mm.plugin.card.d.m.d(this);
    setMMTitle("");
    setBackBtn(new CardGiftReceiveUI.2(this));
    AppMethodBeat.o(88443);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(88446);
    if (paramView.getId() == 2131822126)
    {
      if (bo.isNullOrNil(this.kkk.kco))
        break label854;
      paramView = new Intent(this, CardGiftVideoUI.class);
      paramView.putExtra("key_gift_into", this.kkk);
      paramView.putExtra("key_is_mute", false);
      startActivity(paramView);
      overridePendingTransition(0, 0);
      com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(3), this.fhG, com.tencent.mm.a.p.getString(this.fhF) });
      AppMethodBeat.o(88446);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131822125)
      {
        if (this.kko.getVisibility() == 0)
        {
          AppMethodBeat.o(88446);
        }
        else if (!bo.isNullOrNil(this.kkk.kcn))
        {
          paramView = new Intent(this, CardGiftImageUI.class);
          paramView.putExtra("key_gift_into", this.kkk);
          startActivity(paramView);
          overridePendingTransition(0, 0);
          com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(4), this.fhG, com.tencent.mm.a.p.getString(this.fhF) });
          AppMethodBeat.o(88446);
        }
      }
      else if (paramView.getId() == 2131822078)
      {
        if ((this.kkk != null) && (this.kkk.kcy))
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(7), this.fhG, com.tencent.mm.a.p.getString(this.fhF) });
          paramView = new ik();
          paramView.cDz.context = this.mController.ylL;
          paramView.cDz.scene = 2;
          com.tencent.mm.sdk.b.a.xxA.m(paramView);
          ab.i("MicroMsg.CardGiftReceiveUI", "enter to cardhome");
          finish();
          overridePendingTransition(0, 0);
          AppMethodBeat.o(88446);
        }
      }
      else if (paramView.getId() == 2131822077)
      {
        if ((!TextUtils.isEmpty(this.kkk.kcS)) && (!TextUtils.isEmpty(this.kkk.kcT)))
        {
          int i = getIntent().getIntExtra("key_from_appbrand_type", 0);
          com.tencent.mm.plugin.card.d.b.d(this.kkk.kcJ, this.kkk.kcS, this.kkk.kcT, 1062, i);
          com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(8), this.fhG, com.tencent.mm.a.p.getString(this.fhF) });
          AppMethodBeat.o(88446);
        }
        else if (!bo.isNullOrNil(this.kkk.kcL))
        {
          com.tencent.mm.plugin.card.d.b.a(this, this.kkk.kcL, 0);
          com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(8), this.fhG, com.tencent.mm.a.p.getString(this.fhF) });
          AppMethodBeat.o(88446);
        }
      }
      else if ((paramView.getId() == 2131822091) || (paramView.getId() == 2131822107))
      {
        if ((!bo.isNullOrNil(this.kkk.kcM)) && (!bo.isNullOrNil(this.kkk.kcN)))
        {
          paramView = new LinkedList();
          Object localObject = new oj();
          ((oj)localObject).kbU = this.kkk.kcM;
          ((oj)localObject).code = this.kkk.kcN;
          paramView.add(localObject);
          localObject = getIntent().getStringExtra("key_template_id");
          cdc localcdc = new cdc();
          localcdc.xcM = ((String)localObject);
          ab.i("MicroMsg.CardGiftReceiveUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { localObject });
          paramView = new t(paramView, localcdc, 27);
          g.RO().eJo.a(paramView, 0);
          com.tencent.mm.plugin.report.service.h.pYm.e(13866, new Object[] { Integer.valueOf(9), this.fhG, com.tencent.mm.a.p.getString(this.fhF) });
          AppMethodBeat.o(88446);
        }
        else
        {
          ab.e("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.userCardId is null");
          AppMethodBeat.o(88446);
        }
      }
      else if (paramView.getId() == 2131822120)
      {
        if (this.kkR.getVisibility() == 0)
        {
          this.kkR.setVisibility(8);
          this.kkP.setText("查看全部");
          AppMethodBeat.o(88446);
        }
        else
        {
          this.kkR.setVisibility(0);
          this.kkP.setText("收起");
        }
      }
      else
        label854: AppMethodBeat.o(88446);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88431);
    super.onCreate(paramBundle);
    this.fhG = getIntent().getStringExtra("key_order_id");
    this.fhF = getIntent().getIntExtra("key_biz_uin", -1);
    this.kkk = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    ab.i("MicroMsg.CardGiftReceiveUI", "onCreate, orderId:%s, bizUin:%s", new Object[] { this.fhG, Integer.valueOf(this.fhF) });
    initView();
    g.RO().eJo.a(1165, this);
    g.RO().eJo.a(699, this);
    com.tencent.mm.plugin.card.d.a.a(this.klj);
    if (this.kkk == null)
    {
      ab.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo is null, sync GiftCard from serve");
      if (this.fhF == -1)
      {
        ab.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, bizUin is -1, fail!");
        AppMethodBeat.o(88431);
      }
    }
    while (true)
    {
      return;
      if (this.fhG == null)
        ab.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, orderId is null, fail");
      ab.e("MicroMsg.CardGiftReceiveUI", "doNetSceneGetCardGiftInfo");
      paramBundle = new z(this.fhF, this.fhG);
      g.RO().eJo.a(paramBundle, 0);
      this.tipDialog = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131300968), true, new CardGiftReceiveUI.3(this));
      if (this.tipDialog != null)
        this.tipDialog.show();
      AppMethodBeat.o(88431);
      continue;
      bbB();
      AppMethodBeat.o(88431);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88432);
    super.onDestroy();
    g.RO().eJo.b(1165, this);
    g.RO().eJo.b(699, this);
    com.tencent.mm.plugin.card.d.a.b(this.klj);
    AppMethodBeat.o(88432);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(88444);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof z))
      {
        ab.i("MicroMsg.CardGiftReceiveUI", "card gift info cgi success!");
        this.kkk = ((z)paramm).kdV;
        bbB();
        AppMethodBeat.o(88444);
      }
    while (true)
    {
      return;
      if ((paramm instanceof t))
      {
        paramString = new Intent(this, CardDetailUI.class);
        Object localObject = ((t)paramm).kdZ;
        if ((localObject == null) || (((LinkedList)localObject).size() == 0))
        {
          ab.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardinfo list  size is null or empty!");
          AppMethodBeat.o(88444);
        }
        else
        {
          com.tencent.mm.plugin.card.base.b localb = (com.tencent.mm.plugin.card.base.b)((LinkedList)localObject).get(0);
          if ((localb == null) || (!(localb instanceof CardInfo)))
          {
            ab.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardInfo  is null!");
            AppMethodBeat.o(88444);
          }
          else
          {
            paramm = new ArrayList();
            localObject = ((LinkedList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
              paramm.add((CardInfo)((Iterator)localObject).next());
            paramString.putExtra("key_card_info", (CardInfo)localb);
            paramString.putExtra("key_previous_scene", 27);
            paramString.putExtra("key_from_scene", 27);
            paramString.putExtra("key_from_appbrand_type", paramString.getIntExtra("key_from_appbrand_type", 0));
            paramString.putExtra("key_card_git_info", this.kkk);
            startActivity(paramString);
            AppMethodBeat.o(88444);
            continue;
            if ((paramm instanceof z))
            {
              ab.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
              d.a(this, paramString, true);
              AppMethodBeat.o(88444);
            }
            else if ((paramm instanceof t))
            {
              ab.e("MicroMsg.CardGiftReceiveUI", ", NetSceneBatchGetCardItemByTpInfo onSceneEnd fail return!  errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
              AppMethodBeat.o(88444);
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(88444);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class c extends BaseAdapter
  {
    private LinkedList<CardGiftInfo.AcceptedCardItem> klo;

    c()
    {
      Object localObject;
      this.klo = localObject;
    }

    private CardGiftInfo.AcceptedCardItem td(int paramInt)
    {
      AppMethodBeat.i(88427);
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = (CardGiftInfo.AcceptedCardItem)this.klo.get(paramInt);
      AppMethodBeat.o(88427);
      return localAcceptedCardItem;
    }

    public final int getCount()
    {
      AppMethodBeat.i(88426);
      int i = this.klo.size();
      AppMethodBeat.o(88426);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(88428);
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = td(paramInt);
      if (paramView == null)
      {
        paramView = View.inflate(CardGiftReceiveUI.this, 2130968920, null);
        paramViewGroup = new CardGiftReceiveUI.d(CardGiftReceiveUI.this);
        paramViewGroup.gsf = ((TextView)paramView.findViewById(2131822067));
        paramViewGroup.kln = ((TextView)paramView.findViewById(2131822068));
        paramView.setTag(paramViewGroup);
      }
      while (true)
      {
        paramViewGroup.gsf.setText(localAcceptedCardItem.kcU);
        paramViewGroup.kln.setText(localAcceptedCardItem.kcV + CardGiftReceiveUI.this.mController.ylL.getString(2131297860));
        AppMethodBeat.o(88428);
        return paramView;
        paramViewGroup = (CardGiftReceiveUI.d)paramView.getTag();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI
 * JD-Core Version:    0.6.2
 */