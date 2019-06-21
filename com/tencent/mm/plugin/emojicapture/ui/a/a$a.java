package com.tencent.mm.plugin.emojicapture.ui.a;

import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.emojicapture.model.a.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIcon", "()Landroid/widget/ImageView;", "text", "Landroid/widget/TextView;", "getText", "()Landroid/widget/TextView;", "update", "", "position", "", "info", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "plugin-emojicapture_release"})
public abstract class a$a extends RecyclerView.v
{
  final TextView gHg;
  final ImageView iNr;

  public a$a(View paramView)
  {
    super(localObject);
    this.iNr = ((ImageView)localObject.findViewById(2131823441));
    this.gHg = ((TextView)localObject.findViewById(2131823442));
    localObject.setOnClickListener((View.OnClickListener)new a.a.1(this, localObject));
  }

  public abstract void b(b paramb);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.a.a.a
 * JD-Core Version:    0.6.2
 */