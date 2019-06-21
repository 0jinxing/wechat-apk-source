package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;

public final class b
{
  private final String TAG;
  public View kRR;
  public String kRZ;
  public ImageView kSa;
  public ImageView kSb;
  public TextView klC;
  public Context mContext;

  public b(Context paramContext)
  {
    AppMethodBeat.i(52719);
    this.TAG = "MicroMsg.emoji.BaseEmojiStoreItemViewHolder";
    this.mContext = paramContext;
    this.kRR = v.hu(this.mContext).inflate(2130969369, null);
    bju();
    AppMethodBeat.o(52719);
  }

  public b(Context paramContext, View paramView)
  {
    AppMethodBeat.i(52720);
    this.TAG = "MicroMsg.emoji.BaseEmojiStoreItemViewHolder";
    this.mContext = paramContext;
    this.kRR = paramView;
    bju();
    AppMethodBeat.o(52720);
  }

  private void bju()
  {
    AppMethodBeat.i(52721);
    if (this.kRR == null)
    {
      ab.w("MicroMsg.emoji.BaseEmojiStoreItemViewHolder", "initView failed. root is null.");
      AppMethodBeat.o(52721);
    }
    while (true)
    {
      return;
      this.kSa = ((ImageView)this.kRR.findViewById(2131823474));
      this.klC = ((TextView)this.kRR.findViewById(2131823564));
      this.kSb = ((ImageView)this.kRR.findViewById(2131823558));
      AppMethodBeat.o(52721);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.b
 * JD-Core Version:    0.6.2
 */