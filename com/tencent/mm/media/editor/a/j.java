package com.tencent.mm.media.editor.a;

import a.l;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cgu;
import com.tencent.mm.protocal.protobuf.cnw;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/TextItem;", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "text", "", "textColor", "", "textBgColor", "matrix", "Landroid/graphics/Matrix;", "(Ljava/lang/CharSequence;IILandroid/graphics/Matrix;)V", "getMatrix", "()Landroid/graphics/Matrix;", "setMatrix", "(Landroid/graphics/Matrix;)V", "getText", "()Ljava/lang/CharSequence;", "getTextBgColor", "()I", "getTextColor", "toProtoBuf", "Lcom/tencent/mm/protobuf/BaseProtoBuf;", "plugin-mediaeditor_release"})
public final class j extends a
{
  private Matrix aKk;
  private final int eUv;
  public final CharSequence text;
  private final int textColor;

  public j(CharSequence paramCharSequence, int paramInt1, int paramInt2, Matrix paramMatrix)
  {
    super(e.eUm);
    AppMethodBeat.i(12895);
    this.text = paramCharSequence;
    this.textColor = paramInt1;
    this.eUv = paramInt2;
    this.aKk = paramMatrix;
    AppMethodBeat.o(12895);
  }

  public final com.tencent.mm.bt.a UG()
  {
    AppMethodBeat.i(12894);
    Object localObject = new cgu();
    float[] arrayOfFloat = new float[9];
    cnw localcnw = new cnw();
    this.aKk.getValues(arrayOfFloat);
    for (int i = 0; i < 9; i++)
    {
      float f = arrayOfFloat[i];
      localcnw.xls.add(Float.valueOf(f));
    }
    ((cgu)localObject).text = String.valueOf(this.text);
    ((cgu)localObject).wCL = localcnw;
    ((cgu)localObject).eUv = this.eUv;
    ((cgu)localObject).textColor = this.textColor;
    localObject = (com.tencent.mm.bt.a)localObject;
    AppMethodBeat.o(12894);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.j
 * JD-Core Version:    0.6.2
 */