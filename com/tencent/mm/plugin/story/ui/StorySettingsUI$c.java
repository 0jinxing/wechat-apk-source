package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.t;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ClickItem;", "Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ITestMenu;", "title", "", "value", "clickEvent", "Landroid/view/View$OnClickListener;", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "getClickEvent", "()Landroid/view/View$OnClickListener;", "getTitle", "()Ljava/lang/String;", "getValue", "showAlert", "", "view", "Landroid/view/View;", "plugin-story_release"})
public final class StorySettingsUI$c
  implements StorySettingsUI.e
{
  private final View.OnClickListener sfh;
  private final String title;
  private final String value;

  public StorySettingsUI$c(String paramString1, String paramString2, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(110050);
    this.title = paramString1;
    this.value = paramString2;
    this.sfh = paramOnClickListener;
    AppMethodBeat.o(110050);
  }

  public final String Op()
  {
    return this.title;
  }

  public final String Oq()
  {
    return this.value;
  }

  public final void eh(View paramView)
  {
    AppMethodBeat.i(110049);
    j.p(paramView, "view");
    this.sfh.onClick(paramView);
    t.makeText(ah.getContext(), (CharSequence)"ClickItem Done", 1).show();
    AppMethodBeat.o(110049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.c
 * JD-Core Version:    0.6.2
 */