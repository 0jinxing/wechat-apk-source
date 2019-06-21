package com.tencent.mm.plugin.story.ui.a;

import a.l;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/GalleryHeaderAdapter;", "T", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "()V", "dataList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "getItemCount", "", "removeAt", "", "userIndex", "update", "users", "", "Companion", "plugin-story_release"})
public abstract class d<T extends RecyclerView.v> extends RecyclerView.a<T>
{
  public static final d.a sft = new d.a((byte)0);
  public final ArrayList<String> iLD = new ArrayList();

  public int getItemCount()
  {
    return this.iLD.size();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.d
 * JD-Core Version:    0.6.2
 */