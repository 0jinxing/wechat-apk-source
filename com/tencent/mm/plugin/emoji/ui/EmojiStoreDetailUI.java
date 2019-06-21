package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.e.l.1;
import com.tencent.mm.plugin.emoji.f.k;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.ui.v2.DonorsAvatarView;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardResponse;
import com.tencent.mm.protocal.protobuf.PackThumbExt;
import com.tencent.mm.protocal.protobuf.PersonalDesigner;
import com.tencent.mm.protocal.protobuf.aik;
import com.tencent.mm.protocal.protobuf.yi;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoSizeTextView;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.LinkedList;

public class EmojiStoreDetailUI extends MMActivity
  implements View.OnClickListener, f, k.a
{
  private int EV;
  private View Ek;
  private int eno;
  private ProgressDialog gqo;
  private ProgressBar kRN;
  private long kVE;
  private String kVF;
  private com.tencent.mm.plugin.emoji.h.c kVI;
  private String kWA;
  private String kWB;
  private String kWz;
  private EmotionDetail kYH;
  private String kYI;
  private int kYp;
  private com.tencent.mm.sdk.b.c kYt;
  private boolean laA;
  private int laB;
  private com.tencent.mm.plugin.emoji.f.l laC;
  private com.tencent.mm.plugin.emoji.f.g laD;
  private com.tencent.mm.plugin.emoji.f.o laE;
  private EmojiStoreDetailUI.a laF;
  private GetEmotionRewardResponse laG;
  private boolean laH;
  private TextView laI;
  private View laJ;
  private EmojiDetailScrollView laK;
  private BannerEmojiView laL;
  private TextView laM;
  private MMAutoSizeTextView laN;
  private TextView laO;
  private TextView laP;
  private TextView laQ;
  private EmojiDetailGridView laR;
  private ImageView laS;
  private View laT;
  private TextView laU;
  private TextView laV;
  private int laW;
  private View laX;
  private ProgressBar laY;
  private View laZ;
  private int lax;
  private String lay;
  private boolean laz;
  private View.OnClickListener lbA;
  private View.OnClickListener lbB;
  private View.OnClickListener lbC;
  private com.tencent.mm.at.a.c.i lbD;
  private com.tencent.mm.at.a.c.j lbE;
  private h.a lbF;
  private ImageView lba;
  private TextView lbb;
  private View lbc;
  private View lbd;
  private TextView lbe;
  private Button lbf;
  private DonorsAvatarView lbg;
  private TextView lbh;
  private int lbi;
  private int lbj;
  private int lbk;
  private String lbl;
  private boolean lbm;
  private int lbn;
  private int lbo;
  private String lbp;
  private String lbq;
  private String lbr;
  private String[] lbs;
  private boolean lbt;
  private View lbu;
  private boolean lbv;
  private aik lbw;
  private boolean lbx;
  private boolean lby;
  private View.OnClickListener lbz;
  private Context mContext;
  private ak mHandler;
  private int mNumColumns;

  public EmojiStoreDetailUI()
  {
    AppMethodBeat.i(53449);
    this.laA = false;
    this.laB = -1;
    this.kYH = new EmotionDetail();
    this.kYI = "";
    this.laG = null;
    this.kVE = 0L;
    this.kVF = "";
    this.lbo = -1;
    this.lbs = new String[1];
    this.lbt = false;
    this.lbv = true;
    this.lbx = false;
    this.lby = true;
    this.kYt = new EmojiStoreDetailUI.1(this);
    this.lbz = new EmojiStoreDetailUI.12(this);
    this.lbA = new EmojiStoreDetailUI.16(this);
    this.lbB = new EmojiStoreDetailUI.17(this);
    this.lbC = new EmojiStoreDetailUI.18(this);
    this.mHandler = new EmojiStoreDetailUI.19(this);
    this.lbD = new EmojiStoreDetailUI.20(this);
    this.lbE = new EmojiStoreDetailUI.21(this);
    this.lbF = new EmojiStoreDetailUI.15(this);
    AppMethodBeat.o(53449);
  }

  private void JD(String paramString)
  {
    AppMethodBeat.i(53465);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = getString(2131299072);
    com.tencent.mm.ui.base.h.a(this, str, "", new EmojiStoreDetailUI.4(this));
    AppMethodBeat.o(53465);
  }

  private void blA()
  {
    AppMethodBeat.i(53461);
    this.Ek.setVisibility(0);
    this.laJ.setVisibility(8);
    this.laK.setVisibility(8);
    this.laI.setText(2131299065);
    AppMethodBeat.o(53461);
  }

  private void blB()
  {
    AppMethodBeat.i(53462);
    ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[handleLoadDataFailed]");
    if ((this.kYH == null) || (this.kYH.PackFlag == 0))
    {
      this.Ek.setVisibility(0);
      this.laJ.setVisibility(8);
    }
    AppMethodBeat.o(53462);
  }

  private void blC()
  {
    AppMethodBeat.i(53466);
    this.laG = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYs.aqq(this.kWz);
    AppMethodBeat.o(53466);
  }

  private void blD()
  {
    AppMethodBeat.i(53467);
    if ((com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackFlag, 64)) && (com.tencent.mm.emoji.a.e.OJ()))
    {
      this.laE = new com.tencent.mm.plugin.emoji.f.o(this.kWz, com.tencent.mm.plugin.emoji.f.o.kWX);
      com.tencent.mm.kernel.g.RO().eJo.a(this.laE, 0);
    }
    AppMethodBeat.o(53467);
  }

  private boolean blE()
  {
    AppMethodBeat.i(53468);
    boolean bool = com.tencent.mm.plugin.emoji.h.a.blE();
    this.laH = bool;
    if (bool);
    for (int i = 7; ; i = 3)
    {
      this.laB = i;
      AppMethodBeat.o(53468);
      return bool;
    }
  }

  private void blF()
  {
    AppMethodBeat.i(53469);
    if (!bo.isNullOrNil(this.kYH.PackName))
      setMMTitle(this.kYH.PackName);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "mData.PanelUrl:%s", new Object[] { this.kYH.PanelUrl });
    this.laJ.setVisibility(0);
    this.Ek.setVisibility(8);
    gp(true);
    this.laN.setText(this.kYH.PackName);
    this.laO.setText(this.kYH.PackCopyright);
    this.laQ.setText(this.kYH.PackDesc);
    if (com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackType, 1))
      this.laM.setVisibility(8);
    while (true)
    {
      blJ();
      blK();
      blL();
      blM();
      blN();
      this.laN.setMaxWidth(this.laW - this.laX.getWidth() - com.tencent.mm.bz.a.al(this.mController.ylL, 2131427812) * 2 - this.laM.getWidth() - com.tencent.mm.bz.a.al(this.mController.ylL, 2131427785) * 2);
      this.laN.setVisibility(8);
      this.laN.setVisibility(0);
      blG();
      blI();
      blH();
      AppMethodBeat.o(53469);
      return;
      this.laM.setVisibility(0);
      this.laM.setText(2131299195);
    }
  }

  private void blG()
  {
    AppMethodBeat.i(53471);
    if ((this.kYH.PersonalDesigner != null) && (this.kYH.PersonalDesigner.DesignerUin != 0) && (this.lbk != 6))
    {
      this.lbc.setVisibility(0);
      this.laZ.setVisibility(0);
      com.tencent.mm.at.o.ahp().a(this.kYH.PersonalDesigner.HeadUrl, this.lba, com.tencent.mm.plugin.emoji.e.g.dI(this.kWz, this.kYH.PersonalDesigner.HeadUrl));
      this.lbb.setText(this.kYH.PersonalDesigner.Name);
      this.laZ.setOnClickListener(new EmojiStoreDetailUI.6(this));
      AppMethodBeat.o(53471);
    }
    while (true)
    {
      return;
      this.lbc.setVisibility(8);
      this.laZ.setVisibility(8);
      AppMethodBeat.o(53471);
    }
  }

  private void blI()
  {
    AppMethodBeat.i(53473);
    LinearLayout.LayoutParams localLayoutParams2;
    if ((this.kYH.PackFlag & 0x20) == 32)
    {
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.laV.getLayoutParams();
      localLayoutParams2 = (LinearLayout.LayoutParams)this.laU.getLayoutParams();
      this.laV.setVisibility(0);
      localLayoutParams1.weight = 1.0F;
      localLayoutParams1.gravity = 3;
      localLayoutParams1.leftMargin = com.tencent.mm.bz.a.al(this.mController.ylL, 2131427812);
      this.laV.setLayoutParams(localLayoutParams1);
      this.laV.setGravity(3);
      localLayoutParams2.weight = 1.0F;
      localLayoutParams2.gravity = 5;
      localLayoutParams2.rightMargin = com.tencent.mm.bz.a.al(this.mController.ylL, 2131427812);
      this.laU.setLayoutParams(localLayoutParams2);
      this.laU.setGravity(5);
      AppMethodBeat.o(53473);
    }
    while (true)
    {
      return;
      localLayoutParams2 = (LinearLayout.LayoutParams)this.laU.getLayoutParams();
      localLayoutParams2.gravity = 17;
      this.laU.setLayoutParams(localLayoutParams2);
      this.laU.setGravity(17);
      this.laV.setVisibility(8);
      AppMethodBeat.o(53473);
    }
  }

  private void blJ()
  {
    AppMethodBeat.i(53474);
    if (com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackType, 8))
    {
      this.lbj = 0;
      ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "PackFlag:%d", new Object[] { Integer.valueOf(this.kYH.PackFlag) });
      if ((!com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackFlag, 8)) || (!com.tencent.mm.plugin.emoji.a.a.e.uc(this.kYH.PackType)))
        break label164;
      this.laB = 8;
    }
    while (true)
    {
      if (this.laH)
        this.laB = 7;
      AppMethodBeat.o(53474);
      return;
      if (com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackType, 4))
      {
        this.lbj = 0;
        break;
      }
      if ((!this.lbm) && (TextUtils.isEmpty(this.kYH.PackPrice)))
      {
        this.lbj = 0;
        break;
      }
      this.lbj = 1;
      break;
      label164: if ((com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackFlag, 1)) || (com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackType, 8)))
        this.laB = 3;
      else if (com.tencent.mm.plugin.emoji.a.a.e.uc(this.kYH.PackType))
        this.laB = 0;
      else if ((!this.lbm) && ((TextUtils.isEmpty(this.kYH.PriceNum)) || (this.kYH.PriceNum.equals("0"))))
        this.laB = 0;
      else if (this.lbm)
      {
        if (TextUtils.isEmpty(this.lbp))
          this.laB = this.lbn;
        else
          this.laB = 4;
      }
      else
        this.laB = 4;
    }
  }

  private void blK()
  {
    AppMethodBeat.i(53475);
    while (true)
    {
      if (com.tencent.mm.plugin.emoji.h.a.JW(this.kWz))
        blE();
      switch (this.laB)
      {
      case 1:
      case 2:
      case 9:
      default:
        ab.w("MicroMsg.emoji.EmojiStoreDetailUI", "unknow product status:%d", new Object[] { Integer.valueOf(this.laB) });
        AppMethodBeat.o(53475);
      case 8:
      case 0:
      case 4:
      case 3:
      case 6:
      case 7:
      case 5:
      case 11:
      case 10:
      case 12:
        while (true)
        {
          return;
          this.laY.setVisibility(8);
          this.laP.setTextColor(getResources().getColorStateList(2131689975));
          this.laP.setBackgroundResource(2130838005);
          this.laP.setText(2131299106);
          this.laP.setEnabled(false);
          AppMethodBeat.o(53475);
          continue;
          this.laY.setVisibility(8);
          this.laP.setTextColor(getResources().getColorStateList(2131690780));
          this.laP.setBackgroundResource(2130838000);
          this.laP.setText(2131299103);
          this.laP.setEnabled(true);
          AppMethodBeat.o(53475);
          continue;
          this.laY.setVisibility(8);
          this.laP.setTextColor(getResources().getColorStateList(2131690780));
          this.laP.setBackgroundResource(2130838000);
          this.laP.setEnabled(true);
          if (this.lbm)
          {
            if (bo.isNullOrNil(this.lbp))
            {
              this.laP.setText("");
              AppMethodBeat.o(53475);
            }
            else
            {
              this.laP.setText(this.lbp);
              AppMethodBeat.o(53475);
            }
          }
          else
          {
            this.laP.setText(this.kYH.PackPrice);
            this.laB = 4;
            AppMethodBeat.o(53475);
            continue;
            this.laY.setVisibility(8);
            this.laP.setTextColor(getResources().getColorStateList(2131690780));
            this.laP.setBackgroundResource(2130838000);
            this.laP.setText(2131299103);
            this.laP.setEnabled(true);
            AppMethodBeat.o(53475);
            continue;
            this.laY.setVisibility(8);
            this.laP.setEnabled(false);
            this.laT.setVisibility(0);
            this.laS.setVisibility(0);
            this.laP.setVisibility(4);
            if (this.lax == 3)
              break;
            AppMethodBeat.o(53475);
            continue;
            this.laY.setVisibility(8);
            this.laP.setVisibility(0);
            this.laP.setEnabled(true);
            this.laP.setBackgroundResource(2130838000);
            this.laP.setText(2131299172);
            this.laT.setVisibility(8);
            this.kRN.setProgress(0);
            this.laS.setVisibility(4);
            if (this.lax == 3)
              break;
            AppMethodBeat.o(53475);
            continue;
            this.laY.setVisibility(8);
            this.laP.setBackgroundResource(2130838000);
            this.laP.setText(2131299103);
            this.laP.setEnabled(true);
            this.laY.setVisibility(0);
            this.laP.setVisibility(0);
            this.laP.setBackgroundResource(2130840821);
            this.laP.setText("");
            this.laP.setEnabled(false);
            this.laT.setVisibility(8);
            this.kRN.setProgress(0);
            this.laS.setVisibility(4);
            AppMethodBeat.o(53475);
            continue;
            this.laY.setVisibility(8);
            this.laP.setVisibility(0);
            this.laP.setBackgroundResource(2130838000);
            this.laP.setText(2131299127);
            this.laP.setEnabled(true);
            this.laT.setVisibility(8);
            this.kRN.setProgress(0);
            this.laS.setVisibility(4);
            AppMethodBeat.o(53475);
          }
        }
      case -1:
      }
      blJ();
    }
  }

  private void blL()
  {
    AppMethodBeat.i(53476);
    if ((this.lbx) && ((this.lbw == null) || ((this.lbw.wox & 0x1) != 1)) && ((this.kYH == null) || (!com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackFlag, 1))) && (this.lbw != null) && (!TextUtils.isEmpty(this.lbw.wow)))
    {
      this.laP.setText(this.lbw.wow);
      this.laP.setTextColor(this.mController.ylL.getResources().getColor(2131690155));
      this.laP.setBackgroundDrawable(null);
      this.laP.setEnabled(false);
    }
    AppMethodBeat.o(53476);
  }

  private void blM()
  {
    AppMethodBeat.i(53477);
    if ((!com.tencent.mm.plugin.emoji.h.a.JW(this.kWz)) && ((this.kYH.ThumbExtList == null) || (this.kYH.ThumbExtList.size() <= 0) || (((PackThumbExt)this.kYH.ThumbExtList.get(0)).PreviewUrl == null)))
      this.lbu.setVisibility(8);
    while (true)
    {
      this.laR.setProductId(this.kWz);
      if (this.laF != null)
        this.laF.notifyDataSetInvalidated();
      AppMethodBeat.o(53477);
      return;
      this.lbu.setVisibility(0);
    }
  }

  private void blN()
  {
    AppMethodBeat.i(53478);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "mData.PackFlag:%s", new Object[] { this.kYH.PackFlag });
    if ((this.kYH.PackFlag & 0x10) == 16)
      addIconOptionMenu(0, 2131231770, new EmojiStoreDetailUI.7(this));
    AppMethodBeat.o(53478);
  }

  private void blO()
  {
    AppMethodBeat.i(53479);
    com.tencent.mm.ui.base.h.a(this, 2131299095, 0, 2131299160, 2131299098, new EmojiStoreDetailUI.8(this), new EmojiStoreDetailUI.9(this));
    AppMethodBeat.o(53479);
  }

  private void blP()
  {
    AppMethodBeat.i(53481);
    if (com.tencent.mm.plugin.emoji.h.a.JW(this.kWz))
    {
      com.tencent.mm.plugin.emoji.f.a.bkq();
      com.tencent.mm.plugin.emoji.f.a.bkr();
      AppMethodBeat.o(53481);
      return;
    }
    this.laD = new com.tencent.mm.plugin.emoji.f.g(this.kWz, this.kWB, this.kWA);
    com.tencent.mm.kernel.g.RO().eJo.a(this.laD, 0);
    switch (this.kYp)
    {
    default:
    case 10:
    case 11:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(53481);
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(11598, new Object[] { Integer.valueOf(1), this.kWz });
      AppMethodBeat.o(53481);
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(11598, new Object[] { Integer.valueOf(3), this.kWz });
      AppMethodBeat.o(53481);
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(11598, new Object[] { Integer.valueOf(2), this.kWz });
    }
  }

  private void gp(boolean paramBoolean)
  {
    AppMethodBeat.i(53470);
    Object localObject = null;
    String str;
    if (!bo.isNullOrNil(this.kYH.CoverUrl))
    {
      if (!paramBoolean)
        break label105;
      str = this.kWz;
      localObject = this.kYH.CoverUrl;
      com.tencent.mm.bz.a.getDensity(this.mContext);
    }
    for (localObject = EmojiLogic.a(str, (String)localObject, this.lbD); ; localObject = EmojiLogic.r((String)localObject, 4, str))
    {
      if ((localObject != null) && (this.laL != null))
        this.laL.setImageFilePath(((EmojiInfo)localObject).dve());
      if (com.tencent.mm.plugin.emoji.h.a.JW(this.kWz))
        this.laL.setImageResource(2130840503);
      AppMethodBeat.o(53470);
      return;
      label105: localObject = this.kWz;
      str = this.kYH.CoverUrl;
      com.tencent.mm.bz.a.getDensity(this.mContext);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(53464);
    uh(1001);
    AppMethodBeat.o(53464);
  }

  public final void blH()
  {
    AppMethodBeat.i(53472);
    if ((com.tencent.mm.plugin.emoji.a.a.e.dR(this.kYH.PackFlag, 64)) && (com.tencent.mm.emoji.a.e.OJ()))
      if (this.laG != null)
      {
        this.lbd.setVisibility(0);
        this.lbf.setText(2131299136);
        this.lbe.setText(this.laG.Reward.wea);
        this.lbe.setLongClickable(false);
        if (this.laG.DonorNum > 0)
        {
          this.lbh.setVisibility(0);
          String str1 = String.valueOf(this.laG.DonorNum);
          String str2 = String.format(getString(2131299140), new Object[] { Integer.valueOf(this.laG.DonorNum) });
          SpannableString localSpannableString = new SpannableString(str2);
          int i = str2.indexOf(str1);
          if (i >= 0)
            localSpannableString.setSpan(new ForegroundColorSpan(getResources().getColor(2131689985)), i, str1.length() + i, 33);
          this.lbh.setText(localSpannableString);
          if ((this.laG.Donors == null) || (this.laG.Donors.size() <= 0))
            break label265;
          this.lbg.setVisibility(0);
          this.lbg.c(this.kWz, this.laG.Donors);
          AppMethodBeat.o(53472);
        }
      }
    while (true)
    {
      return;
      this.lbh.setVisibility(8);
      break;
      label265: this.lbg.setVisibility(8);
      AppMethodBeat.o(53472);
      continue;
      this.lbd.setVisibility(8);
      blD();
      AppMethodBeat.o(53472);
      continue;
      this.lbd.setVisibility(8);
      AppMethodBeat.o(53472);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969349;
  }

  public final void h(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(53480);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "productId:%s,status:%d, progress:%d, cdnClientID:%s, ", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    if ((bo.isNullOrNil(paramString1)) || (!paramString1.equals(this.kWz)))
      AppMethodBeat.o(53480);
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(paramString2))
        this.lbl = paramString2;
      if (paramInt1 == -1)
      {
        if (this.laB != -1)
        {
          this.laB = -1;
          uh(1003);
          AppMethodBeat.o(53480);
        }
      }
      else if (paramInt1 == 7)
      {
        this.laB = 7;
        uh(1003);
        AppMethodBeat.o(53480);
      }
      else if (paramInt1 == 6)
      {
        if ((!TextUtils.isEmpty(paramString1)) && (paramString1.equals(this.kWz)))
        {
          this.laB = 6;
          this.EV = paramInt2;
          uh(1004);
          AppMethodBeat.o(53480);
        }
      }
      else
      {
        ab.w("MicroMsg.emoji.EmojiStoreDetailUI", "[onExchange] do nothing.");
        AppMethodBeat.o(53480);
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(53451);
    if (!bo.isNullOrNil(this.kWA))
      setMMTitle(this.kWA);
    setBackBtn(new EmojiStoreDetailUI.2(this));
    this.eno = com.tencent.mm.bz.a.al(this.mContext, 2131428339);
    this.lbi = getResources().getDimensionPixelSize(2131428338);
    this.lbi = com.tencent.mm.bz.a.al(this.mContext, 2131428338);
    this.mNumColumns = 4;
    this.laK = ((EmojiDetailScrollView)findViewById(2131823117));
    this.Ek = findViewById(2131821749);
    this.laI = ((TextView)this.Ek.findViewById(2131823528));
    this.laJ = findViewById(2131823509);
    this.laL = ((BannerEmojiView)findViewById(2131823510));
    int i = this.laL.getRight();
    int j = this.laL.getLeft();
    int k = this.laL.getPaddingRight();
    int m = this.laL.getPaddingLeft();
    this.laL.setMinimumHeight((int)((i - j - k - m) * 0.56F));
    this.laM = ((TextView)findViewById(2131823513));
    this.laN = ((MMAutoSizeTextView)findViewById(2131823512));
    this.laO = ((TextView)findViewById(2131823525));
    this.laP = ((TextView)findViewById(2131823515));
    this.laQ = ((TextView)findViewById(2131823520));
    this.laW = com.tencent.mm.bz.a.gd(this.mController.ylL);
    this.laX = findViewById(2131823514);
    this.laR = ((EmojiDetailGridView)findViewById(2131823522));
    ProgressBar localProgressBar;
    if (com.tencent.mm.plugin.emoji.h.a.JW(this.kWz))
    {
      this.laF = new EmojiStoreDetailUI.b(this);
      this.laT = findViewById(2131823516);
      this.kRN = ((ProgressBar)findViewById(2131823517));
      this.laS = ((ImageView)findViewById(2131823518));
      this.laS.setOnClickListener(this);
      this.laT.setVisibility(8);
      this.laS.setVisibility(8);
      this.kRN.setProgress(0);
      this.laR.setAdapter(this.laF);
      this.laR.setColumnWidth(this.lbi);
      this.laR.setNumColumns(this.mNumColumns);
      this.laR.setHorizontalSpacing(this.eno);
      this.laR.setVerticalSpacing(this.eno);
      this.laR.setEmojiDetailScrollView(this.laK);
      this.laR.setFromDetail(true);
      this.laR.setIsShowPopWin(true);
      this.laR.setOnItemClickListener(new EmojiStoreDetailUI.3(this));
      this.laP.setOnClickListener(this);
      this.laU = ((TextView)findViewById(2131823526));
      this.laV = ((TextView)findViewById(2131823527));
      this.laU.setOnClickListener(this.lbz);
      this.laV.setOnClickListener(this.lbA);
      this.laY = ((ProgressBar)findViewById(2131823519));
      localProgressBar = this.laY;
      if (!this.lbm)
        break label772;
    }
    label772: for (m = 0; ; m = 8)
    {
      localProgressBar.setVisibility(m);
      this.lbu = findViewById(2131823521);
      this.lbc = findViewById(2131823523);
      this.laZ = findViewById(2131823537);
      this.lba = ((ImageView)findViewById(2131823538));
      this.lbb = ((TextView)findViewById(2131823539));
      this.lbd = findViewById(2131823524);
      this.lbe = ((TextView)findViewById(2131823565));
      this.lbf = ((Button)findViewById(2131823566));
      this.lbh = ((TextView)findViewById(2131823567));
      this.lbg = ((DonorsAvatarView)findViewById(2131823568));
      this.lbf.setOnClickListener(this.lbB);
      this.lbh.setOnClickListener(this.lbC);
      AppMethodBeat.o(53451);
      return;
      this.laF = new EmojiStoreDetailUI.a(this);
      break;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53463);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    String str1;
    Object localObject;
    if (paramInt1 == 2001)
    {
      str1 = "";
      paramInt1 = 0;
      if (paramIntent != null)
      {
        paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
        ab.w("MicroMsg.emoji.EmojiStoreDetailUI", "errCode:".concat(String.valueOf(paramInt1)));
        str1 = paramIntent.getStringExtra("key_err_msg");
        ab.w("MicroMsg.emoji.EmojiStoreDetailUI", "errMsg:".concat(String.valueOf(str1)));
      }
      this.lbt = false;
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramInt1 == 0))
        {
          localObject = paramIntent.getStringArrayListExtra("key_response_product_ids");
          paramIntent = paramIntent.getStringArrayListExtra("key_response_series_ids");
          if ((localObject != null) && (((ArrayList)localObject).contains(this.kWz)))
          {
            for (paramInt1 = 0; paramInt1 < ((ArrayList)localObject).size(); paramInt1++)
              if (this.kWz.equals(((ArrayList)localObject).get(paramInt1)))
                this.kWB = ((String)paramIntent.get(paramInt1));
            this.kYH.PackFlag = 1;
            blP();
            this.laB = 6;
            com.tencent.mm.ui.base.h.bQ(this, str1);
            if (r.YL())
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(166L, 4L, 1L, false);
              AppMethodBeat.o(53463);
            }
          }
        }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(166L, 0L, 1L, false);
      AppMethodBeat.o(53463);
      continue;
      this.laB = -1;
      blK();
      JD(str1);
      AppMethodBeat.o(53463);
      continue;
      if ((paramIntent != null) && (paramInt1 == 100000002))
      {
        blP();
        this.laB = 6;
        this.laF.notifyDataSetChanged();
        if (r.YL())
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 7L, 1L, false);
          AppMethodBeat.o(53463);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 3L, 1L, false);
          AppMethodBeat.o(53463);
        }
      }
      else if ((paramIntent != null) && (paramInt1 == 1))
      {
        this.laB = -1;
        blK();
        if (r.YL())
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 6L, 1L, false);
          AppMethodBeat.o(53463);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 2L, 1L, false);
          AppMethodBeat.o(53463);
        }
      }
      else
      {
        this.laB = -1;
        blK();
        JD(str1);
        if (r.YL())
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 5L, 1L, false);
          AppMethodBeat.o(53463);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(166L, 1L, 1L, false);
          AppMethodBeat.o(53463);
          continue;
          this.laB = -1;
          blK();
          if (r.YL())
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(166L, 6L, 1L, false);
            AppMethodBeat.o(53463);
          }
          else
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(166L, 2L, 1L, false);
            AppMethodBeat.o(53463);
            continue;
            if (paramInt1 == 2002)
            {
              if (paramInt2 == -1)
              {
                str1 = paramIntent.getStringExtra("Select_Conv_User");
                if (!bo.isNullOrNil(str1))
                {
                  ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "..".concat(String.valueOf(str1)));
                  String str2 = this.kWz;
                  String str3 = this.kYH.PackName;
                  paramIntent = this.kYH.PackDesc;
                  String str4 = this.kYH.IconUrl;
                  localObject = this.kYH.OldRedirectUrl;
                  paramInt1 = this.kYH.PackFlag;
                  String str5 = getResources().getString(2131296897);
                  String str6 = str5 + str3;
                  String str7 = getString(2131297041);
                  str5 = getString(2131298420);
                  ((com.tencent.mm.pluginsdk.i)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.i.class)).a(this, str1, str6, str7, str5, str4, new l.1(str1, str2, str3, paramIntent, str4, (String)localObject, paramInt1, this));
                }
                AppMethodBeat.o(53463);
              }
            }
            else if (paramInt1 == this.kVI.iGJ)
            {
              if (paramInt2 == -1)
              {
                ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks use emoji to : %s", new Object[] { paramIntent.getStringExtra("Select_Conv_User") });
                com.tencent.mm.plugin.emoji.h.c.a(paramIntent, this.kWz, this);
                com.tencent.mm.plugin.report.service.h.pYm.e(12069, new Object[] { Integer.valueOf(3), this.kWz });
                AppMethodBeat.o(53463);
              }
            }
            else
            {
              if ((paramInt1 == 2004) && (paramInt2 == -1))
                com.tencent.mm.ui.widget.snackbar.b.i(this, this.mController.ylL.getString(2131297044));
              AppMethodBeat.o(53463);
            }
          }
        }
      }
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(53459);
    int i = paramView.getId();
    if (i == 2131823515)
      if (this.laB == 7)
      {
        paramView = getIntent().getStringExtra("to_talker_name");
        if ((!bo.isNullOrNil(paramView)) && (this.laA))
        {
          com.tencent.mm.plugin.emoji.h.c.a(paramView, this.kWz, this);
          ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks kv stat update click use emoji");
          com.tencent.mm.plugin.report.service.h.pYm.X(11076, "0, ");
          AppMethodBeat.o(53459);
        }
      }
    while (true)
    {
      return;
      this.kVI.A(this);
      com.tencent.mm.plugin.report.service.h.pYm.e(12069, new Object[] { Integer.valueOf(2), this.kWz });
      break;
      switch (this.laB)
      {
      case 1:
      case 2:
      case 6:
      case 7:
      case 8:
      case 9:
      default:
        ab.e("MicroMsg.emoji.EmojiStoreDetailUI", "can not product status.%d", new Object[] { Integer.valueOf(this.laB) });
      case 4:
        do
        {
          AppMethodBeat.o(53459);
          break;
        }
        while (this.lbt);
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "mProductId:%s, mData.PackPrice:%s,PriceType:%s", new Object[] { this.kWz, this.kYH.PackPrice, this.kYH.PriceType });
        paramView = new Intent();
        paramView.putExtra("key_product_id", this.kWz);
        if (this.lbm)
        {
          paramView.putExtra("key_currency_type", this.lbq);
          paramView.putExtra("key_price", this.lbq + this.lbr);
        }
        while (true)
        {
          d.b(this, "wallet_index", ".ui.WalletIapUI", paramView, 2001);
          com.tencent.mm.plugin.report.service.h.pYm.e(12066, new Object[] { Integer.valueOf(2), Integer.valueOf(this.lbk), "", this.kWz, Long.valueOf(this.kVE), this.kVF });
          this.lbt = true;
          AppMethodBeat.o(53459);
          break;
          paramView.putExtra("key_currency_type", this.kYH.PriceType);
          paramView.putExtra("key_price", this.kYH.PriceNum);
        }
      case 0:
      case 3:
        blP();
        this.laB = 6;
        blK();
        com.tencent.mm.plugin.report.service.h.pYm.e(12066, new Object[] { Integer.valueOf(1), Integer.valueOf(this.lbk), "", this.kWz, Long.valueOf(this.kVE), this.kVF });
        AppMethodBeat.o(53459);
        break;
      case 5:
        this.laB = 3;
        blK();
        AppMethodBeat.o(53459);
        break;
      case 10:
      case 12:
        switch (this.lbo)
        {
        default:
          paramView = getString(2131299196);
        case 10234:
        case 10233:
        case 10235:
        }
        while (true)
        {
          com.tencent.mm.ui.base.h.b(this, paramView, null, true);
          AppMethodBeat.o(53459);
          break;
          paramView = getString(2131299058);
          continue;
          paramView = getString(2131299066);
          continue;
          paramView = getString(2131299191);
        }
      case 11:
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "can not be clicked.");
        AppMethodBeat.o(53459);
        break;
      case -1:
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "can not be clicked.");
        AppMethodBeat.o(53459);
        continue;
        if (i == 2131823517)
        {
          blO();
          AppMethodBeat.o(53459);
        }
        else if (i == 2131823518)
        {
          blO();
          AppMethodBeat.o(53459);
        }
        else
        {
          ab.w("MicroMsg.emoji.EmojiStoreDetailUI", "click view is unknow.");
          AppMethodBeat.o(53459);
        }
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53450);
    super.onCreate(paramBundle);
    this.lbm = r.YL();
    this.kVI = new com.tencent.mm.plugin.emoji.h.c(2003);
    paramBundle = getIntent();
    this.kWz = getIntent().getStringExtra("extra_id");
    this.kYp = getIntent().getIntExtra("preceding_scence", -1);
    this.kWA = getIntent().getStringExtra("extra_name");
    this.lax = getIntent().getIntExtra("call_by", -1);
    Object localObject = getIntent().getStringExtra("sns_object_data");
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      this.kWz = EmojiLogic.Jl((String)localObject);
      this.kYp = 0;
      this.kYp = 10;
      com.tencent.mm.plugin.report.service.h.pYm.e(10993, new Object[] { Integer.valueOf(3), this.kWz });
    }
    if (TextUtils.isEmpty(this.kWz))
    {
      ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "[hadleIntent] product id is null.");
      finish();
    }
    if (this.kYp == -1)
    {
      ab.e("MicroMsg.emoji.EmojiStoreDetailUI", "[hadleIntent] emoticon preceding scence no set!");
      finish();
    }
    this.lbv = paramBundle.getBooleanExtra("check_clickflag", true);
    this.lbl = paramBundle.getStringExtra("cdn_client_id");
    this.lbk = paramBundle.getIntExtra("download_entrance_scene", 0);
    this.kVE = paramBundle.getLongExtra("searchID", 0L);
    this.kVF = bo.bc(paramBundle.getStringExtra("docID"), "");
    localObject = paramBundle.getStringExtra("extra_copyright");
    if (!TextUtils.isEmpty((CharSequence)localObject))
      this.kYH.PackCopyright = ((String)localObject);
    localObject = paramBundle.getStringExtra("extra_coverurl");
    if (!TextUtils.isEmpty((CharSequence)localObject))
      this.kYH.CoverUrl = ((String)localObject);
    localObject = paramBundle.getStringExtra("extra_description");
    if (!TextUtils.isEmpty((CharSequence)localObject))
      this.kYH.PackDesc = ((String)localObject);
    localObject = paramBundle.getStringExtra("extra_price");
    if (!TextUtils.isEmpty((CharSequence)localObject))
      this.kYH.PackPrice = ((String)localObject);
    int i = paramBundle.getIntExtra("extra_type", -1);
    if (i != -1)
      this.kYH.PackType = i;
    i = paramBundle.getIntExtra("extra_flag", -1);
    if (i != -1)
      this.kYH.PackFlag = i;
    localObject = paramBundle.getStringExtra("extra_price_type");
    if (!TextUtils.isEmpty((CharSequence)localObject))
      this.kYH.PriceType = ((String)localObject);
    localObject = paramBundle.getStringExtra("extra_price_num");
    if (!TextUtils.isEmpty((CharSequence)localObject))
      this.kYH.PriceNum = ((String)localObject);
    if (this.lbm)
    {
      this.lbn = 11;
      com.tencent.mm.pluginsdk.model.h.a(this, this.lbs, this.lbF);
    }
    this.laz = paramBundle.getBooleanExtra("reward_tip", false);
    this.lbs[0] = this.kWz;
    this.kYH.ProductID = this.kWz;
    this.kYH.PackName = this.kWA;
    this.kYH.ShareDesc = this.lay;
    this.kYH.Version = -1;
    this.mContext = this;
    initView();
    if (!com.tencent.mm.plugin.emoji.h.a.JW(this.kWz))
      if (this.kYH == null)
      {
        this.laC = new com.tencent.mm.plugin.emoji.f.l(this.kWz, this.kYp);
        com.tencent.mm.kernel.g.RO().eJo.a(this.laC, 0);
        if ((this.lax == -1) || (this.lax == 3))
        {
          this.laJ.setVisibility(8);
          this.Ek.setVisibility(8);
          getString(2131297061);
          this.gqo = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new EmojiStoreDetailUI.5(this));
        }
        blC();
        if (!this.lbv)
          break label952;
        paramBundle = new k(this.kWz);
        com.tencent.mm.kernel.g.RO().eJo.a(paramBundle, 0);
      }
    while (true)
    {
      blF();
      com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.c(this);
      com.tencent.mm.sdk.b.a.xxA.c(this.kYt);
      com.tencent.mm.kernel.g.RO().eJo.a(822, this);
      i = getIntent().getIntExtra("extra_status", -1);
      int j = getIntent().getIntExtra("extra_progress", 0);
      h(this.kWz, i, j, this.lbl);
      this.lby = true;
      com.tencent.mm.plugin.report.service.h.pYm.e(12740, new Object[] { Integer.valueOf(1), "", this.kWz, "", Integer.valueOf(this.lbk), Integer.valueOf(26) });
      if ((this.laz) && (this.laK != null))
        this.mHandler.postDelayed(new EmojiStoreDetailUI.22(this), 0L);
      AppMethodBeat.o(53450);
      return;
      if ((!bo.isNullOrNil(this.kYI)) && (this.kYI.equalsIgnoreCase(aa.gw(this.mContext))))
      {
        this.laC = new com.tencent.mm.plugin.emoji.f.l(this.kWz, this.kYp, this.kYH.Version);
        break;
      }
      this.laC = new com.tencent.mm.plugin.emoji.f.l(this.kWz, this.kYp);
      break;
      label952: this.lbx = true;
      this.lbw = EmojiLogic.bkd();
      continue;
      localObject = this.mController.ylL;
      paramBundle = new EmotionDetail();
      paramBundle.ProductID = EmojiGroupInfo.yac;
      paramBundle.PackName = ((Context)localObject).getString(2131299169);
      paramBundle.PackDesc = ((Context)localObject).getString(2131299167);
      paramBundle.PackAuthInfo = ((Context)localObject).getString(2131299165);
      paramBundle.PackPrice = "";
      paramBundle.PackType = 0;
      paramBundle.PackFlag = 1;
      paramBundle.CoverUrl = "";
      paramBundle.PackExpire = 0;
      paramBundle.PackCopyright = ((Context)localObject).getString(2131299166);
      paramBundle.PanelUrl = "";
      paramBundle.PriceNum = "";
      paramBundle.PriceType = "";
      paramBundle.TimeLimitStr = ((Context)localObject).getString(2131299168);
      this.kYH = paramBundle;
      this.lbx = true;
      this.lbw = EmojiLogic.bkd();
      blE();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53456);
    super.onDestroy();
    com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYo.d(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.kYt);
    com.tencent.mm.kernel.g.RO().eJo.b(822, this);
    if (this.laR != null)
      this.laR.release();
    this.mHandler.removeCallbacksAndMessages(null);
    AppMethodBeat.o(53456);
  }

  public void onPause()
  {
    AppMethodBeat.i(53454);
    super.onPause();
    com.tencent.mm.kernel.g.RO().eJo.b(412, this);
    com.tencent.mm.kernel.g.RO().eJo.b(521, this);
    com.tencent.mm.kernel.g.RO().eJo.b(423, this);
    AppMethodBeat.o(53454);
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(53458);
    this.laB = paramBundle.getInt("status");
    this.EV = paramBundle.getInt("progress");
    AppMethodBeat.o(53458);
  }

  public void onResume()
  {
    AppMethodBeat.i(53453);
    super.onResume();
    com.tencent.mm.kernel.g.RO().eJo.a(412, this);
    com.tencent.mm.kernel.g.RO().eJo.a(521, this);
    com.tencent.mm.kernel.g.RO().eJo.a(423, this);
    this.lbt = false;
    if (!this.lby)
    {
      blC();
      uh(1007);
    }
    blD();
    this.lby = false;
    uh(1001);
    AppMethodBeat.o(53453);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(53457);
    paramBundle.putInt("status", this.laB);
    paramBundle.putInt("progress", this.EV);
    AppMethodBeat.o(53457);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(53460);
    ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    switch (paramm.getType())
    {
    default:
    case 412:
    case 423:
    case 521:
    case 822:
    }
    while (true)
    {
      AppMethodBeat.o(53460);
      while (true)
      {
        return;
        if (!(paramm instanceof com.tencent.mm.plugin.emoji.f.l))
          break;
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_GetEmotionDetail");
        paramString = (com.tencent.mm.plugin.emoji.f.l)paramm;
        if ((paramString != null) && (!bo.isNullOrNil(paramString.kWz)) && (paramString.kWz.equalsIgnoreCase(this.kWz)))
        {
          if (paramInt1 == 0)
          {
            if (paramInt2 == 0)
            {
              this.kYH = paramString.bkz();
              uh(1002);
              AppMethodBeat.o(53460);
            }
            else if (paramInt2 == 1)
            {
              blA();
              AppMethodBeat.o(53460);
            }
            else
            {
              this.laI.setText(2131299114);
              blB();
              AppMethodBeat.o(53460);
            }
          }
          else if (paramInt2 == 5)
          {
            if ((paramString != null) && (paramString.bkz() != null))
              this.kYH.PackFlag = paramString.bkz().PackFlag;
            uh(1002);
            AppMethodBeat.o(53460);
          }
          else if (paramInt2 == 1)
          {
            blA();
            AppMethodBeat.o(53460);
          }
          else
          {
            this.laK.setVisibility(8);
            this.Ek.setVisibility(0);
            this.laI.setText(2131299115);
            blB();
            AppMethodBeat.o(53460);
          }
        }
        else
        {
          ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
          AppMethodBeat.o(53460);
          continue;
          if (!(paramm instanceof com.tencent.mm.plugin.emoji.f.g))
            break;
          ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_ExchangeEmotionPack");
          paramString = (com.tencent.mm.plugin.emoji.f.g)paramm;
          if ((paramString != null) && (!bo.isNullOrNil(paramString.kWz)) && (paramString.kWz.equalsIgnoreCase(this.kWz)))
          {
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              this.lbl = paramString.fFa;
              this.laB = 6;
              blK();
              AppMethodBeat.o(53460);
            }
            else
            {
              this.laB = -1;
              blK();
              paramString = this.kWA;
              com.tencent.mm.ui.base.h.a(this, String.format(getString(2131299104), new Object[] { paramString }), "", new EmojiStoreDetailUI.10(this), new EmojiStoreDetailUI.11(this));
              AppMethodBeat.o(53460);
            }
          }
          else
          {
            ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
            AppMethodBeat.o(53460);
          }
        }
      }
      ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_GetEmotionDesc");
      paramString = (k)paramm;
      if ((paramString != null) && (!bo.isNullOrNil(paramString.kWl)) && (paramString.kWl.equalsIgnoreCase(this.kWz)))
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.lbw = ((aik)paramString.ehh.fsH.fsP);
          label597: this.lbx = true;
          blL();
        }
      while (true)
      {
        this.lbx = true;
        blL();
        AppMethodBeat.o(53460);
        break;
        this.lbw = null;
        break label597;
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
      }
      if ((paramm instanceof com.tencent.mm.plugin.emoji.f.o))
      {
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_MMGetEmotionReward");
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.laG = ((com.tencent.mm.plugin.emoji.f.o)paramm).bkD();
          uh(1007);
        }
      }
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(53452);
    super.onStart();
    AppMethodBeat.o(53452);
  }

  public void onStop()
  {
    AppMethodBeat.i(53455);
    super.onStop();
    AppMethodBeat.o(53455);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void uh(int paramInt)
  {
    AppMethodBeat.i(53482);
    if (this.mHandler != null)
      this.mHandler.sendEmptyMessage(paramInt);
    AppMethodBeat.o(53482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI
 * JD-Core Version:    0.6.2
 */