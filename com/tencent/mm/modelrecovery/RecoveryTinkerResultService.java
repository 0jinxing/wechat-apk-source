package com.tencent.mm.modelrecovery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.lib.service.a;
import java.util.ArrayList;

public class RecoveryTinkerResultService extends AbstractResultService
{
  public final void a(a parama)
  {
    AppMethodBeat.i(16546);
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "RecoveryTinkerResultService receive result: %s", new Object[] { parama });
    CommonOptions localCommonOptions = OptionFactory.iz(this);
    ArrayList localArrayList = new ArrayList();
    RecoveryHandleItem localRecoveryHandleItem = new RecoveryHandleItem();
    localRecoveryHandleItem.eCq = localCommonOptions.eCq;
    localRecoveryHandleItem.clientVersion = localCommonOptions.clientVersion;
    localRecoveryHandleItem.timestamp = System.currentTimeMillis();
    localRecoveryHandleItem.key = "KeyPatchResultTotalCount";
    if (parama.cxT)
    {
      RecoveryLog.i("Recovery.RecoveryTinkerResultService", "patch success", new Object[0]);
      localRecoveryHandleItem.key = "KeyPatchResultSuccessCount";
    }
    while (true)
    {
      localArrayList.add(localRecoveryHandleItem);
      RecoveryLogic.a(this, localArrayList, WXRecoveryUploadService.class.getName());
      stopSelf();
      AppMethodBeat.o(16546);
      return;
      RecoveryLog.i("Recovery.RecoveryTinkerResultService", "patch fail ", new Object[0]);
      if (parama.Arh != null)
      {
        RecoveryLog.i("Recovery.RecoveryTinkerResultService", "fail reason %s", new Object[] { parama.Arh.getMessage() });
        localRecoveryHandleItem.key = String.format("%s[%s]", new Object[] { "KeyPatchResultFailCount", parama.Arh.getMessage() });
      }
      else
      {
        localRecoveryHandleItem.key = "KeyPatchResultFailCount";
      }
    }
  }

  public void onCreate()
  {
    AppMethodBeat.i(16544);
    super.onCreate();
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "onCreate", new Object[0]);
    AppMethodBeat.o(16544);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16545);
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "onDestroy", new Object[0]);
    super.onDestroy();
    AppMethodBeat.o(16545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.RecoveryTinkerResultService
 * JD-Core Version:    0.6.2
 */