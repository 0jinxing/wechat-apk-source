package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gr;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.ag;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.c.a.d;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QImageView.a;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.kernel.i
public class SnsCommentDetailUI extends MMActivity
  implements com.tencent.mm.ai.f, h.a, b.b
{
  public static int rqk = 34;
  private String cFI;
  private String cFc;
  private String ecX;
  private com.tencent.mm.sdk.b.c hAA;
  private boolean hOT;
  private int jCq;
  private com.tencent.mm.ui.widget.b.a jMO;
  private View.OnClickListener jNC;
  private int klY;
  private int mScreenHeight;
  private int mScreenWidth;
  private ClipboardManager mmO;
  private View.OnClickListener nij;
  private LinearLayout qHj;
  private com.tencent.mm.ui.base.p rhB;
  private com.tencent.mm.sdk.b.c rhD;
  private boolean rho;
  private SnsCommentFooter rhq;
  private an rhs;
  private b rhy;
  private com.tencent.mm.plugin.sns.g.b rhz;
  private View.OnTouchListener riQ;
  private long rpH;
  private long rpI;
  private View rpJ;
  private TextView rpK;
  private LinearLayout rpL;
  private SnsDetailLuckyHeader rpM;
  private ListView rpN;
  private View rpO;
  private View rpP;
  private SnsCommentDetailUI.b rpQ;
  private ScaleAnimation rpR;
  private ScaleAnimation rpS;
  LinearLayout rpT;
  LinearLayout rpU;
  private LinkedList<cat> rpV;
  private int rpW;
  private boolean rpX;
  private aq rpY;
  private String rpZ;
  private com.tencent.mm.sdk.b.c rqA;
  private com.tencent.mm.sdk.b.c rqB;
  private SnsCommentDetailUI.c rqC;
  private View.OnClickListener rqD;
  private com.tencent.mm.sdk.b.c rqE;
  private com.tencent.mm.sdk.b.c rqF;
  boolean rqG;
  private LinearLayout rqH;
  private boolean rqI;
  PhotosContent rqJ;
  int rqK;
  public ao.b.a rqL;
  private bb rqM;
  private bd rqa;
  private int rqb;
  private ImageView rqc;
  private j rqd;
  private boolean rqe;
  private long rqf;
  private bc rqg;
  private boolean rqh;
  private int rqi;
  private int rqj;
  public int rql;
  private com.tencent.mm.plugin.sns.ui.c.a.a rqm;
  private com.tencent.mm.plugin.sns.a.b.g rqn;
  private com.tencent.mm.plugin.sns.ui.d.b rqo;
  private SnsTranslateResultView rqp;
  private boolean rqq;
  private Dialog rqr;
  private boolean rqs;
  private boolean rqt;
  private String rqu;
  private boolean rqv;
  private int rqw;
  private ag rqx;
  private com.tencent.mm.sdk.b.c rqy;
  private com.tencent.mm.sdk.b.c rqz;

  public SnsCommentDetailUI()
  {
    AppMethodBeat.i(38834);
    this.rpH = 0L;
    this.rpI = 0L;
    this.rpW = -1;
    this.rpX = false;
    this.riQ = bo.dpE();
    this.rhB = null;
    this.jCq = 0;
    this.rqb = 0;
    this.hOT = false;
    this.cFI = "";
    this.rqe = false;
    this.rqf = 0L;
    this.rqh = false;
    this.rqj = 103;
    this.rql = 210;
    this.rqq = false;
    this.rqr = null;
    this.rqs = false;
    this.rqt = false;
    this.rqu = "";
    this.rqv = true;
    this.rqx = new ag();
    this.rqy = new SnsCommentDetailUI.1(this);
    this.rqz = new SnsCommentDetailUI.12(this);
    this.rqA = new SnsCommentDetailUI.23(this);
    this.rqB = new SnsCommentDetailUI.34(this);
    this.rhD = new SnsCommentDetailUI.36(this);
    this.rqC = new SnsCommentDetailUI.c(this);
    this.jNC = new SnsCommentDetailUI.37(this);
    this.rqD = new SnsCommentDetailUI.38(this);
    this.nij = new SnsCommentDetailUI.2(this);
    this.rqE = new SnsCommentDetailUI.6(this);
    this.hAA = new SnsCommentDetailUI.7(this);
    this.rqF = new SnsCommentDetailUI.8(this);
    this.rqG = false;
    this.rqH = null;
    this.rqI = false;
    this.rqJ = null;
    this.rqK = 0;
    this.rqL = new SnsCommentDetailUI.19(this);
    this.rqM = null;
    AppMethodBeat.o(38834);
  }

  private LinearLayout DV(int paramInt)
  {
    AppMethodBeat.i(38845);
    LinearLayout localLinearLayout;
    if (this.rqH == null)
    {
      this.rqH = ((LinearLayout)com.tencent.mm.ui.v.hu(this).inflate(paramInt, null));
      localLinearLayout = this.rqH;
      AppMethodBeat.o(38845);
    }
    while (true)
    {
      return localLinearLayout;
      this.rqG = true;
      localLinearLayout = this.rqH;
      AppMethodBeat.o(38845);
    }
  }

  private int csV()
  {
    int i = 0;
    AppMethodBeat.i(38844);
    if ((this.rpN != null) && (this.rpN.getChildCount() > 1))
    {
      View localView = this.rpN.getChildAt(0);
      if (localView != null)
      {
        i = localView.getHeight();
        AppMethodBeat.o(38844);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(38844);
    }
  }

  private static boolean csW()
  {
    AppMethodBeat.i(38846);
    boolean bool;
    if ((am.a.coe() & 0x1) <= 0)
    {
      bool = true;
      AppMethodBeat.o(38846);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38846);
    }
  }

  private void csY()
  {
    AppMethodBeat.i(38848);
    if ((this.rpO == null) || (this.rpO.getVisibility() == 8))
      AppMethodBeat.o(38848);
    while (true)
    {
      return;
      this.rpO.startAnimation(this.rpS);
      this.rpS.setAnimationListener(new SnsCommentDetailUI.33(this));
      AppMethodBeat.o(38848);
    }
  }

  private void csZ()
  {
    AppMethodBeat.i(38849);
    if ((this.mController.ymc == 1) || (this.rhq.cte()))
    {
      this.rqC.run();
      AppMethodBeat.o(38849);
    }
    while (true)
    {
      return;
      this.rho = true;
      AppMethodBeat.o(38849);
    }
  }

  private void cta()
  {
    AppMethodBeat.i(38850);
    if (this.rqc == null)
      AppMethodBeat.o(38850);
    while (true)
    {
      return;
      this.rqc.setPressed(false);
      if (bc.Wi(this.cFI))
      {
        this.rqc.setImageResource(2130839637);
        AppMethodBeat.o(38850);
      }
      else
      {
        this.rqc.setImageResource(2130839639);
        AppMethodBeat.o(38850);
      }
    }
  }

  private boolean e(List<cat> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(38851);
    int i = BackwardSupportUtil.b.b(this, 32.0F);
    int j = BackwardSupportUtil.b.b(this, 6.0F);
    int k = BackwardSupportUtil.b.b(this, 10.0F);
    int m = BackwardSupportUtil.b.b(this, 17.0F);
    if (this.rpL == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(38851);
    }
    int n;
    float f;
    while (true)
    {
      return paramBoolean;
      n = ((WindowManager)this.mController.ylL.getSystemService("window")).getDefaultDisplay().getWidth();
      f = getResources().getDimension(2131427812);
      ab.d("MicroMsg.SnsCommentDetailUI", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
      f = n - f * 2.0F;
      if (paramList.size() > 0)
        break;
      if (this.rpL.getParent() != null)
        this.rpL.setVisibility(8);
      this.rpL.removeAllViews();
      this.rpL.setVisibility(8);
      this.qHj.setVisibility(8);
      paramBoolean = false;
      AppMethodBeat.o(38851);
    }
    this.rpL.getParent();
    this.rpL.removeAllViews();
    this.rpL.setVisibility(0);
    Object localObject1;
    if (this.klY == 10)
      if (!this.rqq)
      {
        this.rpL.setBackgroundResource(2130838856);
        this.rpL.setPadding(0, j, 0, j);
        localObject1 = new ImageView(this.mController.ylL);
        if (this.klY != 10)
          break label709;
        ((ImageView)localObject1).setImageResource(2131231329);
      }
    h localh;
    while (true)
    {
      ((ImageView)localObject1).setPadding(k, m, k, 0);
      Object localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.rpL.addView((View)localObject1);
      n = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, rqk);
      m = (int)(f - n) / (j + i);
      k = m;
      if ((int)(f - n) % (j + i) > i)
        k = m + 1;
      ab.d("MicroMsg.SnsCommentDetailUI", "guess size %d", new Object[] { Integer.valueOf(k) });
      localh = new h(this.mController.ylL);
      localh.setClipChildren(false);
      localh.setClipToPadding(false);
      localh.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      localh.setLineMaxCounte(k);
      for (k = 0; k < paramList.size(); k++)
      {
        localObject1 = (cat)paramList.get(k);
        localObject2 = new StoryTouchImageView(this.mController.ylL);
        ((StoryTouchImageView)localObject2).setScaleType(ImageView.ScaleType.FIT_XY);
        ((StoryTouchImageView)localObject2).setImageResource(2130838865);
        Object localObject3 = ((cat)localObject1).vHl;
        ((StoryTouchImageView)localObject2).rDe.dk((String)localObject3, 1);
        localObject3 = new LinearLayout.LayoutParams(i, i);
        ((LinearLayout.LayoutParams)localObject3).setMargins(0, j, j, 0);
        ((StoryTouchImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
        ((StoryTouchImageView)localObject2).setTag(((cat)localObject1).vHl);
        a.b.t((ImageView)localObject2, ((cat)localObject1).vHl);
        ((StoryTouchImageView)localObject2).setOnClickListener(this.jNC);
        localh.addView((View)localObject2);
      }
      localObject2 = li(false);
      if (localObject2 != null)
      {
        if (this.ecX.equals(((n)localObject2).field_userName))
        {
          this.rpL.setBackgroundResource(2130838857);
          break;
        }
        this.rpL.setBackgroundResource(2130838856);
        break;
      }
      this.rpL.setBackgroundResource(2130838856);
      break;
      this.rpL.setBackgroundResource(2130838854);
      break;
      label709: ((ImageView)localObject1).setImageResource(2131231328);
    }
    this.rpL.addView(localh);
    paramList = this.qHj;
    if (paramBoolean);
    for (k = 8; ; k = 0)
    {
      paramList.setVisibility(k);
      paramBoolean = true;
      AppMethodBeat.o(38851);
      break;
    }
  }

  private com.tencent.mm.plugin.sns.storage.a f(n paramn)
  {
    AppMethodBeat.i(38838);
    if (paramn != null)
      if (getSource() == 2)
      {
        paramn = paramn.cqr();
        AppMethodBeat.o(38838);
      }
    while (true)
    {
      return paramn;
      paramn = paramn.cqq();
      AppMethodBeat.o(38838);
      continue;
      paramn = null;
      AppMethodBeat.o(38838);
    }
  }

  private static boolean f(LinkedList<cat> paramLinkedList1, LinkedList<cat> paramLinkedList2)
  {
    AppMethodBeat.i(38835);
    boolean bool;
    if ((paramLinkedList1 == null) || (paramLinkedList2 == null))
    {
      AppMethodBeat.o(38835);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramLinkedList1.size() != paramLinkedList2.size())
      {
        AppMethodBeat.o(38835);
        bool = false;
      }
      else
      {
        int i = paramLinkedList1.size();
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label107;
          if (!((cat)paramLinkedList1.get(j)).vHl.equals(((cat)paramLinkedList2.get(j)).vHl))
          {
            AppMethodBeat.o(38835);
            bool = false;
            break;
          }
        }
        label107: bool = true;
        AppMethodBeat.o(38835);
      }
    }
  }

  private int getSource()
  {
    if (this.rqw == 16);
    for (int i = 2; ; i = 1)
      return i;
  }

  private void lh(boolean paramBoolean)
  {
    AppMethodBeat.i(38836);
    this.rpX = false;
    if (this.rhq.ctd())
    {
      this.rhq.rrt = 0;
      this.rhq.ctg();
      this.rhq.setCommentHint(getString(2131303840));
    }
    this.rhq.lj(false);
    if (paramBoolean)
      BackwardSupportUtil.c.a(this.rpN);
    AppMethodBeat.o(38836);
  }

  private n li(boolean paramBoolean)
  {
    AppMethodBeat.i(38837);
    n localn;
    if (!bo.isNullOrNil(this.rpZ))
    {
      localn = com.tencent.mm.plugin.sns.storage.h.YT(this.rpZ);
      if (localn == null)
      {
        if (paramBoolean)
          Toast.makeText(this, 2131303719, 0).show();
        finish();
        AppMethodBeat.o(38837);
        localn = null;
        return localn;
      }
      this.cFc = localn.cqA();
    }
    while (true)
    {
      AppMethodBeat.o(38837);
      break;
      localn = com.tencent.mm.plugin.sns.storage.h.YS(this.cFc);
      if (localn == null)
      {
        finish();
        AppMethodBeat.o(38837);
        localn = null;
        break;
      }
      this.rpZ = localn.cqU();
    }
  }

  public final void Xw(String paramString)
  {
  }

  public final void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong, String paramString2)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong, String paramString2)
  {
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }

  final boolean csX()
  {
    AppMethodBeat.i(38847);
    n localn = li(true);
    boolean bool;
    if (localn == null)
    {
      bool = false;
      AppMethodBeat.o(38847);
      return bool;
    }
    ab.i("MicroMsg.SnsCommentDetailUI", "setheader " + this.rpJ.toString());
    this.rqi = af.cnN();
    Object localObject1 = localn.cqu();
    this.klY = au.b(localn, false);
    Object localObject2 = (SnsAvatarImageView)this.rpJ.findViewById(2131827708);
    Object localObject3;
    if ((localObject2 == null) || (localn == null))
    {
      localObject3 = new StringBuilder("unknow error ? ");
      if (localObject2 == null)
      {
        bool = true;
        label119: localObject2 = ((StringBuilder)localObject3).append(bool).append(" ");
        if (localn != null)
          break label170;
      }
      label170: for (bool = true; ; bool = false)
      {
        ab.e("MicroMsg.SnsCommentDetailUI", bool);
        bool = false;
        AppMethodBeat.o(38847);
        break;
        bool = false;
        break label119;
      }
    }
    ((SnsAvatarImageView)localObject2).setWeakContext(this);
    ((MaskImageButton)localObject2).eSe = localn.cqU();
    ((SnsAvatarImageView)localObject2).setTag(localn.getUserName());
    Object localObject4;
    label434: Object localObject5;
    if ((localn.cqo() != null) && (localn.cqo().qVa))
    {
      if (!bo.isNullOrNil(localn.cqo().qVc))
      {
        ((SnsAvatarImageView)localObject2).setTag(2131820666, localn.cqo().qVc);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.a(localn.cqo().qVc, new SnsCommentDetailUI.20(this, (SnsAvatarImageView)localObject2));
      }
      ((SnsAvatarImageView)localObject2).setOnClickListener(this.rqo.rJI);
      localObject3 = (TextView)this.rpJ.findViewById(2131823149);
      com.tencent.mm.kernel.g.RQ();
      localObject4 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(localn.getUserName());
      ab.i("MicroMsg.SnsCommentDetailUI", "snsinfo username " + localn.getUserName() + " " + localn.cqA() + " " + localn.cqN());
      if ((localObject4 != null) && (((ad)localObject4).Oh() == 0))
      {
        ab.i("MicroMsg.SnsCommentDetailUI", "getContact %s", new Object[] { localn.getUserName() });
        ao.a.Zu().a(localn.getUserName(), "", this.rqL);
      }
      if (localObject4 != null)
        break label1168;
      localObject2 = localn.getUserName();
      localObject5 = bo.bc((String)localObject2, "");
      if (!localn.sh())
        break label8536;
      localObject2 = localn.cqo();
      if (localObject2 == null)
        break label8536;
      if (!((com.tencent.mm.plugin.sns.storage.b)localObject2).qVa)
        break label1178;
      localObject5 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qVb;
    }
    label699: label1213: label1225: label1876: label8023: label8536: 
    while (true)
    {
      label476: ((String)localObject5).length();
      label494: int j;
      if (this.klY == 10)
      {
        i = 3;
        localObject2 = new k(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject5));
        ((k)localObject2).a(new com.tencent.mm.pluginsdk.ui.e.o(new com.tencent.mm.plugin.sns.data.a(localn.sh(), ((ad)localObject4).getUsername(), localn.cqU(), 2), this.rqd, i), (CharSequence)localObject5);
        ((TextView)localObject3).setOnTouchListener(new aa());
        ((TextView)localObject3).setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
        ((TextView)this.rpJ.findViewById(2131827711)).setText("");
        this.rqM = new bb(this.rpJ);
        if (!localn.sh())
          break label1213;
        this.rqM.z(Long.valueOf(localn.field_snsId), new com.tencent.mm.plugin.sns.data.b(this.rqM, 0, this.rpZ, localn.field_snsId, f(localn).hnw));
        this.rqM.a(localn.cqo(), f(localn));
        this.rqM.a(this.rqo.rJS, this.rqo.rKg);
        this.rqM.setVisibility(0);
        localObject3 = ((TimeLineObject)localObject1).xfF;
        this.rpK = ((TextView)this.rpJ.findViewById(2131820991));
        localObject2 = new ar(this.cFc, localn.cqU(), true, false, 2);
        this.rpK.setTag(localObject2);
        this.jMO.c(this.rpK, this.rqo.rJK, this.rqo.rJH);
        if (!bo.isNullOrNil((String)localObject3))
          break label1225;
        this.rpK.setVisibility(8);
        localObject2 = (ViewStub)this.rpJ.findViewById(2131827717);
        if (!this.rqI)
          ((ViewStub)localObject2).setLayoutResource(-1);
        switch (this.klY)
        {
        case 6:
        case 7:
        case 8:
        case 12:
        default:
          ((ViewStub)localObject2).setVisibility(8);
          if (((ViewStub)localObject2).getLayoutResource() != -1)
          {
            localObject3 = ((ViewStub)localObject2).inflate();
            if (this.rqm != null)
              this.rqm.g((View)localObject3, this.rpP);
            this.rqI = true;
            j = ((WindowManager)dxU().getSystemService("window")).getDefaultDisplay().getWidth();
            if (this.klY == 6)
              break label1876;
            if ((this.klY != 2) && (this.klY != 3) && (this.klY != 4) && (this.klY != 5))
              break label3391;
            this.rqJ = ((PhotosContent)findViewById(2131827892));
            if (this.rqJ == null)
              break label3348;
            this.rqJ.csr();
            if (this.klY != 2)
              break label1445;
          }
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 9:
        case 10:
        case 13:
        case 11:
        case 14:
        }
      }
      int k;
      for (int i = 1; ; i = aq.run[this.klY])
      {
        for (k = 0; k < i; k++)
        {
          localObject2 = (TagImageView)this.rqJ.findViewById(aq.rur[k]);
          this.rqJ.a((TagImageView)localObject2);
          ((TagImageView)localObject2).setOnClickListener(this.rqo.rjy);
          this.jMO.c((View)localObject2, this.rqo.rJV, this.rqo.rJH);
        }
        if (localn.getUserName().endsWith("@ad"))
          break;
        a.b.t((ImageView)localObject2, localn.getUserName());
        ((SnsAvatarImageView)localObject2).dk(localn.getUserName(), 2);
        bo.isEqual(this.ecX, localn.getUserName());
        break;
        localObject2 = ((ad)localObject4).Oj();
        break label434;
        if ((!bo.isNullOrNil((String)localObject5)) || (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.b)localObject2).nickname)))
          break label8536;
        localObject5 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).nickname;
        break label476;
        i = 2;
        break label494;
        this.rqM.setVisibility(8);
        break label699;
        this.rpK.setText((String)localObject3 + " ");
        com.tencent.mm.pluginsdk.ui.e.j.h(this.rpK, 2);
        this.rpK.setVisibility(0);
        break label793;
        ((ViewStub)localObject2).setLayoutResource(2130970819);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970816);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970817);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970818);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970778);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970763);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970713);
        this.rqm = new com.tencent.mm.plugin.sns.ui.c.a.b((TimeLineObject)localObject1, localn, this.rqo, this.rqn);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970822);
        this.rqm = new d((TimeLineObject)localObject1, localn, this.rqo, this.rqn);
        break label899;
        ((ViewStub)localObject2).setLayoutResource(2130970812);
        this.rqm = new com.tencent.mm.plugin.sns.ui.c.a.c((TimeLineObject)localObject1, localn, this.rqo, this.rqn);
        break label899;
        ((ViewStub)localObject2).setVisibility(8);
        break label940;
      }
      this.rqJ.setImageViewWidth(this.rqi);
      localObject2 = new LinkedList();
      float f1;
      float f2;
      float f3;
      Object localObject6;
      label1761: Object localObject7;
      if ((localn.sh()) && (this.klY == 2))
      {
        localObject3 = localn.cqo();
        this.rqJ.DT(0).setScaleType(QImageView.a.zNT);
        if ((localObject3 != null) && (!((com.tencent.mm.plugin.sns.storage.b)localObject3).coP()) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUH > 0.0F) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUI > 0.0F))
        {
          f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(((com.tencent.mm.plugin.sns.storage.b)localObject3).qUH, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUK);
          f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(((com.tencent.mm.plugin.sns.storage.b)localObject3).qUI, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUK);
          if (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUG != 0)
            break label3054;
          f3 = f2;
          f2 = f1;
          if (f1 >= j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812))
          {
            f2 = j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812);
            f3 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject3).qUI * f2 / ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUH);
          }
          localObject6 = new baw();
          ((baw)localObject6).wFx = f2;
          ((baw)localObject6).wFy = f3;
          ((baw)localObject6).wFz = (((baw)localObject6).wFx * ((baw)localObject6).wFy);
          ((LinkedList)localObject2).add(localObject6);
        }
        if (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.b)localObject3).qUM))
        {
          localObject7 = this.rqJ;
          localObject6 = this.rqJ.DT(0);
          com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.c("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUM, false, 41, new SnsCommentDetailUI.21(this, (PhotosContent)localObject7, (com.tencent.mm.plugin.sns.storage.b)localObject3, (TagImageView)localObject6));
        }
      }
      this.rpJ.addOnAttachStateChangeListener(new SnsCommentDetailUI.22(this, (TimeLineObject)localObject1, localn, (LinkedList)localObject2));
      this.rpY.a(this.rqJ, (TimeLineObject)localObject1, localn.cqU(), hashCode(), this.klY, -1, localn.DI(32), false, az.xYT, (List)localObject2, localn.cqA());
      while (true)
      {
        localObject6 = (TextView)this.rpJ.findViewById(2131827718);
        if (!localn.sh())
          break label7335;
        localObject3 = f(localn);
        if (localObject3 == null)
          break label7325;
        localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).qTD;
        localObject3 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).qTE;
        ((TextView)localObject6).setTag(localn.cqU());
        if (bo.isNullOrNil((String)localObject2))
          break label7325;
        if (!bo.isNullOrNil((String)localObject3))
          break label7287;
        ((TextView)localObject6).setVisibility(0);
        ((TextView)localObject6).setText((CharSequence)localObject2);
        ((TextView)localObject6).setClickable(false);
        ((TextView)localObject6).setTextColor(-9211021);
        this.rpJ.post(new SnsCommentDetailUI.26(this));
        ((TextView)localObject6).setOnClickListener(this.rqo.rKd);
        ((TextView)this.rpJ.findViewById(2131827720)).setText(aw.m(dxU(), localn.cqN() * 1000L));
        localObject7 = (AsyncTextView)this.rpJ.findViewById(2131827721);
        ((TextView)localObject7).setOnClickListener(this.rqo.rKh);
        ((TextView)localObject7).setVisibility(8);
        localObject6 = (AsyncTextView)this.rpJ.findViewById(2131827722);
        ((TextView)localObject6).setOnClickListener(new SnsCommentDetailUI.27(this, localn, (ad)localObject4));
        ((TextView)localObject6).setVisibility(8);
        if (localn.sh())
        {
          localObject4 = f(localn);
          ((TextView)localObject7).setTag(localn.cqU());
          if (((com.tencent.mm.plugin.sns.storage.a)localObject4).qTF != com.tencent.mm.plugin.sns.storage.a.qTr)
            break label7537;
          if (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG))
            break label7527;
          ((TextView)localObject7).setText(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG);
          ((TextView)localObject7).setVisibility(0);
          break label7824;
          if ((((TextView)localObject7).getVisibility() != 8) && (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTH)))
          {
            ((TextView)localObject7).setTextColor(getResources().getColor(2131690508));
            ((TextView)localObject7).setOnClickListener(null);
          }
          if ((localn.cqu().xfI.wbL & 0x4) == 0)
            break label7993;
          ((TextView)localObject6).setTag(localn.cqU());
          ((TextView)localObject6).setVisibility(0);
          ((TextView)localObject6).setText(String.format("%s%s%s", new Object[] { dxU().getResources().getString(2131303566), localObject5, dxU().getResources().getString(2131303567) }));
        }
        localObject3 = (TextView)this.rpJ.findViewById(2131827724);
        ((TextView)localObject3).setOnTouchListener(new aa());
        localObject2 = com.tencent.mm.plugin.sns.c.a.gkF.t(this, ((TimeLineObject)localObject1).xfH.Id);
        if (((TimeLineObject)localObject1).xfI.wbJ == 26)
          localObject2 = getString(2131299589);
        au.a((TimeLineObject)localObject1, this);
        if (!com.tencent.mm.plugin.sns.c.a.gkF.dg((String)localObject2))
          break label8003;
        ((TextView)localObject3).setVisibility(0);
        localObject2 = new SpannableString(getString(2131303608) + (String)localObject2);
        ((SpannableString)localObject2).setSpan(new SnsCommentDetailUI.a(this), 0, ((SpannableString)localObject2).length(), 33);
        ((TextView)localObject3).setText((CharSequence)localObject2, TextView.BufferType.SPANNABLE);
        if ((((TimeLineObject)localObject1).xfH == null) || (!com.tencent.mm.pluginsdk.model.app.g.aiF(((TimeLineObject)localObject1).xfH.Id)))
        {
          ((TextView)localObject3).setTextColor(getResources().getColor(2131690508));
          ((TextView)localObject3).setOnTouchListener(null);
        }
        ((TextView)localObject3).setTag(localObject1);
        localObject2 = (TextView)this.rpJ.findViewById(2131827726);
        if (!localn.getUserName().equals(this.ecX))
          break label8013;
        ((TextView)localObject2).setVisibility(0);
        ((TextView)localObject2).setTag(localn.cqU() + ";" + localn.cqA());
        ((TextView)localObject2).setOnClickListener(new SnsCommentDetailUI.28(this));
        localObject6 = (TextView)this.rpJ.findViewById(2131827719);
        localObject5 = com.tencent.mm.plugin.sns.model.aj.p(localn);
        if (localObject5 != null)
          break label8023;
        ((TextView)localObject6).setVisibility(8);
        this.rpR = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
        this.rpR.setDuration(150L);
        this.rpS = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
        this.rpS.setDuration(150L);
        if (this.rpO == null)
        {
          this.rpO = this.rpJ.findViewById(2131821027);
          this.rpO.setVisibility(8);
        }
        this.rpT = ((LinearLayout)this.rpJ.findViewById(2131827727));
        this.rpT.setOnClickListener(new SnsCommentDetailUI.30(this, localn));
        this.rpT.setOnTouchListener(this.riQ);
        this.rpU = ((LinearLayout)this.rpJ.findViewById(2131827694));
        this.rpU.setOnClickListener(new SnsCommentDetailUI.31(this, localn));
        this.rpU.setOnTouchListener(this.riQ);
        localObject2 = (ImageButton)this.rpJ.findViewById(2131827709);
        localObject3 = li(true);
        if ((localObject3 != null) && ((((n)localObject3).cqP() & 0x1) != 0))
          ((ImageButton)localObject2).setVisibility(8);
        if ((localObject3 != null) && (!((n)localObject3).cqT()))
          ((ImageButton)localObject2).setVisibility(8);
        localObject5 = (ImageView)this.rpU.findViewById(2131827695);
        localObject1 = (ImageView)this.rpT.findViewById(2131827698);
        localObject3 = (TextView)this.rpU.findViewById(2131827696);
        localObject6 = (TextView)this.rpT.findViewById(2131827697);
        if (this.klY == 10)
        {
          this.rpJ.findViewById(2131821027).setBackgroundResource(2130838858);
          ((ImageButton)localObject2).setImageResource(2130839217);
          ((ImageView)localObject5).setImageResource(2130839218);
          ((ImageView)localObject1).setImageResource(2130839219);
          ((TextView)localObject3).setTextColor(getResources().getColor(2131690487));
          ((TextView)localObject6).setTextColor(getResources().getColor(2131690487));
          this.rpU.setBackgroundResource(2130839427);
          this.rpT.setBackgroundResource(2130839428);
        }
        ((ImageButton)localObject2).setOnClickListener(new SnsCommentDetailUI.32(this, localn, (TextView)localObject3, (TextView)localObject6, (ImageView)localObject5, (ImageView)localObject1));
        bool = true;
        AppMethodBeat.o(38847);
        break;
        label3054: if (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUG == 1)
        {
          k = j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812);
          i = (int)(k * ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUH);
          localObject6 = new baw();
          if (k > 0)
            f1 = k;
          ((baw)localObject6).wFx = f1;
          if (i > 0)
            f2 = i;
          ((baw)localObject6).wFy = f2;
          ((baw)localObject6).wFz = (((baw)localObject6).wFx * ((baw)localObject6).wFy);
          ((LinkedList)localObject2).add(localObject6);
          break label1761;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUG != 2)
          break label1761;
        i = j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812);
        k = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUH);
        localObject6 = new baw();
        if (i > 0)
          f1 = i;
        ((baw)localObject6).wFx = f1;
        if (k > 0)
          f2 = k;
        ((baw)localObject6).wFy = f2;
        ((baw)localObject6).wFz = (((baw)localObject6).wFx * ((baw)localObject6).wFy);
        ((LinkedList)localObject2).add(localObject6);
        break label1761;
        ab.e("MicroMsg.SnsCommentDetailUI", "the imagesKeeper is null,when viewtype = " + this.klY + ",stub is " + ((ViewStub)localObject2).toString());
        continue;
        if (this.klY != 10)
          break label3821;
        this.rqJ.csr();
        localObject6 = (TagImageView)this.rqJ.findViewById(2131827766);
        this.rqJ.a((TagImageView)localObject6);
        ((TagImageView)localObject6).setOnClickListener(this.rqo.rjy);
        localObject2 = localn.cqU();
        localObject7 = new ArrayList();
        ((List)localObject7).add(localObject6);
        localObject3 = new ao();
        ((ao)localObject3).czD = ((String)localObject2);
        ((ao)localObject3).index = 0;
        ((ao)localObject3).rsl = ((List)localObject7);
        ((ao)localObject3).rps = true;
        if (localObject6 != null)
          ((TagImageView)localObject6).setTag(localObject3);
        localObject2 = (TextView)this.rpJ.findViewById(2131827725);
        if (!r.Yz().equals(((TimeLineObject)localObject1).jBB))
        {
          localObject3 = com.tencent.mm.plugin.sns.model.aj.q(localn);
          if ((((cbf)localObject3).xaE != null) && (((cbf)localObject3).xaE.xbg != 0))
          {
            ((TextView)localObject2).setText(getString(2131301219, new Object[] { Integer.valueOf(((cbf)localObject3).xaE.xbg) }));
            ((TextView)localObject2).setVisibility(0);
          }
        }
        while (true)
        {
          localObject2 = localn.cqM();
          if (localObject2 == null)
            break label3792;
          if (!r.Yz().equals(((TimeLineObject)localObject1).jBB))
            break label3681;
          this.rpY.a(this.rqJ, (TimeLineObject)localObject1, localn.cqU(), hashCode(), this.klY, -1, false, az.xYT, true);
          break;
          ((TextView)localObject2).setVisibility(8);
          continue;
          ((TextView)localObject2).setVisibility(8);
        }
        label3681: if (com.tencent.mm.plugin.sns.lucky.a.m.k(localn))
        {
          this.rpY.a(this.rqJ, (TimeLineObject)localObject1, localn.cqU(), hashCode(), this.klY, -1, false, az.xYT, false);
        }
        else if (((bav)localObject2).cRU == 0)
        {
          this.rpY.a(this.rqJ, (TimeLineObject)localObject1, localn.cqU(), hashCode(), this.klY, -1, false, az.xYT, true);
        }
        else
        {
          ab.e("MicroMsg.SnsCommentDetailUI", "mediaPostInfo.hbStatus is " + ((bav)localObject2).cRU);
          continue;
          ab.e("MicroMsg.SnsCommentDetailUI", "mediaPostInfo is null " + localn.cqU());
        }
      }
      label3821: Object localObject8;
      if (this.klY == 9)
      {
        this.rqs = true;
        localObject6 = new aj();
        localObject2 = this.rpJ;
        localObject7 = ((View)localObject2).findViewById(2131822515);
        localObject3 = (com.tencent.mm.plugin.sight.decode.a.a)((View)localObject2).findViewById(2131820629);
        ((aj)localObject6).rnt = ((View)localObject7);
        ((aj)localObject6).raP = ((ImageView)((View)localObject2).findViewById(2131820981));
        ((aj)localObject6).rnu = ((MMPinProgressBtn)((View)localObject2).findViewById(2131821370));
        ((aj)localObject6).raQ = ((TextView)((View)localObject2).findViewById(2131827572));
        ((aj)localObject6).rnv = ((TextView)((View)localObject2).findViewById(2131827571));
        ((aj)localObject6).qzM = ((com.tencent.mm.plugin.sight.decode.a.a)localObject3);
        ((aj)localObject6).a((TimeLineObject)localObject1, 0, localn.cqU(), localn.sh());
        ((aj)localObject6).raQ.setVisibility(8);
        ((aj)localObject6).qzM.setTagObject(localObject6);
        ((View)localObject7).setTag(localObject6);
        ((aj)localObject6).rnt.setOnClickListener(this.rqo.rKe);
        if (!localn.coP())
        {
          this.jMO.c((View)localObject7, this.rqo.rJX, this.rqo.rJH);
          localObject2 = e.a((TimeLineObject)localObject1, ((aj)localObject6).qzM.getUIContext(), localn.sh());
          if (!localn.sh())
            break label8533;
          localObject8 = localn.cqo();
          if ((localObject8 == null) || (!((com.tencent.mm.plugin.sns.storage.b)localObject8).coP()) || (((com.tencent.mm.plugin.sns.storage.b)localObject8).qUH <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject8).qUI <= 0.0F))
            break label8533;
          f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(((com.tencent.mm.plugin.sns.storage.b)localObject8).qUH, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUK);
          f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(((com.tencent.mm.plugin.sns.storage.b)localObject8).qUI, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUK);
          if (((com.tencent.mm.plugin.sns.storage.b)localObject8).qUG != 0)
            break label4648;
          f2 = f3;
          if (f3 >= j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812))
          {
            f2 = j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812);
            f1 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject8).qUI * f2 / ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUH);
          }
          localObject2 = Pair.create(Integer.valueOf((int)f2), Integer.valueOf((int)f1));
        }
      }
      while (true)
      {
        if (localObject2 != null)
        {
          ((com.tencent.mm.plugin.sight.decode.a.a)localObject3).fi(((Integer)((Pair)localObject2).first).intValue(), ((Integer)((Pair)localObject2).second).intValue());
          localObject8 = ((aj)localObject6).rnv.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject8).width = ((Integer)((Pair)localObject2).first).intValue();
          ((ViewGroup.LayoutParams)localObject8).height = ((Integer)((Pair)localObject2).second).intValue();
          ((aj)localObject6).rnv.setLayoutParams((ViewGroup.LayoutParams)localObject8);
        }
        if ((((TimeLineObject)localObject1).xfI != null) && (((TimeLineObject)localObject1).xfI.wbK.size() > 0))
        {
          localObject2 = (bau)((TimeLineObject)localObject1).xfI.wbK.get(0);
          if (localn.sh())
          {
            ((aj)localObject6).qzM.setOnCompletionListener(new SnsCommentDetailUI.24(this, localn));
            if (!this.rqn.jO(localn.field_snsId))
              ((aj)localObject6).qzM.setOnDecodeDurationListener(new SnsCommentDetailUI.25(this, localn, (aj)localObject6));
          }
          if ((((TimeLineObject)localObject1).xfI == null) || (((TimeLineObject)localObject1).xfI.wbK.size() <= 0))
            break;
          af.cnC();
          if (com.tencent.mm.plugin.sns.model.g.t((bau)localObject2))
            break label4937;
          if (!af.cnC().w((bau)localObject2))
            break label4836;
          ((aj)localObject6).raP.setVisibility(8);
          ((aj)localObject6).rnu.setVisibility(0);
          ((aj)localObject6).rnu.dKB();
          ((com.tencent.mm.plugin.sight.decode.a.a)localObject3).setTagObject(localObject6);
          af.cnC().a(localn, (bau)localObject2, (com.tencent.mm.plugin.sight.decode.a.a)localObject3, hashCode(), 0, az.xYT, localn.sh());
          ((View)localObject7).setTag(localObject6);
          if (this.rqn == null)
            break;
          if (!localn.sh())
            break label5220;
          if (af.cnC().o(localn) != 5)
            break label5215;
          bool = true;
        }
        while (true)
        {
          this.rqn.w(localn.field_snsId, bool);
          break;
          this.jMO.c((View)localObject7, this.rqo.rJZ, this.rqo.rJH);
          break label4040;
          if (((com.tencent.mm.plugin.sns.storage.b)localObject8).qUG == 1)
          {
            i = j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812);
            localObject2 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUH)));
            break label4287;
          }
          if (((com.tencent.mm.plugin.sns.storage.b)localObject8).qUG != 2)
            break label8533;
          i = j - com.tencent.mm.bz.a.al(this, 2131428663) - com.tencent.mm.bz.a.al(this, 2131427865) - getResources().getDimensionPixelSize(2131427812) - getResources().getDimensionPixelSize(2131427812);
          localObject2 = Pair.create(Integer.valueOf(i), Integer.valueOf((int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject8).qUH)));
          break label4287;
          localObject2 = null;
          break label4409;
          label4836: if ((localn.sh()) && (af.cnC().o(localn) == 5))
          {
            af.cnC().A((bau)localObject2);
            ((aj)localObject6).raP.setVisibility(8);
            ((aj)localObject6).rnu.setVisibility(0);
            ((aj)localObject6).rnu.dKB();
            break label4540;
          }
          af.cnC().y((bau)localObject2);
          ((aj)localObject6).raP.setVisibility(0);
          ((aj)localObject6).rnu.setVisibility(8);
          ((aj)localObject6).raP.setImageDrawable(com.tencent.mm.bz.a.g(this, 2131231923));
          break label4540;
          if (af.cnC().u((bau)localObject2))
          {
            ((aj)localObject6).raP.setVisibility(0);
            ((aj)localObject6).rnu.setVisibility(8);
            ((aj)localObject6).raP.setImageDrawable(com.tencent.mm.bz.a.g(this, 2131231923));
          }
          while (true)
          {
            if (!((aj)localObject6).qzM.ckY())
              break label5213;
            ab.d("MicroMsg.SnsCommentDetailUI", "play video error " + ((bau)localObject2).Id + " " + ((bau)localObject2).Url + " " + ((bau)localObject2).wEH);
            af.cnC().y((bau)localObject2);
            ((aj)localObject6).raP.setVisibility(0);
            ((aj)localObject6).rnu.setVisibility(8);
            ((aj)localObject6).raP.setImageDrawable(com.tencent.mm.bz.a.g(this, 2131231923));
            break;
            if (af.cnC().v((bau)localObject2))
            {
              ((aj)localObject6).raP.setVisibility(8);
              ((aj)localObject6).rnu.setVisibility(8);
            }
            else if ((localn.sh()) && (af.cnC().o(localn) <= 5))
            {
              ((aj)localObject6).raP.setVisibility(8);
              ((aj)localObject6).rnu.setVisibility(8);
            }
            else
            {
              af.cnC().y((bau)localObject2);
              ((aj)localObject6).raP.setVisibility(0);
              ((aj)localObject6).rnu.setVisibility(8);
              ((aj)localObject6).raP.setImageDrawable(com.tencent.mm.bz.a.g(this, 2131231923));
            }
          }
          label5213: break label4540;
          label5215: bool = false;
          continue;
          label5220: if (af.cnC().n(localn) == 5)
            bool = true;
          else
            bool = false;
        }
        if (this.klY == 0)
        {
          localObject2 = (LinearLayout)this.rpJ.findViewById(2131827710);
          localObject3 = DV(2130970779);
          if (!this.rqG)
          {
            ((LinearLayout)localObject2).removeView(this.rqJ);
            ((LinearLayout)localObject2).addView((View)localObject3, 3);
            if (((LinearLayout)localObject3).getLayoutParams() == null)
              break label5626;
          }
          label5626: for (localObject2 = new LinearLayout.LayoutParams(((LinearLayout)localObject3).getLayoutParams()); ; localObject2 = new LinearLayout.LayoutParams(-1, -2))
          {
            ((LinearLayout.LayoutParams)localObject2).setMargins(((LinearLayout.LayoutParams)localObject2).leftMargin, com.tencent.mm.bz.a.fromDPToPix(this, 12), ((LinearLayout.LayoutParams)localObject2).rightMargin, ((LinearLayout.LayoutParams)localObject2).bottomMargin);
            ((LinearLayout)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
            if (((TimeLineObject)localObject1).xfI.wbK.isEmpty())
              break label5641;
            localObject6 = (bau)((TimeLineObject)localObject1).xfI.wbK.get(0);
            localObject2 = (MMImageView)((LinearLayout)localObject3).findViewById(2131825687);
            af.cnC().a((bau)localObject6, (View)localObject2, 2131230800, hashCode(), az.xYT);
            this.rqc = ((ImageView)((LinearLayout)localObject3).findViewById(2131824637));
            this.rqc.setOnTouchListener(this.riQ);
            this.cFI = ((TimeLineObject)localObject1).Id;
            cta();
            bool = getIntent().getBooleanExtra("SNS_FROM_MUSIC_ITEM", false);
            ((MMImageView)localObject2).setTag(new q((TimeLineObject)localObject1, this.rpZ, bool));
            ((MMImageView)localObject2).setOnClickListener(this.rqg.rDA);
            localObject7 = ((bau)localObject6).Desc;
            if (!bo.isNullOrNil((String)localObject7))
              ((TextView)((LinearLayout)localObject3).findViewById(2131825690)).setText((CharSequence)localObject7);
            localObject6 = ((bau)localObject6).Title;
            if (!bo.isNullOrNil((String)localObject6))
              ((TextView)((LinearLayout)localObject3).findViewById(2131825689)).setText(new SpannableString((CharSequence)localObject6), TextView.BufferType.SPANNABLE);
            ((LinearLayout)localObject3).setTag(new q((TimeLineObject)localObject1, this.rpZ));
            this.jMO.c((View)localObject3, this.rqo.rJW, this.rqo.rJH);
            ((LinearLayout)localObject3).setOnClickListener(this.rqg.rvD);
            com.tencent.mm.plugin.sns.data.i.b((View)localObject2, this);
            break;
          }
          ((LinearLayout)localObject3).setVisibility(8);
          break;
        }
        if (this.klY == 13)
        {
          this.rpK.setVisibility(8);
          this.rpP.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
          break;
        }
        if ((this.klY == 11) || (this.klY == 14))
          break;
        localObject2 = (LinearLayout)this.rpJ.findViewById(2131827710);
        localObject7 = DV(2130970777);
        localObject8 = (MMImageView)((LinearLayout)localObject7).findViewById(2131825687);
        if (!this.rqG)
        {
          ((LinearLayout)localObject2).removeView(this.rqJ);
          ((LinearLayout)localObject2).addView((View)localObject7, 3);
          if (((LinearLayout)localObject7).getLayoutParams() != null)
          {
            localObject2 = new LinearLayout.LayoutParams(((LinearLayout)localObject7).getLayoutParams());
            ((LinearLayout.LayoutParams)localObject2).setMargins(((LinearLayout.LayoutParams)localObject2).leftMargin, com.tencent.mm.bz.a.fromDPToPix(this, 12), ((LinearLayout.LayoutParams)localObject2).rightMargin, ((LinearLayout.LayoutParams)localObject2).bottomMargin);
            ((LinearLayout)localObject7).setLayoutParams((ViewGroup.LayoutParams)localObject2);
          }
        }
        else
        {
          i = 0;
          if (!localn.sh())
            break label6210;
          if (localn.cqo().coO())
          {
            i = 1;
            ((LinearLayout)localObject7).setTag(localn);
            ((LinearLayout)localObject7).setTag(2131820637, localObject8);
            ((LinearLayout)localObject7).setOnClickListener(this.rqo.rKs);
          }
          k = 0;
        }
        while (true)
        {
          label5877: if (i != 0)
          {
            this.jMO.c((View)localObject7, this.rqo.rKa, this.rqo.rJH);
            if (!csW())
              break label6900;
            localObject2 = au.ZI(((TimeLineObject)localObject1).xfI.Url);
            localObject3 = ((TimeLineObject)localObject1).xfI.Title;
            if (i == 0)
              break label8521;
            localObject2 = ((TimeLineObject)localObject1).xfI.Desc;
          }
          while (true)
          {
            ((LinearLayout)localObject7).findViewById(2131824637).setVisibility(8);
            if (!((TimeLineObject)localObject1).xfI.wbK.isEmpty())
            {
              ((MMImageView)localObject8).setVisibility(0);
              localObject6 = (bau)((TimeLineObject)localObject1).xfI.wbK.get(0);
              if (((TimeLineObject)localObject1).xfI.wbJ == 15)
              {
                ((ImageView)((LinearLayout)localObject7).findViewById(2131824637)).setImageResource(2130839639);
                ((ImageView)((LinearLayout)localObject7).findViewById(2131824637)).setVisibility(0);
                af.cnC().a((bau)localObject6, (View)localObject8, 2131230817, hashCode(), az.dtg().Mp(((TimeLineObject)localObject1).pcX));
                localObject6 = localObject3;
                localObject3 = localObject2;
                localObject2 = localObject6;
                com.tencent.mm.plugin.sns.data.i.b((View)localObject8, this);
                if (((TimeLineObject)localObject1).xfI.wbJ != 15)
                  break label8518;
                localObject3 = "";
                localObject2 = getString(2131303637);
              }
            }
            while (true)
            {
              if (!bo.isNullOrNil((String)localObject3))
              {
                ((LinearLayout)localObject7).findViewById(2131825690).setVisibility(0);
                ((TextView)((LinearLayout)localObject7).findViewById(2131825690)).setText((CharSequence)localObject3);
              }
              while (true)
              {
                localObject3 = (TextView)((LinearLayout)localObject7).findViewById(2131825689);
                if (bo.isNullOrNil((String)localObject2))
                  break label7277;
                ((TextView)localObject3).setVisibility(0);
                if (k == 0)
                  break label7267;
                ((TextView)localObject3).setText(com.tencent.mm.plugin.sns.data.i.a((String)localObject2, dxU(), (TextView)localObject3));
                break;
                localObject2 = new LinearLayout.LayoutParams(-1, -2);
                break label5790;
                if (((TimeLineObject)localObject1).xfI.wbJ == 9)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDu);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 10)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDw);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 17)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDx);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 22)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDy);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 23)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDz);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 14)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDv);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 12)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDD);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 13)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDE);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 15)
                {
                  if (((TimeLineObject)localObject1).xfI.wbK.size() <= 0)
                    break label8524;
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqo.rKf);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 26)
                {
                  ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                  ((LinearLayout)localObject7).setOnClickListener(this.rqg.rDF);
                  i = 0;
                  k = 0;
                  break label5877;
                }
                ((LinearLayout)localObject7).setTag(new q((TimeLineObject)localObject1, this.rpZ));
                ((LinearLayout)localObject7).setOnClickListener(this.rqg.rvD);
                if ((((TimeLineObject)localObject1).fgt & 0x1) <= 0)
                  break label8524;
                i = 0;
                k = 1;
                break label5877;
                this.jMO.c((View)localObject7, this.rqo.rJW, this.rqo.rJH);
                break label5905;
                label6900: localObject2 = "";
                break label5923;
                if (((TimeLineObject)localObject1).xfI.wbJ == 5)
                {
                  localObject3 = au.ZI(((bau)localObject6).Url);
                  localObject2 = ((bau)localObject6).Title;
                  ((LinearLayout)localObject7).findViewById(2131824637).setVisibility(0);
                  af.cnC().a((bau)localObject6, (View)localObject8, 2131230817, hashCode(), az.xYT);
                  break label6077;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 18)
                {
                  ((LinearLayout)localObject7).findViewById(2131824637).setVisibility(0);
                  ((ImageView)((LinearLayout)localObject7).findViewById(2131824637)).setImageResource(2130840532);
                  ((MMImageView)localObject8).setVisibility(0);
                  af.cnC().a((bau)localObject6, (View)localObject8, 2131230817, hashCode(), az.xYT);
                  localObject6 = localObject3;
                  localObject3 = localObject2;
                  localObject2 = localObject6;
                  break label6077;
                }
                af.cnC().b((bau)localObject6, (View)localObject8, hashCode(), az.xYT);
                localObject6 = localObject2;
                localObject2 = localObject3;
                localObject3 = localObject6;
                break label6077;
                if (((TimeLineObject)localObject1).xfI.wbJ == 18)
                {
                  ((ImageView)((LinearLayout)localObject7).findViewById(2131824637)).setVisibility(0);
                  ((ImageView)((LinearLayout)localObject7).findViewById(2131824637)).setImageResource(2130840532);
                  ((MMImageView)localObject8).setVisibility(0);
                  af.cnC().a((View)localObject8, -1, 2131230817, hashCode());
                  localObject6 = localObject3;
                  localObject3 = localObject2;
                  localObject2 = localObject6;
                  break label6077;
                }
                if (((TimeLineObject)localObject1).xfI.wbJ == 26)
                {
                  ((MMImageView)localObject8).setVisibility(0);
                  af.cnC().a((View)localObject8, -1, 2131231726, hashCode());
                  localObject6 = localObject2;
                  localObject2 = localObject3;
                  localObject3 = localObject6;
                  break label6077;
                }
                ((MMImageView)localObject8).setVisibility(0);
                af.cnC().a((View)localObject8, -1, 2131230820, hashCode());
                localObject6 = localObject3;
                localObject3 = localObject2;
                localObject2 = localObject6;
                break label6077;
                ((LinearLayout)localObject7).findViewById(2131825690).setVisibility(8);
              }
              label7267: ((TextView)localObject3).setText((CharSequence)localObject2);
              break;
              label7277: ((TextView)localObject3).setVisibility(8);
              break;
              label7287: ((TextView)localObject6).setVisibility(0);
              if (bo.isNullOrNil((String)localObject2))
                break label1955;
              ((TextView)localObject6).setTextColor(-11048043);
              ((TextView)localObject6).setClickable(true);
              ((TextView)localObject6).setText((CharSequence)localObject2);
              break label1976;
              ((TextView)localObject6).setVisibility(8);
              break label1976;
              if (((TimeLineObject)localObject1).xfG == null)
              {
                localObject2 = null;
                if (((TimeLineObject)localObject1).xfG != null)
                  break label7402;
              }
              label7402: for (localObject3 = null; ; localObject3 = ((TimeLineObject)localObject1).xfG.eUu)
              {
                ((TextView)localObject6).setTag(localn.cqU());
                if ((!bo.isNullOrNil((String)localObject2)) || (!bo.isNullOrNil((String)localObject3)))
                  break label7414;
                ((TextView)localObject6).setVisibility(8);
                break;
                localObject2 = ((TimeLineObject)localObject1).xfG.guP;
                break label7345;
              }
              label7414: ((TextView)localObject6).setVisibility(0);
              if (!bo.isNullOrNil((String)localObject3))
              {
                ((TextView)localObject6).setTextColor(-11048043);
                ((TextView)localObject6).setClickable(true);
                if ((localn.field_snsId == 0L) && (!bo.isNullOrNil((String)localObject2)))
                {
                  ((TextView)localObject6).setText((String)localObject2 + "·" + (String)localObject3);
                  break label1992;
                }
                ((TextView)localObject6).setText((CharSequence)localObject3);
                break label1992;
              }
              ((TextView)localObject6).setText((CharSequence)localObject2);
              ((TextView)localObject6).setClickable(false);
              ((TextView)localObject6).setTextColor(-9211021);
              break label1992;
              label7527: ((TextView)localObject7).setVisibility(8);
              break label2182;
              label7537: if (((com.tencent.mm.plugin.sns.storage.a)localObject4).qTF != com.tencent.mm.plugin.sns.storage.a.qTs)
                break label2182;
              if (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG))
              {
                localObject2 = "";
                localObject8 = ((com.tencent.mm.plugin.sns.storage.a)localObject4).qTI.iterator();
                String str;
                if (((Iterator)localObject8).hasNext())
                {
                  str = (String)((Iterator)localObject8).next();
                  localObject3 = this.rqa.aoN(str);
                  if (localObject3 != null)
                  {
                    localObject3 = ((com.tencent.mm.n.a)localObject3).Oj();
                    if (!bo.isNullOrNil((String)localObject3))
                      localObject3 = (String)localObject2 + (String)localObject3;
                  }
                  while (true)
                  {
                    localObject2 = localObject3;
                    if (((com.tencent.mm.plugin.sns.storage.a)localObject4).qTI.getLast() == str)
                      break;
                    localObject2 = (String)localObject3 + ",";
                    break;
                    localObject3 = (String)localObject2 + str;
                    continue;
                    localObject3 = (String)localObject2 + str;
                  }
                }
                localObject3 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG, new Object[] { localObject2 });
                ((TextView)localObject7).getTextSize();
                localObject8 = new k(com.tencent.mm.pluginsdk.ui.e.j.c(this, (CharSequence)localObject3, 1));
                ((k)localObject8).a(null, (CharSequence)localObject3);
                localObject3 = ((TextView)localObject7).getPaint();
                if (com.tencent.mm.bz.a.ao(this, (int)Layout.getDesiredWidth((CharSequence)localObject8, 0, ((k)localObject8).length(), (TextPaint)localObject3)) > this.rql)
                {
                  if (((String)localObject2).length() <= 1)
                    break label2182;
                  localObject2 = ((String)localObject2).substring(0, ((String)localObject2).length() - 2);
                  str = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject4).qTG, new Object[] { (String)localObject2 + "..." });
                  ((TextView)localObject7).getTextSize();
                  localObject8 = new k(com.tencent.mm.pluginsdk.ui.e.j.c(this, str, 1));
                  ((k)localObject8).a(null, str);
                  i = com.tencent.mm.bz.a.ao(this, (int)Layout.getDesiredWidth((CharSequence)localObject8, 0, ((k)localObject8).length(), (TextPaint)localObject3));
                  ((TextView)localObject7).setText((CharSequence)localObject8, TextView.BufferType.SPANNABLE);
                  ((TextView)localObject7).setVisibility(0);
                  if (i > this.rql)
                    break label2181;
                  break label2182;
                }
                ((TextView)localObject7).setText((CharSequence)localObject8, TextView.BufferType.SPANNABLE);
                ((TextView)localObject7).setVisibility(0);
                break label2182;
              }
              ((TextView)localObject7).setVisibility(8);
              break label2182;
              ((TextView)localObject6).setVisibility(8);
              break label2306;
              ((TextView)localObject3).setVisibility(8);
              break label2509;
              ((TextView)localObject2).setVisibility(8);
              break label2592;
              label8040: if (((cbf)localObject5).xaw.size() <= 0)
                ((TextView)localObject6).setVisibility(8);
              while (true)
              {
                if ((localObject5 == null) || (this.ecX == null) || (!this.ecX.equals(((cbf)localObject5).vHl)) || (((((cbf)localObject5).wGz != 3) || (((cbf)localObject5).xaB == null)) && ((((cbf)localObject5).wGz != 5) || (((cbf)localObject5).wFp == null))))
                  break label8500;
                this.rpJ.findViewById(2131827723).setVisibility(0);
                this.rpJ.findViewById(2131827723).setTag(Integer.valueOf(localn.reX));
                this.rpJ.findViewById(2131827723).setOnClickListener(new SnsCommentDetailUI.29(this));
                break;
                if (this.ecX.equals(((cbf)localObject5).vHl))
                {
                  ((TextView)localObject6).setVisibility(0);
                  i = 0;
                  localObject1 = ((cbf)localObject5).xaw.iterator();
                  localObject2 = "";
                  if (((Iterator)localObject1).hasNext())
                  {
                    localObject4 = (cat)((Iterator)localObject1).next();
                    if (i == 0)
                    {
                      i = 1;
                      localObject2 = (String)localObject2 + "  ";
                      if (((cat)localObject4).wCW == null)
                        break label8318;
                      localObject3 = new StringBuilder().append((String)localObject2);
                      localObject2 = ((cat)localObject4).wCW;
                    }
                    while (true)
                    {
                      localObject2 = (String)localObject2;
                      break;
                      localObject2 = (String)localObject2 + ",  ";
                      break label8248;
                      label8318: localObject7 = this.rqa.aoO(((cat)localObject4).vHl);
                      localObject3 = new StringBuilder().append((String)localObject2);
                      if (localObject7 == null)
                        localObject2 = ((cat)localObject4).vHl;
                      else
                        localObject2 = ((com.tencent.mm.n.a)localObject7).Oj();
                    }
                  }
                  ((TextView)localObject6).setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, getString(2131303833, new Object[] { localObject2 }), ((TextView)localObject6).getTextSize()));
                }
                else
                {
                  ((TextView)localObject6).setVisibility(8);
                  localObject3 = ((cbf)localObject5).xaw.iterator();
                  if (((Iterator)localObject3).hasNext())
                  {
                    localObject2 = (cat)((Iterator)localObject3).next();
                    if (!this.ecX.equals(((cat)localObject2).vHl))
                      break label8040;
                    ((TextView)localObject6).setVisibility(0);
                    localObject2 = getString(2131303834);
                    ((TextView)localObject6).setVisibility(0);
                    ((TextView)localObject6).setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject2, ((TextView)localObject6).getTextSize()));
                  }
                }
              }
              this.rpJ.findViewById(2131827723).setVisibility(8);
              break label2625;
            }
          }
          i = 0;
          k = 0;
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970752;
  }

  public final void initView()
  {
    AppMethodBeat.i(38843);
    setMMTitle(2131303611);
    new SnsCommentDetailUI.17(this);
    setBackBtn(new SnsCommentDetailUI.18(this));
    this.ecX = r.Yz();
    if (af.cnn())
      finish();
    n localn = li(true);
    if (localn == null)
    {
      ab.e("MicroMsg.SnsCommentDetailUI", "invalid pcid:" + this.cFc);
      finish();
      AppMethodBeat.o(38843);
      return;
    }
    ab.i("MicroMsg.SnsCommentDetailUI", "snsId: " + this.cFc + "localId " + this.rpZ + "  username:" + localn.field_userName);
    Object localObject1 = (TextView)findViewById(2131827703);
    label181: int i;
    if (this.rqt)
    {
      ((TextView)localObject1).setVisibility(0);
      ((TextView)localObject1).setText(this.rqu);
      if ((com.tencent.mm.plugin.sns.storage.v.Zo(this.cFc)) || (!localn.cqW()))
        break label620;
      localObject1 = localn.cqM();
      findViewById(2131827704).setVisibility(0);
      localObject2 = (TextView)findViewById(2131827705);
      switch (((bav)localObject1).wFm)
      {
      default:
        if (!bo.isNullOrNil(((bav)localObject1).wFu))
        {
          ((TextView)localObject2).setText(((bav)localObject1).wFu);
          label282: findViewById(2131827706).setVisibility(0);
          i = 1;
        }
        break;
      case 201:
      case 210:
      case 211:
      }
    }
    while (true)
    {
      if (i != 0)
        findViewById(2131827704).setOnClickListener(new SnsCommentDetailUI.9(this, localn));
      this.rpN = ((ListView)findViewById(2131827707));
      this.rpN.post(new SnsCommentDetailUI.10(this));
      this.rpN.setOnScrollListener(new SnsCommentDetailUI.11(this));
      this.rpJ = com.tencent.mm.ui.v.hu(this.mController.ylL).inflate(2130970753, null);
      this.rpP = this.rpJ.findViewById(2131827716);
      this.rpJ.setOnClickListener(this.rqD);
      this.rpN.addHeaderView(this.rpJ);
      boolean bool = csX();
      if (bool)
        break label638;
      ab.i("MicroMsg.SnsCommentDetailUI", "error isOk setheader ".concat(String.valueOf(bool)));
      finish();
      AppMethodBeat.o(38843);
      break;
      ((TextView)localObject1).setVisibility(8);
      break label181;
      if (!bo.isNullOrNil(((bav)localObject1).wFu))
        ((TextView)localObject2).setText(((bav)localObject1).wFu);
      while (true)
      {
        findViewById(2131827706).setVisibility(8);
        i = 0;
        break;
        ((TextView)localObject2).setText(2131303744);
      }
      if (!bo.isNullOrNil(((bav)localObject1).wFu))
        ((TextView)localObject2).setText(((bav)localObject1).wFu);
      while (true)
      {
        findViewById(2131827706).setVisibility(8);
        i = 0;
        break;
        ((TextView)localObject2).setText(2131303746);
      }
      if (!bo.isNullOrNil(((bav)localObject1).wFu))
        ((TextView)localObject2).setText(((bav)localObject1).wFu);
      while (true)
      {
        findViewById(2131827706).setVisibility(8);
        i = 1;
        break;
        ((TextView)localObject2).setText(2131303745);
      }
      ((TextView)localObject2).setText(2131303747);
      break label282;
      label620: findViewById(2131827704).setVisibility(8);
      i = 0;
    }
    label638: localObject1 = li(false);
    if (localObject1 != null)
      this.klY = au.b((n)localObject1, false);
    if ((this.klY == 10) && (r.Yz().equals(localn.field_userName)))
    {
      this.rpM = new SnsDetailLuckyHeader(this);
      localObject1 = new AbsListView.LayoutParams(-1, -2);
      this.rpM.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.rpM.setOnClickListener(this.rqD);
    }
    this.rpL = new LinearLayout(this.mController.ylL);
    localObject1 = new AbsListView.LayoutParams(-1, -2);
    this.rpL.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    this.rpL.setOnClickListener(this.rqD);
    BackwardSupportUtil.b.b(this, 2.0F);
    Object localObject2 = new AbsListView.LayoutParams(-1, 1);
    localObject1 = new LinearLayout(this.mController.ylL);
    ((LinearLayout)localObject1).setBackgroundResource(2130840270);
    ((LinearLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    this.qHj = ((LinearLayout)localObject1);
    if ((localn.field_localPrivate & 0x1) != 0)
    {
      findViewById(2131822763).setVisibility(8);
      localObject1 = new TextView(this);
      ((TextView)localObject1).setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      ((TextView)localObject1).setText(getString(2131303618));
      ((TextView)localObject1).setTextColor(getResources().getColor(2131689761));
      ((TextView)localObject1).setGravity(17);
      ((TextView)localObject1).setPadding(0, BackwardSupportUtil.b.b(this, 7.0F), 0, 0);
      this.rpN.addFooterView((View)localObject1);
    }
    if (this.rpM != null)
    {
      this.rqq = true;
      this.rpN.addHeaderView(this.rpM);
    }
    localObject2 = com.tencent.mm.plugin.sns.model.aj.p(localn);
    label986: cat localcat;
    label1172: long l;
    if (localObject2 == null)
    {
      this.rpL.setVisibility(8);
      this.rpQ = new SnsCommentDetailUI.b(this, new LinkedList(), new LinkedList(), this, localn.cqU());
      this.rpN.addHeaderView(this.rpL);
      this.rpN.setAdapter(this.rpQ);
      this.rhq = ((SnsCommentFooter)findViewById(2131822763));
      this.rhq.setOnEditTouchListener(new SnsCommentDetailUI.13(this, localn));
      this.rhq.setOnSmileyShowListener(new SnsCommentDetailUI.14(this));
      localObject1 = li(true);
      if ((localObject1 != null) && (!((n)localObject1).cqT()))
        this.rhq.setVisibility(8);
      this.rhq.setAfterEditAction(this.rqC);
      this.rhq.ctf();
      this.rhq.setOnCommentSendImp(new SnsCommentDetailUI.15(this, localn));
      this.rqe = getIntent().getBooleanExtra("INTENT_FROMSUI", false);
      if (this.rqe)
      {
        this.rqf = getIntent().getLongExtra("INTENT_FROMSUI_COMMENTID", 0L);
        if ((this.rqf != 0L) && (this.rpQ.rrj != null))
        {
          i = 0;
          if (i < this.rpQ.rrj.size())
          {
            localcat = (cat)this.rpQ.rrj.get(i);
            if (localcat.wZG == 0)
              break label1646;
            l = localcat.wZG;
            label1220: if (l != this.rqf)
              break label1682;
            this.rpN.setSelection(i);
            localObject1 = this.rqa.aoO(localcat.vHl);
            if (localObject1 == null)
              break label1656;
            localObject1 = ((com.tencent.mm.n.a)localObject1).Oj();
            label1263: this.rhq.rrt = 0;
            this.rhq.ctg();
            this.rhq.setCommentHint(getString(2131303752) + (String)localObject1);
            this.rhq.setCommentInfo(localcat);
            if (((cbf)localObject2).xaq.size() <= 0)
              break label1724;
            int j = i + 1;
            i = j;
            if (j > this.rpQ.getCount())
              i = this.rpQ.getCount() - 1;
          }
        }
      }
    }
    label1682: label1724: 
    while (true)
    {
      this.rqC.Ro = i;
      if (this.rqe)
        new ak().postDelayed(new SnsCommentDetailUI.16(this), 100L);
      this.rqp = ((SnsTranslateResultView)this.rpJ.findViewById(2131827715));
      this.rqp.setResultTextSize(((TextView)this.rpJ.findViewById(2131820991)).getTextSize());
      this.rqp.getResultTextView().setBackgroundResource(2130840255);
      localObject1 = new ar(this.cFc, localn.cqU(), false, true, 2);
      this.rqp.getResultTextView().setTag(localObject1);
      this.jMO.c(this.rqp.getResultTextView(), this.rqo.rJK, this.rqo.rJH);
      if (ap.db(this.cFc, 4))
      {
        localObject1 = ap.Ye(this.cFc);
        if ((localObject1 != null) && (((ap.b)localObject1).foa))
        {
          this.rqp.setVisibility(0);
          this.rqp.a(null, 1, ((ap.b)localObject1).result, ((ap.b)localObject1).fwM, false);
          AppMethodBeat.o(38843);
          break;
          this.rpV = ((cbf)localObject2).xaq;
          e(((cbf)localObject2).xaq, ((cbf)localObject2).xat.isEmpty());
          if (this.rpM != null)
            this.rpM.a(localn, this.rqo);
          this.rpQ = new SnsCommentDetailUI.b(this, ((cbf)localObject2).xat, ((cbf)localObject2).xaq, this, localn.cqU());
          break label986;
          label1646: l = localcat.wZJ;
          break label1220;
          label1656: if (localcat.wCW != null)
          {
            localObject1 = localcat.wCW;
            break label1263;
          }
          localObject1 = localcat.vHl;
          break label1263;
          i++;
          break label1172;
        }
        this.rqp.setVisibility(8);
        AppMethodBeat.o(38843);
        break;
      }
      this.rqp.setVisibility(8);
      AppMethodBeat.o(38843);
      break;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38853);
    ab.i("MicroMsg.SnsCommentDetailUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt1 == 15)
    {
      if ((this.rqo != null) && (this.rqo.rJH != null))
        this.rqo.rJH.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(38853);
    }
    while (true)
    {
      return;
      if (paramInt1 == 16)
      {
        ab.i("MicroMsg.SnsCommentDetailUI", "REQUEST_CODE_FOR_FULLSCREEN");
        paramIntent = new gr();
        paramIntent.cBq.scene = 1;
        com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
        AppMethodBeat.o(38853);
      }
      else if (paramInt1 == 2333)
      {
        if (paramIntent != null)
        {
          paramIntent = paramIntent.getStringExtra("Select_Contact");
          if (!bo.isNullOrNil(paramIntent))
          {
            String[] arrayOfString = paramIntent.split(",");
            if (arrayOfString.length > 0)
            {
              this.rhq.crP.showVKB();
              paramIntent = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(arrayOfString[0]);
              if (!bo.isNullOrNil(paramIntent))
              {
                this.rhq.ctg();
                this.rhq.setText("@" + paramIntent + " ");
                this.rhq.setCommentAtPrefix("@" + paramIntent + " ");
                this.rhq.setCommentInfo(new cat());
                this.rhq.getCommentInfo().vHl = arrayOfString[0];
                this.rhq.setCommentFlag(8);
              }
            }
          }
        }
        AppMethodBeat.o(38853);
      }
      else
      {
        if (paramInt2 == -1)
          break;
        AppMethodBeat.o(38853);
      }
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(38853);
      break;
      if (paramInt2 == -1)
      {
        paramIntent = managedQuery(paramIntent.getData(), null, null, null, null);
        if (paramIntent.moveToFirst())
          startActivity(new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/".concat(String.valueOf(paramIntent.getString(paramIntent.getColumnIndexOrThrow("_id")))))));
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(38852);
    super.onConfigurationChanged(paramConfiguration);
    n localn = com.tencent.mm.plugin.sns.storage.h.YS(this.cFc);
    paramConfiguration = com.tencent.mm.plugin.sns.model.aj.p(localn);
    e(paramConfiguration.xaq, paramConfiguration.xat.isEmpty());
    if (this.rpM != null)
      this.rpM.a(localn, this.rqo);
    if (this.rqJ != null)
    {
      this.rqi = af.cnN();
      this.rqJ.setImageViewWidth(this.rqi);
    }
    AppMethodBeat.o(38852);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(38839);
    com.tencent.mm.pluginsdk.f.m(this);
    super.onCreate(paramBundle);
    com.tencent.mm.ui.b.c(this, true);
    af.cnv().a(5, "@__weixintimtline", this);
    this.mmO = ((ClipboardManager)getApplicationContext().getSystemService("clipboard"));
    paramBundle = ae.hy(this);
    this.mScreenWidth = paramBundle.x;
    this.mScreenHeight = paramBundle.y;
    this.rpH = System.currentTimeMillis();
    this.jMO = new com.tencent.mm.ui.widget.b.a(this);
    this.rqw = getIntent().getIntExtra("INTENT_COMMENT_TYPE", 0);
    this.cFc = bo.bc(getIntent().getStringExtra("INTENT_SNSID"), "");
    if (bo.isNullOrNil(this.cFc))
      this.cFc = com.tencent.mm.plugin.sns.storage.v.ao("sns_table_", getIntent().getLongExtra("INTENT_SNSID", 0L));
    this.rpZ = bo.bc(getIntent().getStringExtra("INTENT_SNS_LOCAL_ID"), "");
    if (bo.isNullOrNil(this.rpZ))
    {
      int i = getIntent().getIntExtra("INTENT_SNS_LOCAL_ID", -1);
      if (i != -1)
        this.rpZ = com.tencent.mm.plugin.sns.storage.v.ao("sns_table_", i);
    }
    this.rqo = new SnsCommentDetailUI.3(this, getSource(), this, this.rqx);
    paramBundle = (FrameLayout)findViewById(2131822759);
    this.rhz = new com.tencent.mm.plugin.sns.g.b(this, this.rqo, paramBundle);
    this.rhy = new b(this, this.rqo, paramBundle, this.rhz);
    this.rqo.bIB();
    this.rqt = getIntent().getBooleanExtra("intent_show_collapse_info", false);
    this.rqu = getIntent().getStringExtra("intent_content_collapse_hint");
    this.rqg = new bc(this, new SnsCommentDetailUI.4(this), getSource(), this.rqx);
    long l = System.currentTimeMillis();
    paramBundle = getIntent().getByteArrayExtra("INTENT_SNS_TIMELINEOBJECT");
    Object localObject;
    if (paramBundle != null)
      localObject = new TimeLineObject();
    try
    {
      ((TimeLineObject)localObject).parseFrom(paramBundle);
      if (af.cnF().kD(new BigInteger(((TimeLineObject)localObject).Id).longValue()) == null)
      {
        ab.i("MicroMsg.SnsCommentDetailUI", "info is null, can insert to sns info");
        paramBundle = new n();
        paramBundle.field_snsId = new BigInteger(((TimeLineObject)localObject).Id).longValue();
      }
    }
    catch (IOException paramBundle)
    {
      try
      {
        paramBundle.field_content = ((TimeLineObject)localObject).toByteArray();
        label452: paramBundle.field_createTime = ((TimeLineObject)localObject).pcX;
        paramBundle.field_userName = ((TimeLineObject)localObject).jBB;
        paramBundle.field_type = ((TimeLineObject)localObject).xfI.wbJ;
        paramBundle.cqR();
        localObject = new cbf();
        ((cbf)localObject).xam = new SKBuiltinBuffer_t();
        try
        {
          paramBundle.field_attrBuf = ((cbf)localObject).toByteArray();
          label516: af.cnF().b(paramBundle);
          ab.i("MicroMsg.FTS.SnsComment", "insert sns obj use time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          while (true)
          {
            paramBundle = li(true);
            ab.i("MicroMsg.SnsCommentDetailUI", "onCreate()  snsId : " + this.cFc + " localSnsId: " + this.rpZ);
            if (paramBundle != null)
              ab.i("MicroMsg.SnsCommentDetailUI", "commentdetail %s", new Object[] { bo.bc(paramBundle.field_userName, "") });
            if (com.tencent.mm.plugin.sns.storage.v.Zo(this.cFc))
            {
              if (!com.tencent.mm.plugin.sns.storage.v.WT(this.cFc))
                break label1121;
              if (paramBundle == null)
                break label1089;
              if (!t.mX(paramBundle.field_userName))
              {
                com.tencent.mm.kernel.g.RQ();
                com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.sns.model.q(com.tencent.mm.plugin.sns.storage.v.Zm(this.cFc)), 0);
              }
            }
            label686: com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(210, this);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(218, this);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(213, this);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(682, this);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(214, this);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(683, this);
            this.rqa = af.cnt();
            this.rhs = new an(this);
            this.rpY = new aq(this.mController.ylL);
            this.rqd = new j(this, getSource(), this.rqx);
            if (paramBundle != null)
              this.klY = au.b(paramBundle, false);
            if ((paramBundle != null) && (paramBundle.DI(32)))
            {
              if (this.rqw == 16)
              {
                this.rqn = new com.tencent.mm.plugin.sns.a.b.g(2);
                label892: this.rqn.a(this.mScreenHeight, getSupportActionBar().getCustomView(), this);
                au.b(paramBundle, false);
              }
            }
            else
            {
              initView();
              if ((paramBundle != null) && (paramBundle.DI(32)))
              {
                localObject = com.tencent.mm.plugin.sns.model.aj.p(paramBundle);
                this.rqn.a(0, paramBundle.cqU(), paramBundle.cqQ(), this.rpJ, paramBundle.field_snsId, (cbf)localObject, this.klY, 2);
              }
              if ((this.rpJ != null) && (paramBundle != null))
              {
                localObject = (com.tencent.mm.plugin.sight.decode.a.a)this.rpJ.findViewById(2131820629);
                boolean bool2 = bool1;
                if (paramBundle.cqu().xfI != null)
                {
                  bool2 = bool1;
                  if (paramBundle.cqu().xfI.wbJ == 15)
                  {
                    bool2 = bool1;
                    if ((localObject instanceof SightPlayImageView))
                      bool2 = ((SightPlayImageView)localObject).qyA.cla();
                  }
                }
                com.tencent.mm.plugin.sns.a.b.j.a(paramBundle, true, bool2, getSource());
              }
              if (this.rpN != null)
                break label1177;
              AppMethodBeat.o(38839);
            }
            while (true)
            {
              return;
              ab.i("MicroMsg.SnsCommentDetailUI", "info is not null, can not insert to sns info");
              break;
              label1089: com.tencent.mm.kernel.g.RQ();
              com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.sns.model.q(com.tencent.mm.plugin.sns.storage.v.Zm(this.cFc)), 0);
              break label686;
              label1121: com.tencent.mm.kernel.g.RQ();
              com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.sns.model.m(com.tencent.mm.plugin.sns.storage.v.Zm(this.cFc), 0, f(paramBundle).qTU), 0);
              break label686;
              this.rqn = new com.tencent.mm.plugin.sns.a.b.g(1);
              break label892;
              label1177: this.rpN.setOnTouchListener(new SnsCommentDetailUI.5(this));
              com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
              com.tencent.mm.sdk.b.a.xxA.c(this.rqy);
              com.tencent.mm.sdk.b.a.xxA.c(this.rqz);
              com.tencent.mm.sdk.b.a.xxA.c(this.rqA);
              com.tencent.mm.sdk.b.a.xxA.c(this.rqB);
              com.tencent.mm.sdk.b.a.xxA.c(this.rqE);
              com.tencent.mm.sdk.b.a.xxA.c(this.rqF);
              com.tencent.mm.sdk.b.a.xxA.c(this.rhD);
              com.tencent.mm.pluginsdk.f.n(this);
              AppMethodBeat.o(38839);
            }
            paramBundle = paramBundle;
          }
        }
        catch (IOException localIOException)
        {
          break label516;
        }
      }
      catch (Exception localException)
      {
        break label452;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38840);
    af.cnv().a(this, 5);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(210, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(218, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(213, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(214, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(683, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(682, this);
    af.cnC().ab(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    if (this.rqd != null)
      this.rqd.activity = null;
    aa.crX();
    if (this.rhq != null)
      this.rhq.bMO();
    n localn = li(false);
    Object localObject;
    if ((localn != null) && (localn.DI(32)))
    {
      if (this.rqn != null)
        this.rqn.j(0, localn.cqU(), 2);
      localObject = f(localn);
      if (localObject != null)
        break label448;
      localObject = "";
      if (!localn.coX())
        break label456;
      af.cnz().e(14652, new Object[] { com.tencent.mm.plugin.sns.a.b.f.a(localn.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId), localObject, Long.valueOf(this.rpH), Long.valueOf(System.currentTimeMillis()) }) });
    }
    while (true)
    {
      com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.lZ(732);
      localb.tx(com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId)).tx((String)localObject).tx(this.rpH).tx(System.currentTimeMillis());
      localb.ajK();
      this.rqo.removeListener();
      com.tencent.mm.sdk.b.a.xxA.d(this.rqy);
      com.tencent.mm.sdk.b.a.xxA.d(this.rqz);
      com.tencent.mm.sdk.b.a.xxA.d(this.rqA);
      com.tencent.mm.sdk.b.a.xxA.d(this.rqB);
      com.tencent.mm.sdk.b.a.xxA.d(this.rqE);
      com.tencent.mm.sdk.b.a.xxA.d(this.rqF);
      com.tencent.mm.sdk.b.a.xxA.d(this.rhD);
      super.onDestroy();
      AppMethodBeat.o(38840);
      return;
      label448: localObject = ((com.tencent.mm.plugin.sns.storage.a)localObject).qPj;
      break;
      label456: af.cnz().e(12012, new Object[] { com.tencent.mm.plugin.sns.a.b.f.a(localn.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId), localObject, Long.valueOf(this.rpH), Long.valueOf(System.currentTimeMillis()) }) });
    }
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(38855);
    if (this.mController.ymc == 2)
    {
      ab.i("MicroMsg.SnsCommentDetailUI", "keybaordhide! ");
      this.rpX = false;
      AppMethodBeat.o(38855);
    }
    while (true)
    {
      return;
      if (this.mController.ymc == 1)
      {
        csY();
        this.rho = false;
        this.rqC.run();
      }
      AppMethodBeat.o(38855);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(38842);
    af.cnA().b(this);
    super.onPause();
    this.rhq.eAk.onPause();
    new tn().cPI.type = 1;
    if (this.rqn != null)
      this.rqn.onPause();
    AppMethodBeat.o(38842);
  }

  public void onResume()
  {
    AppMethodBeat.i(38841);
    af.cnA().a(this);
    tn localtn = new tn();
    localtn.cPI.cPJ = 0;
    localtn.cPI.cPK = 1;
    localtn.cPI.cPL = 0;
    localtn.cPI.type = 0;
    com.tencent.mm.sdk.b.a.xxA.m(localtn);
    if (this.rqn != null)
      this.rqn.onResume();
    if (this.rqm != null)
      this.rqm.refreshView();
    super.onResume();
    AppMethodBeat.o(38841);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(38854);
    if ((paramm.getType() == 218) && (this.rhB != null))
      this.rhB.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = com.tencent.mm.plugin.sns.storage.h.YS(this.cFc);
      if (paramm == null)
      {
        ab.e("MicroMsg.SnsCommentDetailUI", "invalid pcid:" + this.cFc);
        finish();
        AppMethodBeat.o(38854);
      }
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.SnsCommentDetailUI", "snsId: " + this.cFc + "  username:" + paramm.field_userName);
      if (this.rpJ == null)
      {
        ab.e("MicroMsg.SnsCommentDetailUI", "fatal error! Sns onSceneEnd before initView and infoHeader is null!");
        finish();
        AppMethodBeat.o(38854);
      }
      else
      {
        csX();
        paramString = com.tencent.mm.plugin.sns.model.aj.p(paramm);
        ab.i("MicroMsg.SnsCommentDetailUI", "onsceneend " + paramString.xaq.size() + " " + paramString.xat.size());
        if (paramString == null)
        {
          AppMethodBeat.o(38854);
        }
        else
        {
          if (!f(this.rpV, paramString.xaq))
          {
            e(paramString.xaq, paramString.xat.isEmpty());
            this.rpV = paramString.xaq;
          }
          if (this.rpM != null)
            this.rpM.a(paramm, this.rqo);
          paramm = this.rpQ;
          LinkedList localLinkedList = paramString.xat;
          paramString = paramString.xaq;
          paramm.rrj = localLinkedList;
          paramm.rrk = paramString;
          this.rpQ.notifyDataSetChanged();
          paramString = this.rpQ;
          new ak().postDelayed(new SnsCommentDetailUI.b.1(paramString), 60L);
          AppMethodBeat.o(38854);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI
 * JD-Core Version:    0.6.2
 */