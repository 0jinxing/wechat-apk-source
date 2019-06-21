package com.tencent.mm.media.widget.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/BaseCommonCamera$CameraStatus;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "CAMERA_IS_DEFAULT", "CAMERA_IS_PREVIEWING", "plugin-mediaeditor_release"})
public enum a$a
{
  private final int status;

  static
  {
    AppMethodBeat.i(13183);
    a locala1 = new a("CAMERA_IS_DEFAULT", 0, -1);
    faz = locala1;
    a locala2 = new a("CAMERA_IS_PREVIEWING", 1, 0);
    faA = locala2;
    faB = new a[] { locala1, locala2 };
    AppMethodBeat.o(13183);
  }

  private a$a(int paramInt)
  {
    this.status = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.a.a
 * JD-Core Version:    0.6.2
 */