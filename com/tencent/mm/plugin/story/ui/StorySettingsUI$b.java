package com.tencent.mm.plugin.story.ui;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.proxy.StoryCaptureProxy;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ChoiceItem;", "Lcom/tencent/mm/plugin/story/ui/StorySettingsUI$ITestMenu;", "_showtitle", "", "_key", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "_items", "", "_vals", "", "(Lcom/tencent/mm/plugin/story/ui/StorySettingsUI;Ljava/lang/String;Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;[Ljava/lang/String;Ljava/lang/Object;)V", "get_items", "()[Ljava/lang/String;", "set_items", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "get_key", "()Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "set_key", "(Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;)V", "get_showtitle", "()Ljava/lang/String;", "set_showtitle", "(Ljava/lang/String;)V", "get_vals", "()Ljava/lang/Object;", "set_vals", "(Ljava/lang/Object;)V", "value", "getValue", "get", "field", "showAlert", "", "view", "Landroid/view/View;", "title", "plugin-story_release"})
public final class StorySettingsUI$b
  implements StorySettingsUI.e
{
  private String oDt;
  private String[] oDu;
  ac.a oDw;
  Object sff;

  public StorySettingsUI$b(String paramString, ac.a parama, String[] paramArrayOfString, Object paramObject)
  {
    AppMethodBeat.i(110048);
    this.oDt = parama;
    this.oDw = paramArrayOfString;
    this.oDu = paramObject;
    this.sff = localObject;
    AppMethodBeat.o(110048);
  }

  private final String cr(Object paramObject)
  {
    AppMethodBeat.i(110047);
    Object localObject = this.sff;
    int i;
    int j;
    if ((localObject instanceof long[]))
    {
      if (paramObject == null)
      {
        paramObject = new v("null cannot be cast to non-null type kotlin.Long");
        AppMethodBeat.o(110047);
        throw paramObject;
      }
      long l = ((Long)paramObject).longValue();
      paramObject = this.sff;
      if (paramObject == null)
      {
        paramObject = new v("null cannot be cast to non-null type kotlin.LongArray");
        AppMethodBeat.o(110047);
        throw paramObject;
      }
      i = ((long[])paramObject).length;
      j = 0;
      if (j < i)
      {
        paramObject = this.sff;
        if (paramObject == null)
        {
          paramObject = new v("null cannot be cast to non-null type kotlin.LongArray");
          AppMethodBeat.o(110047);
          throw paramObject;
        }
        if ((l == ((long[])paramObject)[j]) && (j < this.oDu.length))
        {
          paramObject = this.oDu[j];
          AppMethodBeat.o(110047);
        }
      }
    }
    while (true)
    {
      return paramObject;
      j++;
      break;
      paramObject = this.oDu[0];
      AppMethodBeat.o(110047);
      continue;
      if ((localObject instanceof int[]))
      {
        if (paramObject == null)
        {
          paramObject = new v("null cannot be cast to non-null type kotlin.Int");
          AppMethodBeat.o(110047);
          throw paramObject;
        }
        int k = ((Integer)paramObject).intValue();
        paramObject = this.sff;
        if (paramObject == null)
        {
          paramObject = new v("null cannot be cast to non-null type kotlin.IntArray");
          AppMethodBeat.o(110047);
          throw paramObject;
        }
        i = ((int[])paramObject).length;
        for (j = 0; ; j++)
        {
          if (j >= i)
            break label323;
          paramObject = this.sff;
          if (paramObject == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.IntArray");
            AppMethodBeat.o(110047);
            throw paramObject;
          }
          if ((k == ((int[])paramObject)[j]) && (j < this.oDu.length))
          {
            paramObject = this.oDu[j];
            AppMethodBeat.o(110047);
            break;
          }
        }
        label323: paramObject = this.oDu[0];
        AppMethodBeat.o(110047);
      }
      else
      {
        paramObject = "";
        AppMethodBeat.o(110047);
      }
    }
  }

  public final String Op()
  {
    return this.oDt;
  }

  public final String Oq()
  {
    AppMethodBeat.i(110045);
    Object localObject;
    if ((this.sff instanceof long[]))
    {
      localObject = StorySettingsUI.a(this.sfc);
      if (localObject == null)
        j.dWJ();
      localObject = cr(((StoryCaptureProxy)localObject).get(this.oDw, Long.valueOf(0L)));
      AppMethodBeat.o(110045);
    }
    while (true)
    {
      return localObject;
      localObject = StorySettingsUI.a(this.sfc);
      if (localObject == null)
        j.dWJ();
      localObject = cr(((StoryCaptureProxy)localObject).get(this.oDw, Integer.valueOf(0)));
      AppMethodBeat.o(110045);
    }
  }

  public final void eh(View paramView)
  {
    AppMethodBeat.i(110046);
    j.p(paramView, "view");
    paramView = new LinkedList();
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    int j = this.oDu.length;
    while (i < j)
    {
      paramView.add(this.oDu[i]);
      localLinkedList.add(Integer.valueOf(i));
      i++;
    }
    h.a((Context)this.sfc, "", (List)paramView, (List)localLinkedList, "", (h.d)new StorySettingsUI.b.a(this));
    AppMethodBeat.o(110046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.b
 * JD-Core Version:    0.6.2
 */