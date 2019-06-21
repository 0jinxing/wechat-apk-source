package com.samsung.android.sdk.look.bezelinteraction;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import com.samsung.android.bezelinteraction.BezelEvent;
import com.samsung.android.bezelinteraction.IBezelManager;
import com.samsung.android.bezelinteraction.IBezelManager.Stub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class SlookBezelInteraction
{
  public static final String SERVICE_NAME = "BezelInteractionService";
  private static final String TAG = "SlookBezelInteraction";
  private static Context mContext = null;
  private static IBezelManager mService = null;
  private final CopyOnWriteArrayList<SlookBezelInteraction.BezelListenerDelegate> mListenerDelegates;

  public SlookBezelInteraction(Context paramContext)
  {
    AppMethodBeat.i(117204);
    this.mListenerDelegates = new CopyOnWriteArrayList();
    mContext = paramContext;
    getService();
    AppMethodBeat.o(117204);
  }

  private IBezelManager getService()
  {
    try
    {
      AppMethodBeat.i(117205);
      if (mService == null)
        mService = IBezelManager.Stub.asInterface(ServiceManager.getService("BezelInteractionService"));
      while (true)
      {
        IBezelManager localIBezelManager = mService;
        AppMethodBeat.o(117205);
        return localIBezelManager;
        if (!mService.asBinder().isBinderAlive())
          mService = IBezelManager.Stub.asInterface(ServiceManager.getService("BezelInteractionService"));
      }
    }
    finally
    {
    }
  }

  public final void enableBezelInteraction(boolean paramBoolean)
  {
    AppMethodBeat.i(117208);
    try
    {
      IBezelManager localIBezelManager = getService();
      if (localIBezelManager != null)
        localIBezelManager.enableBezelInteraction(paramBoolean);
      AppMethodBeat.o(117208);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        AppMethodBeat.o(117208);
    }
  }

  public final void registerListener(BezelListener paramBezelListener)
  {
    AppMethodBeat.i(117206);
    if (paramBezelListener == null)
    {
      AppMethodBeat.o(117206);
      return;
    }
    while (true)
    {
      while (true)
      {
        Object localObject1;
        synchronized (this.mListenerDelegates)
        {
          localObject1 = this.mListenerDelegates.iterator();
          if (!((Iterator)localObject1).hasNext())
            break label157;
          localObject2 = (SlookBezelInteraction.BezelListenerDelegate)((Iterator)localObject1).next();
          if (!((SlookBezelInteraction.BezelListenerDelegate)localObject2).getListener().equals(paramBezelListener))
            continue;
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = new com/samsung/android/sdk/look/bezelinteraction/SlookBezelInteraction$BezelListenerDelegate;
            ((SlookBezelInteraction.BezelListenerDelegate)localObject1).<init>(paramBezelListener, null);
            this.mListenerDelegates.add(localObject1);
          }
        }
        try
        {
          localObject2 = getService();
          if (localObject2 != null)
          {
            paramBezelListener = new android/content/ComponentName;
            paramBezelListener.<init>(mContext.getPackageName(), mContext.getClass().getCanonicalName());
            ((IBezelManager)localObject2).registerCallback((IBinder)localObject1, paramBezelListener);
          }
          label133: AppMethodBeat.o(117206);
          break;
          paramBezelListener = finally;
          AppMethodBeat.o(117206);
          throw paramBezelListener;
        }
        catch (RemoteException paramBezelListener)
        {
          break label133;
        }
      }
      label157: Object localObject2 = null;
    }
  }

  public final void unregisterListener(BezelListener paramBezelListener)
  {
    AppMethodBeat.i(117207);
    if (paramBezelListener == null)
    {
      AppMethodBeat.o(117207);
      return;
    }
    while (true)
    {
      while (true)
      {
        Object localObject;
        synchronized (this.mListenerDelegates)
        {
          Iterator localIterator = this.mListenerDelegates.iterator();
          if (!localIterator.hasNext())
            break label144;
          localObject = (SlookBezelInteraction.BezelListenerDelegate)localIterator.next();
          if (!((SlookBezelInteraction.BezelListenerDelegate)localObject).getListener().equals(paramBezelListener))
            continue;
          paramBezelListener = (BezelListener)localObject;
          if (paramBezelListener == null)
            AppMethodBeat.o(117207);
        }
        try
        {
          localObject = getService();
          if ((localObject != null) && (((IBezelManager)localObject).unregisterCallback(paramBezelListener)))
          {
            this.mListenerDelegates.remove(paramBezelListener);
            paramBezelListener.mHandler = null;
            paramBezelListener.mListener = null;
          }
          label120: AppMethodBeat.o(117207);
          break;
          paramBezelListener = finally;
          AppMethodBeat.o(117207);
          throw paramBezelListener;
        }
        catch (RemoteException paramBezelListener)
        {
          break label120;
        }
      }
      label144: paramBezelListener = null;
    }
  }

  public static abstract interface BezelListener
  {
    public abstract void onItemSelected(BezelEvent paramBezelEvent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.bezelinteraction.SlookBezelInteraction
 * JD-Core Version:    0.6.2
 */