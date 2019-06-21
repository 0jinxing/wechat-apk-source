package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.aq;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.plugin.story.f.e;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "deleteGroup", "", "groupIndex", "", "notifyDeleteResult", "isOk", "", "notifyGroup", "notifyIndicator", "notifyItemsChange", "start", "count", "notifyItemsInsert", "notifyItemsRemove", "notifySetFavResult", "favorite", "notifySetPrivacyResult", "isPrivacy", "updateGroup", "items", "", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "updateGroupCount", "plugin-story_release"})
public final class l$g
  implements e
{
  l$g(Context paramContext)
  {
  }

  public final void EP(int paramInt)
  {
    AppMethodBeat.i(110799);
    if (paramInt <= 1)
      l.v(this.spK).cCG();
    l.h(this.spK).clear();
    for (int i = 0; i < paramInt; i++)
      l.h(this.spK).add(new ArrayList());
    AppMethodBeat.o(110799);
  }

  public final void EQ(int paramInt)
  {
    AppMethodBeat.i(110801);
    Object localObject = l.spJ;
    ab.i(l.access$getTAG$cp(), "deleteGroup: exitCheck " + this.spK.getDeleteWhenFirstEmpty() + ' ' + paramInt + ' ' + l.g(this.spK));
    int i;
    if ((this.spK.getDeleteWhenFirstEmpty()) && (paramInt == 0) && (l.g(this.spK) <= 0))
    {
      i = 1;
      if (i == 0)
        break label128;
      localObject = l.p(this.spK);
      if (localObject == null)
        break label120;
      ((com.tencent.mm.plugin.story.api.g)localObject).caC();
      AppMethodBeat.o(110801);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label120: AppMethodBeat.o(110801);
      continue;
      label128: i = l.h(this.spK).size();
      if (paramInt < 0);
      while (true)
      {
        if (l.h(this.spK).size() <= 1)
          l.v(this.spK).cCG();
        if (!l.h(this.spK).isEmpty())
          break label319;
        localObject = l.p(this.spK);
        if (localObject != null)
          ((com.tencent.mm.plugin.story.api.g)localObject).caA();
        l.f(this.spK).setVisibility(8);
        AppMethodBeat.o(110801);
        break;
        if (i > paramInt)
        {
          l.h(this.spK).remove(paramInt);
          l.w(this.spK).dI((List)l.h(this.spK));
          l.w(this.spK).ci(paramInt);
          localObject = l.q(this.spK).soF;
          if ((localObject != null) && (paramInt >= 0) && (paramInt < ((com.tencent.mm.plugin.story.ui.a.d)localObject).iLD.size() - 2))
          {
            ((com.tencent.mm.plugin.story.ui.a.d)localObject).iLD.remove(paramInt + 1);
            ((com.tencent.mm.plugin.story.ui.a.d)localObject).ci(paramInt + 1);
          }
        }
      }
      label319: localObject = l.p(this.spK);
      if (localObject != null)
        ((com.tencent.mm.plugin.story.api.g)localObject).caB();
      if (!l.k(this.spK))
      {
        l.f(this.spK).setAlpha(1.0F);
        l.f(this.spK).setVisibility(0);
      }
      AppMethodBeat.o(110801);
    }
  }

  public final void ER(int paramInt)
  {
    AppMethodBeat.i(110802);
    Object localObject = l.spJ;
    ab.c(l.access$getTAG$cp(), "notifyGroup, groupIndex:" + paramInt + ", selectedRow:" + l.g(this.spK), new Object[0]);
    if (l.g(this.spK) == paramInt)
    {
      localObject = l.x(this.spK);
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.story.ui.a.g)localObject).notifyDataSetChanged();
        AppMethodBeat.o(110802);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110802);
      continue;
      l.d(this.spK).post((Runnable)new l.g.a(this, paramInt));
      AppMethodBeat.o(110802);
    }
  }

  public final void ai(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(110803);
    if (l.g(this.spK) == paramInt1)
    {
      com.tencent.mm.plugin.story.ui.a.g localg = l.x(this.spK);
      if (localg != null)
      {
        localg.at(paramInt2, paramInt3);
        AppMethodBeat.o(110803);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110803);
      continue;
      l.d(this.spK).post((Runnable)new l.g.c(this, paramInt1));
      AppMethodBeat.o(110803);
    }
  }

  public final void aj(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(110804);
    if (l.g(this.spK) == paramInt1)
    {
      com.tencent.mm.plugin.story.ui.a.g localg = l.x(this.spK);
      if (localg != null)
      {
        localg.au(paramInt2, paramInt3);
        AppMethodBeat.o(110804);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110804);
      continue;
      l.d(this.spK).post((Runnable)new l.g.d(this, paramInt1));
      AppMethodBeat.o(110804);
    }
  }

  public final void ak(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(110805);
    if (l.g(this.spK) == paramInt1)
    {
      com.tencent.mm.plugin.story.ui.a.g localg = l.x(this.spK);
      if (localg != null)
      {
        localg.ar(paramInt2, paramInt3);
        AppMethodBeat.o(110805);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110805);
      continue;
      l.d(this.spK).post((Runnable)new l.g.b(this, paramInt1));
      AppMethodBeat.o(110805);
    }
  }

  public final void czD()
  {
    AppMethodBeat.i(110806);
    int i = l.h(this.spK).size();
    int j = l.g(this.spK);
    if (j < 0)
      AppMethodBeat.o(110806);
    while (true)
    {
      return;
      if (i > j)
      {
        GalleryHorizontalControlView localGalleryHorizontalControlView = l.z(this.spK);
        if (localGalleryHorizontalControlView != null)
        {
          Object localObject = l.h(this.spK).get(l.g(this.spK));
          j.o(localObject, "galleryGroups[selectedRow]");
          localGalleryHorizontalControlView.dI((List)localObject);
          AppMethodBeat.o(110806);
        }
      }
      else
      {
        AppMethodBeat.o(110806);
      }
    }
  }

  public final void j(int paramInt, List<com.tencent.mm.plugin.story.model.d.g> paramList)
  {
    AppMethodBeat.i(110800);
    j.p(paramList, "items");
    Object localObject = l.spJ;
    ab.c(l.access$getTAG$cp(), "updateGroup, groupIndex:" + paramInt + ", items:" + paramList.size() + ", active:" + l.k(this.spK) + ", galleryType:" + this.spK.getGalleryType(), new Object[0]);
    if (paramInt >= l.h(this.spK).size())
      AppMethodBeat.o(110800);
    while (true)
    {
      return;
      ((ArrayList)l.h(this.spK).get(paramInt)).clear();
      ((ArrayList)l.h(this.spK).get(paramInt)).addAll((Collection)paramList);
      l.w(this.spK).dI((List)l.h(this.spK));
      if (l.g(this.spK) == paramInt)
      {
        localObject = l.x(this.spK);
        if (localObject != null)
          ((com.tencent.mm.plugin.story.ui.a.g)localObject).dI(paramList);
      }
      if ((l.h(this.spK).size() == 1) && (paramList.isEmpty()))
      {
        paramList = l.p(this.spK);
        if (paramList != null)
          paramList.caA();
        l.f(this.spK).setVisibility(8);
        if (this.spK.getGalleryType() == m.a.rQD)
        {
          l.y(this.spK).setVisibility(0);
          paramList = h.scu;
          h.cAw().bE(1L);
          paramList = h.scu;
          h.cAx();
        }
      }
      while (true)
      {
        if ((paramInt != 0) || (l.k(this.spK)) || (this.spK.getGalleryType() == m.a.rQI) || (this.spK.getGalleryType() == m.a.rQH))
          break label451;
        this.spK.Fk(0);
        AppMethodBeat.o(110800);
        break;
        l.y(this.spK).setVisibility(8);
        continue;
        this.spK.post((Runnable)new l.g.e(this));
        paramList = l.p(this.spK);
        if (paramList != null)
          paramList.caB();
        l.y(this.spK).setVisibility(8);
        if (!l.k(this.spK))
        {
          l.f(this.spK).setAlpha(1.0F);
          l.f(this.spK).setVisibility(0);
        }
      }
      label451: if (paramInt == 1)
      {
        this.spK.getGalleryType();
        paramList = m.a.rQH;
      }
      AppMethodBeat.o(110800);
    }
  }

  public final void lA(boolean paramBoolean)
  {
    AppMethodBeat.i(110797);
    l.q(this.spK).lT(paramBoolean);
    AppMethodBeat.o(110797);
  }

  public final void lB(boolean paramBoolean)
  {
    AppMethodBeat.i(110796);
    l.q(this.spK).lU(paramBoolean);
    AppMethodBeat.o(110796);
  }

  public final void lz(boolean paramBoolean)
  {
    AppMethodBeat.i(110798);
    Object localObject = l.n(this.spK);
    if (localObject != null)
      ((p)localObject).dismiss();
    if (!paramBoolean)
    {
      t.makeText(this.jWS, (CharSequence)this.jWS.getResources().getString(2131303922), 0).show();
      AppMethodBeat.o(110798);
    }
    while (true)
    {
      return;
      localObject = com.tencent.mm.plugin.story.model.d.rSg;
      com.tencent.mm.plugin.story.model.d.cxB();
      AppMethodBeat.o(110798);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.g
 * JD-Core Version:    0.6.2
 */