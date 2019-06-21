package com.tencent.mrs.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.d.c;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MrsCallback;
import com.tencent.mm.sdk.platformtools.w;

public class MatrixStrategyNotifyBroadcast extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      c.e("Matrix.StrategyNotifyBroadcast", "MatrixStrategyNotifyBroadcast intent == null", new Object[0]);
    while (true)
    {
      return;
      paramContext = w.n(paramIntent, "strategy");
      c.i("Matrix.StrategyNotifyBroadcast", "receive MatrixStrategyNotifyBroadcast, process: %s, strategy:%s", new Object[] { MatrixReport.with().getProcessName(), paramContext });
      if (!TextUtils.isEmpty(paramContext))
        MatrixReport.getMrsCallback().onStrategyNotify(paramContext, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.util.MatrixStrategyNotifyBroadcast
 * JD-Core Version:    0.6.2
 */