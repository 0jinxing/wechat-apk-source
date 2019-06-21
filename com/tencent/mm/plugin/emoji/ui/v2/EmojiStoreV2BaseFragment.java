package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.da;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.emoji.a.a.f.a;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.model.i.a;
import com.tencent.mm.plugin.emoji.model.i.b;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader;
import com.tencent.mm.protocal.protobuf.EmotionBanner;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.protocal.protobuf.GetEmotionListResponse;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class EmojiStoreV2BaseFragment extends MMFragment
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ai.f, com.tencent.mm.plugin.emoji.a.h.a, i.a, i.b, com.tencent.mm.pluginsdk.model.h.a, k.a, MMPullDownView.c, MMPullDownView.d, MMPullDownView.e
{
  private View Ek;
  private ProgressDialog gqo;
  private boolean hZu;
  com.tencent.mm.plugin.emoji.a.a.a kVA;
  EmojiStoreVpHeader kXW;
  private MMPullDownView kXZ;
  private TextView kYa;
  private int kYc = -1;
  private View kYd;
  private byte[] kYe;
  private final int kYi = 131074;
  private final int kYj = 131075;
  private final int kYk = 131076;
  private final String kYl = "product_id";
  private final String kYm = "progress";
  private final String kYn = "status";
  private com.tencent.mm.plugin.emoji.f.n kYo;
  private int kYp;
  private com.tencent.mm.plugin.emoji.model.f kYq;
  private i kYr;
  private com.tencent.mm.sdk.b.c kYt = new com.tencent.mm.sdk.b.c()
  {
  };
  private com.tencent.mm.plugin.emoji.f.g kYu;
  private boolean kYv = false;
  private LinkedList<EmotionBanner> kYw = new LinkedList();
  private LinkedList<EmotionBannerSet> kYx = new LinkedList();
  private final int lcV = 131077;
  public EmojiStoreV2HotBarView lcW;
  private boolean lcX = false;
  private boolean lcY = false;
  private boolean lcZ = false;
  private ak lda = new EmojiStoreV2BaseFragment.1(this);
  private MenuItem.OnMenuItemClickListener ldb = new EmojiStoreV2BaseFragment.3(this);
  private ActionBar mActionBar;
  private com.tencent.mm.ui.a mActionBarHelper;
  ListView mListView;

  private void A(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.kYq != null) && (paramBoolean1))
    {
      if (paramBoolean2)
        bmc();
      if (this.kVA != null)
        this.kVA.b(this.kYq);
    }
  }

  private void JP(String paramString)
  {
    if (isFinishing())
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[showLoadingDialog] acitivity is finished.");
    while (true)
    {
      return;
      FragmentActivity localFragmentActivity = thisActivity();
      getString(2131297061);
      this.gqo = com.tencent.mm.ui.base.h.b(localFragmentActivity, paramString, true, new EmojiStoreV2BaseFragment.9(this));
    }
  }

  private void a(int paramInt, com.tencent.mm.plugin.emoji.model.f paramf)
  {
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "");
    boolean bool1;
    boolean bool2;
    switch (paramInt)
    {
    default:
      bool1 = false;
      bool2 = false;
    case -1:
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      if (this.kYq != null)
        this.kYq.bke();
      A(bool2, bool1);
      return;
      this.kYq = paramf;
      bool1 = true;
      bool2 = true;
      continue;
      this.kYq = paramf;
      bool1 = false;
      bool2 = true;
      continue;
      this.kYq = paramf;
      bool1 = false;
      bool2 = false;
      continue;
      if (this.kYq == null)
        this.kYq = new com.tencent.mm.plugin.emoji.model.f();
      this.kYq.ue(paramf.kVp);
      this.kYq.br(paramf.kVq);
      bool1 = false;
      bool2 = true;
    }
  }

  private void a(com.tencent.mm.plugin.emoji.a.a.f paramf, int paramInt)
  {
    if (paramf == null)
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "item is null.");
    EmotionSummary localEmotionSummary;
    while (true)
    {
      return;
      if (paramf.kTa == f.a.kTj)
      {
        paramf = paramf.kTc;
        if (paramf == null)
          ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "banner set is null. do nothing");
        else
          com.tencent.mm.plugin.emoji.e.m.a(getContext(), paramf, false);
      }
      else
      {
        localEmotionSummary = paramf.kTb;
        if (localEmotionSummary != null)
          break;
        ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "summary is null. do nothing");
      }
    }
    if (bmd())
      if ((paramInt >= 0) && (paramInt < this.kVA.bjw()))
        paramInt = 3;
    while (true)
    {
      String str = thisActivity().getIntent().getStringExtra("to_talker_name");
      com.tencent.mm.plugin.emoji.e.m.a(getContext(), localEmotionSummary, paramInt, paramf.mStatus, paramf.EV, str, 5);
      break;
      if ((paramInt >= this.kVA.bjw()) && (paramInt < this.kVA.bjx() + this.kVA.bjw()))
      {
        paramInt = 19;
      }
      else
      {
        paramInt = 1;
        continue;
        paramInt = 2;
      }
    }
  }

  private void aI(byte[] paramArrayOfByte)
  {
    int i = bkV();
    int j = this.kYp;
    if (paramArrayOfByte != null)
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer %s", new Object[] { paramArrayOfByte.toString() });
    for (this.kYo = new com.tencent.mm.plugin.emoji.f.n(i, paramArrayOfByte, j); ; this.kYo = new com.tencent.mm.plugin.emoji.f.n(i, j))
    {
      return;
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[refreshNetSceneGetEmotionList] request buffer is null.");
    }
  }

  private void bkU()
  {
    com.tencent.mm.plugin.emoji.a.a.b.a(this.kVA.kSP, this);
  }

  private void bkX()
  {
    com.tencent.mm.kernel.g.RO().eJo.a(this.kYo, 0);
  }

  private void blY()
  {
    this.lcY = true;
    blZ();
    this.kYp = thisActivity().getIntent().getIntExtra("preceding_scence", 5);
    if ((bma()) && (this.lda != null))
      this.lda.postDelayed(new EmojiStoreV2BaseFragment.7(this), 3000L);
    while (true)
    {
      return;
      gt(true);
    }
  }

  private void blZ()
  {
    this.kYr = new i();
    this.kYr.jiq = thisActivity();
    this.kYr.kVC = this;
    this.kYr.kVA = this.kVA;
    if (bmd());
    for (this.kYr.kVD = 1; ; this.kYr.kVD = 2)
    {
      this.kYr.kVG = this;
      return;
    }
  }

  private boolean bma()
  {
    boolean bool1 = false;
    GetEmotionListResponse localGetEmotionListResponse = j.getEmojiStorageMgr().xYq.ME(bkV());
    com.tencent.mm.plugin.emoji.model.f localf = com.tencent.mm.plugin.emoji.f.n.a(localGetEmotionListResponse);
    int i = bkV();
    int j;
    boolean bool2;
    label129: int k;
    if (localGetEmotionListResponse == null)
    {
      j = 0;
      ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache type: %d, size: %d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      bool2 = bool1;
      if (localf != null)
      {
        bool2 = bool1;
        if (localf.kVq.size() > 0)
        {
          this.kYv = true;
          this.Ek.setVisibility(8);
          this.kXZ.setVisibility(0);
          a(this.kYc, localf);
          if (localGetEmotionListResponse == null)
            break label237;
          if (localGetEmotionListResponse.CellSetList != null)
            break label225;
          j = 0;
          k = localGetEmotionListResponse.TopHotNum;
          i = localGetEmotionListResponse.RecentHotNum;
        }
      }
    }
    while (true)
    {
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "load cache hotcount:%d type:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(bkV()) });
      if ((this.kVA != null) && (bmd()))
      {
        this.kVA.tU(j + k);
        this.kVA.tV(i);
      }
      bkU();
      bool2 = true;
      return bool2;
      j = localGetEmotionListResponse.EmotionCount;
      break;
      label225: j = localGetEmotionListResponse.CellSetList.size();
      break label129;
      label237: i = 0;
      k = 0;
      j = 0;
    }
  }

  private static boolean bmb()
  {
    ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJh, Long.valueOf(0L))).longValue();
    return true;
  }

  private void bmc()
  {
    if (this.kYq == null)
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "update store ui header failed. ");
    while (true)
    {
      return;
      this.kYw = ((LinkedList)this.kYq.kVs);
      this.kYx = ((LinkedList)this.kYq.kVt);
      if (this.kYw != null)
      {
        this.kXW.d(this.kYw, this.kYx);
      }
      else if (this.kYq.kVr != null)
      {
        this.kYw = new LinkedList();
        this.kYw.add(this.kYq.kVr);
        this.kXW.d(this.kYw, this.kYx);
      }
    }
  }

  private void d(GetEmotionListResponse paramGetEmotionListResponse)
  {
    if (this.kYc == -1)
      com.tencent.mm.kernel.g.RS().aa(new EmojiStoreV2BaseFragment.8(this, paramGetEmotionListResponse));
  }

  private void gu(boolean paramBoolean)
  {
    if (this.hZu)
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "isLoading");
    while (true)
    {
      return;
      this.hZu = true;
      if (paramBoolean)
        this.kYd.setVisibility(0);
      aI(this.kYe);
      bkX();
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
      if (!paramBoolean)
        JP(getString(2131297086));
    }
  }

  public final void A(ArrayList<com.tencent.mm.pluginsdk.model.n> paramArrayList)
  {
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "google [onQueryFinish]");
    if (this.kVA == null);
    while (true)
    {
      return;
      if (this.lda != null)
        this.lda.sendEmptyMessageDelayed(131074, 50L);
      com.tencent.mm.plugin.emoji.a.a.b.a(paramArrayList, this.kVA.kSP);
    }
  }

  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    if (parama.bjn() == 9)
      JP(getString(2131297068));
    if (bmd())
      if ((parama.mPosition >= 0) && (parama.mPosition < this.kVA.bjw()))
        this.kYr.kVD = 3;
    while (true)
    {
      this.kYr.a(parama);
      return;
      if ((parama.mPosition >= this.kVA.bjw()) && (parama.mPosition < this.kVA.bjx() + this.kVA.bjw()))
      {
        this.kYr.kVD = 19;
      }
      else
      {
        this.kYr.kVD = 1;
        continue;
        this.kYr.kVD = 2;
      }
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals("delete_group")) && (this.lda != null))
      this.lda.sendEmptyMessageDelayed(131074, 50L);
  }

  public final boolean bhk()
  {
    ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onBottomLoadData] startLoadRemoteEmoji.");
    gu(true);
    return true;
  }

  public final boolean bhl()
  {
    return false;
  }

  public final boolean bhm()
  {
    return false;
  }

  public abstract com.tencent.mm.plugin.emoji.a.a.a bkO();

  public abstract int bkV();

  public final void bkf()
  {
    this.kYe = null;
    this.kYc = -1;
    gu(false);
  }

  public abstract boolean bmd();

  public int getForceOrientation()
  {
    return 1;
  }

  public final void gt(boolean paramBoolean)
  {
    ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "loadNetWork force:%b isNeedToRefresh:%b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bmb()) });
    if (!paramBoolean)
      bmb();
    aI(this.kYe);
    bkX();
  }

  public final void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.kYu = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    com.tencent.mm.kernel.g.RO().eJo.a(this.kYu, 0);
  }

  public final void n(Message paramMessage)
  {
    if (this.lda != null)
      this.lda.sendMessage(paramMessage);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.lcZ = true;
    this.kVA = bkO();
    this.kVA.kSQ = this;
    this.Ek = findViewById(2131821749);
    this.kYa = ((TextView)this.Ek.findViewById(2131823528));
    this.kYd = getActivityLayoutInflater().inflate(2130969354, null);
    this.kYd.setVisibility(8);
    this.kXW = new EmojiStoreVpHeader(getContext());
    this.mListView = ((ListView)findViewById(16908298));
    this.mListView.addHeaderView(this.kXW);
    if (!bmd())
    {
      this.lcW = new EmojiStoreV2HotBarView(getContext());
      this.lcW.setDesignerEmojiViewVisibility(8);
      this.lcW.setDesignerCatalogViewPadding(false);
      this.mListView.addHeaderView(this.lcW);
    }
    this.mListView.addFooterView(this.kYd);
    this.mListView.setAdapter(this.kVA);
    if (bmd())
      this.mListView.setOnItemClickListener(this);
    while (true)
    {
      this.mListView.setOnScrollListener(this);
      this.mListView.setLongClickable(false);
      this.mListView.setOnTouchListener(new EmojiStoreV2BaseFragment.6(this));
      this.kVA.kSO = this.mListView;
      this.kXZ = ((MMPullDownView)findViewById(2131823536));
      if (this.kXZ != null)
      {
        this.kXZ.setTopViewVisible(false);
        this.kXZ.setAtTopCallBack(this);
        this.kXZ.setOnBottomLoadDataListener(this);
        this.kXZ.setAtBottomCallBack(this);
        this.kXZ.setBottomViewVisible(false);
        this.kXZ.setIsBottomShowAll(false);
        this.kXZ.setIsReturnSuperDispatchWhenCancel(true);
      }
      if (this.lcX)
        blY();
      return;
      ((com.tencent.mm.plugin.emoji.a.h)this.kVA).kSy = this;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.kYr != null)
      this.kYr.onActivityResult(paramInt1, paramInt2, paramIntent);
    while (true)
    {
      return;
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "mPayOrDownloadComponent have no init.");
    }
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onAttach");
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.kXW != null)
      this.kXW.requestLayout();
    setRequestedOrientation(1);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    this.mActionBar = ((AppCompatActivity)thisActivity()).getSupportActionBar();
    paramBundle = v.hu(getContext()).inflate(2130968612, null);
    this.mActionBarHelper = new com.tencent.mm.ui.a(paramBundle);
    this.mActionBar.setLogo(new ColorDrawable(getResources().getColor(17170445)));
    this.mActionBar.fc();
    this.mActionBar.setDisplayHomeAsUpEnabled(false);
    this.mActionBar.fb();
    this.mActionBar.fd();
    this.mActionBar.setCustomView(paramBundle);
    this.mActionBar.show();
    paramBundle = this.mActionBarHelper;
    paramBundle.gnB.setText(2131299091);
    if (com.tencent.mm.bz.a.ga(paramBundle.gnB.getContext()))
    {
      TextView localTextView = paramBundle.gnB;
      float f = com.tencent.mm.bz.a.am(paramBundle.gnB.getContext(), 2131427496);
      localTextView.setTextSize(0, com.tencent.mm.bz.a.fY(paramBundle.gnB.getContext()) * f);
    }
    this.mActionBarHelper.b(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(53575);
        if (!EmojiStoreV2BaseFragment.this.isScreenEnable())
          AppMethodBeat.o(53575);
        while (true)
        {
          return;
          if (EmojiStoreV2BaseFragment.a(EmojiStoreV2BaseFragment.this) != null)
            EmojiStoreV2BaseFragment.a(EmojiStoreV2BaseFragment.this).onMenuItemClick(null);
          AppMethodBeat.o(53575);
        }
      }
    });
    showOptionMenu(true);
    addIconOptionMenu(0, 2131230758, new EmojiStoreV2BaseFragment.5(this));
    com.tencent.mm.sdk.b.a.xxA.c(this.kYt);
    j.getEmojiStorageMgr().xYo.c(this);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onCreateView");
    return paramLayoutInflater.inflate(getLayoutId(), paramViewGroup, false);
  }

  public void onDestroy()
  {
    super.onDestroy();
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDestroy");
    if (this.kVA != null)
    {
      this.kVA.clear();
      this.kVA = null;
    }
    if (this.kXW != null)
    {
      this.kXW.blT();
      this.kXW.clear();
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.kYt);
    j.getEmojiStorageMgr().xYo.d(this);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
  }

  public void onDetach()
  {
    super.onDetach();
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onDetach");
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramInt -= this.mListView.getHeaderViewsCount();
    if ((paramInt < 0) || (paramInt >= this.kVA.getCount()));
    while (true)
    {
      return;
      paramAdapterView = this.kVA.tX(paramInt);
      a(paramAdapterView, paramInt);
      if ((bmd()) && (this.kVA.bjx() > 0) && (paramInt >= this.kVA.bjw()) && (paramInt < this.kVA.bjw() + this.kVA.bjx()) && (paramAdapterView.kTb != null))
        com.tencent.mm.plugin.report.service.h.pYm.e(13223, new Object[] { Integer.valueOf(1), paramAdapterView.kTb.ProductID, paramAdapterView.kTb.PackName, Integer.valueOf(1), Integer.valueOf(0) });
    }
  }

  public void onPause()
  {
    super.onPause();
    com.tencent.mm.kernel.g.RO().eJo.b(411, this);
    com.tencent.mm.kernel.g.RO().eJo.b(423, this);
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onPause");
    if (this.kXW != null)
      this.kXW.blT();
    if (this.lda != null)
      this.lda.removeMessages(131077);
  }

  public void onResume()
  {
    super.onResume();
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onResume");
    com.tencent.mm.kernel.g.RO().eJo.a(411, this);
    com.tencent.mm.kernel.g.RO().eJo.a(423, this);
    if (this.lcX)
    {
      if (this.lda != null)
        this.lda.sendEmptyMessageDelayed(131077, 4000L);
      if ((this.kVA != null) && (this.kVA.kSP != null))
      {
        this.kVA.kSP.bjD();
        this.kVA.refreshView();
      }
      if (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(208900, Boolean.FALSE)).booleanValue())
      {
        bkf();
        com.tencent.mm.kernel.g.RP().Ry().set(208900, Boolean.FALSE);
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    int i = paramm.getType();
    switch (i)
    {
    default:
      ab.w("MicroMsg.emoji.EmojiStoreV2BaseFragment", "unknow scene type.");
      break;
    case 411:
    }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.plugin.emoji.f.n))
      {
        paramString = (com.tencent.mm.plugin.emoji.f.n)paramm;
        if ((paramString == null) || (paramString.mType != bkV()))
          break;
        int j = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        int i1 = j;
        int i2 = n;
        int i3 = m;
        if (paramString != null)
        {
          i1 = j;
          i2 = n;
          i3 = m;
          if (paramString.bkB() != null)
          {
            i1 = k;
            if (this.kVA.bjy() <= 0)
            {
              i1 = k;
              if (bmd())
              {
                if (paramString.bkB().CellSetList != null)
                  break label569;
                i1 = 0;
                this.kVA.tW(i1);
              }
            }
            i3 = paramString.bkB().TopHotNum;
            i2 = paramString.bkB().RecentHotNum;
          }
        }
        ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onSceneEnd setSize:%d hotcount:%d recentHotCount:%d type:%d getSceneType:%d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(paramString.mType) });
        Object localObject;
        if ((this.kVA != null) && (this.kVA.bjx() <= 0) && (bmd()))
        {
          localObject = this.kVA;
          ((com.tencent.mm.plugin.emoji.a.a.a)localObject).tU(i3 + ((com.tencent.mm.plugin.emoji.a.a.a)localObject).bjy());
          this.kVA.tV(i2);
        }
        this.hZu = false;
        this.kYd.setVisibility(8);
        if ((paramInt1 == 0) || (paramInt1 == 4))
        {
          paramInt1 = 1;
          label361: if (paramInt1 == 0)
            break label682;
          this.Ek.setVisibility(8);
          this.kXZ.setVisibility(0);
          localObject = (com.tencent.mm.plugin.emoji.f.n)paramm;
          paramm = com.tencent.mm.plugin.emoji.f.n.a(((com.tencent.mm.plugin.emoji.f.n)localObject).bkB());
          this.kYe = ((com.tencent.mm.plugin.emoji.f.n)localObject).kWS;
          if (paramInt2 != 0)
            break label589;
          localObject = ((com.tencent.mm.plugin.emoji.f.n)localObject).bkB();
          a(this.kYc, paramm);
          d((GetEmotionListResponse)localObject);
          this.kYc = 0;
        }
        label682: 
        while (true)
        {
          if (!bmd())
            break label717;
          if ((paramString.bkB() == null) || (paramString.bkB().CellSetList == null) || (paramString.bkB().CellSetList.size() <= 0))
            break label719;
          for (paramInt1 = 0; paramInt1 < paramString.bkB().CellSetList.size(); paramInt1++)
            com.tencent.mm.plugin.report.service.h.pYm.e(13223, new Object[] { Integer.valueOf(0), Integer.valueOf(((EmotionBannerSet)paramString.bkB().CellSetList.get(paramInt1)).ID), ((EmotionBannerSet)paramString.bkB().CellSetList.get(paramInt1)).Title, Integer.valueOf(0) });
          label569: i1 = paramString.bkB().CellSetList.size();
          break;
          paramInt1 = 0;
          break label361;
          label589: if (paramInt2 == 2)
          {
            localObject = ((com.tencent.mm.plugin.emoji.f.n)localObject).bkB();
            a(this.kYc, paramm);
            bkU();
            d((GetEmotionListResponse)localObject);
            this.kYc = 2;
          }
          else if (paramInt2 == 3)
          {
            a(this.kYc, paramm);
            this.kYc = 1;
          }
          else
          {
            this.Ek.setVisibility(0);
            this.kXZ.setVisibility(8);
            this.kYa.setText(2131299114);
            continue;
            if (!this.kYv)
            {
              this.Ek.setVisibility(0);
              this.kXZ.setVisibility(8);
              this.kYa.setText(2131299115);
            }
          }
        }
        label717: continue;
        label719: if ((paramString.bkB().RecentHotNum <= 0) || (paramString.bkB().EmotionList == null) || (paramString.bkB().EmotionList.size() <= paramString.bkB().TopHotNum + paramString.bkB().RecentHotNum))
          break;
        for (paramInt1 = 0; paramInt1 < paramString.bkB().RecentHotNum; paramInt1++)
          com.tencent.mm.plugin.report.service.h.pYm.e(13223, new Object[] { Integer.valueOf(0), ((EmotionSummary)paramString.bkB().EmotionList.get(paramString.bkB().TopHotNum + paramInt1)).ProductID, ((EmotionSummary)paramString.bkB().EmotionList.get(paramString.bkB().TopHotNum + paramInt1)).PackName, Integer.valueOf(1) });
      }
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
    {
      if ((this.kYc != 0) && (!this.hZu))
        break label40;
      ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "No More List.");
    }
    while (true)
    {
      return;
      label40: gu(true);
      ab.i("MicroMsg.emoji.EmojiStoreV2BaseFragment", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
  }

  public void onStart()
  {
    super.onStart();
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStart");
  }

  public void onStop()
  {
    super.onStop();
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "onStop");
  }

  public void setUserVisibleHint(boolean paramBoolean)
  {
    ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "setUserVisibleHint :%b", new Object[] { Boolean.valueOf(paramBoolean) });
    super.setUserVisibleHint(paramBoolean);
    this.lcX = paramBoolean;
    if ((!this.lcY) && (this.lcZ))
      blY();
  }

  public final void tY(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= ((com.tencent.mm.plugin.emoji.a.h)this.kVA).bjB()));
    while (true)
    {
      return;
      a(this.kVA.tX(paramInt), paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
 * JD-Core Version:    0.6.2
 */