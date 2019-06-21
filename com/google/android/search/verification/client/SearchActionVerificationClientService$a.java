package com.google.android.search.verification.client;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.search.verification.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SearchActionVerificationClientService$a
  implements ServiceConnection
{
  SearchActionVerificationClientService$a(SearchActionVerificationClientService paramSearchActionVerificationClientService)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(94131);
    SearchActionVerificationClientService.a(this.bus);
    SearchActionVerificationClientService.a(this.bus, a.a.g(paramIBinder));
    AppMethodBeat.o(94131);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(94132);
    SearchActionVerificationClientService.a(this.bus, null);
    SearchActionVerificationClientService.a(this.bus);
    AppMethodBeat.o(94132);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.search.verification.client.SearchActionVerificationClientService.a
 * JD-Core Version:    0.6.2
 */