package com.tencent.mm.plugin.emojicapture.ui.a;

import a.f.b.j;
import a.l;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.model.a.b;
import com.tencent.mm.plugin.emojicapture.ui.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$EmptyStickerViewHolder;", "Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder;", "Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;Landroid/view/View;)V", "update", "", "position", "", "info", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "plugin-emojicapture_release"})
public final class a$c extends a.a
{
  public a$c(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(2935);
    AppMethodBeat.o(2935);
  }

  public final void b(b paramb)
  {
    AppMethodBeat.i(2934);
    j.p(paramb, "info");
    ImageView localImageView = this.iNr;
    j.o(localImageView, "icon");
    paramb = this.iNr;
    j.o(paramb, "icon");
    a.a(localImageView, a.dg((View)paramb));
    AppMethodBeat.o(2934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.a.a.c
 * JD-Core Version:    0.6.2
 */