package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$VOICEKIND
{
  public final int value;

  static
  {
    AppMethodBeat.i(84131);
    BYPASS = new VOICEKIND("BYPASS", 0, -1);
    CAT = new VOICEKIND("CAT", 1, 1);
    MAN = new VOICEKIND("MAN", 2, 2);
    GIRL = new VOICEKIND("GIRL", 3, 4);
    UNCLE = new VOICEKIND("UNCLE", 4, 5);
    BOY = new VOICEKIND("BOY", 5, 6);
    FAST = new VOICEKIND("FAST", 6, 7);
    SLOWLY = new VOICEKIND("SLOWLY", 7, 8);
    WOMAN = new VOICEKIND("WOMAN", 8, 9);
    ELECTRONIC = new VOICEKIND("ELECTRONIC", 9, 10);
    ELEVEN = new VOICEKIND("ELEVEN", 10, 11);
    TWELVE = new VOICEKIND("TWELVE", 11, 12);
    THIRTEEN = new VOICEKIND("THIRTEEN", 12, 13);
    BIG = new VOICEKIND("BIG", 13, 536936433);
    $VALUES = new VOICEKIND[] { BYPASS, CAT, MAN, GIRL, UNCLE, BOY, FAST, SLOWLY, WOMAN, ELECTRONIC, ELEVEN, TWELVE, THIRTEEN, BIG };
    AppMethodBeat.o(84131);
  }

  private VideoMaterialUtil$VOICEKIND(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.VOICEKIND
 * JD-Core Version:    0.6.2
 */