package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.d.i;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.f;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.bvw;
import com.tencent.mm.protocal.protobuf.bvx;
import com.tencent.mm.protocal.protobuf.oc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class CardIndexUI extends CardBaseUI
{
  private final String TAG = "MicroMsg.CardIndexUI";
  int fromScene = 0;
  private View klR;
  private TextView klS;
  private f klT;
  private TextView klU;
  private TextView klV;
  private ImageView klW;
  private LinearLayout klX;
  int klY = -1;
  private long mStartTime = 0L;

  private void bdi()
  {
    AppMethodBeat.i(88527);
    if ((this.kap.getChildCount() == 0) && (this.kan.getCount() == 0))
    {
      ab.i("MicroMsg.CardIndexUI", "show empty view");
      this.kao.setVisibility(0);
      this.kam.setVisibility(8);
      AppMethodBeat.o(88527);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardIndexUI", "hide empty view");
      this.kao.setVisibility(8);
      this.kam.setVisibility(0);
      AppMethodBeat.o(88527);
    }
  }

  private void bg(List<bvw> paramList)
  {
    AppMethodBeat.i(88528);
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        bvw localbvw = (bvw)paramList.next();
        if (localbvw.vTs == 1)
        {
          ab.i("MicroMsg.CardIndexUI", "should update new invoice");
          bh(localbvw.wWF);
        }
      }
    }
    bdi();
    AppMethodBeat.o(88528);
  }

  private void bh(List<oc> paramList)
  {
    AppMethodBeat.i(88529);
    this.kap.removeAllViews();
    this.kap.setPadding(0, 0, 0, 0);
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      Iterator localIterator = paramList.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        oc localoc = (oc)localIterator.next();
        paramList = View.inflate(this.mController.ylL, 2130968946, null);
        CdnImageView localCdnImageView = (CdnImageView)paramList.findViewById(2131822202);
        Object localObject = (TextView)paramList.findViewById(2131822203);
        TextView localTextView = (TextView)paramList.findViewById(2131822204);
        localCdnImageView.setUrl(localoc.vTF);
        ((TextView)localObject).setText(localoc.vTE);
        localTextView.setText(localoc.vTG);
        if (localoc.vTH > 0)
          paramList.setOnClickListener(new CardIndexUI.2(this, localoc));
        this.kap.addView(paramList);
        if (i == 0)
          this.kap.setPadding(0, com.tencent.mm.bz.a.fromDPToPix(this, 13), 0, 0);
        while (true)
        {
          i++;
          break;
          localObject = (LinearLayout.LayoutParams)paramList.getLayoutParams();
          if (localObject != null)
          {
            ((LinearLayout.LayoutParams)localObject).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 6);
            paramList.setLayoutParams((ViewGroup.LayoutParams)localObject);
          }
        }
      }
    }
    AppMethodBeat.o(88529);
  }

  public final BaseAdapter Kw()
  {
    AppMethodBeat.i(88533);
    Object localObject;
    if (3 == this.klY)
    {
      localObject = new k(this, aZq());
      AppMethodBeat.o(88533);
    }
    while (true)
    {
      return localObject;
      localObject = new c(this, aZq());
      AppMethodBeat.o(88533);
    }
  }

  public final void aZp()
  {
    AppMethodBeat.i(88526);
    Object localObject;
    if (1 == this.klY)
    {
      setMMTitle(2131297918);
      this.klU = ((TextView)findViewById(2131821927));
      this.klV = ((TextView)findViewById(2131822189));
      this.klW = ((ImageView)findViewById(2131822187));
      this.klR = findViewById(2131822190);
      this.klS = ((TextView)findViewById(2131822192));
      this.klX = ((LinearLayout)findViewById(2131822188));
      this.klR.setVisibility(8);
      this.klV.setVisibility(0);
      this.klU.setVisibility(0);
      this.klW.setVisibility(8);
      localObject = (LinearLayout.LayoutParams)this.klX.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = BackwardSupportUtil.b.b(this, 100.0F);
      this.klX.setLayoutParams((ViewGroup.LayoutParams)localObject);
      if (1 != this.klY)
        break label365;
      this.klV.setText(getString(2131297906));
      this.klU.setText(getString(2131297905));
      label199: if (this.klY == 3)
      {
        this.kam.setEmptyView(null);
        this.kao.setVisibility(8);
      }
      this.klS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(88521);
          if (!TextUtils.isEmpty(CardIndexUI.a(CardIndexUI.this).kdl))
            com.tencent.mm.plugin.card.d.b.a(CardIndexUI.this, CardIndexUI.a(CardIndexUI.this).kdl, 0);
          AppMethodBeat.o(88521);
        }
      });
      if ((this.klY != 3) || (!((Boolean)g.RP().Ry().get(ac.a.xKF, Boolean.FALSE)).booleanValue()))
        break label449;
      ab.i("MicroMsg.CardIndexUI", "has load new entrance");
      localObject = (String)g.RP().Ry().get(ac.a.xKD, null);
      if (bo.isNullOrNil((String)localObject))
        break label449;
    }
    while (true)
    {
      try
      {
        bvx localbvx = new com/tencent/mm/protocal/protobuf/bvx;
        localbvx.<init>();
        localbvx.parseFrom(((String)localObject).getBytes("ISO-8859-1"));
        bg(localbvx.wWG);
        AppMethodBeat.o(88526);
        return;
        if (3 == this.klY)
        {
          setMMTitle(2131298010);
          break;
        }
        setMMTitle(2131297928);
        break;
        label365: if (3 == this.klY)
        {
          this.klV.setText(getString(2131297912));
          this.klU.setText(getString(2131297911));
          break label199;
        }
        this.klV.setText(getString(2131297949));
        this.klU.setText(getString(2131297964));
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.CardIndexUI", localIOException, "", new Object[0]);
      }
      label449: AppMethodBeat.o(88526);
    }
  }

  public final n.a aZq()
  {
    AppMethodBeat.i(88532);
    n.a locala;
    if (1 == this.klY)
    {
      locala = n.a.kdO;
      AppMethodBeat.o(88532);
    }
    while (true)
    {
      return locala;
      if (3 == this.klY)
      {
        if (((Boolean)g.RP().Ry().get(ac.a.xKF, Boolean.FALSE)).booleanValue())
        {
          locala = n.a.kdQ;
          AppMethodBeat.o(88532);
        }
        else
        {
          locala = n.a.kdN;
          AppMethodBeat.o(88532);
        }
      }
      else
      {
        locala = n.a.kdK;
        AppMethodBeat.o(88532);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(88525);
    if (getIntent() != null)
      this.klY = getIntent().getIntExtra("key_card_type", -1);
    super.initView();
    AppMethodBeat.o(88525);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(88535);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(88535);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88523);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.CardIndexUI", "oncreate");
    this.mStartTime = System.currentTimeMillis();
    initView();
    g.RO().eJo.a(984, this);
    am.baV();
    com.tencent.mm.plugin.card.b.b.sO(1);
    int i = am.bba().kbN;
    if ((com.tencent.mm.x.c.PK().bX(262152, 266256)) || (i > 0))
    {
      h.pYm.e(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
      AppMethodBeat.o(88523);
    }
    while (true)
    {
      return;
      h.pYm.e(11324, new Object[] { "CardPackageListView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.fromScene), "", Integer.valueOf(0), "" });
      AppMethodBeat.o(88523);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88524);
    g.RO().eJo.b(984, this);
    long l1 = System.currentTimeMillis();
    long l2 = this.mStartTime;
    h.pYm.e(13219, new Object[] { "CardPackageListView", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
    AppMethodBeat.o(88524);
  }

  public void onResume()
  {
    AppMethodBeat.i(88530);
    super.onResume();
    AppMethodBeat.o(88530);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(88534);
    super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof x))
      {
        this.klT = i.Hl((String)g.RP().Ry().get(282885, ""));
        if (this.klT == null)
          this.klT = new f();
        if ((this.klT != null) && (!TextUtils.isEmpty(this.klT.kdj)))
          this.klU.setText(this.klT.kdj);
        if ((this.klT == null) || (!this.klT.kdm))
        {
          this.klR.setVisibility(8);
          AppMethodBeat.o(88534);
        }
      }
    while (true)
    {
      return;
      this.klS.setText(this.klT.kdk);
      if ((!TextUtils.isEmpty(this.klT.kdk)) && (!TextUtils.isEmpty(this.klT.kdl)))
      {
        this.klR.setVisibility(0);
        AppMethodBeat.o(88534);
      }
      else
      {
        this.klR.setVisibility(8);
        AppMethodBeat.o(88534);
        continue;
        if ((paramm instanceof ad))
        {
          paramString = (ad)paramm;
          if ((paramString.kei) && ((this.kan instanceof c)))
          {
            ((c)this.kan).pN(false);
            ((c)this.kan).pN(true);
            ((c)this.kan).KC();
          }
          if ((((Boolean)g.RP().Ry().get(ac.a.xKF, Boolean.FALSE)).booleanValue()) && (paramString.kek != null))
          {
            bg(paramString.kek.wWG);
            if ((this.kan instanceof c))
            {
              ((c)this.kan).pN(false);
              ((c)this.kan).pN(true);
              ((c)this.kan).KC();
            }
          }
        }
        AppMethodBeat.o(88534);
      }
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(88531);
    super.onStop();
    AppMethodBeat.o(88531);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardIndexUI
 * JD-Core Version:    0.6.2
 */