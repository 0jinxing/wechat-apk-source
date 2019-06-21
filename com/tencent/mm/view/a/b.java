package com.tencent.mm.view.a;

import a.l;
import a.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/view/adapter/CaptureEmojiAdapter;", "Lcom/tencent/mm/view/adapter/BaseSmileyAdapter;", "context", "Landroid/content/Context;", "stg", "Lcom/tencent/mm/view/storage/SmileyPanelStg;", "(Landroid/content/Context;Lcom/tencent/mm/view/storage/SmileyPanelStg;)V", "emojiList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "itemBgId", "", "canPreview", "", "position", "getCount", "getItem", "getItemId", "", "getRealPosition", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "update", "", "emoji", "Companion", "ViewHolder", "plugin-emojisdk_release"})
public final class b extends a
{
  public static final b.a Abj;
  ArrayList<EmojiInfo> Abh;
  private final int Abi;

  static
  {
    AppMethodBeat.i(63334);
    Abj = new b.a((byte)0);
    AppMethodBeat.o(63334);
  }

  public b(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
    AppMethodBeat.i(63333);
    this.Abh = new ArrayList();
    this.Abi = com.tencent.mm.emoji.e.a.y(paramContext, 2130771986);
    AppMethodBeat.o(63333);
  }

  private int QC(int paramInt)
  {
    return this.Abe * this.Abd + paramInt;
  }

  private EmojiInfo uf(int paramInt)
  {
    AppMethodBeat.i(63331);
    paramInt = QC(paramInt);
    Object localObject = this.Aal;
    a.f.b.j.o(localObject, "mSmileyPanelStg");
    if (((com.tencent.mm.view.f.a)localObject).dNz())
      paramInt--;
    while (true)
    {
      localObject = (EmojiInfo)a.a.j.x((List)this.Abh, paramInt);
      AppMethodBeat.o(63331);
      return localObject;
    }
  }

  public final int getCount()
  {
    if (this.Abe == this.Aab - 1)
    {
      int i = this.emW - this.Abe * this.Abd;
      j = i;
      if (i >= 0);
    }
    for (int j = 0; ; j = this.Abd)
      return j;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(63330);
    a.f.b.j.p(paramViewGroup, "parent");
    Object localObject1;
    if (paramView != null)
    {
      localObject1 = paramView.getTag();
      if (localObject1 != null)
        break label194;
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969343, null);
      a.f.b.j.o(paramView, "LayoutInflater.from(pare…panel_item_capture, null)");
      paramViewGroup = this.Aal;
      a.f.b.j.o(paramViewGroup, "mSmileyPanelStg");
      int i = paramViewGroup.getColumnWidth();
      paramViewGroup = this.Aal;
      a.f.b.j.o(paramViewGroup, "mSmileyPanelStg");
      paramView.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(i, paramViewGroup.dNk()));
      paramViewGroup = new b.b(this, paramView);
      paramView.setTag(paramViewGroup);
      label109: if ((this.Abe != 0) || (paramInt != 0))
        break label228;
      localObject1 = this.Aal;
      a.f.b.j.o(localObject1, "mSmileyPanelStg");
      if (!((com.tencent.mm.view.f.a)localObject1).dNz())
        break label228;
      paramViewGroup.iqT.setImageResource(2131231222);
      paramViewGroup.iqT.setContentDescription((CharSequence)paramViewGroup.iqT.getContext().getString(2131297785));
      paramViewGroup.Abk.setVisibility(8);
    }
    while (true)
    {
      AppMethodBeat.o(63330);
      return paramView;
      localObject1 = null;
      break;
      label194: paramViewGroup = paramView.getTag();
      if (paramViewGroup == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.view.adapter.CaptureEmojiAdapter.ViewHolder");
        AppMethodBeat.o(63330);
        throw paramView;
      }
      paramViewGroup = (b.b)paramViewGroup;
      break label109;
      label228: localObject1 = uf(paramInt);
      if (localObject1 != null)
        break label261;
      paramViewGroup.iqT.setVisibility(8);
      paramViewGroup.Abk.setVisibility(8);
    }
    label261: paramViewGroup.iqT.setVisibility(0);
    paramViewGroup.iqT.setBackgroundResource(this.Abi);
    Object localObject2 = ((EmojiInfo)localObject1).duZ();
    if (localObject2 == null);
    while (true)
    {
      localObject2 = com.tencent.mm.emoji.loader.a.exs;
      com.tencent.mm.emoji.loader.a.a((EmojiInfo)localObject1, paramViewGroup.iqT);
      break;
      switch (c.eQZ[localObject2.ordinal()])
      {
      default:
        break;
      case 1:
        paramViewGroup.Abk.setVisibility(8);
        break;
      case 2:
      case 3:
        paramViewGroup.Abk.setVisibility(0);
        paramViewGroup.Abl.setVisibility(0);
        paramViewGroup.Abm.setVisibility(8);
        break;
      case 4:
      case 5:
        paramViewGroup.Abk.setVisibility(0);
        paramViewGroup.Abl.setVisibility(8);
        paramViewGroup.Abm.setVisibility(0);
      }
    }
  }

  public final boolean ui(int paramInt)
  {
    AppMethodBeat.i(63329);
    com.tencent.mm.view.f.a locala = this.Aal;
    a.f.b.j.o(locala, "mSmileyPanelStg");
    boolean bool;
    if ((locala.dNz()) && ((this.zZZ != 26) || (this.Abe != 0) || (paramInt != 0)))
    {
      bool = true;
      AppMethodBeat.o(63329);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63329);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.b
 * JD-Core Version:    0.6.2
 */