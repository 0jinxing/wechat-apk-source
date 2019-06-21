package com.tencent.wcdb;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CursorToBulkCursorAdaptor extends BulkCursorNative
  implements IBinder.DeathRecipient
{
  private static final String TAG = "Cursor";
  private CrossProcessCursor mCursor;
  private CursorWindow mFilledWindow;
  private final Object mLock;
  private ContentObserverProxy mObserver;
  private final String mProviderName;

  public CursorToBulkCursorAdaptor(Cursor arg1, IContentObserver paramIContentObserver, String paramString)
  {
    AppMethodBeat.i(12006);
    this.mLock = new Object();
    if ((??? instanceof CrossProcessCursor))
      this.mCursor = ((CrossProcessCursor)???);
    while (true)
    {
      this.mProviderName = paramString;
      synchronized (this.mLock)
      {
        createAndRegisterObserverProxyLocked(paramIContentObserver);
        AppMethodBeat.o(12006);
        return;
        this.mCursor = new CrossProcessCursorWrapper(???);
      }
    }
  }

  private void closeFilledWindowLocked()
  {
    AppMethodBeat.i(12007);
    if (this.mFilledWindow != null)
    {
      this.mFilledWindow.close();
      this.mFilledWindow = null;
    }
    AppMethodBeat.o(12007);
  }

  private void createAndRegisterObserverProxyLocked(IContentObserver paramIContentObserver)
  {
    AppMethodBeat.i(12017);
    if (this.mObserver != null)
    {
      paramIContentObserver = new IllegalStateException("an observer is already registered");
      AppMethodBeat.o(12017);
      throw paramIContentObserver;
    }
    this.mObserver = new ContentObserverProxy(paramIContentObserver, this);
    this.mCursor.registerContentObserver(this.mObserver);
    AppMethodBeat.o(12017);
  }

  private void disposeLocked()
  {
    AppMethodBeat.i(12008);
    if (this.mCursor != null)
    {
      unregisterObserverProxyLocked();
      this.mCursor.close();
      this.mCursor = null;
    }
    closeFilledWindowLocked();
    AppMethodBeat.o(12008);
  }

  private void throwIfCursorIsClosed()
  {
    AppMethodBeat.i(12009);
    if (this.mCursor == null)
    {
      StaleDataException localStaleDataException = new StaleDataException("Attempted to access a cursor after it has been closed.");
      AppMethodBeat.o(12009);
      throw localStaleDataException;
    }
    AppMethodBeat.o(12009);
  }

  private void unregisterObserverProxyLocked()
  {
    AppMethodBeat.i(12018);
    if (this.mObserver != null)
    {
      this.mCursor.unregisterContentObserver(this.mObserver);
      this.mObserver.unlinkToDeath(this);
      this.mObserver = null;
    }
    AppMethodBeat.o(12018);
  }

  public final void binderDied()
  {
    AppMethodBeat.i(12010);
    synchronized (this.mLock)
    {
      disposeLocked();
      AppMethodBeat.o(12010);
      return;
    }
  }

  public final void close()
  {
    AppMethodBeat.i(12015);
    synchronized (this.mLock)
    {
      disposeLocked();
      AppMethodBeat.o(12015);
      return;
    }
  }

  public final void deactivate()
  {
    AppMethodBeat.i(12014);
    synchronized (this.mLock)
    {
      if (this.mCursor != null)
      {
        unregisterObserverProxyLocked();
        this.mCursor.deactivate();
      }
      closeFilledWindowLocked();
      AppMethodBeat.o(12014);
      return;
    }
  }

  public final BulkCursorDescriptor getBulkCursorDescriptor()
  {
    AppMethodBeat.i(12011);
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      BulkCursorDescriptor localBulkCursorDescriptor = new com/tencent/wcdb/BulkCursorDescriptor;
      localBulkCursorDescriptor.<init>();
      localBulkCursorDescriptor.cursor = this;
      localBulkCursorDescriptor.columnNames = this.mCursor.getColumnNames();
      localBulkCursorDescriptor.wantsAllOnMoveCalls = this.mCursor.getWantsAllOnMoveCalls();
      localBulkCursorDescriptor.count = this.mCursor.getCount();
      localBulkCursorDescriptor.window = this.mCursor.getWindow();
      if (localBulkCursorDescriptor.window != null)
        localBulkCursorDescriptor.window.acquireReference();
      AppMethodBeat.o(12011);
      return localBulkCursorDescriptor;
    }
  }

  public final Bundle getExtras()
  {
    AppMethodBeat.i(12019);
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      Bundle localBundle = this.mCursor.getExtras();
      AppMethodBeat.o(12019);
      return localBundle;
    }
  }

  public final CursorWindow getWindow(int paramInt)
  {
    AppMethodBeat.i(12012);
    while (true)
    {
      CursorWindow localCursorWindow2;
      synchronized (this.mLock)
      {
        throwIfCursorIsClosed();
        if (!this.mCursor.moveToPosition(paramInt))
        {
          closeFilledWindowLocked();
          localCursorWindow1 = null;
          AppMethodBeat.o(12012);
          return localCursorWindow1;
        }
        CursorWindow localCursorWindow1 = this.mCursor.getWindow();
        if (localCursorWindow1 != null)
        {
          closeFilledWindowLocked();
          if (localCursorWindow1 != null)
            localCursorWindow1.acquireReference();
          AppMethodBeat.o(12012);
          continue;
        }
        localCursorWindow2 = this.mFilledWindow;
        if (localCursorWindow2 == null)
        {
          localCursorWindow1 = new com/tencent/wcdb/CursorWindow;
          localCursorWindow1.<init>(this.mProviderName);
          this.mFilledWindow = localCursorWindow1;
          localCursorWindow1 = this.mFilledWindow;
          this.mCursor.fillWindow(paramInt, localCursorWindow1);
        }
      }
      Object localObject3;
      if (paramInt >= localCursorWindow2.getStartPosition())
      {
        localObject3 = localCursorWindow2;
        if (paramInt < localCursorWindow2.getStartPosition() + localCursorWindow2.getNumRows());
      }
      else
      {
        localCursorWindow2.clear();
        localObject3 = localCursorWindow2;
      }
    }
  }

  public final void onMove(int paramInt)
  {
    AppMethodBeat.i(12013);
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      this.mCursor.onMove(this.mCursor.getPosition(), paramInt);
      AppMethodBeat.o(12013);
      return;
    }
  }

  public final int requery(IContentObserver paramIContentObserver)
  {
    AppMethodBeat.i(12016);
    while (true)
    {
      synchronized (this.mLock)
      {
        throwIfCursorIsClosed();
        closeFilledWindowLocked();
        try
        {
          boolean bool = this.mCursor.requery();
          if (!bool)
          {
            i = -1;
            AppMethodBeat.o(12016);
            return i;
          }
        }
        catch (IllegalStateException localIllegalStateException1)
        {
          IllegalStateException localIllegalStateException2 = new java/lang/IllegalStateException;
          paramIContentObserver = new java/lang/StringBuilder;
          paramIContentObserver.<init>();
          localIllegalStateException2.<init>(this.mProviderName + " Requery misuse db, mCursor isClosed:" + this.mCursor.isClosed(), localIllegalStateException1);
          AppMethodBeat.o(12016);
          throw localIllegalStateException2;
        }
      }
      unregisterObserverProxyLocked();
      createAndRegisterObserverProxyLocked(paramIContentObserver);
      int i = this.mCursor.getCount();
      AppMethodBeat.o(12016);
    }
  }

  public final Bundle respond(Bundle paramBundle)
  {
    AppMethodBeat.i(12020);
    synchronized (this.mLock)
    {
      throwIfCursorIsClosed();
      paramBundle = this.mCursor.respond(paramBundle);
      AppMethodBeat.o(12020);
      return paramBundle;
    }
  }

  static final class ContentObserverProxy extends ContentObserver
  {
    protected IContentObserver mRemote;

    public ContentObserverProxy(IContentObserver paramIContentObserver, IBinder.DeathRecipient paramDeathRecipient)
    {
      super();
      AppMethodBeat.i(12003);
      this.mRemote = paramIContentObserver;
      try
      {
        paramIContentObserver.asBinder().linkToDeath(paramDeathRecipient, 0);
        AppMethodBeat.o(12003);
        return;
      }
      catch (RemoteException paramIContentObserver)
      {
        while (true)
          AppMethodBeat.o(12003);
      }
    }

    public final boolean deliverSelfNotifications()
    {
      return false;
    }

    public final void onChange(boolean paramBoolean, Uri paramUri)
    {
      AppMethodBeat.i(12005);
      try
      {
        this.mRemote.onChange(paramBoolean, paramUri);
        AppMethodBeat.o(12005);
        return;
      }
      catch (RemoteException paramUri)
      {
        while (true)
          AppMethodBeat.o(12005);
      }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient paramDeathRecipient)
    {
      AppMethodBeat.i(12004);
      boolean bool = this.mRemote.asBinder().unlinkToDeath(paramDeathRecipient, 0);
      AppMethodBeat.o(12004);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.CursorToBulkCursorAdaptor
 * JD-Core Version:    0.6.2
 */