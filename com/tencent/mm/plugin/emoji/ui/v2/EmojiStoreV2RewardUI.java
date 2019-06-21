package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.ui.GridInScrollView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.EmotionPrice;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardResponse;
import com.tencent.mm.protocal.protobuf.ft;
import com.tencent.mm.protocal.protobuf.yi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.l;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.e;

public class EmojiStoreV2RewardUI extends MMActivity
  implements AdapterView.OnItemClickListener, f
{
  private ProgressDialog gqo;
  private int kVD;
  private String kVJ;
  private String kWl;
  private GetEmotionRewardResponse laG;
  private Button lbf;
  private EmojiStoreV2RewardUI.b leA;
  private com.tencent.mm.plugin.emoji.f.b leB;
  private String leC;
  private String leD;
  private EmojiStoreV2RewardUI.a leE;
  private boolean leF;
  private View.OnClickListener leG;
  private View.OnClickListener leH;
  private TextWatcher leI;
  private com.tencent.mm.plugin.emoji.model.h leJ;
  private AnimationDrawable lep;
  private int les;
  private EmojiStoreV2RewardBannerView let;
  private GridInScrollView leu;
  private View lev;
  private View lew;
  private MMFormInputView lex;
  private TextView ley;
  private TextView lez;
  private ak mHandler;

  public EmojiStoreV2RewardUI()
  {
    AppMethodBeat.i(53712);
    this.leE = EmojiStoreV2RewardUI.a.leL;
    this.leF = false;
    this.mHandler = new EmojiStoreV2RewardUI.1(this);
    this.leG = new EmojiStoreV2RewardUI.2(this);
    this.leH = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(53697);
        if (EmojiStoreV2RewardUI.g(EmojiStoreV2RewardUI.this) == EmojiStoreV2RewardUI.a.leL)
          EmojiStoreV2RewardUI.a(EmojiStoreV2RewardUI.this, EmojiStoreV2RewardUI.a.leM);
        AppMethodBeat.o(53697);
      }
    };
    this.leI = new EmojiStoreV2RewardUI.4(this);
    this.leJ = new com.tencent.mm.plugin.emoji.model.h(new EmojiStoreV2RewardUI.5(this));
    AppMethodBeat.o(53712);
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(53724);
    com.tencent.mm.ui.base.h.a(this.mController.ylL, paramString, null, getString(2131299088), new EmojiStoreV2RewardUI.9(this));
    AppMethodBeat.o(53724);
  }

  private void a(EmojiStoreV2RewardUI.a parama)
  {
    AppMethodBeat.i(53716);
    if (parama == EmojiStoreV2RewardUI.a.leM)
    {
      this.leE = EmojiStoreV2RewardUI.a.leM;
      if (this.lew == null)
        break label106;
      this.lew.setVisibility(0);
      this.lew.startAnimation(AnimationUtils.loadAnimation(this.mController.ylL, 2131034216));
      this.lex.getContentEditText().requestFocus();
      showVKB();
      this.lev.setVisibility(8);
      AppMethodBeat.o(53716);
    }
    while (true)
    {
      return;
      aqX();
      this.mHandler.postDelayed(new EmojiStoreV2RewardUI.6(this), 300L);
      label106: AppMethodBeat.o(53716);
    }
  }

  private void a(String paramString, EmotionPrice paramEmotionPrice)
  {
    AppMethodBeat.i(53722);
    aoW();
    this.leB = new com.tencent.mm.plugin.emoji.f.b(paramString, paramEmotionPrice);
    com.tencent.mm.kernel.g.RO().eJo.a(this.leB, 0);
    AppMethodBeat.o(53722);
  }

  private void aoW()
  {
    AppMethodBeat.i(53723);
    getString(2131297061);
    this.gqo = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new EmojiStoreV2RewardUI.8(this));
    AppMethodBeat.o(53723);
  }

  private void cu()
  {
    AppMethodBeat.i(53718);
    if (this.laG != null)
    {
      this.ley.setVisibility(0);
      this.lez.setVisibility(0);
      if ((this.laG.Reward != null) && (!bo.isNullOrNil(this.laG.Reward.web)))
      {
        this.leC = this.laG.Reward.web;
        this.leD = EmojiLogic.K(com.tencent.mm.plugin.emoji.h.b.Yb(), this.kWl, this.leC);
        if (e.ct(this.leD))
        {
          this.let.setImageFilePath(this.leD);
          this.let.setScaleType(ImageView.ScaleType.FIT_XY);
          if ((this.lep != null) && (this.lep.isRunning()))
            this.lep.stop();
          if ((this.laG == null) || (this.laG.Price == null))
            break label338;
          this.leu.setVisibility(0);
          this.leA.Q(this.laG.Price);
          AppMethodBeat.o(53718);
        }
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.at.o.ahp().a(this.leC, this.let, com.tencent.mm.plugin.emoji.e.g.k(this.kWl, this.leC, new Object[0]), this.leJ);
      this.let.setBackgroundDrawable(getResources().getDrawable(2130840850));
      this.let.setImageDrawable(this.lep);
      this.let.setScaleType(ImageView.ScaleType.CENTER);
      this.lep.start();
      break;
      this.let.setBackgroundDrawable(getResources().getDrawable(2130840850));
      this.let.setImageDrawable(this.lep);
      this.let.setScaleType(ImageView.ScaleType.CENTER);
      this.lep.start();
      break;
      this.ley.setVisibility(8);
      this.lez.setVisibility(8);
      break;
      label338: this.leu.setVisibility(8);
      AppMethodBeat.o(53718);
    }
  }

  private void gy(boolean paramBoolean)
  {
    AppMethodBeat.i(53725);
    ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "doGetRewardScene");
    com.tencent.mm.plugin.emoji.f.o localo;
    if (paramBoolean)
    {
      localo = new com.tencent.mm.plugin.emoji.f.o(this.kWl, com.tencent.mm.plugin.emoji.f.o.kWX);
      com.tencent.mm.kernel.g.RO().eJo.a(localo, 0);
      AppMethodBeat.o(53725);
    }
    while (true)
    {
      return;
      localo = new com.tencent.mm.plugin.emoji.f.o(this.kWl, com.tencent.mm.plugin.emoji.f.o.kWY);
      com.tencent.mm.kernel.g.RO().eJo.a(localo, 0);
      aoW();
      AppMethodBeat.o(53725);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969377;
  }

  public final void initView()
  {
    AppMethodBeat.i(53717);
    if (bo.isNullOrNil(this.kVJ))
      setMMTitle(2131299136);
    while (true)
    {
      setMMSubTitle(2131305624);
      setBackBtn(new EmojiStoreV2RewardUI.7(this));
      this.lev = findViewById(2131823579);
      this.lew = findViewById(2131823583);
      this.lex = ((MMFormInputView)findViewById(2131823584));
      this.lbf = ((Button)findViewById(2131823585));
      this.lbf.setOnClickListener(this.leG);
      this.lbf.setEnabled(false);
      this.lex.setInputType(8194);
      this.lex.addTextChangedListener(this.leI);
      this.lex.getContentEditText().setFilters(new InputFilter[] { new InputFilter.LengthFilter(12) });
      this.ley = ((TextView)findViewById(2131823582));
      this.ley.setOnClickListener(this.leH);
      this.lez = ((TextView)findViewById(2131823581));
      this.let = ((EmojiStoreV2RewardBannerView)findViewById(2131823580));
      this.leu = ((GridInScrollView)findViewById(16908298));
      this.leA = new EmojiStoreV2RewardUI.b(this);
      this.leu.setAdapter(this.leA);
      this.leu.setOnItemClickListener(this);
      this.lep = ((AnimationDrawable)getResources().getDrawable(2130838556));
      AppMethodBeat.o(53717);
      return;
      setMMTitle(getString(2131299155, new Object[] { this.kVJ }));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53720);
    switch (paramInt1)
    {
    default:
    case 8001:
    }
    while (true)
    {
      AppMethodBeat.o(53720);
      while (true)
      {
        return;
        if (paramInt2 == -1)
        {
          paramIntent = new Intent();
          paramIntent.setClass(this, EmojiStoreV2RewardThanksUI.class);
          paramIntent.putExtra("extra_id", this.kWl);
          startActivity(paramIntent);
          com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { this.kWl, Integer.valueOf(this.les), Integer.valueOf(this.kVD), Integer.valueOf(1) });
          com.tencent.mm.plugin.report.service.h.pYm.a(408L, 9L, 1L, false);
          gy(true);
          finish();
          AppMethodBeat.o(53720);
        }
        else
        {
          if (paramInt2 != 0)
            break;
          com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { this.kWl, Integer.valueOf(this.les), Integer.valueOf(this.kVD), Integer.valueOf(3) });
          com.tencent.mm.plugin.report.service.h.pYm.a(408L, 3L, 1L, false);
          AppMethodBeat.o(53720);
        }
      }
      if (!this.leF)
      {
        this.leF = true;
        com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { this.kWl, Integer.valueOf(this.les), Integer.valueOf(this.kVD), Integer.valueOf(2) });
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(408L, 4L, 1L, false);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(53715);
    ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", this.mController.ymc);
    if (this.leE == EmojiStoreV2RewardUI.a.leL)
      if (this.leF)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(408L, 2L, 1L, false);
        super.onBackPressed();
        AppMethodBeat.o(53715);
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(408L, 1L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { this.kWl, Integer.valueOf(this.les), Integer.valueOf(this.kVD), Integer.valueOf(4) });
      break;
      a(EmojiStoreV2RewardUI.a.leL);
      AppMethodBeat.o(53715);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53713);
    super.onCreate(paramBundle);
    this.kWl = getIntent().getStringExtra("extra_id");
    this.kVJ = getIntent().getStringExtra("name");
    this.kVD = getIntent().getIntExtra("scene", 0);
    this.les = getIntent().getIntExtra("pageType", 0);
    initView();
    this.laG = j.getEmojiStorageMgr().xYs.aqq(this.kWl);
    if ((this.laG != null) && (this.laG.Reward != null))
    {
      com.tencent.mm.at.o.ahp().a(this.laG.Reward.wec, null, com.tencent.mm.plugin.emoji.e.g.k(this.kWl, this.laG.Reward.wec, new Object[0]));
      com.tencent.mm.at.o.ahp().a(this.laG.Reward.wed, null, com.tencent.mm.plugin.emoji.e.g.k(this.kWl, this.laG.Reward.wed, new Object[0]));
    }
    while (true)
    {
      cu();
      com.tencent.mm.kernel.g.RO().eJo.a(830, this);
      com.tencent.mm.kernel.g.RO().eJo.a(822, this);
      com.tencent.mm.plugin.report.service.h.pYm.a(408L, 0L, 1L, false);
      AppMethodBeat.o(53713);
      return;
      gy(false);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53714);
    com.tencent.mm.kernel.g.RO().eJo.b(830, this);
    com.tencent.mm.kernel.g.RO().eJo.b(822, this);
    if ((this.lep != null) && (this.lep.isRunning()))
      this.lep.stop();
    com.tencent.mm.at.o.ahp().b(null, this.let);
    this.leJ.kVz = null;
    this.leJ = null;
    super.onDestroy();
    AppMethodBeat.o(53714);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(53719);
    if (this.leA != null)
    {
      paramAdapterView = this.leA.uk(paramInt);
      if (paramAdapterView != null)
      {
        ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "onItemClick position:%d", new Object[] { Integer.valueOf(paramInt) });
        a(this.kWl, paramAdapterView);
      }
    }
    AppMethodBeat.o(53719);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53721);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    int i = paramm.getType();
    switch (i)
    {
    default:
      ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "unknown scene. type:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(53721);
    case 830:
    case 822:
    }
    while (true)
    {
      return;
      Object localObject1 = (com.tencent.mm.plugin.emoji.f.b)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = new Bundle();
        paramm.putBoolean("extinfo_key_10", true);
        paramString = this.mController.ylL;
        Object localObject2 = ((com.tencent.mm.plugin.emoji.f.b)localObject1).bkt().vHD;
        localObject1 = ((com.tencent.mm.plugin.emoji.f.b)localObject1).bkt().mZr;
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject2 = com.tencent.mm.pluginsdk.wallet.h.N((String)localObject2, (String)localObject1, 5);
          ((PayInfo)localObject2).vwh = paramm;
          com.tencent.mm.pluginsdk.wallet.h.a(paramString, (PayInfo)localObject2, 8001);
        }
        AppMethodBeat.o(53721);
      }
      else if (paramInt1 == 4)
      {
        if (!this.leF)
        {
          this.leF = true;
          com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { this.kWl, Integer.valueOf(this.les), Integer.valueOf(this.kVD), Integer.valueOf(2) });
        }
        if (paramInt2 == com.tencent.mm.plugin.emoji.f.b.kWi)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(408L, 6L, 1L, false);
          if (bo.isNullOrNil(paramString))
          {
            JN(getString(2131299142));
            AppMethodBeat.o(53721);
          }
          else
          {
            JN(paramString);
            AppMethodBeat.o(53721);
          }
        }
        else if (paramInt2 == com.tencent.mm.plugin.emoji.f.b.kWj)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(408L, 7L, 1L, false);
          if (bo.isNullOrNil(paramString))
          {
            JN(getString(2131299144));
            AppMethodBeat.o(53721);
          }
          else
          {
            JN(paramString);
            AppMethodBeat.o(53721);
          }
        }
        else if (paramInt2 == com.tencent.mm.plugin.emoji.f.b.kWk)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(408L, 5L, 1L, false);
          if (bo.isNullOrNil(paramString))
          {
            JN(getString(2131299143));
            AppMethodBeat.o(53721);
          }
          else
          {
            JN(paramString);
            AppMethodBeat.o(53721);
          }
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(408L, 8L, 1L, false);
          Toast.makeText(this, getString(2131299094), 0).show();
          AppMethodBeat.o(53721);
        }
      }
      else
      {
        if (!this.leF)
        {
          this.leF = true;
          com.tencent.mm.plugin.report.service.h.pYm.e(12738, new Object[] { this.kWl, Integer.valueOf(this.les), Integer.valueOf(this.kVD), Integer.valueOf(2) });
        }
        com.tencent.mm.plugin.report.service.h.pYm.a(408L, 8L, 1L, false);
        Toast.makeText(this, getString(2131299094), 0).show();
        AppMethodBeat.o(53721);
        continue;
        if (!(paramm instanceof com.tencent.mm.plugin.emoji.f.o))
          break;
        paramString = (com.tencent.mm.plugin.emoji.f.o)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "update emotion reward success.");
          this.laG = paramString.bkD();
          com.tencent.mm.at.o.ahp().a(this.laG.Reward.wec, null, com.tencent.mm.plugin.emoji.e.g.k(this.kWl, this.laG.Reward.wec, new Object[0]));
          this.mHandler.sendEmptyMessage(1002);
          AppMethodBeat.o(53721);
        }
        else
        {
          ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "update emotion reward failed.");
          AppMethodBeat.o(53721);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI
 * JD-Core Version:    0.6.2
 */