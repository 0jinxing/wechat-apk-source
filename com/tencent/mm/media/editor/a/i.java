package com.tencent.mm.media.editor.a;

import a.l;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ayv;
import com.tencent.mm.protocal.protobuf.cnw;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/LocationItem;", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "cityName", "", "poiName", "matrix", "Landroid/graphics/Matrix;", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Matrix;)V", "getCityName", "()Ljava/lang/String;", "setCityName", "(Ljava/lang/String;)V", "getMatrix", "()Landroid/graphics/Matrix;", "setMatrix", "(Landroid/graphics/Matrix;)V", "getPoiName", "setPoiName", "toProtoBuf", "Lcom/tencent/mm/protobuf/BaseProtoBuf;", "plugin-mediaeditor_release"})
public final class i extends a
{
  private Matrix aKk;
  public String eUt;
  public String eUu;

  public i(String paramString1, String paramString2, Matrix paramMatrix)
  {
    super(e.eUo);
    AppMethodBeat.i(12892);
    this.eUt = paramString1;
    this.eUu = paramString2;
    this.aKk = paramMatrix;
    AppMethodBeat.o(12892);
  }

  public final com.tencent.mm.bt.a UG()
  {
    AppMethodBeat.i(12891);
    Object localObject = new ayv();
    float[] arrayOfFloat = new float[9];
    cnw localcnw = new cnw();
    this.aKk.getValues(arrayOfFloat);
    for (int i = 0; i < 9; i++)
    {
      float f = arrayOfFloat[i];
      localcnw.xls.add(Float.valueOf(f));
    }
    ((ayv)localObject).eUt = this.eUt;
    ((ayv)localObject).eUu = this.eUu;
    ((ayv)localObject).wCL = localcnw;
    localObject = (com.tencent.mm.bt.a)localObject;
    AppMethodBeat.o(12891);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.i
 * JD-Core Version:    0.6.2
 */