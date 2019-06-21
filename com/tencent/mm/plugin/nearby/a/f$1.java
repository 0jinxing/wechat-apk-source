package com.tencent.mm.plugin.nearby.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.je;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.g.a.jf.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.z;

final class f$1 extends c<jf>
{
  f$1(f paramf)
  {
    AppMethodBeat.i(55374);
    this.xxI = jf.class.getName().hashCode();
    AppMethodBeat.o(55374);
  }

  private static boolean a(jf paramjf)
  {
    int i = 3;
    AppMethodBeat.i(55375);
    Object localObject = paramjf.cEs.cEt;
    paramjf = paramjf.cEs.csG;
    if ((((bf.b)localObject).fmx != null) && (((bf.b)localObject).scene == 1))
    {
      g.RP().Ry().set(73729, Integer.valueOf(1));
      bf localbf = new bf();
      localbf.field_content = paramjf.field_content;
      localbf.field_createtime = bo.anT();
      localbf.field_imgpath = "";
      localbf.field_sayhicontent = ah.getContext().getString(2131301648);
      localbf.field_sayhiuser = paramjf.field_talker;
      localbf.field_scene = 18;
      if (paramjf.field_status > 3)
        i = paramjf.field_status;
      localbf.field_status = i;
      localbf.field_svrid = paramjf.field_msgSvrId;
      localbf.field_talker = paramjf.field_talker;
      localbf.field_type = 34;
      localbf.field_isSend = 0;
      localbf.field_sayhiencryptuser = paramjf.field_talker;
      localbf.field_ticket = ((bf.b)localObject).fmx;
      g.RN().QU();
      ((bg)((j)g.K(j.class)).bOo()).a(localbf);
      localObject = new je();
      ((je)localObject).cEq.cEr = paramjf.field_talker;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    }
    AppMethodBeat.o(55375);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.f.1
 * JD-Core Version:    0.6.2
 */