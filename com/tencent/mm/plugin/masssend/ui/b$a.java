package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.h;

final class b$a extends h
{
  String fileName;

  public b$a(b paramb, Context paramContext)
  {
    super(paramContext, false);
  }

  public final boolean EH()
  {
    AppMethodBeat.i(22774);
    this.fileName = super.getFileName();
    boolean bool = super.EH();
    super.reset();
    AppMethodBeat.o(22774);
    return bool;
  }

  public final String getFileName()
  {
    return this.fileName;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.b.a
 * JD-Core Version:    0.6.2
 */