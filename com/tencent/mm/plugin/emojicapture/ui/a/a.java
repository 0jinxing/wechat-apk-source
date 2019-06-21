package com.tencent.mm.plugin.emojicapture.ui.a;

import a.f.a.m;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.e;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder;", "()V", "itemClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "info", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "selectedPosition", "stickerList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItem", "getItemCount", "getItemViewType", "getSelection", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSelection", "update", "audios", "", "BaseViewHolder", "Companion", "EmptyStickerViewHolder", "StickerViewHolder", "plugin-emojicapture_release"})
public final class a extends RecyclerView.a<a.a>
{
  public static final String TAG = "MicroMsg.StickerAdapter";
  private static final int llW = 1;
  private static final int llX = 2;
  public static final a.b llY;
  public final ArrayList<com.tencent.mm.plugin.emojicapture.model.a.b> llT;
  public int llU;
  public m<? super Integer, ? super com.tencent.mm.plugin.emojicapture.model.a.b, y> llV;

  static
  {
    AppMethodBeat.i(2943);
    llY = new a.b((byte)0);
    TAG = "MicroMsg.StickerAdapter";
    llW = 1;
    llX = 2;
    AppMethodBeat.o(2943);
  }

  public a()
  {
    AppMethodBeat.i(2942);
    this.llT = new ArrayList();
    this.llU = -1;
    AppMethodBeat.o(2942);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(2939);
    int i = this.llT.size();
    AppMethodBeat.o(2939);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt == 0);
    for (paramInt = llX; ; paramInt = llW)
      return paramInt;
  }

  public final com.tencent.mm.plugin.emojicapture.model.a.b uE(int paramInt)
  {
    AppMethodBeat.i(2938);
    com.tencent.mm.plugin.emojicapture.model.a.b localb = (com.tencent.mm.plugin.emojicapture.model.a.b)a.a.j.x((List)this.llT, paramInt);
    AppMethodBeat.o(2938);
    return localb;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$StickerViewHolder;", "Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder;", "Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter;Landroid/view/View;)V", "update", "", "position", "", "info", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "plugin-emojicapture_release"})
  public final class d extends a.a
  {
    public d()
    {
      super(localObject);
      AppMethodBeat.i(2937);
      AppMethodBeat.o(2937);
    }

    public final void b(com.tencent.mm.plugin.emojicapture.model.a.b paramb)
    {
      AppMethodBeat.i(2936);
      a.f.b.j.p(paramb, "info");
      Object localObject = e.eOD;
      localObject = e.Tb().lR(paramb.hNN);
      ImageView localImageView = this.iNr;
      a.f.b.j.o(localImageView, "icon");
      ((com.tencent.mm.loader.a.b)localObject).d(localImageView);
      localObject = this.gHg;
      a.f.b.j.o(localObject, "text");
      ((TextView)localObject).setText((CharSequence)paramb.name);
      AppMethodBeat.o(2936);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.a.a
 * JD-Core Version:    0.6.2
 */