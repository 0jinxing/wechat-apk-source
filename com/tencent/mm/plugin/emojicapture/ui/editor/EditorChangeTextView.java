package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.a.b;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.InsectRelativeLayout;
import com.tencent.mm.media.editor.view.TextColorSelector;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.ui.a;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;", "Lcom/tencent/mm/emoji/view/InsectRelativeLayout;", "Lcom/tencent/mm/media/editor/panel/IEditorPanel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "callback", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$AddTextCallback;", "getCallback", "()Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$AddTextCallback;", "setCallback", "(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$AddTextCallback;)V", "cancel", "Landroid/view/View;", "colorSelector", "Lcom/tencent/mm/media/editor/view/TextColorSelector;", "confirm", "deleteIcon", "Landroid/widget/ImageView;", "input", "Landroid/widget/EditText;", "lastBottom", "reporter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "selectedColor", "selectedStrokeColor", "showImeRunnable", "Ljava/lang/Runnable;", "textChanged", "", "getTextChanged", "()Z", "setTextChanged", "(Z)V", "waitKeyBoardShown", "windowVisibleRect", "Landroid/graphics/Rect;", "", "insectBottom", "bottom", "isShow", "setImeVisibility", "visible", "setOnVisibleChangeCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setShow", "show", "setVisibility", "visibility", "setup", "text", "", "textColor", "AddTextCallback", "plugin-emojicapture_release"})
public final class EditorChangeTextView extends InsectRelativeLayout
{
  private final String TAG;
  EditText jgG;
  public EmojiCaptureReporter lha;
  private EditorChangeTextView.a lnA;
  private int lnB;
  private boolean lnC;
  boolean lnD;
  private final Runnable lnE;
  private View lnt;
  private View lnu;
  private ImageView lnv;
  TextColorSelector lnw;
  int lnx;
  int lny;
  private final Rect lnz;

  public EditorChangeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(3071);
    AppMethodBeat.o(3071);
  }

  public EditorChangeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 100
    //   3: invokestatic 106	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: iload_3
    //   10: invokespecial 119	com/tencent/mm/emoji/view/InsectRelativeLayout:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   13: sipush 3070
    //   16: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   19: aload_0
    //   20: ldc 121
    //   22: putfield 123	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:TAG	Ljava/lang/String;
    //   25: aload_0
    //   26: new 125	android/graphics/Rect
    //   29: dup
    //   30: invokespecial 128	android/graphics/Rect:<init>	()V
    //   33: putfield 130	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnz	Landroid/graphics/Rect;
    //   36: aload_1
    //   37: ldc 131
    //   39: aload_0
    //   40: checkcast 133	android/view/ViewGroup
    //   43: invokestatic 139	android/view/View:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   46: pop
    //   47: aload_0
    //   48: ldc 140
    //   50: invokevirtual 144	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:findViewById	(I)Landroid/view/View;
    //   53: astore_1
    //   54: aload_1
    //   55: ldc 146
    //   57: invokestatic 148	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   60: aload_0
    //   61: aload_1
    //   62: checkcast 150	android/widget/EditText
    //   65: putfield 152	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:jgG	Landroid/widget/EditText;
    //   68: aload_0
    //   69: ldc 153
    //   71: invokevirtual 144	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:findViewById	(I)Landroid/view/View;
    //   74: astore_1
    //   75: aload_1
    //   76: ldc 155
    //   78: invokestatic 148	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   81: aload_0
    //   82: aload_1
    //   83: putfield 157	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnt	Landroid/view/View;
    //   86: aload_0
    //   87: ldc 158
    //   89: invokevirtual 144	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:findViewById	(I)Landroid/view/View;
    //   92: astore_1
    //   93: aload_1
    //   94: ldc 160
    //   96: invokestatic 148	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   99: aload_0
    //   100: aload_1
    //   101: putfield 162	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnu	Landroid/view/View;
    //   104: aload_0
    //   105: ldc 163
    //   107: invokevirtual 144	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:findViewById	(I)Landroid/view/View;
    //   110: astore_1
    //   111: aload_1
    //   112: ldc 165
    //   114: invokestatic 148	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   117: aload_0
    //   118: aload_1
    //   119: checkcast 167	com/tencent/mm/media/editor/view/TextColorSelector
    //   122: putfield 169	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnw	Lcom/tencent/mm/media/editor/view/TextColorSelector;
    //   125: aload_0
    //   126: ldc 170
    //   128: invokevirtual 144	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:findViewById	(I)Landroid/view/View;
    //   131: astore_1
    //   132: aload_1
    //   133: ldc 172
    //   135: invokestatic 148	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   138: aload_0
    //   139: aload_1
    //   140: checkcast 174	android/widget/ImageView
    //   143: putfield 176	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnv	Landroid/widget/ImageView;
    //   146: aload_0
    //   147: getfield 152	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:jgG	Landroid/widget/EditText;
    //   150: new 178	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$1
    //   153: dup
    //   154: aload_0
    //   155: invokespecial 181	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$1:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   158: checkcast 183	android/view/View$OnFocusChangeListener
    //   161: invokevirtual 187	android/widget/EditText:setOnFocusChangeListener	(Landroid/view/View$OnFocusChangeListener;)V
    //   164: aload_0
    //   165: getfield 152	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:jgG	Landroid/widget/EditText;
    //   168: new 189	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$2
    //   171: dup
    //   172: aload_0
    //   173: invokespecial 190	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$2:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   176: checkcast 192	android/text/TextWatcher
    //   179: invokevirtual 196	android/widget/EditText:addTextChangedListener	(Landroid/text/TextWatcher;)V
    //   182: aload_0
    //   183: getfield 157	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnt	Landroid/view/View;
    //   186: new 198	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$3
    //   189: dup
    //   190: aload_0
    //   191: invokespecial 199	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$3:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   194: checkcast 201	android/view/View$OnClickListener
    //   197: invokevirtual 205	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   200: aload_0
    //   201: getfield 162	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnu	Landroid/view/View;
    //   204: new 207	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4
    //   207: dup
    //   208: aload_0
    //   209: invokespecial 208	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$4:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   212: checkcast 201	android/view/View$OnClickListener
    //   215: invokevirtual 205	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   218: aload_0
    //   219: getfield 176	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnv	Landroid/widget/ImageView;
    //   222: new 210	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$5
    //   225: dup
    //   226: aload_0
    //   227: invokespecial 211	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$5:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   230: checkcast 201	android/view/View$OnClickListener
    //   233: invokevirtual 212	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   236: aload_0
    //   237: getfield 169	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnw	Lcom/tencent/mm/media/editor/view/TextColorSelector;
    //   240: invokestatic 218	com/tencent/mm/plugin/emojicapture/ui/a:bnQ	()[I
    //   243: invokevirtual 222	com/tencent/mm/media/editor/view/TextColorSelector:setColorList	([I)V
    //   246: aload_0
    //   247: getfield 169	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnw	Lcom/tencent/mm/media/editor/view/TextColorSelector;
    //   250: iconst_0
    //   251: invokevirtual 225	com/tencent/mm/media/editor/view/TextColorSelector:setSelected	(I)V
    //   254: aload_0
    //   255: getfield 169	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnw	Lcom/tencent/mm/media/editor/view/TextColorSelector;
    //   258: new 6	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$6
    //   261: dup
    //   262: aload_0
    //   263: invokespecial 226	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$6:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   266: checkcast 228	a/f/a/b
    //   269: invokevirtual 232	com/tencent/mm/media/editor/view/TextColorSelector:setColorSelectedCallback	(La/f/a/b;)V
    //   272: aload_0
    //   273: new 234	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$7
    //   276: dup
    //   277: aload_0
    //   278: invokespecial 235	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$7:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   281: checkcast 201	android/view/View$OnClickListener
    //   284: invokevirtual 236	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   287: aload_0
    //   288: new 238	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$b
    //   291: dup
    //   292: aload_0
    //   293: invokespecial 239	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$b:<init>	(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;)V
    //   296: checkcast 241	java/lang/Runnable
    //   299: putfield 243	com/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView:lnE	Ljava/lang/Runnable;
    //   302: sipush 3070
    //   305: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   308: return
  }

  private final void setImeVisibility(boolean paramBoolean)
  {
    AppMethodBeat.i(3066);
    if (paramBoolean)
    {
      post(this.lnE);
      AppMethodBeat.o(3066);
    }
    while (true)
    {
      return;
      removeCallbacks(this.lnE);
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        AppMethodBeat.o(3066);
      }
      else
      {
        AppMethodBeat.o(3066);
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(3065);
    Object localObject = this.lnA;
    if (localObject != null)
      ((EditorChangeTextView.a)localObject).onCancel();
    this.jgG.clearFocus();
    if (this.lnD)
    {
      localObject = this.lha;
      if (localObject == null)
        j.avw("reporter");
      l = ((EmojiCaptureReporter)localObject).ezZ;
      localObject = this.lha;
      if (localObject == null)
        j.avw("reporter");
      EmojiCaptureReporter.a(16, l, 0L, 0L, 0L, 0L, 0L, 0, 0, ((EmojiCaptureReporter)localObject).scene);
    }
    localObject = this.lha;
    if (localObject == null)
      j.avw("reporter");
    long l = ((EmojiCaptureReporter)localObject).ezZ;
    localObject = this.lha;
    if (localObject == null)
      j.avw("reporter");
    EmojiCaptureReporter.a(14, l, 0L, 0L, 0L, 0L, 0L, 0, 0, ((EmojiCaptureReporter)localObject).scene);
    AppMethodBeat.o(3065);
  }

  public final EditorChangeTextView.a getCallback()
  {
    return this.lnA;
  }

  public final EmojiCaptureReporter getReporter()
  {
    AppMethodBeat.i(3063);
    EmojiCaptureReporter localEmojiCaptureReporter = this.lha;
    if (localEmojiCaptureReporter == null)
      j.avw("reporter");
    AppMethodBeat.o(3063);
    return localEmojiCaptureReporter;
  }

  public final boolean getTextChanged()
  {
    return this.lnD;
  }

  public final boolean jn(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(3068);
    this.lnB = paramInt;
    if (paramInt > ak.fr(getContext()))
    {
      paramInt = 1;
      if (!this.lnC)
        break label66;
      if (paramInt == 0)
        break label55;
      this.lnC = false;
      AppMethodBeat.o(3068);
    }
    while (true)
    {
      return bool;
      paramInt = 0;
      break;
      label55: AppMethodBeat.o(3068);
      bool = true;
      continue;
      label66: AppMethodBeat.o(3068);
    }
  }

  public final void setCallback(EditorChangeTextView.a parama)
  {
    this.lnA = parama;
  }

  public final void setOnVisibleChangeCallback(b<? super Boolean, y> paramb)
  {
  }

  public final void setReporter(EmojiCaptureReporter paramEmojiCaptureReporter)
  {
    AppMethodBeat.i(3064);
    j.p(paramEmojiCaptureReporter, "<set-?>");
    this.lha = paramEmojiCaptureReporter;
    AppMethodBeat.o(3064);
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(3067);
    if (paramBoolean)
    {
      setVisibility(0);
      setPadding(0, 0, 0, this.lnB);
      AppMethodBeat.o(3067);
    }
    while (true)
    {
      return;
      this.lnC = true;
      setVisibility(8);
      AppMethodBeat.o(3067);
    }
  }

  public final void setTextChanged(boolean paramBoolean)
  {
    this.lnD = paramBoolean;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(3069);
    super.setVisibility(paramInt);
    if (paramInt == 0)
      this.jgG.requestFocus();
    AppMethodBeat.o(3069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorChangeTextView
 * JD-Core Version:    0.6.2
 */