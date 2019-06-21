package com.tencent.mm.emoji.b;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/panel/MMContextThemeWrapper;", "Landroid/view/ContextThemeWrapper;", "base", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "inflater", "Landroid/view/LayoutInflater;", "getSystemService", "", "name", "", "plugin-emojisdk_release"})
public final class a extends ContextThemeWrapper
{
  private LayoutInflater ezi;

  public a(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    AppMethodBeat.i(63251);
    AppMethodBeat.o(63251);
  }

  public final Object getSystemService(String paramString)
  {
    AppMethodBeat.i(63250);
    j.p(paramString, "name");
    if (j.j("layout_inflater", paramString))
    {
      if (this.ezi == null)
      {
        Object localObject = super.getSystemService(paramString);
        paramString = localObject;
        if (!(localObject instanceof LayoutInflater))
          paramString = null;
        this.ezi = v.a((LayoutInflater)paramString);
      }
      paramString = this.ezi;
      AppMethodBeat.o(63250);
    }
    while (true)
    {
      return paramString;
      paramString = super.getSystemService(paramString);
      AppMethodBeat.o(63250);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.b.a
 * JD-Core Version:    0.6.2
 */