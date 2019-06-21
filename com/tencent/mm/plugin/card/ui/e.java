package com.tencent.mm.plugin.card.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.card.b.g.a;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI;
import com.tencent.mm.plugin.card.ui.a.a;
import com.tencent.mm.plugin.card.ui.view.i;
import com.tencent.mm.plugin.card.ui.view.k;
import com.tencent.mm.plugin.card.ui.view.q;
import com.tencent.mm.plugin.card.ui.view.u;
import com.tencent.mm.plugin.card.ui.view.w;
import com.tencent.mm.plugin.card.ui.view.y;
import com.tencent.mm.plugin.card.ui.view.z;
import com.tencent.mm.pluginsdk.ui.applet.t;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.protocal.protobuf.ax;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.xt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"UseSparseArrays"})
public final class e
  implements g.a, n, MMActivity.a
{
  private final String TAG;
  boolean cAY;
  View.OnClickListener gKK;
  private View jcl;
  com.tencent.mm.plugin.card.base.b kaS;
  List<com.tencent.mm.plugin.card.model.b> kaW;
  ArrayList<od> kaY;
  public int kgP;
  String kgQ;
  String kgR;
  public ArrayList<String> kgS;
  public ArrayList<String> kgT;
  public String kjA;
  HashMap<Integer, String> kjB;
  HashMap<String, String> kjC;
  ArrayList<String> kjD;
  e.d kjE;
  e.a kjF;
  private ak kjG;
  com.tencent.mm.sdk.b.c kjH;
  CardDetailBaseUI kjd;
  com.tencent.mm.plugin.card.ui.a.g kje;
  i kjf;
  boolean kjg;
  i kjh;
  i kji;
  com.tencent.mm.plugin.card.widget.g kjj;
  com.tencent.mm.plugin.card.ui.view.g kjk;
  m kjl;
  i kjm;
  i kjn;
  i kjo;
  i kjp;
  i kjq;
  i kjr;
  i kjs;
  i kjt;
  com.tencent.mm.plugin.card.ui.view.d kju;
  i kjv;
  j kjw;
  boolean kjx;
  com.tencent.mm.plugin.card.b.f kjy;
  public String kjz;
  LinearLayout lK;
  ListView mListView;

  public e(CardDetailBaseUI paramCardDetailBaseUI, View paramView)
  {
    AppMethodBeat.i(88349);
    this.TAG = "MicroMsg.CardDetailUIContoller";
    this.kjg = false;
    this.kjx = true;
    this.kaW = new ArrayList();
    this.kjz = "";
    this.kjA = "";
    this.kgP = 0;
    this.kgQ = "";
    this.kgR = "";
    this.kgS = new ArrayList();
    this.kgT = new ArrayList();
    this.kjB = new HashMap();
    this.kjC = new HashMap();
    this.kjD = new ArrayList();
    this.cAY = false;
    this.kjG = new e.3(this);
    this.gKK = new e.4(this);
    this.kjH = new e.7(this);
    this.kjd = paramCardDetailBaseUI;
    this.jcl = paramView;
    AppMethodBeat.o(88349);
  }

  private void GR(String paramString)
  {
    AppMethodBeat.i(88377);
    Intent localIntent = new Intent();
    if ((this.kaS instanceof CardInfo))
      localIntent.putExtra("key_card_info_data", (CardInfo)this.kaS);
    while (true)
    {
      localIntent.setClass(this.kjd, CardConsumeCodeUI.class);
      localIntent.putExtra("key_from_scene", this.kjF.emC);
      localIntent.putExtra("key_previous_scene", this.kjF.kgn);
      localIntent.putExtra("key_mark_user", paramString);
      localIntent.putExtra("key_from_appbrand_type", this.kjF.kjL);
      this.kjd.startActivityForResult(localIntent, 3);
      this.kjd.ifE = this;
      AppMethodBeat.o(88377);
      return;
      if ((this.kaS instanceof ShareCardInfo))
        localIntent.putExtra("key_card_info_data", (ShareCardInfo)this.kaS);
    }
  }

  private String bbF()
  {
    AppMethodBeat.i(88376);
    String str;
    if ((!TextUtils.isEmpty(this.kgQ)) && (!TextUtils.isEmpty(this.kgR)))
    {
      str = this.kgQ + "," + com.tencent.mm.plugin.card.d.l.Hq(this.kgR);
      AppMethodBeat.o(88376);
    }
    while (true)
    {
      return str;
      if (!TextUtils.isEmpty(this.kgQ))
      {
        str = this.kgQ;
        AppMethodBeat.o(88376);
      }
      else if (!TextUtils.isEmpty(this.kgR))
      {
        str = com.tencent.mm.plugin.card.d.l.Hq(this.kgR);
        AppMethodBeat.o(88376);
      }
      else
      {
        str = "";
        AppMethodBeat.o(88376);
      }
    }
  }

  private void bcF()
  {
    AppMethodBeat.i(88353);
    int i;
    if (this.kje == null)
    {
      i = 0;
      if (i != 0)
      {
        this.kje.release();
        this.kje = null;
        ab.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, need recreate show logic, card_type:%d", new Object[] { Integer.valueOf(this.kaS.aZV().iAd) });
      }
      if (this.kje == null)
      {
        ab.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, mCardShowLogic == null, card_type:%d", new Object[] { Integer.valueOf(this.kaS.aZV().iAd) });
        ab.i("MicroMsg.CardDetailUIContoller", "createShowLogic, card_type:%d", new Object[] { Integer.valueOf(this.kaS.aZV().iAd) });
        if (!this.kaS.aZC())
          break label423;
        this.kje = new com.tencent.mm.plugin.card.ui.a.h(this.kjd);
      }
    }
    while (true)
    {
      ab.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, card_tye:%d", new Object[] { Integer.valueOf(this.kaS.aZV().iAd) });
      this.kje.a(this.kaS, this.kjF);
      AppMethodBeat.o(88353);
      return;
      if (this.kaS.aZC())
      {
        if ((this.kje instanceof com.tencent.mm.plugin.card.ui.a.h))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if (this.kaS.aZD())
      {
        if ((this.kje instanceof com.tencent.mm.plugin.card.ui.a.e))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if (this.kaS.aZG())
      {
        if ((this.kje instanceof com.tencent.mm.plugin.card.ui.a.b))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if (this.kaS.aZE())
      {
        if ((this.kje instanceof com.tencent.mm.plugin.card.ui.a.c))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if (this.kaS.aZF())
      {
        if ((this.kje instanceof com.tencent.mm.plugin.card.ui.a.f))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if (this.kaS.aZH())
      {
        if ((this.kje instanceof com.tencent.mm.plugin.card.ui.a.d))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      if ((this.kje instanceof a))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label423: switch (this.kaS.aZV().iAd)
      {
      default:
        this.kje = new a(this.kjd);
        break;
      case 0:
        this.kje = new com.tencent.mm.plugin.card.ui.a.c(this.kjd);
        break;
      case 10:
        this.kje = new com.tencent.mm.plugin.card.ui.a.e(this.kjd);
        break;
      case 11:
        this.kje = new com.tencent.mm.plugin.card.ui.a.b(this.kjd);
        break;
      case 20:
        this.kje = new com.tencent.mm.plugin.card.ui.a.f(this.kjd);
        break;
      case 30:
        this.kje = new com.tencent.mm.plugin.card.ui.a.d(this.kjd);
      }
    }
  }

  private void bcG()
  {
    AppMethodBeat.i(88359);
    if ((this.kaS.aZV().vUB != null) && (this.kaS.aZV().vUB.wdu))
    {
      this.kjk = new com.tencent.mm.plugin.card.ui.view.m();
      am.bbm().a(this);
      AppMethodBeat.o(88359);
    }
    while (true)
    {
      return;
      if (this.kaS.aZV().iAd == 10)
      {
        this.kjk = new q();
        AppMethodBeat.o(88359);
      }
      else
      {
        this.kjk = new com.tencent.mm.plugin.card.ui.view.j();
        AppMethodBeat.o(88359);
      }
    }
  }

  private void bcH()
  {
    AppMethodBeat.i(88360);
    if (this.cAY)
    {
      ab.i("MicroMsg.CardDetailUIContoller", "updateUIBackground onPause return");
      AppMethodBeat.o(88360);
      return;
    }
    label87: Object localObject1;
    Object localObject2;
    View localView;
    label184: Object localObject3;
    int i;
    if ((this.kaS.aZB()) && (this.kaS.aZD()))
    {
      this.jcl.findViewById(2131822015).setBackgroundColor(this.kjd.getResources().getColor(2131689822));
      this.kjd.O(-1, true);
      localObject1 = this.jcl.findViewById(2131822019);
      localObject2 = this.jcl.findViewById(2131822020);
      localView = this.jcl.findViewById(2131822021);
      if ((!this.kaS.aZB()) || (!this.kje.bdP()))
        break label1258;
      if (!this.kaS.aZE())
        break label1125;
      ((View)localObject1).setBackgroundResource(2130838136);
      this.jcl.findViewById(2131824179).setBackgroundResource(2130838082);
      localView.setBackgroundResource(0);
      Object localObject4;
      if (this.kaS.aZH())
      {
        localObject3 = (TextView)this.jcl.findViewById(2131822037);
        localObject4 = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.LV(2130838133));
        ((BitmapDrawable)localObject4).setTileModeX(Shader.TileMode.REPEAT);
        ((TextView)localObject3).setBackgroundDrawable((Drawable)localObject4);
        ((TextView)localObject3).setVisibility(0);
      }
      localObject3 = new Rect(0, 0, 0, 0);
      ((View)localObject1).setPadding(((Rect)localObject3).left, ((Rect)localObject3).top, ((Rect)localObject3).right, ((Rect)localObject3).bottom);
      ((View)localObject1).invalidate();
      localView.setPadding(((Rect)localObject3).left, ((Rect)localObject3).top, ((Rect)localObject3).right, ((Rect)localObject3).bottom);
      localView.invalidate();
      if ((this.kaS.aZC()) && (this.kje.bdN()) && (this.kjg))
      {
        localObject4 = this.jcl.findViewById(2131822308);
        ((View)localObject4).setPadding(((Rect)localObject3).left, ((Rect)localObject3).top, ((Rect)localObject3).right, ((Rect)localObject3).bottom);
        ((View)localObject4).invalidate();
      }
      if ((this.kaS.aZB()) && (this.kje.bdP()))
      {
        localObject4 = this.jcl.findViewById(2131824179);
        ((Rect)localObject3).left = this.kjd.getResources().getDimensionPixelOffset(2131427776);
        ((Rect)localObject3).right = this.kjd.getResources().getDimensionPixelOffset(2131427776);
        ((View)localObject4).setPadding(((Rect)localObject3).left, ((Rect)localObject3).top, ((Rect)localObject3).right, ((Rect)localObject3).bottom);
        ((View)localObject4).invalidate();
        if (this.kaS.aZF())
        {
          localObject3 = this.jcl.findViewById(2131822017);
          localObject4 = (LinearLayout.LayoutParams)((View)localObject3).getLayoutParams();
          i = this.kjd.getResources().getDimensionPixelSize(2131427858);
          ((LinearLayout.LayoutParams)localObject4).rightMargin = i;
          ((LinearLayout.LayoutParams)localObject4).leftMargin = i;
          ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
        }
      }
      if ((!this.kje.bdP()) && (!this.kje.bdN()))
        break label1476;
      if ((this.kjj != null) && (((this.kaS.aZB()) && (this.kaS.aZE())) || (this.kaS.aZC())))
        this.kjj.tq(0);
      label638: if ((this.kjj != null) && (this.kaS.aZB()) && (this.kaS.aZD()))
      {
        i = this.kjd.getResources().getDimensionPixelOffset(2131428179);
        localObject3 = com.tencent.mm.plugin.card.d.l.dI(com.tencent.mm.plugin.card.d.l.Hn(this.kaS.aZV().color), i);
        this.kjj.a((ShapeDrawable)localObject3);
      }
      if ((this.kaS.aZB()) && (this.kaS.aZD()))
      {
        localObject3 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject3).bottomMargin = 0;
        ((LinearLayout.LayoutParams)localObject3).topMargin = 0;
        ((LinearLayout.LayoutParams)localObject3).rightMargin = 0;
        ((LinearLayout.LayoutParams)localObject3).leftMargin = 0;
        if (TextUtils.isEmpty(this.kaS.aZV().vUh))
          break label1561;
        ((LinearLayout.LayoutParams)localObject3).weight = 0.0F;
        ((LinearLayout.LayoutParams)localObject3).height = -2;
        label805: ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        localObject1 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
        i = this.kjd.getResources().getDimensionPixelSize(2131427796);
        ((LinearLayout.LayoutParams)localObject1).rightMargin = i;
        ((LinearLayout.LayoutParams)localObject1).leftMargin = i;
        if (!this.kaS.aZD())
          break label1576;
        ((LinearLayout.LayoutParams)localObject1).topMargin = this.kjd.getResources().getDimensionPixelSize(2131427785);
        ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.kjd.getResources().getDimensionPixelSize(2131427786);
        i = this.kjd.getResources().getDimensionPixelSize(2131427779);
        ((LinearLayout.LayoutParams)localObject1).rightMargin = i;
        ((LinearLayout.LayoutParams)localObject1).leftMargin = i;
        label919: ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        localObject2 = (LinearLayout.LayoutParams)localView.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).bottomMargin = 0;
        ((LinearLayout.LayoutParams)localObject2).topMargin = 0;
        ((LinearLayout.LayoutParams)localObject2).rightMargin = 0;
        ((LinearLayout.LayoutParams)localObject2).leftMargin = 0;
        if (this.kaS.aZD())
          ((LinearLayout.LayoutParams)localObject2).bottomMargin = this.kjd.getResources().getDimensionPixelSize(2131427779);
        if (TextUtils.isEmpty(this.kaS.aZV().vUh))
          break label1606;
        ((LinearLayout.LayoutParams)localObject2).weight = 0.0F;
        ((LinearLayout.LayoutParams)localObject2).height = -2;
      }
    }
    while (true)
    {
      localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      if (!TextUtils.isEmpty(this.kaS.aZV().vUh))
      {
        localView = findViewById(2131822038);
        localObject2 = (LinearLayout.LayoutParams)localView.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).height = 0;
        ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      this.jcl.invalidate();
      AppMethodBeat.o(88360);
      break;
      i = com.tencent.mm.plugin.card.d.l.Hn(this.kaS.aZV().color);
      this.jcl.findViewById(2131822015).setBackgroundColor(i);
      this.kjd.O(i, false);
      break label87;
      label1125: if (this.kaS.aZD())
      {
        this.jcl.findViewById(2131824179).setBackgroundResource(0);
        localView.setBackgroundColor(this.kjd.getResources().getColor(2131689822));
        break label184;
      }
      if (this.kaS.aZF())
      {
        ((View)localObject1).setBackgroundResource(2130838136);
        this.jcl.findViewById(2131824179).setBackgroundResource(2130838082);
        localView.setBackgroundResource(0);
        break label184;
      }
      if ((this.kaS.aZG()) || (!this.kaS.aZH()))
        break label184;
      localView.setBackgroundColor(this.kjd.getResources().getColor(2131689822));
      break label184;
      label1258: if (this.kaS.aZC())
      {
        if ((this.kje.bdN()) && (this.kjg))
        {
          ((View)localObject1).setBackgroundResource(2130838136);
          localView.setBackgroundResource(0);
          break label184;
        }
        if ((this.kje.bdN()) && (!this.kjg))
        {
          ((View)localObject1).setBackgroundResource(2130838134);
          localView.setBackgroundResource(0);
          break label184;
        }
        ((View)localObject1).setBackgroundResource(0);
        if (this.kje.bcT())
        {
          localView.setBackgroundResource(2130838134);
          break label184;
        }
        localView.setBackgroundResource(2130838136);
        break label184;
      }
      if (this.kaS.aZE())
      {
        ((View)localObject1).setBackgroundResource(0);
        if (this.kje.bcT())
        {
          localView.setBackgroundResource(2130838134);
          break label184;
        }
        localView.setBackgroundResource(2130838136);
        break label184;
      }
      if (this.kaS.aZF())
      {
        ((View)localObject1).setBackgroundResource(2130838139);
        localView.setBackgroundResource(0);
        break label184;
      }
      ((View)localObject1).setBackgroundResource(0);
      localView.setBackgroundColor(this.kjd.getResources().getColor(2131689822));
      break label184;
      label1476: if ((this.kjj == null) || (((!this.kaS.aZB()) || (!this.kaS.aZE())) && (!this.kaS.aZC())))
        break label638;
      if (this.kje.bcT())
      {
        this.kjj.tq(2130838137);
        break label638;
      }
      this.kjj.tq(2130838135);
      break label638;
      label1561: ((LinearLayout.LayoutParams)localObject3).height = 0;
      ((LinearLayout.LayoutParams)localObject3).weight = 1.0F;
      break label805;
      label1576: i = this.kjd.getResources().getDimensionPixelSize(2131427510);
      ((LinearLayout.LayoutParams)localObject1).bottomMargin = i;
      ((LinearLayout.LayoutParams)localObject1).topMargin = i;
      break label919;
      label1606: ((LinearLayout.LayoutParams)localObject2).height = 0;
      ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
    }
  }

  private void bcI()
  {
    AppMethodBeat.i(88364);
    if (!this.kje.bdR())
    {
      ab.i("MicroMsg.CardDetailUIContoller", "card is membership or share card or general coupon, not accept, don't updateCellData()");
      AppMethodBeat.o(88364);
    }
    while (true)
    {
      return;
      this.kaW.clear();
      this.kaW.addAll(this.kjy.baw());
      this.kjl.setData(this.kaW);
      this.kjl.kob = this.kaS.aZH();
      this.kjl.notifyDataSetChanged();
      AppMethodBeat.o(88364);
    }
  }

  private void bcJ()
  {
    AppMethodBeat.i(88365);
    if (this.kaS == null)
    {
      ab.e("MicroMsg.CardDetailUIContoller", "updateWidget, mCardInfo is null");
      AppMethodBeat.o(88365);
    }
    while (true)
    {
      return;
      if (bcK())
        bcM();
      if (this.kjj == null)
        bcL();
      if (this.kjj != null)
      {
        if (this.kaS.aZF())
          ((com.tencent.mm.plugin.card.widget.f)this.kjj).kaY = this.kaY;
        this.kjj.d(this.kaS);
      }
      AppMethodBeat.o(88365);
    }
  }

  private boolean bcK()
  {
    boolean bool = false;
    AppMethodBeat.i(88366);
    if (this.kjj == null)
      AppMethodBeat.o(88366);
    while (true)
    {
      return bool;
      if (this.kaS.aZD())
      {
        if ((this.kjj instanceof com.tencent.mm.plugin.card.widget.e))
        {
          AppMethodBeat.o(88366);
        }
        else
        {
          AppMethodBeat.o(88366);
          bool = true;
        }
      }
      else if (this.kaS.aZG())
      {
        if ((this.kjj instanceof com.tencent.mm.plugin.card.widget.c))
        {
          AppMethodBeat.o(88366);
        }
        else
        {
          AppMethodBeat.o(88366);
          bool = true;
        }
      }
      else if (this.kaS.aZE())
      {
        if ((this.kjj instanceof com.tencent.mm.plugin.card.widget.b))
        {
          AppMethodBeat.o(88366);
        }
        else
        {
          AppMethodBeat.o(88366);
          bool = true;
        }
      }
      else if (this.kaS.aZF())
      {
        if ((this.kjj instanceof com.tencent.mm.plugin.card.widget.f))
        {
          AppMethodBeat.o(88366);
        }
        else
        {
          AppMethodBeat.o(88366);
          bool = true;
        }
      }
      else if (this.kaS.aZH())
      {
        if ((this.kjj instanceof com.tencent.mm.plugin.card.widget.d))
        {
          AppMethodBeat.o(88366);
        }
        else
        {
          AppMethodBeat.o(88366);
          bool = true;
        }
      }
      else
        AppMethodBeat.o(88366);
    }
  }

  private void bcL()
  {
    AppMethodBeat.i(88367);
    if (this.kaS.aZD())
      this.kjj = new com.tencent.mm.plugin.card.widget.e(this.kjd);
    while (true)
    {
      this.kjj.i(this.kaS);
      View localView = this.kjj.hS();
      if (localView != null)
        com.tencent.mm.plugin.card.d.m.a(localView, this.lK);
      this.lK.invalidate();
      this.kjj.setOnClickListener(this.gKK);
      x(false, false);
      AppMethodBeat.o(88367);
      return;
      if (this.kaS.aZG())
        this.kjj = new com.tencent.mm.plugin.card.widget.c(this.kjd);
      else if (this.kaS.aZE())
        this.kjj = new com.tencent.mm.plugin.card.widget.b(this.kjd);
      else if (this.kaS.aZF())
        this.kjj = new com.tencent.mm.plugin.card.widget.f(this.kjd);
      else if (this.kaS.aZH())
        this.kjj = new com.tencent.mm.plugin.card.widget.d(this.kjd);
      else
        this.kjj = new com.tencent.mm.plugin.card.widget.b(this.kjd);
    }
  }

  private void bcM()
  {
    AppMethodBeat.i(88368);
    View localView = this.kjj.hS();
    if (localView != null)
      this.lK.removeView(localView);
    this.lK.removeAllViews();
    this.lK.invalidate();
    this.kjj.release();
    this.kjj = null;
    AppMethodBeat.o(88368);
  }

  private void bcN()
  {
    AppMethodBeat.i(88369);
    if ((this.kjj != null) && ((this.kjj instanceof com.tencent.mm.plugin.card.widget.b)))
      ((com.tencent.mm.plugin.card.widget.b)this.kjj).bcN();
    AppMethodBeat.o(88369);
  }

  private void bcO()
  {
    AppMethodBeat.i(88370);
    no localno = this.kaS.aZW();
    this.kaS.a(localno);
    com.tencent.mm.plugin.card.d.l.h(this.kaS);
    AppMethodBeat.o(88370);
  }

  private void bcP()
  {
    int i = 0;
    AppMethodBeat.i(88371);
    this.kjB.clear();
    this.kjD.clear();
    if (this.kaS.aZK())
    {
      this.kjD.add(getString(2131298018));
      this.kjB.put(Integer.valueOf(0), "menu_func_share_friend");
      this.kjD.add(getString(2131298017));
      this.kjB.put(Integer.valueOf(1), "menu_func_share_timeline");
      i = 2;
    }
    int j = i;
    if (!TextUtils.isEmpty(this.kaS.aZW().vSf))
    {
      this.kjD.add(getString(2131297927));
      this.kjB.put(Integer.valueOf(i), "menu_func_report");
      j = i + 1;
    }
    tc(j);
    if (this.kjD.size() > 0)
      this.kjd.fH(true);
    AppMethodBeat.o(88371);
  }

  private void bcQ()
  {
    int i = 0;
    AppMethodBeat.i(88372);
    this.kjB.clear();
    this.kjD.clear();
    int j = i;
    if (this.kaS.aZB())
    {
      j = i;
      if (this.kaS.aZJ())
      {
        if (bo.isNullOrNil(this.kaS.aZV().vUI))
          break label235;
        this.kjD.add(this.kaS.aZV().vUI);
        this.kjB.put(Integer.valueOf(0), "menu_func_gift");
        j = 1;
      }
    }
    i = j;
    if (!TextUtils.isEmpty(this.kaS.aZW().vSf))
    {
      this.kjD.add(getString(2131297927));
      this.kjB.put(Integer.valueOf(j), "menu_func_report");
      i = j + 1;
    }
    if (this.kaS.aZB())
    {
      this.kjD.add(getString(2131296881));
      this.kjB.put(Integer.valueOf(i), "menu_func_delete");
      j = i + 1;
    }
    while (true)
    {
      tc(j);
      if (this.kjD.size() > 0)
        this.kjd.fH(true);
      AppMethodBeat.o(88372);
      return;
      label235: if (this.kaS.aZH())
      {
        this.kjD.add(getString(2131297926));
        break;
      }
      this.kjD.add(getString(2131297925));
      break;
      j = i;
      if (this.kaS.aZC())
      {
        String str1 = r.Yz();
        String str2 = this.kaS.bab();
        if ((str1 != null) && (str1.equals(str2)))
        {
          this.kjD.add(getString(2131296881));
          this.kjB.put(Integer.valueOf(i), "menu_func_delete_share_card");
          j = i + 1;
        }
        else
        {
          ab.i("MicroMsg.CardDetailUIContoller", "the card is not belong mine");
          j = i;
        }
      }
    }
  }

  private void bcR()
  {
    int i = 0;
    AppMethodBeat.i(88373);
    this.kjB.clear();
    this.kjD.clear();
    if (!TextUtils.isEmpty(this.kaS.aZW().vSf))
    {
      this.kjD.add(getString(2131297927));
      this.kjB.put(Integer.valueOf(0), "menu_func_report");
      i = 1;
    }
    tc(i);
    if (this.kjD.size() > 0)
      this.kjd.fH(true);
    AppMethodBeat.o(88373);
  }

  private void tc(int paramInt)
  {
    AppMethodBeat.i(88374);
    LinkedList localLinkedList = this.kaS.aZW().vSh;
    if (localLinkedList == null)
      AppMethodBeat.o(88374);
    while (true)
    {
      return;
      this.kjC.clear();
      int i = 0;
      int j = paramInt;
      paramInt = i;
      while (paramInt < localLinkedList.size())
      {
        ax localax = (ax)localLinkedList.get(paramInt);
        i = j;
        if (!bo.isNullOrNil(localax.text))
        {
          i = j;
          if (!bo.isNullOrNil(localax.url))
          {
            this.kjD.add(localax.text);
            this.kjB.put(Integer.valueOf(j), localax.text);
            this.kjC.put(localax.text, localax.url);
            i = j + 1;
          }
        }
        paramInt++;
        j = i;
      }
      AppMethodBeat.o(88374);
    }
  }

  private void updateTitle()
  {
    AppMethodBeat.i(88363);
    if (!this.kje.bdM())
    {
      this.kjd.setMMTitle("");
      AppMethodBeat.o(88363);
    }
    while (true)
    {
      return;
      this.kjd.setMMTitle(this.kjy.getTitle());
      AppMethodBeat.o(88363);
    }
  }

  private void x(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(88362);
    if (this.kjj != null)
      this.kjj.x(paramBoolean1, paramBoolean2);
    AppMethodBeat.o(88362);
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb, e.a parama, ArrayList<od> paramArrayList)
  {
    this.kaS = paramb;
    this.kjF = parama;
    this.kaY = paramArrayList;
  }

  public final void a(boolean paramBoolean1, j.b paramb, boolean paramBoolean2)
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(88361);
    if (paramBoolean1)
    {
      localObject1 = this.kaS.aZW().vSj;
      if (this.kaS.aZP())
      {
        com.tencent.mm.plugin.card.d.b.a(this.kjd, paramb.kbK, paramb.kbL, paramBoolean2, this.kaS);
        com.tencent.mm.plugin.report.service.h.pYm.e(11941, new Object[] { Integer.valueOf(17), this.kaS.aZZ(), this.kaS.baa(), "", this.kaS.aZW().vSj.title });
        AppMethodBeat.o(88361);
        return;
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((tm)localObject1).vTL)) && (!TextUtils.isEmpty(((tm)localObject1).vTM)))
      {
        com.tencent.mm.plugin.card.d.b.a(this.kaS.aZZ(), (tm)localObject1, this.kjF.kgn, this.kjF.kjL);
        localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject3 = this.kaS.aZZ();
        localObject4 = this.kaS.baa();
        if (((tm)localObject1).title != null);
        for (paramb = ((tm)localObject1).title; ; paramb = "")
        {
          ((com.tencent.mm.plugin.report.service.h)localObject2).e(11941, new Object[] { Integer.valueOf(6), localObject3, localObject4, "", paramb });
          AppMethodBeat.o(88361);
          break;
        }
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((tm)localObject1).url)))
      {
        paramb = com.tencent.mm.plugin.card.d.l.A(((tm)localObject1).url, ((tm)localObject1).vUW);
        com.tencent.mm.plugin.card.d.b.a(this.kjd, paramb, 1);
        localObject4 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject2 = this.kaS.aZZ();
        localObject3 = this.kaS.baa();
        if (((tm)localObject1).title != null);
        for (paramb = ((tm)localObject1).title; ; paramb = "")
        {
          ((com.tencent.mm.plugin.report.service.h)localObject4).e(11941, new Object[] { Integer.valueOf(6), localObject2, localObject3, "", paramb });
          AppMethodBeat.o(88361);
          break;
        }
      }
      localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
      i = this.kaS.aZV().iAd;
      localObject4 = this.kaS.baa();
      localObject1 = this.kaS.aZZ();
      k = this.kjF.kgn;
      localObject2 = this.kjF.kiN;
      if (this.kaS.aZT());
      while (true)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject3).e(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(i), localObject4, localObject1, Integer.valueOf(0), Integer.valueOf(k), localObject2, Integer.valueOf(j), "" });
        GR(paramb.kbH);
        AppMethodBeat.o(88361);
        break;
        j = 0;
      }
    }
    Object localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
    int k = this.kaS.aZV().iAd;
    Object localObject2 = this.kaS.baa();
    Object localObject4 = this.kaS.aZZ();
    int m = this.kjF.kgn;
    Object localObject3 = this.kjF.kiN;
    if (this.kaS.aZT());
    for (j = i; ; j = 0)
    {
      ((com.tencent.mm.plugin.report.service.h)localObject1).e(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(k), localObject2, localObject4, Integer.valueOf(0), Integer.valueOf(m), localObject3, Integer.valueOf(j), "" });
      GR(paramb.kbH);
      AppMethodBeat.o(88361);
      break;
    }
  }

  public final void ap(int paramInt, String paramString)
  {
    AppMethodBeat.i(88356);
    ab.e("MicroMsg.CardDetailUIContoller", "onGetCodeFail! errCode = %d, errMsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    Message localMessage = Message.obtain();
    c localc = new c((byte)0);
    localc.kjR = e.b.kjP;
    localc.errCode = paramInt;
    if (paramInt == -1)
      paramString = getString(2131297846);
    while (true)
    {
      localc.aIm = paramString;
      localMessage.obj = localc;
      this.kjG.sendMessage(localMessage);
      AppMethodBeat.o(88356);
      return;
      if (paramInt == 2)
        paramString = getString(2131297815);
      else
        paramString = getString(2131297845);
    }
  }

  public final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88351);
    if (paramb != null)
    {
      this.kaS = paramb;
      if (this.kjE != null)
        this.kjE.b(paramb);
      bbB();
    }
    AppMethodBeat.o(88351);
  }

  public final void b(com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(88358);
    ab.i("MicroMsg.CardDetailUIContoller", "on onReceiveCodeUnavailable! do update refresh code view!");
    Message localMessage = Message.obtain();
    c localc = new c((byte)0);
    localc.kjR = e.b.kjO;
    localc.kjS = paramc;
    localMessage.obj = localc;
    this.kjG.sendMessage(localMessage);
    AppMethodBeat.o(88358);
  }

  public final void baA()
  {
    AppMethodBeat.i(88357);
    ab.i("MicroMsg.CardDetailUIContoller", "on show TimeExpired! do update refresh code view!");
    Message localMessage = Message.obtain();
    c localc = new c((byte)0);
    localc.kjR = e.b.kjN;
    localMessage.obj = localc;
    this.kjG.sendMessage(localMessage);
    AppMethodBeat.o(88357);
  }

  public final void bbB()
  {
    AppMethodBeat.i(88354);
    if (this.kaS == null)
    {
      ab.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo == null");
      if (this.kjE != null)
        this.kjE.bcs();
      AppMethodBeat.o(88354);
    }
    while (true)
    {
      return;
      if (this.kaS.aZV() == null)
      {
        ab.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getCardTpInfo() == null");
        if (this.kjE != null)
          this.kjE.bcs();
        AppMethodBeat.o(88354);
      }
      else if (this.kaS.aZW() == null)
      {
        ab.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getDataInfo() == null");
        if (this.kjE != null)
          this.kjE.bcs();
        AppMethodBeat.o(88354);
      }
      else
      {
        if (this.kaS.aZI())
          break;
        ab.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, not support card type :%d", new Object[] { Integer.valueOf(this.kaS.aZV().iAd) });
        if (!TextUtils.isEmpty(this.kaS.aZV().vUc))
        {
          com.tencent.mm.plugin.card.d.b.a(this.kjd, this.kaS.aZV().vUc, 0);
          if (this.kjE != null)
          {
            this.kjE.bcs();
            AppMethodBeat.o(88354);
          }
        }
        else
        {
          com.tencent.mm.ui.base.h.a(this.kjd, getString(2131297936), null, false, new e.2(this));
          AppMethodBeat.o(88354);
        }
      }
    }
    ab.i("MicroMsg.CardDetailUIContoller", "doUpdate()");
    ab.i("MicroMsg.CardDetailUIContoller", "doUpdate() showAcceptView:" + this.kaS.aZV().vUx);
    this.kjy.a(this.kaS, this.kaY, this.kjF.emC);
    bcF();
    this.kje.bee();
    ab.i("MicroMsg.CardDetailUIContoller", "");
    updateTitle();
    bcJ();
    if (this.kje.bdN())
    {
      ab.i("MicroMsg.CardDetailUIContoller", "updateShareUsersInfoLayout()");
      this.kjf.update();
      label391: if (!this.kje.bdE())
        break label1166;
      if (this.kjv == null)
      {
        this.kjv = new com.tencent.mm.plugin.card.ui.view.b();
        this.kjv.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update CardAcceptView()");
      this.kjv.update();
      label444: this.kjd.fH(this.kje.bdI());
      if (this.kje.bdJ())
        bcP();
      if (this.kje.bdK())
        bcQ();
      if (this.kje.bdL())
        bcR();
      bcN();
      x(this.kje.bdG(), this.kje.bdH());
      if ((this.kaS.aZD()) || (!this.kje.bdP()))
        break label1191;
      ab.i("MicroMsg.CardDetailUIContoller", "update mFromUserView");
      this.kjh.update();
      label573: if (this.kjj != null)
        this.kjj.fM(this.kje.bcT());
      bcH();
      if (!this.kje.bdU())
        break label1288;
      if (this.kjn == null)
      {
        this.kjn = new y();
        this.kjn.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update CardStatusView");
      this.kjn.update();
      label655: if (!this.kje.bed())
        break label1313;
      if (this.kjm == null)
      {
        this.kjm = new com.tencent.mm.plugin.card.ui.view.c();
        this.kjm.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update mAdtitleView()");
      this.kjm.update();
      label708: if (!this.kje.bdV())
        break label1338;
      if (this.kjo == null)
      {
        this.kjo = new k();
        this.kjo.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update mCardDetailFieldView()");
      this.kjo.update();
      label761: if (!this.kje.bdW())
        break label1363;
      if (this.kjp == null)
      {
        this.kjp = new w();
        this.kjp.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update CardSecondaryFieldView");
      this.kjp.update();
      label814: if (!this.kje.bdX())
        break label1388;
      if (this.kjq == null)
      {
        this.kjq = new com.tencent.mm.plugin.card.ui.view.l();
        this.kjq.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update CardDetailTableView");
      this.kjq.update();
      label867: if (!this.kje.bdY())
        break label1413;
      if (this.kjr == null)
      {
        this.kjr = new z();
        this.kjr.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "update CardThirdFieldView");
      this.kjr.update();
      label920: if (!this.kje.bea())
        break label1438;
      if (this.kjs == null)
      {
        this.kjs = new com.tencent.mm.plugin.card.ui.view.e();
        this.kjs.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "updateCardAnnoucementView");
      this.kjs.update();
      label973: if (!this.kje.bdZ())
        break label1463;
      if (this.kjt == null)
      {
        this.kjt = new u();
        this.kjt.a(this);
      }
      ab.i("MicroMsg.CardDetailUIContoller", "updateCardOperateFieldView");
      this.kjt.update();
      label1026: bcI();
      if (!this.kje.bdS())
        break label1540;
      bcO();
      if (!this.kje.bdT())
        break label1523;
      if (this.kjk != null)
        break label1488;
      bcG();
      this.kjk.a(this);
      this.kjk.update();
      label1084: if (this.kjj != null)
        this.kjj.fL(true);
      label1101: if (!this.kje.beb())
        break label1582;
      ab.i("MicroMsg.CardDetailUIContoller", "update CardAdvertiseView");
      this.kju.update();
    }
    while (true)
    {
      this.kjw.kaS = this.kaS;
      AppMethodBeat.o(88354);
      break;
      ab.i("MicroMsg.CardDetailUIContoller", "don't updateShareUsersInfoLayout()");
      this.kjf.bes();
      break label391;
      label1166: ab.i("MicroMsg.CardDetailUIContoller", "don't update CardAcceptView()");
      if (this.kjv == null)
        break label444;
      this.kjv.bes();
      break label444;
      label1191: if ((this.kaS.aZD()) && (this.kje.bdP()))
      {
        ab.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout for username");
        this.kji.update();
        break label573;
      }
      if (this.kje.bdQ())
      {
        ab.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout");
        this.kji.update();
        break label573;
      }
      ab.i("MicroMsg.CardDetailUIContoller", "don't update mFromUserView and mAcceptHeaderLayout");
      this.kji.bes();
      this.kjh.bes();
      break label573;
      label1288: ab.i("MicroMsg.CardDetailUIContoller", "don't update CardStatusView");
      if (this.kjn == null)
        break label655;
      this.kjn.bes();
      break label655;
      label1313: ab.i("MicroMsg.CardDetailUIContoller", "don't update AdTitleView()");
      if (this.kjm == null)
        break label708;
      this.kjm.bes();
      break label708;
      label1338: ab.i("MicroMsg.CardDetailUIContoller", "don't update mCardDetailFieldView()");
      if (this.kjo == null)
        break label761;
      this.kjo.bes();
      break label761;
      label1363: ab.i("MicroMsg.CardDetailUIContoller", "don't update CardSecondaryFieldView");
      if (this.kjp == null)
        break label814;
      this.kjp.bes();
      break label814;
      label1388: ab.i("MicroMsg.CardDetailUIContoller", "don't update CardDetailTableView");
      if (this.kjq == null)
        break label867;
      this.kjq.bes();
      break label867;
      label1413: ab.i("MicroMsg.CardDetailUIContoller", "don't update CardThirdFieldView");
      if (this.kjr == null)
        break label920;
      this.kjr.bes();
      break label920;
      label1438: ab.i("MicroMsg.CardDetailUIContoller", "don't updateCardAnnoucementView");
      if (this.kjs == null)
        break label973;
      this.kjs.bes();
      break label973;
      label1463: ab.i("MicroMsg.CardDetailUIContoller", "don't updateCardOperateFieldView");
      if (this.kjt == null)
        break label1026;
      this.kjt.bes();
      break label1026;
      label1488: if (!this.kjk.f(this.kaS))
        break label1084;
      this.kjk.b(this.kaS);
      this.kjk.update();
      break label1084;
      label1523: if (this.kjk == null)
        break label1084;
      this.kjk.bex();
      break label1084;
      label1540: ab.e("MicroMsg.CardDetailUIContoller", "don't update CardCodeView");
      if (this.kjk != null)
        this.kjk.bex();
      if (this.kjj == null)
        break label1101;
      this.kjj.fL(false);
      break label1101;
      label1582: ab.i("MicroMsg.CardDetailUIContoller", "don't update CardAdvertiseView");
      this.kju.bes();
    }
  }

  public final com.tencent.mm.plugin.card.ui.a.g bcA()
  {
    return this.kje;
  }

  public final e.d bcB()
  {
    return this.kjE;
  }

  public final e.a bcC()
  {
    return this.kjF;
  }

  public final com.tencent.mm.plugin.card.b.f bcD()
  {
    return this.kjy;
  }

  public final j bcE()
  {
    return this.kjw;
  }

  public final int bcS()
  {
    int i = 0;
    AppMethodBeat.i(88378);
    if (this.kjy == null)
      AppMethodBeat.o(88378);
    while (true)
    {
      return i;
      if (this.kjy.bay())
      {
        i = 1;
        AppMethodBeat.o(88378);
      }
      else
      {
        AppMethodBeat.o(88378);
      }
    }
  }

  public final boolean bcT()
  {
    AppMethodBeat.i(88379);
    boolean bool;
    if (this.kje == null)
    {
      bool = false;
      AppMethodBeat.o(88379);
    }
    while (true)
    {
      return bool;
      bool = this.kje.bcT();
      AppMethodBeat.o(88379);
    }
  }

  public final com.tencent.mm.plugin.card.base.b bcv()
  {
    return this.kaS;
  }

  public final boolean bcw()
  {
    return this.kjg;
  }

  public final void bcx()
  {
    this.kjg = false;
  }

  public final MMActivity bcy()
  {
    return this.kjd;
  }

  public final View.OnClickListener bcz()
  {
    return this.gKK;
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(88375);
    switch (paramInt1)
    {
    default:
    case 0:
    case 1:
    case 4:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(88375);
      while (true)
      {
        return;
        if ((paramInt2 != -1) || (paramIntent == null))
          break;
        this.kjz = paramIntent.getStringExtra("Select_Conv_User");
        paramIntent = this.kjz;
        if ((this.kaS == null) || (this.kaS.aZV() == null))
        {
          ab.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
          AppMethodBeat.o(88375);
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          if (paramInt1 == 0)
            if ((!TextUtils.isEmpty(this.kaS.aZX().wYl)) && (!this.kaS.aZH()))
              localStringBuilder.append(this.kaS.aZX().wYl);
          while (true)
          {
            String str = this.kaS.aZV().title + "\n" + this.kaS.aZV().kdg;
            t.a.vlq.a(this.kjd.mController, localStringBuilder.toString(), this.kaS.aZV().kbV, str, true, this.kjd.getResources().getString(2131297041), new e.6(this, paramInt1, paramIntent));
            AppMethodBeat.o(88375);
            break;
            localStringBuilder.append(getString(2131303749));
            continue;
            if (paramInt1 == 1)
              localStringBuilder.append(getString(2131297983) + this.kjy.getTitle());
            else if (paramInt1 == 4)
              localStringBuilder.append(getString(2131297944) + this.kjy.getTitle());
          }
          if (paramInt2 != -1)
          {
            AppMethodBeat.o(88375);
          }
          else
          {
            this.kgP = paramIntent.getIntExtra("Ktag_range_index", 0);
            ab.i("MicroMsg.CardDetailUIContoller", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.kgP) });
            if (this.kgP >= 2)
            {
              this.kgQ = paramIntent.getStringExtra("Klabel_name_list");
              this.kgR = paramIntent.getStringExtra("Kother_user_name_list");
              ab.d("MicroMsg.CardDetailUIContoller", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.kgP), this.kgQ });
              if ((TextUtils.isEmpty(this.kgQ)) && (TextUtils.isEmpty(this.kgR)))
              {
                ab.e("MicroMsg.CardDetailUIContoller", "mLabelNameList by getIntent is empty");
                AppMethodBeat.o(88375);
              }
              else
              {
                paramIntent = Arrays.asList(this.kgQ.split(","));
                this.kgT = com.tencent.mm.plugin.card.d.l.bl(paramIntent);
                this.kgS = com.tencent.mm.plugin.card.d.l.bk(paramIntent);
                if ((this.kgR != null) && (this.kgR.length() > 0))
                {
                  paramIntent = Arrays.asList(this.kgR.split(","));
                  this.kgS.addAll(paramIntent);
                }
                if (this.kgT != null)
                  ab.i("MicroMsg.CardDetailUIContoller", "mPrivateIdsList size is " + this.kgT.size());
                if (this.kgS != null)
                {
                  ab.i("MicroMsg.CardDetailUIContoller", "mPrivateNamesList size is " + this.kgS.size());
                  paramIntent = this.kgS.iterator();
                  while (paramIntent.hasNext())
                    ab.d("MicroMsg.CardDetailUIContoller", "username : %s", new Object[] { (String)paramIntent.next() });
                }
                if (this.kgP == 2)
                {
                  this.kju.Hd(this.kjd.getString(2131297971, new Object[] { bbF() }));
                  AppMethodBeat.o(88375);
                }
                else if (this.kgP == 3)
                {
                  this.kju.Hd(this.kjd.getString(2131297970, new Object[] { bbF() }));
                  AppMethodBeat.o(88375);
                }
                else
                {
                  this.kju.Hd(this.kjd.getString(2131297969));
                  AppMethodBeat.o(88375);
                }
              }
            }
            else
            {
              this.kju.Hd(this.kjd.getString(2131297969));
              AppMethodBeat.o(88375);
            }
          }
        }
      }
      if (this.kjE != null)
        this.kjE.bcu();
    }
  }

  public final void c(com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(88355);
    ab.i("MicroMsg.CardDetailUIContoller", "onGetCodeSuccess! do update code view!");
    Message localMessage = Message.obtain();
    c localc = new c((byte)0);
    localc.kjR = e.b.kjM;
    localc.kjS = paramc;
    localMessage.obj = localc;
    this.kjG.sendMessage(localMessage);
    AppMethodBeat.o(88355);
  }

  public final View findViewById(int paramInt)
  {
    AppMethodBeat.i(88350);
    View localView = this.jcl.findViewById(paramInt);
    AppMethodBeat.o(88350);
    return localView;
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(88352);
    String str = this.kjd.getString(paramInt);
    AppMethodBeat.o(88352);
    return str;
  }

  static final class c
  {
    String aIm;
    int errCode;
    e.b kjR;
    com.tencent.mm.plugin.card.d.c kjS;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e
 * JD-Core Version:    0.6.2
 */