package com.tencent.mm.plugin.webview.luggage.ipc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;

public final class b
{
  public static <T extends c> void a(Context paramContext, Bundle paramBundle, Class<T> paramClass)
  {
    AppMethodBeat.i(6247);
    Intent localIntent = new Intent();
    localIntent.putExtra("task_class_name", paramClass.getName());
    localIntent.putExtra("input_data", paramBundle);
    localIntent.putExtra("orientation", -1);
    d.b(paramContext, "webview", ".luggage.ipc.IpcProxyUI", localIntent);
    AppMethodBeat.o(6247);
  }

  public static <T extends c> void a(MMActivity paramMMActivity, Bundle paramBundle, Class<T> paramClass, a parama)
  {
    AppMethodBeat.i(6248);
    Intent localIntent = new Intent();
    localIntent.putExtra("task_class_name", paramClass.getName());
    localIntent.putExtra("input_data", paramBundle);
    localIntent.putExtra("orientation", -1);
    paramMMActivity.ifE = new b.1(parama);
    d.b(paramMMActivity, "webview", ".luggage.ipc.IpcProxyUI", localIntent, 3456);
    AppMethodBeat.o(6248);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.b
 * JD-Core Version:    0.6.2
 */