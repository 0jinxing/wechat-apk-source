package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/GalleryMgr;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "cleanTask", "Lcom/tencent/mm/plugin/story/model/CleanVideoTask;", "list", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "getList", "()Ljava/util/LinkedList;", "register", "", "ui", "unregister", "plugin-story_release"})
public final class c
{
  private static final String TAG = "MicroMsg.GalleryMgr";
  private static final LinkedList<WeakReference<com.tencent.mm.plugin.story.ui.view.gallery.l>> eow;
  private static a rSc;
  public static final c rSd;

  static
  {
    AppMethodBeat.i(109012);
    rSd = new c();
    TAG = "MicroMsg.GalleryMgr";
    eow = new LinkedList();
    AppMethodBeat.o(109012);
  }

  public static void a(com.tencent.mm.plugin.story.ui.view.gallery.l paraml)
  {
    AppMethodBeat.i(109010);
    j.p(paraml, "ui");
    ab.i(TAG, "GalleryMgr register ".concat(String.valueOf(paraml)));
    Iterator localIterator = ((Iterable)eow).iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      if (j.j(paraml, (com.tencent.mm.plugin.story.ui.view.gallery.l)((WeakReference)localObject).get()))
      {
        if ((WeakReference)localObject == null)
          eow.add(new WeakReference(paraml));
        if (eow.size() <= 0)
          break label135;
        paraml = rSc;
        if (paraml == null)
          break label135;
        ab.i(paraml.TAG, "cancel");
        paraml.qHJ = false;
        AppMethodBeat.o(109010);
      }
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label135: AppMethodBeat.o(109010);
    }
  }

  public static void b(com.tencent.mm.plugin.story.ui.view.gallery.l paraml)
  {
    AppMethodBeat.i(109011);
    j.p(paraml, "ui");
    Iterator localIterator = ((Iterable)eow).iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      if (j.j(paraml, (com.tencent.mm.plugin.story.ui.view.gallery.l)((WeakReference)localObject).get()))
      {
        localObject = (WeakReference)localObject;
        if (localObject != null)
          eow.remove(localObject);
        ab.i(TAG, "GalleryMgr unregister " + paraml + ' ' + eow.size());
        if (eow.size() > 1)
          break label158;
        paraml = new a();
        rSc = paraml;
        b.a("cleanCacheFiles", (a.f.a.a)new a.b(paraml));
        AppMethodBeat.o(109011);
      }
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label158: AppMethodBeat.o(109011);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.c
 * JD-Core Version:    0.6.2
 */