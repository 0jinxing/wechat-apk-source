package org.xwalk.core.extension;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract interface XWalkExtensionContextClient
{
  public abstract void broadcastMessage(XWalkExternalExtension paramXWalkExternalExtension, String paramString);

  public abstract Activity getActivity();

  public abstract Context getContext();

  public abstract void postBinaryMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, byte[] paramArrayOfByte);

  public abstract void postMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, String paramString);

  public abstract void registerExtension(XWalkExternalExtension paramXWalkExternalExtension);

  public abstract void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle);

  public abstract void unregisterExtension(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.XWalkExtensionContextClient
 * JD-Core Version:    0.6.2
 */