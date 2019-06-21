package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum h$a
{
  public int value;

  static
  {
    AppMethodBeat.i(62852);
    yaZ = new a("DesignerSimpleInfo", 0, 0);
    yba = new a("PersonalDesigner", 1, 1);
    ybb = new a("DesignerEmojiList", 2, 2);
    ybc = new a[] { yaZ, yba, ybb };
    AppMethodBeat.o(62852);
  }

  private h$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.h.a
 * JD-Core Version:    0.6.2
 */