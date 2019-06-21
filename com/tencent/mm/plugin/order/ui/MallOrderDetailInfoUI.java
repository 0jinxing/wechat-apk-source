package com.tencent.mm.plugin.order.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.b;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.plugin.order.model.ProductSectionItem.Skus;
import com.tencent.mm.plugin.order.model.f;
import com.tencent.mm.plugin.order.model.j;
import com.tencent.mm.plugin.order.model.j.a;
import com.tencent.mm.plugin.order.model.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallOrderDetailInfoUI extends WalletBaseUI
  implements x.a
{
  private View.OnClickListener gKK;
  private String kBE;
  private ListView mListView;
  private HashMap<String, View> oZx;
  private List<MallOrderDetailObject.a> pbL;
  protected MallOrderDetailObject pcS;
  String pdC;
  private MallOrderDetailInfoUI.a pdD;
  private View pdE;
  private View pdF;
  private View pdG;
  private View pdH;
  private View pdI;
  private View pdJ;
  private View pdK;
  private boolean pdL;
  private boolean pdM;
  private int pdN;
  private CheckedTextView pdO;
  private CheckedTextView pdP;
  View.OnClickListener pdQ;

  public MallOrderDetailInfoUI()
  {
    AppMethodBeat.i(43809);
    this.pbL = new ArrayList();
    this.pcS = null;
    this.oZx = new HashMap();
    this.pdL = false;
    this.kBE = "";
    this.pdM = false;
    this.pdN = 0;
    this.gKK = new MallOrderDetailInfoUI.1(this);
    this.pdQ = new MallOrderDetailInfoUI.7(this);
    AppMethodBeat.o(43809);
  }

  private static void a(View paramView, MallOrderDetailObject.a parama)
  {
    AppMethodBeat.i(43822);
    if (parama == null)
    {
      AppMethodBeat.o(43822);
      return;
    }
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if ((parama != null) && (parama.kch))
      paramView.setBackgroundResource(2130839563);
    while (true)
    {
      paramView.setLayoutParams(localLayoutParams);
      paramView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
      AppMethodBeat.o(43822);
      break;
      paramView.setBackgroundResource(2130839162);
    }
  }

  private void a(View paramView, ProductSectionItem paramProductSectionItem)
  {
    AppMethodBeat.i(43819);
    if ((paramView == null) || (paramProductSectionItem == null))
      AppMethodBeat.o(43819);
    while (true)
    {
      return;
      paramView.setVisibility(0);
      TextView localTextView = (TextView)paramView.findViewById(2131825845);
      if (localTextView != null)
        localTextView.setText(paramProductSectionItem.name);
      if (!TextUtils.isEmpty(paramProductSectionItem.iconUrl))
        p((ImageView)paramView.findViewById(2131825844), paramProductSectionItem.iconUrl);
      AppMethodBeat.o(43819);
    }
  }

  private void a(MallOrderDetailObject.b paramb)
  {
    AppMethodBeat.i(43815);
    String str;
    if (paramb != null)
    {
      str = paramb.pbR;
      if (TextUtils.isEmpty(paramb.pbS))
        break label342;
      str = str + "：" + paramb.pbS;
    }
    label342: 
    while (true)
    {
      if (!this.pdL)
      {
        this.pdF.setVisibility(8);
        this.pdE.setVisibility(0);
        ((TextView)this.pdE.findViewById(2131825829)).setText(str);
        ((TextView)this.pdE.findViewById(2131825830)).setText(e.kC(this.pcS.pbQ));
        if ((!TextUtils.isEmpty(paramb.thumbUrl)) && (e.ats(paramb.thumbUrl)))
        {
          p((ImageView)this.pdE.findViewById(2131825828), paramb.thumbUrl);
          AppMethodBeat.o(43815);
        }
      }
      while (true)
      {
        return;
        h((ImageView)this.pdE.findViewById(2131825828));
        AppMethodBeat.o(43815);
        continue;
        this.pdE.setVisibility(8);
        this.pdF.setVisibility(0);
        ((TextView)this.pdF.findViewById(2131825829)).setText(str);
        ((TextView)this.pdF.findViewById(2131825830)).setText(e.kC(this.pcS.pbQ));
        if ((!TextUtils.isEmpty(paramb.thumbUrl)) && (e.ats(paramb.thumbUrl)))
        {
          p((ImageView)this.pdF.findViewById(2131825828), paramb.thumbUrl);
          AppMethodBeat.o(43815);
        }
        else
        {
          h((ImageView)this.pdF.findViewById(2131825828));
          AppMethodBeat.o(43815);
          continue;
          this.pdE.setVisibility(8);
          this.pdF.setVisibility(8);
          AppMethodBeat.o(43815);
        }
      }
    }
  }

  private void a(MallTransactionObject paramMallTransactionObject)
  {
    AppMethodBeat.i(43816);
    if (paramMallTransactionObject != null)
    {
      this.pdG.setVisibility(0);
      ((TextView)findViewById(2131825819)).setText(e.e(paramMallTransactionObject.kCJ, paramMallTransactionObject.pcl));
      if ((this.pcS == null) || (this.pcS.pbL == null) || (this.pcS.pbL.size() <= 0))
        break label112;
      paramMallTransactionObject = (MallOrderDetailObject.a)this.pcS.pbL.get(0);
      a(this.pdH, paramMallTransactionObject);
      AppMethodBeat.o(43816);
    }
    while (true)
    {
      return;
      this.pdG.setVisibility(8);
      label112: AppMethodBeat.o(43816);
    }
  }

  private void ard()
  {
    AppMethodBeat.i(43814);
    if (this.pcS == null)
    {
      AppMethodBeat.o(43814);
      return;
    }
    x.a(this);
    this.oZx.clear();
    a(this.pcS.pbJ);
    cv(this.pcS.pbK);
    a(this.pcS.pbI);
    cu(this.pcS.pbL);
    findViewById(2131825821).setVisibility(0);
    if ((this.pcS != null) && (TextUtils.isEmpty(this.pcS.pbP)) && (TextUtils.isEmpty(this.pcS.cBb)))
      findViewById(2131825821).setVisibility(8);
    while (true)
    {
      if ((this.pcS != null) && (!TextUtils.isEmpty(this.pcS.pbO)))
        bcQ();
      AppMethodBeat.o(43814);
      break;
      TextView localTextView;
      if ((this.pcS != null) && (!TextUtils.isEmpty(this.pcS.pbP)) && (TextUtils.isEmpty(this.pcS.cBb)))
      {
        findViewById(2131825824).setVisibility(8);
        findViewById(2131825823).setVisibility(8);
        localTextView = (TextView)findViewById(2131825822);
        localTextView.setVisibility(0);
        localTextView.setGravity(3);
      }
      else if ((this.pcS != null) && (TextUtils.isEmpty(this.pcS.pbP)) && (!TextUtils.isEmpty(this.pcS.cBb)))
      {
        findViewById(2131825822).setVisibility(8);
        findViewById(2131825823).setVisibility(8);
        localTextView = (TextView)findViewById(2131825824);
        localTextView.setVisibility(0);
        localTextView.setGravity(3);
      }
    }
  }

  private void bZc()
  {
    AppMethodBeat.i(43825);
    if ((!this.pdM) && (this.pdN != 0))
    {
      g.RQ();
      g.RO().eJo.a(new f(this.kBE, "", this.pdN), 0);
      this.pdM = true;
    }
    AppMethodBeat.o(43825);
  }

  private void bZd()
  {
    AppMethodBeat.i(43829);
    com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131305049, 0, new MallOrderDetailInfoUI.8(this));
    AppMethodBeat.o(43829);
  }

  private void bcQ()
  {
    AppMethodBeat.i(43821);
    addIconOptionMenu(0, 2130839555, new MallOrderDetailInfoUI.4(this));
    AppMethodBeat.o(43821);
  }

  private void cu(List<MallOrderDetailObject.a> paramList)
  {
    AppMethodBeat.i(43817);
    if (paramList != null)
    {
      this.pbL.addAll(paramList);
      this.pdD.notifyDataSetChanged();
    }
    AppMethodBeat.o(43817);
  }

  private void cv(List<ProductSectionItem> paramList)
  {
    AppMethodBeat.i(43818);
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.pdI.setVisibility(8);
      this.pdJ.setVisibility(8);
      this.pdK.setVisibility(8);
      AppMethodBeat.o(43818);
    }
    while (true)
    {
      return;
      if (paramList.size() == 1)
      {
        this.pdK.setVisibility(8);
        paramList = (ProductSectionItem)paramList.get(0);
        if (!TextUtils.isEmpty(paramList.iconUrl))
        {
          this.pdI.setVisibility(8);
          this.pdJ.setVisibility(0);
          ((TextView)this.pdJ.findViewById(2131825845)).setText(paramList.name);
          ((TextView)this.pdJ.findViewById(2131825853)).setText(paramList.pdz);
          ((TextView)this.pdJ.findViewById(2131825854)).setText("+" + paramList.count);
          ((TextView)this.pdJ.findViewById(2131825852)).setText(ProductSectionItem.Skus.ct(paramList.pdy));
          if (!TextUtils.isEmpty(paramList.iconUrl))
          {
            p((ImageView)this.pdJ.findViewById(2131825844), paramList.iconUrl);
            AppMethodBeat.o(43818);
          }
        }
        else
        {
          this.pdJ.setVisibility(8);
          this.pdI.setVisibility(0);
          ((TextView)this.pdI.findViewById(2131825845)).setText(paramList.name);
          if (TextUtils.isEmpty(paramList.jumpUrl))
          {
            paramList = new Rect();
            paramList.set(this.pdI.findViewById(2131825849).getPaddingLeft(), this.pdI.findViewById(2131825849).getPaddingTop(), this.pdI.findViewById(2131825849).getPaddingRight(), this.pdI.findViewById(2131825849).getPaddingBottom());
            this.pdI.findViewById(2131825849).setBackgroundResource(2130839162);
            this.pdI.findViewById(2131825849).setPadding(paramList.left, paramList.top, paramList.right, paramList.bottom);
            AppMethodBeat.o(43818);
          }
          else
          {
            ((TextView)this.pdI.findViewById(2131825845)).setTextColor(getResources().getColor(2131690265));
            AppMethodBeat.o(43818);
          }
        }
      }
      else
      {
        this.pdI.setVisibility(8);
        this.pdJ.setVisibility(8);
        this.pdK.setVisibility(0);
        if (paramList.size() == 2)
        {
          a(this.pdK.findViewById(2131825843), (ProductSectionItem)paramList.get(0));
          a(this.pdK.findViewById(2131825846), (ProductSectionItem)paramList.get(1));
          this.pdK.findViewById(2131825847).setVisibility(8);
          this.pdK.findViewById(2131825848).setVisibility(8);
          AppMethodBeat.o(43818);
        }
        else if (paramList.size() == 3)
        {
          a(this.pdK.findViewById(2131825843), (ProductSectionItem)paramList.get(0));
          a(this.pdK.findViewById(2131825846), (ProductSectionItem)paramList.get(1));
          a(this.pdK.findViewById(2131825847), (ProductSectionItem)paramList.get(2));
          this.pdK.findViewById(2131825848).setVisibility(8);
          AppMethodBeat.o(43818);
        }
        else
        {
          if (paramList.size() >= 4)
          {
            a(this.pdK.findViewById(2131825843), (ProductSectionItem)paramList.get(0));
            a(this.pdK.findViewById(2131825846), (ProductSectionItem)paramList.get(1));
            a(this.pdK.findViewById(2131825847), (ProductSectionItem)paramList.get(2));
            a(this.pdK.findViewById(2131825848), (ProductSectionItem)paramList.get(3));
          }
          AppMethodBeat.o(43818);
        }
      }
    }
  }

  private void h(ImageView paramImageView)
  {
    AppMethodBeat.i(43824);
    Bitmap localBitmap = com.tencent.mm.compatible.g.a.decodeResource(getResources(), 2131231576);
    if (localBitmap != null)
      paramImageView.setImageBitmap(d.a(localBitmap, false, 96.0F));
    AppMethodBeat.o(43824);
  }

  private void p(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(43820);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)) || (!e.ats(paramString)))
      AppMethodBeat.o(43820);
    while (true)
    {
      return;
      paramImageView.setImageBitmap(x.a(new com.tencent.mm.plugin.order.c.b(paramString)));
      this.oZx.put(paramString, paramImageView);
      AppMethodBeat.o(43820);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(43813);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof com.tencent.mm.plugin.order.model.h))
      {
        paramString = ((com.tencent.mm.plugin.order.model.h)paramm).pcS;
        ab.d("MicroMsg.MallOrderDetailInfoUI", "tempObject:".concat(String.valueOf(paramString)));
        if (paramString != null)
        {
          this.pcS = paramString;
          ard();
        }
      }
      bool = true;
      AppMethodBeat.o(43813);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43813);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(43826);
    bZc();
    super.finish();
    AppMethodBeat.o(43826);
  }

  public final int getLayoutId()
  {
    return 2130970048;
  }

  public final void initView()
  {
    AppMethodBeat.i(43811);
    int i;
    if (this.pdL)
    {
      com.tencent.mm.plugin.order.a.b.bYR();
      j localj = com.tencent.mm.plugin.order.a.b.bYU().Uw(this.kBE);
      if ((localj != null) && (!TextUtils.isEmpty(localj.pdo)) && (com.tencent.mm.plugin.order.c.c.isNumeric(localj.pdo)))
      {
        i = Integer.valueOf(localj.pdo).intValue();
        if (i != 2)
          break label325;
        setMMTitle(2131301333);
      }
    }
    while (true)
    {
      this.pdE = findViewById(2131825812);
      this.pdF = findViewById(2131825813);
      this.pdJ = findViewById(2131825814);
      this.pdK = findViewById(2131825815);
      this.pdI = findViewById(2131825816);
      this.pdG = findViewById(2131825817);
      this.pdH = findViewById(2131825818);
      this.pdE.setOnClickListener(this.gKK);
      this.pdK.setOnClickListener(this.gKK);
      this.pdJ.setOnClickListener(this.gKK);
      this.pdI.setOnClickListener(this.gKK);
      this.pdG.setOnClickListener(this.gKK);
      findViewById(2131825831).setOnClickListener(this.gKK);
      findViewById(2131825822).setOnClickListener(this.gKK);
      findViewById(2131825824).setOnClickListener(this.gKK);
      this.mListView = ((ListView)findViewById(2131825820));
      this.pdD = new MallOrderDetailInfoUI.a(this, (byte)0);
      this.mListView.setAdapter(this.pdD);
      this.pdD.notifyDataSetChanged();
      this.mListView.setOnItemClickListener(new MallOrderDetailInfoUI.6(this));
      ard();
      AppMethodBeat.o(43811);
      return;
      i = -1;
      break;
      label325: if (i == 1)
      {
        setMMTitle(2131301334);
        continue;
        setMMTitle(2131301335);
      }
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(43823);
    paramString = (ImageView)this.oZx.get(paramString);
    if (paramString != null)
      paramString.setImageBitmap(paramBitmap);
    AppMethodBeat.o(43823);
  }

  public void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    AppMethodBeat.i(43810);
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.wallet_core.a.aE(this);
    Object localObject2;
    if ((paramBundle != null) && ((paramBundle instanceof com.tencent.mm.plugin.order.a.a)))
    {
      localObject2 = this.mBundle.getString("key_trans_id");
      this.kBE = ((String)localObject2);
      if (localObject2 == null)
        break label93;
      com.tencent.mm.plugin.order.a.b.bYR();
      if (com.tencent.mm.plugin.order.a.b.bYU().Uv((String)localObject2))
        break label93;
      this.pdL = false;
      a(new com.tencent.mm.plugin.order.model.h((String)localObject2), true, true);
    }
    while (true)
    {
      initView();
      AppMethodBeat.o(43810);
      return;
      label93: com.tencent.mm.plugin.order.a.b.bYR();
      if (com.tencent.mm.plugin.order.a.b.bYU().Uv((String)localObject2))
      {
        this.pdL = true;
        com.tencent.mm.plugin.order.a.b.bYR();
        paramBundle = com.tencent.mm.plugin.order.a.b.bYU();
        if (TextUtils.isEmpty((CharSequence)localObject2))
          paramBundle = (Bundle)localObject1;
        do
        {
          this.pcS = paramBundle;
          if (this.pcS != null)
            break;
          bZd();
          break;
          ab.v("MicroMsg.MallPayMsgManager", "getMallOrderDetailObjectByMsgId msgId:".concat(String.valueOf(localObject2)));
          localObject2 = paramBundle.Uw((String)localObject2);
          paramBundle = (Bundle)localObject1;
        }
        while (localObject2 == null);
        paramBundle = new MallOrderDetailObject();
        localObject1 = new MallOrderDetailObject.b();
        ((MallOrderDetailObject.b)localObject1).pbR = ((j)localObject2).pds;
        if ((!TextUtils.isEmpty(((j)localObject2).pdq)) && (com.tencent.mm.plugin.order.c.c.isNumeric(((j)localObject2).pdq)));
        int i;
        Object localObject3;
        for (((MallOrderDetailObject.b)localObject1).oyB = Integer.valueOf(((j)localObject2).pdq).intValue(); ; ((MallOrderDetailObject.b)localObject1).oyB = ((int)(System.currentTimeMillis() / 1000L)))
        {
          ((MallOrderDetailObject.b)localObject1).thumbUrl = ((j)localObject2).pdr;
          ((MallOrderDetailObject.b)localObject1).mZj = ((j)localObject2).pdt;
          ((MallOrderDetailObject.b)localObject1).pbS = ((j)localObject2).cJh;
          paramBundle.pbJ = ((MallOrderDetailObject.b)localObject1);
          localObject1 = ((j)localObject2).pdw;
          if ((localObject1 == null) || (((List)localObject1).size() <= 0))
            break;
          paramBundle.pbL = new ArrayList();
          for (i = 0; i < ((List)localObject1).size(); i++)
          {
            localObject3 = (j.a)((List)localObject1).get(i);
            localObject4 = new MallOrderDetailObject.a();
            ((MallOrderDetailObject.a)localObject4).name = ((j.a)localObject3).name;
            ((MallOrderDetailObject.a)localObject4).value = "";
            ((MallOrderDetailObject.a)localObject4).jumpUrl = ((j.a)localObject3).jumpUrl;
            ((MallOrderDetailObject.a)localObject4).kch = false;
            paramBundle.pbL.add(localObject4);
          }
        }
        Object localObject4 = ((j)localObject2).pdx;
        if ((localObject4 != null) && (((List)localObject4).size() > 0))
        {
          if (paramBundle.pbL == null)
            paramBundle.pbL = new ArrayList();
          for (i = 0; i < ((List)localObject4).size(); i++)
          {
            localObject3 = (j.b)((List)localObject4).get(i);
            localObject1 = new MallOrderDetailObject.a();
            ((MallOrderDetailObject.a)localObject1).name = ((j.b)localObject3).name;
            ((MallOrderDetailObject.a)localObject1).value = ((j.b)localObject3).value;
            ((MallOrderDetailObject.a)localObject1).jumpUrl = ((j.b)localObject3).jumpUrl;
            ((MallOrderDetailObject.a)localObject1).kch = false;
            if (i == 0)
              ((MallOrderDetailObject.a)localObject1).kch = true;
            paramBundle.pbL.add(localObject1);
          }
        }
        paramBundle.pbP = ((j)localObject2).pdv;
        paramBundle.cBb = ((j)localObject2).pdu;
        if ((!TextUtils.isEmpty(((j)localObject2).pdq)) && (com.tencent.mm.plugin.order.c.c.isNumeric(((j)localObject2).pdq)));
        for (paramBundle.pbQ = Integer.valueOf(((j)localObject2).pdq).intValue(); ; paramBundle.pbQ = ((int)(System.currentTimeMillis() / 1000L)))
          break;
      }
      ab.w("MicroMsg.MallOrderDetailInfoUI", "mOrders info is Illegal!");
      bZd();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43827);
    bZc();
    super.onDestroy();
    AppMethodBeat.o(43827);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43812);
    boolean bool;
    if (paramInt == 4)
    {
      if ((com.tencent.mm.wallet_core.a.aE(this) instanceof com.tencent.mm.plugin.order.a.a))
        com.tencent.mm.wallet_core.a.aB(this);
      bool = true;
      AppMethodBeat.o(43812);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(43812);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(43828);
    finish();
    AppMethodBeat.o(43828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI
 * JD-Core Version:    0.6.2
 */