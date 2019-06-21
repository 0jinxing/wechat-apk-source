package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.h;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;

final class j$4
  implements g.a
{
  j$4(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, bi parambi, int paramInt3)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(30536);
    if (paramd != null)
    {
      if (!paramd.field_exist_whencheck)
        break label343;
      paramd.field_fileId = this.val$url;
      paramd.field_aesKey = this.yIB;
      paramd.field_thumbimgLength = this.fEK;
      paramd.field_fileLength = this.pKK;
      paramd.field_toUser = this.cgl;
      paramd.field_filemd5 = this.iRf;
      paramd.field_mp4identifymd5 = this.yIC;
      ab.i("MicroMsg.ChattingEditModeLogic", "support second!! sceneResult: %s", new Object[] { paramd });
      paramString = t.ug(r.Yz());
      o.all();
      paramc = t.ui(paramString);
      o.all();
      e.y(t.ui(this.fku.field_imgPath), paramc);
      paramc = "<msg><videomsg aeskey=\"" + this.yIB + "\" cdnthumbaeskey=\"" + this.yIB + "\" cdnvideourl=\"" + this.val$url + "\" ";
      paramc = paramc + "cdnthumburl=\"" + this.val$url + "\" ";
      paramc = paramc + "length=\"" + this.pKK + "\" ";
      paramc = paramc + "cdnthumblength=\"" + this.fEK + "\"/></msg>";
      ab.i("MicroMsg.ChattingEditModeLogic", "cdn callback new build cdnInfo:%s", new Object[] { paramc });
      u.d(paramString, this.yID, this.cgl, paramc);
      g.Rg().a(new h(paramString, 0, paramd, new j.4.1(this, paramString)), 0);
    }
    while (true)
    {
      AppMethodBeat.o(30536);
      return 0;
      label343: j.e(this.cgl, this.fku);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.4
 * JD-Core Version:    0.6.2
 */