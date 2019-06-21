package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WWMediaFile extends WWMediaMessage.WWMediaObject
{
  public int contentLengthLimit = 104857600;
  public byte[] fileData;
  public String fileName;
  public String filePath;

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80499);
    if (!super.checkArgs())
      AppMethodBeat.o(80499);
    while (true)
    {
      return bool;
      if (((this.fileData != null) && (this.fileData.length != 0)) || ((this.filePath != null) && (this.filePath.length() != 0)))
      {
        if ((this.fileData != null) && (this.fileData.length > this.contentLengthLimit))
        {
          AppMethodBeat.o(80499);
        }
        else if ((this.filePath != null) && (getFileSize(this.filePath) > this.contentLengthLimit))
        {
          AppMethodBeat.o(80499);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(80499);
        }
      }
      else
        AppMethodBeat.o(80499);
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80500);
    paramBundle.putByteArray("_wwfileobject_fileData", this.fileData);
    paramBundle.putString("_wwfileobject_filePath", this.filePath);
    paramBundle.putString("_wwfileobject_fileName", this.fileName);
    super.toBundle(paramBundle);
    AppMethodBeat.o(80500);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaFile
 * JD-Core Version:    0.6.2
 */