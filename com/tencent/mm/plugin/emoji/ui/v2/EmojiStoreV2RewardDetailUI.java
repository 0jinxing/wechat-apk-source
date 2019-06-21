package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardResponse;
import com.tencent.mm.protocal.protobuf.aim;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMLoadScrollView.a;

public class EmojiStoreV2RewardDetailUI extends MMActivity
  implements AbsListView.OnScrollListener, f
{
  private View abB;
  private boolean isLoading;
  private String kWA;
  private String kWl;
  private int kYc;
  private GetEmotionRewardResponse laG;
  private String ldU;
  private String ldV;
  private ImageView ldW;
  private TextView ldX;
  private TextView ldY;
  private TextView ldZ;
  private ak lda;
  private View lea;
  private View leb;
  private EmojiStoreV2RewardDetailUI.a lec;
  private aim led;
  private byte[] lee;
  private com.tencent.mm.plugin.emoji.f.m lef;
  private MMLoadScrollView.a leg;
  private ListView mListView;

  public EmojiStoreV2RewardDetailUI()
  {
    AppMethodBeat.i(53678);
    this.isLoading = false;
    this.kYc = -1;
    this.lda = new EmojiStoreV2RewardDetailUI.1(this);
    this.leg = new EmojiStoreV2RewardDetailUI.2(this);
    AppMethodBeat.o(53678);
  }

  private void bmg()
  {
    AppMethodBeat.i(53683);
    this.lef = new com.tencent.mm.plugin.emoji.f.m(this.kWl, this.lee);
    com.tencent.mm.kernel.g.RO().eJo.a(this.lef, 0);
    AppMethodBeat.o(53683);
  }

  private void gx(boolean paramBoolean)
  {
    AppMethodBeat.i(53684);
    if ((!this.isLoading) && (this.kYc != 0))
    {
      bmg();
      this.isLoading = true;
      if (paramBoolean)
        this.lda.sendEmptyMessageDelayed(1002, 200L);
    }
    AppMethodBeat.o(53684);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969372;
  }

  public final void initView()
  {
    AppMethodBeat.i(53682);
    setMMTitle(2131299139);
    setBackBtn(new EmojiStoreV2RewardDetailUI.3(this));
    this.abB = v.hu(this.mController.ylL).inflate(2130969373, null);
    this.ldW = ((ImageView)this.abB.findViewById(2131823538));
    this.ldX = ((TextView)this.abB.findViewById(2131823571));
    this.ldY = ((TextView)this.abB.findViewById(2131823543));
    this.ldZ = ((TextView)this.abB.findViewById(2131823572));
    this.lea = findViewById(2131820987);
    this.mListView = ((ListView)findViewById(2131823569));
    this.leb = v.hu(this.mController.ylL).inflate(2130969354, null);
    this.leb.setVisibility(8);
    this.mListView.addHeaderView(this.abB);
    this.mListView.addFooterView(this.leb);
    this.lec = new EmojiStoreV2RewardDetailUI.a(this, this);
    this.mListView.setAdapter(this.lec);
    this.mListView.setOnScrollListener(this);
    AppMethodBeat.o(53682);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53679);
    super.onCreate(paramBundle);
    this.kWl = getIntent().getStringExtra("extra_id");
    this.kWA = getIntent().getStringExtra("extra_name");
    this.ldU = getIntent().getStringExtra("extra_iconurl");
    this.ldV = getIntent().getStringExtra("name");
    initView();
    this.laG = j.getEmojiStorageMgr().xYs.aqq(this.kWl);
    bmg();
    o.ahp().a(this.ldU, this.ldW, com.tencent.mm.plugin.emoji.e.g.dH(this.kWl, this.ldU));
    this.ldX.setText(this.kWA);
    this.ldY.setText(this.ldV);
    if (this.led != null)
    {
      this.lec.Q(this.led.Donors);
      this.lec.lej = true;
    }
    if (this.laG != null)
      this.ldZ.setText(getString(2131299140, new Object[] { Integer.valueOf(this.laG.DonorNum) }));
    com.tencent.mm.kernel.g.RO().eJo.a(299, this);
    AppMethodBeat.o(53679);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53681);
    super.onDestroy();
    com.tencent.mm.kernel.g.RO().eJo.b(299, this);
    o.ahp().cm(0);
    AppMethodBeat.o(53681);
  }

  public void onPause()
  {
    AppMethodBeat.i(53680);
    super.onPause();
    AppMethodBeat.o(53680);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    int i = 1;
    AppMethodBeat.i(53685);
    this.isLoading = false;
    if (this.leb != null)
    {
      this.leb.setVisibility(8);
      this.lda.removeMessages(1002);
      this.lda.sendEmptyMessageDelayed(1001, 200L);
    }
    switch (paramm.getType())
    {
    default:
    case 299:
    }
    while (true)
    {
      AppMethodBeat.o(53685);
      while (true)
      {
        return;
        paramString = (com.tencent.mm.plugin.emoji.f.m)paramm;
        if ((paramInt1 != 0) && (paramInt1 != 4))
          break label341;
        this.lee = paramString.kWS;
        if (paramInt2 == 0)
        {
          this.kYc = 0;
          if (paramString.bkA() == null)
            break;
          this.lec.Q(paramString.bkA().Donors);
          AppMethodBeat.o(53685);
          continue;
        }
        if (paramInt2 == 2)
        {
          this.kYc = 2;
          if (paramString.bkA() != null)
            this.lec.Q(paramString.bkA().Donors);
          paramInt1 = i;
          if (this.lec != null)
          {
            paramInt1 = i;
            if (this.abB != null)
            {
              paramString = this.lec;
              paramInt1 = paramString.lcR;
              int j = paramString.iWJ + paramInt1;
              int k = this.abB.getHeight();
              paramInt2 = com.tencent.mm.bz.a.ge(this);
              ab.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "item:%d header:%d window:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt2) });
              paramInt1 = i;
              if (paramInt2 > j * this.lec.getCount() + k)
                paramInt1 = 0;
            }
          }
          if (paramInt1 != 0)
            break;
          gx(false);
          AppMethodBeat.o(53685);
          continue;
        }
        if (paramInt2 != 3)
          break;
        this.kYc = 1;
        this.lee = null;
        this.lec.lej = true;
        gx(false);
        AppMethodBeat.o(53685);
      }
      label341: ab.w("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "unknow errType:%d", new Object[] { Integer.valueOf(paramInt1) });
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(53686);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
      if ((this.kYc == 0) || (this.isLoading))
      {
        ab.d("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "No More List.");
        AppMethodBeat.o(53686);
      }
    while (true)
    {
      return;
      gx(true);
      ab.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "[onScrollStateChanged] loadMoreData.");
      o.ahp().cm(paramInt);
      AppMethodBeat.o(53686);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI
 * JD-Core Version:    0.6.2
 */