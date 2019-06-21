package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorControlPanel;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/media/editor/panel/IEditorPanel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "panelBottom", "Landroid/view/ViewGroup;", "panelTop", "visibleCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "visible", "", "isShow", "setOnVisibleChangeCallback", "callback", "setShow", "show", "plugin-story_release"})
public final class EditorControlPanel extends FrameLayout
{
  private b<? super Boolean, y> eUw;
  private final ViewGroup sln;
  private final ViewGroup slo;

  public EditorControlPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110539);
    AppMethodBeat.o(110539);
  }

  public EditorControlPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110538);
    View.inflate(paramContext, 2130970878, (ViewGroup)this);
    paramAttributeSet = findViewById(2131828118);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_control_layout_top)");
    this.sln = ((ViewGroup)paramAttributeSet);
    paramAttributeSet = findViewById(2131828123);
    j.o(paramAttributeSet, "findViewById(R.id.story_…or_control_layout_bottom)");
    this.slo = ((ViewGroup)paramAttributeSet);
    this.slo.setPadding(0, 0, 0, ak.fr(paramContext));
    AppMethodBeat.o(110538);
  }

  public final void setOnVisibleChangeCallback(b<? super Boolean, y> paramb)
  {
    this.eUw = paramb;
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(110537);
    b localb;
    if (paramBoolean)
    {
      setVisibility(0);
      localb = this.eUw;
      if (localb != null)
      {
        localb.am(Boolean.TRUE);
        AppMethodBeat.o(110537);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110537);
      continue;
      setVisibility(8);
      localb = this.eUw;
      if (localb != null)
      {
        localb.am(Boolean.FALSE);
        AppMethodBeat.o(110537);
      }
      else
      {
        AppMethodBeat.o(110537);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorControlPanel
 * JD-Core Version:    0.6.2
 */