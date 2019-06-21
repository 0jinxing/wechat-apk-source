package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class CompressPreviewUI$a
{
  boolean aIt;
  String id;
  String name;
  String pxv;
  String size;
  int type;

  public CompressPreviewUI$a(CompressPreviewUI paramCompressPreviewUI, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, boolean paramBoolean)
  {
    AppMethodBeat.i(68245);
    this.id = paramString1;
    this.name = paramString2;
    paramCompressPreviewUI = paramString3;
    if (paramString3 == null)
      paramCompressPreviewUI = "";
    this.pxv = paramCompressPreviewUI;
    this.type = paramInt;
    this.size = paramString4;
    this.aIt = paramBoolean;
    AppMethodBeat.o(68245);
  }

  public final boolean ccX()
  {
    boolean bool = true;
    if (this.type == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.a
 * JD-Core Version:    0.6.2
 */