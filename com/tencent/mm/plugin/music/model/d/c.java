package com.tencent.mm.plugin.music.model.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.e.e;
import com.tencent.mm.plugin.music.model.e.a;

public final class c
{
  boolean oMX = false;
  boolean oMY = false;
  boolean oMZ = false;
  boolean oNa = false;
  boolean oNb = false;
  boolean oNc = false;
  boolean oNd = false;
  boolean oNe = false;
  boolean oNf = false;
  int oNg = 0;
  com.tencent.mm.plugin.music.c.b oNh;

  final String getMimeType()
  {
    AppMethodBeat.i(105010);
    if (this.oNh != null);
    for (String str1 = this.oNh.mimeType; ; str1 = "")
    {
      String str2 = str1;
      if (TextUtils.isEmpty(str1))
      {
        a locala = ((e)com.tencent.mm.plugin.music.f.c.b.ar(e.class)).bTU();
        str2 = str1;
        if (locala != null)
          str2 = locala.field_mimetype;
      }
      AppMethodBeat.o(105010);
      return str2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.d.c
 * JD-Core Version:    0.6.2
 */