package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.f.a;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.model.i.a;
import com.tencent.mm.plugin.emoji.model.i.b;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;
import com.tencent.mm.protocal.protobuf.EmotionBanner;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.protocal.protobuf.GetEmotionListResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class BaseEmojiStoreUI extends EmojiBaseActivity
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ai.f, i.a, i.b, h.a, k.a, MMPullDownView.c, MMPullDownView.d, MMPullDownView.e
{
  private static Map<String, Long> kYs;
  protected View Ek;
  private ProgressDialog gqo;
  private boolean hZu;
  com.tencent.mm.plugin.emoji.a.a.a kVA;
  private com.tencent.mm.plugin.emoji.h.c kVI;
  protected EmojiStoreVpHeader kXW;
  protected View kXX;
  protected StoreBannerEmojiView kXY;
  protected MMPullDownView kXZ;
  protected TextView kYa;
  protected boolean kYb = false;
  int kYc = -1;
  private View kYd;
  byte[] kYe;
  private final int kYf = 65537;
  private final int kYg = 20001;
  private final int kYh = 2002;
  protected final int kYi = 131074;
  private final int kYj = 131075;
  private final int kYk = 131076;
  private final String kYl = "product_id";
  private final String kYm = "progress";
  private final String kYn = "status";
  private com.tencent.mm.plugin.emoji.f.n kYo;
  private int kYp;
  private com.tencent.mm.plugin.emoji.model.f kYq;
  private i kYr;
  private com.tencent.mm.sdk.b.c kYt;
  protected com.tencent.mm.plugin.emoji.f.g kYu;
  protected boolean kYv = false;
  private LinkedList<EmotionBanner> kYw = new LinkedList();
  private LinkedList<EmotionBannerSet> kYx = new LinkedList();
  protected ListView mListView;

  private void a(int paramInt, com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = false;
    ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "");
    boolean bool2 = bool1;
    switch (paramInt)
    {
    default:
      bool2 = bool1;
    case 0:
      if (this.kYq != null)
        this.kYq.bke();
      a(bool2, this.kYq, paramBoolean1, paramBoolean2);
      return;
    case -1:
      this.kYq = paramf;
    case 1:
    case 2:
    }
    while (true)
    {
      bool2 = true;
      break;
      this.kYq = paramf;
      continue;
      if (this.kYq == null)
        this.kYq = new com.tencent.mm.plugin.emoji.model.f();
      if (paramf != null)
      {
        this.kYq.ue(paramf.kVp);
        this.kYq.br(paramf.kVq);
      }
    }
  }

  private com.tencent.mm.plugin.emoji.f.n aG(byte[] paramArrayOfByte)
  {
    int i = bkV();
    int j = aH(paramArrayOfByte);
    int k = bkW();
    com.tencent.mm.plugin.emoji.f.n localn;
    if (paramArrayOfByte != null)
    {
      ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer %s", new Object[] { paramArrayOfByte.toString() });
      localn = new com.tencent.mm.plugin.emoji.f.n(i, paramArrayOfByte, j);
      paramArrayOfByte = localn;
      if (i == 7)
      {
        localn.kWU = k;
        paramArrayOfByte = localn;
      }
    }
    while (true)
    {
      this.kYo = paramArrayOfByte;
      return paramArrayOfByte;
      ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] request buffer is null.");
      localn = new com.tencent.mm.plugin.emoji.f.n(i, j);
      paramArrayOfByte = localn;
      if (i == 7)
      {
        localn.kWU = k;
        paramArrayOfByte = localn;
      }
    }
  }

  private void b(GetEmotionListResponse paramGetEmotionListResponse)
  {
    if (this.kYc == -1)
    {
      Message localMessage = Message.obtain();
      localMessage.what = 65537;
      localMessage.obj = paramGetEmotionListResponse;
      o(localMessage);
    }
  }

  private void bW(String paramString, int paramInt)
  {
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("status", paramInt);
    localMessage.what = 131076;
    n(localMessage);
  }

  private void bX(String paramString, int paramInt)
  {
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("progress", paramInt);
    localMessage.what = 131075;
    n(localMessage);
  }

  private void bkU()
  {
    com.tencent.mm.plugin.emoji.a.a.b.a(this.kVA.kSP, this);
  }

  private void bkX()
  {
    com.tencent.mm.kernel.g.RO().eJo.a(this.kYo, 0);
  }

  public final void A(ArrayList<com.tencent.mm.pluginsdk.model.n> paramArrayList)
  {
    ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "google [onQueryFinish]");
    if (this.kVA == null);
    while (true)
    {
      return;
      com.tencent.mm.plugin.emoji.a.a.b.a(paramArrayList, this.kVA.kSP);
      if (this.kZl != null)
      {
        this.kZl.removeMessages(131074);
        this.kZl.sendEmptyMessage(131074);
      }
    }
  }

  protected void JI(String paramString)
  {
  }

  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    String str1 = parama.getProductId();
    String str2;
    if (TextUtils.isEmpty(parama.bjo()))
    {
      str2 = "";
      ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str1, str2, Integer.valueOf(parama.bjn()) });
      if (parama.bjn() == 9)
      {
        str2 = getString(2131297068);
        if (!isFinishing())
          break label97;
        ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
      }
    }
    while (true)
    {
      this.kYr.a(parama);
      return;
      str2 = parama.bjo();
      break;
      label97: getString(2131297061);
      this.gqo = h.b(this, str2, true, new BaseEmojiStoreUI.4(this));
    }
  }

  protected void a(com.tencent.mm.plugin.emoji.f.g paramg)
  {
    bX(paramg.kWz, 0);
  }

  protected void a(com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks initData begin");
    if ((paramf != null) && (paramf.kVq.size() > 0))
    {
      this.kYv = true;
      this.Ek.setVisibility(8);
      this.kYb = false;
    }
    a(this.kYc, paramf, paramBoolean1, paramBoolean2);
    bkU();
  }

  public void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals("delete_group")))
    {
      blo();
      dS(131074, 50);
    }
  }

  protected void a(boolean paramBoolean1, com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((this.kYq != null) && (paramBoolean1))
      if (bkS())
      {
        if ((this.kYq != null) && (this.kYq.kVr != null) && (this.kYq.kVr.BannerSummary != null))
          break label75;
        ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "update store ui header failed. ");
      }
    while (true)
    {
      if (this.kVA != null)
        this.kVA.b(this.kYq);
      return;
      label75: this.kYw = ((LinkedList)this.kYq.kVs);
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

  protected int aH(byte[] paramArrayOfByte)
  {
    return this.kYp;
  }

  protected final void aoW()
  {
    if (isFinishing())
      ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[showLoadingDialog] acitivity is finished.");
    while (true)
    {
      return;
      getString(2131297061);
      this.gqo = h.b(this, getString(2131297086), true, new BaseEmojiStoreUI.3(this));
    }
  }

  public final boolean bhk()
  {
    z(true, false);
    ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onBottomLoadData] startLoadRemoteEmoji.");
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

  protected void bkL()
  {
    this.kVA = bkO();
    this.kVA.kSQ = this;
  }

  protected abstract int bkM();

  protected abstract int bkN();

  protected abstract com.tencent.mm.plugin.emoji.a.a.a bkO();

  protected void bkP()
  {
  }

  protected void bkQ()
  {
    if (!bkR());
    while (true)
    {
      return;
      this.kXZ = ((MMPullDownView)findViewById(2131823536));
      if (this.kXZ != null)
      {
        this.kXZ.setTopViewVisible(false);
        this.kXZ.setAtTopCallBack(this);
        this.kXZ.setOnBottomLoadDataListener(this);
        this.kXZ.setAtBottomCallBack(this);
        this.kXZ.setBottomViewVisible(false);
        this.kXZ.setIsBottomShowAll(false);
      }
    }
  }

  protected boolean bkR()
  {
    return true;
  }

  protected boolean bkS()
  {
    return true;
  }

  protected boolean bkT()
  {
    return false;
  }

  protected abstract int bkV();

  public int bkW()
  {
    return 0;
  }

  protected final void bkY()
  {
    com.tencent.mm.kernel.g.RO().eJo.c(this.kYo);
  }

  protected final void bkZ()
  {
    com.tencent.mm.kernel.g.RO().eJo.a(this.kYu, 0);
  }

  public final void bkf()
  {
    this.kYe = null;
    this.kYc = -1;
    z(false, false);
  }

  protected boolean bla()
  {
    boolean bool = false;
    GetEmotionListResponse localGetEmotionListResponse = j.getEmojiStorageMgr().xYq.ME(bkV());
    com.tencent.mm.plugin.emoji.model.f localf = com.tencent.mm.plugin.emoji.f.n.a(localGetEmotionListResponse);
    int i = bkV();
    int j;
    if (localGetEmotionListResponse == null)
    {
      j = 0;
      ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "load cache type: %d, size: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if (localf != null)
        break label77;
    }
    while (true)
    {
      return bool;
      j = localGetEmotionListResponse.EmotionCount;
      break;
      label77: if (localf.kVq.size() <= 0);
      for (bool = false; ; bool = true)
      {
        if (!bool)
          break label137;
        ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks init EmoijStoreUI  by Cache: list:%d", new Object[] { Integer.valueOf(localf.kVq.size()) });
        a(localf, true, false);
        break;
      }
      label137: ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks init EmoijStoreUI  by NET");
    }
  }

  protected final void blb()
  {
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
  }

  protected boolean blc()
  {
    return false;
  }

  protected boolean bld()
  {
    return true;
  }

  public void ble()
  {
  }

  protected void c(GetEmotionListResponse paramGetEmotionListResponse)
  {
    int i = 0;
    int j;
    if (paramGetEmotionListResponse != null)
    {
      if (paramGetEmotionListResponse != null)
        break label68;
      j = 0;
      if (paramGetEmotionListResponse != null)
        break label76;
    }
    while (true)
    {
      ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(bkV()) });
      j.getEmojiStorageMgr().xYq.a(bkV(), paramGetEmotionListResponse);
      return;
      label68: j = paramGetEmotionListResponse.EmotionCount;
      break;
      label76: if (paramGetEmotionListResponse.ReqBuf != null)
        i = paramGetEmotionListResponse.ReqBuf.computeSize();
    }
  }

  public int getLayoutId()
  {
    return 2130969355;
  }

  public void h(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "[onExchange] productId:[%s] status:[%d] progress:[%d] cdnClientId:[%s]", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    if (this.kVA == null);
    com.tencent.mm.plugin.emoji.a.a.c localc;
    do
    {
      return;
      localc = this.kVA.kSP;
    }
    while (localc == null);
    if (paramInt1 == 6)
      bX(paramString1, paramInt2);
    while (true)
    {
      paramString1 = localc.IT(paramString1);
      if (paramString1 == null)
        break;
      paramString1.kTe = paramString2;
      break;
      ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "product status:%d", new Object[] { Integer.valueOf(paramInt1) });
      bW(paramString1, paramInt1);
    }
  }

  public final void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    j(paramString1, paramString2, paramString3, paramString4);
    bkZ();
  }

  public void initView()
  {
    setBackBtn(new b((byte)0));
    bkL();
    this.Ek = findViewById(2131821749);
    this.kYa = ((TextView)this.Ek.findViewById(2131823528));
    this.kYd = getLayoutInflater().inflate(2130969354, null);
    this.kYd.setVisibility(8);
    if (bkS())
      this.kXW = new EmojiStoreVpHeader(this.mController.ylL);
    if (bkT())
    {
      this.kXX = LayoutInflater.from(this).inflate(2130969387, null);
      int i = EmojiStoreVpHeader.db(this.mController.ylL)[0];
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(i, i * 3 / 8 + 1);
      this.kXX.setLayoutParams(localLayoutParams);
      this.kXY = ((StoreBannerEmojiView)this.kXX.findViewById(2131823548));
    }
    this.mListView = ((ListView)findViewById(16908298));
    this.mListView.setOnItemClickListener(this);
    if (bkS())
      this.mListView.addHeaderView(this.kXW);
    while (true)
    {
      if (bld())
        this.mListView.addFooterView(this.kYd);
      bkP();
      this.mListView.setAdapter(this.kVA);
      this.mListView.setOnScrollListener(this);
      this.kVA.kSO = this.mListView;
      bkQ();
      return;
      if (bkT())
        this.mListView.addHeaderView(this.kXX);
    }
  }

  protected final com.tencent.mm.plugin.emoji.f.g j(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.kYu = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3, paramString4);
    return this.kYu;
  }

  public final void l(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 65537:
    case 20001:
    case 2002:
    }
    while (true)
    {
      return;
      c((GetEmotionListResponse)paramMessage.obj);
      continue;
      blb();
      continue;
      paramMessage = (String)paramMessage.obj;
      if (isFinishing())
        ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[updateLoadingDialog] acitivity is finished.");
      else if (this.gqo != null)
        this.gqo.setMessage(paramMessage);
    }
  }

  public void m(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 131074:
    case 131075:
    case 131076:
    }
    while (true)
    {
      return;
      if (this.kVA != null)
      {
        this.kVA.notifyDataSetChanged();
        ble();
        continue;
        if ((this.kVA != null) && (paramMessage.getData() != null))
        {
          String str = paramMessage.getData().getString("product_id");
          if (str != null)
          {
            int i = paramMessage.getData().getInt("progress");
            this.kVA.bX(str, i);
            continue;
            if ((this.kVA != null) && (paramMessage.getData() != null))
            {
              str = paramMessage.getData().getString("product_id");
              if (str != null)
              {
                i = paramMessage.getData().getInt("status");
                this.kVA.bW(str, i);
              }
            }
          }
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.kYr.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kYr = new i();
    initView();
    this.kYp = getIntent().getIntExtra("preceding_scence", 2);
    if (j.getEmojiStorageMgr().xYo != null)
      j.getEmojiStorageMgr().xYo.c(this);
    this.kYt = new BaseEmojiStoreUI.a(this, (byte)0);
    com.tencent.mm.sdk.b.a.xxA.c(this.kYt);
    this.kYr.jiq = this;
    this.kYr.kVA = this.kVA;
    this.kYr.kVD = bkM();
    this.kYr.kVG = this;
    boolean bool1 = blc();
    boolean bool2 = bool1;
    if (bool1)
      bool2 = bla();
    z(false, bool2);
    if (kYs == null)
      kYs = new HashMap();
    long l = System.currentTimeMillis();
    ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "refresh last net refresh time: %d", new Object[] { Long.valueOf(l) });
    kYs.put(getClass().toString(), Long.valueOf(l));
    this.kVI = new com.tencent.mm.plugin.emoji.h.c(1005);
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.kVA != null)
    {
      this.kVA.clear();
      this.kVA = null;
    }
    if ((bkS()) && (this.kXW != null))
      this.kXW.clear();
    j.getEmojiStorageMgr().xYo.d(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.kYt);
    com.tencent.mm.kernel.g.RO().eJo.c(this.kYu);
    if (this.kYr != null)
    {
      i locali = this.kYr;
      locali.kVA = null;
      locali.kVG = null;
      locali.jiq = null;
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i;
    if (!bkS())
    {
      i = paramInt;
      if (!bkT());
    }
    else if (paramInt != 0);
    while (true)
    {
      return;
      i = paramInt - 1;
      if ((i >= 0) && (i < this.kVA.getCount()))
      {
        paramView = this.kVA.tX(i);
        if (paramView == null)
        {
          ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "item is null.");
        }
        else if (paramView.kTa == f.a.kTj)
        {
          paramAdapterView = paramView.kTc;
          if (paramAdapterView == null)
            ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "banner set is null. do nothing");
          else
            com.tencent.mm.plugin.emoji.e.m.a(this.mController.ylL, paramAdapterView, false);
        }
        else
        {
          EmotionSummary localEmotionSummary = paramView.kTb;
          if (localEmotionSummary == null)
          {
            ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "summary is null. do nothing");
          }
          else
          {
            paramAdapterView = getIntent().getStringExtra("to_talker_name");
            com.tencent.mm.plugin.emoji.e.m.a(this.mController.ylL, localEmotionSummary, bkM(), paramView.mStatus, paramView.EV, paramAdapterView, bkN());
          }
        }
      }
    }
  }

  public void onPause()
  {
    super.onPause();
    com.tencent.mm.kernel.g.RO().eJo.b(411, this);
    com.tencent.mm.kernel.g.RO().eJo.b(423, this);
    com.tencent.mm.kernel.g.RO().eJo.b(413, this);
    com.tencent.mm.kernel.g.RO().eJo.b(717, this);
    bkY();
    if ((bkS()) && (this.kXW != null))
      this.kXW.blT();
  }

  public void onResume()
  {
    super.onResume();
    com.tencent.mm.kernel.g.RO().eJo.a(411, this);
    com.tencent.mm.kernel.g.RO().eJo.a(423, this);
    com.tencent.mm.kernel.g.RO().eJo.a(413, this);
    com.tencent.mm.kernel.g.RO().eJo.a(717, this);
    if ((bkS()) && (this.kXW != null))
      this.kXW.blS();
    Boolean localBoolean = Boolean.FALSE;
    this.kYr.kVB = false;
    if ((this.kVA != null) && (this.kVA.kSP != null))
    {
      this.kVA.kSP.bjD();
      this.kVA.refreshView();
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    int i = -1;
    Object localObject = paramString;
    if (TextUtils.isEmpty(paramString))
      localObject = "";
    ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "jacks [onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localObject });
    blb();
    switch (paramm.getType())
    {
    default:
      ab.e("MicroMsg.emoji.BaseEmojiStoreUI", "unknow scene type");
    case 411:
    case 423:
    case 413:
    case 717:
    }
    while (true)
    {
      return;
      if ((paramm instanceof com.tencent.mm.plugin.emoji.f.n))
      {
        localObject = (com.tencent.mm.plugin.emoji.f.n)paramm;
        if ((localObject != null) && (((com.tencent.mm.plugin.emoji.f.n)localObject).mType == bkV()))
        {
          this.hZu = false;
          this.kYd.setVisibility(8);
          paramString = null;
          try
          {
            paramm = com.tencent.mm.plugin.emoji.f.n.a(((com.tencent.mm.plugin.emoji.f.n)localObject).bkB());
            paramString = paramm;
            if (paramString == null)
              break label387;
            if ((paramInt1 == 0) || (paramInt1 == 4))
            {
              paramInt1 = 1;
              if (paramInt1 == 0)
                break label387;
              this.Ek.setVisibility(8);
              this.kYb = false;
              this.kYe = ((com.tencent.mm.plugin.emoji.f.n)localObject).kWS;
              if (paramInt2 != 0)
                break label274;
              paramm = ((com.tencent.mm.plugin.emoji.f.n)localObject).bkB();
              a(paramString, false, true);
              b(paramm);
              this.kYc = 0;
            }
          }
          catch (Exception paramm)
          {
            while (true)
            {
              ab.c("MicroMsg.emoji.BaseEmojiStoreUI", "deal NetGetEmotionList error:%s", new Object[] { paramm.toString() });
              continue;
              paramInt1 = 0;
            }
            label274: if (paramInt2 == 2)
            {
              paramm = ((com.tencent.mm.plugin.emoji.f.n)localObject).bkB();
              a(this.kYc, paramString, false, false);
              bkU();
              b(paramm);
              this.kYc = 2;
              continue;
            }
            if (paramInt2 == 3)
            {
              a(this.kYc, paramString, false, false);
              this.kYc = 1;
              continue;
            }
            this.Ek.setVisibility(0);
            this.kYb = true;
            if (bkV() == 7)
            {
              this.kYa.setText(2131299164);
              continue;
            }
            this.kYa.setText(2131299114);
          }
          continue;
          label387: if (!this.kYv)
          {
            this.Ek.setVisibility(0);
            this.kYb = true;
            this.kYa.setText(2131299115);
          }
        }
        else
        {
          paramInt2 = bkV();
          if (localObject == null);
          for (paramInt1 = i; ; paramInt1 = ((com.tencent.mm.plugin.emoji.f.n)localObject).mType)
          {
            ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "no some scene type. this ui type:%d callbak type:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
            break;
          }
          if ((paramm instanceof com.tencent.mm.plugin.emoji.f.g))
          {
            paramString = (com.tencent.mm.plugin.emoji.f.g)paramm;
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              a(paramString);
            }
            else
            {
              String str = paramString.kWz;
              localObject = paramString.kWB;
              paramm = paramString.kWA;
              h.a(this, getString(2131299104, new Object[] { paramm }), "", new BaseEmojiStoreUI.1(this, str, (String)localObject, paramm), new BaseEmojiStoreUI.2(this));
              bW(paramString.kWz, -1);
              continue;
              paramString = (com.tencent.mm.plugin.emoji.f.q)paramm;
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                j.getEmojiStorageMgr().xYo.aqd(paramString.kWz);
                paramString = new Message();
                paramString.what = 2002;
                paramString.obj = this.mController.ylL.getString(2131297065);
                n(paramString);
              }
              while (true)
              {
                dS(20001, 800);
                break;
                paramString = new Message();
                paramString.what = 2002;
                paramString.obj = this.mController.ylL.getString(2131299048);
                n(paramString);
              }
              if ((paramInt1 == 0) && (paramInt2 == 0))
              {
                this.kYe = null;
                z(false, true);
              }
            }
          }
        }
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
      ab.d("MicroMsg.emoji.BaseEmojiStoreUI", "No More List.");
    }
    while (true)
    {
      return;
      label40: z(true, false);
      ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.hZu = true;
    if (paramBoolean1)
      this.kYd.setVisibility(0);
    aG(this.kYe);
    bkX();
    ab.i("MicroMsg.emoji.BaseEmojiStoreUI", "[startLoadRemoteEmoji] doScene GetEmotionListNetScene");
    if ((!paramBoolean1) && (!paramBoolean2))
      aoW();
  }

  final class b
    implements MenuItem.OnMenuItemClickListener
  {
    private b()
    {
    }

    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      AppMethodBeat.i(53219);
      BaseEmojiStoreUI.this.finish();
      AppMethodBeat.o(53219);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI
 * JD-Core Version:    0.6.2
 */