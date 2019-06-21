package com.tencent.mm.media.editor.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/EditorDataType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TEXT", "EMOJI", "LOCATION", "plugin-mediaeditor_release"})
public enum e
{
  public final int value;

  static
  {
    AppMethodBeat.i(12880);
    e locale1 = new e("TEXT", 0, 1);
    eUm = locale1;
    e locale2 = new e("EMOJI", 1, 2);
    eUn = locale2;
    e locale3 = new e("LOCATION", 2, 3);
    eUo = locale3;
    eUp = new e[] { locale1, locale2, locale3 };
    AppMethodBeat.o(12880);
  }

  private e(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.e
 * JD-Core Version:    0.6.2
 */