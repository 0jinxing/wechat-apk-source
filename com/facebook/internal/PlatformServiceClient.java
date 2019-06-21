package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class PlatformServiceClient
  implements ServiceConnection
{
  private final String applicationId;
  private final Context context;
  private final Handler handler;
  private PlatformServiceClient.CompletedListener listener;
  private final int protocolVersion;
  private int replyMessage;
  private int requestMessage;
  private boolean running;
  private Messenger sender;

  public PlatformServiceClient(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
      paramContext = localContext;
    this.context = paramContext;
    this.requestMessage = paramInt1;
    this.replyMessage = paramInt2;
    this.applicationId = paramString;
    this.protocolVersion = paramInt3;
    this.handler = new PlatformServiceClient.1(this);
  }

  private void callback(Bundle paramBundle)
  {
    if (!this.running);
    while (true)
    {
      return;
      this.running = false;
      PlatformServiceClient.CompletedListener localCompletedListener = this.listener;
      if (localCompletedListener != null)
        localCompletedListener.completed(paramBundle);
    }
  }

  private void sendMessage()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
    populateRequestBundle(localBundle);
    Message localMessage = Message.obtain(null, this.requestMessage);
    localMessage.arg1 = this.protocolVersion;
    localMessage.setData(localBundle);
    localMessage.replyTo = new Messenger(this.handler);
    try
    {
      this.sender.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        callback(null);
    }
  }

  public void cancel()
  {
    this.running = false;
  }

  protected Context getContext()
  {
    return this.context;
  }

  protected void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == this.replyMessage)
    {
      paramMessage = paramMessage.getData();
      if (paramMessage.getString("com.facebook.platform.status.ERROR_TYPE") == null)
        break label39;
      callback(null);
    }
    try
    {
      while (true)
      {
        this.context.unbindService(this);
        label38: return;
        label39: callback(paramMessage);
      }
    }
    catch (IllegalArgumentException paramMessage)
    {
      break label38;
    }
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.sender = new Messenger(paramIBinder);
    sendMessage();
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.sender = null;
    try
    {
      this.context.unbindService(this);
      label13: callback(null);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      break label13;
    }
  }

  protected abstract void populateRequestBundle(Bundle paramBundle);

  public void setCompletedListener(PlatformServiceClient.CompletedListener paramCompletedListener)
  {
    this.listener = paramCompletedListener;
  }

  public boolean start()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.running)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (NativeProtocol.getLatestAvailableProtocolVersionForService(this.protocolVersion) != -1)
      {
        Intent localIntent = NativeProtocol.createPlatformServiceIntent(this.context);
        bool2 = bool1;
        if (localIntent != null)
        {
          this.running = true;
          this.context.bindService(localIntent, this, 1);
          bool2 = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.PlatformServiceClient
 * JD-Core Version:    0.6.2
 */