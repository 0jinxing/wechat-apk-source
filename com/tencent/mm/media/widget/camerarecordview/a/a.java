package com.tencent.mm.media.widget.camerarecordview.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/data/CameraCaptureInfo;", "", "recordVideo", "", "recordThumb", "isCaptureVideo", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setCaptureVideo", "(Z)V", "getRecordThumb", "()Ljava/lang/String;", "setRecordThumb", "(Ljava/lang/String;)V", "getRecordVideo", "setRecordVideo", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "plugin-mediaeditor_release"})
public final class a
{
  public String fbT;
  public String fbU;
  public boolean fbV;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(13257);
    this.fbT = paramString1;
    this.fbU = paramString2;
    this.fbV = true;
    AppMethodBeat.o(13257);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(13260);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label85;
      paramObject = (a)paramObject;
      if ((!j.j(this.fbT, paramObject.fbT)) || (!j.j(this.fbU, paramObject.fbU)))
        break label85;
      if (this.fbV == paramObject.fbV)
      {
        i = 1;
        if (i == 0)
          break label85;
      }
    }
    else
    {
      AppMethodBeat.o(13260);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label85: AppMethodBeat.o(13260);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(13259);
    String str = this.fbT;
    if (str != null);
    for (int j = str.hashCode(); ; j = 0)
    {
      str = this.fbU;
      if (str != null)
        i = str.hashCode();
      int k = this.fbV;
      int m = k;
      if (k != 0)
        m = 1;
      AppMethodBeat.o(13259);
      return m + (j * 31 + i) * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(13258);
    String str = "CameraCaptureInfo(recordVideo=" + this.fbT + ", recordThumb=" + this.fbU + ", isCaptureVideo=" + this.fbV + ")";
    AppMethodBeat.o(13258);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.a.a
 * JD-Core Version:    0.6.2
 */