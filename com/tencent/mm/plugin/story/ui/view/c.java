package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.i;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentInputDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "plugin-story_release"})
public final class c extends i
{
  public c(Context paramContext)
  {
    super(paramContext, 2131493162);
    AppMethodBeat.i(110341);
    fA();
    AppMethodBeat.o(110341);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110340);
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    if (paramBundle != null)
    {
      paramBundle.addFlags(67108864);
      paramBundle.setLayout(-1, -1);
      paramBundle.setSoftInputMode(36);
      AppMethodBeat.o(110340);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110340);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.c
 * JD-Core Version:    0.6.2
 */