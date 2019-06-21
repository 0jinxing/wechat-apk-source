package com.tencent.mm.plugin.card.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum q
{
  public int scene;

  static
  {
    AppMethodBeat.i(88945);
    krV = new q("EN_DYNAMIC_CODE_SCENE_ENTER_FOREGROUND", 0, 1);
    krW = new q("EN_DYNAMIC_CODE_SCENE_ENTER_WXCARD", 1, 2);
    krX = new q("EN_DYNAMIC_CODE_SCENE_ENTER_CARD_DETAIL", 2, 3);
    krY = new q[] { krV, krW, krX };
    AppMethodBeat.o(88945);
  }

  private q(int paramInt)
  {
    this.scene = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.q
 * JD-Core Version:    0.6.2
 */