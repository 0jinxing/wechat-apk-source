package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.k;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.oj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public class CardViewUI extends CardBaseUI
{
  private int auo;
  private int emC;
  private String fhu;
  private LinkedList<oj> kip;
  private int kjL;
  private String knY;
  private View knZ;

  public CardViewUI()
  {
    AppMethodBeat.i(88671);
    this.auo = 1;
    this.kip = new LinkedList();
    this.fhu = "";
    AppMethodBeat.o(88671);
  }

  public final BaseAdapter Kw()
  {
    AppMethodBeat.i(88676);
    Object localObject;
    if (this.auo == 0)
    {
      localObject = new g(getApplicationContext());
      AppMethodBeat.o(88676);
    }
    while (true)
    {
      return localObject;
      localObject = super.Kw();
      AppMethodBeat.o(88676);
    }
  }

  public final void a(com.tencent.mm.plugin.card.base.b paramb, int paramInt)
  {
    AppMethodBeat.i(88680);
    if (this.auo == 0)
    {
      am.bbb().kau = ((CardInfo)paramb);
      Intent localIntent = new Intent(this, CardDetailUI.class);
      localIntent.putExtra("key_card_id", ((CardInfo)paramb).field_card_id);
      localIntent.putExtra("key_from_scene", 51);
      localIntent.putExtra("key_from_appbrand_type", this.kjL);
      startActivity(localIntent);
      AppMethodBeat.o(88680);
    }
    while (true)
    {
      return;
      super.a(paramb, paramInt);
      AppMethodBeat.o(88680);
    }
  }

  public final void a(CardInfo paramCardInfo)
  {
    AppMethodBeat.i(88679);
    if (this.auo == 1)
    {
      this.kau = paramCardInfo;
      l(this.knY, 1, true);
      AppMethodBeat.o(88679);
    }
    while (true)
    {
      return;
      super.a(paramCardInfo);
      if (this.kau != null)
        h.pYm.e(11582, new Object[] { "OperGift", Integer.valueOf(4), Integer.valueOf(this.kau.aZV().iAd), this.kau.field_card_tp_id, this.kau.field_card_id, this.knY });
      AppMethodBeat.o(88679);
    }
  }

  public final void aZp()
  {
    AppMethodBeat.i(88675);
    int i;
    if (this.auo == 0)
    {
      setMMTitle(2131298015);
      com.tencent.mm.kernel.g.RO().eJo.a(699, this);
      if (this.auo != 0)
        break label156;
      fE(true);
      Object localObject = new cdc();
      ((cdc)localObject).xcM = this.fhu;
      ab.i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.fhu });
      localObject = new t(this.kip, (cdc)localObject, this.emC);
      com.tencent.mm.kernel.g.RO().eJo.a((m)localObject, 0);
      i = 2131297790;
    }
    while (true)
    {
      findViewById(2131822187).setVisibility(8);
      ((TextView)findViewById(2131821927)).setText(i);
      AppMethodBeat.o(88675);
      return;
      if (this.auo != 1)
        break;
      setMMTitle(2131297875);
      break;
      label156: if (this.auo == 1)
      {
        this.knZ = View.inflate(this, 2130968950, null);
        if (this.kap != null)
          this.kap.addView(this.knZ);
        i = 2131297989;
      }
      else
      {
        i = 2131297790;
      }
    }
  }

  public final n.a aZq()
  {
    return n.a.kdM;
  }

  public final boolean aZs()
  {
    AppMethodBeat.i(88677);
    boolean bool;
    if (this.auo == 1)
    {
      bool = false;
      AppMethodBeat.o(88677);
    }
    while (true)
    {
      return bool;
      bool = super.aZs();
      AppMethodBeat.o(88677);
    }
  }

  public final void b(com.tencent.mm.plugin.card.base.b paramb, int paramInt)
  {
    AppMethodBeat.i(88678);
    if (this.auo == 1)
    {
      a((CardInfo)paramb);
      AppMethodBeat.o(88678);
    }
    while (true)
    {
      return;
      super.b(paramb, paramInt);
      AppMethodBeat.o(88678);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88672);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      ab.e("MicroMsg.CardViewUI", "onCreate intent is null");
      finish();
      AppMethodBeat.o(88672);
    }
    while (true)
    {
      return;
      this.emC = paramBundle.getIntExtra("key_previous_scene", 7);
      this.kjL = paramBundle.getIntExtra("key_from_appbrand_type", 0);
      this.auo = paramBundle.getIntExtra("view_type", 0);
      this.knY = paramBundle.getStringExtra("user_name");
      paramBundle = paramBundle.getStringExtra("card_list");
      this.fhu = getIntent().getStringExtra("key_template_id");
      if (this.auo == 0)
      {
        if (TextUtils.isEmpty(paramBundle))
        {
          ab.e("MicroMsg.CardViewUI", "oncreate card_list is empty");
          finish();
          AppMethodBeat.o(88672);
        }
        else
        {
          paramBundle = k.bR(paramBundle, this.emC);
          if ((paramBundle != null) && (paramBundle.size() > 0))
          {
            this.kip.clear();
            this.kip.addAll(paramBundle);
          }
        }
      }
      else
      {
        initView();
        AppMethodBeat.o(88672);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88673);
    com.tencent.mm.kernel.g.RO().eJo.b(699, this);
    super.onDestroy();
    AppMethodBeat.o(88673);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    AppMethodBeat.i(88681);
    if ((paramm instanceof t))
    {
      fE(false);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = ((t)paramm).kdZ;
        if ((paramm != null) && (paramm.size() > 0))
        {
          if ((this.kan instanceof g))
          {
            paramString = (g)this.kan;
            if (paramm != null)
            {
              paramString.khh.clear();
              paramString.khh.addAll(paramm);
              paramString.kmd.clear();
              for (paramInt1 = i; paramInt1 < paramm.size(); paramInt1++)
                paramString.kmd.add(Boolean.TRUE);
            }
          }
          this.kan.notifyDataSetChanged();
        }
        AppMethodBeat.o(88681);
      }
    }
    while (true)
    {
      return;
      d.b(this, paramString, paramInt2);
      AppMethodBeat.o(88681);
      continue;
      super.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(88681);
    }
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(88674);
    super.onSwipeBack();
    if (this.emC == 26)
      overridePendingTransition(0, 0);
    AppMethodBeat.o(88674);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardViewUI
 * JD-Core Version:    0.6.2
 */