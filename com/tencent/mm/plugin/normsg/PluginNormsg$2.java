package com.tencent.mm.plugin.normsg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class PluginNormsg$2
  implements g.a
{
  PluginNormsg$2(PluginNormsg paramPluginNormsg, File paramFile1, File paramFile2)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(10351);
    if (paramInt == -21006)
    {
      ab.w("MicroMsg.PluginNormsg", "urqtk: duplicate request to download meta, ignore this request.");
      AppMethodBeat.o(10351);
    }
    while (true)
    {
      return 0;
      if (paramInt == 0)
        break;
      ab.e("MicroMsg.PluginNormsg", "urqtk: start failed : %d", new Object[] { Integer.valueOf(paramInt) });
      h.pYm.k(876L, 30L, 1L);
      AppMethodBeat.o(10351);
    }
    if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label160;
      ab.e("MicroMsg.PluginNormsg", "urqtk: download failure, sceneResult.retCode:%d sceneResult[%s]", new Object[] { Integer.valueOf(paramd.field_retCode), paramd });
      if ((paramc != null) && (paramc.field_finishedLength > 0))
      {
        ab.w("MicroMsg.PluginNormsg", "urqtk: download interrupt, clear broken file.");
        this.oTL.delete();
      }
      h.pYm.k(876L, 31L, 1L);
    }
    while (true)
    {
      AppMethodBeat.o(10351);
      break;
      label160: ab.i("MicroMsg.PluginNormsg", "urqtk: cdn trans suceess.");
      this.oTL.renameTo(this.oTM);
      h.pYm.k(876L, 29L, 1L);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.PluginNormsg.2
 * JD-Core Version:    0.6.2
 */