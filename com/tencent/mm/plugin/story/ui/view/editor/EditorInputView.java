package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.InsectRelativeLayout;
import com.tencent.mm.media.editor.view.TextColorSelector;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorInputView;", "Lcom/tencent/mm/emoji/view/InsectRelativeLayout;", "Lcom/tencent/mm/media/editor/panel/IEditorPanel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "bgColor", "bgToggle", "Landroid/widget/ImageView;", "callback", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorInputView$AddTextCallback;", "getCallback", "()Lcom/tencent/mm/plugin/story/ui/view/editor/EditorInputView$AddTextCallback;", "setCallback", "(Lcom/tencent/mm/plugin/story/ui/view/editor/EditorInputView$AddTextCallback;)V", "cancel", "Landroid/view/View;", "colorSelector", "Lcom/tencent/mm/media/editor/view/TextColorSelector;", "confirm", "hasBackground", "", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "input", "Lcom/tencent/mm/plugin/story/ui/view/editor/PhotoEditText;", "inputRoot", "Landroid/view/ViewGroup;", "lastBottom", "value", "selectedIndex", "setSelectedIndex", "(I)V", "showImeRunnable", "Ljava/lang/Runnable;", "textChanged", "getTextChanged", "setTextChanged", "textColor", "visibleCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "visible", "", "waitKeyBoardShown", "initHeightSafeArea", "safeHeight", "", "safeFrameHeight", "initWidthSafeArea", "safeWidth", "safeFrameWidth", "insectBottom", "bottom", "isShow", "setImeVisibility", "setOnVisibleChangeCallback", "setShow", "show", "setVisibility", "visibility", "setup", "text", "", "textBgColor", "updateInput", "AddTextCallback", "Companion", "plugin-story_release"})
public final class EditorInputView extends InsectRelativeLayout
{
  static final int[] sjN;
  private static final int slC = -1;
  static final int slD = -419430401;
  private static final int slE;
  private static final int slF;
  public static final EditorInputView.b slG;
  private final String TAG;
  private int bgColor;
  int biG;
  private b<? super Boolean, y> eUw;
  private int lnB;
  private boolean lnC;
  boolean lnD;
  private final Runnable lnE;
  private View lnt;
  private View lnu;
  final TextColorSelector lnw;
  EditorInputView.a slA;
  boolean slB;
  PhotoEditText slx;
  private ViewGroup sly;
  final ImageView slz;
  private int textColor;

  static
  {
    AppMethodBeat.i(110565);
    slG = new EditorInputView.b((byte)0);
    slC = -1;
    slD = -419430401;
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = -1;
    arrayOfInt[1] = -16777216;
    arrayOfInt[2] = -372399;
    arrayOfInt[3] = -15616;
    arrayOfInt[4] = -16268960;
    arrayOfInt[5] = -15683841;
    arrayOfInt[6] = -10197008;
    arrayOfInt;
    sjN = arrayOfInt;
    slE = arrayOfInt[1];
    slF = sjN[0] & slD;
    AppMethodBeat.o(110565);
  }

  public EditorInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110564);
    AppMethodBeat.o(110564);
  }

  public EditorInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110563);
    this.TAG = "MicroMsg.EditorInputView";
    View.inflate(paramContext, 2130969321, (ViewGroup)this);
    setBackgroundColor(getResources().getColor(2131690536));
    paramContext = findViewById(2131823410);
    j.o(paramContext, "findViewById(R.id.change_text_input)");
    this.slx = ((PhotoEditText)paramContext);
    paramContext = findViewById(2131823409);
    j.o(paramContext, "findViewById(R.id.story_editor_input_root)");
    this.sly = ((ViewGroup)paramContext);
    paramContext = findViewById(2131823404);
    j.o(paramContext, "findViewById(R.id.change_text_cancel)");
    this.lnt = paramContext;
    paramContext = findViewById(2131823405);
    j.o(paramContext, "findViewById(R.id.change_text_confirm)");
    this.lnu = paramContext;
    paramContext = findViewById(2131823407);
    j.o(paramContext, "findViewById(R.id.story_editor_input_bg_toggle)");
    this.slz = ((ImageView)paramContext);
    paramContext = findViewById(2131823408);
    j.o(paramContext, "findViewById(R.id.story_…tor_input_color_selector)");
    this.lnw = ((TextColorSelector)paramContext);
    this.slx.setOnFocusChangeListener((View.OnFocusChangeListener)new EditorInputView.1(this));
    this.lnt.setOnClickListener((View.OnClickListener)new EditorInputView.2(this));
    this.lnu.setOnClickListener((View.OnClickListener)new EditorInputView.3(this));
    setOnClickListener((View.OnClickListener)new EditorInputView.4(this));
    this.slz.setOnClickListener((View.OnClickListener)new EditorInputView.5(this));
    this.lnw.setColorSelectedCallback((b)new EditorInputView.6(this));
    this.lnw.setColorList(sjN);
    this.lnw.setSelected(0);
    this.slx.setTypeface(this.slx.getTypeface(), 1);
    this.lnE = ((Runnable)new EditorInputView.c(this));
    AppMethodBeat.o(110563);
  }

  private final void setImeVisibility(boolean paramBoolean)
  {
    AppMethodBeat.i(110560);
    if (paramBoolean)
    {
      post(this.lnE);
      AppMethodBeat.o(110560);
    }
    while (true)
    {
      return;
      removeCallbacks(this.lnE);
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        AppMethodBeat.o(110560);
      }
      else
      {
        AppMethodBeat.o(110560);
      }
    }
  }

  public final void bd(float paramFloat)
  {
    AppMethodBeat.i(110557);
    this.sly.setPadding((int)paramFloat, 0, (int)paramFloat, 0);
    AppMethodBeat.o(110557);
  }

  final void cCx()
  {
    AppMethodBeat.i(110558);
    int i;
    if (this.slB)
    {
      this.bgColor = (sjN[this.biG] & slD);
      switch (this.biG)
      {
      default:
        i = sjN[0];
        this.textColor = i;
      case 0:
      }
    }
    while (true)
    {
      this.slx.setTextColor(this.textColor);
      this.slx.setTextBackground(this.bgColor);
      this.slx.postInvalidate();
      AppMethodBeat.o(110558);
      return;
      i = sjN[1];
      break;
      this.textColor = (sjN[this.biG] & slC);
      this.bgColor = 0;
    }
  }

  public final EditorInputView.a getCallback()
  {
    return this.slA;
  }

  public final boolean getHasBackground()
  {
    return this.slB;
  }

  public final boolean getTextChanged()
  {
    return this.lnD;
  }

  public final boolean jn(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(110561);
    this.lnB = paramInt;
    if (paramInt > ak.fr(getContext()))
    {
      paramInt = 1;
      if (!this.lnC)
        break label66;
      if (paramInt == 0)
        break label55;
      this.lnC = false;
      AppMethodBeat.o(110561);
    }
    while (true)
    {
      return bool;
      paramInt = 0;
      break;
      label55: AppMethodBeat.o(110561);
      bool = true;
      continue;
      label66: AppMethodBeat.o(110561);
    }
  }

  public final void setCallback(EditorInputView.a parama)
  {
    this.slA = parama;
  }

  public final void setHasBackground(boolean paramBoolean)
  {
    this.slB = paramBoolean;
  }

  public final void setOnVisibleChangeCallback(b<? super Boolean, y> paramb)
  {
    this.eUw = paramb;
  }

  final void setSelectedIndex(int paramInt)
  {
    this.biG = paramInt;
    if (this.biG < 0)
      this.biG = 0;
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(110559);
    b localb;
    if (paramBoolean)
    {
      setVisibility(0);
      localb = this.eUw;
      if (localb != null)
        localb.am(Boolean.TRUE);
      setPadding(0, 0, 0, this.lnB);
      AppMethodBeat.o(110559);
    }
    while (true)
    {
      return;
      this.lnC = true;
      setVisibility(8);
      localb = this.eUw;
      if (localb != null)
      {
        localb.am(Boolean.FALSE);
        AppMethodBeat.o(110559);
      }
      else
      {
        AppMethodBeat.o(110559);
      }
    }
  }

  public final void setTextChanged(boolean paramBoolean)
  {
    this.lnD = paramBoolean;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(110562);
    super.setVisibility(paramInt);
    if (paramInt == 0)
      this.slx.requestFocus();
    AppMethodBeat.o(110562);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorInputView
 * JD-Core Version:    0.6.2
 */