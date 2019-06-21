package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.am;
import android.support.v7.widget.an;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/PageScrollHelper;", "Landroid/support/v7/widget/PagerSnapHelper;", "()V", "horizontalHelper", "Landroid/support/v7/widget/OrientationHelper;", "verticalHelper", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "distanceToCenter", "", "helper", "getHorizontalHelper", "getVerticalHelper", "Companion", "plugin-story_release"})
public final class j extends an
{
  private static final String TAG = "MicroMsg.PageScrollHelper";
  public static final a soO;
  private am soM;
  private am soN;

  static
  {
    AppMethodBeat.i(110762);
    soO = new a((byte)0);
    TAG = "MicroMsg.PageScrollHelper";
    AppMethodBeat.o(110762);
  }

  private static int a(RecyclerView.i parami, View paramView, am paramam)
  {
    AppMethodBeat.i(110761);
    int j;
    int k;
    if (parami.iG())
    {
      i = RecyclerView.i.bD(paramView) + RecyclerView.i.bE(paramView);
      j = paramam.bf(paramView);
      k = (paramam.bj(paramView) - i) / 2;
      if (!parami.getClipToPadding())
        break label85;
    }
    label85: for (int i = paramam.je() + paramam.jg() / 2; ; i = paramam.getEnd() / 2)
    {
      AppMethodBeat.o(110761);
      return j + k - i;
      i = RecyclerView.i.bB(paramView) + RecyclerView.i.bC(paramView);
      break;
    }
  }

  public final int[] a(RecyclerView.i parami, View paramView)
  {
    Object localObject1 = null;
    AppMethodBeat.i(110760);
    a.f.b.j.p(parami, "layoutManager");
    a.f.b.j.p(paramView, "targetView");
    ab.i(TAG, "LogStory: calculateDistanceToFinalSnap " + RecyclerView.i.bt(paramView));
    int[] arrayOfInt = new int[2];
    Object localObject2;
    if (parami.iG())
    {
      if (this.soN != null)
      {
        localObject2 = this.soN;
        if (localObject2 == null)
          break label202;
        localObject2 = ((am)localObject2).getLayoutManager();
        if (localObject2 == parami);
      }
      else
      {
        this.soN = am.d(parami);
      }
      localObject2 = this.soN;
      if (localObject2 == null)
        a.f.b.j.dWJ();
      arrayOfInt[0] = a(parami, paramView, (am)localObject2);
      label120: if (!parami.iH())
        break label216;
      if (this.soM != null)
      {
        am localam = this.soM;
        localObject2 = localObject1;
        if (localam != null)
          localObject2 = localam.getLayoutManager();
        if (localObject2 == parami);
      }
      else
      {
        this.soM = am.e(parami);
      }
      localObject2 = this.soM;
      if (localObject2 == null)
        a.f.b.j.dWJ();
      arrayOfInt[1] = a(parami, paramView, (am)localObject2);
    }
    while (true)
    {
      AppMethodBeat.o(110760);
      return arrayOfInt;
      label202: localObject2 = null;
      break;
      arrayOfInt[0] = 0;
      break label120;
      label216: arrayOfInt[1] = 0;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/PageScrollHelper$Companion;", "", "()V", "TAG", "", "plugin-story_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.j
 * JD-Core Version:    0.6.2
 */