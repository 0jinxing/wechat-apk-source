package com.tencent.mm.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.by.a.c;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;

public final class e extends a
{
  private int Abi;
  ArrayList<EmojiInfo> lbH;
  int scene;

  public e(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
    AppMethodBeat.i(62982);
    this.Abi = com.tencent.mm.emoji.e.a.y(paramContext, 2130771986);
    this.scene = parama.gOW;
    AppMethodBeat.o(62982);
  }

  private EmojiInfo uf(int paramInt)
  {
    AppMethodBeat.i(62983);
    int i = this.Abe * this.Abd + paramInt;
    paramInt = i;
    if (this.zZZ == 25)
    {
      paramInt = i;
      if (com.tencent.mm.view.f.a.QM(this.Aal.gOW))
        paramInt = i - 1;
    }
    EmojiInfo localEmojiInfo;
    if ((this.lbH == null) || (paramInt < 0) || (paramInt >= this.lbH.size()))
    {
      localEmojiInfo = null;
      AppMethodBeat.o(62983);
    }
    while (true)
    {
      return localEmojiInfo;
      localEmojiInfo = (EmojiInfo)this.lbH.get(paramInt);
      AppMethodBeat.o(62983);
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
    AppMethodBeat.i(62985);
    Object localObject1;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970701, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(this.Aal.getColumnWidth(), this.Aal.Aeb));
      paramViewGroup = new e.a(this, paramView);
      paramView.setTag(paramViewGroup);
      if ((this.zZZ != 25) || (this.Abe != 0) || (paramInt != 0) || (!com.tencent.mm.view.f.a.QM(this.Aal.gOW)))
        break label254;
      paramViewGroup.iqT.setImageResource(2131231223);
      paramViewGroup.iqT.setContentDescription(paramView.getContext().getString(2131303077));
      int i = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().y(false, true);
      com.tencent.mm.by.a.dmE();
      localObject1 = com.tencent.mm.by.a.xun;
      if (!((h)com.tencent.mm.kernel.g.RM().Rn()).SG())
        break label230;
      paramInt = bo.getInt(com.tencent.mm.m.g.Nu().getValue("CustomEmojiMaxSize"), 300);
      label189: if (i <= paramInt)
        break label242;
      paramViewGroup.Abp.setVisibility(0);
      paramViewGroup.Abp.setText(2131299069);
    }
    while (true)
    {
      AppMethodBeat.o(62985);
      return paramView;
      paramViewGroup = (e.a)paramView.getTag();
      break;
      label230: paramInt = ((a.c)localObject1).getInt("EmotionRecommandCount", 3);
      break label189;
      label242: paramViewGroup.Abp.setVisibility(8);
      continue;
      label254: paramViewGroup.Abp.setVisibility(8);
      localObject1 = uf(paramInt);
      if (localObject1 != null)
        break label311;
      ab.w("MicroMsg.smiley.EmojiSmileyAdapter", "emoji is null.");
      paramViewGroup.iqT.setVisibility(8);
      paramViewGroup.gnC.setVisibility(8);
      paramViewGroup.iqT.setImageDrawable(null);
    }
    label311: paramViewGroup.iqT.setVisibility(0);
    Object localObject2 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().Jh(((EmojiInfo)localObject1).Aq());
    if ((!bo.isNullOrNil((String)localObject2)) && (this.zZZ == 23))
    {
      paramViewGroup.gnC.setText((CharSequence)localObject2);
      paramViewGroup.gnC.setVisibility(0);
      label378: paramViewGroup.iqT.setBackgroundResource(this.Abi);
      if (this.zZZ == 25)
      {
        if ((((EmojiInfo)localObject1).field_catalog != EmojiGroupInfo.yad) && (((EmojiInfo)localObject1).field_catalog != EmojiInfo.yak) && (((EmojiInfo)localObject1).field_catalog != EmojiInfo.yaj))
          break label546;
        localObject2 = ((EmojiInfo)localObject1).getName();
        if (bo.isNullOrNil((String)localObject2))
          break label535;
        if (!((String)localObject2).equalsIgnoreCase("dice"))
          break label504;
        paramViewGroup.iqT.setContentDescription(paramView.getContext().getString(2131299052));
      }
    }
    label535: label546: 
    while (true)
    {
      localObject2 = com.tencent.mm.emoji.loader.a.exs;
      com.tencent.mm.emoji.loader.a.a((EmojiInfo)localObject1, paramViewGroup.iqT);
      break;
      paramViewGroup.gnC.setVisibility(8);
      break label378;
      label504: if (((String)localObject2).equalsIgnoreCase("jsb"))
      {
        paramViewGroup.iqT.setContentDescription(paramView.getContext().getString(2131299061));
        continue;
        ab.i("MicroMsg.smiley.EmojiSmileyAdapter", "name is null");
        continue;
        localObject2 = ((EmojiInfo)localObject1).duZ();
        switch (1.Aag[localObject2.ordinal()])
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
  }

  public final boolean ui(int paramInt)
  {
    AppMethodBeat.i(62984);
    boolean bool;
    if ((com.tencent.mm.view.f.a.QM(this.Aal.gOW)) && ((this.zZZ != 25) || (this.Abe != 0) || (paramInt != 0)))
    {
      bool = true;
      AppMethodBeat.o(62984);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.e
 * JD-Core Version:    0.6.2
 */