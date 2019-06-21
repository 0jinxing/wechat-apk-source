package com.tencent.mm.modelrecovery;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nv;
import com.tencent.mm.g.a.nv.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.recovery.RecoveryContext;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.wx.service.WXRecoveryHandleService;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.recovery.wx.util.WXUtil;

final class PluginRecovery$1 extends c<nv>
{
  PluginRecovery$1(PluginRecovery paramPluginRecovery)
  {
    AppMethodBeat.i(16523);
    this.xxI = nv.class.getName().hashCode();
    AppMethodBeat.o(16523);
  }

  private static boolean a(nv paramnv)
  {
    AppMethodBeat.i(16524);
    switch (paramnv.cKm.action)
    {
    default:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(16524);
      return false;
      a.aiz();
      continue;
      paramnv = ah.getContext();
      Object localObject = new CommonOptions.Builder();
      ((CommonOptions.Builder)localObject).Aro = WXRecoveryHandleService.class.getName();
      ((CommonOptions.Builder)localObject).Arp = WXRecoveryUploadService.class.getName();
      ((CommonOptions.Builder)localObject).clientVersion = f.CLIENT_VERSION;
      ((CommonOptions.Builder)localObject).Arl = String.format("file:///sdcard/test-recovery.conf", new Object[0]);
      ((CommonOptions.Builder)localObject).eCq = WXUtil.iG(paramnv);
      RecoveryLogic.a(paramnv, ((CommonOptions.Builder)localObject).dQg(), new RecoveryContext());
      continue;
      localObject = ah.getContext();
      paramnv = new CommonOptions.Builder();
      paramnv.Aro = WXRecoveryHandleService.class.getName();
      paramnv.Arp = WXRecoveryUploadService.class.getName();
      paramnv.clientVersion = f.CLIENT_VERSION;
      paramnv.Arl = "http://dldir1.qq.com/weixin/android/recovery-0x26032011.conf";
      paramnv.eCq = WXUtil.iG((Context)localObject);
      RecoveryLogic.a((Context)localObject, paramnv.dQg(), new RecoveryContext());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.PluginRecovery.1
 * JD-Core Version:    0.6.2
 */