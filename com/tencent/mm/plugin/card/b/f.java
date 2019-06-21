package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.aci;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public final class f
{
  private int emC;
  private MMActivity jiE;
  public com.tencent.mm.plugin.card.base.b kaS;
  public List<com.tencent.mm.plugin.card.model.b> kaW;
  public com.tencent.mm.plugin.card.model.b kaX;
  private ArrayList<od> kaY;

  public f(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(87674);
    this.emC = 3;
    this.kaW = new ArrayList();
    this.jiE = paramMMActivity;
    AppMethodBeat.o(87674);
  }

  private boolean bax()
  {
    boolean bool = true;
    AppMethodBeat.i(87676);
    if ((l.tm(this.emC)) || (l.tn(this.emC)) || (this.emC == 23))
    {
      if ((!this.kaS.isAcceptable()) || (this.kaS.aZV().vUq == null) || (TextUtils.isEmpty(this.kaS.aZV().vUq.text)) || (TextUtils.isEmpty(this.kaS.aZV().vTT)))
        break label192;
      AppMethodBeat.o(87676);
    }
    while (true)
    {
      return bool;
      if ((this.emC == 6) && (this.kaS.aZS()) && (this.kaS.aZV().vUq != null) && (!TextUtils.isEmpty(this.kaS.aZV().vUq.text)) && (!TextUtils.isEmpty(this.kaS.aZV().vTT)))
      {
        AppMethodBeat.o(87676);
      }
      else
      {
        label192: bool = false;
        AppMethodBeat.o(87676);
      }
    }
  }

  private String getString(int paramInt)
  {
    AppMethodBeat.i(87679);
    String str = this.jiE.getString(paramInt);
    AppMethodBeat.o(87679);
    return str;
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb, ArrayList<od> paramArrayList, int paramInt)
  {
    this.kaS = paramb;
    this.kaY = paramArrayList;
    this.emC = paramInt;
  }

  public final List<com.tencent.mm.plugin.card.model.b> baw()
  {
    AppMethodBeat.i(87675);
    this.kaW.clear();
    if ((this.kaS.aZW().vSn != null) && (!bo.isNullOrNil(this.kaS.aZW().vSn.title)))
    {
      localObject1 = new com.tencent.mm.plugin.card.model.b();
      ((com.tencent.mm.plugin.card.model.b)localObject1).kcg = 1;
      ((com.tencent.mm.plugin.card.model.b)localObject1).title = this.kaS.aZW().vSn.title;
      ((com.tencent.mm.plugin.card.model.b)localObject1).kfM = "";
      ((com.tencent.mm.plugin.card.model.b)localObject1).url = "card://jump_card_gift";
      ((com.tencent.mm.plugin.card.model.b)localObject1).kKZ = this.kaS.aZW().vSn.kKZ;
      this.kaW.add(localObject1);
    }
    if ((this.kaS.aZW().vRW != null) && (this.kaS.aZW().vRW.size() > 0))
    {
      localObject1 = l.bj(this.kaS.aZW().vRW);
      if (localObject1 != null)
      {
        ((com.tencent.mm.plugin.card.model.b)((List)localObject1).get(0)).kch = false;
        this.kaW.addAll((Collection)localObject1);
      }
    }
    int i;
    if (((this.emC == 6) && (this.kaS.aZW().vSa <= 0)) || ((l.to(this.emC)) && (this.kaS.isNormal()) && (this.kaS.aZB()) && (this.kaS.aZJ())))
    {
      localObject1 = new com.tencent.mm.plugin.card.model.b();
      ((com.tencent.mm.plugin.card.model.b)localObject1).kcg = 1;
      if (!bo.isNullOrNil(this.kaS.aZV().vUI))
      {
        ((com.tencent.mm.plugin.card.model.b)localObject1).title = this.kaS.aZV().vUI;
        ((com.tencent.mm.plugin.card.model.b)localObject1).kfM = "";
        ((com.tencent.mm.plugin.card.model.b)localObject1).url = "card://jump_gift";
        this.kaW.add(localObject1);
      }
    }
    else
    {
      if ((this.kaS.aZW().status != 0) && (this.kaS.aZW().status != 1))
        this.kaS.aZW();
      if ((this.emC != 3) && (this.emC == 6))
        this.kaS.aZW();
      localObject2 = this.kaS.aZV().vUo;
      if (this.kaS.aZW().vSg != null)
        TextUtils.isEmpty(this.kaS.aZW().vSg.title);
      localObject1 = new com.tencent.mm.plugin.card.model.b();
      if (!this.kaS.aZH())
        break label1041;
      i = 0;
      label479: ((com.tencent.mm.plugin.card.model.b)localObject1).kch = false;
      ((com.tencent.mm.plugin.card.model.b)localObject1).kcg = 1;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(getTitle());
      ((StringBuilder)localObject2).append(getString(2131297833));
      ((com.tencent.mm.plugin.card.model.b)localObject1).title = ((StringBuilder)localObject2).toString();
      ((com.tencent.mm.plugin.card.model.b)localObject1).kbW = "";
      ((com.tencent.mm.plugin.card.model.b)localObject1).kfM = "";
      ((com.tencent.mm.plugin.card.model.b)localObject1).url = "card://jump_detail";
      if (i != 0)
        this.kaW.add(localObject1);
      if ((!this.kaS.aZF()) || (this.kaS.aZV().vUa <= 0))
      {
        if ((!this.kaS.aZD()) || (this.kaS.aZV().vUa <= 0))
        {
          if (this.kaS.aZV().vUa <= 0)
            break label925;
          ab.e("MicroMsg.CardDetailDataMgr", "shop_count:" + this.kaS.aZV().vUa);
          if ((this.kaS.aZV().vUa > 0) && (this.kaY != null) && (this.kaY.size() > 0))
          {
            localObject2 = (od)this.kaY.get(0);
            if ((localObject2 == null) || (((od)localObject2).qVo >= 50000.0F))
              break label1089;
            localObject1 = new com.tencent.mm.plugin.card.model.b();
            ((com.tencent.mm.plugin.card.model.b)localObject1).kcg = 2;
            ((com.tencent.mm.plugin.card.model.b)localObject1).title = ((od)localObject2).name;
            ((com.tencent.mm.plugin.card.model.b)localObject1).kbW = this.jiE.getString(2131297985, new Object[] { l.g(this.jiE, ((od)localObject2).qVo), ((od)localObject2).fBg });
            ((com.tencent.mm.plugin.card.model.b)localObject1).kfM = "";
            ((com.tencent.mm.plugin.card.model.b)localObject1).url = "card://jump_shop";
            ((com.tencent.mm.plugin.card.model.b)localObject1).kck = ((od)localObject2).kck;
            ((com.tencent.mm.plugin.card.model.b)localObject1).color = this.kaS.aZV().color;
            this.kaW.add(localObject1);
          }
        }
        label826: if ((this.kaS.aZV().vUa <= 0) || (this.kaY != null))
          break label1135;
        localObject1 = new com.tencent.mm.plugin.card.model.b();
        ((com.tencent.mm.plugin.card.model.b)localObject1).kcg = 1;
        if (TextUtils.isEmpty(this.kaS.aZV().vUz))
          break label1121;
        ((com.tencent.mm.plugin.card.model.b)localObject1).title = this.kaS.aZV().vUz;
        ((com.tencent.mm.plugin.card.model.b)localObject1).kbW = "";
        ((com.tencent.mm.plugin.card.model.b)localObject1).kfM = "";
        ((com.tencent.mm.plugin.card.model.b)localObject1).url = "card://jump_shop_list";
        this.kaW.add(localObject1);
      }
    }
    label925: label1089: label1121: label1135: 
    while ((this.kaS.aZV().vUa <= 0) || (this.kaY == null) || (this.kaY.size() <= 0))
      while (true)
      {
        if (((!this.kaS.aZH()) || (this.kaS.aZW().status != 3)) && (!TextUtils.isEmpty(this.kaS.aZV().vTT)))
          this.kaW.add(baz());
        localObject1 = this.kaW;
        AppMethodBeat.o(87675);
        return localObject1;
        if (this.kaS.aZH())
        {
          ((com.tencent.mm.plugin.card.model.b)localObject1).title = ah.getResources().getString(2131297926);
          break;
        }
        ((com.tencent.mm.plugin.card.model.b)localObject1).title = ah.getContext().getString(2131297925);
        break;
        if ((localObject2 != null) && (((wy)localObject2).wcS != null) && (((wy)localObject2).wcS.size() > 0) && (!TextUtils.isEmpty((CharSequence)((wy)localObject2).wcS.get(0))))
        {
          i = 0;
          break label479;
        }
        i = 1;
        break label479;
        if (localObject2 == null)
          break label826;
        ab.e("MicroMsg.CardDetailDataMgr", "distance:" + ((od)localObject2).qVo);
        break label826;
        ((com.tencent.mm.plugin.card.model.b)localObject1).title = getString(2131297804);
      }
    label1041: Object localObject1 = new com.tencent.mm.plugin.card.model.b();
    ((com.tencent.mm.plugin.card.model.b)localObject1).kcg = 1;
    Object localObject2 = (od)this.kaY.get(0);
    if (!TextUtils.isEmpty(this.kaS.aZV().vUz))
    {
      ((com.tencent.mm.plugin.card.model.b)localObject1).title = this.kaS.aZV().vUz;
      label1226: if ((!this.kaS.aZD()) || (((od)localObject2).qVo >= 2000.0F))
        break label1449;
      if ((this.kaS.aZV().vUa <= 1) && ((this.kaY == null) || (this.kaY.size() <= 1)))
        break label1431;
      ((com.tencent.mm.plugin.card.model.b)localObject1).kbW = this.jiE.getString(2131297921, new Object[] { l.g(this.jiE, ((od)localObject2).qVo) });
    }
    while (true)
    {
      ((com.tencent.mm.plugin.card.model.b)localObject1).kfM = "";
      ((com.tencent.mm.plugin.card.model.b)localObject1).url = "card://jump_shop_list";
      this.kaW.add(localObject1);
      break;
      if ((!this.kaS.aZD()) && (((od)localObject2).qVo < 5000.0F))
      {
        if ((this.kaS.aZV().vUa == 1) || (this.kaY.size() == 1))
        {
          ab.i("MicroMsg.CardDetailDataMgr", "shop_count is 1 or mShopList size is 1");
          break;
        }
        ((com.tencent.mm.plugin.card.model.b)localObject1).title = getString(2131297811);
        break label1226;
      }
      ((com.tencent.mm.plugin.card.model.b)localObject1).title = getString(2131297804);
      break label1226;
      label1431: ((com.tencent.mm.plugin.card.model.b)localObject1).kbW = l.g(this.jiE, ((od)localObject2).qVo);
      continue;
      label1449: ((com.tencent.mm.plugin.card.model.b)localObject1).kbW = "";
    }
  }

  public final boolean bay()
  {
    if (this.kaX == null);
    for (boolean bool = false; ; bool = this.kaX.kcj)
      return bool;
  }

  public final com.tencent.mm.plugin.card.model.b baz()
  {
    AppMethodBeat.i(87677);
    com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
    localb.kcg = 1;
    localb.kci = bax();
    if ((localb.kci) || (TextUtils.isEmpty(this.kaS.aZV().vUj)))
      if (t.mY(this.kaS.aZV().vTT))
      {
        localb.title = getString(2131297924);
        localb.kci = false;
      }
    while (true)
    {
      if (!TextUtils.isEmpty(this.kaS.aZV().vUl))
        localb.kbW = this.kaS.aZV().vUl;
      localb.kfM = "";
      localb.url = "card://jump_service";
      this.kaX = localb;
      localb = this.kaX;
      AppMethodBeat.o(87677);
      return localb;
      localb.title = getString(2131297923);
      if ((this.kaS.aZV().vUq != null) && (this.kaS.aZV().vUq.wkd == 1))
      {
        localb.kcj = true;
      }
      else
      {
        localb.kcj = false;
        continue;
        localb.title = this.kaS.aZV().vUj;
      }
    }
  }

  public final String getTitle()
  {
    AppMethodBeat.i(87678);
    Object localObject = new StringBuilder();
    if (!TextUtils.isEmpty(this.kaS.aZV().kdf))
      ((StringBuilder)localObject).append(this.kaS.aZV().kdf);
    while (true)
    {
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(87678);
      return localObject;
      if (this.kaS.aZD())
        ((StringBuilder)localObject).append(getString(2131297919));
      else if (this.kaS.aZE())
        ((StringBuilder)localObject).append(getString(2131297828));
      else if (this.kaS.aZF())
        ((StringBuilder)localObject).append(getString(2131297809));
      else if (this.kaS.aZG())
        ((StringBuilder)localObject).append(getString(2131297838));
      else if (this.kaS.aZH())
        ((StringBuilder)localObject).append(getString(2131297888));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.f
 * JD-Core Version:    0.6.2
 */