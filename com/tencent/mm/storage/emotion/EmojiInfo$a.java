package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum EmojiInfo$a
{
  static
  {
    AppMethodBeat.i(62761);
    yaC = new a("STATUS_SUCCESS", 0);
    yaD = new a("STATUS_MIXING", 1);
    yaE = new a("STATUS_MIX_FAIL", 2);
    yaF = new a("STATUS_UPLOADING", 3);
    yaG = new a("STATUS_UPLOAD_FAIL", 4);
    yaH = new a[] { yaC, yaD, yaE, yaF, yaG };
    AppMethodBeat.o(62761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.EmojiInfo.a
 * JD-Core Version:    0.6.2
 */