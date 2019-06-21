package com.tencent.mm.view.a;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.io.File;
import java.util.ArrayList;

public final class j extends RecyclerView.a<b>
{
  public static final String AbP = File.separator;
  private com.tencent.mm.view.f.a Aaj;
  c AbM;
  private int AbN;
  public j.a AbO;
  public int llU;
  private Context mContext;
  public ArrayList<EmojiGroupInfo> mData;

  public j(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    AppMethodBeat.i(63009);
    this.mData = new ArrayList();
    this.AbM = null;
    this.mContext = paramContext;
    this.AbN = com.tencent.mm.emoji.e.a.y(paramContext, 2130771985);
    this.Aaj = parama;
    paramContext = new c.a();
    paramContext.ePF = true;
    paramContext.fHe = 4;
    paramContext.ePV = this.AbN;
    paramContext.ePN = this.Aaj.AdZ;
    paramContext.ePN = this.Aaj.AdZ;
    this.AbM = paramContext.ahG();
    AppMethodBeat.o(63009);
  }

  private static String K(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = null;
    String str = null;
    AppMethodBeat.i(63012);
    if ((bo.isNullOrNil(paramString2)) && (bo.isNullOrNil(paramString3)))
    {
      ab.w("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "[cpan] get icon path failed. productid and url are null.");
      AppMethodBeat.o(63012);
      paramString3 = str;
      return paramString3;
    }
    if ((bo.isNullOrNil(paramString2)) && (bo.isNullOrNil(paramString3)))
    {
      ab.e("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "[cpan] product id and url are null.");
      str = null;
      label65: paramString3 = localObject;
      if (!bo.isNullOrNil(str))
        if (!bo.isNullOrNil(paramString2))
          break label141;
    }
    label141: for (paramString3 = paramString1 + str; ; paramString3 = paramString1 + paramString2 + AbP + str)
    {
      AppMethodBeat.o(63012);
      break;
      if (bo.isNullOrNil(paramString3))
      {
        str = g.x(paramString2.getBytes());
        break label65;
      }
      str = g.x(paramString3.getBytes());
      break label65;
    }
  }

  public final EmojiGroupInfo QE(int paramInt)
  {
    AppMethodBeat.i(63010);
    EmojiGroupInfo localEmojiGroupInfo;
    if ((this.mData == null) || (this.mData.isEmpty()) || (this.mData.size() < paramInt) || (paramInt < 0))
    {
      localEmojiGroupInfo = null;
      AppMethodBeat.o(63010);
    }
    while (true)
    {
      return localEmojiGroupInfo;
      localEmojiGroupInfo = (EmojiGroupInfo)this.mData.get(paramInt);
      AppMethodBeat.o(63010);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(63011);
    int i;
    if (this.mData == null)
    {
      i = 0;
      AppMethodBeat.o(63011);
    }
    while (true)
    {
      return i;
      i = this.mData.size();
      AppMethodBeat.o(63011);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  final class b extends RecyclerView.v
    implements View.OnClickListener
  {
    ImageView AbQ;
    ImageView cAw;

    public b(View arg2)
    {
      super();
      AppMethodBeat.i(63007);
      this.cAw = ((ImageView)localView.findViewById(2131827584));
      this.AbQ = ((ImageView)localView.findViewById(2131827585));
      localView.setOnClickListener(this);
      AppMethodBeat.o(63007);
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(63008);
      if (j.a(j.this) != null)
        j.a(j.this).f(kj(), paramView);
      AppMethodBeat.o(63008);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.j
 * JD-Core Version:    0.6.2
 */