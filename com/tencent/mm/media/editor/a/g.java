package com.tencent.mm.media.editor.a;

import a.l;
import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cnw;
import com.tencent.mm.protocal.protobuf.xy;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/EmojiItem;", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "showMatrix", "Landroid/graphics/Matrix;", "editorMatrix", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V", "getEditorMatrix", "()Landroid/graphics/Matrix;", "setEditorMatrix", "(Landroid/graphics/Matrix;)V", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "getShowMatrix", "setShowMatrix", "toProtoBuf", "Lcom/tencent/mm/protobuf/BaseProtoBuf;", "plugin-mediaeditor_release"})
public final class g extends a
{
  private Matrix eUr;
  private Matrix eUs;
  public final EmojiInfo exP;

  public g(EmojiInfo paramEmojiInfo, Matrix paramMatrix1, Matrix paramMatrix2)
  {
    super(e.eUn);
    AppMethodBeat.i(12890);
    this.exP = paramEmojiInfo;
    this.eUr = paramMatrix1;
    this.eUs = paramMatrix2;
    AppMethodBeat.o(12890);
  }

  public final com.tencent.mm.bt.a UG()
  {
    int i = 0;
    AppMethodBeat.i(12889);
    xy localxy = new xy();
    Object localObject = new float[9];
    cnw localcnw1 = new cnw();
    this.eUs.getValues((float[])localObject);
    float f;
    for (int j = 0; j < 9; j++)
    {
      f = localObject[j];
      localcnw1.xls.add(Float.valueOf(f));
    }
    cnw localcnw2 = new cnw();
    localObject = new float[9];
    this.eUr.getValues((float[])localObject);
    for (j = i; j < 9; j++)
    {
      f = localObject[j];
      localcnw2.xls.add(Float.valueOf(f));
    }
    localObject = this.exP;
    String str;
    if (localObject != null)
    {
      str = ((EmojiInfo)localObject).Aq();
      localObject = str;
      if (str != null);
    }
    else
    {
      localObject = "";
    }
    localxy.cvZ = ((String)localObject);
    localObject = this.exP;
    if (localObject != null)
    {
      str = ((EmojiInfo)localObject).getName();
      localObject = str;
      if (str != null);
    }
    else
    {
      localObject = "";
    }
    localxy.name = ((String)localObject);
    localxy.wdG = localcnw1;
    localxy.wdH = localcnw2;
    localObject = (com.tencent.mm.bt.a)localxy;
    AppMethodBeat.o(12889);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.g
 * JD-Core Version:    0.6.2
 */