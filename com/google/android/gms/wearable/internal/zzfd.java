package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener;

final class zzfd extends UnregisterListenerMethod<zzhg, MessageClient.OnMessageReceivedListener>
{
  private final MessageClient.OnMessageReceivedListener zzej;

  private zzfd(MessageClient.OnMessageReceivedListener paramOnMessageReceivedListener, ListenerHolder.ListenerKey<MessageClient.OnMessageReceivedListener> paramListenerKey)
  {
    super(paramListenerKey);
    this.zzej = paramOnMessageReceivedListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzfd
 * JD-Core Version:    0.6.2
 */