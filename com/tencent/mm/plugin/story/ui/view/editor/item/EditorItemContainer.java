package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.a.b;
import a.f.b.j;
import a.v;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.InsectRelativeLayout;
import com.tencent.mm.media.editor.a.h;
import com.tencent.mm.plugin.story.ui.view.editor.EditorFrameView;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ah;
import java.util.ArrayList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer;", "Lcom/tencent/mm/emoji/view/InsectRelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomFrame", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorFrameView;", "clearActive", "Ljava/lang/Runnable;", "currActiveItem", "Landroid/view/View;", "deleteStateListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "showDelete", "", "getDeleteStateListener", "()Lkotlin/jvm/functions/Function1;", "setDeleteStateListener", "(Lkotlin/jvm/functions/Function1;)V", "deleteView", "Landroid/widget/TextView;", "deleteViewGroup", "Landroid/view/ViewGroup;", "deleteViewIcon", "Landroid/widget/ImageView;", "deletingItem", "itemLayout", "itemStateResolve", "com/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer$itemStateResolve$1", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer$itemStateResolve$1;", "leftFrame", "locationClickListener", "Landroid/view/View$OnClickListener;", "locationView", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/PositionItemView;", "rightFrame", "textClickListener", "topFrame", "validArea", "Landroid/graphics/Rect;", "activeDeleteView", "active", "addEmojiItem", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "addLocationItem", "sl", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "addTextItem", "text", "", "textColor", "textBgColor", "checkAddLocationItem", "deleteCheck", "itemView", "event", "Landroid/view/MotionEvent;", "frameCheck", "getAllItemViews", "", "Lcom/tencent/mm/media/editor/item/IEditable;", "initHeightSafeArea", "safeHeight", "", "safeFrameHeight", "initWidthSafeArea", "safeWidth", "safeFrameWidth", "insectBottom", "bottom", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "pause", "removeLocationView", "callback", "Lkotlin/Function0;", "replaceLocationView", "requestEditing", "editing", "reset", "resume", "setOnLocationClick", "setOnTextClick", "showBottomFrame", "isShow", "showLeftFrame", "showRightFrame", "showTopFrame", "toggleDeleteView", "show", "Companion", "ItemStateResolve", "plugin-story_release"})
public final class EditorItemContainer extends InsectRelativeLayout
{
  public static final EditorItemContainer.a smV;
  private TextView lnH;
  public final ViewGroup lnI;
  public Runnable lnN;
  public final Rect smH;
  private ImageView smI;
  private ViewGroup smJ;
  private EditorFrameView smK;
  private EditorFrameView smL;
  private EditorFrameView smM;
  private EditorFrameView smN;
  private View smO;
  private b<? super Boolean, y> smP;
  private View smQ;
  public e smR;
  private View.OnClickListener smS;
  public View.OnClickListener smT;
  public final EditorItemContainer.d smU;

  static
  {
    AppMethodBeat.i(110656);
    smV = new EditorItemContainer.a((byte)0);
    AppMethodBeat.o(110656);
  }

  public EditorItemContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110655);
    AppMethodBeat.o(110655);
  }

  public EditorItemContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110654);
    this.smH = new Rect();
    this.lnN = ((Runnable)new EditorItemContainer.c(this));
    View.inflate(paramContext, 2130970861, (ViewGroup)this);
    paramContext = findViewById(2131828035);
    j.o(paramContext, "findViewById(R.id.editor_item_layout)");
    this.lnI = ((ViewGroup)paramContext);
    paramContext = findViewById(2131823434);
    j.o(paramContext, "findViewById(R.id.editor_delete_view)");
    this.lnH = ((TextView)paramContext);
    paramContext = findViewById(2131828037);
    j.o(paramContext, "findViewById(R.id.editor_delete_view_icon)");
    this.smI = ((ImageView)paramContext);
    paramContext = findViewById(2131828036);
    j.o(paramContext, "findViewById(R.id.editor_delete_view_group)");
    this.smJ = ((ViewGroup)paramContext);
    paramContext = com.tencent.mm.plugin.story.f.l.sac;
    paramContext = com.tencent.mm.plugin.story.f.l.czI();
    paramAttributeSet = getResources();
    j.o(paramAttributeSet, "resources");
    paramInt = paramAttributeSet.getDisplayMetrics().widthPixels;
    paramAttributeSet = getResources();
    j.o(paramAttributeSet, "resources");
    paramContext.set(0, 0, paramInt, paramAttributeSet.getDisplayMetrics().heightPixels);
    this.smU = new EditorItemContainer.d(this);
    AppMethodBeat.o(110654);
  }

  private final void gJ(boolean paramBoolean)
  {
    AppMethodBeat.i(110647);
    this.smJ.setActivated(paramBoolean);
    if (paramBoolean)
    {
      this.lnH.setText(2131298993);
      this.smI.setImageDrawable(ah.f(getContext(), 2131231412, -1));
      AppMethodBeat.o(110647);
    }
    while (true)
    {
      return;
      this.lnH.setText(2131298992);
      this.smI.setImageDrawable(ah.f(getContext(), 2131231411, -1));
      AppMethodBeat.o(110647);
    }
  }

  private final void lP(boolean paramBoolean)
  {
    AppMethodBeat.i(110650);
    EditorFrameView localEditorFrameView = this.smK;
    int i;
    if (localEditorFrameView != null)
      if (paramBoolean)
      {
        i = 0;
        localEditorFrameView.setVisibility(i);
        AppMethodBeat.o(110650);
      }
    while (true)
    {
      return;
      i = 4;
      break;
      AppMethodBeat.o(110650);
    }
  }

  private final void lQ(boolean paramBoolean)
  {
    AppMethodBeat.i(110651);
    EditorFrameView localEditorFrameView = this.smL;
    int i;
    if (localEditorFrameView != null)
      if (paramBoolean)
      {
        i = 0;
        localEditorFrameView.setVisibility(i);
        AppMethodBeat.o(110651);
      }
    while (true)
    {
      return;
      i = 4;
      break;
      AppMethodBeat.o(110651);
    }
  }

  private final void lR(boolean paramBoolean)
  {
    AppMethodBeat.i(110652);
    EditorFrameView localEditorFrameView = this.smM;
    int i;
    if (localEditorFrameView != null)
      if (paramBoolean)
      {
        i = 0;
        localEditorFrameView.setVisibility(i);
        AppMethodBeat.o(110652);
      }
    while (true)
    {
      return;
      i = 4;
      break;
      AppMethodBeat.o(110652);
    }
  }

  private final void lS(boolean paramBoolean)
  {
    AppMethodBeat.i(110653);
    EditorFrameView localEditorFrameView = this.smN;
    int i;
    if (localEditorFrameView != null)
      if (paramBoolean)
      {
        i = 0;
        localEditorFrameView.setVisibility(i);
        AppMethodBeat.o(110653);
      }
    while (true)
    {
      return;
      i = 4;
      break;
      AppMethodBeat.o(110653);
    }
  }

  public final void ac(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(110648);
    Object localObject = getContext();
    j.o(localObject, "context");
    this.smK = new EditorFrameView((Context)localObject);
    localObject = this.smK;
    if (localObject != null)
      ((EditorFrameView)localObject).setPosition(com.tencent.mm.plugin.story.ui.view.editor.a.slp);
    localObject = this.smK;
    if (localObject != null)
      ((EditorFrameView)localObject).setVisibility(4);
    localObject = new RelativeLayout.LayoutParams((int)paramFloat2, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(20);
    addView((View)this.smK, (ViewGroup.LayoutParams)localObject);
    localObject = getContext();
    j.o(localObject, "context");
    this.smM = new EditorFrameView((Context)localObject);
    localObject = this.smM;
    if (localObject != null)
      ((EditorFrameView)localObject).setPosition(com.tencent.mm.plugin.story.ui.view.editor.a.slr);
    localObject = this.smM;
    if (localObject != null)
      ((EditorFrameView)localObject).setVisibility(4);
    localObject = new RelativeLayout.LayoutParams((int)paramFloat2, -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(21);
    addView((View)this.smM, (ViewGroup.LayoutParams)localObject);
    localObject = com.tencent.mm.plugin.story.f.l.sac;
    com.tencent.mm.plugin.story.f.l.czI().left = ((int)paramFloat2);
    localObject = com.tencent.mm.plugin.story.f.l.sac;
    com.tencent.mm.plugin.story.f.l.czI().right = ((int)paramFloat2 + (int)paramFloat1);
    StringBuilder localStringBuilder = new StringBuilder("logStory: initWidthSafeArea safeAreaRect:");
    localObject = com.tencent.mm.plugin.story.f.l.sac;
    ab.i("MicroMsg.EditorItemContainer", com.tencent.mm.plugin.story.f.l.czI());
    AppMethodBeat.o(110648);
  }

  public final void ad(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(110649);
    Object localObject = getContext();
    j.o(localObject, "context");
    this.smL = new EditorFrameView((Context)localObject);
    localObject = this.smL;
    if (localObject != null)
      ((EditorFrameView)localObject).setPosition(com.tencent.mm.plugin.story.ui.view.editor.a.slq);
    localObject = this.smL;
    if (localObject != null)
      ((EditorFrameView)localObject).setVisibility(4);
    localObject = new RelativeLayout.LayoutParams(-1, (int)paramFloat2);
    ((RelativeLayout.LayoutParams)localObject).addRule(10);
    addView((View)this.smL, (ViewGroup.LayoutParams)localObject);
    localObject = getContext();
    j.o(localObject, "context");
    this.smN = new EditorFrameView((Context)localObject);
    localObject = this.smN;
    if (localObject != null)
      ((EditorFrameView)localObject).setPosition(com.tencent.mm.plugin.story.ui.view.editor.a.sls);
    localObject = this.smN;
    if (localObject != null)
      ((EditorFrameView)localObject).setVisibility(4);
    localObject = new RelativeLayout.LayoutParams(-1, (int)paramFloat2);
    ((RelativeLayout.LayoutParams)localObject).addRule(12);
    addView((View)this.smN, (ViewGroup.LayoutParams)localObject);
    localObject = com.tencent.mm.plugin.story.f.l.sac;
    com.tencent.mm.plugin.story.f.l.czI().top = ((int)paramFloat2);
    localObject = com.tencent.mm.plugin.story.f.l.sac;
    com.tencent.mm.plugin.story.f.l.czI().bottom = ((int)paramFloat2 + (int)paramFloat1);
    localObject = new StringBuilder("logStory: initHeightSafeArea safeAreaRect:");
    com.tencent.mm.plugin.story.f.l locall = com.tencent.mm.plugin.story.f.l.sac;
    ab.i("MicroMsg.EditorItemContainer", com.tencent.mm.plugin.story.f.l.czI());
    AppMethodBeat.o(110649);
  }

  public final void b(cei paramcei)
  {
    AppMethodBeat.i(110640);
    j.p(paramcei, "sl");
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    Object localObject = getContext();
    j.o(localObject, "context");
    this.smR = new e((Context)localObject);
    localObject = this.smR;
    if (localObject != null)
    {
      com.tencent.mm.plugin.story.f.l locall = com.tencent.mm.plugin.story.f.l.sac;
      ((e)localObject).setSafeArea(com.tencent.mm.plugin.story.f.l.czI());
    }
    localObject = this.smR;
    if (localObject != null)
      ((e)localObject).setValidArea(this.smH);
    localObject = this.smR;
    if (localObject != null)
      ((e)localObject).setLocation(paramcei);
    paramcei = this.smR;
    if (paramcei != null)
      paramcei.setStateResolve((EditorItemContainer.b)this.smU);
    paramcei = this.smR;
    if (paramcei != null)
      paramcei.setOnClickListener(this.smS);
    this.lnI.addView((View)this.smR, (ViewGroup.LayoutParams)localLayoutParams);
    paramcei = this.smR;
    if (paramcei == null)
      j.dWJ();
    r((View)paramcei, false);
    removeCallbacks(this.lnN);
    postDelayed(this.lnN, 1500L);
    AppMethodBeat.o(110640);
  }

  public final boolean cCB()
  {
    if (this.smR != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void f(a.f.a.a<y> parama)
  {
    AppMethodBeat.i(110641);
    post((Runnable)new EditorItemContainer.e(this, parama));
    AppMethodBeat.o(110641);
  }

  public final void gI(boolean paramBoolean)
  {
    AppMethodBeat.i(110646);
    Object localObject = this.smJ;
    int i;
    if (paramBoolean)
    {
      i = 0;
      ((ViewGroup)localObject).setVisibility(i);
      localObject = this.smP;
      if (localObject == null)
        break label55;
      ((b)localObject).am(Boolean.valueOf(paramBoolean));
      AppMethodBeat.o(110646);
    }
    while (true)
    {
      return;
      i = 8;
      break;
      label55: AppMethodBeat.o(110646);
    }
  }

  public final List<h> getAllItemViews()
  {
    AppMethodBeat.i(110644);
    List localList = (List)new ArrayList();
    int i = 0;
    int j = this.lnI.getChildCount();
    while (i < j)
    {
      View localView = this.lnI.getChildAt(i);
      if ((localView instanceof h))
        localList.add(localView);
      i++;
    }
    AppMethodBeat.o(110644);
    return localList;
  }

  public final b<Boolean, y> getDeleteStateListener()
  {
    return this.smP;
  }

  public final boolean jn(int paramInt)
  {
    AppMethodBeat.i(110639);
    Object localObject = this.smJ.getLayoutParams();
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      AppMethodBeat.o(110639);
      throw ((Throwable)localObject);
    }
    localObject = (ViewGroup.MarginLayoutParams)localObject;
    ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = (com.tencent.mm.bz.a.fromDPToPix(getContext(), 32) + paramInt);
    this.smJ.setLayoutParams((ViewGroup.LayoutParams)localObject);
    AppMethodBeat.o(110639);
    return true;
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(110637);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.smH.set(0, 0, paramInt1, paramInt2);
    AppMethodBeat.o(110637);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(110638);
    j.p(paramMotionEvent, "event");
    if ((paramMotionEvent.getActionMasked() == 0) && (this.smQ != null))
    {
      View localView = this.smQ;
      if (localView == null)
        j.dWJ();
      r(localView, false);
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(110638);
    return bool;
  }

  public final void r(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(110645);
    j.p(paramView, "itemView");
    if (paramBoolean)
      if ((j.j(paramView, this.smQ) ^ true))
      {
        View localView = this.smQ;
        if (localView != null)
          localView.setActivated(false);
        this.smQ = paramView;
      }
    while (true)
    {
      paramView.setActivated(paramBoolean);
      AppMethodBeat.o(110645);
      return;
      if (j.j(paramView, this.smQ))
        this.smQ = null;
    }
  }

  public final void setDeleteStateListener(b<? super Boolean, y> paramb)
  {
    this.smP = paramb;
  }

  public final void setOnLocationClick(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(110642);
    j.p(paramOnClickListener, "locationClickListener");
    this.smS = paramOnClickListener;
    AppMethodBeat.o(110642);
  }

  public final void setOnTextClick(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(110643);
    j.p(paramOnClickListener, "textClickListener");
    this.smT = paramOnClickListener;
    AppMethodBeat.o(110643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer
 * JD-Core Version:    0.6.2
 */