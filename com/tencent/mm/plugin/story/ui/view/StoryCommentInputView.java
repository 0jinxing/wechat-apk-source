package com.tencent.mm.plugin.story.ui.view;

import a.f.a.m;
import a.l;
import a.v;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.u;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.widget.InputPanelFrameLayout;
import com.tencent.mm.ui.widget.MMEditText;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentInputView;", "Lcom/tencent/mm/ui/widget/InputPanelFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "avatar", "Landroid/widget/ImageView;", "canSend", "", "commentInputCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "content", "success", "", "getCommentInputCallback", "()Lkotlin/jvm/functions/Function2;", "setCommentInputCallback", "(Lkotlin/jvm/functions/Function2;)V", "emojiBtn", "emojiRoot", "Landroid/widget/FrameLayout;", "fromUser", "Landroid/widget/TextView;", "hintTv", "inputLimit", "inputType", "inputView", "Lcom/tencent/mm/ui/widget/MMEditText;", "isKeyboardShown", "isReply", "keyboardHeight", "limitHighLightColor", "limitNormalColor", "loading", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "showImeRunnable", "Ljava/lang/Runnable;", "smileyPanel", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel;", "destroy", "getContent", "", "hideSoftInput", "initSmileyPanel", "onInputPanelChange", "isKeyboardShow", "refreshBottomPanelHeight", "setInputHint", "toUser", "setKeyboardVisibility", "visible", "setVisibility", "visibility", "Companion", "plugin-story_release"})
public final class StoryCommentInputView extends InputPanelFrameLayout
{
  public static final StoryCommentInputView.a sjo;
  private final String TAG;
  final ChatFooterPanel eAk;
  private final TextView gKr;
  private final ImageView gvq;
  private int inputType;
  private final Runnable lnE;
  private final TextView seQ;
  private final FrameLayout sje;
  private final MMEditText sjf;
  private final ImageView sjg;
  private final TextView sjh;
  private boolean sji;
  private int sjj;
  private boolean sjk;
  private final int sjl;
  private final int sjm;
  private m<? super String, ? super Boolean, y> sjn;

  static
  {
    AppMethodBeat.i(110403);
    sjo = new StoryCommentInputView.a((byte)0);
    AppMethodBeat.o(110403);
  }

  public StoryCommentInputView(Context paramContext)
  {
    this(paramContext, null);
    AppMethodBeat.i(110402);
    AppMethodBeat.o(110402);
  }

  public StoryCommentInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110401);
    AppMethodBeat.o(110401);
  }

  public StoryCommentInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110400);
    this.TAG = "MicroMsg.StoryCommentInputView";
    View.inflate(paramContext, 2130970868, (ViewGroup)this);
    setClickable(true);
    paramAttributeSet = findViewById(2131828065);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_emoji_root)");
    this.sje = ((FrameLayout)paramAttributeSet);
    paramAttributeSet = findViewById(2131828061);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_input)");
    this.sjf = ((MMEditText)paramAttributeSet);
    paramAttributeSet = findViewById(2131828063);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_emoji_btn)");
    this.sjg = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828059);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_input_avatar)");
    this.gvq = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828060);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_input_username)");
    this.seQ = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828062);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_input_limit)");
    this.sjh = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828058);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.story_comment_input_hint)");
    this.gKr = ((TextView)paramAttributeSet);
    this.sjl = getResources().getColor(2131690545);
    this.sjm = getResources().getColor(2131689602);
    paramAttributeSet = this.gvq;
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    a.b.r(paramAttributeSet, j.a.cnk());
    paramAttributeSet = u.i(paramContext, true);
    a.f.b.j.o(paramAttributeSet, "SmileyPanelFactory.getSmileyPanel(context, true)");
    this.eAk = ((ChatFooterPanel)paramAttributeSet);
    this.sjj = x.gs(getContext());
    paramAttributeSet = new FrameLayout.LayoutParams(-1, this.sjj);
    this.sje.addView((View)this.eAk, (ViewGroup.LayoutParams)paramAttributeSet);
    this.eAk.setPortHeightPx(this.sjj);
    this.eAk.setEntranceScene(ChatFooterPanel.vhm);
    this.eAk.AD();
    this.eAk.bf(false);
    this.eAk.setVisibility(0);
    this.eAk.setOnTextOperationListener((ChatFooterPanel.a)new StoryCommentInputView.b(this));
    this.sjf.addTextChangedListener((TextWatcher)new StoryCommentInputView.1(this));
    this.sjg.setOnClickListener((View.OnClickListener)new StoryCommentInputView.2(this));
    this.sjf.setOnEditorActionListener((TextView.OnEditorActionListener)new StoryCommentInputView.3(this));
    setOnClickListener((View.OnClickListener)new StoryCommentInputView.4(this));
    this.sjg.setImageDrawable(ah.f(paramContext, 2131231433, -1));
    this.sje.setVisibility(0);
    this.sjk = false;
    paramAttributeSet = this.seQ;
    localObject = g.RP();
    a.f.b.j.o(localObject, "storage()");
    localObject = ((e)localObject).Ry().get(4);
    if (localObject == null)
    {
      paramContext = new v("null cannot be cast to non-null type kotlin.String");
      AppMethodBeat.o(110400);
      throw paramContext;
    }
    paramAttributeSet.setText((CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, (CharSequence)localObject, this.seQ.getTextSize()));
    this.inputType = 2;
    this.lnE = ((Runnable)new StoryCommentInputView.c(this));
    AppMethodBeat.o(110400);
  }

  private final void setKeyboardVisibility(boolean paramBoolean)
  {
    AppMethodBeat.i(110397);
    if (paramBoolean)
    {
      post(this.lnE);
      AppMethodBeat.o(110397);
    }
    while (true)
    {
      return;
      removeCallbacks(this.lnE);
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        AppMethodBeat.o(110397);
      }
      else
      {
        AppMethodBeat.o(110397);
      }
    }
  }

  public final void a(CharSequence paramCharSequence, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(138900);
    a.f.b.j.p(paramString, "toUser");
    this.sjf.setText((CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(getContext(), paramCharSequence, this.sjf.getTextSize()));
    if (paramCharSequence != null)
      this.sjf.setSelection(paramCharSequence.length());
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = getResources().getString(2131306023);
      a.f.b.j.o(localObject1, "resources.getString(R.st…story_reply_visible_hint)");
      localObject2 = getResources().getString(2131306022);
      a.f.b.j.o(localObject2, "resources.getString(R.st…_reply_visible_edit_hint)");
      paramCharSequence = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(paramCharSequence, "MMKernel.service(IMessengerStorage::class.java)");
      paramCharSequence = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramCharSequence).XM().aoO(paramString);
      paramString = new StringBuilder().append(getResources().getString(2131306022)).append(' ');
      Context localContext = this.seQ.getContext();
      if (paramCharSequence != null)
      {
        paramCharSequence = paramCharSequence.Oj();
        if (paramCharSequence != null)
        {
          paramCharSequence = (CharSequence)paramCharSequence;
          paramString = com.tencent.mm.pluginsdk.ui.e.j.b(localContext, paramCharSequence, this.seQ.getTextSize());
          paramCharSequence = (CharSequence)localObject2;
          localObject2 = paramString;
          paramString = (String)localObject1;
        }
      }
    }
    while (true)
    {
      this.sjf.setHint((CharSequence)paramCharSequence);
      this.gKr.setText((CharSequence)paramString);
      this.seQ.setText((CharSequence)localObject2);
      AppMethodBeat.o(138900);
      return;
      paramCharSequence = (CharSequence)"";
      break;
      paramString = getResources().getString(2131303919);
      a.f.b.j.o(paramString, "resources.getString(R.st…ory_comment_visible_hint)");
      paramCharSequence = getResources().getString(2131306001);
      a.f.b.j.o(paramCharSequence, "resources.getString(R.st…omment_visible_edit_hint)");
      localObject2 = getContext();
      localObject1 = g.RP();
      a.f.b.j.o(localObject1, "storage()");
      localObject1 = ((e)localObject1).Ry().get(4);
      if (localObject1 == null)
      {
        paramCharSequence = new v("null cannot be cast to non-null type kotlin.String");
        AppMethodBeat.o(138900);
        throw paramCharSequence;
      }
      localObject2 = String.valueOf(com.tencent.mm.pluginsdk.ui.e.j.b((Context)localObject2, (CharSequence)localObject1, this.seQ.getTextSize()));
    }
  }

  public final m<String, Boolean, y> getCommentInputCallback()
  {
    return this.sjn;
  }

  public final CharSequence getContent()
  {
    AppMethodBeat.i(110396);
    Object localObject = this.sjf.getText();
    if (localObject != null);
    for (localObject = localObject.toString(); ; localObject = null)
    {
      localObject = (CharSequence)localObject;
      AppMethodBeat.o(110396);
      return localObject;
    }
  }

  public final void m(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(110398);
    super.m(paramBoolean, paramInt);
    this.sji = paramBoolean;
    if (paramBoolean)
    {
      this.inputType = 2;
      this.sje.setVisibility(4);
    }
    while (true)
    {
      if ((this.sjj != paramInt) && (paramInt != 0))
      {
        this.sjj = paramInt;
        com.tencent.mm.compatible.util.j.x(getContext(), paramInt);
        paramInt = x.gs(getContext());
        this.eAk.setPortHeightPx(paramInt);
        this.eAk.AG();
        ViewGroup.LayoutParams localLayoutParams = this.eAk.getLayoutParams();
        if (localLayoutParams != null)
          localLayoutParams.height = paramInt;
      }
      AppMethodBeat.o(110398);
      return;
      if (this.inputType == 0)
      {
        this.sje.setVisibility(0);
      }
      else
      {
        this.sje.setVisibility(8);
        this.inputType = -1;
      }
    }
  }

  public final void setCommentInputCallback(m<? super String, ? super Boolean, y> paramm)
  {
    this.sjn = paramm;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(110399);
    super.setVisibility(paramInt);
    if (paramInt == 0)
      this.sjf.requestFocus();
    AppMethodBeat.o(110399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView
 * JD-Core Version:    0.6.2
 */