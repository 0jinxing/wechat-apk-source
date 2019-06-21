package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.af.r;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.bac;
import com.tencent.mm.protocal.protobuf.eg;
import com.tencent.mm.protocal.protobuf.jz;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.widget.MMNeat7extView;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoHeaderView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "appMsgStat", "Lcom/tencent/mm/protocal/protobuf/BizAppMsgStat;", "avatarIv", "Landroid/widget/ImageView;", "avatarLayout", "Landroid/widget/LinearLayout;", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "dataLayout", "Landroid/view/View;", "descLayout", "descMoreLayout", "descTv", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "haoKanTv", "Landroid/widget/TextView;", "haokanCountTv", "haokanTipsIcon", "haokanTipsLayout", "haokanTipsShareTv", "maliciousTipsTv", "msgInfo", "Lcom/tencent/mm/message/MPMsgInfo;", "needShowHaokanView", "", "nicknameTv", "readCountTv", "readerItem", "Lcom/tencent/mm/message/BizReaderItem;", "talker", "timeTv", "titleTv", "wowEduLayout", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWowEduView;", "writeCommentLayout", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout;", "initAvatarNickName", "", "initData", "initView", "onAppMsgLike", "setDesc", "setMaliciousInfo", "info", "Lcom/tencent/mm/protocal/protobuf/MaliciousTitleInfo;", "setOriginInfo", "Lcom/tencent/mm/protocal/protobuf/AppMsgExtBaseAppMsgInfo;", "setWow", "setWowEduView", "view", "setWriteCommentLayout", "layout", "showEduView", "showHaoKanView", "update", "plugin-brandservice_release"})
public final class MPVideoHeaderView extends RelativeLayout
{
  private final String TAG;
  private ImageView eks;
  r jVG;
  p jVH;
  private MPVideoWriteCommentLayout jWN;
  b jWx;
  private View jXA;
  private View jXB;
  private TextView jXC;
  private TextView jXD;
  private TextView jXE;
  private TextView jXF;
  View jXG;
  TextView jXH;
  ImageView jXI;
  View jXJ;
  MPVideoWowEduView jXK;
  boolean jXu;
  jz jXv;
  private LinearLayout jXw;
  private TextView jXx;
  private MMNeat7extView jXy;
  private MMNeat7extView jXz;
  String talker;
  private TextView timeTv;

  public MPVideoHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(15266);
    this.TAG = "MicroMsg.MPVideoHeaderView";
    this.talker = "";
    View.inflate(paramContext, 2130970255, (ViewGroup)this);
    paramAttributeSet = findViewById(2131826175);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_avatar_layout)");
    this.jXw = ((LinearLayout)paramAttributeSet);
    paramAttributeSet = findViewById(2131826157);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_avatar_iv)");
    this.eks = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826176);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_nick_name_tv)");
    this.jXx = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826178);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_title_tv)");
    this.jXy = ((MMNeat7extView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826181);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_desc_tv)");
    this.jXz = ((MMNeat7extView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826182);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_desc_show_more_layout)");
    this.jXA = paramAttributeSet;
    paramAttributeSet = findViewById(2131826180);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_desc_layout)");
    this.jXB = paramAttributeSet;
    paramAttributeSet = findViewById(2131826184);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_time_tv)");
    this.timeTv = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826185);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_read_count_tv)");
    this.jXC = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826187);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_haokan_tv)");
    this.jXD = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826186);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_haokan_count_tv)");
    this.jXE = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826179);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_malicious_tips)");
    this.jXF = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826188);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_write_wow_tips_layout)");
    this.jXG = paramAttributeSet;
    paramAttributeSet = findViewById(2131826191);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_vi…_write_wow_tips_share_tv)");
    this.jXH = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826189);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_write_wow_tips_icon)");
    this.jXI = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826183);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_header_data_layout)");
    this.jXJ = paramAttributeSet;
    paramAttributeSet = this.jXy.getPaint();
    a.f.b.j.o(paramAttributeSet, "tp");
    paramAttributeSet.setFakeBoldText(true);
    this.jXw.setOnClickListener((View.OnClickListener)new MPVideoHeaderView.1(this, paramContext));
    AppMethodBeat.o(15266);
  }

  private final void aYK()
  {
    AppMethodBeat.i(15259);
    Object localObject = this.jXz;
    p localp = this.jVH;
    if (localp == null)
      a.f.b.j.avw("readerItem");
    if (localp == null)
      a.f.b.j.dWJ();
    ((MMNeat7extView)localObject).ah((CharSequence)localp.fjz);
    int i = com.tencent.mm.bz.a.gd(getContext());
    int j = com.tencent.mm.bz.a.fromDPToPix(getContext(), 32);
    localObject = this.jXz.QV(i - j);
    if (localObject != null);
    for (j = ((com.tencent.neattextview.textview.layout.a)localObject).dPe(); ; j = 0)
    {
      if (j > 4)
      {
        float f = this.jXz.getTextSize();
        this.jXz.a(TextUtils.TruncateAt.END, f);
        this.jXA.setMinimumHeight((int)f);
        this.jXA.setVisibility(0);
        this.jXz.setMaxLines(4);
        this.jXB.setOnClickListener((View.OnClickListener)new MPVideoHeaderView.c(this));
      }
      AppMethodBeat.o(15259);
      return;
    }
  }

  private final void aYL()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(138522);
    a.b.r(this.eks, this.talker);
    Object localObject3 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject3, "MMKernel.service(IMessengerStorage::class.java)");
    localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject3).XM().aoO(this.talker);
    if ((localObject3 == null) || (((ad)localObject3).Oh() <= 0))
    {
      localObject3 = this.jVG;
      if (localObject3 == null)
        a.f.b.j.avw("msgInfo");
      if (localObject3 != null)
      {
        localObject3 = ((r)localObject3).fjR;
        Object localObject4 = this.eks;
        localObject1 = this.jVG;
        if (localObject1 == null)
          a.f.b.j.avw("msgInfo");
        if (localObject1 == null)
          break label349;
        localObject1 = ((r)localObject1).HE();
        label119: ((ImageView)localObject4).setTag(localObject1);
        localObject4 = new WeakReference(this.eks);
        ao.b localb = ao.a.Zu();
        r localr = this.jVG;
        if (localr == null)
          a.f.b.j.avw("msgInfo");
        localObject1 = localObject2;
        if (localr != null)
          localObject1 = localr.HE();
        localb.a((String)localObject1, "", (ao.b.a)new MPVideoHeaderView.a((WeakReference)localObject4));
      }
    }
    while (true)
    {
      localObject3 = com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), (CharSequence)((String)localObject3 + "  "), this.jXx.getTextSize());
      localObject1 = getContext();
      a.f.b.j.o(localObject1, "context");
      localObject1 = ((Context)localObject1).getResources().getDrawable(2130837944);
      int i = (int)this.jXx.getTextSize();
      ((Drawable)localObject1).setBounds(0, 0, i / 2, i);
      localObject2 = new com.tencent.mm.ui.widget.a((Drawable)localObject1);
      localObject1 = new SpannableString((CharSequence)"@");
      ((SpannableString)localObject1).setSpan(localObject2, 0, 1, 33);
      this.jXx.setText(TextUtils.concat(new CharSequence[] { (CharSequence)localObject3, (CharSequence)localObject1 }));
      AppMethodBeat.o(138522);
      return;
      localObject3 = null;
      break;
      label349: localObject1 = null;
      break label119;
      if (!((ad)localObject3).NX())
        al.n((Runnable)new MPVideoHeaderView.b(this, (ad)localObject3), 200L);
      localObject3 = this.jVG;
      if (localObject3 == null)
        a.f.b.j.avw("msgInfo");
      if (localObject3 != null)
      {
        localObject3 = ((r)localObject3).HE();
        label403: localObject2 = s.mJ((String)localObject3);
        if (!bo.isEqual((String)localObject2, this.talker))
          break label489;
        localObject3 = this.jVG;
        if (localObject3 == null)
          a.f.b.j.avw("msgInfo");
        if (localObject3 == null)
          break label484;
      }
      label484: for (localObject3 = ((r)localObject3).fjR; ; localObject3 = null)
      {
        if (bo.isNullOrNil((String)localObject3))
          break label489;
        localObject2 = this.jVG;
        if (localObject2 == null)
          a.f.b.j.avw("msgInfo");
        localObject3 = localObject1;
        if (localObject2 == null)
          break;
        localObject3 = ((r)localObject2).fjR;
        break;
        localObject3 = null;
        break label403;
      }
      label489: localObject3 = localObject2;
    }
  }

  public final void a(jz paramjz)
  {
    AppMethodBeat.i(15262);
    a.f.b.j.p(paramjz, "appMsgStat");
    this.jXv = paramjz;
    if (paramjz.enabled == 1)
    {
      this.jXC.setVisibility(0);
      TextView localTextView = this.jXC;
      Context localContext1 = getContext();
      Context localContext2 = getContext();
      a.f.b.j.o(localContext2, "context");
      localTextView.setText((CharSequence)localContext1.getString(2131305834, new Object[] { c.G(localContext2, paramjz.vMN) }));
    }
    while (true)
    {
      setWow(paramjz);
      AppMethodBeat.o(15262);
      return;
      this.jXC.setVisibility(8);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(15256);
    aYL();
    Object localObject1 = this.timeTv;
    Context localContext = getContext();
    Object localObject2 = this.jVG;
    if (localObject2 == null)
      a.f.b.j.avw("msgInfo");
    ((TextView)localObject1).setText((CharSequence)com.tencent.mm.plugin.brandservice.ui.b.b.e(localContext, ((r)localObject2).fjT.time * 1000L));
    localObject1 = this.jVH;
    if (localObject1 == null)
      a.f.b.j.avw("readerItem");
    if (bo.isNullOrNil(((p)localObject1).fjz))
      this.jXB.setVisibility(8);
    while (true)
    {
      localObject2 = this.jXy;
      localObject1 = this.jVG;
      if (localObject1 == null)
        a.f.b.j.avw("msgInfo");
      ((MMNeat7extView)localObject2).ah((CharSequence)((r)localObject1).fjT.title);
      AppMethodBeat.o(15256);
      return;
      this.jXB.setVisibility(0);
      aYK();
    }
  }

  public final void setMaliciousInfo(bac parambac)
  {
    AppMethodBeat.i(15257);
    a.f.b.j.p(parambac, "info");
    this.jXF.setVisibility(0);
    this.jXF.setText((CharSequence)parambac.wDU);
    AppMethodBeat.o(15257);
  }

  public final void setOriginInfo(eg parameg)
  {
    AppMethodBeat.i(15258);
    a.f.b.j.p(parameg, "info");
    p localp = this.jVH;
    if (localp == null)
      a.f.b.j.avw("readerItem");
    localp.title = parameg.title;
    localp = this.jVH;
    if (localp == null)
      a.f.b.j.avw("readerItem");
    localp.fjz = parameg.fjz;
    initView();
    AppMethodBeat.o(15258);
  }

  public final void setWow(jz paramjz)
  {
    AppMethodBeat.i(15263);
    a.f.b.j.p(paramjz, "appMsgStat");
    if (paramjz.vMQ != 1)
    {
      this.jXD.setVisibility(8);
      this.jXE.setVisibility(8);
      AppMethodBeat.o(15263);
      return;
    }
    this.jXD.setVisibility(0);
    this.jXE.setVisibility(0);
    int i;
    label108: String str;
    Object localObject1;
    Object localObject2;
    if (paramjz.vMP == 1)
    {
      this.jXD.setTextColor(getResources().getColor(2131689758));
      this.jXE.setTextColor(getResources().getColor(2131689758));
      i = 2130837967;
      str = getContext().getString(2131305832);
      if (paramjz.vMO <= 0)
        break label364;
      this.jXE.setVisibility(0);
      localObject1 = this.jXE;
      localObject2 = getContext();
      a.f.b.j.o(localObject2, "context");
      ((TextView)localObject1).setText((CharSequence)String.valueOf(c.G((Context)localObject2, paramjz.vMO)));
    }
    while (true)
    {
      localObject2 = getContext();
      a.f.b.j.o(localObject2, "context");
      localObject2 = ((Context)localObject2).getResources().getDrawable(i);
      i = (int)(this.jXx.getTextSize() * 1.3D);
      ((Drawable)localObject2).setBounds(0, 0, i, i);
      localObject1 = new com.tencent.mm.ui.widget.a((Drawable)localObject2);
      localObject2 = new SpannableString((CharSequence)"@");
      ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
      this.jXD.setText(TextUtils.concat(new CharSequence[] { (CharSequence)localObject2, (CharSequence)" ", (CharSequence)str }));
      this.jXD.setOnClickListener((View.OnClickListener)new MPVideoHeaderView.d(this, paramjz));
      AppMethodBeat.o(15263);
      break;
      this.jXD.setTextColor(getResources().getColor(2131689760));
      this.jXE.setTextColor(getResources().getColor(2131689760));
      i = 2130837965;
      break label108;
      label364: this.jXE.setText((CharSequence)"");
      this.jXE.setVisibility(4);
    }
  }

  public final void setWowEduView(MPVideoWowEduView paramMPVideoWowEduView)
  {
    AppMethodBeat.i(15265);
    a.f.b.j.p(paramMPVideoWowEduView, "view");
    this.jXK = paramMPVideoWowEduView;
    AppMethodBeat.o(15265);
  }

  public final void setWriteCommentLayout(MPVideoWriteCommentLayout paramMPVideoWriteCommentLayout)
  {
    AppMethodBeat.i(15264);
    a.f.b.j.p(paramMPVideoWriteCommentLayout, "layout");
    this.jWN = paramMPVideoWriteCommentLayout;
    AppMethodBeat.o(15264);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class e
    implements View.OnClickListener
  {
    e(MPVideoHeaderView paramMPVideoHeaderView)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(15255);
      if (MPVideoHeaderView.g(this.jXL) != null)
      {
        MPVideoHeaderView.g(this.jXL).fA(true);
        MPVideoHeaderView.h(this.jXL).setVisibility(8);
      }
      AppMethodBeat.o(15255);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoHeaderView
 * JD-Core Version:    0.6.2
 */