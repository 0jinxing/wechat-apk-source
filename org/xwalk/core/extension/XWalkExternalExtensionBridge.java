package org.xwalk.core.extension;

import android.content.Intent;

abstract interface XWalkExternalExtensionBridge
{
  public abstract void broadcastMessage(String paramString);

  public abstract void onBinaryMessage(int paramInt, byte[] paramArrayOfByte);

  public abstract void onDestroy();

  public abstract void onInstanceCreated(int paramInt);

  public abstract void onInstanceDestroyed(int paramInt);

  public abstract void onMessage(int paramInt, String paramString);

  public abstract void onNewIntent(Intent paramIntent);

  public abstract void onPause();

  public abstract void onResume();

  public abstract void onStart();

  public abstract void onStop();

  public abstract String onSyncMessage(int paramInt, String paramString);

  public abstract void postBinaryMessage(int paramInt, byte[] paramArrayOfByte);

  public abstract void postMessage(int paramInt, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.XWalkExternalExtensionBridge
 * JD-Core Version:    0.6.2
 */