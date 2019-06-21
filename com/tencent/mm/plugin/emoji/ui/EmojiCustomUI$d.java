package com.tencent.mm.plugin.emoji.ui;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiCustomUI$d
{
  ImageView image;
  View iym;
  CheckBox lab;

  public EmojiCustomUI$d(View paramView)
  {
    AppMethodBeat.i(53334);
    this.iym = paramView.findViewById(2131821518);
    this.image = ((ImageView)paramView.findViewById(2131820629));
    this.lab = ((CheckBox)paramView.findViewById(2131823450));
    AppMethodBeat.o(53334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.d
 * JD-Core Version:    0.6.2
 */