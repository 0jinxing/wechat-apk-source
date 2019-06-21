package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class XWalkUpdater$PatchFileConfig
{
  public String originalFileName;
  public int originalFileType;
  public String patchEndFileMd5;
  public String patchFileName;
  public int type;

  public boolean isExtractedFile()
  {
    if (this.originalFileType == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isOriginalFileTypeApk()
  {
    boolean bool = true;
    if (this.originalFileType == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public boolean isTypeAdd()
  {
    boolean bool = true;
    if (this.type == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public boolean isTypeModify()
  {
    if (this.type == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isTypeRemove()
  {
    if (this.type == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    AppMethodBeat.i(85909);
    String str = "PatchFileConfig type:" + this.type + ",originalFileType:" + this.originalFileType + ",originalFileName:" + this.originalFileName + ",patchFileName:" + this.patchFileName + ",patchEndFileMd5:" + this.patchEndFileMd5;
    AppMethodBeat.o(85909);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUpdater.PatchFileConfig
 * JD-Core Version:    0.6.2
 */