package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/GalleryDateAdapter$GalleryDateViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/GalleryDateAdapter;Landroid/view/View;)V", "arrowIv", "Landroid/widget/ImageView;", "getArrowIv", "()Landroid/widget/ImageView;", "bg", "getBg", "()Landroid/view/View;", "dateTv", "Landroid/widget/TextView;", "getDateTv", "()Landroid/widget/TextView;", "plugin-story_release"})
public final class c$a extends RecyclerView.v
{
  final TextView gnf;
  final View jYG;
  final ImageView nOz;

  public c$a(View paramView)
  {
    super(localObject);
    AppMethodBeat.i(110097);
    paramView = localObject.findViewById(2131828150);
    j.o(paramView, "itemView.findViewById(R.…y_gallery_header_date_ll)");
    this.jYG = paramView;
    paramView = localObject.findViewById(2131822740);
    j.o(paramView, "itemView.findViewById(R.id.date_tv)");
    this.gnf = ((TextView)paramView);
    paramView = localObject.findViewById(2131826147);
    j.o(paramView, "itemView.findViewById(R.id.arrow)");
    this.nOz = ((ImageView)paramView);
    AppMethodBeat.o(110097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.c.a
 * JD-Core Version:    0.6.2
 */