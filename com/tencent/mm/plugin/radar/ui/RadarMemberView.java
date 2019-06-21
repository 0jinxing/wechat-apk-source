package com.tencent.mm.plugin.radar.ui;

import a.f;
import a.f.b.t;
import a.f.b.v;
import a.f.b.y;
import a.i.k;
import a.l;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.widget.a.c;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "alert", "Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "avatarCopy", "Landroid/widget/ImageView;", "getAvatarCopy", "()Landroid/widget/ImageView;", "avatarCopy$delegate", "Lkotlin/Lazy;", "avatarCopyContainer", "Landroid/view/View;", "getAvatarCopyContainer", "()Landroid/view/View;", "avatarCopyContainer$delegate", "avatarHolder", "getAvatarHolder", "avatarHolder$delegate", "avatarItem", "confirmBtn", "Landroid/widget/Button;", "getConfirmBtn", "()Landroid/widget/Button;", "confirmBtn$delegate", "confirmBtnDisabled", "Landroid/widget/TextView;", "getConfirmBtnDisabled", "()Landroid/widget/TextView;", "confirmBtnDisabled$delegate", "contact", "Lcom/tencent/mm/storage/Contact;", "contentET", "Landroid/widget/EditText;", "dismissing", "", "exposeTv", "getExposeTv", "exposeTv$delegate", "handler", "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1;", "isShowing", "()Z", "listener", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView$OnConfirmBtnClickListener;", "mOnModifyNameClickListener", "Landroid/view/View$OnClickListener;", "member", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "getMember", "()Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "setMember", "(Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;)V", "memberNameTv", "getMemberNameTv", "memberNameTv$delegate", "modifyNameBtn", "getModifyNameBtn", "modifyNameBtn$delegate", "sayHiTv", "getSayHiTv", "sayHiTv$delegate", "sendDialog", "state", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "getState", "()Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "setState", "(Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;)V", "stranger", "Lcom/tencent/mm/storage/Stranger;", "tipTV", "toPosCache", "", "wordcntTV", "dealModRemarkName", "dismiss", "", "hideAll", "initView", "popup", "view", "reset", "setListener", "showModifyDialog", "name", "", "switchState", "updateState", "username", "Companion", "OnConfirmBtnClickListener", "plugin-radar_release"})
public final class RadarMemberView extends RelativeLayout
{
  private static final String TAG = "MicroMsg.RadarMemberView";
  private static final int pCv = 0;
  private static final int pCw = 1;
  public static final RadarMemberView.a pCx;
  private ad ehM;
  private View gub;
  private c gud;
  private TextView mJS;
  private bpb pBK;
  private c.e pBL;
  private View pCe;
  private final f pCf;
  private final f pCg;
  private final f pCh;
  private final f pCi;
  private final f pCj;
  private final f pCk;
  private final f pCl;
  private final f pCm;
  private int[] pCn;
  private final f pCo;
  private boolean pCp;
  private bv pCq;
  private RadarMemberView.b pCr;
  private final View.OnClickListener pCs;
  private final RadarMemberView.d pCt;
  private TextView pCu;
  private EditText pwu;

  static
  {
    AppMethodBeat.i(102964);
    eQB = new k[] { (k)v.a(new t(v.aN(RadarMemberView.class), "avatarHolder", "getAvatarHolder()Landroid/view/View;")), (k)v.a(new t(v.aN(RadarMemberView.class), "avatarCopy", "getAvatarCopy()Landroid/widget/ImageView;")), (k)v.a(new t(v.aN(RadarMemberView.class), "avatarCopyContainer", "getAvatarCopyContainer()Landroid/view/View;")), (k)v.a(new t(v.aN(RadarMemberView.class), "confirmBtn", "getConfirmBtn()Landroid/widget/Button;")), (k)v.a(new t(v.aN(RadarMemberView.class), "confirmBtnDisabled", "getConfirmBtnDisabled()Landroid/widget/TextView;")), (k)v.a(new t(v.aN(RadarMemberView.class), "memberNameTv", "getMemberNameTv()Landroid/widget/TextView;")), (k)v.a(new t(v.aN(RadarMemberView.class), "modifyNameBtn", "getModifyNameBtn()Landroid/widget/Button;")), (k)v.a(new t(v.aN(RadarMemberView.class), "sayHiTv", "getSayHiTv()Landroid/widget/TextView;")), (k)v.a(new t(v.aN(RadarMemberView.class), "exposeTv", "getExposeTv()Landroid/widget/TextView;")) };
    pCx = new RadarMemberView.a((byte)0);
    TAG = "MicroMsg.RadarMemberView";
    pCw = 1;
    AppMethodBeat.o(102964);
  }

  public RadarMemberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(102981);
    this.pCf = i.aa(this, 2131826785);
    this.pCg = i.aa(this, 2131826789);
    this.pCh = i.aa(this, 2131826788);
    this.pCi = i.aa(this, 2131826784);
    this.pCj = i.aa(this, 2131826783);
    this.pCk = i.aa(this, 2131826786);
    this.pCl = i.aa(this, 2131826787);
    this.pCm = i.aa(this, 2131826782);
    this.pCo = i.aa(this, 2131826790);
    this.pCs = ((View.OnClickListener)new RadarMemberView.h(this));
    this.pCt = new RadarMemberView.d(this);
    AppMethodBeat.o(102981);
  }

  public RadarMemberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(102982);
    this.pCf = i.aa(this, 2131826785);
    this.pCg = i.aa(this, 2131826789);
    this.pCh = i.aa(this, 2131826788);
    this.pCi = i.aa(this, 2131826784);
    this.pCj = i.aa(this, 2131826783);
    this.pCk = i.aa(this, 2131826786);
    this.pCl = i.aa(this, 2131826787);
    this.pCm = i.aa(this, 2131826782);
    this.pCo = i.aa(this, 2131826790);
    this.pCs = ((View.OnClickListener)new RadarMemberView.h(this));
    this.pCt = new RadarMemberView.d(this);
    AppMethodBeat.o(102982);
  }

  private final void a(c.e parame)
  {
    AppMethodBeat.i(102976);
    getExposeTv().setVisibility(0);
    if (parame == null)
    {
      AppMethodBeat.o(102976);
      return;
    }
    switch (c.eQZ[parame.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(102976);
      break;
      getMemberNameTv().setVisibility(0);
      getModifyNameBtn().setVisibility(0);
      getConfirmBtn().setText(2131302123);
      getConfirmBtn().setVisibility(0);
      getConfirmBtnDisabled().setVisibility(8);
      getSayHiTv().setVisibility(8);
      AppMethodBeat.o(102976);
      break;
      getMemberNameTv().setVisibility(0);
      getModifyNameBtn().setVisibility(0);
      getConfirmBtnDisabled().setText(2131302130);
      getConfirmBtn().setVisibility(8);
      getConfirmBtnDisabled().setVisibility(0);
      getSayHiTv().setVisibility(8);
      AppMethodBeat.o(102976);
      break;
      getMemberNameTv().setVisibility(0);
      getModifyNameBtn().setVisibility(0);
      getConfirmBtnDisabled().setText(2131302110);
      getConfirmBtn().setVisibility(8);
      getConfirmBtnDisabled().setVisibility(0);
      getSayHiTv().setVisibility(8);
      AppMethodBeat.o(102976);
      break;
      getMemberNameTv().setVisibility(0);
      getModifyNameBtn().setVisibility(0);
      getConfirmBtn().setText(2131302109);
      getConfirmBtn().setVisibility(0);
      getConfirmBtnDisabled().setVisibility(8);
      getSayHiTv().setText((CharSequence)getContext().getString(2131302121));
      getSayHiTv().setVisibility(0);
    }
  }

  private final ImageView getAvatarCopy()
  {
    AppMethodBeat.i(102966);
    ImageView localImageView = (ImageView)this.pCg.getValue();
    AppMethodBeat.o(102966);
    return localImageView;
  }

  private final View getAvatarCopyContainer()
  {
    AppMethodBeat.i(102967);
    View localView = (View)this.pCh.getValue();
    AppMethodBeat.o(102967);
    return localView;
  }

  private final View getAvatarHolder()
  {
    AppMethodBeat.i(102965);
    View localView = (View)this.pCf.getValue();
    AppMethodBeat.o(102965);
    return localView;
  }

  private final Button getConfirmBtn()
  {
    AppMethodBeat.i(102968);
    Button localButton = (Button)this.pCi.getValue();
    AppMethodBeat.o(102968);
    return localButton;
  }

  private final TextView getConfirmBtnDisabled()
  {
    AppMethodBeat.i(102969);
    TextView localTextView = (TextView)this.pCj.getValue();
    AppMethodBeat.o(102969);
    return localTextView;
  }

  private final TextView getExposeTv()
  {
    AppMethodBeat.i(102973);
    TextView localTextView = (TextView)this.pCo.getValue();
    AppMethodBeat.o(102973);
    return localTextView;
  }

  private final TextView getMemberNameTv()
  {
    AppMethodBeat.i(102970);
    TextView localTextView = (TextView)this.pCk.getValue();
    AppMethodBeat.o(102970);
    return localTextView;
  }

  private final Button getModifyNameBtn()
  {
    AppMethodBeat.i(102971);
    Button localButton = (Button)this.pCl.getValue();
    AppMethodBeat.o(102971);
    return localButton;
  }

  private final TextView getSayHiTv()
  {
    AppMethodBeat.i(102972);
    TextView localTextView = (TextView)this.pCm.getValue();
    AppMethodBeat.o(102972);
    return localTextView;
  }

  private final void reset()
  {
    AppMethodBeat.i(102980);
    getAvatarCopyContainer().setVisibility(8);
    getMemberNameTv().setVisibility(4);
    getModifyNameBtn().setVisibility(4);
    getConfirmBtn().setVisibility(8);
    getConfirmBtnDisabled().setVisibility(8);
    getSayHiTv().setVisibility(8);
    getExposeTv().setVisibility(8);
    AppMethodBeat.o(102980);
  }

  public final void a(View paramView, bpb parambpb, c.e parame)
  {
    AppMethodBeat.i(102978);
    a.f.b.j.p(paramView, "view");
    a.f.b.j.p(parambpb, "member");
    ab.d(TAG, "popup");
    this.pBL = parame;
    this.pBK = parambpb;
    parame = getConfirmBtn();
    if (parame != null)
      parame.setOnClickListener((View.OnClickListener)new RadarMemberView.e(this, parambpb));
    getModifyNameBtn().setOnClickListener(this.pCs);
    setOnTouchListener((View.OnTouchListener)new RadarMemberView.f(this));
    getExposeTv().setOnClickListener((View.OnClickListener)new g(this));
    parame = g.pDK;
    parame = g.b(parambpb);
    if (!a.k.m.ar((CharSequence)parame))
    {
      localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject, "service(IMessengerStorage::class.java)");
      this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(parame);
    }
    Object localObject = this.ehM;
    if ((localObject != null) && (((ad)localObject).NX() == true))
    {
      parame = this.ehM;
      if (parame != null)
      {
        parame = parame.Hr();
        localObject = getMemberNameTv();
        if ((this.ehM == null) || (bo.isNullOrNil(parame)))
          break label609;
      }
    }
    label609: for (parambpb = (CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), (CharSequence)parame, getMemberNameTv().getTextSize()); ; parambpb = (CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), (CharSequence)parambpb.jCH, getMemberNameTv().getTextSize()))
    {
      ((TextView)localObject).setText(parambpb);
      getMemberNameTv().setVisibility(4);
      getModifyNameBtn().setVisibility(4);
      reset();
      this.pCe = paramView;
      paramView = this.pCe;
      if (paramView == null)
        a.f.b.j.dWJ();
      paramView = paramView.findViewById(2131826793);
      a.f.b.j.o(paramView, "avatarItem!!.findViewByI…ar_result_item_avatar_iv)");
      parambpb = (ImageView)paramView;
      paramView = this.pCe;
      if (paramView == null)
        a.f.b.j.dWJ();
      paramView = paramView.findViewById(2131826788);
      a.f.b.j.o(paramView, "avatarItem!!.findViewByI…d.radar_avatar_container)");
      parame = this.pCe;
      if (parame == null)
        a.f.b.j.dWJ();
      parame.setVisibility(4);
      getAvatarCopy().setImageDrawable(parambpb.getDrawable());
      getAvatarCopyContainer().setVisibility(0);
      localObject = new int[2];
      paramView.getLocationInWindow((int[])localObject);
      parame = new int[2];
      getAvatarHolder().getLocationInWindow(parame);
      this.pCn = parame;
      setVisibility(0);
      parambpb = new AnimationSet(true);
      parambpb.setFillAfter(true);
      parambpb.setRepeatCount(1);
      parambpb.setDuration(500L);
      float f1 = getAvatarHolder().getHeight() / paramView.getHeight();
      float f2 = (paramView.getWidth() - paramView.getHeight()) / 2;
      paramView = new TranslateAnimation(localObject[0], parame[0] - f2 * f1, localObject[1], parame[1]);
      parambpb.addAnimation((Animation)new ScaleAnimation(1.0F, f1, 1.0F, f1));
      parambpb.addAnimation((Animation)paramView);
      parambpb.setAnimationListener((Animation.AnimationListener)new RadarMemberView.i(this));
      getAvatarCopyContainer().startAnimation((Animation)parambpb);
      AppMethodBeat.o(102978);
      return;
      parame = null;
      break;
      localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject, "service(IMessengerStorage::class.java)");
      this.pCq = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XN().RB(parame);
      parame = this.pCq;
      if (parame != null)
      {
        parame = parame.Hr();
        break;
      }
      parame = null;
      break;
    }
  }

  public final void c(String paramString, c.e parame)
  {
    Object localObject1 = null;
    AppMethodBeat.i(102975);
    a.f.b.j.p(paramString, "username");
    a.f.b.j.p(parame, "state");
    if ((!isShowing()) || (this.pCp))
    {
      AppMethodBeat.o(102975);
      return;
    }
    Object localObject2 = this.pBK;
    if (localObject2 != null);
    for (localObject2 = ((bpb)localObject2).wfK; ; localObject2 = null)
    {
      if (!a.f.b.j.j(paramString, localObject2))
      {
        bpb localbpb = this.pBK;
        localObject2 = localObject1;
        if (localbpb != null)
          localObject2 = localbpb.jBB;
        if (!a.f.b.j.j(paramString, localObject2));
      }
      else
      {
        a(parame);
      }
      AppMethodBeat.o(102975);
      break;
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(102979);
    ab.d(TAG, "dismiss");
    if (this.pCp)
      AppMethodBeat.o(102979);
    while (true)
    {
      return;
      this.pCp = true;
      Object localObject1 = this.pCe;
      if (localObject1 == null)
        a.f.b.j.dWJ();
      View localView = ((View)localObject1).findViewById(2131826788);
      a.f.b.j.o(localView, "avatarItem!!.findViewByI…d.radar_avatar_container)");
      localObject1 = new AnimationSet(true);
      ((AnimationSet)localObject1).setFillAfter(true);
      ((AnimationSet)localObject1).setRepeatCount(1);
      ((AnimationSet)localObject1).setDuration(500L);
      int[] arrayOfInt = this.pCn;
      Object localObject2 = new int[2];
      localView.getLocationInWindow((int[])localObject2);
      float f1 = getAvatarHolder().getHeight() / localView.getHeight();
      float f2 = (localView.getWidth() - localView.getHeight()) / 2;
      if (arrayOfInt == null)
        a.f.b.j.dWJ();
      localObject2 = new TranslateAnimation(arrayOfInt[0] - f2 * f1, localObject2[0], arrayOfInt[1], localObject2[1]);
      ((AnimationSet)localObject1).addAnimation((Animation)new ScaleAnimation(f1, 1.0F, f1, 1.0F));
      ((AnimationSet)localObject1).addAnimation((Animation)localObject2);
      ((AnimationSet)localObject1).setAnimationListener((Animation.AnimationListener)new RadarMemberView.c(this));
      getMemberNameTv().setVisibility(4);
      getModifyNameBtn().setVisibility(4);
      getConfirmBtn().setVisibility(8);
      getConfirmBtnDisabled().setVisibility(8);
      getSayHiTv().setVisibility(8);
      getExposeTv().setVisibility(8);
      getAvatarCopyContainer().startAnimation((Animation)localObject1);
      AppMethodBeat.o(102979);
    }
  }

  public final bpb getMember()
  {
    return this.pBK;
  }

  public final c.e getState()
  {
    return this.pBL;
  }

  public final boolean isShowing()
  {
    AppMethodBeat.i(102974);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(102974);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(102974);
    }
  }

  public final void setListener(RadarMemberView.b paramb)
  {
    AppMethodBeat.i(102977);
    a.f.b.j.p(paramb, "listener");
    this.pCr = paramb;
    AppMethodBeat.o(102977);
  }

  public final void setMember(bpb parambpb)
  {
    this.pBK = parambpb;
  }

  public final void setState(c.e parame)
  {
    this.pBL = parame;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class g
    implements View.OnClickListener
  {
    g(RadarMemberView paramRadarMemberView)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(102953);
      Intent localIntent = new Intent();
      paramView = RadarMemberView.c(this.pCy);
      if (paramView != null);
      for (paramView = paramView.getUsername(); ; paramView = null)
      {
        localIntent.putExtra("k_username", paramView);
        localIntent.putExtra("showShare", false);
        paramView = y.AVH;
        paramView = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", Arrays.copyOf(new Object[] { Integer.valueOf(38) }, 1));
        a.f.b.j.o(paramView, "java.lang.String.format(format, *args)");
        localIntent.putExtra("rawUrl", paramView);
        d.b(this.pCy.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(102953);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView
 * JD-Core Version:    0.6.2
 */