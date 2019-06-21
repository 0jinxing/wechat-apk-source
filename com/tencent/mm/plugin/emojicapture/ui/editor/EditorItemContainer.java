package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "clearActive", "Ljava/lang/Runnable;", "currActiveItem", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/IEditorItemView;", "deleteView", "Landroid/widget/TextView;", "deletingItem", "editorMask", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorOutsideView;", "itemLayout", "Landroid/view/ViewGroup;", "stateChangeListener", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$OnStateChangeListener;", "getStateChangeListener", "()Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$OnStateChangeListener;", "setStateChangeListener", "(Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$OnStateChangeListener;)V", "validAreaView", "Landroid/view/View;", "validRect", "Landroid/graphics/RectF;", "activeDeleteView", "", "active", "", "addEditorItem", "itemView", "createTextItem", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "deleteCheck", "event", "Landroid/view/MotionEvent;", "dispatchTouchEvent", "ev", "getAllEmojiMd5", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAllItemViews", "", "getAttachedText", "getTextItem", "getValidRect", "handleItemTouch", "onInterceptTouchEvent", "onTouchEvent", "pause", "removeAllItems", "requestEditing", "editing", "resume", "setEditing", "setValidRect", "left", "", "top", "right", "bottom", "toggleDeleteView", "show", "Companion", "OnStateChangeListener", "plugin-emojicapture_release"})
public final class EditorItemContainer extends RelativeLayout
{
  public static final a lnP;
  private final String TAG;
  private View lnG;
  private TextView lnH;
  public final ViewGroup lnI;
  public final EditorOutsideView lnJ;
  private EditorItemContainer.b lnK;
  private final RectF lnL;
  private a lnM;
  private Runnable lnN;
  private a lnO;

  static
  {
    AppMethodBeat.i(3092);
    lnP = new a((byte)0);
    AppMethodBeat.o(3092);
  }

  public EditorItemContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(3091);
    AppMethodBeat.o(3091);
  }

  public EditorItemContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3090);
    this.TAG = "MicroMsg.EditorItemContainer";
    this.lnL = new RectF();
    this.lnN = ((Runnable)new c(this));
    View.inflate(paramContext, 2130969325, (ViewGroup)this);
    paramContext = findViewById(2131823431);
    j.o(paramContext, "findViewById(R.id.editor_valid_area)");
    this.lnG = paramContext;
    paramContext = findViewById(2131823434);
    j.o(paramContext, "findViewById(R.id.editor_delete_view)");
    this.lnH = ((TextView)paramContext);
    paramContext = findViewById(2131823432);
    j.o(paramContext, "findViewById(R.id.emoji_capture_editor_layout)");
    this.lnI = ((ViewGroup)paramContext);
    paramContext = findViewById(2131823433);
    j.o(paramContext, "findViewById(R.id.emoji_capture_editor_mask)");
    this.lnJ = ((EditorOutsideView)paramContext);
    AppMethodBeat.o(3090);
  }

  private final boolean b(a parama, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3089);
    int i = paramMotionEvent.getPointerCount();
    float f = 0.0F;
    for (int j = 0; j < i; j++)
      f += paramMotionEvent.getY(j);
    boolean bool;
    if (f / i > this.lnH.getTop())
    {
      bool = true;
      if (!bool)
        break label97;
      gJ(true);
      if (this.lnO == null)
        this.lnO = parama;
    }
    while (true)
    {
      AppMethodBeat.o(3089);
      return bool;
      bool = false;
      break;
      label97: gJ(false);
      if (this.lnO != null)
        this.lnO = null;
    }
  }

  private final void gI(boolean paramBoolean)
  {
    AppMethodBeat.i(3087);
    Object localObject = this.lnH;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      ((TextView)localObject).setVisibility(i);
      if (this.lnK != null)
      {
        localObject = this.lnK;
        if (localObject == null)
          j.dWJ();
        ((EditorItemContainer.b)localObject).gH(paramBoolean);
      }
      AppMethodBeat.o(3087);
      return;
    }
  }

  private final void gJ(boolean paramBoolean)
  {
    AppMethodBeat.i(3088);
    this.lnH.setActivated(paramBoolean);
    if (paramBoolean)
    {
      this.lnH.setText(2131298993);
      AppMethodBeat.o(3088);
    }
    while (true)
    {
      return;
      this.lnH.setText(2131298992);
      AppMethodBeat.o(3088);
    }
  }

  public final void a(a parama, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3075);
    j.p(parama, "itemView");
    j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      AppMethodBeat.o(3075);
    case 0:
    case 2:
      while (true)
      {
        return;
        removeCallbacks(this.lnN);
        a(parama, true);
        AppMethodBeat.o(3075);
        continue;
        b(parama, paramMotionEvent);
        gI(true);
        AppMethodBeat.o(3075);
      }
    case 1:
    case 3:
    }
    this.lnI.bringChildToFront((View)getTextItem());
    if (this.lnO != null)
      post((Runnable)new EditorItemContainer.d(this));
    while (true)
    {
      gI(false);
      break;
      if (this.lnM != null)
        postDelayed(this.lnN, 1500L);
    }
  }

  public final void a(a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(3086);
    j.p(parama, "itemView");
    if (paramBoolean)
      if ((j.j(parama, this.lnM) ^ true))
      {
        a locala = this.lnM;
        if (locala != null)
          locala.setEditing(false);
        this.lnM = parama;
      }
    while (true)
    {
      parama.setEditing(paramBoolean);
      AppMethodBeat.o(3086);
      return;
      if (j.j(parama, this.lnM))
        this.lnM = null;
    }
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3077);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(3077);
    return bool;
  }

  public final ArrayList<String> getAllEmojiMd5()
  {
    AppMethodBeat.i(3081);
    ArrayList localArrayList = new ArrayList();
    int i = this.lnI.getChildCount();
    for (int j = 0; j < i; j++)
    {
      Object localObject = this.lnI.getChildAt(j);
      if ((localObject instanceof EmojiEditorItemView))
      {
        localObject = ((EmojiEditorItemView)localObject).getEmojiInfo();
        if (localObject != null)
        {
          localObject = ((EmojiInfo)localObject).Aq();
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
    }
    AppMethodBeat.o(3081);
    return localArrayList;
  }

  public final List<a> getAllItemViews()
  {
    AppMethodBeat.i(3082);
    List localList = (List)new ArrayList();
    int i = 0;
    int j = this.lnI.getChildCount();
    while (i < j)
    {
      View localView = this.lnI.getChildAt(i);
      if ((localView instanceof a))
        localList.add(localView);
      i++;
    }
    AppMethodBeat.o(3082);
    return localList;
  }

  public final String getAttachedText()
  {
    String str = null;
    AppMethodBeat.i(3080);
    TextEditorItemView localTextEditorItemView = getTextItem();
    if (localTextEditorItemView == null)
      AppMethodBeat.o(3080);
    while (true)
    {
      return str;
      if (localTextEditorItemView.getText() == null)
      {
        AppMethodBeat.o(3080);
      }
      else
      {
        str = String.valueOf(localTextEditorItemView.getText());
        AppMethodBeat.o(3080);
      }
    }
  }

  public final EditorItemContainer.b getStateChangeListener()
  {
    return this.lnK;
  }

  public final TextEditorItemView getTextItem()
  {
    AppMethodBeat.i(3079);
    int i = this.lnI.getChildCount();
    int j = 0;
    Object localObject;
    if (j < i)
    {
      localObject = this.lnI.getChildAt(j);
      if ((localObject instanceof TextEditorItemView))
      {
        localObject = (TextEditorItemView)localObject;
        AppMethodBeat.o(3079);
      }
    }
    while (true)
    {
      return localObject;
      j++;
      break;
      localObject = null;
      AppMethodBeat.o(3079);
    }
  }

  public final RectF getValidRect()
  {
    AppMethodBeat.i(3084);
    this.lnL.set(this.lnG.getLeft(), this.lnG.getTop(), this.lnG.getRight(), this.lnG.getBottom());
    RectF localRectF = this.lnL;
    AppMethodBeat.o(3084);
    return localRectF;
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3076);
    j.p(paramMotionEvent, "ev");
    boolean bool;
    if ((paramMotionEvent.getActionMasked() == 0) && (!this.lnL.contains(paramMotionEvent.getX(), paramMotionEvent.getY())))
    {
      bool = true;
      AppMethodBeat.o(3076);
    }
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(3076);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(3078);
    if ((paramMotionEvent != null) && (paramMotionEvent.getActionMasked() == 0))
      if (!this.lnL.contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
        AppMethodBeat.o(3078);
    while (true)
    {
      return bool;
      if (this.lnM != null)
      {
        a locala = this.lnM;
        if (locala == null)
          j.dWJ();
        a(locala, false);
      }
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(3078);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(3083);
    int i = this.lnI.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this.lnI.getChildAt(j);
      if ((localView instanceof a))
        ((a)localView).pause();
    }
    AppMethodBeat.o(3083);
  }

  public final void setEditing(a parama)
  {
    AppMethodBeat.i(3085);
    j.p(parama, "itemView");
    removeCallbacks(this.lnN);
    a(parama, true);
    postDelayed(this.lnN, 1500L);
    AppMethodBeat.o(3085);
  }

  public final void setStateChangeListener(EditorItemContainer.b paramb)
  {
    this.lnK = paramb;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$Companion;", "", "()V", "ClearActiveDelay", "", "plugin-emojicapture_release"})
  public static final class a
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class c
    implements Runnable
  {
    c(EditorItemContainer paramEditorItemContainer)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(3073);
      if (EditorItemContainer.d(this.lnQ) != null)
      {
        EditorItemContainer localEditorItemContainer = this.lnQ;
        a locala = EditorItemContainer.d(this.lnQ);
        if (locala == null)
          j.dWJ();
        localEditorItemContainer.a(locala, false);
      }
      AppMethodBeat.o(3073);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer
 * JD-Core Version:    0.6.2
 */