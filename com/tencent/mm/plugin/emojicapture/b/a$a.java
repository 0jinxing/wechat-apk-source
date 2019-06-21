package com.tencent.mm.plugin.emojicapture.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/config/EmojiCameraElementConfig$CameraPreviewConfig;", "", "resolution", "", "useCpuCrop", "", "previewSize", "stickerSampleSize", "(IZII)V", "getPreviewSize", "()I", "setPreviewSize", "(I)V", "getResolution", "setResolution", "getStickerSampleSize", "setStickerSampleSize", "getUseCpuCrop", "()Z", "setUseCpuCrop", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "plugin-emojicapture_release"})
public final class a$a
{
  public boolean fau = false;
  public int lhd = 1080;
  public int lhe = 640;
  public int lhf = 1;

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this != paramObject)
    {
      bool2 = bool1;
      if (!(paramObject instanceof a))
        break label107;
      paramObject = (a)paramObject;
      if (this.lhd != paramObject.lhd)
        break label109;
      i = 1;
      bool2 = bool1;
      if (i == 0)
        break label107;
      if (this.fau != paramObject.fau)
        break label115;
      i = 1;
      label56: bool2 = bool1;
      if (i == 0)
        break label107;
      if (this.lhe != paramObject.lhe)
        break label121;
      i = 1;
      label77: bool2 = bool1;
      if (i == 0)
        break label107;
      if (this.lhf != paramObject.lhf)
        break label127;
    }
    label107: label109: label115: label121: label127: for (int i = 1; ; i = 0)
    {
      bool2 = bool1;
      if (i != 0)
        bool2 = true;
      return bool2;
      i = 0;
      break;
      i = 0;
      break label56;
      i = 0;
      break label77;
    }
  }

  public final int hashCode()
  {
    int i = this.lhd;
    int j = this.fau;
    int k = j;
    if (j != 0)
      k = 1;
    return ((k + i * 31) * 31 + this.lhe) * 31 + this.lhf;
  }

  public final String toString()
  {
    AppMethodBeat.i(2569);
    String str = "CameraPreviewConfig(resolution=" + this.lhd + ", useCpuCrop=" + this.fau + ", previewSize=" + this.lhe + ", stickerSampleSize=" + this.lhf + ")";
    AppMethodBeat.o(2569);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.b.a.a
 * JD-Core Version:    0.6.2
 */