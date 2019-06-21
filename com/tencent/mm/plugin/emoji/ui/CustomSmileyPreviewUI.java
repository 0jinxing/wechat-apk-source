package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.g.a.pe;
import com.tencent.mm.plugin.emoji.f.k;
import com.tencent.mm.plugin.emoji.f.l;
import com.tencent.mm.plugin.emoji.f.n;
import com.tencent.mm.plugin.emoji.model.i.a;
import com.tencent.mm.plugin.emoji.model.i.b;
import com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.protocal.protobuf.GetEmotionDetailResponse;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.protocal.protobuf.aic;
import com.tencent.mm.protocal.protobuf.aii;
import com.tencent.mm.protocal.protobuf.yg;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomSmileyPreviewUI extends MMActivity
  implements AdapterView.OnItemClickListener, com.tencent.mm.ai.f, i.a, i.b
{
  private final String TAG;
  private String cwg;
  private String ejD;
  private EmojiInfo exP;
  com.tencent.mm.plugin.emoji.a.f kYB;
  private View kYC;
  private ImageView kYD;
  private TextView kYE;
  private TextView kYF;
  private aic kYG;
  private EmotionDetail kYH;
  private String kYI;
  private ScaleRelativeLayout kYJ;
  private TextView kYK;
  private BaseEmojiView kYL;
  private com.tencent.mm.plugin.emoji.model.i kYM;
  private aii kYN;
  private long kYO;
  String kYP;
  private String kYQ;
  private boolean kYR;
  private Runnable kYS;
  private Runnable kYT;
  private com.tencent.mm.sdk.b.c kYU;
  private com.tencent.mm.sdk.b.c kYt;
  private com.tencent.mm.plugin.emoji.f.g kYu;
  private ListView mListView;

  public CustomSmileyPreviewUI()
  {
    AppMethodBeat.i(53240);
    this.TAG = "MicroMsg.emoji.CustomSmileyPreviewUI";
    this.kYH = new EmotionDetail();
    this.kYR = false;
    this.kYS = new CustomSmileyPreviewUI.1(this);
    this.kYT = new CustomSmileyPreviewUI.8(this);
    this.kYt = new CustomSmileyPreviewUI.9(this);
    this.kYU = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(53240);
  }

  private static void JJ(String paramString)
  {
    AppMethodBeat.i(53248);
    paramString = new com.tencent.mm.plugin.emoji.f.i(paramString);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(53248);
  }

  private void JK(String paramString)
  {
    AppMethodBeat.i(53249);
    this.kYG = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYt.aqn(paramString);
    AppMethodBeat.o(53249);
  }

  private void JL(String paramString)
  {
    AppMethodBeat.i(53250);
    this.kYN = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYq.aqt(paramString);
    AppMethodBeat.o(53250);
  }

  private void a(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, View paramView, String paramString)
  {
    AppMethodBeat.i(53254);
    paramView.setOnClickListener(new CustomSmileyPreviewUI.5(this, com.tencent.mm.pluginsdk.model.app.p.f(paramCustomSmileyPreviewUI, paramString, "message")));
    AppMethodBeat.o(53254);
  }

  private static void a(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, TextView paramTextView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(53256);
    paramBitmap = new BitmapDrawable(paramBitmap);
    int i = (int)paramCustomSmileyPreviewUI.getResources().getDimension(2131427762);
    paramBitmap.setBounds(0, 0, i, i);
    paramTextView.setCompoundDrawables(paramBitmap, null, null, null);
    AppMethodBeat.o(53256);
  }

  private static void a(CustomSmileyPreviewUI paramCustomSmileyPreviewUI, TextView paramTextView, String paramString)
  {
    AppMethodBeat.i(53255);
    paramString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 2, com.tencent.mm.bz.a.getDensity(paramCustomSmileyPreviewUI));
    if ((paramString != null) && (!paramString.isRecycled()))
    {
      a(paramCustomSmileyPreviewUI, paramTextView, paramString);
      AppMethodBeat.o(53255);
    }
    while (true)
    {
      return;
      a(paramCustomSmileyPreviewUI, paramTextView, BitmapFactory.decodeResource(paramCustomSmileyPreviewUI.getResources(), 2130839710));
      AppMethodBeat.o(53255);
    }
  }

  private void a(String paramString, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53259);
    if ((bo.isNullOrNil(paramString)) || (paramEmojiInfo == null))
      AppMethodBeat.o(53259);
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(paramString)) && (paramEmojiInfo.field_catalog != EmojiGroupInfo.yad) && (paramEmojiInfo.field_catalog != EmojiGroupInfo.yac) && ((paramEmojiInfo.field_type != EmojiInfo.yap) || (paramEmojiInfo.field_type != EmojiInfo.yaq)) && (com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYp.aqf(paramString)))
      {
        if (this.mListView != null)
          this.mListView.setVisibility(0);
        if (this.kYB != null)
        {
          this.kYB.kSl = this.kYR;
          this.kYB.notifyDataSetChanged();
          AppMethodBeat.o(53259);
        }
      }
      else
      {
        if (this.mListView != null)
          this.mListView.setVisibility(8);
        AppMethodBeat.o(53259);
      }
    }
  }

  private void blg()
  {
    AppMethodBeat.i(53247);
    this.kYC = findViewById(2131823537);
    this.kYD = ((ImageView)this.kYC.findViewById(2131823538));
    this.kYE = ((TextView)this.kYC.findViewById(2131823539));
    this.kYF = ((TextView)this.kYC.findViewById(2131823540));
    this.kYC.setVisibility(8);
    if ((this.exP != null) && (!bo.isNullOrNil(this.exP.field_designerID)))
    {
      JK(this.exP.field_designerID);
      JJ(this.exP.field_designerID);
    }
    if ((this.exP != null) && (!bo.isNullOrNil(this.exP.field_activityid)))
    {
      JL(this.exP.field_activityid);
      dM(this.exP.field_activityid, this.exP.field_md5);
    }
    blh();
    this.kYC.setOnClickListener(new CustomSmileyPreviewUI.15(this));
    AppMethodBeat.o(53247);
  }

  private void blh()
  {
    AppMethodBeat.i(53252);
    al.d(new CustomSmileyPreviewUI.2(this));
    AppMethodBeat.o(53252);
  }

  private com.tencent.mm.plugin.emoji.a.a.c bli()
  {
    AppMethodBeat.i(53258);
    Object localObject = new ArrayList();
    EmotionSummary localEmotionSummary = new EmotionSummary();
    localEmotionSummary.CoverUrl = this.kYH.CoverUrl;
    localEmotionSummary.IconUrl = this.kYH.IconUrl;
    localEmotionSummary.PackName = this.kYH.PackName;
    localEmotionSummary.PackFlag = this.kYH.PackFlag;
    localEmotionSummary.PackDesc = this.kYH.PackDesc;
    localEmotionSummary.PackExpire = this.kYH.PackExpire;
    localEmotionSummary.PackType = this.kYH.PackType;
    localEmotionSummary.PackPrice = this.kYH.PackPrice;
    localEmotionSummary.PriceNum = this.kYH.PriceNum;
    localEmotionSummary.PriceType = this.kYH.PriceType;
    localEmotionSummary.ProductID = this.kYH.ProductID;
    ((List)localObject).add(new com.tencent.mm.plugin.emoji.a.a.f(localEmotionSummary));
    localObject = new com.tencent.mm.plugin.emoji.a.a.c((List)localObject);
    AppMethodBeat.o(53258);
    return localObject;
  }

  private void blj()
  {
    AppMethodBeat.i(53262);
    Object localObject1 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYr.aqp(this.cwg);
    GetEmotionDetailResponse localGetEmotionDetailResponse;
    if ((localObject1 != null) && (((com.tencent.mm.storage.emotion.i)localObject1).field_content != null))
      localGetEmotionDetailResponse = new GetEmotionDetailResponse();
    try
    {
      localGetEmotionDetailResponse.parseFrom(((com.tencent.mm.storage.emotion.i)localObject1).field_content);
      this.kYH = localGetEmotionDetailResponse.EmotionDetail;
      this.kYI = ((com.tencent.mm.storage.emotion.i)localObject1).field_lan;
      if ((this.kYH == null) || (bo.isNullOrNil(this.kYI)) || (!this.kYI.equalsIgnoreCase(aa.gw(this.mController.ylL))))
      {
        localObject1 = new l(this.cwg, 1);
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject1, 0);
        AppMethodBeat.o(53262);
        return;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MicroMsg.emoji.CustomSmileyPreviewUI", "exception:%s", new Object[] { bo.l(localIOException) });
        continue;
        Object localObject2 = bli();
        if (this.kYB != null)
          this.kYB.a((com.tencent.mm.plugin.emoji.a.a.c)localObject2);
        localObject2 = new l(this.cwg, 1, this.kYH.Version);
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject2, 0);
        AppMethodBeat.o(53262);
      }
    }
  }

  private void dM(String paramString1, String paramString2)
  {
    AppMethodBeat.i(53251);
    if ((this.kYN == null) || ((this.kYN != null) && (this.kYN.wou != null) && (this.kYN.wou.wdZ < System.currentTimeMillis() / 1000L)))
    {
      paramString1 = new com.tencent.mm.plugin.emoji.f.j(paramString1, paramString2);
      com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
      AppMethodBeat.o(53251);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "no need to load emoji activity");
      AppMethodBeat.o(53251);
    }
  }

  private static boolean dg(String paramString)
  {
    AppMethodBeat.i(53253);
    boolean bool;
    if ((paramString == null) || (paramString.trim().length() == 0) || (paramString.equals("weixinfile")) || (paramString.equals("invalid_appname")))
    {
      bool = false;
      AppMethodBeat.o(53253);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(53253);
    }
  }

  public final void a(com.tencent.mm.plugin.emoji.a.a parama)
  {
    AppMethodBeat.i(53260);
    String str1 = parama.getProductId();
    if (TextUtils.isEmpty(parama.bjo()));
    for (String str2 = ""; ; str2 = parama.bjo())
    {
      ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", new Object[] { str1, str2, Integer.valueOf(parama.bjn()) });
      this.kYM.a(parama);
      AppMethodBeat.o(53260);
      return;
    }
  }

  public final void bkf()
  {
  }

  public final int getLayoutId()
  {
    return 2130969258;
  }

  public final void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(53261);
    this.kYu = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    com.tencent.mm.kernel.g.RO().eJo.a(this.kYu, 0);
    AppMethodBeat.o(53261);
  }

  public final void initView()
  {
    AppMethodBeat.i(53246);
    setMMTitle("");
    Object localObject1 = getIntent().getStringExtra("custom_smiley_preview_md5");
    this.kYO = getIntent().getLongExtra("msg_id", 0L);
    this.kYP = getIntent().getStringExtra("msg_sender");
    this.kYQ = getIntent().getStringExtra("msg_content");
    this.ejD = getIntent().getStringExtra("room_id");
    ab.d("MicroMsg.emoji.CustomSmileyPreviewUI", "[initView] md5:%s", new Object[] { localObject1 });
    String str1 = bo.nullAsNil((String)localObject1);
    if (TextUtils.isEmpty(str1))
    {
      ab.e("MicroMsg.emoji.CustomSmileyPreviewUI", "CustomSmileyPreviewUI ini fail md5 is fail");
      finish();
    }
    this.kYJ = ((ScaleRelativeLayout)findViewById(2131823186));
    this.kYK = ((TextView)findViewById(2131823189));
    this.kYL = ((BaseEmojiView)findViewById(2131821449));
    Object localObject2 = findViewById(2131823187);
    ((ImageView)findViewById(2131823188)).setImageDrawable(ah.f(this, 2131231237, -1));
    if ((com.tencent.mm.sdk.a.b.dnO()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED))
      this.kYL.setOnClickListener(new CustomSmileyPreviewUI.11(this));
    this.exP = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(str1);
    if (this.exP == null)
      finish();
    label280: String str2;
    Object localObject3;
    com.tencent.mm.pluginsdk.model.app.f localf;
    if (this.exP.duP())
    {
      this.kYL.setEmojiInfo(this.exP);
      if (!com.tencent.mm.plugin.emoji.h.b.y(this.exP))
        break label738;
      ((View)localObject2).setVisibility(0);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(53236);
          ScaleRelativeLayout localScaleRelativeLayout = CustomSmileyPreviewUI.f(CustomSmileyPreviewUI.this);
          float f1 = CustomSmileyPreviewUI.e(CustomSmileyPreviewUI.this).getMeasuredWidth();
          float f2 = CustomSmileyPreviewUI.e(CustomSmileyPreviewUI.this).getMeasuredHeight();
          localScaleRelativeLayout.aJf = Math.min(Math.min(localScaleRelativeLayout.getMeasuredWidth() / f1, localScaleRelativeLayout.getMeasuredHeight() / f2), 3.0F);
          localScaleRelativeLayout.lgE = (localScaleRelativeLayout.aJf * 1.5F);
          AppMethodBeat.o(53236);
        }
      });
      localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(this.exP.Aq());
      if ((this.kYK != null) && (!bo.isNullOrNil((String)localObject1)))
      {
        this.kYK.setText((CharSequence)localObject1);
        this.kYL.setContentDescription((CharSequence)localObject1);
      }
      str2 = getIntent().getStringExtra("custom_smiley_preview_appid");
      localObject2 = getIntent().getStringExtra("custom_smiley_preview_appname");
      localObject3 = (TextView)findViewById(2131821452);
      localf = com.tencent.mm.pluginsdk.model.app.g.bT(str2, true);
      localObject1 = localObject2;
      if (localf != null)
      {
        localObject1 = localObject2;
        if (localf.field_appName != null)
        {
          if (localf.field_appName.trim().length() > 0)
            break label747;
          localObject1 = localObject2;
        }
      }
      label424: if ((str2 == null) || (str2.length() <= 0) || (!dg((String)localObject1)))
        break label756;
      ((TextView)localObject3).setText(getString(2131299090, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.mController.ylL, localf, (String)localObject1) }));
      ((TextView)localObject3).setVisibility(0);
      a(this, (View)localObject3, str2);
      a(this, (TextView)localObject3, str2);
      label499: setBackBtn(new CustomSmileyPreviewUI.13(this));
      if ((this.exP.field_catalog == EmojiInfo.yal) || (this.exP.duS()))
        break label999;
    }
    label664: label738: label999: for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2;
      if ((this.exP.field_catalog != EmojiInfo.yal) && (!bo.isNullOrNil(this.exP.field_groupId)))
      {
        bool2 = bool1;
        if (!bo.isNullOrNil(this.exP.field_groupId))
        {
          bool2 = bool1;
          if (!((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Ji(this.exP.field_groupId));
        }
      }
      else
      {
        bool2 = true;
      }
      addIconOptionMenu(0, 2130839555, new CustomSmileyPreviewUI.14(this));
      showOptionMenu(bool2);
      blg();
      localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
      str2 = this.cwg;
      if (this.exP == null)
      {
        localObject1 = "";
        if (this.exP != null)
          break label988;
      }
      for (localObject2 = ""; ; localObject2 = this.exP.field_activityid)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject3).e(12067, new Object[] { Integer.valueOf(2), str2, str1, localObject1, localObject2 });
        AppMethodBeat.o(53246);
        return;
        localObject1 = com.tencent.mm.emoji.loader.a.exs;
        com.tencent.mm.emoji.loader.a.a(this.exP, this.kYL, null);
        break;
        ((View)localObject2).setVisibility(8);
        break label280;
        label747: localObject1 = localf.field_appName;
        break label424;
        label756: ((TextView)localObject3).setVisibility(8);
        this.cwg = this.exP.field_groupId;
        localObject1 = new k(this.cwg);
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject1, 0);
        this.mListView = ((ListView)findViewById(16908298));
        this.kYB = new com.tencent.mm.plugin.emoji.a.f(this.mController.ylL);
        this.kYB.kSQ = this;
        this.kYB.kSk = true;
        this.kYB.kSn = false;
        this.mListView.setOnItemClickListener(this);
        this.mListView.setAdapter(this.kYB);
        this.kYB.kSO = this.mListView;
        if (!bo.isNullOrNil(this.cwg))
          blj();
        this.kYM = new com.tencent.mm.plugin.emoji.model.i();
        this.kYM.jiq = this;
        this.kYM.kVA = this.kYB;
        this.kYM.kVD = 9;
        this.kYM.kVG = this;
        this.kYR = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYp.aqg(this.cwg);
        a(this.cwg, this.exP);
        break label499;
        localObject1 = this.exP.field_designerID;
        break label664;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53241);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.RO().eJo.a(412, this);
    com.tencent.mm.kernel.g.RO().eJo.a(521, this);
    com.tencent.mm.kernel.g.RO().eJo.a(411, this);
    com.tencent.mm.kernel.g.RO().eJo.a(239, this);
    com.tencent.mm.kernel.g.RO().eJo.a(368, this);
    com.tencent.mm.sdk.b.a.xxA.c(this.kYt);
    com.tencent.mm.sdk.b.a.xxA.c(this.kYU);
    initView();
    String str = "";
    paramBundle = str;
    if (this.kYG != null)
    {
      paramBundle = str;
      if (this.kYG.woq != null)
        paramBundle = com.tencent.mm.a.p.getString(this.kYG.woq.DesignerUin);
    }
    com.tencent.mm.plugin.report.service.h.pYm.e(12740, new Object[] { Integer.valueOf(4), paramBundle, this.exP.field_groupId, "", Integer.valueOf(9), Integer.valueOf(9) });
    AppMethodBeat.o(53241);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53245);
    com.tencent.mm.kernel.g.RO().eJo.b(412, this);
    com.tencent.mm.kernel.g.RO().eJo.b(521, this);
    com.tencent.mm.kernel.g.RO().eJo.b(411, this);
    com.tencent.mm.kernel.g.RO().eJo.b(239, this);
    com.tencent.mm.kernel.g.RO().eJo.b(368, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.kYt);
    com.tencent.mm.sdk.b.a.xxA.d(this.kYU);
    super.onDestroy();
    al.af(this.kYS);
    al.af(this.kYT);
    AppMethodBeat.o(53245);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(53263);
    if ((this.kYB == null) || (paramInt < 0) || (paramInt >= this.kYB.getCount()))
    {
      AppMethodBeat.o(53263);
      return;
    }
    com.tencent.mm.plugin.report.service.h.pYm.e(12789, new Object[] { Integer.valueOf(4), this.exP.Aq(), Integer.valueOf(1), this.exP.field_designerID, this.exP.field_groupId, "", "", "", "", this.exP.field_activityid });
    paramAdapterView = this.kYB.tX(paramInt);
    paramView = new Intent();
    paramView.setClass(this, EmojiStoreDetailUI.class);
    Object localObject = paramAdapterView.kTb;
    if (localObject == null)
      paramAdapterView = null;
    while (true)
    {
      startActivity(paramAdapterView);
      AppMethodBeat.o(53263);
      break;
      paramView.putExtra("extra_id", ((EmotionSummary)localObject).ProductID);
      paramView.putExtra("extra_name", ((EmotionSummary)localObject).PackName);
      paramView.putExtra("extra_copyright", ((EmotionSummary)localObject).PackCopyright);
      paramView.putExtra("extra_coverurl", ((EmotionSummary)localObject).CoverUrl);
      paramView.putExtra("extra_description", ((EmotionSummary)localObject).PackDesc);
      paramView.putExtra("extra_price", ((EmotionSummary)localObject).PackPrice);
      paramView.putExtra("extra_type", ((EmotionSummary)localObject).PackType);
      paramView.putExtra("extra_flag", ((EmotionSummary)localObject).PackFlag);
      paramView.putExtra("preceding_scence", 4);
      paramView.putExtra("call_by", 1);
      paramView.putExtra("download_entrance_scene", 9);
      paramView.putExtra("check_clickflag", true);
      paramView.putExtra("extra_status", paramAdapterView.mStatus);
      paramView.putExtra("extra_progress", paramAdapterView.EV);
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
    AppMethodBeat.i(53244);
    super.onPause();
    AppMethodBeat.o(53244);
  }

  public void onResume()
  {
    AppMethodBeat.i(53242);
    super.onResume();
    AppMethodBeat.o(53242);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53257);
    switch (paramm.getType())
    {
    default:
    case 412:
    case 521:
    case 411:
    case 239:
    case 368:
    }
    while (true)
    {
      AppMethodBeat.o(53257);
      while (true)
      {
        return;
        if (!(paramm instanceof l))
          break;
        paramString = (l)paramm;
        if (paramInt1 == 0)
        {
          if (paramInt2 == 0)
          {
            this.kYH = paramString.bkz();
            if ((this.kYH != null) && (!TextUtils.isEmpty(this.cwg)) && (this.cwg.equals(this.kYH.ProductID)))
            {
              paramString = bli();
              if (this.kYB != null)
                this.kYB.a(paramString);
              ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd]" + this.kYH.ProductID);
              AppMethodBeat.o(53257);
              continue;
            }
            paramm = this.cwg;
            if (this.kYH == null);
            for (paramString = ""; ; paramString = this.kYH.ProductID)
            {
              ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd no same product id] cureent:%s,scene:%s", new Object[] { paramm, paramString });
              AppMethodBeat.o(53257);
              break;
            }
          }
          if (paramInt2 != 1)
            break;
          AppMethodBeat.o(53257);
          continue;
        }
        if (paramInt2 != 5)
          break;
        if ((this.kYH != null) && (paramString.bkz() != null) && (!TextUtils.isEmpty(this.cwg)) && (this.cwg.equals(this.kYH.ProductID)) && (this.kYH.PackFlag != paramString.bkz().PackFlag))
        {
          this.kYH.PackFlag = paramString.bkz().PackFlag;
          paramString = bli();
          if (this.kYB != null)
            this.kYB.a(paramString);
          ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd]" + this.kYH.ProductID);
          AppMethodBeat.o(53257);
        }
        else
        {
          paramm = this.cwg;
          if (this.kYH == null);
          for (paramString = ""; ; paramString = this.kYH.ProductID)
          {
            ab.i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd no same product id or PackFlag is same.] cureent:%s,scene:%s", new Object[] { paramm, paramString });
            AppMethodBeat.o(53257);
            break;
          }
          if (paramInt2 != 0)
            break;
          al.d(this.kYT);
          al.n(this.kYS, 500L);
          AppMethodBeat.o(53257);
          continue;
          if (!(paramm instanceof n))
            break;
          paramString = (n)paramm;
          com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYq.a(12, paramString.bkB());
          AppMethodBeat.o(53257);
          continue;
          this.kYG = ((com.tencent.mm.plugin.emoji.f.i)paramm).bkx();
          blh();
          AppMethodBeat.o(53257);
          continue;
          if (paramInt2 != 0)
            break label681;
          paramString = (com.tencent.mm.plugin.emoji.f.j)paramm;
          paramm = (aii)paramString.ehh.fsH.fsP;
          if ((paramm != null) && (paramm.wou != null))
          {
            paramm.wou.wdZ = ((int)(System.currentTimeMillis() / 1000L) + paramm.wou.wdZ);
            ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYq.a(paramString.kWN, paramm);
          }
          this.kYN = paramm;
          blh();
          AppMethodBeat.o(53257);
        }
      }
      label681: ab.w("MicroMsg.emoji.CustomSmileyPreviewUI", "get activity failed.");
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(53243);
    super.onStart();
    AppMethodBeat.o(53243);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI
 * JD-Core Version:    0.6.2
 */