package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.bizui.widget.BizKeyboardLinearLayout;
import com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.protocal.protobuf.kl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "actionView", "Landroid/view/View;", "adapter", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter;", "cancelTv", "Landroid/widget/TextView;", "commitBt", "Landroid/widget/Button;", "contentEt", "Lcom/tencent/mm/ui/widget/MMEditText;", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "currentKbState", "", "fixHeight", "isHaokan", "", "kbLayout", "Lcom/tencent/mm/plugin/bizui/widget/BizKeyboardLinearLayout;", "myCommentTitleTv", "myCommentTv", "myCommentView", "recyclerView", "Landroid/widget/ListView;", "root", "sayFooter", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPSmileyFooter;", "adjustContentHeight", "", "newMarginBottom", "contentEtOnClick", "fixKeyBoardMargin", "getRootHeight", "hide", "hideAnimation", "initKeyboardListener", "isShow", "onAddCommentSuccess", "onDeleteComment", "req", "Lcom/tencent/mm/protocal/protobuf/AppMsgOperateCommentReq;", "onDestroy", "onKeyBackPress", "onNoComment", "onResume", "onTouchClose", "saveRootHeight", "height", "setController", "show", "showLayout", "updateData", "resp", "Lcom/tencent/mm/protocal/protobuf/AppMsgCommentListResp;", "clearUpdate", "BizVideoMyCommentItemAdapter", "plugin-brandservice_release"})
public final class MPVideoWriteCommentLayout extends RelativeLayout
{
  private final String TAG;
  private View gtH;
  private View jWH;
  b jWx;
  BizKeyboardLinearLayout jXU;
  MPSmileyFooter jXV;
  private TextView jXW;
  private Button jXX;
  private MMEditText jXY;
  ListView jXZ;
  View jYa;
  TextView jYb;
  private TextView jYc;
  a jYd;
  int jYe;
  boolean jYf;
  private int jYg;

  public MPVideoWriteCommentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(15305);
    this.TAG = "MicroMsg.MPVideoWriteCommentLayout";
    this.jYe = -1;
    View.inflate(paramContext, 2130970258, (ViewGroup)this);
    paramAttributeSet = findViewById(2131826203);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_my_comment_list)");
    this.jXZ = ((ListView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826195);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_video_comment_root)");
    this.jWH = paramAttributeSet;
    paramAttributeSet = findViewById(2131826196);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_video_comment_action_layout)");
    this.gtH = paramAttributeSet;
    paramAttributeSet = findViewById(2131826197);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_video_comment_cancel)");
    this.jXW = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826202);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.biz_video_my_comment_tv)");
    this.jYb = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826198);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_video_my_comment_title)");
    this.jYc = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826200);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_vid…rite_comment_scroll_view)");
    this.jYa = paramAttributeSet;
    paramAttributeSet = findViewById(2131826199);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_video_comment_ok)");
    this.jXX = ((Button)paramAttributeSet);
    paramAttributeSet = findViewById(2131826201);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_video_comment_et)");
    this.jXY = ((MMEditText)paramAttributeSet);
    paramAttributeSet = findViewById(2131826204);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.mp_smiley_footer)");
    this.jXV = ((MPSmileyFooter)paramAttributeSet);
    this.jXV.setMMEditText(this.jXY);
    this.jXV.setVisibility(8);
    this.jXY.setOnClickListener((View.OnClickListener)new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(15275);
        MPVideoWriteCommentLayout.d(this.jYh);
        AppMethodBeat.o(15275);
      }
    });
    this.jXY.setOnLongClickListener((View.OnLongClickListener)new MPVideoWriteCommentLayout.2(this));
    this.jWH.setOnClickListener((View.OnClickListener)MPVideoWriteCommentLayout.3.jYi);
    int i = getRootHeight();
    if (i > 0)
    {
      paramAttributeSet = this.jWH.getLayoutParams();
      if (paramAttributeSet == null)
      {
        paramContext = new v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        AppMethodBeat.o(15305);
        throw paramContext;
      }
      paramAttributeSet.height = i;
      this.jWH.setLayoutParams(paramAttributeSet);
    }
    this.jXW.setOnClickListener((View.OnClickListener)new MPVideoWriteCommentLayout.4(this));
    this.jXX.setOnClickListener((View.OnClickListener)new MPVideoWriteCommentLayout.5(this, paramContext));
    this.jXY.addTextChangedListener((TextWatcher)new MPVideoWriteCommentLayout.6(this));
    paramAttributeSet = this.jXX;
    paramContext = this.jXY.getText();
    a.f.b.j.o(paramContext, "contentEt.text");
    if (((CharSequence)paramContext).length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      paramAttributeSet.setEnabled(bool);
      AppMethodBeat.o(15305);
      return;
    }
  }

  private final void aYO()
  {
    AppMethodBeat.i(138524);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
    localTranslateAnimation.setDuration(150L);
    localTranslateAnimation.setFillAfter(false);
    localTranslateAnimation.setAnimationListener((Animation.AnimationListener)new MPVideoWriteCommentLayout.b(this));
    this.jWH.clearAnimation();
    this.jWH.startAnimation((Animation)localTranslateAnimation);
    AppMethodBeat.o(138524);
  }

  private final int getRootHeight()
  {
    int i = 0;
    AppMethodBeat.i(15301);
    as localas = as.eg("brandService", 1);
    if (localas != null)
    {
      i = localas.getInt("MPWriteCommentRootHeight", 0);
      AppMethodBeat.o(15301);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(15301);
    }
  }

  private final void show()
  {
    AppMethodBeat.i(15302);
    this.jWH.clearAnimation();
    Object localObject = this.jXU;
    if (localObject == null)
      a.f.b.j.avw("kbLayout");
    ((BizKeyboardLinearLayout)localObject).setVisibility(0);
    localObject = getContext();
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI");
      AppMethodBeat.o(15302);
      throw ((Throwable)localObject);
    }
    ((BizVideoDetailUI)localObject).fz(false);
    AppMethodBeat.o(15302);
  }

  final boolean aFF()
  {
    AppMethodBeat.i(15304);
    BizKeyboardLinearLayout localBizKeyboardLinearLayout = this.jXU;
    if (localBizKeyboardLinearLayout == null)
      a.f.b.j.avw("kbLayout");
    boolean bool;
    if (localBizKeyboardLinearLayout.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(15304);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15304);
    }
  }

  final void aYM()
  {
    AppMethodBeat.i(15298);
    View localView = this.jYa;
    Context localContext = getContext();
    a.f.b.j.o(localContext, "context");
    localView.setBackgroundColor(localContext.getResources().getColor(2131689756));
    this.jYb.setVisibility(8);
    AppMethodBeat.o(15298);
  }

  public final void aYN()
  {
    AppMethodBeat.i(15300);
    this.jXY.setText((CharSequence)"");
    b localb = this.jWx;
    if (localb == null)
      a.f.b.j.avw("controller");
    localb.jVy = 0;
    localb = this.jWx;
    if (localb == null)
      a.f.b.j.avw("controller");
    localb.sB(2);
    AppMethodBeat.o(15300);
  }

  public final void fA(boolean paramBoolean)
  {
    AppMethodBeat.i(15299);
    this.jYf = paramBoolean;
    show();
    postDelayed((Runnable)new MPVideoWriteCommentLayout.d(this), 10L);
    Object localObject = this.jYa;
    Context localContext = getContext();
    a.f.b.j.o(localContext, "context");
    ((View)localObject).setBackgroundColor(localContext.getResources().getColor(2131689756));
    if (paramBoolean)
    {
      this.jYb.setVisibility(8);
      this.jYc.setText((CharSequence)getContext().getString(2131305836));
      this.jXY.setHint(2131305838);
      this.jXX.setText(2131297041);
      localObject = this.jXX;
      localContext = getContext();
      a.f.b.j.o(localContext, "context");
      ((Button)localObject).setBackground(localContext.getResources().getDrawable(2130837946));
      localObject = (InputFilter)new InputFilter.LengthFilter(200);
      this.jXY.setFilters(new InputFilter[] { localObject });
      AppMethodBeat.o(15299);
    }
    while (true)
    {
      return;
      localObject = this.jWx;
      if (localObject == null)
        a.f.b.j.avw("controller");
      ((b)localObject).sB(2);
      this.jYc.setText((CharSequence)getContext().getString(2131305842));
      this.jXY.setHint(2131305844);
      this.jXX.setText(2131305828);
      localObject = this.jXX;
      localContext = getContext();
      a.f.b.j.o(localContext, "context");
      ((Button)localObject).setBackground(localContext.getResources().getDrawable(2130837945));
      localObject = (InputFilter)new InputFilter.LengthFilter(600);
      this.jXY.setFilters(new InputFilter[] { localObject });
      AppMethodBeat.o(15299);
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(15303);
    if (!aFF())
      AppMethodBeat.o(15303);
    while (true)
    {
      return;
      if (this.jXV.aYV())
        this.jXV.aYW();
      aYO();
      Object localObject = getContext();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        AppMethodBeat.o(15303);
        throw ((Throwable)localObject);
      }
      ((MMActivity)localObject).aqX();
      localObject = this.jWx;
      if (localObject == null)
        a.f.b.j.avw("controller");
      ((b)localObject).jVy = 0;
      localObject = this.jYd;
      if (localObject != null)
        ((a)localObject).clear();
      localObject = getContext();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI");
        AppMethodBeat.o(15303);
        throw ((Throwable)localObject);
      }
      ((BizVideoDetailUI)localObject).fz(true);
      AppMethodBeat.o(15303);
    }
  }

  public final void setController(b paramb)
  {
    AppMethodBeat.i(15297);
    a.f.b.j.p(paramb, "controller");
    this.jWx = paramb;
    AppMethodBeat.o(15297);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "list", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/BizComment;", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "(Landroid/content/Context;Ljava/util/LinkedList;Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;)V", "getController", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "setController", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;)V", "deleteStr", "", "getDeleteStr", "()Ljava/lang/CharSequence;", "setDeleteStr", "(Ljava/lang/CharSequence;)V", "clear", "", "getCount", "", "getItem", "position", "getItemId", "", "i", "getView", "Landroid/view/View;", "convertView", "viewGroup", "Landroid/view/ViewGroup;", "initDeleteText", "textView", "Landroid/widget/TextView;", "onDeleteComment", "", "req", "Lcom/tencent/mm/protocal/protobuf/AppMsgOperateCommentReq;", "update", "items", "", "clearUpdate", "", "updateCommentContentView", "info", "itemView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter$BizCommentContent;", "BizCommentContent", "BizCommentViewHolder", "Companion", "plugin-brandservice_release"})
  public static final class a extends BaseAdapter
  {
    static final String TAG = "MicroMsg.BizCommentItemAdapter";
    private static com.tencent.mm.at.a.a.c jWW;
    public static final MPVideoWriteCommentLayout.a.c jYj;
    private final Context context;
    final LinkedList<kl> eow;
    private CharSequence jWU;
    b jWx;

    static
    {
      AppMethodBeat.i(15292);
      jYj = new MPVideoWriteCommentLayout.a.c((byte)0);
      TAG = "MicroMsg.BizCommentItemAdapter";
      jWW = new c.a().ahE().ahD().ct(120, 120).a((com.tencent.mm.at.a.c.b)new f()).sD(com.tencent.mm.plugin.i.c.bGF()).ahG();
      AppMethodBeat.o(15292);
    }

    public a(Context paramContext, LinkedList<kl> paramLinkedList, b paramb)
    {
      AppMethodBeat.i(15291);
      this.context = paramContext;
      this.eow = paramLinkedList;
      this.jWx = paramb;
      AppMethodBeat.o(15291);
    }

    private kl sC(int paramInt)
    {
      AppMethodBeat.i(15287);
      kl localkl = (kl)a.a.j.x((List)this.eow, paramInt);
      AppMethodBeat.o(15287);
      return localkl;
    }

    public final String b(ep paramep)
    {
      AppMethodBeat.i(15286);
      a.f.b.j.p(paramep, "req");
      Iterator localIterator = this.eow.iterator();
      while (localIterator.hasNext())
      {
        kl localkl = (kl)localIterator.next();
        if (paramep.vGr == localkl.vGr)
        {
          paramep = localkl.vGs;
          this.eow.remove(localkl);
          notifyDataSetChanged();
        }
      }
      while (true)
      {
        AppMethodBeat.o(15286);
        return paramep;
        paramep = null;
      }
    }

    public final void clear()
    {
      AppMethodBeat.i(15285);
      this.eow.clear();
      notifyDataSetChanged();
      AppMethodBeat.o(15285);
    }

    public final int getCount()
    {
      AppMethodBeat.i(15289);
      int i = this.eow.size();
      AppMethodBeat.o(15289);
      return i;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(15290);
      a.f.b.j.p(paramViewGroup, "viewGroup");
      if (paramView == null)
      {
        paramView = LayoutInflater.from(this.context).inflate(2130970249, null, false);
        a.f.b.j.o(paramView, "convertView");
        paramViewGroup = new MPVideoWriteCommentLayout.a.b(this, paramView);
        paramView.setTag(paramViewGroup);
        kl localkl = sC(paramInt);
        if (localkl != null)
        {
          a.f.b.j.p(localkl, "info");
          o.ahp().a(localkl.kbV, paramViewGroup.gvq, jWW);
          Object localObject1 = paramViewGroup.jYk;
          MPVideoWriteCommentLayout.a.a locala = paramViewGroup.jYl;
          a.f.b.j.p(locala, "itemView");
          if (localkl != null)
          {
            Object localObject2 = ((a)localObject1).context;
            Object localObject3 = (CharSequence)localkl.kKw;
            Object localObject4 = locala.jWY;
            a.f.b.j.o(localObject4, "itemView.nickName");
            localObject4 = com.tencent.mm.pluginsdk.ui.e.j.b((Context)localObject2, (CharSequence)localObject3, ((TextView)localObject4).getTextSize());
            localObject2 = locala.jWY;
            a.f.b.j.o(localObject2, "itemView.nickName");
            ((TextView)localObject2).setText((CharSequence)localObject4);
            localObject4 = ((a)localObject1).context;
            localObject2 = (CharSequence)localkl.content;
            localObject3 = locala.jXa;
            a.f.b.j.o(localObject3, "itemView.desc");
            localObject2 = com.tencent.mm.pluginsdk.ui.e.j.b((Context)localObject4, (CharSequence)localObject2, ((NeatTextView)localObject3).getTextSize());
            locala.jXa.ah((CharSequence)localObject2);
            localObject2 = locala.jXb;
            a.f.b.j.o(localObject2, "itemView.deleteTv");
            ((TextView)localObject2).setVisibility(0);
            localObject2 = locala.jXb;
            a.f.b.j.o(localObject2, "itemView.deleteTv");
            if (((a)localObject1).jWU == null)
            {
              int i = (int)(((TextView)localObject2).getTextSize() * 1.2D);
              localObject4 = ((a)localObject1).context.getString(2131296881);
              localObject3 = ((a)localObject1).context.getResources().getDrawable(2130837950);
              ((Drawable)localObject3).setBounds(0, 0, i, i);
              localObject3 = new com.tencent.mm.ui.widget.a((Drawable)localObject3);
              SpannableString localSpannableString = new SpannableString((CharSequence)"@");
              localSpannableString.setSpan(localObject3, 0, 1, 33);
              ((a)localObject1).jWU = TextUtils.concat(new CharSequence[] { (CharSequence)localSpannableString, (CharSequence)" ", (CharSequence)localObject4 });
            }
            ((TextView)localObject2).setText(((a)localObject1).jWU);
            locala.jXb.setOnClickListener((View.OnClickListener)new MPVideoWriteCommentLayout.a.d((a)localObject1, localkl));
            localObject1 = locala.jWZ;
            a.f.b.j.o(localObject1, "itemView.likeTv");
            ((TextView)localObject1).setVisibility(8);
          }
        }
        if (paramInt != getCount() - 1)
          break label548;
        paramViewGroup = paramViewGroup.jXi;
        a.f.b.j.o(paramViewGroup, "holder.endlineLayout");
        paramViewGroup.setVisibility(0);
        this.jWx.sB(2);
      }
      while (true)
      {
        AppMethodBeat.o(15290);
        return paramView;
        paramViewGroup = paramView.getTag();
        if (paramViewGroup == null)
        {
          paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.BizVideoMyCommentItemAdapter.BizCommentViewHolder");
          AppMethodBeat.o(15290);
          throw paramView;
        }
        paramViewGroup = (MPVideoWriteCommentLayout.a.b)paramViewGroup;
        break;
        label548: paramViewGroup = paramViewGroup.jXi;
        a.f.b.j.o(paramViewGroup, "holder.endlineLayout");
        paramViewGroup.setVisibility(8);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "state", "", "onKeyBoardStateChange"})
  static final class c
    implements KeyboardLinearLayout.a
  {
    c(MPVideoWriteCommentLayout paramMPVideoWriteCommentLayout, BizKeyboardLinearLayout paramBizKeyboardLinearLayout)
    {
    }

    public final void sD(int paramInt)
    {
      AppMethodBeat.i(15295);
      ab.i(MPVideoWriteCommentLayout.a(this.jYh), "onKeyBoardStateChange, state = ".concat(String.valueOf(paramInt)));
      if (paramInt == -3)
      {
        int i = this.jYn.getKeyBoardHeight();
        if (i > 0)
        {
          MPVideoWriteCommentLayout.a(this.jYh, i);
          MPVideoWriteCommentLayout.a(this.jYh, i);
        }
        new ak().postDelayed((Runnable)new MPVideoWriteCommentLayout.c.1(this), 10L);
      }
      while (true)
      {
        MPVideoWriteCommentLayout.b(this.jYh, paramInt);
        AppMethodBeat.o(15295);
        return;
        MPVideoWriteCommentLayout.a(this.jYh, 0);
        MPVideoWriteCommentLayout.a(this.jYh, 0);
        new ak().postDelayed((Runnable)new MPVideoWriteCommentLayout.c.2(this), 10L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout
 * JD-Core Version:    0.6.2
 */