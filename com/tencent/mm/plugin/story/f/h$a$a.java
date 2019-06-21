package com.tencent.mm.plugin.story.f;

import a.f.b.j;
import a.l;
import android.support.v7.h.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/presenter/IGalleryPresenter$Companion$calculateDiff$1", "Landroid/support/v7/util/DiffUtil$Callback;", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "plugin-story_release"})
public final class h$a$a extends c.a
{
  h$a$a(List paramList1, List paramList2)
  {
  }

  public final boolean J(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109582);
    boolean bool;
    if (((g)this.rZy.get(paramInt1)).rUJ == ((g)this.rZz.get(paramInt2)).rUJ)
    {
      bool = true;
      AppMethodBeat.o(109582);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109582);
    }
  }

  public final boolean K(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109583);
    boolean bool = j.j((g)this.rZy.get(paramInt1), (g)this.rZz.get(paramInt2));
    AppMethodBeat.o(109583);
    return bool;
  }

  public final int fV()
  {
    AppMethodBeat.i(109580);
    int i = this.rZy.size();
    AppMethodBeat.o(109580);
    return i;
  }

  public final int fW()
  {
    AppMethodBeat.i(109581);
    int i = this.rZz.size();
    AppMethodBeat.o(109581);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.h.a.a
 * JD-Core Version:    0.6.2
 */