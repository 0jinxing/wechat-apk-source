package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;

final class k$5
  implements g.a
{
  k$5(j.b paramb, b paramb1, Context paramContext, String paramString, bi parambi, boolean paramBoolean)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(30579);
    if ((paramInt == 0) && (paramd != null) && (paramd.field_retCode == 0))
    {
      if ((!bo.isNullOrNil(this.hWW.fgu)) && (this.yIN != null))
      {
        this.yIN.field_status = 199L;
        this.yIN.field_offset = this.yIN.field_totalLen;
        am.aUq().a(this.yIN, new String[0]);
        aw.ZK();
        paramString = com.tencent.mm.model.c.XO().jf(this.yIN.field_msgInfoId);
        paramString.setStatus(3);
        aw.ZK();
        com.tencent.mm.model.c.XO().a(paramString.field_msgId, paramString);
      }
      new ak(Looper.getMainLooper()).post(new k.5.1(this));
    }
    AppMethodBeat.o(30579);
    return 0;
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
 * Qualified Name:     com.tencent.mm.ui.chatting.k.5
 * JD-Core Version:    0.6.2
 */