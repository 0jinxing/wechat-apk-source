package com.tencent.mm.ui.chatting.i;

import android.content.pm.PackageInfo;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.a.c.e;
import com.tencent.mm.ui.tools.j;

final class f$2
  implements c.e
{
  f$2(f paramf)
  {
  }

  public final void a(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32614);
    aw.ZK();
    bi localbi = c.XO().jf(paramb.cvx);
    paramb = j.b.me(localbi.field_content);
    String str1 = p.B(paramb.url, "message");
    String str2 = p.B(paramb.fgn, "message");
    PackageInfo localPackageInfo = f.getPackageInfo(this.yZt.mContext, paramb.appId);
    f localf = this.yZt;
    if (localPackageInfo == null)
    {
      paramView = null;
      if (localPackageInfo != null)
        break label134;
    }
    label134: for (paramInt = 0; ; paramInt = localPackageInfo.versionCode)
    {
      localf.a(str1, str2, paramView, paramInt, paramb.appId, localbi.field_msgId, localbi.field_msgSvrId, localbi);
      AppMethodBeat.o(32614);
      return;
      paramView = localPackageInfo.versionName;
      break;
    }
  }

  public final void b(View paramView, int paramInt, c.b paramb)
  {
    AppMethodBeat.i(32615);
    ab.i("MicroMsg.MusicHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramInt) });
    new j(paramView.getContext()).b(paramView, new f.2.1(this), new f.2.2(this, paramb));
    AppMethodBeat.o(32615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.f.2
 * JD-Core Version:    0.6.2
 */