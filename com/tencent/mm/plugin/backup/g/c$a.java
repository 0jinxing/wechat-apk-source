package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;
import java.io.FileInputStream;
import java.util.HashSet;

final class c$a
{
  private static String TAG = "MicroMsg.BackupDataPushScene.BackFileOp";
  private FileInputStream fileInputStream;
  String filePath;
  int frO;
  private HashSet<c> jxv;
  byte[] jxw;
  int offset;

  public c$a(String paramString)
  {
    AppMethodBeat.i(17643);
    this.jxv = new HashSet();
    this.filePath = null;
    this.frO = 0;
    this.jxw = null;
    this.offset = 0;
    this.fileInputStream = null;
    this.filePath = paramString;
    this.jxw = null;
    paramString = this.filePath;
    aw.ZK();
    int i;
    if (!paramString.startsWith(com.tencent.mm.model.c.Yb()))
    {
      i = 0;
      if (i == 0)
        break label221;
    }
    label221: for (this.frO = bo.cc(this.jxw); ; this.frO = ((int)e.asZ(this.filePath)))
    {
      if (this.frO < 0)
        this.frO = 0;
      AppMethodBeat.o(17643);
      return;
      paramString = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramString);
      if (paramString == null)
      {
        i = 0;
        break;
      }
      if ((paramString.field_reserved4 & EmojiInfo.yaB) != EmojiInfo.yaB)
      {
        i = 0;
        break;
      }
      this.jxw = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(paramString);
      if (bo.cc(this.jxw) <= 0)
      {
        i = 0;
        break;
      }
      i = 1;
      break;
    }
  }

  final boolean b(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(17644);
    try
    {
      if (this.fileInputStream == null)
      {
        FileInputStream localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>(this.filePath);
        this.fileInputStream = localFileInputStream;
      }
      int i = this.fileInputStream.read(paramArrayOfByte);
      int j = paramArrayOfByte.length;
      if (i != j)
      {
        AppMethodBeat.o(17644);
        paramBoolean = bool;
      }
      while (true)
      {
        return paramBoolean;
        if (paramBoolean)
          this.fileInputStream.close();
        paramBoolean = true;
        AppMethodBeat.o(17644);
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        AppMethodBeat.o(17644);
        paramBoolean = bool;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.c.a
 * JD-Core Version:    0.6.2
 */