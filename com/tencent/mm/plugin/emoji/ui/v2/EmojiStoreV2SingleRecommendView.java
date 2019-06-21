package com.tencent.mm.plugin.emoji.ui.v2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.emoji.model.i.b;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.ui.v;

public class EmojiStoreV2SingleRecommendView extends ChatFooterPanel.RecommendView
  implements View.OnClickListener, i.b
{
  private ViewGroup ius;
  private String kWl;
  private com.tencent.mm.plugin.emoji.f.g kXT;
  protected final int kYi;
  private final int kYj;
  private final int kYk;
  private final String kYl;
  private final String kYm;
  private final String kYn;
  private ImageView laS;
  private String lbl;
  private ak lda;
  private ImageView lfE;
  private TextView lfF;
  private TextView lfG;
  private Button lfH;
  private ProgressBar lfI;
  private EmojiGroupInfo lfJ;
  private boolean lfK;
  private c lfL;

  public EmojiStoreV2SingleRecommendView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53787);
    this.kYi = 131074;
    this.kYj = 131075;
    this.kYk = 131076;
    this.kYl = "product_id";
    this.kYm = "progress";
    this.kYn = "status";
    this.lfK = true;
    this.lda = new EmojiStoreV2SingleRecommendView.1(this);
    this.lfL = new EmojiStoreV2SingleRecommendView.2(this);
    init();
    AppMethodBeat.o(53787);
  }

  @TargetApi(11)
  public EmojiStoreV2SingleRecommendView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53788);
    this.kYi = 131074;
    this.kYj = 131075;
    this.kYk = 131076;
    this.kYl = "product_id";
    this.kYm = "progress";
    this.kYn = "status";
    this.lfK = true;
    this.lda = new EmojiStoreV2SingleRecommendView.1(this);
    this.lfL = new EmojiStoreV2SingleRecommendView.2(this);
    init();
    AppMethodBeat.o(53788);
  }

  public EmojiStoreV2SingleRecommendView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(53786);
    this.kYi = 131074;
    this.kYj = 131075;
    this.kYk = 131076;
    this.kYl = "product_id";
    this.kYm = "progress";
    this.kYn = "status";
    this.lfK = true;
    this.lda = new EmojiStoreV2SingleRecommendView.1(this);
    this.lfL = new EmojiStoreV2SingleRecommendView.2(this);
    this.lfK = paramBoolean;
    init();
    AppMethodBeat.o(53786);
  }

  private void f(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(53796);
    Intent localIntent = new Intent();
    localIntent.setClass(getContext(), EmojiStoreDetailUI.class);
    localIntent.putExtra("extra_id", paramEmotionSummary.ProductID);
    localIntent.putExtra("extra_name", paramEmotionSummary.PackName);
    localIntent.putExtra("extra_copyright", paramEmotionSummary.PackCopyright);
    localIntent.putExtra("extra_coverurl", paramEmotionSummary.CoverUrl);
    localIntent.putExtra("extra_description", paramEmotionSummary.PackDesc);
    localIntent.putExtra("extra_price", paramEmotionSummary.PackPrice);
    localIntent.putExtra("extra_type", paramEmotionSummary.PackType);
    localIntent.putExtra("extra_flag", paramEmotionSummary.PackFlag);
    localIntent.putExtra("extra_price_num", paramEmotionSummary.PriceNum);
    localIntent.putExtra("extra_price_type", paramEmotionSummary.PriceType);
    localIntent.putExtra("preceding_scence", 108);
    localIntent.putExtra("call_by", 1);
    localIntent.putExtra("download_entrance_scene", 8);
    localIntent.putExtra("check_clickflag", false);
    getContext().startActivity(localIntent);
    AppMethodBeat.o(53796);
  }

  private void init()
  {
    AppMethodBeat.i(53791);
    if (this.lfK);
    for (this.ius = ((ViewGroup)v.hu(getContext()).inflate(2130969382, this)); ; this.ius = ((ViewGroup)v.hu(getContext()).inflate(2130969383, this)))
    {
      this.laS = ((ImageView)this.ius.findViewById(2131823518));
      this.lfE = ((ImageView)this.ius.findViewById(2131823591));
      this.lfF = ((TextView)this.ius.findViewById(2131823512));
      this.lfG = ((TextView)this.ius.findViewById(2131823592));
      this.lfH = ((Button)this.ius.findViewById(2131823593));
      this.lfI = ((ProgressBar)this.ius.findViewById(2131823517));
      AppMethodBeat.o(53791);
      return;
    }
  }

  private void setTitleName(EmojiGroupInfo paramEmojiGroupInfo)
  {
    AppMethodBeat.i(53793);
    if (this.lfH != null);
    switch (paramEmojiGroupInfo.field_buttonType)
    {
    default:
      this.lfH.setVisibility(8);
      if (!bo.isNullOrNil(paramEmojiGroupInfo.field_packName))
        this.lfF.setText(paramEmojiGroupInfo.field_packName);
      if (this.lfG != null)
        if (!bo.isNullOrNil(paramEmojiGroupInfo.field_recommandWord))
        {
          this.lfG.setVisibility(0);
          this.lfG.setText(paramEmojiGroupInfo.field_recommandWord);
          AppMethodBeat.o(53793);
        }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.lfH.setVisibility(0);
      this.lfH.setText(2131299103);
      break;
      this.lfH.setVisibility(0);
      this.lfH.setText(2131301432);
      break;
      this.lfG.setVisibility(8);
      AppMethodBeat.o(53793);
    }
  }

  public final void bkf()
  {
  }

  public final void i(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(53794);
    paramString1 = new com.tencent.mm.plugin.emoji.f.g(paramString1, paramString2, paramString3);
    com.tencent.mm.kernel.g.RO().eJo.a(paramString1, 0);
    AppMethodBeat.o(53794);
  }

  public final void n(Message paramMessage)
  {
    AppMethodBeat.i(53795);
    if (this.lda != null)
      this.lda.sendMessage(paramMessage);
    AppMethodBeat.o(53795);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(53789);
    super.onAttachedToWindow();
    ab.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onAttachedToWindow");
    com.tencent.mm.sdk.b.a.xxA.c(this.lfL);
    AppMethodBeat.o(53789);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(53797);
    if (paramView == this.laS)
    {
      j.getEmojiStorageMgr().xYo.aqd(this.kWl);
      h.pYm.e(12068, new Object[] { Integer.valueOf(2), this.kWl, Integer.valueOf(this.lfJ.field_recommandType) });
      AppMethodBeat.o(53797);
    }
    while (true)
    {
      return;
      if (paramView == this.ius)
      {
        f(this.lfJ.duw());
        h.pYm.e(12068, new Object[] { Integer.valueOf(4), this.kWl, Integer.valueOf(this.lfJ.field_recommandType) });
        AppMethodBeat.o(53797);
      }
      else if (paramView == this.lfH)
      {
        if (this.lfJ.field_buttonType == 1)
        {
          this.kXT = new com.tencent.mm.plugin.emoji.f.g(this.kWl);
          com.tencent.mm.kernel.g.RO().eJo.a(this.kXT, 0);
          h.pYm.e(12068, new Object[] { Integer.valueOf(3), this.kWl, Integer.valueOf(this.lfJ.field_recommandType) });
          h.pYm.e(12066, new Object[] { Integer.valueOf(0), Integer.valueOf(8), "", this.kWl });
          AppMethodBeat.o(53797);
        }
        else if (this.lfJ.field_buttonType == 2)
        {
          f(this.lfJ.duw());
          h.pYm.e(12068, new Object[] { Integer.valueOf(4), this.kWl, Integer.valueOf(this.lfJ.field_recommandType) });
          AppMethodBeat.o(53797);
        }
        else
        {
          ab.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "unknown buttonType do nothing.");
          AppMethodBeat.o(53797);
        }
      }
      else
      {
        ab.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "do nothing");
        AppMethodBeat.o(53797);
      }
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(53790);
    super.onDetachedFromWindow();
    ab.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onDetachedFromWindow");
    com.tencent.mm.sdk.b.a.xxA.d(this.lfL);
    AppMethodBeat.o(53790);
  }

  public void setProductID(String paramString)
  {
    AppMethodBeat.i(53792);
    this.kWl = paramString;
    if (bo.isNullOrNil(this.kWl))
    {
      this.ius.setVisibility(8);
      AppMethodBeat.o(53792);
    }
    while (true)
    {
      return;
      this.lfJ = j.getEmojiStorageMgr().xYo.bZ(this.kWl, false);
      this.laS.setOnClickListener(this);
      this.lfH.setOnClickListener(this);
      this.ius.setOnClickListener(this);
      setTitleName(this.lfJ);
      this.lfI.setVisibility(8);
      o.ahp().a(this.lfJ.field_BigIconUrl, this.lfE, com.tencent.mm.plugin.emoji.e.g.j(this.kWl, this.lfJ.field_BigIconUrl, new Object[0]));
      AppMethodBeat.o(53792);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView
 * JD-Core Version:    0.6.2
 */