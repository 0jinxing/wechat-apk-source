package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;

final class j$6$4
  implements g.a
{
  j$6$4(j.6 param6, b paramb, bi parambi, HashSet paramHashSet)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(31320);
    if ((paramInt == 0) && (paramc != null))
    {
      this.yIN.field_offset = paramc.field_finishedLength;
      am.aUq().a(this.yIN, new String[0]);
    }
    if ((paramInt == 0) && (paramd != null) && (paramd.field_retCode == 0))
    {
      ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d", new Object[] { Long.valueOf(this.fku.field_msgId) });
      this.yIN.field_status = 199L;
      this.yIN.field_offset = this.yIN.field_totalLen;
      am.aUq().a(this.yIN, new String[0]);
      this.fku.setStatus(3);
      aw.ZK();
      com.tencent.mm.model.c.XO().a(this.fku.field_msgId, this.fku);
      this.yLC.remove(Long.valueOf(this.fku.field_msgId));
      j.6.a(this.yOU, this.yLC);
    }
    long l;
    if ((paramInt != 0) || ((paramd != null) && (paramd.field_retCode != 0)))
    {
      l = this.fku.field_msgId;
      if (paramd != null)
        break label286;
    }
    label286: for (int i = 0; ; i = paramd.field_retCode)
    {
      ab.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d, error(%d,%d)", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt), Integer.valueOf(i) });
      this.yLC.remove(Long.valueOf(this.fku.field_msgId));
      j.6.a(this.yOU, this.yLC);
      AppMethodBeat.o(31320);
      return 0;
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
 * Qualified Name:     com.tencent.mm.ui.chatting.c.j.6.4
 * JD-Core Version:    0.6.2
 */