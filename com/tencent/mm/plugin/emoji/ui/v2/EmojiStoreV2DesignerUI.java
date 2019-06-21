package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.emoji.e.l.2;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.i.a;
import com.tencent.mm.plugin.emoji.model.i.b;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.protocal.protobuf.aic;
import com.tencent.mm.protocal.protobuf.aml;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public class EmojiStoreV2DesignerUI extends MMActivity
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, com.tencent.mm.ai.f, i.a, i.b, MMPullDownView.c, MMPullDownView.e
{
  private View abB;
  private int gOW;
  private boolean hZu;
  private long kVE;
  private String kVF;
  private String kVJ;
  private String kWM;
  com.tencent.mm.plugin.emoji.a.f kYB;
  private int kYc;
  private byte[] kYe;
  protected final int kYi;
  private final int kYj;
  private final int kYk;
  private final String kYl;
  private final String kYm;
  private final String kYn;
  private com.tencent.mm.plugin.emoji.model.f kYq;
  private com.tencent.mm.plugin.emoji.model.i kYr;
  private c kYt;
  private com.tencent.mm.plugin.emoji.f.g kYu;
  TextView ldA;
  View ldB;
  private MMPullDownView ldC;
  private aml ldD;
  private com.tencent.mm.plugin.emoji.f.i ldE;
  private com.tencent.mm.ui.base.p ldF;
  private ao.b.a ldG;
  private final int ldH;
  private final int ldI;
  private final int ldJ;
  private com.tencent.mm.plugin.emoji.f.p ldK;
  private int lde;
  private String ldf;
  private String ldg;
  private ad ldh;
  private View ldi;
  private BannerEmojiView ldj;
  private TextView ldk;
  private TextView ldl;
  private View ldm;
  private View ldn;
  private TextView ldo;
  private ImageView ldp;
  private TextView ldq;
  private TextView ldr;
  View lds;
  private List<xx> ldt;
  private View ldu;
  PreViewListGridView ldv;
  private a ldw;
  View ldx;
  View ldy;
  View ldz;
  private ak mHandler;
  private ListView mListView;

  public EmojiStoreV2DesignerUI()
  {
    AppMethodBeat.i(53594);
    this.ldt = new ArrayList();
    this.kYc = -1;
    this.kYi = 131074;
    this.kYj = 131075;
    this.kYk = 131076;
    this.kYl = "product_id";
    this.kYm = "progress";
    this.kYn = "status";
    this.kYt = new EmojiStoreV2DesignerUI.1(this);
    this.ldG = new EmojiStoreV2DesignerUI.8(this);
    this.ldH = 10001;
    this.ldI = 10002;
    this.ldJ = 10003;
    this.mHandler = new EmojiStoreV2DesignerUI.9(this);
    AppMethodBeat.o(53594);
  }

  private void Kh()
  {
    AppMethodBeat.i(53600);
    setMMTitle(this.kVJ);
    this.kYB = new com.tencent.mm.plugin.emoji.a.f(this.mController.ylL);
    this.mListView.addHeaderView(this.abB);
    this.mListView.setAdapter(this.kYB);
    this.kYB.kSQ = this;
    this.kYB.kSm = com.tencent.mm.emoji.a.e.OJ();
    this.kYB.kSn = false;
    this.ldk.setText(this.kVJ);
    this.ldD = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYq.aqs(String.valueOf(this.lde));
    this.kYr = new com.tencent.mm.plugin.emoji.model.i();
    this.kYr.jiq = this;
    this.kYr.kVA = this.kYB;
    this.kYr.kVD = 6;
    this.kYr.kVG = this;
    this.kYr.kVJ = this.kVJ;
    this.kYr.kVE = this.kVE;
    this.kYr.kVF = this.kVF;
    if (this.ldD != null)
    {
      c(com.tencent.mm.plugin.emoji.f.p.a(this.ldD));
      bv(this.ldD.vKl);
    }
    updateData();
    aJ(this.kYe);
    AppMethodBeat.o(53600);
  }

  private void aJ(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53604);
    this.hZu = true;
    this.ldK = new com.tencent.mm.plugin.emoji.f.p(this.lde, paramArrayOfByte);
    com.tencent.mm.kernel.g.RO().eJo.a(this.ldK, 0);
    AppMethodBeat.o(53604);
  }

  private void b(int paramInt, com.tencent.mm.plugin.emoji.model.f paramf)
  {
    boolean bool = true;
    AppMethodBeat.i(53608);
    switch (paramInt)
    {
    default:
      bool = false;
    case -1:
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      gw(bool);
      AppMethodBeat.o(53608);
      return;
      this.kYq = paramf;
      continue;
      this.kYq = paramf;
      continue;
      this.kYq = paramf;
      continue;
      if (this.kYq == null)
        this.kYq = new com.tencent.mm.plugin.emoji.model.f();
      this.kYq.ue(paramf.kVp);
      this.kYq.br(paramf.kVq);
    }
  }

  private void bme()
  {
    AppMethodBeat.i(53603);
    if ((this.ldh != null) && ((int)this.ldh.ewQ != 0))
    {
      this.ldn.setVisibility(0);
      this.ldm.setVisibility(0);
      if (!bo.isNullOrNil(this.ldh.Oi()))
      {
        this.ldo.setText(this.ldh.Oi());
        a.b.r(this.ldp, this.ldh.field_username);
        this.ldq.setEnabled(true);
        AppMethodBeat.o(53603);
      }
    }
    while (true)
    {
      return;
      this.ldo.setText(this.ldh.field_username);
      break;
      this.ldn.setVisibility(8);
      this.ldm.setVisibility(8);
      AppMethodBeat.o(53603);
    }
  }

  private void bv(List<xx> paramList)
  {
    int i = 1;
    AppMethodBeat.i(53606);
    String str = com.tencent.mm.m.g.Nu().getValue("ShowDesignerEmoji");
    ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get dynamic Disgner_Emoji_Store_Show config value:%s", new Object[] { str });
    if ((!bo.isNullOrNil(str)) && (bo.ank(str) == 1))
    {
      if ((paramList == null) || (paramList.size() <= 0) || (i == 0))
        break label119;
      this.lds.setVisibility(0);
      if (this.mHandler != null)
        this.mHandler.post(new EmojiStoreV2DesignerUI.2(this, paramList));
      this.ldw.bw(paramList);
      AppMethodBeat.o(53606);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label119: this.lds.setVisibility(8);
      AppMethodBeat.o(53606);
    }
  }

  private void c(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    AppMethodBeat.i(53607);
    b(this.kYc, paramf);
    this.kYc = 0;
    AppMethodBeat.o(53607);
  }

  private void gw(boolean paramBoolean)
  {
    AppMethodBeat.i(53609);
    if ((this.kYq != null) && (paramBoolean))
    {
      if (this.kYB != null)
        this.kYB.b(this.kYq);
      if (this.mHandler != null)
        this.mHandler.sendEmptyMessage(10002);
    }
    AppMethodBeat.o(53609);
  }

  private void updateData()
  {
    AppMethodBeat.i(53601);
    if (this.ldD == null)
    {
      ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "update data failed. data is null.");
      AppMethodBeat.o(53601);
    }
    while (true)
    {
      return;
      gv(true);
      if (!bo.isNullOrNil(this.ldD.vKE))
      {
        ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "biz name is :%s", new Object[] { this.ldD.vKE });
        this.ldh = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.ldD.vKE);
        label100: if (((this.ldh == null) || ((int)this.ldh.ewQ == 0)) && (ao.a.flu != null))
        {
          ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "getContact %s", new Object[] { this.ldD.vKE });
          ao.a.flu.a(this.ldD.vKE, "", this.ldG);
        }
        this.ldq.setText(2131299174);
        if (bo.isNullOrNil(this.ldD.Desc))
          break label298;
        this.ldl.setText(this.ldD.Desc);
        this.ldl.setVisibility(0);
      }
      while (true)
      {
        bme();
        if ((this.kYq != null) && (this.kYq.kVq != null) && (!this.kYq.kVq.isEmpty()))
          break label310;
        this.ldr.setVisibility(8);
        AppMethodBeat.o(53601);
        break;
        ab.w("MicroMsg.emoji.EmojiStoreV2DesignerUI", "mData.BizName is null");
        this.ldm.setVisibility(8);
        this.ldn.setVisibility(8);
        break label100;
        label298: this.ldl.setVisibility(8);
      }
      label310: this.ldr.setVisibility(0);
      AppMethodBeat.o(53601);
    }
  }

  protected final com.tencent.mm.plugin.emoji.f.g M(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(53614);
    this.kYu = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    paramString1 = this.kYu;
    AppMethodBeat.o(53614);
    return paramString1;
  }

  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    AppMethodBeat.i(53612);
    String str1 = parama.getProductId();
    if (TextUtils.isEmpty(parama.bjo()));
    for (String str2 = ""; ; str2 = parama.bjo())
    {
      ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str1, str2, Integer.valueOf(parama.bjn()) });
      parama.bjn();
      this.kYr.a(parama);
      AppMethodBeat.o(53612);
      return;
    }
  }

  final void bW(String paramString, int paramInt)
  {
    AppMethodBeat.i(53617);
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("status", paramInt);
    localMessage.what = 131076;
    if (this.mHandler != null)
      this.mHandler.sendMessage(localMessage);
    AppMethodBeat.o(53617);
  }

  final void bX(String paramString, int paramInt)
  {
    AppMethodBeat.i(53616);
    Message localMessage = Message.obtain();
    localMessage.getData().putString("product_id", paramString);
    localMessage.getData().putInt("progress", paramInt);
    localMessage.what = 131075;
    if (this.mHandler != null)
      this.mHandler.sendMessage(localMessage);
    AppMethodBeat.o(53616);
  }

  public final boolean bhk()
  {
    return true;
  }

  public final boolean bhm()
  {
    return false;
  }

  protected final void bkZ()
  {
    AppMethodBeat.i(53615);
    com.tencent.mm.kernel.g.RO().eJo.a(this.kYu, 0);
    AppMethodBeat.o(53615);
  }

  public final void bkf()
  {
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969362;
  }

  protected final void gv(boolean paramBoolean)
  {
    AppMethodBeat.i(53602);
    if (this.ldD == null)
    {
      ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "update header failed. data is null.");
      AppMethodBeat.o(53602);
    }
    while (true)
    {
      return;
      if ((this.ldj != null) && (!bo.isNullOrNil(this.ldD.wrl)))
      {
        Object localObject = this.ldD.wrl;
        com.tencent.mm.bz.a.getDensity(this);
        localObject = EmojiLogic.r("Designer", 8, (String)localObject);
        if (localObject == null)
        {
          if (paramBoolean)
          {
            o.ahp().a(this.ldD.wrl, null, com.tencent.mm.plugin.emoji.e.g.j("Designer", this.ldD.wrl, new Object[] { "Designer", "BANNER" }), new EmojiStoreV2DesignerUI.15(this));
            AppMethodBeat.o(53602);
          }
          else
          {
            ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "updateDesignerHeader failed");
            AppMethodBeat.o(53602);
          }
        }
        else
          this.ldj.setImageFilePath(((EmojiInfo)localObject).dve());
      }
      else
      {
        AppMethodBeat.o(53602);
      }
    }
  }

  public final void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(53613);
    M(paramString1, paramString2, paramString3);
    bkZ();
    AppMethodBeat.o(53613);
  }

  public final void initView()
  {
    AppMethodBeat.i(53599);
    if (!bo.isNullOrNil(this.kVJ))
      setMMTitle(this.kVJ);
    this.abB = v.hu(this.mController.ylL).inflate(2130969358, null);
    this.ldi = this.abB.findViewById(2131823542);
    this.ldj = ((BannerEmojiView)this.ldi.findViewById(2131823548));
    this.ldk = ((TextView)this.abB.findViewById(2131823543));
    this.ldl = ((TextView)this.abB.findViewById(2131823544));
    this.ldm = this.abB.findViewById(2131823545);
    this.ldn = this.abB.findViewById(2131823537);
    this.ldo = ((TextView)this.abB.findViewById(2131823539));
    this.ldp = ((ImageView)this.abB.findViewById(2131823538));
    this.ldq = ((TextView)this.abB.findViewById(2131823540));
    this.ldr = ((TextView)this.abB.findViewById(2131823547));
    this.lds = this.abB.findViewById(2131823550);
    this.ldu = this.abB.findViewById(2131823555);
    this.ldu.setOnClickListener(new EmojiStoreV2DesignerUI.10(this));
    this.ldv = ((PreViewListGridView)this.abB.findViewById(2131823553));
    this.ldw = new a(this.mController.ylL);
    this.ldw.lgn = new EmojiStoreV2DesignerUI.11(this);
    this.ldv.setAdapter(this.ldw);
    this.ldx = this.abB.findViewById(2131823551);
    this.ldy = this.abB.findViewById(2131823552);
    this.ldz = this.abB.findViewById(2131823555);
    this.ldA = ((TextView)this.abB.findViewById(2131823556));
    this.ldB = this.abB.findViewById(2131823554);
    this.ldC = ((MMPullDownView)findViewById(2131823536));
    this.ldC.setOnBottomLoadDataListener(this);
    this.ldC.setAtBottomCallBack(this);
    this.ldC.setBottomViewVisible(false);
    this.ldC.setIsBottomShowAll(false);
    this.mListView = ((ListView)findViewById(16908298));
    this.mListView.setOnItemClickListener(this);
    this.mListView.setOnScrollListener(this);
    this.ldn.setOnClickListener(new EmojiStoreV2DesignerUI.12(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(53591);
        EmojiStoreV2DesignerUI.this.finish();
        AppMethodBeat.o(53591);
        return false;
      }
    });
    addIconOptionMenu(0, 2131231770, new EmojiStoreV2DesignerUI.14(this));
    AppMethodBeat.o(53599);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53618);
    this.kYr.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 2002)
      if (paramInt2 == -1)
      {
        String str1 = paramIntent.getStringExtra("Select_Conv_User");
        if ((bo.isNullOrNil(str1)) || (this.ldD == null))
          break label224;
        ab.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", "..".concat(String.valueOf(str1)));
        String str2 = this.kVJ;
        String str3 = this.ldD.Desc;
        int i = this.lde;
        String str4 = this.ldg;
        String str5 = this.kVJ;
        String str6 = this.ldD.HeadUrl;
        String str7 = getResources().getString(2131296883);
        String str8 = str7 + str2;
        str7 = getString(2131297041);
        String str9 = getString(2131298420);
        ((com.tencent.mm.pluginsdk.i)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.i.class)).a(this, str1, str8, str7, str9, str6, new l.2(str1, str5, str3, i, str4, str2, str6, this));
      }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(53618);
      return;
      label224: ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "member or data is null.");
      continue;
      if ((paramInt1 == 2004) && (paramInt2 == -1))
        com.tencent.mm.ui.widget.snackbar.b.i(this, this.mController.ylL.getString(2131297044));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53595);
    super.onCreate(paramBundle);
    this.kWM = getIntent().getStringExtra("id");
    this.lde = getIntent().getIntExtra("uin", 0);
    this.kVJ = getIntent().getStringExtra("name");
    this.ldf = getIntent().getStringExtra("headurl");
    this.ldg = getIntent().getStringExtra("rediret_url");
    this.gOW = getIntent().getIntExtra("extra_scence", 0);
    this.kVE = getIntent().getLongExtra("searchID", 0L);
    this.kVF = bo.bc(getIntent().getStringExtra("docID"), "");
    paramBundle = getIntent().getStringExtra("sns_object_data");
    if (!TextUtils.isEmpty(paramBundle))
    {
      this.lde = EmojiLogic.Jm(paramBundle);
      this.kVJ = EmojiLogic.Jn(paramBundle);
      this.ldg = EmojiLogic.Ju(paramBundle);
    }
    initView();
    int i;
    if (!bo.isNullOrNil(this.kWM))
    {
      paramBundle = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYt.aqn(this.kWM);
      if ((paramBundle != null) && (paramBundle.woq != null) && (paramBundle.woq.DesignerUin != 0) && (!bo.isNullOrNil(paramBundle.woq.Name)))
      {
        this.lde = paramBundle.woq.DesignerUin;
        this.kVJ = paramBundle.woq.Name;
        ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "uin:%s name:%s", new Object[] { Integer.valueOf(this.lde), this.kVJ });
      }
    }
    else
    {
      i = 0;
      if (i != 0)
        break label452;
      Kh();
    }
    while (true)
    {
      com.tencent.mm.kernel.g.RO().eJo.a(239, this);
      com.tencent.mm.kernel.g.RO().eJo.a(720, this);
      com.tencent.mm.sdk.b.a.xxA.c(this.kYt);
      com.tencent.mm.plugin.report.service.h.pYm.e(12067, new Object[] { Integer.valueOf(1), "", "", "", "" });
      com.tencent.mm.plugin.report.service.h.pYm.e(12740, new Object[] { Integer.valueOf(2), com.tencent.mm.a.p.getString(this.lde), "", "", Integer.valueOf(this.gOW), Integer.valueOf(6) });
      AppMethodBeat.o(53595);
      return;
      i = 1;
      break;
      label452: this.ldE = new com.tencent.mm.plugin.emoji.f.i(this.kWM);
      com.tencent.mm.kernel.g.RO().eJo.a(this.ldE, 0);
      getString(2131297061);
      this.ldF = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new EmojiStoreV2DesignerUI.7(this));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53598);
    super.onDestroy();
    if (this.ldK != null)
      com.tencent.mm.kernel.g.RO().eJo.c(this.ldK);
    com.tencent.mm.kernel.g.RO().eJo.b(239, this);
    com.tencent.mm.kernel.g.RO().eJo.b(720, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.kYt);
    if (this.mHandler != null)
    {
      this.mHandler.removeMessages(10002);
      this.mHandler.removeMessages(10001);
      this.mHandler = null;
    }
    AppMethodBeat.o(53598);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(53611);
    Object localObject;
    if (this.kYB != null)
    {
      int i = this.mListView.getHeaderViewsCount();
      paramAdapterView = this.kYB.tX(paramInt - i);
      if (paramAdapterView != null)
      {
        paramView = new Intent();
        paramView.setClass(this, EmojiStoreDetailUI.class);
        localObject = paramAdapterView.kTb;
        if (localObject != null)
          break label84;
        paramAdapterView = null;
      }
    }
    while (true)
    {
      if (paramAdapterView != null)
        startActivity(paramAdapterView);
      AppMethodBeat.o(53611);
      return;
      label84: paramView.putExtra("extra_id", ((EmotionSummary)localObject).ProductID);
      paramView.putExtra("extra_name", ((EmotionSummary)localObject).PackName);
      paramView.putExtra("extra_copyright", ((EmotionSummary)localObject).PackCopyright);
      paramView.putExtra("extra_coverurl", ((EmotionSummary)localObject).CoverUrl);
      paramView.putExtra("extra_description", ((EmotionSummary)localObject).PackDesc);
      paramView.putExtra("extra_price", ((EmotionSummary)localObject).PackPrice);
      paramView.putExtra("extra_type", ((EmotionSummary)localObject).PackType);
      paramView.putExtra("extra_flag", ((EmotionSummary)localObject).PackFlag);
      paramView.putExtra("preceding_scence", 106);
      paramView.putExtra("download_entrance_scene", 6);
      paramView.putExtra("call_by", 1);
      paramView.putExtra("check_clickflag", false);
      paramView.putExtra("extra_status", paramAdapterView.mStatus);
      paramView.putExtra("extra_progress", paramAdapterView.EV);
      paramView.putExtra("searchID", this.kVE);
      localObject = getIntent().getStringExtra("to_talker_name");
      paramAdapterView = paramView;
      if (!bo.isNullOrNil((String)localObject))
      {
        paramView.putExtra("to_talker_name", (String)localObject);
        paramAdapterView = paramView;
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(53597);
    super.onPause();
    com.tencent.mm.kernel.g.RO().eJo.b(423, this);
    AppMethodBeat.o(53597);
  }

  public void onResume()
  {
    AppMethodBeat.i(53596);
    super.onResume();
    com.tencent.mm.kernel.g.RO().eJo.a(423, this);
    AppMethodBeat.o(53596);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53605);
    switch (paramm.getType())
    {
    default:
      ab.e("MicroMsg.emoji.EmojiStoreV2DesignerUI", "unknow scene type");
      AppMethodBeat.o(53605);
    case 423:
    case 720:
    case 239:
    }
    while (true)
    {
      return;
      if (!(paramm instanceof com.tencent.mm.plugin.emoji.f.g))
        break;
      com.tencent.mm.plugin.emoji.f.g localg = (com.tencent.mm.plugin.emoji.f.g)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bX(localg.kWz, 0);
        AppMethodBeat.o(53605);
      }
      else
      {
        paramString = localg.kWz;
        paramm = localg.kWB;
        String str = localg.kWA;
        com.tencent.mm.ui.base.h.a(this, getString(2131299104, new Object[] { str }), "", new EmojiStoreV2DesignerUI.3(this, paramString, paramm, str), new EmojiStoreV2DesignerUI.4(this));
        bW(localg.kWz, -1);
        AppMethodBeat.o(53605);
        continue;
        this.hZu = false;
        if ((paramInt1 == 0) || (paramInt1 == 4))
        {
          paramm = (com.tencent.mm.plugin.emoji.f.p)paramm;
          paramString = com.tencent.mm.plugin.emoji.f.p.a(paramm.bkE());
          if (paramInt2 == 0)
          {
            this.ldD = paramm.bkE();
            c(paramString);
          }
          while (true)
          {
            if ((this.kYe == null) && (this.ldD != null))
            {
              com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYq.a(String.valueOf(this.lde), paramm.bkE());
              this.ldt = this.ldD.vKl;
              bv(this.ldt);
            }
            this.kYe = paramm.kWS;
            AppMethodBeat.o(53605);
            break;
            if (paramInt2 == 2)
            {
              this.ldD = paramm.bkE();
              b(this.kYc, paramString);
              this.kYc = 2;
            }
            else if (paramInt2 == 3)
            {
              this.ldD = paramm.bkE();
              b(this.kYc, paramString);
              this.kYc = 1;
              ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get person designer failed errCode:%d", new Object[] { Integer.valueOf(paramInt2) });
            }
          }
        }
        ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "get person designer failed");
        AppMethodBeat.o(53605);
        continue;
        if ((this.ldF != null) && (this.ldF.isShowing()))
          this.ldF.dismiss();
        if ((paramInt2 == 0) && (paramInt1 == 0))
        {
          paramString = ((com.tencent.mm.plugin.emoji.f.i)paramm).bkx();
          if ((paramString != null) && (paramString.woq != null))
          {
            this.lde = paramString.woq.DesignerUin;
            this.kVJ = paramString.woq.Name;
            this.ldf = paramString.woq.HeadUrl;
            if (this.mHandler != null)
              this.mHandler.sendEmptyMessage(10003);
          }
          AppMethodBeat.o(53605);
        }
        else
        {
          showOptionMenu(0, false);
          com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299050), null, true);
          ab.e("MicroMsg.emoji.EmojiStoreV2DesignerUI", "open designer failed .");
          AppMethodBeat.o(53605);
        }
      }
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(53610);
    if ((paramInt == 0) && (paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1))
      if ((this.kYc == 0) || (this.hZu))
      {
        ab.d("MicroMsg.emoji.EmojiStoreV2DesignerUI", "No More List.");
        AppMethodBeat.o(53610);
      }
    while (true)
    {
      return;
      aJ(this.kYe);
      ab.i("MicroMsg.emoji.EmojiStoreV2DesignerUI", "[onScrollStateChanged] startLoadRemoteEmoji.");
      AppMethodBeat.o(53610);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI
 * JD-Core Version:    0.6.2
 */