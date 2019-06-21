package com.tencent.mm.platformtools;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class h$a
{
  private final String TAG;
  private final ContentResolver ghb;
  ArrayList<ContentProviderOperation> ghc;

  public h$a(h paramh, ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(124518);
    this.TAG = "MicroMsg.BatchOperation";
    this.ghb = paramContentResolver;
    this.ghc = new ArrayList();
    AppMethodBeat.o(124518);
  }

  public final void a(ContentProviderOperation paramContentProviderOperation)
  {
    AppMethodBeat.i(124519);
    this.ghc.add(paramContentProviderOperation);
    AppMethodBeat.o(124519);
  }

  public final void execute()
  {
    AppMethodBeat.i(124520);
    if (this.ghc.size() == 0)
    {
      ab.d("MicroMsg.BatchOperation", "no batch operation");
      AppMethodBeat.o(124520);
    }
    while (true)
    {
      return;
      if (!b.o(h.a(this.ghd), "android.permission.READ_CONTACTS"))
      {
        ab.e("MicroMsg.BatchOperation", "no contact permission");
        AppMethodBeat.o(124520);
        continue;
      }
      try
      {
        this.ghb.applyBatch("com.android.contacts", this.ghc);
        this.ghc.clear();
        AppMethodBeat.o(124520);
      }
      catch (OperationApplicationException localOperationApplicationException)
      {
        while (true)
          ab.e("MicroMsg.BatchOperation", "apply batch operation failed", new Object[] { localOperationApplicationException.toString() });
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          ab.e("MicroMsg.BatchOperation", "apply batch operation failed", new Object[] { localRemoteException.toString() });
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.BatchOperation", "apply batch operation failed", new Object[] { localException.toString() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.h.a
 * JD-Core Version:    0.6.2
 */